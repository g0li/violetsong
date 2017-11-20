package forevtechnologies.alegriauiux.models;
public enum Events{
    ASP("Asphalt"),
    HC("Hill Climb Racing"),
    PAC("Pacman"),
    MORTK("Mortal Kombat"),
    FSB("Foosball"),
    WWW("World Wide Web"),
    PPRTS("Paper Toss"),
    TET("Tetris"),
    CIRPUZ("Circuit Puzzle"),
    CODSRF("Code Surfer"),
    WRAP("The Wrap"),
    TECROD("Tech Roadies"),
    HACKT("Hackathon"),//0-12TECH
    NRIT("Nrityanjali"),
    RAP("Rapping"),
    DDANC("Duet Dance"),
    SKT("Skit"),
    SDANC("Solo Dance"),
    MACT("Mono Acting"),
    FDANC("Folk Dance"),
    SSING("Solo Singing"),
    GDANC("Group Dancing"),
    BBOY("B-Boying"),
    DJW("DJ-Wars"),
    MMALG("Mr & Mrs Alegria"),//13-24PARTS
    FSHW("Fashion Show"),
    FPHY("Fitness Physique"),
    FCALG("Face Of Alegria"),
    THUNT("Treasure Hunt"),
    PROWD("PTV Rowdies"),
    FFS("Fastest Finger First"),
    PHOT("Photography"),
    PMA("Paper Mache Art"),//25-31INF
    CGRAP("Calligraphy"),
    THET("Theatre"),
    RSHOOT("Rifle Shooting"),
    SALS("Salsa"),
    FMAK("Film Making"),
    SDEF("Self Defence"),
    DJWRK("DJ Workshop"),
    BOK("Bokwa"),
    ARD("Arduino"),
    ESP("ESP 8266"),
    EGCAD("Eagle CAD"),
    TDPRT("3D Printing"),
    RPI("Raspberry Pi"),
    WDESN("Web Designing"),
    GDESN("Graphic Designing"),//33-47WS
    FIFA("FIFA"),
    NFS("NFS Most Wanted"),
    CS("CS 1.6"),
    MM("Mini Militia"),
    FUTSL("Futsal Boys"),
    BSKTB("Basketball"),
    VLLYB("Volleyball"),
    BCRKT("Box Cricket"),
    TGWAR("Tug Of War"),
    TT("Table Tennis"),
    GTHRW("Girls Throwball"),
    ARF("Air Rifle Shooting"),
    CHESS("Chess"),
    FNCQZ("Football and Cricket quiz"),
    CARRS("Carrom singles"),
    CARRD("Carrom doubles"),
    KBDI("Kabaddi"),
    NEOSHT("Neo Shootouts"),
    DT2("Dota 2"),
    BTMNB("Badminton Boys"),
    BTMNG("Badminton Girls"),
    NEOCRKT("Neo Cricket"),
    ARTREL("Art Relay"),//48-69SNG
    PSTMAN("Poster Mania"),
    ARTCOL("Art of colors"),
    INTPATT("Intricate Patterns"),
    NLFANT("Nail Fantasy"),
    MSKME("Mask Me"),
    BLTREE("Blot the tree"),
    FNINJ("Fruit Ninja"),
    ARTFANT("Art Fantasy"),//70-78FARTS
    ADMAD("Admad"),
    MTMYS("Mid town Mystery"),
    JPOT("Jackpot"),
    MONP("Monopoly"),
    CHREAC("Chain Reaction"),
    WIZ("Wizard"),
    BULEYE("Bulls-Eyes"),
    DORND("Deal or no deal"),
    MKITORBRK("Make it or break it"),
    CHRCH("Charcha"),//79-87MGMT
    CNTSTP("Can't stop"),
    ILB("I love bees"),
    CMDNC("Command and conquer"),
    HPSC("High poets' society");//88-93LARTS
    private final String event;

    Events(String event) {this.event=event;}

    public String getEvents(){return event;}

}