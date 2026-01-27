/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameMidlet;
import main.GameCanvas;
public final class g
implements b,
bx {
    public boolean LoginScreen;
    public int b;
    public int c;
    public int d;
    public int e;
    private int aD;
    private int aE;
    private int aF;
    public int f;
    public int g;
    private int aG;
    private int aH;
    private int aI;
    private int[] aJ;
    private int aK;
    public int Item;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    public static Image i;
    private static Image aQ;
    public dr j;
    public MyVector k = new MyVector("");
    private int aR;
    public int Res;
    private boolean aS;
    public boolean m;
    private boolean aT;
    public String n;
    public cq o;
    public static String GameScreen;
    public static short q;
    public static Image r;
    public static Image SessionReceiver;
    public static Image MyHashtable;
    public static Image u;
    public static Image v;
    public static Image w;
    public static Image x;
    public static Image Message;
    public static Image z;
    private static Image aU;
    private static Image aV;
    private de aW = new de(T.bw, 0);
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
    private static String[][] bd;
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
    private static byte ImageLoader;
    private static byte bo;
    public int N;
    public int O;
    private int[] bp;
    private static int[] bq;
    private static int[] Session;
    private static int[] ServerListScreen;
    private static int[] GameService;
    private static int[] bu;
    private static int[] bv;
    private static int[] bw;
    private static int[] bx;
    private static int[] by;
    private static int[][] bz;
    private static int[][] bA;
    private static int[][] bB;
    private Item bC;
    private eh bD;
    private cb bE;
    private e bF;
    public eh[] P;
    public MyVector Q;
    public MyVector R;
    private MyVector bG;
    public MyVector S;
    public MyVector T;
    public MyVector U;
    public MyVector V;
    public MyVector W;
    public MyVector X;
    public MyVector Y;
    public MyVector Z;
    public de Mob;
    public static int ab;
    private int bH;
    public Char MessageHandler;
    private boolean bI;
    private int bJ;
    public static boolean ad;
    public int ae;
    public int Char;
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
    private int Npc;
    private int cd;
    private boolean ItemMap;
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
    private Item cr;
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
    public static boolean ImageCache;
    private boolean cD;
    private int cE;
    public static MyVector at;
    private static String[] cF;
    public boolean au;
    private int cG;
    private Char cH;
    private boolean cI;
    private boolean cJ;
    private boolean cK;
    private int cL;
    public byte RMS;
    public int T;
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
    private boolean db;
    private boolean dc;
    private boolean dd;
    public boolean az;
    public short aA;
    private short de;
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
    private boolean cfr_renamed_0;

    static {
        aQ = Res.loadImage("/img/map" + bv.r + ".png");
        i = Res.loadImage("/mainImage/myTexture2dbantay.png");
        Res.loadImage("/mainImage/myTexture2dbtX.png");
        w = Res.loadImage("/mainImage/myTexture2dimgMoney.png");
        Message = Res.loadImage("/mainImage/myTexture2dimgDiamond.png");
        z = Res.loadImage("/mainImage/luongkhoa.png");
        aU = Res.loadImage("/mainImage/myTexture2dup.png");
        aV = Res.loadImage("/mainImage/myTexture2ddown.png");
        r = Res.loadImage("/mainImage/star.png");
        SessionReceiver = Res.loadImage("/mainImage/starE.png");
        MyHashtable = Res.loadImage("/mainImage/star8.png");
        Res.loadImage("/mainImage/star9.png");
        u = Res.loadImage("/mainImage/starCH.png");
        v = Res.loadImage("/mainImage/new.png");
        x = Res.loadImage("/mainImage/ticket12.png");
        G = new String[]{T.bS, T.bR, T.aG, T.bQ, T.aq, T.bU, T.T};
        H = new String[]{GameCanvas.aj ? T.fC : T.fD, T.bV, T.H, mGraphics.b > 1 ? T.bZ : T.bY};
        ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.fT};
        Screen = new String[]{T.n};
        I = 0;
        bc = new String[][]{T.ItemMap, T.cf};
        bd = new String[][]{T.cg, T.cf};
        be = new String[][]{T.ck};
        bf = new String[][]{T.ch};
        bg = new String[][]{T.cf, T.ci, T.cj};
        bh = T.aP;
        bi = 0;
        bj = 1;
        bk = (byte)3;
        bl = (byte)4;
        bm = (byte)5;
        ImageLoader = (byte)6;
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
        Session = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
        ServerListScreen = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
        GameService = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
        bu = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
        bv = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
        bw = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
        bx = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
        by = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
        bz = new int[][]{bq, GameService, bw};
        bA = new int[][]{Session, bu, bx};
        bB = new int[][]{ServerListScreen, bv, by};
        ab = 240;
        ad = false;
        co = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
        int[] nArray2 = new int[]{2327248, 8982199, 0xFF0606};
        int[] nArray3 = new int[]{4583423, 0xFF1CFF, 0xFF0C0C};
        ar = "";
        ImageCache = true;
        at = new MyVector("");
        BaseCanvas = new int[]{2, 1, 1};
        dh = 1;
        mFont = new int[][]{{0xFFFFFF, 0xE4E4E5, 13487823, 0xB2B2B3, 0x939494, 0x787878}, {61952, 58624, 52224, 45824, 39168, 32768}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {37119, 33509, 28108, 24499, 21145, 17536}, {0xFFFC00, 15063040, 0xC0CC00, 11776256, 0x999000, 8290304}, {0xFF0000, 0xE50000, 0xCC0000, 0xB30000, 0x990000, 0x800000}};
    }

    public g() {
        String[][][] stringArrayArray = new String[27][][];
        stringArrayArray[2] = bc;
        stringArrayArray[3] = be;
        stringArrayArray[4] = bf;
        stringArrayArray[7] = new String[][]{{""}};
        stringArrayArray[8] = new String[][]{{""}};
        stringArrayArray[9] = new String[][]{{""}};
        stringArrayArray[10] = new String[][]{{""}};
        stringArrayArray[11] = new String[][]{{""}};
        stringArrayArray[12] = bd;
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
        this.bG = new MyVector("");
        this.S = new MyVector("");
        this.T = new MyVector("");
        this.U = new MyVector("");
        this.V = new MyVector("");
        this.W = new MyVector("");
        this.X = new MyVector("");
        this.Y = new MyVector("");
        this.Z = new MyVector("");
        this.bH = 0;
        this.bJ = -1;
        this.bM = 0;
        this.aj = false;
        this.bS = new int[3];
        this.bY = 0;
        this.bZ = false;
        this.ca = GameCanvas.MyHashtable + this.aL;
        this.cb = GameCanvas.u + this.aM;
        this.Npc = -1;
        this.cd = -1;
        this.cf = -1;
        this.cg = new String[][]{T.dk, T.dj};
        this.ch = "";
        this.ao = "";
        this.cm = new String[]{T.MyHashtable, T.SessionReceiver, T.r, T.v, T.gl, T.gm};
        this.cn = 0;
        this.cp = new int[]{43520, 14743570, 0xD80000};
        this.cq = 0;
        this.cr = null;
        this.cu = 140;
        this.cv = -1;
        this.cx = 0;
        this.cy = 0;
        this.RMS = (byte)-1;
        this.dc = true;
        this.dd = false;
        this.az = true;
        this.dn = 0;
        this.cfr_renamed_0 = false;
        this.LoginScreen();
        this.Mob = new de("", this, 1003, null);
        this.Mob.g = Res.loadImage("/mainImage/myTexture2dbtX.png");
        this.Mob.q = true;
        this.bC = null;
    }

    public final void methodLoginScreen() {
        this.ca = GameCanvas.MyHashtable + this.aL;
        this.cb = GameCanvas.u + this.aM;
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
            if (bv.Res == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int H() {
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (bv.Res == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int I() {
        if (Char.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (GameScreen.ad[Char.e().aD.LoginScreen] == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int J() {
        if (Char.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (GameScreen.ad[Char.e().aD.LoginScreen] == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private void c(int n2) {
        this.bJ = -1;
        this.d = ab;
        this.e = GameCanvas.B;
        this.b = 0;
        this.c = 0;
        this.aD = 24;
        this.bH = n2;
        if (n2 == 0) {
            this.ae = 2;
            this.Char = 80;
            this.ag = this.d - 4;
            this.ah = this.e - 96;
            this.Item = this.ag;
            this.aK = 0;
            this.b = 0;
        } else if (n2 == 1) {
            this.ag = this.d - 4;
            this.ae = GameCanvas.A - this.ag;
            this.Char = 80;
            this.ah = this.e - 96;
            this.b = this.ae - 2;
            this.Item = -(GameCanvas.A + this.d);
            this.aK = GameCanvas.A - this.d;
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
            this.bp[n2] = GameCanvas.e ? -1 : 0;
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

    public final void b() {
        this.A = 14;
        this.c(0);
        g g2 = this;
        this.aD = 24;
        g2.O = g2.E.length;
        g2.aI = g2.O * g2.aD - g2.ah;
        g2.f = 0;
        g2.g = 0;
        g2.ak = GameCanvas.e ? -1 : 0;
        this.aK = 0;
        this.Item = 0;
    }

    private void K() {
        GameScreen.j();
        if (GameScreen.f()) {
            return;
        }
        if (!ImageCache) {
            return;
        }
        if (v.LoginScreen(2, 0)) {
            v.f = true;
            GameScreen.aD.LoginScreen(T.cq, 0);
        }
        if (v.LoginScreen(3, 0)) {
            v.Item = true;
        }
        this.A = 4;
        this.aY = this.M[this.A];
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.aK = 0;
        this.Item = 0;
        g g2 = this;
        if (ImageCache) {
            if (bv.SessionReceiver != bv.r) {
                ds.c("LOAD TAM HINH");
                if (mGraphics.b == 1) {
                    bl.b = null;
                    GameScreen.GameService = false;
                    System.gc();
                }
                aQ = Res.loadImageFromRMS("/img/map" + bv.r + ".png");
                bv.SessionReceiver = bv.r;
            }
            g2.aL = g.G() - g2.ag / 2;
            g2.aM = g.H() + g2.Char - (g2.Char + g2.ah / 2);
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
                if (bv.Res == bz[bv.r][n2]) {
                    g2.cB = bA[bv.r][n2] + g2.ae;
                    g2.cC = bB[bv.r][n2] + g2.Char + 5;
                    break;
                }
                ++n2;
            }
            g2.cz = g.G() + g2.ae;
            g2.cA = g.H() + g2.Char;
            g.I();
            g.J();
        }
    }

    public final void c() {
        this.O = Char.e().aE.length;
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
        this.ak = GameCanvas.e ? -1 : 0;
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
        this.O = Char.e().aJ[4].length;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    public final void f() {
        this.A = 7;
        this.c(1);
        this.b(true);
        this.B = 0;
    }

    public final void methodLoginScreen(r r2) {
        this.bG.insertElementAt(r2, 0);
        if (this.bG.size() > 20) {
            this.bG.removeElementAt(this.bG.size() - 1);
        }
    }

    public final void g() {
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    public final void methodItem() {
        this.A = 18;
        this.c(0);
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
        g g2 = this;
        this.O = g2.Y.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.Item = 0;
    }

    public final void methodLoginScreen(Char af2) {
        this.A = 10;
        this.c(0);
        this.g();
        this.MessageHandler = af2;
    }

    public final void i() {
        this.A = 11;
        this.c(0);
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
        this.k();
    }

    public final void j() {
        this.A = 16;
        this.c(0);
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
        g g2 = this;
        this.O = g2.X.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.Item = 0;
    }

    public final void methodLoginScreen(byte by2) {
        this.A = 15;
        this.c(0);
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
        g g2 = this;
        this.O = g2.W.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.Item = 0;
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
        this.Item = 0;
    }

    public final void Res() {
        this.A = 8;
        this.c(0);
        g g2 = this;
        this.aD = 24;
        g2.x();
        g2.ak = GameCanvas.e ? -1 : 0;
        this.B = 0;
    }

    public final void methodLoginScreen(int n2) {
        this.A = 1;
        this.c(0);
        this.Message();
        this.B = 0;
        this.bJ = n2;
    }

    public final void m() {
        this.A = 2;
        bc = GameCanvas.A > 2 * ab ? new String[][]{T.ItemMap} : new String[][]{T.ItemMap, T.cf};
        this.M[2] = bc;
        this.c(0);
        if (this.B == 0) {
            this.T();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (GameCanvas.A > 2 * ab) {
            GameCanvas.H = new g();
            GameCanvas.H.M[7] = new String[][]{{""}};
            GameCanvas.H.f();
            GameCanvas.H.SessionReceiver();
        }
    }

    public final void n() {
        this.A = 12;
        bd = GameCanvas.A > 2 * ab ? new String[][]{T.cg} : new String[][]{T.cg, T.cf};
        this.M[this.A] = bd;
        this.c(0);
        if (this.B == 0) {
            this.o();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (GameCanvas.A > 2 * ab) {
            GameCanvas.H = new g();
            GameCanvas.H.M[7] = new String[][]{{""}};
            GameCanvas.H.f();
            GameCanvas.H.SessionReceiver();
        }
        this.RMS = (byte)-1;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void L() {
        this.A = 22;
        this.c(0);
        g g2 = this;
        this.O = Screen.length;
        g2.aD = 24;
        g2.ak = GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.Item = 0;
    }

    public final void GameScreen() {
        this.A = 21;
        bh = GameCanvas.H != null ? T.aQ : T.aP;
        this.M[21] = bh;
        this.cm = Char.e().K == 1 ? new String[]{T.MyHashtable, T.SessionReceiver, T.r, T.v, T.gl, T.gm} : new String[]{T.MyHashtable, T.SessionReceiver, T.r, T.v, T.gl};
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
        this.Item = 0;
    }

    private void b(Item h2) {
        String string;
        block37: {
            int n2;
            int n3;
            this.ai = new ae();
            string = "";
            if (h2.b.c != Char.e().K) {
                if (h2.b.c == 0) {
                    string = String.valueOf(string) + "\n|7|1|" + T.cr;
                } else if (h2.b.c == 1) {
                    string = String.valueOf(string) + "\n|7|1|" + T.cs;
                } else if (h2.b.c == 2) {
                    string = String.valueOf(string) + "\n|7|1|" + T.ct;
                }
            }
            String string2 = "";
            if (h2.LoginScreen != null) {
                n3 = 0;
                while (n3 < h2.LoginScreen.length) {
                    if (h2.LoginScreen[n3].c.LoginScreen == 72) {
                        string2 = " [+" + h2.LoginScreen[n3].LoginScreen + "]";
                    }
                    ++n3;
                }
            }
            n3 = 0;
            if (h2.LoginScreen != null) {
                n2 = 0;
                while (n2 < h2.LoginScreen.length) {
                    if (h2.LoginScreen[n2].c.LoginScreen == 41) {
                        n3 = 1;
                        if (h2.LoginScreen[n2].LoginScreen == 1) {
                            string = String.valueOf(string) + "|0|1|" + h2.b.d + string2;
                        }
                        if (h2.LoginScreen[n2].LoginScreen == 2) {
                            string = String.valueOf(string) + "|2|1|" + h2.b.d + string2;
                        }
                        if (h2.LoginScreen[n2].LoginScreen == 3) {
                            string = String.valueOf(string) + "|8|1|" + h2.b.d + string2;
                        }
                        if (h2.LoginScreen[n2].LoginScreen == 4) {
                            string = String.valueOf(string) + "|7|1|" + h2.b.d + string2;
                        }
                    }
                    ++n2;
                }
            }
            if (n3 == 0) {
                string = String.valueOf(string) + "|0|1|" + h2.b.d + string2;
            }
            if (h2.LoginScreen == null) break block37;
            n2 = 0;
            while (n2 < h2.LoginScreen.length) {
                block40: {
                    block39: {
                        Object object;
                        block38: {
                            boolean bl2 = h2.LoginScreen[n2].c.b.startsWith("$");
                            if (!bl2) break block38;
                            object = h2.LoginScreen[n2];
                            object = ai.LoginScreen(((ee)object).c.b, "$", "");
                            if (h2.LoginScreen[n2].LoginScreen == 1) {
                                string = String.valueOf(string) + "\n|1|1|" + (String)object;
                            }
                            if (h2.LoginScreen[n2].LoginScreen == 0) {
                                string = String.valueOf(string) + "\n|0|1|" + (String)object;
                            }
                            break block39;
                        }
                        object = h2.LoginScreen[n2].LoginScreen();
                        if (((String)object).equals("")) break block39;
                        if (h2.LoginScreen[n2].c.LoginScreen == 72) break block40;
                        if (h2.LoginScreen[n2].c.LoginScreen == 102) {
                            this.ai.o = (byte)h2.LoginScreen[n2].LoginScreen;
                        } else if (h2.LoginScreen[n2].c.LoginScreen == 107) {
                            this.ai.GameScreen = (byte)h2.LoginScreen[n2].LoginScreen;
                        } else {
                            string = h2.LoginScreen[n2].c.c > 0 ? String.valueOf(string) + "\n|" + h2.LoginScreen[n2].c.c + "|1|" + (String)object : String.valueOf(string) + "\n|1|1|" + (String)object;
                        }
                    }
                    if (h2.LoginScreen[n2].c.LoginScreen == 228 && h2.LoginScreen[n2].LoginScreen > 7) {
                        int n4 = 0;
                        while (n4 < h2.LoginScreen[n2].LoginScreen - 7) {
                            this.ai.r[n4 + 7] = true;
                            ++n4;
                        }
                    }
                }
                ++n2;
            }
        }
        if (this.bC.b.i > 1) {
            String string3 = String.valueOf(T.cu) + ": " + this.bC.b.i;
            if ((long)this.bC.b.i > Char.e().Message) {
                string = String.valueOf(string) + "\n|3|1|" + string3;
                string = String.valueOf(string) + "\n|3|1|" + T.cv + ": " + Char.e().Message;
            } else {
                string = String.valueOf(string) + "\n|6|1|" + string3;
            }
        } else {
            string = String.valueOf(string) + "\n|6|1|";
        }
        this.bC.A = this.LoginScreen(this.bC);
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|6|" + h2.b.e;
        if (!h2.z.equals("")) {
            if (!h2.b.e.equals("")) {
                string = String.valueOf(string) + "\n--";
            }
            string = String.valueOf(string) + "\n|2|" + h2.z;
        }
        if (this.ai.GameScreen > 0) {
            string = String.valueOf(string) + "\n\n";
        }
        this.LoginScreen(this.ai, string);
        this.bK = h2.b.f;
        this.bL = null;
        this.cH = null;
    }

    private void methodLoginScreen(ae ae2, String string) {
        ae2.u = false;
        ae2.LoginScreen = 180;
        ae2.e = 3 + this.b - (this.b == 0 ? 0 : ds.g(ae2.LoginScreen - this.d) + 8);
        ae2.d = mFont.GameScreen.LoginScreen(string, ae2.LoginScreen - 10);
        ae2.b = 10000000;
        ae2.i = null;
        ae2.c = 7;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > GameCanvas.B - 80) {
            ae2.g = GameCanvas.B - 80;
            ae2.Item = ae2.d.length * 12 - ae2.g + 17;
            if (ae2.Item < 0) {
                ae2.Item = 0;
            }
            ae.v = 0;
            ae2.u = true;
        }
        ae2.f = GameCanvas.F.d - ae2.g;
        while (ae2.f < 10) {
            ++ae2.f;
            ++GameCanvas.F.d;
        }
        ae2.MyHashtable = 10;
    }

    private void methodLoginScreen(cb cb2) {
        this.ai = new ae();
        String string = "|0|" + cb2.d;
        string = String.valueOf(string) + "\n|1|" + e.LoginScreen(cb2.Item);
        int n2 = 0;
        while (n2 < this.R.size()) {
            e e2 = (e)this.R.elementAt(n2);
            if (cb2.c == e2.LoginScreen) {
                string = String.valueOf(string) + "\n|5|" + T.cS + ": " + e2.Res;
                string = String.valueOf(string) + "\n|5|" + T.cT + ": " + e2.k;
                string = String.valueOf(string) + "\n|4|" + T.cV + ": " + e2.i + T.cY;
                string = String.valueOf(string) + "\n|4|" + T.cW + ": " + e2.j + T.cY;
                this.bL = new int[]{e2.b, e2.d, e2.e};
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
        if (cb2.b == 1) {
            string = String.valueOf(string) + "\n|6|" + T.cZ + " " + cb2.i + "/" + cb2.j;
        }
        this.LoginScreen(this.ai, string);
        this.cH = null;
    }

    private void methodLoginScreen(e e2) {
        String string = "|0|1|" + e2.f;
        String string2 = "\n|2|1|";
        if (e2.g == 0) {
            string2 = "\n|7|1|";
        }
        if (e2.g == 1) {
            string2 = "\n|1|1|";
        }
        if (e2.g == 2) {
            string2 = "\n|0|1|";
        }
        string = String.valueOf(string) + string2 + e.LoginScreen(e2.g);
        string = String.valueOf(string) + "\n|2|1|" + T.da + ": " + e2.Item;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + T.cS + ": " + e2.Res;
        string = String.valueOf(string) + "\n|5|" + T.cT + ": " + e2.k;
        string = String.valueOf(string) + "\n|4|" + T.cV + ": " + e2.i + T.cY;
        string = String.valueOf(string) + "\n|4|" + T.cW + ": " + e2.j + T.cY;
        string = String.valueOf(string) + "\n|6|" + T.db + ": " + e2.m;
        this.ai = new ae();
        this.LoginScreen(this.ai, string);
        this.bL = new int[]{e2.b, e2.d, e2.e};
        this.bC = null;
        this.cH = null;
    }

    private void methodLoginScreen(eh eh2) {
        try {
            String string = "|0|" + eh2.c;
            String[] stringArray = mFont.r.LoginScreen(eh2.d, this.ag - 60);
            int n2 = 0;
            while (n2 < stringArray.length) {
                string = String.valueOf(string) + "\n|2|" + stringArray[n2];
                ++n2;
            }
            string = String.valueOf(string) + "\n--";
            string = String.valueOf(string) + "\n|7|" + T.dc + ": " + eh2.i;
            string = String.valueOf(string) + "\n|1|" + T.de + ": " + eh2.f;
            string = String.valueOf(string) + "\n|4|" + T.df + ": " + eh2.g + "/" + eh2.Item;
            string = String.valueOf(string) + "\n|4|" + T.cfr_renamed_0 + ": " + eh2.j;
            string = String.valueOf(string) + "\n|4|" + T.dp + ": " + ai.LoginScreen(eh2.e);
            this.ai = new ae();
            this.LoginScreen(this.ai, string);
            this.bK = ak.LoginScreen((short)((short)eh2.b)).c[0];
            this.bC = null;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void methodLoginScreen(et et2, bf bf2, bf bf3) {
        String string = "|0|" + et2.b;
        int n2 = 0;
        while (n2 < et2.g.length) {
            string = String.valueOf(string) + "\n|4|" + et2.g[n2];
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        if (bf2 != null) {
            string = String.valueOf(string) + "\n|2|" + T.fd + ": " + bf2.c;
            string = String.valueOf(string) + "\n|5|" + ai.LoginScreen(et2.i, "#", String.valueOf(bf2.k));
            string = String.valueOf(string) + "\n|5|" + T.fe + bf2.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|5|" + T.ff + ": " + bf2.LoginScreen() + "SessionReceiver";
            string = String.valueOf(string) + "\n--";
            if (bf2.c == et2.c) {
                string = String.valueOf(string) + "\n|0|" + T.fg;
            } else {
                if (!bf2.LoginScreen.c()) {
                    string = String.valueOf(string) + "\n|1|" + T.fh + ds.LoginScreen(bf3.d) + " " + T.fi;
                }
                string = String.valueOf(string) + "\n|4|" + ai.LoginScreen(et2.i, "#", String.valueOf(bf3.k));
            }
        } else {
            string = String.valueOf(string) + "\n|2|" + T.fj;
            string = String.valueOf(string) + "\n|1|" + T.fk + ds.LoginScreen(bf3.d) + " " + T.fi;
            string = String.valueOf(string) + "\n|4|" + ai.LoginScreen(et2.i, "#", String.valueOf(bf3.k));
            string = String.valueOf(string) + "\n|4|" + T.fe + bf3.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|4|" + T.ff + ": " + bf3.LoginScreen() + "SessionReceiver";
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.ai = new ae();
        this.LoginScreen(this.ai, string);
        this.bK = 0;
    }

    public final void SessionReceiver() {
        if (GameCanvas.e) {
            this.Mob.j = 156;
            this.Mob.k = 3;
        } else {
            this.Mob.j = GameCanvas.A - 19;
            this.Mob.k = GameCanvas.B - 19;
        }
        this.Mob.f = false;
        ae.m = null;
        bp.c();
        this.bM = 20;
        this.LoginScreen = true;
        this.cD = false;
        bu.LoginScreen();
        if (this.F()) {
            Char.e().W();
        }
    }

    public final void MyHashtable() {
        if (this.o != null && this.o.b) {
            if (this.o.d != null && (GameCanvas.i[12] || Screen.LoginScreen(this.o.d)) && this.o.d != null) {
                this.o.d.LoginScreen();
            }
            if (this.o.e != null && (GameCanvas.i[13] || Screen.LoginScreen(this.o.e)) && this.o.e != null) {
                this.o.e.LoginScreen();
            }
            if (this.o.f != null && (GameCanvas.i[5] || Screen.LoginScreen(this.o.f)) && this.o.f != null) {
                this.o.f.LoginScreen();
            }
            if (this.o.b && GameCanvas.ag != 0) {
                this.o.LoginScreen(GameCanvas.ag);
                GameCanvas.ag = 0;
            }
            GameCanvas.resetKeys();
            GameCanvas.clearKeyHold();
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
                                if (this.o != null && this.o.b) {
                                    return;
                                }
                                if (!GameCanvas.G.az) {
                                    return;
                                }
                                if (bp.LoginScreen) {
                                    return;
                                }
                                if (this.j == null || !this.j.k) break block143;
                                var1_1 = this.j;
                                if (var1_1.c != null && (GameCanvas.i[12] || Screen.LoginScreen(var1_1.c))) {
                                    var1_1.c.LoginScreen();
                                }
                                if (var1_1.d != null && (GameCanvas.i[13] || Screen.LoginScreen(var1_1.d))) {
                                    var1_1.d.LoginScreen();
                                }
                                if (var1_1.Res) break block144;
                                if (dr.f == null) break block145;
                                if (GameCanvas.e) {
                                    dr.f.LoginScreen();
                                    var1_1.n = dr.f.n;
                                }
                                if (GameCanvas.i[2]) {
                                    GameCanvas.i[2] = false;
                                    --var1_1.n;
                                    if (var1_1.n < 0) {
                                        var1_1.n = var1_1.e - 1;
                                    }
                                    dr.f.LoginScreen(var1_1.n * dr.f.o);
                                }
                                if (GameCanvas.i[8]) {
                                    GameCanvas.i[8] = false;
                                    ++var1_1.n;
                                    if (var1_1.n > var1_1.e - 1) {
                                        var1_1.n = 0;
                                    }
                                    dr.f.LoginScreen(var1_1.n * dr.f.o);
                                }
                                if (var1_1.n != -1) {
                                    var1_1.o = var1_1.n;
                                }
                            }
                            GameCanvas.resetKeys();
                            GameCanvas.clearKeyHold();
                        }
                        return;
                    }
                    if (this.cD) {
                        return;
                    }
                    if (!this.LoginScreen) {
                        return;
                    }
                    if (this.Mob.c()) {
                        this.Mob.LoginScreen();
                        return;
                    }
                    if (GameCanvas.i[13]) {
                        if (this.A == 4) {
                            this.q();
                            this.aK = 0;
                            this.Item = 0;
                        } else {
                            this.A();
                            return;
                        }
                    }
                    if (GameCanvas.i[12] || GameCanvas.i[5]) {
                        if (this.aW.e > 0) {
                            this.LoginScreen(this.aW.e, this.aW.o);
                        } else {
                            this.bV = 2;
                        }
                    }
                    if (this.equals(GameCanvas.G) && GameCanvas.H == null && GameCanvas.m && !GameCanvas.b(this.b, 0, this.d, this.e) && !this.bT) {
                        this.A();
                        return;
                    }
                    if (this.bP) break block146;
                    var1_2 = this;
                    if (var1_2.ci != null && var1_2.ci.m || var1_2.bT) break block146;
                    var2_4 = var1_2.B;
                    var4_11 = var1_2;
                    if (var4_11.dn <= 0) break; // GOTO lbl-1000
                    if (var4_11.aY.length <= 1) break block147;
                    if (var4_11.ak != 0) break; // GOTO lbl-1000
                    v0 = true;
                    break block148;
                }
                if (var4_11.ak >= 0) {
                    v0 = true;
                } else { }
                // 3 sources

                {
                    v0 = false;
                }
            }
            if (!v0) {
                if (GameCanvas.i[6]) {
                    if (var1_2.T()) {
                        if (var1_2.ak >= 0) {
                            var1_2.ax();
                        } else {
                            ++var1_2.B;
                            if (var1_2.B >= var1_2.aY.length) {
                                if (GameCanvas.H != null) {
                                    var1_2.B = var1_2.aY.length - 1;
                                    GameCanvas.W = true;
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
                            if (GameCanvas.H != null) {
                                var1_2.B = var1_2.aY.length - 1;
                                GameCanvas.W = true;
                            } else {
                                var1_2.B = 0;
                            }
                        }
                        var1_2.ak = var1_2.bp[var1_2.B];
                        var1_2.aX[var1_2.A] = var1_2.B;
                    }
                }
                if (GameCanvas.i[4]) {
                    --var1_2.B;
                    if (var1_2.B < 0) {
                        var1_2.B = var1_2.aY.length - 1;
                    }
                    if (GameCanvas.W) {
                        GameCanvas.W = false;
                    }
                    var1_2.ak = var1_2.bp[var1_2.B];
                    var1_2.aX[var1_2.A] = var1_2.B;
                }
            }
            var1_2.cf = -1;
            var3_13 = 0;
            while (var3_13 < var1_2.aY.length) {
                if (GameCanvas.b(var1_2.C + var3_13 * var1_2.aE, 52, var1_2.aE - 1, 25)) {
                    var1_2.cf = var3_13;
                    if (GameCanvas.m) {
                        var1_2.B = var3_13;
                        var1_2.aX[var1_2.A] = var3_13;
                        GameCanvas.m = false;
                        var1_2.ak = var1_2.bp[var1_2.B];
                        if (var2_4 != var1_2.B || var1_2.bW != 0) break;
                        var1_2.f = 0;
                        var1_2.ak = GameCanvas.e != false ? -1 : 0;
                        break;
                    }
                }
                ++var3_13;
            }
            if (var2_4 != var1_2.B) {
                var1_2.dn = 0;
                bu.LoginScreen();
                switch (var1_2.A) {
                    case 21: {
                        if (var1_2.B == 0) {
                            var1_2.U();
                        }
                        if (var1_2.B == 1) {
                            var1_2.P();
                        }
                        if (var1_2.B != 2) break;
                        var1_2.b(true);
                        break;
                    }
                    case 0: {
                        if (var1_2.B == 0) {
                            var4_11 = var1_2;
                            var1_2.aP = 0;
                        }
                        if (var1_2.B == 1) {
                            var1_2.b(true);
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
                        var1_2.b(true);
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
                        var1_2.RMS();
                        break;
                    }
                    case 12: {
                        if (var1_2.B == 0) {
                            var1_2.o();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.b(true);
                        break;
                    }
                    case 13: {
                        if (var1_2.B == 0) {
                            if (var1_2.equals(GameCanvas.G)) {
                                var1_2.b(true);
                            } else if (var1_2.equals(GameCanvas.H)) {
                                var1_2.LoginScreen(false);
                            }
                        }
                        if (var1_2.B == 1) {
                            var1_2.LoginScreen(true);
                        }
                        if (var1_2.B != 2) break;
                        var1_2.LoginScreen(false);
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
                    if (GameCanvas.j[2]) {
                        var1_2.aP -= 5;
                    }
                    if (GameCanvas.j[8]) {
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
                        if (!GameCanvas.e) {
                            var1_2.ci.d = var1_2.aP;
                        }
                        var1_2.ci.LoginScreen();
                    }
                    var3_13 = var1_2.ae + var1_2.ag / 2 - 35;
                    var4_12 = GameCanvas.B > 300 ? 20 : 15;
                    var2_4 = var1_2.Char + var1_2.ah - var4_12 - 15;
                    var4_12 = GameCanvas.GameScreen;
                    var5_14 = GameCanvas.q;
                    var1_2.cd = -1;
                    if (g.ImageCache) {
                        GameScreen.j();
                        if (!(GameScreen.e() || var4_12 < var3_13 || var4_12 > var3_13 + 70 || var5_14 < var2_4 || var5_14 > var2_4 + 30 || var1_2.ci != null && var1_2.ci.m)) {
                            var1_2.cd = 1;
                            if (GameCanvas.m) {
                                bu.LoginScreen();
                                var1_2.bV = 2;
                                GameCanvas.Res();
                            }
                        }
                    }
                    GameCanvas.clearKeyHold();
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
                            if (GameCanvas.i[4]) {
                                var2_6.bE = var2_6.X();
                                --var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.aZ.length - 1;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.bE.k.length - 1;
                                }
                            } else if (GameCanvas.i[6]) {
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
                break; // GOTO lbl384
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
                if (this.B < this.aY.length - (GameCanvas.H != null ? 0 : 1) && this.A != 17) {
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
                if (GameCanvas.j[2]) {
                    var1_2.cC -= 5;
                    var1_2.aM = var1_2.cC - (var1_2.Char + var1_2.ah / 2);
                    if (var1_2.cC < var1_2.Char) {
                        var1_2.cC = var1_2.Char;
                    }
                }
                if (GameCanvas.j[8]) {
                    var1_2.cC += 5;
                    var1_2.aM = var1_2.cC - (var1_2.Char + var1_2.ah / 2);
                    if (var1_2.cC > var1_2.Char + 200) {
                        var1_2.cC = var1_2.Char + 200;
                    }
                }
                if (GameCanvas.j[4]) {
                    var1_2.cB -= 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB < 16) {
                        var1_2.cB = 16;
                    }
                }
                if (GameCanvas.j[6]) {
                    var1_2.cB += 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB > 250) {
                        var1_2.cB = 250;
                    }
                }
                if (GameCanvas.k) {
                    var1_2.bT = true;
                    if (!var1_2.bZ) {
                        var1_2.bX = var1_2.aL;
                        var1_2.bY = var1_2.aM;
                        var1_2.bZ = true;
                    }
                    var1_2.aL = var1_2.bX + (GameCanvas.MyHashtable - GameCanvas.GameScreen);
                    var1_2.aM = var1_2.bY + (GameCanvas.u - GameCanvas.q);
                }
                if (GameCanvas.m) {
                    var1_2.bZ = false;
                    GameCanvas.MyHashtable = GameCanvas.GameScreen;
                    GameCanvas.u = GameCanvas.q;
                    var1_2.ca = GameCanvas.MyHashtable + var1_2.aL;
                    var1_2.cb = GameCanvas.u + var1_2.aM;
                }
                if (GameCanvas.Res) {
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
                GameCanvas.clearKeyHold();
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
                    var1_2.Npc = -1;
                    if (var1_2.ak == var1_2.k.size() && GameCanvas.Res) {
                        GameCanvas.Res = false;
                        var1_2.Npc = 1;
                    }
                }
                if (var1_2.B != 1) break;
                var1_2.O();
                break;
            }
            case 13: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    if (var1_2.equals(GameCanvas.G)) {
                        var1_2.ay();
                    }
                    if (var1_2.equals(GameCanvas.H)) {
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
        GameCanvas.resetKeys();
        var1_3 = 0;
        while (var1_3 < GameCanvas.i.length) {
            GameCanvas.i[var1_3] = false;
            ++var1_3;
        }
    }

    public final void methodLoginScreen(boolean bl2) {
        this.O = bl2 ? this.U.size() + 3 : this.V.size() + 3;
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
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

    public final void b(Char af2) {
        this.A = 13;
        this.M[this.A] = bg;
        this.aT = false;
        this.aS = false;
        this.m = false;
        this.U.removeAllElements();
        this.V.removeAllElements();
        this.aR = 0;
        this.Res = 0;
        if (GameCanvas.A > 2 * ab) {
            GameCanvas.H = new g();
            new g().A = 13;
            GameCanvas.H.M[this.A] = new String[][]{T.cj};
            GameCanvas.H.c(1);
            GameCanvas.H.LoginScreen(false);
            GameCanvas.G.M[this.A] = new String[][]{T.cf, T.ci};
            GameCanvas.H.SessionReceiver();
            GameCanvas.H.MessageHandler = af2;
        }
        if (this.equals(GameCanvas.G)) {
            this.c(0);
        }
        if (this.B == 0) {
            this.b(true);
        }
        if (this.B == 1) {
            this.LoginScreen(true);
        }
        if (this.B == 2) {
            this.LoginScreen(false);
        }
        this.MessageHandler = af2;
    }

    private void methodLoginScreen(mGraphics en2, boolean bl2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        MyVector el2 = bl2 ? this.U : this.V;
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 36;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.Char + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                if (n2 == this.O - 1) {
                    if (bl2) {
                        en2.LoginScreen(15196114);
                        en2.b(n7, n4, this.ag, n6);
                        if (!this.aS) {
                            if (!this.m) {
                                mFont.o.LoginScreen(en2, String.valueOf(T.dU) + T.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            } else {
                                mFont.o.LoginScreen(en2, String.valueOf(T.dU) + T.dO, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            }
                        } else if (this.m) {
                            en2.LoginScreen(15196114);
                            en2.b(n7, n4, this.ag, n6);
                            en2.LoginScreen(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                            (n2 == this.ak ? mFont.g : mFont.f).LoginScreen(en2, T.dT, this.ae + this.ag - 22, n4 + 7, 2);
                            mFont.o.LoginScreen(en2, String.valueOf(T.dU) + T.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                        } else {
                            mFont.o.LoginScreen(en2, String.valueOf(T.dU) + T.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                        }
                    }
                } else if (n2 == this.O - 2) {
                    if (bl2) {
                        en2.LoginScreen(15196114);
                        en2.b(n7, n4, this.ag, n6);
                        if (!this.aT) {
                            if (!this.aS) {
                                en2.LoginScreen(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                                (n2 == this.ak ? mFont.g : mFont.f).LoginScreen(en2, T.dW, this.ae + this.ag - 22, n4 + 7, 2);
                                mFont.o.LoginScreen(en2, String.valueOf(T.dV) + T.dM, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            } else {
                                en2.LoginScreen(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                                (n2 == this.ak ? mFont.g : mFont.f).LoginScreen(en2, T.bv, this.ae + this.ag - 22, n4 + 7, 2);
                                mFont.o.LoginScreen(en2, String.valueOf(T.dV) + T.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            }
                        }
                    } else if (!this.m) {
                        mFont.f.LoginScreen(en2, T.dN, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    } else {
                        mFont.f.LoginScreen(en2, T.dP, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    }
                } else if (n2 == this.O - 3) {
                    int n10;
                    mGraphics en3;
                    int n11;
                    mGraphics en4;
                    if (this.aS) {
                        en4 = en2;
                        n11 = 13748667;
                    } else {
                        en4 = en2;
                        n11 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    en4.LoginScreen(n11);
                    en2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        en3 = en2;
                        n10 = 13748667;
                    } else {
                        en3 = en2;
                        n10 = n2 == this.ak ? 7300181 : 9993045;
                    }
                    en3.LoginScreen(n10);
                    en2.b(n7, n8, 34, n9);
                    en2.LoginScreen(w, n7 + 17, n8 + n9 / 2, 3);
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen((long)(bl2 ? this.aR : this.Res))) + " " + T.bD, n3 + 5, n4 + 11, 0);
                    mFont.r.LoginScreen(en2, T.dX, n3 + 5, n4, 0);
                } else {
                    int n12;
                    int n13;
                    mGraphics en5;
                    int n14;
                    mGraphics en6;
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
                    en6.LoginScreen(n14);
                    en2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        en5 = en2;
                        n13 = 13748667;
                    } else {
                        en5 = en2;
                        n13 = n2 == this.ak ? 9541120 : 9993045;
                    }
                    en5.LoginScreen(n13);
                    Item h2 = (Item)el2.elementAt(n2);
                    if (h2 != null) {
                        n6 = 0;
                        while (n6 < h2.LoginScreen.length) {
                            byte by2;
                            if (h2.LoginScreen[n6].c.LoginScreen == 72 && h2.LoginScreen[n6].LoginScreen > 0 && (n12 = g.f(by2 = g.g(h2.LoginScreen[n6].LoginScreen))) != -1) {
                                int n15;
                                mGraphics en7;
                                if (this.aS) {
                                    en7 = en2;
                                    n15 = 13748667;
                                } else {
                                    en7 = en2;
                                    n15 = g.f(by2);
                                }
                                en7.LoginScreen(n15);
                            }
                            ++n6;
                        }
                    }
                    en2.b(n7, n8, 34, n9);
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.LoginScreen != null) {
                            n12 = 0;
                            while (n12 < h2.LoginScreen.length) {
                                if (h2.LoginScreen[n12].c.LoginScreen == 72) {
                                    object = " [+" + h2.LoginScreen[n12].LoginScreen + "]";
                                }
                                if (h2.LoginScreen[n12].c.LoginScreen == 41) {
                                    if (h2.LoginScreen[n12].LoginScreen == 1) {
                                        di2 = g.Item(0);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 2) {
                                        di2 = g.Item(2);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 3) {
                                        di2 = g.Item(8);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 4) {
                                        di2 = g.Item(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.LoginScreen(en2, String.valueOf(h2.b.d) + (String)object, n3 + 5, n4 + 1, 0);
                        String string = "";
                        if (h2.LoginScreen != null) {
                            if (h2.LoginScreen.length > 0 && h2.LoginScreen[0] != null) {
                                string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.LoginScreen.length > 1) {
                                int n16 = 1;
                                while (n16 < h2.LoginScreen.length) {
                                    if (h2.LoginScreen[n16] != null && h2.LoginScreen[n16].c.LoginScreen != 102 && h2.LoginScreen[n16].c.LoginScreen != 107) {
                                        string = String.valueOf(string) + "," + h2.LoginScreen[n16].LoginScreen();
                                    }
                                    ++n16;
                                }
                            }
                            ((mFont)object).LoginScreen(en2, string, n3 + 5, n4 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n7 + 17, n8 + n9 / 2, 0, 3);
                        if (h2.LoginScreen != null) {
                            int n17 = 0;
                            while (n17 < h2.LoginScreen.length) {
                                this.LoginScreen(en2, h2.LoginScreen[n17].c.LoginScreen, n7, n8, n9);
                                ++n17;
                            }
                            n17 = 0;
                            while (n17 < h2.LoginScreen.length) {
                                g.LoginScreen(en2, h2.LoginScreen[n17].c.LoginScreen, h2.LoginScreen[n17].LoginScreen, n7, n8, 34, n9);
                                ++n17;
                            }
                        }
                        if (h2.Item > 1) {
                            mFont.n.LoginScreen(en2, "" + h2.Item, n7 + 34, n8 + n9 - mFont.n.LoginScreen(), 1);
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
                    this.bN = (GameCanvas.GameScreen - n2) / this.aE;
                } else {
                    this.bE = this.X();
                    if (this.bE != null && this.bE.k != null) {
                        n2 = this.ae + this.ag - 2 - this.bE.k.length * 40;
                        this.bN = (GameCanvas.GameScreen - n2) / 40;
                    }
                }
                if (GameCanvas.GameScreen < n2) {
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
        if (GameCanvas.i[2]) {
            n3 = 1;
            --this.ak;
            if (this.A == 24) {
                this.ak -= 2;
                if (this.ak < 0) {
                    this.ak = 0;
                }
            } else if (this.ak < 0) {
                if (this.equals(GameCanvas.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.LoginScreen();
                    if (this.L[this.B] <= 0) {
                        GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                        return;
                    }
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
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
        } else if (GameCanvas.i[8]) {
            n3 = 1;
            ++this.ak;
            if (this.A == 24) {
                this.ak += 2;
                if (this.ak > this.O - 1) {
                    this.ak = this.O - 1;
                }
            } else if (this.ak > this.O - 1) {
                if (this.equals(GameCanvas.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.LoginScreen();
                    if (this.L[this.B] >= this.K[this.B] - 1) {
                        GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, 0, -1);
                        return;
                    }
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
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
        if (GameCanvas.k) {
            this.ItemMap = false;
            if (!this.bT && GameCanvas.b(this.ae, this.Char, this.ag, this.ah)) {
                n3 = 0;
                while (n3 < this.bS.length) {
                    this.bS[0] = GameCanvas.q;
                    ++n3;
                }
                this.bR = GameCanvas.q;
                this.bT = true;
                this.bU = this.bW != 0;
                this.bW = 0;
            } else if (this.bT) {
                ++this.bQ;
                if (this.bQ > 5 && this.bR == GameCanvas.q && !this.bU) {
                    this.bR = -1000;
                    this.ak = (this.f + GameCanvas.q - this.Char) / this.aD;
                    if (this.ak >= this.O) {
                        this.ak = -1;
                    }
                    this.N();
                }
                if ((n3 = GameCanvas.q - this.bS[0]) != 0 && this.ak != -1) {
                    this.ak = -1;
                    this.bN = -1;
                }
                n2 = this.bS.length - 1;
                while (n2 > 0) {
                    this.bS[n2] = this.bS[n2 - 1];
                    --n2;
                }
                this.bS[0] = GameCanvas.q;
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
        if (GameCanvas.m && this.bT) {
            this.ItemMap = true;
            n3 = GameCanvas.q - this.bS[0];
            GameCanvas.m = false;
            if (ds.g(n3) < 20 && ds.g(GameCanvas.q - this.bR) < 20 && !this.bU) {
                this.bW = 0;
                this.f = this.g;
                this.bR = -1000;
                this.ak = (this.f + GameCanvas.q - this.Char) / this.aD;
                if (this.ak >= this.O) {
                    this.ak = -1;
                }
                this.N();
                this.bQ = 0;
                this.bV = 10;
                bu.LoginScreen();
            } else if (this.ak != -1 && this.bQ > 5) {
                this.bQ = 0;
                this.bV = 1;
            } else if (this.ak == -1 && !this.bU) {
                if (this.g < 0) {
                    this.f = 0;
                } else if (this.g > this.aI) {
                    this.f = this.aI;
                } else {
                    n2 = GameCanvas.q - this.bS[0] + (this.bS[0] - this.bS[1]) + (this.bS[1] - this.bS[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.bW = -n2 * 100;
                }
            }
            if ((this.T() || this.A == 13) && GameCanvas.q < this.Char + 21) {
                this.ak = 0;
                this.ax();
            }
            this.bT = false;
            this.bQ = 0;
            GameCanvas.m = false;
        }
    }

    private void P() {
        this.O = this.cm.length;
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
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
        bu.LoginScreen();
        bu.f();
        this.O = G.length;
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
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
            this.ch = T.dq;
        } else if (this.an) {
            this.ao = "";
            this.O = (this.Q == null ? this.R.size() : this.Q.size()) + 2;
            this.ch = String.valueOf(T.df) + " " + (this.bD != null ? this.bD.c : Char.e().ai.c);
        } else if (this.am) {
            this.O = cb.Res.size() + 2;
            this.ch = T.ae;
            this.ao = "";
        }
        this.cg = Char.e().ai == null ? new String[][]{T.dk, T.dj} : (!this.an ? (this.R.size() > 1 ? new String[][]{T.dh, T.dn, T.BaseCanvas} : new String[][]{T.BaseCanvas}) : (Char.e().aj > 0 ? new String[][]{T.Char, T.mFont} : (this.R.size() > 1 ? new String[][]{T.Char, T.mFont, T.dl, T.dm} : new String[][]{T.Char, T.dl, T.dm})));
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
        if (Char.e().ai != null) {
            this.am = true;
            this.an = false;
            this.al = false;
        } else {
            this.am = false;
            this.an = false;
            this.al = true;
        }
        if (Char.e().ai != null) {
            this.O = cb.Res.size() + 2;
        }
        this.v();
        this.bN = -1;
        if (this.o == null) {
            this.o = new cq();
            this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
            this.o.LoginScreen();
            this.o.c = GameCanvas.G;
        }
        if (Char.e().ai == null) {
            this.ao = T.dK;
            GameService.LoginScreen().LoginScreen("");
        }
        this.ak = this.bp[this.B];
        if (GameCanvas.e) {
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
        this.Item = 0;
    }

    public final void Message() {
        this.aD = 24;
        this.O = this.B == this.aY.length - 1 && GameCanvas.H == null && this.bJ != 2 ? this.i(Char.e().aH.length + Char.e().aF.length) : Char.e().aJ[this.B].length;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void R() {
        this.aD = 30;
        this.O = Char.e().ax.b.length + 6;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void S() {
        this.aD = 24;
        this.O = GameScreen.j().S.length;
        this.aI = this.O * this.aD - this.ah;
        this.f = 0;
        this.g = 0;
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void T() {
        this.O = this.i(Char.e().aG.length);
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void U() {
        this.aD = 30;
        Item[] hArray = Char.f().aH;
        bf[] bfArray = Char.f().aI;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    private void b(boolean bl2) {
        this.O = this.i(Char.e().aH.length + Char.e().aF.length);
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
            this.ak = GameCanvas.e ? -1 : 0;
        }
    }

    private void V() {
        if (this.bM > 0) {
            --this.bM;
        }
        if (this.ItemMap && this.equals(GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            if (this.g < -50) {
                bp.LoginScreen();
                this.ItemMap = false;
                if (this.L[this.B] <= 0) {
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                } else {
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                }
            } else if (this.g > this.aI + 50) {
                this.ItemMap = false;
                bp.LoginScreen();
                if (this.L[this.B] >= this.K[this.B] - 1) {
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, 0, -1);
                } else {
                    GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                }
            }
        }
        if (this.Item != this.aK && !this.bT) {
            this.cj = this.aK - this.Item << 2;
            this.ck += this.cj;
            this.Item += this.ck >> 3;
            this.ck &= 0xF;
        }
        if (Math.abs(this.aK - this.Item) < 10) {
            this.Item = this.aK;
        }
        if (this.cD) {
            this.cD = false;
            this.aK = this.ag;
        }
        if (this.aK >= this.ag - 10 && this.Item >= this.ag - 10 && this.bH == 0) {
            this.LoginScreen = false;
            this.Z();
            if (this.cI) {
                this.cI = false;
                if (Char.e().U > 0L && Char.e().H != 14) {
                    bp.LoginScreen();
                    if (this.A == 3) {
                        GameService.LoginScreen().f(this.ak);
                    } else if (this.A == 14) {
                        GameService.LoginScreen().v(this.ak);
                    }
                }
            }
            if (this.cl) {
                this.cl = false;
                int n2 = this.S.size() - this.Z.size();
                if (Char.e().aU != null) {
                    Char.e().aU.M = this.ak - n2 < 0 ? this.ak : (int)Short.parseShort((String)this.Z.elementAt(this.ak - n2));
                }
                de de2 = (de)this.S.elementAt(this.ak);
                de2.LoginScreen();
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

    private void b(mGraphics en2) {
        int n2;
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
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
            int n5 = this.Char + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.Char + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
            en2.d(n7, n8, n9, n10);
            en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
            en2.d(n4, n5, 24, n6);
            q q2 = (q)this.W.elementAt(n2);
            if (q2.b != -1) {
                bl.b(en2, q2.b, n4, n5, 0, 0);
            } else {
                RMS av2 = GameScreen.x[q2.LoginScreen];
                bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n4 + av2.LoginScreen[Char.bC[0][0][0]].b, n5 + n10 - 1, 0, 36);
            }
            en2.e(this.ae, this.Char + this.g, this.ag, this.ah);
            if (q2.g != Char.e().J) {
                mFont.Item.LoginScreen(en2, q2.e, n7 + 5, n8, 0);
            } else {
                mFont.LoginScreen.LoginScreen(en2, q2.e, n7 + 5, n8, 0);
            }
            mFont.q.LoginScreen(en2, q2.f, n7 + n9 - 5, n8 + 11, 1);
            mFont.m.LoginScreen(en2, String.valueOf(T.bL) + ": " + q2.Item, n7 + 5, n8 + 11, 0);
            ++n2;
        }
        this.f(en2);
    }

    public final void methodLoginScreen(mGraphics en2) {
        block144: {
            Object object;
            Object object2;
            int n2;
            Object object3;
            Object object4;
            mGraphics en3;
            block143: {
                block149: {
                    g g2;
                    mGraphics en4;
                    block150: {
                        block148: {
                            block147: {
                                block146: {
                                    block145: {
                                        Object object5;
                                        int n3;
                                        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
                                        en2.LoginScreen(-this.Item, 0);
                                        en2.LoginScreen(this.b, 0);
                                        if (GameCanvas.G.RMS == -1) break block143;
                                        if (!this.equals(GameCanvas.G)) break block144;
                                        en4 = en2;
                                        g2 = this;
                                        GameScreen.j();
                                        GameScreen.b(en4);
                                        mGraphics en5 = en4;
                                        g g3 = g2;
                                        en5.LoginScreen(-GameScreen.j, -GameScreen.k);
                                        if (g3.cX < 3) {
                                            n3 = 0;
                                            while (n3 < GameScreen.G.size()) {
                                                object5 = (_do)GameScreen.G.elementAt(n3);
                                                if (((_do)object5).df.LoginScreen == g3.T) {
                                                    ((_do)object5).LoginScreen(en5);
                                                    if (((Char)object5).z != null) {
                                                        ((Char)object5).z.LoginScreen(en5, ((Char)object5).B, ((Char)object5).C - ((Char)object5).al - GameCanvas.ae, ((Char)object5).I);
                                                    }
                                                }
                                                ++n3;
                                            }
                                        }
                                        GameCanvas.isLowGraphic(en5);
                                        if (GameCanvas.w % 4 == 0) {
                                            en5.LoginScreen(ItemMap.f, g3.ax - 5, g3.ay + 15, 33);
                                            en5.LoginScreen(ItemMap.f, g3.ax + 5, g3.ay + 15, 33);
                                            en5.LoginScreen(ItemMap.f, g3.ax, g3.ay + 15, 33);
                                        }
                                        n3 = 0;
                                        while (n3 < dc.w.size()) {
                                            object5 = (dc)dc.w.elementAt(n3);
                                            ((dc)object5).LoginScreen(en5);
                                            ++n3;
                                        }
                                        if (GameCanvas.w % 4 == 0) {
                                            en4.LoginScreen(ItemMap.f, g2.ax, g2.ay + 15, 33);
                                        }
                                        if (g2.cX != 0) break block145;
                                        int n4 = 0;
                                        while (n4 < g2.cT.length) {
                                            bl.b(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                                            if (g2.dd) {
                                                bl.b(en4, g2.de, g2.cU[n4], g2.cV[n4], 0, 3);
                                            }
                                            ++n4;
                                        }
                                        break block144;
                                    }
                                    if (g2.cX != 1) break block146;
                                    if (!g2.dd) {
                                        bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                    } else {
                                        int n5 = 0;
                                        while (n5 < g2.cT.length) {
                                            bl.b(en4, g2.aA, g2.cU[0], g2.cV[0], 0, 3);
                                            bl.b(en4, g2.de, g2.cU[1], g2.cV[1], 0, 3);
                                            ++n5;
                                        }
                                    }
                                    break block144;
                                }
                                if (g2.cX != 2) break block147;
                                if (!g2.dd) {
                                    bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                } else {
                                    int n6 = 0;
                                    while (n6 < g2.cT.length) {
                                        bl.b(en4, g2.aA, g2.cU[n6], g2.cV[n6], 0, 3);
                                        ++n6;
                                    }
                                }
                                break block144;
                            }
                            if (g2.cX != 3) break block148;
                            if (!g2.dd) {
                                bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                            } else {
                                bl.b(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                            }
                            break block144;
                        }
                        if (g2.cX != 4) break block149;
                        if (g2.dd) break block150;
                        if (g2.aB == -1) break block149;
                        bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                        break block144;
                    }
                    int n7 = 0;
                    while (n7 < g2.df.length) {
                        bl.b(en4, g2.df[n7], g2.cU[n7], g2.cV[n7], 0, 3);
                        ++n7;
                    }
                }
                return;
            }
            cx.c(this.b, 0, this.d, this.e, en2);
            try {
                en3 = en2;
                object4 = this;
                en3.e(((g)object4).b + 1, 0, ((g)object4).d - 2, ((g)object4).Char - 2);
                en3.LoginScreen(9993045);
                en3.d(((g)object4).b, 0, ((g)object4).d - 2, 50);
                switch (((g)object4).A) {
                    case 13: {
                        if (((g)object4).B == 0 || ((g)object4).B == 1) {
                            if (object4.equals(GameCanvas.G)) {
                                bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                                object3 = en3;
                                mFont.n.LoginScreen((mGraphics)object3, T.ep, 60, 4, 0, mFont.o);
                                mFont.n.LoginScreen((mGraphics)object3, T.dQ, 60, 16, 0, mFont.o);
                                mFont.n.LoginScreen((mGraphics)object3, T.dR, 60, 27, 0, mFont.o);
                                mFont.n.LoginScreen((mGraphics)object3, T.dS, 60, 38, 0, mFont.o);
                            }
                            if (object4.equals(GameCanvas.H) && ((g)object4).MessageHandler != null) {
                                bl.b(en3, ((g)object4).MessageHandler.d(), ((g)object4).b + 25, 50, 0, 33);
                                super.LoginScreen(en3, ((g)object4).MessageHandler);
                            }
                        }
                        if (((g)object4).B == 2 && ((g)object4).MessageHandler != null) {
                            bl.b(en3, ((g)object4).MessageHandler.d(), ((g)object4).b + 25, 50, 0, 33);
                            super.LoginScreen(en3, ((g)object4).MessageHandler);
                        }
                        break;
                    }
                    case 12: {
                        if (((g)object4).B == 0) {
                            int n8 = 1410;
                            n2 = 0;
                            while (n2 < GameScreen.G.size()) {
                                object2 = (_do)GameScreen.G.elementAt(n2);
                                if (((_do)object2).df.LoginScreen == ((g)object4).T) {
                                    n8 = ((Char)object2).aO;
                                }
                                ++n2;
                            }
                            bl.b(en3, n8, ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            if (((g)object3).aq != null) {
                                n8 = 0;
                                while (n8 < ((g)object3).aq.length) {
                                    mFont.SessionReceiver.LoginScreen((mGraphics)object, ((g)object3).aq[n8], ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 5 + n8 * 14, 2);
                                    ++n8;
                                }
                            }
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.A(en3);
                        }
                        break;
                    }
                    case 11: 
                    case 16: 
                    case 23: 
                    case 24: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 15: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 9: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 21: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, Char.f().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.da) + ": " + ai.LoginScreen(Char.f().Message), ((g)object3).b + 60, 4, 0, mFont.o);
                            if (Char.f().Message > 0L) {
                                mFont.n.LoginScreen((mGraphics)object, Char.f().aq ? Char.f().c() : Char.f().bj, ((g)object3).b + 60, 16, 0, mFont.o);
                            }
                            if (Char.f().X > 0L) {
                                mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.eZ) + " :" + Char.f().X, ((g)object3).b + 60, 27, 0, mFont.o);
                            }
                            if (Char.f().cC > 0) {
                                mFont.n.LoginScreen((mGraphics)object, T.fb, ((g)object3).b + 60, 38, 0, mFont.o);
                                ((mGraphics)object).LoginScreen(GameScreen.aG, ((g)object3).b + 100, 41, 0);
                                int n9 = Char.f().bf * mGraphics.LoginScreen(GameScreen.aF) / Char.f().cC;
                                ((mGraphics)object).e(100, ((g)object3).b + 41, n9, 20);
                                ((mGraphics)object).LoginScreen(GameScreen.aF, ((g)object3).b + 100, 41, 0);
                            }
                            ((mGraphics)object).e(0, 0, GameCanvas.A, GameCanvas.B);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, Char.f().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.c.LoginScreen((mGraphics)object, "HP: " + Char.f().U + "/" + Char.f().V, ((g)object3).b + 60, 4, 0, mFont.f);
                            mFont.c.LoginScreen((mGraphics)object, "MP: " + Char.f().T + "/" + Char.f().W, ((g)object3).b + 60, 16, 0, mFont.f);
                            mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.fc) + ": " + Char.f().P + ", " + T.fa + ": " + Char.f().Y, ((g)object3).b + 60, 27, 0, mFont.o);
                            mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.u) + ": " + ((g)object3).cm[Char.f().A], ((g)object3).b + 60, 38, 0, mFont.o);
                        }
                        if (((g)object4).B == 2) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 0: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            ((g)object4).A(en3);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        if (((g)object4).B == 2) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            mFont.SessionReceiver.LoginScreen((mGraphics)object, "Top " + Char.e().w, ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 2, 2);
                            mFont.n.LoginScreen((mGraphics)object, T.eG, ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 14, 2);
                            mFont.SessionReceiver.LoginScreen((mGraphics)object, ai.LoginScreen(Char.e().Mob), ((g)object3).b + (GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0) + 45 + (((g)object3).d - 50) / 2, 26, 2);
                            mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.bM) + ": " + ai.LoginScreen(Char.e().ab), ((g)object3).b + (GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0) + 45 + (((g)object3).d - 50) / 2, 38, 2);
                        }
                        if (((g)object4).B == 3) {
                            if (((g)object4).D.length == 5) {
                                eh eh2;
                                object = en3;
                                object3 = object4;
                                if (Char.e().ai == null) {
                                    bl.b((mGraphics)object, Char.e().d(), 25, 50, 0, 33);
                                    mFont.c.LoginScreen((mGraphics)object, T.dr, (((g)object3).ag - 50) / 2 + 50, 20, 2);
                                } else if (!((g)object3).an) {
                                    eh2 = Char.e().ai;
                                    if (eh2 != null) {
                                        bl.b((mGraphics)object, Char.e().d(), 25, 50, 0, 33);
                                        mFont.c.LoginScreen((mGraphics)object, eh2.c, 60, 4, 0, mFont.f);
                                        mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.eH) + ": " + eh2.f, 60, 16, 0, mFont.o);
                                        mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.cU) + ": " + eh2.k, 60, 27, 0, mFont.o);
                                        mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.cfr_renamed_0) + ": " + eh2.j, 60, 38, 0, mFont.o);
                                        ag.LoginScreen((mGraphics)object, eh2.d, 60, 38, ((g)object3).ag - 70, ((g)object3).aD, mFont.n);
                                    }
                                } else {
                                    eh2 = ((g)object3).bD != null ? ((g)object3).bD : Char.e().ai;
                                    bl.b((mGraphics)object, Char.e().d(), 25, 50, 0, 33);
                                    mFont.c.LoginScreen((mGraphics)object, eh2.c, 60, 4, 0, mFont.f);
                                    mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.df) + ": " + eh2.g + "/" + eh2.Item, 60, 16, 0, mFont.o);
                                    mFont.n.LoginScreen((mGraphics)object, String.valueOf(T.dc) + ": " + eh2.i, 60, 27, 0, mFont.o);
                                    ag.LoginScreen((mGraphics)object, eh2.d, 60, 38, ((g)object3).ag - 70, ((g)object3).aD, mFont.n);
                                }
                            } else {
                                bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                                g.z(en3);
                            }
                        }
                        if (((g)object4).B == 4) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            g.z(en3);
                        }
                        break;
                    }
                    case 25: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 2: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, 526, ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            String string = String.valueOf(T.cw) + ": " + ((g)object3).N + "/" + Char.e().aG.length + " " + T.cx;
                            mFont.c.LoginScreen((mGraphics)object, T.cd, 60, 4, 0);
                            mFont.n.LoginScreen((mGraphics)object, string, 60, 16, 0);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 3: {
                        bl.b(en3, 561, ((g)object4).b + 25, 50, 0, 33);
                        object3 = en3;
                        mFont.c.LoginScreen((mGraphics)object3, String.valueOf(T.cl) + " " + bv.n, 60, 4, 0, mFont.f);
                        mFont.n.LoginScreen((mGraphics)object3, bv.k, 60, 16, 0, mFont.o);
                        mFont.c.LoginScreen((mGraphics)object3, String.valueOf(bv.n), 25, 27, 2);
                        break;
                    }
                    case 26: {
                        bl.b(en3, 561, ((g)object4).b + 25, 50, 0, 33);
                        object = en3;
                        object3 = object4;
                        bl.b((mGraphics)object, Char.e().d(), ((g)object3).b + 25, 50, 0, 33);
                        super.A((mGraphics)object);
                        break;
                    }
                    case 1: {
                        Item h2;
                        if (((g)object4).B == ((g)object4).aY.length - 1 && GameCanvas.H == null) {
                            bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        } else if (Char.e().aT != null) {
                            bl.b(en3, Char.e().aT.aO, ((g)object4).b + 25, 50, 0, 33);
                        }
                        object = en3;
                        object3 = object4;
                        if (((g)object3).B == ((g)object3).aY.length - 1 && GameCanvas.H == null) {
                            super.A((mGraphics)object);
                            break;
                        }
                        if (((g)object3).ak < 0) {
                            if (((g)object3).bJ != 2) {
                                mFont.SessionReceiver.LoginScreen((mGraphics)object, T.er, ((g)object3).b + 60, 14, 0);
                                mFont.SessionReceiver.LoginScreen((mGraphics)object, ar, ((g)object3).b + 60, 26, 0);
                                break;
                            }
                            mFont.SessionReceiver.LoginScreen((mGraphics)object, T.er, ((g)object3).b + 60, 5, 0);
                            mFont.SessionReceiver.LoginScreen((mGraphics)object, ar, ((g)object3).b + 60, 17, 0);
                            mFont.SessionReceiver.LoginScreen((mGraphics)object, String.valueOf(T.fP) + " " + (((g)object3).L[((g)object3).B] + 1) + "/" + ((g)object3).K[((g)object3).B], ((g)object3).b + 60, 29, 0);
                            break;
                        }
                        if (((g)object3).B >= 0 && ((g)object3).B <= Char.e().aJ.length - 1 && ((g)object3).ak >= 0 && ((g)object3).ak <= Char.e().aJ[((g)object3).B].length - 1 && (h2 = Char.e().aJ[((g)object3).B][((g)object3).ak]) != null) {
                            if (object3.equals(GameCanvas.G) && ((g)object3).B <= 3 && ((g)object3).bJ == 2) {
                                mFont.c.LoginScreen((mGraphics)object, String.valueOf(T.fP) + " " + (((g)object3).L[((g)object3).B] + 1) + "/" + ((g)object3).K[((g)object3).B], ((g)object3).b + 55, 4, 0);
                            }
                            mFont.c.LoginScreen((mGraphics)object, h2.b.d, ((g)object3).b + 55, 24, 0);
                            object4 = String.valueOf(T.cu) + " " + ds.LoginScreen((long)h2.b.i);
                            if ((long)h2.b.i > Char.e().Message) {
                                mFont.n.LoginScreen((mGraphics)object, (String)object4, ((g)object3).b + 55, 35, 0);
                                break;
                            }
                            mFont.r.LoginScreen((mGraphics)object, (String)object4, ((g)object3).b + 55, 35, 0);
                        }
                        break;
                    }
                    case 4: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.B(en3);
                        break;
                    }
                    case 7: 
                    case 17: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 8: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 10: {
                        if (((g)object4).MessageHandler != null) {
                            bl.b(en3, ((g)object4).MessageHandler.d(), ((g)object4).b + 25, 50, 0, 33);
                            super.LoginScreen(en3, ((g)object4).MessageHandler);
                        }
                        break;
                    }
                    case 14: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.B(en3);
                        break;
                    }
                    case 18: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 19: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                        break;
                    }
                    case 20: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                        break;
                    }
                    case 22: {
                        bl.b(en3, Char.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                    }
                }
            }
            catch (Exception exception) {}
            en3 = en2;
            object4 = this;
            if (((g)object4).A != 13 || ((g)object4).B != 2 && !object4.equals(GameCanvas.H)) {
                en3.e(0, 0, GameCanvas.A, GameCanvas.B);
                en3.LoginScreen(11837316);
                en3.d(((g)object4).b + 1, ((g)object4).e - 15, ((g)object4).d - 2, 14);
                en3.LoginScreen(13524492);
                en3.d(((g)object4).b + 1, ((g)object4).e - 15, ((g)object4).d - 2, 1);
                en3.LoginScreen(w, ((g)object4).b + 11, ((g)object4).e - 7, 3);
                en3.LoginScreen(Message, ((g)object4).b + 75, ((g)object4).e - 8, 3);
                mFont.n.LoginScreen(en3, String.valueOf(Char.e().o), ((g)object4).b + 24, ((g)object4).e - 13, 0, mFont.o);
                mFont.n.LoginScreen(en3, String.valueOf(Char.e().GameScreen), ((g)object4).b + 85, ((g)object4).e - 13, 0, mFont.o);
                en3.LoginScreen(z, ((g)object4).b + 130, ((g)object4).e - 8, 3);
                mFont.n.LoginScreen(en3, String.valueOf(Char.e().q), ((g)object4).b + 140, ((g)object4).e - 13, 0, mFont.o);
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
                    this.Item(en2);
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
                    this.Res(en2);
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
                    this.MyHashtable(en2);
                    break;
                }
                case 11: {
                    this.SessionReceiver(en2);
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
                        if (this.equals(GameCanvas.G)) {
                            this.x(en2);
                        } else {
                            this.LoginScreen(en2, false);
                        }
                    }
                    if (this.B == 1) {
                        this.LoginScreen(en2, true);
                    }
                    if (this.B != 2) break;
                    this.LoginScreen(en2, false);
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
            if (((g)object4).ai != null && ((g)object4).ai.d != null) {
                ((g)object4).ai.LoginScreen(en3);
                int n10 = ((g)object4).ai.e + 13;
                n2 = ((g)object4).ai.f + 11;
                if (((g)object4).A == 15) {
                    n10 += 5;
                    n2 += 26;
                }
                if (((g)object4).A == 0 && ((g)object4).B == 3) {
                    if (((g)object4).al) {
                        n10 -= 5;
                    } else if (((g)object4).bL != null || ((g)object4).cH != null) {
                        n10 = ((g)object4).ai.e + 21;
                        n2 = ((g)object4).ai.f + 40;
                    }
                }
                if (((g)object4).bL != null) {
                    object2 = GameScreen.x[((g)object4).bL[0]];
                    object3 = GameScreen.x[((g)object4).bL[1]];
                    object = GameScreen.x[((g)object4).bL[2]];
                    bl.b(en3, ((RMS)object2).LoginScreen[Char.bC[0][0][0]].LoginScreen, n10 + Char.bC[0][0][1] + ((RMS)object2).LoginScreen[Char.bC[0][0][0]].b, n2 - Char.bC[0][0][2] + ((RMS)object2).LoginScreen[Char.bC[0][0][0]].c, 0, 0);
                    bl.b(en3, ((RMS)object3).LoginScreen[Char.bC[0][1][0]].LoginScreen, n10 + Char.bC[0][1][1] + ((RMS)object3).LoginScreen[Char.bC[0][1][0]].b, n2 - Char.bC[0][1][2] + ((RMS)object3).LoginScreen[Char.bC[0][1][0]].c, 0, 0);
                    bl.b(en3, ((RMS)object).LoginScreen[Char.bC[0][2][0]].LoginScreen, n10 + Char.bC[0][2][1] + ((RMS)object).LoginScreen[Char.bC[0][2][0]].b, n2 - Char.bC[0][2][2] + ((RMS)object).LoginScreen[Char.bC[0][2][0]].c, 0, 0);
                } else if (((g)object4).cH != null) {
                    ((g)object4).cH.LoginScreen(en3, n10 + 5, n2 + 25, 1, 0, true);
                } else if (((g)object4).bK != -1) {
                    bl.b(en3, ((g)object4).bK, ((g)object4).ai.e + 8, ((g)object4).ai.f + 2, 0, 20);
                }
                if (((g)object4).bC != null && ((g)object4).bC.b.b != 5) {
                    if (((g)object4).bC.A > 0) {
                        en3.LoginScreen(aU, n10 - 7, n2 + 13, 3);
                        mFont.Item.LoginScreen(en3, String.valueOf(ds.g(((g)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    } else if (((g)object4).bC.A < 0 && ((g)object4).bC.A != -1) {
                        en3.LoginScreen(aV, n10 - 7, n2 + 13, 3);
                        mFont.LoginScreen.LoginScreen(en3, String.valueOf(ds.g(((g)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    }
                }
            }
            if (this.Item == this.aK && !GameCanvas.F.LoginScreen) {
                this.Mob.LoginScreen(en2);
            }
            if (this.j != null && this.j.k) {
                en3 = en2;
                object4 = this.j;
                ((dr)object4).LoginScreen(en3);
            }
        }
    }

    private void c(mGraphics en2) {
        try {
            if (this.A == 1 && this.B == this.aY.length - 1 && GameCanvas.H == null && this.bJ != 2) {
                this.x(en2);
                return;
            }
            en2.LoginScreen(0xFF0000);
            en2.e(this.ae, this.Char, this.ag, this.ah);
            if (this.bJ == 2 && this.equals(GameCanvas.G)) {
                if (this.B <= 3 && GameCanvas.e) {
                    if (this.g < -50) {
                        GameCanvas.isLowGraphic(this.ae + this.ag / 2, this.Char + 30, en2);
                    } else if (this.g < 0) {
                        mFont.o.LoginScreen(en2, T.fQ, this.ae + this.ag / 2, this.Char + 15, 2);
                    } else if (this.aI >= 0) {
                        if (this.g > this.aI + 50) {
                            GameCanvas.isLowGraphic(this.ae + this.ag / 2, this.Char + this.ah - 30, en2);
                        } else if (this.g > this.aI) {
                            mFont.o.LoginScreen(en2, T.fR, this.ae + this.ag / 2, this.Char + this.ah - 25, 2);
                        }
                    }
                }
                if (Char.e().aJ[this.B].length == 0 && this.A != 17) {
                    mFont.o.LoginScreen(en2, T.fS, this.ae + this.ag / 2, this.Char + this.ah / 2 - 10, 2);
                    return;
                }
            }
            en2.LoginScreen(0, -this.g);
            Item[] hArray = Char.e().aJ[this.B];
            if (this.bJ == 2 && (this.B == 4 || this.A == 17) && (hArray = Char.e().aJ[4]).length == 0) {
                mFont.o.LoginScreen(en2, T.fS, this.ae + this.ag / 2, this.Char + this.ah / 2 - 10, 2);
                return;
            }
            int n2 = hArray.length;
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.ae + 26;
                int n5 = this.Char + n3 * this.aD;
                int n6 = this.ag - 26;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.Char + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.Char + this.ah && n5 - this.g >= this.Char - this.aD) {
                    en2.LoginScreen(n3 == this.ak ? 16383818 : 15196114);
                    en2.b(n4, n5, n6, n7);
                    en2.LoginScreen(n3 == this.ak ? 9541120 : 9993045);
                    en2.b(n8, n9, 24, n10);
                    Item h2 = hArray[n3];
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.B != 0 && this.bJ == 2 && this.B <= 3 && !this.equals(GameCanvas.H) && h2.b.d.length() < 20) {
                            di2 = mFont.Item;
                        }
                        if (h2.LoginScreen != null) {
                            int n11 = 0;
                            while (n11 < h2.LoginScreen.length) {
                                if (h2.LoginScreen[n11].c.LoginScreen == 72) {
                                    object = " [+" + h2.LoginScreen[n11].LoginScreen + "]";
                                }
                                if (h2.LoginScreen[n11].c.LoginScreen == 41) {
                                    if (h2.LoginScreen[n11].LoginScreen == 1) {
                                        di2 = g.Item(0);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 2) {
                                        di2 = g.Item(2);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 3) {
                                        di2 = g.Item(8);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 4) {
                                        di2 = g.Item(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.LoginScreen(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.LoginScreen != null && h2.LoginScreen.length > 0) {
                            if (h2.LoginScreen[0] != null && h2.LoginScreen[0].c.LoginScreen != 102 && h2.LoginScreen[0].c.LoginScreen != 107) {
                                string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = mFont.GameScreen;
                            }
                            if (this.bJ == 2 && h2.LoginScreen.length > 1 && h2.v != -1) {
                                string = String.valueOf(string);
                            }
                            if (this.bJ != 2 || this.bJ == 2 && h2.v <= 1) {
                                ((mFont)object).LoginScreen(en2, string, n4 + 5, n5 + 11, 0);
                            }
                        }
                        if (h2.SessionReceiver > 0) {
                            bl.b(en2, h2.u, n4 + n6 - 7, n5 + 9, 0, 3);
                            mFont.b.LoginScreen(en2, ds.LoginScreen((long)h2.SessionReceiver), n4 + n6 - 15, n5 + 1, 1);
                        }
                        if (h2.n != 0 || h2.GameScreen != 0) {
                            if (this.bJ != 2 && h2.j == 0L) {
                                if (h2.n > 0 && h2.GameScreen > 0) {
                                    if (h2.n > 0) {
                                        en2.LoginScreen(w, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.d.LoginScreen(en2, ds.LoginScreen((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.LoginScreen(Message, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        mFont.Item.LoginScreen(en2, ds.LoginScreen((long)h2.GameScreen), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.LoginScreen(w, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.d.LoginScreen(en2, ds.LoginScreen((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.LoginScreen(Message, n4 + n6 - 7, n5 + 7, 3);
                                        mFont.Item.LoginScreen(en2, ds.LoginScreen((long)h2.GameScreen), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                }
                            }
                            if (this.bJ == 2 && this.B <= 3 && !this.equals(GameCanvas.H)) {
                                if (h2.n > 0 && h2.GameScreen > 0) {
                                    if (h2.n > 0) {
                                        en2.LoginScreen(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = Char.e().at < (long)h2.n ? mFont.LoginScreen : mFont.d;
                                        di2.LoginScreen(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.LoginScreen(Message, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        di2 = Char.e().RMS < h2.GameScreen ? mFont.LoginScreen : mFont.Item;
                                        di2.LoginScreen(en2, ds.b((long)h2.GameScreen), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.LoginScreen(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = Char.e().at < (long)h2.n ? mFont.LoginScreen : mFont.d;
                                        di2.LoginScreen(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.GameScreen > 0) {
                                        en2.LoginScreen(Message, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = Char.e().RMS < h2.GameScreen ? mFont.LoginScreen : mFont.Item;
                                        di2.LoginScreen(en2, ds.b((long)h2.GameScreen), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    try {
                                        di2 = mFont.Item;
                                        if (!Char.e().ag.equals(h2.H)) {
                                            di2 = mFont.Item;
                                        }
                                        di2.LoginScreen(en2, h2.H, n4 + n6, n5 + 1 + mFont.LoginScreen.LoginScreen(), 1);
                                    }
                                    catch (Exception exception) {}
                                }
                            }
                        }
                        bl.b(en2, h2.b.f, n8 + 12, n9 + n10 / 2, 0, 3);
                        if (h2.Item > 1) {
                            mFont.n.LoginScreen(en2, "" + h2.Item, n8 + 24, n9 + n10 - mFont.n.LoginScreen(), 1);
                        }
                        if (h2.C && GameCanvas.w % 10 > 5) {
                            en2.LoginScreen(v, n8 + 12, n5 + 19, 3);
                        }
                    }
                    if (this.bJ == 2 && (this.equals(GameCanvas.H) || this.B == 4) && h2.v != 0) {
                        if (h2.v == 1) {
                            mFont.r.LoginScreen(en2, T.fM, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.LoginScreen(w, n4 + n6 - 7, n5 + 19, 3);
                                mFont.d.LoginScreen(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 13, 1);
                            } else if (h2.GameScreen != -1) {
                                en2.LoginScreen(z, n4 + n6 - 7, n5 + 17, 3);
                                mFont.LoginScreen.LoginScreen(en2, ds.b((long)h2.GameScreen), n4 + n6 - 15, n5 + 11, 1);
                            }
                        } else if (h2.v == 2) {
                            mFont.b.LoginScreen(en2, T.fN, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.LoginScreen(w, n4 + n6 - 7, n5 + 17, 3);
                                mFont.d.LoginScreen(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 11, 1);
                            } else if (h2.GameScreen != -1) {
                                en2.LoginScreen(z, n4 + n6 - 7, n5 + 17, 3);
                                mFont.LoginScreen.LoginScreen(en2, ds.b((long)h2.GameScreen), n4 + n6 - 15, n5 + 11, 1);
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

    private void d(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < this.cm.length) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.LoginScreen(en2, this.cm[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void e(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        Item[] hArray = Char.f().aH;
        bf[] bfArray = Char.f().aI;
        int n2 = 0;
        while (n2 < hArray.length + bfArray.length) {
            int n3 = n2 < hArray.length ? 1 : 0;
            int n4 = n2;
            int n5 = n2 - hArray.length;
            int n6 = this.ae + 36;
            int n7 = this.Char + n2 * this.aD;
            int n8 = this.ag - 36;
            int n9 = this.aD - 1;
            int n10 = this.ae;
            int n11 = this.Char + n2 * this.aD;
            int n12 = this.aD - 1;
            if (n7 - this.g <= this.Char + this.ah && n7 - this.g >= this.Char - this.aD) {
                int n13;
                Item h2;
                Item h3 = h2 = n3 != 0 ? hArray[n4] : null;
                en2.LoginScreen(n2 == this.ak ? 16383818 : (n3 != 0 ? 15196114 : 15723751));
                en2.b(n6, n7, n8, n9);
                en2.LoginScreen(n2 == this.ak ? 9541120 : (n3 != 0 ? 9993045 : 11837316));
                if (h2 != null) {
                    n8 = 0;
                    while (n8 < h2.LoginScreen.length) {
                        if (h2.LoginScreen[n8].c.LoginScreen == 72 && h2.LoginScreen[n8].LoginScreen > 0) {
                            byte by2 = g.g(h2.LoginScreen[n8].LoginScreen);
                            n9 = by2;
                            n13 = g.f(by2);
                            if (n13 != -1) {
                                en2.LoginScreen(g.f(n9));
                            }
                        }
                        ++n8;
                    }
                }
                en2.b(n10, n11, 34, n12);
                if (h2 != null && h2.f && GameCanvas.G.A == 12) {
                    en2.LoginScreen(n2 == this.ak ? 7040779 : 6047789);
                    en2.b(n10, n11, 34, n12);
                }
                if (h2 != null) {
                    String string = "";
                    mFont di2 = mFont.m;
                    if (h2.LoginScreen != null) {
                        n13 = 0;
                        while (n13 < h2.LoginScreen.length) {
                            if (h2.LoginScreen[n13].c.LoginScreen == 72) {
                                string = " [+" + h2.LoginScreen[n13].LoginScreen + "]";
                            }
                            if (h2.LoginScreen[n13].c.LoginScreen == 41) {
                                if (h2.LoginScreen[n13].LoginScreen == 1) {
                                    di2 = g.Item(0);
                                } else if (h2.LoginScreen[n13].LoginScreen == 2) {
                                    di2 = g.Item(2);
                                } else if (h2.LoginScreen[n13].LoginScreen == 3) {
                                    di2 = g.Item(8);
                                } else if (h2.LoginScreen[n13].LoginScreen == 4) {
                                    di2 = g.Item(7);
                                }
                            }
                            ++n13;
                        }
                    }
                    di2.LoginScreen(en2, String.valueOf(h2.b.d) + string, n6 + 5, n7 + 1, 0);
                    String string2 = "";
                    if (h2.LoginScreen != null) {
                        if (h2.LoginScreen.length > 0 && h2.LoginScreen[0] != null && h2.LoginScreen[0].c.LoginScreen != 102 && h2.LoginScreen[0].c.LoginScreen != 107) {
                            string2 = String.valueOf(string2) + h2.LoginScreen[0].LoginScreen();
                        }
                        mFont di3 = mFont.q;
                        if (h2.A < 0 && h2.b.b != 5) {
                            di3 = mFont.GameScreen;
                        }
                        if (h2.LoginScreen.length > 1) {
                            n5 = 1;
                            while (n5 < 2) {
                                if (h2.LoginScreen[n5] != null && h2.LoginScreen[n5].c.LoginScreen != 102 && h2.LoginScreen[n5].c.LoginScreen != 107) {
                                    string2 = String.valueOf(string2) + "," + h2.LoginScreen[n5].LoginScreen();
                                }
                                ++n5;
                            }
                        }
                        di3.LoginScreen(en2, string2, n6 + 5, n7 + 11, 0);
                    }
                    bl.b(en2, h2.b.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    if (h2.LoginScreen != null) {
                        n3 = 0;
                        while (n3 < h2.LoginScreen.length) {
                            this.LoginScreen(en2, h2.LoginScreen[n3].c.LoginScreen, n10, n11, n12);
                            ++n3;
                        }
                        n3 = 0;
                        while (n3 < h2.LoginScreen.length) {
                            g.LoginScreen(en2, h2.LoginScreen[n3].c.LoginScreen, h2.LoginScreen[n3].LoginScreen, n10, n11, 34, n12);
                            ++n3;
                        }
                    }
                    if (h2.Item > 1) {
                        mFont.n.LoginScreen(en2, "" + h2.Item, n10 + 34, n11 + n12 - mFont.n.LoginScreen(), 1);
                    }
                } else if (n3 == 0) {
                    bf bf2 = bfArray[n5];
                    en2.LoginScreen(GameScreen.au, n10 + 17, n11 + n12 / 2, 3);
                    if (bf2.LoginScreen != null) {
                        mFont.q.LoginScreen(en2, bf2.LoginScreen.b, n6 + 5, n7 + 1, 0);
                        mFont.m.LoginScreen(en2, String.valueOf(T.cfr_renamed_0) + ": " + bf2.c, n6 + 5, n7 + 11, 0);
                        bl.b(en2, bf2.LoginScreen.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    } else {
                        mFont.m.LoginScreen(en2, bf2.Res, n6 + 5, n7 + 5, 0);
                        bl.b(en2, GameScreen.Message[98].LoginScreen[0].c, n10 + 17, n11 + n12 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void f(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        if (this.g > 24 && this.O > 0 || this.equals(GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.LoginScreen(Mob.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.Char + 3, 0);
        }
        if (this.g < this.aI && this.O > 0 || this.equals(GameCanvas.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.Char + this.ah - 8, 0);
        }
    }

    private void g(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < G.length) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.LoginScreen(en2, G[n2], this.ae + this.ag / 2, n4 + 6, 2);
                if (G[n2].equals(T.bS)) {
                    n5 = 0;
                    while (n5 < at.size()) {
                        ba ba2 = (ba)at.elementAt(n5);
                        if (!ba2.d) {
                            if (GameCanvas.w % 20 <= 10) break;
                            en2.LoginScreen(v, n3 + 10, n4 + 10, 3);
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

    private void methodItem(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < cF.length) {
            int n3 = this.Char + n2 * 15;
            if (n3 - this.g <= this.Char + this.ah && n3 - this.g >= this.Char - this.aD) {
                mFont.f.LoginScreen(en2, cF[n2], this.ae + 5, n3 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void i(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < at.size()) {
            ba ba2 = (ba)at.elementAt(n2);
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.LoginScreen(en2, ba2.LoginScreen, this.ae + this.ag / 2, n4 + 6, 2);
                if (!ba2.d && GameCanvas.w % 20 > 10) {
                    en2.LoginScreen(v, n3 + 10, n4 + 10, 3);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void j(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = Char.e().ax.b.length;
        int n3 = 0;
        while (n3 < n2 + 6) {
            int n4 = this.ae + 30;
            int n5 = this.Char + n3 * this.aD;
            int n6 = this.ag - 30;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.Char + n3 * this.aD;
            if (n5 - this.g <= this.Char + this.ah && n5 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n3 == this.ak ? 16383818 : 15196114);
                if (n3 == 5) {
                    en2.LoginScreen(n3 == this.ak ? 16776068 : 16765060);
                }
                en2.d(n4, n5, n6, n7);
                en2.LoginScreen(GameScreen.au, n8, n9, 0);
                if (n3 == 0) {
                    bl.b(en2, 567, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(T.eX) + " " + T.MyVector + ": " + ai.LoginScreen((long)Char.e().cr);
                    mFont.b.LoginScreen(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen((long)(Char.e().cr + 1000))) + " " + T.fi + ": " + T.eI + " " + Char.e().cx, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 1) {
                    bl.b(en2, 569, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(T.eY) + " " + T.MyVector + ": " + ai.LoginScreen((long)Char.e().cs);
                    mFont.b.LoginScreen(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen((long)(Char.e().cs + 1000))) + " " + T.fi + ": " + T.eI + " " + Char.e().cy, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 2) {
                    bl.b(en2, 568, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(T.eZ) + " " + T.MyVector + ": " + ai.LoginScreen((long)Char.e().cq);
                    mFont.b.LoginScreen(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen((long)(Char.e().cq * 100))) + " " + T.fi + ": " + T.eI + " " + Char.e().cz, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 3) {
                    bl.b(en2, 721, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(T.fa) + " " + T.MyVector + ": " + ai.LoginScreen((long)Char.e().ct);
                    mFont.b.LoginScreen(en2, string, n4 + 5, n5 + 3, 0);
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen((long)(500000 + Char.e().ct * 100000))) + " " + T.fi + ": " + T.eI + " " + Char.e().cA, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 4) {
                    bl.b(en2, 719, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(T.fc) + " " + T.MyVector + ": " + Char.e().cu + "%";
                    int n10 = Char.e().cu;
                    if (n10 > co.length - 1) {
                        n10 = co.length - 1;
                    }
                    long l2 = co[n10];
                    mFont.b.LoginScreen(en2, string, n4 + 5, n5 + 3, 0);
                    long l3 = l2;
                    mFont.m.LoginScreen(en2, String.valueOf(ds.b(l3)) + " " + T.fi + ": " + T.eI + " " + Char.e().cB, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 5) {
                    if (GameScreen != null) {
                        bl.b(en2, q, n8 + 4, n9 + 4, 0, 0);
                        String[] stringArray = mFont.k.LoginScreen(GameScreen, 120);
                        int n11 = 0;
                        while (n11 < stringArray.length) {
                            mFont.m.LoginScreen(en2, stringArray[n11], n4 + 5, n5 + 3 + n11 * 12, 0);
                            ++n11;
                        }
                    } else {
                        mFont.m.LoginScreen(en2, "", n4 + 5, n5 + 9, 0);
                    }
                }
                if (n3 >= 6) {
                    n7 = n3 - 6;
                    et et2 = Char.e().ax.b[n7];
                    bl.b(en2, et2.f, n8 + 4, n9 + 4, 0, 0);
                    bf bf2 = Char.e().LoginScreen(et2);
                    if (bf2 != null) {
                        mFont.b.LoginScreen(en2, et2.b, n4 + 5, n5 + 3, 0);
                        mFont.q.LoginScreen(en2, String.valueOf(T.cfr_renamed_0) + ": " + bf2.c, n4 + n6 - 5, n5 + 3, 1);
                        if (bf2.c == et2.c) {
                            mFont.m.LoginScreen(en2, T.fg, n4 + 5, n5 + 15, 0);
                        } else if (bf2.LoginScreen.c()) {
                            String string;
                            String string2 = String.valueOf(T.c) + ": ";
                            int n12 = mFont.m.LoginScreen(string2) + n4 + 5;
                            int n13 = n5 + 15;
                            mFont.m.LoginScreen(en2, string2, n4 + 5, n13, 0);
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
                            mFont.m.LoginScreen(en2, stringBuffer.append(string).append(")").toString(), n4 + n6 - 5, n13, 1);
                            en2.LoginScreen(7169134);
                            en2.d(n12, n13 += 4, 50, 5);
                            n4 = bf2.m * 50 / 1000;
                            en2.LoginScreen(11992374);
                            en2.d(n12, n13, n4, 5);
                        } else {
                            bf bf4 = et2.Item[bf2.c];
                            mFont.m.LoginScreen(en2, String.valueOf(T.cfr_renamed_0) + " " + (bf2.c + 1) + " " + T.SplashScreen + " " + ds.b(bf4.d) + " " + T.fi, n4 + 5, n5 + 15, 0);
                        }
                    } else {
                        bf bf5 = et2.Item[0];
                        String string = String.valueOf(T.mGraphics) + " " + ds.b(bf5.d) + " " + T.eF;
                        if (bf5.LoginScreen.LoginScreen == 24 || bf5.LoginScreen.LoginScreen == 25 || bf5.LoginScreen.LoginScreen == 26) {
                            string = String.valueOf(T.mGraphics) + " " + ds.b(bf5.d) + " " + T.go;
                        }
                        mFont.Item.LoginScreen(en2, et2.b, n4 + 5, n5 + 3, 0);
                        mFont.m.LoginScreen(en2, string, n4 + 5, n5 + 15, 0);
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void k(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < this.E.length) {
            int n3 = this.Char + n2 * this.aD;
            int n4 = this.aD - 1;
            if (n3 - this.g <= this.Char + this.ah && n3 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(this.ae, n3, this.ag, n4);
                mFont.b.LoginScreen(en2, this.E[n2], 5, n3 + 1, 0);
                mFont.o.LoginScreen(en2, this.F[n2], 5, n3 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void Res(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        String[] stringArray = c.b;
        String[] stringArray2 = c.c;
        int n2 = 0;
        while (n2 < stringArray2.length) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                mFont.o.LoginScreen(en2, String.valueOf(stringArray[n2]), n7 + 5, n4 + 6, 0);
                mFont.o.LoginScreen(en2, stringArray2[n2], n3 + n5 - 2, n4 + 6, 1);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void m(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int[] nArray = GameScreen.j().S;
        int[] nArray2 = GameScreen.j().T;
        int n2 = 0;
        while (n2 < nArray2.length) {
            int n3 = this.ae + 36;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.Char + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                en2.LoginScreen(this.cp[nArray2[n2]]);
                en2.b(n7, n8, 34, n9);
                if (nArray[n2] != -1) {
                    if (nArray2[n2] != 1) {
                        mFont.n.LoginScreen(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    } else {
                        mFont.o.LoginScreen(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    }
                    mFont.m.LoginScreen(en2, String.valueOf(GameScreen.j().U[n2]) + "/" + GameScreen.j().V[n2], n3 + 5, n4 + 6, 0);
                }
                if (GameScreen.j().Y[n2] != null) {
                    mFont.o.LoginScreen(en2, String.valueOf(GameScreen.j().Y[n2]) + "(Top " + GameScreen.j().W[n2] + ")", n3 + n5 - 2, n4 + 1, 1);
                    mFont.o.LoginScreen(en2, String.valueOf(GameScreen.j().Z[n2]) + "(Top " + GameScreen.j().X[n2] + ")", n3 + n5 - 2, n4 + 11, 1);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void n(mGraphics en2) {
        int n2;
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
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
            int n5 = this.Char + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.Char + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n7, n8, n9, n10);
            en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n4, n5, 24, n6);
            bl.b(en2, Char.e().aL[this.B][n2], n4 + 12, n5 + n6 / 2, 0, 3);
            String[] stringArray = mFont.o.LoginScreen(Char.e().aK[this.B][n2], 140);
            n5 = 0;
            while (n5 < stringArray.length) {
                mFont.o.LoginScreen(en2, stringArray[n5], n7 + 5, n8 + 1 + n5 * 11, 0);
                ++n5;
            }
            ++n2;
        }
        this.f(en2);
    }

    private void o(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        try {
            Item[] hArray = Char.e().aG;
            this.O = this.i(hArray.length);
            int n2 = hArray.length / 20 + (hArray.length % 20 > 0 ? 1 : 0);
            this.aF = this.ag / n2;
            int n3 = 0;
            while (n3 < this.O) {
                int n4 = this.ae + 36;
                int n5 = this.Char + n3 * this.aD;
                int n6 = this.ag - 36;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.Char + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.Char + this.ah && n5 - this.g >= this.Char - this.aD) {
                    if (n3 == 0) {
                        n6 = 0;
                        while (n6 < n2) {
                            n7 = n6 == this.bO && this.ak == 0 ? (GameCanvas.w % 10 < 7 ? -1 : 0) : 0;
                            en2.LoginScreen(n6 == this.bO ? 16383818 : 15723751);
                            en2.d(this.ae + n6 * this.aF, n5 + 9 + n7, this.aF - 1, 14);
                            mFont.o.LoginScreen(en2, "" + n6, this.ae + n6 * this.aF + this.aF / 2, this.Char + 11 + n7, 2);
                            ++n6;
                        }
                    } else {
                        int n11;
                        en2.LoginScreen(n3 == this.ak ? 16383818 : 15196114);
                        en2.d(n4, n5, n6, n7);
                        en2.LoginScreen(n3 == this.ak ? 9541120 : 9993045);
                        n6 = g.c(n3, this.bO);
                        Item h2 = hArray[n6];
                        if (h2 != null) {
                            n6 = 0;
                            while (n6 < h2.LoginScreen.length) {
                                byte by2;
                                if (h2.LoginScreen[n6].c.LoginScreen == 72 && h2.LoginScreen[n6].LoginScreen > 0 && (n11 = g.f(by2 = g.g(h2.LoginScreen[n6].LoginScreen))) != -1) {
                                    en2.LoginScreen(g.f(by2));
                                }
                                ++n6;
                            }
                        }
                        en2.b(n8, n9, 34, n10);
                        if (h2 != null) {
                            Object object = "";
                            mFont di2 = mFont.m;
                            if (h2.LoginScreen != null) {
                                n11 = 0;
                                while (n11 < h2.LoginScreen.length) {
                                    if (h2.LoginScreen[n11].c.LoginScreen == 72) {
                                        object = " [+" + h2.LoginScreen[n11].LoginScreen() + "]";
                                    }
                                    if (h2.LoginScreen[n11].c.LoginScreen == 41) {
                                        if (h2.LoginScreen[n11].LoginScreen == 1) {
                                            di2 = g.Item(0);
                                        } else if (h2.LoginScreen[n11].LoginScreen == 2) {
                                            di2 = g.Item(2);
                                        } else if (h2.LoginScreen[n11].LoginScreen == 3) {
                                            di2 = g.Item(8);
                                        } else if (h2.LoginScreen[n11].LoginScreen == 4) {
                                            di2 = g.Item(7);
                                        }
                                    }
                                    ++n11;
                                }
                            }
                            di2.LoginScreen(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                            String string = "";
                            if (h2.LoginScreen != null) {
                                if (h2.LoginScreen.length > 0 && h2.LoginScreen[0] != null) {
                                    string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                                }
                                object = mFont.q;
                                if (h2.A < 0 && h2.b.b != 5) {
                                    object = mFont.GameScreen;
                                }
                                if (h2.LoginScreen.length > 1) {
                                    int n12 = 1;
                                    while (n12 < h2.LoginScreen.length) {
                                        if (h2.LoginScreen[n12] != null && h2.LoginScreen[n12].c.LoginScreen != 102 && h2.LoginScreen[n12].c.LoginScreen != 107) {
                                            string = String.valueOf(string) + "," + h2.LoginScreen[n12].LoginScreen();
                                        }
                                        ++n12;
                                    }
                                }
                                ((mFont)object).LoginScreen(en2, string, n4 + 5, n5 + 11, 0);
                            }
                            bl.b(en2, h2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                            if (h2.LoginScreen != null) {
                                int n13 = 0;
                                while (n13 < h2.LoginScreen.length) {
                                    this.LoginScreen(en2, h2.LoginScreen[n13].c.LoginScreen, n8, n9, n10);
                                    ++n13;
                                }
                                n13 = 0;
                                while (n13 < h2.LoginScreen.length) {
                                    g.LoginScreen(en2, h2.LoginScreen[n13].c.LoginScreen, h2.LoginScreen[n13].LoginScreen, n8, n9, 34, n10);
                                    ++n13;
                                }
                            }
                            if (h2.Item > 1) {
                                mFont.n.LoginScreen(en2, "" + h2.Item, n8 + 34, n9 + n10 - mFont.n.LoginScreen(), 1);
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
        if (this.ak > cb.Res.size() + 1) {
            return null;
        }
        return (cb)cb.Res.elementAt(this.ak - 2);
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

    private void GameScreen(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
        if (this.bG.size() == 0) {
            mFont.m.LoginScreen(en2, T.ag, this.ae + this.ag / 2, this.Char + this.ah / 2 - mFont.k.LoginScreen() / 2 + 24, 2);
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.Char + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            if (n2 == 0) {
                en2.LoginScreen(15196114);
                en2.b(n3, n7, this.ag, n9);
                en2.LoginScreen(n2 == this.ak ? GameScreen.az : GameScreen.ay, this.ae + this.ag - 5, n7 + 2, cj.b);
                (n2 == this.ak ? mFont.g : mFont.f).LoginScreen(en2, this.au ? T.fw : T.fx, this.ae + this.ag - 22, n7 + 7, 2);
                mFont.o.LoginScreen(en2, this.au ? T.fz : T.fA, this.ae + 5, n7 + n9 / 2 - 4, 0);
            } else {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n6, n7, n8, n9);
                en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
                en2.b(n3, n4, 24, n5);
                r r2 = (r)this.bG.elementAt(n2 - 1);
                if (r2.c.bT != -1) {
                    bl.b(en2, r2.c.bT, n3, n4, 0, 0);
                } else {
                    RMS av2 = GameScreen.x[r2.c.bU];
                    bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n3 + av2.LoginScreen[Char.bC[0][0][0]].b, n4 + av2.LoginScreen[Char.bC[0][0][0]].c, 0, 0);
                }
                en2.e(this.ae, this.Char + this.g, this.ag, this.ah);
                mFont di2 = mFont.g;
                di2.LoginScreen(en2, r2.c.ag, n6 + 5, n7, 0);
                if (!r2.d) {
                    mFont.q.LoginScreen(en2, ds.LoginScreen(r2.LoginScreen, "|", 0)[2], n6 + 5, n7 + 11, 0);
                } else {
                    mFont.GameScreen.LoginScreen(en2, ds.LoginScreen(r2.LoginScreen, "|", 0)[2], n6 + 5, n7 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void q(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 26;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 26;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.Char + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
                en2.b(n7, n8, 24, n9);
                Item h2 = (Item)this.Y.elementAt(n2);
                if (h2 != null) {
                    mFont.m.LoginScreen(en2, h2.b.d, n3 + 5, n4 + 1, 0);
                    String string = "";
                    if (h2.LoginScreen != null && h2.LoginScreen.length > 0) {
                        if (h2.LoginScreen[0] != null && h2.LoginScreen[0].c.LoginScreen != 102 && h2.LoginScreen[0].c.LoginScreen != 107) {
                            string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                        }
                        mFont di2 = mFont.q;
                        di2.LoginScreen(en2, string, n3 + 5, n4 + 11, 0);
                        bl.b(en2, h2.b.f, n7 + 12, n8 + n9 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void r(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
        if (this.O == 0) {
            mFont.m.LoginScreen(en2, T.fE, this.ae + this.ag / 2, this.Char + this.ah / 2 - mFont.k.LoginScreen() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.Char + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n6, n7, n8, n9);
            en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n3, n4, 24, n5);
            r r2 = (r)this.X.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.b(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                RMS av2 = GameScreen.x[r2.c.bU];
                bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n3 + av2.LoginScreen[Char.bC[0][0][0]].b, n4 + 3 + av2.LoginScreen[Char.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.Char + this.g, this.ag, this.ah);
            if (r2.e) {
                mFont.Item.LoginScreen(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.q.LoginScreen(en2, r2.LoginScreen, n6 + 5, n7 + 11, 0);
            } else {
                mFont.o.LoginScreen(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.o.LoginScreen(en2, r2.LoginScreen, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void SessionReceiver(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
        if (this.O == 0) {
            mFont.m.LoginScreen(en2, T.bP, this.ae + this.ag / 2, this.Char + this.ah / 2 - mFont.k.LoginScreen() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.Char + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n6, n7, n8, n9);
            en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n3, n4, 24, n5);
            r r2 = (r)this.T.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.b(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                RMS av2 = GameScreen.x[r2.c.bU];
                bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n3 + av2.LoginScreen[Char.bC[0][0][0]].b, n4 + 3 + av2.LoginScreen[Char.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.Char + this.g, this.ag, this.ah);
            if (r2.e) {
                mFont.Item.LoginScreen(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.q.LoginScreen(en2, r2.LoginScreen, n6 + 5, n7 + 11, 0);
            } else {
                mFont.o.LoginScreen(en2, r2.c.ag, n6 + 5, n7, 0);
                mFont.o.LoginScreen(en2, r2.LoginScreen, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void MyHashtable(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < this.S.size()) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                de de2 = (de)this.S.elementAt(n2);
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                if (de2.GameScreen.equals("")) {
                    mFont.f.LoginScreen(en2, de2.b, this.ae + this.ag / 2, n4 + 6, 2);
                } else {
                    mFont.f.LoginScreen(en2, de2.b, this.ae + this.ag / 2, n4 + 1, 2);
                    mFont.f.LoginScreen(en2, de2.GameScreen, this.ae + this.ag / 2, n4 + 11, 2);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void u(mGraphics en2) {
        try {
            int n2;
            en2.e(this.ae, this.Char, this.ag, this.ah);
            en2.LoginScreen(-this.Item, -this.g);
            en2.LoginScreen(0);
            int n3 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
            if (this.O == 2) {
                mFont.m.LoginScreen(en2, this.ao, this.ae + this.ag / 2, this.Char + 24 + this.ah / 2 - mFont.k.LoginScreen() / 2, 2);
                if (this.am && this.R.size() == 1) {
                    n2 = 0;
                    while (n2 < T.ds.length) {
                        mFont.f.LoginScreen(en2, T.ds[n2], this.ae + this.ag / 2, this.Char + 24 + this.ah / 2 - T.ds.length * 12 / 2 + n2 * 12, 2);
                        ++n2;
                    }
                }
            }
            if (this.am) {
                this.O = cb.Res.size() + 2;
            }
            n2 = 0;
            while (n2 < this.O) {
                int n4 = this.ae;
                int n5 = this.Char + n2 * this.aD;
                int n6 = this.aD - 1;
                int n7 = this.ae + 24;
                int n8 = this.Char + n2 * this.aD;
                int n9 = this.ag - 24;
                int n10 = this.aD - 1;
                if (n8 - this.g <= this.Char + this.ah && n8 - this.g >= this.Char - this.aD) {
                    if (n2 == 0) {
                        n6 = 0;
                        while (n6 < this.cg.length) {
                            en2.LoginScreen(n6 == this.bN && n2 == this.ak ? 16383818 : 15723751);
                            en2.b(n3 + n6 * this.aE, n8, this.aE - 1, 23);
                            int n11 = 0;
                            while (n11 < this.cg[n6].length) {
                                mFont.o.LoginScreen(en2, this.cg[n6][n11], n3 + n6 * this.aE + this.aE / 2, this.Char + n11 * 11, 2);
                                ++n11;
                            }
                            ++n6;
                        }
                    } else if (n2 == 1) {
                        en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                        en2.b(this.ae, n8, this.ag, n10);
                        if (this.ch != null) {
                            mFont.f.LoginScreen(en2, this.ch, this.ae + this.ag / 2, n8 + 6, 2);
                        }
                    } else if (this.al) {
                        if (this.P != null && this.P.length != 0) {
                            en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                            en2.b(n7, n8, n9, n10);
                            en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
                            en2.b(n4, n5, 24, n6);
                            if (ak.LoginScreen(this.P[n2 - 2].b)) {
                                if (ak.LoginScreen((short)((short)this.P[n2 - 2].b)).c != null) {
                                    bl.LoginScreen(en2, ak.LoginScreen((short)((short)this.P[n2 - 2].b)).c[0], n4 + 12, n5 + n6 / 2, 0, cj.f);
                                }
                            } else {
                                ak ak2 = new ak();
                                new ak().LoginScreen = this.P[n2 - 2].b;
                                if (!ak.LoginScreen(ak2.LoginScreen)) {
                                    ak.LoginScreen(ak2);
                                }
                            }
                            String string = this.P[n2 - 2].c.length() > 17 ? String.valueOf(this.P[n2 - 2].c.substring(0, 17)) + "..." : this.P[n2 - 2].c;
                            mFont.g.LoginScreen(en2, string, n7 + 5, n8, 0);
                            mFont.q.LoginScreen(en2, this.P[n2 - 2].d, n7 + 5, n8 + 11, 0);
                            mFont.m.LoginScreen(en2, String.valueOf(this.P[n2 - 2].g) + "/" + this.P[n2 - 2].Item, n7 + n9 - 5, n8, 1);
                        }
                    } else if (this.an) {
                        e e2;
                        en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                        en2.b(n7, n8, n9, n10);
                        en2.LoginScreen(n2 == this.ak ? 9541120 : 9993045);
                        en2.b(n4, n5, 24, n6);
                        if ((e2 = this.Q != null ? (e)this.Q.elementAt((int)(n2 - 2)) : (e)this.R.elementAt((int)(n2 - 2))).c != -1) {
                            bl.b(en2, e2.c, n4, n5, 0, 0);
                        } else {
                            RMS av2 = GameScreen.x[e2.b];
                            bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, n4 + av2.LoginScreen[Char.bC[0][0][0]].b, n5 + 3 + av2.LoginScreen[Char.bC[0][0][0]].c, 0, 0);
                        }
                        en2.e(this.ae, this.Char + this.g, this.ag, this.ah);
                        mFont di2 = mFont.f;
                        if (e2.g == 0) {
                            di2 = mFont.LoginScreen;
                        } else if (e2.g == 1) {
                            di2 = mFont.Item;
                        } else if (e2.g == 2) {
                            di2 = mFont.g;
                        }
                        di2.LoginScreen(en2, e2.f, n7 + 5, n8, 0);
                        mFont.q.LoginScreen(en2, String.valueOf(T.da) + ": " + e2.Item, n7 + 5, n8 + 11, 0);
                        bl.b(en2, 7223, n7 + n9 - 7, n8 + 12, 0, 3);
                        mFont.m.LoginScreen(en2, "" + e2.Res, n7 + n9 - 15, n8 + 6, 1);
                    } else if (this.am && cb.Res.size() != 0) {
                        cb cb2 = (cb)cb.Res.elementAt(n2 - 2);
                        en2.LoginScreen(n2 == this.ak && cb2.k == null ? 16383818 : 15196114);
                        en2.b(n4, n5, n9 + 24, n10);
                        cb2.LoginScreen(en2, n4, n5);
                        if (cb2.k != null) {
                            int n12 = this.ae + this.ag - 2 - cb2.k.length * 40;
                            n4 = 0;
                            while (n4 < cb2.k.length) {
                                if (n4 == this.bN && n2 == this.ak) {
                                    en2.LoginScreen(GameScreen.az, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    mFont.g.LoginScreen(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                } else {
                                    en2.LoginScreen(GameScreen.ay, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    mFont.f.LoginScreen(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
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

    private void v(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        en2.LoginScreen(0);
        if (this.O == 0) {
            mFont.m.LoginScreen(en2, T.fr, this.ae + this.ag / 2, this.Char + this.ah / 2 - mFont.k.LoginScreen() / 2, 2);
            return;
        }
        if (Char.e().aE == null) {
            return;
        }
        if (Char.e().aE.length != this.O) {
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            ao ao2 = Char.e().aE[n2];
            en2.LoginScreen(n2 == this.ak && (!ao2.e && !ao2.d || ao2.e && ao2.d) ? 16383818 : 15196114);
            en2.b(n3, n4, n5, n6);
            if (ao2 != null) {
                if (!ao2.d) {
                    mFont.k.LoginScreen(en2, ao2.LoginScreen, n3 + 5, n4, 0);
                    mFont.r.LoginScreen(en2, String.valueOf(ao2.c) + " " + T.bF, n3 + n5 - 5, n4, 1);
                    mFont.GameScreen.LoginScreen(en2, ao2.b, n3 + 5, n4 + 11, 0);
                } else if (ao2.d && !ao2.e) {
                    mFont.k.LoginScreen(en2, ao2.LoginScreen, n3 + 5, n4, 0);
                    mFont.q.LoginScreen(en2, String.valueOf(T.fs) + ao2.c + " " + T.bF, n3 + 5, n4 + 11, 0);
                    if (n2 == this.ak) {
                        mFont.g.LoginScreen(en2, T.co, n3 + n5 - 20, n4 + 6, 2);
                        mFont.f.LoginScreen(en2, T.co, n3 + n5 - 20, n4 + 6, 2);
                    } else {
                        en2.LoginScreen(GameScreen.ay, n3 + n5 - 20, n4 + n6 / 2, cj.f);
                        mFont.f.LoginScreen(en2, T.co, n3 + n5 - 20, n4 + 6, 2);
                    }
                } else if (ao2.d && ao2.e) {
                    mFont.r.LoginScreen(en2, ao2.LoginScreen, n3 + 5, n4, 0);
                    mFont.r.LoginScreen(en2, ao2.b, n3 + 5, n4 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void w(mGraphics en2) {
        en2.LoginScreen(0xFF0000);
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        if (this.k.size() == 0) {
            if (this.ap != null) {
                int n2 = 0;
                while (n2 < this.ap.length) {
                    mFont.f.LoginScreen(en2, this.ap[n2], this.ae + this.ag / 2, this.Char + this.ah / 2 - this.ap.length * 14 / 2 + n2 * 14 + 5, 2);
                    ++n2;
                }
            }
            return;
        }
        int n3 = 0;
        while (n3 < this.k.size() + 1) {
            int n4 = this.ae + 36;
            int n5 = this.Char + n3 * this.aD;
            int n6 = this.ag - 36;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.Char + n3 * this.aD;
            int n10 = this.aD - 1;
            if (n5 - this.g <= this.Char + this.ah && n5 - this.g >= this.Char - this.aD) {
                if (n3 == this.k.size()) {
                    if (this.k.size() > 0) {
                        if (!GameCanvas.e && n3 == this.ak) {
                            en2.LoginScreen(16383818);
                            en2.b(n8, n5, this.ag, n7 + 2);
                        }
                        if (n3 == this.ak && this.Npc == 1 || !GameCanvas.e && n3 == this.ak) {
                            en2.LoginScreen(GameScreen.ax, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            mFont.g.LoginScreen(en2, T.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        } else {
                            en2.LoginScreen(GameScreen.T, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            mFont.f.LoginScreen(en2, T.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        }
                    }
                } else {
                    int n11;
                    en2.LoginScreen(n3 == this.ak ? 16383818 : 15196114);
                    en2.b(n4, n5, n6, n7);
                    en2.LoginScreen(n3 == this.ak ? 9541120 : 9993045);
                    Item h2 = (Item)this.k.elementAt(n3);
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.LoginScreen.length) {
                            byte by2;
                            if (h2.LoginScreen[n7].c.LoginScreen == 72 && h2.LoginScreen[n7].LoginScreen > 0 && (n11 = g.f(by2 = g.g(h2.LoginScreen[n7].LoginScreen))) != -1) {
                                en2.LoginScreen(g.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.b(n8, n9, 34, n10);
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.LoginScreen != null) {
                            n11 = 0;
                            while (n11 < h2.LoginScreen.length) {
                                if (h2.LoginScreen[n11].c.LoginScreen == 72) {
                                    object = " [+" + h2.LoginScreen[n11].LoginScreen + "]";
                                }
                                if (h2.LoginScreen[n11].c.LoginScreen == 41) {
                                    if (h2.LoginScreen[n11].LoginScreen == 1) {
                                        di2 = g.Item(0);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 2) {
                                        di2 = g.Item(2);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 3) {
                                        di2 = g.Item(8);
                                    } else if (h2.LoginScreen[n11].LoginScreen == 4) {
                                        di2 = g.Item(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.LoginScreen(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.LoginScreen != null) {
                            if (h2.LoginScreen.length > 0 && h2.LoginScreen[0] != null && h2.LoginScreen[0].c.LoginScreen != 102 && h2.LoginScreen[0].c.LoginScreen != 107) {
                                string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.LoginScreen.length > 1) {
                                int n12 = 1;
                                while (n12 < h2.LoginScreen.length) {
                                    if (h2.LoginScreen[n12] != null && h2.LoginScreen[n12].c.LoginScreen != 102 && h2.LoginScreen[n12].c.LoginScreen != 107) {
                                        string = String.valueOf(string) + "," + h2.LoginScreen[n12].LoginScreen();
                                    }
                                    ++n12;
                                }
                            }
                            ((mFont)object).LoginScreen(en2, string, n4 + 5, n5 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                        if (h2.LoginScreen != null) {
                            int n13 = 0;
                            while (n13 < h2.LoginScreen.length) {
                                this.LoginScreen(en2, h2.LoginScreen[n13].c.LoginScreen, n8, n9, n10);
                                ++n13;
                            }
                            n13 = 0;
                            while (n13 < h2.LoginScreen.length) {
                                g.LoginScreen(en2, h2.LoginScreen[n13].c.LoginScreen, h2.LoginScreen[n13].LoginScreen, n8, n9, 34, n10);
                                ++n13;
                            }
                        }
                        if (h2.Item > 1) {
                            mFont.n.LoginScreen(en2, "" + h2.Item, n8 + 34, n9 + n10 - mFont.n.LoginScreen(), 1);
                        }
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void x(mGraphics en2) {
        int n2;
        int n3;
        en2.LoginScreen(0xFF0000);
        Item[] hArray = Char.e().aH;
        Item[] hArray2 = Char.e().aF;
        this.O = this.i(hArray.length + hArray2.length);
        int n4 = (hArray.length + hArray2.length) / 20 + ((hArray.length + hArray2.length) % 20 > 0 ? 1 : 0);
        this.aF = this.ag / n4;
        int n5 = 0;
        while (n5 < n4) {
            n3 = n5 == this.bO && this.ak == 0 ? (GameCanvas.w % 10 < 7 ? -1 : 0) : 0;
            en2.LoginScreen(n5 == this.bO ? 16383818 : 15723751);
            en2.d(this.ae + n5 * this.aF, n3 + 89 - 10, this.aF - 1, 21);
            if (n5 == this.bO) {
                en2.LoginScreen(13524492);
                n2 = this.ae + n5 * this.aF;
                int n6 = n3 + 89 - 10 + 21;
                en2.d(n2, n6 - 3, this.aF - 1, 3);
            }
            mFont.o.LoginScreen(en2, "" + (n5 + 1), this.ae + n5 * this.aF + this.aF / 2, n3 + 91 - 10, 2);
            ++n5;
        }
        en2.e(this.ae, this.Char + 21, this.ag, this.ah - 21);
        en2.LoginScreen(0, -this.g);
        try {
            n5 = 1;
            while (n5 < this.O) {
                n3 = this.ae + 36;
                n2 = this.Char + n5 * this.aD;
                int n7 = this.ag - 36;
                int n8 = this.aD - 1;
                int n9 = this.ae;
                int n10 = this.Char + n5 * this.aD;
                int n11 = this.aD - 1;
                if (n2 - this.g <= this.Char + this.ah && n2 - this.g >= this.Char - this.aD) {
                    byte by2 = g.LoginScreen(n5, this.bO, Char.e().aH);
                    int n12 = g.c(n5, this.bO);
                    int n13 = g.b(n5, this.bO, Char.e().aH);
                    en2.LoginScreen(n5 == this.ak ? 16383818 : (by2 != 0 ? 15196114 : 15723751));
                    en2.b(n3, n2, n7, n8);
                    en2.LoginScreen(n5 == this.ak ? 9541120 : (by2 != 0 ? 9993045 : 11837316));
                    Item h2 = by2 != 0 ? hArray[n12] : hArray2[n13];
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.LoginScreen.length) {
                            if (h2.LoginScreen[n7].c.LoginScreen == 72 && h2.LoginScreen[n7].LoginScreen > 0 && (n12 = g.f(by2 = g.g(h2.LoginScreen[n7].LoginScreen))) != -1) {
                                en2.LoginScreen(g.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.b(n9, n10, 34, n11);
                    if (h2 != null && h2.f && GameCanvas.G.A == 12) {
                        en2.LoginScreen(n5 == this.ak ? 7040779 : 6047789);
                        en2.b(n9, n10, 34, n11);
                    }
                    if (h2 != null) {
                        Object object = "";
                        mFont di2 = mFont.m;
                        if (h2.LoginScreen != null) {
                            n12 = 0;
                            while (n12 < h2.LoginScreen.length) {
                                if (h2.LoginScreen[n12].c.LoginScreen == 72) {
                                    object = " [+" + h2.LoginScreen[n12].LoginScreen + "]";
                                }
                                if (h2.LoginScreen[n12].c.LoginScreen == 41) {
                                    if (h2.LoginScreen[n12].LoginScreen == 1) {
                                        di2 = g.Item(0);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 2) {
                                        di2 = g.Item(2);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 3) {
                                        di2 = g.Item(8);
                                    } else if (h2.LoginScreen[n12].LoginScreen == 4) {
                                        di2 = g.Item(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.LoginScreen(en2, String.valueOf(h2.b.d) + (String)object, n3 + 5, n2 + 1, 0);
                        String string = "";
                        if (h2.LoginScreen != null) {
                            if (h2.LoginScreen.length > 0 && h2.LoginScreen[0] != null && h2.LoginScreen[0].c.LoginScreen != 102 && h2.LoginScreen[0].c.LoginScreen != 107) {
                                string = String.valueOf(string) + h2.LoginScreen[0].LoginScreen();
                            }
                            object = mFont.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = mFont.GameScreen;
                            }
                            if (h2.LoginScreen.length > 1) {
                                int n14 = 1;
                                while (n14 < 2) {
                                    if (h2.LoginScreen[n14] != null && h2.LoginScreen[n14].c.LoginScreen != 102 && h2.LoginScreen[n14].c.LoginScreen != 107) {
                                        string = String.valueOf(string) + "," + h2.LoginScreen[n14].LoginScreen();
                                    }
                                    ++n14;
                                }
                            }
                            ((mFont)object).LoginScreen(en2, string, n3 + 5, n2 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n9 + 17, n10 + n11 / 2, 0, 3);
                        if (h2.LoginScreen != null) {
                            int n15 = 0;
                            while (n15 < h2.LoginScreen.length) {
                                this.LoginScreen(en2, h2.LoginScreen[n15].c.LoginScreen, n9, n10, n11);
                                ++n15;
                            }
                            n15 = 0;
                            while (n15 < h2.LoginScreen.length) {
                                g.LoginScreen(en2, h2.LoginScreen[n15].c.LoginScreen, h2.LoginScreen[n15].LoginScreen, n9, n10, 34, n11);
                                ++n15;
                            }
                        }
                        if (h2.Item > 1) {
                            mFont.n.LoginScreen(en2, "" + h2.Item, n9 + 34, n10 + n11 - mFont.n.LoginScreen(), 1);
                        }
                    }
                }
                ++n5;
            }
        }
        catch (Exception exception) {}
        this.f(en2);
    }

    private void Message(mGraphics en2) {
        if (this.A == 23 || this.A == 24) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.bS, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 20) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.aq, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 22) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.o, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 19) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.bU, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 18) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.bR, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 13 && this.equals(GameCanvas.H)) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.cn, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 12 && GameCanvas.H != null) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.cy, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 11) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.bN, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 16) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.bO, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 15) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, this.n, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 2 && GameCanvas.H != null) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.cd, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 9) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.ft, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 3) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.aH, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 26) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.D, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 14) {
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            mFont.f.LoginScreen(en2, T.fy, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 4) {
            mFont.f.LoginScreen(en2, T.cm, this.C + this.aE / 2, 59, 2);
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 7) {
            mFont.f.LoginScreen(en2, T.fu, this.C + this.aE / 2, 59, 2);
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 17) {
            mFont.f.LoginScreen(en2, T.fF, this.C + this.aE / 2, 59, 2);
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 8) {
            mFont.f.LoginScreen(en2, T.ae, this.C + this.aE / 2, 59, 2);
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 10) {
            mFont.f.LoginScreen(en2, T.fv, this.C + this.aE / 2, 59, 2);
            en2.LoginScreen(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.B == 3 && this.D.length != 4) {
            en2.LoginScreen(-this.Item, 0);
        }
        int n2 = 0;
        while (n2 < this.aY.length) {
            mFont di2;
            en2.LoginScreen(n2 == this.B ? 6805896 : 0xFFF0B0);
            bo.LoginScreen(en2, this.C + n2 * this.aE, 52, this.aE - 1, 25, n2 == this.B ? 1 : 0, true);
            if (n2 == this.cf) {
                en2.LoginScreen(ItemMap.f, this.C + n2 * this.aE + this.aE / 2, 62, 3);
            }
            mFont di3 = di2 = n2 == this.B ? mFont.m : mFont.o;
            if (!this.aY[n2][1].equals("")) {
                di2.LoginScreen(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 53, 2);
                di2.LoginScreen(en2, this.aY[n2][1], this.C + n2 * this.aE + this.aE / 2, 64, 2);
            } else {
                di2.LoginScreen(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 59, 2);
            }
            if (this.A == 0 && this.aY.length == 5 && GameScreen.aW && GameCanvas.w % 4 == 0) {
                en2.LoginScreen(ItemMap.f, this.C + 3 * this.aE + this.aE / 2, 77, 33);
            }
            ++n2;
        }
        en2.LoginScreen(13524492);
        en2.d(1, 78, this.d - 2, 1);
    }

    private static void z(mGraphics en2) {
        mFont.c.LoginScreen(en2, String.valueOf(T.ao) + " " + Config.VERSION, 60, 4, 0, mFont.f);
        mFont.n.LoginScreen(en2, String.valueOf(T.ap) + ": " + Char.e().ag, 60, 16, 0, mFont.o);
        String string = GameCanvas.I.LoginScreen.d().equals("") ? T.gk : GameCanvas.I.LoginScreen.d();
        mFont.n.LoginScreen(en2, String.valueOf(T.ar) + " " + ServerListScreen.LoginScreen[ServerListScreen.n] + ": " + string, 60, 27, 0, mFont.o);
    }

    private void A(mGraphics en2) {
        this.LoginScreen(en2, Char.e());
    }

    private void methodLoginScreen(mGraphics en2, Char af2) {
        mFont.c.LoginScreen(en2, String.valueOf(GameScreen.bX != 1 ? "" : "       ") + af2.ag, this.b + 60, 4, 0, mFont.f);
        if (GameScreen.bX == 1) {
            bl.b(en2, 5427, this.b + 55, 4, 0, 0);
        }
        if (af2.cC > 0) {
            mFont.n.LoginScreen(en2, T.fb, this.b + 60, 16, 0, mFont.o);
            en2.LoginScreen(GameScreen.aG, this.b + 95, 19, 0);
            int n2 = af2.bf * mGraphics.LoginScreen(GameScreen.aF) / af2.cC;
            en2.e(95, this.b + 19, n2, 20);
            en2.LoginScreen(GameScreen.aF, this.b + 95, 19, 0);
        }
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (af2.Message > 0L) {
            mFont.n.LoginScreen(en2, af2.aq ? af2.c() : af2.bj, this.b + 60, 27, 0, mFont.o);
        }
        mFont.n.LoginScreen(en2, String.valueOf(T.da) + ": " + ai.LoginScreen(af2.Message), this.b + 60, 38, 0, mFont.o);
    }

    public final int LoginScreen(Item h2) {
        if (h2 == null) {
            return -1;
        }
        if (h2.b()) {
            if (h2.LoginScreen == null) {
                return -1;
            }
            ee ee2 = h2.LoginScreen[0];
            if (ee2.c.LoginScreen == 22) {
                ee2.c = GameScreen.j().K[6];
                ee2.LoginScreen *= 1000;
            }
            if (ee2.c.LoginScreen == 23) {
                ee2.c = GameScreen.j().K[7];
                ee2.LoginScreen *= 1000;
            }
            Item h3 = null;
            int n2 = 0;
            while (n2 < Char.e().aH.length) {
                Item h4 = Char.e().aH[n2];
                if (ee2.c.LoginScreen == 22) {
                    ee2.c = GameScreen.j().K[6];
                    ee2.LoginScreen *= 1000;
                }
                if (ee2.c.LoginScreen == 23) {
                    ee2.c = GameScreen.j().K[7];
                    ee2.LoginScreen *= 1000;
                }
                if (h4 != null && h4.LoginScreen != null && h4.b.b == h2.b.b) {
                    h3 = h4;
                    break;
                }
                ++n2;
            }
            if (h3 == null) {
                ds.c("5");
                return ee2.LoginScreen;
            }
            n2 = h3 != null && h3.LoginScreen != null ? ee2.LoginScreen - h3.LoginScreen[0].LoginScreen : ee2.LoginScreen;
            return n2;
        }
        return 0;
    }

    private static void B(mGraphics en2) {
        mFont.c.LoginScreen(en2, T.aL[bv.r], 60, 4, 0);
        String string = "";
        if (bv.Res >= 135 && bv.Res <= 138) {
            string = " " + T.Res + bv.n;
        }
        mFont.n.LoginScreen(en2, String.valueOf(bv.k) + string, 60, 16, 0);
        mFont.c.LoginScreen(en2, String.valueOf(T.fq) + ": ", 60, 27, 0);
        if (GameScreen.w() >= 0 && GameScreen.w() <= bv.w.length - 1) {
            mFont.n.LoginScreen(en2, bv.w[GameScreen.w()], 60, 38, 0);
            return;
        }
        mFont.n.LoginScreen(en2, T.eq, 60, 38, 0);
    }

    private void C(mGraphics en2) {
        mFont.n.LoginScreen(en2, String.valueOf(T.eX) + ": " + Char.e().U + " / " + Char.e().V, this.b + 60, 2, 0, mFont.o);
        mFont.n.LoginScreen(en2, String.valueOf(T.eY) + ": " + Char.e().T + " / " + Char.e().W, this.b + 60, 14, 0, mFont.o);
        mFont.n.LoginScreen(en2, String.valueOf(T.eZ) + ": " + Char.e().X + ", " + T.fc + ": " + Char.e().P + "%", this.b + 60, 26, 0, mFont.o);
        mFont.n.LoginScreen(en2, String.valueOf(T.eW) + ": " + Char.e().cv + "%, " + T.eV + ": " + Char.e().cw + "%", this.b + 60, 38, 0, mFont.o);
    }

    private void D(mGraphics en2) {
        int n2;
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(-this.aL, -this.aM);
        en2.LoginScreen(aQ, this.ae, this.Char, 0);
        int n3 = Char.e().bU;
        RMS av2 = GameScreen.x[n3];
        bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, this.cz, this.cA + 5, 0, 3);
        int n4 = 2;
        if (this.cz <= 40) {
            n4 = 0;
        }
        if (this.cz >= 220) {
            n4 = 1;
        }
        mFont.d.LoginScreen(en2, bv.k, this.cz, this.cA - 12, n4, mFont.o);
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
            if (GameCanvas.w % 4 > 0) {
                en2.LoginScreen(ItemMap.f, this.ae + bA[bv.r][n5], this.Char + bB[bv.r][n5], 3);
            }
        }
        if (!GameCanvas.e) {
            en2.LoginScreen(i, this.cB, this.cC, cj.b);
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n6 = bA[bv.r][n2] + this.ae;
                int n7 = bB[bv.r][n2] + this.Char;
                if (ds.LoginScreen(n6 - 15, n7 - 15, 30, 30, this.cB, this.cC)) {
                    n4 = 2;
                    if (n6 <= 20) {
                        n4 = 0;
                    }
                    if (n6 >= 220) {
                        n4 = 1;
                    }
                    mFont.d.LoginScreen(en2, bv.w[bz[bv.r][n2]], n6, n7 - 12, n4, mFont.o);
                    break;
                }
                ++n2;
            }
        } else if (!this.bZ) {
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n8 = bA[bv.r][n2] + this.ae;
                int n9 = bB[bv.r][n2] + this.Char;
                if (ds.LoginScreen(n8 - 15, n9 - 15, 30, 30, this.ca, this.cb)) {
                    n4 = 2;
                    if (n8 <= 30) {
                        n4 = 0;
                    }
                    if (n8 >= 220) {
                        n4 = 1;
                    }
                    en2.LoginScreen(i, n8, n9, cj.b);
                    mFont.d.LoginScreen(en2, bv.w[bz[bv.r][n2]], n8, n9 - 12, n4, mFont.o);
                    break;
                }
                ++n2;
            }
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        if (n5 != -1) {
            if (bA[bv.r][n5] + this.ae < this.aL) {
                en2.LoginScreen(Mob.R, 0, 0, 9, 6, 5, this.ae + 5, this.Char + this.ah / 2 - 4, 0);
            }
            if (this.aL + this.ag < bA[bv.r][n5] + this.ae) {
                en2.LoginScreen(Mob.R, 0, 0, 9, 6, 6, this.ae + this.ag - 5, this.Char + this.ah / 2 - 4, cj.b);
            }
            if (bB[bv.r][n5] < this.aM) {
                en2.LoginScreen(Mob.R, 0, 0, 9, 6, 1, this.ae + this.ag / 2, this.Char + 5, cj.LoginScreen);
            }
            if (bB[bv.r][n5] > this.aM + this.ah) {
                en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.ae + this.ag / 2, this.Char + this.ah - 5, cj.c);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void E(mGraphics var1_1) {
        block39: {
            block30: {
                v0 = var2_2 = GameCanvas.B > 300 ? 20 : 15;
                if (g.ImageCache) {
                    GameScreen.j();
                    if (!GameScreen.e()) {
                        GameScreen.j();
                        if (!GameScreen.f()) {
                            var1_1.LoginScreen(this.cd == 1 ? GameScreen.ax : GameScreen.T, this.ae + this.ag / 2, this.Char + this.ah - var2_2, 3);
                            mFont.f.LoginScreen(var1_1, T.cm, this.ae + this.ag / 2, this.Char + this.ah - (var2_2 + 5), 2);
                        }
                    }
                }
                this.cs = this.ae + 5;
                this.cy = this.ct = this.Char + 14;
                var1_1.e(this.ae, this.Char, this.ag, this.ah - 35);
                if (this.ci != null) {
                    if (this.ci.d > 0) {
                        var1_1.LoginScreen(Mob.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.Char + 3, 0);
                    }
                    if (this.ci.d < this.ci.Res) {
                        var1_1.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.Char + this.ah - 45, 0);
                    }
                    var1_1.LoginScreen(0, -this.ci.d);
                }
                this.cw = 0;
                var3_3 = 0;
                if (Char.e().aD == null) break block30;
                var4_4 = 0;
                while (var4_4 < Char.e().aD.d.length) {
                    mFont.o.LoginScreen(var1_1, Char.e().aD.d[var4_4], this.ae + this.ag / 2, this.cy - 5 + var4_4 * 12, 2);
                    ++this.cw;
                    ++var4_4;
                }
                this.cy += (Char.e().aD.d.length - 1) * 12;
                var4_4 = 0;
                var6_6 = 0;
                while (var6_6 < Char.e().aD.f.length) {
                    block38: {
                        block31: {
                            block35: {
                                block37: {
                                    block32: {
                                        block36: {
                                            block33: {
                                                block34: {
                                                    if (Char.e().aD.f[var6_6] == null) break block31;
                                                    var4_4 = var6_6;
                                                    var5_8 = "- " + Char.e().aD.f[var6_6];
                                                    if (Char.e().aD.b[var6_6] == -1) break block32;
                                                    if (Char.e().aD.LoginScreen != var6_6) break block33;
                                                    if (Char.e().aD.b[var6_6] != 1) {
                                                        var5_8 = String.valueOf(var5_8) + " (" + Char.e().aD.Item + "/" + Char.e().aD.b[var6_6] + ")";
                                                    }
                                                    if (Char.e().aD.Item != Char.e().aD.b[var6_6]) break block34;
                                                    v1 = mFont.k;
                                                    v2 = var1_1;
                                                    v3 = var5_8;
                                                    v4 = this.cs;
                                                    v5 = 5;
                                                    break; // GOTO lbl94
                                                }
                                                var7_10 = mFont.o;
                                                if (var3_3 == 0) {
                                                    var3_3 = 1;
                                                    var7_10.LoginScreen(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                                } else {
                                                    var7_10.LoginScreen(var1_1, "- ...", this.cs + 5 + (var7_10 == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                                }
                                                break block35;
                                            }
                                            if (Char.e().aD.LoginScreen <= var6_6) break block36;
                                            if (Char.e().aD.b[var6_6] != 1) {
                                                var5_8 = String.valueOf(var5_8) + " (" + Char.e().aD.b[var6_6] + "/" + Char.e().aD.b[var6_6] + ")";
                                            }
                                            v1 = mFont.SessionReceiver;
                                            v2 = var1_1;
                                            v3 = var5_8;
                                            v4 = this.cs;
                                            v5 = 5;
                                            break; // GOTO lbl94
                                        }
                                        if (Char.e().aD.b[var6_6] != 1) {
                                            var5_8 = String.valueOf(var5_8) + " 0/" + Char.e().aD.b[var6_6];
                                        }
                                        var7_10 = mFont.o;
                                        if (var3_3 == 0) {
                                            var3_3 = 1;
                                            var7_10.LoginScreen(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                        } else {
                                            var7_10.LoginScreen(var1_1, "- ...", this.cs + 5 + (var7_10 == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                        }
                                        break block35;
                                    }
                                    if (Char.e().aD.LoginScreen <= var6_6) break block37;
                                    v1 = mFont.SessionReceiver;
                                    v2 = var1_1;
                                    v3 = var5_8;
                                    v4 = this.cs;
                                    v5 = 5;
                                    break; // GOTO lbl94
                                }
                                var7_10 = mFont.o;
                                if (var3_3 == 0) {
                                    var3_3 = 1;
                                    var7_10.LoginScreen(var1_1, var5_8, this.cs + 5 + ((var7_10 = mFont.q) == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                                } else {
                                    v1 = var7_10;
                                    v2 = var1_1;
                                    v3 = "- ...";
                                    v4 = this.cs + 5;
                                    v5 = var7_10 == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0;
lbl94:
                                    // 4 sources

                                    v1.LoginScreen(v2, v3, v4 + v5, this.cy += 12, 0);
                                }
                            }
                            ++this.cw;
                            break block38;
                        }
                        if (Char.e().aD.LoginScreen <= var6_6) {
                            var5_8 = "- " + Char.e().aD.f[var4_4];
                            var7_10 = mFont.o;
                            if (var3_3 == 0) {
                                var3_3 = 1;
                                var7_10 = mFont.q;
                            }
                            var7_10.LoginScreen(var1_1, var5_8, this.cs + 5 + (var7_10 == mFont.q && GameCanvas.w % 20 > 10 ? GameCanvas.w % 4 / 2 : 0), this.cy += 12, 0);
                        }
                    }
                    ++var6_6;
                }
                this.cy += 5;
                var6_6 = 0;
                while (var6_6 < Char.e().aD.e.length) {
                    mFont.m.LoginScreen(var1_1, Char.e().aD.e[var6_6], this.cs + 5, this.cy += 12, 0);
                    ++this.cw;
                    ++var6_6;
                }
                break block39;
            }
            var4_5 = GameScreen.w();
            var5_9 = GameScreen.x();
            if (var4_5 == -3 || var5_9 == -3) {
                var6_7 = T.aW[3];
            } else if (Char.e().aD == null && Char.e().L == 9 && Char.e().ax.LoginScreen == 0) {
                var6_7 = T.aZ;
            } else if (var5_9 >= 0 && var4_5 >= 0) {
                var6_7 = String.valueOf(T.aW[0]) + _do.BaseCanvas[var5_9].b + T.aW[1] + bv.w[var4_5] + T.aW[2];
            } else {
                return;
            }
            var7_11 = mFont.SessionReceiver.LoginScreen(var6_7, 150);
            var3_3 = 0;
            while (var3_3 < var7_11.length) {
                if (var3_3 == 0) {
                    this.cy = this.ct;
                    mFont.SessionReceiver.LoginScreen(var1_1, var7_11[var3_3], this.cs + 5, this.cy, 0);
                } else {
                    mFont.SessionReceiver.LoginScreen(var1_1, var7_11[var3_3], this.cs + 5, this.cy += 12, 0);
                }
                ++var3_3;
            }
        }
        if (this.ci == null) {
            this.ci = new dv();
            this.ci.LoginScreen(this.cw, 12, this.ae, this.Char, this.ag, this.ah - var2_2 - 40, true, 1);
        }
    }

    private void Z() {
        int n2 = 0;
        while (n2 < this.k.size()) {
            ((Item)this.k.elementAt((int)n2)).f = false;
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
        if (this.F() || bv.Res == 45) {
            Char.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            GameService.LoginScreen().LoginScreen((byte)3, -1, (byte)-1, -1);
        }
        bu.LoginScreen();
        GameScreen.GameService = true;
        bv.SessionReceiver = (byte)-1;
        aQ = null;
        System.gc();
        this.bP = false;
        this.cD = true;
        this.Z();
        v.LoginScreen();
        GameCanvas.H = null;
        GameCanvas.Res();
        GameCanvas.clearKeyHold();
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        this.LoginScreen = false;
        if ((Char.e().U <= 0L || Char.e().H == 14 || Char.e().H == 5) && Char.e().cH) {
            de de2;
            GameScreen.j().cn = de2 = new de(T.aX[0], 11038, GameScreen.j());
            Char.e().U = 0L;
        }
    }

    public final void A() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || bv.Res == 45) {
            Char.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            GameService.LoginScreen().LoginScreen((byte)3, -1, (byte)-1, -1);
        }
        if (this.A == 15) {
            GameService.LoginScreen().w(-1);
        }
        bu.LoginScreen();
        GameScreen.GameService = true;
        bv.SessionReceiver = (byte)-1;
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
                    this.Item = 0;
                }
            } else if (this.A == 18 || this.A == 19 || this.A == 20 || this.A == 21) {
                this.q();
                this.aK = 0;
                this.Item = 0;
            } else if (this.A == 8 || this.A == 11 || this.A == 16) {
                this.at();
                this.aK = 0;
                this.Item = 0;
            } else {
                this.cD = true;
            }
        } else {
            this.q();
            this.aK = 0;
            this.Item = 0;
        }
        v.LoginScreen();
        GameCanvas.H = null;
        GameCanvas.Res();
        GameCanvas.clearKeyHold();
        GameCanvas.W = false;
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        if ((Char.e().U <= 0L || Char.e().H == 14 || Char.e().H == 5) && Char.e().cH) {
            de de2;
            GameScreen.j().cn = de2 = new de(T.aX[0], 11038, GameScreen.j());
            Char.e().U = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void B() {
        block193: {
            if (this.o != null && this.o.b) {
                this.o.c();
                return;
            }
            if (this.cJ) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cJ = false;
                    this.o.LoginScreen.LoginScreen("");
                    this.o.Item = String.valueOf(T.fI) + " ";
                    this.o.LoginScreen.i = T.WeatherEffect;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.LoginScreen.c(1);
                    this.o.LoginScreen.b(10);
                    if (GameCanvas.e) {
                        this.o.LoginScreen.LoginScreen();
                    }
                }
                return;
            }
            if (this.cK) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cK = false;
                    this.o.LoginScreen.LoginScreen("");
                    this.o.Item = String.valueOf(T.fJ) + "  ";
                    this.o.LoginScreen.i = T.WeatherEffect;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.LoginScreen.c(1);
                    this.o.LoginScreen.b(10);
                    if (GameCanvas.e) {
                        this.o.LoginScreen.LoginScreen();
                    }
                }
                return;
            }
            if (this.ci != null) {
                this.ci.b();
            }
            if (this.j != null && this.j.k) {
                var1_1 = this.j;
                if (dr.f != null) {
                    dr.f.b();
                }
                if (var1_1.Item != var1_1.g) {
                    var1_1.i = var1_1.g - var1_1.Item << 2;
                    var1_1.j += var1_1.i;
                    var1_1.Item += var1_1.j >> 3;
                    var1_1.j &= 15;
                }
                if (Math.abs(var1_1.g - var1_1.Item) < 10) {
                    var1_1.Item = var1_1.g;
                }
                if (var1_1.Item >= var1_1.LoginScreen + var1_1.b - 10 && var1_1.g >= var1_1.LoginScreen + var1_1.b - 10) {
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
                    ((ba)g.at.elementAt((int)var1_2.cE)).d = true;
                    RMS.LoginScreen(String.valueOf(((ba)g.at.elementAt((int)var1_2.cE)).c), 1);
                    var2_4 = var1_2;
                    var3_11 = ((ba)g.at.elementAt((int)var2_4.cE)).b;
                    g.cF = mFont.o.LoginScreen((String)var3_11, var2_4.ag - 40);
                    var2_4.O = g.cF.length;
                    var2_4.aD = 16;
                    var2_4.ak = GameCanvas.e != false ? -1 : 0;
                    var2_4.aI = var2_4.O * var2_4.aD - var2_4.ah;
                    if (var2_4.aI < 0) {
                        var2_4.aI = 0;
                    }
                    if (var2_4.g < 0) {
                        var2_4.f = 0;
                        var2_4.g = 0;
                    }
                    if (var2_4.g > var2_4.aI) {
                        var2_4.g = var2_4.f = var2_4.aI;
                    }
                    var2_4.A = 24;
                    var2_4.c(0);
                    break;
                }
                case 21: {
                    var1_2 = this;
                    if (var1_2.B == 0) {
                        if (var1_2.ak == -1 || var1_2.ak > Char.f().aH.length - 1) break;
                        var2_5 = new MyVector("");
                        var1_2.bC = var3_11 = Char.f().aH[var1_2.ak];
                        if (var1_2.bC != null) {
                            var2_5.addElement(new de(T.dZ, var1_2, 2006, var1_2.bC));
                            GameCanvas.F.LoginScreen(var2_5, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.Char);
                            var1_2.b(var1_2.bC);
                        } else {
                            var1_2.ai = null;
                        }
                    }
                    if (var1_2.B == 1) {
                        var5_12 = var1_2;
                        if (var5_12.ak != -1) {
                            if (var5_12.ak == 5) {
                                GameCanvas.isLowGraphic(T.GameScreen, new de(T.ImageLoader, 888351), new de(T.bo, 2001));
                            } else {
                                GameService.LoginScreen().g((byte)var5_12.ak);
                                if (var5_12.ak < 4) {
                                    Char.f().A = (byte)var5_12.ak;
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
                        if (var1_2.B != 2) break; // GOTO lbl229
                        var3_11 = var1_2;
                        if (var3_11.ak < 0) break; // GOTO lbl229
                        if (Char.e().H != 14) break; // GOTO lbl116
                        GameCanvas.isLowGraphic(T.ex);
                        break; // GOTO lbl229
lbl116:
                        // 1 sources

                        if (var3_11.ak != 0 && var3_11.ak != 1 && var3_11.ak != 2 && var3_11.ak != 3 && var3_11.ak != 4 && var3_11.ak != 5) break; // GOTO lbl211
                        var5_13 = Char.e().Mob;
                        var2_6 = Char.e().cr;
                        var4_20 = Char.e().cs;
                        var7_22 = Char.e().cq;
                        var8_24 = Char.e().ct;
                        Char.e();
                        if (var3_11.ak != 0) break; // GOTO lbl144
                        if (var5_13 >= (long)(Char.e().cr + 1000)) break; // GOTO lbl128
                        GameCanvas.c(String.valueOf(T.eK) + Char.e().Mob + T.eL + (Char.e().cr + 1000));
                        break; // GOTO lbl229
lbl128:
                        // 1 sources

                        if (var5_13 <= (long)var2_6 || var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2)) break; // GOTO lbl131
                        GameCanvas.isLowGraphic(String.valueOf(T.eM) + (var2_6 + 1000) + T.eN + Char.e().cx + T.eO, new de(T.eJ, (b)var3_11, 9000, null), new de(T.bv, (b)var3_11, 4007, null));
                        break; // GOTO lbl229
lbl131:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new MyVector("");
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cx + T.eX + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cx + T.eX + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new MyVector("");
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cx + T.eX + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cx + T.eX + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 100 * Char.e().cx + T.eX + "\n" + "-" + ds.b((long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)), (b)var3_11, 9007, null));
                            GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                            super.d(var3_11.ak);
                        }
lbl144:
                        // 4 sources

                        if (var3_11.ak != 1) break; // GOTO lbl164
                        if (Char.e().Mob >= (long)(Char.e().cs + 1000)) break; // GOTO lbl148
                        GameCanvas.isLowGraphic(String.valueOf(T.eK) + Char.e().Mob + T.eL + (Char.e().cs + 1000));
                        break; // GOTO lbl229
lbl148:
                        // 1 sources

                        if (var5_13 <= (long)var4_20 || var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2)) break; // GOTO lbl151
                        GameCanvas.isLowGraphic(String.valueOf(T.eM) + (var4_20 + 1000) + T.eN + Char.e().cy + T.eP, new de(T.eJ, (b)var3_11, 9000, null), new de(T.bv, (b)var3_11, 4007, null));
                        break; // GOTO lbl229
lbl151:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new MyVector("");
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cy + T.eY + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cy + T.eY + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new MyVector("");
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cy + T.eY + "\n" + "-" + ds.b((long)(var4_20 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cy + T.eY + "\n" + "-" + ds.b((long)(10 * (2 * (var4_20 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 100 * Char.e().cy + T.eY + "\n" + "-" + ds.b((long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)), (b)var3_11, 9007, null));
                            GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                            super.d(var3_11.ak);
                        }
lbl164:
                        // 4 sources

                        if (var3_11.ak != 2) break; // GOTO lbl184
                        if (Char.e().Mob < (long)(Char.e().cq * Char.e().cD)) {
                            GameCanvas.isLowGraphic(String.valueOf(T.eK) + Char.e().Mob + T.eL + var7_22 * 100);
                        } else if (var5_13 > (long)var7_22 && var5_13 < (long)(10 * (var7_22 * 2 + 9) / 2 * Char.e().cD)) {
                            GameCanvas.isLowGraphic(String.valueOf(T.eM) + var7_22 * 100 + T.eN + Char.e().cz + T.eQ, new de(T.eJ, (b)var3_11, 9000, null), new de(T.bv, (b)var3_11, 4007, null));
                        } else {
                            if (var5_13 >= (long)(10 * (var7_22 * 2 + 9) / 2 * Char.e().cD) && var5_13 < (long)(100 * (var7_22 * 2 + 99) / 2 * Char.e().cD)) {
                                var11_25 = new MyVector("");
                                var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cz + "\n" + T.eZ + "\n" + "-" + ds.b((long)(var7_22 * 100)), (b)var3_11, 9000, null));
                                var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cz + "\n" + T.eZ + "\n" + "-" + ds.b((long)(10 * (var7_22 * 2 + 9) / 2 * Char.e().cD)), (b)var3_11, 9006, null));
                                GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                super.d(var3_11.ak);
                            }
                            if (var5_13 >= (long)(100 * (var7_22 * 2 + 99) / 2 * Char.e().cD)) {
                                var11_25 = new MyVector("");
                                var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + Char.e().cz + "\n" + T.eZ + "\n" + "-" + ds.b((long)(var7_22 * 100)), (b)var3_11, 9000, null));
                                var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 10 * Char.e().cz + "\n" + T.eZ + "\n" + "-" + ds.b((long)(10 * (var7_22 * 2 + 9) / 2 * Char.e().cD)), (b)var3_11, 9006, null));
                                var11_25.addElement(new de(String.valueOf(T.eJ) + "\n" + 100 * Char.e().cz + "\n" + T.eZ + "\n" + "-" + ds.b((long)(100 * (var7_22 * 2 + 99) / 2 * Char.e().cD)), (b)var3_11, 9007, null));
                                GameCanvas.F.LoginScreen(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                super.d(var3_11.ak);
                            }
lbl184:
                            // 4 sources

                            if (var3_11.ak == 3) {
                                if (Char.e().Mob < (long)(50000 + Char.e().ct * 1000)) {
                                    GameCanvas.isLowGraphic(String.valueOf(T.eK) + ai.LoginScreen(Char.e().Mob) + T.eL + ai.LoginScreen((long)(50000 + Char.e().ct * 1000)));
                                } else {
                                    var11_26 = 1L * (long)(2 * (var8_24 + 5)) / 2L * 100000L;
                                    var13_28 = 10L * (long)(2 * (var8_24 + 5) + 9) / 2L * 100000L;
                                    var15_30 = 100L * (long)(2 * (var8_24 + 5) + 99) / 2L * 100000L;
                                    T.eM = T.eJ;
                                    var2_7 = new MyVector("");
                                    var2_7.addElement(new de(String.valueOf(T.eM) + "\n" + "1 " + T.fa + "\n" + ds.b(var11_26), (b)var3_11, 9000, null));
                                    var2_7.addElement(new de(String.valueOf(T.eM) + "\n" + "10 " + T.fa + "\n" + ds.b(var13_28), (b)var3_11, 9006, null));
                                    var2_7.addElement(new de(String.valueOf(T.eM) + "\n" + "100 " + T.fa + "\n" + ds.b(var15_30), (b)var3_11, 9007, null));
                                    GameCanvas.F.LoginScreen(var2_7, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                    super.d(var3_11.ak);
                                }
                            } else if (var3_11.ak == 4) {
                                var13_29 = Char.e().cu;
                                if (var13_29 > g.co.length - 1) {
                                    var13_29 = g.co.length - 1;
                                }
                                if (Char.e().Mob < (var11_27 = g.co[var13_29])) {
                                    GameCanvas.isLowGraphic(String.valueOf(T.eK) + ds.b(Char.e().Mob) + T.eL + ds.b(var11_27));
                                } else {
                                    GameCanvas.isLowGraphic(String.valueOf(T.eM) + ds.LoginScreen(var11_27) + T.eN + Char.e().cB + T.eR, new de(T.eJ, (b)var3_11, 9000, null), new de(T.bv, (b)var3_11, 4007, null));
                                }
                            } else if (var3_11.ak == 5) {
                                GameService.LoginScreen().LoginScreen((byte)0);
                            }
                        }
                        break; // GOTO lbl229
lbl211:
                        // 1 sources

                        var5_14 = var3_11.ak - 6;
                        var6_31 = Char.e().ax.b[var5_14];
                        var2_8 = Char.e().LoginScreen((et)var6_31);
                        var4_21 = null;
                        var7_23 = new MyVector("");
                        if (var2_8 != null) {
                            if (var2_8.c == var6_31.c) {
                                var7_23.addElement(new de(T.cA, (b)var3_11, 9003, var2_8.LoginScreen));
                                var7_23.addElement(new de(T.bj, 2));
                            } else {
                                var4_21 = var6_31.Item[var2_8.c];
                                var7_23.addElement(new de(T.cy, (b)var3_11, 9002, var4_21));
                                var7_23.addElement(new de(T.cA, (b)var3_11, 9003, var2_8.LoginScreen));
                            }
                        } else {
                            var4_21 = var6_31.Item[0];
                            var7_23.addElement(new de(T.fl, (b)var3_11, 9004, var4_21));
                        }
                        GameCanvas.F.LoginScreen(var7_23, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                        super.LoginScreen((et)var6_31, var2_8, var4_21);
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
                                    if (Char.e().ai == null) {
                                        if (var3_11.ak == 0) {
                                            if (var3_11.bN == 0) {
                                                var6_31 = var3_11;
                                                var3_11.o.Item = T.dt;
                                                var6_31.o.LoginScreen.i = T.du;
                                                var6_31.o.g = "";
                                                var6_31.o.b = true;
                                                var6_31.o.LoginScreen.e = true;
                                                var6_31.o.LoginScreen.c(0);
                                                if (GameCanvas.e) {
                                                    var6_31.o.LoginScreen.LoginScreen();
                                                }
                                            } else if (var3_11.bN == 1) {
                                                bp.LoginScreen();
                                                var6_31 = var3_11;
                                                var3_11.o.Item = T.dw;
                                                var6_31.o.LoginScreen.i = T.dt;
                                                var6_31.o.g = "";
                                                var6_31.o.b = true;
                                                var6_31.o.LoginScreen.c(0);
                                                if (GameCanvas.e) {
                                                    var6_31.o.LoginScreen.LoginScreen();
                                                }
                                                GameService.LoginScreen().LoginScreen((byte)1, -1, (String)null);
                                            }
                                        } else if (var3_11.ak != -1) {
                                            if (var3_11.ak == 1) {
                                                if (var3_11.al) {
                                                    GameService.LoginScreen().LoginScreen("");
                                                } else if (var3_11.an && var3_11.bD != null) {
                                                    GameCanvas.isLowGraphic(String.valueOf(T.dy) + var3_11.bD.c, new de(T.ImageLoader, (b)var3_11, 4000, var3_11.bD), new de(T.bo, (b)var3_11, 4005, var3_11.bD));
                                                }
                                            } else if (var3_11.al) {
                                                var3_11.bD = super.Y();
                                                if (var3_11.bD != null) {
                                                    var5_15 = new MyVector("");
                                                    var5_15.addElement(new de(T.dA, (b)var3_11, 4000, var3_11.bD));
                                                    var5_15.addElement(new de(T.dB, (b)var3_11, 4001, var3_11.bD));
                                                    GameCanvas.F.LoginScreen(var5_15, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                                    super.LoginScreen(super.Y());
                                                }
                                            } else if (var3_11.an) {
                                                var3_11.bF = super.W();
                                                if (var3_11.bF != null) {
                                                    var5_16 = new MyVector("");
                                                    var5_16.addElement(new de(T.bj, (b)var3_11, 8000, var3_11.bD));
                                                    GameCanvas.F.LoginScreen(var5_16, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                                    GameCanvas.F.LoginScreen(var5_16, 0, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                                    super.LoginScreen(var3_11.bF);
                                                }
                                            }
                                        }
                                    } else if (var3_11.ak == 0) {
                                        if (var3_11.am) {
                                            if (var3_11.bN == 0) {
                                                if (var3_11.R.size() > 1) {
                                                    var6_31 = var3_11;
                                                    var3_11.o.Item = T.dv;
                                                    var6_31.o.LoginScreen.i = T.bq;
                                                    var6_31.o.g = "";
                                                    var6_31.o.b = true;
                                                    var6_31.o.LoginScreen.e = true;
                                                    var6_31.o.LoginScreen.c(0);
                                                    if (GameCanvas.e) {
                                                        var6_31.o.LoginScreen.LoginScreen();
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
                                                GameService.LoginScreen().LoginScreen(1, null, -1);
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
                                                var3_11.O = cb.Res.size() + 2;
                                                var3_11.v();
                                            }
                                            if (var3_11.bN == 1) {
                                                if (var3_11.R.size() > 1) {
                                                    GameService.LoginScreen().b();
                                                } else {
                                                    super.ai();
                                                }
                                            }
                                            if (var3_11.bN == 2) {
                                                if (var3_11.R.size() > 1) {
                                                    super.ai();
                                                } else {
                                                    GameService.LoginScreen().LoginScreen((byte)3, -1, (String)null);
                                                }
                                            }
                                            if (var3_11.bN == 3) {
                                                GameService.LoginScreen().LoginScreen((byte)3, -1, (String)null);
                                            }
                                        }
                                    } else if (var3_11.ak == 1) {
                                        if (var3_11.al) {
                                            GameService.LoginScreen().LoginScreen("");
                                        }
                                    } else if (var3_11.al) {
                                        var3_11.bD = super.Y();
                                        if (var3_11.bD != null) {
                                            var5_17 = new MyVector("");
                                            var5_17.addElement(new de(T.dB, (b)var3_11, 4001, var3_11.bD));
                                            GameCanvas.F.LoginScreen(var5_17, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                            super.LoginScreen(super.Y());
                                        }
                                    } else if (var3_11.an) {
                                        ds.c("TOI DAY 1");
                                        var3_11.bF = super.W();
                                        if (var3_11.bF != null) {
                                            var5_18 = new MyVector("");
                                            ds.c("TOI DAY 2");
                                            if (var3_11.Q != null) {
                                                var5_18.addElement(new de(T.bj, (b)var3_11, 8000, null));
                                                ds.c("TOI DAY 3");
                                            } else if (var3_11.R != null) {
                                                ds.c("TOI DAY 4");
                                                ds.c("my role= " + Char.e().aj);
                                                if (Char.e().J == var3_11.bF.LoginScreen || Char.e().aj == 2) {
                                                    var5_18.addElement(new de(T.bj, (b)var3_11, 8000, var3_11.bF));
                                                }
                                                if (Char.e().aj < 2 && Char.e().J != var3_11.bF.LoginScreen) {
                                                    if (var3_11.bF.g == 0 || var3_11.bF.g == 1) {
                                                        var5_18.addElement(new de(T.bj, (b)var3_11, 8000, var3_11.bF));
                                                    }
                                                    if (var3_11.bF.g == 2) {
                                                        var5_18.addElement(new de(T.dC, (b)var3_11, 5002, var3_11.bF));
                                                    }
                                                    if (Char.e().aj == 0) {
                                                        var5_18.addElement(new de(T.dD, (b)var3_11, 5001, var3_11.bF));
                                                        if (var3_11.bF.g == 1) {
                                                            var5_18.addElement(new de(T.dE, (b)var3_11, 5003, var3_11.bF));
                                                        }
                                                    }
                                                }
                                                if (Char.e().aj < var3_11.bF.g) {
                                                    var5_18.addElement(new de(T.dF, (b)var3_11, 5004, var3_11.bF));
                                                }
                                            }
                                            GameCanvas.F.LoginScreen(var5_18, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                            super.LoginScreen(var3_11.bF);
                                        }
                                    } else if (var3_11.am) {
                                        var3_11.bE = super.X();
                                        if (var3_11.bE != null) {
                                            if (var3_11.bE.b == 0) {
                                                var5_19 = new MyVector("");
                                                var5_19.addElement(new de(T.bj, (b)var3_11, 8000, var3_11.bE));
                                                GameCanvas.F.LoginScreen(var5_19, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.Char);
                                                super.LoginScreen(var3_11.bE);
                                            } else if (var3_11.bE.b == 1) {
                                                if (var3_11.bE.c != Char.e().J && var3_11.bN != -1) {
                                                    GameService.LoginScreen().d(var3_11.bE.LoginScreen);
                                                }
                                            } else if (var3_11.bE.b == 2 && var3_11.bE.k != null) {
                                                if (var3_11.bN == 0) {
                                                    GameService.LoginScreen().LoginScreen(var3_11.bE.LoginScreen, (byte)1);
                                                } else if (var3_11.bN == 1) {
                                                    GameService.LoginScreen().LoginScreen(var3_11.bE.LoginScreen, (byte)0);
                                                }
                                            }
                                        }
                                    }
                                    if (GameCanvas.e) {
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
                    GameCanvas.G.A();
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
                    var2_10 = new MyVector("");
                    if (var1_2.B < var1_2.aY.length - (GameCanvas.H != null ? 0 : 1) && var1_2.A != 17) {
                        var1_2.bC = Char.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC != null) {
                            if (var1_2.bC.Message) {
                                if (var1_2.bC.SessionReceiver > 0) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.SessionReceiver), var1_2, 3005, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 4) {
                                var2_10.addElement(new de(T.co, var1_2, 30001, var1_2.bC));
                                var2_10.addElement(new de(T.bk, var1_2, 30002, var1_2.bC));
                                var2_10.addElement(new de(T.cp, var1_2, 30003, var1_2.bC));
                            } else if (var1_2.bC.n == 0 && var1_2.bC.GameScreen == 0) {
                                if (var1_2.bC.j != 0L) {
                                    var2_10.addElement(new de(String.valueOf(T.ev) + "\n" + ds.LoginScreen(var1_2.bC.j) + " \n" + T.fi, var1_2, 3004, var1_2.bC));
                                } else {
                                    var2_10.addElement(new de(String.valueOf(T.co) + "\n" + T.Position, var1_2, 3000, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 8) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + T.bD, var1_2, 30001, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen > 0) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.GameScreen) + "\n" + T.bE, var1_2, 30002, var1_2.bC));
                                }
                            } else if (var1_2.bJ != 2) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + T.bD, var1_2, 3000, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen > 0) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.GameScreen) + "\n" + T.bE, var1_2, 3001, var1_2.bC));
                                }
                            } else {
                                if (var1_2.bC.n != -1) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + T.bD, var1_2, 10016, var1_2.bC));
                                }
                                if (var1_2.bC.GameScreen != -1) {
                                    var2_10.addElement(new de(String.valueOf(T.ew) + "\n" + ds.b((long)var1_2.bC.GameScreen) + "\n" + T.bE, var1_2, 10017, var1_2.bC));
                                }
                            }
                        }
                    } else if (var1_2.bJ == 0) {
                        if (var1_2.ak == 0) {
                            var1_2.LoginScreen(Char.e().aH.length + Char.e().aF.length, false);
                        } else {
                            var1_2.bC = null;
                            if (!g.LoginScreen(var1_2.ak, var1_2.bO, Char.e().aH)) {
                                var3_11 = Char.e().aF[g.b(var1_2.ak, var1_2.bO, Char.e().aH)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            } else {
                                var3_11 = Char.e().aH[g.c(var1_2.ak, var1_2.bO)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            }
                            if (var1_2.bC != null) {
                                var2_10.addElement(new de(T.eb, var1_2, 3002, var1_2.bC));
                            }
                        }
                    } else {
                        var1_2.bC = var1_2.A == 17 ? Char.e().aJ[4][var1_2.ak] : Char.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC.v == 0) {
                            if (var1_2.bC.LoginScreen(87)) {
                                var2_10.addElement(new de(T.fH, var1_2, 10013, var1_2.bC));
                            } else {
                                var2_10.addElement(new de(T.fG, var1_2, 10012, var1_2.bC));
                            }
                        } else if (var1_2.bC.v == 1) {
                            var2_10.addElement(new de(T.fK, var1_2, 10014, var1_2.bC));
                            var2_10.addElement(new de(T.fO, var1_2, 10018, var1_2.bC));
                        } else if (var1_2.bC.v == 2) {
                            var2_10.addElement(new de(T.fL, var1_2, 10015, var1_2.bC));
                        }
                    }
                    if (var1_2.bC != null) {
                        Char.e().LoginScreen(var1_2.bC.D, var1_2.bC.E, var1_2.bC.F, var1_2.bC.G);
                        GameCanvas.F.LoginScreen(var2_10, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.Char);
                        var1_2.b(var1_2.bC);
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
                    if (g.aQ != null) {
                        g.aQ = null;
                    }
                    bv.SessionReceiver = (byte)-1;
                    System.gc();
                    bl.LoginScreen();
                    var1_2.q();
                    var1_2.aK = 0;
                    var1_2.Item = 0;
                    break;
                }
                case 14: {
                    var1_2 = this;
                    var1_2.an();
                    break;
                }
                case 7: {
                    if (this.equals(GameCanvas.H) && GameCanvas.G.A == 2) {
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
                    this.Mob();
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
                    this.ImageCache();
                    break;
                }
                case 20: {
                    this.au();
                }
            }
        }
        var1_3 = 0;
        while (var1_3 < cb.Res.size()) {
            ((cb)cb.Res.elementAt(var1_3)).LoginScreen();
            ++var1_3;
        }
        this.ap();
    }

    private void Mob() {
        if (this.ak < -1) {
            return;
        }
        if (this.bI) {
            GameService.LoginScreen().LoginScreen(this.n, (byte)this.ak);
            return;
        }
        Object object = new MyVector("");
        ((MyVector)object).addElement(new de(T.aM[0], this, 9999, (q)this.W.elementAt(this.ak)));
        GameCanvas.F.LoginScreen((MyVector)object, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
        q q2 = (q)this.W.elementAt(this.ak);
        object = this;
        String string = "|0|1|" + q2.e;
        string = String.valueOf(string) + "\n|1|Top " + q2.Item;
        string = String.valueOf(string) + "\n|1|" + q2.f;
        string = String.valueOf(string) + "\n|2|" + q2.i;
        ((g)object).ai = new ae();
        super.LoginScreen(((g)object).ai, string);
        ((g)object).bL = new int[]{q2.LoginScreen, q2.d, q2.c};
        ((g)object).bC = null;
        ((g)object).cH = null;
    }

    private void ab() {
        Object object;
        if (this.B == 0 && this.equals(GameCanvas.G)) {
            this.ae();
            return;
        }
        if (this.B == 0 && this.equals(GameCanvas.H) || this.B == 2) {
            this.bC = this.equals(GameCanvas.H) ? (Item)GameCanvas.H.V.elementAt(this.ak) : (Item)GameCanvas.G.V.elementAt(this.ak);
            ds.c("toi day select= " + this.ak);
            object = new MyVector("");
            ((MyVector)object).addElement(new de(T.bj, this, 8000, this.bC));
            if (this.bC != null) {
                GameCanvas.F.LoginScreen((MyVector)object, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
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
                if (((g)object).o == null) {
                    ((g)object).o = new cq();
                    ((g)object).o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                    ((g)object).o.LoginScreen();
                    ((g)object).o.c = GameCanvas.G;
                }
                ((g)object).o.Item = T.ec;
                ((g)object).o.LoginScreen.i = T.WeatherEffect;
                ((g)object).o.g = "";
                ((g)object).o.b = true;
                ((g)object).o.LoginScreen.c(1);
                ((g)object).o.LoginScreen.b(10);
                if (GameCanvas.e) {
                    ((g)object).o.LoginScreen.LoginScreen();
                }
            } else if (this.ak == this.O - 2) {
                if (!this.aT) {
                    boolean bl2 = this.aS = !this.aS;
                    if (this.aS) {
                        GameService.LoginScreen().LoginScreen((byte)5, -1, (byte)-1, -1);
                    } else {
                        this.A();
                        bp.LoginScreen();
                        GameService.LoginScreen().LoginScreen((byte)3, -1, (byte)-1, -1);
                    }
                } else {
                    this.aT = false;
                }
            } else if (this.ak == this.O - 1) {
                if (this.aS && !this.aT && this.m) {
                    GameCanvas.isLowGraphic(T.eu, new de(T.ImageLoader, this, 7002, null), new de(T.bo, this, 4005, null));
                }
            } else {
                if (this.aS) {
                    return;
                }
                this.bC = (Item)GameCanvas.G.U.elementAt(this.ak);
                object = new MyVector("");
                ((MyVector)object).addElement(new de(T.bj, this, 8000, this.bC));
                if (this.bC != null) {
                    GameCanvas.F.LoginScreen((MyVector)object, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
                    this.b(this.bC);
                } else {
                    this.ai = null;
                }
            }
        }
        if (GameCanvas.e) {
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
                this.Npc = -1;
                this.ak = GameCanvas.e ? -1 : 0;
                bp.LoginScreen();
                GameService.LoginScreen().LoginScreen((byte)1, this.k);
                return;
            }
            if (this.ak > this.k.size() - 1) {
                return;
            }
            this.bC = (Item)GameCanvas.G.k.elementAt(this.ak);
            MyVector el2 = new MyVector("");
            el2.addElement(new de(T.dY, this, 6001, this.bC));
            if (this.bC != null) {
                GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
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
        if (Char.e().aE[this.ak].d && !Char.e().aE[this.ak].e) {
            if (!GameCanvas.e) {
                GameService.LoginScreen().b(this.ak);
                return;
            }
            if (GameCanvas.GameScreen > this.ae + this.ag - 40) {
                GameService.LoginScreen().b(this.ak);
            }
        }
    }

    private void ae() {
        ds.c("fire inventory");
        if (Char.e().H == 14) {
            GameCanvas.isLowGraphic(T.ex);
            return;
        }
        if (this.ak == -1) {
            return;
        }
        if (this.ak == 0) {
            this.LoginScreen(Char.e().aH.length + Char.e().aF.length, false);
            return;
        }
        this.bC = null;
        MyVector el2 = new MyVector("");
        if (!g.LoginScreen(this.ak, this.bO, Char.e().aH)) {
            Item h2 = Char.e().aF[g.b(this.ak, this.bO, Char.e().aH)];
            if (h2 != null) {
                this.bC = h2;
                if (GameCanvas.G.A == 12) {
                    el2.addElement(new de(T.ey, this, 6000, this.bC));
                } else if (GameCanvas.G.A == 13) {
                    el2.addElement(new de(T.ez, this, 7000, this.bC));
                } else if (h2.b()) {
                    el2.addElement(new de(T.bm, this, 2000, this.bC));
                    if (Char.e().bO) {
                        el2.addElement(new de(T.ea, this, 2005, this.bC));
                    }
                } else {
                    el2.addElement(new de(T.bm, this, 2001, this.bC));
                }
            }
        } else {
            Item h3 = Char.e().aH[g.c(this.ak, this.bO)];
            if (h3 != null) {
                this.bC = h3;
                el2.addElement(new de(T.dY, this, 2002, this.bC));
            }
        }
        if (this.bC != null) {
            Char.e().LoginScreen(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (GameCanvas.G.A != 12 && GameCanvas.G.A != 13) {
                if (this.bH == 0) {
                    el2.addElement(new de(T.dZ, this, 2003, this.bC));
                }
                if (this.bH == 1) {
                    el2.addElement(new de(T.eb, this, 3002, this.bC));
                }
            }
            GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
            this.b(this.bC);
            return;
        }
        this.ai = null;
    }

    private void Char() {
        this.A();
        if (aq.f == null || aq.f.size() == 0) {
            GameService.LoginScreen().b(0, -1);
        }
        aq.LoginScreen().b();
    }

    private void ag() {
        block36: {
            block35: {
                if (this.ak < 0) {
                    return;
                }
                if (bu.LoginScreen && this.ak == G.length - 1) {
                    GameService.LoginScreen().w();
                    return;
                }
                if (Char.e().bO) break block35;
                switch (this.ak) {
                    case 0: {
                        this.Char();
                        return;
                    }
                    case 1: {
                        GameService.LoginScreen().j(54);
                        return;
                    }
                    case 2: {
                        this.ah();
                        return;
                    }
                    case 3: {
                        GameService.LoginScreen().b((byte)0, (byte)-1);
                        bp.LoginScreen();
                        return;
                    }
                    case 4: {
                        if (Char.e().H == 14) {
                            GameCanvas.isLowGraphic(T.ex);
                            return;
                        }
                        GameService.LoginScreen().Item();
                        return;
                    }
                    case 5: {
                        GameCanvas.instance();
                        if (Char.e().Y() < 5) {
                            GameCanvas.isLowGraphic(T.eA);
                            return;
                        }
                        if (this.o == null) {
                            this.o = new cq();
                            this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                            this.o.LoginScreen();
                            this.o.c = GameCanvas.G;
                        }
                        this.o.Item = T.eB;
                        this.o.LoginScreen.i = T.bq;
                        this.o.g = "";
                        this.o.b = true;
                        this.o.LoginScreen.c(0);
                        if (GameCanvas.e) {
                            this.o.LoginScreen.LoginScreen();
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
                        x.g();
                        return;
                    }
                    case 9: {
                        if (GameCanvas.I.n) {
                            bu.LoginScreen();
                            bu.Item();
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
                    this.Char();
                    return;
                }
                case 1: {
                    GameService.LoginScreen().j(54);
                    return;
                }
                case 2: {
                    this.ah();
                    return;
                }
                case 3: {
                    g g2 = this;
                    bp.LoginScreen();
                    GameService.LoginScreen().MyHashtable();
                    g2.bM = 20;
                    return;
                }
                case 4: {
                    GameService.LoginScreen().b((byte)0, (byte)-1);
                    bp.LoginScreen();
                    return;
                }
                case 5: {
                    if (Char.e().H == 14) {
                        GameCanvas.isLowGraphic(T.ex);
                        return;
                    }
                    GameService.LoginScreen().Item();
                    return;
                }
                case 6: {
                    GameCanvas.instance();
                    if (Char.e().Y() < 5) {
                        GameCanvas.isLowGraphic(T.eA);
                        return;
                    }
                    if (this.o == null) {
                        this.o = new cq();
                        this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                        this.o.LoginScreen();
                        this.o.c = GameCanvas.G;
                    }
                    this.o.Item = T.eB;
                    this.o.LoginScreen.i = T.bq;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.LoginScreen.c(0);
                    if (!GameCanvas.e) break;
                    this.o.LoginScreen.LoginScreen();
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
                    x.g();
                    return;
                }
                case 10: {
                    if (!GameCanvas.I.n) break;
                    bu.LoginScreen();
                    bu.Item();
                }
            }
        }
    }

    private void ah() {
        this.O = at.size();
        this.aD = 24;
        this.ak = GameCanvas.e ? -1 : 0;
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
        this.o.Item = T.dx;
        this.o.LoginScreen.i = T.dx;
        this.o.g = "";
        this.o.b = true;
        this.o.LoginScreen.e = true;
        this.o.LoginScreen.c(0);
        if (GameCanvas.e) {
            this.o.LoginScreen.LoginScreen();
        }
    }

    public final void C() {
        if (this.j == null) {
            this.j = new dr();
        }
        this.j.m = this.o.LoginScreen.d();
        this.j.LoginScreen(false);
        this.o.b = false;
    }

    private void b(r r2) {
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = r2.e ? String.valueOf(string) + "|4|1|" + T.cN : String.valueOf(string) + "|3|1|" + T.cO;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + T.da + ": " + r2.LoginScreen;
        this.ai = new ae();
        this.LoginScreen(this.ai, string);
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
        MyVector el2 = new MyVector("");
        this.cG = this.ak;
        el2.addElement(new de(T.Session, this, 10000, (r)this.X.elementAt(this.cG)));
        el2.addElement(new de(T.bk, this, 10001, (r)this.X.elementAt(this.cG)));
        GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
        this.b((r)this.X.elementAt(this.ak));
    }

    private void ak() {
        if (this.ak < 0) {
            return;
        }
        if (this.T.size() == 0) {
            return;
        }
        MyVector el2 = new MyVector("");
        this.cG = this.ak;
        el2.addElement(new de(T.bq, this, 8001, (r)this.T.elementAt(this.cG)));
        el2.addElement(new de(T.bk, this, 8002, (r)this.T.elementAt(this.cG)));
        el2.addElement(new de(T.gn, this, 8004, (r)this.T.elementAt(this.cG)));
        GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
        this.b((r)this.T.elementAt(this.ak));
    }

    private void al() {
        if (this.ak < 0) {
            return;
        }
        MyVector el2 = new MyVector("");
        this.cG = this.ak;
        el2.addElement(new de(T.bR, this, 10030, null));
        el2.addElement(new de(T.bA, this, 10031, null));
        GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
    }

    private void am() {
        if (this.ak == 0) {
            this.au = !this.au;
            RMS.LoginScreen("viewchat", this.au ? 1 : 0);
            if (GameCanvas.e) {
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
        Object object = new MyVector("");
        this.cG = this.ak - 1;
        ((MyVector)object).addElement(new de(T.bq, this, 8001, (r)this.bG.elementAt(this.cG)));
        ((MyVector)object).addElement(new de(T.cP, this, 8003, (r)this.bG.elementAt(this.cG)));
        GameCanvas.F.LoginScreen((MyVector)object, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
        r r2 = (r)this.bG.elementAt(this.ak - 1);
        object = this;
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + ds.LoginScreen(r2.LoginScreen, "|", 0)[2];
        ((g)object).ai = new ae();
        super.LoginScreen(((g)object).ai, string);
        ((g)object).cH = r2.c;
        ((g)object).bC = null;
    }

    private void d(int n2) {
        String string = "";
        int n3 = 0;
        if (this.ak == 0) {
            n3 = Char.e().cr + 1000;
        }
        if (this.ak == 1) {
            n3 = Char.e().cs + 1000;
        }
        if (this.ak == 2) {
            n3 = Char.e().cq * Char.e().cD;
        }
        if (this.ak == 3) {
            n3 = 500000 + Char.e().ct * 100000;
        }
        string = String.valueOf(string) + "|5|2|" + T.bm + " " + n3 + " " + T.fi;
        if (n2 == 0) {
            string = String.valueOf(string) + "\n|5|2|" + T.fm;
        }
        if (n2 == 1) {
            string = String.valueOf(string) + "\n|5|2|" + T.fn;
        }
        if (n2 == 2) {
            string = String.valueOf(string) + "\n|5|2|" + T.fo;
        }
        if (n2 == 3) {
            string = String.valueOf(string) + "\n|5|2|" + T.fo;
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.bK = -1;
        this.ai = new ae();
        this.LoginScreen(this.ai, string);
    }

    private void an() {
        if (this.ak == -1) {
            return;
        }
        ds.c("FIRE ZONE");
        this.cI = true;
        GameCanvas.G.A();
    }

    public final void methodLoginScreen(int n2, int n3) {
        this.ai.d[this.ai.d.length - 1] = String.valueOf(T.cZ) + " " + n2 + "/" + n3;
    }

    private void ao() {
        if (this.ak < 0) {
            return;
        }
        this.bC = null;
        MyVector el2 = new MyVector("");
        if (this.B == 0 && !this.equals(GameCanvas.H)) {
            if (this.ak == 0) {
                this.LoginScreen(Char.e().aG.length, false);
            } else {
                byte by2 = (byte)g.c(this.ak, this.bO);
                Item h2 = Char.e().aG[by2];
                if (h2 != null) {
                    if (this.aj) {
                        el2.addElement(new de(T.dY, this, 1000, h2));
                        el2.addElement(new de(T.bm, this, 2010, h2));
                    } else if (h2.b()) {
                        el2.addElement(new de(T.dY, this, 1000, h2));
                    } else {
                        el2.addElement(new de(T.dY, this, 1000, h2));
                    }
                    this.bC = h2;
                }
            }
        }
        if (this.B == 1 || this.equals(GameCanvas.H)) {
            if (this.ak == 0) {
                this.LoginScreen(Char.e().aH.length + Char.e().aF.length, true);
            } else {
                Object object = Char.e().aH;
                boolean bl2 = g.LoginScreen(this.ak, this.bO, object);
                if (!bl2) {
                    byte by3 = (byte)g.b(this.ak, this.bO, object);
                    Item h3 = Char.e().aF[by3];
                    if (h3 != null) {
                        el2.addElement(new de(T.cC, this, 1001, h3));
                        if (h3.b()) {
                            el2.addElement(new de(T.bm, this, 2000, h3));
                        } else {
                            el2.addElement(new de(T.bm, this, 2001, h3));
                        }
                        this.bC = h3;
                    }
                } else {
                    object = Char.e().aH[g.c(this.ak, this.bO)];
                    if (object != null) {
                        el2.addElement(new de(T.cD, this, 1002, object));
                        this.bC = object;
                    }
                }
            }
        }
        if (this.bC != null) {
            Char.e().LoginScreen(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (this.aj) {
                el2.addElement(new de(T.dZ, this, 2011, this.bC));
            }
            GameCanvas.F.LoginScreen(el2, this.b, (this.ak + 1) * this.aD - this.g + this.Char);
            this.b(this.bC);
        } else {
            this.ai = null;
        }
        this.aI = this.O * this.aD - this.ah;
    }

    public final void methodLoginScreen(byte by2, String string, byte by3, byte by4) {
        GameCanvas.instance();
        co co2 = new co();
        new co().c = by2;
        co2.LoginScreen = by4;
        co2.b = by3;
        GameCanvas.isLowGraphic(string, new de(T.ImageLoader, this, 2004, co2), new de(T.bo, this, 4005, null));
    }

    public final void methodLoginScreen(byte by2, String string, short s2) {
        co co2 = new co();
        new co().c = by2;
        co2.LoginScreen = s2;
        GameCanvas.isLowGraphic(string, new de(T.ImageLoader, this, 3003, co2), new de(T.bo, this, 4005, null));
    }

    public final void methodLoginScreen(int n2, Object object) {
        eh eh2;
        eh eh3;
        Item h2;
        int n3;
        Object object2;
        if (n2 == 9999) {
            object2 = (q)object;
            GameService.LoginScreen().w(((q)object2).g);
        }
        if (n2 == 170391) {
            RMS.LoginScreen();
            if (mGraphics.b > 1) {
                RMS.LoginScreen("levelScreenKN", 1);
            } else {
                RMS.LoginScreen("levelScreenKN", 0);
            }
            GameMidlet.f.LoginScreen();
        }
        if (n2 == 6001) {
            object2 = (Item)object;
            ((Item)object).f = false;
            GameCanvas.G.k.removeElement(object2);
            if (GameCanvas.G.B == 0) {
                GameCanvas.G.o();
            }
        }
        if (n2 == 6000) {
            object2 = (Item)object;
            n3 = 0;
            while (n3 < GameCanvas.G.k.size()) {
                h2 = (Item)GameCanvas.G.k.elementAt(n3);
                if (h2.b.LoginScreen == ((Item)object2).b.LoginScreen) {
                    GameCanvas.isLowGraphic(T.ej);
                    return;
                }
                ++n3;
            }
            ((Item)object2).f = true;
            GameCanvas.G.k.addElement(object2);
            if (GameCanvas.G.B == 0) {
                GameCanvas.G.o();
            }
        }
        if (n2 == 7000) {
            if (this.aS) {
                GameCanvas.isLowGraphic(T.ek);
                return;
            }
            object2 = (Item)object;
            n3 = 0;
            while (n3 < GameCanvas.G.U.size()) {
                h2 = (Item)GameCanvas.G.U.elementAt(n3);
                if (h2.g == ((Item)object2).g) {
                    GameCanvas.isLowGraphic(T.ej);
                    return;
                }
                ++n3;
            }
            if (((Item)object2).Item > 1) {
                g g2 = this;
                if (g2.o == null) {
                    g2.o = new cq();
                    g2.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                    g2.o.LoginScreen();
                    g2.o.c = GameCanvas.G;
                }
                g2.o.Item = T.eg;
                g2.o.LoginScreen.i = T.eh;
                g2.o.g = "";
                g2.o.b = true;
                g2.o.LoginScreen.c(1);
                if (GameCanvas.e) {
                    g2.o.LoginScreen.LoginScreen();
                }
                return;
            }
            ((Item)object2).f = true;
            Item h3 = new Item();
            new Item().b = ((Item)object2).b;
            h3.LoginScreen = ((Item)object2).LoginScreen;
            h3.g = ((Item)object2).g;
            GameCanvas.G.U.addElement(h3);
            GameService.LoginScreen().LoginScreen((byte)2, -1, (byte)h3.g, h3.Item);
        }
        if (n2 == 7001) {
            object2 = (Item)object;
            ((Item)object).f = false;
            GameCanvas.G.U.removeElement(object2);
            if (GameCanvas.G.B == 1) {
                GameCanvas.G.LoginScreen(true);
            }
            GameService.LoginScreen().LoginScreen((byte)4, -1, (byte)((Item)object2).g, -1);
        }
        if (n2 == 7002) {
            this.aT = true;
            GameCanvas.instance();
            GameService.LoginScreen().LoginScreen((byte)7, -1, (byte)-1, -1);
            this.A();
        }
        if (n2 == 8003) {
            object2 = (r)object;
            GameService.LoginScreen().LoginScreen((byte)1, ((r)object2).c.J);
        }
        if (n2 == 8002) {
            object2 = (r)object;
            GameService.LoginScreen().LoginScreen((byte)2, ((r)object2).c.J);
        }
        if (n2 == 8004) {
            object2 = (r)object;
            GameService.LoginScreen().LoginScreen(((r)object2).c.J);
        }
        if (n2 == 8001) {
            ds.c("chat player");
            object2 = (r)object;
            if (this.o == null) {
                this.o = new cq();
                this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                this.o.LoginScreen();
                this.o.c = GameCanvas.G;
            }
            this.o.Item = T.cQ;
            this.o.LoginScreen.i = String.valueOf(T.cR) + " " + ((r)object2).c.ag;
            this.o.g = "";
            this.o.b = true;
            this.o.LoginScreen.e = true;
            this.o.LoginScreen.c(0);
            if (GameCanvas.e) {
                this.o.LoginScreen.LoginScreen();
            }
        }
        if (n2 == 1000) {
            GameService.LoginScreen().LoginScreen((byte)0, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 1001) {
            byte by2 = (byte)g.b(this.ak, this.bO, Char.e().aH);
            GameService.LoginScreen().LoginScreen(bj, by2);
        }
        if (n2 == 1003) {
            this.A();
        }
        if (n2 == 1002) {
            GameService.LoginScreen().LoginScreen(bk, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 2011) {
            GameService.LoginScreen().LoginScreen((byte)1, (byte)2, (byte)g.c(this.ak, this.bO), (short)-1);
        }
        if (n2 == 2010) {
            GameService.LoginScreen().LoginScreen((byte)0, (byte)2, (byte)g.c(this.ak, this.bO), (short)-1);
            Item h4 = (Item)object;
            if (h4 != null && (h4.b.LoginScreen == 193 || h4.b.LoginScreen == 194)) {
                GameCanvas.G.A();
            }
        }
        if (n2 == 2000) {
            Item[] hArray = Char.e().aH;
            byte by3 = (byte)g.b(this.ak, this.bO, hArray);
            GameService.LoginScreen().LoginScreen(bl, by3);
        }
        if (n2 == 2001) {
            ds.c("use item");
            Item h5 = (Item)object;
            boolean bl2 = g.LoginScreen(this.ak, this.bO, Char.e().aH);
            byte by4 = !bl2 ? (byte)g.b(this.ak, this.bO, Char.e().aH) : (byte)g.c(this.ak, this.bO);
            GameService.LoginScreen().LoginScreen((byte)0, (byte)(!bl2 ? 1 : 0), by4, (short)-1);
            if (h5.b.LoginScreen == 193 || h5.b.LoginScreen == 194) {
                GameCanvas.G.A();
            }
        }
        if (n2 == 2002) {
            GameService.LoginScreen().LoginScreen(bm, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 2003) {
            ds.c("remove item");
            boolean bl3 = g.LoginScreen(this.ak, this.bO, Char.e().aH);
            byte by5 = !bl3 ? (byte)g.b(this.ak, this.bO, Char.e().aH) : (byte)g.c(this.ak, this.bO);
            GameService.LoginScreen().LoginScreen((byte)1, (byte)(!bl3 ? 1 : 0), by5, (short)-1);
        }
        if (n2 == 2004) {
            GameCanvas.instance();
            co co2 = (co)object;
            byte by6 = (byte)co2.b;
            byte by7 = (byte)co2.LoginScreen;
            GameService.LoginScreen().LoginScreen((byte)(co2.c == 0 ? 3 : 2), by6, by7, (short)-1);
        }
        if (n2 == 2005) {
            byte by8 = (byte)g.b(this.ak, this.bO, Char.e().aH);
            GameService.LoginScreen().LoginScreen(ImageLoader, by8);
        }
        if (n2 == 2006) {
            Char.f();
            byte by9 = (byte)this.ak;
            GameService.LoginScreen().LoginScreen(bo, by9);
        }
        if (n2 == 30001) {
            ds.c("nhan do");
            GameService.LoginScreen().LoginScreen((byte)0, this.ak, 0);
        }
        if (n2 == 30002) {
            ds.c("xoa do");
            GameService.LoginScreen().LoginScreen((byte)1, this.ak, 0);
        }
        if (n2 == 30003) {
            ds.c("nhan tat");
            GameService.LoginScreen().LoginScreen((byte)2, this.ak, 0);
        }
        if (n2 == 3000) {
            ds.c("mua do");
            Item h6 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)0, (int)h6.b.LoginScreen, 0);
        }
        if (n2 == 3001) {
            Item h7 = (Item)object;
            GameCanvas.L.b();
            GameService.LoginScreen().LoginScreen((byte)1, (int)h7.b.LoginScreen, 0);
        }
        if (n2 == 3002) {
            GameCanvas.instance();
            boolean bl4 = g.LoginScreen(this.ak, this.bO, Char.e().aH);
            byte by10 = !bl4 ? (byte)g.b(this.ak, this.bO, Char.e().aH) : (byte)g.c(this.ak, this.bO);
            GameService.LoginScreen().LoginScreen((byte)0, (byte)(!bl4 ? 1 : 0), by10);
        }
        if (n2 == 3003) {
            GameCanvas.instance();
            co co3 = (co)object;
            GameService.LoginScreen().LoginScreen((byte)1, (byte)co3.c, (short)co3.LoginScreen);
        }
        if (n2 == 3004) {
            Item h8 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)3, (int)h8.b.LoginScreen, 0);
        }
        if (n2 == 3005) {
            ds.c("mua do");
            Item h9 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)3, (int)h9.b.LoginScreen, 0);
        }
        if (n2 == 4000 && (eh3 = (eh)object) != null) {
            GameCanvas.instance();
            GameService.LoginScreen().LoginScreen(2, null, eh3.LoginScreen);
        }
        if (n2 == 4001 && (eh2 = (eh)object) != null) {
            bp.LoginScreen();
            this.ao = T.aC;
            GameService.LoginScreen().e(eh2.LoginScreen);
        }
        if (n2 == 4005) {
            GameCanvas.instance();
        }
        if (n2 == 4007) {
            GameCanvas.instance();
        }
        if (n2 == 4006) {
            cb cb2 = (cb)object;
            GameService.LoginScreen().d(cb2.LoginScreen);
        }
        if (n2 == 5001) {
            e e2 = (e)object;
            GameService.LoginScreen().b(e2.LoginScreen, (byte)0);
        }
        if (n2 == 5002) {
            e e3 = (e)object;
            GameService.LoginScreen().b(e3.LoginScreen, (byte)1);
        }
        if (n2 == 5003) {
            e e4 = (e)object;
            GameService.LoginScreen().b(e4.LoginScreen, (byte)2);
        }
        if (n2 == 5004) {
            e e5 = (e)object;
            GameService.LoginScreen().b(e5.LoginScreen, (byte)-1);
        }
        if (n2 == 9000) {
            GameService.LoginScreen().LoginScreen(this.ak, 1);
            GameCanvas.instance();
            bp.LoginScreen();
        }
        if (n2 == 9006) {
            GameService.LoginScreen().LoginScreen(this.ak, 10);
            GameCanvas.instance();
            bp.LoginScreen();
        }
        if (n2 == 9007) {
            GameService.LoginScreen().LoginScreen(this.ak, 100);
            GameCanvas.instance();
            bp.LoginScreen();
        }
        if (n2 == 9002) {
            bf bf2 = (bf)object;
            if (bf2.LoginScreen.c()) {
                GameCanvas.isLowGraphic(T.b);
            } else {
                GameCanvas.isLowGraphic(String.valueOf(T.eS) + bf2.d + T.eT + bf2.Res + T.eU);
            }
        }
        if (n2 == 9003) {
            if (GameCanvas.e) {
                GameScreen.j();
                GameScreen.LoginScreen((et)object);
            } else {
                GameScreen.j();
                GameScreen.b((et)object);
            }
        }
        if (n2 == 9004) {
            bf bf3 = (bf)object;
            if (bf3.LoginScreen.c()) {
                GameCanvas.isLowGraphic(T.LoginScreen);
            } else {
                GameCanvas.isLowGraphic(String.valueOf(T.eS) + bf3.d + T.eT + bf3.Res + T.eU);
            }
        }
        if (n2 == 10000) {
            r r2 = (r)object;
            GameService.LoginScreen().b((byte)1, r2.c.J);
            GameCanvas.G.z();
        }
        if (n2 == 10001) {
            r r3 = (r)object;
            GameService.LoginScreen().b((byte)2, r3.c.J);
            bp.LoginScreen();
        }
        if (n2 == 10012) {
            if (this.o == null) {
                this.o = new cq();
                this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                this.o.LoginScreen();
                this.o.c = GameCanvas.H == null ? GameCanvas.G : GameCanvas.H;
            }
            this.o.LoginScreen.c(1);
            this.o.LoginScreen.LoginScreen("");
            if (this.bC.Item == 1) {
                this.o.Item = T.fI;
                this.o.LoginScreen.i = T.WeatherEffect;
            } else {
                this.o.Item = String.valueOf(T.eh) + " ";
                this.o.LoginScreen.i = T.eh;
            }
            this.o.LoginScreen.b(10);
            this.o.g = "";
            this.o.b = true;
            this.o.LoginScreen.c(1);
            if (GameCanvas.e) {
                this.o.LoginScreen.LoginScreen();
            }
        }
        if (n2 == 10013) {
            if (this.o == null) {
                this.o = new cq();
                this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                this.o.LoginScreen();
                this.o.c = GameCanvas.H == null ? GameCanvas.G : GameCanvas.H;
            }
            this.o.LoginScreen.c(1);
            this.o.LoginScreen.LoginScreen("");
            if (this.bC.Item == 1) {
                this.o.Item = T.fJ;
                this.o.LoginScreen.i = T.WeatherEffect;
            } else {
                this.o.Item = String.valueOf(T.eh) + "  ";
                this.o.LoginScreen.i = T.eh;
            }
            this.o.g = "";
            this.o.b = true;
            this.o.LoginScreen.c(1);
            if (GameCanvas.e) {
                this.o.LoginScreen.LoginScreen();
            }
        }
        if (n2 == 10014) {
            Item h10 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)1, h10.d, (byte)-1, -1, -1);
            bp.LoginScreen();
        }
        if (n2 == 10015) {
            Item h11 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)2, h11.d, (byte)-1, -1, -1);
            bp.LoginScreen();
        }
        if (n2 == 10016) {
            Item h12 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)3, h12.d, (byte)0, h12.n, -1);
            bp.LoginScreen();
        }
        if (n2 == 10017) {
            Item h13 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)3, h13.d, (byte)1, h13.GameScreen, -1);
            bp.LoginScreen();
        }
        if (n2 == 10018) {
            Item h14 = (Item)object;
            GameService.LoginScreen().LoginScreen((byte)5, h14.d, (byte)-1, -1, -1);
            bp.LoginScreen();
        }
        if (n2 == 10019) {
            Session.LoginScreen().e();
            RMS.LoginScreen("acc", "");
            RMS.LoginScreen("pass", "");
            GameCanvas.I.b.LoginScreen("");
            GameCanvas.I.LoginScreen.LoginScreen("");
            GameCanvas.I.n = false;
            GameCanvas.ak.b();
            GameCanvas.instance();
            this.A();
        }
        if (n2 == 10020) {
            GameCanvas.instance();
        }
        if (n2 == 10030) {
            GameService.LoginScreen().b((byte)1, (byte)this.ak);
            GameCanvas.G.z();
        }
        if (n2 == 10031) {
            Session.LoginScreen().e();
        }
        if (n2 == 11000) {
            GameService.LoginScreen().LoginScreen((byte)0, this.bC.d, (byte)1, this.bC.MyHashtable, 1);
            GameCanvas.instance();
        }
        if (n2 == 11001) {
            GameService.LoginScreen().LoginScreen((byte)0, this.bC.d, (byte)1, this.bC.MyHashtable, this.bC.i);
            GameCanvas.instance();
        }
        if (n2 == 11002) {
            this.o.b = false;
            GameCanvas.instance();
        }
    }

    public final void methodLoginScreen(String object, String object2) {
        if (this.o.LoginScreen.d() == null || this.o.LoginScreen.d().equals("") || ((String)object).equals("") || object == null) {
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(T.dt)) {
            bp.LoginScreen();
            this.o.b = false;
            GameService.LoginScreen().LoginScreen((String)object);
            return;
        }
        if (this.o.Item.equals(T.dv)) {
            bp.LoginScreen();
            this.o.b = false;
            GameService.LoginScreen().LoginScreen(0, (String)object, -1);
            return;
        }
        if (this.o.Item.equals(T.dw)) {
            if (this.o.LoginScreen.d() == "") {
                GameScreen.aD.LoginScreen(T.dG, 0);
                return;
            }
            if (this.j == null) {
                this.j = new dr();
            }
            this.j.m = this.o.LoginScreen.d();
            this.j.LoginScreen(false);
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(T.dx)) {
            if (this.o.LoginScreen.d() == "") {
                GameScreen.aD.LoginScreen(T.dH, 0);
                return;
            }
            GameService.LoginScreen().LoginScreen((byte)4, Char.e().ai.b, this.o.LoginScreen.d());
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(T.fY)) {
            try {
                int n2 = Integer.parseInt(this.o.LoginScreen.d());
                this.o.b = false;
                this.o.LoginScreen.c(0);
                this.A();
                if (this.o.LoginScreen.d().length() != 6 || this.o.LoginScreen.d().equals("")) {
                    GameCanvas.isLowGraphic(T.fZ);
                    return;
                }
                GameService.LoginScreen().x(n2);
                this.o.b = false;
                this.o.LoginScreen.c(0);
                this.A();
                return;
            }
            catch (Exception exception) {
                GameCanvas.isLowGraphic(T.R);
                return;
            }
        }
        if (this.o.Item.equals(T.eB)) {
            if (this.o.LoginScreen.d().equals("")) {
                return;
            }
            GameService.LoginScreen().e(this.o.LoginScreen.d());
            this.o.b = false;
            this.A();
            return;
        }
        if (this.o.Item.equals(T.cQ)) {
            this.o.b = false;
            object2 = null;
            if (this.A == 8) {
                object2 = (r)this.bG.elementAt(this.cG);
            } else if (this.A == 11) {
                object2 = (r)this.T.elementAt(this.cG);
            }
            if (((r)object2).c.J == Char.e().J) {
                return;
            }
            GameService.LoginScreen().LoginScreen((String)object, ((r)object2).c.J);
            return;
        }
        if (this.o.Item.equals(T.eg)) {
            int n3;
            try {
                n3 = Integer.parseInt(this.o.LoginScreen.d());
            }
            catch (Exception exception) {
                GameCanvas.isLowGraphic(T.ei);
                this.o.b = false;
                this.o.LoginScreen.c(0);
                return;
            }
            if (n3 <= 0 || n3 > this.bC.Item) {
                GameCanvas.isLowGraphic(T.ei);
                this.o.b = false;
                this.o.LoginScreen.c(0);
                return;
            }
            this.bC.f = true;
            object = new Item();
            new Item().b = this.bC.b;
            ((Item)object).Item = n3;
            ((Item)object).g = this.bC.g;
            ((Item)object).LoginScreen = this.bC.LoginScreen;
            GameCanvas.G.U.addElement(object);
            GameService.LoginScreen().LoginScreen((byte)2, -1, (byte)((Item)object).g, ((Item)object).Item);
            this.o.b = false;
            this.o.LoginScreen.c(0);
            return;
        }
        if (this.o.Item == T.ec) {
            int n4;
            try {
                n4 = Integer.parseInt(this.o.LoginScreen.d());
            }
            catch (Exception exception) {
                GameCanvas.isLowGraphic(T.ee);
                this.o.b = false;
                this.o.LoginScreen.c(0);
                return;
            }
            if ((long)n4 > Char.e().at) {
                GameCanvas.isLowGraphic(T.ef);
                this.o.b = false;
                this.o.LoginScreen.c(0);
                return;
            }
            this.aR = n4;
            GameService.LoginScreen().LoginScreen((byte)2, -1, (byte)-1, n4);
            this.o.b = false;
            this.o.LoginScreen.c(0);
            return;
        }
        if (this.o.Item.equals(T.fI)) {
            try {
                GameService.LoginScreen().LoginScreen((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.LoginScreen.d()), 1);
            }
            catch (Exception exception) {
                GameCanvas.isLowGraphic(T.ee);
            }
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(String.valueOf(T.fI) + " ")) {
            try {
                GameService.LoginScreen().LoginScreen((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.LoginScreen.d()), this.bC.i);
            }
            catch (Exception exception) {
                GameCanvas.isLowGraphic(T.ee);
            }
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(T.fJ)) {
            this.e(0);
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(String.valueOf(T.fJ) + "  ")) {
            this.e(1);
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(String.valueOf(T.eh) + " ")) {
            this.bC.i = Integer.parseInt(this.o.LoginScreen.d());
            if (this.bC.i > this.bC.Item) {
                GameCanvas.isLowGraphic(T.ei);
                return;
            }
            this.cJ = true;
            this.o.b = false;
            return;
        }
        if (this.o.Item.equals(String.valueOf(T.eh) + "  ")) {
            this.bC.i = Integer.parseInt(this.o.LoginScreen.d());
            if (this.bC.i > this.bC.Item) {
                GameCanvas.isLowGraphic(T.ei);
                return;
            }
            this.cK = true;
            this.o.b = false;
        }
    }

    public final void D() {
        this.o.LoginScreen.c(0);
    }

    public final void b(int n2) {
        this.cX = n2;
        this.cM = 90;
        if (this.cX == 0) {
            this.cQ = 5;
            this.cO = 90;
            this.cN = 90;
            this.cW = 2;
            n2 = 0;
            while (n2 < this.k.size()) {
                Item h2 = (Item)this.k.elementAt(n2);
                if (h2 != null) {
                    if (h2.b.b == 14) {
                        this.de = h2.b.f;
                    } else {
                        this.aA = h2.b.f;
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
                Item h3 = (Item)this.k.elementAt(n2);
                if (h3 != null) {
                    if (n2 == 0) {
                        this.aA = h3.b.f;
                    } else {
                        this.de = h3.b.f;
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
                Item h4 = (Item)this.k.elementAt(n2);
                if (h4 != null) {
                    this.aA = h4.b.f;
                }
                ++n2;
            }
        } else if (this.cX == 3) {
            this.ax = GameCanvas.C;
            this.ay = GameCanvas.D;
            this.cQ = 1;
            this.cO = 1;
            this.cN = 1;
            this.cW = 4;
            n2 = 0;
            while (n2 < this.k.size()) {
                Item h5 = (Item)this.k.elementAt(n2);
                if (h5 != null) {
                    this.aA = h5.b.f;
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
                Item h6 = (Item)this.k.elementAt(n2);
                if (h6 != null) {
                    this.df[n2] = h6.b.f;
                }
                ++n2;
            }
        }
        this.cR = 1;
        this.db = true;
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
        this.LoginScreen(this.T, T.B);
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
                    if (this.RMS != -1) {
                        if (this.cX == 3) {
                            if (GameCanvas.w % 10 == 0) {
                                ea ea2 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                                ei.LoginScreen(ea2);
                                --this.cW;
                            }
                        } else {
                            if (GameCanvas.w % 2 == 0) {
                                if (this.db) {
                                    if (this.cR < 40) {
                                        this.cR += 2;
                                    }
                                } else if (this.cR > 10) {
                                    this.cR -= 2;
                                }
                            }
                            if (this.cZ == 0) {
                                if (this.db) {
                                    if (this.cM > 0) {
                                        this.cM -= 5;
                                    } else if (GameCanvas.w % 10 == 0) {
                                        this.db = false;
                                        --this.cW;
                                        this.cZ = 5;
                                        this.da = 10;
                                    }
                                } else if (this.cM < 90) {
                                    this.cM += 5;
                                } else if (GameCanvas.w % 10 == 0) {
                                    this.db = true;
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
                } else if (GameCanvas.w % 20 == 0) {
                    this.dc = true;
                }
                if (GameCanvas.w % 20 == 0) {
                    if (this.cX != 3) {
                        ax.LoginScreen(132, this.ax, this.ay, 2);
                    }
                    ax.LoginScreen(114, this.ax, this.ay + 20, 2);
                    return;
                }
            } else if (this.dc) {
                if (this.RMS == 1) {
                    if (this.da == 10) {
                        ea ea3 = new ea(22, this.ax - 3, this.ay + 25, 4, 1, 1);
                        ei.LoginScreen(ea3);
                    }
                    --this.da;
                    if (this.da < 0) {
                        this.da = 0;
                    }
                    if (this.cM < 300) {
                        this.cM = ds.g(this.cM + 10);
                        if (this.cM == 20) {
                            this.LoginScreen(this.T, T.C);
                        }
                    } else if (GameCanvas.w % 20 == 0) {
                        if (GameCanvas.A > 2 * ab) {
                            GameCanvas.H = new g();
                            GameCanvas.H.M[7] = new String[][]{{""}};
                            GameCanvas.H.f();
                            GameCanvas.H.SessionReceiver();
                        }
                        this.RMS = (byte)-1;
                        this.az = true;
                        if (this.cX == 4) {
                            GameCanvas.G.z();
                        }
                    }
                    this.aq();
                    return;
                }
                if (this.RMS == 0) {
                    if (this.da == 10) {
                        if (this.cX == 2) {
                            ea ea4 = new ea(20, this.ax - 3, this.ay + 15, 4, 2, 1);
                            ei.LoginScreen(ea4);
                        } else {
                            ea ea5 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                            ei.LoginScreen(ea5);
                        }
                        this.LoginScreen(this.T, T.E);
                        this.dd = false;
                    }
                    if (!this.dd) {
                        --this.da;
                        if (this.da < -50) {
                            this.da = -50;
                            if (this.cX < 3 && GameCanvas.A > 2 * ab) {
                                GameCanvas.H = new g();
                                GameCanvas.H.M[7] = new String[][]{{""}};
                                GameCanvas.H.f();
                                GameCanvas.H.SessionReceiver();
                            }
                            this.RMS = (byte)-1;
                            this.az = true;
                            if (this.cX == 4) {
                                GameCanvas.G.z();
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
            this.cT[n2] = ds.g(this.cM * ds.LoginScreen(this.cN) / 1024);
            this.cS[n2] = ds.g(this.cM * ds.b(this.cN) / 1024);
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

    private void methodLoginScreen(int n2, String string) {
        if (this.cX < 3) {
            int n3 = 0;
            while (n3 < GameScreen.G.size()) {
                _do do_ = (_do)GameScreen.G.elementAt(n3);
                if (do_.df.LoginScreen == n2) {
                    do_.LoginScreen(string);
                }
                ++n3;
            }
        }
    }

    private void ar() {
        this.A = 19;
        this.c(0);
        g g2 = this;
        bu.LoginScreen();
        bu.g();
        g2.O = H.length;
        g2.aD = 24;
        g2.ak = GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.Item = 0;
    }

    private void F(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < H.length) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.LoginScreen(en2, H[n2], this.ae + 25, n4 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void ImageCache() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                bu.LoginScreen().b();
                return;
            }
            case 1: {
                bu.LoginScreen().e();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bu.LoginScreen().d();
                return;
            }
            case 4: {
                bu.LoginScreen().c();
            }
        }
    }

    private void at() {
        this.A = 20;
        this.c(0);
        g g2 = this;
        if (Res.clientType == 5) {
            ba = new String[]{T.fX, T.bN, T.bO, T.ae};
            if (GameScreen.bk) {
                ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.o};
            }
        } else {
            ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.fT};
            if (GameScreen.bk) {
                ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.fT, T.o};
            }
            if ((Res.clientType == 2 || Res.clientType == 7) && T.fB != 2) {
                ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.fT};
                if (GameScreen.bk) {
                    ba = new String[]{T.fX, T.bN, T.bO, T.ae, T.fT, T.o};
                }
            }
        }
        g2.O = ba.length;
        g2.aD = 24;
        g2.ak = GameCanvas.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.Item = 0;
    }

    private void G(mGraphics en2) {
        en2.e(this.ae, this.Char, this.ag, this.ah);
        en2.LoginScreen(0, -this.g);
        int n2 = 0;
        while (n2 < ba.length) {
            int n3 = this.ae;
            int n4 = this.Char + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.Char + this.ah && n4 - this.g >= this.Char - this.aD) {
                en2.LoginScreen(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                mFont.f.LoginScreen(en2, ba[n2], this.ae + this.ag / 2, n4 + 6, 2);
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
                GameCanvas.instance();
                if (this.o == null) {
                    this.o = new cq();
                    this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                    this.o.LoginScreen();
                    this.o.c = GameCanvas.G;
                }
                this.o.LoginScreen.LoginScreen("");
                this.o.Item = T.fY;
                this.o.LoginScreen.i = T.fY;
                this.o.g = "";
                this.o.b = true;
                this.o.LoginScreen.e = true;
                this.o.LoginScreen.c(1);
                if (!GameCanvas.e) break;
                this.o.LoginScreen.LoginScreen();
                return;
            }
            case 1: {
                GameService.LoginScreen().LoginScreen((byte)0, -1);
                bp.LoginScreen();
                return;
            }
            case 2: {
                GameService.LoginScreen().b((byte)0, -1);
                bp.LoginScreen();
                return;
            }
            case 3: {
                this.Res();
                if (this.o != null) break;
                this.o = new cq();
                this.o.LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
                this.o.LoginScreen();
                this.o.c = GameCanvas.G;
                return;
            }
            case 4: {
                if (T.fB == 2) {
                    Object object = "http://dragonball.indonaga.com/coda/?username=" + GameCanvas.I.LoginScreen.d();
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
                if (Char.e().aD.c <= 10) {
                    GameCanvas.isLowGraphic(T.fU);
                    return;
                }
                LoginScreen.LoginScreen().b();
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
        this.RMS();
        this.B = 0;
    }

    private void RMS() {
        this.aD = 24;
        this.O = Char.e().aK[this.B].length;
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
        this.ak = GameCanvas.e ? -1 : 0;
    }

    public final boolean F() {
        return this.A == 1;
    }

    private void e(int n2) {
        try {
            this.bC.MyHashtable = Integer.parseInt(this.o.LoginScreen.d());
        }
        catch (Exception exception) {
            GameCanvas.isLowGraphic(T.ee);
            this.o.b = false;
            return;
        }
        de de2 = new de(T.ImageLoader, this, n2 == 0 ? 11000 : 11001, null);
        de de3 = new de(T.bo, this, 11002, null);
        GameCanvas.isLowGraphic(T.f, de2, de3);
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

    private static byte g(int n2) {
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

    private static mFont Item(int n2) {
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
                di2 = mFont.Item;
                break;
            }
            case 2: {
                di2 = mFont.b;
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
                di2 = mFont.LoginScreen;
                break;
            }
            case 8: {
                di2 = mFont.d;
            }
        }
        return di2;
    }

    private void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5) {
        if (n2 == 34) {
            if (this.dj != null) {
                en2.LoginScreen(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = Res.loadImage("/mainImage/o_0.png");
            }
            if (this.dk != null) {
                en2.LoginScreen(this.dk, n3, n4 + n5 - this.dk.getHeight(), 0);
                return;
            }
            this.dk = Res.loadImage("/mainImage/o_1.png");
            return;
        }
        if (n2 == 35) {
            if (this.dj != null) {
                en2.LoginScreen(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = Res.loadImage("/mainImage/o_0.png");
            }
            if (this.dl != null) {
                en2.LoginScreen(this.dl, n3, n4 + n5 - this.dl.getHeight(), 0);
                return;
            }
            this.dl = Res.loadImage("/mainImage/o_2.png");
            return;
        }
        if (n2 == 36) {
            if (this.dj != null) {
                en2.LoginScreen(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = Res.loadImage("/mainImage/o_0.png");
            }
            if (this.dm != null) {
                en2.LoginScreen(this.dm, n3, n4 + n5 - this.dm.getHeight(), 0);
                return;
            }
            this.dm = Res.loadImage("/mainImage/o_3.png");
        }
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 == 102 && n3 > ae.SessionReceiver) {
            n2 = g.g(n3);
            int n8 = n4;
            int n9 = n5;
            mGraphics en3 = en2;
            n6 = n2;
            n5 = n3 -= ae.SessionReceiver;
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
                        int n18 = GameCanvas.w - (n13 << 2);
                        int n19 = n11 * n12;
                        int n20 = n10 + ((n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1))) >= 0 && n19 < n17 ? n19 % n17 : (n17 <= n19 && n19 < n17 + n16 ? n17 - n15 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n17 - (n19 - n16) % n17 - n15 : 0)));
                        n15 = n14;
                        n16 = n4;
                        n17 = n3;
                        n18 = GameCanvas.w - (n13 << 2);
                        n19 = n11 * n12;
                        n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1));
                        n14 = n2 + (n19 >= 0 && n19 < n17 ? 0 : (n17 <= n19 && n19 < n17 + n16 ? n19 % n17 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n16 - n15 : n16 - (n19 - (n17 << 1)) % n16 - n15)));
                        en3.LoginScreen(mFont[n6][n13]);
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

    public static mFont b(int n2, int n3) {
        switch (n2) {
            case 0: {
                return mFont.c;
            }
            case 1: {
                return mFont.Item;
            }
            case 3: {
                return mFont.F;
            }
            case 4: {
                return mFont.b;
            }
            case 5: {
                return mFont.d;
            }
            case 6: {
                return mFont.LoginScreen;
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
    private static boolean methodLoginScreen(int n2, int n3, Item[] hArray) {


        int n4 = n2 - 1 + var1_3 * 20;
        boolean bl2 = var1_3 == false ? n4 < (var2_4).length : false;
        return bl2;
    }

    private static int c(int n2, int n3) {
        n2 = n2 - 1 + n3 * 20;
        return n2;
    }

    private static int b(int n2, int n3, Item[] hArray) {
        n2 = n2 - 1 + n3 * 20;
        return n2 -= hArray.length;
    }

    private boolean T() {
        return this.A == 0 && this.B == 1 || this.A == 7 && this.B == 0;
    }

    private void ax() {
        if (this.ak >= 0) {
            if (GameCanvas.i[4]) {
                --this.bO;
                if (this.bO < 0) {
                    this.bO = 0;
                    if (GameCanvas.W) {
                        GameCanvas.W = false;
                        GameCanvas.G.ak = 0;
                        return;
                    }
                }
            } else if (GameCanvas.i[6]) {
                ++this.bO;
                if (this.bO > this.dn - 1) {
                    this.bO = this.dn - 1;
                    if (GameCanvas.H != null) {
                        GameCanvas.W = true;
                        GameCanvas.H.ak = 0;
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

    private void methodLoginScreen(int n2, boolean bl2) {
        n2 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        int n3 = this.ae;
        this.bO = (GameCanvas.GameScreen - n3) / this.aF;
        if (this.bO > n2 - 1) {
            this.bO = n2 - 1;
        }
        if (GameCanvas.GameScreen < n3) {
            this.bO = 0;
        }
        this.b(bl2);
    }
}

