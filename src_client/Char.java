/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import main.GameCanvas;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public class Char
implements bq {
    public String o;
    public String GameScreen;
    public String q;
    public boolean r;
    public boolean SessionReceiver;
    public boolean MyHashtable;
    private int LoginScreen;
    private int b;
    private int c;
    public boolean u;
    public dk v;
    public int w = 0;
    public static ae x;
    public long Message;
    public ej z;
    public byte A;
    public int B = 24;
    public int C = 24;
    public int D;
    public int E;
    public int F;
    private int d;
    public int G;
    public int H = 5;
    public int I = 1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O = 4;
    public int P;
    public int Q;
    private int e;
    public int R;
    public int S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long Mob;
    public long ab;
    public long MessageHandler;
    public boolean ad;
    public boolean ae;
    public boolean Char;
    public String ag = "";
    public int ah;
    public eh ai;
    public byte aj;
    public int ak = 22;
    public int al = 32;
    public int am = 11;
    private int f = 16;
    public de an;
    public boolean ao = true;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    private boolean g;
    public int ImageCache;
    private int Item;
    public long at;
    public int au;
    public int RMS;
    public int T;
    public da ax;
    public de ay;
    public MyVector az = new MyVector("vSkill");
    public MyVector aA = new MyVector("vSkillFight");
    public MyVector aB = new MyVector("vEff char");
    public bf aC;
    public ai aD;
    private boolean i = true;
    public ao[] aE;
    public Item[] aF;
    public Item[] aG;
    public Item[] aH;
    public bf[] aI;
    public Item[][] aJ;
    public String[][] aK;
    public short[][] aL;
    public byte aM;
    public byte aN;
    public int aO;
    public int aP;
    public Mob aQ;
    public Mob aR;
    public int aS;
    public _do aT;
    public Char aU;
    public ItemMap aV;
    public MyVector aW = new MyVector("focus");
    public Mob[] aX;
    public Char[] aY;
    public short[] aZ;
    public int ba = -9999;
    public int Screen = -9999;
    private byte j;
    public boolean bc;
    public boolean bd = true;
    public MyVector be = new MyVector("taskOrders");
    public int bf;
    public static short[] bg;
    public static short[] bh;
    public String[] bi;
    public String bj;
    private static Image k;
    private static Image Res;
    public boolean bk = false;
    public boolean bl;
    public int bm;
    public int ImageLoader;
    public long bo;
    private long m;
    public long bp;
    public boolean bq;
    public static Vector Session;
    public static short ServerListScreen;
    public short GameService = 0;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    public boolean bx;
    private static Image n;
    private static Image df;
    private static Image BaseCanvas;
    private static Image dh;
    private static Image mFont;
    private static Image dj;
    private static Image dk;
    private static Image dl;
    private static Image dm;
    private static Image dn;
    private byte[] cfr_renamed_0;
    private int dp;
    private int dq;
    private int dr;
    private int ds;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private int dy;
    private int dz;
    private boolean dA;
    private boolean dB;
    private boolean dC;
    public byte by;
    public int bz;
    public short bA;
    public short bB;
    public static final int[][][] bC;
    private static Char dD;
    private static Char dE;
    private int dF;
    public int bD;
    public int bE;
    public MyVector bF;
    public static boolean bG;
    public static boolean bH;
    public static boolean bI;
    public boolean bJ;
    String bK;
    short bL;
    short bM;
    short bN;
    private long dG;
    private long dH;
    public boolean bO;
    public dm bP;
    public int bQ;
    private ea dI;
    private ea dJ;
    private int dK;
    private boolean dL;
    private boolean dM;
    public boolean bR;
    private boolean dN;
    private int dO;
    int bS;
    private int dP;
    private int dQ;
    private int dR;
    private int[] dS;
    private String dT;
    public int bT;
    public int bU;
    public int bV;
    public int bW;
    public int bX;
    public int bY;
    private int dU;
    public int bZ;
    private cp dV;
    public cp ca;
    public int cb;
    private int dW;
    private int dX;
    private int dY;
    private int dZ;
    private int ea;
    private int eb;
    private int ec;
    private int WeatherEffect;
    private int ee;
    private cp ef;
    private cp eg;
    private cp eh;
    public dq Npc;
    public bj cd;
    public boolean ItemMap;
    public ci cf;
    public ci cg;
    private cu[] ei;
    private int ej;
    private byte ek;
    public boolean ch;
    public boolean ci;
    public boolean cj;
    private int MyVector;
    private int SplashScreen;
    private boolean mGraphics;
    boolean ck;
    private long Position;
    private int ep;
    private boolean eq;
    private boolean er;
    private int es;
    private int et;
    private Image eu;
    private boolean ev;
    private boolean ew;
    public int cl;
    public int cm;
    private int ex;
    private RMS ey;
    private RMS ez;
    private RMS eA;
    private int eB;
    private int eC;
    private int eD;
    public static boolean cn;
    private Char eE;
    private Mob eF;
    public short co;
    public short cp;
    public int cq;
    public int cr;
    public int cs;
    public int ct;
    public int cu;
    public int cv;
    public int cw;
    public byte cx;
    public byte cy;
    public byte cz;
    public byte cA;
    public byte cB;
    public short cC;
    public short cD;
    public byte cE;
    public boolean cF;
    public boolean cG;
    public boolean cH;
    public int cI;
    public boolean cJ;
    public boolean cK;
    private boolean eG;
    private boolean eH;
    private int eI;
    private short eJ;
    private short eK;
    private byte eL;
    boolean cL;
    int cM;
    public boolean cN;
    public boolean cO;
    public boolean cP;
    public boolean cQ;
    public boolean cR;
    public int cS;
    public long cT;
    private int eM;
    private int eN;
    private int eO;
    private int eP;
    private MyVector eQ;
    private static df eR;
    private int eS;
    private long eT;
    private int[] eU;
    private int[] eV;
    private int[] eW;
    public static int[][] cU;
    private int eX;
    private String eY;
    public short cV;
    public static boolean cW;
    public static boolean cX;
    private df eZ;
    private df fa;
    private String fb;
    public short cY;
    private df fc;
    private df fd;
    private df fe;
    private df ff;
    private String fg;
    private String fh;
    private String fi;
    public short cZ;
    private static int[][] fj;
    public static short[] da;
    public boolean db;
    private boolean fk;
    private long fl;
    private byte fm;
    private short fn;
    private byte[] fo;
    private byte[] fp;
    private byte[] fq;
    private int fr;
    private int fs;
    private bk ft;
    private long fu;
    public boolean dc;
    private short fv;
    public int dd;
    public int de;
    private df fw;

    static {
        k = Res.loadImage("/mainImage/myTexture2dat-trai-dat.png");
        Res = Res.loadImage("/mainImage/myTexture2dmat-namek.png");
        Session = new Vector();
        ServerListScreen = (short)30000;
        n = Res.loadImage("/mainImage/myTexture2dthucuoi10.png");
        df = Res.loadImage("/mainImage/myTexture2dthucuoi20.png");
        BaseCanvas = Res.loadImage("/mainImage/myTexture2dthucuoi21.png");
        dh = Res.loadImage("/mainImage/myTexture2dthucuoi30.png");
        mFont = Res.loadImage("/mainImage/myTexture2dthucuoi11.png");
        dj = Res.loadImage("/mainImage/myTexture2dthucuoi22.png");
        dk = Res.loadImage("/mainImage/myTexture2dthucuoi23.png");
        dl = Res.loadImage("/mainImage/myTexture2dthucuoi31.png");
        dm = Res.loadImage("/mainImage/myTexture2drong.png");
        dn = Res.loadImage("/mainImage/myTexture2dcanhrong.png");
        Res.clientType("/mainImage/glass0.png");
        Res.clientType("/mainImage/glass1.png");
        int[][][] nArrayArray = new int[33][][];
        int[][] nArrayArray2 = new int[4][];
        int[] nArray = new int[3];
        nArray[1] = -13;
        nArray[2] = 34;
        nArrayArray2[0] = nArray;
        nArrayArray2[1] = new int[]{1, -8, 10};
        nArrayArray2[2] = new int[]{1, -9, 16};
        nArrayArray2[3] = new int[]{1, -9, 45};
        nArrayArray[0] = nArrayArray2;
        int[][] nArrayArray3 = new int[4][];
        int[] nArray2 = new int[3];
        nArray2[1] = -13;
        nArray2[2] = 35;
        nArrayArray3[0] = nArray2;
        nArrayArray3[1] = new int[]{1, -8, 10};
        nArrayArray3[2] = new int[]{1, -9, 17};
        nArrayArray3[3] = new int[]{1, -9, 46};
        nArrayArray[1] = nArrayArray3;
        nArrayArray[2] = new int[][]{{1, -10, 33}, {2, -10, 11}, {2, -8, 16}, {1, -12, 49}};
        nArrayArray[3] = new int[][]{{1, -10, 32}, {3, -12, 10}, {3, -11, 15}, {1, -13, 47}};
        nArrayArray[4] = new int[][]{{1, -10, 34}, {4, -8, 11}, {4, -7, 17}, {1, -12, 47}};
        nArrayArray[5] = new int[][]{{1, -10, 34}, {5, -12, 11}, {5, -9, 17}, {1, -13, 49}};
        nArrayArray[6] = new int[][]{{1, -10, 33}, {6, -10, 10}, {6, -8, 16}, {1, -12, 47}};
        int[][] nArrayArray4 = new int[4][];
        int[] nArray3 = new int[3];
        nArray3[1] = -9;
        nArray3[2] = 36;
        nArrayArray4[0] = nArray3;
        nArrayArray4[1] = new int[]{7, -5, 17};
        nArrayArray4[2] = new int[]{7, -11, 25};
        nArrayArray4[3] = new int[]{1, -8, 49};
        nArrayArray[7] = nArrayArray4;
        int[][] nArrayArray5 = new int[4][];
        int[] nArray4 = new int[3];
        nArray4[1] = -7;
        nArray4[2] = 35;
        nArrayArray5[0] = nArray4;
        int[] nArray5 = new int[3];
        nArray5[1] = -18;
        nArray5[2] = 22;
        nArrayArray5[1] = nArray5;
        nArrayArray5[2] = new int[]{7, -10, 25};
        nArrayArray5[3] = new int[]{1, -7, 48};
        nArrayArray[8] = nArrayArray5;
        nArrayArray[9] = new int[][]{{1, -11, 35}, {10, -3, 25}, {12, -10, 26}, new int[3]};
        nArrayArray[10] = new int[][]{{1, -11, 37}, {11, -3, 25}, {12, -11, 27}, new int[3]};
        int[][] nArrayArray6 = new int[4][];
        int[] nArray6 = new int[3];
        nArray6[1] = -14;
        nArray6[2] = 34;
        nArrayArray6[0] = nArray6;
        nArrayArray6[1] = new int[]{12, -8, 21};
        nArrayArray6[2] = new int[]{9, -7, 31};
        nArrayArray6[3] = new int[3];
        nArrayArray[11] = nArrayArray6;
        int[][] nArrayArray7 = new int[4][];
        int[] nArray7 = new int[3];
        nArray7[1] = -12;
        nArray7[2] = 35;
        nArrayArray7[0] = nArray7;
        nArrayArray7[1] = new int[]{8, -5, 14};
        nArrayArray7[2] = new int[]{8, -15, 29};
        nArrayArray7[3] = new int[]{1, -9, 49};
        nArrayArray[12] = nArrayArray7;
        nArrayArray[13] = new int[][]{{1, -9, 34}, {9, -12, 9}, {10, -7, 19}, new int[3]};
        nArrayArray[14] = new int[][]{{1, -13, 34}, {9, -12, 9}, {11, -10, 19}, new int[3]};
        nArrayArray[15] = new int[][]{{1, -8, 32}, {9, -12, 9}, {2, -6, 15}, new int[3]};
        nArrayArray[16] = new int[][]{{1, -8, 32}, {9, -12, 9}, {13, -12, 16}, new int[3]};
        int[][] nArrayArray8 = new int[4][];
        int[] nArray8 = new int[3];
        nArray8[1] = -10;
        nArray8[2] = 31;
        nArrayArray8[0] = nArray8;
        nArrayArray8[1] = new int[]{9, -12, 9};
        nArrayArray8[2] = new int[]{7, -13, 20};
        nArrayArray8[3] = new int[3];
        nArrayArray[17] = nArrayArray8;
        int[][] nArrayArray9 = new int[4][];
        int[] nArray9 = new int[3];
        nArray9[1] = -11;
        nArray9[2] = 32;
        nArrayArray9[0] = nArray9;
        nArrayArray9[1] = new int[]{9, -12, 9};
        nArrayArray9[2] = new int[]{8, -15, 26};
        nArrayArray9[3] = new int[3];
        nArrayArray[18] = nArrayArray9;
        int[][] nArrayArray10 = new int[4][];
        int[] nArray10 = new int[3];
        nArray10[1] = -9;
        nArray10[2] = 33;
        nArrayArray10[0] = nArray10;
        nArrayArray10[1] = new int[]{9, -12, 9};
        nArrayArray10[2] = new int[]{14, -8, 18};
        nArrayArray10[3] = new int[3];
        nArrayArray[19] = nArrayArray10;
        int[][] nArrayArray11 = new int[4][];
        int[] nArray11 = new int[3];
        nArray11[1] = -11;
        nArray11[2] = 33;
        nArrayArray11[0] = nArray11;
        nArrayArray11[1] = new int[]{9, -12, 9};
        nArrayArray11[2] = new int[]{15, -6, 19};
        nArrayArray11[3] = new int[3];
        nArrayArray[20] = nArrayArray11;
        int[][] nArrayArray12 = new int[4][];
        int[] nArray12 = new int[3];
        nArray12[1] = -16;
        nArray12[2] = 31;
        nArrayArray12[0] = nArray12;
        nArrayArray12[1] = new int[]{9, -12, 9};
        nArrayArray12[2] = new int[]{9, -8, 28};
        nArrayArray12[3] = new int[3];
        nArrayArray[21] = nArrayArray12;
        int[][] nArrayArray13 = new int[4][];
        int[] nArray13 = new int[3];
        nArray13[1] = -14;
        nArray13[2] = 34;
        nArrayArray13[0] = nArray13;
        nArrayArray13[1] = new int[]{1, -8, 10};
        nArrayArray13[2] = new int[]{8, -16, 28};
        nArrayArray13[3] = new int[3];
        nArrayArray[22] = nArrayArray13;
        int[][] nArrayArray14 = new int[4][];
        int[] nArray14 = new int[3];
        nArray14[1] = -8;
        nArray14[2] = 36;
        nArrayArray14[0] = nArray14;
        nArrayArray14[1] = new int[]{7, -5, 17};
        int[] nArray15 = new int[3];
        nArray15[1] = -5;
        nArray15[2] = 25;
        nArrayArray14[2] = nArray15;
        nArrayArray14[3] = new int[3];
        nArrayArray[23] = nArrayArray14;
        int[][] nArrayArray15 = new int[4][];
        int[] nArray16 = new int[3];
        nArray16[1] = -9;
        nArray16[2] = 31;
        nArrayArray15[0] = nArray16;
        nArrayArray15[1] = new int[]{9, -12, 9};
        int[] nArray17 = new int[3];
        nArray17[1] = -6;
        nArray17[2] = 20;
        nArrayArray15[2] = nArray17;
        nArrayArray15[3] = new int[3];
        nArrayArray[24] = nArrayArray15;
        nArrayArray[25] = new int[][]{{2, -9, 36}, {13, -5, 17}, {16, -11, 25}, new int[3]};
        nArrayArray[26] = new int[][]{{1, -9, 34}, {8, -5, 13}, {10, -7, 19}, new int[3]};
        nArrayArray[27] = new int[][]{{1, -13, 34}, {8, -5, 13}, {11, -10, 19}, new int[3]};
        nArrayArray[28] = new int[][]{{1, -8, 32}, {8, -5, 13}, {2, -6, 15}, new int[3]};
        nArrayArray[29] = new int[][]{{1, -8, 32}, {8, -5, 13}, {13, -12, 16}, new int[3]};
        int[][] nArrayArray16 = new int[4][];
        int[] nArray18 = new int[3];
        nArray18[1] = -9;
        nArray18[2] = 33;
        nArrayArray16[0] = nArray18;
        nArrayArray16[1] = new int[]{8, -5, 13};
        nArrayArray16[2] = new int[]{14, -8, 18};
        nArrayArray16[3] = new int[3];
        nArrayArray[30] = nArrayArray16;
        int[][] nArrayArray17 = new int[4][];
        int[] nArray19 = new int[3];
        nArray19[1] = -11;
        nArray19[2] = 33;
        nArrayArray17[0] = nArray19;
        nArrayArray17[1] = new int[]{8, -5, 13};
        nArrayArray17[2] = new int[]{15, -6, 19};
        nArrayArray17[3] = new int[3];
        nArrayArray[31] = nArrayArray17;
        int[][] nArrayArray18 = new int[4][];
        int[] nArray20 = new int[3];
        nArray20[1] = -16;
        nArray20[2] = 32;
        nArrayArray18[0] = nArray20;
        nArrayArray18[1] = new int[]{8, -5, 13};
        nArrayArray18[2] = new int[]{9, -8, 29};
        nArrayArray18[3] = new int[3];
        nArrayArray[32] = nArrayArray18;
        bC = nArrayArray;
        int[] nArray21 = new int[]{-2, -6, 22, 21, 19, 22, 10, -2, -2, 5, 19};
        int[] nArray22 = new int[]{9, 22, 25, 17, 26, 37, 36, 49, 50, 52, 36};
        String[][] stringArrayArray = new String[][]{{"1", "1", "chi\u00eau 1", "0"}, {"2", "2", "chi\u00eau 2", "5"}};
        int[][] nArrayArray19 = new int[10][];
        int[] nArray23 = new int[12];
        nArray23[0] = 1;
        nArray23[2] = 1;
        nArray23[3] = 1000;
        nArray23[4] = 40;
        nArray23[5] = 1;
        nArray23[7] = 20;
        nArrayArray19[0] = nArray23;
        int[] nArray24 = new int[12];
        nArray24[0] = 2;
        nArray24[1] = 1;
        nArray24[2] = 10;
        nArray24[3] = 1000;
        nArray24[4] = 100;
        nArray24[5] = 1;
        nArray24[7] = 40;
        nArrayArray19[1] = nArray24;
        int[] nArray25 = new int[12];
        nArray25[0] = 2;
        nArray25[1] = 2;
        nArray25[2] = 11;
        nArray25[3] = 800;
        nArray25[4] = 100;
        nArray25[5] = 1;
        nArray25[7] = 45;
        nArrayArray19[2] = nArray25;
        int[] nArray26 = new int[12];
        nArray26[0] = 2;
        nArray26[1] = 3;
        nArray26[2] = 12;
        nArray26[3] = 600;
        nArray26[4] = 100;
        nArray26[5] = 1;
        nArray26[7] = 50;
        nArrayArray19[3] = nArray26;
        int[] nArray27 = new int[12];
        nArray27[0] = 2;
        nArray27[1] = 4;
        nArray27[2] = 13;
        nArray27[3] = 500;
        nArray27[4] = 100;
        nArray27[5] = 1;
        nArray27[7] = 55;
        nArrayArray19[4] = nArray27;
        int[] nArray28 = new int[12];
        nArray28[0] = 3;
        nArray28[1] = 1;
        nArray28[2] = 14;
        nArray28[3] = 500;
        nArray28[4] = 100;
        nArray28[5] = 1;
        nArray28[7] = 60;
        nArrayArray19[5] = nArray28;
        int[] nArray29 = new int[12];
        nArray29[0] = 3;
        nArray29[1] = 2;
        nArray29[2] = 14;
        nArray29[3] = 500;
        nArray29[4] = 100;
        nArray29[5] = 1;
        nArray29[7] = 60;
        nArrayArray19[6] = nArray29;
        int[] nArray30 = new int[12];
        nArray30[0] = 3;
        nArray30[1] = 3;
        nArray30[2] = 14;
        nArray30[3] = 500;
        nArray30[4] = 100;
        nArray30[5] = 1;
        nArray30[7] = 60;
        nArrayArray19[7] = nArray30;
        int[] nArray31 = new int[12];
        nArray31[0] = 3;
        nArray31[1] = 4;
        nArray31[2] = 14;
        nArray31[3] = 500;
        nArray31[4] = 100;
        nArray31[5] = 1;
        nArray31[7] = 60;
        nArrayArray19[8] = nArray31;
        int[] nArray32 = new int[12];
        nArray32[0] = 3;
        nArray32[1] = 5;
        nArray32[2] = 14;
        nArray32[3] = 500;
        nArray32[4] = 100;
        nArray32[5] = 1;
        nArray32[7] = 60;
        nArrayArray19[9] = nArray32;
        cn = false;
        cU = new int[][]{{542, 543}};
        cW = true;
        cX = true;
        int[][] nArrayArray20 = new int[32][];
        nArrayArray20[0] = new int[]{5, -7};
        nArrayArray20[1] = new int[]{5, -7};
        nArrayArray20[2] = new int[]{5, -8};
        nArrayArray20[3] = new int[]{5, -7};
        nArrayArray20[4] = new int[]{5, -6};
        nArrayArray20[5] = new int[]{5, -8};
        nArrayArray20[6] = new int[]{5, -7};
        int[] nArray33 = new int[2];
        nArray33[0] = 9;
        nArrayArray20[7] = nArray33;
        nArrayArray20[8] = new int[]{11, 1};
        int[] nArray34 = new int[2];
        nArray34[0] = 4;
        nArrayArray20[9] = nArray34;
        nArrayArray20[10] = new int[]{4, -1};
        nArrayArray20[11] = new int[]{4, 8};
        nArrayArray20[12] = new int[]{6, 5};
        nArrayArray20[13] = new int[]{6, -6};
        nArrayArray20[14] = new int[]{2, -5};
        nArrayArray20[15] = new int[]{7, -8};
        nArrayArray20[16] = new int[]{7, -6};
        int[] nArray35 = new int[2];
        nArray35[0] = 8;
        nArrayArray20[17] = nArray35;
        nArrayArray20[18] = new int[]{7, 5};
        nArrayArray20[19] = new int[]{9, -7};
        nArrayArray20[20] = new int[]{7, -3};
        nArrayArray20[21] = new int[]{2, 8};
        nArrayArray20[22] = new int[]{4, 5};
        nArrayArray20[23] = new int[]{10, -5};
        nArrayArray20[24] = new int[]{9, -5};
        nArrayArray20[25] = new int[]{9, -5};
        nArrayArray20[26] = new int[]{6, -6};
        nArrayArray20[27] = new int[]{2, -5};
        nArrayArray20[28] = new int[]{7, -8};
        nArrayArray20[29] = new int[]{7, -6};
        nArrayArray20[30] = new int[]{9, -7};
        nArrayArray20[31] = new int[]{7, -3};
        fj = nArrayArray20;
        da = new short[0];
    }

    public final void b() {
        try {
            long l2 = 1L;
            long l3 = 0L;
            int n2 = 0;
            int n3 = GameScreen.R.length - 1;
            while (n3 >= 0) {
                if (this.Message >= GameScreen.R[n3]) {
                    l2 = n3 == GameScreen.R.length - 1 ? 1L : GameScreen.R[n3 + 1] - GameScreen.R[n3];
                    l3 = this.Message - GameScreen.R[n3];
                    n2 = n3;
                    break;
                }
                --n3;
            }
            this.Q = n2;
            this.Z = (int)(l3 * 10000L / l2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private int Mob() {
        if (this.aC != null) {
            return this.aC.g;
        }
        return 0;
    }

    private int ab() {
        if (this.aC != null) {
            return this.aC.Item;
        }
        return 0;
    }

    public static void methodLoginScreen(boolean bl2) {
        ai ai2 = Char.e().aD;
        String string = ai2.g[ai2.LoginScreen];
        if (string != null && !string.equals("")) {
            if (string.startsWith("#")) {
                string = ai.LoginScreen(string, "#", "");
                _do do_ = new _do(5, 0, -100, -100, 5, GameScreen.aD.LoginScreen[Char.e().K][2]);
                do_.C = -100;
                new _do(5, 0, -100, -100, 5, GameScreen.aD.LoginScreen[Char.e().K][2]).B = -100;
                do_.aO = GameScreen.aD.LoginScreen[Char.e().K][2];
                do_.J = 5;
                if (GameCanvas.currentScreen == GameScreen.c) {
                    ae.LoginScreen(string, do_);
                }
            } else {
                GameScreen.aD.LoginScreen(string, 0);
            }
        }
        GameScreen.O = true;
        ds.c("TASKx " + Char.e().aD.c);
        Char.e().ao = Char.e().aD.c > 2;
        GameScreen.j().cm = null;
        if (ai2.c == 0) {
            v.f = false;
            v.Item = false;
            GameScreen.j().co = null;
            GameScreen.O = false;
            GameScreen.j().cm = null;
            if (ai2.LoginScreen < 4) {
                k.j = false;
                GameScreen.ImageLoader = -1;
            }
            if (ai2.LoginScreen == 4) {
                GameScreen.ImageLoader = 1;
                k.j = true;
            }
            if (ai2.LoginScreen >= 5) {
                GameScreen.j().co = GameScreen.j().SessionReceiver;
            }
        }
        if (ai2.c == 1) {
            GameScreen.O = true;
        }
        if (ai2.c > 0) {
            GameScreen.j().co = GameScreen.j().SessionReceiver;
            GameScreen.j().cm = GameScreen.j().aR;
        }
        g.ImageCache = ai2.c >= 0;
        GameCanvas.G.D = ai2.c < 12 ? T.aN : T.aO;
        GameCanvas.G.M[0] = GameCanvas.G.D;
        if (Char.dD.aD.c > 10) {
            RMS.LoginScreen("fake", "Mob");
        }
    }

    public final String c() {
        String string = String.valueOf(this.bi[this.Q]) + "+" + this.Z / 100L + "." + this.Z % 100L + "%";
        if (string.length() > 23 && string.indexOf("c\u1ea5p ") >= 0) {
            string = ds.LoginScreen(string, "c\u1ea5p ", "c");
        }
        return string;
    }

    public final int d() {
        int n2 = this.bU;
        int n3 = 0;
        while (n3 < bg.length) {
            if (n2 == bg[n3]) {
                return bh[n3];
            }
            ++n3;
        }
        return -1;
    }

    public final void methodLoginScreen(String string, short s2, short s3, short s4) {
        this.bL = s2;
        this.bK = string;
        this.bM = s3;
        this.bN = s4;
        ds.c("sc= " + s4 + " max= " + s3);
        this.dG = this.dH = System.currentTimeMillis();
    }

    public final void methodLoginScreen(String string) {
        if (this.z == null) {
            this.z = new ej();
        }
        this.z.LoginScreen(string, 0, null, false);
    }

    public Char() {
        byte[] byArray = new byte[8];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 1;
        byArray[7] = 1;
        this.cfr_renamed_0 = byArray;
        this.bF = new MyVector("vMovePoints");
        this.bO = true;
        this.dI = null;
        this.dJ = null;
        this.dS = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        this.dT = "mount_";
        this.bT = -1;
        this.dU = -1;
        this.bZ = -1;
        this.ef = null;
        this.eg = null;
        this.eh = null;
        this.Npc = null;
        this.cd = null;
        this.ItemMap = false;
        this.ch = false;
        this.ci = false;
        this.cj = false;
        this.SplashScreen = 0;
        this.Position = 0L;
        this.es = 24;
        this.et = 24;
        this.ex = 0;
        this.eB = 32;
        this.eD = 0;
        this.cA = 1;
        this.cB = 1;
        this.cG = false;
        this.eG = true;
        this.eH = false;
        this.eI = 0;
        this.cS = 100;
        this.eM = -1;
        this.eN = -1;
        this.eO = -1;
        this.eP = -1;
        this.eQ = new MyVector("vEff");
        this.eS = 0;
        int[] nArray = new int[34];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        nArray[14] = 1;
        nArray[15] = 1;
        nArray[18] = 1;
        nArray[19] = 1;
        nArray[22] = 1;
        nArray[23] = 1;
        nArray[26] = 1;
        nArray[27] = 1;
        nArray[30] = -1;
        nArray[31] = -1;
        nArray[32] = -1;
        nArray[33] = -1;
        this.eU = nArray;
        int[] nArray2 = new int[23];
        nArray2[0] = -1;
        nArray2[1] = -1;
        nArray2[2] = -1;
        nArray2[3] = -1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArray2[8] = 1;
        nArray2[11] = 1;
        nArray2[12] = 1;
        nArray2[13] = 1;
        nArray2[16] = 1;
        nArray2[17] = 1;
        nArray2[18] = 1;
        nArray2[19] = -1;
        nArray2[20] = -1;
        nArray2[21] = -1;
        nArray2[22] = -1;
        this.eV = nArray2;
        int[] nArray3 = new int[30];
        nArray3[0] = -1;
        nArray3[1] = -1;
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[8] = 1;
        nArray3[9] = 1;
        nArray3[12] = 1;
        nArray3[13] = 1;
        nArray3[16] = 1;
        nArray3[17] = 1;
        nArray3[20] = 1;
        nArray3[21] = 1;
        nArray3[24] = 1;
        nArray3[25] = 1;
        nArray3[28] = -1;
        nArray3[29] = -1;
        this.eW = nArray3;
        this.eX = 0;
        this.eY = "aura_";
        this.cV = (short)-1;
        this.fb = "set_eff_";
        this.cY = (short)-1;
        this.fg = "hat_sau_";
        this.fh = "hat_truoc_";
        this.fi = "ngang_";
        this.cZ = (short)-1;
        this.fm = 0;
        this.fr = 0;
        this.fs = 0;
        this.dc = false;
        this.fw = null;
        this.H = 6;
    }

    public static Char e() {
        if (dD == null) {
            dD = new Char();
            new Char().aq = true;
            Char.dD.ap = true;
        }
        return dD;
    }

    public static Char f() {
        if (dE == null) {
            dE = new Char();
            new Char().aq = false;
        }
        return dE;
    }

    public static void g() {
        dD = null;
    }

    public final void methodItem() {
        try {
            Item h2;
            MyVector el2 = new MyVector("items");
            int n2 = 0;
            while (n2 < this.aG.length) {
                h2 = this.aG[n2];
                if (h2 != null && h2.b.Item && !h2.x) {
                    el2.addElement(h2);
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < el2.size()) {
                h2 = (Item)el2.elementAt(n2);
                if (h2 != null) {
                    int n3 = n2 + 1;
                    while (n3 < el2.size()) {
                        Item h3 = (Item)el2.elementAt(n3);
                        if (h3 != null && h2.b.equals(h3.b) && h2.k == h3.k) {
                            h2.Item += h3.Item;
                            this.aG[h3.g] = null;
                            el2.setElementAt(null, n3);
                        }
                        ++n3;
                    }
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < this.aG.length) {
                if (this.aG[n2] != null) {
                    int n4 = 0;
                    while (n4 <= n2) {
                        if (this.aG[n4] == null) {
                            this.aG[n4] = this.aG[n2];
                            this.aG[n4].g = n4;
                            this.aG[n2] = null;
                            break;
                        }
                        ++n4;
                    }
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            ds.c("Char.boxSort()");
            return;
        }
    }

    public final bf LoginScreen(et et2) {
        int n2 = 0;
        while (n2 < this.az.size()) {
            if (((bf)this.az.elementAt((int)n2)).LoginScreen.LoginScreen == et2.LoginScreen) {
                return (bf)this.az.elementAt(n2);
            }
            ++n2;
        }
        return null;
    }

    public final bw i() {
        ai ai2 = Char.dD.aD;
        if (ai2 != null && ai2.c == 0 && ai2.LoginScreen < 6) {
            return null;
        }
        int n2 = bv.MyHashtable.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.MyHashtable.elementAt(n3);
            if (bo.LoginScreen.size() >= n2) {
                bo bo2 = (bo)bo.LoginScreen.elementAt(n3);
                if (!bo2.j) {
                    return null;
                }
            }
            if (this.B >= bw2.LoginScreen && this.B <= bw2.c && this.C >= bw2.b && this.C <= bw2.d && bw2.e && bw2.f) {
                return bw2;
            }
            n3 = (byte)(n3 + 1);
        }
        return null;
    }

    public final bw j() {
        ai ai2 = Char.dD.aD;
        if (ai2 != null && ai2.c == 0 && ai2.LoginScreen < 6) {
            return null;
        }
        int n2 = bv.MyHashtable.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.MyHashtable.elementAt(n3);
            if (bo.LoginScreen.size() >= n2) {
                bo bo2 = (bo)bo.LoginScreen.elementAt(n3);
                if (!bo2.j) {
                    return null;
                }
            }
            if (this.B >= bw2.LoginScreen && this.B <= bw2.c && this.C >= bw2.b && this.C <= bw2.d && bw2.e && !bw2.f) {
                return bw2;
            }
            n3 = (byte)(n3 + 1);
        }
        return null;
    }

    private boolean MessageHandler() {
        if (bv.f() && this.C >= bv.d - 48) {
            return true;
        }
        if (this.SessionReceiver || this.MyHashtable) {
            return false;
        }
        int n2 = bv.MyHashtable.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.MyHashtable.elementAt(n3);
            if ((bv.Res == 47 || bv.f()) && this.C <= bw2.b + bw2.d && this.B > bw2.LoginScreen && this.B < bw2.c) {
                return !bv.f() || this.aN == 0;
            }
            if (this.B >= bw2.LoginScreen && this.B <= bw2.c && this.C >= bw2.b && this.C <= bw2.d && !bw2.e) {
                return true;
            }
            n3 = (byte)(n3 + 1);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void ad() {
        boolean bl2;
        if (this.aq && this.H == 10 && this.ImageCache == 8 && this.dP > 20 && GameCanvas.w % 20 == 0) {
            bu.LoginScreen();
        }
        if (this.cf == null) return;
        if (this.D() == null) return;
        if (this.cb >= this.D().length) return;
        Char af2 = this;
        if (af2.cf == null) return;
        if (af2.cf.LoginScreen >= 0 && af2.cf.LoginScreen <= 6) {
            bl2 = true;
        } else if (af2.cf.LoginScreen >= 14 && af2.cf.LoginScreen <= 20) {
            bl2 = true;
        } else if (af2.cf.LoginScreen >= 28 && af2.cf.LoginScreen <= 34) {
            bl2 = true;
        } else {
            if (af2.cf.LoginScreen < 63) return;
            if (af2.cf.LoginScreen > 69) return;
            bl2 = true;
        }
        if (!bl2) return;
        if (!this.aq) {
            if (this.aq) return;
            if (this.B < GameScreen.j) return;
            if (this.B > GameScreen.j + GameCanvas.A) return;
        }
        if (GameCanvas.w % 5 != 0) return;
        if (this.ImageCache == 9 || this.ImageCache == 10 || this.ImageCache == 11) {
            bu.LoginScreen();
            return;
        }
        bu.LoginScreen();
    }

    /*
     * Unable to fully structure code
     */
    public void methodLoginScreen() {
        block274: {
            block273: {
                if (this.dc) {
                    this.ImageCache = 23;
                    this.fv = (short)(this.fv + 1);
                    if (this.fv > 150) {
                        this.dc = false;
                    }
                    return;
                }
                this.fv = 0;
                if (this.bR) {
                    return;
                }
                if (this.ck) {
                    return;
                }
                if (this.v != null) {
                    if (GameCanvas.w % 3 == 0) {
                        if (Char.e().I == 1) {
                            this.v.Item = this.B - 20;
                        }
                        if (Char.e().I == -1) {
                            this.v.Item = this.B + 20;
                        }
                        this.v.d = this.C - 40;
                        this.v.b = this.v.i > this.B ? -1 : 1;
                        if (this.v.Item < 100) {
                            this.v.Item = 100;
                        }
                        if (this.v.Item > bv.c - 100) {
                            this.v.Item = bv.c - 100;
                        }
                    }
                    var1_1 = this.v;
                    var2_15 = this.v;
                    if (var2_15.e != var2_15.d) {
                        var2_15.g = var2_15.d - var2_15.e << 2;
                        var2_15.f += var2_15.g;
                        var2_15.e += var2_15.f >> 4;
                        var2_15.f &= 15;
                    }
                    if (var2_15.i != var2_15.Item) {
                        var2_15.k = var2_15.Item - var2_15.i << 2;
                        var2_15.j += var2_15.k;
                        var2_15.i += var2_15.j >> 4;
                        var2_15.j &= 15;
                    }
                    if (GameCanvas.w % 3 == 0) {
                        var1_1.c = var1_1.o[var1_1.GameScreen];
                        ++var1_1.GameScreen;
                    }
                    if (var1_1.GameScreen >= var1_1.o.length) {
                        var1_1.GameScreen = 0;
                    }
                }
                if (!this.aq && this.U <= 0L && this.ah != -100 && this.H != 14 && this.H != 5) {
                    this.LoginScreen((short)this.B, (short)this.C);
                }
                if (this.dL) {
                    ++this.dK;
                    if (this.dK == 20) {
                        this.dK = 0;
                        this.dL = false;
                    }
                } else if (this.cT > this.U) {
                    var1_2 = this.cT - this.U >> 1;
                    if (var1_2 < 1L) {
                        var1_2 = 1L;
                    }
                    this.cT -= var1_2;
                } else {
                    this.cT = this.U;
                }
                if (this.bN != 0) {
                    this.dH = System.currentTimeMillis();
                    if (this.dH - this.dG >= 1000L) {
                        this.dG = System.currentTimeMillis();
                        this.bN = (short)(this.bN - 1);
                    }
                }
                if (this.db) {
                    if (GameCanvas.b > this.fl || this.H == 14 || this.H == 5) {
                        this.fl = 0L;
                        this.db = false;
                    }
                    var1_1 = this;
                    if (var1_1.fs == 0) {
                        if (var1_1.fk && var1_1.fr < 20) {
                            var1_1.E = -3;
                            var1_1.C += var1_1.E;
                        }
                        var1_1.ImageCache = var1_1.fo.length == 1 ? var1_1.fo[0] : (var1_1.fr > var1_1.fo.length - 1 ? var1_1.fo[var1_1.fo.length - 1] : var1_1.fo[var1_1.fr]);
                    } else if (var1_1.fs == 1) {
                        var1_1.ImageCache = var1_1.fp[var1_1.fr % var1_1.fp.length];
                        if (Res.currentTimeMillis() - var1_1.fu > 0L) {
                            var1_1.LoginScreen(2, (short)0, null, (short)0, (short)0, (byte)0, null, (byte)0);
                        }
                        if (var1_1.fr % 5 == 0) {
                            GameScreen.bu = 5;
                        }
                        if (var1_1.fm == 1 && var1_1.fr < 10 && !bv.LoginScreen(var1_1.B - (var1_1.am + 1) * var1_1.I, var1_1.C, var1_1.I == 1 ? 8 : 4)) {
                            var1_1.B -= var1_1.I;
                        }
                    } else if (var1_1.fs == 2) {
                        var1_1.ImageCache = var1_1.fq.length == 1 ? var1_1.fq[0] : (var1_1.fr > var1_1.fq.length - 1 ? var1_1.fq[var1_1.fq.length - 1] : var1_1.fq[var1_1.fr]);
                        if (var1_1.fk) {
                            var1_1.E = 0;
                            var1_1.D = 0;
                            var1_1.H = 4;
                        }
                        var1_1.db = false;
                    }
                    ++var1_1.fr;
                    if (this.bd) {
                        this.H();
                    }
                    return;
                }
                if (this.cQ && GameCanvas.w % 10 == 0) {
                    ei.LoginScreen(new ea(41, this.B, this.C, 3, 1, 1));
                }
                if (this.cN) {
                    this.cN = false;
                    ei.LoginScreen(new ea(39, this.B, this.C, 3, 3, 1));
                }
                if (this.cO && GameCanvas.w % 5 == 0) {
                    at.LoginScreen(113, this, 1);
                }
                if (this.cK) {
                    var1_3 = this.eB + 73;
                    if (GameCanvas.w % 5 == 0) {
                        this.dI = new ea(33, this.B, var1_3, 3, 3, 1);
                    }
                    if (this.dI != null) {
                        this.dI.LoginScreen();
                        this.dI.f = this.B;
                        this.dI.g = var1_3;
                    }
                }
                if (this.eG) {
                    if (this.dJ == null && (var1_1 = (String)GameCanvas.T.get(String.valueOf(this.J))) != null) {
                        var2_15 = ds.LoginScreen(var1_1.trim(), ",", 0);
                        var3_21 = Short.parseShort(var2_15[0]);
                        var1_4 = Short.parseShort(var2_15[1]);
                        this.dJ = new ea(var3_21, this.B, this.eB + 73, 1, -1, -1);
                        this.dJ.Res = (long)(var1_4 * 1000) + Res.currentTimeMillis();
                    }
                    if (this.dJ != null) {
                        this.dJ.LoginScreen();
                        this.dJ.f = this.B;
                        this.dJ.g = this.eB;
                        if (this.dJ.Res <= Res.currentTimeMillis()) {
                            this.dJ = null;
                            GameCanvas.T.remove(String.valueOf(this.J));
                        }
                    }
                }
                if (this.aU != null && this.aU.C < 0) {
                    this.aU = null;
                }
                if (this.cL) {
                    ++this.cM;
                }
                if (this.u && GameCanvas.w % 25 == 0) {
                    at.LoginScreen(114, this, 1);
                }
                if (this.eH) {
                    ++this.eI;
                    if (this.eI == 1) {
                        this.eI = 0;
                        this.eH = false;
                        this.B = this.eJ;
                        this.C = this.eK;
                        this.G = 0;
                        this.d = 0;
                        this.F = 0;
                        ds.c("set pox x= " + this.eJ + " Message= " + this.eK);
                        if (this.eL == 1) {
                            if (this.aq) {
                                this.bD = this.B;
                                this.bE = this.C;
                            }
                            this.bP = null;
                            this.cP = false;
                            at.LoginScreen(173, this.B, this.C, 1);
                        } else {
                            at.LoginScreen(60, this.B, this.C, 1);
                        }
                        if ((bv.b(this.B, this.C) & 2) == 2) {
                            this.H = 1;
                            return;
                        }
                        this.H = 4;
                    }
                    return;
                }
                this.ad();
                if (this.cR) {
                    return;
                }
                if (this.bk) {
                    if (GameCanvas.w % 5 == 0) {
                        at.LoginScreen(113, this.B, this.C, 1);
                    }
                    this.ImageCache = 23;
                    var1_5 = System.currentTimeMillis();
                    if (var1_5 - this.bp >= 1000L) {
                        --this.ImageLoader;
                        this.bp = var1_5;
                        if (this.ImageLoader < 0) {
                            this.bk = false;
                            this.bm = 0;
                            if (this.aq) {
                                Char.e().bJ = false;
                                GameScreen.j().aY = 0;
                                GameScreen.j().aZ = false;
                            }
                        }
                    }
                    if (bv.LoginScreen(this.B / bv.i, this.C / bv.i) == 0) {
                        ++this.dP;
                        ++this.dO;
                        this.bS += this.dN == false ? 1 : -1;
                        if (this.dO == 10) {
                            this.dO = 0;
                            this.dN = this.dN == false;
                        }
                    }
                    return;
                }
                if (this.cG) {
                    this.bJ = true;
                    this.ImageCache = 17;
                    if (GameCanvas.w % 5 == 0) {
                        at.LoginScreen(154, this.B, this.C - 10, 2);
                    }
                    if (GameCanvas.w % 5 == 0) {
                        at.LoginScreen(1, this.B, this.C + 10, 1);
                    }
                    ++this.SplashScreen;
                    if (this.SplashScreen == 500) {
                        this.cG = false;
                        this.bJ = false;
                    }
                    return;
                }
                if (this.cj) {
                    ++this.SplashScreen;
                    var1_6 = bv.LoginScreen(Char.e().B, Char.e().C, 2) == false;
                    this.ae();
                    this.ah();
                    this.aZ = null;
                    this.bP = null;
                    this.ImageCache = 17;
                    if (var1_6 && this.K != 2) {
                        this.ImageCache = 12;
                    }
                    if (this.K == 2) {
                        if (bv.Res == 170) {
                            if (GameCanvas.w % 2 == 0) {
                                if (this.I == 1) {
                                    at.LoginScreen(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                                    at.LoginScreen(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                                } else {
                                    at.LoginScreen(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                                    at.LoginScreen(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                                }
                            }
                        } else {
                            if (GameCanvas.w % 3 == 0) {
                                at.LoginScreen(154, this.B, this.C - this.al / 2 + 10, 1);
                            }
                            if (GameCanvas.w % 5 == 0) {
                                at.LoginScreen(114, this.B + ds.b(-20, 20), this.C + ds.b(-20, 20), 1);
                            }
                        }
                    }
                    if (this.K == 1 && GameCanvas.w % 2 == 0) {
                        if (this.I == 1) {
                            at.LoginScreen(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                            at.LoginScreen(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                        } else {
                            at.LoginScreen(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                            at.LoginScreen(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                        }
                    }
                    if (this.K == 0 && GameCanvas.w % 2 == 0) {
                        if (this.I == 1) {
                            at.LoginScreen(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                            at.LoginScreen(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                        } else {
                            at.LoginScreen(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                            at.LoginScreen(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                        }
                    }
                    this.m = System.currentTimeMillis();
                    ds.c("  7.5 gong namekLazer " + this.ag + "_" + this.K);
                    if (this.m - this.bo > (long)this.bm || this.m - this.bo > 10000L) {
                        ds.c("<*> 8  namekLazer gong xong " + this.ag);
                        this.C();
                        this.cj = false;
                        if (this.aq) {
                            if (this.K == 2) {
                                ds.c("<*> 9 [me] xay da xong  " + Char.e().aC.b);
                                Char.e().LoginScreen(GameScreen.u[Char.e().aC.b], var1_6 == false ? 0 : 1);
                            }
                            if (this.K == 1) {
                                ds.c("<*> 9 [me] namec xong " + Char.e().aC.b);
                                this.ItemMap = true;
                                Char.e().LoginScreen(GameScreen.u[Char.e().aC.b], var1_6 == false ? 0 : 1);
                            }
                            if (this.K == 0) {
                                ds.c("<*> 9 [me] namec xong " + Char.e().aC.b);
                                Char.e().LoginScreen(GameScreen.u[Char.e().aC.b], var1_6 == false ? 0 : 1);
                            }
                            if (Char.e().aC.b >= 77 && Char.e().aC.b <= 83) {
                                GameService.LoginScreen().c((byte)4);
                            }
                            var2_16 = Char.e().aC.b;
                        } else {
                            if (this.K == 2) {
                                this.LoginScreen(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                ds.c("<*> 10 xay da xong 111   " + this.aP);
                            }
                            if (this.K == 1) {
                                this.LoginScreen(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                ds.c("<*> 10 C_NAMEC xong 222   " + this.aP);
                            }
                            if (this.K == 0) {
                                this.LoginScreen(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                ds.c("<*> 10  C_TRAIDAT xong 333   " + this.aP);
                            }
                            var2_16 = this.aP;
                        }
                        if (this.K == 2 && this.H != 14 && this.H != 5 && (var2_16 < 77 || var2_16 > 83)) {
                            GameScreen.j().b(this.B, this.C);
                        }
                        ds.c("<*> 11 Ho\u00e0n th\u00e0nh skill not focus -  STAND");
                    }
                    ++this.SplashScreen;
                    if (this.SplashScreen == 500) {
                        this.C();
                    }
                    return;
                }
                if (this.ci) {
                    this.ae();
                    this.ah();
                    this.aZ = null;
                    this.bP = null;
                    ++this.MyVector;
                    if (bv.LoginScreen(this.B, this.C - this.al, 8192)) {
                        this.C();
                        return;
                    }
                    if (this.MyVector == 20) {
                        this.bo = System.currentTimeMillis();
                    }
                    ds.c("<*> 11 g\u1ed3ng qua cau kinh khi  " + this.ag);
                    if (this.MyVector > 20) {
                        this.m = System.currentTimeMillis();
                        if (this.m - this.bo > (long)this.bm || this.m - this.bo > 10000L) {
                            ds.c("<*> 12 k\u1ebft th\u00fac skill  qua cau kinh khi \tFLY " + this.ag);
                            this.ci = false;
                            if (this.aq) {
                                this.ItemMap = true;
                                var1_7 = bv.LoginScreen(Char.e().B, Char.e().C, 2);
                                this.ch = true;
                                this.LoginScreen(GameScreen.u[Char.e().aC.b], var1_7 != false ? 0 : 1);
                                return;
                            }
                            if (bv.Res == 170) {
                                this.ItemMap = true;
                                this.ch = true;
                                var1_8 = bv.LoginScreen(this.B, this.C, 2);
                                this.LoginScreen(GameScreen.u[this.aP], var1_8 != false ? 0 : 1);
                            }
                            return;
                        }
                        this.ImageCache = 32;
                        if (this.K == 0 && GameCanvas.w % 3 == 0) {
                            at.LoginScreen(153, this.B, this.C - this.al, 2);
                        }
                        if (bv.Res == 170 && (this.K == 2 || this.K == 1) && GameCanvas.w % 3 == 0) {
                            at.LoginScreen(153, this.B, this.C - this.al, 2);
                        }
                        ++this.SplashScreen;
                        if (this.SplashScreen == 500) {
                            this.C();
                        }
                        return;
                    }
                    if (this.H != 14) {
                        this.H = 3;
                    }
                    this.E = -3;
                    this.C += this.E;
                    this.ImageCache = 7;
                    return;
                }
                if (this.aq && GameCanvas.e) {
                    if (this.aU != null && this.aU.J >= 0 && this.aU.B > 100 && this.aU.B < bv.c - 100 && this.j() == null && this.i() == null && !this.I() && bv.Res != 51 && bv.Res != 52 && GameCanvas.G.S.size() > 0 && GameScreen.j().bQ == null) {
                        var1_9 = Math.abs(this.B - this.aU.B);
                        var2_17 = Math.abs(this.C - this.aU.C);
                        if (var1_9 < 60 && var2_17 < 40) {
                            if (this.an == null) {
                                this.an = new de(T.bi, 11111);
                                this.an.f = false;
                            }
                            this.an.j = this.aU.B - GameScreen.j;
                            this.an.k = this.aU.C - this.aU.al - 30 - GameScreen.k;
                        } else {
                            this.an = null;
                        }
                    } else {
                        this.an = null;
                    }
                }
                if (this.bd) {
                    this.H();
                }
                if (this.SessionReceiver) {
                    return;
                }
                if (this.z != null) {
                    this.z.b();
                }
                if (this.c > 0) {
                    --this.c;
                }
                if (this.j > 0 && GameCanvas.w % 2 == 0) {
                    this.j = (byte)(this.j - 1);
                    if (this.j == 30 || this.j == 60) {
                        this.j = 0;
                    }
                }
                this.ah();
                if (this.aR != null) {
                    var1_1 = this;
                    if (var1_1.aS != 0) {
                        --var1_1.aS;
                    }
                    if (var1_1.aS == 0) {
                        var1_1.aR.MyHashtable = var1_1.I == 1 ? var1_1.B - 30 : var1_1.B + 30;
                        var1_1.aR.u = var1_1.C - 60;
                        var2_18 = var1_1.aR.MyHashtable - var1_1.aR.m;
                        var3_21 = var1_1.aR.u - var1_1.aR.n;
                        var1_1.aR.m += var2_18 / 4;
                        var1_1.aR.n += var3_21 / 4;
                        var1_1.aR.o = var1_1.I;
                    }
                }
                if (this.Npc != null) {
                    this.Npc.LoginScreen();
                }
                if (this.cd != null) {
                    this.cd.LoginScreen();
                }
                this.ae();
                if (this.cI != 0) {
                    if (GameCanvas.w % 5 == 0) {
                        ei.LoginScreen(new ea(32, this.B, this.C + 24, 3, 5, 1));
                    }
                    return;
                }
                if (this.cO) {
                    return;
                }
                if (this.cQ) {
                    return;
                }
                if (this.cJ) {
                    if (this.eE != null && (this.eE.H == 14 || this.eE.H == 5)) {
                        this.P();
                    }
                    if (this.eF != null && this.eF.GameScreen == 1) {
                        this.P();
                    }
                    if (this.aq && this.H == 2 && this.bP != null) {
                        this.cJ = false;
                        this.eE = null;
                        this.eF = null;
                    }
                    if (bv.LoginScreen(this.B, this.C, 2)) {
                        this.ImageCache = 16;
                        return;
                    }
                    this.ImageCache = 31;
                    return;
                }
                if (this.U > 0L) {
                    var1_10 = 0;
                    while (var1_10 < this.aB.size()) {
                        var2_19 = (ec)this.aB.elementAt(var1_10);
                        if (GameCanvas.Message) {
                            this.U += (long)var2_19.LoginScreen;
                            this.T += (long)var2_19.LoginScreen;
                        }
                        ++var1_10;
                    }
                    if (this.R > 0 && GameCanvas.z) {
                        this.U += (long)this.R;
                    }
                    if (this.S > 0 && GameCanvas.z) {
                        this.T += (long)this.S;
                    }
                    if (this.U > this.V) {
                        this.U = this.V;
                    }
                    if (this.T > this.W) {
                        this.T = this.W;
                    }
                }
                if (this.ap) {
                    GameScreen.Res = this.B - GameScreen.f;
                    GameScreen.m = this.C - GameScreen.g - 1;
                    if (!GameCanvas.clearKeyHold) {
                        GameScreen.Res += GameScreen.i * this.I;
                    }
                }
                this.Item = (this.Item + 1) % 100;
                if (!this.aq) break block273;
                if (this.aU != null && !GameScreen.D.contains(this.aU)) {
                    this.aU = null;
                }
                if (this.B < 10) {
                    this.D = 0;
                    this.B = 10;
                } else if (this.B > bv.c - 10) {
                    this.B = bv.c - 10;
                    this.D = 0;
                }
                if (!Char.bG && this.MessageHandler()) {
                    GameService.LoginScreen().g();
                    if (bv.b()) {
                        GameService.LoginScreen().q();
                        Char.bG = true;
                    } else {
                        GameService.LoginScreen().f();
                    }
                    Char.bH = true;
                    Char.bG = true;
                    GameCanvas.resetKeys();
                    GameCanvas.clearKeyHold();
                    bp.LoginScreen();
                    return;
                }
                if (this.H != 4 && ds.g(this.B - this.bD) + ds.g(this.C - this.bE) >= 70 && this.C - this.bE <= 0 && this.aq) {
                    GameService.LoginScreen().g();
                }
                if (this.bJ) {
                    this.bP = null;
                }
                if (this.bP != null) {
                    if (Char.c(this.B - this.bP.LoginScreen) <= 16 && Char.c(this.C - this.bP.b) <= 16) {
                        this.B = (this.bP.LoginScreen + this.B) / 2;
                        this.C = this.bP.b;
                        this.bP = null;
                        GameScreen.c.aV = false;
                        this.Char();
                        this.E = 0;
                        this.D = 0;
                        if ((bv.b(this.B, this.C) & 2) == 2) {
                            this.H = 1;
                        } else {
                            this.ar();
                            this.ax();
                        }
                        GameService.LoginScreen().g();
                    } else {
                        v0 = this.I = this.bP.LoginScreen > this.B ? 1 : -1;
                        if (bv.LoginScreen(this.B, this.C, 2)) {
                            this.H = 2;
                            if (this.bP != null) {
                                this.D = this.O * this.I;
                                this.E = 0;
                            }
                            if (Char.c(this.B - this.bP.LoginScreen) <= 10) {
                                if (this.bP.b > this.C) {
                                    if (this.bP.b > this.C) {
                                        var1_11 = false;
                                        var2_20 = this.I == 1 ? 1 : -1;
                                        var3_21 = 0;
                                        while (var3_21 < 2) {
                                            if (bv.LoginScreen(this.bP.LoginScreen + this.am * var2_20, this.C + this.f * var3_21, 2)) {
                                                var1_11 = true;
                                                break;
                                            }
                                            ++var3_21;
                                        }
                                        if (var1_11) {
                                            this.bP = null;
                                            GameScreen.c.aV = false;
                                            this.H = 1;
                                            this.E = 0;
                                            this.D = 0;
                                            this.Char();
                                        } else {
                                            bu.LoginScreen();
                                            this.B = this.bP.LoginScreen;
                                            this.H = 10;
                                            this.E = -5;
                                            this.D = 0;
                                            ds.c("Jum lun");
                                        }
                                    }
                                } else {
                                    bu.LoginScreen();
                                    this.B = this.bP.LoginScreen;
                                    this.H = 10;
                                    this.E = -5;
                                    this.D = 0;
                                }
                            }
                            if (this.I == 1) {
                                if (bv.LoginScreen(this.B + this.am, this.C - this.f, 4)) {
                                    this.D = this.O * this.I;
                                    this.H = 10;
                                    this.E = -5;
                                }
                            } else if (bv.LoginScreen(this.B - this.am - 1, this.C - this.f, 8)) {
                                this.D = this.O * this.I;
                                this.H = 10;
                                this.E = -5;
                            }
                        } else {
                            if (this.bP.b < this.C + 10) {
                                this.H = 10;
                                this.E = -5;
                                if (Char.c(this.C - this.bP.b) <= 10) {
                                    this.C = this.bP.b;
                                    this.E = 0;
                                }
                                this.D = Char.c(this.B - this.bP.LoginScreen) <= 10 ? 0 : this.O * this.I;
                            } else if (bv.LoginScreen(this.B, this.C, 2)) {
                                this.bP = null;
                                GameScreen.c.aV = false;
                                this.H = 1;
                                this.E = 0;
                                this.D = 0;
                                this.Char();
                            } else {
                                if (this.H == 10 || this.H == 2) {
                                    this.E = 0;
                                }
                                this.H = 4;
                            }
                            if (this.bP.b > this.C) {
                                if (this.I == 1) {
                                    if (bv.LoginScreen(this.B + this.am, this.C - this.f, 4)) {
                                        this.E = 0;
                                        this.D = 0;
                                        this.H = 4;
                                        this.bP = null;
                                        GameScreen.c.aV = false;
                                        this.Char();
                                    }
                                } else if (bv.LoginScreen(this.B - this.am - 1, this.C - this.f, 8)) {
                                    this.E = 0;
                                    this.D = 0;
                                    this.H = 4;
                                    this.bP = null;
                                    GameScreen.c.aV = false;
                                    this.Char();
                                }
                            }
                        }
                    }
                }
                this.ay();
                break block274;
            }
            this.ag();
            if (this.H != 1 && this.H != 6) break block274;
            var1_12 = false;
            if (this.bP == null) break; // GOTO lbl-1000
            if (Char.c(this.bP.LoginScreen - this.B) < 17 && Char.c(this.bP.b - this.C) < 25) {
                this.B = this.bP.LoginScreen;
                this.C = this.bP.b;
                this.bP = null;
                if ((bv.b(this.B, this.C) & 2) == 2) {
                    this.H = 1;
                    this.G = 0;
                    GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                    GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                } else {
                    this.H = 4;
                    this.E = 0;
                    this.F = 0;
                }
                var1_12 = true;
            } else if (this.eC != 10 && this.ImageCache != 8 || this.bF.size() <= 0) {
                if (this.C == this.bP.b) {
                    if (this.B != this.bP.LoginScreen) {
                        this.B = (this.B + this.bP.LoginScreen) / 2;
                        this.ImageCache = GameCanvas.w % 5 + 2;
                    }
                } else if (this.C < this.bP.b) {
                    this.ImageCache = 12;
                    this.B = (this.B + this.bP.LoginScreen) / 2;
                    if (this.E < 0) {
                        this.E = 0;
                    }
                    this.C += this.E;
                    if ((bv.b(this.B, this.C) & 2) == 2) {
                        GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                        GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                    }
                    ++this.E;
                    if (this.E > 16) {
                        this.C = (this.C + this.bP.b) / 2;
                    }
                } else {
                    this.ImageCache = 7;
                    this.B = (this.B + this.bP.LoginScreen) / 2;
                    this.C = (this.C + this.bP.b) / 2;
                }
            } else { }
            // 2 sources

            {
                var1_12 = true;
            }
            if (var1_12 && this.bF.size() > 0) {
                this.bP = (dm)this.bF.firstElement();
                this.bF.removeElementAt(0);
                if (this.bP.c == 2) {
                    if ((bv.b(this.B, this.C + 12) & 2) != 2) {
                        this.H = 10;
                        this.F = 0;
                        this.d = 0;
                        this.D = -(this.B - this.bP.LoginScreen) / 10;
                        this.E = -(this.C - this.bP.b) / 10;
                        if (this.B - this.bP.LoginScreen > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.LoginScreen < 0) {
                            this.I = 1;
                        }
                    } else {
                        this.H = 2;
                        if (this.B - this.bP.LoginScreen > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.LoginScreen < 0) {
                            this.I = 1;
                        }
                        this.D = this.O * this.I;
                        this.E = 0;
                    }
                } else if (this.bP.c == 3) {
                    if ((bv.b(this.B, this.C + 23) & 2) != 2) {
                        this.H = 10;
                        this.F = 0;
                        this.d = 0;
                        this.D = -(this.B - this.bP.LoginScreen) / 10;
                        this.E = -(this.C - this.bP.b) / 10;
                        if (this.B - this.bP.LoginScreen > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.LoginScreen < 0) {
                            this.I = 1;
                        }
                    } else {
                        this.H = 3;
                        GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                        GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                        if (this.B - this.bP.LoginScreen > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.LoginScreen < 0) {
                            this.I = 1;
                        }
                        this.D = Char.c(this.B - this.bP.LoginScreen) / 10 * this.I;
                        this.E = -10;
                    }
                } else if (this.bP.c == 4) {
                    this.H = 4;
                    if (this.B - this.bP.LoginScreen > 0) {
                        this.I = -1;
                    } else if (this.B - this.bP.LoginScreen < 0) {
                        this.I = 1;
                    }
                    this.D = Char.c(this.B - this.bP.LoginScreen) / 9 * this.I;
                    this.E = 0;
                } else {
                    this.B = this.bP.LoginScreen;
                    this.C = this.bP.b;
                    this.bP = null;
                }
            }
        }
        switch (this.H) {
            case 1: {
                this.am();
                break;
            }
            case 2: {
                this.ao();
                break;
            }
            case 3: {
                this.aq();
                break;
            }
            case 4: {
                this.ImageCache();
                break;
            }
            case 5: {
                this.ai();
                break;
            }
            case 16: {
                this.aj();
                break;
            }
            case 9: {
                this.al();
                break;
            }
            case 10: {
                this.at();
                break;
            }
            case 12: {
                this.ak();
                break;
            }
            case 13: {
                break;
            }
            case 14: {
                ++this.F;
                if (this.F > 30) {
                    this.F = 0;
                }
                if (this.F % 15 < 5) {
                    this.ImageCache = 0;
                    break;
                }
                this.ImageCache = 1;
                break;
            }
            case 6: {
                if (this.ek <= 0) {
                    this.ImageCache = 0;
                } else if (this.eC == 10) {
                    this.B += this.D;
                } else if (this.ImageCache <= 1) {
                    ++this.F;
                    this.ImageCache = this.F > 6 ? 0 : 1;
                    if (this.F > 10) {
                        this.F = 0;
                    }
                }
                if (this.ImageCache != 7 && this.ImageCache != 12 && (bv.b(this.B, this.C + 1) & 2) != 2) {
                    this.D = 0;
                    this.E = 0;
                    this.H = 4;
                    this.ImageCache = 7;
                }
                if (this.aq) break;
                ++this.G;
                if (this.G > 10) {
                    if ((bv.b(this.B, this.C + 1) & 2) != 2) {
                        this.C += 5;
                    } else {
                        this.ImageCache = 0;
                    }
                }
                if (this.G <= 50) break;
                this.G = 0;
                this.bP = null;
            }
        }
        if (this.ek > 0) {
            this.ImageCache = 23;
            this.ek = (byte)(this.ek - 1);
        }
        if (this.co != 0 || this.cp != 0) {
            this.LoginScreen(this.co, this.cp);
            this.co = 0;
            this.cp = 0;
        }
        if (this.aZ != null) {
            if (this.aZ[0] == 0) {
                this.aZ[0] = (short)(this.aZ[0] + 1);
                at.LoginScreen(60, this, 1);
            } else if (this.aZ[0] < 10) {
                this.aZ[0] = (short)(this.aZ[0] + 1);
            } else {
                this.B = this.aZ[1];
                this.C = this.aZ[2];
                this.aZ = null;
                at.LoginScreen(60, this, 1);
                if (this.aq) {
                    if ((bv.b(this.B, this.C) & 2) != 2) {
                        this.H = 4;
                        Char.e().b(GameScreen.u[38], 1);
                    } else {
                        GameService.LoginScreen().g();
                        Char.e().b(GameScreen.u[38], 0);
                    }
                }
            }
        }
        if (this.H != 10) {
            this.bS = 0;
        }
        if (this.bl) {
            this.ImageCache = 17;
            if (GameCanvas.w % 4 == 0) {
                at.LoginScreen(1, this.B, this.C + GameCanvas.ae, 1);
            }
            if (this.aq && (var1_13 = System.currentTimeMillis()) - this.bo >= 1000L) {
                ds.c("%= " + this.aC.k);
                this.bo = var1_13;
                this.U += this.V * (long)this.aC.k / 100L;
                this.T += this.W * (long)this.aC.k / 100L;
                if (this.U < this.V) {
                    GameScreen.LoginScreen("+" + this.V * (long)this.aC.k / 100L + " " + T.eX, this.B, this.C - this.al - 20, 0, -1, 9);
                }
                if (this.T < this.W) {
                    GameScreen.LoginScreen("+" + this.W * (long)this.aC.k / 100L + " " + T.eY, this.B, this.C - this.al - 20, 0, -2, 10);
                }
                GameService.LoginScreen().c((byte)2);
            }
        }
        if (this.bq) {
            if (this.aq) {
                Char.bH = true;
                this.H = 3;
                this.E = -8;
                if (this.C <= bv.d - 240) {
                    this.bq = false;
                    Char.bH = false;
                    this.H = 4;
                }
            } else {
                this.H = 3;
                this.E = -8;
                if (this.C <= bv.d - 240) {
                    this.E = 0;
                    this.bq = false;
                    this.E = 0;
                    this.H = 1;
                }
            }
        }
        this.au();
        this.aC();
        var1_14 = this;
        if (var1_14.bU == 934) {
            if (GameCanvas.b - var1_14.eT > 0L) {
                ++var1_14.eS;
                if (var1_14.eS > var1_14.eW.length - 1) {
                    var1_14.eS = 0;
                    var1_14.eT = GameCanvas.b + (long)ds.b(2000, 3500);
                    var1_14.eW = var1_14.eV;
                    if (ds.d(2) == 0) {
                        var1_14.eW = var1_14.eU;
                    }
                }
            } else {
                var1_14.eS = 0;
            }
        }
        this.aD();
    }

    private void ae() {
        if (this.ei != null) {
            int n2 = 0;
            while (n2 < this.ei.length) {
                if (this.ei[n2] != null) {
                    if (this.ei[n2].b != null) {
                        if (!this.ei[n2].e) {
                            int n3;
                            this.ei[n2].b.d();
                            this.ei[n2].b.Z = this;
                            if (this.aq) {
                                Char.e();
                                Char.e();
                                n3 = 11;
                                Random random = new Random();
                                random.nextInt(11);
                            }
                            n3 = this.ei[n2].b.w >> 1;
                            if (this.ei[n2].b.u()) {
                                n3 = this.ei[n2].b.m() + 20;
                            }
                            GameScreen.LoginScreen(this.ei[n2].b.m, this.ei[n2].b.n - n3, this.I);
                            this.ei[n2].e = true;
                        }
                    } else if (this.ei[n2].c != null && !this.ei[n2].e) {
                        if (this.ei[n2].c.J >= 0) {
                            this.ei[n2].c.K();
                        }
                        GameScreen.LoginScreen(this.ei[n2].c.B, this.ei[n2].c.C - (this.ei[n2].c.al >> 1), this.I);
                        this.ei[n2].e = true;
                    }
                    ++this.ei[n2].LoginScreen;
                    if (this.ei[n2].LoginScreen >= this.ei[n2].d.LoginScreen.length) {
                        this.ei[n2] = null;
                    }
                }
                ++n2;
            }
        }
        if (this.bZ >= 0 && this.ca != null && GameCanvas.w % 2 == 0) {
            ++this.bZ;
            if (this.bZ >= this.ca.LoginScreen.length) {
                this.bZ = -1;
                this.ca = null;
            }
        }
    }

    private void Char() {
        if (this.ay != null) {
            de de2 = this.ay;
            this.ay = null;
            de2.LoginScreen();
        }
    }

    private void ag() {
        if (GameCanvas.w % 20 == 0 && this.J >= 0) {
            Char af2;
            this.i = true;
            int n2 = 0;
            while (n2 < GameScreen.D.size()) {
                af2 = null;
                try {
                    af2 = (Char)GameScreen.D.elementAt(n2);
                }
                catch (Exception exception) {}
                if (af2 != null && !af2.equals(this) && (af2.C == this.C && ds.g(af2.B - this.B) < 35 || this.C - af2.C < 32 && this.C - af2.C > 0 && ds.g(af2.B - this.B) < 24)) {
                    this.i = false;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < GameScreen.G.size()) {
                af2 = null;
                try {
                    af2 = (_do)GameScreen.G.elementAt(n2);
                }
                catch (Exception exception) {}
                if (af2 != null && af2.C == this.C && ds.g(af2.B - this.B) < 24) {
                    this.i = false;
                }
                ++n2;
            }
        }
    }

    private void ah() {
        f[] fArray;
        if (this.H == 14 || this.H == 5) {
            return;
        }
        if (this.cf != null && (this.aU != null && this.c(this.aU) && this.aU.H == 14 || this.aQ != null && this.aQ.GameScreen == 0)) {
            if (!this.aq) {
                this.H = (bv.b(this.B, this.C) & 2) == 2 ? 1 : 6;
                this.G = 0;
            }
            this.cb = 0;
            this.cf = null;
            this.cg = null;
            this.eh = null;
            this.eg = null;
            this.ef = null;
            this.dY = 0;
            this.dX = 0;
            this.dW = 0;
            this.aQ = null;
            this.aU = null;
            this.ei = null;
            this.bP = null;
            this.Npc = null;
            if ((bv.b(this.B, this.C) & 2) != 2) {
                this.bQ = 5;
            }
        }
        if (this.cf != null && this.Npc == null && this.D() != null && this.cb >= this.D().length) {
            if (!this.aq) {
                this.H = (bv.b(this.B, this.C) & 2) == 2 ? 1 : 6;
                this.G = 0;
            }
            this.cb = 0;
            this.cf = null;
            this.cg = null;
            this.eh = null;
            this.eg = null;
            this.ef = null;
            this.dY = 0;
            this.dX = 0;
            this.dW = 0;
            this.Npc = null;
            if ((bv.b(this.B, this.C) & 2) != 2) {
                this.bQ = 5;
            }
        }
        if ((fArray = this.D()) != null && this.cb >= 0 && this.cb <= fArray.length - 1) {
            if (fArray[this.cb].b != 0) {
                this.ef = GameScreen.Message[fArray[this.cb].b - 1];
                this.ec = 0;
                this.dZ = 0;
                this.dW = 0;
            }
            if (fArray[this.cb].e != 0) {
                this.eg = GameScreen.Message[fArray[this.cb].e - 1];
                this.WeatherEffect = 0;
                this.ea = 0;
                this.dX = 0;
            }
            if (fArray[this.cb].Item != 0) {
                this.eh = GameScreen.Message[fArray[this.cb].Item - 1];
                this.ee = 0;
                this.eb = 0;
                this.dY = 0;
            }
            f[] fArray2 = fArray;
            int n2 = this.cb;
            if (fArray2 != null && fArray2[n2] != null && n2 >= 0 && n2 <= fArray2.length - 1 && fArray2[n2].k != 0) {
                int n3 = fArray2[n2].k;
                if (n3 >= 100) {
                    bq bq2 = this.aQ == null ? this.aU : this.aQ;
                    if (bq2 != null) {
                        int n4;
                        int n5 = ds.g(bq2.Res() - this.B);
                        if (n5 > (n4 = ds.g(bq2.m() - this.C)) * 4) {
                            n5 = 0;
                        } else {
                            n5 = bq2.m() < this.C ? -3 : 3;
                            if (bq2 instanceof Npc) {
                                bq2 = (Npc)bq2;
                                if (((Npc)bq2).b) {
                                    n5 = -20;
                                }
                            }
                        }
                        this.cd = new bj(this, n3 - 100, this.cg, this.B + (fArray2[n2].Res - 10) * this.I, this.C + fArray2[n2].m + n5);
                        if (this.aC != null) {
                            if (this.aC.LoginScreen.LoginScreen == 1) {
                                bu.LoginScreen();
                            } else if (this.aC.LoginScreen.LoginScreen == 3) {
                                bu.LoginScreen();
                            } else if (this.aC.LoginScreen.LoginScreen == 5) {
                                bu.LoginScreen();
                            } else if (this.aC.LoginScreen.LoginScreen == 11) {
                                bu.LoginScreen();
                            }
                        }
                    } else if (this.ci || this.ch) {
                        this.C();
                    }
                } else {
                    this.Npc = new dq(this, GameScreen.v[n3 - 1]);
                    this.Npc.LoginScreen = 10;
                    this.Npc.b = this.B + fArray2[n2].Res;
                    this.Npc.c = this.C + fArray2[n2].m;
                }
            }
            if ((this.aQ != null || !this.aq && this.aU != null || this.aq && this.aU != null && (this.c(this.aU) || this.Message()) && this.Npc == null && this.cd == null) && this.cb == fArray.length - 1) {
                this.E();
            }
            if (!this.aq) {
                bq bq3 = null;
                if (this.aQ != null) {
                    bq3 = this.aQ;
                } else if (this.aU != null) {
                    bq3 = this.aU;
                }
                if (bq3 != null) {
                    if (ds.g(bq3.Res() - this.B) < 10) {
                        this.B = bq3.Res() > this.B ? (this.B -= 10) : (this.B += 10);
                    }
                    if (bq3.Res() > this.B) {
                        this.I = 1;
                        return;
                    }
                    this.I = -1;
                }
            }
        }
    }

    public final void methodLoginScreen(int n2, int n3) {
        bp.c();
        ds.c("REST POINT x= " + n2 + " Message= " + n3);
        this.bP = null;
        int n4 = this.C - n3;
        if (n4 == 0) {
            this.B = n2;
            bG = false;
            bH = false;
            return;
        }
        this.H = 16;
        this.d = n2;
        this.G = n3;
        this.F = 0;
        Char.e().bD = n2;
        Char.e().bE = n3;
    }

    private void ai() {
        this.bk = false;
        if (this.bl) {
            this.bl = false;
            bu.LoginScreen();
            GameService.LoginScreen().c((byte)3);
        }
        ++this.F;
        this.B += (this.d - this.B) / 4;
        this.C = this.F > 7 ? (this.C += (this.G - this.C) / 4) : (this.C += this.F - 10);
        if (ds.g(this.d - this.B) < 4 && ds.g(this.G - this.C) < 10) {
            this.B = this.d;
            this.C = this.G;
            this.H = 14;
            if (this.aq) {
                GameScreen.j().n();
                GameService.LoginScreen().g();
            }
        }
        this.ImageCache = 23;
    }

    private void aj() {
        bp.c();
        GameCanvas.Res();
        this.bP = null;
        ++this.F;
        this.B += (this.d - this.B) / 4;
        this.C = this.F > 7 ? (this.C += (this.G - this.C) / 4) : (this.C += this.F - 10);
        if (ds.g(this.d - this.B) < 4 && ds.g(this.G - this.C) < 10) {
            this.B = this.d;
            this.C = this.G;
            this.H = 1;
            this.G = 0;
            bG = false;
            GameService.LoginScreen().g();
        }
        this.ImageCache = 23;
    }

    private void ak() {
        this.dP = 0;
        ++this.F;
        if (this.I == 1) {
            if ((bv.b(this.B + this.am, this.C - this.f) & 4) == 4) {
                this.D = 0;
            }
        } else if ((bv.b(this.B - this.am, this.C - this.f) & 8) == 8) {
            this.D = 0;
        }
        if (this.C > this.al && bv.LoginScreen(this.B, this.C - this.al + 24, 8192)) {
            if (!bv.LoginScreen(this.B, this.C, 2)) {
                this.H = 4;
                this.F = 0;
                this.d = 0;
                this.E = 1;
            } else {
                this.C = bv.e(this.C);
            }
        }
        this.B += this.D;
        this.C += this.E;
        if (this.C < 0) {
            this.E = 0;
            this.C = 0;
        }
        if (this.E == 0) {
            if ((bv.b(this.B, this.C) & 2) != 2) {
                this.H = 4;
                this.D = (this.O >> 1) * this.I;
                this.d = 0;
                this.F = 0;
            }
        } else if (this.E < 0) {
            ++this.E;
            if (this.E == 0) {
                this.E = 1;
            }
        } else {
            if (this.E < 20 && this.F % 5 == 0) {
                ++this.E;
            }
            if (this.E > 3) {
                this.E = 3;
            }
            if ((bv.b(this.B, this.C + 3) & 2) == 2 && this.C <= bv.f(this.C + 3)) {
                this.E = 0;
                this.D = 0;
                this.C = bv.f(this.C + 3);
            }
        }
        if (this.D > 0) {
            --this.D;
            return;
        }
        if (this.D < 0) {
            ++this.D;
        }
    }

    private void al() {
        this.bk = false;
        if (this.bl) {
            this.bl = false;
            bu.LoginScreen();
            GameService.LoginScreen().c((byte)3);
        }
        this.B += this.D * this.I;
        this.C += this.dF;
        ++this.dF;
        this.ImageCache = this.F == 0 ? 7 : 23;
        if (this.dF == -3) {
            this.ImageCache = 8;
        } else if (this.dF == -2) {
            this.ImageCache = 9;
        } else if (this.dF == -1) {
            this.ImageCache = 10;
        } else if (this.dF == 0) {
            this.ImageCache = 11;
        }
        if (this.dF == 0) {
            this.H = 6;
            this.G = 0;
            ((dm)this.bF.firstElement()).c = 4;
            this.F = 0;
            this.E = 1;
        }
    }

    public void k() {
        this.bR = true;
        ei.LoginScreen(new ea(107, this.B, this.C + 25, 3, 15, 1));
    }

    public final void r() {
        this.bR = false;
        ei.LoginScreen(new ea(107, this.B, this.C + 25, 3, 10, 1));
    }

    private void am() {
        this.ar = false;
        this.g = false;
        this.D = 0;
        this.E = 0;
        ++this.F;
        if (this.F > 30) {
            this.F = 0;
        }
        this.ImageCache = this.F % 15 < 5 ? 0 : 1;
        this.aA();
        if (!this.aq) {
            ++this.G;
            if (this.G > 50) {
                this.G = 0;
                this.bP = null;
            }
        }
        this.an();
        if (this.aq && GameScreen.D.size() != 0 && bv.Res == 50) {
            Char af2 = (Char)GameScreen.D.elementAt(0);
            if (!af2.dM) {
                if (af2.H != 2) {
                    af2.b(this.B - 45, this.C, 0);
                }
                System.currentTimeMillis();
                if (ds.g(this.B - 45 - af2.B) <= 10) {
                    af2.dM = true;
                }
            } else {
                if (af2.H != 2) {
                    af2.b(this.B + 45, this.C, 0);
                }
                System.currentTimeMillis();
                if (ds.g(this.B + 45 - af2.B) <= 10) {
                    af2.dM = false;
                }
            }
            if (GameCanvas.w % 100 == 0) {
                af2.LoginScreen("C\u1eafc c\u00f9m cum");
            }
        }
    }

    private void an() {
        if (this.cF || this.cL || this.eH || this.ev || this.ew || this.cE == 1) {
            return;
        }
        if (this.aq && !cX && this.cV >= 0 || !this.aq && this.cV >= 0) {
            return;
        }
        ++this.dP;
        if (this.Q < 9 || this.Q >= 14) {
            return;
        }
        if (!(this.dP != 40 && this.dP != 50 || GameCanvas.isLowGraphic)) {
            GameCanvas.isLowGraphic().LoginScreen(-1, this.B + 8, this.C);
            GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
            this.e(1);
        }
        if (this.dP <= 50) {
            return;
        }
        switch (this.K) {
            case 0: {
                if (GameCanvas.w % 25 == 0) {
                    at.LoginScreen(114, this, 1);
                }
                if (this.Q < 13 || GameCanvas.w % 4 != 0) break;
                at.LoginScreen(132, this, 1);
                return;
            }
            case 1: {
                if (GameCanvas.w % 4 == 0) {
                    at.LoginScreen(132, this, 1);
                }
                if (this.Q >= 13 && GameCanvas.w % 12 == 0) {
                    at.LoginScreen(114, this, 1);
                }
                if (this.Q < 13 || GameCanvas.w % 25 != 0) break;
                at.LoginScreen(131, this, 1);
                return;
            }
            case 2: {
                if (GameCanvas.w % 4 == 0) {
                    at.LoginScreen(131, this, 1);
                }
                if (this.Q < 13 || GameCanvas.w % 25 != 0) break;
                at.LoginScreen(114, this, 1);
            }
        }
    }

    private void ao() {
        int n2;
        if (this.B >= GameScreen.j && this.B <= GameScreen.j + GameCanvas.A) {
            if (this.cE == 0) {
                bu.LoginScreen();
            } else {
                bu.LoginScreen();
            }
        }
        this.dP = 0;
        this.bk = false;
        if (this.bl) {
            this.bl = false;
            bu.LoginScreen();
            GameService.LoginScreen().c((byte)3);
        }
        int n3 = 0;
        if (!this.aq && this.bP != null) {
            n3 = Char.c(this.B - this.bP.LoginScreen);
        }
        ++this.F;
        if (this.F >= 10) {
            this.F = 0;
            this.N = 0;
        }
        this.ImageCache = (this.F >> 1) + 2;
        this.B = (bv.b(this.B, this.C - 1) & 0x40) == 64 ? (this.B += this.D >> 1) : (this.B += this.D);
        if (this.I == 1) {
            if (bv.LoginScreen(this.B + this.am, this.C - this.f, 4)) {
                if (this.aq) {
                    this.D = 0;
                    this.B = bv.f(this.B + this.am) - this.am;
                } else {
                    this.ap();
                }
            }
        } else if (bv.LoginScreen(this.B - this.am - 1, this.C - this.f, 8)) {
            if (this.aq) {
                this.D = 0;
                this.B = bv.f(this.B - this.am - 1) + bv.i + this.am;
            } else {
                this.ap();
            }
        }
        if (this.aq) {
            if (this.D > 0) {
                --this.D;
            } else if (this.D < 0) {
                ++this.D;
            } else {
                if (this.B - this.bD != 0 && this.aq) {
                    GameService.LoginScreen().g();
                }
                this.H = 1;
                this.N = 0;
            }
        }
        if ((bv.b(this.B, this.C) & 2) != 2) {
            if (this.aq) {
                if (this.B - this.bD != 0 || this.C - this.bE != 0) {
                    GameService.LoginScreen().g();
                }
                this.ImageCache = 7;
                this.H = 4;
                this.bQ = 0;
                this.D = 3 * this.I;
                this.d = 0;
            } else {
                this.ap();
            }
        }
        if (!this.aq && this.bP != null && (n2 = Char.c(this.B - this.bP.LoginScreen)) > n3) {
            this.ap();
        }
        GameCanvas.isLowGraphic().LoginScreen(this.I, this.B - (this.I << 3), this.C);
        this.aA();
        this.e(2);
    }

    private void ap() {
        this.H = 6;
        this.G = 0;
        this.D = 0;
        this.E = 0;
        this.d = 0;
        this.F = 0;
    }

    private static int c(int n2) {
        if (n2 > 0) {
            return n2;
        }
        return -n2;
    }

    private void aq() {
        block23: {
            int n2;
            block25: {
                block24: {
                    this.T();
                    this.e(3);
                    this.dP = 0;
                    this.bk = false;
                    if (this.bl) {
                        this.bl = false;
                        bu.LoginScreen();
                        GameService.LoginScreen().c((byte)3);
                    }
                    this.B += this.D;
                    this.C += this.E;
                    if (this.C < 0) {
                        this.C = 0;
                        this.E = -1;
                    }
                    ++this.E;
                    if (this.E > 0) {
                        this.E = 0;
                    }
                    if (this.aq || this.bP == null) break block23;
                    n2 = this.bP.LoginScreen - this.B;
                    if (n2 <= 0) break block24;
                    if (this.D > n2) {
                        this.D = n2;
                    }
                    if (this.D >= 0) break block23;
                    break block25;
                }
                if (n2 >= 0) break block25;
                if (this.D < n2) {
                    this.D = n2;
                }
                if (this.D <= 0) break block23;
            }
            this.D = n2;
        }
        if (this.I == 1) {
            if ((bv.b(this.B + this.am, this.C - 1) & 4) == 4 && this.B <= bv.f(this.B + this.am) + 12) {
                this.B = bv.f(this.B + this.am) - this.am;
                this.D = 0;
            }
        } else if ((bv.b(this.B - this.am, this.C - 1) & 8) == 8 && this.B >= bv.f(this.B - this.am) + 12) {
            this.B = bv.f(this.B + 24 - this.am) + this.am;
            this.D = 0;
        }
        if (this.E == 0) {
            if (this.aq) {
                this.ar();
            } else {
                this.ap();
            }
        }
        if (this.aq && !bG && this.MessageHandler()) {
            GameService.LoginScreen().g();
            if (bv.b()) {
                bG = true;
                GameService.LoginScreen().q();
            } else {
                GameService.LoginScreen().f();
            }
            bH = true;
            bG = true;
            GameCanvas.resetKeys();
            GameCanvas.clearKeyHold();
            bp.LoginScreen();
            return;
        }
        if (this.H != 16 && (bv.LoginScreen(this.B, this.C - this.al + 24, 8192) || this.C < 0)) {
            this.H = 4;
            this.F = 0;
            this.d = 0;
            this.E = 1;
            this.bQ = 0;
            if (this.C < 0) {
                this.C = 0;
            }
            this.C = bv.e(this.C + 25);
            GameCanvas.resetKeys();
        }
        if (this.G < 0) {
            ++this.G;
        }
        this.ImageCache = 7;
        if (!this.aq && this.bP != null && this.C < this.bP.b) {
            this.ap();
        }
    }

    private void ar() {
        this.e = this.C;
        this.F = 0;
        this.d = 0;
        this.H = 10;
        this.D = this.I << 2;
        this.E = 0;
        this.C = bv.e(this.C) + 12;
        if (!(!this.aq || this.B - this.bD == 0 && this.C - this.bE == 0 || ds.g(Char.e().B - Char.e().bD) <= 96 && ds.g(Char.e().C - Char.e().bE) <= 24)) {
            GameService.LoginScreen().g();
        }
    }

    private void ImageCache() {
        block31: {
            int n2;
            block33: {
                block32: {
                    if (this.cJ) {
                        return;
                    }
                    this.dP = 0;
                    if (this.C + 4 >= bv.d) {
                        this.H = 1;
                        if (this.aq) {
                            bu.LoginScreen();
                        }
                        this.E = 0;
                        this.D = 0;
                        this.G = 0;
                        return;
                    }
                    if (this.C % 24 == 0 && (bv.b(this.B, this.C) & 2) == 2) {
                        this.bQ = 0;
                        if (this.aq) {
                            if (this.C - this.bE > 0 || this.B - this.bD != 0 || this.C - this.bE < 0) {
                                GameService.LoginScreen().g();
                            }
                            this.E = 0;
                            this.D = 0;
                            this.d = 0;
                            this.F = 0;
                            this.H = 1;
                            this.G = 0;
                            return;
                        }
                        this.ap();
                        this.ImageCache = 0;
                        GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                        GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                        this.e(1);
                    }
                    if (this.bQ > 0) {
                        --this.bQ;
                        if (this.bQ % 10 > 5) {
                            ++this.C;
                            return;
                        }
                        --this.C;
                        return;
                    }
                    this.ImageCache = this.E < -4 ? 7 : 12;
                    this.B += this.D;
                    if (this.aq || this.bP == null) break block31;
                    n2 = this.bP.LoginScreen - this.B;
                    if (n2 <= 0) break block32;
                    if (this.D > n2) {
                        this.D = n2;
                    }
                    if (this.D >= 0) break block31;
                    break block33;
                }
                if (n2 >= 0) break block33;
                if (this.D < n2) {
                    this.D = n2;
                }
                if (this.D <= 0) break block31;
            }
            this.D = n2;
        }
        ++this.E;
        if (this.E > 8) {
            this.E = 8;
        }
        if (this.cg == null) {
            this.C += this.E;
        }
        if (this.I == 1) {
            if ((bv.b(this.B + this.am, this.C - 1) & 4) == 4 && this.B <= bv.f(this.B + this.am) + 12) {
                this.B = bv.f(this.B + this.am) - this.am;
                this.D = 0;
            }
        } else if ((bv.b(this.B - this.am, this.C - 1) & 8) == 8 && this.B >= bv.f(this.B - this.am) + 12) {
            this.B = bv.f(this.B + 24 - this.am) + this.am;
            this.D = 0;
        }
        if (this.E > 3 && (this.e == 0 || this.e <= bv.e(this.C + 3)) && (bv.b(this.B, this.C + 3) & 2) == 2) {
            if (this.aq) {
                this.e = 0;
                this.E = 0;
                this.D = 0;
                this.d = 0;
                this.F = 0;
                this.C = bv.f(this.C + 3);
                this.H = 1;
                if (this.aq) {
                    bu.LoginScreen();
                }
                this.G = 0;
                GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                this.e(1);
                if (this.C - this.bE > 0) {
                    if (this.aq) {
                        GameService.LoginScreen().g();
                        return;
                    }
                } else if ((this.B - this.bD != 0 || this.C - this.bE < 0) && this.aq) {
                    GameService.LoginScreen().g();
                    return;
                }
            } else {
                this.ap();
                this.C = bv.f(this.C + 3);
                this.ImageCache = 0;
                GameCanvas.isLowGraphic().LoginScreen(-1, this.B - -8, this.C);
                GameCanvas.isLowGraphic().LoginScreen(1, this.B - 8, this.C);
                this.e(1);
                this.bP = null;
            }
            return;
        }
        this.ImageCache = 12;
        if (!this.aq) {
            if ((bv.b(this.B, this.C + 1) & 2) == 2) {
                this.ImageCache = 0;
            }
            if (this.bP != null && this.C > this.bP.b) {
                this.ap();
                this.C = bv.f(this.C + 3);
                this.bP = null;
            }
        }
    }

    private void at() {
        boolean bl2;
        int n2;
        int n3;
        int n4;
        int n5;
        block40: {
            n5 = this.cE == 1 && !this.aq ? 2 : 1;
            this.T();
            if (this.H != 16 && (bv.LoginScreen(this.B, this.C - this.al + 24, 8192) || this.C < 0)) {
                if (this.C - this.al < 0) {
                    this.C = this.al;
                }
                this.ImageCache = 7;
                this.H = 4;
                this.D = 0;
                this.d = 0;
                this.bP = null;
                return;
            }
            n4 = this.C;
            n3 = this.bU;
            if (da.length > 0) {
                n2 = 0;
                while (n2 < da.length) {
                    if (da[n2] == n3) {
                        bl2 = true;
                        break block40;
                    }
                    ++n2;
                }
            }
            bl2 = false;
        }
        if (bl2) {
            if (GameCanvas.w % 3 == 0) {
                ++this.F;
            }
            if (this.F > 4) {
                this.F = 0;
            }
            this.ImageCache = this.F + 2;
        } else {
            ++this.F;
            if (this.F >= 9) {
                this.F = 0;
                if (!this.aq) {
                    this.E = 0;
                    this.D = 0;
                }
                this.N = 0;
            }
            this.ImageCache = 8;
            if (ds.g(this.D) <= 4 && this.aq) {
                if (this.bP != null) {
                    n3 = Char.c(this.B - this.bP.LoginScreen);
                    this.ImageCache = n3 > (n2 = Char.c(this.C - this.bP.b)) * 10 ? 8 : (n3 > n2 && n3 > 48 && n2 > 32 ? 8 : 7);
                } else {
                    if (this.E < 0) {
                        this.E = 0;
                    }
                    if (this.E > 16) {
                        this.E = 16;
                    }
                    this.ImageCache = 7;
                }
            }
            if (!this.aq) {
                if (Char.c(this.D) < 2) {
                    this.D = (this.I << 1) * n5;
                }
                if (this.E != 0) {
                    this.ImageCache = 7;
                }
                if (Char.c(this.D) <= 2) {
                    ++this.d;
                    if (this.d > 32) {
                        this.H = 4;
                        this.D = 0;
                        this.E = 0;
                    }
                }
            }
        }
        if (this.I == 1) {
            if (bv.LoginScreen(this.B + this.am, this.C - 1, 4)) {
                this.D = 0;
                this.B = bv.f(this.B + this.am) - this.am;
                if (this.E == 0) {
                    this.bP = null;
                }
            }
        } else if (bv.LoginScreen(this.B - this.am - 1, this.C - 1, 8)) {
            this.D = 0;
            this.B = bv.f(this.B - this.am - 1) + bv.i + this.am;
            if (this.E == 0) {
                this.bP = null;
            }
        }
        this.B += this.D * n5;
        this.C += this.E * n5;
        if (!this.dB && (n3 = n4 - this.C) == 0) {
            ++this.dP;
            ++this.dO;
            this.bS += !this.dN ? 1 : -1;
            if (this.dO == 10) {
                this.dO = 0;
                boolean bl3 = this.dN = !this.dN;
            }
            if (this.dP > 20) {
                this.bQ = 10;
                if (GameCanvas.w % 3 == 0) {
                    at.LoginScreen(111, this.B + (this.I == 1 ? -17 : 27), this.C + this.bS + 13, 1, this.I != 1 ? 2 : 0);
                }
            }
        }
        if (this.aq) {
            if (this.D > 0) {
                --this.D;
            } else if (this.D < 0) {
                ++this.D;
            } else if (this.E == 0) {
                this.H = 4;
                this.ax();
                GameService.LoginScreen().g();
            }
            if ((bv.b(this.B, this.C + 20) & 2) == 2 || (bv.b(this.B, this.C + 40) & 2) == 2) {
                if (this.E == 0) {
                    this.bQ = 0;
                }
                this.e = 0;
                this.E = 0;
                this.D = 0;
                this.d = 0;
                this.F = 0;
                this.H = 4;
                this.e(3);
            }
            if (Char.c(this.B - this.bD) > 96 || Char.c(this.C - this.bE) > 24) {
                GameService.LoginScreen().g();
            }
        }
    }

    private void au() {
        ++this.dp;
        if (this.dp > this.cfr_renamed_0.length - 1) {
            this.dp = 0;
        }
        ++this.dq;
        if (this.dq > 1000) {
            this.dq = 0;
        }
        if (this.dA && !this.dB) {
            this.du = this.C;
            if (this.dr == 0) {
                if (this.dt - this.B >= this.dz) {
                    this.dt -= this.dz;
                    return;
                }
                this.dt = this.B;
                this.dB = true;
                this.dC = false;
                return;
            }
            if (this.dr == 2) {
                if (this.B - this.dt >= this.dz) {
                    this.dt += this.dz;
                    return;
                }
                this.dt = this.B;
                this.dB = true;
                this.dC = false;
                return;
            }
        } else {
            if (this.dB) {
                if (this.H == 14 || this.cm - this.C < 24) {
                    Char af2 = this;
                    if (af2.cm - af2.C < 24 && !af2.dC) {
                        af2.dA = false;
                        af2.dB = false;
                        af2.dC = true;
                        af2.dy = 0;
                    }
                }
                this.ImageCache = this.F % 15 < 5 ? 0 : 1;
                this.dr = this.I;
                this.an();
                if (this.dr < 0) {
                    this.dr = 0;
                    this.dv = -19;
                } else if (this.dr == 1) {
                    this.dr = 2;
                    this.dv = -31;
                    if (this.bw) {
                        this.dv = -38;
                    }
                }
                this.dw = this.D() != null ? -15 : -17;
                this.du = this.C;
                this.dt = this.B;
                return;
            }
            if (this.dC) {
                if (this.dr == 0) {
                    if (this.dt > GameScreen.j - 100) {
                        this.dt -= 20;
                        return;
                    }
                    this.dA = false;
                    this.dB = false;
                    this.dC = false;
                    return;
                }
                if (this.dr == 2) {
                    if (this.dt < GameScreen.j + GameCanvas.A + 50) {
                        this.dt += 20;
                        return;
                    }
                    this.dA = false;
                    this.dB = false;
                    this.dC = false;
                    return;
                }
            } else if (!(this.dA && this.dB && this.dC)) {
                this.dt = GameScreen.j - 100;
                this.du = GameScreen.k - 100;
            }
        }
    }

    private static void RMS() {
        if (Mob.c[50].f == null) {
            Mob.c[50].f = new ck();
            String string = "/Mob/50";
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            if (inputStream != null) {
                Mob.c[50].f.LoginScreen(String.valueOf(string) + "/data");
                Mob.c[50].f.LoginScreen = Res.loadImage(String.valueOf(string) + "/img.png");
            } else {
                GameService.LoginScreen().Item(50);
            }
            Mob.K.addElement("50");
        }
    }

    public void methodLoginScreen(int[] nArray) {
        ++this.dQ;
        if (this.dQ > nArray.length - 1) {
            this.dQ = 0;
        }
        this.dR = nArray[this.dQ];
    }

    public final void b(mGraphics en2) {
        if (this.dt > GameScreen.j && this.dt < GameScreen.j + GameCanvas.A) {
            if (this.aq) {
                if (this.dC || this.dA || this.dB) {
                    if (this.GameService >= ServerListScreen) {
                        Object object = String.valueOf(this.dT) + (this.GameService - ServerListScreen) + "_1";
                        if ((object = Res.currentTimeMillis((String)object)) != null) {
                            ((df)object).LoginScreen(this.dq / 2 % ((df)object).c, this.dt, this.du + this.bS, this.dr, 3, en2);
                        }
                        return;
                    }
                    if (this.bx) {
                        this.LoginScreen(this.dS);
                        if (Mob.c[50] != null && Mob.c[50].f != null) {
                            Mob.c[50].f.LoginScreen(en2, this.dR, this.dt + (this.I == 1 ? -8 : 8), this.du + 35, this.I == 1 ? 0 : 1, 0);
                            return;
                        }
                        Char.RMS();
                        return;
                    }
                    if (this.bw) {
                        en2.LoginScreen(dm, 0, this.cfr_renamed_0[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.ds == 0) {
                        if (!this.bv) {
                            en2.LoginScreen(n, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.LoginScreen(mFont, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.ds == 1) {
                        if (!this.bv) {
                            en2.LoginScreen(BaseCanvas, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.LoginScreen(dk, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                }
            } else if (!this.aq) {
                if (this.GameService >= ServerListScreen) {
                    Object object = String.valueOf(this.dT) + (this.GameService - ServerListScreen) + "_1";
                    if ((object = Res.currentTimeMillis((String)object)) != null) {
                        ((df)object).LoginScreen(this.dq / 2 % ((df)object).c, this.dt, this.du + this.bS, this.dr, 3, en2);
                    }
                    return;
                }
                if (this.bx) {
                    this.LoginScreen(this.dS);
                    if (Mob.c[50] != null && Mob.c[50].f != null) {
                        Mob.c[50].f.LoginScreen(en2, this.dR, this.dt + (this.I == 1 ? -8 : 8), this.du + 35, this.I == 1 ? 0 : 1, 0);
                        return;
                    }
                    Char.RMS();
                    return;
                }
                if (this.bw) {
                    en2.LoginScreen(dm, 0, this.cfr_renamed_0[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                    return;
                }
                if (this.dB) {
                    if (this.ds == 0) {
                        if (!this.bv) {
                            en2.LoginScreen(n, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.LoginScreen(mFont, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.ds == 1) {
                        if (!this.bv) {
                            en2.LoginScreen(BaseCanvas, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.LoginScreen(dk, 0, this.cfr_renamed_0[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                    }
                }
            }
        }
    }

    private void T() {
        int n2;
        int n3;
        Char af2;
        if (this.aq) {
            af2 = this;
            n3 = 0;
            n2 = -1;
            Item[] hArray = af2.aH;
            int n4 = 0;
            while (n4 < hArray.length) {
                if (hArray[n4] != null && (hArray[n4].b.b == 24 || hArray[n4].b.b == 23)) {
                    n2 = hArray[n4].b.g >= 0 ? (int)((short)(ServerListScreen + hArray[n4].b.g)) : (int)hArray[n4].b.LoginScreen;
                    n3 = 1;
                    break;
                }
                ++n4;
            }
            af2.bv = false;
            af2.bx = false;
            af2.bw = false;
            af2.GameService = (short)-1;
            if (n2 == 349 || n2 == 350 || n2 == 351) {
                af2.bv = true;
            } else if (n2 == 396) {
                af2.bw = true;
            } else if (n2 == 532) {
                af2.bx = true;
            } else if (n2 >= ServerListScreen) {
                af2.GameService = (short)n2;
            }
            this.bu = n3;
            if (bv.LoginScreen()) {
                this.bu = false;
            }
        }
        if (this.bu) {
            if (this.cm - this.C <= 20) {
                this.dx = this.B;
            }
            if (this.dy < 100) {
                this.dy = ds.g(this.dx - this.B);
            }
            if (this.dy >= 70 && this.cm - this.C > 30 && !this.dA && !this.dC) {
                int n5 = this.K;
                n2 = this.I;
                n3 = this.J;
                af2 = this;
                this.dr = n2;
                af2.ds = n5;
                af2.dz = 30;
                if (af2.dr < 0) {
                    af2.dr = 0;
                    af2.dt = GameScreen.j + GameCanvas.A + 50;
                    af2.dv = -19;
                } else if (af2.dr == 1) {
                    af2.dr = 2;
                    af2.dt = GameScreen.j - 100;
                    af2.dv = -33;
                }
                af2.dw = -17;
                af2.du = af2.C;
                af2.dp = 0;
                af2.dq = 0;
                af2.dB = false;
                af2.dC = false;
                this.dA = true;
            }
        }
    }

    private void ax() {
        boolean bl2 = true;
        int n2 = 0;
        while (n2 < 150) {
            if ((bv.b(this.B, this.C + n2) & 2) == 2 || this.C + n2 > bv.b * bv.i - 24) {
                bl2 = false;
                break;
            }
            n2 += 24;
        }
        if (bl2) {
            this.bQ = 40;
        }
    }

    public final void SessionReceiver() {
        this.MyHashtable();
        this.u();
        this.v();
    }

    public final void MyHashtable() {
        if (this.K == 0) {
            this.bY = 0;
        }
    }

    public final void u() {
        if (this.K == 0) {
            this.bW = 57;
            return;
        }
        if (this.K == 1) {
            this.bW = 59;
            return;
        }
        if (this.K == 2) {
            this.bW = 57;
        }
    }

    public final void v() {
        if (this.K == 0) {
            this.bV = 58;
            return;
        }
        if (this.K == 1) {
            this.bV = 60;
            return;
        }
        if (this.K == 2) {
            this.bV = 58;
        }
    }

    public final boolean w() {
        return this.aC != null && this.aC.LoginScreen.b();
    }

    public final boolean x() {
        return this.aC != null && this.aC.LoginScreen.c();
    }

    public final boolean Message() {
        return this.aC != null && this.aC.LoginScreen.LoginScreen();
    }

    public final boolean z() {
        return !this.ch && this.aC != null && (this.aC.LoginScreen.LoginScreen == 10 || this.aC.LoginScreen.LoginScreen == 11);
    }

    public final void methodLoginScreen(ci ci2, int n2) {
        this.mGraphics = false;
        if (this.cR) {
            return;
        }
        if (this.aq && this.aC.LoginScreen.LoginScreen == 9 && this.U <= this.V / 10L) {
            return;
        }
        if (this.aq) {
            if (this.aQ == null && this.aU == null) {
                this.C();
            }
            if (this.aQ != null && (this.aQ.GameScreen == 1 || this.aQ.GameScreen == 0)) {
                this.C();
            }
            if (this.aU != null && (this.aU.H == 14 || this.aU.H == 5)) {
                this.C();
            }
            if (this.aC.LoginScreen.LoginScreen == 23) {
                if (this.aU != null && this.aU.cI != 0) {
                    return;
                }
                if (this.aQ != null && this.aQ.j != 0) {
                    return;
                }
                if (this.cI != 0) {
                    return;
                }
            }
            if (this.cQ || this.cO) {
                return;
            }
        }
        if (this.aq && this.cd != null) {
            return;
        }
        if (bv.d()) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.aq) {
            if (this.Message() && this.aU == null) {
                return;
            }
            if (l2 - this.aC.f < (long)this.aC.e) {
                this.aC.j = true;
                return;
            }
            this.aC.f = l2;
            this.T = this.aC.LoginScreen.d == 2 ? 1L : (this.aC.LoginScreen.d != 1 ? (this.T -= (long)this.aC.i) : (this.T -= (long)this.aC.i * this.W / 100L));
            --Char.e().bf;
            GameScreen.j().bB = true;
            GameScreen.j().bA = 0L;
            if (this.T < 0L) {
                this.T = 0L;
            }
        }
        if (this.aq) {
            if (this.aC.LoginScreen.LoginScreen == 10) {
                GameService.LoginScreen().c((byte)4);
            }
            if (this.aC.LoginScreen.LoginScreen == 11) {
                GameService.LoginScreen().c((byte)4);
            }
            if (this.aC.LoginScreen.LoginScreen == 7) {
                bu.LoginScreen();
            }
            if (this.aC.LoginScreen.LoginScreen == 6) {
                GameService.LoginScreen().c((byte)0);
                GameScreen.j().ba = true;
                bu.LoginScreen();
            }
            if (this.aC.LoginScreen.LoginScreen == 8) {
                if (!this.bl) {
                    bu.LoginScreen();
                    GameService.LoginScreen().c((byte)1);
                    this.bl = true;
                    this.bo = this.m = System.currentTimeMillis();
                } else {
                    GameService.LoginScreen().c((byte)3);
                    this.bl = false;
                    bu.LoginScreen();
                }
            }
            if (this.aC.LoginScreen.LoginScreen == 13) {
                if (this.cE != 0) {
                    GameScreen.j().aX = 0;
                    return;
                }
                if (this.ItemMap) {
                    return;
                }
                bu.LoginScreen();
                GameService.LoginScreen().c((byte)6);
                this.SplashScreen = 0;
                this.cG = true;
                return;
            }
            if (this.aC.LoginScreen.LoginScreen == 14) {
                bu.LoginScreen();
                GameService.LoginScreen().c((byte)7);
                this.b(true);
            }
            if (this.aC.LoginScreen.LoginScreen == 21) {
                GameService.LoginScreen().c((byte)10);
                return;
            }
            if (this.aC.LoginScreen.LoginScreen == 12) {
                GameService.LoginScreen().c((byte)8);
            }
            if (this.aC.LoginScreen.LoginScreen == 19) {
                GameService.LoginScreen().c((byte)9);
                return;
            }
        }
        if (this.cE == 1 && ci2.LoginScreen >= 35 && ci2.LoginScreen <= 41) {
            ci2 = GameScreen.u[106];
        }
        if (ci2.LoginScreen >= 128 && ci2.LoginScreen <= 134) {
            ci2 = GameScreen.u[ci2.LoginScreen - 65];
            if (this.aU != null) {
                this.B = this.aU.B;
                this.C = this.aU.C;
                this.bP = null;
            }
            if (this.aQ != null) {
                this.B = this.aQ.m;
                this.C = this.aQ.n;
                this.bP = null;
            }
            at.LoginScreen(60, this.B, this.C, 1);
            this.cP = true;
        }
        if (ci2.LoginScreen >= 107 && ci2.LoginScreen <= 113) {
            ci2 = GameScreen.u[ci2.LoginScreen - 44];
            ei.LoginScreen(new ea(23, this.B, this.C + this.al / 2, 3, 2, 1));
        }
        this.b(ci2, n2);
    }

    public static void A() {
        GameScreen.j().aX = 0;
        Char.e().LoginScreen(GameScreen.u[Char.e().aC.b], bv.LoginScreen(Char.e().B, Char.e().C, 2) ? 0 : 1);
    }

    public final void B() {
        if (this.aq && (this.bk || this.MyHashtable)) {
            GameScreen.j().aX = 0;
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.aq && l2 - this.aC.f < (long)this.aC.e) {
            this.aC.j = true;
            return;
        }
        if (this.aC.LoginScreen.LoginScreen == 10) {
            this.b(false);
        }
        if (this.aC.LoginScreen.LoginScreen == 11) {
            this.b(true);
        }
    }

    public final void C() {
        this.ci = false;
        this.cj = false;
        this.ch = false;
        this.ItemMap = false;
        if (this.aq && this.H != 14 && this.H != 5) {
            this.bJ = false;
        }
        GameScreen.j().aX = 0;
    }

    public final void b(boolean bl2) {
        if (this.ItemMap) {
            return;
        }
        GameScreen.j().aX = 0;
        if (bl2) {
            if (!this.cj) {
                this.SplashScreen = 0;
                this.bm = 50000;
                this.MyVector = 0;
                this.bo = System.currentTimeMillis();
                if (this.aq) {
                    this.bJ = true;
                    if (this.K == 1) {
                        GameService.LoginScreen().c((byte)4);
                    }
                    if (bv.Res == 170 && this.K != 1) {
                        GameService.LoginScreen().c((byte)4);
                    }
                }
                if (this.K == 1) {
                    bu.LoginScreen();
                }
                if (bv.Res == 170 && this.K != 1) {
                    bu.LoginScreen();
                }
                this.cj = true;
                return;
            }
        } else if (!this.ci) {
            if (this.aq) {
                GameScreen.j().aX = 0;
                this.bJ = true;
                GameService.LoginScreen().c((byte)4);
            }
            this.ch = false;
            this.SplashScreen = 0;
            this.ci = true;
            this.MyVector = 0;
            this.bm = 50000;
        }
    }

    public final void b(ci ci2, int n2) {
        this.cf = ci2;
        if (ci2.LoginScreen >= 0 && ci2.LoginScreen <= 6) {
            int n3 = ds.b(0, ci2.LoginScreen + 4) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n3 > 6) {
                n3 = 6;
            }
            this.cg = GameScreen.u[n3];
        } else if (ci2.LoginScreen >= 14 && ci2.LoginScreen <= 20) {
            int n4 = ds.b(0, ci2.LoginScreen - 14 + 4) - 1;
            if (n4 < 0) {
                n4 = 0;
            }
            if (n4 > 6) {
                n4 = 6;
            }
            this.cg = GameScreen.u[n4 + 14];
        } else if (ci2.LoginScreen >= 28 && ci2.LoginScreen <= 34) {
            int n5 = ds.b(0, (this.cE == 1 ? 105 : ci2.LoginScreen) - (this.cE == 1 ? 105 : 28) + 4) - 1;
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 > 6) {
                n5 = 6;
            }
            if (this.cE == 1) {
                n5 = 0;
            }
            this.cg = GameScreen.u[n5 + (this.cE == 1 ? 105 : 28)];
        } else if (ci2.LoginScreen >= 63 && ci2.LoginScreen <= 69) {
            int n6 = ds.b(0, ci2.LoginScreen - 63 + 4) - 1;
            if (n6 < 0) {
                n6 = 0;
            }
            if (n6 > 6) {
                n6 = 6;
            }
            this.cg = GameScreen.u[n6 + 63];
        } else if (ci2.LoginScreen >= 107 && ci2.LoginScreen <= 109) {
            int n7 = ds.b(0, ci2.LoginScreen - 107 + 4) - 1;
            if (n7 < 0) {
                n7 = 0;
            }
            if (n7 > 6) {
                n7 = 6;
            }
            this.cg = GameScreen.u[n7 + 107];
        } else {
            this.cg = ci2;
        }
        this.ej = n2;
        this.cb = 0;
        this.ee = 0;
        this.WeatherEffect = 0;
        this.ec = 0;
        this.eb = 0;
        this.ea = 0;
        this.dZ = 0;
        this.dY = 0;
        this.dX = 0;
        this.dW = 0;
        this.ef = null;
        this.eg = null;
        this.eh = null;
        this.E = 0;
    }

    public final f[] D() {
        if (this.cf == null) {
            return null;
        }
        if (this.cg == null) {
            return null;
        }
        if (this.ej == 0) {
            return this.cg.c;
        }
        return this.cg.d;
    }

    public final void E() {
        if (this.aq) {
            ci ci2 = this.cg;
            if (this.cd != null) {
                ci2 = this.cd.LoginScreen;
            }
            if (ci2 != null) {
                MyVector el2 = new MyVector("vMob");
                MyVector el3 = new MyVector("vChar");
                if (this.aU != null) {
                    el3.addElement(this.aU);
                } else if (this.aQ != null) {
                    el2.addElement(this.aQ);
                }
                this.ei = new cu[el2.size() + el3.size()];
                int n2 = 0;
                while (n2 < el2.size()) {
                    this.ei[n2] = new cu();
                    this.ei[n2].d = GameScreen.Message[ci2.b - 1];
                    if (!this.w()) {
                        this.ei[n2].b = (Mob)el2.elementAt(n2);
                    }
                    ++n2;
                }
                n2 = 0;
                while (n2 < el3.size()) {
                    this.ei[n2 + el2.size()] = new cu();
                    this.ei[n2 + el2.size()].d = GameScreen.Message[ci2.b - 1];
                    this.ei[n2 + el2.size()].c = (Char)el3.elementAt(n2);
                    ++n2;
                }
                n2 = 0;
                if (this.aQ != null) {
                    n2 = 1;
                } else if (this.aU != null) {
                    n2 = 2;
                }
                if (el2.size() == 0 && el3.size() == 0) {
                    this.C();
                }
                if (this.aq && !this.w() && !this.mGraphics) {
                    GameService.LoginScreen().LoginScreen(el2, el3, n2);
                    this.mGraphics = true;
                    return;
                }
            }
        } else {
            ci ci3 = this.cg;
            if (this.cd != null) {
                ci3 = this.cd.LoginScreen;
            }
            if (ci3 != null) {
                if (this.aX != null) {
                    this.ei = new cu[this.aX.length];
                    int n3 = 0;
                    while (n3 < this.aX.length) {
                        this.ei[n3] = new cu();
                        this.ei[n3].d = GameScreen.Message[ci3.b - 1];
                        this.ei[n3].b = this.aX[n3];
                        ++n3;
                    }
                    this.aX = null;
                    return;
                }
                if (this.aY != null) {
                    this.ei = new cu[this.aY.length];
                    int n4 = 0;
                    while (n4 < this.aY.length) {
                        this.ei[n4] = new cu();
                        this.ei[n4].d = GameScreen.Message[ci3.b - 1];
                        this.ei[n4].c = this.aY[n4];
                        ++n4;
                    }
                    this.aY = null;
                }
            }
        }
    }

    public final boolean F() {
        if (this.B < GameScreen.j) {
            return true;
        }
        return this.B > GameScreen.j + GameScreen.d;
    }

    public final boolean G() {
        if (this.C < GameScreen.k) {
            return false;
        }
        if (this.C > GameScreen.k + GameScreen.e + 30) {
            return false;
        }
        if (this.F()) {
            return false;
        }
        if (this.eH) {
            return false;
        }
        return !this.cL;
    }

    public final void methodLoginScreen(int n2, int n3, int n4) {
        this.LoginScreen = n2;
        this.b = n3;
        this.c = 10;
    }

    public final void c(boolean bl2) {
        this.ck = bl2;
    }

    public void methodLoginScreen(mGraphics en2) {
        String string;
        df df2;
        Object object;
        mGraphics en3;
        if (this.bR) {
            return;
        }
        if (this.dc) {
            this.g(en2);
            return;
        }
        if (this.ck) {
            if (this.ap) {
                GameScreen.Res = this.B - GameScreen.f;
                GameScreen.m = this.C - GameScreen.g - 1;
                if (!GameCanvas.clearKeyHold) {
                    GameScreen.Res += GameScreen.i * this.I;
                }
            }
            return;
        }
        if (!this.G()) {
            return;
        }
        if (this.v != null) {
            int n2;
            en3 = en2;
            object = this.v;
            int n3 = 32;
            int n4 = 32;
            int n5 = n2 = GameCanvas.w % 10 > 5 ? 1 : 0;
            if (((dk)object).Res > 0) {
                n3 = ((dk)object).m;
                n4 = ((dk)object).n;
                n2 = 0;
            }
            bl.LoginScreen(en3, ((dk)object).LoginScreen, ((dk)object).c, ((dk)object).i, ((dk)object).e + 3 + n2, n3, n4, ((dk)object).b == 1 ? 0 : 2, cj.f);
        }
        en3 = en2;
        object = this;
        if (((Char)object).dt > GameScreen.j && ((Char)object).dt < GameScreen.j + GameCanvas.A) {
            if (((Char)object).aq) {
                if (((Char)object).dC || ((Char)object).dA || ((Char)object).dB) {
                    if (((Char)object).GameService >= ServerListScreen) {
                        String string2 = String.valueOf(((Char)object).dT) + (((Char)object).GameService - ServerListScreen) + "_0";
                        df df3 = Res.currentTimeMillis(string2);
                        if (df3 != null) {
                            df3.LoginScreen(((Char)object).dq / 2 % df3.c, ((Char)object).dt, ((Char)object).du + ((Char)object).bS, ((Char)object).dr, 3, en3);
                        }
                    } else if (!((Char)object).bx) {
                        if (((Char)object).bw) {
                            en3.LoginScreen(dn, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 60, 60, 60, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                        } else if (((Char)object).ds == 2) {
                            if (!((Char)object).bv) {
                                en3.LoginScreen(dh, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            } else {
                                en3.LoginScreen(dl, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            }
                        } else if (((Char)object).ds == 1) {
                            if (!((Char)object).bv) {
                                en3.LoginScreen(df, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            } else {
                                en3.LoginScreen(dj, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            }
                        }
                    }
                }
            } else if (!((Char)object).aq) {
                if (((Char)object).GameService >= ServerListScreen) {
                    String string3 = String.valueOf(((Char)object).dT) + (((Char)object).GameService - ServerListScreen) + "_0";
                    df df4 = Res.currentTimeMillis(string3);
                    if (df4 != null) {
                        df4.LoginScreen(((Char)object).dq / 2 % df4.c, ((Char)object).dt, ((Char)object).du + ((Char)object).bS, ((Char)object).dr, 3, en3);
                    }
                } else if (!((Char)object).bx) {
                    if (((Char)object).bw) {
                        en3.LoginScreen(dn, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 60, 60, 60, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                    } else if (((Char)object).dB) {
                        if (((Char)object).ds == 2) {
                            if (!((Char)object).bv) {
                                en3.LoginScreen(dh, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            } else {
                                en3.LoginScreen(dl, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            }
                        } else if (((Char)object).ds == 1) {
                            if (!((Char)object).bv) {
                                en3.LoginScreen(df, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            } else {
                                en3.LoginScreen(dj, 0, ((Char)object).cfr_renamed_0[((Char)object).dp] * 40, 50, 40, ((Char)object).dr, ((Char)object).dt + ((Char)object).dv, ((Char)object).du + ((Char)object).dw + ((Char)object).bS, 0);
                            }
                        }
                    }
                }
            }
        }
        if (bv.f() && this.C >= bv.d - 48) {
            return;
        }
        if (this.SessionReceiver) {
            return;
        }
        if (this.cJ && GameCanvas.w % 2 == 0) {
            en2.LoginScreen(16185600);
            if (this.eE != null) {
                en2.LoginScreen(this.B, this.C - this.al / 2, this.eE.B, this.eE.C - this.eE.al / 2);
            }
            if (this.eF != null) {
                en2.LoginScreen(this.B, this.C - this.al / 2, this.eF.m, this.eF.n - this.eF.w / 2);
            }
        }
        en3 = en2;
        object = this;
        if (!(((Char)object).aq && !cX || ((Char)object).cV >= 0 || ((Char)object).H != 1 && ((Char)object).H != 6 || Res.currentTimeMillis() - ((Char)object).Position <= 0L || ((Char)object).cF || ((Char)object).Q < 16)) {
            int n6 = 7598;
            if (((Char)object).Q >= 19) {
                n6 = 7676;
            }
            if (((Char)object).Q >= 22) {
                n6 = 7677;
            }
            if (((Char)object).Q >= 25) {
                n6 = 7678;
            }
            if (n6 != -1) {
                eg eg2 = bl.c[n6];
                if (eg2 == null) {
                    bl.LoginScreen(n6);
                } else {
                    n6 = GameCanvas.w / 4 % 4 * (mGraphics.b(eg2.LoginScreen) / 4);
                    en3.LoginScreen(eg2.LoginScreen, 0, n6, mGraphics.LoginScreen(eg2.LoginScreen), mGraphics.b(eg2.LoginScreen) / 4, 0, ((Char)object).B, ((Char)object).C + 2, 33);
                }
            }
        }
        en3 = en2;
        object = this;
        if (!(((Char)object).aq && !cW || ((Char)object).cV < 0 || ((Char)object).H != 1 && ((Char)object).H != 6 || GameCanvas.G.LoginScreen || Res.currentTimeMillis() - ((Char)object).Position <= 0L || (df2 = Res.currentTimeMillis(string = String.valueOf(((Char)object).eY) + ((Char)object).cV + "_0")) == null)) {
            df2.LoginScreen(GameCanvas.w / 4 % df2.c, ((Char)object).B, ((Char)object).C, ((Char)object).I == 1 ? 0 : 2, 33, en3);
        }
        this.Item(en2);
        en3 = en2;
        object = this;
        if (((Char)object).cY != -1) {
            if (((Char)object).eZ != null) {
                ((Char)object).eZ.LoginScreen(GameCanvas.w / 4 % ((Char)object).eZ.c, ((Char)object).B, ((Char)object).C + 3, ((Char)object).I == 1 ? 0 : 2, 33, en3);
            } else {
                ((Char)object).eZ = Res.currentTimeMillis(String.valueOf(((Char)object).fb) + ((Char)object).cY + "_0");
            }
        }
        this.e(en2);
        if (this.c > 0) {
            if (GameCanvas.w % 2 == 0) {
                this.LoginScreen(en2, this.LoginScreen, this.b, this.I, 25, true);
            } else if (this.c > 5) {
                this.LoginScreen(en2, this.LoginScreen, this.b, this.I, 7, true);
            }
        }
        if (!(this.G() || this.cf == null || this.cf.LoginScreen >= 70 && this.cf.LoginScreen <= 76 || this.cf.LoginScreen >= 77 && this.cf.LoginScreen <= 83)) {
            if (this.cf != null) {
                this.cb = this.D().length;
                this.cf = null;
            }
            this.ei = null;
            this.dV = null;
            this.ca = null;
            this.dU = -1;
            this.bZ = -1;
            return;
        }
        if (this.H == 15 || this.aZ != null && this.aZ[0] > 0) {
            return;
        }
        en3 = en2;
        object = this;
        RMS av2 = GameScreen.x[super.Item(((Char)object).bU)];
        int n7 = bC[((Char)object).ImageCache][0][2] - av2.LoginScreen[Char.bC[((Char)object).ImageCache][0][0]].c + 5;
        if (!(((Char)object).bc && !((Char)object).aq || !((Char)object).aq && bv.Res == 113 && ((Char)object).C >= 360)) {
            if (((Char)object).aq) {
                ((Char)object).LoginScreen(en3, ((Char)object).B, ((Char)object).C - (n7 += 5) + 3);
            } else {
                boolean bl2;
                boolean bl3 = Char.dD.ai != null && ((Char)object).ah == Char.dD.ai.LoginScreen;
                boolean bl4 = ((Char)object).aN == 3 || ((Char)object).aN == 5;
                boolean bl5 = bl2 = ((Char)object).aN == 4;
                if (((Char)object).ag.startsWith("$")) {
                    ((Char)object).ag = ((Char)object).ag.substring(1);
                    ((Char)object).ev = true;
                }
                if (((Char)object).ag.startsWith("#")) {
                    ((Char)object).ag = ((Char)object).ag.substring(1);
                    ((Char)object).ew = true;
                }
                if (Char.e().aU != null && Char.e().aU.equals(object)) {
                    ((Char)object).LoginScreen(en3, ((Char)object).B, ((Char)object).C - (n7 += 5) + 3);
                }
                n7 += mFont.k.LoginScreen();
                mFont di2 = mFont.H;
                if (((Char)object).ev || ((Char)object).ew) {
                    di2 = mFont.J;
                } else if (bl4) {
                    di2 = mFont.B;
                } else if (bl2) {
                    di2 = mFont.C;
                } else if (bl3) {
                    di2 = mFont.D;
                }
                if (bv.Res == 170) {
                    if (((Char)object).bz == 2325) {
                        di2 = mFont.q;
                    } else if (((Char)object).bz == 2323) {
                        di2 = mFont.GameScreen;
                    }
                }
                if ((((Char)object).i || bl4 || bl2) && !bl3) {
                    if (Res.clientType == 1) {
                        di2.LoginScreen(en3, ((Char)object).ag, ((Char)object).B, ((Char)object).C - n7, 2, mFont.E);
                    } else {
                        di2.LoginScreen(en3, ((Char)object).ag, ((Char)object).B, ((Char)object).C - n7, 2);
                    }
                    n7 += mFont.k.LoginScreen();
                }
                if (bl3) {
                    if (Char.e().aU != null && Char.e().aU.equals(object)) {
                        di2.LoginScreen(en3, ((Char)object).ag, ((Char)object).B, ((Char)object).C - n7, 2, mFont.E);
                    } else if (((Char)object).aU == null) {
                        di2.LoginScreen(en3, ((Char)object).ag, ((Char)object).B - 10, ((Char)object).C - n7 + 3, 0, mFont.o);
                        ((Char)object).LoginScreen(en3, ((Char)object).B - 16, ((Char)object).C - n7 + 10);
                    }
                }
            }
        }
        if (this.cf == null || this.D() == null || this.cb >= this.D().length) {
            this.g(en2);
        }
        if (this.Npc != null) {
            this.Npc.LoginScreen(en2);
        }
        if (this.cd != null) {
            this.cd.LoginScreen(en2);
        }
        this.f(en2);
        this.b(en2);
        en3 = en2;
        object = this;
        if (((Char)object).cY != -1) {
            if (((Char)object).fa != null) {
                ((Char)object).fa.LoginScreen(GameCanvas.w / 4 % ((Char)object).fa.c, ((Char)object).B, ((Char)object).C + 8, ((Char)object).I == 1 ? 0 : 2, 33, en3);
            } else {
                ((Char)object).fa = Res.currentTimeMillis(String.valueOf(((Char)object).fb) + ((Char)object).cY + "_1");
            }
        }
        en3 = en2;
        object = this;
        if (cX) {
            if (((Char)object).H == 1 || ((Char)object).H == 6) {
                if (Res.currentTimeMillis() - ((Char)object).Position > 0L) {
                    if (((Char)object).cF) {
                        if (GameCanvas.w % 2 == 0) {
                            ++((Char)object).ep;
                        }
                        if (((Char)object).ep > 6) {
                            ((Char)object).ep = 0;
                        }
                        en3.LoginScreen(GameCanvas.S[((Char)object).ep], ((Char)object).B, ((Char)object).C + 9, 33);
                    } else {
                        if (((Char)object).Q >= 14 && !GameCanvas.isLowGraphic) {
                            boolean bl6 = false;
                            if (Res.currentTimeMillis() - ((Char)object).Position > -1000L && ((Char)object).eq) {
                                bl6 = true;
                                ((Char)object).eq = false;
                            }
                            if (Res.currentTimeMillis() - ((Char)object).Position > -500L && ((Char)object).er) {
                                bl6 = true;
                                ((Char)object).er = false;
                            }
                            if (bl6) {
                                GameCanvas.isLowGraphic().LoginScreen(-1, ((Char)object).B - -8, ((Char)object).C);
                                GameCanvas.isLowGraphic().LoginScreen(1, ((Char)object).B - 8, ((Char)object).C);
                                super.e(1);
                            }
                        }
                        if (((Char)object).Q == 14) {
                            if (GameCanvas.w % 2 == 0) {
                                ++((Char)object).ep;
                            }
                            if (((Char)object).ep > 6) {
                                ((Char)object).ep = 0;
                            }
                            en3.LoginScreen(GameCanvas.R[((Char)object).ep], ((Char)object).B, ((Char)object).C + 9, 33);
                        } else if (((Char)object).Q == 15) {
                            if (GameCanvas.w % 2 == 0) {
                                ++((Char)object).ep;
                            }
                            if (((Char)object).ep > 6) {
                                ((Char)object).ep = 0;
                            }
                            en3.LoginScreen(GameCanvas.S[((Char)object).ep], ((Char)object).B, ((Char)object).C + 9, 33);
                        } else if (((Char)object).Q >= 16) {
                            int n8 = -1;
                            if (((Char)object).Q >= 16 && ((Char)object).Q < 22) {
                                n8 = 7599;
                            }
                            if (n8 != -1) {
                                eg eg3 = bl.c[7599];
                                if (eg3 == null) {
                                    bl.LoginScreen(7599);
                                } else {
                                    n8 = GameCanvas.w / 4 % 4 * (mGraphics.b(eg3.LoginScreen) / 4);
                                    en3.LoginScreen(eg3.LoginScreen, 0, n8, mGraphics.LoginScreen(eg3.LoginScreen), mGraphics.b(eg3.LoginScreen) / 4, 0, ((Char)object).B, ((Char)object).C + 2, 33);
                                }
                            }
                        }
                    }
                }
            } else {
                ((Char)object).Position = Res.currentTimeMillis() + 1500L;
                ((Char)object).eq = true;
                ((Char)object).er = true;
            }
        }
        en3 = en2;
        object = this;
        if ((!((Char)object).aq || cW) && ((Char)object).cV >= 0) {
            if (((Char)object).H == 1 || ((Char)object).H == 6) {
                if (!GameCanvas.G.LoginScreen && !GameCanvas.isLowGraphic) {
                    String string4;
                    df df5;
                    boolean bl7 = false;
                    if (Res.currentTimeMillis() - ((Char)object).Position > -1000L && ((Char)object).eq) {
                        bl7 = true;
                        ((Char)object).eq = false;
                    }
                    if (Res.currentTimeMillis() - ((Char)object).Position > -500L && ((Char)object).er) {
                        bl7 = true;
                        ((Char)object).er = false;
                    }
                    if (bl7) {
                        GameCanvas.isLowGraphic().LoginScreen(-1, ((Char)object).B - -8, ((Char)object).C);
                        GameCanvas.isLowGraphic().LoginScreen(1, ((Char)object).B - 8, ((Char)object).C);
                        super.e(1);
                    }
                    if (Res.currentTimeMillis() - ((Char)object).Position > 0L && (df5 = Res.currentTimeMillis(string4 = String.valueOf(((Char)object).eY) + ((Char)object).cV + "_1")) != null) {
                        df5.LoginScreen(GameCanvas.w / 4 % df5.c, ((Char)object).B, ((Char)object).C + 2, ((Char)object).I == 1 ? 0 : 2, 33, en3);
                    }
                }
            } else {
                ((Char)object).Position = Res.currentTimeMillis() + 1500L;
                ((Char)object).eq = true;
                ((Char)object).er = true;
            }
        }
        this.i(en2);
        en3 = en2;
        object = this;
        if (!((Char)object).db && ((Char)object).bA != 0 && ((Char)object).bB != 0 && ((Char)object).H != 14) {
            int n9 = 0;
            int n10 = ((Char)object).B - 30;
            int n11 = ((Char)object).C - 15;
            if (ds.g(((Char)object).C - ((Char)object).bB) > 150) {
                if (((Char)object).C > ((Char)object).bB) {
                    n9 = 7;
                    n10 = ((Char)object).B;
                    n11 = ((Char)object).C - 15 - 60;
                } else {
                    n9 = 5;
                    n10 = ((Char)object).B;
                    n11 = ((Char)object).C - 15 + 60;
                }
            } else if (((Char)object).B > ((Char)object).bA) {
                n9 = 2;
            } else if (((Char)object).B <= ((Char)object).bA) {
                n10 = ((Char)object).B + 30;
            }
            if (GameCanvas.w % 10 >= 5) {
                if (ds.g(((Char)object).B - ((Char)object).bA) > 100) {
                    en3.LoginScreen(GameScreen.bw, 0, 0, 13, 16, n9, n10, n11, cj.f);
                    return;
                }
                if (ds.g(((Char)object).B - ((Char)object).bA) < 50) {
                    en3.LoginScreen(g.i, ((Char)object).bA + -30, ((Char)object).bB - 60 + 5, 0);
                }
            }
        }
    }

    private void e(mGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.LoginScreen >= 201) {
                ea2.LoginScreen(en2);
            }
            ++n2;
        }
    }

    private void f(mGraphics en2) {
        if (this.ei != null) {
            int n2 = 0;
            while (n2 < this.ei.length) {
                if (this.ei[n2] != null) {
                    if (this.ei[n2].b != null) {
                        int n3 = this.ei[n2].b.n;
                        if (this.ei[n2].b instanceof Npc) {
                            n3 = this.ei[n2].b.n - 60;
                        }
                        if (this.ei[n2].b instanceof d) {
                            n3 = this.ei[n2].b.n - 50;
                        }
                        if (this.ei[n2].b instanceof an) {
                            n3 = this.ei[n2].b.n - 40;
                        }
                        bl.b(en2, this.ei[n2].LoginScreen(), this.ei[n2].b.m, n3, 0, 33);
                    } else if (this.ei[n2].c != null) {
                        bl.b(en2, this.ei[n2].LoginScreen(), this.ei[n2].c.B, this.ei[n2].c.C, 0, 33);
                    }
                }
                ++n2;
            }
        }
        if (this.bZ >= 0 && this.ca != null) {
            bl.b(en2, this.ca.LoginScreen[this.bZ].c, this.B + this.ca.LoginScreen[this.bZ].LoginScreen, this.C + this.ca.LoginScreen[this.bZ].b, 0, 3);
        }
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3) {
        int n4 = (int)((long)((int)this.U * 100) / this.V) / 10 - 1;
        if (n4 < 0) {
            n4 = 0;
        }
        if (n4 > 9) {
            n4 = 9;
        }
        if (!this.aq) {
            en2.LoginScreen(Mob.R, 0, 6 * (9 - n4), 9, 6, 0, n2, n3 - mFont.k.LoginScreen() - 6, 3);
        }
        if (this.aN != 0 || Char.e().by != 0 && this.by != 0 && (this.by == 8 || Char.e().by == 8 || this.by != Char.e().by)) {
            this.es = (int)(this.U * 100L / this.V * (long)this.et) / 100;
            n4 = (int)(this.U * 100L / this.V);
            this.eu = n4 < 30 ? GameScreen.aH : (n4 < 60 ? GameScreen.aI : GameScreen.aK);
            int n5 = mGraphics.LoginScreen(GameScreen.aJ);
            int n6 = mGraphics.b(GameScreen.aJ);
            n4 = n5 * n4 / 100;
            en2.LoginScreen(GameScreen.aJ, n2 - (n5 >> 1), n3 - 1, 20);
            if (this.es >= 5 || GameCanvas.w % 6 < 3) {
                en2.LoginScreen(this.eu, 0, 0, n4, n6, 0, n2 - (n5 >> 1), n3 - 1, 20);
            }
        }
    }

    public final void c(mGraphics en2) {
        if (this.ck) {
            return;
        }
        if (this.bU == 377) {
            return;
        }
        if (this.bV == 471) {
            return;
        }
        if (this.SessionReceiver) {
            return;
        }
        if (this.bq) {
            return;
        }
        byte by2 = bv.i;
        if (!(bv.Res >= 114 && bv.Res <= 120 || bv.Res == 127 || bv.Res == 128 || bv.LoginScreen(this.cl + by2 / 2, this.cm + 1, 4))) {
            if (bv.LoginScreen((this.cl - by2 / 2) / by2, (this.cm + 1) / by2) == 0) {
                en2.e(this.cl / by2 * by2, (this.cm - 30) / by2 * by2, 100, 100);
            } else if (bv.LoginScreen((this.cl + by2 / 2) / by2, (this.cm + 1) / by2) == 0) {
                en2.e(this.cl / by2 * by2, (this.cm - 30) / by2 * by2, by2, 100);
            } else if (bv.LoginScreen(this.cl - by2 / 2, this.cm + 1, 8)) {
                en2.e(this.cl / 24 * by2, (this.cm - 30) / by2 * by2, by2, 100);
            }
        }
        en2.LoginScreen(bv.x, this.cl, this.cm, 3);
        en2.e(GameScreen.j, GameScreen.k - GameCanvas.ae, GameScreen.d, GameScreen.e + 2 * GameCanvas.ae);
    }

    public final void H() {
        int n2 = 0;
        this.cl = this.B;
        if (bv.LoginScreen(this.B, this.C, 2)) {
            this.cm = this.C;
            return;
        }
        this.cm = this.C;
        while (n2 < 30) {
            ++n2;
            this.cm += 24;
            if (!bv.LoginScreen(this.cl, this.cm, 2)) continue;
            if (this.cm % 24 == 0) break;
            this.cm -= this.cm % 24;
            return;
        }
    }

    private void g(mGraphics en2) {
        block8: {
            try {
                if (this.dc) {
                    this.LoginScreen(en2, this.dd, this.de, this.I, this.ImageCache, false);
                    return;
                }
                if (this.bc) {
                    if (this.aq) {
                        if (GameCanvas.w % 50 == 48 || GameCanvas.w % 50 == 90) {
                            bl.b(en2, 1196, this.B, this.C - 18, 0, 3);
                        } else {
                            bl.b(en2, 1195, this.B, this.C - 18, 0, 3);
                        }
                        break block8;
                    }
                } else {
                    this.LoginScreen(en2, this.B, this.C + this.bS, this.I, this.ImageCache, true);
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void methodLoginScreen(mGraphics en2, short[] sArray, int n2, int n3, int n4, boolean bl2) {
        int n5 = 0;
        int n6 = 0;
        if (this.H == 6) {
            n5 = 8;
            n6 = 17;
        }
        if (this.H == 1) {
            if (this.F % 15 < 5) {
                n5 = 8;
                n6 = 17;
            } else {
                n5 = 8;
                n6 = 18;
            }
        }
        if (this.H == 2) {
            if (this.ImageCache <= 3) {
                n5 = 7;
                n6 = 17;
            } else {
                n5 = 7;
                n6 = 18;
            }
        }
        if (this.H == 3 || this.H == 9) {
            n5 = 5;
            n6 = 20;
        }
        if (this.H == 4) {
            if (this.ImageCache == 8) {
                n5 = 5;
                n6 = 16;
            } else {
                n5 = 5;
                n6 = 20;
            }
        }
        if (this.H == 10) {
            if (this.ImageCache == 8) {
                n5 = 0;
                n6 = 23;
            } else {
                n5 = 5;
                n6 = 22;
            }
        }
        if (this.ek > 0) {
            n5 = 5;
            n6 = 18;
        }
        if (this.cf != null && this.D() != null && this.cb < this.D().length) {
            n5 = -1;
            n6 = 17;
        }
        ++this.ex;
        if (this.ex > 10000) {
            this.ex = 0;
        }
        int n7 = this.ex / 4 % sArray.length;
        if (!bl2) {
            if (sArray.length == 2) {
                n7 = 1;
            }
            if (sArray.length == 3) {
                if (sArray[2] >= 0) {
                    n7 = 2;
                    if (GameCanvas.w % 10 > 5) {
                        n7 = 1;
                    }
                } else {
                    n7 = 1;
                }
            }
        } else if (sArray.length > 1 && (n7 == 0 || n7 == 1) && this.H != 1 && this.H != 6) {
            this.ex = 0;
            n7 = 0;
            if (GameCanvas.w % 10 > 5) {
                n7 = 1;
            }
        }
        bl.b(en2, sArray[n7], n2 + (n4 == 1 ? -n5 : n5), n3 - n6, n4 == 1 ? 0 : 2, cj.f);
    }

    public final boolean methodLoginScreen(int n2) {
        RMS av2 = GameScreen.x[this.bU];
        RMS av3 = GameScreen.x[this.bV];
        RMS av4 = GameScreen.x[this.bW];
        int n3 = 0;
        while (n3 < bC.length) {
            if (n2 == av2.LoginScreen[Char.bC[n3][0][0]].LoginScreen) {
                return true;
            }
            if (n2 == av3.LoginScreen[Char.bC[n3][1][0]].LoginScreen) {
                return true;
            }
            if (n2 == av4.LoginScreen[Char.bC[n3][2][0]].LoginScreen) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        RMS av2 = GameScreen.x[this.bU];
        bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n2, n3, 0, 10);
    }

    public final void b(mGraphics en2, int n2, int n3, int n4) {
        RMS av2 = GameScreen.x[this.bU];
        bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n2 + bC[0][0][1] + av2.LoginScreen[Char.bC[0][0][0]].b - 3, n3 + 3, n4, 36);
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, boolean bl2) {
        mGraphics en3;
        int n6;
        this.ey = GameScreen.x[this.bU];
        this.ez = GameScreen.x[this.bV];
        this.eA = GameScreen.x[this.bW];
        if (this.bX >= 0 && this.H != 14) {
            if (!ak.g.containsKey(String.valueOf(this.bX))) {
                ak.g.put(String.valueOf(this.bX), new ak());
                GameService.LoginScreen().u(this.bX);
            } else {
                ak ak2 = (ak)ak.g.get(String.valueOf(this.bX));
                if (ak2.c != null && bl2) {
                    this.LoginScreen(en2, ak2.c, n2, n3, n4, true);
                }
            }
        }
        int n7 = 2;
        int n8 = 24;
        int n9 = cj.b;
        int n10 = -1;
        if (n4 == 1) {
            n7 = 0;
            n6 = 0;
            n9 = 0;
            n10 = 1;
        }
        if (this.H == 14) {
            if (GameCanvas.w % 4 > 0) {
                en2.LoginScreen(ItemMap.f, n2, n3 - this.al - 11, 3);
            }
            n4 = 0;
            if (this.bU == 89 || this.bU == 457 || this.bU == 460 || this.bU == 461 || this.bU == 462 || this.bU == 463 || this.bU == 464 || this.bU == 465 || this.bU == 466) {
                n4 = 15;
            }
            if (this.bU == 1291) {
                n4 = 23;
            }
            bl.b(en2, 834, n2, n3 - bC[n5][2][2] + this.eA.LoginScreen[Char.bC[n5][2][0]].c - 2 + n4, n7, cj.LoginScreen);
            bl.b(en2, 79, n2, n3 - this.al - 8, 0, 33);
            bl.b(en2, this.ey.LoginScreen[Char.bC[n5][0][0]].LoginScreen, n2 + (bC[n5][0][1] + this.ey.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + this.ey.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
            this.b(en2, n5, n3 - bC[n5][2][2] + this.eA.LoginScreen[Char.bC[n5][2][0]].c);
            if (Char.g(this.bU)) {
                RMS av2 = GameScreen.x[this.Item(this.bU)];
                bl.b(en2, av2.LoginScreen[Char.bC[n5][0][0]].LoginScreen, n2 + (bC[n5][0][1] + av2.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + av2.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
            } else {
                bl.b(en2, this.ey.LoginScreen[Char.bC[n5][0][0]].LoginScreen, n2 + (bC[n5][0][1] + this.ey.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + this.ey.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
            }
            int n11 = n3 - bC[n5][2][2] + this.eA.LoginScreen[Char.bC[n5][2][0]].c;
            int n12 = n5;
            en3 = en2;
            Char af2 = this;
            try {
                if (af2.cZ != -1) {
                    if (Char.i(n12)) {
                        if (af2.ff != null) {
                            af2.ff.LoginScreen(GameCanvas.w / 4 % af2.ff.c, af2.B + fj[n12][0] * (af2.I == 1 ? 1 : -1), n11 + fj[n12][1], af2.I == 1 ? 0 : 2, 33, en3);
                        } else {
                            af2.ff = Res.currentTimeMillis(String.valueOf(af2.fh) + af2.fi + af2.cZ);
                        }
                    } else if (af2.fd != null) {
                        af2.fd.LoginScreen(GameCanvas.w / 4 % af2.fd.c, af2.B + fj[n12][0] * (af2.I == 1 ? 1 : -1), n11 + fj[n12][1], af2.I == 1 ? 0 : 2, 33, en3);
                    } else {
                        af2.fd = Res.currentTimeMillis(String.valueOf(af2.fh) + af2.cZ);
                    }
                }
            }
            catch (Exception exception) {}
            this.LoginScreen(en2, n2 + (bC[n5][0][1] + this.ey.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + this.ey.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
        } else {
            this.b(en2, n5, n3 - bC[n5][2][2] + this.eA.LoginScreen[Char.bC[n5][2][0]].c);
            try {
                if (Char.g(this.bU)) {
                    RMS av3 = GameScreen.x[this.Item(this.bU)];
                    bl.b(en2, av3.LoginScreen[Char.bC[n5][0][0]].LoginScreen, n2 + (bC[n5][0][1] + av3.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + av3.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
                } else {
                    bl.b(en2, this.ey.LoginScreen[Char.bC[n5][0][0]].LoginScreen, n2 + (bC[n5][0][1] + this.ey.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + this.ey.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
                }
                bl.b(en2, this.ez.LoginScreen[Char.bC[n5][1][0]].LoginScreen, n2 + (bC[n5][1][1] + this.ez.LoginScreen[Char.bC[n5][1][0]].b) * n10, n3 - bC[n5][1][2] + this.ez.LoginScreen[Char.bC[n5][1][0]].c, n7, n6);
                bl.b(en2, this.eA.LoginScreen[Char.bC[n5][2][0]].LoginScreen, n2 + (bC[n5][2][1] + this.eA.LoginScreen[Char.bC[n5][2][0]].b) * n10, n3 - bC[n5][2][2] + this.eA.LoginScreen[Char.bC[n5][2][0]].c, n7, n6);
                this.LoginScreen(en2, n2 + (bC[n5][0][1] + this.ey.LoginScreen[Char.bC[n5][0][0]].b) * n10, n3 - bC[n5][0][2] + this.ey.LoginScreen[Char.bC[n5][0][0]].c, n7, n6);
            }
            catch (Exception exception) {}
        }
        int n13 = this.al = this.cE == 1 || this.cL ? 60 : bC[0][0][2] + this.ey.LoginScreen[Char.bC[0][0][0]].c + 10;
        int n12 = ds.g(this.ey.LoginScreen[Char.bC[n5][0][0]].c) >= 22 ? (this.ey.LoginScreen[Char.bC[n5][0][0]].c < 0 ? this.ey.LoginScreen[Char.bC[n5][0][0]].c + 5 : this.ey.LoginScreen[Char.bC[n5][0][0]].c - 5) : this.ey.LoginScreen[Char.bC[n5][0][0]].c;
        this.eB = n3 - bC[n5][0][2] + n12;
        if (!(this.H != 1 || this.J <= 0 || this.r || this.z() || this.cG || this.cf != null || n5 == 23 || this.bX >= 0 || (GameCanvas.w + this.J) % 30 != 0 && !this.bk)) {
            en2.LoginScreen(this.K == 1 ? Res : k, n2 + n10 * -2, n3 - 32 + (this.K == 1 ? 10 : 11) - n5, n9);
        }
        if (this.dI != null) {
            this.dI.LoginScreen(en2);
        }
        if (this.dJ != null) {
            this.dJ.LoginScreen(en2);
        }
        en3 = en2;
        Char af3 = this;
        if (af3.I == 1) {
            if (af3.by != 0 && af3.by != -1) {
                boolean cfr_ignored_0 = af3.aq;
                bl.b(en3, af3.bz, af3.B - 10, af3.C - af3.al - 30 + (GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), 2, 0);
                return;
            }
        } else if (af3.by != 0 && af3.by != -1) {
            boolean cfr_ignored_1 = af3.aq;
            bl.b(en3, af3.bz, af3.B, af3.C - af3.al - 30 + (GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), 0, 0);
        }
    }

    public final void d(mGraphics en2) {
        this.dP = 0;
        f[] fArray = this.D();
        this.ImageCache = fArray[this.cb].LoginScreen;
        this.g(en2);
        if (this.I == 1) {
            if (this.ef != null) {
                if (this.dZ == 0) {
                    this.dZ = fArray[this.cb].c;
                }
                if (this.ec == 0) {
                    this.ec = fArray[this.cb].d;
                }
                bl.b(en2, this.ef.LoginScreen[this.dW].c, this.B + this.dZ + this.ef.LoginScreen[this.dW].LoginScreen, this.C + this.ec + this.ef.LoginScreen[this.dW].b, 0, 3);
                ++this.dW;
                if (this.dW >= this.ef.LoginScreen.length) {
                    this.ef = null;
                    this.ec = 0;
                    this.dZ = 0;
                    this.dW = 0;
                }
            }
            if (this.eg != null) {
                if (this.ea == 0) {
                    this.ea = fArray[this.cb].f;
                }
                if (this.WeatherEffect == 0) {
                    this.WeatherEffect = fArray[this.cb].g;
                }
                bl.b(en2, this.eg.LoginScreen[this.dX].c, this.B + this.ea + this.eg.LoginScreen[this.dX].LoginScreen, this.C + this.WeatherEffect + this.eg.LoginScreen[this.dX].b, 0, 3);
                ++this.dX;
                if (this.dX >= this.eg.LoginScreen.length) {
                    this.eg = null;
                    this.WeatherEffect = 0;
                    this.ea = 0;
                    this.dX = 0;
                }
            }
            if (this.eh != null) {
                if (this.eb == 0) {
                    this.eb = fArray[this.cb].i;
                }
                if (this.ee == 0) {
                    this.ee = fArray[this.cb].j;
                }
                bl.b(en2, this.eh.LoginScreen[this.dY].c, this.B + this.eb + this.eh.LoginScreen[this.dY].LoginScreen, this.C + this.ee + this.eh.LoginScreen[this.dY].b, 0, 3);
                ++this.dY;
                if (this.dY >= this.eh.LoginScreen.length) {
                    this.eh = null;
                    this.ee = 0;
                    this.eb = 0;
                    this.dY = 0;
                }
            }
        } else {
            if (this.ef != null) {
                if (this.dZ == 0) {
                    this.dZ = fArray[this.cb].c;
                }
                if (this.ec == 0) {
                    this.ec = fArray[this.cb].d;
                }
                bl.b(en2, this.ef.LoginScreen[this.dW].c, this.B - this.dZ - this.ef.LoginScreen[this.dW].LoginScreen, this.C + this.ec + this.ef.LoginScreen[this.dW].b, 2, 3);
                ++this.dW;
                if (this.dW >= this.ef.LoginScreen.length) {
                    this.ef = null;
                    this.dW = 0;
                    this.dZ = 0;
                    this.ec = 0;
                }
            }
            if (this.eg != null) {
                if (this.ea == 0) {
                    this.ea = fArray[this.cb].f;
                }
                if (this.WeatherEffect == 0) {
                    this.WeatherEffect = fArray[this.cb].g;
                }
                bl.b(en2, this.eg.LoginScreen[this.dX].c, this.B - this.ea - this.eg.LoginScreen[this.dX].LoginScreen, this.C + this.WeatherEffect + this.eg.LoginScreen[this.dX].b, 2, 3);
                ++this.dX;
                if (this.dX >= this.eg.LoginScreen.length) {
                    this.eg = null;
                    this.dX = 0;
                    this.ea = 0;
                    this.WeatherEffect = 0;
                }
            }
            if (this.eh != null) {
                if (this.eb == 0) {
                    this.eb = fArray[this.cb].i;
                }
                if (this.ee == 0) {
                    this.ee = fArray[this.cb].j;
                }
                bl.b(en2, this.eh.LoginScreen[this.dY].c, this.B - this.eb - this.eh.LoginScreen[this.dY].LoginScreen, this.C + this.ee + this.eh.LoginScreen[this.dY].b, 2, 3);
                ++this.dY;
                if (this.dY >= this.eh.LoginScreen.length) {
                    this.eh = null;
                    this.dY = 0;
                    this.eb = 0;
                    this.ee = 0;
                }
            }
        }
        ++this.cb;
    }

    public final void b(int n2, int n3, int n4) {
        if (n4 == 1 || ds.g(n2 - this.B) > 100 || ds.g(n3 - this.C) > 300) {
            this.LoginScreen(this.B, this.C, 10);
            this.B = n2;
            this.C = n3;
            this.bF.removeAllElements();
            this.H = 6;
            this.G = 0;
            this.bP = null;
            this.ImageCache = 25;
            return;
        }
        n4 = 0;
        int n5 = 0;
        int n6 = n2 - this.B;
        int n7 = n3 - this.C;
        if (n6 == 0 && n7 == 0) {
            n5 = 1;
            this.G = 0;
        } else if (n7 == 0) {
            n5 = 2;
            if (n6 > 0) {
                n4 = 1;
            }
            if (n6 < 0) {
                n4 = -1;
            }
        } else if (n7 != 0) {
            if (n7 < 0) {
                n5 = 3;
            }
            if (n7 > 0) {
                n5 = 4;
            }
            if (n6 < 0) {
                n4 = -1;
            }
            if (n6 > 0) {
                n4 = 1;
            }
        }
        this.bF.addElement(new dm(n2, n3, n5, n4));
        if (this.H != 6) {
            this.eC = this.H;
        }
        this.H = 6;
        this.G = 0;
    }

    private void ay() {
        int n2;
        int n3;
        int n4;
        bq bq2;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int[] nArray;
        int n10;
        block60: {
            block61: {
                block57: {
                    if (Char.e().cf != null || Char.e().Npc != null || Char.e().cd != null) {
                        this.eD = 200;
                        return;
                    }
                    if (this.eD > 0) {
                        --this.eD;
                        return;
                    }
                    if (cn && this.aU != null && (this.aU.H == 15 || this.aU.bc)) {
                        this.aU = null;
                    }
                    if (GameCanvas.w % 2 == 0) {
                        return;
                    }
                    if (this.c(this.aU)) {
                        return;
                    }
                    n10 = 0;
                    if (this.ax != null && (this.ax.LoginScreen == 0 || this.ax.LoginScreen == 1 || this.ax.LoginScreen == 3 || this.ax.LoginScreen == 5)) {
                        n10 = 40;
                    }
                    nArray = new int[]{-1, -1, -1, -1};
                    n9 = GameScreen.j - 10;
                    n8 = GameScreen.j + GameCanvas.A + 10;
                    n7 = GameScreen.k;
                    n6 = GameScreen.k + GameCanvas.B - GameScreen.Item + 10;
                    if (cn) {
                        if (this.aQ != null && this.aQ.GameScreen != 1 && this.aQ.GameScreen != 0 && n9 <= this.aQ.m && this.aQ.m <= n8 && n7 <= this.aQ.n && this.aQ.n <= n6 || this.aT != null && n9 <= this.aT.B && this.aT.B <= n8 && n7 <= this.aT.C && this.aT.C <= n6 || this.aU != null && n9 <= this.aU.B && this.aU.B <= n8 && n7 <= this.aU.C && this.aU.C <= n6 || this.aV != null && n9 <= this.aV.LoginScreen && this.aV.LoginScreen <= n8 && n7 <= this.aV.b && this.aV.b <= n6) {
                            return;
                        }
                        cn = false;
                    }
                    n9 = Char.e().B - 80;
                    n8 = Char.e().B + 80;
                    n7 = Char.e().C - 30;
                    n6 = Char.e().C + 30;
                    if (this.aT != null && this.aT.df.LoginScreen == 6) {
                        n9 = Char.e().B - 20;
                        n8 = Char.e().B + 20;
                        n7 = Char.e().C - 10;
                        n6 = Char.e().C + 10;
                    }
                    if (this.aT == null) {
                        n5 = 0;
                        while (n5 < GameScreen.G.size()) {
                            bq2 = (_do)GameScreen.G.elementAt(n5);
                            if (bq2.H != 15) {
                                n4 = Math.abs(Char.e().B - bq2.B);
                                n2 = n4 > (n3 = Math.abs(Char.e().C - bq2.C)) ? n4 : n3;
                                n9 = Char.e().B - 80;
                                n8 = Char.e().B + 80;
                                n7 = Char.e().C - 30;
                                n6 = Char.e().C + 30;
                                if (bq2.df.LoginScreen == 6) {
                                    n9 = Char.e().B - 20;
                                    n8 = Char.e().B + 20;
                                    n7 = Char.e().C - 10;
                                    n6 = Char.e().C + 10;
                                }
                                if (n9 <= bq2.B && bq2.B <= n8 && n7 <= bq2.C && bq2.C <= n6 && (this.aT == null || n2 < nArray[1])) {
                                    this.aT = bq2;
                                    nArray[1] = n2;
                                }
                            }
                            ++n5;
                        }
                    } else if (n9 > this.aT.B || this.aT.B > n8 || n7 > this.aT.C || this.aT.C > n6) {
                        this.az();
                        n5 = 0;
                        while (n5 < GameScreen.G.size()) {
                            bq2 = (_do)GameScreen.G.elementAt(n5);
                            if (bq2.H != 15) {
                                n4 = Math.abs(Char.e().B - bq2.B);
                                n2 = n4 > (n3 = Math.abs(Char.e().C - bq2.C)) ? n4 : n3;
                                n9 = Char.e().B - 80;
                                n8 = Char.e().B + 80;
                                n7 = Char.e().C - 30;
                                n6 = Char.e().C + 30;
                                if (bq2.df.LoginScreen == 6) {
                                    n9 = Char.e().B - 20;
                                    n8 = Char.e().B + 20;
                                    n7 = Char.e().C - 10;
                                    n6 = Char.e().C + 10;
                                }
                                if (n9 <= bq2.B && bq2.B <= n8 && n7 <= bq2.C && bq2.C <= n6 && (this.aT == null || n2 < nArray[1])) {
                                    this.aT = bq2;
                                    nArray[1] = n2;
                                }
                            }
                            ++n5;
                        }
                    } else {
                        this.d(1);
                        return;
                    }
                    if (this.aV != null) break block57;
                    n5 = 0;
                    while (n5 < GameScreen.E.size()) {
                        block58: {
                            block59: {
                                bq2 = (ItemMap)GameScreen.E.elementAt(n5);
                                n4 = Math.abs(Char.e().B - ((ItemMap)bq2).LoginScreen);
                                int n11 = n2 = n4 > (n3 = Math.abs(Char.e().C - ((ItemMap)bq2).b)) ? n4 : n3;
                                if (n4 > 48 || n3 > 48 || this.aV != null && n2 >= nArray[3]) break block58;
                                if (GameScreen.j().aX == 0) break block59;
                                GameScreen.j();
                                if (GameScreen.Item() && ((ItemMap)bq2).e.b != 9) break block58;
                            }
                            this.aV = bq2;
                            nArray[3] = n2;
                        }
                        ++n5;
                    }
                    break block60;
                }
                if (n9 <= this.aV.LoginScreen && this.aV.LoginScreen <= n8 && n7 <= this.aV.b && this.aV.b <= n6) break block61;
                this.aV = null;
                n5 = 0;
                while (n5 < GameScreen.E.size()) {
                    block62: {
                        block63: {
                            bq2 = (ItemMap)GameScreen.E.elementAt(n5);
                            n4 = Math.abs(Char.e().B - ((ItemMap)bq2).LoginScreen);
                            int n12 = n2 = n4 > (n3 = Math.abs(Char.e().C - ((ItemMap)bq2).b)) ? n4 : n3;
                            if (n9 > ((ItemMap)bq2).LoginScreen || ((ItemMap)bq2).LoginScreen > n8 || n7 > ((ItemMap)bq2).b || ((ItemMap)bq2).b > n6 || this.aV != null && n2 >= nArray[3]) break block62;
                            if (GameScreen.j().aX == 0) break block63;
                            GameScreen.j();
                            if (GameScreen.Item() && ((ItemMap)bq2).e.b != 9) break block62;
                        }
                        this.aV = bq2;
                        nArray[3] = n2;
                    }
                    ++n5;
                }
                break block60;
            }
            this.d(3);
            return;
        }
        n9 = Char.e().B - Char.e().Mob() - 10;
        n8 = Char.e().B + Char.e().Mob() + 10;
        n7 = Char.e().C - Char.e().ab() - n10 - 20;
        n6 = Char.e().C + Char.e().ab() + 20;
        if (n6 > Char.e().C + 30) {
            n6 = Char.e().C + 30;
        }
        if (this.aQ == null) {
            n5 = 0;
            while (n5 < GameScreen.F.size()) {
                bq2 = (Mob)GameScreen.F.elementAt(n5);
                n4 = Math.abs(Char.e().B - ((Mob)bq2).m);
                int n13 = n2 = n4 > (n3 = Math.abs(Char.e().C - ((Mob)bq2).n)) ? n4 : n3;
                if (n9 <= ((Mob)bq2).m && ((Mob)bq2).m <= n8 && n7 <= ((Mob)bq2).n && ((Mob)bq2).n <= n6 && (this.aQ == null || n2 < nArray[0])) {
                    this.aQ = bq2;
                    nArray[0] = n2;
                }
                ++n5;
            }
        } else if (this.aQ.GameScreen == 1 || this.aQ.GameScreen == 0 || n9 > this.aQ.m || this.aQ.m > n8 || n7 > this.aQ.n || this.aQ.n > n6) {
            this.aQ = null;
            n5 = 0;
            while (n5 < GameScreen.F.size()) {
                bq2 = (Mob)GameScreen.F.elementAt(n5);
                n4 = Math.abs(Char.e().B - ((Mob)bq2).m);
                int n14 = n2 = n4 > (n3 = Math.abs(Char.e().C - ((Mob)bq2).n)) ? n4 : n3;
                if (n9 <= ((Mob)bq2).m && ((Mob)bq2).m <= n8 && n7 <= ((Mob)bq2).n && ((Mob)bq2).n <= n6 && (this.aQ == null || n2 < nArray[0])) {
                    this.aQ = bq2;
                    nArray[0] = n2;
                }
                ++n5;
            }
        } else {
            this.d(0);
            return;
        }
        if (this.aU == null) {
            n5 = 0;
            while (n5 < GameScreen.D.size()) {
                bq2 = (Char)GameScreen.D.elementAt(n5);
                if (bq2.H != 15 && !bq2.bc && this.co == 0 && this.cp == 0) {
                    n4 = Math.abs(Char.e().B - bq2.B);
                    int n15 = n2 = n4 > (n3 = Math.abs(Char.e().C - bq2.C)) ? n4 : n3;
                    if (n9 <= bq2.B && bq2.B <= n8 && n7 <= bq2.C && bq2.C <= n6 && (this.aU == null || n2 < nArray[2])) {
                        this.aU = bq2;
                        nArray[2] = n2;
                    }
                }
                ++n5;
            }
        } else if (n9 > this.aU.B || this.aU.B > n8 || n7 > this.aU.C || this.aU.C > n6 || this.aU.H == 15 || this.aU.bc) {
            this.aU = null;
            n5 = 0;
            while (n5 < GameScreen.D.size()) {
                bq2 = (Char)GameScreen.D.elementAt(n5);
                if (bq2.H != 15 && !bq2.bc && this.co == 0 && this.cp == 0) {
                    n4 = Math.abs(Char.e().B - bq2.B);
                    int n16 = n2 = n4 > (n3 = Math.abs(Char.e().C - bq2.C)) ? n4 : n3;
                    if (n9 <= bq2.B && bq2.B <= n8 && n7 <= bq2.C && bq2.C <= n6 && (this.aU == null || n2 < nArray[2])) {
                        this.aU = bq2;
                        nArray[2] = n2;
                    }
                }
                ++n5;
            }
        } else {
            this.d(2);
            return;
        }
        n5 = -1;
        int n17 = 0;
        while (n17 < nArray.length) {
            if (n5 == -1) {
                if (nArray[n17] != -1) {
                    n5 = n17;
                }
            } else if (nArray[n17] < nArray[n5] && nArray[n17] != -1) {
                n5 = n17;
            }
            ++n17;
        }
        this.d(n5);
        if (this.aq && this.I()) {
            if (this.aQ != null && !this.aQ.J) {
                this.aQ = null;
            }
            this.aT = null;
            this.aV = null;
        }
    }

    private void d(int n2) {
        if (n2 == 0) {
            this.az();
            this.aU = null;
            this.aV = null;
            return;
        }
        if (n2 == 1) {
            this.aQ = null;
            this.aU = null;
            this.aV = null;
            return;
        }
        if (n2 == 2) {
            this.aQ = null;
            this.az();
            this.aV = null;
            return;
        }
        if (n2 == 3) {
            this.aQ = null;
            this.az();
            this.aU = null;
        }
    }

    public static boolean methodLoginScreen(Char af2) {
        int n2 = GameScreen.j;
        int n3 = GameScreen.j + GameCanvas.A;
        int n4 = GameScreen.k + 10;
        int n5 = GameScreen.k + GameScreen.e;
        return af2.H != 15 && !af2.bc && n2 <= af2.B && af2.B <= n3 && n4 <= af2.C && af2.C <= n5;
    }

    public final boolean I() {
        return this.aN == 4 || this.aN == 3;
    }

    public final void b(Char af2) {
        this.I = this.B < af2.B ? 1 : -1;
        this.eE = af2;
        this.cJ = true;
    }

    public final void methodLoginScreen(Mob aa2) {
        this.I = this.B < aa2.m ? 1 : -1;
        this.eF = aa2;
        this.cJ = true;
    }

    public final void J() {
        bq bq2;
        if ((Char.e().cf != null || Char.e().Npc != null || Char.e().cd != null || Char.e().D() != null) && this.aW.size() == 0) {
            return;
        }
        this.aW.removeAllElements();
        int n2 = 0;
        int n3 = GameScreen.j + 10;
        int n4 = GameScreen.j + GameCanvas.A - 10;
        int n5 = GameScreen.k + 10;
        int n6 = GameScreen.k + GameScreen.e;
        int n7 = 0;
        while (n7 < GameScreen.D.size()) {
            bq2 = (Char)GameScreen.D.elementAt(n7);
            if (((Char)bq2).H != 15 && !((Char)bq2).bc && n3 <= ((Char)bq2).B && ((Char)bq2).B <= n4 && n5 <= ((Char)bq2).C && ((Char)bq2).C <= n6 && ((Char)bq2).J != -114 && (bv.Res != 129 || bv.Res == 129 && Char.e().C > 264)) {
                this.aW.addElement(bq2);
                if (this.aU != null && bq2.equals(this.aU)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        if (this.aq && this.I()) {
            ds.c("co the tan cong nguoi");
            n7 = 0;
            while (n7 < GameScreen.F.size()) {
                bq2 = (Mob)GameScreen.F.elementAt(n7);
                GameScreen.j();
                if (!GameScreen.LoginScreen((Mob)bq2)) {
                    ds.c("khong the tan cong quai");
                    this.aQ = null;
                } else {
                    ds.c("co the tan ong quai");
                    this.aW.addElement(bq2);
                    if (this.aQ != null) {
                        n2 = this.aW.size();
                    }
                }
                ++n7;
            }
            this.aT = null;
            this.aV = null;
            if (this.aW.size() > 0) {
                if (n2 >= this.aW.size()) {
                    n2 = 0;
                }
                this.LoginScreen(this.aW.elementAt(n2));
                return;
            }
            this.aQ = null;
            this.az();
            this.aU = null;
            this.aV = null;
            cn = false;
            return;
        }
        n7 = 0;
        while (n7 < GameScreen.E.size()) {
            bq2 = (ItemMap)GameScreen.E.elementAt(n7);
            if (n3 <= ((ItemMap)bq2).LoginScreen && ((ItemMap)bq2).LoginScreen <= n4 && n5 <= ((ItemMap)bq2).b && ((ItemMap)bq2).b <= n6) {
                this.aW.addElement(bq2);
                if (this.aV != null && bq2.equals(this.aV)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < GameScreen.F.size()) {
            bq2 = (Mob)GameScreen.F.elementAt(n7);
            if (((Mob)bq2).GameScreen != 1 && ((Mob)bq2).GameScreen != 0 && n3 <= ((Mob)bq2).m && ((Mob)bq2).m <= n4 && n5 <= ((Mob)bq2).n && ((Mob)bq2).n <= n6) {
                this.aW.addElement(bq2);
                if (this.aQ != null && bq2.equals(this.aQ)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < GameScreen.G.size()) {
            bq2 = (_do)GameScreen.G.elementAt(n7);
            if (((Char)bq2).H != 15 && n3 <= ((Char)bq2).B && ((Char)bq2).B <= n4 && n5 <= ((Char)bq2).C && ((Char)bq2).C <= n6) {
                this.aW.addElement(bq2);
                if (this.aT != null && bq2.equals(this.aT)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        if (this.aW.size() > 0) {
            if (n2 >= this.aW.size()) {
                n2 = 0;
            }
            this.LoginScreen(this.aW.elementAt(n2));
            return;
        }
        this.aQ = null;
        this.az();
        this.aU = null;
        this.aV = null;
        cn = false;
    }

    private void az() {
        if (this.aq && this.aT != null) {
            if (!GameCanvas.F.LoginScreen) {
                x = null;
            }
            this.aT = null;
        }
    }

    private void aA() {
        if (GameCanvas.isLowGraphic) {
            return;
        }
        if (bv.LoginScreen(this.B, this.C + 1, 1024)) {
            bv.b(this.B, this.C + 1, 512);
            bv.b(this.B, this.C - 2, 512);
        }
        if (bv.LoginScreen(this.B - bv.i, this.C + 1, 512)) {
            bv.c(this.B - bv.i, this.C + 1, 512);
            bv.c(this.B - bv.i, this.C - 2, 512);
        }
        if (bv.LoginScreen(this.B + bv.i, this.C + 1, 512)) {
            bv.c(this.B + bv.i, this.C + 1, 512);
            bv.c(this.B + bv.i, this.C - 2, 512);
        }
    }

    public final void methodLoginScreen(long l2, long l3, boolean bl2, boolean bl3) {
        this.ae = bl2;
        this.ad = bl3;
        this.U -= l2;
        this.T -= l3;
        GameScreen.j().bE = true;
        GameScreen.j().bD = 0L;
        GameScreen.j().bB = true;
        GameScreen.j().bA = 0L;
        if (this.U < 0L) {
            this.U = 0L;
        }
        if (this.T < 0L) {
            this.T = 0L;
        }
        if (bl3 || !bl3 && this.aN != 4 && 0L != -100L) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            String string;
            if (l2 <= 0L) {
                if (this.aq) {
                    string = T.cF;
                    n6 = this.B;
                    n5 = this.C - this.al;
                    n4 = 0;
                    n3 = -2;
                    n2 = 7;
                } else {
                    string = T.cF;
                    n6 = this.B;
                    n5 = this.C - this.al;
                    n4 = 0;
                    n3 = -2;
                    n2 = 4;
                }
            } else {
                string = "-" + l2;
                n6 = this.B;
                n5 = this.C - this.al;
                n4 = 0;
                n3 = -2;
                n2 = !bl2 ? 0 : 3;
            }
            GameScreen.LoginScreen(string, n6, n5, n4, n3, n2);
        }
        if (l2 > 0L) {
            this.ek = (byte)6;
        }
        at.LoginScreen(80, this, 1);
        if (this.Char) {
            this.Char = false;
            bH = false;
            this.LoginScreen((short)this.cl, (short)this.cm);
        }
    }

    public final void K() {
        GameScreen.j().bE = true;
        GameScreen.j().bD = 0L;
        GameScreen.j().bB = true;
        GameScreen.j().bA = 0L;
        this.ek = (byte)6;
        at.LoginScreen(8, this, 1);
        this.dL = true;
        this.dK = 0;
    }

    public final void methodLoginScreen(short s2, short s3) {
        this.cE = 0;
        this.cG = false;
        if (this.aq && this.Char) {
            return;
        }
        if (this.aq) {
            this.bJ = true;
            int n2 = 0;
            while (n2 < GameScreen.D.size()) {
                Char af2 = (Char)GameScreen.D.elementAt(n2);
                ((Char)GameScreen.D.elementAt(n2)).Screen = -9999;
                ++n2;
            }
            if (GameCanvas.G != null && GameCanvas.G.ai != null) {
                GameCanvas.G.ai = null;
            }
            if (GameCanvas.H != null && GameCanvas.H.ai != null) {
                GameCanvas.H.ai = null;
            }
        }
        this.H = 5;
        this.d = s2;
        this.G = s3;
        this.F = 0;
        this.U = 0L;
        this.ba = -9999;
        this.Screen = -9999;
        if (this.aq && this.aC != null && this.aC.LoginScreen.LoginScreen != 14) {
            this.C();
        }
        this.aN = 0;
    }

    public final void b(short s2, short s3) {
        this.co = s2;
        this.cp = s3;
    }

    public final void L() {
        this.U = this.V;
        this.T = this.W;
        this.H = 1;
        this.G = 0;
        this.d = 0;
        this.F = 0;
        at.LoginScreen(109, this, 2);
        GameScreen.j().cn = null;
        GameScreen.O = true;
    }

    public final boolean M() {
        if (this.aF == null) {
            return false;
        }
        int n2 = 0;
        while (n2 < this.aF.length) {
            if (this.aF[n2] != null && this.aF[n2].b.b == 6) {
                GameService.LoginScreen().LoginScreen((byte)0, (byte)1, (byte)-1, this.aF[n2].b.LoginScreen);
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static boolean aB() {
        return bv.Res == 1 || bv.Res == 27 || bv.Res == 72 || bv.Res == 10 || bv.Res == 17 || bv.Res == 22 || bv.Res == 32 || bv.Res == 38 || bv.Res == 43 || bv.Res == 48;
    }

    public final boolean c(Char af2) {
        if (af2 == null || Char.e().aC == null || Char.e().aC.LoginScreen.e == 2 || Char.e().aC.LoginScreen.e == 4 && af2.H != 14 && af2.H != 5) {
            return false;
        }
        return (af2.aN == 3 && Char.e().aN == 3 || Char.e().aN == 5 || af2.aN == 5 || Char.e().aN == 1 && af2.aN == 1 || Char.e().aN == 4 && af2.aN == 4 || Char.e().ba >= 0 && Char.e().ba == af2.J || Char.e().Screen >= 0 && Char.e().Screen == af2.J && !Char.aB() || af2.Screen >= 0 && af2.Screen == Char.e().J && !Char.aB() || Char.e().by == 8 && af2.by != 0 || Char.e().by != 0 && af2.by == 8 || Char.e().by != af2.by && Char.e().by != 0 && af2.by != 0) && af2.H != 14 && af2.H != 5;
    }

    public static void N() {
        Char.e().aD = null;
        int n2 = 0;
        while (n2 < Char.e().aF.length) {
            if (Char.e().aF[n2] != null && Char.e().aF[n2].b.b == 8) {
                Char.e().aF[n2] = null;
            }
            ++n2;
        }
        _do.Mob();
    }

    public final int Res() {
        return this.B;
    }

    public final int m() {
        return this.C;
    }

    public final int n() {
        return 32;
    }

    public final int o() {
        return 24;
    }

    public final void methodLoginScreen(Object object) {
        if (object instanceof Mob) {
            this.aQ = (Mob)object;
            this.az();
            this.aU = null;
            this.aV = null;
        } else if (object instanceof _do) {
            Char.e().aQ = null;
            Char.e().az();
            Char.e().aT = (_do)object;
            Char.e().aU = null;
            Char.e().aV = null;
        } else if (object instanceof Char) {
            Char.e().aQ = null;
            Char.e().az();
            Char.e().aU = (Char)object;
            Char.e().aV = null;
        } else if (object instanceof ItemMap) {
            Char.e().aQ = null;
            Char.e().az();
            Char.e().aU = null;
            Char.e().aV = (ItemMap)object;
        }
        cn = true;
    }

    public final void GameScreen() {
    }

    public final boolean q() {
        return false;
    }

    public final boolean O() {
        return this.aQ != null || this.aU != null && this.c(this.aU);
    }

    private void e(int n2) {
        if (!GameCanvas.isLowGraphic) {
            if (n2 == 1) {
                ea ea2 = new ea(19, this.B - 5, this.C + 20, 2, 1, -1);
                ei.LoginScreen(ea2);
                return;
            }
            if (n2 == 2) {
                if (this.aq && this.cE == 1) {
                    return;
                }
                if (this.u && GameCanvas.w % 5 == 0) {
                    ea ea3 = new ea(22, this.B - 5, this.C + 35, 2, 1, -1);
                    ei.LoginScreen(ea3);
                    return;
                }
            } else if (n2 == 3 && this.cm - this.C <= 5) {
                ea ea4 = new ea(19, this.B - 5, this.cm + 20, 2, 1, -1);
                ei.LoginScreen(ea4);
            }
        }
    }

    public static boolean methodLoginScreen(byte by2) {
        boolean bl2 = true;
        int n2 = 0;
        while (n2 < GameScreen.H.size()) {
            ep ep2 = (ep)GameScreen.H.elementAt(n2);
            if (ep2 != null) {
                if (ep2.LoginScreen == by2) {
                    return true;
                }
                bl2 = false;
            }
            ++n2;
        }
        return bl2;
    }

    public final void P() {
        if (this.cJ) {
            this.cJ = false;
            this.eE = null;
            this.eF = null;
            return;
        }
        this.cI = 0;
        this.eE = null;
        this.eF = null;
    }

    public final void Q() {
        this.cK = false;
        this.dI = null;
    }

    public final void R() {
        this.cO = false;
    }

    public final void S() {
        if (this.cI != 0) {
            this.cI = 0;
        }
        if (this.cJ) {
            this.cJ = false;
        }
        if (this.cK) {
            this.cK = false;
        }
        this.dI = null;
        this.eE = null;
        this.eF = null;
        this.cO = false;
        this.cQ = false;
    }

    public final void methodLoginScreen(short s2, short s3, byte by2) {
        this.eH = true;
        this.eJ = s2;
        this.eK = s3;
        this.eL = by2;
        this.eI = 0;
        if (this.aq) {
            if (GameCanvas.G != null) {
                GameCanvas.G.A();
            }
            if (GameCanvas.H != null) {
                GameCanvas.H.A();
            }
        }
    }

    public final void T() {
        this.cN = false;
    }

    public final void U() {
        this.cL = false;
        bH = false;
        this.cM = 0;
    }

    public final void b(byte by2) {
        this.cM = 0;
        if (by2 == 4 || by2 == 5) {
            if (this.aq) {
                GameService.LoginScreen().Item(by2);
            }
            ei.LoginScreen(new ea(34, this.B, this.C + 12, 2, 1, -1));
        }
        if (by2 == 6) {
            ei.LoginScreen(new ea(38, this.B, this.C + 12, 2, 1, -1));
        }
        if (this.aq) {
            GameCanvas.G.z();
            bH = true;
        }
        this.cL = true;
        if (by2 == 1) {
            this.u = false;
            return;
        }
        this.u = true;
    }

    public final void V() {
        this.cQ = false;
    }

    public final void W() {
        this.eM = this.bU;
        this.eN = this.bW;
        this.eO = this.bV;
        this.eP = this.bX;
    }

    public final void methodLoginScreen(int n2, int n3, int n4, int n5) {
        if (n2 != -1) {
            this.bU = n2;
        }
        if (n3 != -1) {
            this.bW = n3;
        }
        if (n4 != -1) {
            this.bV = n4;
        }
        if (n5 != -1) {
            this.bX = n5;
        }
    }

    public final void X() {
        if (this.eM != -1) {
            this.bU = this.eM;
            this.eM = -1;
        }
        if (this.eN != -1) {
            this.bW = this.eN;
            this.eN = -1;
        }
        if (this.eO != -1) {
            this.bV = this.eO;
            this.eO = -1;
        }
        if (this.eP != -1) {
            this.bX = this.eP;
            this.eP = -1;
        }
    }

    private ea f(int n2) {
        int n3 = 0;
        while (n3 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n3);
            if (ea2.LoginScreen == n2) {
                return ea2;
            }
            ++n3;
        }
        return null;
    }

    public final void methodLoginScreen(ea ea2) {
        this.b(0, ea2.LoginScreen);
        this.eQ.addElement(ea2);
    }

    public final void b(int n2, int n3) {
        if (n2 == -1) {
            this.eQ.removeAllElements();
            return;
        }
        if (this.f(n3) != null) {
            this.eQ.removeElement(this.f(n3));
        }
    }

    private void methodItem(mGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.Item == 0) {
                boolean bl2 = true;
                if (ea2.i == 0) {
                    bl2 = this.H == 1 || this.H == 6;
                }
                if (bl2) {
                    ea2.LoginScreen(en2);
                }
            }
            ++n2;
        }
    }

    private void i(mGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.Item == 1) {
                boolean bl2 = true;
                if (ea2.i == 0) {
                    bl2 = this.H == 1 || this.H == 6;
                }
                if (bl2) {
                    ea2.LoginScreen(en2);
                }
            }
            ++n2;
        }
    }

    private void aC() {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ((ea)this.eQ.elementAt(n2)).LoginScreen();
            ++n2;
        }
    }

    public final int Y() {
        return this.RMS + this.T;
    }

    private void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5) {
        if (this.bU == 934 && (this.H == 1 || this.H == 6)) {
            if (eR == null || Char.eR.d == null) {
                Image image = Res.loadImage("/redeye.png");
                eR = new df(image, 14, 10);
                return;
            }
            if (this.eW[this.eS] != -1) {
                int n6 = 8;
                if (n4 == 2) {
                    n6 = -8;
                }
                eR.LoginScreen(this.eW[this.eS], n2 + n6, n3 + 15, n4, n5, en2);
            }
        }
    }

    private static boolean g(int n2) {
        int n3 = 0;
        while (n3 < cU.length) {
            if (cU[n3][0] == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    private void aD() {
        block3: {
            block2: {
                if (!Char.g(this.bU)) break block2;
                ++this.eX;
                if (this.eX <= 10000) break block3;
            }
            this.eX = 0;
        }
    }

    private int Item(int n2) {
        int n3 = 0;
        while (n3 < cU.length) {
            if (cU[n3][0] == n2) {
                n2 = cU[n3][this.eX / 4 % cU[n3].length];
                return n2;
            }
            ++n3;
        }
        return n2;
    }

    private void b(mGraphics en2, int n2, int n3) {
        try {
            if (this.cZ == -1) {
                return;
            }
            if (Char.i(n2)) {
                if (this.fe != null) {
                    this.fe.LoginScreen(GameCanvas.w / 4 % this.fe.c, this.B + fj[n2][0] * (this.I == 1 ? 1 : -1), n3 + fj[n2][1], this.I == 1 ? 0 : 2, 33, en2);
                    return;
                }
                this.fe = Res.currentTimeMillis(String.valueOf(this.fg) + this.fi + this.cZ);
                return;
            }
            if (this.fc != null) {
                this.fc.LoginScreen(GameCanvas.w / 4 % this.fc.c, this.B + fj[n2][0] * (this.I == 1 ? 1 : -1), n3 + fj[n2][1], this.I == 1 ? 0 : 2, 33, en2);
                return;
            }
            this.fc = Res.currentTimeMillis(String.valueOf(this.fg) + this.cZ);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean i(int n2) {
        return n2 == 2 || n2 == 3 || n2 == 4 || n2 == 5 || n2 == 6 || n2 == 9 || n2 == 10 || n2 == 13 || n2 == 14 || n2 == 15 || n2 == 16 || n2 == 26 || n2 == 27 || n2 == 28 || n2 == 29;
    }

    public final void methodLoginScreen(short s2) {
        short s3 = -1;
        short s4 = -1;
        if (this.aQ != null) {
            s3 = (short)this.aQ.m;
            s4 = (short)this.aQ.n;
        }
        if (this.aU != null && !this.aU.ev && !this.aU.ew) {
            s3 = (short)this.aU.B;
            s4 = (short)this.aU.C;
        }
        GameService.LoginScreen().LoginScreen((byte)s2, (byte)this.I, s3, s4);
    }

    public final void methodLoginScreen(short s2, boolean bl2, byte by2, byte by3, byte by4, short s3, byte by5) {
        this.db = true;
        this.fl = GameCanvas.b + 10000L;
        this.fn = s2;
        this.fk = bl2;
        this.fm = by2;
        this.I = by4;
        this.fr = 0;
        this.fs = 0;
        long l2 = Res.currentTimeMillis();
        if (this.aq) {
            this.aC.f = l2;
            this.T = this.aC.LoginScreen.d == 2 ? 1L : (this.aC.LoginScreen.d != 1 ? (this.T -= (long)this.aC.i) : (this.T -= (long)this.aC.i * this.W / 100L));
            --Char.e().bf;
            GameScreen.j().bB = true;
            GameScreen.j().bA = 0L;
            if (this.T < 0L) {
                this.T = 0L;
            }
        }
        if (s2 == 24) {
            GameScreen.LoginScreen(18, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.LoginScreen(21, 0, by3, this.Z(), null, 1, s3, (short)0);
        } else if (s2 == 25) {
            GameScreen.LoginScreen(19, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.LoginScreen(22, 0, by3, this.Z(), null, 1, s3, (short)0);
        } else if (s2 == 26) {
            GameScreen.LoginScreen(20, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.LoginScreen(23, 0, by3, this.Z(), null, 1, s3, (short)0);
        }
        if (this.fm == 1) {
            if (!this.fk) {
                this.fo = new byte[]{20, 20, 20, 20, 20, 20, 19};
                this.fp = new byte[]{20};
                this.fq = new byte[1];
            } else {
                this.fo = new byte[]{31, 31, 31, 31, 31, 31, 30};
                this.fp = new byte[]{31};
                this.fq = new byte[]{12};
            }
        }
        if (this.fm == 2) {
            if (!this.fk) {
                this.fo = new byte[]{20};
                this.fp = new byte[]{13, 13, 13, 14, 14, 14};
                this.fq = new byte[1];
            } else {
                this.fo = new byte[]{31};
                this.fp = new byte[]{26, 26, 26, 27, 27, 27};
                this.fq = new byte[]{12};
            }
        }
        if (this.fm == 4) {
            if (!this.fk) {
                this.fo = new byte[]{17, 17, 17, 18, 18, 18};
                this.fp = new byte[]{18};
                this.fq = new byte[1];
            } else {
                this.fo = new byte[]{7, 7, 7, 12, 12, 12, 12};
                this.fp = new byte[]{12};
                this.fq = new byte[]{12};
            }
        }
        if (this.fm == 3) {
            if (!this.fk) {
                this.fo = new byte[]{24, 24, 24, 17, 17, 17, 18, 18, 18};
                this.fp = new byte[]{20};
                this.fq = new byte[1];
                return;
            }
            this.fo = new byte[]{23, 23, 23, 7, 7, 7, 12, 12, 12, 12};
            this.fp = new byte[]{31};
            this.fq = new byte[]{12};
        }
    }

    public final void methodLoginScreen(int n2, short s2, bk bk2, short s3, short s4, byte by2, bk[] bkArray, byte by3) {
        this.fs = n2;
        this.fn = s2;
        this.fr = 0;
        this.ft = bk2;
        this.fu = Res.currentTimeMillis() + (long)s3;
        if (this.fs != 1) {
            return;
        }
        if (this.fn == 24) {
            GameScreen.LoginScreen(18, 1, by2, this, null, 3, s3, (short)0);
            GameScreen.LoginScreen(24, 0, by2, this, this.ft, 1, s3, s4);
        }
        if (this.fn == 25) {
            GameScreen.LoginScreen(19, 0, by2, this, null, 3, s3, (short)0);
            GameScreen.LoginScreen(25, 0, by2, this, this.ft, 1, s3, s4);
        }
        if (this.fn == 26) {
            GameScreen.LoginScreen(20, 0, by2, this, null, 3, s3, (short)0);
            GameScreen.LoginScreen(26, by3, by2, bk2.b, bk2.c, 1, 0, s3, bkArray);
        }
    }

    public final Char Z() {
        Char af2 = new Char();
        new Char().J = this.J;
        af2.B = this.B;
        af2.C = this.C;
        af2.I = this.I;
        if (this.aH != null) {
            af2.aH = new Item[this.aH.length];
            int n2 = 0;
            while (n2 < this.aH.length) {
                if (this.aH[n2] == null) {
                    af2.aH[n2] = null;
                } else {
                    Item[] hArray = af2.aH;
                    Item h2 = this.aH[n2];
                    Item h3 = new Item();
                    new Item().b = h2.b;
                    if (h2.c != null) {
                        h3.c = new MyVector("item.options");
                        int n3 = 0;
                        while (n3 < h2.c.size()) {
                            ee ee2 = new ee();
                            new ee().c = ((ee)h2.c.elementAt((int)n3)).c;
                            ee2.LoginScreen = ((ee)h2.c.elementAt((int)n3)).LoginScreen;
                            h3.c.addElement(ee2);
                            ++n3;
                        }
                    }
                    h3.d = h2.d;
                    h3.e = h2.e;
                    h3.g = h2.g;
                    h3.Item = h2.Item;
                    h3.k = h2.k;
                    h3.Res = h2.Res;
                    h3.m = h2.m;
                    h3.n = h2.n;
                    h3.o = h2.o;
                    h3.GameScreen = h2.GameScreen;
                    h3.q = h2.q;
                    h3.r = h2.r;
                    h3.w = h2.w;
                    h3.x = h2.x;
                    hArray[n2] = h3;
                }
                ++n2;
            }
        }
        return af2;
    }

    public final boolean b(int n2) {
        if (this.aH != null) {
            n2 = 0;
            while (n2 < this.aH.length) {
                if (this.aH[n2] != null && this.aH[n2].b != null && this.aH[n2].b.LoginScreen == 1265) {
                    return true;
                }
                ++n2;
            }
        }
        ds.b("tim kiem id cai trang " + 1265 + " ko tim thay");
        return false;
    }
}

