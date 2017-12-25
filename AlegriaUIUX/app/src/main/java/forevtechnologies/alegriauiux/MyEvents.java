package forevtechnologies.alegriauiux;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import forevtechnologies.alegriauiux.adapter.DayAdapter;
import forevtechnologies.alegriauiux.adapter.MyEventsDayAdapter;
import forevtechnologies.alegriauiux.adapter.RecyclerItemClickListener;
import forevtechnologies.alegriauiux.models.AthleticModel;
import forevtechnologies.alegriauiux.models.Events;
import forevtechnologies.alegriauiux.models.GetEvents;
import forevtechnologies.alegriauiux.models.MyEventsAthleticModel;
import forevtechnologies.alegriauiux.sharedPreferenceFile.SharedPreferenceStringTags;


/**
 * Created by jojosexbomb69 on 7/12/17.
 */

public class MyEvents extends AppCompatActivity {
    RecyclerView rvAthletics;
    MyEventsDayAdapter dayAdapter;
    ImageView backButton;
    List<MyEventsAthleticModel> items=new ArrayList<>();
    FirebaseDatabase firebaseDatabase;
    String UID,currentEvent;
    DatabaseReference databaseReference;
    SharedPreferences offlineitems;
    List<String> itemPos = new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_myevents);

        offlineitems = getSharedPreferences(SharedPreferenceStringTags.USER_CART_DATABASE,MODE_PRIVATE);
        final SharedPreferences.Editor offlineitemsEditor = offlineitems.edit();

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            UID = user.getUid();
        }

        Log.w("Act","Running");
        backButton=(ImageView) findViewById(R.id.backButton);
        rvAthletics=findViewById(R.id.myEventsRecycler);



        databaseReference.child("User Data").child(UID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Log.d("NUMBER:",""+dataSnapshot.getChildrenCount());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getBaseContext(),"Failed read value",Toast.LENGTH_SHORT).show();
            }
        });

       Map<String,?> itemsMap = offlineitems.getAll();
               for (Map.Entry<String, ?> entry : itemsMap.entrySet()) {
                   if (!itemsMap.isEmpty()) {
                       currentEvent = entry.getValue().toString();
                       if(currentEvent.equals("CART_EXISTS"))
                           continue;
                       items.add(new MyEventsAthleticModel("Lawn", currentEvent, 23));
                       itemPos.add(currentEvent);
               }
           }


        dayAdapter=new MyEventsDayAdapter(this);
        dayAdapter.addItems(items);
        rvAthletics.setAdapter(dayAdapter);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
        rvAthletics.setLayoutManager(linearLayoutManager);
        rvAthletics.setItemAnimator(new DefaultItemAnimator());
        rvAthletics.addItemDecoration(new DividerItemDecoration(this));

        ItemTouchHelper.SimpleCallback simpleCallBack = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT){
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                final int position = viewHolder.getAdapterPosition();
                if(direction == ItemTouchHelper.RIGHT){
                    Intent qrCode = new Intent(getBaseContext(),QRCode.class);
                    qrCode.putExtra("Data",itemPos.get(position));
                    startActivity(qrCode);
                    finish();
                }
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallBack);
        itemTouchHelper.attachToRecyclerView(rvAthletics);



    }


    static class DividerItemDecoration extends RecyclerView.ItemDecoration {

        private static final int[] ATTRS = new int[]{android.R.attr.listDivider};

        private Drawable mDivider;

        /**
         * Default divider will be used
         */
        public DividerItemDecoration(Context context) {
            final TypedArray styledAttributes = context.obtainStyledAttributes(ATTRS);
            mDivider = styledAttributes.getDrawable(0);
            styledAttributes.recycle();
        }

        /**
         * Custom divider will be used
         */
        public DividerItemDecoration(Context context, int resId) {
            mDivider = ContextCompat.getDrawable(context, resId);
        }

        @Override
        public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();

            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

                int top = child.getBottom() + params.bottomMargin;
                int bottom = top + mDivider.getIntrinsicHeight();

                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }
    }
}
