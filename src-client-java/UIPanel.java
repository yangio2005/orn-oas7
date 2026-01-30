/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class UIPanel
implements IActionListener,
bx {
    public boolean a;
    public int IActionListener;
    public int c;
    public int d;
    public int e;
    private int aD;
    private int aE;
    private int aF;
    public int f;
    public int UIPanel;
    private int aG;
    private int aH;
    private int aI;
    private int[] aJ;
    private int aK;
    public int h;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    public static Image i;
    private static Image aQ;
    public UIGame j;
    public LoggingList k = new LoggingList("");
    private int aR;
    public int ResourceUtil;
    private boolean aS;
    public boolean m;
    private boolean aT;
    public String n;
    public cq o;
    public static String GameScreen;
    public static short q;
    public static Image r;
    public static Image s;
    public static Image t;
    public static Image u;
    public static Image v;
    public static Image w;
    public static Image x;
    public static Image Message;
    public static Image z;
    private static Image aU;
    private static Image aV;
    private Command aW = new Command(GameStrings.bw, 0);
    public int A;
    public int B;
    public int C;
    private int[] aX;
    private String[][] aY;
    private int[] aZ;
    public String[][] D;
    public String[] E;
    public String[] F;
    public static String[] G;
    public static String[] H;
    private static String[] ba;
    private static String[] Screen;
    public static int I;
    public String[][] J;
    public int[] K;
    public int[] L;
    private static String[][] bc;
    private static String[][] IConnectionListener;
    private static String[][] be;
    private static String[][] bf;
    private static String[][] bg;
    private static String[][] bh;
    public String[][][] M;
    private static byte bi;
    private static byte bj;
    private static byte bk;
    private static byte bl;
    private static byte bm;
    private static byte bn;
    private static byte bo;
    public int N;
    public int O;
    private int[] bp;
    private static int[] bq;
    private static int[] NetworkService;
    private static int[] bs;
    private static int[] GameService;
    private static int[] SettingsManager;
    private static int[] bv;
    private static int[] bw;
    private static int[] bx;
    private static int[] by;
    private static int[][] bz;
    private static int[][] bA;
    private static int[][] bB;
    private h bC;
    private eh bD;
    private cb bE;
    private e bF;
    public eh[] P;
    public LoggingList Q;
    public LoggingList R;
    private LoggingList bG;
    public LoggingList S;
    public LoggingList T;
    public LoggingList U;
    public LoggingList V;
    public LoggingList W;
    public LoggingList X;
    public LoggingList Y;
    public LoggingList Z;
    public Command aa;
    public static int ab;
    private int bH;
    public GameWorld MessageHandler;
    private boolean bI;
    private int bJ;
    public static boolean ad;
    public int ae;
    public int GameWorld;
    public int ag;
    public int ah;
    public ae ai;
    private int bK;
    private int[] bL;
    private int bM;
    public boolean aj;
    public int ak;
    private int bN;
    private int bO;
    private boolean bP;
    public boolean al;
    public boolean am;
    public boolean an;
    private int bQ;
    private int bR;
    private int[] bS;
    private boolean bT;
    private boolean bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private boolean bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private boolean ce;
    private int cf;
    private String[][] cg;
    private String ch;
    public String ao;
    private dv ci;
    private int cj;
    private int ck;
    private boolean cl;
    private String[] cm;
    private int cn;
    private static long[] co;
    private int[] cp;
    public String[] ap;
    public String[] aq;
    private int cq;
    private h cr;
    public static String ar;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    public static boolean as;
    private boolean cD;
    private int cE;
    public static LoggingList at;
    private static String[] cF;
    public boolean au;
    private int cG;
    private GameWorld cH;
    private boolean cI;
    private boolean cJ;
    private boolean cK;
    private int cL;
    public byte RMSManager;
    public int GameStrings;
    public int ax;
    public int ay;
    private int cM;
    private int cN;
    private int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int[] cS;
    private int[] cT;
    private int[] cU;
    private int[] cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private boolean IMessageHandler;
    private boolean dc;
    private boolean dd;
    public boolean az;
    public short aA;
    private short Command;
    public short aB;
    private short[] df;
    public String[][] aC;
    private static int[] BaseCanvas;
    private static int dh;
    private static int[][] mFont;
    private Image dj;
    private Image dk;
    private Image dl;
    private Image dm;
    private byte dn;
    private boolean do;

    static {
        aQ = ResourceUtil.IActionListener("/img/map" + bv.r + ".png");
        i = ResourceUtil.IActionListener("/mainImage/myTexture2dbantay.png");
        ResourceUtil.IActionListener("/mainImage/myTexture2dbtX.png");
        w = ResourceUtil.IActionListener("/mainImage/myTexture2dimgMoney.png");
        Message = ResourceUtil.IActionListener("/mainImage/myTexture2dimgDiamond.png");
        z = ResourceUtil.IActionListener("/mainImage/luongkhoa.png");
        aU = ResourceUtil.IActionListener("/mainImage/myTexture2dup.png");
        aV = ResourceUtil.IActionListener("/mainImage/myTexture2ddown.png");
        r = ResourceUtil.IActionListener("/mainImage/star.png");
        s = ResourceUtil.IActionListener("/mainImage/starE.png");
        t = ResourceUtil.IActionListener("/mainImage/star8.png");
        ResourceUtil.IActionListener("/mainImage/star9.png");
        u = ResourceUtil.IActionListener("/mainImage/starCH.png");
        v = ResourceUtil.IActionListener("/mainImage/new.png");
        x = ResourceUtil.IActionListener("/mainImage/ticket12.png");
        G = new String[]{GameStrings.bS, GameStrings.bR, GameStrings.aG, GameStrings.bQ, GameStrings.aq, GameStrings.bU, GameStrings.T};
        H = new String[]{main.GameCanvas.aj ? GameStrings.fC : GameStrings.fD, GameStrings.bV, GameStrings.H, MGraphics.IActionListener > 1 ? GameStrings.bZ : GameStrings.bY};
        ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.fT};
        Screen = new String[]{GameStrings.n};
        I = 0;
        bc = new String[][]{GameStrings.ce, GameStrings.cf};
        IConnectionListener = new String[][]{GameStrings.cg, GameStrings.cf};
        be = new String[][]{GameStrings.ck};
        bf = new String[][]{GameStrings.ch};
        bg = new String[][]{GameStrings.cf, GameStrings.ci, GameStrings.cj};
        bh = GameStrings.aP;
        bi = 0;
        bj = 1;
        bk = (byte)3;
        bl = (byte)4;
        bm = (byte)5;
        bn = (byte)6;
        bo = (byte)7;
        int[] nArray = new int[16];
        nArray[0] = 21;
        nArray[2] = 1;
        nArray[3] = 2;
        nArray[4] = 24;
        nArray[5] = 3;
        nArray[6] = 4;
        nArray[7] = 5;
        nArray[8] = 6;
        nArray[9] = 27;
        nArray[10] = 28;
        nArray[11] = 29;
        nArray[12] = 30;
        nArray[13] = 42;
        nArray[14] = 47;
        nArray[15] = 46;
        bq = nArray;
        NetworkService = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
        bs = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
        GameService = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
        SettingsManager = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
        bv = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
        bw = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
        bx = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
        by = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
        bz = new int[][]{bq, GameService, bw};
        bA = new int[][]{NetworkService, SettingsManager, bx};
        bB = new int[][]{bs, bv, by};
        ab = 240;
        ad = false;
        co = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
        int[] nArray2 = new int[]{2327248, 8982199, 0xFF0606};
        int[] nArray3 = new int[]{4583423, 0xFF1CFF, 0xFF0C0C};
        ar = "";
        as = true;
        at = new LoggingList("");
        BaseCanvas = new int[]{2, 1, 1};
        dh = 1;
        mFont = new int[][]{{0xFFFFFF, 0xE4E4E5, 13487823, 0xB2B2B3, 0x939494, 0x787878}, {61952, 58624, 52224, 45824, 39168, 32768}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {37119, 33509, 28108, 24499, 21145, 17536}, {0xFFFC00, 15063040, 0xC0CC00, 11776256, 0x999000, 8290304}, {0xFF0000, 0xE50000, 0xCC0000, 0xB30000, 0x990000, 0x800000}};
    }

    public UIPanel() {
        String[][][] stringArrayArray = new String[27][][];
        stringArrayArray[2] = bc;
        stringArrayArray[3] = be;
        stringArrayArray[4] = bf;
        stringArrayArray[7] = new String[][]{{""}};
        stringArrayArray[8] = new String[][]{{""}};
        stringArrayArray[9] = new String[][]{{""}};
        stringArrayArray[10] = new String[][]{{""}};
        stringArrayArray[11] = new String[][]{{""}};
        stringArrayArray[12] = IConnectionListener;
        stringArrayArray[13] = bg;
        stringArrayArray[14] = new String[][]{{""}};
        stringArrayArray[15] = new String[][]{{""}};
        stringArrayArray[16] = new String[][]{{""}};
        stringArrayArray[17] = new String[][]{{""}};
        stringArrayArray[18] = new String[][]{{""}};
        stringArrayArray[19] = new String[][]{{""}};
        stringArrayArray[20] = new String[][]{{""}};
        stringArrayArray[21] = bh;
        stringArrayArray[22] = new String[][]{{""}};
        stringArrayArray[23] = new String[][]{{""}};
        stringArrayArray[24] = new String[][]{{""}};
        stringArrayArray[25] = new String[][]{{""}};
        stringArrayArray[26] = new String[][]{{""}};
        this.M = stringArrayArray;
        this.bG = new LoggingList("");
        this.S = new LoggingList("");
        this.T = new LoggingList("");
        this.U = new LoggingList("");
        this.V = new LoggingList("");
        this.W = new LoggingList("");
        this.X = new LoggingList("");
        this.Y = new LoggingList("");
        this.Z = new LoggingList("");
        this.bH = 0;
        this.bJ = -1;
        this.bM = 0;
        this.aj = false;
        this.bS = new int[3];
        this.bY = 0;
        this.bZ = false;
        this.ca = main.GameCanvas.t + this.aL;
        this.cb = main.GameCanvas.u + this.aM;
        this.cc = -1;
        this.cd = -1;
        this.cf = -1;
        this.cg = new String[][]{GameStrings.dk, GameStrings.dj};
        this.ch = "";
        this.ao = "";
        this.cm = new String[]{GameStrings.t, GameStrings.s, GameStrings.r, GameStrings.v, GameStrings.gl, GameStrings.gm};
        this.cn = 0;
        this.cp = new int[]{43520, 14743570, 0xD80000};
        this.cq = 0;
        this.cr = null;
        this.cu = 140;
        this.cv = -1;
        this.cx = 0;
        this.cy = 0;
        this.RMSManager = (byte)-1;
        this.dc = true;
        this.dd = false;
        this.az = true;
        this.dn = 0;
        this.do = false;
        this.a();
        this.aa = new Command("", this, 1003, null);
        this.aa.UIPanel = ResourceUtil.IActionListener("/mainImage/myTexture2dbtX.png");
        this.aa.q = true;
        this.bC = null;
    }

    public final void a() {
        this.ca = main.GameCanvas.t + this.aL;
        this.cb = main.GameCanvas.u + this.aM;
        this.aX = new int[this.M.length];
        int n2 = 0;
        while (n2 < this.aX.length) {
            this.aX[n2] = -1;
            ++n2;
        }
    }

    private static int G() {
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (bv.ResourceUtil == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int H() {
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (bv.ResourceUtil == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int I() {
        if (GameWorld.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (GameScreen.ad[GameWorld.e().aD.a] == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int J() {
        if (GameWorld.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (GameScreen.ad[GameWorld.e().aD.a] == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private void c(int n2) {
        this.bJ = -1;
        this.d = ab;
        this.e = main.GameCanvas.B;
        this.b = 0;
        this.c = 0;
        this.aD = 24;
        this.bH = n2;
        if (n2 == 0) {
            this.ae = 2;
            this.GameWorld = 80;
            this.ag = this.d - 4;
            this.ah = this.e - 96;
            this.h = this.ag;
            this.aK = 0;
            this.b = 0;
        } else if (n2 == 1) {
            this.ag = this.d - 4;
            this.ae = main.GameCanvas.A - this.ag;
            this.GameWorld = 80;
            this.ah = this.e - 96;
            this.b = this.ae - 2;
            this.h = -(main.GameCanvas.A + this.d);
            this.aK = main.GameCanvas.A - this.d;
        }
        this.aE = this.d / 5 - 1;
        this.B = 0;
        this.aY = this.M[this.A];
        if (this.aY.length < 5) {
            this.aE += 5;
        }
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.bp = new int[this.aY.length];
        this.aJ = new int[this.aY.length];
        n2 = 0;
        while (n2 < this.aY.length) {
            this.bp[n2] = main.GameCanvas.e ? -1 : 0;
            ++n2;
        }
        if (this.aX[this.A] != -1) {
            this.B = this.aX[this.A];
        }
        if (this.B < 0) {
            this.B = 0;
        }
        if (this.B > this.aY.length - 1) {
            this.B = this.aY.length - 1;
        }
        this.ci = null;
    }

    public final void IActionListener() {
        this.A = 14;
        this.c(0);
        UIPanel g2 = this;
        this.aD = 24;
        g2.O = g2.E.length;
        g2.aI = g2.O * g2.aD - g2.ah;
        g2.f = 0;
        g2.UIPanel = 0;
        g2.ak = main.GameCanvas.e ? -1 : 0;
        this.aK = 0;
        this.h = 0;
    }

    private void K() {
        GameScreen.j();
        if (GameScreen.f()) {
            return;
        }
        if (!as) {
            return;
        }
        if (v.a(2, 0)) {
            v.f = true;
            GameScreen.aD.a(GameStrings.cq, 0);
        }
        if (v.a(3, 0)) {
            v.h = true;
        }
        this.A = 4;
        this.aY = this.M[this.A];
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.aK = 0;
        this.h = 0;
        UIPanel g2 = this;
        if (as) {
            if (bv.s != bv.r) {
                MathUtil.c("LOAD TAM HINH");
                if (MGraphics.IActionListener == 1) {
                    bl.IActionListener = null;
                    GameScreen.GameService = false;
                    System.gc();
                }
                aQ = ResourceUtil.a("/img/map" + bv.r + ".png");
                bv.s = bv.r;
            }
            g2.aL = UIPanel.G() - g2.ag / 2;
            g2.aM = UIPanel.H() + g2.GameWorld - (g2.GameWorld + g2.ah / 2);
            g2.bX = g2.aL;
            g2.bY = g2.aM;
            g2.aN = 250 - g2.ag;
            g2.aO = 220 - g2.ah;
            if (g2.aN < 0) {
                g2.aN = 0;
            }
            if (g2.aO < 0) {
                g2.aO = 0;
            }
            int n2 = 0;
            while (n2 < bz[bv.r].length) {
                if (bv.ResourceUtil == bz[bv.r][n2]) {
                    g2.cB = bA[bv.r][n2] + g2.ae;
                    g2.cC = bB[bv.r][n2] + g2.GameWorld + 5;
                    break;
                }
                ++n2;
            }
            g2.cz = UIPanel.G() + g2.ae;
            g2.cA = UIPanel.H() + g2.GameWorld;
            UIPanel.I();
            UIPanel.J();
        }
    }

    public final void c() {
        this.O = GameWorld.e().aE.length;
        this.c(0);
        this.A = 9;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    public final void d() {
        this.A = 17;
        this.c(1);
        this.e();
        this.bJ = 2;
        this.B = 0;
    }

    public final void e() {
        this.aD = 24;
        this.O = GameWorld.e().aJ[4].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    public final void f() {
        this.A = 7;
        this.c(1);
        this.b(true);
        this.B = 0;
    }

    public final void a(r r2) {
        this.bG.insertElementAt(r2, 0);
        if (this.bG.size() > 20) {
            this.bG.removeElementAt(this.bG.size() - 1);
        }
    }

    public final void UIPanel() {
        this.aD = 24;
        this.O = this.S.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    public final void h() {
        this.A = 18;
        this.c(0);
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        UIPanel g2 = this;
        this.O = g2.Y.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
    }

    public final void a(GameWorld af2) {
        this.A = 10;
        this.c(0);
        this.g();
        this.MessageHandler = af2;
    }

    public final void i() {
        this.A = 11;
        this.c(0);
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        this.k();
    }

    public final void j() {
        this.A = 16;
        this.c(0);
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        UIPanel g2 = this;
        this.O = g2.X.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
    }

    public final void a(byte by2) {
        this.A = 15;
        this.c(0);
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        UIPanel g2 = this;
        this.O = g2.W.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
        this.bI = by2 != 0;
    }

    public final void k() {
        this.O = this.T.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        if (this.ak > this.O - 1) {
            this.ak = this.O - 1;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void ResourceUtil() {
        this.A = 8;
        this.c(0);
        UIPanel g2 = this;
        this.aD = 24;
        g2.x();
        g2.ak = main.GameCanvas.e ? -1 : 0;
        this.B = 0;
    }

    public final void a(int n2) {
        this.A = 1;
        this.c(0);
        this.Message();
        this.B = 0;
        this.bJ = n2;
    }

    public final void m() {
        this.A = 2;
        bc = main.GameCanvas.A > 2 * ab ? new String[][]{GameStrings.ce} : new String[][]{GameStrings.ce, GameStrings.cf};
        this.M[2] = bc;
        this.c(0);
        if (this.B == 0) {
            this.T();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.GameCanvas.A > 2 * ab) {
            main.GameCanvas.H = new UIPanel();
            main.GameCanvas.H.M[7] = new String[][]{{""}};
            main.GameCanvas.H.f();
            main.GameCanvas.H.s();
        }
    }

    public final void n() {
        this.A = 12;
        IConnectionListener = main.GameCanvas.A > 2 * ab ? new String[][]{GameStrings.cg} : new String[][]{GameStrings.cg, GameStrings.cf};
        this.M[this.A] = IConnectionListener;
        this.c(0);
        if (this.B == 0) {
            this.o();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.GameCanvas.A > 2 * ab) {
            main.GameCanvas.H = new UIPanel();
            main.GameCanvas.H.M[7] = new String[][]{{""}};
            main.GameCanvas.H.f();
            main.GameCanvas.H.s();
        }
        this.RMSManager = (byte)-1;
        this.az = true;
    }

    public final void o() {
        this.O = this.k.size() + 1;
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void L() {
        this.A = 22;
        this.c(0);
        UIPanel g2 = this;
        this.O = Screen.length;
        g2.aD = 24;
        g2.ak = main.GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void GameScreen() {
        this.A = 21;
        bh = main.GameCanvas.H != null ? GameStrings.aQ : GameStrings.aP;
        this.M[21] = bh;
        this.cm = GameWorld.e().K == 1 ? new String[]{GameStrings.t, GameStrings.s, GameStrings.r, GameStrings.v, GameStrings.gl, GameStrings.gm} : new String[]{GameStrings.t, GameStrings.s, GameStrings.r, GameStrings.v, GameStrings.gl};
        this.c(2);
        if (this.B == 0) {
            this.U();
        }
        if (this.B == 1) {
            this.P();
        }
        if (this.B == 2) {
            this.b(true);
        }
    }

    public final void q() {
        this.A = 0;
        this.c(0);
        if (this.B == 1) {
            this.b(true);
        }
        if (this.B == 2) {
            this.R();
        }
        if (this.B == 3) {
            if (this.D.length == 4) {
                this.Q();
            } else {
                this.w();
            }
        }
        if (this.B == 4) {
            this.Q();
        }
    }

    public final void r() {
        this.A = 3;
        this.c(0);
        this.S();
        this.aK = 0;
        this.h = 0;
    }

    private void IActionListener(h h2) {
        String string;
        block37: {
            int n2;
            int n3;
            this.ai = new ae();
            string = "";
            if (h2.IActionListener.c != GameWorld.e().K) {
                if (h2.IActionListener.c == 0) {
                    string = String.valueOf(string) + "\n|7|1|" + GameStrings.cr;
                } else if (h2.IActionListener.c == 1) {
                    string = String.valueOf(string) + "\n|7|1|" + GameStrings.cs;
                } else if (h2.IActionListener.c == 2) {
                    string = String.valueOf(string) + "\n|7|1|" + GameStrings.ct;
                }
            }
            String string2 = "";
            if (h2.a != null) {
                n3 = 0;
                while (n3 < h2.GameCanvas.length) {
                    if (h2.a[n3].c.a == 72) {
                        string2 = " [+" + h2.a[n3].a + "]";
                    }
                    ++n3;
                }
            }
            n3 = 0;
            if (h2.a != null) {
                n2 = 0;
                while (n2 < h2.GameCanvas.length) {
                    if (h2.a[n2].c.a == 41) {
                        n3 = 1;
                        if (h2.a[n2].a == 1) {
                            string = String.valueOf(string) + "|0|1|" + h2.IActionListener.d + string2;
                        }
                        if (h2.a[n2].a == 2) {
                            string = String.valueOf(string) + "|2|1|" + h2.IActionListener.d + string2;
                        }
                        if (h2.a[n2].a == 3) {
                            string = String.valueOf(string) + "|8|1|" + h2.IActionListener.d + string2;
                        }
                        if (h2.a[n2].a == 4) {
                            string = String.valueOf(string) + "|7|1|" + h2.IActionListener.d + string2;
                        }
                    }
                    ++n2;
                }
            }
            if (n3 == 0) {
                string = String.valueOf(string) + "|0|1|" + h2.IActionListener.d + string2;
            }
            if (h2.a == null) break block37;
            n2 = 0;
            while (n2 < h2.GameCanvas.length) {
                block40: {
                    block39: {
                        Object object;
                        block38: {
                            boolean bl2 = h2.a[n2].c.IActionListener.startsWith("$");
                            if (!bl2) break block38;
                            object = h2.a[n2];
                            object = ai.a(((ee)object).c.IActionListener, "$", "");
                            if (h2.a[n2].a == 1) {
                                string = String.valueOf(string) + "\n|1|1|" + (String)object;
                            }
                            if (h2.a[n2].a == 0) {
                                string = String.valueOf(string) + "\n|0|1|" + (String)object;
                            }
                            break block39;
                        }
                        object = h2.a[n2].a();
                        if (((String)object).equals("")) break block39;
                        if (h2.a[n2].c.a == 72) break block40;
                        if (h2.a[n2].c.a == 102) {
                            this.ai.o = (byte)h2.a[n2].a;
                        } else if (h2.a[n2].c.a == 107) {
                            this.ai.GameScreen = (byte)h2.a[n2].a;
                        } else {
                            string = h2.a[n2].c.c > 0 ? String.valueOf(string) + "\n|" + h2.a[n2].c.c + "|1|" + (String)object : String.valueOf(string) + "\n|1|1|" + (String)object;
                        }
                    }
                    if (h2.a[n2].c.a == 228 && h2.a[n2].a > 7) {
                        int n4 = 0;
                        while (n4 < h2.a[n2].a - 7) {
                            this.ai.r[n4 + 7] = true;
                            ++n4;
                        }
                    }
                }
                ++n2;
            }
        }
        if (this.bC.IActionListener.i > 1) {
            String string3 = String.valueOf(GameStrings.cu) + ": " + this.bC.IActionListener.i;
            if ((long)this.bC.IActionListener.i > GameWorld.e().Message) {
                string = String.valueOf(string) + "\n|3|1|" + string3;
                string = String.valueOf(string) + "\n|3|1|" + GameStrings.cv + ": " + GameWorld.e().Message;
            } else {
                string = String.valueOf(string) + "\n|6|1|" + string3;
            }
        } else {
            string = String.valueOf(string) + "\n|6|1|";
        }
        this.bC.A = this.a(this.bC);
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|6|" + h2.IActionListener.e;
        if (!h2.z.equals("")) {
            if (!h2.IActionListener.e.equals("")) {
                string = String.valueOf(string) + "\n--";
            }
            string = String.valueOf(string) + "\n|2|" + h2.z;
        }
        if (this.ai.GameScreen > 0) {
            string = String.valueOf(string) + "\n\n";
        }
        this.a(this.ai, string);
        this.bK = h2.IActionListener.f;
        this.bL = null;
        this.cH = null;
    }

    private void a(ae ae2, String string) {
        ae2.u = false;
        ae2.a = 180;
        ae2.e = 3 + this.b - (this.b == 0 ? 0 : MathUtil.UIPanel(ae2.a - this.d) + 8);
        ae2.d = mFont.GameScreen.a(string, ae2.a - 10);
        ae2.IActionListener = 10000000;
        ae2.i = null;
        ae2.c = 7;
        ae2.UIPanel = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.UIPanel > main.GameCanvas.B - 80) {
            ae2.UIPanel = main.GameCanvas.B - 80;
            ae2.h = ae2.d.length * 12 - ae2.UIPanel + 17;
            if (ae2.h < 0) {
                ae2.h = 0;
            }
            ae.v = 0;
            ae2.u = true;
        }
        ae2.f = main.GameCanvas.F.d - ae2.UIPanel;
        while (ae2.f < 10) {
            ++ae2.f;
            ++main.GameCanvas.F.d;
        }
        ae2.t = 10;
    }

    private void a(cb cb2) {
        this.ai = new ae();
        String string = "|0|" + cb2.d;
        string = String.valueOf(string) + "\n|1|" + e.a(cb2.h);
        int n2 = 0;
        while (n2 < this.R.size()) {
            e e2 = (e)this.R.elementAt(n2);
            if (cb2.c == e2.a) {
                string = String.valueOf(string) + "\n|5|" + GameStrings.cS + ": " + e2.ResourceUtil;
                string = String.valueOf(string) + "\n|5|" + GameStrings.cT + ": " + e2.k;
                string = String.valueOf(string) + "\n|4|" + GameStrings.cV + ": " + e2.i + GameStrings.cY;
                string = String.valueOf(string) + "\n|4|" + GameStrings.cW + ": " + e2.j + GameStrings.cY;
                this.bL = new int[]{e2.IActionListener, e2.d, e2.e};
                break;
            }
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        n2 = 0;
        while (n2 < cb2.f.length) {
            string = String.valueOf(string) + "\n" + cb2.f[n2];
            ++n2;
        }
        if (cb2.IActionListener == 1) {
            string = String.valueOf(string) + "\n|6|" + GameStrings.cZ + " " + cb2.i + "/" + cb2.j;
        }
        this.a(this.ai, string);
        this.cH = null;
    }

    private void a(e e2) {
        String string = "|0|1|" + e2.f;
        String string2 = "\n|2|1|";
        if (e2.UIPanel == 0) {
            string2 = "\n|7|1|";
        }
        if (e2.UIPanel == 1) {
            string2 = "\n|1|1|";
        }
        if (e2.UIPanel == 2) {
            string2 = "\n|0|1|";
        }
        string = String.valueOf(string) + string2 + e.a(e2.UIPanel);
        string = String.valueOf(string) + "\n|2|1|" + GameStrings.da + ": " + e2.h;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + GameStrings.cS + ": " + e2.ResourceUtil;
        string = String.valueOf(string) + "\n|5|" + GameStrings.cT + ": " + e2.k;
        string = String.valueOf(string) + "\n|4|" + GameStrings.cV + ": " + e2.i + GameStrings.cY;
        string = String.valueOf(string) + "\n|4|" + GameStrings.cW + ": " + e2.j + GameStrings.cY;
        string = String.valueOf(string) + "\n|6|" + GameStrings.IMessageHandler + ": " + e2.m;
        this.ai = new ae();
        this.a(this.ai, string);
        this.bL = new int[]{e2.IActionListener, e2.d, e2.e};
        this.bC = null;
        this.cH = null;
    }

    private void a(eh eh2) {
        try {
            String string = "|0|" + eh2.c;
            String[] stringArray = mFont.r.a(eh2.d, this.ag - 60);
            int n2 = 0;
            while (n2 < stringArray.length) {
                string = String.valueOf(string) + "\n|2|" + stringArray[n2];
                ++n2;
            }
            string = String.valueOf(string) + "\n--";
            string = String.valueOf(string) + "\n|7|" + GameStrings.dc + ": " + eh2.i;
            string = String.valueOf(string) + "\n|1|" + GameStrings.Command + ": " + eh2.f;
            string = String.valueOf(string) + "\n|4|" + GameStrings.df + ": " + eh2.UIPanel + "/" + eh2.h;
            string = String.valueOf(string) + "\n|4|" + GameStrings.do + ": " + eh2.j;
            string = String.valueOf(string) + "\n|4|" + GameStrings.dp + ": " + ai.a(eh2.e);
            this.ai = new ae();
            this.a(this.ai, string);
            this.bK = ak.a((short)((short)eh2.IActionListener)).c[0];
            this.bC = null;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void a(et et2, bf bf2, bf bf3) {
        String string = "|0|" + et2.IActionListener;
        int n2 = 0;
        while (n2 < et2.UIPanel.length) {
            string = String.valueOf(string) + "\n|4|" + et2.UIPanel[n2];
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        if (bf2 != null) {
            string = String.valueOf(string) + "\n|2|" + GameStrings.fd + ": " + bf2.c;
            string = String.valueOf(string) + "\n|5|" + ai.a(et2.i, "#", String.valueOf(bf2.k));
            string = String.valueOf(string) + "\n|5|" + GameStrings.fe + bf2.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|5|" + GameStrings.ff + ": " + bf2.a() + "s";
            string = String.valueOf(string) + "\n--";
            if (bf2.c == et2.c) {
                string = String.valueOf(string) + "\n|0|" + GameStrings.fg;
            } else {
                if (!bf2.GameCanvas.c()) {
                    string = String.valueOf(string) + "\n|1|" + GameStrings.fh + MathUtil.a(bf3.d) + " " + GameStrings.fi;
                }
                string = String.valueOf(string) + "\n|4|" + ai.a(et2.i, "#", String.valueOf(bf3.k));
            }
        } else {
            string = String.valueOf(string) + "\n|2|" + GameStrings.fj;
            string = String.valueOf(string) + "\n|1|" + GameStrings.fk + MathUtil.a(bf3.d) + " " + GameStrings.fi;
            string = String.valueOf(string) + "\n|4|" + ai.a(et2.i, "#", String.valueOf(bf3.k));
            string = String.valueOf(string) + "\n|4|" + GameStrings.fe + bf3.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|4|" + GameStrings.ff + ": " + bf3.a() + "s";
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.ai = new ae();
        this.a(this.ai, string);
        this.bK = 0;
    }

    public final void s() {
        if (main.GameCanvas.e) {
            this.aa.j = 156;
            this.aa.k = 3;
        } else {
            this.aa.j = main.GameCanvas.A - 19;
            this.aa.k = main.GameCanvas.B - 19;
        }
        this.aa.f = false;
        ae.m = null;
        bp.c();
        this.bM = 20;
        this.a = true;
        this.cD = false;
        SettingsManager.a();
        if (this.F()) {
            GameWorld.e().W();
        }
    }

    public final void t() {
        if (this.o != null && this.o.IActionListener) {
            if (this.o.d != null && (main.GameCanvas.i[12] || Screen.a(this.o.d)) && this.o.d != null) {
                this.o.d.a();
            }
            if (this.o.e != null && (main.GameCanvas.i[13] || Screen.a(this.o.e)) && this.o.e != null) {
                this.o.e.a();
            }
            if (this.o.f != null && (main.GameCanvas.i[5] || Screen.a(this.o.f)) && this.o.f != null) {
                this.o.f.a();
            }
            if (this.o.IActionListener && main.GameCanvas.ag != 0) {
                this.o.a(main.GameCanvas.ag);
                main.GameCanvas.ag = 0;
            }
            main.GameCanvas.UIPanel();
            main.GameCanvas.f();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void u() {
        block146: {
            block148: {
                block147: {
                    block143: {
                        block145: {
                            block144: {
                                if (this.o != null && this.o.IActionListener) {
                                    return;
                                }
                                if (!main.GameCanvas.G.az) {
                                    return;
                                }
                                if (bp.a) {
                                    return;
                                }
                                if (this.j == null || !this.j.k) break block143;
                                var1_1 = this.j;
                                if (var1_1.c != null && (main.GameCanvas.i[12] || Screen.a(var1_1.c))) {
                                    var1_1.c.a();
                                }
                                if (var1_1.d != null && (main.GameCanvas.i[13] || Screen.a(var1_1.d))) {
                                    var1_1.d.a();
                                }
                                if (var1_1.ResourceUtil) break block144;
                                if (dr.f == null) break block145;
                                if (main.GameCanvas.e) {
                                    dr.f.a();
                                    var1_1.n = dr.f.n;
                                }
                                if (main.GameCanvas.i[2]) {
                                    main.GameCanvas.i[2] = false;
                                    --var1_1.n;
                                    if (var1_1.n < 0) {
                                        var1_1.n = var1_1.e - 1;
                                    }
                                    dr.f.a(var1_1.n * dr.f.o);
                                }
                                if (main.GameCanvas.i[8]) {
                                    main.GameCanvas.i[8] = false;
                                    ++var1_1.n;
                                    if (var1_1.n > var1_1.e - 1) {
                                        var1_1.n = 0;
                                    }
                                    dr.f.a(var1_1.n * dr.f.o);
                                }
                                if (var1_1.n != -1) {
                                    var1_1.o = var1_1.n;
                                }
                            }
                            main.GameCanvas.UIPanel();
                            main.GameCanvas.f();
                        }
                        return;
                    }
                    if (this.cD) {
                        return;
                    }
                    if (!this.a) {
                        return;
                    }
                    if (this.aa.c()) {
                        this.aa.a();
                        return;
                    }
                    if (main.GameCanvas.i[13]) {
                        if (this.A == 4) {
                            this.q();
                            this.aK = 0;
                            this.h = 0;
                        } else {
                            this.A();
                            return;
                        }
                    }
                    if (main.GameCanvas.i[12] || main.GameCanvas.i[5]) {
                        if (this.aW.e > 0) {
                            this.a(this.aW.e, this.aW.o);
                        } else {
                            this.bV = 2;
                        }
                    }
                    if (this.equals(main.GameCanvas.G) && main.GameCanvas.H == null && main.GameCanvas.m && !main.GameCanvas.IActionListener(this.b, 0, this.d, this.e) && !this.bT) {
                        this.A();
                        return;
                    }
                    if (this.bP) break block146;
                    var1_2 = this;
                    if (var1_2.ci != null && var1_2.ci.m || var1_2.bT) break block146;
                    var2_4 = var1_2.B;
                    var4_11 = var1_2;
                    if (var4_11.dn <= 0) ** GOTO lbl-1000
                    if (var4_11.aY.length <= 1) break block147;
                    if (var4_11.ak != 0) ** GOTO lbl-1000
                    v0 = true;
                    break block148;
                }
                if (var4_11.ak >= 0) {
                    v0 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = false;
                }
            }
            if (!v0) {
                if (main.GameCanvas.i[6]) {
                    if (var1_2.GameStrings()) {
                        if (var1_2.ak >= 0) {
                            var1_2.ax();
                        } else {
                            ++var1_2.B;
                            if (var1_2.B >= var1_2.aY.length) {
                                if (main.GameCanvas.H != null) {
                                    var1_2.B = var1_2.aY.length - 1;
                                    main.GameCanvas.W = true;
                                } else {
                                    var1_2.B = 0;
                                }
                            }
                            var1_2.ak = var1_2.bp[var1_2.B];
                            var1_2.aX[var1_2.A] = var1_2.B;
                        }
                    } else {
                        ++var1_2.B;
                        if (var1_2.B >= var1_2.aY.length) {
                            if (main.GameCanvas.H != null) {
                                var1_2.B = var1_2.aY.length - 1;
                                main.GameCanvas.W = true;
                            } else {
                                var1_2.B = 0;
                            }
                        }
                        var1_2.ak = var1_2.bp[var1_2.B];
                        var1_2.aX[var1_2.A] = var1_2.B;
                    }
                }
                if (main.GameCanvas.i[4]) {
                    --var1_2.B;
                    if (var1_2.B < 0) {
                        var1_2.B = var1_2.aY.length - 1;
                    }
                    if (main.GameCanvas.W) {
                        main.GameCanvas.W = false;
                    }
                    var1_2.ak = var1_2.bp[var1_2.B];
                    var1_2.aX[var1_2.A] = var1_2.B;
                }
            }
            var1_2.cf = -1;
            var3_13 = 0;
            while (var3_13 < var1_2.aY.length) {
                if (main.GameCanvas.IActionListener(var1_2.C + var3_13 * var1_2.aE, 52, var1_2.aE - 1, 25)) {
                    var1_2.cf = var3_13;
                    if (main.GameCanvas.m) {
                        var1_2.B = var3_13;
                        var1_2.aX[var1_2.A] = var3_13;
                        main.GameCanvas.m = false;
                        var1_2.ak = var1_2.bp[var1_2.B];
                        if (var2_4 != var1_2.B || var1_2.bW != 0) break;
                        var1_2.f = 0;
                        var1_2.ak = main.GameCanvas.e != false ? -1 : 0;
                        break;
                    }
                }
                ++var3_13;
            }
            if (var2_4 != var1_2.B) {
                var1_2.dn = 0;
                SettingsManager.a();
                switch (var1_2.A) {
                    case 21: {
                        if (var1_2.B == 0) {
                            var1_2.U();
                        }
                        if (var1_2.B == 1) {
                            var1_2.P();
                        }
                        if (var1_2.B != 2) break;
                        var1_2.IActionListener(true);
                        break;
                    }
                    case 0: {
                        if (var1_2.B == 0) {
                            var4_11 = var1_2;
                            var1_2.aP = 0;
                        }
                        if (var1_2.B == 1) {
                            var1_2.IActionListener(true);
                        }
                        if (var1_2.B == 2) {
                            var1_2.R();
                        }
                        if (var1_2.B == 3) {
                            if (var1_2.D.length > 4) {
                                var1_2.w();
                            } else {
                                var1_2.Q();
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.Q();
                        break;
                    }
                    case 2: {
                        if (var1_2.B == 0) {
                            var1_2.T();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.IActionListener(true);
                        break;
                    }
                    case 3: {
                        var1_2.S();
                        break;
                    }
                    case 1: {
                        var1_2.Message();
                        break;
                    }
                    case 25: {
                        var1_2.RMSManager();
                        break;
                    }
                    case 12: {
                        if (var1_2.B == 0) {
                            var1_2.o();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.IActionListener(true);
                        break;
                    }
                    case 13: {
                        if (var1_2.B == 0) {
                            if (var1_2.equals(main.GameCanvas.G)) {
                                var1_2.IActionListener(true);
                            } else if (var1_2.equals(main.GameCanvas.H)) {
                                var1_2.a(false);
                            }
                        }
                        if (var1_2.B == 1) {
                            var1_2.a(true);
                        }
                        if (var1_2.B != 2) break;
                        var1_2.a(false);
                    }
                }
                var1_2.ak = var1_2.bp[var1_2.B];
            }
        }
        switch (this.A) {
            case 23: 
            case 24: {
                this.O();
                break;
            }
            case 21: {
                if (this.B == 0) {
                    this.O();
                }
                if (this.B == 1) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B != 2) break;
                this.O();
                break;
            }
            case 0: {
                if (this.B == 0) {
                    var1_2 = this;
                    if (main.GameCanvas.j[2]) {
                        var1_2.aP -= 5;
                    }
                    if (main.GameCanvas.j[8]) {
                        var1_2.aP += 5;
                    }
                    if (var1_2.aP < 0) {
                        var1_2.aP = 0;
                    }
                    if ((var2_4 = var1_2.cw * 12 - (var1_2.ah - 60)) < 0) {
                        var2_4 = 0;
                    }
                    if (var1_2.aP > var2_4) {
                        var1_2.aP = var2_4;
                    }
                    if (var1_2.ci != null) {
                        if (!main.GameCanvas.e) {
                            var1_2.ci.d = var1_2.aP;
                        }
                        var1_2.ci.a();
                    }
                    var3_13 = var1_2.ae + var1_2.ag / 2 - 35;
                    var4_12 = main.GameCanvas.B > 300 ? 20 : 15;
                    var2_4 = var1_2.GameWorld + var1_2.ah - var4_12 - 15;
                    var4_12 = main.GameCanvas.GameScreen;
                    var5_14 = main.GameCanvas.q;
                    var1_2.cd = -1;
                    if (UIPanel.as) {
                        GameScreen.j();
                        if (!(GameScreen.e() || var4_12 < var3_13 || var4_12 > var3_13 + 70 || var5_14 < var2_4 || var5_14 > var2_4 + 30 || var1_2.ci != null && var1_2.ci.m)) {
                            var1_2.cd = 1;
                            if (main.GameCanvas.m) {
                                SettingsManager.a();
                                var1_2.bV = 2;
                                main.GameCanvas.ResourceUtil();
                            }
                        }
                    }
                    main.GameCanvas.f();
                    return;
                }
                if (this.B == 1) {
                    this.ay();
                }
                if (this.B == 2) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B == 3) {
                    if (this.D.length == 4) {
                        var2_5 = this;
                        var2_5.O();
                    } else {
                        var1_2 = this;
                        var1_2.O();
                        var2_6 = var1_2;
                        if (var2_6.aZ != null) {
                            if (main.GameCanvas.i[4]) {
                                var2_6.bE = var2_6.X();
                                --var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.aZ.length - 1;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.bE.k.length - 1;
                                }
                            } else if (main.GameCanvas.i[6]) {
                                var2_6.bE = var2_6.X();
                                ++var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN > var2_6.aZ.length - 1) {
                                    var2_6.bN = 0;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN > var2_6.bE.k.length - 1) {
                                    var2_6.bN = 0;
                                }
                            }
                        }
                    }
                }
                if (this.B != 4) break;
                ** GOTO lbl384
            }
            case 2: {
                this.ay();
                break;
            }
            case 3: 
            case 26: {
                this.O();
                break;
            }
            case 14: {
                this.O();
                break;
            }
            case 1: 
            case 17: 
            case 25: {
                if (this.B < this.aY.length - (main.GameCanvas.H != null ? 0 : 1) && this.A != 17) {
                    this.O();
                    break;
                }
                if (this.bJ == 0) {
                    this.ay();
                    break;
                }
                this.O();
                break;
            }
            case 4: {
                var1_2 = this;
                if (main.GameCanvas.j[2]) {
                    var1_2.cC -= 5;
                    var1_2.aM = var1_2.cC - (var1_2.GameWorld + var1_2.ah / 2);
                    if (var1_2.cC < var1_2.GameWorld) {
                        var1_2.cC = var1_2.GameWorld;
                    }
                }
                if (main.GameCanvas.j[8]) {
                    var1_2.cC += 5;
                    var1_2.aM = var1_2.cC - (var1_2.GameWorld + var1_2.ah / 2);
                    if (var1_2.cC > var1_2.GameWorld + 200) {
                        var1_2.cC = var1_2.GameWorld + 200;
                    }
                }
                if (main.GameCanvas.j[4]) {
                    var1_2.cB -= 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB < 16) {
                        var1_2.cB = 16;
                    }
                }
                if (main.GameCanvas.j[6]) {
                    var1_2.cB += 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB > 250) {
                        var1_2.cB = 250;
                    }
                }
                if (main.GameCanvas.k) {
                    var1_2.bT = true;
                    if (!var1_2.bZ) {
                        var1_2.bX = var1_2.aL;
                        var1_2.bY = var1_2.aM;
                        var1_2.bZ = true;
                    }
                    var1_2.aL = var1_2.bX + (main.GameCanvas.t - main.GameCanvas.GameScreen);
                    var1_2.aM = var1_2.bY + (main.GameCanvas.u - main.GameCanvas.q);
                }
                if (main.GameCanvas.m) {
                    var1_2.bZ = false;
                    main.GameCanvas.t = main.GameCanvas.GameScreen;
                    main.GameCanvas.u = main.GameCanvas.q;
                    var1_2.ca = main.GameCanvas.t + var1_2.aL;
                    var1_2.cb = main.GameCanvas.u + var1_2.aM;
                }
                if (main.GameCanvas.ResourceUtil) {
                    var1_2.bT = false;
                }
                if (var1_2.aL < 0) {
                    var1_2.aL = 0;
                }
                if (var1_2.aL > var1_2.aN) {
                    var1_2.aL = var1_2.aN;
                }
                if (var1_2.aM < 0) {
                    var1_2.aM = 0;
                }
                if (var1_2.aM > var1_2.aO) {
                    var1_2.aM = var1_2.aO;
                }
                main.GameCanvas.f();
                return;
            }
            case 7: {
                this.ay();
                break;
            }
            case 8: {
                this.O();
                break;
            }
            case 9: {
                this.O();
                break;
            }
            case 10: {
                this.O();
                break;
            }
            case 11: 
            case 16: {
                this.O();
                break;
            }
            case 15: {
                this.O();
                break;
            }
            case 12: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    var1_2.O();
                    var1_2.cc = -1;
                    if (var1_2.ak == var1_2.k.size() && main.GameCanvas.ResourceUtil) {
                        main.GameCanvas.ResourceUtil = false;
                        var1_2.cc = 1;
                    }
                }
                if (var1_2.B != 1) break;
                var1_2.O();
                break;
            }
            case 13: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    if (var1_2.equals(main.GameCanvas.G)) {
                        var1_2.ay();
                    }
                    if (var1_2.equals(main.GameCanvas.H)) {
                        var2_7 = var1_2;
                        var2_7.O();
                    }
                }
                if (var1_2.B != 1 && var1_2.B != 2) break;
                var2_8 = var1_2;
                var2_8.O();
                break;
            }
            case 18: {
                this.O();
                break;
            }
            case 19: {
                var2_9 = this;
                var2_9.O();
                break;
            }
lbl384:
            // 2 sources

            case 20: {
                var2_10 = this;
                var2_10.O();
            }
        }
        main.GameCanvas.UIPanel();
        var1_3 = 0;
        while (var1_3 < main.GameCanvas.i.length) {
            main.GameCanvas.i[var1_3] = false;
            ++var1_3;
        }
    }

    public final void a(boolean bl2) {
        this.O = bl2 ? this.U.size() + 3 : this.V.size() + 3;
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void IActionListener(GameWorld af2) {
        this.A = 13;
        this.M[this.A] = bg;
        this.aT = false;
        this.aS = false;
        this.m = false;
        this.U.removeAllElements();
        this.V.removeAllElements();
        this.aR = 0;
        this.l = 0;
        if (main.GameCanvas.A > 2 * ab) {
            main.GameCanvas.H = new UIPanel();
            new UIPanel().A = 13;
            main.GameCanvas.H.M[this.A] = new String[][]{GameStrings.cj};
            main.GameCanvas.H.c(1);
            main.GameCanvas.H.a(false);
            main.GameCanvas.G.M[this.A] = new String[][]{GameStrings.cf, GameStrings.ci};
            main.GameCanvas.H.s();
            main.GameCanvas.H.MessageHandler = af2;
        }
        if (this.equals(main.GameCanvas.G)) {
            this.c(0);
        }
        if (this.B == 0) {
            this.b(true);
        }
        if (this.B == 1) {
            this.a(true);
        }
        if (this.B == 2) {
            this.a(false);
        }
        this.MessageHandler = af2;
    }

    private void a(MGraphics en2, boolean bl2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        LoggingList el2 = bl2 ? this.U : this.V;
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 36;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.GameWorld + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                if (n2 == this.O - 1) {
                    if (bl2) {
                        en2.a(15196114);
                        en2.IActionListener(n7, n4, this.ag, n6);
                        if (!this.aS) {
                            if (!this.m) {
                                mFont.o.a(en2, String.valueOf(GameStrings.dU) + GameStrings.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            } else {
                                mFont.o.a(en2, String.valueOf(GameStrings.dU) + GameStrings.dO, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            }
                        } else if (this.m) {
                            en2.a(15196114);
                            en2.IActionListener(n7, n4, this.ag, n6);
                            en2.a(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.IActionListener);
                            (n2 == this.ak ? mFont.UIPanel : mFont.f).a(en2, GameStrings.dT, this.ae + this.ag - 22, n4 + 7, 2);
                            mFont.o.a(en2, String.valueOf(GameStrings.dU) + GameStrings.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                        } else {
                            mFont.o.a(en2, String.valueOf(GameStrings.dU) + GameStrings.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                        }
                    }
                } else if (n2 == this.O - 2) {
                    if (bl2) {
                        en2.a(15196114);
                        en2.IActionListener(n7, n4, this.ag, n6);
                        if (!this.aT) {
                            if (!this.aS) {
                                en2.a(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.IActionListener);
                                (n2 == this.ak ? mFont.UIPanel : mFont.f).a(en2, GameStrings.dW, this.ae + this.ag - 22, n4 + 7, 2);
                                mFont.o.a(en2, String.valueOf(GameStrings.dV) + GameStrings.dM, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            } else {
                                en2.a(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.IActionListener);
                                (n2 == this.ak ? mFont.UIPanel : mFont.f).a(en2, GameStrings.bv, this.ae + this.ag - 22, n4 + 7, 2);
                                mFont.o.a(en2, String.valueOf(GameStrings.dV) + GameStrings.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            }
                        }
                    } else if (!this.m) {
                        mFont.f.a(en2, GameStrings.dN, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    } else {
                        mFont.f.a(en2, GameStrings.dP, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    }
                } else if (n2 == this.O - 3) {
                    int n10;
                    MGraphics en3;
                    int n11;
                    MGraphics en4;
                    if (this.aS) {
                        en4 = en2;
                        n11 = 13748667;
                    } else {
                        en4 = en2;
                        n11 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    en4.a(n11);
                    en2.IActionListener(n3, n4, n5, n6);
                    if (this.aS) {
                        en3 = en2;
                        n10 = 13748667;
                    } else {
                        en3 = en2;
                        n10 = n2 == this.ak ? 7300181 : 9993045;
                    }
                    en3.a(n10);
                    en2.IActionListener(n7, n8, 34, n9);
                    en2.a(w, n7 + 17, n8 + n9 / 2, 3);
                    mFont.m.a(en2, String.valueOf(ai.a((long)(bl2 ? this.aR : this.l))) + " " + GameStrings.bD, n3 + 5, n4 + 11, 0);
                    mFont.r.a(en2, GameStrings.dX, n3 + 5, n4, 0);
                } else {
                    int n12;
                    int n13;
                    MGraphics en5;
                    int n14;
                    MGraphics en6;
                    if (el2.size() == 0) {
                        return;
                    }
                    if (this.aS) {
                        en6 = en2;
                        n14 = 13748667;
                    } else {
                        en6 = en2;
                        n14 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    en6.a(n14);
                    en2.IActionListener(n3, n4, n5, n6);
                    if (this.aS) {
                        en5 = en2;
                        n13 = 13748667;
                    } else {
                        en5 = en2;
                        n13 = n2 == this.ak ? 9541120 : 9993045;
                    }
                    en5.a(n13);
                    h h2 = (h)el2.elementAt(n2);
                    if (h2 != null) {
                        n6 = 0;
                        while (n6 < h2.GameCanvas.length) {
                            byte by2;
                            if (h2.a[n6].c.a == 72 && h2.a[n6].a > 0 && (n12 = UIPanel.f(by2 = UIPanel.UIPanel(h2.a[n6].a))) != -1) {
                                int n15;
                                MGraphics en7;
                                if (this.aS) {
                                    en7 = en2;
                                    n15 = 13748667;
                                } else {
                                    en7 = en2;
                                    n15 = UIPanel.f(by2);
                                }
                                en7.a(n15);
                            }
                            ++n6;
                        }
                    }
                    en2.IActionListener(n7, n8, 34, n9);
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.a != null) {
                            n12 = 0;
                            while (n12 < h2.GameCanvas.length) {
                                if (h2.a[n12].c.a == 72) {
                                    object = " [+" + h2.a[n12].a + "]";
                                }
                                if (h2.a[n12].c.a == 41) {
                                    if (h2.a[n12].a == 1) {
                                        di2 = UIPanel.h(0);
                                    } else if (h2.a[n12].a == 2) {
                                        di2 = UIPanel.h(2);
                                    } else if (h2.a[n12].a == 3) {
                                        di2 = UIPanel.h(8);
                                    } else if (h2.a[n12].a == 4) {
                                        di2 = UIPanel.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.IActionListener.d) + (String)object, n3 + 5, n4 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.GameCanvas.length > 0 && h2.a[0] != null) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.GameCanvas.length > 1) {
                                int n16 = 1;
                                while (n16 < h2.GameCanvas.length) {
                                    if (h2.a[n16] != null && h2.a[n16].c.a != 102 && h2.a[n16].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n16].a();
                                    }
                                    ++n16;
                                }
                            }
                            ((mFont)object).a(en2, string, n3 + 5, n4 + 11, 0);
                        }
                        bl.IActionListener(en2, h2.IActionListener.f, n7 + 17, n8 + n9 / 2, 0, 3);
                        if (h2.a != null) {
                            int n17 = 0;
                            while (n17 < h2.GameCanvas.length) {
                                this.a(en2, h2.a[n17].c.a, n7, n8, n9);
                                ++n17;
                            }
                            n17 = 0;
                            while (n17 < h2.GameCanvas.length) {
                                UIPanel.a(en2, h2.a[n17].c.a, h2.a[n17].a, n7, n8, 34, n9);
                                ++n17;
                            }
                        }
                        if (h2.h > 1) {
                            mFont.n.a(en2, "" + h2.h, n7 + 34, n8 + n9 - mFont.n.a(), 1);
                        }
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void M() {
        this.bP = false;
        if (this.A == 0 && this.D.length == 5 && this.B == 3) {
            this.bP = false;
            if (this.ak == 0) {
                this.aZ = new int[this.cg.length];
                int n2 = 0;
                while (n2 < this.aZ.length) {
                    this.aZ[n2] = n2;
                    ++n2;
                }
                if (!this.an) {
                    this.bP = true;
                    return;
                }
            } else if (this.ak != 1) {
                if (this.al) {
                    return;
                }
                if (this.ak > 0) {
                    this.aZ = new int[1];
                    int n3 = 0;
                    while (n3 < this.aZ.length) {
                        this.aZ[n3] = n3;
                        ++n3;
                    }
                    this.bP = true;
                }
            }
        }
    }

    private void N() {
        try {
            if (this.A == 0 && this.B == 3 && this.D.length == 5) {
                if (this.ak == -1) {
                    return;
                }
                int n2 = 0;
                if (this.ak == 0) {
                    n2 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
                    this.bN = (main.GameCanvas.GameScreen - n2) / this.aE;
                } else {
                    this.bE = this.X();
                    if (this.bE != null && this.bE.k != null) {
                        n2 = this.ae + this.ag - 2 - this.bE.k.length * 40;
                        this.bN = (main.GameCanvas.GameScreen - n2) / 40;
                    }
                }
                if (main.GameCanvas.GameScreen < n2) {
                    this.bN = -1;
                    return;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void O() {
        int n2;
        if (this.O <= 0) {
            return;
        }
        int n3 = 0;
        if (main.GameCanvas.i[2]) {
            n3 = 1;
            --this.ak;
            if (this.A == 24) {
                this.ak -= 2;
                if (this.ak < 0) {
                    this.ak = 0;
                }
            } else if (this.ak < 0) {
                if (this.equals(main.GameCanvas.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.a();
                    if (this.L[this.B] <= 0) {
                        GameService.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                        return;
                    }
                    GameService.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                    return;
                }
                this.ak = this.O - 1;
                if (this.bP) {
                    this.ak = -1;
                }
                if (this.dn > 0) {
                    this.ak = -1;
                }
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        } else if (main.GameCanvas.i[8]) {
            n3 = 1;
            ++this.ak;
            if (this.A == 24) {
                this.ak += 2;
                if (this.ak > this.O - 1) {
                    this.ak = this.O - 1;
                }
            } else if (this.ak > this.O - 1) {
                if (this.equals(main.GameCanvas.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.a();
                    if (this.L[this.B] >= this.K[this.B] - 1) {
                        GameService.a().a((byte)4, -1, (byte)this.B, 0, -1);
                        return;
                    }
                    GameService.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                    return;
                }
                this.ak = 0;
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        }
        if (n3 != 0) {
            this.f = this.ak * this.aD - this.ah / 2;
            if (this.f > this.aI) {
                this.f = this.aI;
            }
            if (this.f < 0) {
                this.f = 0;
            }
            this.g = this.f;
        }
        if (main.GameCanvas.k) {
            this.ce = false;
            if (!this.bT && main.GameCanvas.IActionListener(this.ae, this.GameWorld, this.ag, this.ah)) {
                n3 = 0;
                while (n3 < this.bS.length) {
                    this.bS[0] = main.GameCanvas.q;
                    ++n3;
                }
                this.bR = main.GameCanvas.q;
                this.bT = true;
                this.bU = this.bW != 0;
                this.bW = 0;
            } else if (this.bT) {
                ++this.bQ;
                if (this.bQ > 5 && this.bR == main.GameCanvas.q && !this.bU) {
                    this.bR = -1000;
                    this.ak = (this.f + main.GameCanvas.q - this.GameWorld) / this.aD;
                    if (this.ak >= this.O) {
                        this.ak = -1;
                    }
                    this.N();
                }
                if ((n3 = main.GameCanvas.q - this.bS[0]) != 0 && this.ak != -1) {
                    this.ak = -1;
                    this.bN = -1;
                }
                n2 = this.bS.length - 1;
                while (n2 > 0) {
                    this.bS[n2] = this.bS[n2 - 1];
                    --n2;
                }
                this.bS[0] = main.GameCanvas.q;
                this.f -= n3;
                if (this.f < 0) {
                    this.f = 0;
                }
                if (this.f > this.aI) {
                    this.f = this.aI;
                }
                if (this.g < 0 || this.g > this.aI) {
                    n3 /= 2;
                }
                this.g -= n3;
            }
        }
        if (main.GameCanvas.m && this.bT) {
            this.ce = true;
            n3 = main.GameCanvas.q - this.bS[0];
            main.GameCanvas.m = false;
            if (MathUtil.UIPanel(n3) < 20 && MathUtil.UIPanel(main.GameCanvas.q - this.bR) < 20 && !this.bU) {
                this.bW = 0;
                this.f = this.g;
                this.bR = -1000;
                this.ak = (this.f + main.GameCanvas.q - this.GameWorld) / this.aD;
                if (this.ak >= this.O) {
                    this.ak = -1;
                }
                this.N();
                this.bQ = 0;
                this.bV = 10;
                SettingsManager.a();
            } else if (this.ak != -1 && this.bQ > 5) {
                this.bQ = 0;
                this.bV = 1;
            } else if (this.ak == -1 && !this.bU) {
                if (this.g < 0) {
                    this.f = 0;
                } else if (this.g > this.aI) {
                    this.f = this.aI;
                } else {
                    n2 = main.GameCanvas.q - this.bS[0] + (this.bS[0] - this.bS[1]) + (this.bS[1] - this.bS[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.bW = -n2 * 100;
                }
            }
            if ((this.GameStrings() || this.A == 13) && main.GameCanvas.q < this.GameWorld + 21) {
                this.ak = 0;
                this.ax();
            }
            this.bT = false;
            this.bQ = 0;
            main.GameCanvas.m = false;
        }
    }

    private void P() {
        this.O = this.cm.length;
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    private void Q() {
        SettingsManager.a();
        SettingsManager.f();
        this.O = G.length;
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void v() {
        if (this.al) {
            this.O = this.P == null ? 2 : this.P.length + 2;
            this.ch = GameStrings.dq;
        } else if (this.an) {
            this.ao = "";
            this.O = (this.Q == null ? this.R.size() : this.Q.size()) + 2;
            this.ch = String.valueOf(GameStrings.df) + " " + (this.bD != null ? this.bD.c : GameWorld.e().ai.c);
        } else if (this.am) {
            this.O = cb.ResourceUtil.size() + 2;
            this.ch = GameStrings.ae;
            this.ao = "";
        }
        this.cg = GameWorld.e().ai == null ? new String[][]{GameStrings.dk, GameStrings.dj} : (!this.an ? (this.R.size() > 1 ? new String[][]{GameStrings.dh, GameStrings.dn, GameStrings.BaseCanvas} : new String[][]{GameStrings.BaseCanvas}) : (GameWorld.e().aj > 0 ? new String[][]{GameStrings.GameWorld, GameStrings.mFont} : (this.R.size() > 1 ? new String[][]{GameStrings.GameWorld, GameStrings.mFont, GameStrings.dl, GameStrings.dm} : new String[][]{GameStrings.GameWorld, GameStrings.dl, GameStrings.dm})));
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void w() {
        GameScreen.aW = false;
        this.aD = 24;
        if (this.bp != null && this.bp[3] == 0) {
            this.bp[3] = -1;
        }
        this.O = 2;
        if (GameWorld.e().ai != null) {
            this.am = true;
            this.an = false;
            this.al = false;
        } else {
            this.am = false;
            this.an = false;
            this.al = true;
        }
        if (GameWorld.e().ai != null) {
            this.O = cb.ResourceUtil.size() + 2;
        }
        this.v();
        this.bN = -1;
        if (this.o == null) {
            this.o = new cq();
            this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
            this.o.a();
            this.o.c = main.GameCanvas.G;
        }
        if (GameWorld.e().ai == null) {
            this.ao = GameStrings.dK;
            GameService.a().a("");
        }
        this.ak = this.bp[this.B];
        if (main.GameCanvas.e) {
            this.ak = -1;
        }
    }

    public final void x() {
        this.O = this.bG.size() + 1;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void Message() {
        this.aD = 24;
        this.O = this.B == this.aY.length - 1 && main.GameCanvas.H == null && this.bJ != 2 ? this.i(GameWorld.e().aH.length + GameWorld.e().aF.length) : GameWorld.e().aJ[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void R() {
        this.aD = 30;
        this.O = GameWorld.e().ax.IActionListener.length + 6;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void S() {
        this.aD = 24;
        this.O = GameScreen.j().S.length;
        this.aI = this.O * this.aD - this.ah;
        this.f = 0;
        this.g = 0;
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void T() {
        this.O = this.i(GameWorld.e().aG.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void U() {
        this.aD = 30;
        h[] hArray = GameWorld.f().aH;
        Skill[] bfArray = GameWorld.f().aI;
        this.O = hArray.length + bfArray.length;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    private void IActionListener(boolean bl2) {
        this.O = this.i(GameWorld.e().aH.length + GameWorld.e().aF.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        if (bl2) {
            this.ak = main.GameCanvas.e ? -1 : 0;
        }
    }

    private void V() {
        if (this.bM > 0) {
            --this.bM;
        }
        if (this.ce && this.equals(main.GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            if (this.g < -50) {
                bp.a();
                this.ce = false;
                if (this.L[this.B] <= 0) {
                    GameService.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                } else {
                    GameService.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                }
            } else if (this.g > this.aI + 50) {
                this.ce = false;
                bp.a();
                if (this.L[this.B] >= this.K[this.B] - 1) {
                    GameService.a().a((byte)4, -1, (byte)this.B, 0, -1);
                } else {
                    GameService.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                }
            }
        }
        if (this.h != this.aK && !this.bT) {
            this.cj = this.aK - this.h << 2;
            this.ck += this.cj;
            this.h += this.ck >> 3;
            this.ck &= 0xF;
        }
        if (Math.abs(this.aK - this.h) < 10) {
            this.h = this.aK;
        }
        if (this.cD) {
            this.cD = false;
            this.aK = this.ag;
        }
        if (this.aK >= this.ag - 10 && this.h >= this.ag - 10 && this.bH == 0) {
            this.a = false;
            this.Z();
            if (this.cI) {
                this.cI = false;
                if (GameWorld.e().U > 0L && GameWorld.e().H != 14) {
                    bp.a();
                    if (this.A == 3) {
                        GameService.a().f(this.ak);
                    } else if (this.A == 14) {
                        GameService.a().v(this.ak);
                    }
                }
            }
            if (this.cl) {
                this.cl = false;
                int n2 = this.S.size() - this.Z.size();
                if (GameWorld.e().aU != null) {
                    GameWorld.e().aU.M = this.ak - n2 < 0 ? this.ak : (int)Short.parseShort((String)this.Z.elementAt(this.ak - n2));
                }
                Command de2 = (Command)this.S.elementAt(this.ak);
                de2.a();
            }
            this.S.removeAllElements();
            this.Z.removeAllElements();
            this.MessageHandler = null;
        }
        if (this.bW != 0 && !this.bT) {
            this.f += this.bW / 100;
            if (this.f < 0) {
                this.f = 0;
            } else if (this.f > this.aI) {
                this.f = this.aI;
            } else {
                this.g = this.f;
            }
            this.bW = this.bW * 9 / 10;
            if (this.bW < 100 && this.bW > -100) {
                this.bW = 0;
            }
        }
        if (this.g != this.f && !this.bT) {
            this.aH = this.f - this.g << 2;
            this.aG += this.aH;
            this.g += this.aG >> 4;
            this.aG &= 0xF;
        }
        this.aJ[this.B] = this.g;
    }

    private void IActionListener(MGraphics en2) {
        int n2;
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.GameWorld + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.GameWorld + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.d(n7, n8, n9, n10);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.d(n4, n5, 24, n6);
            q q2 = (q)this.W.elementAt(n2);
            if (q2.IActionListener != -1) {
                bl.IActionListener(en2, q2.IActionListener, n4, n5, 0, 0);
            } else {
                RMSManager av2 = GameScreen.x[q2.a];
                bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n4 + av2.a[GameWorld.bC[0][0][0]].IActionListener, n5 + n10 - 1, 0, 36);
            }
            en2.e(this.ae, this.GameWorld + this.g, this.ag, this.ah);
            if (q2.UIPanel != GameWorld.e().J) {
                mFont.h.a(en2, q2.e, n7 + 5, n8, 0);
            } else {
                mFont.GameCanvas.a(en2, q2.e, n7 + 5, n8, 0);
            }
            mFont.q.a(en2, q2.f, n7 + n9 - 5, n8 + 11, 1);
            mFont.m.a(en2, String.valueOf(GameStrings.bL) + ": " + q2.h, n7 + 5, n8 + 11, 0);
            ++n2;
        }
        this.f(en2);
    }

    public final void a(MGraphics en2) {
        block144: {
            Object object;
            Object object2;
            int n2;
            Object object3;
            Object object4;
            MGraphics en3;
            block143: {
                block149: {
                    UIPanel g2;
                    MGraphics en4;
                    block150: {
                        block148: {
                            block147: {
                                block146: {
                                    block145: {
                                        Object object5;
                                        int n3;
                                        en2.a(-en2.a(), -en2.IActionListener());
                                        en2.a(-this.h, 0);
                                        en2.a(this.b, 0);
                                        if (main.GameCanvas.G.RMSManager == -1) break block143;
                                        if (!this.equals(main.GameCanvas.G)) break block144;
                                        en4 = en2;
                                        g2 = this;
                                        GameScreen.j();
                                        GameScreen.IActionListener(en4);
                                        MGraphics en5 = en4;
                                        UIPanel g3 = g2;
                                        en5.a(-GameScreen.j, -GameScreen.k);
                                        if (g3.cX < 3) {
                                            n3 = 0;
                                            while (n3 < GameScreen.G.size()) {
                                                object5 = (TextBox)GameScreen.G.elementAt(n3);
                                                if (((TextBox)object5).df.a == g3.GameStrings) {
                                                    ((TextBox)object5).a(en5);
                                                    if (((GameWorld)object5).z != null) {
                                                        ((GameWorld)object5).z.a(en5, ((GameWorld)object5).B, ((GameWorld)object5).C - ((GameWorld)object5).al - main.GameCanvas.ae, ((GameWorld)object5).I);
                                                    }
                                                }
                                                ++n3;
                                            }
                                        }
                                        main.GameCanvas.a(en5);
                                        if (main.GameCanvas.w % 4 == 0) {
                                            en5.a(ce.f, g3.ax - 5, g3.ay + 15, 33);
                                            en5.a(ce.f, g3.ax + 5, g3.ay + 15, 33);
                                            en5.a(ce.f, g3.ax, g3.ay + 15, 33);
                                        }
                                        n3 = 0;
                                        while (n3 < dc.w.size()) {
                                            object5 = (dc)dc.w.elementAt(n3);
                                            ((dc)object5).a(en5);
                                            ++n3;
                                        }
                                        if (main.GameCanvas.w % 4 == 0) {
                                            en4.a(ce.f, g2.ax, g2.ay + 15, 33);
                                        }
                                        if (g2.cX != 0) break block145;
                                        int n4 = 0;
                                        while (n4 < g2.cT.length) {
                                            bl.IActionListener(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                                            if (g2.dd) {
                                                bl.IActionListener(en4, g2.Command, g2.cU[n4], g2.cV[n4], 0, 3);
                                            }
                                            ++n4;
                                        }
                                        break block144;
                                    }
                                    if (g2.cX != 1) break block146;
                                    if (!g2.dd) {
                                        bl.IActionListener(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                    } else {
                                        int n5 = 0;
                                        while (n5 < g2.cT.length) {
                                            bl.IActionListener(en4, g2.aA, g2.cU[0], g2.cV[0], 0, 3);
                                            bl.IActionListener(en4, g2.Command, g2.cU[1], g2.cV[1], 0, 3);
                                            ++n5;
                                        }
                                    }
                                    break block144;
                                }
                                if (g2.cX != 2) break block147;
                                if (!g2.dd) {
                                    bl.IActionListener(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                } else {
                                    int n6 = 0;
                                    while (n6 < g2.cT.length) {
                                        bl.IActionListener(en4, g2.aA, g2.cU[n6], g2.cV[n6], 0, 3);
                                        ++n6;
                                    }
                                }
                                break block144;
                            }
                            if (g2.cX != 3) break block148;
                            if (!g2.dd) {
                                bl.IActionListener(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                            } else {
                                bl.IActionListener(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                            }
                            break block144;
                        }
                        if (g2.cX != 4) break block149;
                        if (g2.dd) break block150;
                        if (g2.aB == -1) break block149;
                        bl.IActionListener(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                        break block144;
                    }
                    int n7 = 0;
                    while (n7 < g2.df.length) {
                        bl.IActionListener(en4, g2.df[n7], g2.cU[n7], g2.cV[n7], 0, 3);
                        ++n7;
                    }
                }
                return;
            }
            cx.c(this.b, 0, this.d, this.e, en2);
            try {
                en3 = en2;
                object4 = this;
                en3.e(((UIPanel)object4).IActionListener + 1, 0, ((UIPanel)object4).d - 2, ((UIPanel)object4).GameWorld - 2);
                en3.a(9993045);
                en3.d(((UIPanel)object4).IActionListener, 0, ((UIPanel)object4).d - 2, 50);
                switch (((UIPanel)object4).A) {
                    case 13: {
                        if (((UIPanel)object4).B == 0 || ((UIPanel)object4).B == 1) {
                            if (object4.equals(main.GameCanvas.G)) {
                                bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                                object3 = en3;
                                mFont.n.a((MGraphics)object3, GameStrings.ep, 60, 4, 0, mFont.o);
                                mFont.n.a((MGraphics)object3, GameStrings.dQ, 60, 16, 0, mFont.o);
                                mFont.n.a((MGraphics)object3, GameStrings.dR, 60, 27, 0, mFont.o);
                                mFont.n.a((MGraphics)object3, GameStrings.dS, 60, 38, 0, mFont.o);
                            }
                            if (object4.equals(main.GameCanvas.H) && ((UIPanel)object4).MessageHandler != null) {
                                bl.IActionListener(en3, ((UIPanel)object4).MessageHandler.d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                                super.a(en3, ((UIPanel)object4).MessageHandler);
                            }
                        }
                        if (((UIPanel)object4).B == 2 && ((UIPanel)object4).MessageHandler != null) {
                            bl.IActionListener(en3, ((UIPanel)object4).MessageHandler.d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.a(en3, ((UIPanel)object4).MessageHandler);
                        }
                        break;
                    }
                    case 12: {
                        if (((UIPanel)object4).B == 0) {
                            int n8 = 1410;
                            n2 = 0;
                            while (n2 < GameScreen.G.size()) {
                                object2 = (TextBox)GameScreen.G.elementAt(n2);
                                if (((TextBox)object2).df.a == ((UIPanel)object4).GameStrings) {
                                    n8 = ((GameWorld)object2).aO;
                                }
                                ++n2;
                            }
                            bl.IActionListener(en3, n8, ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            if (((UIPanel)object3).aq != null) {
                                n8 = 0;
                                while (n8 < ((UIPanel)object3).aq.length) {
                                    mFont.s.a((MGraphics)object, ((UIPanel)object3).aq[n8], ((UIPanel)object3).IActionListener + 45 + (((UIPanel)object3).d - 50) / 2, 5 + n8 * 14, 2);
                                    ++n8;
                                }
                            }
                        }
                        if (((UIPanel)object4).B == 1) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.A(en3);
                        }
                        break;
                    }
                    case 11: 
                    case 16: 
                    case 23: 
                    case 24: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 15: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 9: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 21: {
                        if (((UIPanel)object4).B == 0) {
                            bl.IActionListener(en3, GameWorld.f().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.n.a((MGraphics)object, String.valueOf(GameStrings.da) + ": " + ai.a(GameWorld.f().Message), ((UIPanel)object3).IActionListener + 60, 4, 0, mFont.o);
                            if (GameWorld.f().Message > 0L) {
                                mFont.n.a((MGraphics)object, GameWorld.f().aq ? GameWorld.f().c() : GameWorld.f().bj, ((UIPanel)object3).IActionListener + 60, 16, 0, mFont.o);
                            }
                            if (GameWorld.f().X > 0L) {
                                mFont.n.a((MGraphics)object, String.valueOf(GameStrings.eZ) + " :" + GameWorld.f().X, ((UIPanel)object3).IActionListener + 60, 27, 0, mFont.o);
                            }
                            if (GameWorld.f().cC > 0) {
                                mFont.n.a((MGraphics)object, GameStrings.fb, ((UIPanel)object3).IActionListener + 60, 38, 0, mFont.o);
                                ((MGraphics)object).a(GameScreen.aG, ((UIPanel)object3).IActionListener + 100, 41, 0);
                                int n9 = GameWorld.f().bf * MGraphics.a(GameScreen.aF) / GameWorld.f().cC;
                                ((MGraphics)object).e(100, ((UIPanel)object3).IActionListener + 41, n9, 20);
                                ((MGraphics)object).a(GameScreen.aF, ((UIPanel)object3).IActionListener + 100, 41, 0);
                            }
                            ((MGraphics)object).e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                        }
                        if (((UIPanel)object4).B == 1) {
                            bl.IActionListener(en3, GameWorld.f().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.c.a((MGraphics)object, "HP: " + GameWorld.f().U + "/" + GameWorld.f().V, ((UIPanel)object3).IActionListener + 60, 4, 0, mFont.f);
                            mFont.c.a((MGraphics)object, "MP: " + GameWorld.f().T + "/" + GameWorld.f().W, ((UIPanel)object3).IActionListener + 60, 16, 0, mFont.f);
                            mFont.n.a((MGraphics)object, String.valueOf(GameStrings.fc) + ": " + GameWorld.f().P + ", " + GameStrings.fa + ": " + GameWorld.f().Y, ((UIPanel)object3).IActionListener + 60, 27, 0, mFont.o);
                            mFont.n.a((MGraphics)object, String.valueOf(GameStrings.u) + ": " + ((UIPanel)object3).cm[GameWorld.f().A], ((UIPanel)object3).IActionListener + 60, 38, 0, mFont.o);
                        }
                        if (((UIPanel)object4).B == 2) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 0: {
                        if (((UIPanel)object4).B == 0) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            ((UIPanel)object4).A(en3);
                        }
                        if (((UIPanel)object4).B == 1) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        if (((UIPanel)object4).B == 2) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.s.a((MGraphics)object, "Top " + GameWorld.e().w, ((UIPanel)object3).IActionListener + 45 + (((UIPanel)object3).d - 50) / 2, 2, 2);
                            mFont.n.a((MGraphics)object, GameStrings.eG, ((UIPanel)object3).IActionListener + 45 + (((UIPanel)object3).d - 50) / 2, 14, 2);
                            mFont.s.a((MGraphics)object, ai.a(GameWorld.e().aa), ((UIPanel)object3).IActionListener + (main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0) + 45 + (((UIPanel)object3).d - 50) / 2, 26, 2);
                            mFont.n.a((MGraphics)object, String.valueOf(GameStrings.bM) + ": " + ai.a(GameWorld.e().ab), ((UIPanel)object3).IActionListener + (main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0) + 45 + (((UIPanel)object3).d - 50) / 2, 38, 2);
                        }
                        if (((UIPanel)object4).B == 3) {
                            if (((UIPanel)object4).D.length == 5) {
                                eh eh2;
                                object = en3;
                                object3 = object4;
                                if (GameWorld.e().ai == null) {
                                    bl.IActionListener((MGraphics)object, GameWorld.e().d(), 25, 50, 0, 33);
                                    mFont.c.a((MGraphics)object, GameStrings.dr, (((UIPanel)object3).ag - 50) / 2 + 50, 20, 2);
                                } else if (!((UIPanel)object3).an) {
                                    eh2 = GameWorld.e().ai;
                                    if (eh2 != null) {
                                        bl.IActionListener((MGraphics)object, GameWorld.e().d(), 25, 50, 0, 33);
                                        mFont.c.a((MGraphics)object, eh2.c, 60, 4, 0, mFont.f);
                                        mFont.n.a((MGraphics)object, String.valueOf(GameStrings.eH) + ": " + eh2.f, 60, 16, 0, mFont.o);
                                        mFont.n.a((MGraphics)object, String.valueOf(GameStrings.cU) + ": " + eh2.k, 60, 27, 0, mFont.o);
                                        mFont.n.a((MGraphics)object, String.valueOf(GameStrings.do) + ": " + eh2.j, 60, 38, 0, mFont.o);
                                        ag.a((MGraphics)object, eh2.d, 60, 38, ((UIPanel)object3).ag - 70, ((UIPanel)object3).aD, mFont.n);
                                    }
                                } else {
                                    eh2 = ((UIPanel)object3).bD != null ? ((UIPanel)object3).bD : GameWorld.e().ai;
                                    bl.IActionListener((MGraphics)object, GameWorld.e().d(), 25, 50, 0, 33);
                                    mFont.c.a((MGraphics)object, eh2.c, 60, 4, 0, mFont.f);
                                    mFont.n.a((MGraphics)object, String.valueOf(GameStrings.df) + ": " + eh2.UIPanel + "/" + eh2.h, 60, 16, 0, mFont.o);
                                    mFont.n.a((MGraphics)object, String.valueOf(GameStrings.dc) + ": " + eh2.i, 60, 27, 0, mFont.o);
                                    ag.a((MGraphics)object, eh2.d, 60, 38, ((UIPanel)object3).ag - 70, ((UIPanel)object3).aD, mFont.n);
                                }
                            } else {
                                bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                                UIPanel.z(en3);
                            }
                        }
                        if (((UIPanel)object4).B == 4) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            UIPanel.z(en3);
                        }
                        break;
                    }
                    case 25: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 2: {
                        if (((UIPanel)object4).B == 0) {
                            bl.IActionListener(en3, 526, ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            String string = String.valueOf(GameStrings.cw) + ": " + ((UIPanel)object3).N + "/" + GameWorld.e().aG.length + " " + GameStrings.cx;
                            mFont.c.a((MGraphics)object, GameStrings.cd, 60, 4, 0);
                            mFont.n.a((MGraphics)object, string, 60, 16, 0);
                        }
                        if (((UIPanel)object4).B == 1) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 3: {
                        bl.IActionListener(en3, 561, ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        object3 = en3;
                        mFont.c.a((MGraphics)object3, String.valueOf(GameStrings.cl) + " " + bv.n, 60, 4, 0, mFont.f);
                        mFont.n.a((MGraphics)object3, bv.k, 60, 16, 0, mFont.o);
                        mFont.c.a((MGraphics)object3, String.valueOf(bv.n), 25, 27, 2);
                        break;
                    }
                    case 26: {
                        bl.IActionListener(en3, 561, ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        object = en3;
                        object3 = object4;
                        bl.IActionListener((MGraphics)object, GameWorld.e().d(), ((UIPanel)object3).IActionListener + 25, 50, 0, 33);
                        super.A((MGraphics)object);
                        break;
                    }
                    case 1: {
                        h h2;
                        if (((UIPanel)object4).B == ((UIPanel)object4).aY.length - 1 && main.GameCanvas.H == null) {
                            bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        } else if (GameWorld.e().aT != null) {
                            bl.IActionListener(en3, GameWorld.e().aT.aO, ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        }
                        object = en3;
                        object3 = object4;
                        if (((UIPanel)object3).B == ((UIPanel)object3).aY.length - 1 && main.GameCanvas.H == null) {
                            super.A((MGraphics)object);
                            break;
                        }
                        if (((UIPanel)object3).ak < 0) {
                            if (((UIPanel)object3).bJ != 2) {
                                mFont.s.a((MGraphics)object, GameStrings.er, ((UIPanel)object3).IActionListener + 60, 14, 0);
                                mFont.s.a((MGraphics)object, ar, ((UIPanel)object3).IActionListener + 60, 26, 0);
                                break;
                            }
                            mFont.s.a((MGraphics)object, GameStrings.er, ((UIPanel)object3).IActionListener + 60, 5, 0);
                            mFont.s.a((MGraphics)object, ar, ((UIPanel)object3).IActionListener + 60, 17, 0);
                            mFont.s.a((MGraphics)object, String.valueOf(GameStrings.fP) + " " + (((UIPanel)object3).L[((UIPanel)object3).B] + 1) + "/" + ((UIPanel)object3).K[((UIPanel)object3).B], ((UIPanel)object3).IActionListener + 60, 29, 0);
                            break;
                        }
                        if (((UIPanel)object3).B >= 0 && ((UIPanel)object3).B <= GameWorld.e().aJ.length - 1 && ((UIPanel)object3).ak >= 0 && ((UIPanel)object3).ak <= GameWorld.e().aJ[((UIPanel)object3).B].length - 1 && (h2 = GameWorld.e().aJ[((UIPanel)object3).B][((UIPanel)object3).ak]) != null) {
                            if (object3.equals(main.GameCanvas.G) && ((UIPanel)object3).B <= 3 && ((UIPanel)object3).bJ == 2) {
                                mFont.c.a((MGraphics)object, String.valueOf(GameStrings.fP) + " " + (((UIPanel)object3).L[((UIPanel)object3).B] + 1) + "/" + ((UIPanel)object3).K[((UIPanel)object3).B], ((UIPanel)object3).IActionListener + 55, 4, 0);
                            }
                            mFont.c.a((MGraphics)object, h2.IActionListener.d, ((UIPanel)object3).IActionListener + 55, 24, 0);
                            object4 = String.valueOf(GameStrings.cu) + " " + MathUtil.a((long)h2.IActionListener.i);
                            if ((long)h2.IActionListener.i > GameWorld.e().Message) {
                                mFont.n.a((MGraphics)object, (String)object4, ((UIPanel)object3).IActionListener + 55, 35, 0);
                                break;
                            }
                            mFont.r.a((MGraphics)object, (String)object4, ((UIPanel)object3).IActionListener + 55, 35, 0);
                        }
                        break;
                    }
                    case 4: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        UIPanel.B(en3);
                        break;
                    }
                    case 7: 
                    case 17: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 8: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 10: {
                        if (((UIPanel)object4).MessageHandler != null) {
                            bl.IActionListener(en3, ((UIPanel)object4).MessageHandler.d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                            super.a(en3, ((UIPanel)object4).MessageHandler);
                        }
                        break;
                    }
                    case 14: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        UIPanel.B(en3);
                        break;
                    }
                    case 18: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        ((UIPanel)object4).A(en3);
                        break;
                    }
                    case 19: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        UIPanel.z(en3);
                        break;
                    }
                    case 20: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        UIPanel.z(en3);
                        break;
                    }
                    case 22: {
                        bl.IActionListener(en3, GameWorld.e().d(), ((UIPanel)object4).IActionListener + 25, 50, 0, 33);
                        UIPanel.z(en3);
                    }
                }
            }
            catch (Exception exception) {}
            en3 = en2;
            object4 = this;
            if (((UIPanel)object4).A != 13 || ((UIPanel)object4).B != 2 && !object4.equals(main.GameCanvas.H)) {
                en3.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                en3.a(11837316);
                en3.d(((UIPanel)object4).IActionListener + 1, ((UIPanel)object4).e - 15, ((UIPanel)object4).d - 2, 14);
                en3.a(13524492);
                en3.d(((UIPanel)object4).IActionListener + 1, ((UIPanel)object4).e - 15, ((UIPanel)object4).d - 2, 1);
                en3.a(w, ((UIPanel)object4).IActionListener + 11, ((UIPanel)object4).e - 7, 3);
                en3.a(Message, ((UIPanel)object4).IActionListener + 75, ((UIPanel)object4).e - 8, 3);
                mFont.n.a(en3, String.valueOf(GameWorld.e().o), ((UIPanel)object4).IActionListener + 24, ((UIPanel)object4).e - 13, 0, mFont.o);
                mFont.n.a(en3, String.valueOf(GameWorld.e().GameScreen), ((UIPanel)object4).IActionListener + 85, ((UIPanel)object4).e - 13, 0, mFont.o);
                en3.a(z, ((UIPanel)object4).IActionListener + 130, ((UIPanel)object4).e - 8, 3);
                mFont.n.a(en3, String.valueOf(GameWorld.e().q), ((UIPanel)object4).IActionListener + 140, ((UIPanel)object4).e - 13, 0, mFont.o);
            }
            this.Message(en2);
            switch (this.A) {
                case 9: {
                    this.v(en2);
                    break;
                }
                case 21: {
                    if (this.B == 0) {
                        this.e(en2);
                    }
                    if (this.B == 1) {
                        this.d(en2);
                    }
                    if (this.B != 2) break;
                    this.x(en2);
                    break;
                }
                case 24: {
                    this.h(en2);
                    break;
                }
                case 23: {
                    this.i(en2);
                    break;
                }
                case 0: {
                    if (this.B == 0) {
                        this.E(en2);
                    }
                    if (this.B == 1) {
                        this.x(en2);
                    }
                    if (this.B == 2) {
                        this.j(en2);
                    }
                    if (this.B == 3) {
                        if (this.D.length == 4) {
                            this.g(en2);
                        } else {
                            this.u(en2);
                        }
                    }
                    if (this.B != 4) break;
                    this.g(en2);
                    break;
                }
                case 2: {
                    if (this.B == 0) {
                        this.o(en2);
                    }
                    if (this.B != 1) break;
                    this.x(en2);
                    break;
                }
                case 3: {
                    this.m(en2);
                    break;
                }
                case 26: {
                    this.l(en2);
                    break;
                }
                case 1: {
                    this.c(en2);
                    break;
                }
                case 25: {
                    this.n(en2);
                    break;
                }
                case 4: {
                    this.D(en2);
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    this.x(en2);
                    break;
                }
                case 17: {
                    this.c(en2);
                    break;
                }
                case 8: {
                    this.GameScreen(en2);
                    break;
                }
                case 10: {
                    this.t(en2);
                    break;
                }
                case 11: {
                    this.s(en2);
                    break;
                }
                case 16: {
                    this.r(en2);
                    break;
                }
                case 15: {
                    this.b(en2);
                    break;
                }
                case 12: {
                    if (this.B == 0) {
                        this.w(en2);
                    }
                    if (this.B != 1) break;
                    this.x(en2);
                    break;
                }
                case 13: {
                    if (this.B == 0) {
                        if (this.equals(main.GameCanvas.G)) {
                            this.x(en2);
                        } else {
                            this.a(en2, false);
                        }
                    }
                    if (this.B == 1) {
                        this.a(en2, true);
                    }
                    if (this.B != 2) break;
                    this.a(en2, false);
                    break;
                }
                case 14: {
                    this.k(en2);
                    break;
                }
                case 18: {
                    this.q(en2);
                    break;
                }
                case 19: {
                    this.F(en2);
                    break;
                }
                case 20: {
                    this.G(en2);
                }
            }
            GameScreen.c(en2);
            en3 = en2;
            object4 = this;
            if (((UIPanel)object4).ai != null && ((UIPanel)object4).ai.d != null) {
                ((UIPanel)object4).ai.a(en3);
                int n10 = ((UIPanel)object4).ai.e + 13;
                n2 = ((UIPanel)object4).ai.f + 11;
                if (((UIPanel)object4).A == 15) {
                    n10 += 5;
                    n2 += 26;
                }
                if (((UIPanel)object4).A == 0 && ((UIPanel)object4).B == 3) {
                    if (((UIPanel)object4).al) {
                        n10 -= 5;
                    } else if (((UIPanel)object4).bL != null || ((UIPanel)object4).cH != null) {
                        n10 = ((UIPanel)object4).ai.e + 21;
                        n2 = ((UIPanel)object4).ai.f + 40;
                    }
                }
                if (((UIPanel)object4).bL != null) {
                    object2 = GameScreen.x[((UIPanel)object4).bL[0]];
                    object3 = GameScreen.x[((UIPanel)object4).bL[1]];
                    object = GameScreen.x[((UIPanel)object4).bL[2]];
                    bl.IActionListener(en3, ((RMSManager)object2).a[GameWorld.bC[0][0][0]].a, n10 + GameWorld.bC[0][0][1] + ((RMSManager)object2).a[GameWorld.bC[0][0][0]].IActionListener, n2 - GameWorld.bC[0][0][2] + ((RMSManager)object2).a[GameWorld.bC[0][0][0]].c, 0, 0);
                    bl.IActionListener(en3, ((RMSManager)object3).a[GameWorld.bC[0][1][0]].a, n10 + GameWorld.bC[0][1][1] + ((RMSManager)object3).a[GameWorld.bC[0][1][0]].IActionListener, n2 - GameWorld.bC[0][1][2] + ((RMSManager)object3).a[GameWorld.bC[0][1][0]].c, 0, 0);
                    bl.IActionListener(en3, ((RMSManager)object).a[GameWorld.bC[0][2][0]].a, n10 + GameWorld.bC[0][2][1] + ((RMSManager)object).a[GameWorld.bC[0][2][0]].IActionListener, n2 - GameWorld.bC[0][2][2] + ((RMSManager)object).a[GameWorld.bC[0][2][0]].c, 0, 0);
                } else if (((UIPanel)object4).cH != null) {
                    ((UIPanel)object4).cH.a(en3, n10 + 5, n2 + 25, 1, 0, true);
                } else if (((UIPanel)object4).bK != -1) {
                    bl.IActionListener(en3, ((UIPanel)object4).bK, ((UIPanel)object4).ai.e + 8, ((UIPanel)object4).ai.f + 2, 0, 20);
                }
                if (((UIPanel)object4).bC != null && ((UIPanel)object4).bC.IActionListener.IActionListener != 5) {
                    if (((UIPanel)object4).bC.A > 0) {
                        en3.a(aU, n10 - 7, n2 + 13, 3);
                        mFont.h.a(en3, String.valueOf(MathUtil.UIPanel(((UIPanel)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    } else if (((UIPanel)object4).bC.A < 0 && ((UIPanel)object4).bC.A != -1) {
                        en3.a(aV, n10 - 7, n2 + 13, 3);
                        mFont.GameCanvas.a(en3, String.valueOf(MathUtil.UIPanel(((UIPanel)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    }
                }
            }
            if (this.h == this.aK && !main.GameCanvas.F.a) {
                this.aa.a(en2);
            }
            if (this.j != null && this.j.k) {
                en3 = en2;
                object4 = this.j;
                ((UIGame)object4).a(en3);
            }
        }
    }

    private void c(MGraphics en2) {
        try {
            if (this.A == 1 && this.B == this.aY.length - 1 && main.GameCanvas.H == null && this.bJ != 2) {
                this.x(en2);
                return;
            }
            en2.a(0xFF0000);
            en2.e(this.ae, this.GameWorld, this.ag, this.ah);
            if (this.bJ == 2 && this.equals(main.GameCanvas.G)) {
                if (this.B <= 3 && main.GameCanvas.e) {
                    if (this.g < -50) {
                        main.GameCanvas.a(this.ae + this.ag / 2, this.GameWorld + 30, en2);
                    } else if (this.g < 0) {
                        mFont.o.a(en2, GameStrings.fQ, this.ae + this.ag / 2, this.GameWorld + 15, 2);
                    } else if (this.aI >= 0) {
                        if (this.g > this.aI + 50) {
                            main.GameCanvas.a(this.ae + this.ag / 2, this.GameWorld + this.ah - 30, en2);
                        } else if (this.g > this.aI) {
                            mFont.o.a(en2, GameStrings.fR, this.ae + this.ag / 2, this.GameWorld + this.ah - 25, 2);
                        }
                    }
                }
                if (GameWorld.e().aJ[this.B].length == 0 && this.A != 17) {
                    mFont.o.a(en2, GameStrings.fS, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - 10, 2);
                    return;
                }
            }
            en2.a(0, -this.g);
            h[] hArray = GameWorld.e().aJ[this.B];
            if (this.bJ == 2 && (this.B == 4 || this.A == 17) && (hArray = GameWorld.e().aJ[4]).length == 0) {
                mFont.o.a(en2, GameStrings.fS, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - 10, 2);
                return;
            }
            int n2 = hArray.length;
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.ae + 26;
                int n5 = this.GameWorld + n3 * this.aD;
                int n6 = this.ag - 26;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.GameWorld + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.GameWorld + this.ah && n5 - this.g >= this.GameWorld - this.aD) {
                    en2.a(n3 == this.ak ? 16383818 : 15196114);
                    en2.IActionListener(n4, n5, n6, n7);
                    en2.a(n3 == this.ak ? 9541120 : 9993045);
                    en2.IActionListener(n8, n9, 24, n10);
                    h h2 = hArray[n3];
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.B != 0 && this.bJ == 2 && this.B <= 3 && !this.equals(main.GameCanvas.H) && h2.IActionListener.d.length() < 20) {
                            di2 = mFont.h;
                        }
                        if (h2.a != null) {
                            int n11 = 0;
                            while (n11 < h2.GameCanvas.length) {
                                if (h2.a[n11].c.a == 72) {
                                    object = " [+" + h2.a[n11].a + "]";
                                }
                                if (h2.a[n11].c.a == 41) {
                                    if (h2.a[n11].a == 1) {
                                        di2 = UIPanel.h(0);
                                    } else if (h2.a[n11].a == 2) {
                                        di2 = UIPanel.h(2);
                                    } else if (h2.a[n11].a == 3) {
                                        di2 = UIPanel.h(8);
                                    } else if (h2.a[n11].a == 4) {
                                        di2 = UIPanel.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.IActionListener.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.a != null && h2.GameCanvas.length > 0) {
                            if (h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                                object = mFont.GameScreen;
                            }
                            if (this.bJ == 2 && h2.GameCanvas.length > 1 && h2.v != -1) {
                                string = String.valueOf(string);
                            }
                            if (this.bJ != 2 || this.bJ == 2 && h2.v <= 1) {
                                ((mFont)object).a(en2, string, n4 + 5, n5 + 11, 0);
                            }
                        }
                        if (h2.s > 0) {
                            bl.IActionListener(en2, h2.u, n4 + n6 - 7, n5 + 9, 0, 3);
                            mFont.IActionListener.a(en2, MathUtil.a((long)h2.s), n4 + n6 - 15, n5 + 1, 1);
                        }
                        if (h2.n != 0 || h2.GameScreen != 0) {
                            if (this.bJ != 2 && h2.j == 0L) {
                                if (h2.n > 0 && h2.GameScreen > 0) {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.d.a(en2, MathUtil.a((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.a(Message, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        mFont.h.a(en2, MathUtil.a((long)h2.GameScreen), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.d.a(en2, MathUtil.a((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.a(Message, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.h.a(en2, MathUtil.a((long)h2.GameScreen), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                }
                            }
                            if (this.bJ == 2 && this.B <= 3 && !this.equals(main.GameCanvas.H)) {
                                if (h2.n > 0 && h2.GameScreen > 0) {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = GameWorld.e().at < (long)h2.n ? mFont.a : mFont.d;
                                        di2.a(en2, MathUtil.IActionListener((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.a(Message, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        di2 = GameWorld.e().RMSManager < h2.GameScreen ? mFont.a : mFont.h;
                                        di2.a(en2, MathUtil.IActionListener((long)h2.GameScreen), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = GameWorld.e().at < (long)h2.n ? mFont.a : mFont.d;
                                        di2.a(en2, MathUtil.IActionListener((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.a(Message, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = GameWorld.e().RMSManager < h2.GameScreen ? mFont.a : mFont.h;
                                        di2.a(en2, MathUtil.IActionListener((long)h2.GameScreen), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    try {
                                        di2 = mFont.h;
                                        if (!GameWorld.e().ag.equals(h2.H)) {
                                            di2 = mFont.h;
                                        }
                                        di2.a(en2, h2.H, n4 + n6, n5 + 1 + mFont.GameCanvas.a(), 1);
                                    }
                                    catch (Exception exception) {}
                                }
                            }
                        }
                        bl.IActionListener(en2, h2.IActionListener.f, n8 + 12, n9 + n10 / 2, 0, 3);
                        if (h2.h > 1) {
                            mFont.n.a(en2, "" + h2.h, n8 + 24, n9 + n10 - mFont.n.a(), 1);
                        }
                        if (h2.C && main.GameCanvas.w % 10 > 5) {
                            en2.a(v, n8 + 12, n5 + 19, 3);
                        }
                    }
                    if (this.bJ == 2 && (this.equals(main.GameCanvas.H) || this.B == 4) && h2.v != 0) {
                        if (h2.v == 1) {
                            mFont.r.a(en2, GameStrings.fM, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.a(w, n4 + n6 - 7, n5 + 19, 3);
                                mFont.d.a(en2, MathUtil.IActionListener((long)h2.n), n4 + n6 - 15, n5 + 13, 1);
                            } else if (h2.GameScreen != -1) {
                                en2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                mFont.GameCanvas.a(en2, MathUtil.IActionListener((long)h2.GameScreen), n4 + n6 - 15, n5 + 11, 1);
                            }
                        } else if (h2.v == 2) {
                            mFont.IActionListener.a(en2, GameStrings.fN, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.a(w, n4 + n6 - 7, n5 + 17, 3);
                                mFont.d.a(en2, MathUtil.IActionListener((long)h2.n), n4 + n6 - 15, n5 + 11, 1);
                            } else if (h2.GameScreen != -1) {
                                en2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                mFont.GameCanvas.a(en2, MathUtil.IActionListener((long)h2.GameScreen), n4 + n6 - 15, n5 + 11, 1);
                            }
                        }
                    }
                    this.cn = 7;
                }
                ++n3;
            }
            this.cn = 8;
            this.f(en2);
            this.cn = 9;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("tt >>:" + this.cn);
            return;
        }
    }

    private void d(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.cm.length) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.a(en2, this.cm[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void e(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        h[] hArray = GameWorld.f().aH;
        Skill[] bfArray = GameWorld.f().aI;
        int n2 = 0;
        while (n2 < hArray.length + bfArray.length) {
            int n3 = n2 < hArray.length ? 1 : 0;
            int n4 = n2;
            int n5 = n2 - hArray.length;
            int n6 = this.ae + 36;
            int n7 = this.GameWorld + n2 * this.aD;
            int n8 = this.ag - 36;
            int n9 = this.aD - 1;
            int n10 = this.ae;
            int n11 = this.GameWorld + n2 * this.aD;
            int n12 = this.aD - 1;
            if (n7 - this.g <= this.GameWorld + this.ah && n7 - this.g >= this.GameWorld - this.aD) {
                int n13;
                h h2;
                h h3 = h2 = n3 != 0 ? hArray[n4] : null;
                en2.a(n2 == this.ak ? 16383818 : (n3 != 0 ? 15196114 : 15723751));
                en2.IActionListener(n6, n7, n8, n9);
                en2.a(n2 == this.ak ? 9541120 : (n3 != 0 ? 9993045 : 11837316));
                if (h2 != null) {
                    n8 = 0;
                    while (n8 < h2.GameCanvas.length) {
                        if (h2.a[n8].c.a == 72 && h2.a[n8].a > 0) {
                            byte by2 = UIPanel.UIPanel(h2.a[n8].a);
                            n9 = by2;
                            n13 = UIPanel.f(by2);
                            if (n13 != -1) {
                                en2.a(UIPanel.f(n9));
                            }
                        }
                        ++n8;
                    }
                }
                en2.IActionListener(n10, n11, 34, n12);
                if (h2 != null && h2.f && main.GameCanvas.G.A == 12) {
                    en2.a(n2 == this.ak ? 7040779 : 6047789);
                    en2.IActionListener(n10, n11, 34, n12);
                }
                if (h2 != null) {
                    String string = "";
                    mFont di2 = mFont.m;
                    if (h2.a != null) {
                        n13 = 0;
                        while (n13 < h2.GameCanvas.length) {
                            if (h2.a[n13].c.a == 72) {
                                string = " [+" + h2.a[n13].a + "]";
                            }
                            if (h2.a[n13].c.a == 41) {
                                if (h2.a[n13].a == 1) {
                                    di2 = UIPanel.h(0);
                                } else if (h2.a[n13].a == 2) {
                                    di2 = UIPanel.h(2);
                                } else if (h2.a[n13].a == 3) {
                                    di2 = UIPanel.h(8);
                                } else if (h2.a[n13].a == 4) {
                                    di2 = UIPanel.h(7);
                                }
                            }
                            ++n13;
                        }
                    }
                    di2.a(en2, String.valueOf(h2.IActionListener.d) + string, n6 + 5, n7 + 1, 0);
                    String string2 = "";
                    if (h2.a != null) {
                        if (h2.GameCanvas.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                            string2 = String.valueOf(string2) + h2.a[0].a();
                        }
                        mFont di3 = mFont.q;
                        if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                            di3 = mFont.GameScreen;
                        }
                        if (h2.GameCanvas.length > 1) {
                            n5 = 1;
                            while (n5 < 2) {
                                if (h2.a[n5] != null && h2.a[n5].c.a != 102 && h2.a[n5].c.a != 107) {
                                    string2 = String.valueOf(string2) + "," + h2.a[n5].a();
                                }
                                ++n5;
                            }
                        }
                        di3.a(en2, string2, n6 + 5, n7 + 11, 0);
                    }
                    bl.IActionListener(en2, h2.IActionListener.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    if (h2.a != null) {
                        n3 = 0;
                        while (n3 < h2.GameCanvas.length) {
                            this.a(en2, h2.a[n3].c.a, n10, n11, n12);
                            ++n3;
                        }
                        n3 = 0;
                        while (n3 < h2.GameCanvas.length) {
                            UIPanel.a(en2, h2.a[n3].c.a, h2.a[n3].a, n10, n11, 34, n12);
                            ++n3;
                        }
                    }
                    if (h2.h > 1) {
                        mFont.n.a(en2, "" + h2.h, n10 + 34, n11 + n12 - mFont.n.a(), 1);
                    }
                } else if (n3 == 0) {
                    bf bf2 = bfArray[n5];
                    en2.a(GameScreen.au, n10 + 17, n11 + n12 / 2, 3);
                    if (bf2.a != null) {
                        mFont.q.a(en2, bf2.a.IActionListener, n6 + 5, n7 + 1, 0);
                        mFont.m.a(en2, String.valueOf(GameStrings.do) + ": " + bf2.c, n6 + 5, n7 + 11, 0);
                        bl.IActionListener(en2, bf2.GameCanvas.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    } else {
                        mFont.m.a(en2, bf2.ResourceUtil, n6 + 5, n7 + 5, 0);
                        bl.IActionListener(en2, GameScreen.Message[98].a[0].c, n10 + 17, n11 + n12 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void f(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        if (this.g > 24 && this.O > 0 || this.equals(main.GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.GameWorld + 3, 0);
        }
        if (this.g < this.aI && this.O > 0 || this.equals(main.GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.GameWorld + this.ah - 8, 0);
        }
    }

    private void UIPanel(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < G.length) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.a(en2, G[n2], this.ae + this.ag / 2, n4 + 6, 2);
                if (G[n2].equals(GameStrings.bS)) {
                    n5 = 0;
                    while (n5 < at.size()) {
                        ba ba2 = (ba)at.elementAt(n5);
                        if (!ba2.d) {
                            if (main.GameCanvas.w % 20 <= 10) break;
                            en2.a(v, n3 + 10, n4 + 10, 3);
                            break;
                        }
                        ++n5;
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void h(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < cF.length) {
            int n3 = this.GameWorld + n2 * 15;
            if (n3 - this.g <= this.GameWorld + this.ah && n3 - this.g >= this.GameWorld - this.aD) {
                mFont.f.a(en2, cF[n2], this.ae + 5, n3 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void i(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < at.size()) {
            ba ba2 = (ba)at.elementAt(n2);
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.a(en2, ba2.a, this.ae + this.ag / 2, n4 + 6, 2);
                if (!ba2.d && main.GameCanvas.w % 20 > 10) {
                    en2.a(v, n3 + 10, n4 + 10, 3);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void j(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = GameWorld.e().ax.IActionListener.length;
        int n3 = 0;
        while (n3 < n2 + 6) {
            int n4 = this.ae + 30;
            int n5 = this.GameWorld + n3 * this.aD;
            int n6 = this.ag - 30;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.GameWorld + n3 * this.aD;
            if (n5 - this.g <= this.GameWorld + this.ah && n5 - this.g >= this.GameWorld - this.aD) {
                en2.a(n3 == this.ak ? 16383818 : 15196114);
                if (n3 == 5) {
                    en2.a(n3 == this.ak ? 16776068 : 16765060);
                }
                en2.d(n4, n5, n6, n7);
                en2.a(GameScreen.au, n8, n9, 0);
                if (n3 == 0) {
                    bl.IActionListener(en2, 567, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(GameStrings.eX) + " " + GameStrings.LoggingList + ": " + ai.a((long)GameWorld.e().cr);
                    mFont.IActionListener.a(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.a(en2, String.valueOf(ai.a((long)(GameWorld.e().cr + 1000))) + " " + GameStrings.fi + ": " + GameStrings.eI + " " + GameWorld.e().cx, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 1) {
                    bl.IActionListener(en2, 569, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(GameStrings.eY) + " " + GameStrings.LoggingList + ": " + ai.a((long)GameWorld.e().cs);
                    mFont.IActionListener.a(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.a(en2, String.valueOf(ai.a((long)(GameWorld.e().cs + 1000))) + " " + GameStrings.fi + ": " + GameStrings.eI + " " + GameWorld.e().cy, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 2) {
                    bl.IActionListener(en2, 568, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(GameStrings.eZ) + " " + GameStrings.LoggingList + ": " + ai.a((long)GameWorld.e().cq);
                    mFont.IActionListener.a(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.a(en2, String.valueOf(ai.a((long)(GameWorld.e().cq * 100))) + " " + GameStrings.fi + ": " + GameStrings.eI + " " + GameWorld.e().cz, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 3) {
                    bl.IActionListener(en2, 721, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(GameStrings.fa) + " " + GameStrings.LoggingList + ": " + ai.a((long)GameWorld.e().ct);
                    mFont.IActionListener.a(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.a(en2, String.valueOf(ai.a((long)(500000 + GameWorld.e().ct * 100000))) + " " + GameStrings.fi + ": " + GameStrings.eI + " " + GameWorld.e().cA, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 4) {
                    bl.IActionListener(en2, 719, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(GameStrings.fc) + " " + GameStrings.LoggingList + ": " + GameWorld.e().cu + "%";
                    int n10 = GameWorld.e().cu;
                    if (n10 > co.length - 1) {
                        n10 = co.length - 1;
                    }
                    long l2 = co[n10];
                    mFont.IActionListener.a(en2, string, n4 + 5, n5 + 3, 0);
                    long l3 = l2;
                    mFont.m.a(en2, String.valueOf(MathUtil.IActionListener(l3)) + " " + GameStrings.fi + ": " + GameStrings.eI + " " + GameWorld.e().cB, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 5) {
                    if (GameScreen != null) {
                        bl.IActionListener(en2, q, n8 + 4, n9 + 4, 0, 0);
                        String[] stringArray = mFont.k.a(GameScreen, 120);
                        int n11 = 0;
                        while (n11 < stringArray.length) {
                            mFont.m.a(en2, stringArray[n11], n4 + 5, n5 + 3 + n11 * 12, 0);
                            ++n11;
                        }
                    } else {
                        mFont.m.a(en2, "", n4 + 5, n5 + 9, 0);
                    }
                }
                if (n3 >= 6) {
                    n7 = n3 - 6;
                    et et2 = GameWorld.e().ax.IActionListener[n7];
                    bl.IActionListener(en2, et2.f, n8 + 4, n9 + 4, 0, 0);
                    bf bf2 = GameWorld.e().a(et2);
                    if (bf2 != null) {
                        mFont.IActionListener.a(en2, et2.IActionListener, n4 + 5, n5 + 3, 0);
                        mFont.q.a(en2, String.valueOf(GameStrings.do) + ": " + bf2.c, n4 + n6 - 5, n5 + 3, 1);
                        if (bf2.c == et2.c) {
                            mFont.m.a(en2, GameStrings.fg, n4 + 5, n5 + 15, 0);
                        } else if (bf2.GameCanvas.c()) {
                            String string;
                            String string2 = String.valueOf(GameStrings.c) + ": ";
                            int n12 = mFont.m.a(string2) + n4 + 5;
                            int n13 = n5 + 15;
                            mFont.m.a(en2, string2, n4 + 5, n13, 0);
                            StringBuffer stringBuffer = new StringBuffer("(");
                            bf bf3 = bf2;
                            if (bf3.m / 10 >= 100) {
                                string = "MAX";
                            } else if (bf3.m % 10 == 0) {
                                string = String.valueOf(bf3.m / 10) + "%";
                            } else {
                                n7 = bf3.m % 10;
                                string = String.valueOf(bf3.m / 10) + "." + n7 % 10 + "%";
                            }
                            mFont.m.a(en2, stringBuffer.append(string).append(")").toString(), n4 + n6 - 5, n13, 1);
                            en2.a(7169134);
                            en2.d(n12, n13 += 4, 50, 5);
                            n4 = bf2.m * 50 / 1000;
                            en2.a(11992374);
                            en2.d(n12, n13, n4, 5);
                        } else {
                            bf bf4 = et2.h[bf2.c];
                            mFont.m.a(en2, String.valueOf(GameStrings.do) + " " + (bf2.c + 1) + " " + GameStrings.em + " " + MathUtil.IActionListener(bf4.d) + " " + GameStrings.fi, n4 + 5, n5 + 15, 0);
                        }
                    } else {
                        bf bf5 = et2.h[0];
                        String string = String.valueOf(GameStrings.MGraphics) + " " + MathUtil.IActionListener(bf5.d) + " " + GameStrings.eF;
                        if (bf5.GameCanvas.a == 24 || bf5.GameCanvas.a == 25 || bf5.GameCanvas.a == 26) {
                            string = String.valueOf(GameStrings.MGraphics) + " " + MathUtil.IActionListener(bf5.d) + " " + GameStrings.go;
                        }
                        mFont.h.a(en2, et2.IActionListener, n4 + 5, n5 + 3, 0);
                        mFont.m.a(en2, string, n4 + 5, n5 + 15, 0);
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void k(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.E.length) {
            int n3 = this.GameWorld + n2 * this.aD;
            int n4 = this.aD - 1;
            if (n3 - this.g <= this.GameWorld + this.ah && n3 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(this.ae, n3, this.ag, n4);
                mFont.IActionListener.a(en2, this.E[n2], 5, n3 + 1, 0);
                mFont.o.a(en2, this.F[n2], 5, n3 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void ResourceUtil(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        String[] stringArray = c.IActionListener;
        String[] stringArray2 = c.c;
        int n2 = 0;
        while (n2 < stringArray2.length) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.IActionListener(n3, n4, n5, n6);
                mFont.o.a(en2, String.valueOf(stringArray[n2]), n7 + 5, n4 + 6, 0);
                mFont.o.a(en2, stringArray2[n2], n3 + n5 - 2, n4 + 6, 1);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void m(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int[] nArray = GameScreen.j().S;
        int[] nArray2 = GameScreen.j().T;
        int n2 = 0;
        while (n2 < nArray2.length) {
            int n3 = this.ae + 36;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.GameWorld + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.IActionListener(n3, n4, n5, n6);
                en2.a(this.cp[nArray2[n2]]);
                en2.IActionListener(n7, n8, 34, n9);
                if (nArray[n2] != -1) {
                    if (nArray2[n2] != 1) {
                        mFont.n.a(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    } else {
                        mFont.o.a(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    }
                    mFont.m.a(en2, String.valueOf(GameScreen.j().U[n2]) + "/" + GameScreen.j().V[n2], n3 + 5, n4 + 6, 0);
                }
                if (GameScreen.j().Y[n2] != null) {
                    mFont.o.a(en2, String.valueOf(GameScreen.j().Y[n2]) + "(Top " + GameScreen.j().W[n2] + ")", n3 + n5 - 2, n4 + 1, 1);
                    mFont.o.a(en2, String.valueOf(GameScreen.j().Z[n2]) + "(Top " + GameScreen.j().X[n2] + ")", n3 + n5 - 2, n4 + 11, 1);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void n(MGraphics en2) {
        int n2;
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.GameWorld + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.GameWorld + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.IActionListener(n7, n8, n9, n10);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.IActionListener(n4, n5, 24, n6);
            bl.IActionListener(en2, GameWorld.e().aL[this.B][n2], n4 + 12, n5 + n6 / 2, 0, 3);
            String[] stringArray = mFont.o.a(GameWorld.e().aK[this.B][n2], 140);
            n5 = 0;
            while (n5 < stringArray.length) {
                mFont.o.a(en2, stringArray[n5], n7 + 5, n8 + 1 + n5 * 11, 0);
                ++n5;
            }
            ++n2;
        }
        this.f(en2);
    }

    private void o(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        try {
            h[] hArray = GameWorld.e().aG;
            this.O = this.i(hArray.length);
            int n2 = hArray.length / 20 + (hArray.length % 20 > 0 ? 1 : 0);
            this.aF = this.ag / n2;
            int n3 = 0;
            while (n3 < this.O) {
                int n4 = this.ae + 36;
                int n5 = this.GameWorld + n3 * this.aD;
                int n6 = this.ag - 36;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.GameWorld + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.GameWorld + this.ah && n5 - this.g >= this.GameWorld - this.aD) {
                    if (n3 == 0) {
                        n6 = 0;
                        while (n6 < n2) {
                            n7 = n6 == this.bO && this.ak == 0 ? (main.GameCanvas.w % 10 < 7 ? -1 : 0) : 0;
                            en2.a(n6 == this.bO ? 16383818 : 15723751);
                            en2.d(this.ae + n6 * this.aF, n5 + 9 + n7, this.aF - 1, 14);
                            mFont.o.a(en2, "" + n6, this.ae + n6 * this.aF + this.aF / 2, this.GameWorld + 11 + n7, 2);
                            ++n6;
                        }
                    } else {
                        int n11;
                        en2.a(n3 == this.ak ? 16383818 : 15196114);
                        en2.d(n4, n5, n6, n7);
                        en2.a(n3 == this.ak ? 9541120 : 9993045);
                        n6 = UIPanel.c(n3, this.bO);
                        h h2 = hArray[n6];
                        if (h2 != null) {
                            n6 = 0;
                            while (n6 < h2.GameCanvas.length) {
                                byte by2;
                                if (h2.a[n6].c.a == 72 && h2.a[n6].a > 0 && (n11 = UIPanel.f(by2 = UIPanel.UIPanel(h2.a[n6].a))) != -1) {
                                    en2.a(UIPanel.f(by2));
                                }
                                ++n6;
                            }
                        }
                        en2.IActionListener(n8, n9, 34, n10);
                        if (h2 != null) {
                            Object object = "";
                            mFont di2 = mFont.m;
                            if (h2.a != null) {
                                n11 = 0;
                                while (n11 < h2.GameCanvas.length) {
                                    if (h2.a[n11].c.a == 72) {
                                        object = " [+" + h2.a[n11].a() + "]";
                                    }
                                    if (h2.a[n11].c.a == 41) {
                                        if (h2.a[n11].a == 1) {
                                            di2 = UIPanel.h(0);
                                        } else if (h2.a[n11].a == 2) {
                                            di2 = UIPanel.h(2);
                                        } else if (h2.a[n11].a == 3) {
                                            di2 = UIPanel.h(8);
                                        } else if (h2.a[n11].a == 4) {
                                            di2 = UIPanel.h(7);
                                        }
                                    }
                                    ++n11;
                                }
                            }
                            di2.a(en2, String.valueOf(h2.IActionListener.d) + (String)object, n4 + 5, n5 + 1, 0);
                            String string = "";
                            if (h2.a != null) {
                                if (h2.GameCanvas.length > 0 && h2.a[0] != null) {
                                    string = String.valueOf(string) + h2.a[0].a();
                                }
                                object = mFont.q;
                                if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                                    object = mFont.GameScreen;
                                }
                                if (h2.GameCanvas.length > 1) {
                                    int n12 = 1;
                                    while (n12 < h2.GameCanvas.length) {
                                        if (h2.a[n12] != null && h2.a[n12].c.a != 102 && h2.a[n12].c.a != 107) {
                                            string = String.valueOf(string) + "," + h2.a[n12].a();
                                        }
                                        ++n12;
                                    }
                                }
                                ((mFont)object).a(en2, string, n4 + 5, n5 + 11, 0);
                            }
                            bl.IActionListener(en2, h2.IActionListener.f, n8 + 17, n9 + n10 / 2, 0, 3);
                            if (h2.a != null) {
                                int n13 = 0;
                                while (n13 < h2.GameCanvas.length) {
                                    this.a(en2, h2.a[n13].c.a, n8, n9, n10);
                                    ++n13;
                                }
                                n13 = 0;
                                while (n13 < h2.GameCanvas.length) {
                                    UIPanel.a(en2, h2.a[n13].c.a, h2.a[n13].a, n8, n9, 34, n10);
                                    ++n13;
                                }
                            }
                            if (h2.h > 1) {
                                mFont.n.a(en2, "" + h2.h, n8 + 34, n9 + n10 - mFont.n.a(), 1);
                            }
                        }
                    }
                }
                ++n3;
            }
        }
        catch (Exception exception) {}
        this.f(en2);
    }

    private e W() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > (this.Q != null ? this.Q.size() : this.R.size()) + 1) {
            return null;
        }
        if (this.Q != null) {
            return (e)this.Q.elementAt(this.ak - 2);
        }
        return (e)this.R.elementAt(this.ak - 2);
    }

    private cb X() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > cb.ResourceUtil.size() + 1) {
            return null;
        }
        return (cb)cb.ResourceUtil.elementAt(this.ak - 2);
    }

    private eh Y() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > this.P.length + 1) {
            return null;
        }
        return this.P[this.ak - 2];
    }

    private void GameScreen(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.bG.size() == 0) {
            mFont.m.a(en2, GameStrings.ag, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - mFont.k.a() / 2 + 24, 2);
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.GameWorld + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            if (n2 == 0) {
                en2.a(15196114);
                en2.IActionListener(n3, n7, this.ag, n9);
                en2.a(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n7 + 2, cj.IActionListener);
                (n2 == this.ak ? mFont.UIPanel : mFont.f).a(en2, this.au ? GameStrings.fw : GameStrings.fx, this.ae + this.ag - 22, n7 + 7, 2);
                mFont.o.a(en2, this.au ? GameStrings.fz : GameStrings.fA, this.ae + 5, n7 + n9 / 2 - 4, 0);
            } else {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.IActionListener(n6, n7, n8, n9);
                en2.a(n2 == this.ak ? 9541120 : 9993045);
                en2.IActionListener(n3, n4, 24, n5);
                r r2 = (r)this.bG.elementAt(n2 - 1);
                if (r2.c.bT != -1) {
                    bl.IActionListener(en2, r2.c.bT, n3, n4, 0, 0);
                } else {
                    RMSManager av2 = GameScreen.x[r2.c.bU];
                    bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n3 + av2.a[GameWorld.bC[0][0][0]].IActionListener, n4 + av2.a[GameWorld.bC[0][0][0]].c, 0, 0);
                }
                en2.e(this.ae, this.GameWorld + this.g, this.ag, this.ah);
                mFont di2 = mFont.UIPanel;
                di2.a(en2, r2.c.ag, n6 + 5, n7, 0);
                if (!r2.d) {
                    mFont.q.a(en2, MathUtil.a(r2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                } else {
                    mFont.GameScreen.a(en2, MathUtil.a(r2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void q(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 26;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 26;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.GameWorld + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.IActionListener(n3, n4, n5, n6);
                en2.a(n2 == this.ak ? 9541120 : 9993045);
                en2.IActionListener(n7, n8, 24, n9);
                h h2 = (h)this.Y.elementAt(n2);
                if (h2 != null) {
                    mFont.m.a(en2, h2.IActionListener.d, n3 + 5, n4 + 1, 0);
                    String string = "";
                    if (h2.a != null && h2.GameCanvas.length > 0) {
                        if (h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                            string = String.valueOf(string) + h2.a[0].a();
                        }
                        mFont di2 = mFont.q;
                        di2.a(en2, string, n3 + 5, n4 + 11, 0);
                        bl.IActionListener(en2, h2.IActionListener.f, n7 + 12, n8 + n9 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void r(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            mFont.m.a(en2, GameStrings.fE, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - mFont.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.GameWorld + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.IActionListener(n6, n7, n8, n9);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.IActionListener(n3, n4, 24, n5);
            r r2 = (r)this.X.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.IActionListener(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                RMSManager av2 = GameScreen.x[r2.c.bU];
                bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n3 + av2.a[GameWorld.bC[0][0][0]].IActionListener, n4 + 3 + av2.a[GameWorld.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.GameWorld + this.g, this.ag, this.ah);
            if (r2.e) {
                mFont.h.a(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.q.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            } else {
                mFont.o.a(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.o.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void s(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            mFont.m.a(en2, GameStrings.bP, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - mFont.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.GameWorld + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.IActionListener(n6, n7, n8, n9);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.IActionListener(n3, n4, 24, n5);
            r r2 = (r)this.T.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.IActionListener(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                RMSManager av2 = GameScreen.x[r2.c.bU];
                bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n3 + av2.a[GameWorld.bC[0][0][0]].IActionListener, n4 + 3 + av2.a[GameWorld.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.GameWorld + this.g, this.ag, this.ah);
            if (r2.e) {
                mFont.h.a(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.q.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            } else {
                mFont.o.a(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.o.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void t(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.S.size()) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                Command de2 = (Command)this.S.elementAt(n2);
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.IActionListener(n3, n4, n5, n6);
                if (de2.GameScreen.equals("")) {
                    mFont.f.a(en2, de2.IActionListener, this.ae + this.ag / 2, n4 + 6, 2);
                } else {
                    mFont.f.a(en2, de2.IActionListener, this.ae + this.ag / 2, n4 + 1, 2);
                    mFont.f.a(en2, de2.GameScreen, this.ae + this.ag / 2, n4 + 11, 2);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void u(MGraphics en2) {
        try {
            int n2;
            en2.e(this.ae, this.GameWorld, this.ag, this.ah);
            en2.a(-this.h, -this.g);
            en2.a(0);
            int n3 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
            if (this.O == 2) {
                mFont.m.a(en2, this.ao, this.ae + this.ag / 2, this.GameWorld + 24 + this.ah / 2 - mFont.k.a() / 2, 2);
                if (this.am && this.R.size() == 1) {
                    n2 = 0;
                    while (n2 < GameStrings.MathUtil.length) {
                        mFont.f.a(en2, GameStrings.MathUtil[n2], this.ae + this.ag / 2, this.GameWorld + 24 + this.ah / 2 - GameStrings.MathUtil.length * 12 / 2 + n2 * 12, 2);
                        ++n2;
                    }
                }
            }
            if (this.am) {
                this.O = cb.ResourceUtil.size() + 2;
            }
            n2 = 0;
            while (n2 < this.O) {
                int n4 = this.ae;
                int n5 = this.GameWorld + n2 * this.aD;
                int n6 = this.aD - 1;
                int n7 = this.ae + 24;
                int n8 = this.GameWorld + n2 * this.aD;
                int n9 = this.ag - 24;
                int n10 = this.aD - 1;
                if (n8 - this.g <= this.GameWorld + this.ah && n8 - this.g >= this.GameWorld - this.aD) {
                    if (n2 == 0) {
                        n6 = 0;
                        while (n6 < this.cg.length) {
                            en2.a(n6 == this.bN && n2 == this.ak ? 16383818 : 15723751);
                            en2.IActionListener(n3 + n6 * this.aE, n8, this.aE - 1, 23);
                            int n11 = 0;
                            while (n11 < this.cg[n6].length) {
                                mFont.o.a(en2, this.cg[n6][n11], n3 + n6 * this.aE + this.aE / 2, this.GameWorld + n11 * 11, 2);
                                ++n11;
                            }
                            ++n6;
                        }
                    } else if (n2 == 1) {
                        en2.a(n2 == this.ak ? 16383818 : 15196114);
                        en2.IActionListener(this.ae, n8, this.ag, n10);
                        if (this.ch != null) {
                            mFont.f.a(en2, this.ch, this.ae + this.ag / 2, n8 + 6, 2);
                        }
                    } else if (this.al) {
                        if (this.P != null && this.P.length != 0) {
                            en2.a(n2 == this.ak ? 16383818 : 15196114);
                            en2.IActionListener(n7, n8, n9, n10);
                            en2.a(n2 == this.ak ? 9541120 : 9993045);
                            en2.IActionListener(n4, n5, 24, n6);
                            if (ak.a(this.P[n2 - 2].IActionListener)) {
                                if (ak.a((short)((short)this.P[n2 - 2].IActionListener)).c != null) {
                                    bl.a(en2, ak.a((short)((short)this.P[n2 - 2].IActionListener)).c[0], n4 + 12, n5 + n6 / 2, 0, cj.f);
                                }
                            } else {
                                ak ak2 = new ak();
                                new ak().a = this.P[n2 - 2].IActionListener;
                                if (!ak.a(ak2.a)) {
                                    ak.a(ak2);
                                }
                            }
                            String string = this.P[n2 - 2].c.length() > 17 ? String.valueOf(this.P[n2 - 2].c.substring(0, 17)) + "..." : this.P[n2 - 2].c;
                            mFont.UIPanel.a(en2, string, n7 + 5, n8, 0);
                            mFont.q.a(en2, this.P[n2 - 2].d, n7 + 5, n8 + 11, 0);
                            mFont.m.a(en2, String.valueOf(this.P[n2 - 2].UIPanel) + "/" + this.P[n2 - 2].h, n7 + n9 - 5, n8, 1);
                        }
                    } else if (this.an) {
                        e e2;
                        en2.a(n2 == this.ak ? 16383818 : 15196114);
                        en2.IActionListener(n7, n8, n9, n10);
                        en2.a(n2 == this.ak ? 9541120 : 9993045);
                        en2.IActionListener(n4, n5, 24, n6);
                        if ((e2 = this.Q != null ? (e)this.Q.elementAt((int)(n2 - 2)) : (e)this.R.elementAt((int)(n2 - 2))).c != -1) {
                            bl.IActionListener(en2, e2.c, n4, n5, 0, 0);
                        } else {
                            RMSManager av2 = GameScreen.x[e2.IActionListener];
                            bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, n4 + av2.a[GameWorld.bC[0][0][0]].IActionListener, n5 + 3 + av2.a[GameWorld.bC[0][0][0]].c, 0, 0);
                        }
                        en2.e(this.ae, this.GameWorld + this.g, this.ag, this.ah);
                        mFont di2 = mFont.f;
                        if (e2.UIPanel == 0) {
                            di2 = mFont.a;
                        } else if (e2.UIPanel == 1) {
                            di2 = mFont.h;
                        } else if (e2.UIPanel == 2) {
                            di2 = mFont.UIPanel;
                        }
                        di2.a(en2, e2.f, n7 + 5, n8, 0);
                        mFont.q.a(en2, String.valueOf(GameStrings.da) + ": " + e2.h, n7 + 5, n8 + 11, 0);
                        bl.IActionListener(en2, 7223, n7 + n9 - 7, n8 + 12, 0, 3);
                        mFont.m.a(en2, "" + e2.ResourceUtil, n7 + n9 - 15, n8 + 6, 1);
                    } else if (this.am && cb.ResourceUtil.size() != 0) {
                        cb cb2 = (cb)cb.ResourceUtil.elementAt(n2 - 2);
                        en2.a(n2 == this.ak && cb2.k == null ? 16383818 : 15196114);
                        en2.IActionListener(n4, n5, n9 + 24, n10);
                        cb2.a(en2, n4, n5);
                        if (cb2.k != null) {
                            int n12 = this.ae + this.ag - 2 - cb2.k.length * 40;
                            n4 = 0;
                            while (n4 < cb2.k.length) {
                                if (n4 == this.bN && n2 == this.ak) {
                                    en2.a(GameScreen.az, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    mFont.UIPanel.a(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                } else {
                                    en2.a(GameScreen.ay, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    mFont.f.a(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                }
                                ++n4;
                            }
                        }
                    }
                }
                ++n2;
            }
            this.f(en2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void v(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            mFont.m.a(en2, GameStrings.fr, this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - mFont.k.a() / 2, 2);
            return;
        }
        if (GameWorld.e().aE == null) {
            return;
        }
        if (GameWorld.e().aE.length != this.O) {
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            ao ao2 = GameWorld.e().aE[n2];
            en2.a(n2 == this.ak && (!ao2.e && !ao2.d || ao2.e && ao2.d) ? 16383818 : 15196114);
            en2.IActionListener(n3, n4, n5, n6);
            if (ao2 != null) {
                if (!ao2.d) {
                    mFont.k.a(en2, ao2.a, n3 + 5, n4, 0);
                    mFont.r.a(en2, String.valueOf(ao2.c) + " " + GameStrings.bF, n3 + n5 - 5, n4, 1);
                    mFont.GameScreen.a(en2, ao2.IActionListener, n3 + 5, n4 + 11, 0);
                } else if (ao2.d && !ao2.e) {
                    mFont.k.a(en2, ao2.a, n3 + 5, n4, 0);
                    mFont.q.a(en2, String.valueOf(GameStrings.fs) + ao2.c + " " + GameStrings.bF, n3 + 5, n4 + 11, 0);
                    if (n2 == this.ak) {
                        mFont.UIPanel.a(en2, GameStrings.co, n3 + n5 - 20, n4 + 6, 2);
                        mFont.f.a(en2, GameStrings.co, n3 + n5 - 20, n4 + 6, 2);
                    } else {
                        en2.a(GameScreen.ay, n3 + n5 - 20, n4 + n6 / 2, cj.f);
                        mFont.f.a(en2, GameStrings.co, n3 + n5 - 20, n4 + 6, 2);
                    }
                } else if (ao2.d && ao2.e) {
                    mFont.r.a(en2, ao2.a, n3 + 5, n4, 0);
                    mFont.r.a(en2, ao2.IActionListener, n3 + 5, n4 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void w(MGraphics en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        if (this.k.size() == 0) {
            if (this.ap != null) {
                int n2 = 0;
                while (n2 < this.ap.length) {
                    mFont.f.a(en2, this.ap[n2], this.ae + this.ag / 2, this.GameWorld + this.ah / 2 - this.ap.length * 14 / 2 + n2 * 14 + 5, 2);
                    ++n2;
                }
            }
            return;
        }
        int n3 = 0;
        while (n3 < this.k.size() + 1) {
            int n4 = this.ae + 36;
            int n5 = this.GameWorld + n3 * this.aD;
            int n6 = this.ag - 36;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.GameWorld + n3 * this.aD;
            int n10 = this.aD - 1;
            if (n5 - this.g <= this.GameWorld + this.ah && n5 - this.g >= this.GameWorld - this.aD) {
                if (n3 == this.k.size()) {
                    if (this.k.size() > 0) {
                        if (!main.GameCanvas.e && n3 == this.ak) {
                            en2.a(16383818);
                            en2.IActionListener(n8, n5, this.ag, n7 + 2);
                        }
                        if (n3 == this.ak && this.cc == 1 || !main.GameCanvas.e && n3 == this.ak) {
                            en2.a(GameScreen.ax, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            mFont.UIPanel.a(en2, GameStrings.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        } else {
                            en2.a(GameScreen.GameStrings, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            mFont.f.a(en2, GameStrings.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        }
                    }
                } else {
                    int n11;
                    en2.a(n3 == this.ak ? 16383818 : 15196114);
                    en2.IActionListener(n4, n5, n6, n7);
                    en2.a(n3 == this.ak ? 9541120 : 9993045);
                    h h2 = (h)this.k.elementAt(n3);
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.GameCanvas.length) {
                            byte by2;
                            if (h2.a[n7].c.a == 72 && h2.a[n7].a > 0 && (n11 = UIPanel.f(by2 = UIPanel.UIPanel(h2.a[n7].a))) != -1) {
                                en2.a(UIPanel.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.IActionListener(n8, n9, 34, n10);
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.a != null) {
                            n11 = 0;
                            while (n11 < h2.GameCanvas.length) {
                                if (h2.a[n11].c.a == 72) {
                                    object = " [+" + h2.a[n11].a + "]";
                                }
                                if (h2.a[n11].c.a == 41) {
                                    if (h2.a[n11].a == 1) {
                                        di2 = UIPanel.h(0);
                                    } else if (h2.a[n11].a == 2) {
                                        di2 = UIPanel.h(2);
                                    } else if (h2.a[n11].a == 3) {
                                        di2 = UIPanel.h(8);
                                    } else if (h2.a[n11].a == 4) {
                                        di2 = UIPanel.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.IActionListener.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.GameCanvas.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.GameCanvas.length > 1) {
                                int n12 = 1;
                                while (n12 < h2.GameCanvas.length) {
                                    if (h2.a[n12] != null && h2.a[n12].c.a != 102 && h2.a[n12].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n12].a();
                                    }
                                    ++n12;
                                }
                            }
                            ((mFont)object).a(en2, string, n4 + 5, n5 + 11, 0);
                        }
                        bl.IActionListener(en2, h2.IActionListener.f, n8 + 17, n9 + n10 / 2, 0, 3);
                        if (h2.a != null) {
                            int n13 = 0;
                            while (n13 < h2.GameCanvas.length) {
                                this.a(en2, h2.a[n13].c.a, n8, n9, n10);
                                ++n13;
                            }
                            n13 = 0;
                            while (n13 < h2.GameCanvas.length) {
                                UIPanel.a(en2, h2.a[n13].c.a, h2.a[n13].a, n8, n9, 34, n10);
                                ++n13;
                            }
                        }
                        if (h2.h > 1) {
                            mFont.n.a(en2, "" + h2.h, n8 + 34, n9 + n10 - mFont.n.a(), 1);
                        }
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void x(MGraphics en2) {
        int n2;
        int n3;
        en2.a(0xFF0000);
        h[] hArray = GameWorld.e().aH;
        h[] hArray2 = GameWorld.e().aF;
        this.O = this.i(hArray.length + hArray2.length);
        int n4 = (hArray.length + hArray2.length) / 20 + ((hArray.length + hArray2.length) % 20 > 0 ? 1 : 0);
        this.aF = this.ag / n4;
        int n5 = 0;
        while (n5 < n4) {
            n3 = n5 == this.bO && this.ak == 0 ? (main.GameCanvas.w % 10 < 7 ? -1 : 0) : 0;
            en2.a(n5 == this.bO ? 16383818 : 15723751);
            en2.d(this.ae + n5 * this.aF, n3 + 89 - 10, this.aF - 1, 21);
            if (n5 == this.bO) {
                en2.a(13524492);
                n2 = this.ae + n5 * this.aF;
                int n6 = n3 + 89 - 10 + 21;
                en2.d(n2, n6 - 3, this.aF - 1, 3);
            }
            mFont.o.a(en2, "" + (n5 + 1), this.ae + n5 * this.aF + this.aF / 2, n3 + 91 - 10, 2);
            ++n5;
        }
        en2.e(this.ae, this.GameWorld + 21, this.ag, this.ah - 21);
        en2.a(0, -this.g);
        try {
            n5 = 1;
            while (n5 < this.O) {
                n3 = this.ae + 36;
                n2 = this.GameWorld + n5 * this.aD;
                int n7 = this.ag - 36;
                int n8 = this.aD - 1;
                int n9 = this.ae;
                int n10 = this.GameWorld + n5 * this.aD;
                int n11 = this.aD - 1;
                if (n2 - this.g <= this.GameWorld + this.ah && n2 - this.g >= this.GameWorld - this.aD) {
                    byte by2 = UIPanel.a(n5, this.bO, GameWorld.e().aH);
                    int n12 = UIPanel.c(n5, this.bO);
                    int n13 = UIPanel.IActionListener(n5, this.bO, GameWorld.e().aH);
                    en2.a(n5 == this.ak ? 16383818 : (by2 != 0 ? 15196114 : 15723751));
                    en2.IActionListener(n3, n2, n7, n8);
                    en2.a(n5 == this.ak ? 9541120 : (by2 != 0 ? 9993045 : 11837316));
                    h h2 = by2 != 0 ? hArray[n12] : hArray2[n13];
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.GameCanvas.length) {
                            if (h2.a[n7].c.a == 72 && h2.a[n7].a > 0 && (n12 = UIPanel.f(by2 = UIPanel.UIPanel(h2.a[n7].a))) != -1) {
                                en2.a(UIPanel.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.IActionListener(n9, n10, 34, n11);
                    if (h2 != null && h2.f && main.GameCanvas.G.A == 12) {
                        en2.a(n5 == this.ak ? 7040779 : 6047789);
                        en2.IActionListener(n9, n10, 34, n11);
                    }
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.a != null) {
                            n12 = 0;
                            while (n12 < h2.GameCanvas.length) {
                                if (h2.a[n12].c.a == 72) {
                                    object = " [+" + h2.a[n12].a + "]";
                                }
                                if (h2.a[n12].c.a == 41) {
                                    if (h2.a[n12].a == 1) {
                                        di2 = UIPanel.h(0);
                                    } else if (h2.a[n12].a == 2) {
                                        di2 = UIPanel.h(2);
                                    } else if (h2.a[n12].a == 3) {
                                        di2 = UIPanel.h(8);
                                    } else if (h2.a[n12].a == 4) {
                                        di2 = UIPanel.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.IActionListener.d) + (String)object, n3 + 5, n2 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.GameCanvas.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.IActionListener.IActionListener != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.GameCanvas.length > 1) {
                                int n14 = 1;
                                while (n14 < 2) {
                                    if (h2.a[n14] != null && h2.a[n14].c.a != 102 && h2.a[n14].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n14].a();
                                    }
                                    ++n14;
                                }
                            }
                            ((mFont)object).a(en2, string, n3 + 5, n2 + 11, 0);
                        }
                        bl.IActionListener(en2, h2.IActionListener.f, n9 + 17, n10 + n11 / 2, 0, 3);
                        if (h2.a != null) {
                            int n15 = 0;
                            while (n15 < h2.GameCanvas.length) {
                                this.a(en2, h2.a[n15].c.a, n9, n10, n11);
                                ++n15;
                            }
                            n15 = 0;
                            while (n15 < h2.GameCanvas.length) {
                                UIPanel.a(en2, h2.a[n15].c.a, h2.a[n15].a, n9, n10, 34, n11);
                                ++n15;
                            }
                        }
                        if (h2.h > 1) {
                            mFont.n.a(en2, "" + h2.h, n9 + 34, n10 + n11 - mFont.n.a(), 1);
                        }
                    }
                }
                ++n5;
            }
        }
        catch (Exception exception) {}
        this.f(en2);
    }

    private void Message(MGraphics en2) {
        if (this.A == 23 || this.A == 24) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.bS, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 20) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.aq, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 22) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.o, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 19) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.bU, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 18) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.bR, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 13 && this.equals(main.GameCanvas.H)) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.cn, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 12 && main.GameCanvas.H != null) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.cy, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 11) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.bN, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 16) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.bO, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 15) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, this.n, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 2 && main.GameCanvas.H != null) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.cd, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 9) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.ft, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 3) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.aH, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 26) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.D, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 14) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.a(en2, GameStrings.fy, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 4) {
            mFont.f.a(en2, GameStrings.cm, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 7) {
            mFont.f.a(en2, GameStrings.fu, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 17) {
            mFont.f.a(en2, GameStrings.fF, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 8) {
            mFont.f.a(en2, GameStrings.ae, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 10) {
            mFont.f.a(en2, GameStrings.fv, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.B == 3 && this.D.length != 4) {
            en2.a(-this.h, 0);
        }
        int n2 = 0;
        while (n2 < this.aY.length) {
            mFont di2;
            en2.a(n2 == this.B ? 6805896 : 0xFFF0B0);
            bo.a(en2, this.C + n2 * this.aE, 52, this.aE - 1, 25, n2 == this.B ? 1 : 0, true);
            if (n2 == this.cf) {
                en2.a(ce.f, this.C + n2 * this.aE + this.aE / 2, 62, 3);
            }
            mFont di3 = di2 = n2 == this.B ? mFont.m : mFont.o;
            if (!this.aY[n2][1].equals("")) {
                di2.a(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 53, 2);
                di2.a(en2, this.aY[n2][1], this.C + n2 * this.aE + this.aE / 2, 64, 2);
            } else {
                di2.a(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 59, 2);
            }
            if (this.A == 0 && this.aY.length == 5 && GameScreen.aW && main.GameCanvas.w % 4 == 0) {
                en2.a(ce.f, this.C + 3 * this.aE + this.aE / 2, 77, 33);
            }
            ++n2;
        }
        en2.a(13524492);
        en2.d(1, 78, this.d - 2, 1);
    }

    private static void z(MGraphics en2) {
        mFont.c.a(en2, String.valueOf(GameStrings.ao) + " " + "2.4.6", 60, 4, 0, mFont.f);
        mFont.n.a(en2, String.valueOf(GameStrings.ap) + ": " + GameWorld.e().ag, 60, 16, 0, mFont.o);
        String string = main.GameCanvas.I.GameCanvas.d().equals("") ? GameStrings.gk : main.GameCanvas.I.GameCanvas.d();
        mFont.n.a(en2, String.valueOf(GameStrings.ar) + " " + bs.a[bs.n] + ": " + string, 60, 27, 0, mFont.o);
    }

    private void A(MGraphics en2) {
        this.a(en2, GameWorld.e());
    }

    private void a(MGraphics en2, GameWorld af2) {
        mFont.c.a(en2, String.valueOf(GameScreen.bX != 1 ? "" : "       ") + af2.ag, this.b + 60, 4, 0, mFont.f);
        if (GameScreen.bX == 1) {
            bl.IActionListener(en2, 5427, this.b + 55, 4, 0, 0);
        }
        if (af2.cC > 0) {
            mFont.n.a(en2, GameStrings.fb, this.b + 60, 16, 0, mFont.o);
            en2.a(GameScreen.aG, this.b + 95, 19, 0);
            int n2 = af2.bf * MGraphics.a(GameScreen.aF) / af2.cC;
            en2.e(95, this.b + 19, n2, 20);
            en2.a(GameScreen.aF, this.b + 95, 19, 0);
        }
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (af2.Message > 0L) {
            mFont.n.a(en2, af2.aq ? af2.c() : af2.bj, this.b + 60, 27, 0, mFont.o);
        }
        mFont.n.a(en2, String.valueOf(GameStrings.da) + ": " + ai.a(af2.Message), this.b + 60, 38, 0, mFont.o);
    }

    public final int a(h h2) {
        if (h2 == null) {
            return -1;
        }
        if (h2.IActionListener()) {
            if (h2.a == null) {
                return -1;
            }
            ee ee2 = h2.a[0];
            if (ee2.c.a == 22) {
                ee2.c = GameScreen.j().K[6];
                ee2.a *= 1000;
            }
            if (ee2.c.a == 23) {
                ee2.c = GameScreen.j().K[7];
                ee2.a *= 1000;
            }
            h h3 = null;
            int n2 = 0;
            while (n2 < GameWorld.e().aH.length) {
                h h4 = GameWorld.e().aH[n2];
                if (ee2.c.a == 22) {
                    ee2.c = GameScreen.j().K[6];
                    ee2.a *= 1000;
                }
                if (ee2.c.a == 23) {
                    ee2.c = GameScreen.j().K[7];
                    ee2.a *= 1000;
                }
                if (h4 != null && h4.a != null && h4.IActionListener.IActionListener == h2.IActionListener.IActionListener) {
                    h3 = h4;
                    break;
                }
                ++n2;
            }
            if (h3 == null) {
                MathUtil.c("5");
                return ee2.a;
            }
            n2 = h3 != null && h3.a != null ? ee2.a - h3.a[0].a : ee2.a;
            return n2;
        }
        return 0;
    }

    private static void B(MGraphics en2) {
        mFont.c.a(en2, GameStrings.aL[bv.r], 60, 4, 0);
        String string = "";
        if (bv.ResourceUtil >= 135 && bv.ResourceUtil <= 138) {
            string = " " + GameStrings.ResourceUtil + bv.n;
        }
        mFont.n.a(en2, String.valueOf(bv.k) + string, 60, 16, 0);
        mFont.c.a(en2, String.valueOf(GameStrings.fq) + ": ", 60, 27, 0);
        if (GameScreen.w() >= 0 && GameScreen.w() <= bv.w.length - 1) {
            mFont.n.a(en2, bv.w[GameScreen.w()], 60, 38, 0);
            return;
        }
        mFont.n.a(en2, GameStrings.eq, 60, 38, 0);
    }

    private void C(MGraphics en2) {
        mFont.n.a(en2, String.valueOf(GameStrings.eX) + ": " + GameWorld.e().U + " / " + GameWorld.e().V, this.b + 60, 2, 0, mFont.o);
        mFont.n.a(en2, String.valueOf(GameStrings.eY) + ": " + GameWorld.e().T + " / " + GameWorld.e().W, this.b + 60, 14, 0, mFont.o);
        mFont.n.a(en2, String.valueOf(GameStrings.eZ) + ": " + GameWorld.e().X + ", " + GameStrings.fc + ": " + GameWorld.e().P + "%", this.b + 60, 26, 0, mFont.o);
        mFont.n.a(en2, String.valueOf(GameStrings.eW) + ": " + GameWorld.e().cv + "%, " + GameStrings.eV + ": " + GameWorld.e().cw + "%", this.b + 60, 38, 0, mFont.o);
    }

    private void D(MGraphics en2) {
        int n2;
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(-this.aL, -this.aM);
        en2.a(aQ, this.ae, this.GameWorld, 0);
        int n3 = GameWorld.e().bU;
        RMSManager av2 = GameScreen.x[n3];
        bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, this.cz, this.cA + 5, 0, 3);
        int n4 = 2;
        if (this.cz <= 40) {
            n4 = 0;
        }
        if (this.cz >= 220) {
            n4 = 1;
        }
        mFont.d.a(en2, bv.k, this.cz, this.cA - 12, n4, mFont.o);
        int n5 = -1;
        if (GameScreen.w() != -1) {
            n2 = 0;
            while (n2 < bz[bv.r].length) {
                if (bz[bv.r][n2] == GameScreen.w()) {
                    n5 = n2;
                    break;
                }
                n5 = 4;
                ++n2;
            }
            if (main.GameCanvas.w % 4 > 0) {
                en2.a(ce.f, this.ae + bA[bv.r][n5], this.GameWorld + bB[bv.r][n5], 3);
            }
        }
        if (!main.GameCanvas.e) {
            en2.a(i, this.cB, this.cC, cj.IActionListener);
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n6 = bA[bv.r][n2] + this.ae;
                int n7 = bB[bv.r][n2] + this.GameWorld;
                if (MathUtil.a(n6 - 15, n7 - 15, 30, 30, this.cB, this.cC)) {
                    n4 = 2;
                    if (n6 <= 20) {
                        n4 = 0;
                    }
                    if (n6 >= 220) {
                        n4 = 1;
                    }
                    mFont.d.a(en2, bv.w[bz[bv.r][n2]], n6, n7 - 12, n4, mFont.o);
                    break;
                }
                ++n2;
            }
        } else if (!this.bZ) {
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n8 = bA[bv.r][n2] + this.ae;
                int n9 = bB[bv.r][n2] + this.GameWorld;
                if (MathUtil.a(n8 - 15, n9 - 15, 30, 30, this.ca, this.cb)) {
                    n4 = 2;
                    if (n8 <= 30) {
                        n4 = 0;
                    }
                    if (n8 >= 220) {
                        n4 = 1;
                    }
                    en2.a(i, n8, n9, cj.IActionListener);
                    mFont.d.a(en2, bv.w[bz[bv.r][n2]], n8, n9 - 12, n4, mFont.o);
                    break;
                }
                ++n2;
            }
        }
        en2.a(-en2.a(), -en2.IActionListener());
        if (n5 != -1) {
            if (bA[bv.r][n5] + this.ae < this.aL) {
                en2.a(aa.R, 0, 0, 9, 6, 5, this.ae + 5, this.GameWorld + this.ah / 2 - 4, 0);
            }
            if (this.aL + this.ag < bA[bv.r][n5] + this.ae) {
                en2.a(aa.R, 0, 0, 9, 6, 6, this.ae + this.ag - 5, this.GameWorld + this.ah / 2 - 4, cj.IActionListener);
            }
            if (bB[bv.r][n5] < this.aM) {
                en2.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag / 2, this.GameWorld + 5, cj.a);
            }
            if (bB[bv.r][n5] > this.aM + this.ah) {
                en2.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag / 2, this.GameWorld + this.ah - 5, cj.c);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void E(MGraphics var1_1) {
        block39: {
            block30: {
                v0 = var2_2 = main.GameCanvas.B > 300 ? 20 : 15;
                if (UIPanel.as) {
                    GameScreen.j();
                    if (!GameScreen.e()) {
                        GameScreen.j();
                        if (!GameScreen.f()) {
                            var1_1.a(this.cd == 1 ? GameScreen.ax : GameScreen.GameStrings, this.ae + this.ag / 2, this.GameWorld + this.ah - var2_2, 3);
                            mFont.f.a(var1_1, GameStrings.cm, this.ae + this.ag / 2, this.GameWorld + this.ah - (var2_2 + 5), 2);
                        }
                    }
                }
                this.cs = this.ae + 5;
                this.cy = this.ct = this.GameWorld + 14;
                var1_1.e(this.ae, this.GameWorld, this.ag, this.ah - 35);
                if (this.ci != null) {
                    if (this.ci.d > 0) {
                        var1_1.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.GameWorld + 3, 0);
                    }
                    if (this.ci.d < this.ItemTemplate.ResourceUtil) {
                        var1_1.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.GameWorld + this.ah - 45, 0);
                    }
                    var1_1.a(0, -this.ci.d);
                }
                this.cw = 0;
                var3_3 = 0;
                if (GameWorld.e().aD == null) break block30;
                var4_4 = 0;
                while (var4_4 < GameWorld.e().aD.d.length) {
                    mFont.o.a(var1_1, GameWorld.e().aD.d[var4_4], this.ae + this.ag / 2, this.cy - 5 + var4_4 * 12, 2);
                    ++this.cw;
                    ++var4_4;
                }
                this.cy += (GameWorld.e().aD.d.length - 1) * 12;
                var4_4 = 0;
                var6_6 = 0;
                while (var6_6 < GameWorld.e().aD.f.length) {
                    block38: {
                        block31: {
                            block35: {
                                block37: {
                                    block32: {
                                        block36: {
                                            block33: {
                                                block34: {
                                                    if (GameWorld.e().aD.f[var6_6] == null) break block31;
                                                    var4_4 = var6_6;
                                                    var5_8 = "- " + GameWorld.e().aD.f[var6_6];
                                                    if (GameWorld.e().aD.IActionListener[var6_6] == -1) break block32;
                                                    if (GameWorld.e().aD.a != var6_6) break block33;
                                                    if (GameWorld.e().aD.IActionListener[var6_6] != 1) {
                                                        var5_8 = String.valueOf(var5_8) + " (" + GameWorld.e().aD.h + "/" + GameWorld.e().aD.IActionListener[var6_6] + ")";
                                                    }
                                                    if (GameWorld.e().aD.h != GameWorld.e().aD.IActionListener[var6_6]) break block34;
                                                    v1 = mFont.k;
                                                    v2 = var1_1;
                                                    v3 = var5_8;
                                                    v4 = this.cs;
                                                    v5 = 5;
                                                    ** GOTO lbl94
                                                }
                                                var7_10 = mFont.o;
                                                if (var3_3 == 0) {
                                                    var3_3 = 1;
                                                    var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                                } else {
                                                    var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                                }
                                                break block35;
                                            }
                                            if (GameWorld.e().aD.a <= var6_6) break block36;
                                            if (GameWorld.e().aD.IActionListener[var6_6] != 1) {
                                                var5_8 = String.valueOf(var5_8) + " (" + GameWorld.e().aD.IActionListener[var6_6] + "/" + GameWorld.e().aD.IActionListener[var6_6] + ")";
                                            }
                                            v1 = mFont.s;
                                            v2 = var1_1;
                                            v3 = var5_8;
                                            v4 = this.cs;
                                            v5 = 5;
                                            ** GOTO lbl94
                                        }
                                        if (GameWorld.e().aD.IActionListener[var6_6] != 1) {
                                            var5_8 = String.valueOf(var5_8) + " 0/" + GameWorld.e().aD.IActionListener[var6_6];
                                        }
                                        var7_10 = mFont.o;
                                        if (var3_3 == 0) {
                                            var3_3 = 1;
                                            var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                        } else {
                                            var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                        }
                                        break block35;
                                    }
                                    if (GameWorld.e().aD.a <= var6_6) break block37;
                                    v1 = mFont.s;
                                    v2 = var1_1;
                                    v3 = var5_8;
                                    v4 = this.cs;
                                    v5 = 5;
                                    ** GOTO lbl94
                                }
                                var7_10 = mFont.o;
                                if (var3_3 == 0) {
                                    var3_3 = 1;
                                    var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                } else {
                                    v1 = var7_10;
                                    v2 = var1_1;
                                    v3 = "- ...";
                                    v4 = this.cs + 5;
                                    v5 = var7_10 == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0;
lbl94:
                                    // 4 sources

                                    v1.a(v2, v3, v4 + v5, this.cy += 12, 0);
                                }
                            }
                            ++this.cw;
                            break block38;
                        }
                        if (GameWorld.e().aD.a <= var6_6) {
                            var5_8 = "- " + GameWorld.e().aD.f[var4_4];
                            var7_10 = mFont.o;
                            if (var3_3 == 0) {
                                var3_3 = 1;
                                var7_10 = mFont.q;
                            }
                            var7_10.a(var1_1, var5_8, this.cs + 5 + (var7_10 == mFont.q && main.GameCanvas.w % 20 > 10 ? main.GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                        }
                    }
                    ++var6_6;
                }
                this.cy += 5;
                var6_6 = 0;
                while (var6_6 < GameWorld.e().aD.e.length) {
                    mFont.m.a(var1_1, GameWorld.e().aD.e[var6_6], this.cs + 5, this.cy += 12, 0);
                    ++this.cw;
                    ++var6_6;
                }
                break block39;
            }
            var4_5 = GameScreen.w();
            var5_9 = GameScreen.x();
            if (var4_5 == -3 || var5_9 == -3) {
                var6_7 = GameStrings.aW[3];
            } else if (GameWorld.e().aD == null && GameWorld.e().L == 9 && GameWorld.e().ax.a == 0) {
                var6_7 = GameStrings.aZ;
            } else if (var5_9 >= 0 && var4_5 >= 0) {
                var6_7 = String.valueOf(GameStrings.aW[0]) + TextBox.BaseCanvas[var5_9].IActionListener + GameStrings.aW[1] + bv.w[var4_5] + GameStrings.aW[2];
            } else {
                return;
            }
            var7_11 = mFont.s.a(var6_7, 150);
            var3_3 = 0;
            while (var3_3 < var7_11.length) {
                if (var3_3 == 0) {
                    this.cy = this.ct;
                    mFont.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy, 0);
                } else {
                    mFont.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy += 12, 0);
                }
                ++var3_3;
            }
        }
        if (this.ci == null) {
            this.ci = new dv();
            this.ci.a(this.cw, 12, this.ae, this.GameWorld, this.ag, this.ah - var2_2 - 40, true, 1);
        }
    }

    private void Z() {
        int n2 = 0;
        while (n2 < this.k.size()) {
            ((h)this.k.elementAt((int)n2)).f = false;
            ++n2;
        }
        this.k.removeAllElements();
    }

    public final void z() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || bv.ResourceUtil == 45) {
            GameWorld.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.IActionListener) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            GameService.a().a((byte)3, -1, (byte)-1, -1);
        }
        SettingsManager.a();
        GameScreen.GameService = true;
        bv.s = (byte)-1;
        aQ = null;
        System.gc();
        this.bP = false;
        this.cD = true;
        this.Z();
        v.a();
        main.GameCanvas.H = null;
        main.GameCanvas.ResourceUtil();
        main.GameCanvas.f();
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        this.a = false;
        if ((GameWorld.e().U <= 0L || GameWorld.e().H == 14 || GameWorld.e().H == 5) && GameWorld.e().cH) {
            Command de2;
            GameScreen.j().cn = de2 = new Command(GameStrings.aX[0], 11038, GameScreen.j());
            GameWorld.e().U = 0L;
        }
    }

    public final void A() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || bv.ResourceUtil == 45) {
            GameWorld.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.IActionListener) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            GameService.a().a((byte)3, -1, (byte)-1, -1);
        }
        if (this.A == 15) {
            GameService.a().w(-1);
        }
        SettingsManager.a();
        GameScreen.GameService = true;
        bv.s = (byte)-1;
        if (aQ != null) {
            aQ = null;
        }
        System.gc();
        this.bP = false;
        if (this.A != 4) {
            if (this.A == 24) {
                this.ah();
            } else if (this.A == 23) {
                this.q();
            } else if (this.A == 3 || this.A == 14) {
                if (this.cI) {
                    this.cD = true;
                } else {
                    this.q();
                    this.aK = 0;
                    this.h = 0;
                }
            } else if (this.A == 18 || this.A == 19 || this.A == 20 || this.A == 21) {
                this.q();
                this.aK = 0;
                this.h = 0;
            } else if (this.A == 8 || this.A == 11 || this.A == 16) {
                this.at();
                this.aK = 0;
                this.h = 0;
            } else {
                this.cD = true;
            }
        } else {
            this.q();
            this.aK = 0;
            this.h = 0;
        }
        v.a();
        main.GameCanvas.H = null;
        main.GameCanvas.ResourceUtil();
        main.GameCanvas.f();
        main.GameCanvas.W = false;
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        if ((GameWorld.e().U <= 0L || GameWorld.e().H == 14 || GameWorld.e().H == 5) && GameWorld.e().cH) {
            Command de2;
            GameScreen.j().cn = de2 = new Command(GameStrings.aX[0], 11038, GameScreen.j());
            GameWorld.e().U = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void B() {
        block193: {
            if (this.o != null && this.o.IActionListener) {
                this.o.c();
                return;
            }
            if (this.cJ) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cJ = false;
                    this.o.GameCanvas.a("");
                    this.o.h = String.valueOf(GameStrings.fI) + " ";
                    this.o.GameCanvas.i = GameStrings.ed;
                    this.o.UIPanel = "";
                    this.o.IActionListener = true;
                    this.o.GameCanvas.c(1);
                    this.o.a.IActionListener(10);
                    if (main.GameCanvas.e) {
                        this.o.GameCanvas.a();
                    }
                }
                return;
            }
            if (this.cK) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cK = false;
                    this.o.GameCanvas.a("");
                    this.o.h = String.valueOf(GameStrings.fJ) + "  ";
                    this.o.GameCanvas.i = GameStrings.ed;
                    this.o.UIPanel = "";
                    this.o.IActionListener = true;
                    this.o.GameCanvas.c(1);
                    this.o.a.IActionListener(10);
                    if (main.GameCanvas.e) {
                        this.o.GameCanvas.a();
                    }
                }
                return;
            }
            if (this.ci != null) {
                this.ItemTemplate.IActionListener();
            }
            if (this.j != null && this.j.k) {
                var1_1 = this.j;
                if (dr.f != null) {
                    dr.f.IActionListener();
                }
                if (var1_1.h != var1_1.UIPanel) {
                    var1_1.i = var1_1.UIPanel - var1_1.h << 2;
                    var1_1.j += var1_1.i;
                    var1_1.h += var1_1.j >> 3;
                    var1_1.j &= 15;
                }
                if (Math.abs(var1_1.UIPanel - var1_1.h) < 10) {
                    var1_1.h = var1_1.UIPanel;
                }
                if (var1_1.h >= var1_1.a + var1_1.IActionListener - 10 && var1_1.UIPanel >= var1_1.a + var1_1.IActionListener - 10) {
                    var1_1.k = false;
                }
                return;
            }
            this.V();
            if (this.bV <= 0) break block193;
            --this.bV;
            if (this.bV != 0) break block193;
            this.bp[this.B] = this.ak;
            switch (this.A) {
                case 23: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cE = var1_2.ak;
                    ((ba)UIPanel.at.elementAt((int)var1_2.cE)).d = true;
                    RMSManager.a(String.valueOf(((ba)UIPanel.at.elementAt((int)var1_2.cE)).c), 1);
                    var2_4 = var1_2;
                    var3_11 = ((ba)UIPanel.at.elementAt((int)var2_4.cE)).IActionListener;
                    UIPanel.cF = mFont.o.a((String)var3_11, var2_4.ag - 40);
                    var2_4.O = UIPanel.cF.length;
                    var2_4.aD = 16;
                    var2_4.ak = main.GameCanvas.e != false ? -1 : 0;
                    var2_4.aI = var2_4.O * var2_4.aD - var2_4.ah;
                    if (var2_4.aI < 0) {
                        var2_4.aI = 0;
                    }
                    if (var2_4.UIPanel < 0) {
                        var2_4.f = 0;
                        var2_4.UIPanel = 0;
                    }
                    if (var2_4.UIPanel > var2_4.aI) {
                        var2_4.UIPanel = var2_4.f = var2_4.aI;
                    }
                    var2_4.A = 24;
                    var2_4.c(0);
                    break;
                }
                case 21: {
                    var1_2 = this;
                    if (var1_2.B == 0) {
                        if (var1_2.ak == -1 || var1_2.ak > GameWorld.f().aH.length - 1) break;
                        var2_5 = new LoggingList("");
                        var1_2.bC = var3_11 = GameWorld.f().aH[var1_2.ak];
                        if (var1_2.bC != null) {
                            var2_5.addElement(new Command(GameStrings.dZ, var1_2, 2006, var1_2.bC));
                            main.GameCanvas.F.a(var2_5, var1_2.IActionListener, (var1_2.ak + 1) * var1_2.aD - var1_2.UIPanel + var1_2.GameWorld);
                            var1_2.IActionListener(var1_2.bC);
                        } else {
                            var1_2.ai = null;
                        }
                    }
                    if (var1_2.B == 1) {
                        var5_12 = var1_2;
                        if (var5_12.ak != -1) {
                            if (var5_12.ak == 5) {
                                main.GameCanvas.a(GameStrings.GameScreen, new Command(GameStrings.bn, 888351), new Command(GameStrings.bo, 2001));
                            } else {
                                GameService.a().UIPanel((byte)var5_12.ak);
                                if (var5_12.ak < 4) {
                                    GameWorld.f().A = (byte)var5_12.ak;
                                }
                            }
                        }
                    }
                    if (var1_2.B != 2) break;
                    var1_2.ae();
                    break;
                }
                case 0: {
                    var1_2 = this;
                    try {
                        if (var1_2.B == 0) {
                            var1_2.K();
                        }
                        if (var1_2.B == 1) {
                            var1_2.ae();
                        }
                        if (var1_2.B != 2) ** GOTO lbl229
                        var3_11 = var1_2;
                        if (var3_11.ak < 0) ** GOTO lbl229
                        if (GameWorld.e().H != 14) ** GOTO lbl116
                        main.GameCanvas.a(GameStrings.ex);
                        ** GOTO lbl229
lbl116:
                        // 1 sources

                        if (var3_11.ak != 0 && var3_11.ak != 1 && var3_11.ak != 2 && var3_11.ak != 3 && var3_11.ak != 4 && var3_11.ak != 5) ** GOTO lbl211
                        var5_13 = GameWorld.e().aa;
                        var2_6 = GameWorld.e().cr;
                        var4_20 = GameWorld.e().cs;
                        var7_22 = GameWorld.e().cq;
                        var8_24 = GameWorld.e().ct;
                        GameWorld.e();
                        if (var3_11.ak != 0) ** GOTO lbl144
                        if (var5_13 >= (long)(GameWorld.e().cr + 1000)) ** GOTO lbl128
                        main.GameCanvas.c(String.valueOf(GameStrings.eK) + GameWorld.e().aa + GameStrings.eL + (GameWorld.e().cr + 1000));
                        ** GOTO lbl229
lbl128:
                        // 1 sources

                        if (var5_13 <= (long)var2_6 || var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2)) ** GOTO lbl131
                        main.GameCanvas.a(String.valueOf(GameStrings.eM) + (var2_6 + 1000) + GameStrings.eN + GameWorld.e().cx + GameStrings.eO, new Command(GameStrings.eJ, (IActionListener)var3_11, 9000, null), new Command(GameStrings.bv, (IActionListener)var3_11, 4007, null));
                        ** GOTO lbl229
lbl131:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new LoggingList("");
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cx + GameStrings.eX + "\n" + "-" + MathUtil.IActionListener((long)(var2_6 + 1000)), (IActionListener)var3_11, 9000, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cx + GameStrings.eX + "\n" + "-" + MathUtil.IActionListener((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (IActionListener)var3_11, 9006, null));
                            main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new LoggingList("");
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cx + GameStrings.eX + "\n" + "-" + MathUtil.IActionListener((long)(var2_6 + 1000)), (IActionListener)var3_11, 9000, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cx + GameStrings.eX + "\n" + "-" + MathUtil.IActionListener((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (IActionListener)var3_11, 9006, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 100 * GameWorld.e().cx + GameStrings.eX + "\n" + "-" + MathUtil.IActionListener((long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)), (IActionListener)var3_11, 9007, null));
                            main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                            super.d(var3_11.ak);
                        }
lbl144:
                        // 4 sources

                        if (var3_11.ak != 1) ** GOTO lbl164
                        if (GameWorld.e().aa >= (long)(GameWorld.e().cs + 1000)) ** GOTO lbl148
                        main.GameCanvas.a(String.valueOf(GameStrings.eK) + GameWorld.e().aa + GameStrings.eL + (GameWorld.e().cs + 1000));
                        ** GOTO lbl229
lbl148:
                        // 1 sources

                        if (var5_13 <= (long)var4_20 || var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2)) ** GOTO lbl151
                        main.GameCanvas.a(String.valueOf(GameStrings.eM) + (var4_20 + 1000) + GameStrings.eN + GameWorld.e().cy + GameStrings.eP, new Command(GameStrings.eJ, (IActionListener)var3_11, 9000, null), new Command(GameStrings.bv, (IActionListener)var3_11, 4007, null));
                        ** GOTO lbl229
lbl151:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new LoggingList("");
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cy + GameStrings.eY + "\n" + "-" + MathUtil.IActionListener((long)(var2_6 + 1000)), (IActionListener)var3_11, 9000, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cy + GameStrings.eY + "\n" + "-" + MathUtil.IActionListener((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (IActionListener)var3_11, 9006, null));
                            main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new LoggingList("");
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cy + GameStrings.eY + "\n" + "-" + MathUtil.IActionListener((long)(var4_20 + 1000)), (IActionListener)var3_11, 9000, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cy + GameStrings.eY + "\n" + "-" + MathUtil.IActionListener((long)(10 * (2 * (var4_20 + 1000) + 180) / 2)), (IActionListener)var3_11, 9006, null));
                            var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 100 * GameWorld.e().cy + GameStrings.eY + "\n" + "-" + MathUtil.IActionListener((long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)), (IActionListener)var3_11, 9007, null));
                            main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                            super.d(var3_11.ak);
                        }
lbl164:
                        // 4 sources

                        if (var3_11.ak != 2) ** GOTO lbl184
                        if (GameWorld.e().aa < (long)(GameWorld.e().cq * GameWorld.e().cD)) {
                            main.GameCanvas.a(String.valueOf(GameStrings.eK) + GameWorld.e().aa + GameStrings.eL + var7_22 * 100);
                        } else if (var5_13 > (long)var7_22 && var5_13 < (long)(10 * (var7_22 * 2 + 9) / 2 * GameWorld.e().cD)) {
                            main.GameCanvas.a(String.valueOf(GameStrings.eM) + var7_22 * 100 + GameStrings.eN + GameWorld.e().cz + GameStrings.eQ, new Command(GameStrings.eJ, (IActionListener)var3_11, 9000, null), new Command(GameStrings.bv, (IActionListener)var3_11, 4007, null));
                        } else {
                            if (var5_13 >= (long)(10 * (var7_22 * 2 + 9) / 2 * GameWorld.e().cD) && var5_13 < (long)(100 * (var7_22 * 2 + 99) / 2 * GameWorld.e().cD)) {
                                var11_25 = new LoggingList("");
                                var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cz + "\n" + GameStrings.eZ + "\n" + "-" + MathUtil.IActionListener((long)(var7_22 * 100)), (IActionListener)var3_11, 9000, null));
                                var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cz + "\n" + GameStrings.eZ + "\n" + "-" + MathUtil.IActionListener((long)(10 * (var7_22 * 2 + 9) / 2 * GameWorld.e().cD)), (IActionListener)var3_11, 9006, null));
                                main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                super.d(var3_11.ak);
                            }
                            if (var5_13 >= (long)(100 * (var7_22 * 2 + 99) / 2 * GameWorld.e().cD)) {
                                var11_25 = new LoggingList("");
                                var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + GameWorld.e().cz + "\n" + GameStrings.eZ + "\n" + "-" + MathUtil.IActionListener((long)(var7_22 * 100)), (IActionListener)var3_11, 9000, null));
                                var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 10 * GameWorld.e().cz + "\n" + GameStrings.eZ + "\n" + "-" + MathUtil.IActionListener((long)(10 * (var7_22 * 2 + 9) / 2 * GameWorld.e().cD)), (IActionListener)var3_11, 9006, null));
                                var11_25.addElement(new Command(String.valueOf(GameStrings.eJ) + "\n" + 100 * GameWorld.e().cz + "\n" + GameStrings.eZ + "\n" + "-" + MathUtil.IActionListener((long)(100 * (var7_22 * 2 + 99) / 2 * GameWorld.e().cD)), (IActionListener)var3_11, 9007, null));
                                main.GameCanvas.F.a(var11_25, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                super.d(var3_11.ak);
                            }
lbl184:
                            // 4 sources

                            if (var3_11.ak == 3) {
                                if (GameWorld.e().aa < (long)(50000 + GameWorld.e().ct * 1000)) {
                                    main.GameCanvas.a(String.valueOf(GameStrings.eK) + ai.a(GameWorld.e().aa) + GameStrings.eL + ai.a((long)(50000 + GameWorld.e().ct * 1000)));
                                } else {
                                    var11_26 = 1L * (long)(2 * (var8_24 + 5)) / 2L * 100000L;
                                    var13_28 = 10L * (long)(2 * (var8_24 + 5) + 9) / 2L * 100000L;
                                    var15_30 = 100L * (long)(2 * (var8_24 + 5) + 99) / 2L * 100000L;
                                    GameStrings.eM = GameStrings.eJ;
                                    var2_7 = new LoggingList("");
                                    var2_7.addElement(new Command(String.valueOf(GameStrings.eM) + "\n" + "1 " + GameStrings.fa + "\n" + MathUtil.IActionListener(var11_26), (IActionListener)var3_11, 9000, null));
                                    var2_7.addElement(new Command(String.valueOf(GameStrings.eM) + "\n" + "10 " + GameStrings.fa + "\n" + MathUtil.IActionListener(var13_28), (IActionListener)var3_11, 9006, null));
                                    var2_7.addElement(new Command(String.valueOf(GameStrings.eM) + "\n" + "100 " + GameStrings.fa + "\n" + MathUtil.IActionListener(var15_30), (IActionListener)var3_11, 9007, null));
                                    main.GameCanvas.F.a(var2_7, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                    super.d(var3_11.ak);
                                }
                            } else if (var3_11.ak == 4) {
                                var13_29 = GameWorld.e().cu;
                                if (var13_29 > UIPanel.co.length - 1) {
                                    var13_29 = UIPanel.co.length - 1;
                                }
                                if (GameWorld.e().aa < (var11_27 = UIPanel.co[var13_29])) {
                                    main.GameCanvas.a(String.valueOf(GameStrings.eK) + MathUtil.IActionListener(GameWorld.e().aa) + GameStrings.eL + MathUtil.IActionListener(var11_27));
                                } else {
                                    main.GameCanvas.a(String.valueOf(GameStrings.eM) + MathUtil.a(var11_27) + GameStrings.eN + GameWorld.e().cB + GameStrings.eR, new Command(GameStrings.eJ, (IActionListener)var3_11, 9000, null), new Command(GameStrings.bv, (IActionListener)var3_11, 4007, null));
                                }
                            } else if (var3_11.ak == 5) {
                                GameService.a().a((byte)0);
                            }
                        }
                        ** GOTO lbl229
lbl211:
                        // 1 sources

                        var5_14 = var3_11.ak - 6;
                        var6_31 = GameWorld.e().ax.IActionListener[var5_14];
                        var2_8 = GameWorld.e().a((et)var6_31);
                        var4_21 = null;
                        var7_23 = new LoggingList("");
                        if (var2_8 != null) {
                            if (var2_8.c == var6_31.c) {
                                var7_23.addElement(new Command(GameStrings.cA, (IActionListener)var3_11, 9003, var2_8.a));
                                var7_23.addElement(new Command(GameStrings.bj, 2));
                            } else {
                                var4_21 = var6_31.h[var2_8.c];
                                var7_23.addElement(new Command(GameStrings.cy, (IActionListener)var3_11, 9002, var4_21));
                                var7_23.addElement(new Command(GameStrings.cA, (IActionListener)var3_11, 9003, var2_8.a));
                            }
                        } else {
                            var4_21 = var6_31.h[0];
                            var7_23.addElement(new Command(GameStrings.fl, (IActionListener)var3_11, 9004, var4_21));
                        }
                        main.GameCanvas.F.a(var7_23, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                        super.a((et)var6_31, var2_8, var4_21);
lbl229:
                        // 15 sources

                        if (var1_2.B == 3) {
                            if (var1_2.D.length == 4) {
                                var1_2.ag();
                            } else {
                                var3_11 = var1_2;
                                var1_2.bL = null;
                                var3_11.cH = null;
                                if (var3_11.ak < 0) {
                                    var3_11.bN = -1;
                                } else {
                                    if (GameWorld.e().ai == null) {
                                        if (var3_11.ak == 0) {
                                            if (var3_11.bN == 0) {
                                                var6_31 = var3_11;
                                                var3_11.o.h = GameStrings.dt;
                                                var6_31.o.GameCanvas.i = GameStrings.du;
                                                var6_31.o.UIPanel = "";
                                                var6_31.o.IActionListener = true;
                                                var6_31.o.GameCanvas.e = true;
                                                var6_31.o.GameCanvas.c(0);
                                                if (main.GameCanvas.e) {
                                                    var6_31.o.GameCanvas.a();
                                                }
                                            } else if (var3_11.bN == 1) {
                                                bp.a();
                                                var6_31 = var3_11;
                                                var3_11.o.h = GameStrings.dw;
                                                var6_31.o.GameCanvas.i = GameStrings.dt;
                                                var6_31.o.UIPanel = "";
                                                var6_31.o.IActionListener = true;
                                                var6_31.o.GameCanvas.c(0);
                                                if (main.GameCanvas.e) {
                                                    var6_31.o.GameCanvas.a();
                                                }
                                                GameService.a().a((byte)1, -1, (String)null);
                                            }
                                        } else if (var3_11.ak != -1) {
                                            if (var3_11.ak == 1) {
                                                if (var3_11.al) {
                                                    GameService.a().a("");
                                                } else if (var3_11.an && var3_11.bD != null) {
                                                    main.GameCanvas.a(String.valueOf(GameStrings.dy) + var3_11.bD.c, new Command(GameStrings.bn, (IActionListener)var3_11, 4000, var3_11.bD), new Command(GameStrings.bo, (IActionListener)var3_11, 4005, var3_11.bD));
                                                }
                                            } else if (var3_11.al) {
                                                var3_11.bD = super.Y();
                                                if (var3_11.bD != null) {
                                                    var5_15 = new LoggingList("");
                                                    var5_15.addElement(new Command(GameStrings.dA, (IActionListener)var3_11, 4000, var3_11.bD));
                                                    var5_15.addElement(new Command(GameStrings.dB, (IActionListener)var3_11, 4001, var3_11.bD));
                                                    main.GameCanvas.F.a(var5_15, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                                    super.a(super.Y());
                                                }
                                            } else if (var3_11.an) {
                                                var3_11.bF = super.W();
                                                if (var3_11.bF != null) {
                                                    var5_16 = new LoggingList("");
                                                    var5_16.addElement(new Command(GameStrings.bj, (IActionListener)var3_11, 8000, var3_11.bD));
                                                    main.GameCanvas.F.a(var5_16, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                                    main.GameCanvas.F.a(var5_16, 0, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                                    super.a(var3_11.bF);
                                                }
                                            }
                                        }
                                    } else if (var3_11.ak == 0) {
                                        if (var3_11.am) {
                                            if (var3_11.bN == 0) {
                                                if (var3_11.R.size() > 1) {
                                                    var6_31 = var3_11;
                                                    var3_11.o.h = GameStrings.dv;
                                                    var6_31.o.GameCanvas.i = GameStrings.bq;
                                                    var6_31.o.UIPanel = "";
                                                    var6_31.o.IActionListener = true;
                                                    var6_31.o.GameCanvas.e = true;
                                                    var6_31.o.GameCanvas.c(0);
                                                    if (main.GameCanvas.e) {
                                                        var6_31.o.GameCanvas.a();
                                                    }
                                                } else {
                                                    var3_11.Q = null;
                                                    var3_11.al = false;
                                                    var3_11.an = true;
                                                    var3_11.am = false;
                                                    var3_11.O = var3_11.R.size() + 2;
                                                    var3_11.v();
                                                }
                                            }
                                            if (var3_11.bN == 1) {
                                                GameService.a().a(1, null, -1);
                                            }
                                            if (var3_11.bN == 2) {
                                                var3_11.Q = null;
                                                var3_11.al = false;
                                                var3_11.an = true;
                                                var3_11.am = false;
                                                var3_11.O = var3_11.R.size() + 2;
                                                var3_11.v();
                                                super.M();
                                            }
                                        } else if (var3_11.an) {
                                            if (var3_11.bN == 0) {
                                                var3_11.al = false;
                                                var3_11.an = false;
                                                var3_11.am = true;
                                                var3_11.O = cb.ResourceUtil.size() + 2;
                                                var3_11.v();
                                            }
                                            if (var3_11.bN == 1) {
                                                if (var3_11.R.size() > 1) {
                                                    GameService.a().IActionListener();
                                                } else {
                                                    super.ai();
                                                }
                                            }
                                            if (var3_11.bN == 2) {
                                                if (var3_11.R.size() > 1) {
                                                    super.ai();
                                                } else {
                                                    GameService.a().a((byte)3, -1, (String)null);
                                                }
                                            }
                                            if (var3_11.bN == 3) {
                                                GameService.a().a((byte)3, -1, (String)null);
                                            }
                                        }
                                    } else if (var3_11.ak == 1) {
                                        if (var3_11.al) {
                                            GameService.a().a("");
                                        }
                                    } else if (var3_11.al) {
                                        var3_11.bD = super.Y();
                                        if (var3_11.bD != null) {
                                            var5_17 = new LoggingList("");
                                            var5_17.addElement(new Command(GameStrings.dB, (IActionListener)var3_11, 4001, var3_11.bD));
                                            main.GameCanvas.F.a(var5_17, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                            super.a(super.Y());
                                        }
                                    } else if (var3_11.an) {
                                        MathUtil.c("TOI DAY 1");
                                        var3_11.bF = super.W();
                                        if (var3_11.bF != null) {
                                            var5_18 = new LoggingList("");
                                            MathUtil.c("TOI DAY 2");
                                            if (var3_11.Q != null) {
                                                var5_18.addElement(new Command(GameStrings.bj, (IActionListener)var3_11, 8000, null));
                                                MathUtil.c("TOI DAY 3");
                                            } else if (var3_11.R != null) {
                                                MathUtil.c("TOI DAY 4");
                                                MathUtil.c("my role= " + GameWorld.e().aj);
                                                if (GameWorld.e().J == var3_11.bF.a || GameWorld.e().aj == 2) {
                                                    var5_18.addElement(new Command(GameStrings.bj, (IActionListener)var3_11, 8000, var3_11.bF));
                                                }
                                                if (GameWorld.e().aj < 2 && GameWorld.e().J != var3_11.bF.a) {
                                                    if (var3_11.bF.UIPanel == 0 || var3_11.bF.UIPanel == 1) {
                                                        var5_18.addElement(new Command(GameStrings.bj, (IActionListener)var3_11, 8000, var3_11.bF));
                                                    }
                                                    if (var3_11.bF.UIPanel == 2) {
                                                        var5_18.addElement(new Command(GameStrings.dC, (IActionListener)var3_11, 5002, var3_11.bF));
                                                    }
                                                    if (GameWorld.e().aj == 0) {
                                                        var5_18.addElement(new Command(GameStrings.dD, (IActionListener)var3_11, 5001, var3_11.bF));
                                                        if (var3_11.bF.UIPanel == 1) {
                                                            var5_18.addElement(new Command(GameStrings.dE, (IActionListener)var3_11, 5003, var3_11.bF));
                                                        }
                                                    }
                                                }
                                                if (GameWorld.e().aj < var3_11.bF.UIPanel) {
                                                    var5_18.addElement(new Command(GameStrings.dF, (IActionListener)var3_11, 5004, var3_11.bF));
                                                }
                                            }
                                            main.GameCanvas.F.a(var5_18, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                            super.a(var3_11.bF);
                                        }
                                    } else if (var3_11.am) {
                                        var3_11.bE = super.X();
                                        if (var3_11.bE != null) {
                                            if (var3_11.bE.IActionListener == 0) {
                                                var5_19 = new LoggingList("");
                                                var5_19.addElement(new Command(GameStrings.bj, (IActionListener)var3_11, 8000, var3_11.bE));
                                                main.GameCanvas.F.a(var5_19, var3_11.IActionListener, (var3_11.ak + 1) * var3_11.aD - var3_11.UIPanel + var3_11.GameWorld);
                                                super.a(var3_11.bE);
                                            } else if (var3_11.bE.IActionListener == 1) {
                                                if (var3_11.bE.c != GameWorld.e().J && var3_11.bN != -1) {
                                                    GameService.a().d(var3_11.bE.a);
                                                }
                                            } else if (var3_11.bE.IActionListener == 2 && var3_11.bE.k != null) {
                                                if (var3_11.bN == 0) {
                                                    GameService.a().a(var3_11.bE.a, (byte)1);
                                                } else if (var3_11.bN == 1) {
                                                    GameService.a().a(var3_11.bE.a, (byte)0);
                                                }
                                            }
                                        }
                                    }
                                    if (main.GameCanvas.e) {
                                        var3_11.bN = -1;
                                        var3_11.ak = -1;
                                    }
                                }
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.ag();
                    }
                    catch (Exception v0) {
                        var2_9 = v0;
                        v0.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    this.ao();
                    break;
                }
                case 26: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    main.GameCanvas.G.A();
                    break;
                }
                case 3: {
                    this.an();
                    break;
                }
                case 1: 
                case 17: {
                    var1_2 = this;
                    this.bC = null;
                    if (var1_2.ak < 0) break;
                    var2_10 = new LoggingList("");
                    if (var1_2.B < var1_2.aY.length - (main.GameCanvas.H != null ? 0 : 1) && var1_2.A != 17) {
                        var1_2.bC = GameWorld.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC != null) {
                            if (var1_2.bC.Message) {
                                if (var1_2.bC.s > 0) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.s), var1_2, 3005, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 4) {
                                var2_10.addElement(new Command(GameStrings.co, var1_2, 30001, var1_2.bC));
                                var2_10.addElement(new Command(GameStrings.bk, var1_2, 30002, var1_2.bC));
                                var2_10.addElement(new Command(GameStrings.cp, var1_2, 30003, var1_2.bC));
                            } else if (var1_2.bC.n == 0 && var1_2.bC.GameScreen == 0) {
                                if (var1_2.bC.j != 0L) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ev) + "\n" + MathUtil.a(var1_2.bC.j) + " \n" + GameStrings.fi, var1_2, 3004, var1_2.bC));
                                } else {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.co) + "\n" + GameStrings.Pos, var1_2, 3000, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 8) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.n) + "\n" + GameStrings.bD, var1_2, 30001, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen > 0) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.GameScreen) + "\n" + GameStrings.bE, var1_2, 30002, var1_2.bC));
                                }
                            } else if (var1_2.bJ != 2) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.n) + "\n" + GameStrings.bD, var1_2, 3000, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen > 0) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.GameScreen) + "\n" + GameStrings.bE, var1_2, 3001, var1_2.bC));
                                }
                            } else {
                                if (var1_2.bC.n != -1) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.n) + "\n" + GameStrings.bD, var1_2, 10016, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen != -1) {
                                    var2_10.addElement(new Command(String.valueOf(GameStrings.ew) + "\n" + MathUtil.IActionListener((long)var1_2.bC.GameScreen) + "\n" + GameStrings.bE, var1_2, 10017, var1_2.bC));
                                }
                            }
                        }
                    } else if (var1_2.bJ == 0) {
                        if (var1_2.ak == 0) {
                            var1_2.a(GameWorld.e().aH.length + GameWorld.e().aF.length, false);
                        } else {
                            var1_2.bC = null;
                            if (!UIPanel.a(var1_2.ak, var1_2.bO, GameWorld.e().aH)) {
                                var3_11 = GameWorld.e().aF[UIPanel.IActionListener(var1_2.ak, var1_2.bO, GameWorld.e().aH)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            } else {
                                var3_11 = GameWorld.e().aH[UIPanel.c(var1_2.ak, var1_2.bO)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            }
                            if (var1_2.bC != null) {
                                var2_10.addElement(new Command(GameStrings.eb, var1_2, 3002, var1_2.bC));
                            }
                        }
                    } else {
                        var1_2.bC = var1_2.A == 17 ? GameWorld.e().aJ[4][var1_2.ak] : GameWorld.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC.v == 0) {
                            if (var1_2.bC.a(87)) {
                                var2_10.addElement(new Command(GameStrings.fH, var1_2, 10013, var1_2.bC));
                            } else {
                                var2_10.addElement(new Command(GameStrings.fG, var1_2, 10012, var1_2.bC));
                            }
                        } else if (var1_2.bC.v == 1) {
                            var2_10.addElement(new Command(GameStrings.fK, var1_2, 10014, var1_2.bC));
                            var2_10.addElement(new Command(GameStrings.fO, var1_2, 10018, var1_2.bC));
                        } else if (var1_2.bC.v == 2) {
                            var2_10.addElement(new Command(GameStrings.fL, var1_2, 10015, var1_2.bC));
                        }
                    }
                    if (var1_2.bC != null) {
                        GameWorld.e().a(var1_2.bC.D, var1_2.bC.E, var1_2.bC.F, var1_2.bC.G);
                        main.GameCanvas.F.a(var2_10, var1_2.IActionListener, (var1_2.ak + 1) * var1_2.aD - var1_2.UIPanel + var1_2.GameWorld);
                        var1_2.IActionListener(var1_2.bC);
                        break;
                    }
                    var1_2.ai = null;
                    break;
                }
                case 25: {
                    break;
                }
                case 4: {
                    var1_2 = this;
                    if (UIPanel.aQ != null) {
                        UIPanel.aQ = null;
                    }
                    bv.s = (byte)-1;
                    System.gc();
                    bl.a();
                    var1_2.q();
                    var1_2.aK = 0;
                    var1_2.h = 0;
                    break;
                }
                case 14: {
                    var1_2 = this;
                    var1_2.an();
                    break;
                }
                case 7: {
                    if (this.equals(main.GameCanvas.H) && main.GameCanvas.G.A == 2) {
                        this.ao();
                        return;
                    }
                    this.ae();
                    break;
                }
                case 8: {
                    this.am();
                    break;
                }
                case 9: {
                    this.ad();
                    break;
                }
                case 10: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cl = true;
                    var1_2.A();
                    break;
                }
                case 11: {
                    this.ak();
                    break;
                }
                case 16: {
                    this.aj();
                    break;
                }
                case 15: {
                    this.aa();
                    break;
                }
                case 12: {
                    this.MessageHandler();
                    break;
                }
                case 13: {
                    this.ab();
                    break;
                }
                case 18: {
                    this.al();
                    break;
                }
                case 19: {
                    this.as();
                    break;
                }
                case 20: {
                    this.au();
                }
            }
        }
        var1_3 = 0;
        while (var1_3 < cb.ResourceUtil.size()) {
            ((cb)cb.ResourceUtil.elementAt(var1_3)).a();
            ++var1_3;
        }
        this.ap();
    }

    private void aa() {
        if (this.ak < -1) {
            return;
        }
        if (this.bI) {
            GameService.a().a(this.n, (byte)this.ak);
            return;
        }
        Object object = new LoggingList("");
        ((LoggingList)object).addElement(new Command(GameStrings.aM[0], this, 9999, (q)this.W.elementAt(this.ak)));
        main.GameCanvas.F.a((LoggingList)object, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
        q q2 = (q)this.W.elementAt(this.ak);
        object = this;
        String string = "|0|1|" + q2.e;
        string = String.valueOf(string) + "\n|1|Top " + q2.h;
        string = String.valueOf(string) + "\n|1|" + q2.f;
        string = String.valueOf(string) + "\n|2|" + q2.i;
        ((UIPanel)object).ai = new ae();
        super.a(((UIPanel)object).ai, string);
        ((UIPanel)object).bL = new int[]{q2.a, q2.d, q2.c};
        ((UIPanel)object).bC = null;
        ((UIPanel)object).cH = null;
    }

    private void ab() {
        Object object;
        if (this.B == 0 && this.equals(main.GameCanvas.G)) {
            this.ae();
            return;
        }
        if (this.B == 0 && this.equals(main.GameCanvas.H) || this.B == 2) {
            this.bC = this.equals(main.GameCanvas.H) ? (h)main.GameCanvas.H.V.elementAt(this.ak) : (h)main.GameCanvas.G.V.elementAt(this.ak);
            MathUtil.c("toi day select= " + this.ak);
            object = new LoggingList("");
            ((LoggingList)object).addElement(new Command(GameStrings.bj, this, 8000, this.bC));
            if (this.bC != null) {
                main.GameCanvas.F.a((LoggingList)object, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            if (this.ak == this.O - 3) {
                if (this.aS) {
                    return;
                }
                object = this;
                if (((UIPanel)object).o == null) {
                    ((UIPanel)object).o = new cq();
                    ((UIPanel)object).o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                    ((UIPanel)object).o.a();
                    ((UIPanel)object).o.c = main.GameCanvas.G;
                }
                ((UIPanel)object).o.h = GameStrings.ec;
                ((UIPanel)object).o.GameCanvas.i = GameStrings.ed;
                ((UIPanel)object).o.UIPanel = "";
                ((UIPanel)object).o.IActionListener = true;
                ((UIPanel)object).o.GameCanvas.c(1);
                ((UIPanel)object).o.a.IActionListener(10);
                if (main.GameCanvas.e) {
                    ((UIPanel)object).o.GameCanvas.a();
                }
            } else if (this.ak == this.O - 2) {
                if (!this.aT) {
                    boolean bl2 = this.aS = !this.aS;
                    if (this.aS) {
                        GameService.a().a((byte)5, -1, (byte)-1, -1);
                    } else {
                        this.A();
                        bp.a();
                        GameService.a().a((byte)3, -1, (byte)-1, -1);
                    }
                } else {
                    this.aT = false;
                }
            } else if (this.ak == this.O - 1) {
                if (this.aS && !this.aT && this.m) {
                    main.GameCanvas.a(GameStrings.eu, new Command(GameStrings.bn, this, 7002, null), new Command(GameStrings.bo, this, 4005, null));
                }
            } else {
                if (this.aS) {
                    return;
                }
                this.bC = (h)main.GameCanvas.G.U.elementAt(this.ak);
                object = new LoggingList("");
                ((LoggingList)object).addElement(new Command(GameStrings.bj, this, 8000, this.bC));
                if (this.bC != null) {
                    main.GameCanvas.F.a((LoggingList)object, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
                    this.b(this.bC);
                } else {
                    this.ai = null;
                }
            }
        }
        if (main.GameCanvas.e) {
            this.ak = -1;
        }
    }

    private void MessageHandler() {
        if (this.B == 0) {
            if (this.ak == -1) {
                return;
            }
            if (this.k.size() == 0) {
                return;
            }
            if (this.ak == this.k.size()) {
                this.cc = -1;
                this.ak = main.GameCanvas.e ? -1 : 0;
                bp.a();
                GameService.a().a((byte)1, this.k);
                return;
            }
            if (this.ak > this.k.size() - 1) {
                return;
            }
            this.bC = (h)main.GameCanvas.G.k.elementAt(this.ak);
            LoggingList el2 = new LoggingList("");
            el2.addElement(new Command(GameStrings.dY, this, 6001, this.bC));
            if (this.bC != null) {
                main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            this.ae();
        }
    }

    private void ad() {
        if (this.ak < 0) {
            return;
        }
        if (GameWorld.e().aE[this.ak].d && !GameWorld.e().aE[this.ak].e) {
            if (!main.GameCanvas.e) {
                GameService.a().IActionListener(this.ak);
                return;
            }
            if (main.GameCanvas.GameScreen > this.ae + this.ag - 40) {
                GameService.a().IActionListener(this.ak);
            }
        }
    }

    private void ae() {
        MathUtil.c("fire inventory");
        if (GameWorld.e().H == 14) {
            main.GameCanvas.a(GameStrings.ex);
            return;
        }
        if (this.ak == -1) {
            return;
        }
        if (this.ak == 0) {
            this.a(GameWorld.e().aH.length + GameWorld.e().aF.length, false);
            return;
        }
        this.bC = null;
        LoggingList el2 = new LoggingList("");
        if (!UIPanel.a(this.ak, this.bO, GameWorld.e().aH)) {
            h h2 = GameWorld.e().aF[UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH)];
            if (h2 != null) {
                this.bC = h2;
                if (main.GameCanvas.G.A == 12) {
                    el2.addElement(new Command(GameStrings.ey, this, 6000, this.bC));
                } else if (main.GameCanvas.G.A == 13) {
                    el2.addElement(new Command(GameStrings.ez, this, 7000, this.bC));
                } else if (h2.IActionListener()) {
                    el2.addElement(new Command(GameStrings.bm, this, 2000, this.bC));
                    if (GameWorld.e().bO) {
                        el2.addElement(new Command(GameStrings.ea, this, 2005, this.bC));
                    }
                } else {
                    el2.addElement(new Command(GameStrings.bm, this, 2001, this.bC));
                }
            }
        } else {
            h h3 = GameWorld.e().aH[UIPanel.c(this.ak, this.bO)];
            if (h3 != null) {
                this.bC = h3;
                el2.addElement(new Command(GameStrings.dY, this, 2002, this.bC));
            }
        }
        if (this.bC != null) {
            GameWorld.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (main.GameCanvas.G.A != 12 && main.GameCanvas.G.A != 13) {
                if (this.bH == 0) {
                    el2.addElement(new Command(GameStrings.dZ, this, 2003, this.bC));
                }
                if (this.bH == 1) {
                    el2.addElement(new Command(GameStrings.eb, this, 3002, this.bC));
                }
            }
            main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
            this.b(this.bC);
            return;
        }
        this.ai = null;
    }

    private void GameWorld() {
        this.A();
        if (aq.f == null || aq.f.size() == 0) {
            GameService.a().IActionListener(0, -1);
        }
        aq.a().IActionListener();
    }

    private void ag() {
        block36: {
            block35: {
                if (this.ak < 0) {
                    return;
                }
                if (SettingsManager.a && this.ak == G.length - 1) {
                    GameService.a().w();
                    return;
                }
                if (GameWorld.e().bO) break block35;
                switch (this.ak) {
                    case 0: {
                        this.GameWorld();
                        return;
                    }
                    case 1: {
                        GameService.a().j(54);
                        return;
                    }
                    case 2: {
                        this.ah();
                        return;
                    }
                    case 3: {
                        GameService.a().IActionListener((byte)0, (byte)-1);
                        bp.a();
                        return;
                    }
                    case 4: {
                        if (GameWorld.e().H == 14) {
                            main.GameCanvas.a(GameStrings.ex);
                            return;
                        }
                        GameService.a().h();
                        return;
                    }
                    case 5: {
                        main.GameCanvas.h();
                        if (GameWorld.e().Y() < 5) {
                            main.GameCanvas.a(GameStrings.eA);
                            return;
                        }
                        if (this.o == null) {
                            this.o = new cq();
                            this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                            this.o.a();
                            this.o.c = main.GameCanvas.G;
                        }
                        this.o.h = GameStrings.eB;
                        this.o.GameCanvas.i = GameStrings.bq;
                        this.o.UIPanel = "";
                        this.o.IActionListener = true;
                        this.o.GameCanvas.c(0);
                        if (main.GameCanvas.e) {
                            this.o.GameCanvas.a();
                            return;
                        }
                        break block36;
                    }
                    case 6: {
                        this.at();
                        return;
                    }
                    case 7: {
                        this.ar();
                        return;
                    }
                    case 8: {
                        LoginScreen.UIPanel();
                        return;
                    }
                    case 9: {
                        if (main.GameCanvas.I.n) {
                            SettingsManager.a();
                            SettingsManager.h();
                            return;
                        }
                        break block36;
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (this.ak) {
                case 0: {
                    this.GameWorld();
                    return;
                }
                case 1: {
                    GameService.a().j(54);
                    return;
                }
                case 2: {
                    this.ah();
                    return;
                }
                case 3: {
                    UIPanel g2 = this;
                    bp.a();
                    GameService.a().t();
                    g2.bM = 20;
                    return;
                }
                case 4: {
                    GameService.a().IActionListener((byte)0, (byte)-1);
                    bp.a();
                    return;
                }
                case 5: {
                    if (GameWorld.e().H == 14) {
                        main.GameCanvas.a(GameStrings.ex);
                        return;
                    }
                    GameService.a().h();
                    return;
                }
                case 6: {
                    main.GameCanvas.h();
                    if (GameWorld.e().Y() < 5) {
                        main.GameCanvas.a(GameStrings.eA);
                        return;
                    }
                    if (this.o == null) {
                        this.o = new cq();
                        this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                        this.o.a();
                        this.o.c = main.GameCanvas.G;
                    }
                    this.o.h = GameStrings.eB;
                    this.o.GameCanvas.i = GameStrings.bq;
                    this.o.UIPanel = "";
                    this.o.IActionListener = true;
                    this.o.GameCanvas.c(0);
                    if (!main.GameCanvas.e) break;
                    this.o.GameCanvas.a();
                    return;
                }
                case 7: {
                    this.at();
                    return;
                }
                case 8: {
                    this.ar();
                    return;
                }
                case 9: {
                    LoginScreen.UIPanel();
                    return;
                }
                case 10: {
                    if (!main.GameCanvas.I.n) break;
                    SettingsManager.a();
                    SettingsManager.h();
                }
            }
        }
    }

    private void ah() {
        this.O = at.size();
        this.aD = 24;
        this.ak = main.GameCanvas.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.A = 23;
        this.c(0);
    }

    private void ai() {
        this.o.h = GameStrings.dx;
        this.o.GameCanvas.i = GameStrings.dx;
        this.o.UIPanel = "";
        this.o.IActionListener = true;
        this.o.GameCanvas.e = true;
        this.o.GameCanvas.c(0);
        if (main.GameCanvas.e) {
            this.o.GameCanvas.a();
        }
    }

    public final void C() {
        if (this.j == null) {
            this.j = new UIGame();
        }
        this.j.m = this.o.GameCanvas.d();
        this.j.a(false);
        this.o.IActionListener = false;
    }

    private void IActionListener(r r2) {
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = r2.e ? String.valueOf(string) + "|4|1|" + GameStrings.cN : String.valueOf(string) + "|3|1|" + GameStrings.cO;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + GameStrings.da + ": " + r2.a;
        this.ai = new ae();
        this.a(this.ai, string);
        this.cH = r2.c;
        this.bC = null;
    }

    private void aj() {
        if (this.ak < 0) {
            return;
        }
        if (this.X.size() == 0) {
            return;
        }
        LoggingList el2 = new LoggingList("");
        this.cG = this.ak;
        el2.addElement(new Command(GameStrings.NetworkService, this, 10000, (r)this.X.elementAt(this.cG)));
        el2.addElement(new Command(GameStrings.bk, this, 10001, (r)this.X.elementAt(this.cG)));
        main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
        this.b((r)this.X.elementAt(this.ak));
    }

    private void ak() {
        if (this.ak < 0) {
            return;
        }
        if (this.T.size() == 0) {
            return;
        }
        LoggingList el2 = new LoggingList("");
        this.cG = this.ak;
        el2.addElement(new Command(GameStrings.bq, this, 8001, (r)this.T.elementAt(this.cG)));
        el2.addElement(new Command(GameStrings.bk, this, 8002, (r)this.T.elementAt(this.cG)));
        el2.addElement(new Command(GameStrings.gn, this, 8004, (r)this.T.elementAt(this.cG)));
        main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
        this.b((r)this.T.elementAt(this.ak));
    }

    private void al() {
        if (this.ak < 0) {
            return;
        }
        LoggingList el2 = new LoggingList("");
        this.cG = this.ak;
        el2.addElement(new Command(GameStrings.bR, this, 10030, null));
        el2.addElement(new Command(GameStrings.bA, this, 10031, null));
        main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
    }

    private void am() {
        if (this.ak == 0) {
            this.au = !this.au;
            RMSManager.a("viewchat", this.au ? 1 : 0);
            if (main.GameCanvas.e) {
                this.ak = -1;
            }
            return;
        }
        if (this.ak < 0) {
            return;
        }
        if (this.bG.size() == 0) {
            return;
        }
        Object object = new LoggingList("");
        this.cG = this.ak - 1;
        ((LoggingList)object).addElement(new Command(GameStrings.bq, this, 8001, (r)this.bG.elementAt(this.cG)));
        ((LoggingList)object).addElement(new Command(GameStrings.cP, this, 8003, (r)this.bG.elementAt(this.cG)));
        main.GameCanvas.F.a((LoggingList)object, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
        r r2 = (r)this.bG.elementAt(this.ak - 1);
        object = this;
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + MathUtil.a(r2.a, "|", 0)[2];
        ((UIPanel)object).ai = new ae();
        super.a(((UIPanel)object).ai, string);
        ((UIPanel)object).cH = r2.c;
        ((UIPanel)object).bC = null;
    }

    private void d(int n2) {
        String string = "";
        int n3 = 0;
        if (this.ak == 0) {
            n3 = GameWorld.e().cr + 1000;
        }
        if (this.ak == 1) {
            n3 = GameWorld.e().cs + 1000;
        }
        if (this.ak == 2) {
            n3 = GameWorld.e().cq * GameWorld.e().cD;
        }
        if (this.ak == 3) {
            n3 = 500000 + GameWorld.e().ct * 100000;
        }
        string = String.valueOf(string) + "|5|2|" + GameStrings.bm + " " + n3 + " " + GameStrings.fi;
        if (n2 == 0) {
            string = String.valueOf(string) + "\n|5|2|" + GameStrings.fm;
        }
        if (n2 == 1) {
            string = String.valueOf(string) + "\n|5|2|" + GameStrings.fn;
        }
        if (n2 == 2) {
            string = String.valueOf(string) + "\n|5|2|" + GameStrings.fo;
        }
        if (n2 == 3) {
            string = String.valueOf(string) + "\n|5|2|" + GameStrings.fo;
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.bK = -1;
        this.ai = new ae();
        this.a(this.ai, string);
    }

    private void an() {
        if (this.ak == -1) {
            return;
        }
        MathUtil.c("FIRE ZONE");
        this.cI = true;
        main.GameCanvas.G.A();
    }

    public final void a(int n2, int n3) {
        this.ai.d[this.ai.d.length - 1] = String.valueOf(GameStrings.cZ) + " " + n2 + "/" + n3;
    }

    private void ao() {
        if (this.ak < 0) {
            return;
        }
        this.bC = null;
        LoggingList el2 = new LoggingList("");
        if (this.B == 0 && !this.equals(main.GameCanvas.H)) {
            if (this.ak == 0) {
                this.a(GameWorld.e().aG.length, false);
            } else {
                byte by2 = (byte)UIPanel.c(this.ak, this.bO);
                h h2 = GameWorld.e().aG[by2];
                if (h2 != null) {
                    if (this.aj) {
                        el2.addElement(new Command(GameStrings.dY, this, 1000, h2));
                        el2.addElement(new Command(GameStrings.bm, this, 2010, h2));
                    } else if (h2.IActionListener()) {
                        el2.addElement(new Command(GameStrings.dY, this, 1000, h2));
                    } else {
                        el2.addElement(new Command(GameStrings.dY, this, 1000, h2));
                    }
                    this.bC = h2;
                }
            }
        }
        if (this.B == 1 || this.equals(main.GameCanvas.H)) {
            if (this.ak == 0) {
                this.a(GameWorld.e().aH.length + GameWorld.e().aF.length, true);
            } else {
                Object object = GameWorld.e().aH;
                boolean bl2 = UIPanel.a(this.ak, this.bO, object);
                if (!bl2) {
                    byte by3 = (byte)UIPanel.IActionListener(this.ak, this.bO, object);
                    h h3 = GameWorld.e().aF[by3];
                    if (h3 != null) {
                        el2.addElement(new Command(GameStrings.cC, this, 1001, h3));
                        if (h3.IActionListener()) {
                            el2.addElement(new Command(GameStrings.bm, this, 2000, h3));
                        } else {
                            el2.addElement(new Command(GameStrings.bm, this, 2001, h3));
                        }
                        this.bC = h3;
                    }
                } else {
                    object = GameWorld.e().aH[UIPanel.c(this.ak, this.bO)];
                    if (object != null) {
                        el2.addElement(new Command(GameStrings.cD, this, 1002, object));
                        this.bC = object;
                    }
                }
            }
        }
        if (this.bC != null) {
            GameWorld.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (this.aj) {
                el2.addElement(new Command(GameStrings.dZ, this, 2011, this.bC));
            }
            main.GameCanvas.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.GameWorld);
            this.b(this.bC);
        } else {
            this.ai = null;
        }
        this.aI = this.O * this.aD - this.ah;
    }

    public final void a(byte by2, String string, byte by3, byte by4) {
        main.GameCanvas.h();
        co co2 = new co();
        new co().c = by2;
        co2.a = by4;
        co2.IActionListener = by3;
        main.GameCanvas.a(string, new Command(GameStrings.bn, this, 2004, co2), new Command(GameStrings.bo, this, 4005, null));
    }

    public final void a(byte by2, String string, short s2) {
        co co2 = new co();
        new co().c = by2;
        co2.a = s2;
        main.GameCanvas.a(string, new Command(GameStrings.bn, this, 3003, co2), new Command(GameStrings.bo, this, 4005, null));
    }

    public final void a(int n2, Object object) {
        eh eh2;
        eh eh3;
        h h2;
        int n3;
        Object object2;
        if (n2 == 9999) {
            object2 = (q)object;
            GameService.a().w(((q)object2).UIPanel);
        }
        if (n2 == 170391) {
            RMSManager.a();
            if (MGraphics.IActionListener > 1) {
                RMSManager.a("levelScreenKN", 1);
            } else {
                RMSManager.a("levelScreenKN", 0);
            }
            GameMidlet.f.a();
        }
        if (n2 == 6001) {
            object2 = (h)object;
            ((h)object).f = false;
            main.GameCanvas.G.k.removeElement(object2);
            if (main.GameCanvas.G.B == 0) {
                main.GameCanvas.G.o();
            }
        }
        if (n2 == 6000) {
            object2 = (h)object;
            n3 = 0;
            while (n3 < main.GameCanvas.G.k.size()) {
                h2 = (h)main.GameCanvas.G.k.elementAt(n3);
                if (h2.IActionListener.a == ((h)object2).IActionListener.a) {
                    main.GameCanvas.a(GameStrings.ej);
                    return;
                }
                ++n3;
            }
            ((h)object2).f = true;
            main.GameCanvas.G.k.addElement(object2);
            if (main.GameCanvas.G.B == 0) {
                main.GameCanvas.G.o();
            }
        }
        if (n2 == 7000) {
            if (this.aS) {
                main.GameCanvas.a(GameStrings.ek);
                return;
            }
            object2 = (h)object;
            n3 = 0;
            while (n3 < main.GameCanvas.G.U.size()) {
                h2 = (h)main.GameCanvas.G.U.elementAt(n3);
                if (h2.UIPanel == ((h)object2).UIPanel) {
                    main.GameCanvas.a(GameStrings.ej);
                    return;
                }
                ++n3;
            }
            if (((h)object2).h > 1) {
                UIPanel g2 = this;
                if (g2.o == null) {
                    g2.o = new cq();
                    g2.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                    g2.o.a();
                    g2.o.c = main.GameCanvas.G;
                }
                g2.o.h = GameStrings.eg;
                g2.o.GameCanvas.i = GameStrings.eh;
                g2.o.UIPanel = "";
                g2.o.IActionListener = true;
                g2.o.GameCanvas.c(1);
                if (main.GameCanvas.e) {
                    g2.o.GameCanvas.a();
                }
                return;
            }
            ((h)object2).f = true;
            h h3 = new h();
            new h().IActionListener = ((h)object2).IActionListener;
            h3.a = ((h)object2).a;
            h3.UIPanel = ((h)object2).UIPanel;
            main.GameCanvas.G.U.addElement(h3);
            GameService.a().a((byte)2, -1, (byte)h3.UIPanel, h3.h);
        }
        if (n2 == 7001) {
            object2 = (h)object;
            ((h)object).f = false;
            main.GameCanvas.G.U.removeElement(object2);
            if (main.GameCanvas.G.B == 1) {
                main.GameCanvas.G.a(true);
            }
            GameService.a().a((byte)4, -1, (byte)((h)object2).UIPanel, -1);
        }
        if (n2 == 7002) {
            this.aT = true;
            main.GameCanvas.h();
            GameService.a().a((byte)7, -1, (byte)-1, -1);
            this.A();
        }
        if (n2 == 8003) {
            object2 = (r)object;
            GameService.a().a((byte)1, ((r)object2).c.J);
        }
        if (n2 == 8002) {
            object2 = (r)object;
            GameService.a().a((byte)2, ((r)object2).c.J);
        }
        if (n2 == 8004) {
            object2 = (r)object;
            GameService.a().a(((r)object2).c.J);
        }
        if (n2 == 8001) {
            MathUtil.c("chat player");
            object2 = (r)object;
            if (this.o == null) {
                this.o = new cq();
                this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                this.o.a();
                this.o.c = main.GameCanvas.G;
            }
            this.o.h = GameStrings.cQ;
            this.o.GameCanvas.i = String.valueOf(GameStrings.cR) + " " + ((r)object2).c.ag;
            this.o.UIPanel = "";
            this.o.IActionListener = true;
            this.o.GameCanvas.e = true;
            this.o.GameCanvas.c(0);
            if (main.GameCanvas.e) {
                this.o.GameCanvas.a();
            }
        }
        if (n2 == 1000) {
            GameService.a().a((byte)0, (byte)UIPanel.c(this.ak, this.bO));
        }
        if (n2 == 1001) {
            byte by2 = (byte)UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH);
            GameService.a().a(bj, by2);
        }
        if (n2 == 1003) {
            this.A();
        }
        if (n2 == 1002) {
            GameService.a().a(bk, (byte)UIPanel.c(this.ak, this.bO));
        }
        if (n2 == 2011) {
            GameService.a().a((byte)1, (byte)2, (byte)UIPanel.c(this.ak, this.bO), (short)-1);
        }
        if (n2 == 2010) {
            GameService.a().a((byte)0, (byte)2, (byte)UIPanel.c(this.ak, this.bO), (short)-1);
            h h4 = (h)object;
            if (h4 != null && (h4.IActionListener.a == 193 || h4.IActionListener.a == 194)) {
                main.GameCanvas.G.A();
            }
        }
        if (n2 == 2000) {
            h[] hArray = GameWorld.e().aH;
            byte by3 = (byte)UIPanel.IActionListener(this.ak, this.bO, hArray);
            GameService.a().a(bl, by3);
        }
        if (n2 == 2001) {
            MathUtil.c("use item");
            h h5 = (h)object;
            boolean bl2 = UIPanel.a(this.ak, this.bO, GameWorld.e().aH);
            byte by4 = !bl2 ? (byte)UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH) : (byte)UIPanel.c(this.ak, this.bO);
            GameService.a().a((byte)0, (byte)(!bl2 ? 1 : 0), by4, (short)-1);
            if (h5.IActionListener.a == 193 || h5.IActionListener.a == 194) {
                main.GameCanvas.G.A();
            }
        }
        if (n2 == 2002) {
            GameService.a().a(bm, (byte)UIPanel.c(this.ak, this.bO));
        }
        if (n2 == 2003) {
            MathUtil.c("remove item");
            boolean bl3 = UIPanel.a(this.ak, this.bO, GameWorld.e().aH);
            byte by5 = !bl3 ? (byte)UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH) : (byte)UIPanel.c(this.ak, this.bO);
            GameService.a().a((byte)1, (byte)(!bl3 ? 1 : 0), by5, (short)-1);
        }
        if (n2 == 2004) {
            main.GameCanvas.h();
            co co2 = (co)object;
            byte by6 = (byte)co2.IActionListener;
            byte by7 = (byte)co2.a;
            GameService.a().a((byte)(co2.c == 0 ? 3 : 2), by6, by7, (short)-1);
        }
        if (n2 == 2005) {
            byte by8 = (byte)UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH);
            GameService.a().a(bn, by8);
        }
        if (n2 == 2006) {
            GameWorld.f();
            byte by9 = (byte)this.ak;
            GameService.a().a(bo, by9);
        }
        if (n2 == 30001) {
            MathUtil.c("nhan do");
            GameService.a().a((byte)0, this.ak, 0);
        }
        if (n2 == 30002) {
            MathUtil.c("xoa do");
            GameService.a().a((byte)1, this.ak, 0);
        }
        if (n2 == 30003) {
            MathUtil.c("nhan tat");
            GameService.a().a((byte)2, this.ak, 0);
        }
        if (n2 == 3000) {
            MathUtil.c("mua do");
            h h6 = (h)object;
            GameService.a().a((byte)0, (int)h6.IActionListener.a, 0);
        }
        if (n2 == 3001) {
            h h7 = (h)object;
            main.GameCanvas.L.IActionListener();
            GameService.a().a((byte)1, (int)h7.IActionListener.a, 0);
        }
        if (n2 == 3002) {
            main.GameCanvas.h();
            boolean bl4 = UIPanel.a(this.ak, this.bO, GameWorld.e().aH);
            byte by10 = !bl4 ? (byte)UIPanel.IActionListener(this.ak, this.bO, GameWorld.e().aH) : (byte)UIPanel.c(this.ak, this.bO);
            GameService.a().a((byte)0, (byte)(!bl4 ? 1 : 0), by10);
        }
        if (n2 == 3003) {
            main.GameCanvas.h();
            co co3 = (co)object;
            GameService.a().a((byte)1, (byte)co3.c, (short)co3.a);
        }
        if (n2 == 3004) {
            h h8 = (h)object;
            GameService.a().a((byte)3, (int)h8.IActionListener.a, 0);
        }
        if (n2 == 3005) {
            MathUtil.c("mua do");
            h h9 = (h)object;
            GameService.a().a((byte)3, (int)h9.IActionListener.a, 0);
        }
        if (n2 == 4000 && (eh3 = (eh)object) != null) {
            main.GameCanvas.h();
            GameService.a().a(2, null, eh3.a);
        }
        if (n2 == 4001 && (eh2 = (eh)object) != null) {
            bp.a();
            this.ao = GameStrings.aC;
            GameService.a().e(eh2.a);
        }
        if (n2 == 4005) {
            main.GameCanvas.h();
        }
        if (n2 == 4007) {
            main.GameCanvas.h();
        }
        if (n2 == 4006) {
            cb cb2 = (cb)object;
            GameService.a().d(cb2.a);
        }
        if (n2 == 5001) {
            e e2 = (e)object;
            GameService.a().IActionListener(e2.a, (byte)0);
        }
        if (n2 == 5002) {
            e e3 = (e)object;
            GameService.a().IActionListener(e3.a, (byte)1);
        }
        if (n2 == 5003) {
            e e4 = (e)object;
            GameService.a().IActionListener(e4.a, (byte)2);
        }
        if (n2 == 5004) {
            e e5 = (e)object;
            GameService.a().IActionListener(e5.a, (byte)-1);
        }
        if (n2 == 9000) {
            GameService.a().a(this.ak, 1);
            main.GameCanvas.h();
            bp.a();
        }
        if (n2 == 9006) {
            GameService.a().a(this.ak, 10);
            main.GameCanvas.h();
            bp.a();
        }
        if (n2 == 9007) {
            GameService.a().a(this.ak, 100);
            main.GameCanvas.h();
            bp.a();
        }
        if (n2 == 9002) {
            bf bf2 = (Skill)object;
            if (bf2.GameCanvas.c()) {
                main.GameCanvas.a(GameStrings.IActionListener);
            } else {
                main.GameCanvas.a(String.valueOf(GameStrings.eS) + bf2.d + GameStrings.eT + bf2.ResourceUtil + GameStrings.eU);
            }
        }
        if (n2 == 9003) {
            if (main.GameCanvas.e) {
                GameScreen.j();
                GameScreen.a((et)object);
            } else {
                GameScreen.j();
                GameScreen.IActionListener((et)object);
            }
        }
        if (n2 == 9004) {
            bf bf3 = (Skill)object;
            if (bf3.GameCanvas.c()) {
                main.GameCanvas.a(GameStrings.a);
            } else {
                main.GameCanvas.a(String.valueOf(GameStrings.eS) + bf3.d + GameStrings.eT + bf3.ResourceUtil + GameStrings.eU);
            }
        }
        if (n2 == 10000) {
            r r2 = (r)object;
            GameService.a().IActionListener((byte)1, r2.c.J);
            main.GameCanvas.G.z();
        }
        if (n2 == 10001) {
            r r3 = (r)object;
            GameService.a().IActionListener((byte)2, r3.c.J);
            bp.a();
        }
        if (n2 == 10012) {
            if (this.o == null) {
                this.o = new cq();
                this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                this.o.a();
                this.o.c = main.GameCanvas.H == null ? main.GameCanvas.G : main.GameCanvas.H;
            }
            this.o.GameCanvas.c(1);
            this.o.GameCanvas.a("");
            if (this.bC.h == 1) {
                this.o.h = GameStrings.fI;
                this.o.GameCanvas.i = GameStrings.ed;
            } else {
                this.o.h = String.valueOf(GameStrings.eh) + " ";
                this.o.GameCanvas.i = GameStrings.eh;
            }
            this.o.a.IActionListener(10);
            this.o.UIPanel = "";
            this.o.IActionListener = true;
            this.o.GameCanvas.c(1);
            if (main.GameCanvas.e) {
                this.o.GameCanvas.a();
            }
        }
        if (n2 == 10013) {
            if (this.o == null) {
                this.o = new cq();
                this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                this.o.a();
                this.o.c = main.GameCanvas.H == null ? main.GameCanvas.G : main.GameCanvas.H;
            }
            this.o.GameCanvas.c(1);
            this.o.GameCanvas.a("");
            if (this.bC.h == 1) {
                this.o.h = GameStrings.fJ;
                this.o.GameCanvas.i = GameStrings.ed;
            } else {
                this.o.h = String.valueOf(GameStrings.eh) + "  ";
                this.o.GameCanvas.i = GameStrings.eh;
            }
            this.o.UIPanel = "";
            this.o.IActionListener = true;
            this.o.GameCanvas.c(1);
            if (main.GameCanvas.e) {
                this.o.GameCanvas.a();
            }
        }
        if (n2 == 10014) {
            h h10 = (h)object;
            GameService.a().a((byte)1, h10.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10015) {
            h h11 = (h)object;
            GameService.a().a((byte)2, h11.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10016) {
            h h12 = (h)object;
            GameService.a().a((byte)3, h12.d, (byte)0, h12.n, -1);
            bp.a();
        }
        if (n2 == 10017) {
            h h13 = (h)object;
            GameService.a().a((byte)3, h13.d, (byte)1, h13.GameScreen, -1);
            bp.a();
        }
        if (n2 == 10018) {
            h h14 = (h)object;
            GameService.a().a((byte)5, h14.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10019) {
            NetworkService.a().e();
            RMSManager.a("acc", "");
            RMSManager.a("pass", "");
            main.GameCanvas.I.IActionListener.a("");
            main.GameCanvas.I.GameCanvas.a("");
            main.GameCanvas.I.n = false;
            main.GameCanvas.ak.IActionListener();
            main.GameCanvas.h();
            this.A();
        }
        if (n2 == 10020) {
            main.GameCanvas.h();
        }
        if (n2 == 10030) {
            GameService.a().IActionListener((byte)1, (byte)this.ak);
            main.GameCanvas.G.z();
        }
        if (n2 == 10031) {
            NetworkService.a().e();
        }
        if (n2 == 11000) {
            GameService.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, 1);
            main.GameCanvas.h();
        }
        if (n2 == 11001) {
            GameService.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, this.bC.i);
            main.GameCanvas.h();
        }
        if (n2 == 11002) {
            this.o.IActionListener = false;
            main.GameCanvas.h();
        }
    }

    public final void a(String object, String object2) {
        if (this.o.GameCanvas.d() == null || this.o.GameCanvas.d().equals("") || ((String)object).equals("") || object == null) {
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(GameStrings.dt)) {
            bp.a();
            this.o.IActionListener = false;
            GameService.a().a((String)object);
            return;
        }
        if (this.o.h.equals(GameStrings.dv)) {
            bp.a();
            this.o.IActionListener = false;
            GameService.a().a(0, (String)object, -1);
            return;
        }
        if (this.o.h.equals(GameStrings.dw)) {
            if (this.o.GameCanvas.d() == "") {
                GameScreen.aD.a(GameStrings.dG, 0);
                return;
            }
            if (this.j == null) {
                this.j = new UIGame();
            }
            this.j.m = this.o.GameCanvas.d();
            this.j.a(false);
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(GameStrings.dx)) {
            if (this.o.GameCanvas.d() == "") {
                GameScreen.aD.a(GameStrings.dH, 0);
                return;
            }
            GameService.a().a((byte)4, GameWorld.e().ai.IActionListener, this.o.GameCanvas.d());
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(GameStrings.fY)) {
            try {
                int n2 = Integer.parseInt(this.o.GameCanvas.d());
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                this.A();
                if (this.o.GameCanvas.d().length() != 6 || this.o.GameCanvas.d().equals("")) {
                    main.GameCanvas.a(GameStrings.fZ);
                    return;
                }
                GameService.a().x(n2);
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                this.A();
                return;
            }
            catch (Exception exception) {
                main.GameCanvas.a(GameStrings.R);
                return;
            }
        }
        if (this.o.h.equals(GameStrings.eB)) {
            if (this.o.GameCanvas.d().equals("")) {
                return;
            }
            GameService.a().e(this.o.GameCanvas.d());
            this.o.IActionListener = false;
            this.A();
            return;
        }
        if (this.o.h.equals(GameStrings.cQ)) {
            this.o.IActionListener = false;
            object2 = null;
            if (this.A == 8) {
                object2 = (r)this.bG.elementAt(this.cG);
            } else if (this.A == 11) {
                object2 = (r)this.T.elementAt(this.cG);
            }
            if (((r)object2).c.J == GameWorld.e().J) {
                return;
            }
            GameService.a().a((String)object, ((r)object2).c.J);
            return;
        }
        if (this.o.h.equals(GameStrings.eg)) {
            int n3;
            try {
                n3 = Integer.parseInt(this.o.GameCanvas.d());
            }
            catch (Exception exception) {
                main.GameCanvas.a(GameStrings.ei);
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                return;
            }
            if (n3 <= 0 || n3 > this.bC.h) {
                main.GameCanvas.a(GameStrings.ei);
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                return;
            }
            this.bC.f = true;
            object = new h();
            new h().IActionListener = this.bC.IActionListener;
            ((h)object).h = n3;
            ((h)object).UIPanel = this.bC.UIPanel;
            ((h)object).a = this.bC.a;
            main.GameCanvas.G.U.addElement(object);
            GameService.a().a((byte)2, -1, (byte)((h)object).UIPanel, ((h)object).h);
            this.o.IActionListener = false;
            this.o.GameCanvas.c(0);
            return;
        }
        if (this.o.h == GameStrings.ec) {
            int n4;
            try {
                n4 = Integer.parseInt(this.o.GameCanvas.d());
            }
            catch (Exception exception) {
                main.GameCanvas.a(GameStrings.ee);
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                return;
            }
            if ((long)n4 > GameWorld.e().at) {
                main.GameCanvas.a(GameStrings.ef);
                this.o.IActionListener = false;
                this.o.GameCanvas.c(0);
                return;
            }
            this.aR = n4;
            GameService.a().a((byte)2, -1, (byte)-1, n4);
            this.o.IActionListener = false;
            this.o.GameCanvas.c(0);
            return;
        }
        if (this.o.h.equals(GameStrings.fI)) {
            try {
                GameService.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.GameCanvas.d()), 1);
            }
            catch (Exception exception) {
                main.GameCanvas.a(GameStrings.ee);
            }
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(GameStrings.fI) + " ")) {
            try {
                GameService.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.GameCanvas.d()), this.bC.i);
            }
            catch (Exception exception) {
                main.GameCanvas.a(GameStrings.ee);
            }
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(GameStrings.fJ)) {
            this.e(0);
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(GameStrings.fJ) + "  ")) {
            this.e(1);
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(GameStrings.eh) + " ")) {
            this.bC.i = Integer.parseInt(this.o.GameCanvas.d());
            if (this.bC.i > this.bC.h) {
                main.GameCanvas.a(GameStrings.ei);
                return;
            }
            this.cJ = true;
            this.o.IActionListener = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(GameStrings.eh) + "  ")) {
            this.bC.i = Integer.parseInt(this.o.GameCanvas.d());
            if (this.bC.i > this.bC.h) {
                main.GameCanvas.a(GameStrings.ei);
                return;
            }
            this.cK = true;
            this.o.IActionListener = false;
        }
    }

    public final void D() {
        this.o.GameCanvas.c(0);
    }

    public final void IActionListener(int n2) {
        this.cX = n2;
        this.cM = 90;
        if (this.cX == 0) {
            this.cQ = 5;
            this.cO = 90;
            this.cN = 90;
            this.cW = 2;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h2 = (h)this.k.elementAt(n2);
                if (h2 != null) {
                    if (h2.IActionListener.IActionListener == 14) {
                        this.Command = h2.IActionListener.f;
                    } else {
                        this.aA = h2.IActionListener.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 1) {
            this.cQ = 2;
            this.cO = 0;
            this.cN = 0;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h3 = (h)this.k.elementAt(n2);
                if (h3 != null) {
                    if (n2 == 0) {
                        this.aA = h3.IActionListener.f;
                    } else {
                        this.Command = h3.IActionListener.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 2) {
            this.cQ = 7;
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h4 = (h)this.k.elementAt(n2);
                if (h4 != null) {
                    this.aA = h4.IActionListener.f;
                }
                ++n2;
            }
        } else if (this.cX == 3) {
            this.ax = main.GameCanvas.C;
            this.ay = main.GameCanvas.D;
            this.cQ = 1;
            this.cO = 1;
            this.cN = 1;
            this.cW = 4;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h5 = (h)this.k.elementAt(n2);
                if (h5 != null) {
                    this.aA = h5.IActionListener.f;
                }
                ++n2;
            }
        } else if (this.cX == 4) {
            this.cQ = this.k.size();
            this.df = new short[this.cQ];
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h6 = (h)this.k.elementAt(n2);
                if (h6 != null) {
                    this.df[n2] = h6.IActionListener.f;
                }
                ++n2;
            }
        }
        this.cR = 1;
        this.IMessageHandler = true;
        this.az = false;
        this.dc = false;
        this.cP = 360 / this.cQ;
        this.cS = new int[this.cQ];
        this.cT = new int[this.cQ];
        this.cU = new int[this.cQ];
        this.cV = new int[this.cQ];
        this.aq();
        this.dd = true;
        this.cY = 10;
        this.cZ = 30;
        this.da = 10;
        this.a(this.GameStrings, GameStrings.B);
    }

    private void ap() {
        --this.cY;
        if (this.cY < 0) {
            this.cY = 0;
        }
        --this.cZ;
        if (this.cZ < 0) {
            this.cZ = 0;
        }
        if (this.cY == 0) {
            if (!this.dc) {
                if (this.cW > 0) {
                    if (this.RMSManager != -1) {
                        if (this.cX == 3) {
                            if (main.GameCanvas.w % 10 == 0) {
                                ea ea2 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                                ei.a(ea2);
                                --this.cW;
                            }
                        } else {
                            if (main.GameCanvas.w % 2 == 0) {
                                if (this.IMessageHandler) {
                                    if (this.cR < 40) {
                                        this.cR += 2;
                                    }
                                } else if (this.cR > 10) {
                                    this.cR -= 2;
                                }
                            }
                            if (this.cZ == 0) {
                                if (this.IMessageHandler) {
                                    if (this.cM > 0) {
                                        this.cM -= 5;
                                    } else if (main.GameCanvas.w % 10 == 0) {
                                        this.IMessageHandler = false;
                                        --this.cW;
                                        this.cZ = 5;
                                        this.da = 10;
                                    }
                                } else if (this.cM < 90) {
                                    this.cM += 5;
                                } else if (main.GameCanvas.w % 10 == 0) {
                                    this.IMessageHandler = true;
                                    this.cZ = 10;
                                }
                            }
                            this.cN = this.cO;
                            this.cN -= this.cR;
                            if (this.cN >= 360) {
                                this.cN -= 360;
                            }
                            if (this.cN < 0) {
                                this.cN += 360;
                            }
                            this.cO = this.cN;
                            this.aq();
                        }
                    }
                } else if (main.GameCanvas.w % 20 == 0) {
                    this.dc = true;
                }
                if (main.GameCanvas.w % 20 == 0) {
                    if (this.cX != 3) {
                        ax.a(132, this.ax, this.ay, 2);
                    }
                    ax.a(114, this.ax, this.ay + 20, 2);
                    return;
                }
            } else if (this.dc) {
                if (this.RMSManager == 1) {
                    if (this.da == 10) {
                        ea ea3 = new ea(22, this.ax - 3, this.ay + 25, 4, 1, 1);
                        ei.a(ea3);
                    }
                    --this.da;
                    if (this.da < 0) {
                        this.da = 0;
                    }
                    if (this.cM < 300) {
                        this.cM = MathUtil.UIPanel(this.cM + 10);
                        if (this.cM == 20) {
                            this.a(this.GameStrings, GameStrings.C);
                        }
                    } else if (main.GameCanvas.w % 20 == 0) {
                        if (main.GameCanvas.A > 2 * ab) {
                            main.GameCanvas.H = new UIPanel();
                            main.GameCanvas.H.M[7] = new String[][]{{""}};
                            main.GameCanvas.H.f();
                            main.GameCanvas.H.s();
                        }
                        this.RMSManager = (byte)-1;
                        this.az = true;
                        if (this.cX == 4) {
                            main.GameCanvas.G.z();
                        }
                    }
                    this.aq();
                    return;
                }
                if (this.RMSManager == 0) {
                    if (this.da == 10) {
                        if (this.cX == 2) {
                            ea ea4 = new ea(20, this.ax - 3, this.ay + 15, 4, 2, 1);
                            ei.a(ea4);
                        } else {
                            ea ea5 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                            ei.a(ea5);
                        }
                        this.a(this.GameStrings, GameStrings.E);
                        this.dd = false;
                    }
                    if (!this.dd) {
                        --this.da;
                        if (this.da < -50) {
                            this.da = -50;
                            if (this.cX < 3 && main.GameCanvas.A > 2 * ab) {
                                main.GameCanvas.H = new UIPanel();
                                main.GameCanvas.H.M[7] = new String[][]{{""}};
                                main.GameCanvas.H.f();
                                main.GameCanvas.H.s();
                            }
                            this.RMSManager = (byte)-1;
                            this.az = true;
                            if (this.cX == 4) {
                                main.GameCanvas.G.z();
                            }
                        }
                    }
                }
            }
        }
    }

    private void aq() {
        int n2 = 0;
        while (n2 < this.cT.length) {
            if (this.cN >= 360) {
                this.cN -= 360;
            }
            if (this.cN < 0) {
                this.cN += 360;
            }
            this.cT[n2] = MathUtil.UIPanel(this.cM * MathUtil.a(this.cN) / 1024);
            this.cS[n2] = MathUtil.UIPanel(this.cM * MathUtil.IActionListener(this.cN) / 1024);
            if (this.cN < 90) {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 90 && this.cN < 180) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 180 && this.cN < 270) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            } else {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            }
            this.cN -= this.cP;
            ++n2;
        }
    }

    private void a(int n2, String string) {
        if (this.cX < 3) {
            int n3 = 0;
            while (n3 < GameScreen.G.size()) {
                do do_ = (TextBox)GameScreen.G.elementAt(n3);
                if (do_.df.a == n2) {
                    do_.a(string);
                }
                ++n3;
            }
        }
    }

    private void ar() {
        this.A = 19;
        this.c(0);
        UIPanel g2 = this;
        SettingsManager.a();
        SettingsManager.UIPanel();
        g2.O = H.length;
        g2.aD = 24;
        g2.ak = main.GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void F(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < H.length) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.a(en2, H[n2], this.ae + 25, n4 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void as() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                SettingsManager.a().IActionListener();
                return;
            }
            case 1: {
                SettingsManager.a().e();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                SettingsManager.a().d();
                return;
            }
            case 4: {
                SettingsManager.a().c();
            }
        }
    }

    private void at() {
        this.A = 20;
        this.c(0);
        UIPanel g2 = this;
        if (ResourceUtil.c == 5) {
            ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae};
            if (GameScreen.bk) {
                ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.o};
            }
        } else {
            ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.fT};
            if (GameScreen.bk) {
                ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.fT, GameStrings.o};
            }
            if ((ResourceUtil.c == 2 || ResourceUtil.c == 7) && GameStrings.fB != 2) {
                ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.fT};
                if (GameScreen.bk) {
                    ba = new String[]{GameStrings.fX, GameStrings.bN, GameStrings.bO, GameStrings.ae, GameStrings.fT, GameStrings.o};
                }
            }
        }
        g2.O = ba.length;
        g2.aD = 24;
        g2.ak = main.GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.UIPanel = g2.f = g2.aJ[g2.B];
        if (g2.UIPanel < 0) {
            g2.f = 0;
            g2.UIPanel = 0;
        }
        if (g2.UIPanel > g2.aI) {
            g2.UIPanel = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void G(MGraphics en2) {
        en2.e(this.ae, this.GameWorld, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < ba.length) {
            int n3 = this.ae;
            int n4 = this.GameWorld + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.GameWorld + this.ah && n4 - this.g >= this.GameWorld - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.a(en2, ba[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void au() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                main.GameCanvas.h();
                if (this.o == null) {
                    this.o = new cq();
                    this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                    this.o.a();
                    this.o.c = main.GameCanvas.G;
                }
                this.o.GameCanvas.a("");
                this.o.h = GameStrings.fY;
                this.o.GameCanvas.i = GameStrings.fY;
                this.o.UIPanel = "";
                this.o.IActionListener = true;
                this.o.GameCanvas.e = true;
                this.o.GameCanvas.c(1);
                if (!main.GameCanvas.e) break;
                this.o.GameCanvas.a();
                return;
            }
            case 1: {
                GameService.a().a((byte)0, -1);
                bp.a();
                return;
            }
            case 2: {
                GameService.a().IActionListener((byte)0, -1);
                bp.a();
                return;
            }
            case 3: {
                this.l();
                if (this.o != null) break;
                this.o = new cq();
                this.o.a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
                this.o.a();
                this.o.c = main.GameCanvas.G;
                return;
            }
            case 4: {
                if (GameStrings.fB == 2) {
                    Object object = "http://dragonball.indonaga.com/coda/?username=" + main.GameCanvas.I.GameCanvas.d();
                    this.z();
                    try {
                        GameMidlet.f.platformRequest((String)object);
                        return;
                    }
                    catch (Exception exception) {
                        object = exception;
                        exception.toString();
                        return;
                    }
                }
                this.z();
                if (GameWorld.e().aD.c <= 10) {
                    main.GameCanvas.a(GameStrings.fU);
                    return;
                }
                GameCanvas.a().IActionListener();
                return;
            }
            case 5: {
                this.L();
            }
        }
    }

    public final void E() {
        this.A = 25;
        this.c(0);
        this.RMSManager();
        this.B = 0;
    }

    private void RMSManager() {
        this.aD = 24;
        this.O = GameWorld.e().aK[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.GameCanvas.e ? -1 : 0;
    }

    public final boolean F() {
        return this.A == 1;
    }

    private void e(int n2) {
        try {
            this.bC.t = Integer.parseInt(this.o.GameCanvas.d());
        }
        catch (Exception exception) {
            main.GameCanvas.a(GameStrings.ee);
            this.o.IActionListener = false;
            return;
        }
        Command de2 = new Command(GameStrings.bn, this, n2 == 0 ? 11000 : 11001, null);
        Command de3 = new Command(GameStrings.bo, this, 11002, null);
        main.GameCanvas.a(GameStrings.f, de2, de3);
    }

    private static int f(int n2) {
        switch (n2) {
            case 4: {
                return 1269146;
            }
            case 1: {
                return 2786816;
            }
            case 5: {
                return 13279744;
            }
            case 3: {
                return 12537346;
            }
            case 2: {
                return 7078041;
            }
            case 6: {
                return 0xB10000;
            }
        }
        return -1;
    }

    private static byte UIPanel(int n2) {
        if (n2 < 0) {
            return 0;
        }
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return 0;
            }
            case 9: {
                return 4;
            }
            case 10: {
                return 1;
            }
            case 11: {
                return 5;
            }
            case 12: {
                return 3;
            }
            case 13: {
                return 2;
            }
        }
        return 6;
    }

    private static mFont h(int n2) {
        mFont di2 = mFont.k;
        switch (n2) {
            case -1: {
                di2 = mFont.k;
                break;
            }
            case 0: {
                di2 = mFont.f;
                break;
            }
            case 1: {
                di2 = mFont.h;
                break;
            }
            case 2: {
                di2 = mFont.IActionListener;
                break;
            }
            case 3: {
                di2 = mFont.GameScreen;
                break;
            }
            case 4: {
                di2 = mFont.r;
                break;
            }
            case 5: {
                di2 = mFont.q;
                break;
            }
            case 7: {
                di2 = mFont.a;
                break;
            }
            case 8: {
                di2 = mFont.d;
            }
        }
        return di2;
    }

    private void a(MGraphics en2, int n2, int n3, int n4, int n5) {
        if (n2 == 34) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ResourceUtil.IActionListener("/mainImage/o_0.png");
            }
            if (this.dk != null) {
                en2.a(this.dk, n3, n4 + n5 - this.dk.getHeight(), 0);
                return;
            }
            this.dk = ResourceUtil.IActionListener("/mainImage/o_1.png");
            return;
        }
        if (n2 == 35) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ResourceUtil.IActionListener("/mainImage/o_0.png");
            }
            if (this.dl != null) {
                en2.a(this.dl, n3, n4 + n5 - this.dl.getHeight(), 0);
                return;
            }
            this.dl = ResourceUtil.IActionListener("/mainImage/o_2.png");
            return;
        }
        if (n2 == 36) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ResourceUtil.IActionListener("/mainImage/o_0.png");
            }
            if (this.dm != null) {
                en2.a(this.dm, n3, n4 + n5 - this.dm.getHeight(), 0);
                return;
            }
            this.dm = ResourceUtil.IActionListener("/mainImage/o_3.png");
        }
    }

    private static void a(MGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 == 102 && n3 > ae.s) {
            n2 = UIPanel.UIPanel(n3);
            int n8 = n4;
            int n9 = n5;
            MGraphics en3 = en2;
            n6 = n2;
            n5 = n3 -= ae.s;
            n4 = n7;
            n3 = 34;
            n2 = n9;
            int n10 = n8;
            try {
                int n11 = (n3 << 1) + (n4 << 1);
                n11 /= n5;
                dh = BaseCanvas.length;
                if (n5 > 4) {
                    dh = 2;
                }
                int n12 = 0;
                while (n12 < n5) {
                    int n13 = 0;
                    while (n13 < dh) {
                        int n14;
                        int n15 = n14 = BaseCanvas[n13] > 1 ? (BaseCanvas[n13] >> 1) + 1 : 1;
                        int n16 = n4;
                        int n17 = n3;
                        int n18 = main.GameCanvas.w - (n13 << 2);
                        int n19 = n11 * n12;
                        int n20 = n10 + ((n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1))) >= 0 && n19 < n17 ? n19 % n17 : (n17 <= n19 && n19 < n17 + n16 ? n17 - n15 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n17 - (n19 - n16) % n17 - n15 : 0)));
                        n15 = n14;
                        n16 = n4;
                        n17 = n3;
                        n18 = main.GameCanvas.w - (n13 << 2);
                        n19 = n11 * n12;
                        n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1));
                        n14 = n2 + (n19 >= 0 && n19 < n17 ? 0 : (n17 <= n19 && n19 < n17 + n16 ? n19 % n17 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n16 - n15 : n16 - (n19 - (n17 << 1)) % n16 - n15)));
                        en3.a(mFont[n6][n13]);
                        en3.d(n20, n14, BaseCanvas[n13], BaseCanvas[n13]);
                        ++n13;
                    }
                    ++n12;
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static mFont IActionListener(int n2, int n3) {
        switch (n2) {
            case 0: {
                return mFont.c;
            }
            case 1: {
                return mFont.h;
            }
            case 3: {
                return mFont.F;
            }
            case 4: {
                return mFont.IActionListener;
            }
            case 5: {
                return mFont.d;
            }
            case 6: {
                return mFont.a;
            }
            case 7: {
                return mFont.f;
            }
        }
        return mFont.c;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(int n2, int n3, h[] hArray) {
        void var2_4;
        void var1_3;
        int n4 = n2 - 1 + var1_3 * 20;
        boolean bl2 = var1_3 == false ? n4 < ((void)var2_4).length : false;
        return bl2;
    }

    private static int c(int n2, int n3) {
        n2 = n2 - 1 + n3 * 20;
        return n2;
    }

    private static int IActionListener(int n2, int n3, h[] hArray) {
        n2 = n2 - 1 + n3 * 20;
        return n2 -= hArray.length;
    }

    private boolean GameStrings() {
        return this.A == 0 && this.B == 1 || this.A == 7 && this.B == 0;
    }

    private void ax() {
        if (this.ak >= 0) {
            if (main.GameCanvas.i[4]) {
                --this.bO;
                if (this.bO < 0) {
                    this.bO = 0;
                    if (main.GameCanvas.W) {
                        main.GameCanvas.W = false;
                        main.GameCanvas.G.ak = 0;
                        return;
                    }
                }
            } else if (main.GameCanvas.i[6]) {
                ++this.bO;
                if (this.bO > this.dn - 1) {
                    this.bO = this.dn - 1;
                    if (main.GameCanvas.H != null) {
                        main.GameCanvas.W = true;
                        main.GameCanvas.H.ak = 0;
                    }
                }
            }
        }
    }

    private void ay() {
        this.O();
        if (this.ak == 0) {
            this.ax();
        }
    }

    private int i(int n2) {
        int n3 = 20;
        int n4 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        this.dn = (byte)n4;
        if (this.bO > n4 - 1) {
            this.bO = n4 - 1;
        }
        if (n2 % 20 > 0 && this.bO == n4 - 1) {
            n3 = n2 % 20;
        }
        return ++n3;
    }

    private void a(int n2, boolean bl2) {
        n2 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        int n3 = this.ae;
        this.bO = (main.GameCanvas.GameScreen - n3) / this.aF;
        if (this.bO > n2 - 1) {
            this.bO = n2 - 1;
        }
        if (main.GameCanvas.GameScreen < n3) {
            this.bO = 0;
        }
        this.b(bl2);
    }
}

