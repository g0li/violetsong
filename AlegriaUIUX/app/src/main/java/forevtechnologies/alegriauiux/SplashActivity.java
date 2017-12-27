package forevtechnologies.alegriauiux;

import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

/**
 * Created by ABHIJAY on 22-12-2017.
 */

public class SplashActivity extends AwesomeSplash {
    public static final String ALEGRIA_PATH="M 126.43,298.00\n" +
            "           C 120.37,276.65 121.96,245.69 122.00,223.00\n" +
            "             122.00,223.00 123.00,208.00 123.00,208.00\n" +
            "             123.00,208.00 125.92,169.00 125.92,169.00\n" +
            "             126.27,164.61 126.36,156.78 129.57,153.57\n" +
            "             132.73,150.41 137.86,150.96 142.00,151.00\n" +
            "             149.89,151.10 162.40,154.96 161.24,165.00\n" +
            "             161.24,165.00 157.28,186.00 157.28,186.00\n" +
            "             157.28,186.00 153.00,227.00 153.00,227.00\n" +
            "             153.00,227.00 152.00,251.00 152.00,251.00\n" +
            "             152.00,251.00 153.00,263.00 153.00,263.00\n" +
            "             153.00,263.00 153.00,272.00 153.00,272.00\n" +
            "             153.00,272.00 154.73,284.00 154.73,284.00\n" +
            "             155.73,290.92 156.41,297.09 160.64,303.00\n" +
            "             164.93,308.99 170.42,312.15 177.00,315.00\n" +
            "             177.00,315.00 177.00,318.00 177.00,318.00\n" +
            "             156.70,326.06 133.07,321.41 126.43,298.00 Z\n" +
            "           M 452.74,216.00\n" +
            "           C 447.50,202.23 469.39,192.57 479.00,187.75\n" +
            "             483.62,185.44 490.73,181.28 496.00,182.69\n" +
            "             503.00,184.55 512.49,195.28 509.82,203.00\n" +
            "             508.10,207.93 503.36,210.49 499.00,212.74\n" +
            "             492.63,216.04 489.58,217.11 483.00,219.58\n" +
            "             465.28,226.21 469.10,222.34 459.00,224.00\n" +
            "             471.12,228.02 473.87,239.46 474.00,251.00\n" +
            "             474.16,265.88 469.71,284.42 466.42,299.00\n" +
            "             463.63,311.42 462.20,322.88 446.00,321.68\n" +
            "             439.49,321.19 428.79,321.58 425.47,314.96\n" +
            "             422.99,310.02 429.19,297.44 431.00,292.00\n" +
            "             436.24,276.29 443.80,253.43 444.00,237.00\n" +
            "             444.07,230.98 442.34,221.53 451.00,221.20\n" +
            "             452.74,221.13 455.24,221.69 457.00,222.00\n" +
            "             455.29,220.07 453.68,218.48 452.74,216.00 Z\n" +
            "           M 391.01,281.00\n" +
            "           C 390.91,285.60 391.96,295.42 392.80,300.00\n" +
            "             393.44,303.42 394.58,306.72 391.68,309.49\n" +
            "             384.69,316.16 363.47,313.53 359.89,304.00\n" +
            "             358.42,300.07 360.50,290.57 360.93,286.00\n" +
            "             360.93,286.00 366.00,240.00 366.00,240.00\n" +
            "             366.08,232.90 365.84,225.69 363.17,219.00\n" +
            "             361.88,215.75 358.07,210.62 360.04,207.30\n" +
            "             361.63,204.62 366.19,204.14 369.00,204.04\n" +
            "             380.48,203.66 386.55,210.96 392.00,220.00\n" +
            "             394.00,215.97 396.28,214.09 400.00,211.60\n" +
            "             411.13,204.13 423.08,205.73 433.00,214.30\n" +
            "             438.91,219.41 443.09,225.88 441.67,234.00\n" +
            "             438.75,250.66 412.59,254.58 406.00,241.00\n" +
            "             395.74,249.08 391.30,268.38 391.01,281.00 Z\n" +
            "           M 61.00,207.23\n" +
            "           C 68.64,206.99 73.54,207.07 81.00,209.52\n" +
            "             86.34,211.27 88.49,212.81 93.00,216.00\n" +
            "             110.69,228.53 115.84,244.14 117.96,265.00\n" +
            "             117.96,265.00 117.96,274.00 117.96,274.00\n" +
            "             117.96,274.00 120.07,295.00 120.07,295.00\n" +
            "             120.38,298.24 121.28,305.26 122.93,307.90\n" +
            "             125.39,311.82 133.91,314.78 129.82,323.00\n" +
            "             127.09,328.51 120.51,332.07 115.00,334.19\n" +
            "             101.97,339.18 87.80,340.16 74.00,340.00\n" +
            "             66.06,339.90 56.38,338.70 49.00,335.80\n" +
            "             42.80,333.36 38.15,330.86 33.01,326.54\n" +
            "             29.60,323.67 27.41,320.94 25.33,317.00\n" +
            "             16.24,299.84 25.99,282.81 39.00,271.17\n" +
            "             39.00,271.17 52.00,260.95 52.00,260.95\n" +
            "             56.58,256.93 67.53,248.44 67.63,242.00\n" +
            "             67.73,235.87 61.13,233.52 56.00,234.76\n" +
            "             47.98,236.71 31.69,250.19 29.13,236.98\n" +
            "             29.13,236.98 29.13,232.00 29.13,232.00\n" +
            "             29.64,218.14 40.44,210.26 53.00,207.23\n" +
            "             56.17,207.02 57.83,207.00 61.00,207.23 Z\n" +
            "           M 247.00,309.96\n" +
            "           C 241.33,311.71 219.53,315.97 214.00,316.00\n" +
            "             187.31,316.12 168.51,304.12 158.81,279.00\n" +
            "             156.27,272.41 153.69,262.04 154.09,255.00\n" +
            "             154.36,250.33 155.70,244.33 157.45,240.00\n" +
            "             170.15,208.56 209.48,204.37 236.09,219.70\n" +
            "             240.04,221.98 243.33,223.63 247.00,226.52\n" +
            "             256.90,234.30 266.75,247.87 261.39,261.00\n" +
            "             259.86,264.74 257.47,267.44 253.99,269.47\n" +
            "             248.58,272.62 229.21,275.75 222.00,277.20\n" +
            "             217.42,278.12 210.64,279.16 207.74,283.21\n" +
            "             205.13,286.85 206.81,290.73 209.94,293.36\n" +
            "             213.18,296.09 223.64,297.35 228.00,297.55\n" +
            "             234.75,298.18 242.25,295.62 249.00,297.55\n" +
            "             251.85,298.19 254.53,300.38 257.00,302.00\n" +
            "             255.32,307.21 251.99,308.42 247.00,309.96 Z\n" +
            "           M 546.00,214.62\n" +
            "           C 549.93,216.30 557.46,221.16 561.00,223.76\n" +
            "             566.27,227.62 571.15,232.37 574.52,238.00\n" +
            "             577.59,243.13 578.92,248.07 579.00,254.00\n" +
            "             579.00,254.00 579.00,270.00 579.00,270.00\n" +
            "             578.87,281.01 571.94,298.76 568.71,310.00\n" +
            "             567.63,313.74 564.36,324.65 564.43,328.00\n" +
            "             564.54,332.70 568.07,334.06 568.50,338.00\n" +
            "             569.59,347.89 555.29,350.95 548.00,350.49\n" +
            "             524.08,348.97 499.60,345.03 482.09,326.96\n" +
            "             469.59,314.07 464.20,294.66 477.18,280.00\n" +
            "             489.08,266.57 501.65,265.99 517.00,260.41\n" +
            "             522.53,258.40 533.11,254.91 536.26,249.96\n" +
            "             540.33,243.55 532.40,238.19 527.00,236.64\n" +
            "             518.53,234.19 498.85,244.66 503.64,228.00\n" +
            "             504.12,226.33 505.03,224.47 505.97,223.00\n" +
            "             507.56,220.51 509.69,218.23 512.00,216.39\n" +
            "             515.17,213.88 518.19,212.65 522.00,211.53\n" +
            "             530.62,210.12 537.99,211.19 546.00,214.62 Z\n" +
            "           M 292.00,281.12\n" +
            "           C 286.36,280.43 284.67,281.36 279.00,278.67\n" +
            "             256.29,267.91 262.12,240.13 279.00,226.67\n" +
            "             293.35,215.23 309.03,211.97 327.00,212.00\n" +
            "             336.17,212.01 342.83,214.95 348.03,223.00\n" +
            "             351.36,228.15 352.75,233.32 347.00,237.00\n" +
            "             350.42,238.95 353.57,240.82 355.86,244.17\n" +
            "             360.09,250.38 360.01,269.18 360.00,277.00\n" +
            "             360.00,277.00 358.13,298.00 358.13,298.00\n" +
            "             355.81,314.64 351.27,327.81 344.31,343.00\n" +
            "             333.76,366.01 319.37,384.24 292.00,384.00\n" +
            "             288.54,383.97 283.27,383.89 280.00,383.07\n" +
            "             260.49,378.15 247.46,359.68 247.01,340.00\n" +
            "             246.59,321.41 257.64,298.29 274.00,288.88\n" +
            "             285.14,282.47 297.75,283.98 308.00,291.30\n" +
            "             312.37,294.42 314.44,295.71 316.00,301.00\n" +
            "             316.00,301.00 304.00,303.95 304.00,303.95\n" +
            "             292.96,308.07 283.16,318.36 280.67,330.00\n" +
            "             278.96,337.99 279.89,350.79 289.00,353.96\n" +
            "             298.18,357.14 307.54,346.39 312.34,340.00\n" +
            "             321.64,327.59 331.84,298.57 330.68,283.00\n" +
            "             330.68,283.00 330.00,275.00 330.00,275.00\n" +
            "             318.76,280.73 304.38,282.62 292.00,281.12 Z\n" +
            "           M 205.94,249.00\n" +
            "           C 206.55,251.00 207.36,252.84 209.22,254.18\n" +
            "             211.85,255.57 217.08,254.91 220.00,254.18\n" +
            "             222.76,253.89 226.51,253.04 228.89,251.59\n" +
            "             233.98,248.47 233.66,243.22 229.77,239.21\n" +
            "             225.76,235.08 219.52,233.76 214.00,234.40\n" +
            "             206.99,236.67 203.75,241.69 205.94,249.00 Z\n" +
            "           M 315.00,239.38\n" +
            "           C 310.56,240.51 305.32,242.07 302.60,246.05\n" +
            "             300.85,248.62 301.04,251.07 301.00,254.00\n" +
            "             323.58,254.00 327.22,249.31 345.00,237.00\n" +
            "             333.87,237.00 326.07,236.54 315.00,239.38 Z\n" +
            "           M 56.08,296.01\n" +
            "           C 52.92,300.23 51.02,308.56 56.08,312.02\n" +
            "             58.79,313.72 63.96,313.96 67.00,314.00\n" +
            "             73.29,314.07 82.17,313.40 86.26,307.79\n" +
            "             89.31,303.61 87.87,291.94 86.79,287.00\n" +
            "             85.95,283.15 85.91,280.89 81.89,279.70\n" +
            "             74.32,281.11 60.46,289.72 56.08,296.01 Z\n" +
            "           M 503.28,296.21\n" +
            "           C 501.17,298.46 500.28,300.96 500.11,304.00\n" +
            "             499.53,314.39 511.57,317.85 520.00,318.48\n" +
            "             532.78,319.45 535.78,310.96 537.44,300.00\n" +
            "             537.96,297.52 539.04,291.54 537.44,289.60\n" +
            "             535.23,287.26 527.94,288.01 525.00,288.29\n" +
            "             518.64,289.34 507.76,291.45 503.28,296.21 Z";

    @Override
    public void initSplash(ConfigSplash configSplash){

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.holo_orange_light);
        configSplash.setAnimCircularRevealDuration(1000);
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);
        configSplash.setTitleSplash("");

        configSplash.setPathSplash(ALEGRIA_PATH);
        configSplash.setAnimPathStrokeDrawingDuration(1000);
        configSplash.setPathSplashFillColor(R.color.red);
        configSplash.setOriginalHeight(600);
        configSplash.setOriginalWidth(600);




    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        finish();
    }
}
