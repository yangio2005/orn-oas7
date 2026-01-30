/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameCanvas;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GameWorld
implements bq {
    public String o;
    public String GameScreen;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    private int a;
    private int IActionListener;
    private int c;
    public boolean u;
    public Dialog v;
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
    public long aa;
    public long ab;
    public long MessageHandler;
    public boolean ad;
    public boolean ae;
    public boolean GameWorld;
    public String ag = "";
    public int ah;
    public eh ai;
    public byte aj;
    public int ak = 22;
    public int al = 32;
    public int am = 11;
    private int f = 16;
    public Command an;
    public boolean ao = true;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    private boolean UIPanel;
    public int as;
    private int h;
    public long at;
    public int au;
    public int RMSManager;
    public int GameStrings;
    public Dart ax;
    public Command ay;
    public LoggingList az = new LoggingList("vSkill");
    public LoggingList aA = new LoggingList("vSkillFight");
    public LoggingList aB = new LoggingList("vEff char");
    public Skill aC;
    public ai aD;
    private boolean i = true;
    public ao[] aE;
    public h[] aF;
    public h[] aG;
    public h[] aH;
    public Skill[] aI;
    public h[][] aJ;
    public String[][] aK;
    public short[][] aL;
    public byte aM;
    public byte aN;
    public int aO;
    public int aP;
    public aa aQ;
    public aa aR;
    public int aS;
    public TextBox aT;
    public GameWorld aU;
    public ce aV;
    public LoggingList aW = new LoggingList("focus");
    public aa[] aX;
    public GameWorld[] aY;
    public short[] aZ;
    public int ba = -9999;
    public int Screen = -9999;
    private byte j;
    public boolean bc;
    public boolean IConnectionListener = true;
    public LoggingList be = new LoggingList("taskOrders");
    public int bf;
    public static short[] bg;
    public static short[] bh;
    public String[] bi;
    public String bj;
    private static Image k;
    private static Image ResourceUtil;
    public boolean bk = false;
    public boolean bl;
    public int bm;
    public int bn;
    public long bo;
    private long m;
    public long bp;
    public boolean bq;
    public static Vector NetworkService;
    public static short bs;
    public short GameService = 0;
    public boolean SettingsManager;
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
    private byte[] do;
    private int dp;
    private int dq;
    private int dr;
    private int MathUtil;
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
    private static GameWorld dD;
    private static GameWorld dE;
    private int dF;
    public int bD;
    public int bE;
    public LoggingList bF;
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
    public Menu bP;
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
    private int ed;
    private int ee;
    private cp ef;
    private cp eg;
    private cp eh;
    public UIItem cc;
    public bj cd;
    public boolean ce;
    public ItemTemplate cf;
    public ItemTemplate cg;
    private cu[] ei;
    private int ej;
    private byte ek;
    public boolean ch;
    public boolean ci;
    public boolean cj;
    private int LoggingList;
    private int em;
    private boolean MGraphics;
    boolean ck;
    private long Pos;
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
    private RMSManager ey;
    private RMSManager ez;
    private RMSManager eA;
    private int eB;
    private int eC;
    private int eD;
    public static boolean cn;
    private GameWorld eE;
    private aa eF;
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
    private LoggingList eQ;
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
    private Frame eZ;
    private Frame fa;
    private String fb;
    public short cY;
    private Frame fc;
    private Frame fd;
    private Frame fe;
    private Frame ff;
    private String fg;
    private String fh;
    private String fi;
    public short cZ;
    private static int[][] fj;
    public static short[] da;
    public boolean IMessageHandler;
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
    public int Command;
    private Frame fw;

    static {
        k = ResourceUtil.IActionListener("/mainImage/myTexture2dat-trai-dat.png");
        ResourceUtil = ResourceUtil.IActionListener("/mainImage/myTexture2dmat-namek.png");
        NetworkService = new Vector();
        bs = (short)30000;
        n = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi10.png");
        df = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi20.png");
        BaseCanvas = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi21.png");
        dh = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi30.png");
        mFont = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi11.png");
        dj = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi22.png");
        dk = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi23.png");
        dl = ResourceUtil.IActionListener("/mainImage/myTexture2dthucuoi31.png");
        dm = ResourceUtil.IActionListener("/mainImage/myTexture2drong.png");
        dn = ResourceUtil.IActionListener("/mainImage/myTexture2dcanhrong.png");
        ResourceUtil.c("/mainImage/glass0.png");
        ResourceUtil.c("/mainImage/glass1.png");
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

    public final void IActionListener() {
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

    private int aa() {
        if (this.aC != null) {
            return this.aC.UIPanel;
        }
        return 0;
    }

    private int ab() {
        if (this.aC != null) {
            return this.aC.h;
        }
        return 0;
    }

    public static void a(boolean bl2) {
        ai ai2 = GameWorld.e().aD;
        String string = ai2.UIPanel[ai2.a];
        if (string != null && !string.equals("")) {
            if (string.startsWith("#")) {
                string = ai.a(string, "#", "");
                do do_ = new TextBox(5, 0, -100, -100, 5, GameScreen.aD.a[GameWorld.e().K][2]);
                do_.C = -100;
                new TextBox(5, 0, -100, -100, 5, GameScreen.aD.a[GameWorld.e().K][2]).B = -100;
                do_.aO = GameScreen.aD.a[GameWorld.e().K][2];
                do_.J = 5;
                if (main.GameCanvas.E == GameScreen.c) {
                    ae.a(string, do_);
                }
            } else {
                GameScreen.aD.a(string, 0);
            }
        }
        GameScreen.O = true;
        MathUtil.c("TASKx " + GameWorld.e().aD.c);
        GameWorld.e().ao = GameWorld.e().aD.c > 2;
        GameScreen.j().cm = null;
        if (ai2.c == 0) {
            v.f = false;
            v.h = false;
            GameScreen.j().co = null;
            GameScreen.O = false;
            GameScreen.j().cm = null;
            if (ai2.a < 4) {
                k.j = false;
                GameScreen.bn = -1;
            }
            if (ai2.a == 4) {
                GameScreen.bn = 1;
                k.j = true;
            }
            if (ai2.a >= 5) {
                GameScreen.j().co = GameScreen.j().s;
            }
        }
        if (ai2.c == 1) {
            GameScreen.O = true;
        }
        if (ai2.c > 0) {
            GameScreen.j().co = GameScreen.j().s;
            GameScreen.j().cm = GameScreen.j().aR;
        }
        UIPanel.as = ai2.c >= 0;
        main.GameCanvas.G.D = ai2.c < 12 ? GameStrings.aN : GameStrings.aO;
        main.GameCanvas.G.M[0] = main.GameCanvas.G.D;
        if (GameWorld.dD.aD.c > 10) {
            RMSManager.a("fake", "aa");
        }
    }

    public final String c() {
        String string = String.valueOf(this.bi[this.Q]) + "+" + this.Z / 100L + "." + this.Z % 100L + "%";
        if (string.length() > 23 && string.indexOf("c\u1ea5p ") >= 0) {
            string = MathUtil.a(string, "c\u1ea5p ", "c");
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

    public final void a(String string, short s2, short s3, short s4) {
        this.bL = s2;
        this.bK = string;
        this.bM = s3;
        this.bN = s4;
        MathUtil.c("sc= " + s4 + " max= " + s3);
        this.dG = this.dH = System.currentTimeMillis();
    }

    public final void a(String string) {
        if (this.z == null) {
            this.z = new ej();
        }
        this.z.a(string, 0, null, false);
    }

    public GameWorld() {
        byte[] byArray = new byte[8];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 1;
        byArray[7] = 1;
        this.do = byArray;
        this.bF = new LoggingList("vMovePoints");
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
        this.cc = null;
        this.cd = null;
        this.ce = false;
        this.ch = false;
        this.ci = false;
        this.cj = false;
        this.em = 0;
        this.Pos = 0L;
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
        this.eQ = new LoggingList("vEff");
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

    public static GameWorld e() {
        if (dD == null) {
            dD = new GameWorld();
            new GameWorld().aq = true;
            GameWorld.dD.ap = true;
        }
        return dD;
    }

    public static GameWorld f() {
        if (dE == null) {
            dE = new GameWorld();
            new GameWorld().aq = false;
        }
        return dE;
    }

    public static void UIPanel() {
        dD = null;
    }

    public final void h() {
        try {
            h h2;
            LoggingList el2 = new LoggingList("items");
            int n2 = 0;
            while (n2 < this.aG.length) {
                h2 = this.aG[n2];
                if (h2 != null && h2.IActionListener.h && !h2.x) {
                    el2.addElement(h2);
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < el2.size()) {
                h2 = (h)el2.elementAt(n2);
                if (h2 != null) {
                    int n3 = n2 + 1;
                    while (n3 < el2.size()) {
                        h h3 = (h)el2.elementAt(n3);
                        if (h3 != null && h2.IActionListener.equals(h3.IActionListener) && h2.k == h3.k) {
                            h2.h += h3.h;
                            this.aG[h3.UIPanel] = null;
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
                            this.aG[n4].UIPanel = n4;
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
            MathUtil.c("Char.boxSort()");
            return;
        }
    }

    public final bf a(et et2) {
        int n2 = 0;
        while (n2 < this.az.size()) {
            if (((Skill)this.az.elementAt((int)n2)).GameCanvas.a == et2.a) {
                return (Skill)this.az.elementAt(n2);
            }
            ++n2;
        }
        return null;
    }

    public final bw i() {
        ai ai2 = GameWorld.dD.aD;
        if (ai2 != null && ai2.c == 0 && ai2.a < 6) {
            return null;
        }
        int n2 = bv.t.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.t.elementAt(n3);
            if (bo.GameCanvas.size() >= n2) {
                bo bo2 = (bo)bo.GameCanvas.elementAt(n3);
                if (!bo2.j) {
                    return null;
                }
            }
            if (this.B >= bw2.a && this.B <= bw2.c && this.C >= bw2.IActionListener && this.C <= bw2.d && bw2.e && bw2.f) {
                return bw2;
            }
            n3 = (byte)(n3 + 1);
        }
        return null;
    }

    public final bw j() {
        ai ai2 = GameWorld.dD.aD;
        if (ai2 != null && ai2.c == 0 && ai2.a < 6) {
            return null;
        }
        int n2 = bv.t.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.t.elementAt(n3);
            if (bo.GameCanvas.size() >= n2) {
                bo bo2 = (bo)bo.GameCanvas.elementAt(n3);
                if (!bo2.j) {
                    return null;
                }
            }
            if (this.B >= bw2.a && this.B <= bw2.c && this.C >= bw2.IActionListener && this.C <= bw2.d && bw2.e && !bw2.f) {
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
        if (this.s || this.t) {
            return false;
        }
        int n2 = bv.t.size();
        int n3 = 0;
        while (n3 < n2) {
            bw bw2 = (bw)bv.t.elementAt(n3);
            if ((bv.ResourceUtil == 47 || bv.f()) && this.C <= bw2.IActionListener + bw2.d && this.B > bw2.a && this.B < bw2.c) {
                return !bv.f() || this.aN == 0;
            }
            if (this.B >= bw2.a && this.B <= bw2.c && this.C >= bw2.IActionListener && this.C <= bw2.d && !bw2.e) {
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
        if (this.aq && this.H == 10 && this.as == 8 && this.dP > 20 && main.GameCanvas.w % 20 == 0) {
            SettingsManager.a();
        }
        if (this.cf == null) return;
        if (this.D() == null) return;
        if (this.cb >= this.D().length) return;
        GameWorld af2 = this;
        if (af2.cf == null) return;
        if (af2.cf.a >= 0 && af2.cf.a <= 6) {
            bl2 = true;
        } else if (af2.cf.a >= 14 && af2.cf.a <= 20) {
            bl2 = true;
        } else if (af2.cf.a >= 28 && af2.cf.a <= 34) {
            bl2 = true;
        } else {
            if (af2.cf.a < 63) return;
            if (af2.cf.a > 69) return;
            bl2 = true;
        }
        if (!bl2) return;
        if (!this.aq) {
            if (this.aq) return;
            if (this.B < GameScreen.j) return;
            if (this.B > GameScreen.j + main.GameCanvas.A) return;
        }
        if (main.GameCanvas.w % 5 != 0) return;
        if (this.as == 9 || this.as == 10 || this.as == 11) {
            SettingsManager.a();
            return;
        }
        SettingsManager.a();
    }

    /*
     * Unable to fully structure code
     */
    public void a() {
        block274: {
            block273: {
                if (this.dc) {
                    this.as = 23;
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
                    if (main.GameCanvas.w % 3 == 0) {
                        if (GameWorld.e().I == 1) {
                            this.v.h = this.B - 20;
                        }
                        if (GameWorld.e().I == -1) {
                            this.v.h = this.B + 20;
                        }
                        this.v.d = this.C - 40;
                        this.v.IActionListener = this.v.i > this.B ? -1 : 1;
                        if (this.v.h < 100) {
                            this.v.h = 100;
                        }
                        if (this.v.h > bv.c - 100) {
                            this.v.h = bv.c - 100;
                        }
                    }
                    var1_1 = this.v;
                    var2_15 = this.v;
                    if (var2_15.e != var2_15.d) {
                        var2_15.UIPanel = var2_15.d - var2_15.e << 2;
                        var2_15.f += var2_15.UIPanel;
                        var2_15.e += var2_15.f >> 4;
                        var2_15.f &= 15;
                    }
                    if (var2_15.i != var2_15.h) {
                        var2_15.k = var2_15.h - var2_15.i << 2;
                        var2_15.j += var2_15.k;
                        var2_15.i += var2_15.j >> 4;
                        var2_15.j &= 15;
                    }
                    if (main.GameCanvas.w % 3 == 0) {
                        var1_1.c = var1_1.o[var1_1.GameScreen];
                        ++var1_1.GameScreen;
                    }
                    if (var1_1.GameScreen >= var1_1.o.length) {
                        var1_1.GameScreen = 0;
                    }
                }
                if (!this.aq && this.U <= 0L && this.ah != -100 && this.H != 14 && this.H != 5) {
                    this.a((short)this.B, (short)this.C);
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
                if (this.IMessageHandler) {
                    if (main.GameCanvas.IActionListener > this.fl || this.H == 14 || this.H == 5) {
                        this.fl = 0L;
                        this.IMessageHandler = false;
                    }
                    var1_1 = this;
                    if (var1_1.fs == 0) {
                        if (var1_1.fk && var1_1.fr < 20) {
                            var1_1.E = -3;
                            var1_1.C += var1_1.E;
                        }
                        var1_1.as = var1_1.fo.length == 1 ? var1_1.fo[0] : (var1_1.fr > var1_1.fo.length - 1 ? var1_1.fo[var1_1.fo.length - 1] : var1_1.fo[var1_1.fr]);
                    } else if (var1_1.fs == 1) {
                        var1_1.as = var1_1.fp[var1_1.fr % var1_1.fp.length];
                        if (ResourceUtil.d() - var1_1.fu > 0L) {
                            var1_1.a(2, (short)0, null, (short)0, (short)0, (byte)0, null, (byte)0);
                        }
                        if (var1_1.fr % 5 == 0) {
                            GameScreen.SettingsManager = 5;
                        }
                        if (var1_1.fm == 1 && var1_1.fr < 10 && !bv.a(var1_1.B - (var1_1.am + 1) * var1_1.I, var1_1.C, var1_1.I == 1 ? 8 : 4)) {
                            var1_1.B -= var1_1.I;
                        }
                    } else if (var1_1.fs == 2) {
                        var1_1.as = var1_1.fq.length == 1 ? var1_1.fq[0] : (var1_1.fr > var1_1.fq.length - 1 ? var1_1.fq[var1_1.fq.length - 1] : var1_1.fq[var1_1.fr]);
                        if (var1_1.fk) {
                            var1_1.E = 0;
                            var1_1.D = 0;
                            var1_1.H = 4;
                        }
                        var1_1.IMessageHandler = false;
                    }
                    ++var1_1.fr;
                    if (this.IConnectionListener) {
                        this.H();
                    }
                    return;
                }
                if (this.cQ && main.GameCanvas.w % 10 == 0) {
                    ei.a(new ea(41, this.B, this.C, 3, 1, 1));
                }
                if (this.cN) {
                    this.cN = false;
                    ei.a(new ea(39, this.B, this.C, 3, 3, 1));
                }
                if (this.cO && main.GameCanvas.w % 5 == 0) {
                    at.a(113, this, 1);
                }
                if (this.cK) {
                    var1_3 = this.eB + 73;
                    if (main.GameCanvas.w % 5 == 0) {
                        this.dI = new ea(33, this.B, var1_3, 3, 3, 1);
                    }
                    if (this.dI != null) {
                        this.dI.a();
                        this.dI.f = this.B;
                        this.dI.UIPanel = var1_3;
                    }
                }
                if (this.eG) {
                    if (this.dJ == null && (var1_1 = (String)main.GameCanvas.T.get(String.valueOf(this.J))) != null) {
                        var2_15 = MathUtil.a(var1_1.trim(), ",", 0);
                        var3_21 = Short.parseShort(var2_15[0]);
                        var1_4 = Short.parseShort(var2_15[1]);
                        this.dJ = new ea(var3_21, this.B, this.eB + 73, 1, -1, -1);
                        this.dJ.ResourceUtil = (long)(var1_4 * 1000) + ResourceUtil.d();
                    }
                    if (this.dJ != null) {
                        this.dJ.a();
                        this.dJ.f = this.B;
                        this.dJ.UIPanel = this.eB;
                        if (this.dJ.ResourceUtil <= ResourceUtil.d()) {
                            this.dJ = null;
                            main.GameCanvas.T.remove(String.valueOf(this.J));
                        }
                    }
                }
                if (this.aU != null && this.aU.C < 0) {
                    this.aU = null;
                }
                if (this.cL) {
                    ++this.cM;
                }
                if (this.u && main.GameCanvas.w % 25 == 0) {
                    at.a(114, this, 1);
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
                        MathUtil.c("set pox x= " + this.eJ + " Message= " + this.eK);
                        if (this.eL == 1) {
                            if (this.aq) {
                                this.bD = this.B;
                                this.bE = this.C;
                            }
                            this.bP = null;
                            this.cP = false;
                            at.a(173, this.B, this.C, 1);
                        } else {
                            at.a(60, this.B, this.C, 1);
                        }
                        if ((bv.IActionListener(this.B, this.C) & 2) == 2) {
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
                    if (main.GameCanvas.w % 5 == 0) {
                        at.a(113, this.B, this.C, 1);
                    }
                    this.as = 23;
                    var1_5 = System.currentTimeMillis();
                    if (var1_5 - this.bp >= 1000L) {
                        --this.bn;
                        this.bp = var1_5;
                        if (this.bn < 0) {
                            this.bk = false;
                            this.bm = 0;
                            if (this.aq) {
                                GameWorld.e().bJ = false;
                                GameScreen.j().aY = 0;
                                GameScreen.j().aZ = false;
                            }
                        }
                    }
                    if (bv.a(this.B / bv.i, this.C / bv.i) == 0) {
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
                    this.as = 17;
                    if (main.GameCanvas.w % 5 == 0) {
                        at.a(154, this.B, this.C - 10, 2);
                    }
                    if (main.GameCanvas.w % 5 == 0) {
                        at.a(1, this.B, this.C + 10, 1);
                    }
                    ++this.em;
                    if (this.em == 500) {
                        this.cG = false;
                        this.bJ = false;
                    }
                    return;
                }
                if (this.cj) {
                    ++this.em;
                    var1_6 = bv.a(GameWorld.e().B, GameWorld.e().C, 2) == false;
                    this.ae();
                    this.ah();
                    this.aZ = null;
                    this.bP = null;
                    this.as = 17;
                    if (var1_6 && this.K != 2) {
                        this.as = 12;
                    }
                    if (this.K == 2) {
                        if (bv.ResourceUtil == 170) {
                            if (main.GameCanvas.w % 2 == 0) {
                                if (this.I == 1) {
                                    at.a(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                                    at.a(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                                } else {
                                    at.a(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                                    at.a(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                                }
                            }
                        } else {
                            if (main.GameCanvas.w % 3 == 0) {
                                at.a(154, this.B, this.C - this.al / 2 + 10, 1);
                            }
                            if (main.GameCanvas.w % 5 == 0) {
                                at.a(114, this.B + MathUtil.IActionListener(-20, 20), this.C + MathUtil.IActionListener(-20, 20), 1);
                            }
                        }
                    }
                    if (this.K == 1 && main.GameCanvas.w % 2 == 0) {
                        if (this.I == 1) {
                            at.a(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                            at.a(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                        } else {
                            at.a(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                            at.a(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                        }
                    }
                    if (this.K == 0 && main.GameCanvas.w % 2 == 0) {
                        if (this.I == 1) {
                            at.a(70, this.B - 18, this.C - this.al / 2 + 8, 1);
                            at.a(70, this.B + 23, this.C - this.al / 2 + 15, 1);
                        } else {
                            at.a(70, this.B + 18, this.C - this.al / 2 + 8, 1);
                            at.a(70, this.B - 23, this.C - this.al / 2 + 15, 1);
                        }
                    }
                    this.m = System.currentTimeMillis();
                    MathUtil.c("  7.5 gong namekLazer " + this.ag + "_" + this.K);
                    if (this.m - this.bo > (long)this.bm || this.m - this.bo > 10000L) {
                        MathUtil.c("<*> 8  namekLazer gong xong " + this.ag);
                        this.C();
                        this.cj = false;
                        if (this.aq) {
                            if (this.K == 2) {
                                MathUtil.c("<*> 9 [me] xay da xong  " + GameWorld.e().aC.IActionListener);
                                GameWorld.e().a(GameScreen.u[GameWorld.e().aC.IActionListener], var1_6 == false ? 0 : 1);
                            }
                            if (this.K == 1) {
                                MathUtil.c("<*> 9 [me] namec xong " + GameWorld.e().aC.IActionListener);
                                this.ce = true;
                                GameWorld.e().a(GameScreen.u[GameWorld.e().aC.IActionListener], var1_6 == false ? 0 : 1);
                            }
                            if (this.K == 0) {
                                MathUtil.c("<*> 9 [me] namec xong " + GameWorld.e().aC.IActionListener);
                                GameWorld.e().a(GameScreen.u[GameWorld.e().aC.IActionListener], var1_6 == false ? 0 : 1);
                            }
                            if (GameWorld.e().aC.IActionListener >= 77 && GameWorld.e().aC.IActionListener <= 83) {
                                GameService.a().c((byte)4);
                            }
                            var2_16 = GameWorld.e().aC.IActionListener;
                        } else {
                            if (this.K == 2) {
                                this.a(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                MathUtil.c("<*> 10 xay da xong 111   " + this.aP);
                            }
                            if (this.K == 1) {
                                this.a(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                MathUtil.c("<*> 10 C_NAMEC xong 222   " + this.aP);
                            }
                            if (this.K == 0) {
                                this.a(GameScreen.u[this.aP], var1_6 == false ? 0 : 1);
                                MathUtil.c("<*> 10  C_TRAIDAT xong 333   " + this.aP);
                            }
                            var2_16 = this.aP;
                        }
                        if (this.K == 2 && this.H != 14 && this.H != 5 && (var2_16 < 77 || var2_16 > 83)) {
                            GameScreen.j().IActionListener(this.B, this.C);
                        }
                        MathUtil.c("<*> 11 Ho\u00e0n th\u00e0nh skill not focus -  STAND");
                    }
                    ++this.em;
                    if (this.em == 500) {
                        this.C();
                    }
                    return;
                }
                if (this.ci) {
                    this.ae();
                    this.ah();
                    this.aZ = null;
                    this.bP = null;
                    ++this.LoggingList;
                    if (bv.a(this.B, this.C - this.al, 8192)) {
                        this.C();
                        return;
                    }
                    if (this.LoggingList == 20) {
                        this.bo = System.currentTimeMillis();
                    }
                    MathUtil.c("<*> 11 UIPanel\u1ed3ng qua cau kinh khi  " + this.ag);
                    if (this.LoggingList > 20) {
                        this.m = System.currentTimeMillis();
                        if (this.m - this.bo > (long)this.bm || this.m - this.bo > 10000L) {
                            MathUtil.c("<*> 12 k\u1ebft th\u00fac skill  qua cau kinh khi \tFLY " + this.ag);
                            this.ci = false;
                            if (this.aq) {
                                this.ce = true;
                                var1_7 = bv.a(GameWorld.e().B, GameWorld.e().C, 2);
                                this.ch = true;
                                this.a(GameScreen.u[GameWorld.e().aC.IActionListener], var1_7 != false ? 0 : 1);
                                return;
                            }
                            if (bv.ResourceUtil == 170) {
                                this.ce = true;
                                this.ch = true;
                                var1_8 = bv.a(this.B, this.C, 2);
                                this.a(GameScreen.u[this.aP], var1_8 != false ? 0 : 1);
                            }
                            return;
                        }
                        this.as = 32;
                        if (this.K == 0 && main.GameCanvas.w % 3 == 0) {
                            at.a(153, this.B, this.C - this.al, 2);
                        }
                        if (bv.ResourceUtil == 170 && (this.K == 2 || this.K == 1) && main.GameCanvas.w % 3 == 0) {
                            at.a(153, this.B, this.C - this.al, 2);
                        }
                        ++this.em;
                        if (this.em == 500) {
                            this.C();
                        }
                        return;
                    }
                    if (this.H != 14) {
                        this.H = 3;
                    }
                    this.E = -3;
                    this.C += this.E;
                    this.as = 7;
                    return;
                }
                if (this.aq && main.GameCanvas.e) {
                    if (this.aU != null && this.aU.J >= 0 && this.aU.B > 100 && this.aU.B < bv.c - 100 && this.j() == null && this.i() == null && !this.I() && bv.ResourceUtil != 51 && bv.ResourceUtil != 52 && main.GameCanvas.G.S.size() > 0 && GameScreen.j().bQ == null) {
                        var1_9 = Math.abs(this.B - this.aU.B);
                        var2_17 = Math.abs(this.C - this.aU.C);
                        if (var1_9 < 60 && var2_17 < 40) {
                            if (this.an == null) {
                                this.an = new Command(GameStrings.bi, 11111);
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
                if (this.IConnectionListener) {
                    this.H();
                }
                if (this.s) {
                    return;
                }
                if (this.z != null) {
                    this.z.IActionListener();
                }
                if (this.c > 0) {
                    --this.c;
                }
                if (this.j > 0 && main.GameCanvas.w % 2 == 0) {
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
                        var1_1.aR.t = var1_1.I == 1 ? var1_1.B - 30 : var1_1.B + 30;
                        var1_1.aR.u = var1_1.C - 60;
                        var2_18 = var1_1.aR.t - var1_1.aR.m;
                        var3_21 = var1_1.aR.u - var1_1.aR.n;
                        var1_1.aR.m += var2_18 / 4;
                        var1_1.aR.n += var3_21 / 4;
                        var1_1.aR.o = var1_1.I;
                    }
                }
                if (this.cc != null) {
                    this.cc.a();
                }
                if (this.cd != null) {
                    this.cd.a();
                }
                this.ae();
                if (this.cI != 0) {
                    if (main.GameCanvas.w % 5 == 0) {
                        ei.a(new ea(32, this.B, this.C + 24, 3, 5, 1));
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
                    if (bv.a(this.B, this.C, 2)) {
                        this.as = 16;
                        return;
                    }
                    this.as = 31;
                    return;
                }
                if (this.U > 0L) {
                    var1_10 = 0;
                    while (var1_10 < this.aB.size()) {
                        var2_19 = (ec)this.aB.elementAt(var1_10);
                        if (main.GameCanvas.Message) {
                            this.U += (long)var2_19.a;
                            this.T += (long)var2_19.a;
                        }
                        ++var1_10;
                    }
                    if (this.R > 0 && main.GameCanvas.z) {
                        this.U += (long)this.R;
                    }
                    if (this.S > 0 && main.GameCanvas.z) {
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
                    GameScreen.ResourceUtil = this.B - GameScreen.f;
                    GameScreen.m = this.C - GameScreen.UIPanel - 1;
                    if (!main.GameCanvas.f) {
                        GameScreen.ResourceUtil += GameScreen.i * this.I;
                    }
                }
                this.h = (this.h + 1) % 100;
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
                if (!GameWorld.bG && this.MessageHandler()) {
                    GameService.a().UIPanel();
                    if (bv.IActionListener()) {
                        GameService.a().q();
                        GameWorld.bG = true;
                    } else {
                        GameService.a().f();
                    }
                    GameWorld.bH = true;
                    GameWorld.bG = true;
                    main.GameCanvas.UIPanel();
                    main.GameCanvas.f();
                    bp.a();
                    return;
                }
                if (this.H != 4 && MathUtil.UIPanel(this.B - this.bD) + MathUtil.UIPanel(this.C - this.bE) >= 70 && this.C - this.bE <= 0 && this.aq) {
                    GameService.a().UIPanel();
                }
                if (this.bJ) {
                    this.bP = null;
                }
                if (this.bP != null) {
                    if (GameWorld.c(this.B - this.bP.a) <= 16 && GameWorld.c(this.C - this.bP.IActionListener) <= 16) {
                        this.B = (this.bP.a + this.B) / 2;
                        this.C = this.bP.IActionListener;
                        this.bP = null;
                        GameScreen.c.aV = false;
                        this.GameWorld();
                        this.E = 0;
                        this.D = 0;
                        if ((bv.IActionListener(this.B, this.C) & 2) == 2) {
                            this.H = 1;
                        } else {
                            this.ar();
                            this.ax();
                        }
                        GameService.a().UIPanel();
                    } else {
                        v0 = this.I = this.bP.a > this.B ? 1 : -1;
                        if (bv.a(this.B, this.C, 2)) {
                            this.H = 2;
                            if (this.bP != null) {
                                this.D = this.O * this.I;
                                this.E = 0;
                            }
                            if (GameWorld.c(this.B - this.bP.a) <= 10) {
                                if (this.bP.IActionListener > this.C) {
                                    if (this.bP.IActionListener > this.C) {
                                        var1_11 = false;
                                        var2_20 = this.I == 1 ? 1 : -1;
                                        var3_21 = 0;
                                        while (var3_21 < 2) {
                                            if (bv.a(this.bP.a + this.am * var2_20, this.C + this.f * var3_21, 2)) {
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
                                            this.GameWorld();
                                        } else {
                                            SettingsManager.a();
                                            this.B = this.bP.a;
                                            this.H = 10;
                                            this.E = -5;
                                            this.D = 0;
                                            MathUtil.c("Jum lun");
                                        }
                                    }
                                } else {
                                    SettingsManager.a();
                                    this.B = this.bP.a;
                                    this.H = 10;
                                    this.E = -5;
                                    this.D = 0;
                                }
                            }
                            if (this.I == 1) {
                                if (bv.a(this.B + this.am, this.C - this.f, 4)) {
                                    this.D = this.O * this.I;
                                    this.H = 10;
                                    this.E = -5;
                                }
                            } else if (bv.a(this.B - this.am - 1, this.C - this.f, 8)) {
                                this.D = this.O * this.I;
                                this.H = 10;
                                this.E = -5;
                            }
                        } else {
                            if (this.bP.IActionListener < this.C + 10) {
                                this.H = 10;
                                this.E = -5;
                                if (GameWorld.c(this.C - this.bP.IActionListener) <= 10) {
                                    this.C = this.bP.IActionListener;
                                    this.E = 0;
                                }
                                this.D = GameWorld.c(this.B - this.bP.a) <= 10 ? 0 : this.O * this.I;
                            } else if (bv.a(this.B, this.C, 2)) {
                                this.bP = null;
                                GameScreen.c.aV = false;
                                this.H = 1;
                                this.E = 0;
                                this.D = 0;
                                this.GameWorld();
                            } else {
                                if (this.H == 10 || this.H == 2) {
                                    this.E = 0;
                                }
                                this.H = 4;
                            }
                            if (this.bP.IActionListener > this.C) {
                                if (this.I == 1) {
                                    if (bv.a(this.B + this.am, this.C - this.f, 4)) {
                                        this.E = 0;
                                        this.D = 0;
                                        this.H = 4;
                                        this.bP = null;
                                        GameScreen.c.aV = false;
                                        this.GameWorld();
                                    }
                                } else if (bv.a(this.B - this.am - 1, this.C - this.f, 8)) {
                                    this.E = 0;
                                    this.D = 0;
                                    this.H = 4;
                                    this.bP = null;
                                    GameScreen.c.aV = false;
                                    this.GameWorld();
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
            if (this.bP == null) ** GOTO lbl-1000
            if (GameWorld.c(this.bP.a - this.B) < 17 && GameWorld.c(this.bP.IActionListener - this.C) < 25) {
                this.B = this.bP.a;
                this.C = this.bP.IActionListener;
                this.bP = null;
                if ((bv.IActionListener(this.B, this.C) & 2) == 2) {
                    this.H = 1;
                    this.G = 0;
                    main.GameCanvas.a().a(-1, this.B - -8, this.C);
                    main.GameCanvas.a().a(1, this.B - 8, this.C);
                } else {
                    this.H = 4;
                    this.E = 0;
                    this.F = 0;
                }
                var1_12 = true;
            } else if (this.eC != 10 && this.as != 8 || this.bF.size() <= 0) {
                if (this.C == this.bP.IActionListener) {
                    if (this.B != this.bP.a) {
                        this.B = (this.B + this.bP.a) / 2;
                        this.as = main.GameCanvas.w % 5 + 2;
                    }
                } else if (this.C < this.bP.IActionListener) {
                    this.as = 12;
                    this.B = (this.B + this.bP.a) / 2;
                    if (this.E < 0) {
                        this.E = 0;
                    }
                    this.C += this.E;
                    if ((bv.IActionListener(this.B, this.C) & 2) == 2) {
                        main.GameCanvas.a().a(-1, this.B - -8, this.C);
                        main.GameCanvas.a().a(1, this.B - 8, this.C);
                    }
                    ++this.E;
                    if (this.E > 16) {
                        this.C = (this.C + this.bP.IActionListener) / 2;
                    }
                } else {
                    this.as = 7;
                    this.B = (this.B + this.bP.a) / 2;
                    this.C = (this.C + this.bP.IActionListener) / 2;
                }
            } else lbl-1000:
            // 2 sources

            {
                var1_12 = true;
            }
            if (var1_12 && this.bF.size() > 0) {
                this.bP = (Menu)this.bF.firstElement();
                this.bF.removeElementAt(0);
                if (this.bP.c == 2) {
                    if ((bv.IActionListener(this.B, this.C + 12) & 2) != 2) {
                        this.H = 10;
                        this.F = 0;
                        this.d = 0;
                        this.D = -(this.B - this.bP.a) / 10;
                        this.E = -(this.C - this.bP.IActionListener) / 10;
                        if (this.B - this.bP.a > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.a < 0) {
                            this.I = 1;
                        }
                    } else {
                        this.H = 2;
                        if (this.B - this.bP.a > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.a < 0) {
                            this.I = 1;
                        }
                        this.D = this.O * this.I;
                        this.E = 0;
                    }
                } else if (this.bP.c == 3) {
                    if ((bv.IActionListener(this.B, this.C + 23) & 2) != 2) {
                        this.H = 10;
                        this.F = 0;
                        this.d = 0;
                        this.D = -(this.B - this.bP.a) / 10;
                        this.E = -(this.C - this.bP.IActionListener) / 10;
                        if (this.B - this.bP.a > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.a < 0) {
                            this.I = 1;
                        }
                    } else {
                        this.H = 3;
                        main.GameCanvas.a().a(-1, this.B - -8, this.C);
                        main.GameCanvas.a().a(1, this.B - 8, this.C);
                        if (this.B - this.bP.a > 0) {
                            this.I = -1;
                        } else if (this.B - this.bP.a < 0) {
                            this.I = 1;
                        }
                        this.D = GameWorld.c(this.B - this.bP.a) / 10 * this.I;
                        this.E = -10;
                    }
                } else if (this.bP.c == 4) {
                    this.H = 4;
                    if (this.B - this.bP.a > 0) {
                        this.I = -1;
                    } else if (this.B - this.bP.a < 0) {
                        this.I = 1;
                    }
                    this.D = GameWorld.c(this.B - this.bP.a) / 9 * this.I;
                    this.E = 0;
                } else {
                    this.B = this.bP.a;
                    this.C = this.bP.IActionListener;
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
                this.as();
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
                    this.as = 0;
                    break;
                }
                this.as = 1;
                break;
            }
            case 6: {
                if (this.ek <= 0) {
                    this.as = 0;
                } else if (this.eC == 10) {
                    this.B += this.D;
                } else if (this.as <= 1) {
                    ++this.F;
                    this.as = this.F > 6 ? 0 : 1;
                    if (this.F > 10) {
                        this.F = 0;
                    }
                }
                if (this.as != 7 && this.as != 12 && (bv.IActionListener(this.B, this.C + 1) & 2) != 2) {
                    this.D = 0;
                    this.E = 0;
                    this.H = 4;
                    this.as = 7;
                }
                if (this.aq) break;
                ++this.G;
                if (this.G > 10) {
                    if ((bv.IActionListener(this.B, this.C + 1) & 2) != 2) {
                        this.C += 5;
                    } else {
                        this.as = 0;
                    }
                }
                if (this.G <= 50) break;
                this.G = 0;
                this.bP = null;
            }
        }
        if (this.ek > 0) {
            this.as = 23;
            this.ek = (byte)(this.ek - 1);
        }
        if (this.co != 0 || this.cp != 0) {
            this.a(this.co, this.cp);
            this.co = 0;
            this.cp = 0;
        }
        if (this.aZ != null) {
            if (this.aZ[0] == 0) {
                this.aZ[0] = (short)(this.aZ[0] + 1);
                at.a(60, this, 1);
            } else if (this.aZ[0] < 10) {
                this.aZ[0] = (short)(this.aZ[0] + 1);
            } else {
                this.B = this.aZ[1];
                this.C = this.aZ[2];
                this.aZ = null;
                at.a(60, this, 1);
                if (this.aq) {
                    if ((bv.IActionListener(this.B, this.C) & 2) != 2) {
                        this.H = 4;
                        GameWorld.e().IActionListener(GameScreen.u[38], 1);
                    } else {
                        GameService.a().UIPanel();
                        GameWorld.e().IActionListener(GameScreen.u[38], 0);
                    }
                }
            }
        }
        if (this.H != 10) {
            this.bS = 0;
        }
        if (this.bl) {
            this.as = 17;
            if (main.GameCanvas.w % 4 == 0) {
                at.a(1, this.B, this.C + main.GameCanvas.ae, 1);
            }
            if (this.aq && (var1_13 = System.currentTimeMillis()) - this.bo >= 1000L) {
                MathUtil.c("%= " + this.aC.k);
                this.bo = var1_13;
                this.U += this.V * (long)this.aC.k / 100L;
                this.T += this.W * (long)this.aC.k / 100L;
                if (this.U < this.V) {
                    GameScreen.a("+" + this.V * (long)this.aC.k / 100L + " " + GameStrings.eX, this.B, this.C - this.al - 20, 0, -1, 9);
                }
                if (this.T < this.W) {
                    GameScreen.a("+" + this.W * (long)this.aC.k / 100L + " " + GameStrings.eY, this.B, this.C - this.al - 20, 0, -2, 10);
                }
                GameService.a().c((byte)2);
            }
        }
        if (this.bq) {
            if (this.aq) {
                GameWorld.bH = true;
                this.H = 3;
                this.E = -8;
                if (this.C <= bv.d - 240) {
                    this.bq = false;
                    GameWorld.bH = false;
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
            if (main.GameCanvas.IActionListener - var1_14.eT > 0L) {
                ++var1_14.eS;
                if (var1_14.eS > var1_14.eW.length - 1) {
                    var1_14.eS = 0;
                    var1_14.eT = main.GameCanvas.IActionListener + (long)MathUtil.IActionListener(2000, 3500);
                    var1_14.eW = var1_14.eV;
                    if (MathUtil.d(2) == 0) {
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
                    if (this.ei[n2].IActionListener != null) {
                        if (!this.ei[n2].e) {
                            int n3;
                            this.ei[n2].IActionListener.d();
                            this.ei[n2].IActionListener.Z = this;
                            if (this.aq) {
                                GameWorld.e();
                                GameWorld.e();
                                n3 = 11;
                                Random random = new Random();
                                random.nextInt(11);
                            }
                            n3 = this.ei[n2].IActionListener.w >> 1;
                            if (this.ei[n2].IActionListener.u()) {
                                n3 = this.ei[n2].IActionListener.m() + 20;
                            }
                            GameScreen.a(this.ei[n2].IActionListener.m, this.ei[n2].IActionListener.n - n3, this.I);
                            this.ei[n2].e = true;
                        }
                    } else if (this.ei[n2].c != null && !this.ei[n2].e) {
                        if (this.ei[n2].c.J >= 0) {
                            this.ei[n2].c.K();
                        }
                        GameScreen.a(this.ei[n2].c.B, this.ei[n2].c.C - (this.ei[n2].c.al >> 1), this.I);
                        this.ei[n2].e = true;
                    }
                    ++this.ei[n2].a;
                    if (this.ei[n2].a >= this.ei[n2].d.GameCanvas.length) {
                        this.ei[n2] = null;
                    }
                }
                ++n2;
            }
        }
        if (this.bZ >= 0 && this.ca != null && main.GameCanvas.w % 2 == 0) {
            ++this.bZ;
            if (this.bZ >= this.ca.GameCanvas.length) {
                this.bZ = -1;
                this.ca = null;
            }
        }
    }

    private void GameWorld() {
        if (this.ay != null) {
            Command de2 = this.ay;
            this.ay = null;
            de2.a();
        }
    }

    private void ag() {
        if (main.GameCanvas.w % 20 == 0 && this.J >= 0) {
            GameWorld af2;
            this.i = true;
            int n2 = 0;
            while (n2 < GameScreen.D.size()) {
                af2 = null;
                try {
                    af2 = (GameWorld)GameScreen.D.elementAt(n2);
                }
                catch (Exception exception) {}
                if (af2 != null && !af2.equals(this) && (af2.C == this.C && MathUtil.UIPanel(af2.B - this.B) < 35 || this.C - af2.C < 32 && this.C - af2.C > 0 && MathUtil.UIPanel(af2.B - this.B) < 24)) {
                    this.i = false;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < GameScreen.G.size()) {
                af2 = null;
                try {
                    af2 = (TextBox)GameScreen.G.elementAt(n2);
                }
                catch (Exception exception) {}
                if (af2 != null && af2.C == this.C && MathUtil.UIPanel(af2.B - this.B) < 24) {
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
                this.H = (bv.IActionListener(this.B, this.C) & 2) == 2 ? 1 : 6;
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
            this.cc = null;
            if ((bv.IActionListener(this.B, this.C) & 2) != 2) {
                this.bQ = 5;
            }
        }
        if (this.cf != null && this.cc == null && this.D() != null && this.cb >= this.D().length) {
            if (!this.aq) {
                this.H = (bv.IActionListener(this.B, this.C) & 2) == 2 ? 1 : 6;
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
            this.cc = null;
            if ((bv.IActionListener(this.B, this.C) & 2) != 2) {
                this.bQ = 5;
            }
        }
        if ((fArray = this.D()) != null && this.cb >= 0 && this.cb <= fArray.length - 1) {
            if (fArray[this.cb].IActionListener != 0) {
                this.ef = GameScreen.Message[fArray[this.cb].IActionListener - 1];
                this.ec = 0;
                this.dZ = 0;
                this.dW = 0;
            }
            if (fArray[this.cb].e != 0) {
                this.eg = GameScreen.Message[fArray[this.cb].e - 1];
                this.ed = 0;
                this.ea = 0;
                this.dX = 0;
            }
            if (fArray[this.cb].h != 0) {
                this.eh = GameScreen.Message[fArray[this.cb].h - 1];
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
                        int n5 = MathUtil.UIPanel(bq2.ResourceUtil() - this.B);
                        if (n5 > (n4 = MathUtil.UIPanel(bq2.m() - this.C)) * 4) {
                            n5 = 0;
                        } else {
                            n5 = bq2.m() < this.C ? -3 : 3;
                            if (bq2 instanceof cc) {
                                bq2 = (Item)bq2;
                                if (((Item)bq2).IActionListener) {
                                    n5 = -20;
                                }
                            }
                        }
                        this.cd = new bj(this, n3 - 100, this.cg, this.B + (fArray2[n2].ResourceUtil - 10) * this.I, this.C + fArray2[n2].m + n5);
                        if (this.aC != null) {
                            if (this.aC.GameCanvas.a == 1) {
                                SettingsManager.a();
                            } else if (this.aC.GameCanvas.a == 3) {
                                SettingsManager.a();
                            } else if (this.aC.GameCanvas.a == 5) {
                                SettingsManager.a();
                            } else if (this.aC.GameCanvas.a == 11) {
                                SettingsManager.a();
                            }
                        }
                    } else if (this.ci || this.ch) {
                        this.C();
                    }
                } else {
                    this.cc = new UIItem(this, GameScreen.v[n3 - 1]);
                    this.cc.a = 10;
                    this.Item.IActionListener = this.B + fArray2[n2].ResourceUtil;
                    this.cc.c = this.C + fArray2[n2].m;
                }
            }
            if ((this.aQ != null || !this.aq && this.aU != null || this.aq && this.aU != null && (this.c(this.aU) || this.Message()) && this.cc == null && this.cd == null) && this.cb == fArray.length - 1) {
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
                    if (MathUtil.UIPanel(bq3.ResourceUtil() - this.B) < 10) {
                        this.B = bq3.ResourceUtil() > this.B ? (this.B -= 10) : (this.B += 10);
                    }
                    if (bq3.ResourceUtil() > this.B) {
                        this.I = 1;
                        return;
                    }
                    this.I = -1;
                }
            }
        }
    }

    public final void a(int n2, int n3) {
        bp.c();
        MathUtil.c("REST POINT x= " + n2 + " Message= " + n3);
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
        GameWorld.e().bD = n2;
        GameWorld.e().bE = n3;
    }

    private void ai() {
        this.bk = false;
        if (this.bl) {
            this.bl = false;
            SettingsManager.a();
            GameService.a().c((byte)3);
        }
        ++this.F;
        this.B += (this.d - this.B) / 4;
        this.C = this.F > 7 ? (this.C += (this.G - this.C) / 4) : (this.C += this.F - 10);
        if (MathUtil.UIPanel(this.d - this.B) < 4 && MathUtil.UIPanel(this.G - this.C) < 10) {
            this.B = this.d;
            this.C = this.G;
            this.H = 14;
            if (this.aq) {
                GameScreen.j().n();
                GameService.a().UIPanel();
            }
        }
        this.as = 23;
    }

    private void aj() {
        bp.c();
        main.GameCanvas.ResourceUtil();
        this.bP = null;
        ++this.F;
        this.B += (this.d - this.B) / 4;
        this.C = this.F > 7 ? (this.C += (this.G - this.C) / 4) : (this.C += this.F - 10);
        if (MathUtil.UIPanel(this.d - this.B) < 4 && MathUtil.UIPanel(this.G - this.C) < 10) {
            this.B = this.d;
            this.C = this.G;
            this.H = 1;
            this.G = 0;
            bG = false;
            GameService.a().UIPanel();
        }
        this.as = 23;
    }

    private void ak() {
        this.dP = 0;
        ++this.F;
        if (this.I == 1) {
            if ((bv.IActionListener(this.B + this.am, this.C - this.f) & 4) == 4) {
                this.D = 0;
            }
        } else if ((bv.IActionListener(this.B - this.am, this.C - this.f) & 8) == 8) {
            this.D = 0;
        }
        if (this.C > this.al && bv.a(this.B, this.C - this.al + 24, 8192)) {
            if (!bv.a(this.B, this.C, 2)) {
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
            if ((bv.IActionListener(this.B, this.C) & 2) != 2) {
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
            if ((bv.IActionListener(this.B, this.C + 3) & 2) == 2 && this.C <= bv.f(this.C + 3)) {
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
            SettingsManager.a();
            GameService.a().c((byte)3);
        }
        this.B += this.D * this.I;
        this.C += this.dF;
        ++this.dF;
        this.as = this.F == 0 ? 7 : 23;
        if (this.dF == -3) {
            this.as = 8;
        } else if (this.dF == -2) {
            this.as = 9;
        } else if (this.dF == -1) {
            this.as = 10;
        } else if (this.dF == 0) {
            this.as = 11;
        }
        if (this.dF == 0) {
            this.H = 6;
            this.G = 0;
            ((Menu)this.bF.firstElement()).c = 4;
            this.F = 0;
            this.E = 1;
        }
    }

    public void k() {
        this.bR = true;
        ei.a(new ea(107, this.B, this.C + 25, 3, 15, 1));
    }

    public final void r() {
        this.bR = false;
        ei.a(new ea(107, this.B, this.C + 25, 3, 10, 1));
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
        this.as = this.F % 15 < 5 ? 0 : 1;
        this.aA();
        if (!this.aq) {
            ++this.G;
            if (this.G > 50) {
                this.G = 0;
                this.bP = null;
            }
        }
        this.an();
        if (this.aq && GameScreen.D.size() != 0 && bv.ResourceUtil == 50) {
            GameWorld af2 = (GameWorld)GameScreen.D.elementAt(0);
            if (!af2.dM) {
                if (af2.H != 2) {
                    af2.IActionListener(this.B - 45, this.C, 0);
                }
                System.currentTimeMillis();
                if (MathUtil.UIPanel(this.B - 45 - af2.B) <= 10) {
                    af2.dM = true;
                }
            } else {
                if (af2.H != 2) {
                    af2.IActionListener(this.B + 45, this.C, 0);
                }
                System.currentTimeMillis();
                if (MathUtil.UIPanel(this.B + 45 - af2.B) <= 10) {
                    af2.dM = false;
                }
            }
            if (main.GameCanvas.w % 100 == 0) {
                af2.a("C\u1eafc c\u00f9m cum");
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
        if (!(this.dP != 40 && this.dP != 50 || main.GameCanvas.a)) {
            main.GameCanvas.a().a(-1, this.B + 8, this.C);
            main.GameCanvas.a().a(1, this.B - 8, this.C);
            this.e(1);
        }
        if (this.dP <= 50) {
            return;
        }
        switch (this.K) {
            case 0: {
                if (main.GameCanvas.w % 25 == 0) {
                    at.a(114, this, 1);
                }
                if (this.Q < 13 || main.GameCanvas.w % 4 != 0) break;
                at.a(132, this, 1);
                return;
            }
            case 1: {
                if (main.GameCanvas.w % 4 == 0) {
                    at.a(132, this, 1);
                }
                if (this.Q >= 13 && main.GameCanvas.w % 12 == 0) {
                    at.a(114, this, 1);
                }
                if (this.Q < 13 || main.GameCanvas.w % 25 != 0) break;
                at.a(131, this, 1);
                return;
            }
            case 2: {
                if (main.GameCanvas.w % 4 == 0) {
                    at.a(131, this, 1);
                }
                if (this.Q < 13 || main.GameCanvas.w % 25 != 0) break;
                at.a(114, this, 1);
            }
        }
    }

    private void ao() {
        int n2;
        if (this.B >= GameScreen.j && this.B <= GameScreen.j + main.GameCanvas.A) {
            if (this.cE == 0) {
                SettingsManager.a();
            } else {
                SettingsManager.a();
            }
        }
        this.dP = 0;
        this.bk = false;
        if (this.bl) {
            this.bl = false;
            SettingsManager.a();
            GameService.a().c((byte)3);
        }
        int n3 = 0;
        if (!this.aq && this.bP != null) {
            n3 = GameWorld.c(this.B - this.bP.a);
        }
        ++this.F;
        if (this.F >= 10) {
            this.F = 0;
            this.N = 0;
        }
        this.as = (this.F >> 1) + 2;
        this.B = (bv.IActionListener(this.B, this.C - 1) & 0x40) == 64 ? (this.B += this.D >> 1) : (this.B += this.D);
        if (this.I == 1) {
            if (bv.a(this.B + this.am, this.C - this.f, 4)) {
                if (this.aq) {
                    this.D = 0;
                    this.B = bv.f(this.B + this.am) - this.am;
                } else {
                    this.ap();
                }
            }
        } else if (bv.a(this.B - this.am - 1, this.C - this.f, 8)) {
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
                    GameService.a().UIPanel();
                }
                this.H = 1;
                this.N = 0;
            }
        }
        if ((bv.IActionListener(this.B, this.C) & 2) != 2) {
            if (this.aq) {
                if (this.B - this.bD != 0 || this.C - this.bE != 0) {
                    GameService.a().UIPanel();
                }
                this.as = 7;
                this.H = 4;
                this.bQ = 0;
                this.D = 3 * this.I;
                this.d = 0;
            } else {
                this.ap();
            }
        }
        if (!this.aq && this.bP != null && (n2 = GameWorld.c(this.B - this.bP.a)) > n3) {
            this.ap();
        }
        main.GameCanvas.a().a(this.I, this.B - (this.I << 3), this.C);
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
                    this.GameStrings();
                    this.e(3);
                    this.dP = 0;
                    this.bk = false;
                    if (this.bl) {
                        this.bl = false;
                        SettingsManager.a();
                        GameService.a().c((byte)3);
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
                    n2 = this.bP.a - this.B;
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
            if ((bv.IActionListener(this.B + this.am, this.C - 1) & 4) == 4 && this.B <= bv.f(this.B + this.am) + 12) {
                this.B = bv.f(this.B + this.am) - this.am;
                this.D = 0;
            }
        } else if ((bv.IActionListener(this.B - this.am, this.C - 1) & 8) == 8 && this.B >= bv.f(this.B - this.am) + 12) {
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
            GameService.a().UIPanel();
            if (bv.IActionListener()) {
                bG = true;
                GameService.a().q();
            } else {
                GameService.a().f();
            }
            bH = true;
            bG = true;
            main.GameCanvas.UIPanel();
            main.GameCanvas.f();
            bp.a();
            return;
        }
        if (this.H != 16 && (bv.a(this.B, this.C - this.al + 24, 8192) || this.C < 0)) {
            this.H = 4;
            this.F = 0;
            this.d = 0;
            this.E = 1;
            this.bQ = 0;
            if (this.C < 0) {
                this.C = 0;
            }
            this.C = bv.e(this.C + 25);
            main.GameCanvas.UIPanel();
        }
        if (this.G < 0) {
            ++this.G;
        }
        this.as = 7;
        if (!this.aq && this.bP != null && this.C < this.bP.IActionListener) {
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
        if (!(!this.aq || this.B - this.bD == 0 && this.C - this.bE == 0 || MathUtil.UIPanel(GameWorld.e().B - GameWorld.e().bD) <= 96 && MathUtil.UIPanel(GameWorld.e().C - GameWorld.e().bE) <= 24)) {
            GameService.a().UIPanel();
        }
    }

    private void as() {
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
                            SettingsManager.a();
                        }
                        this.E = 0;
                        this.D = 0;
                        this.G = 0;
                        return;
                    }
                    if (this.C % 24 == 0 && (bv.IActionListener(this.B, this.C) & 2) == 2) {
                        this.bQ = 0;
                        if (this.aq) {
                            if (this.C - this.bE > 0 || this.B - this.bD != 0 || this.C - this.bE < 0) {
                                GameService.a().UIPanel();
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
                        this.as = 0;
                        main.GameCanvas.a().a(-1, this.B - -8, this.C);
                        main.GameCanvas.a().a(1, this.B - 8, this.C);
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
                    this.as = this.E < -4 ? 7 : 12;
                    this.B += this.D;
                    if (this.aq || this.bP == null) break block31;
                    n2 = this.bP.a - this.B;
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
            if ((bv.IActionListener(this.B + this.am, this.C - 1) & 4) == 4 && this.B <= bv.f(this.B + this.am) + 12) {
                this.B = bv.f(this.B + this.am) - this.am;
                this.D = 0;
            }
        } else if ((bv.IActionListener(this.B - this.am, this.C - 1) & 8) == 8 && this.B >= bv.f(this.B - this.am) + 12) {
            this.B = bv.f(this.B + 24 - this.am) + this.am;
            this.D = 0;
        }
        if (this.E > 3 && (this.e == 0 || this.e <= bv.e(this.C + 3)) && (bv.IActionListener(this.B, this.C + 3) & 2) == 2) {
            if (this.aq) {
                this.e = 0;
                this.E = 0;
                this.D = 0;
                this.d = 0;
                this.F = 0;
                this.C = bv.f(this.C + 3);
                this.H = 1;
                if (this.aq) {
                    SettingsManager.a();
                }
                this.G = 0;
                main.GameCanvas.a().a(-1, this.B - -8, this.C);
                main.GameCanvas.a().a(1, this.B - 8, this.C);
                this.e(1);
                if (this.C - this.bE > 0) {
                    if (this.aq) {
                        GameService.a().UIPanel();
                        return;
                    }
                } else if ((this.B - this.bD != 0 || this.C - this.bE < 0) && this.aq) {
                    GameService.a().UIPanel();
                    return;
                }
            } else {
                this.ap();
                this.C = bv.f(this.C + 3);
                this.as = 0;
                main.GameCanvas.a().a(-1, this.B - -8, this.C);
                main.GameCanvas.a().a(1, this.B - 8, this.C);
                this.e(1);
                this.bP = null;
            }
            return;
        }
        this.as = 12;
        if (!this.aq) {
            if ((bv.IActionListener(this.B, this.C + 1) & 2) == 2) {
                this.as = 0;
            }
            if (this.bP != null && this.C > this.bP.IActionListener) {
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
            this.GameStrings();
            if (this.H != 16 && (bv.a(this.B, this.C - this.al + 24, 8192) || this.C < 0)) {
                if (this.C - this.al < 0) {
                    this.C = this.al;
                }
                this.as = 7;
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
            if (main.GameCanvas.w % 3 == 0) {
                ++this.F;
            }
            if (this.F > 4) {
                this.F = 0;
            }
            this.as = this.F + 2;
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
            this.as = 8;
            if (MathUtil.UIPanel(this.D) <= 4 && this.aq) {
                if (this.bP != null) {
                    n3 = GameWorld.c(this.B - this.bP.a);
                    this.as = n3 > (n2 = GameWorld.c(this.C - this.bP.IActionListener)) * 10 ? 8 : (n3 > n2 && n3 > 48 && n2 > 32 ? 8 : 7);
                } else {
                    if (this.E < 0) {
                        this.E = 0;
                    }
                    if (this.E > 16) {
                        this.E = 16;
                    }
                    this.as = 7;
                }
            }
            if (!this.aq) {
                if (GameWorld.c(this.D) < 2) {
                    this.D = (this.I << 1) * n5;
                }
                if (this.E != 0) {
                    this.as = 7;
                }
                if (GameWorld.c(this.D) <= 2) {
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
            if (bv.a(this.B + this.am, this.C - 1, 4)) {
                this.D = 0;
                this.B = bv.f(this.B + this.am) - this.am;
                if (this.E == 0) {
                    this.bP = null;
                }
            }
        } else if (bv.a(this.B - this.am - 1, this.C - 1, 8)) {
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
                if (main.GameCanvas.w % 3 == 0) {
                    at.a(111, this.B + (this.I == 1 ? -17 : 27), this.C + this.bS + 13, 1, this.I != 1 ? 2 : 0);
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
                GameService.a().UIPanel();
            }
            if ((bv.IActionListener(this.B, this.C + 20) & 2) == 2 || (bv.IActionListener(this.B, this.C + 40) & 2) == 2) {
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
            if (GameWorld.c(this.B - this.bD) > 96 || GameWorld.c(this.C - this.bE) > 24) {
                GameService.a().UIPanel();
            }
        }
    }

    private void au() {
        ++this.dp;
        if (this.dp > this.do.length - 1) {
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
                    GameWorld af2 = this;
                    if (af2.cm - af2.C < 24 && !af2.dC) {
                        af2.dA = false;
                        af2.dB = false;
                        af2.dC = true;
                        af2.dy = 0;
                    }
                }
                this.as = this.F % 15 < 5 ? 0 : 1;
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
                    if (this.dt < GameScreen.j + main.GameCanvas.A + 50) {
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

    private static void RMSManager() {
        if (aa.c[50].f == null) {
            aa.c[50].f = new ck();
            String string = "/Mob/50";
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            if (inputStream != null) {
                aa.c[50].f.a(String.valueOf(string) + "/data");
                aa.c[50].f.a = ResourceUtil.IActionListener(String.valueOf(string) + "/img.png");
            } else {
                GameService.a().h(50);
            }
            aa.K.addElement("50");
        }
    }

    public void a(int[] nArray) {
        ++this.dQ;
        if (this.dQ > nArray.length - 1) {
            this.dQ = 0;
        }
        this.dR = nArray[this.dQ];
    }

    public final void IActionListener(MGraphics en2) {
        if (this.dt > GameScreen.j && this.dt < GameScreen.j + main.GameCanvas.A) {
            if (this.aq) {
                if (this.dC || this.dA || this.dB) {
                    if (this.GameService >= bs) {
                        Object object = String.valueOf(this.dT) + (this.GameService - bs) + "_1";
                        if ((object = ResourceUtil.d((String)object)) != null) {
                            ((Frame)object).a(this.dq / 2 % ((Frame)object).c, this.dt, this.du + this.bS, this.dr, 3, en2);
                        }
                        return;
                    }
                    if (this.bx) {
                        this.a(this.dS);
                        if (aa.c[50] != null && aa.c[50].f != null) {
                            aa.c[50].f.a(en2, this.dR, this.dt + (this.I == 1 ? -8 : 8), this.du + 35, this.I == 1 ? 0 : 1, 0);
                            return;
                        }
                        GameWorld.RMSManager();
                        return;
                    }
                    if (this.bw) {
                        en2.a(dm, 0, this.do[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.MathUtil == 0) {
                        if (!this.bv) {
                            en2.a(n, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.a(mFont, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.MathUtil == 1) {
                        if (!this.bv) {
                            en2.a(BaseCanvas, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.a(dk, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                }
            } else if (!this.aq) {
                if (this.GameService >= bs) {
                    Object object = String.valueOf(this.dT) + (this.GameService - bs) + "_1";
                    if ((object = ResourceUtil.d((String)object)) != null) {
                        ((Frame)object).a(this.dq / 2 % ((Frame)object).c, this.dt, this.du + this.bS, this.dr, 3, en2);
                    }
                    return;
                }
                if (this.bx) {
                    this.a(this.dS);
                    if (aa.c[50] != null && aa.c[50].f != null) {
                        aa.c[50].f.a(en2, this.dR, this.dt + (this.I == 1 ? -8 : 8), this.du + 35, this.I == 1 ? 0 : 1, 0);
                        return;
                    }
                    GameWorld.RMSManager();
                    return;
                }
                if (this.bw) {
                    en2.a(dm, 0, this.do[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                    return;
                }
                if (this.dB) {
                    if (this.MathUtil == 0) {
                        if (!this.bv) {
                            en2.a(n, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.a(mFont, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                        return;
                    }
                    if (this.MathUtil == 1) {
                        if (!this.bv) {
                            en2.a(BaseCanvas, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                            return;
                        }
                        en2.a(dk, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
                    }
                }
            }
        }
    }

    private void GameStrings() {
        int n2;
        int n3;
        GameWorld af2;
        if (this.aq) {
            af2 = this;
            n3 = 0;
            n2 = -1;
            h[] hArray = af2.aH;
            int n4 = 0;
            while (n4 < hArray.length) {
                if (hArray[n4] != null && (hArray[n4].IActionListener.IActionListener == 24 || hArray[n4].IActionListener.IActionListener == 23)) {
                    n2 = hArray[n4].IActionListener.UIPanel >= 0 ? (int)((short)(bs + hArray[n4].IActionListener.UIPanel)) : (int)hArray[n4].IActionListener.a;
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
            } else if (n2 >= bs) {
                af2.GameService = (short)n2;
            }
            this.SettingsManager = n3;
            if (bv.a()) {
                this.SettingsManager = false;
            }
        }
        if (this.SettingsManager) {
            if (this.cm - this.C <= 20) {
                this.dx = this.B;
            }
            if (this.dy < 100) {
                this.dy = MathUtil.UIPanel(this.dx - this.B);
            }
            if (this.dy >= 70 && this.cm - this.C > 30 && !this.dA && !this.dC) {
                int n5 = this.K;
                n2 = this.I;
                n3 = this.J;
                af2 = this;
                this.dr = n2;
                af2.MathUtil = n5;
                af2.dz = 30;
                if (af2.dr < 0) {
                    af2.dr = 0;
                    af2.dt = GameScreen.j + main.GameCanvas.A + 50;
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
            if ((bv.IActionListener(this.B, this.C + n2) & 2) == 2 || this.C + n2 > bv.IActionListener * bv.i - 24) {
                bl2 = false;
                break;
            }
            n2 += 24;
        }
        if (bl2) {
            this.bQ = 40;
        }
    }

    public final void s() {
        this.t();
        this.u();
        this.v();
    }

    public final void t() {
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
        return this.aC != null && this.aC.a.IActionListener();
    }

    public final boolean x() {
        return this.aC != null && this.aC.GameCanvas.c();
    }

    public final boolean Message() {
        return this.aC != null && this.aC.GameCanvas.a();
    }

    public final boolean z() {
        return !this.ch && this.aC != null && (this.aC.GameCanvas.a == 10 || this.aC.GameCanvas.a == 11);
    }

    public final void a(ci ci2, int n2) {
        this.MGraphics = false;
        if (this.cR) {
            return;
        }
        if (this.aq && this.aC.GameCanvas.a == 9 && this.U <= this.V / 10L) {
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
            if (this.aC.GameCanvas.a == 23) {
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
            this.T = this.aC.GameCanvas.d == 2 ? 1L : (this.aC.GameCanvas.d != 1 ? (this.T -= (long)this.aC.i) : (this.T -= (long)this.aC.i * this.W / 100L));
            --GameWorld.e().bf;
            GameScreen.j().bB = true;
            GameScreen.j().bA = 0L;
            if (this.T < 0L) {
                this.T = 0L;
            }
        }
        if (this.aq) {
            if (this.aC.GameCanvas.a == 10) {
                GameService.a().c((byte)4);
            }
            if (this.aC.GameCanvas.a == 11) {
                GameService.a().c((byte)4);
            }
            if (this.aC.GameCanvas.a == 7) {
                SettingsManager.a();
            }
            if (this.aC.GameCanvas.a == 6) {
                GameService.a().c((byte)0);
                GameScreen.j().ba = true;
                SettingsManager.a();
            }
            if (this.aC.GameCanvas.a == 8) {
                if (!this.bl) {
                    SettingsManager.a();
                    GameService.a().c((byte)1);
                    this.bl = true;
                    this.bo = this.m = System.currentTimeMillis();
                } else {
                    GameService.a().c((byte)3);
                    this.bl = false;
                    SettingsManager.a();
                }
            }
            if (this.aC.GameCanvas.a == 13) {
                if (this.cE != 0) {
                    GameScreen.j().aX = 0;
                    return;
                }
                if (this.ce) {
                    return;
                }
                SettingsManager.a();
                GameService.a().c((byte)6);
                this.em = 0;
                this.cG = true;
                return;
            }
            if (this.aC.GameCanvas.a == 14) {
                SettingsManager.a();
                GameService.a().c((byte)7);
                this.b(true);
            }
            if (this.aC.GameCanvas.a == 21) {
                GameService.a().c((byte)10);
                return;
            }
            if (this.aC.GameCanvas.a == 12) {
                GameService.a().c((byte)8);
            }
            if (this.aC.GameCanvas.a == 19) {
                GameService.a().c((byte)9);
                return;
            }
        }
        if (this.cE == 1 && ci2.a >= 35 && ci2.a <= 41) {
            ci2 = GameScreen.u[106];
        }
        if (ci2.a >= 128 && ci2.a <= 134) {
            ci2 = GameScreen.u[ci2.a - 65];
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
            at.a(60, this.B, this.C, 1);
            this.cP = true;
        }
        if (ci2.a >= 107 && ci2.a <= 113) {
            ci2 = GameScreen.u[ci2.a - 44];
            ei.a(new ea(23, this.B, this.C + this.al / 2, 3, 2, 1));
        }
        this.b(ci2, n2);
    }

    public static void A() {
        GameScreen.j().aX = 0;
        GameWorld.e().a(GameScreen.u[GameWorld.e().aC.IActionListener], bv.a(GameWorld.e().B, GameWorld.e().C, 2) ? 0 : 1);
    }

    public final void B() {
        if (this.aq && (this.bk || this.t)) {
            GameScreen.j().aX = 0;
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.aq && l2 - this.aC.f < (long)this.aC.e) {
            this.aC.j = true;
            return;
        }
        if (this.aC.GameCanvas.a == 10) {
            this.b(false);
        }
        if (this.aC.GameCanvas.a == 11) {
            this.b(true);
        }
    }

    public final void C() {
        this.ci = false;
        this.cj = false;
        this.ch = false;
        this.ce = false;
        if (this.aq && this.H != 14 && this.H != 5) {
            this.bJ = false;
        }
        GameScreen.j().aX = 0;
    }

    public final void IActionListener(boolean bl2) {
        if (this.ce) {
            return;
        }
        GameScreen.j().aX = 0;
        if (bl2) {
            if (!this.cj) {
                this.em = 0;
                this.bm = 50000;
                this.LoggingList = 0;
                this.bo = System.currentTimeMillis();
                if (this.aq) {
                    this.bJ = true;
                    if (this.K == 1) {
                        GameService.a().c((byte)4);
                    }
                    if (bv.ResourceUtil == 170 && this.K != 1) {
                        GameService.a().c((byte)4);
                    }
                }
                if (this.K == 1) {
                    SettingsManager.a();
                }
                if (bv.ResourceUtil == 170 && this.K != 1) {
                    SettingsManager.a();
                }
                this.cj = true;
                return;
            }
        } else if (!this.ci) {
            if (this.aq) {
                GameScreen.j().aX = 0;
                this.bJ = true;
                GameService.a().c((byte)4);
            }
            this.ch = false;
            this.em = 0;
            this.ci = true;
            this.LoggingList = 0;
            this.bm = 50000;
        }
    }

    public final void IActionListener(ci ci2, int n2) {
        this.cf = ci2;
        if (ci2.a >= 0 && ci2.a <= 6) {
            int n3 = MathUtil.IActionListener(0, ci2.a + 4) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n3 > 6) {
                n3 = 6;
            }
            this.cg = GameScreen.u[n3];
        } else if (ci2.a >= 14 && ci2.a <= 20) {
            int n4 = MathUtil.IActionListener(0, ci2.a - 14 + 4) - 1;
            if (n4 < 0) {
                n4 = 0;
            }
            if (n4 > 6) {
                n4 = 6;
            }
            this.cg = GameScreen.u[n4 + 14];
        } else if (ci2.a >= 28 && ci2.a <= 34) {
            int n5 = MathUtil.IActionListener(0, (this.cE == 1 ? 105 : ci2.a) - (this.cE == 1 ? 105 : 28) + 4) - 1;
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
        } else if (ci2.a >= 63 && ci2.a <= 69) {
            int n6 = MathUtil.IActionListener(0, ci2.a - 63 + 4) - 1;
            if (n6 < 0) {
                n6 = 0;
            }
            if (n6 > 6) {
                n6 = 6;
            }
            this.cg = GameScreen.u[n6 + 63];
        } else if (ci2.a >= 107 && ci2.a <= 109) {
            int n7 = MathUtil.IActionListener(0, ci2.a - 107 + 4) - 1;
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
        this.ed = 0;
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
                ci2 = this.cd.a;
            }
            if (ci2 != null) {
                LoggingList el2 = new LoggingList("vMob");
                LoggingList el3 = new LoggingList("vChar");
                if (this.aU != null) {
                    el3.addElement(this.aU);
                } else if (this.aQ != null) {
                    el2.addElement(this.aQ);
                }
                this.ei = new cu[el2.size() + el3.size()];
                int n2 = 0;
                while (n2 < el2.size()) {
                    this.ei[n2] = new cu();
                    this.ei[n2].d = GameScreen.Message[ci2.IActionListener - 1];
                    if (!this.w()) {
                        this.ei[n2].IActionListener = (aa)el2.elementAt(n2);
                    }
                    ++n2;
                }
                n2 = 0;
                while (n2 < el3.size()) {
                    this.ei[n2 + el2.size()] = new cu();
                    this.ei[n2 + el2.size()].d = GameScreen.Message[ci2.IActionListener - 1];
                    this.ei[n2 + el2.size()].c = (GameWorld)el3.elementAt(n2);
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
                if (this.aq && !this.w() && !this.MGraphics) {
                    GameService.a().a(el2, el3, n2);
                    this.MGraphics = true;
                    return;
                }
            }
        } else {
            ci ci3 = this.cg;
            if (this.cd != null) {
                ci3 = this.cd.a;
            }
            if (ci3 != null) {
                if (this.aX != null) {
                    this.ei = new cu[this.aX.length];
                    int n3 = 0;
                    while (n3 < this.aX.length) {
                        this.ei[n3] = new cu();
                        this.ei[n3].d = GameScreen.Message[ci3.IActionListener - 1];
                        this.ei[n3].IActionListener = this.aX[n3];
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
                        this.ei[n4].d = GameScreen.Message[ci3.IActionListener - 1];
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

    public final void a(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = 10;
    }

    public final void c(boolean bl2) {
        this.ck = bl2;
    }

    public void a(MGraphics en2) {
        String string;
        df df2;
        Object object;
        MGraphics en3;
        if (this.bR) {
            return;
        }
        if (this.dc) {
            this.g(en2);
            return;
        }
        if (this.ck) {
            if (this.ap) {
                GameScreen.ResourceUtil = this.B - GameScreen.f;
                GameScreen.m = this.C - GameScreen.UIPanel - 1;
                if (!main.GameCanvas.f) {
                    GameScreen.ResourceUtil += GameScreen.i * this.I;
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
            int n5 = n2 = main.GameCanvas.w % 10 > 5 ? 1 : 0;
            if (((Dialog)object).ResourceUtil > 0) {
                n3 = ((Dialog)object).m;
                n4 = ((Dialog)object).n;
                n2 = 0;
            }
            bl.a(en3, ((Dialog)object).a, ((Dialog)object).c, ((Dialog)object).i, ((Dialog)object).e + 3 + n2, n3, n4, ((Dialog)object).IActionListener == 1 ? 0 : 2, cj.f);
        }
        en3 = en2;
        object = this;
        if (((GameWorld)object).dt > GameScreen.j && ((GameWorld)object).dt < GameScreen.j + main.GameCanvas.A) {
            if (((GameWorld)object).aq) {
                if (((GameWorld)object).dC || ((GameWorld)object).dA || ((GameWorld)object).dB) {
                    if (((GameWorld)object).GameService >= bs) {
                        String string2 = String.valueOf(((GameWorld)object).dT) + (((GameWorld)object).GameService - bs) + "_0";
                        df df3 = ResourceUtil.d(string2);
                        if (df3 != null) {
                            df3.a(((GameWorld)object).dq / 2 % df3.c, ((GameWorld)object).dt, ((GameWorld)object).du + ((GameWorld)object).bS, ((GameWorld)object).dr, 3, en3);
                        }
                    } else if (!((GameWorld)object).bx) {
                        if (((GameWorld)object).bw) {
                            en3.a(dn, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 60, 60, 60, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                        } else if (((GameWorld)object).MathUtil == 2) {
                            if (!((GameWorld)object).bv) {
                                en3.a(dh, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            } else {
                                en3.a(dl, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            }
                        } else if (((GameWorld)object).MathUtil == 1) {
                            if (!((GameWorld)object).bv) {
                                en3.a(df, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            } else {
                                en3.a(dj, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            }
                        }
                    }
                }
            } else if (!((GameWorld)object).aq) {
                if (((GameWorld)object).GameService >= bs) {
                    String string3 = String.valueOf(((GameWorld)object).dT) + (((GameWorld)object).GameService - bs) + "_0";
                    df df4 = ResourceUtil.d(string3);
                    if (df4 != null) {
                        df4.a(((GameWorld)object).dq / 2 % df4.c, ((GameWorld)object).dt, ((GameWorld)object).du + ((GameWorld)object).bS, ((GameWorld)object).dr, 3, en3);
                    }
                } else if (!((GameWorld)object).bx) {
                    if (((GameWorld)object).bw) {
                        en3.a(dn, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 60, 60, 60, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                    } else if (((GameWorld)object).dB) {
                        if (((GameWorld)object).MathUtil == 2) {
                            if (!((GameWorld)object).bv) {
                                en3.a(dh, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            } else {
                                en3.a(dl, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            }
                        } else if (((GameWorld)object).MathUtil == 1) {
                            if (!((GameWorld)object).bv) {
                                en3.a(df, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            } else {
                                en3.a(dj, 0, ((GameWorld)object).do[((GameWorld)object).dp] * 40, 50, 40, ((GameWorld)object).dr, ((GameWorld)object).dt + ((GameWorld)object).dv, ((GameWorld)object).du + ((GameWorld)object).dw + ((GameWorld)object).bS, 0);
                            }
                        }
                    }
                }
            }
        }
        if (bv.f() && this.C >= bv.d - 48) {
            return;
        }
        if (this.s) {
            return;
        }
        if (this.cJ && main.GameCanvas.w % 2 == 0) {
            en2.a(16185600);
            if (this.eE != null) {
                en2.a(this.B, this.C - this.al / 2, this.eE.B, this.eE.C - this.eE.al / 2);
            }
            if (this.eF != null) {
                en2.a(this.B, this.C - this.al / 2, this.eF.m, this.eF.n - this.eF.w / 2);
            }
        }
        en3 = en2;
        object = this;
        if (!(((GameWorld)object).aq && !cX || ((GameWorld)object).cV >= 0 || ((GameWorld)object).H != 1 && ((GameWorld)object).H != 6 || ResourceUtil.d() - ((GameWorld)object).Pos <= 0L || ((GameWorld)object).cF || ((GameWorld)object).Q < 16)) {
            int n6 = 7598;
            if (((GameWorld)object).Q >= 19) {
                n6 = 7676;
            }
            if (((GameWorld)object).Q >= 22) {
                n6 = 7677;
            }
            if (((GameWorld)object).Q >= 25) {
                n6 = 7678;
            }
            if (n6 != -1) {
                eg eg2 = bl.c[n6];
                if (eg2 == null) {
                    bl.a(n6);
                } else {
                    n6 = main.GameCanvas.w / 4 % 4 * (MGraphics.IActionListener(eg2.a) / 4);
                    en3.a(eg2.a, 0, n6, MGraphics.a(eg2.a), MGraphics.IActionListener(eg2.a) / 4, 0, ((GameWorld)object).B, ((GameWorld)object).C + 2, 33);
                }
            }
        }
        en3 = en2;
        object = this;
        if (!(((GameWorld)object).aq && !cW || ((GameWorld)object).cV < 0 || ((GameWorld)object).H != 1 && ((GameWorld)object).H != 6 || main.GameCanvas.G.a || ResourceUtil.d() - ((GameWorld)object).Pos <= 0L || (df2 = ResourceUtil.d(string = String.valueOf(((GameWorld)object).eY) + ((GameWorld)object).cV + "_0")) == null)) {
            df2.a(main.GameCanvas.w / 4 % df2.c, ((GameWorld)object).B, ((GameWorld)object).C, ((GameWorld)object).I == 1 ? 0 : 2, 33, en3);
        }
        this.h(en2);
        en3 = en2;
        object = this;
        if (((GameWorld)object).cY != -1) {
            if (((GameWorld)object).eZ != null) {
                ((GameWorld)object).eZ.a(main.GameCanvas.w / 4 % ((GameWorld)object).eZ.c, ((GameWorld)object).B, ((GameWorld)object).C + 3, ((GameWorld)object).I == 1 ? 0 : 2, 33, en3);
            } else {
                ((GameWorld)object).eZ = ResourceUtil.d(String.valueOf(((GameWorld)object).fb) + ((GameWorld)object).cY + "_0");
            }
        }
        this.e(en2);
        if (this.c > 0) {
            if (main.GameCanvas.w % 2 == 0) {
                this.a(en2, this.a, this.b, this.I, 25, true);
            } else if (this.c > 5) {
                this.a(en2, this.a, this.b, this.I, 7, true);
            }
        }
        if (!(this.G() || this.cf == null || this.cf.a >= 70 && this.cf.a <= 76 || this.cf.a >= 77 && this.cf.a <= 83)) {
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
        RMSManager av2 = GameScreen.x[super.h(((GameWorld)object).bU)];
        int n7 = bC[((GameWorld)object).as][0][2] - av2.a[GameWorld.bC[((GameWorld)object).as][0][0]].c + 5;
        if (!(((GameWorld)object).bc && !((GameWorld)object).aq || !((GameWorld)object).aq && bv.ResourceUtil == 113 && ((GameWorld)object).C >= 360)) {
            if (((GameWorld)object).aq) {
                ((GameWorld)object).a(en3, ((GameWorld)object).B, ((GameWorld)object).C - (n7 += 5) + 3);
            } else {
                boolean bl2;
                boolean bl3 = GameWorld.dD.ai != null && ((GameWorld)object).ah == GameWorld.dD.ai.a;
                boolean bl4 = ((GameWorld)object).aN == 3 || ((GameWorld)object).aN == 5;
                boolean bl5 = bl2 = ((GameWorld)object).aN == 4;
                if (((GameWorld)object).ag.startsWith("$")) {
                    ((GameWorld)object).ag = ((GameWorld)object).ag.substring(1);
                    ((GameWorld)object).ev = true;
                }
                if (((GameWorld)object).ag.startsWith("#")) {
                    ((GameWorld)object).ag = ((GameWorld)object).ag.substring(1);
                    ((GameWorld)object).ew = true;
                }
                if (GameWorld.e().aU != null && GameWorld.e().aU.equals(object)) {
                    ((GameWorld)object).a(en3, ((GameWorld)object).B, ((GameWorld)object).C - (n7 += 5) + 3);
                }
                n7 += mFont.k.a();
                mFont di2 = mFont.H;
                if (((GameWorld)object).ev || ((GameWorld)object).ew) {
                    di2 = mFont.J;
                } else if (bl4) {
                    di2 = mFont.B;
                } else if (bl2) {
                    di2 = mFont.C;
                } else if (bl3) {
                    di2 = mFont.D;
                }
                if (bv.ResourceUtil == 170) {
                    if (((GameWorld)object).bz == 2325) {
                        di2 = mFont.q;
                    } else if (((GameWorld)object).bz == 2323) {
                        di2 = mFont.GameScreen;
                    }
                }
                if ((((GameWorld)object).i || bl4 || bl2) && !bl3) {
                    if (ResourceUtil.c == 1) {
                        di2.a(en3, ((GameWorld)object).ag, ((GameWorld)object).B, ((GameWorld)object).C - n7, 2, mFont.E);
                    } else {
                        di2.a(en3, ((GameWorld)object).ag, ((GameWorld)object).B, ((GameWorld)object).C - n7, 2);
                    }
                    n7 += mFont.k.a();
                }
                if (bl3) {
                    if (GameWorld.e().aU != null && GameWorld.e().aU.equals(object)) {
                        di2.a(en3, ((GameWorld)object).ag, ((GameWorld)object).B, ((GameWorld)object).C - n7, 2, mFont.E);
                    } else if (((GameWorld)object).aU == null) {
                        di2.a(en3, ((GameWorld)object).ag, ((GameWorld)object).B - 10, ((GameWorld)object).C - n7 + 3, 0, mFont.o);
                        ((GameWorld)object).a(en3, ((GameWorld)object).B - 16, ((GameWorld)object).C - n7 + 10);
                    }
                }
            }
        }
        if (this.cf == null || this.D() == null || this.cb >= this.D().length) {
            this.g(en2);
        }
        if (this.cc != null) {
            this.cc.a(en2);
        }
        if (this.cd != null) {
            this.cd.a(en2);
        }
        this.f(en2);
        this.b(en2);
        en3 = en2;
        object = this;
        if (((GameWorld)object).cY != -1) {
            if (((GameWorld)object).fa != null) {
                ((GameWorld)object).fa.a(main.GameCanvas.w / 4 % ((GameWorld)object).fa.c, ((GameWorld)object).B, ((GameWorld)object).C + 8, ((GameWorld)object).I == 1 ? 0 : 2, 33, en3);
            } else {
                ((GameWorld)object).fa = ResourceUtil.d(String.valueOf(((GameWorld)object).fb) + ((GameWorld)object).cY + "_1");
            }
        }
        en3 = en2;
        object = this;
        if (cX) {
            if (((GameWorld)object).H == 1 || ((GameWorld)object).H == 6) {
                if (ResourceUtil.d() - ((GameWorld)object).Pos > 0L) {
                    if (((GameWorld)object).cF) {
                        if (main.GameCanvas.w % 2 == 0) {
                            ++((GameWorld)object).ep;
                        }
                        if (((GameWorld)object).ep > 6) {
                            ((GameWorld)object).ep = 0;
                        }
                        en3.a(main.GameCanvas.S[((GameWorld)object).ep], ((GameWorld)object).B, ((GameWorld)object).C + 9, 33);
                    } else {
                        if (((GameWorld)object).Q >= 14 && !main.GameCanvas.a) {
                            boolean bl6 = false;
                            if (ResourceUtil.d() - ((GameWorld)object).Pos > -1000L && ((GameWorld)object).eq) {
                                bl6 = true;
                                ((GameWorld)object).eq = false;
                            }
                            if (ResourceUtil.d() - ((GameWorld)object).Pos > -500L && ((GameWorld)object).er) {
                                bl6 = true;
                                ((GameWorld)object).er = false;
                            }
                            if (bl6) {
                                main.GameCanvas.a().a(-1, ((GameWorld)object).B - -8, ((GameWorld)object).C);
                                main.GameCanvas.a().a(1, ((GameWorld)object).B - 8, ((GameWorld)object).C);
                                super.e(1);
                            }
                        }
                        if (((GameWorld)object).Q == 14) {
                            if (main.GameCanvas.w % 2 == 0) {
                                ++((GameWorld)object).ep;
                            }
                            if (((GameWorld)object).ep > 6) {
                                ((GameWorld)object).ep = 0;
                            }
                            en3.a(main.GameCanvas.R[((GameWorld)object).ep], ((GameWorld)object).B, ((GameWorld)object).C + 9, 33);
                        } else if (((GameWorld)object).Q == 15) {
                            if (main.GameCanvas.w % 2 == 0) {
                                ++((GameWorld)object).ep;
                            }
                            if (((GameWorld)object).ep > 6) {
                                ((GameWorld)object).ep = 0;
                            }
                            en3.a(main.GameCanvas.S[((GameWorld)object).ep], ((GameWorld)object).B, ((GameWorld)object).C + 9, 33);
                        } else if (((GameWorld)object).Q >= 16) {
                            int n8 = -1;
                            if (((GameWorld)object).Q >= 16 && ((GameWorld)object).Q < 22) {
                                n8 = 7599;
                            }
                            if (n8 != -1) {
                                eg eg3 = bl.c[7599];
                                if (eg3 == null) {
                                    bl.a(7599);
                                } else {
                                    n8 = main.GameCanvas.w / 4 % 4 * (MGraphics.IActionListener(eg3.a) / 4);
                                    en3.a(eg3.a, 0, n8, MGraphics.a(eg3.a), MGraphics.IActionListener(eg3.a) / 4, 0, ((GameWorld)object).B, ((GameWorld)object).C + 2, 33);
                                }
                            }
                        }
                    }
                }
            } else {
                ((GameWorld)object).Pos = ResourceUtil.d() + 1500L;
                ((GameWorld)object).eq = true;
                ((GameWorld)object).er = true;
            }
        }
        en3 = en2;
        object = this;
        if ((!((GameWorld)object).aq || cW) && ((GameWorld)object).cV >= 0) {
            if (((GameWorld)object).H == 1 || ((GameWorld)object).H == 6) {
                if (!main.GameCanvas.G.a && !main.GameCanvas.a) {
                    String string4;
                    df df5;
                    boolean bl7 = false;
                    if (ResourceUtil.d() - ((GameWorld)object).Pos > -1000L && ((GameWorld)object).eq) {
                        bl7 = true;
                        ((GameWorld)object).eq = false;
                    }
                    if (ResourceUtil.d() - ((GameWorld)object).Pos > -500L && ((GameWorld)object).er) {
                        bl7 = true;
                        ((GameWorld)object).er = false;
                    }
                    if (bl7) {
                        main.GameCanvas.a().a(-1, ((GameWorld)object).B - -8, ((GameWorld)object).C);
                        main.GameCanvas.a().a(1, ((GameWorld)object).B - 8, ((GameWorld)object).C);
                        super.e(1);
                    }
                    if (ResourceUtil.d() - ((GameWorld)object).Pos > 0L && (df5 = ResourceUtil.d(string4 = String.valueOf(((GameWorld)object).eY) + ((GameWorld)object).cV + "_1")) != null) {
                        df5.a(main.GameCanvas.w / 4 % df5.c, ((GameWorld)object).B, ((GameWorld)object).C + 2, ((GameWorld)object).I == 1 ? 0 : 2, 33, en3);
                    }
                }
            } else {
                ((GameWorld)object).Pos = ResourceUtil.d() + 1500L;
                ((GameWorld)object).eq = true;
                ((GameWorld)object).er = true;
            }
        }
        this.i(en2);
        en3 = en2;
        object = this;
        if (!((GameWorld)object).IMessageHandler && ((GameWorld)object).bA != 0 && ((GameWorld)object).bB != 0 && ((GameWorld)object).H != 14) {
            int n9 = 0;
            int n10 = ((GameWorld)object).B - 30;
            int n11 = ((GameWorld)object).C - 15;
            if (MathUtil.UIPanel(((GameWorld)object).C - ((GameWorld)object).bB) > 150) {
                if (((GameWorld)object).C > ((GameWorld)object).bB) {
                    n9 = 7;
                    n10 = ((GameWorld)object).B;
                    n11 = ((GameWorld)object).C - 15 - 60;
                } else {
                    n9 = 5;
                    n10 = ((GameWorld)object).B;
                    n11 = ((GameWorld)object).C - 15 + 60;
                }
            } else if (((GameWorld)object).B > ((GameWorld)object).bA) {
                n9 = 2;
            } else if (((GameWorld)object).B <= ((GameWorld)object).bA) {
                n10 = ((GameWorld)object).B + 30;
            }
            if (main.GameCanvas.w % 10 >= 5) {
                if (MathUtil.UIPanel(((GameWorld)object).B - ((GameWorld)object).bA) > 100) {
                    en3.a(GameScreen.bw, 0, 0, 13, 16, n9, n10, n11, cj.f);
                    return;
                }
                if (MathUtil.UIPanel(((GameWorld)object).B - ((GameWorld)object).bA) < 50) {
                    en3.a(UIPanel.i, ((GameWorld)object).bA + -30, ((GameWorld)object).bB - 60 + 5, 0);
                }
            }
        }
    }

    private void e(MGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.a >= 201) {
                ea2.a(en2);
            }
            ++n2;
        }
    }

    private void f(MGraphics en2) {
        if (this.ei != null) {
            int n2 = 0;
            while (n2 < this.ei.length) {
                if (this.ei[n2] != null) {
                    if (this.ei[n2].IActionListener != null) {
                        int n3 = this.ei[n2].IActionListener.n;
                        if (this.ei[n2].IActionListener instanceof cc) {
                            n3 = this.ei[n2].IActionListener.n - 60;
                        }
                        if (this.ei[n2].IActionListener instanceof d) {
                            n3 = this.ei[n2].IActionListener.n - 50;
                        }
                        if (this.ei[n2].IActionListener instanceof an) {
                            n3 = this.ei[n2].IActionListener.n - 40;
                        }
                        bl.IActionListener(en2, this.ei[n2].a(), this.ei[n2].IActionListener.m, n3, 0, 33);
                    } else if (this.ei[n2].c != null) {
                        bl.IActionListener(en2, this.ei[n2].a(), this.ei[n2].c.B, this.ei[n2].c.C, 0, 33);
                    }
                }
                ++n2;
            }
        }
        if (this.bZ >= 0 && this.ca != null) {
            bl.IActionListener(en2, this.ca.a[this.bZ].c, this.B + this.ca.a[this.bZ].a, this.C + this.ca.a[this.bZ].IActionListener, 0, 3);
        }
    }

    public final void a(MGraphics en2, int n2, int n3) {
        int n4 = (int)((long)((int)this.U * 100) / this.V) / 10 - 1;
        if (n4 < 0) {
            n4 = 0;
        }
        if (n4 > 9) {
            n4 = 9;
        }
        if (!this.aq) {
            en2.a(aa.R, 0, 6 * (9 - n4), 9, 6, 0, n2, n3 - mFont.k.a() - 6, 3);
        }
        if (this.aN != 0 || GameWorld.e().by != 0 && this.by != 0 && (this.by == 8 || GameWorld.e().by == 8 || this.by != GameWorld.e().by)) {
            this.es = (int)(this.U * 100L / this.V * (long)this.et) / 100;
            n4 = (int)(this.U * 100L / this.V);
            this.eu = n4 < 30 ? GameScreen.aH : (n4 < 60 ? GameScreen.aI : GameScreen.aK);
            int n5 = MGraphics.a(GameScreen.aJ);
            int n6 = MGraphics.IActionListener(GameScreen.aJ);
            n4 = n5 * n4 / 100;
            en2.a(GameScreen.aJ, n2 - (n5 >> 1), n3 - 1, 20);
            if (this.es >= 5 || main.GameCanvas.w % 6 < 3) {
                en2.a(this.eu, 0, 0, n4, n6, 0, n2 - (n5 >> 1), n3 - 1, 20);
            }
        }
    }

    public final void c(MGraphics en2) {
        if (this.ck) {
            return;
        }
        if (this.bU == 377) {
            return;
        }
        if (this.bV == 471) {
            return;
        }
        if (this.s) {
            return;
        }
        if (this.bq) {
            return;
        }
        byte by2 = bv.i;
        if (!(bv.ResourceUtil >= 114 && bv.ResourceUtil <= 120 || bv.ResourceUtil == 127 || bv.ResourceUtil == 128 || bv.a(this.cl + by2 / 2, this.cm + 1, 4))) {
            if (bv.a((this.cl - by2 / 2) / by2, (this.cm + 1) / by2) == 0) {
                en2.e(this.cl / by2 * by2, (this.cm - 30) / by2 * by2, 100, 100);
            } else if (bv.a((this.cl + by2 / 2) / by2, (this.cm + 1) / by2) == 0) {
                en2.e(this.cl / by2 * by2, (this.cm - 30) / by2 * by2, by2, 100);
            } else if (bv.a(this.cl - by2 / 2, this.cm + 1, 8)) {
                en2.e(this.cl / 24 * by2, (this.cm - 30) / by2 * by2, by2, 100);
            }
        }
        en2.a(bv.x, this.cl, this.cm, 3);
        en2.e(GameScreen.j, GameScreen.k - main.GameCanvas.ae, GameScreen.d, GameScreen.e + 2 * main.GameCanvas.ae);
    }

    public final void H() {
        int n2 = 0;
        this.cl = this.B;
        if (bv.a(this.B, this.C, 2)) {
            this.cm = this.C;
            return;
        }
        this.cm = this.C;
        while (n2 < 30) {
            ++n2;
            this.cm += 24;
            if (!bv.a(this.cl, this.cm, 2)) continue;
            if (this.cm % 24 == 0) break;
            this.cm -= this.cm % 24;
            return;
        }
    }

    private void UIPanel(MGraphics en2) {
        block8: {
            try {
                if (this.dc) {
                    this.a(en2, this.dd, this.Command, this.I, this.as, false);
                    return;
                }
                if (this.bc) {
                    if (this.aq) {
                        if (main.GameCanvas.w % 50 == 48 || main.GameCanvas.w % 50 == 90) {
                            bl.IActionListener(en2, 1196, this.B, this.C - 18, 0, 3);
                        } else {
                            bl.IActionListener(en2, 1195, this.B, this.C - 18, 0, 3);
                        }
                        break block8;
                    }
                } else {
                    this.a(en2, this.B, this.C + this.bS, this.I, this.as, true);
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void a(MGraphics en2, short[] sArray, int n2, int n3, int n4, boolean bl2) {
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
            if (this.as <= 3) {
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
            if (this.as == 8) {
                n5 = 5;
                n6 = 16;
            } else {
                n5 = 5;
                n6 = 20;
            }
        }
        if (this.H == 10) {
            if (this.as == 8) {
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
                    if (main.GameCanvas.w % 10 > 5) {
                        n7 = 1;
                    }
                } else {
                    n7 = 1;
                }
            }
        } else if (sArray.length > 1 && (n7 == 0 || n7 == 1) && this.H != 1 && this.H != 6) {
            this.ex = 0;
            n7 = 0;
            if (main.GameCanvas.w % 10 > 5) {
                n7 = 1;
            }
        }
        bl.IActionListener(en2, sArray[n7], n2 + (n4 == 1 ? -n5 : n5), n3 - n6, n4 == 1 ? 0 : 2, cj.f);
    }

    public final boolean a(int n2) {
        RMSManager av2 = GameScreen.x[this.bU];
        RMSManager av3 = GameScreen.x[this.bV];
        RMSManager av4 = GameScreen.x[this.bW];
        int n3 = 0;
        while (n3 < bC.length) {
            if (n2 == av2.a[GameWorld.bC[n3][0][0]].a) {
                return true;
            }
            if (n2 == av3.a[GameWorld.bC[n3][1][0]].a) {
                return true;
            }
            if (n2 == av4.a[GameWorld.bC[n3][2][0]].a) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public final void a(MGraphics en2, int n2, int n3, int n4) {
        RMSManager av2 = GameScreen.x[this.bU];
        bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n2, n3, 0, 10);
    }

    public final void IActionListener(MGraphics en2, int n2, int n3, int n4) {
        RMSManager av2 = GameScreen.x[this.bU];
        bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n2 + bC[0][0][1] + av2.a[GameWorld.bC[0][0][0]].IActionListener - 3, n3 + 3, n4, 36);
    }

    public final void a(MGraphics en2, int n2, int n3, int n4, int n5, boolean bl2) {
        MGraphics en3;
        int n6;
        this.ey = GameScreen.x[this.bU];
        this.ez = GameScreen.x[this.bV];
        this.eA = GameScreen.x[this.bW];
        if (this.bX >= 0 && this.H != 14) {
            if (!ak.UIPanel.containsKey(String.valueOf(this.bX))) {
                ak.UIPanel.put(String.valueOf(this.bX), new ak());
                GameService.a().u(this.bX);
            } else {
                ak ak2 = (ak)ak.UIPanel.get(String.valueOf(this.bX));
                if (ak2.c != null && bl2) {
                    this.a(en2, ak2.c, n2, n3, n4, true);
                }
            }
        }
        int n7 = 2;
        int n8 = 24;
        int n9 = cj.IActionListener;
        int n10 = -1;
        if (n4 == 1) {
            n7 = 0;
            n6 = 0;
            n9 = 0;
            n10 = 1;
        }
        if (this.H == 14) {
            if (main.GameCanvas.w % 4 > 0) {
                en2.a(ce.f, n2, n3 - this.al - 11, 3);
            }
            n4 = 0;
            if (this.bU == 89 || this.bU == 457 || this.bU == 460 || this.bU == 461 || this.bU == 462 || this.bU == 463 || this.bU == 464 || this.bU == 465 || this.bU == 466) {
                n4 = 15;
            }
            if (this.bU == 1291) {
                n4 = 23;
            }
            bl.IActionListener(en2, 834, n2, n3 - bC[n5][2][2] + this.eA.a[GameWorld.bC[n5][2][0]].c - 2 + n4, n7, cj.a);
            bl.IActionListener(en2, 79, n2, n3 - this.al - 8, 0, 33);
            bl.IActionListener(en2, this.ey.a[GameWorld.bC[n5][0][0]].a, n2 + (bC[n5][0][1] + this.ey.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + this.ey.a[GameWorld.bC[n5][0][0]].c, n7, n6);
            this.b(en2, n5, n3 - bC[n5][2][2] + this.eA.a[GameWorld.bC[n5][2][0]].c);
            if (GameWorld.UIPanel(this.bU)) {
                RMSManager av2 = GameScreen.x[this.h(this.bU)];
                bl.IActionListener(en2, av2.a[GameWorld.bC[n5][0][0]].a, n2 + (bC[n5][0][1] + av2.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + av2.a[GameWorld.bC[n5][0][0]].c, n7, n6);
            } else {
                bl.IActionListener(en2, this.ey.a[GameWorld.bC[n5][0][0]].a, n2 + (bC[n5][0][1] + this.ey.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + this.ey.a[GameWorld.bC[n5][0][0]].c, n7, n6);
            }
            int n11 = n3 - bC[n5][2][2] + this.eA.a[GameWorld.bC[n5][2][0]].c;
            int n12 = n5;
            en3 = en2;
            GameWorld af2 = this;
            try {
                if (af2.cZ != -1) {
                    if (GameWorld.i(n12)) {
                        if (af2.ff != null) {
                            af2.ff.a(main.GameCanvas.w / 4 % af2.ff.c, af2.B + fj[n12][0] * (af2.I == 1 ? 1 : -1), n11 + fj[n12][1], af2.I == 1 ? 0 : 2, 33, en3);
                        } else {
                            af2.ff = ResourceUtil.d(String.valueOf(af2.fh) + af2.fi + af2.cZ);
                        }
                    } else if (af2.fd != null) {
                        af2.fd.a(main.GameCanvas.w / 4 % af2.fd.c, af2.B + fj[n12][0] * (af2.I == 1 ? 1 : -1), n11 + fj[n12][1], af2.I == 1 ? 0 : 2, 33, en3);
                    } else {
                        af2.fd = ResourceUtil.d(String.valueOf(af2.fh) + af2.cZ);
                    }
                }
            }
            catch (Exception exception) {}
            this.a(en2, n2 + (bC[n5][0][1] + this.ey.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + this.ey.a[GameWorld.bC[n5][0][0]].c, n7, n6);
        } else {
            this.b(en2, n5, n3 - bC[n5][2][2] + this.eA.a[GameWorld.bC[n5][2][0]].c);
            try {
                if (GameWorld.UIPanel(this.bU)) {
                    RMSManager av3 = GameScreen.x[this.h(this.bU)];
                    bl.IActionListener(en2, av3.a[GameWorld.bC[n5][0][0]].a, n2 + (bC[n5][0][1] + av3.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + av3.a[GameWorld.bC[n5][0][0]].c, n7, n6);
                } else {
                    bl.IActionListener(en2, this.ey.a[GameWorld.bC[n5][0][0]].a, n2 + (bC[n5][0][1] + this.ey.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + this.ey.a[GameWorld.bC[n5][0][0]].c, n7, n6);
                }
                bl.IActionListener(en2, this.ez.a[GameWorld.bC[n5][1][0]].a, n2 + (bC[n5][1][1] + this.ez.a[GameWorld.bC[n5][1][0]].IActionListener) * n10, n3 - bC[n5][1][2] + this.ez.a[GameWorld.bC[n5][1][0]].c, n7, n6);
                bl.IActionListener(en2, this.eA.a[GameWorld.bC[n5][2][0]].a, n2 + (bC[n5][2][1] + this.eA.a[GameWorld.bC[n5][2][0]].IActionListener) * n10, n3 - bC[n5][2][2] + this.eA.a[GameWorld.bC[n5][2][0]].c, n7, n6);
                this.a(en2, n2 + (bC[n5][0][1] + this.ey.a[GameWorld.bC[n5][0][0]].IActionListener) * n10, n3 - bC[n5][0][2] + this.ey.a[GameWorld.bC[n5][0][0]].c, n7, n6);
            }
            catch (Exception exception) {}
        }
        int n13 = this.al = this.cE == 1 || this.cL ? 60 : bC[0][0][2] + this.ey.a[GameWorld.bC[0][0][0]].c + 10;
        int n12 = MathUtil.UIPanel(this.ey.a[GameWorld.bC[n5][0][0]].c) >= 22 ? (this.ey.a[GameWorld.bC[n5][0][0]].c < 0 ? this.ey.a[GameWorld.bC[n5][0][0]].c + 5 : this.ey.a[GameWorld.bC[n5][0][0]].c - 5) : this.ey.a[GameWorld.bC[n5][0][0]].c;
        this.eB = n3 - bC[n5][0][2] + n12;
        if (!(this.H != 1 || this.J <= 0 || this.r || this.z() || this.cG || this.cf != null || n5 == 23 || this.bX >= 0 || (main.GameCanvas.w + this.J) % 30 != 0 && !this.bk)) {
            en2.a(this.K == 1 ? ResourceUtil : k, n2 + n10 * -2, n3 - 32 + (this.K == 1 ? 10 : 11) - n5, n9);
        }
        if (this.dI != null) {
            this.dI.a(en2);
        }
        if (this.dJ != null) {
            this.dJ.a(en2);
        }
        en3 = en2;
        GameWorld af3 = this;
        if (af3.I == 1) {
            if (af3.by != 0 && af3.by != -1) {
                boolean cfr_ignored_0 = af3.aq;
                bl.IActionListener(en3, af3.bz, af3.B - 10, af3.C - af3.al - 30 + (main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), 2, 0);
                return;
            }
        } else if (af3.by != 0 && af3.by != -1) {
            boolean cfr_ignored_1 = af3.aq;
            bl.IActionListener(en3, af3.bz, af3.B, af3.C - af3.al - 30 + (main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), 0, 0);
        }
    }

    public final void d(MGraphics en2) {
        this.dP = 0;
        f[] fArray = this.D();
        this.as = fArray[this.cb].a;
        this.g(en2);
        if (this.I == 1) {
            if (this.ef != null) {
                if (this.dZ == 0) {
                    this.dZ = fArray[this.cb].c;
                }
                if (this.ec == 0) {
                    this.ec = fArray[this.cb].d;
                }
                bl.IActionListener(en2, this.ef.a[this.dW].c, this.B + this.dZ + this.ef.a[this.dW].a, this.C + this.ec + this.ef.a[this.dW].IActionListener, 0, 3);
                ++this.dW;
                if (this.dW >= this.ef.GameCanvas.length) {
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
                if (this.ed == 0) {
                    this.ed = fArray[this.cb].UIPanel;
                }
                bl.IActionListener(en2, this.eg.a[this.dX].c, this.B + this.ea + this.eg.a[this.dX].a, this.C + this.ed + this.eg.a[this.dX].IActionListener, 0, 3);
                ++this.dX;
                if (this.dX >= this.eg.GameCanvas.length) {
                    this.eg = null;
                    this.ed = 0;
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
                bl.IActionListener(en2, this.eh.a[this.dY].c, this.B + this.eb + this.eh.a[this.dY].a, this.C + this.ee + this.eh.a[this.dY].IActionListener, 0, 3);
                ++this.dY;
                if (this.dY >= this.eh.GameCanvas.length) {
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
                bl.IActionListener(en2, this.ef.a[this.dW].c, this.B - this.dZ - this.ef.a[this.dW].a, this.C + this.ec + this.ef.a[this.dW].IActionListener, 2, 3);
                ++this.dW;
                if (this.dW >= this.ef.GameCanvas.length) {
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
                if (this.ed == 0) {
                    this.ed = fArray[this.cb].UIPanel;
                }
                bl.IActionListener(en2, this.eg.a[this.dX].c, this.B - this.ea - this.eg.a[this.dX].a, this.C + this.ed + this.eg.a[this.dX].IActionListener, 2, 3);
                ++this.dX;
                if (this.dX >= this.eg.GameCanvas.length) {
                    this.eg = null;
                    this.dX = 0;
                    this.ea = 0;
                    this.ed = 0;
                }
            }
            if (this.eh != null) {
                if (this.eb == 0) {
                    this.eb = fArray[this.cb].i;
                }
                if (this.ee == 0) {
                    this.ee = fArray[this.cb].j;
                }
                bl.IActionListener(en2, this.eh.a[this.dY].c, this.B - this.eb - this.eh.a[this.dY].a, this.C + this.ee + this.eh.a[this.dY].IActionListener, 2, 3);
                ++this.dY;
                if (this.dY >= this.eh.GameCanvas.length) {
                    this.eh = null;
                    this.dY = 0;
                    this.eb = 0;
                    this.ee = 0;
                }
            }
        }
        ++this.cb;
    }

    public final void IActionListener(int n2, int n3, int n4) {
        if (n4 == 1 || MathUtil.UIPanel(n2 - this.B) > 100 || MathUtil.UIPanel(n3 - this.C) > 300) {
            this.a(this.B, this.C, 10);
            this.B = n2;
            this.C = n3;
            this.bF.removeAllElements();
            this.H = 6;
            this.G = 0;
            this.bP = null;
            this.as = 25;
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
        this.bF.addElement(new Menu(n2, n3, n5, n4));
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
                    if (GameWorld.e().cf != null || GameWorld.e().cc != null || GameWorld.e().cd != null) {
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
                    if (main.GameCanvas.w % 2 == 0) {
                        return;
                    }
                    if (this.c(this.aU)) {
                        return;
                    }
                    n10 = 0;
                    if (this.ax != null && (this.ax.a == 0 || this.ax.a == 1 || this.ax.a == 3 || this.ax.a == 5)) {
                        n10 = 40;
                    }
                    nArray = new int[]{-1, -1, -1, -1};
                    n9 = GameScreen.j - 10;
                    n8 = GameScreen.j + main.GameCanvas.A + 10;
                    n7 = GameScreen.k;
                    n6 = GameScreen.k + main.GameCanvas.B - GameScreen.h + 10;
                    if (TileMap) {
                        if (this.aQ != null && this.aQ.GameScreen != 1 && this.aQ.GameScreen != 0 && n9 <= this.aQ.m && this.aQ.m <= n8 && n7 <= this.aQ.n && this.aQ.n <= n6 || this.aT != null && n9 <= this.aT.B && this.aT.B <= n8 && n7 <= this.aT.C && this.aT.C <= n6 || this.aU != null && n9 <= this.aU.B && this.aU.B <= n8 && n7 <= this.aU.C && this.aU.C <= n6 || this.aV != null && n9 <= this.aV.a && this.aV.a <= n8 && n7 <= this.aV.IActionListener && this.aV.IActionListener <= n6) {
                            return;
                        }
                        cn = false;
                    }
                    n9 = GameWorld.e().B - 80;
                    n8 = GameWorld.e().B + 80;
                    n7 = GameWorld.e().C - 30;
                    n6 = GameWorld.e().C + 30;
                    if (this.aT != null && this.aT.df.a == 6) {
                        n9 = GameWorld.e().B - 20;
                        n8 = GameWorld.e().B + 20;
                        n7 = GameWorld.e().C - 10;
                        n6 = GameWorld.e().C + 10;
                    }
                    if (this.aT == null) {
                        n5 = 0;
                        while (n5 < GameScreen.G.size()) {
                            bq2 = (TextBox)GameScreen.G.elementAt(n5);
                            if (bq2.H != 15) {
                                n4 = Math.abs(GameWorld.e().B - bq2.B);
                                n2 = n4 > (n3 = Math.abs(GameWorld.e().C - bq2.C)) ? n4 : n3;
                                n9 = GameWorld.e().B - 80;
                                n8 = GameWorld.e().B + 80;
                                n7 = GameWorld.e().C - 30;
                                n6 = GameWorld.e().C + 30;
                                if (bq2.df.a == 6) {
                                    n9 = GameWorld.e().B - 20;
                                    n8 = GameWorld.e().B + 20;
                                    n7 = GameWorld.e().C - 10;
                                    n6 = GameWorld.e().C + 10;
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
                            bq2 = (TextBox)GameScreen.G.elementAt(n5);
                            if (bq2.H != 15) {
                                n4 = Math.abs(GameWorld.e().B - bq2.B);
                                n2 = n4 > (n3 = Math.abs(GameWorld.e().C - bq2.C)) ? n4 : n3;
                                n9 = GameWorld.e().B - 80;
                                n8 = GameWorld.e().B + 80;
                                n7 = GameWorld.e().C - 30;
                                n6 = GameWorld.e().C + 30;
                                if (bq2.df.a == 6) {
                                    n9 = GameWorld.e().B - 20;
                                    n8 = GameWorld.e().B + 20;
                                    n7 = GameWorld.e().C - 10;
                                    n6 = GameWorld.e().C + 10;
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
                                bq2 = (ce)GameScreen.E.elementAt(n5);
                                n4 = Math.abs(GameWorld.e().B - ((ce)bq2).a);
                                int n11 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - ((ce)bq2).IActionListener)) ? n4 : n3;
                                if (n4 > 48 || n3 > 48 || this.aV != null && n2 >= nArray[3]) break block58;
                                if (GameScreen.j().aX == 0) break block59;
                                GameScreen.j();
                                if (GameScreen.h() && ((ce)bq2).e.IActionListener != 9) break block58;
                            }
                            this.aV = bq2;
                            nArray[3] = n2;
                        }
                        ++n5;
                    }
                    break block60;
                }
                if (n9 <= this.aV.a && this.aV.a <= n8 && n7 <= this.aV.IActionListener && this.aV.IActionListener <= n6) break block61;
                this.aV = null;
                n5 = 0;
                while (n5 < GameScreen.E.size()) {
                    block62: {
                        block63: {
                            bq2 = (ce)GameScreen.E.elementAt(n5);
                            n4 = Math.abs(GameWorld.e().B - ((ce)bq2).a);
                            int n12 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - ((ce)bq2).IActionListener)) ? n4 : n3;
                            if (n9 > ((ce)bq2).a || ((ce)bq2).a > n8 || n7 > ((ce)bq2).IActionListener || ((ce)bq2).IActionListener > n6 || this.aV != null && n2 >= nArray[3]) break block62;
                            if (GameScreen.j().aX == 0) break block63;
                            GameScreen.j();
                            if (GameScreen.h() && ((ce)bq2).e.IActionListener != 9) break block62;
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
        n9 = GameWorld.e().B - GameWorld.e().aa() - 10;
        n8 = GameWorld.e().B + GameWorld.e().aa() + 10;
        n7 = GameWorld.e().C - GameWorld.e().ab() - n10 - 20;
        n6 = GameWorld.e().C + GameWorld.e().ab() + 20;
        if (n6 > GameWorld.e().C + 30) {
            n6 = GameWorld.e().C + 30;
        }
        if (this.aQ == null) {
            n5 = 0;
            while (n5 < GameScreen.F.size()) {
                bq2 = (aa)GameScreen.F.elementAt(n5);
                n4 = Math.abs(GameWorld.e().B - ((aa)bq2).m);
                int n13 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - ((aa)bq2).n)) ? n4 : n3;
                if (n9 <= ((aa)bq2).m && ((aa)bq2).m <= n8 && n7 <= ((aa)bq2).n && ((aa)bq2).n <= n6 && (this.aQ == null || n2 < nArray[0])) {
                    this.aQ = bq2;
                    nArray[0] = n2;
                }
                ++n5;
            }
        } else if (this.aQ.GameScreen == 1 || this.aQ.GameScreen == 0 || n9 > this.aQ.m || this.aQ.m > n8 || n7 > this.aQ.n || this.aQ.n > n6) {
            this.aQ = null;
            n5 = 0;
            while (n5 < GameScreen.F.size()) {
                bq2 = (aa)GameScreen.F.elementAt(n5);
                n4 = Math.abs(GameWorld.e().B - ((aa)bq2).m);
                int n14 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - ((aa)bq2).n)) ? n4 : n3;
                if (n9 <= ((aa)bq2).m && ((aa)bq2).m <= n8 && n7 <= ((aa)bq2).n && ((aa)bq2).n <= n6 && (this.aQ == null || n2 < nArray[0])) {
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
                bq2 = (GameWorld)GameScreen.D.elementAt(n5);
                if (bq2.H != 15 && !bq2.bc && this.co == 0 && this.cp == 0) {
                    n4 = Math.abs(GameWorld.e().B - bq2.B);
                    int n15 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - bq2.C)) ? n4 : n3;
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
                bq2 = (GameWorld)GameScreen.D.elementAt(n5);
                if (bq2.H != 15 && !bq2.bc && this.co == 0 && this.cp == 0) {
                    n4 = Math.abs(GameWorld.e().B - bq2.B);
                    int n16 = n2 = n4 > (n3 = Math.abs(GameWorld.e().C - bq2.C)) ? n4 : n3;
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

    public static boolean a(GameWorld af2) {
        int n2 = GameScreen.j;
        int n3 = GameScreen.j + main.GameCanvas.A;
        int n4 = GameScreen.k + 10;
        int n5 = GameScreen.k + GameScreen.e;
        return af2.H != 15 && !af2.bc && n2 <= af2.B && af2.B <= n3 && n4 <= af2.C && af2.C <= n5;
    }

    public final boolean I() {
        return this.aN == 4 || this.aN == 3;
    }

    public final void IActionListener(GameWorld af2) {
        this.I = this.B < af2.B ? 1 : -1;
        this.eE = af2;
        this.cJ = true;
    }

    public final void a(aa aa2) {
        this.I = this.B < aa2.m ? 1 : -1;
        this.eF = aa2;
        this.cJ = true;
    }

    public final void J() {
        bq bq2;
        if ((GameWorld.e().cf != null || GameWorld.e().cc != null || GameWorld.e().cd != null || GameWorld.e().D() != null) && this.aW.size() == 0) {
            return;
        }
        this.aW.removeAllElements();
        int n2 = 0;
        int n3 = GameScreen.j + 10;
        int n4 = GameScreen.j + main.GameCanvas.A - 10;
        int n5 = GameScreen.k + 10;
        int n6 = GameScreen.k + GameScreen.e;
        int n7 = 0;
        while (n7 < GameScreen.D.size()) {
            bq2 = (GameWorld)GameScreen.D.elementAt(n7);
            if (((GameWorld)bq2).H != 15 && !((GameWorld)bq2).bc && n3 <= ((GameWorld)bq2).B && ((GameWorld)bq2).B <= n4 && n5 <= ((GameWorld)bq2).C && ((GameWorld)bq2).C <= n6 && ((GameWorld)bq2).J != -114 && (bv.ResourceUtil != 129 || bv.ResourceUtil == 129 && GameWorld.e().C > 264)) {
                this.aW.addElement(bq2);
                if (this.aU != null && bq2.equals(this.aU)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        if (this.aq && this.I()) {
            MathUtil.c("co the tan cong nguoi");
            n7 = 0;
            while (n7 < GameScreen.F.size()) {
                bq2 = (aa)GameScreen.F.elementAt(n7);
                GameScreen.j();
                if (!GameScreen.a((aa)bq2)) {
                    MathUtil.c("khong the tan cong quai");
                    this.aQ = null;
                } else {
                    MathUtil.c("co the tan ong quai");
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
                this.a(this.aW.elementAt(n2));
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
            bq2 = (ce)GameScreen.E.elementAt(n7);
            if (n3 <= ((ce)bq2).a && ((ce)bq2).a <= n4 && n5 <= ((ce)bq2).IActionListener && ((ce)bq2).IActionListener <= n6) {
                this.aW.addElement(bq2);
                if (this.aV != null && bq2.equals(this.aV)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < GameScreen.F.size()) {
            bq2 = (aa)GameScreen.F.elementAt(n7);
            if (((aa)bq2).GameScreen != 1 && ((aa)bq2).GameScreen != 0 && n3 <= ((aa)bq2).m && ((aa)bq2).m <= n4 && n5 <= ((aa)bq2).n && ((aa)bq2).n <= n6) {
                this.aW.addElement(bq2);
                if (this.aQ != null && bq2.equals(this.aQ)) {
                    n2 = this.aW.size();
                }
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < GameScreen.G.size()) {
            bq2 = (TextBox)GameScreen.G.elementAt(n7);
            if (((GameWorld)bq2).H != 15 && n3 <= ((GameWorld)bq2).B && ((GameWorld)bq2).B <= n4 && n5 <= ((GameWorld)bq2).C && ((GameWorld)bq2).C <= n6) {
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
            this.a(this.aW.elementAt(n2));
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
            if (!main.GameCanvas.F.a) {
                x = null;
            }
            this.aT = null;
        }
    }

    private void aA() {
        if (main.GameCanvas.a) {
            return;
        }
        if (bv.a(this.B, this.C + 1, 1024)) {
            bv.IActionListener(this.B, this.C + 1, 512);
            bv.IActionListener(this.B, this.C - 2, 512);
        }
        if (bv.a(this.B - bv.i, this.C + 1, 512)) {
            bv.c(this.B - bv.i, this.C + 1, 512);
            bv.c(this.B - bv.i, this.C - 2, 512);
        }
        if (bv.a(this.B + bv.i, this.C + 1, 512)) {
            bv.c(this.B + bv.i, this.C + 1, 512);
            bv.c(this.B + bv.i, this.C - 2, 512);
        }
    }

    public final void a(long l2, long l3, boolean bl2, boolean bl3) {
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
                    string = GameStrings.cF;
                    n6 = this.B;
                    n5 = this.C - this.al;
                    n4 = 0;
                    n3 = -2;
                    n2 = 7;
                } else {
                    string = GameStrings.cF;
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
            GameScreen.a(string, n6, n5, n4, n3, n2);
        }
        if (l2 > 0L) {
            this.ek = (byte)6;
        }
        at.a(80, this, 1);
        if (this.GameWorld) {
            this.GameWorld = false;
            bH = false;
            this.a((short)this.cl, (short)this.cm);
        }
    }

    public final void K() {
        GameScreen.j().bE = true;
        GameScreen.j().bD = 0L;
        GameScreen.j().bB = true;
        GameScreen.j().bA = 0L;
        this.ek = (byte)6;
        at.a(8, this, 1);
        this.dL = true;
        this.dK = 0;
    }

    public final void a(short s2, short s3) {
        this.cE = 0;
        this.cG = false;
        if (this.aq && this.GameWorld) {
            return;
        }
        if (this.aq) {
            this.bJ = true;
            int n2 = 0;
            while (n2 < GameScreen.D.size()) {
                GameWorld af2 = (GameWorld)GameScreen.D.elementAt(n2);
                ((GameWorld)GameScreen.D.elementAt(n2)).Screen = -9999;
                ++n2;
            }
            if (main.GameCanvas.G != null && main.GameCanvas.G.ai != null) {
                main.GameCanvas.G.ai = null;
            }
            if (main.GameCanvas.H != null && main.GameCanvas.H.ai != null) {
                main.GameCanvas.H.ai = null;
            }
        }
        this.H = 5;
        this.d = s2;
        this.G = s3;
        this.F = 0;
        this.U = 0L;
        this.ba = -9999;
        this.Screen = -9999;
        if (this.aq && this.aC != null && this.aC.GameCanvas.a != 14) {
            this.C();
        }
        this.aN = 0;
    }

    public final void IActionListener(short s2, short s3) {
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
        at.a(109, this, 2);
        GameScreen.j().cn = null;
        GameScreen.O = true;
    }

    public final boolean M() {
        if (this.aF == null) {
            return false;
        }
        int n2 = 0;
        while (n2 < this.aF.length) {
            if (this.aF[n2] != null && this.aF[n2].IActionListener.IActionListener == 6) {
                GameService.a().a((byte)0, (byte)1, (byte)-1, this.aF[n2].IActionListener.a);
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static boolean aB() {
        return bv.ResourceUtil == 1 || bv.ResourceUtil == 27 || bv.ResourceUtil == 72 || bv.ResourceUtil == 10 || bv.ResourceUtil == 17 || bv.ResourceUtil == 22 || bv.ResourceUtil == 32 || bv.ResourceUtil == 38 || bv.ResourceUtil == 43 || bv.ResourceUtil == 48;
    }

    public final boolean c(GameWorld af2) {
        if (af2 == null || GameWorld.e().aC == null || GameWorld.e().aC.GameCanvas.e == 2 || GameWorld.e().aC.GameCanvas.e == 4 && af2.H != 14 && af2.H != 5) {
            return false;
        }
        return (af2.aN == 3 && GameWorld.e().aN == 3 || GameWorld.e().aN == 5 || af2.aN == 5 || GameWorld.e().aN == 1 && af2.aN == 1 || GameWorld.e().aN == 4 && af2.aN == 4 || GameWorld.e().ba >= 0 && GameWorld.e().ba == af2.J || GameWorld.e().Screen >= 0 && GameWorld.e().Screen == af2.J && !GameWorld.aB() || af2.Screen >= 0 && af2.Screen == GameWorld.e().J && !GameWorld.aB() || GameWorld.e().by == 8 && af2.by != 0 || GameWorld.e().by != 0 && af2.by == 8 || GameWorld.e().by != af2.by && GameWorld.e().by != 0 && af2.by != 0) && af2.H != 14 && af2.H != 5;
    }

    public static void N() {
        GameWorld.e().aD = null;
        int n2 = 0;
        while (n2 < GameWorld.e().aF.length) {
            if (GameWorld.e().aF[n2] != null && GameWorld.e().aF[n2].IActionListener.IActionListener == 8) {
                GameWorld.e().aF[n2] = null;
            }
            ++n2;
        }
        do.aa();
    }

    public final int ResourceUtil() {
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

    public final void a(Object object) {
        if (object instanceof aa) {
            this.aQ = (aa)object;
            this.az();
            this.aU = null;
            this.aV = null;
        } else if (object instanceof do) {
            GameWorld.e().aQ = null;
            GameWorld.e().az();
            GameWorld.e().aT = (TextBox)object;
            GameWorld.e().aU = null;
            GameWorld.e().aV = null;
        } else if (object instanceof GameWorld) {
            GameWorld.e().aQ = null;
            GameWorld.e().az();
            GameWorld.e().aU = (GameWorld)object;
            GameWorld.e().aV = null;
        } else if (object instanceof ce) {
            GameWorld.e().aQ = null;
            GameWorld.e().az();
            GameWorld.e().aU = null;
            GameWorld.e().aV = (ce)object;
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
        if (!main.GameCanvas.a) {
            if (n2 == 1) {
                ea ea2 = new ea(19, this.B - 5, this.C + 20, 2, 1, -1);
                ei.a(ea2);
                return;
            }
            if (n2 == 2) {
                if (this.aq && this.cE == 1) {
                    return;
                }
                if (this.u && main.GameCanvas.w % 5 == 0) {
                    ea ea3 = new ea(22, this.B - 5, this.C + 35, 2, 1, -1);
                    ei.a(ea3);
                    return;
                }
            } else if (n2 == 3 && this.cm - this.C <= 5) {
                ea ea4 = new ea(19, this.B - 5, this.cm + 20, 2, 1, -1);
                ei.a(ea4);
            }
        }
    }

    public static boolean a(byte by2) {
        boolean bl2 = true;
        int n2 = 0;
        while (n2 < GameScreen.H.size()) {
            ep ep2 = (ep)GameScreen.H.elementAt(n2);
            if (ep2 != null) {
                if (ep2.a == by2) {
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

    public final void a(short s2, short s3, byte by2) {
        this.eH = true;
        this.eJ = s2;
        this.eK = s3;
        this.eL = by2;
        this.eI = 0;
        if (this.aq) {
            if (main.GameCanvas.G != null) {
                main.GameCanvas.G.A();
            }
            if (main.GameCanvas.H != null) {
                main.GameCanvas.H.A();
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

    public final void IActionListener(byte by2) {
        this.cM = 0;
        if (by2 == 4 || by2 == 5) {
            if (this.aq) {
                GameService.a().h(by2);
            }
            ei.a(new ea(34, this.B, this.C + 12, 2, 1, -1));
        }
        if (by2 == 6) {
            ei.a(new ea(38, this.B, this.C + 12, 2, 1, -1));
        }
        if (this.aq) {
            main.GameCanvas.G.z();
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

    public final void a(int n2, int n3, int n4, int n5) {
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
            if (ea2.a == n2) {
                return ea2;
            }
            ++n3;
        }
        return null;
    }

    public final void a(ea ea2) {
        this.b(0, ea2.a);
        this.eQ.addElement(ea2);
    }

    public final void IActionListener(int n2, int n3) {
        if (n2 == -1) {
            this.eQ.removeAllElements();
            return;
        }
        if (this.f(n3) != null) {
            this.eQ.removeElement(this.f(n3));
        }
    }

    private void h(MGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.h == 0) {
                boolean bl2 = true;
                if (ea2.i == 0) {
                    bl2 = this.H == 1 || this.H == 6;
                }
                if (bl2) {
                    ea2.a(en2);
                }
            }
            ++n2;
        }
    }

    private void i(MGraphics en2) {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ea ea2 = (ea)this.eQ.elementAt(n2);
            if (ea2.h == 1) {
                boolean bl2 = true;
                if (ea2.i == 0) {
                    bl2 = this.H == 1 || this.H == 6;
                }
                if (bl2) {
                    ea2.a(en2);
                }
            }
            ++n2;
        }
    }

    private void aC() {
        int n2 = 0;
        while (n2 < this.eQ.size()) {
            ((ea)this.eQ.elementAt(n2)).a();
            ++n2;
        }
    }

    public final int Y() {
        return this.RMSManager + this.GameStrings;
    }

    private void a(MGraphics en2, int n2, int n3, int n4, int n5) {
        if (this.bU == 934 && (this.H == 1 || this.H == 6)) {
            if (eR == null || GameWorld.eR.d == null) {
                Image image = ResourceUtil.IActionListener("/redeye.png");
                eR = new Frame(image, 14, 10);
                return;
            }
            if (this.eW[this.eS] != -1) {
                int n6 = 8;
                if (n4 == 2) {
                    n6 = -8;
                }
                eR.a(this.eW[this.eS], n2 + n6, n3 + 15, n4, n5, en2);
            }
        }
    }

    private static boolean UIPanel(int n2) {
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
                if (!GameWorld.UIPanel(this.bU)) break block2;
                ++this.eX;
                if (this.eX <= 10000) break block3;
            }
            this.eX = 0;
        }
    }

    private int h(int n2) {
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

    private void IActionListener(MGraphics en2, int n2, int n3) {
        try {
            if (this.cZ == -1) {
                return;
            }
            if (GameWorld.i(n2)) {
                if (this.fe != null) {
                    this.fe.a(main.GameCanvas.w / 4 % this.fe.c, this.B + fj[n2][0] * (this.I == 1 ? 1 : -1), n3 + fj[n2][1], this.I == 1 ? 0 : 2, 33, en2);
                    return;
                }
                this.fe = ResourceUtil.d(String.valueOf(this.fg) + this.fi + this.cZ);
                return;
            }
            if (this.fc != null) {
                this.fc.a(main.GameCanvas.w / 4 % this.fc.c, this.B + fj[n2][0] * (this.I == 1 ? 1 : -1), n3 + fj[n2][1], this.I == 1 ? 0 : 2, 33, en2);
                return;
            }
            this.fc = ResourceUtil.d(String.valueOf(this.fg) + this.cZ);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean i(int n2) {
        return n2 == 2 || n2 == 3 || n2 == 4 || n2 == 5 || n2 == 6 || n2 == 9 || n2 == 10 || n2 == 13 || n2 == 14 || n2 == 15 || n2 == 16 || n2 == 26 || n2 == 27 || n2 == 28 || n2 == 29;
    }

    public final void a(short s2) {
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
        GameService.a().a((byte)s2, (byte)this.I, s3, s4);
    }

    public final void a(short s2, boolean bl2, byte by2, byte by3, byte by4, short s3, byte by5) {
        this.IMessageHandler = true;
        this.fl = main.GameCanvas.IActionListener + 10000L;
        this.fn = s2;
        this.fk = bl2;
        this.fm = by2;
        this.I = by4;
        this.fr = 0;
        this.fs = 0;
        long l2 = ResourceUtil.d();
        if (this.aq) {
            this.aC.f = l2;
            this.T = this.aC.GameCanvas.d == 2 ? 1L : (this.aC.GameCanvas.d != 1 ? (this.T -= (long)this.aC.i) : (this.T -= (long)this.aC.i * this.W / 100L));
            --GameWorld.e().bf;
            GameScreen.j().bB = true;
            GameScreen.j().bA = 0L;
            if (this.T < 0L) {
                this.T = 0L;
            }
        }
        if (s2 == 24) {
            GameScreen.a(18, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.a(21, 0, by3, this.Z(), null, 1, s3, (short)0);
        } else if (s2 == 25) {
            GameScreen.a(19, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.a(22, 0, by3, this.Z(), null, 1, s3, (short)0);
        } else if (s2 == 26) {
            GameScreen.a(20, 0, by3, this.Z(), null, 3, s3, (short)0);
            GameScreen.a(23, 0, by3, this.Z(), null, 1, s3, (short)0);
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

    public final void a(int n2, short s2, bk bk2, short s3, short s4, byte by2, bk[] bkArray, byte by3) {
        this.fs = n2;
        this.fn = s2;
        this.fr = 0;
        this.ft = bk2;
        this.fu = ResourceUtil.d() + (long)s3;
        if (this.fs != 1) {
            return;
        }
        if (this.fn == 24) {
            GameScreen.a(18, 1, by2, this, null, 3, s3, (short)0);
            GameScreen.a(24, 0, by2, this, this.ft, 1, s3, s4);
        }
        if (this.fn == 25) {
            GameScreen.a(19, 0, by2, this, null, 3, s3, (short)0);
            GameScreen.a(25, 0, by2, this, this.ft, 1, s3, s4);
        }
        if (this.fn == 26) {
            GameScreen.a(20, 0, by2, this, null, 3, s3, (short)0);
            GameScreen.a(26, by3, by2, bk2.IActionListener, bk2.c, 1, 0, s3, bkArray);
        }
    }

    public final GameWorld Z() {
        GameWorld af2 = new GameWorld();
        new GameWorld().J = this.J;
        af2.B = this.B;
        af2.C = this.C;
        af2.I = this.I;
        if (this.aH != null) {
            af2.aH = new h[this.aH.length];
            int n2 = 0;
            while (n2 < this.aH.length) {
                if (this.aH[n2] == null) {
                    af2.aH[n2] = null;
                } else {
                    h[] hArray = af2.aH;
                    h h2 = this.aH[n2];
                    h h3 = new h();
                    new h().IActionListener = h2.IActionListener;
                    if (h2.c != null) {
                        h3.c = new LoggingList("item.options");
                        int n3 = 0;
                        while (n3 < h2.c.size()) {
                            ee ee2 = new ee();
                            new ee().c = ((ee)h2.c.elementAt((int)n3)).c;
                            ee2.a = ((ee)h2.c.elementAt((int)n3)).a;
                            h3.c.addElement(ee2);
                            ++n3;
                        }
                    }
                    h3.d = h2.d;
                    h3.e = h2.e;
                    h3.UIPanel = h2.UIPanel;
                    h3.h = h2.h;
                    h3.k = h2.k;
                    h3.ResourceUtil = h2.ResourceUtil;
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

    public final boolean IActionListener(int n2) {
        if (this.aH != null) {
            n2 = 0;
            while (n2 < this.aH.length) {
                if (this.aH[n2] != null && this.aH[n2].IActionListener != null && this.aH[n2].IActionListener.a == 1265) {
                    return true;
                }
                ++n2;
            }
        }
        MathUtil.IActionListener("tim kiem id cai trang " + 1265 + " ko tim thay");
        return false;
    }
}

