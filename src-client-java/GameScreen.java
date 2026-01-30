/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.IActionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class GameScreen
extends Screen
implements bx {
    private boolean ct;
    private long cu;
    private long cv;
    public static boolean a = false;
    public static boolean IActionListener = false;
    public static GameScreen c;
    public static int d;
    public static int e;
    public static int f;
    private static int cw;
    private static int cx;
    public static int UIPanel;
    private static int cy;
    private static int cz;
    private static int cA;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static int cB;
    private static int cC;
    private static int cD;
    private static int cE;
    public static int ResourceUtil;
    public static int m;
    public static int n;
    private static int cF;
    public static int o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public Command s;
    public static int t;
    public static ItemTemplate[] u;
    public static cv[] v;
    public static by[] w;
    public static RMSManager[] x;
    public static cp[] Message;
    public static int z;
    public static LoggingList A;
    public static LoggingList B;
    public static LoggingList C;
    public static LoggingList D;
    public static LoggingList E;
    private static LoggingList cG;
    public static LoggingList F;
    public static LoggingList G;
    public static LoggingList H;
    public static Dart[] I;
    private static int cH;
    public static int J;
    private static int cI;
    public dn[] K;
    public ek[] L;
    private static dv cJ;
    private static dv cK;
    public static int M;
    public static boolean N;
    private static boolean cL;
    private static boolean cM;
    private static boolean cN;
    private static boolean cO;
    private static boolean cP;
    private static boolean cQ;
    public static boolean O;
    public static boolean P;
    private static boolean cR;
    private static boolean cS;
    private static boolean cT;
    private static boolean cU;
    private static boolean cV;
    private static boolean cW;
    private static boolean cX;
    private static boolean cY;
    private static boolean cZ;
    private static boolean da;
    private static boolean IMessageHandler;
    private static boolean dc;
    private static boolean dd;
    private static boolean Command;
    private static boolean df;
    private static boolean BaseCanvas;
    private static boolean dh;
    private static boolean mFont;
    private static boolean dj;
    private static boolean dk;
    private static boolean dl;
    private static boolean dm;
    private static boolean dn;
    private static boolean do;
    private static boolean dp;
    private static boolean dq;
    private static boolean dr;
    private static boolean MathUtil;
    private static boolean dt;
    private static boolean du;
    public static GameWorld Q;
    public static long[] R;
    private int dv = 0;
    public int[] S;
    public int[] T;
    public int[] U;
    public int[] V;
    public int[] W;
    public int[] X;
    public String[] Y;
    public String[] Z;
    public int aa = 0;
    public int ab = 0;
    private int dw = -1;
    private boolean dx;
    public static int[] MessageHandler;
    public static int[] ad;
    public static Image ae;
    public static Image GameWorld;
    public static Image ag;
    public static Image ah;
    public static Image ai;
    public static Image aj;
    public static Image ak;
    public static byte al;
    public static byte am;
    public static byte an;
    public static byte ao;
    public static byte ap;
    public static byte aq;
    public static byte ar;
    public static byte as;
    private static Image dy;
    private static Image dz;
    public static Image at;
    private static Image dA;
    private static Image dB;
    public static Image au;
    public static Image RMSManager;
    private static Image dC;
    private static Image dD;
    private static Image dE;
    private static Image dF;
    private static Image dG;
    private static Image dH;
    private static Image dI;
    private static Image dJ;
    private static Image dK;
    private static Image dL;
    public static Image GameStrings;
    public static Image ax;
    public static Image ay;
    public static Image az;
    public static Image aA;
    public static Image aB;
    public static byte aC;
    public static Pos aD;
    public static Pos aE;
    private static Image dM;
    private static Image dN;
    private static Image dO;
    public static Image aF;
    private static Image dP;
    private static Image dQ;
    public static Image aG;
    public static Image aH;
    public static Image aI;
    public static Image aJ;
    public static Image aK;
    public aa aL;
    public k aM;
    private int dR;
    public static int aN;
    private static IActionListener dS;
    public static int aO;
    private static Image dT;
    private Command dU;
    private Command dV;
    private Command dW;
    private Command dX;
    public static Skill[] aP;
    public static Skill[] aQ;
    public Command aR;
    private static int dY;
    public static long aS;
    public boolean aT;
    private boolean dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private boolean ef;
    public long aU;
    boolean aV;
    private boolean eg;
    private int eh;
    private int ei;
    private int ej;
    private int ek;
    public static boolean aW;
    private long LoggingList;
    private long em;
    public int aX;
    int aY;
    public boolean aZ;
    public boolean ba;
    private static Image MGraphics;
    public boolean Screen = false;
    public boolean bc = false;
    private boolean Pos = false;
    private int ep;
    private int eq;
    private int er;
    private int es;
    public boolean IConnectionListener;
    private boolean et;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    private static int eu;
    public static boolean bj;
    public static boolean bk;
    public static boolean bl;
    private int ev;
    private int ew = 0;
    private int ex = -1;
    private Skill ey;
    public String bm;
    private boolean ez;
    private int eA;
    private int eB = -1;
    private static long eC;
    private static long eD;
    private static long eE;
    private static long eF;
    private static int eG;
    private int eH = 0;
    public static int bn;
    public static Image bo;
    public static Image bp;
    public int[] bq;
    public static Image NetworkService;
    public String bs;
    private static int eI;
    public static boolean GameService;
    public static int SettingsManager;
    private static int[] eJ;
    private static int[] eK;
    public static LoggingList bv;
    private int eL = 0;
    public static Image bw;
    private static int eM;
    private static int eN;
    private static int eO;
    private static int eP;
    private static int eQ;
    public static int bx;
    public static int by;
    private static int eR;
    private static int eS;
    private static int[] eT;
    private static int[] eU;
    private static int eV;
    private static int eW;
    public long bz;
    public long bA;
    public boolean bB;
    public long bC;
    public long bD;
    public boolean bE;
    private long eX;
    private long eY;
    private int eZ;
    public static String[] bF;
    public static int[] bG;
    public static int[] bH;
    private static int[] fa;
    private static int[] fb;
    private static int[] fc;
    public static int[] bI;
    public static int[] bJ;
    private static int[] fd;
    private static int[] fe;
    private static int[] ff;
    private static int[] fg;
    private static int[] fh;
    private static int[] fi;
    private static Image[] fj;
    private static int fk;
    private static int fl;
    private static long fm;
    private int fn;
    public static int bK;
    public static int bL;
    public static int bM;
    public static int bN;
    private static int fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private Command fs;
    public static boolean bO;
    public static boolean bP;
    public CountdownDialog bQ;
    private static Vector ft;
    public boolean bR;
    private int[] fu;
    private int[] fv;
    private int[] fw;
    private int[] fx;
    private int[] fy;
    private int fz;
    private String fA;
    private int fB;
    private int fC;
    private int fD;
    private boolean fE;
    public byte bS;
    public boolean bT;
    public int bU;
    public static boolean bV;
    public static byte bW;
    public static byte bX;
    private String fF;
    private String[] fG;
    private static Image fH;
    public static cg bY;
    private static df fI;
    private static df fJ;
    private static Image fK;
    private static Image fL;
    private static Image fM;
    public static int bZ;
    public static int ca;
    public static long cb;
    public static String cc;
    public static int cd;
    public static boolean ce;
    public static byte cf;
    public static LoggingList cg;
    private static int fN;
    public static boolean ch;
    public static int ci;
    public static int cj;
    public static boolean ck;
    public static boolean cl;

    static {
        A = new LoggingList("vClan");
        new LoggingList("vPtMap");
        B = new LoggingList("vFriend");
        C = new LoggingList("vEnemies");
        D = new LoggingList("vCharInMap");
        E = new LoggingList("vItemMap");
        cG = new LoggingList("vMobAttack");
        new LoggingList("vSet");
        F = new LoggingList("vMob");
        G = new LoggingList("vNpc");
        H = new LoggingList("vFlag");
        cH = 0;
        J = -1;
        cI = 0;
        cJ = new dv();
        cK = new dv();
        new LoggingList("vItemUpGrade");
        N = false;
        cL = false;
        cM = false;
        cN = false;
        cO = false;
        cP = false;
        cQ = false;
        O = false;
        P = false;
        cR = false;
        cS = false;
        cT = false;
        cU = false;
        cV = false;
        cW = false;
        cX = false;
        cY = false;
        cZ = false;
        da = false;
        IMessageHandler = false;
        dc = false;
        dd = false;
        Command = false;
        df = false;
        BaseCanvas = false;
        dh = false;
        mFont = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        do = false;
        dp = false;
        dq = false;
        dr = false;
        MathUtil = false;
        dt = false;
        du = false;
        ae = ResourceUtil.IActionListener("/mainImage/myTexture2dstat.png");
        GameWorld = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor20.png");
        ag = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor21.png");
        ah = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor22.png");
        ai = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor00.png");
        aj = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor01.png");
        ak = ResourceUtil.IActionListener("/mainImage/myTexture2dlineColor02.png");
        aC = 0;
        aD = new Pos();
        aE = new Pos();
        dS = new IActionListener();
        aO = 0;
        dT = ResourceUtil.IActionListener("/mainImage/i_pve_bar_0.png");
        ResourceUtil.IActionListener("/mainImage/i_pve_bar_1.png");
        fI = new Frame(ResourceUtil.IActionListener("/mainImage/i_pve_bar_0.png"), 6, 15);
        fJ = new Frame(ResourceUtil.IActionListener("/mainImage/i_pve_bar_1.png"), 38, 21);
        fK = ResourceUtil.IActionListener("/mainImage/i_vs.png");
        fL = ResourceUtil.IActionListener("/mainImage/i_charlife.png");
        fH = ResourceUtil.IActionListener("/mainImage/i_hp.png");
        fM = ResourceUtil.IActionListener("/mainImage/i_khung.png");
        GameStrings = ResourceUtil.IActionListener("/mainImage/myTexture2dbtnl.png");
        ax = ResourceUtil.IActionListener("/mainImage/myTexture2dbtnlf.png");
        ay = ResourceUtil.IActionListener("/mainImage/myTexture2dbtnl2.png");
        az = ResourceUtil.IActionListener("/mainImage/myTexture2dbtnlf2.png");
        dM = ResourceUtil.IActionListener("/mainImage/myTexture2dpanel.png");
        dN = ResourceUtil.IActionListener("/mainImage/panel2.png");
        dO = ResourceUtil.IActionListener("/mainImage/myTexture2dHP.png");
        dP = ResourceUtil.IActionListener("/mainImage/SP.png");
        dQ = ResourceUtil.IActionListener("/mainImage/myTexture2dhpLost.png");
        aG = ResourceUtil.IActionListener("/mainImage/myTexture2dmpLost.png");
        aF = ResourceUtil.IActionListener("/mainImage/myTexture2dMP.png");
        au = ResourceUtil.IActionListener("/mainImage/myTexture2dskill.png");
        RMSManager = ResourceUtil.IActionListener("/mainImage/myTexture2dskill2.png");
        at = ResourceUtil.IActionListener("/mainImage/myTexture2dmenu.png");
        dA = ResourceUtil.IActionListener("/mainImage/myTexture2dfocus.png");
        aH = ResourceUtil.IActionListener("/mainImage/tm-do.png");
        aI = ResourceUtil.IActionListener("/mainImage/tm-vang.png");
        aJ = ResourceUtil.IActionListener("/mainImage/tm-xam.png");
        aK = ResourceUtil.IActionListener("/mainImage/tm-xanh.png");
        if (main.GameCanvas.e) {
            ResourceUtil.IActionListener("/mainImage/myTexture2darrow.png");
            ResourceUtil.IActionListener("/mainImage/myTexture2darrow2.png");
            dy = ResourceUtil.IActionListener("/mainImage/myTexture2dchat.png");
            dz = ResourceUtil.IActionListener("/mainImage/myTexture2dchat2.png");
            dB = ResourceUtil.IActionListener("/mainImage/myTexture2dfocus2.png");
            dC = ResourceUtil.IActionListener("/mainImage/myTexture2dPea0.png");
            dD = ResourceUtil.IActionListener("/mainImage/myTexture2dPea1.png");
            aA = ResourceUtil.IActionListener("/mainImage/myTexture2danalog1.png");
            aB = ResourceUtil.IActionListener("/mainImage/myTexture2danalog2.png");
            dE = ResourceUtil.IActionListener("/mainImage/myTexture2dPea2.png");
            dF = ResourceUtil.IActionListener("/mainImage/myTexture2dPea3.png");
            dG = ResourceUtil.IActionListener("/mainImage/myTexture2dfirebtn0.png");
            dH = ResourceUtil.IActionListener("/mainImage/myTexture2dfirebtn1.png");
        }
        dI = ResourceUtil.IActionListener("/mainImage/myTexture2dPea_0.png");
        dJ = ResourceUtil.IActionListener("/mainImage/myTexture2dPea_1.png");
        dK = ResourceUtil.IActionListener("/mainImage/myTexture2dPea_2.png");
        dL = ResourceUtil.IActionListener("/mainImage/myTexture2dPea_3.png");
        aO = RMSManager.d("analog") == 1 ? 1 : 0;
        dS = new IActionListener();
        byte[] byArray = RMSManager.IActionListener("NRdataVersion");
        byte[] byArray2 = RMSManager.IActionListener("NRmapVersion");
        byte[] byArray3 = RMSManager.IActionListener("NRskillVersion");
        byte[] byArray4 = RMSManager.IActionListener("NRitemVersion");
        if (byArray != null) {
            al = byArray[0];
        }
        if (byArray2 != null) {
            am = byArray2[0];
        }
        if (byArray3 != null) {
            an = byArray3[0];
        }
        if (byArray4 != null) {
            ao = byArray4[0];
        }
        aP = new Skill[10];
        aQ = new Skill[10];
        MGraphics = ResourceUtil.IActionListener("/bg/trans.png");
        eu = 0;
        bo = ResourceUtil.IActionListener("/mainImage/myTexture2dnut.png");
        bp = ResourceUtil.IActionListener("/mainImage/myTexture2dnutF.png");
        GameService = true;
        eJ = new int[]{1, -1, 1, -1};
        eK = new int[]{1, -1, -1, 1};
        bv = new LoggingList("");
        bw = ResourceUtil.IActionListener("/mainImage/myTexture2darrow3.png");
        bG = new int[5];
        bH = new int[5];
        fb = new int[5];
        fc = new int[5];
        bI = new int[5];
        bF = new String[5];
        fa = new int[5];
        fd = new int[5];
        bJ = new int[8];
        int n2 = 0;
        while (n2 < 5) {
            GameScreen.bI[n2] = -1;
            ++n2;
        }
        bM = 140;
        bN = 160;
        bO = false;
        bP = false;
        ft = new Vector();
        bZ = 50;
        ca = 50;
        cd = 100;
        cg = new LoggingList("");
        fN = 1;
        ch = false;
    }

    public final void a() {
        block13: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NR_part")));
                    int n2 = ((DataInputStream)object).readShort();
                    x = new RMSManager[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        int n4 = ((DataInputStream)object).readByte();
                        GameScreen.x[n3] = new RMSManager(n4);
                        n4 = 0;
                        while (n4 < GameScreen.x[n3].GameCanvas.length) {
                            GameScreen.x[n3].a[n4] = new w();
                            GameScreen.x[n3].a[n4].a = ((DataInputStream)object).readShort();
                            GameScreen.x[n3].a[n4].IActionListener = ((DataInputStream)object).readByte();
                            GameScreen.x[n3].a[n4].c = ((DataInputStream)object).readByte();
                            ++n4;
                        }
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    break block13;
                }
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
        bl.c();
    }

    public static void a(Image image, Image image2, Image image3, float f2, float f3, int n2, float f4, MGraphics en2) {
        n2 = en2.c();
        int n3 = en2.d();
        int n4 = en2.e();
        int n5 = en2.f();
        en2.e((int)f2, (int)f3, (int)f4, 13);
        int n6 = 0;
        while (n6 < 4) {
            en2.a(image2, f2 + (float)((n6 + 1) * 15), f3, 0);
            ++n6;
        }
        en2.a(image, f2, f3, 0);
        en2.a(image2, f2 + 100.0f - 30.0f, f3, 0);
        en2.a(image3, f2 + 100.0f - 15.0f, f3, 0);
        en2.e(n2, n3, n4, n5);
    }

    public static boolean e() {
        return bv.ResourceUtil >= 53 && bv.ResourceUtil <= 62;
    }

    public static boolean f() {
        return bv.ResourceUtil >= 63;
    }

    public final void IActionListener() {
        bs.c = false;
        if (ed.IActionListener()) {
            SettingsManager.a();
        }
        x.c = false;
        GameWorld.bI = false;
        if (!a) {
            GameService.a().s();
        }
        if (bv.IActionListener()) {
            GameScreen p2 = this;
            if (cw.IActionListener) {
                cw.IActionListener = false;
                p2.co = null;
            }
        }
        GameScreen.aD.f = true;
        GameScreen.aE.f = true;
        IActionListener = true;
        this.dR = 0;
        a = false;
        super.IActionListener();
    }

    public static void UIPanel() {
        TileMap.GameCanvas.removeAllElements();
        D.removeAllElements();
        E.removeAllElements();
        dc.x.removeAllElements();
        dc.A.removeAllElements();
        dc.z.removeAllElements();
        dc.B.removeAllElements();
        dc.w.removeAllElements();
        cG.removeAllElements();
        F.removeAllElements();
        G.removeAllElements();
        GameWorld.e().bF.removeAllElements();
    }

    public final void a(byte[] object) {
        MathUtil.c("GET ONSCREENSKILL!");
        aQ = new Skill[10];
        if (object == null) {
            MathUtil.c("null");
            object = this;
            MathUtil.c("LOAD DEFAULT ONSCREEN SKILL");
            int n2 = 0;
            while (n2 < aQ.length) {
                bf bf2;
                if (n2 >= GameWorld.e().aA.size()) break;
                GameScreen.aQ[n2] = bf2 = (Skill)GameWorld.e().aA.elementAt(n2);
                ++n2;
            }
            GameScreen.Message();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < GameWorld.e().aA.size()) {
                bf bf3 = (Skill)GameWorld.e().aA.elementAt(n4);
                if (bf3.GameCanvas.a == object[n3]) {
                    GameScreen.aQ[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void IActionListener(byte[] object) {
        MathUtil.c("GET KEYSKILL!");
        aP = new Skill[10];
        if (object == null) {
            object = this;
            MathUtil.c("LOAD DEFAULT KEY SKILL");
            int n2 = 0;
            while (n2 < aP.length) {
                bf bf2;
                if (n2 >= GameWorld.e().aA.size()) break;
                GameScreen.aP[n2] = bf2 = (Skill)GameWorld.e().aA.elementAt(n2);
                ++n2;
            }
            GameScreen.z();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < GameWorld.e().aA.size()) {
                bf bf3 = (Skill)GameWorld.e().aA.elementAt(n4);
                if (bf3.GameCanvas.a == object[n3]) {
                    GameScreen.aP[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void c(byte[] byArray) {
        MathUtil.c("GET CURRENTSKILL!");
        if (byArray == null || byArray.length == 0) {
            if (GameWorld.e().aA.size() > 0) {
                GameWorld.e().aC = (Skill)GameWorld.e().aA.elementAt(0);
            }
        } else {
            int n2 = 0;
            while (n2 < GameWorld.e().aA.size()) {
                bf bf2 = (Skill)GameWorld.e().aA.elementAt(n2);
                if (bf2.GameCanvas.a == byArray[0]) {
                    GameWorld.e().aC = bf2;
                    break;
                }
                ++n2;
            }
        }
        if (GameWorld.e().aC != null) {
            GameService.a().i(GameWorld.e().aC.GameCanvas.a);
            GameWorld.e();
        }
    }

    protected static void a(et object) {
        MathUtil.c("DO SET ONSCREEN SKILL");
        object = GameWorld.e().a((et)object);
        LoggingList el2 = new LoggingList("");
        int n2 = 0;
        while (n2 < (main.GameCanvas.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object object2 = objectArray;
            objectArray[0] = object;
            object2[1] = String.valueOf(n2);
            object2 = new Command(String.valueOf(GameStrings.cB) + (n2 + 1), 11120, object2);
            bf bf2 = aQ[n2];
            if (bf2 != null) {
                object2.a = true;
            }
            el2.addElement(object2);
            ++n2;
        }
        main.GameCanvas.F.a(el2);
    }

    protected static void IActionListener(et object) {
        MathUtil.c("DO SET KEY SKILL");
        object = GameWorld.e().a((et)object);
        String[] stringArray = cd.UIPanel ? GameStrings.aR : GameStrings.aS;
        LoggingList el2 = new LoggingList("");
        int n2 = 0;
        while (n2 < (main.GameCanvas.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            el2.addElement(new Command(stringArray[n2], 11121, objectArray2));
            ++n2;
        }
        main.GameCanvas.F.a(el2);
    }

    private static void Message() {
        byte[] byArray = new byte[aQ.length];
        int n2 = 0;
        while (n2 < aQ.length) {
            byArray[n2] = aQ[n2] == null ? -1 : GameScreen.aQ[n2].GameCanvas.a;
            ++n2;
        }
        GameService.a().a(byArray);
    }

    private static void z() {
        byte[] byArray = new byte[aP.length];
        int n2 = 0;
        while (n2 < aP.length) {
            byArray[n2] = aP[n2] == null ? -1 : GameScreen.aP[n2].GameCanvas.a;
            ++n2;
        }
        GameService.a().a(byArray);
    }

    public static boolean h() {
        int n2 = GameWorld.e().aF.length - 1;
        while (n2 >= 0) {
            if (GameWorld.e().aF[n2] == null) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static void a(String[] stringArray, do do_) {
        LoggingList el2 = new LoggingList("");
        int n2 = 0;
        while (n2 < stringArray.length) {
            el2.addElement(new Command(stringArray[n2], 11057, do_));
            ++n2;
        }
        main.GameCanvas.F.a(el2);
    }

    private static void A() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NR_effect")));
                int n2 = ((DataInputStream)object).readShort();
                Message = new cp[n2];
                int n3 = 0;
                while (n3 < n2) {
                    GameScreen.Message[n3] = new cp();
                    ((DataInputStream)object).readShort();
                    GameScreen.Message[n3].a = new eq[((DataInputStream)object).readByte()];
                    int n4 = 0;
                    while (n4 < GameScreen.Message[n3].GameCanvas.length) {
                        GameScreen.Message[n3].a[n4] = new eq();
                        GameScreen.Message[n3].a[n4].c = ((DataInputStream)object).readShort();
                        GameScreen.Message[n3].a[n4].a = ((DataInputStream)object).readByte();
                        GameScreen.Message[n3].a[n4].IActionListener = ((DataInputStream)object).readByte();
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void B() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NR_arrow")));
                int n2 = ((DataInputStream)object).readShort();
                v = new cv[n2];
                int n3 = 0;
                while (n3 < n2) {
                    GameScreen.v[n3] = new cv();
                    ((DataInputStream)object).readShort();
                    GameScreen.v[n3].a[0] = ((DataInputStream)object).readShort();
                    GameScreen.v[n3].a[1] = ((DataInputStream)object).readShort();
                    GameScreen.v[n3].a[2] = ((DataInputStream)object).readShort();
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void C() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NR_dart")));
                int n2 = ((DataInputStream)object).readShort();
                w = new by[n2];
                int n3 = 0;
                while (n3 < n2) {
                    int n4;
                    int n5;
                    GameScreen.w[n3] = new by();
                    ((DataInputStream)object).readShort();
                    GameScreen.w[n3].h = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].i = ((DataInputStream)object).readShort() << 8;
                    GameScreen.w[n3].UIPanel = ((DataInputStream)object).readShort();
                    int n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].c = new short[n6];
                    int n7 = 0;
                    while (n7 < n6) {
                        GameScreen.w[n3].c[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].d = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        GameScreen.w[n3].d[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].e = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        GameScreen.w[n3].e[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].f = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        GameScreen.w[n3].f[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].a = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        GameScreen.w[n3].a[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            GameScreen.w[n3].a[n7][n4] = ((DataInputStream)object).readShort();
                            ++n4;
                        }
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].IActionListener = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        GameScreen.w[n3].IActionListener[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            GameScreen.w[n3].IActionListener[n7][n4] = ((DataInputStream)object).readShort();
                            ++n4;
                        }
                        ++n7;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void E() {
        block16: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NR_skill")));
                    short s2 = ((DataInputStream)object).readShort();
                    int n2 = o.GameCanvas.size();
                    u = new ItemTemplate[n2];
                    n2 = 0;
                    while (n2 < s2) {
                        short s3 = ((DataInputStream)object).readShort();
                        if (s3 == 1111) {
                            s3 = (short)(s2 - 1);
                        }
                        GameScreen.u[s3] = new ItemTemplate();
                        GameScreen.u[s3].a = s3;
                        GameScreen.u[s3].IActionListener = ((DataInputStream)object).readShort();
                        if (GameScreen.u[s3].IActionListener <= 0) {
                            GameScreen.u[s3].IActionListener = 80;
                        }
                        ((DataInputStream)object).readByte();
                        GameScreen.u[s3].c = new f[((DataInputStream)object).readByte()];
                        int n3 = 0;
                        while (n3 < GameScreen.u[s3].c.length) {
                            GameScreen.u[s3].c[n3] = new f();
                            GameScreen.u[s3].c[n3].a = ((DataInputStream)object).readByte();
                            GameScreen.u[s3].c[n3].IActionListener = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].c = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].d = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].e = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].f = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].UIPanel = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].h = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].i = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].j = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].k = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].ResourceUtil = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].m = ((DataInputStream)object).readShort();
                            ++n3;
                        }
                        GameScreen.u[s3].d = new f[((DataInputStream)object).readByte()];
                        n3 = 0;
                        while (n3 < GameScreen.u[s3].d.length) {
                            GameScreen.u[s3].d[n3] = new f();
                            GameScreen.u[s3].d[n3].a = ((DataInputStream)object).readByte();
                            GameScreen.u[s3].d[n3].IActionListener = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].c = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].d = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].e = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].f = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].UIPanel = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].h = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].i = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].j = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].k = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].ResourceUtil = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].m = ((DataInputStream)object).readShort();
                            ++n3;
                        }
                        ++n2;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    break block16;
                }
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
        MathUtil.c("READ SKILL DONE");
    }

    public static void i() {
        try {
            MathUtil.c("<readOk><vsData<" + ap + "==" + al);
            MathUtil.c("<readOk><vsMap<" + aq + "==" + am);
            MathUtil.c("<readOk><vsSkill<" + ar + "==" + an);
            MathUtil.c("<readOk><vsItem<" + as + "==" + ao);
            if (ap == al && aq == am && ar == an && as == ao) {
                MathUtil.c(String.valueOf(ap) + "," + aq + "," + ar + "," + as);
                GameScreen.j();
                GameScreen.C();
                GameScreen.j();
                GameScreen.A();
                GameScreen.j();
                GameScreen.B();
                GameScreen.j();
                GameScreen.E();
                GameService.a().GameScreen();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public static GameScreen j() {
        if (c == null) {
            c = new GameScreen();
        }
        return c;
    }

    public static void k() {
        c = null;
    }

    public final void ResourceUtil() {
        if (fj == null) {
            fj = new Image[3];
            int n2 = 0;
            while (n2 < 3) {
                GameScreen.fj[n2] = ResourceUtil.IActionListener("/e/sp" + n2 + ".png");
                ++n2;
            }
        }
        fe = new int[2];
        ff = new int[2];
        fg = new int[2];
        fh = new int[2];
        fi = new int[2];
        GameScreen.fg[1] = -1;
        GameScreen.fg[0] = -1;
        GameScreen p2 = this;
        this.fn = 84;
        fm = 66L;
        fl = 59;
        fk = 61;
    }

    public GameScreen() {
        int[] nArray = new int[]{-1, -1};
        this.bR = false;
        this.fF = "";
        new Command("", 11021);
        this.aR = new Command("  ", 11000);
        this.s = new Command("", 11001);
        this.aR.UIPanel = at;
        this.aR.ResourceUtil = MGraphics.a(this.aR.UIPanel) + 20;
        this.aR.f = false;
        this.s.UIPanel = dA;
        if (main.GameCanvas.e) {
            this.aR.j = 0;
            this.aR.k = 50;
            this.s = null;
        } else {
            this.aR.j = 0;
            this.aR.k = e - 30;
            this.s.j = d - 32;
            this.s.k = e - 32;
        }
        this.co = this.s;
        bn = 1;
        if (main.GameCanvas.e) {
            O = true;
        }
        this.dU = new Command("\u0110\u1ed5i c\u1edd", main.GameCanvas.a(), 100001, null);
        this.dV = new Command("Logout", main.GameCanvas.a(), 100002, null);
        this.dW = new Command("chat world", main.GameCanvas.a(), 100003, null);
        this.dX = new Command("InfoLog", main.GameCanvas.a(), 100004, null);
        this.dU.IActionListener();
        this.dV.IActionListener();
        this.dW.IActionListener();
        this.dX.IActionListener();
        this.dW.j = main.GameCanvas.A - this.dW.ResourceUtil;
        this.dX.j = main.GameCanvas.A - this.dX.ResourceUtil;
        this.dV.j = main.GameCanvas.A - this.dV.ResourceUtil;
        this.dU.j = main.GameCanvas.A - this.dU.ResourceUtil;
        this.dW.k = this.dW.m + mFont.s.a();
        this.dX.k = (this.dW.m << 1) + mFont.s.a();
        this.dV.k = this.dW.m * 3 + mFont.s.a();
        this.dU.k = (this.dW.m << 2) + mFont.s.a();
    }

    public static final void a(int n2, int n3) {
        boolean bl2;
        UIPanel g2;
        d = main.GameCanvas.A;
        h = 39;
        e = main.GameCanvas.B;
        cA = main.GameCanvas.B / 6;
        if (cA < 48) {
            cA = 48;
        }
        f = d >> 1;
        cz = e >> 1;
        cy = e - 120;
        UIPanel = (e << 1) / 3;
        i = d / 6;
        cw = d / bv.i + 2;
        cx = e / bv.i + 2;
        if (d % 24 != 0) {
            ++cw;
        }
        n = (bv.a - 1) * bv.i - d;
        cF = (bv.IActionListener - 1) * bv.i - e;
        if (n2 == -1 && n3 == -1) {
            j = ResourceUtil = GameWorld.e().B - f + i * GameWorld.e().I;
            k = m = GameWorld.e().C - UIPanel - 1;
        } else {
            j = ResourceUtil = n2 - cy + i * GameWorld.e().I;
            k = m = n3 - UIPanel - 1;
        }
        if (j < 24) {
            ResourceUtil = 24;
            j = 24;
        }
        if (j > n) {
            j = ResourceUtil = n;
        }
        if (k < 0) {
            m = 0;
            k = 0;
        }
        if (k > cF) {
            k = m = cF;
        }
        if ((o = j / bv.i - 1) < 0) {
            o = 0;
        }
        GameScreen = k / bv.i;
        q = o + cw;
        r = GameScreen + cx;
        if (GameScreen < 0) {
            GameScreen = 0;
        }
        if (r > bv.IActionListener - 1) {
            r = bv.IActionListener - 1;
        }
        if ((bv.F = q - o << 2) > bv.a) {
            bv.F = bv.a;
        }
        if ((bv.G = r - GameScreen << 2) > bv.IActionListener) {
            bv.G = bv.IActionListener;
        }
        if ((bv.B = (GameWorld.e().B - 2 * d) / bv.i) < 0) {
            bv.B = 0;
        }
        if ((bv.C = bv.B + bv.F) > bv.a) {
            bv.C = bv.a;
        }
        if ((bv.D = (GameWorld.e().C - 2 * e) / bv.i) < 0) {
            bv.D = 0;
        }
        if ((bv.E = bv.D + bv.G) > bv.IActionListener) {
            bv.E = bv.IActionListener;
        }
        cq.IActionListener().c = c;
        cq.IActionListener().a.IActionListener = main.GameCanvas.B - 35 - cq.IActionListener().GameCanvas.d;
        cq.IActionListener().a();
        if (main.GameCanvas.e) {
            eM = e - 88;
            eN = d - 40;
            eO = 2;
            if (main.GameCanvas.A <= 240) {
                eN = d - 35;
                eO = 5;
            }
            eP = d - 55;
            eQ = eM + 35;
            eR = d - 37;
            eS = eM - 1;
            if (main.GameCanvas.A >= 450) {
                eS -= 12;
                by -= 7;
                eP -= 10;
                eQ -= 5;
                eR -= 10;
            }
        }
        GameScreen.m();
        int n4 = eI = main.GameCanvas.A > 200 ? 40 : 30;
        if (RMSManager.d("viewchat") == -1) {
            g2 = main.GameCanvas.G;
            bl2 = true;
        } else {
            g2 = main.GameCanvas.G;
            bl2 = RMSManager.d("viewchat") == 1;
        }
        g2.au = bl2;
    }

    public static void m() {
        Skill[] bfArray = main.GameCanvas.e ? aQ : aP;
        eT = new int[bfArray.length];
        eU = new int[bfArray.length];
        dY = 30;
        if (main.GameCanvas.A <= 320) {
            eW = e - dY - 6;
            eV = f - bfArray.length * dY / 2 - 25;
        } else {
            dY = 40;
            eV = 10;
            eW = main.GameCanvas.B - dY + 7;
        }
        int n2 = 0;
        while (n2 < eT.length) {
            GameScreen.eT[n2] = n2 * dY;
            GameScreen.eU[n2] = eW;
            if (eT.length > 5 && n2 >= eT.length / 2) {
                GameScreen.eT[n2] = (n2 - eT.length / 2) * dY;
                GameScreen.eU[n2] = eW - 32;
            }
            ++n2;
        }
        bx = bfArray.length * dY;
        by = eW;
        if (main.GameCanvas.e) {
            eV = 17;
            eW = main.GameCanvas.B - 40;
            if (GameScreen.dS.IActionListener && aO == 1) {
                bx = bfArray.length * dY;
                by = eW;
            } else {
                bx = main.GameCanvas.A - 45;
                by = main.GameCanvas.B - 45;
            }
            if (aO != 0) {
                eR = eP = main.GameCanvas.A - 45;
                if (GameScreen.dS.d) {
                    eV = GameScreen.dS.a + 20;
                    dY = 35;
                    bx = eP - 45;
                } else if (GameScreen.dS.c) {
                    bx = eP - 45;
                }
                eQ = main.GameCanvas.B - 45;
                eS = eQ - 45;
            }
            n2 = 0;
            while (n2 < eT.length) {
                GameScreen.eT[n2] = n2 * dY;
                GameScreen.eU[n2] = eW;
                if (eT.length > 5 && n2 >= eT.length / 2) {
                    GameScreen.eT[n2] = (n2 - eT.length / 2) * dY;
                    GameScreen.eU[n2] = eW - 32;
                }
                ++n2;
            }
        }
    }

    public final void a(String string, int n2, int n3) {
        i i2 = new i();
        new i().IActionListener = n3;
        i2.a = n2;
        this.a(string, new Command(GameStrings.bn, 12002, i2), new Command(GameStrings.bo, 12003, i2));
    }

    private void F() {
        this.aX = 0;
        main.GameCanvas.UIPanel();
        if (GameWorld.e().aU.J < 0) {
            return;
        }
        if (GameWorld.e().J < 0) {
            return;
        }
        LoggingList el2 = main.GameCanvas.G.S;
        if (el2.size() > 0) {
            return;
        }
        if (GameWorld.e().aD != null && GameWorld.e().aD.c > 1) {
            el2.addElement(new Command(GameStrings.cP, 11112, GameWorld.e().aU));
            el2.addElement(new Command(GameStrings.dL, 11113, GameWorld.e().aU));
        }
        if (GameWorld.e().ai != null && GameWorld.e().aj < 2 && GameWorld.e().aU.ah == -1) {
            el2.addElement(new Command(GameStrings.aM[4], 110391));
        }
        if (GameWorld.e().aU.H != 14 && GameWorld.e().aU.H != 5) {
            if (GameWorld.e().aD != null && GameWorld.e().aD.c >= 14) {
                el2.addElement(new Command(GameStrings.aM[0], 2003));
            }
        } else {
            GameWorld.e();
        }
        if (GameWorld.e().ai != null && GameWorld.e().ai.a == GameWorld.e().aU.ah && GameWorld.e().aU.H != 14 && GameWorld.e().aD != null && GameWorld.e().aD.c >= 14) {
            el2.addElement(new Command(GameStrings.aM[1], 2004));
        }
        int n2 = GameWorld.e().ax.IActionListener.length;
        int n3 = 0;
        while (n3 < n2) {
            et et2 = GameWorld.e().ax.IActionListener[n3];
            bf bf2 = GameWorld.e().a(et2);
            if (bf2 != null && et2.a() && bf2.c > 0) {
                el2.addElement(new Command(et2.IActionListener, 12004, bf2));
            }
            ++n3;
        }
    }

    public static boolean a(aa bq2) {
        if (bq2 == null) {
            return false;
        }
        if (GameWorld.e().aN == 5) {
            return true;
        }
        if (GameWorld.e().I() && !bq2.J) {
            return false;
        }
        if (GameWorld.e().aR != null && bq2.equals(GameWorld.e().aR)) {
            return false;
        }
        bq2 = GameScreen.IActionListener(bq2.Message);
        if (bq2 == null) {
            return true;
        }
        if (((GameWorld)bq2).aN == 5) {
            return true;
        }
        return GameWorld.e().c((GameWorld)bq2);
    }

    private boolean G() {
        if (GameWorld.e().aC != null && (GameWorld.e().aC.GameCanvas.d != 1 && GameWorld.e().T < (long)GameWorld.e().aC.i || GameWorld.e().aC.GameCanvas.d == 1 && GameWorld.e().T < GameWorld.e().W * (long)GameWorld.e().aC.i / 100L)) {
            aD.a(GameStrings.bI, 0);
            this.aX = 0;
            return false;
        }
        if (GameWorld.e().aC == null || GameWorld.e().aC.GameCanvas.c > 0 && GameWorld.e().aC.c == 0) {
            main.GameCanvas.a(GameStrings.aT);
            return false;
        }
        return true;
    }

    public final void n() {
        main.GameCanvas.F.a = false;
        Object object = cq.IActionListener();
        ((cq)object).GameCanvas.a("");
        ((cq)object).IActionListener = false;
        cq.IActionListener().f = null;
        this.dx = false;
        this.aa = 0;
        cI = 0;
        cH = 0;
        this.dw = -1;
        J = -1;
        this.ab = 0;
        this.aa = 0;
        if (GameWorld.e().U <= 0L || GameWorld.e().H == 14 || GameWorld.e().H == 5) {
            if (GameWorld.e().cH) {
                this.cn = this.fs = new Command(GameStrings.aX[0], 11038);
                GameWorld.e().U = 0L;
            }
            O = false;
        } else {
            O = true;
        }
        object = cK;
        cK.a = 0;
        ((dv)object).IActionListener = 0;
        ((dv)object).c = 0;
        ((dv)object).d = 0;
        ((dv)object).e = 0;
        ((dv)object).f = 0;
        ((dv)object).UIPanel = 0;
        ((dv)object).h = 0;
        ((dv)object).k = 0;
        ((dv)object).ResourceUtil = 0;
        ((dv)object).i = 0;
        ((dv)object).j = 0;
    }

    public final void a(int n2) {
        super.a(n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        block245: {
            block253: {
                block254: {
                    block252: {
                        block251: {
                            block247: {
                                block249: {
                                    block248: {
                                        block250: {
                                            block246: {
                                                block244: {
                                                    block243: {
                                                        block237: {
                                                            block242: {
                                                                block241: {
                                                                    block236: {
                                                                        block240: {
                                                                            block239: {
                                                                                block238: {
                                                                                    if (MessageHandler.IActionListener || GameWorld.e().s || GameWorld.e().IMessageHandler) {
                                                                                        return;
                                                                                    }
                                                                                    if (bp.IActionListener) {
                                                                                        return;
                                                                                    }
                                                                                    if (!main.GameCanvas.e || cq.IActionListener().IActionListener || main.GameCanvas.F.a || (var1_1 = this).N()) break block237;
                                                                                    Screen.cs = -1;
                                                                                    if (!main.GameCanvas.f) break block236;
                                                                                    if (!main.GameCanvas.a(0, 0, 60, 50) || !main.GameCanvas.ResourceUtil || !main.GameCanvas.m) break block238;
                                                                                    if (GameWorld.e().an != null) {
                                                                                        GameWorld.e().an.a();
                                                                                    }
                                                                                    GameWorld.e().bP = null;
                                                                                    main.GameCanvas.ResourceUtil();
                                                                                    var1_1.ez = true;
                                                                                    var1_1.eA = 5;
                                                                                    break block237;
                                                                                }
                                                                                if (bv.d() || !main.GameCanvas.a(GameScreen.eN, GameScreen.eO, 34, 34)) break block239;
                                                                                Screen.cs = 15;
                                                                                main.GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                cq.IActionListener().h = GameStrings.bq;
                                                                                if (!main.GameCanvas.ResourceUtil || !main.GameCanvas.m) break block239;
                                                                                cq.IActionListener().a("");
                                                                                SettingsManager.a();
                                                                                GameWorld.e().bP = null;
                                                                                main.GameCanvas.ResourceUtil();
                                                                                break block237;
                                                                            }
                                                                            if (GameWorld.e().an == null || !main.GameCanvas.a(GameWorld.e().an.j - 17, GameWorld.e().an.k - 17, 34, 34)) break block240;
                                                                            Screen.cs = 20;
                                                                            main.GameCanvas.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (!main.GameCanvas.ResourceUtil || !main.GameCanvas.m) break block240;
                                                                            main.GameCanvas.ResourceUtil();
                                                                            GameWorld.e().an.a();
                                                                            break block237;
                                                                        }
                                                                        var3_9 = var1_1;
                                                                        if (GameScreen.aO != 0 && GameWorld.e().H != 14) {
                                                                            if (main.GameCanvas.a(GameScreen.eP, GameScreen.eQ, 40, 40)) {
                                                                                Screen.cs = 5;
                                                                                if (main.GameCanvas.m) {
                                                                                    main.GameCanvas.i[5] = true;
                                                                                    main.GameCanvas.m = false;
                                                                                    main.GameCanvas.ai = false;
                                                                                    main.GameCanvas.ResourceUtil = false;
                                                                                }
                                                                            }
                                                                            GameScreen.dS.a();
                                                                            if (main.GameCanvas.a(GameScreen.eR, GameScreen.eS, 34, 34)) {
                                                                                Screen.cs = 13;
                                                                                main.GameCanvas.ai = false;
                                                                                var3_9.aT = false;
                                                                                if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                                    GameWorld.e().J();
                                                                                    main.GameCanvas.m = false;
                                                                                    main.GameCanvas.ai = false;
                                                                                    main.GameCanvas.ResourceUtil = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if ((GameScreen.aO == 0 ? main.GameCanvas.a(GameScreen.bx, GameScreen.by + 10, 40, 40) != false : main.GameCanvas.a(GameScreen.bx, GameScreen.by + 10, 34, 34) != false) && GameWorld.e().H != 14 && var1_1.aL == null) {
                                                                            Screen.cs = 10;
                                                                            main.GameCanvas.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                                main.GameCanvas.i[10] = true;
                                                                                main.GameCanvas.m = false;
                                                                                main.GameCanvas.ai = false;
                                                                                main.GameCanvas.ResourceUtil = false;
                                                                            }
                                                                        }
                                                                        if ((GameScreen.aO == 0 ? main.GameCanvas.a(GameScreen.bx + 5, GameScreen.by - 6 - 40 + 10, 40, 40) != false : main.GameCanvas.a(GameScreen.bx + 5, GameScreen.by - 6 - 34 + 10, 34, 34) != false) && GameWorld.e().H != 14 && var1_1.aL == null) {
                                                                            if (GameScreen.ch) {
                                                                                Screen.cs = 14;
                                                                                main.GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                                    main.GameCanvas.i[14] = true;
                                                                                    main.GameCanvas.m = false;
                                                                                    main.GameCanvas.ai = false;
                                                                                    main.GameCanvas.ResourceUtil = false;
                                                                                    GameScreen.ch = false;
                                                                                    GameService.a().a((byte)-1, (byte)-1, (byte)-1, (short)-1);
                                                                                }
                                                                            } else if (GameScreen.ck) {
                                                                                Screen.cs = 14;
                                                                                main.GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                                    main.GameCanvas.i[14] = true;
                                                                                    main.GameCanvas.m = false;
                                                                                    main.GameCanvas.ai = false;
                                                                                    main.GameCanvas.ResourceUtil = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < GameWorld.e().aF.length) {
                                                                                        var7_20 = GameWorld.e().aF[var6_16];
                                                                                        if (var7_20 != null) {
                                                                                            MathUtil.IActionListener("find " + var7_20.IActionListener.a);
                                                                                            if (var7_20.IActionListener.a == 194 && (GameScreen.ck = var7_20.h > 0)) {
                                                                                                GameService.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            } else if (GameScreen.cl) {
                                                                                Screen.cs = 14;
                                                                                main.GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                                    main.GameCanvas.i[14] = true;
                                                                                    main.GameCanvas.m = false;
                                                                                    main.GameCanvas.ai = false;
                                                                                    main.GameCanvas.ResourceUtil = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < GameWorld.e().aF.length) {
                                                                                        var7_20 = GameWorld.e().aF[var6_16];
                                                                                        if (var7_20 != null && var7_20.IActionListener.a == 193 && (GameScreen.cl = var7_20.h > 0)) {
                                                                                            GameService.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                            break;
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var1_1.aL == null) break block241;
                                                                    var1_1.K();
                                                                    break block242;
                                                                }
                                                                if (!GameScreen.O) break block242;
                                                                if (var1_1.J()) break block237;
                                                                var1_1.eB = -1;
                                                                var6_16 = 0;
                                                                if (GameScreen.aQ.length > 5 && (main.GameCanvas.a(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY) || main.GameCanvas.a(GameScreen.eV + GameScreen.eT[5] - GameScreen.dY / 2 + 12, GameScreen.eU[5] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY))) {
                                                                    var6_16 = 1;
                                                                }
                                                                if (var6_16 != 0 || main.GameCanvas.a(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY) || !main.GameCanvas.f && main.GameCanvas.a(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, GameScreen.dY, GameScreen.aQ.length * GameScreen.dY)) {
                                                                    main.GameCanvas.ai = false;
                                                                    var1_1.aT = false;
                                                                    var7_21 = (main.GameCanvas.t - (GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12)) / GameScreen.dY;
                                                                    if (var6_16 != 0 && main.GameCanvas.u < GameScreen.eU[0]) {
                                                                        var7_21 += 5;
                                                                    }
                                                                    var1_1.eB = var7_21;
                                                                    if (main.GameCanvas.ResourceUtil && main.GameCanvas.m) {
                                                                        main.GameCanvas.m = false;
                                                                        main.GameCanvas.ai = false;
                                                                        main.GameCanvas.ResourceUtil = false;
                                                                        var1_1.ex = var7_21;
                                                                        if (var1_1.ex > GameScreen.aQ.length - 1) {
                                                                            var1_1.ex = GameScreen.aQ.length - 1;
                                                                        }
                                                                        if ((var2_23 = GameScreen.aQ[var1_1.ex]) != null) {
                                                                            super.a((Skill)var2_23, true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (main.GameCanvas.m) {
                                                                if (main.GameCanvas.j[1] || main.GameCanvas.j[2] || main.GameCanvas.j[3] || main.GameCanvas.j[4] || main.GameCanvas.j[6]) {
                                                                    main.GameCanvas.m = false;
                                                                }
                                                                main.GameCanvas.j[1] = false;
                                                                main.GameCanvas.j[2] = false;
                                                                main.GameCanvas.j[3] = false;
                                                                main.GameCanvas.j[4] = false;
                                                                main.GameCanvas.j[6] = false;
                                                            }
                                                        }
                                                        var1_1 = this;
                                                        var6_17 = System.currentTimeMillis();
                                                        if (main.GameCanvas.i[2] || main.GameCanvas.i[4] || main.GameCanvas.i[6] || main.GameCanvas.i[1] || main.GameCanvas.i[3]) {
                                                            var1_1.aX = 0;
                                                            GameScreen.bj = false;
                                                        }
                                                        if (main.GameCanvas.i[5]) {
                                                            if (var1_1.aX == 0) {
                                                                if (var6_17 - var1_1.LoggingList < 800L && (GameWorld.e().aC != null && (GameWorld.e().aC.GameCanvas.d != 1 && GameWorld.e().T < (long)GameWorld.e().aC.i || GameWorld.e().aC.GameCanvas.d == 1 && GameWorld.e().T < GameWorld.e().W * (long)GameWorld.e().aC.i / 100L) ? false : GameWorld.e().aC != null && (GameWorld.e().aC.GameCanvas.c <= 0 || GameWorld.e().aC.c != 0)) && (GameWorld.e().aQ != null || GameWorld.e().aU != null && GameWorld.e().c(GameWorld.e().aU))) {
                                                                    var1_1.aX = 10;
                                                                    main.GameCanvas.i[5] = false;
                                                                }
                                                            } else {
                                                                var1_1.aX = 0;
                                                                main.GameCanvas.i[6] = false;
                                                                main.GameCanvas.i[4] = false;
                                                            }
                                                            var1_1.LoggingList = var6_17;
                                                        }
                                                        if (main.GameCanvas.w % 5 != 0 || var1_1.aX <= 0 || GameWorld.e().bP != null) break block243;
                                                        if (GameWorld.e().aC != null && (GameWorld.e().aC.a.IActionListener() || GameWorld.e().aC.j)) break block244;
                                                        if ((GameWorld.e().aQ == null || GameWorld.e().aQ.GameScreen == 1 || GameWorld.e().aQ.GameScreen == 0 || GameWorld.e().aU != null) && (GameWorld.e().aU == null || !GameWorld.e().c(GameWorld.e().aU))) break block243;
                                                        if (GameWorld.e().aC.j) break block244;
                                                        super.a(false, true);
                                                    }
                                                    if (var1_1.aX > 1) {
                                                        --var1_1.aX;
                                                    }
                                                }
                                                if (ae.m != null) {
                                                    var1_1 = ae.m.j;
                                                    if ((main.GameCanvas.i[5] || Screen.a((Command)var1_1)) && var1_1 != null) {
                                                        main.GameCanvas.m = false;
                                                        main.GameCanvas.i[5] = false;
                                                        Screen.cs = -1;
                                                        if (var1_1 != null) {
                                                            var1_1.a();
                                                        }
                                                    }
                                                } else if (!cq.IActionListener().IActionListener) {
                                                    if ((main.GameCanvas.i[12] || Screen.a(main.GameCanvas.E.cm)) && this.cm != null) {
                                                        main.GameCanvas.m = false;
                                                        main.GameCanvas.ResourceUtil = false;
                                                        main.GameCanvas.i[12] = false;
                                                        Screen.cs = -1;
                                                        if (this.cm != null) {
                                                            this.cm.a();
                                                        }
                                                    }
                                                    if ((main.GameCanvas.i[13] || Screen.a(main.GameCanvas.E.co)) && this.co != null) {
                                                        main.GameCanvas.m = false;
                                                        main.GameCanvas.ResourceUtil = false;
                                                        main.GameCanvas.i[13] = false;
                                                        Screen.cs = -1;
                                                        if (this.co != null) {
                                                            this.co.a();
                                                        }
                                                    }
                                                    if ((main.GameCanvas.i[5] || Screen.a(main.GameCanvas.E.cn)) && this.cn != null) {
                                                        main.GameCanvas.m = false;
                                                        main.GameCanvas.i[5] = false;
                                                        Screen.cs = -1;
                                                        if (this.cn != null) {
                                                            this.cn.a();
                                                        }
                                                    }
                                                } else {
                                                    if (cq.IActionListener().d != null && (main.GameCanvas.i[12] || Screen.a(cq.IActionListener().d)) && cq.IActionListener().d != null) {
                                                        cq.IActionListener().d.a();
                                                    }
                                                    if (cq.IActionListener().e != null && (main.GameCanvas.i[13] || Screen.a(cq.IActionListener().e)) && cq.IActionListener().e != null) {
                                                        cq.IActionListener().e.a();
                                                    }
                                                    if (cq.IActionListener().f != null && (main.GameCanvas.i[5] || Screen.a(cq.IActionListener().f)) && cq.IActionListener().f != null) {
                                                        cq.IActionListener().f.a();
                                                    }
                                                }
                                                var1_1 = this;
                                                if (GameWorld.e().bP != null) {
                                                    var1_2 = 0;
                                                    while (var1_2 < main.GameCanvas.i.length) {
                                                        if (main.GameCanvas.i[var1_2]) {
                                                            GameWorld.e().bP = null;
                                                            break;
                                                        }
                                                        ++var1_2;
                                                    }
                                                }
                                                if (cq.IActionListener().IActionListener && main.GameCanvas.ag != 0) {
                                                    cq.IActionListener().a(main.GameCanvas.ag);
                                                    main.GameCanvas.ag = 0;
                                                    return;
                                                }
                                                if (main.GameCanvas.F.a || GameWorld.bH) {
                                                    return;
                                                }
                                                if (main.GameCanvas.i[10]) {
                                                    main.GameCanvas.i[10] = false;
                                                    this.H();
                                                    main.GameCanvas.f();
                                                }
                                                if (main.GameCanvas.i[11] && this.aL == null) {
                                                    if (this.bQ != null) {
                                                        this.bQ.GameCanvas.a();
                                                    } else if (GameScreen.aE.IActionListener.IActionListener != null && GameScreen.aE.IActionListener.IActionListener.c != null) {
                                                        main.GameCanvas.G.ResourceUtil();
                                                        main.GameCanvas.G.s();
                                                    }
                                                    main.GameCanvas.i[11] = false;
                                                    main.GameCanvas.f();
                                                }
                                                if (main.GameCanvas.ag != 0 && cd.UIPanel && main.GameCanvas.ag == 32) {
                                                    this.H();
                                                    main.GameCanvas.ag = 0;
                                                    main.GameCanvas.f();
                                                }
                                                if (main.GameCanvas.ag != 0 && this.aL == null && cd.UIPanel && main.GameCanvas.ag == 121) {
                                                    if (this.bQ != null) {
                                                        this.bQ.GameCanvas.a();
                                                        main.GameCanvas.ag = 0;
                                                        main.GameCanvas.f();
                                                    } else if (GameScreen.aE.IActionListener.IActionListener != null && GameScreen.aE.IActionListener.IActionListener.c != null) {
                                                        main.GameCanvas.G.ResourceUtil();
                                                        main.GameCanvas.G.s();
                                                        main.GameCanvas.ag = 0;
                                                        main.GameCanvas.f();
                                                    }
                                                }
                                                if (main.GameCanvas.i[10] && this.aL == null) {
                                                    main.GameCanvas.i[10] = false;
                                                    var1_3 = 10;
                                                    var1_4 = GameScreen.aE;
                                                    GameScreen.aE.UIPanel = 10;
                                                    main.GameCanvas.f();
                                                }
                                                var1_5 = this;
                                                if (!GameScreen.dS.IActionListener() && GameScreen.aO != 1) {
                                                    GameWorld.e().ap = true;
                                                    if (main.GameCanvas.ai) {
                                                        main.GameCanvas.ai = false;
                                                        var1_5.aT = true;
                                                        var1_5.ee = 0;
                                                        var1_5.ea = var1_5.ec = main.GameCanvas.GameScreen;
                                                        var1_5.eb = var1_5.ed = main.GameCanvas.q;
                                                    }
                                                    if (var1_5.aT) {
                                                        var6_18 = main.GameCanvas.GameScreen - var1_5.ea;
                                                        var7_22 = main.GameCanvas.q - var1_5.eb;
                                                        if (!(var1_5.dZ || MathUtil.UIPanel(main.GameCanvas.GameScreen - var1_5.ec) <= 15 && MathUtil.UIPanel(main.GameCanvas.q - var1_5.ed) <= 15)) {
                                                            var1_5.dZ = true;
                                                        }
                                                        var1_5.ea = main.GameCanvas.GameScreen;
                                                        var1_5.eb = main.GameCanvas.q;
                                                        ++var1_5.ee;
                                                        if (var1_5.dZ) {
                                                            GameWorld.e().ap = false;
                                                            GameScreen.k -= var7_22;
                                                            if ((GameScreen.j -= var6_18) < 24 && (var2_24 = (24 - GameScreen.j) / 3) != 0) {
                                                                GameScreen.j += var6_18 - var6_18 / var2_24;
                                                            }
                                                            if (GameScreen.j < 24) {
                                                                GameScreen.j = 24;
                                                            }
                                                            if (GameScreen.j > GameScreen.n && (var2_25 = (GameScreen.j - GameScreen.n) / 3) != 0) {
                                                                GameScreen.j += var6_18 - var6_18 / var2_25;
                                                            }
                                                            if (GameScreen.j > GameScreen.n) {
                                                                GameScreen.j = GameScreen.n;
                                                            }
                                                            if (GameScreen.k < 0 && (var2_26 = (0 - GameScreen.k) / 3) != 0) {
                                                                GameScreen.k += var7_22 - var7_22 / var2_26;
                                                            }
                                                            if (GameScreen.k < 0) {
                                                                GameScreen.k = 0;
                                                            }
                                                            if (GameScreen.k > GameScreen.cF) {
                                                                GameScreen.k = GameScreen.cF;
                                                            }
                                                            GameScreen.ResourceUtil = GameScreen.j;
                                                            GameScreen.m = GameScreen.k;
                                                        }
                                                    }
                                                    if (var1_5.aT && main.GameCanvas.m) {
                                                        var1_5.aT = false;
                                                        var1_5.dZ = false;
                                                        if (MathUtil.UIPanel(main.GameCanvas.GameScreen - var1_5.ec) > 15 || MathUtil.UIPanel(main.GameCanvas.q - var1_5.ed) > 15) {
                                                            main.GameCanvas.m = false;
                                                        }
                                                    }
                                                }
                                                if (GameWorld.e().ci || (var1_5 = this).J()) break block245;
                                                if (var1_5.bQ == null || var1_5.bQ.a == null || !var1_5.bQ.GameCanvas.c()) break block246;
                                                var1_5.bQ.GameCanvas.a();
                                                break block245;
                                            }
                                            var2_23 = var1_5;
                                            if (var2_23.aL != null && main.GameCanvas.a(var3_10 = (main.GameCanvas.A - 5 * GameScreen.eI) / 2, var5_28 = main.GameCanvas.B - 40, var4_27 = 5 * GameScreen.eI, var8_31 = GameScreen.eI) != false) break block245;
                                            var6_19 = System.currentTimeMillis();
                                            if (var1_5.aU != 0L) {
                                                var1_5.aU = 0L;
                                                main.GameCanvas.ai = false;
                                                if (!var1_5.ef) {
                                                    var2_23 = var1_5;
                                                    var3_11 = main.GameCanvas.GameScreen + var2_23.ej;
                                                    var4_27 = main.GameCanvas.q + var2_23.ek;
                                                    if (!super.UIPanel(var3_11, var4_27) && !super.f(var3_11, var4_27)) {
                                                        super.h(var3_11, var4_27);
                                                    }
                                                    main.GameCanvas.m = false;
                                                    var1_5.ct = true;
                                                    var1_5.cu = ResourceUtil.d();
                                                }
                                            }
                                            if (!var1_5.ct) break block247;
                                            var1_5.cv = ResourceUtil.d();
                                            if (var1_5.cv - var1_5.cu >= 300L || !main.GameCanvas.m) break block247;
                                            var1_5.ct = false;
                                            var2_23 = var1_5;
                                            var3_12 = main.GameCanvas.GameScreen + var2_23.ej;
                                            var4_27 = main.GameCanvas.q + var2_23.ek;
                                            GameWorld.e();
                                            var8_32 = super.e(var3_12, var4_27);
                                            if (var8_32 == null) break block248;
                                            if (var8_32 instanceof aa && !GameScreen.a((aa)var8_32)) break block249;
                                            if (super.a(var8_32) || !var8_32.equals(GameWorld.e().aT) && var2_23.aL != null) break block247;
                                            if (!GameWorld.e().I() || GameWorld.e().aU == null || var8_32.equals(GameWorld.e().aU) || var8_32.equals(GameWorld.e().aU.aR) || !(var8_32 instanceof GameWorld)) break block250;
                                            var5_29 = (GameWorld)var8_32;
                                            if (var5_29.aN != 5 && !var5_29.I()) break block249;
                                        }
                                        if (bv.ResourceUtil == 51 && var8_32.equals(GameWorld.e().aT)) break block249;
                                        super.IActionListener(var8_32);
                                        break block247;
                                    }
                                    if (super.UIPanel(var3_12, var4_27) || super.f(var3_12, var4_27)) break block247;
                                }
                                super.h(var3_12, var4_27);
                            }
                            if (!main.GameCanvas.m) break block245;
                            var2_23 = var1_5;
                            var3_13 = main.GameCanvas.GameScreen + GameScreen.j;
                            var4_27 = main.GameCanvas.q + GameScreen.k;
                            GameWorld.e();
                            var5_30 = super.e(var3_13, var4_27);
                            if (var5_30 == null) ** GOTO lbl380
                            if (!GameWorld.e().I() || GameWorld.e().aU == null || var5_30.equals(GameWorld.e().aU) || var5_30.equals(GameWorld.e().aU.aR) || !(var5_30 instanceof GameWorld)) break block251;
                            var8_33 = (GameWorld)var5_30;
                            if (var8_33.aN == 5 || var8_33.I()) break block251;
                            super.h(var3_13, var4_27);
                            ** GOTO lbl380
                        }
                        if (GameWorld.e().aQ != var5_30 && GameWorld.e().aV != var5_30) break block252;
                        super.IActionListener(var5_30);
                        v0 = true;
                        break block253;
                    }
                    if (bv.ResourceUtil != 51 || !var5_30.equals(GameWorld.e().aT)) break block254;
                    super.h(var3_13, var4_27);
                    ** GOTO lbl380
                }
                if (GameWorld.e().cf != null || GameWorld.e().cc != null || GameWorld.e().cd != null || GameWorld.e().D() != null) {
                    v0 = false;
                } else {
                    GameWorld.e().a(var5_30);
                    var5_30.GameScreen();
lbl380:
                    // 4 sources

                    v0 = false;
                }
            }
            var1_5.ef = v0;
            var1_5.aU = var6_19;
            var1_5.ej = GameScreen.j;
            var1_5.ek = GameScreen.k;
            main.GameCanvas.m = false;
        }
        if (GameWorld.e().an != null && GameWorld.e().an.c()) {
            GameWorld.e().an.a();
        }
        if (GameWorld.e().cf != null) {
            return;
        }
        if (GameWorld.e().H == 1) {
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
                this.a(false, false);
            } else if (main.GameCanvas.j[2]) {
                if (!GameWorld.e().bJ) {
                    var1_6 = false;
                    if (GameWorld.e().B - GameWorld.e().bD != 0 || GameWorld.e().C - GameWorld.e().bE != 0) {
                        GameService.a().UIPanel();
                    }
                    GameWorld.e().E = -10;
                    GameWorld.e().D = 0;
                    GameWorld.e().H = 3;
                    GameWorld.e().F = 0;
                }
            } else if (main.GameCanvas.j[4]) {
                GameScreen.bj = false;
                GameWorld.e().ar = false;
                if (GameWorld.e().I == 1) {
                    GameWorld.e().I = -1;
                } else if (!GameWorld.e().bJ) {
                    if (GameWorld.e().B - GameWorld.e().bD != 0) {
                        GameService.a().UIPanel();
                    }
                    GameWorld.e().H = 2;
                    GameWorld.e().D = -GameWorld.e().O;
                }
                GameWorld.e().cJ = false;
            } else if (main.GameCanvas.j[6]) {
                GameScreen.bj = false;
                GameWorld.e().ar = false;
                if (GameWorld.e().I == -1) {
                    GameWorld.e().I = 1;
                } else if (!GameWorld.e().bJ) {
                    if (GameWorld.e().B - GameWorld.e().bD != 0) {
                        GameService.a().UIPanel();
                    }
                    GameWorld.e().H = 2;
                    GameWorld.e().D = GameWorld.e().O;
                }
                GameWorld.e().cJ = false;
            }
        } else if (GameWorld.e().H == 2) {
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
                this.a(false, true);
            } else if (main.GameCanvas.j[2]) {
                if (GameWorld.e().B - GameWorld.e().bD != 0 || GameWorld.e().C - GameWorld.e().bE != 0) {
                    GameService.a().UIPanel();
                }
                GameWorld.e().E = -10;
                GameWorld.e().H = 3;
                GameWorld.e().F = 0;
            } else if (main.GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == 1) {
                    GameWorld.e().I = -1;
                } else {
                    v1 = GameWorld.e();
                    v2 = -GameWorld.e().O;
                    GameWorld.e();
                    v1.D = v2;
                }
            } else if (main.GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == -1) {
                    GameWorld.e().I = 1;
                } else {
                    v3 = GameWorld.e();
                    v4 = GameWorld.e().O;
                    GameWorld.e();
                    v3.D = v4;
                }
            }
        } else if (GameWorld.e().H == 3) {
            GameScreen.bj = false;
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
                this.a(false, true);
            }
            if (main.GameCanvas.j[4] || main.GameCanvas.j[1] && this.aL == null) {
                if (GameWorld.e().I == 1) {
                    GameWorld.e().I = -1;
                } else {
                    GameWorld.e().D = -GameWorld.e().O;
                }
            } else if (main.GameCanvas.j[6] || main.GameCanvas.j[3] && this.aL == null) {
                if (GameWorld.e().I == -1) {
                    GameWorld.e().I = 1;
                } else {
                    GameWorld.e().D = GameWorld.e().O;
                }
            }
            if ((main.GameCanvas.j[2] || (main.GameCanvas.j[1] || main.GameCanvas.j[3]) && this.aL == null) && GameWorld.e().ao && GameWorld.e().T > 0L && GameWorld.e().F < 8 && GameWorld.e().E > -4) {
                ++GameWorld.e().F;
                GameWorld.e().E = -7;
            }
        } else if (GameWorld.e().H == 4) {
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
                this.a(false, true);
            }
            if (main.GameCanvas.j[2] && GameWorld.e().T > 0L && GameWorld.e().ao) {
                GameScreen.bj = false;
                if (!(GameWorld.e().B - GameWorld.e().bD == 0 && GameWorld.e().C - GameWorld.e().bE == 0 || MathUtil.UIPanel(GameWorld.e().B - GameWorld.e().bD) <= 96 && MathUtil.UIPanel(GameWorld.e().C - GameWorld.e().bE) <= 24)) {
                    GameService.a().UIPanel();
                }
                GameWorld.e().E = -10;
                GameWorld.e().H = 3;
                GameWorld.e().F = 0;
            }
            if (main.GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == 1) {
                    GameWorld.e().I = -1;
                } else {
                    ++GameWorld.e().F;
                    GameWorld.e().D = -GameWorld.e().O;
                    if (GameWorld.e().F > 5 && GameWorld.e().E > 6) {
                        GameWorld.e().H = 10;
                        GameWorld.e().F = 0;
                        GameWorld.e().E = 0;
                    }
                }
            } else if (main.GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == -1) {
                    GameWorld.e().I = 1;
                } else {
                    ++GameWorld.e().F;
                    GameWorld.e().D = GameWorld.e().O;
                    if (GameWorld.e().F > 5 && GameWorld.e().E > 6) {
                        GameWorld.e().H = 10;
                        GameWorld.e().F = 0;
                        GameWorld.e().E = 0;
                    }
                }
            }
        } else if (GameWorld.e().H == 10) {
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
                this.a(false, true);
            }
            if (GameWorld.e().ao && GameWorld.e().T > 0L) {
                if (main.GameCanvas.j[2]) {
                    GameScreen.bj = false;
                    if (!(GameWorld.e().B - GameWorld.e().bD == 0 && GameWorld.e().C - GameWorld.e().bE == 0 || MathUtil.UIPanel(GameWorld.e().B - GameWorld.e().bD) <= 96 && MathUtil.UIPanel(GameWorld.e().C - GameWorld.e().bE) <= 24)) {
                        GameService.a().UIPanel();
                    }
                    GameWorld.e().E = -10;
                    GameWorld.e().H = 3;
                    GameWorld.e().F = 0;
                } else if (main.GameCanvas.j[4]) {
                    GameScreen.bj = false;
                    if (GameWorld.e().I == 1) {
                        GameWorld.e().I = -1;
                    } else {
                        GameWorld.e().D = -(GameWorld.e().O + 1);
                    }
                } else if (main.GameCanvas.j[6]) {
                    if (GameWorld.e().I == -1) {
                        GameWorld.e().I = 1;
                    } else {
                        GameWorld.e().D = GameWorld.e().O + 1;
                    }
                }
            }
        } else if (GameWorld.e().H == 7) {
            if (main.GameCanvas.i[5]) {
                main.GameCanvas.i[5] = false;
            }
            if (main.GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == 1) {
                    GameWorld.e().I = -1;
                } else {
                    GameWorld.e().D = -GameWorld.e().O + 2;
                }
            } else if (main.GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (GameWorld.e().I == -1) {
                    GameWorld.e().I = 1;
                } else {
                    GameWorld.e().D = GameWorld.e().O - 2;
                }
            }
        }
        if (main.GameCanvas.i[8] && main.GameCanvas.ag != 56) {
            main.GameCanvas.i[8] = false;
            GameWorld.e().bQ = 0;
        }
        if (main.GameCanvas.i[10]) {
            main.GameCanvas.i[10] = false;
            this.H();
        }
        if (main.GameCanvas.ag != 0) {
            if (this.aL == null) {
                if (cd.UIPanel) {
                    if (main.GameCanvas.ag == 113) {
                        if (GameScreen.aP[0] != null) {
                            this.a(GameScreen.aP[0], true);
                        }
                    } else if (main.GameCanvas.ag == 119) {
                        if (GameScreen.aP[1] != null) {
                            this.a(GameScreen.aP[1], true);
                        }
                    } else if (main.GameCanvas.ag == 101) {
                        if (GameScreen.aP[2] != null) {
                            this.a(GameScreen.aP[2], true);
                        }
                    } else if (main.GameCanvas.ag == 114) {
                        if (GameScreen.aP[3] != null) {
                            this.a(GameScreen.aP[3], true);
                        }
                    } else if (main.GameCanvas.ag == 116) {
                        if (GameScreen.aP[4] != null) {
                            this.a(GameScreen.aP[4], true);
                        }
                    } else if (main.GameCanvas.ag != 50 && main.GameCanvas.ag != 53) {
                        cq.IActionListener().a(main.GameCanvas.ag, this, "");
                    }
                } else if (!main.GameCanvas.c) {
                    cq.IActionListener().a(main.GameCanvas.ag, this, "");
                } else if (main.GameCanvas.ag == 55) {
                    if (GameScreen.aP[0] != null) {
                        this.a(GameScreen.aP[0], true);
                    }
                } else if (main.GameCanvas.ag == 56) {
                    if (GameScreen.aP[1] != null) {
                        this.a(GameScreen.aP[1], true);
                    }
                } else if (main.GameCanvas.ag == 57) {
                    if (GameScreen.aP[2] != null) {
                        this.a(GameScreen.aP[2], true);
                    }
                } else if (main.GameCanvas.ag == 49) {
                    if (GameScreen.aP[3] != null) {
                        this.a(GameScreen.aP[3], true);
                    }
                } else if (main.GameCanvas.ag == 51) {
                    if (GameScreen.aP[4] != null) {
                        this.a(GameScreen.aP[4], true);
                    }
                } else if (main.GameCanvas.ag == 48) {
                    cq.IActionListener().a("");
                }
            } else {
                var1_7 = this.bs.toCharArray();
                var2_23 = new LoggingList("");
                var3_14 = 0;
                while (var3_14 < var1_7.length) {
                    var2_23.addElement(String.valueOf(var1_7[var3_14]));
                    ++var3_14;
                }
                var2_23.removeElementAt(0);
                var3_15 = String.valueOf((char)main.GameCanvas.ag);
                if (var3_15.equals("") || var3_15 == null || var3_15.equals("\n")) {
                    var3_15 = "-";
                }
                var2_23.insertElementAt(var3_15, var2_23.size());
                this.bs = "";
                var1_8 = 0;
                while (var1_8 < var2_23.size()) {
                    this.bs = String.valueOf(this.bs) + ((String)var2_23.elementAt(var1_8)).toUpperCase();
                    ++var1_8;
                }
                GameService.a().a((char)main.GameCanvas.ag);
            }
            main.GameCanvas.ag = 0;
        }
        main.GameCanvas.f();
    }

    private bq e(int n2, int n3) {
        bq bq2 = null;
        int n4 = 0;
        LoggingList[] elArray = new LoggingList[]{F, G, E, D};
        int n5 = 0;
        while (n5 < elArray.length) {
            int n6 = 0;
            while (n6 < elArray[n5].size()) {
                block10: {
                    int n7;
                    bq bq3;
                    block11: {
                        bq3 = (bq)elArray[n5].elementAt(n6);
                        if (bq3.q()) break block10;
                        if (!(bq3 instanceof aa)) break block11;
                        aa aa2 = (aa)bq3;
                        if (aa2.J && aa2.equals(GameWorld.e().aR)) break block10;
                    }
                    int n8 = bq3.ResourceUtil();
                    int n9 = bq3.m();
                    int n10 = bq3.o();
                    if (GameScreen.a(n2, n3, n8 - n10 / 2 - 30, n9 - (n7 = bq3.n()) - 30, n10 + 60, n7 + 60)) {
                        if (bq2 == null) {
                            bq2 = bq3;
                            n4 = MathUtil.UIPanel(n2 - n8) + MathUtil.UIPanel(n3 - n9);
                            if (n5 == 1) {
                                return bq2;
                            }
                        } else if ((n8 = MathUtil.UIPanel(n2 - n8) + MathUtil.UIPanel(n3 - n9)) < n4) {
                            bq2 = bq3;
                            n4 = n8;
                        }
                    }
                }
                ++n6;
            }
            ++n5;
        }
        return bq2;
    }

    private static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n2 >= n4 && n2 <= n4 + n6 && n3 >= n5 && n3 <= n5 + n7;
    }

    private boolean a(bq bq2) {
        int n2;
        if (bq2 == null) {
            return false;
        }
        int n3 = bq2.m();
        if (n3 < (n2 = GameWorld.e().C)) {
            while (n3 < n2) {
                if (!bv.a(GameWorld.e().B, n2 -= 5, 8192)) continue;
                this.aX = 0;
                GameWorld.e();
                GameWorld.e().bP = null;
                return true;
            }
        }
        return false;
    }

    private void IActionListener(bq bq2) {
        if (!bq2.equals(GameWorld.e().aT) && this.aL != null) {
            return;
        }
        if (this.a(bq2)) {
            return;
        }
        boolean bl2 = false;
        bq bq3 = bq2;
        GameScreen p2 = this;
        if (bq3 != null && p2.eL <= 0) {
            p2.eL = 10;
            int n2 = bq3.ResourceUtil();
            n2 = (n2 = MathUtil.UIPanel(GameWorld.e().B - n2)) <= 80 ? 1 : (n2 > 80 && n2 <= 200 ? 2 : (n2 > 200 && n2 <= 400 ? 3 : 4));
            if (bq3.equals(GameWorld.e().aQ) || bq3.equals(GameWorld.e().aU) && GameWorld.e().c(GameWorld.e().aU)) {
                at.a(135, bq3.ResourceUtil(), bq3.m(), n2);
            } else if (bq3.equals(GameWorld.e().aT) || bq3.equals(GameWorld.e().aV) || bq3.equals(GameWorld.e().aU)) {
                at.a(136, bq3.ResourceUtil(), bq3.m(), n2);
            }
        }
        GameWorld.e();
        GameWorld.e().bP = null;
        GameWorld.e().E = 0;
        GameWorld.e().D = 0;
        bq2.GameScreen();
        this.aX = 10;
        this.a(false, true);
        this.eh = bq2.ResourceUtil();
        this.ei = bq2.m();
        this.eg = false;
        this.aV = true;
    }

    private boolean f(int n2, int n3) {
        int n4;
        int n5;
        if (this.equals(aE) && GameScreen.j().bQ != null) {
            return false;
        }
        if (GameScreen.aE.IActionListener.IActionListener != null && GameScreen.aE.IActionListener.IActionListener.c != null && GameScreen.a(n2 - j, n3 - k, n5 = MathUtil.UIPanel(GameScreen.aE.d) + GameScreen.aE.IActionListener.UIPanel - 40, n4 = MathUtil.UIPanel(GameScreen.aE.c) + GameScreen.aE.IActionListener.h, 200, GameScreen.aE.IActionListener.j)) {
            n2 = 10;
            Pos eo2 = aE;
            aE.UIPanel = 10;
            return true;
        }
        return false;
    }

    private boolean UIPanel(int n2, int n3) {
        int n4 = 0;
        while (n4 < bo.GameCanvas.size()) {
            bo bo2 = (bo)bo.GameCanvas.elementAt(n4);
            if (GameScreen.a(n2, n3, bo2.d, bo2.e, bo2.f, bo2.UIPanel)) {
                if (bo2.e <= 24 && bv.f() && GameWorld.e().aN != 0) {
                    return false;
                }
                if (bo2.j) {
                    bo2.a(10);
                    return true;
                }
            }
            ++n4;
        }
        return false;
    }

    private void h(int n2, int n3) {
        if (dS.c()) {
            return;
        }
        GameWorld.e();
        if (n2 < bv.c && n2 > bv.c - 32) {
            GameWorld.e().bP = new Menu(bv.c, n3);
            return;
        }
        if (n2 < 32 && n2 > 0) {
            GameWorld.e().bP = new Menu(0, n3);
            return;
        }
        this.eh = n2;
        this.ei = n3;
        this.eg = false;
        GameWorld.e().bQ = 0;
        int n4 = n2 = GameWorld.e().ao && GameWorld.e().T > 0L ? 0 : 1000;
        if (this.ei > GameWorld.e().C && MathUtil.UIPanel(this.eh - GameWorld.e().B) < 12) {
            return;
        }
        n3 = 0;
        while (n3 < n2 + 60) {
            if (this.ei + n3 >= bv.d - 24) break;
            if (bv.a(this.eh, this.ei + n3, 2)) {
                this.ei = bv.e(this.ei + n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        n3 = 0;
        while (n3 < n2 + 40) {
            if (bv.a(this.eh, this.ei - n3, 2)) {
                this.ei = bv.e(this.ei - n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        this.aV = true;
        GameWorld.e().bQ = 0;
        if (!this.eg && this.ei < GameWorld.e().C - 50) {
            GameWorld.e().bQ = 20;
        }
        this.aX = 0;
        if (GameWorld.e().cJ) {
            GameWorld.e().P();
        }
        GameWorld.e().bP = new Menu(this.eh, this.ei);
        GameWorld.e().I = GameWorld.e().B - GameWorld.e().bP.a > 0 ? -1 : 1;
        GameWorld.e().ay = null;
        bj = false;
    }

    private void H() {
        if (GameWorld.e().cR) {
            return;
        }
        if (GameWorld.e().cO) {
            return;
        }
        if (GameWorld.e().cI > 0) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.em < 10000L) {
            return;
        }
        if (!GameWorld.e().M()) {
            aD.a(GameStrings.aU, 0);
            return;
        }
        at.a(11, GameWorld.e(), 5);
        at.a(104, GameWorld.e(), 4);
        this.em = l2;
        SettingsManager.a();
    }

    public final void IActionListener(int n2, int n3) {
        if (!this.Pos) {
            SettingsManager.a();
            MathUtil.c("ACTIVE SUPER POWER");
            this.Pos = true;
            this.ep = 0;
            this.es = 0;
            this.eq = n2 - j;
            this.er = n3 - k;
        }
    }

    public final void a(boolean bl2) {
        this.IConnectionListener = true;
        this.ba = true;
        this.et = true;
        if (bl2) {
            ea ea2 = new ea(20, GameWorld.e().B, GameWorld.e().C - 77, 2, 8, 1);
            ei.a(ea2);
        }
    }

    public final void o() {
        this.IConnectionListener = false;
        this.ba = true;
        this.et = false;
    }

    public final void GameScreen() {
        this.Screen = true;
        this.be = MGraphics.a(0.4f, 0, main.GameCanvas.GameWorld[main.GameCanvas.GameWorld.length - 1]);
    }

    public final void c(int n2, int n3) {
        MathUtil.c("VE RONG THAN O VI TRI x= " + n2 + " Message=" + n3);
        this.GameScreen();
        ea ea2 = new ea(this.bc ? 25 : 17, n2, n3 - 77, 2, -1, 1);
        ei.a(ea2);
    }

    /*
     * Unable to fully structure code
     */
    private void a(boolean var1_1, boolean var2_9) {
        block46: {
            block48: {
                block50: {
                    block73: {
                        block75: {
                            block78: {
                                block77: {
                                    block76: {
                                        block74: {
                                            block67: {
                                                block70: {
                                                    block69: {
                                                        block71: {
                                                            block72: {
                                                                block68: {
                                                                    block59: {
                                                                        block65: {
                                                                            block66: {
                                                                                block64: {
                                                                                    block63: {
                                                                                        block62: {
                                                                                            block61: {
                                                                                                block60: {
                                                                                                    block58: {
                                                                                                        block57: {
                                                                                                            block56: {
                                                                                                                block55: {
                                                                                                                    block54: {
                                                                                                                        block53: {
                                                                                                                            block52: {
                                                                                                                                block51: {
                                                                                                                                    block49: {
                                                                                                                                        block47: {
                                                                                                                                            if (GameWorld.e().aU != null && GameWorld.e().aU.C >= GameWorld.e().C + 48 && bv.a(GameWorld.e().B, GameWorld.e().C, 2)) {
                                                                                                                                                this.aX = 0;
                                                                                                                                                GameWorld.e().bP = null;
                                                                                                                                                GameWorld.bH = false;
                                                                                                                                                GameWorld.e().bJ = false;
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            MathUtil.c("do fire");
                                                                                                                                            ++GameScreen.eu;
                                                                                                                                            var1_2 = GameWorld.e().i();
                                                                                                                                            var3_10 = GameWorld.e().j();
                                                                                                                                            if (var2_9 == 0 && var1_2 != null && (GameWorld.e().aQ == null || GameWorld.e().aQ != null && GameWorld.e().aQ.C == 0)) {
                                                                                                                                                var1_2.UIPanel.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (var2_9 == 0 && var3_10 != null && (GameWorld.e().aQ == null || GameWorld.e().aQ != null && GameWorld.e().aQ.C == 0)) {
                                                                                                                                                var3_10.UIPanel.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (bv.ResourceUtil == 51 && GameWorld.e().aT != null) {
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (GameWorld.e().H == 14) break block46;
                                                                                                                                            GameWorld.e().E = 0;
                                                                                                                                            GameWorld.e().D = 0;
                                                                                                                                            if (!GameWorld.e().w() || !GameWorld.e().O()) break block47;
                                                                                                                                            if (this.G()) {
                                                                                                                                                GameWorld.e();
                                                                                                                                                GameWorld.e();
                                                                                                                                                GameWorld.A();
                                                                                                                                            }
                                                                                                                                            break block48;
                                                                                                                                        }
                                                                                                                                        var1_2 = this;
                                                                                                                                        if (!var1_2.a(GameWorld.e().aU)) break block49;
                                                                                                                                        v0 = false;
                                                                                                                                        break block50;
                                                                                                                                    }
                                                                                                                                    if (!super.a(GameWorld.e().aQ)) break block51;
                                                                                                                                    v0 = false;
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                if (!super.a(GameWorld.e().aT)) break block52;
                                                                                                                                v0 = false;
                                                                                                                                break block50;
                                                                                                                            }
                                                                                                                            if (!cq.IActionListener().IActionListener) break block53;
                                                                                                                            v0 = false;
                                                                                                                            break block50;
                                                                                                                        }
                                                                                                                        if (bp.IActionListener) break block54;
                                                                                                                        GameWorld.e();
                                                                                                                        if (!GameWorld.bH) break block55;
                                                                                                                    }
                                                                                                                    v0 = false;
                                                                                                                    break block50;
                                                                                                                }
                                                                                                                if (GameWorld.e().aC == null || GameWorld.e().aC.GameCanvas.a != 6 || GameWorld.e().aV == null) break block56;
                                                                                                                super.I();
                                                                                                                v0 = false;
                                                                                                                break block50;
                                                                                                            }
                                                                                                            if (GameWorld.e().aC == null || GameWorld.e().aC.GameCanvas.e != 2 || GameWorld.e().aT != null || GameWorld.e().aC.GameCanvas.a == 6) break block57;
                                                                                                            v0 = super.G();
                                                                                                            break block50;
                                                                                                        }
                                                                                                        if (GameWorld.e().cf == null && (GameWorld.e().aQ != null || GameWorld.e().aT != null || GameWorld.e().aU != null || GameWorld.e().aV != null)) break block58;
                                                                                                        v0 = false;
                                                                                                        break block50;
                                                                                                    }
                                                                                                    if (GameWorld.e().aQ == null) break block59;
                                                                                                    if (GameWorld.e().aQ.u() && GameWorld.e().aQ.GameScreen == 4) {
                                                                                                        GameWorld.e().aQ = null;
                                                                                                        GameWorld.e().bP = null;
                                                                                                    }
                                                                                                    GameScreen.bj = true;
                                                                                                    if (GameScreen.a(GameWorld.e().aQ)) break block60;
                                                                                                    v0 = false;
                                                                                                    break block50;
                                                                                                }
                                                                                                if (var1_2.aL == null) break block61;
                                                                                                v0 = false;
                                                                                                break block50;
                                                                                            }
                                                                                            if (GameWorld.e().aC != null) break block62;
                                                                                            v0 = false;
                                                                                            break block50;
                                                                                        }
                                                                                        if (!GameWorld.e().w()) break block63;
                                                                                        v0 = false;
                                                                                        break block50;
                                                                                    }
                                                                                    var2_9 = -1;
                                                                                    var3_11 = MathUtil.UIPanel(GameWorld.e().B - GameScreen.j) * MGraphics.IActionListener;
                                                                                    if (GameWorld.e().aU != null) {
                                                                                        var2_9 = MathUtil.UIPanel(GameWorld.e().B - GameWorld.e().aU.B) * MGraphics.IActionListener;
                                                                                    } else if (GameWorld.e().aQ != null) {
                                                                                        var2_9 = MathUtil.UIPanel(GameWorld.e().B - GameWorld.e().aQ.m) * MGraphics.IActionListener;
                                                                                    }
                                                                                    if ((GameWorld.e().aQ.GameScreen == 1 || GameWorld.e().aQ.GameScreen == 0 || GameWorld.e().aC.GameCanvas.e == 4 || var2_9 == -1 || var2_9 > var3_11) && GameWorld.e().aC.GameCanvas.e == 4) {
                                                                                        GameWorld.e().I = GameWorld.e().aQ.m < GameWorld.e().B ? -1 : 1;
                                                                                        super.a(GameWorld.e().aC, true);
                                                                                    }
                                                                                    if (super.G()) break block64;
                                                                                    v0 = false;
                                                                                    break block50;
                                                                                }
                                                                                GameWorld.e().I = GameWorld.e().B < GameWorld.e().aQ.ResourceUtil() ? 1 : -1;
                                                                                var1_3 = Math.abs(GameWorld.e().B - GameWorld.e().aQ.ResourceUtil());
                                                                                var3_11 = Math.abs(GameWorld.e().C - GameWorld.e().aQ.m());
                                                                                GameWorld.e().D = 0;
                                                                                if (var1_3 > GameWorld.e().aC.UIPanel || var3_11 > GameWorld.e().aC.h) break block65;
                                                                                if (GameWorld.e().aC.GameCanvas.a == 20) ** GOTO lbl-1000
                                                                                if (var3_11 <= var1_3 || MathUtil.UIPanel(GameWorld.e().C - GameWorld.e().aQ.m()) <= 30 || GameWorld.e().aQ.z().c != 4) break block66;
                                                                                GameWorld.e().bP = new Menu(GameWorld.e().B + GameWorld.e().I, GameWorld.e().aQ.m());
                                                                                GameWorld.e().ay = new Command(null, null, 8002, null);
                                                                                main.GameCanvas.UIPanel();
                                                                                main.GameCanvas.f();
                                                                                v0 = false;
                                                                                break block50;
                                                                            }
                                                                            var4_14 = 20;
                                                                            var2_9 = 0;
                                                                            if (GameWorld.e().aQ instanceof cc || GameWorld.e().aQ instanceof d) {
                                                                                var2_9 = 1;
                                                                            }
                                                                            if (GameWorld.e().aC.UIPanel > 100) {
                                                                                var4_14 = 60;
                                                                                if (var1_3 < 20) {
                                                                                    GameWorld.e().a(GameWorld.e().B, GameWorld.e().C, 10);
                                                                                }
                                                                            }
                                                                            MathUtil.c("dt= " + var4_14);
                                                                            var3_11 = 0;
                                                                            if ((bv.IActionListener(GameWorld.e().B, GameWorld.e().C + 3) & 2) == 2) {
                                                                                v1 = var5_17 = GameWorld.e().B > GameWorld.e().aQ.ResourceUtil() ? 1 : -1;
                                                                                if ((bv.IActionListener(GameWorld.e().aQ.ResourceUtil() + var4_14 * var5_17, GameWorld.e().C + 3) & 2) != 2) {
                                                                                    var3_11 = 1;
                                                                                }
                                                                            }
                                                                            if (var1_3 <= var4_14 && var3_11 == 0) {
                                                                                if (GameWorld.e().B > GameWorld.e().aQ.ResourceUtil()) {
                                                                                    var5_17 = GameWorld.e().aQ.ResourceUtil() + var4_14 + (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = GameWorld.e().aQ.ResourceUtil();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 < var5_17) {
                                                                                        if (bv.IActionListener(var1_3, GameWorld.e().C + 3) == 8 || bv.IActionListener(var1_3, GameWorld.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 += 24;
                                                                                    }
                                                                                    GameWorld.e().B = var2_9 != 0 ? var1_3 - 24 : var5_17;
                                                                                    GameWorld.e().I = -1;
                                                                                } else {
                                                                                    var5_17 = GameWorld.e().aQ.ResourceUtil() - var4_14 - (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = GameWorld.e().aQ.ResourceUtil();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 > var5_17) {
                                                                                        if (bv.IActionListener(var1_3, GameWorld.e().C + 3) == 8 || bv.IActionListener(var1_3, GameWorld.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 -= 24;
                                                                                    }
                                                                                    GameWorld.e().B = var2_9 != 0 ? var1_3 + 24 : var5_17;
                                                                                    GameWorld.e().I = 1;
                                                                                }
                                                                                GameService.a().UIPanel();
                                                                            }
                                                                            main.GameCanvas.UIPanel();
                                                                            main.GameCanvas.f();
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        var4_15 = false;
                                                                        if (GameWorld.e().aQ instanceof cc || GameWorld.e().aQ instanceof d) {
                                                                            var4_15 = true;
                                                                        }
                                                                        var2_9 = (GameWorld.e().aC.UIPanel - (var4_15 != false ? 50 : 20)) * (GameWorld.e().B > GameWorld.e().aQ.ResourceUtil() ? 1 : -1);
                                                                        if (var1_3 <= GameWorld.e().aC.UIPanel) {
                                                                            var2_9 = 0;
                                                                        }
                                                                        GameWorld.e().bP = new Menu(GameWorld.e().aQ.ResourceUtil() + var2_9, GameWorld.e().aQ.m());
                                                                        GameWorld.e().ay = new Command(null, null, 8002, null);
                                                                        main.GameCanvas.UIPanel();
                                                                        main.GameCanvas.f();
                                                                        v0 = false;
                                                                        break block50;
                                                                    }
                                                                    if (GameWorld.e().aT == null) break block67;
                                                                    if (!GameWorld.e().aT.dh) break block68;
                                                                    v0 = false;
                                                                    break block50;
                                                                }
                                                                GameWorld.e().I = GameWorld.e().B < GameWorld.e().aT.B ? 1 : -1;
                                                                GameWorld.e().aT.I = GameWorld.e().B < GameWorld.e().aT.B ? -1 : 1;
                                                                var2_9 = Math.abs(GameWorld.e().B - GameWorld.e().aT.B);
                                                                var3_12 = Math.abs(GameWorld.e().C - GameWorld.e().aT.C);
                                                                if (var3_12 > 40) {
                                                                    GameWorld.e().C = GameWorld.e().aT.C - 40;
                                                                }
                                                                if (var2_9 >= 60) break block69;
                                                                main.GameCanvas.UIPanel();
                                                                main.GameCanvas.f();
                                                                if (var1_2.dv != 0) break block70;
                                                                if (GameWorld.e().aD == null || GameWorld.e().aD.c != 0) break block71;
                                                                if (GameWorld.e().aD.a >= 4 || GameWorld.e().aT.df.a != 4) break block72;
                                                                v0 = false;
                                                                break block50;
                                                            }
                                                            if (GameWorld.e().aD.a >= 3 || GameWorld.e().aT.df.a != 3) break block71;
                                                            v0 = false;
                                                            break block50;
                                                        }
                                                        var1_2.dv = 50;
                                                        bp.a();
                                                        GameService.a().UIPanel();
                                                        GameService.a().j(GameWorld.e().aT.df.a);
                                                        break block70;
                                                    }
                                                    var1_4 = (20 + MathUtil.GameCanvas.nextInt(20)) * (GameWorld.e().B > GameWorld.e().aT.B ? 1 : -1);
                                                    GameWorld.e().bP = new Menu(GameWorld.e().aT.B + var1_4, GameWorld.e().C);
                                                    GameWorld.e().ay = new Command(null, null, 8002, null);
                                                    main.GameCanvas.UIPanel();
                                                    main.GameCanvas.f();
                                                }
                                                v0 = false;
                                                break block50;
                                            }
                                            if (GameWorld.e().aU == null) break block73;
                                            if (var1_2.aL == null) break block74;
                                            v0 = false;
                                            break block50;
                                        }
                                        GameWorld.e().I = GameWorld.e().B < GameWorld.e().aU.B ? 1 : -1;
                                        var2_9 = Math.abs(GameWorld.e().B - GameWorld.e().aU.B);
                                        var3_13 = Math.abs(GameWorld.e().C - GameWorld.e().aU.C);
                                        if (!GameWorld.e().c(GameWorld.e().aU) && !GameWorld.e().Message()) break block75;
                                        if (GameWorld.e().aC != null) break block76;
                                        v0 = false;
                                        break block50;
                                    }
                                    if (super.G()) break block77;
                                    v0 = false;
                                    break block50;
                                }
                                GameWorld.e().I = GameWorld.e().B < GameWorld.e().aU.B ? 1 : -1;
                                GameWorld.e().D = 0;
                                if (var2_9 > GameWorld.e().aC.UIPanel || var3_13 > GameWorld.e().aC.h) break block78;
                                if (GameWorld.e().aC.GameCanvas.a != 20) {
                                    var1_5 = 20;
                                    if (GameWorld.e().aC.UIPanel > 60) {
                                        var1_5 = 60;
                                        if (var2_9 < 20) {
                                            GameWorld.e().a(GameWorld.e().B, GameWorld.e().C, 10);
                                        }
                                    }
                                    var3_13 = 0;
                                    if ((bv.IActionListener(GameWorld.e().B, GameWorld.e().C + 3) & 2) == 2) {
                                        v2 = var4_16 = GameWorld.e().B > GameWorld.e().aU.B ? 1 : -1;
                                        if ((bv.IActionListener(GameWorld.e().aU.B + var1_5 * var4_16, GameWorld.e().C + 3) & 2) != 2) {
                                            var3_13 = 1;
                                        }
                                    }
                                    if (var2_9 <= var1_5 && var3_13 == 0) {
                                        if (GameWorld.e().B > GameWorld.e().aU.B) {
                                            GameWorld.e().B = GameWorld.e().aU.B + var1_5;
                                            GameWorld.e().I = -1;
                                        } else {
                                            GameWorld.e().B = GameWorld.e().aU.B - var1_5;
                                            GameWorld.e().I = 1;
                                        }
                                        GameService.a().UIPanel();
                                    }
                                    main.GameCanvas.UIPanel();
                                    main.GameCanvas.f();
                                }
                                ** GOTO lbl-1000
                            }
                            var1_6 = (GameWorld.e().aC.UIPanel - 20) * (GameWorld.e().B > GameWorld.e().aU.B ? 1 : -1);
                            if (var2_9 <= GameWorld.e().aC.UIPanel) {
                                var1_6 = 0;
                            }
                            GameWorld.e().bP = new Menu(GameWorld.e().aU.B + var1_6, GameWorld.e().aU.C);
                            GameWorld.e().ay = new Command(null, null, 8002, null);
                            main.GameCanvas.UIPanel();
                            main.GameCanvas.f();
                            v0 = false;
                            break block50;
                        }
                        if (var2_9 < 60 && var3_13 < 40) {
                            GameWorld.e();
                            super.F();
                            if (!main.GameCanvas.e && GameWorld.e().aU.J >= 0 && bv.ResourceUtil != 51 && bv.ResourceUtil != 52 && var1_2.bQ == null) {
                                main.GameCanvas.G.a(GameWorld.e().aU);
                                main.GameCanvas.G.s();
                                GameService.a().c(GameWorld.e().aU.J);
                                GameService.a().Message(GameWorld.e().aU.J);
                            }
                        } else {
                            var1_7 = (20 + MathUtil.GameCanvas.nextInt(20)) * (GameWorld.e().B > GameWorld.e().aU.B ? 1 : -1);
                            GameWorld.e().bP = new Menu(GameWorld.e().aU.B + var1_7, GameWorld.e().aU.C);
                            GameWorld.e().ay = new Command(null, null, 8002, null);
                            main.GameCanvas.UIPanel();
                            main.GameCanvas.f();
                        }
                        v0 = false;
                        break block50;
                    }
                    if (GameWorld.e().aV != null) {
                        super.I();
                        v0 = false;
                    } else lbl-1000:
                    // 4 sources

                    {
                        v0 = true;
                    }
                }
                if (v0) {
                    if (GameWorld.e().z() && GameWorld.e().O()) {
                        if (this.G()) {
                            GameWorld.e();
                            GameWorld.e().B();
                        } else {
                            GameWorld.e().C();
                        }
                    } else {
                        var1_8 = bv.a(GameWorld.e().B, GameWorld.e().C, 2);
                        GameWorld.e().a(GameScreen.u[GameWorld.e().aC.IActionListener], var1_8 != false ? 0 : 1);
                        if (var1_8) {
                            GameWorld.e().bQ = 20;
                        }
                        GameWorld.e();
                    }
                }
            }
            if (GameWorld.e().Message()) {
                this.aX = 0;
            }
        }
    }

    private void I() {
        if (GameWorld.e().aV != null) {
            GameWorld.e().I = GameWorld.e().B < GameWorld.e().aV.a ? 1 : -1;
            int n2 = Math.abs(GameWorld.e().B - GameWorld.e().aV.a);
            int n3 = Math.abs(GameWorld.e().C - GameWorld.e().aV.IActionListener);
            if (n2 <= 40 && n3 < 40) {
                main.GameCanvas.UIPanel();
                main.GameCanvas.f();
                if (GameWorld.e().aV.e.a != 673) {
                    GameService.a().ResourceUtil(GameWorld.e().aV.d);
                    return;
                }
                do do_ = new TextBox(5, 0, -100, 100, 5, GameScreen.aD.a[GameWorld.e().K][2]);
                MathUtil.c(GameWorld.e().aT != null ? "!null" : "null");
                String string = GameStrings.aA;
                String[] stringArray = new String[]{GameStrings.bn, GameStrings.bo};
                MathUtil.c(GameWorld.e().aT != null ? "!null" : "null");
                do_.dk = 673;
                GameScreen.j();
                GameScreen.a(stringArray, do_);
                ae.a(string, 100000, do_, 5820);
                return;
            }
            GameWorld.e().bP = new Menu(GameWorld.e().aV.a, GameWorld.e().aV.IActionListener);
            GameWorld.e().ay = new Command(null, null, 8002, null);
            main.GameCanvas.UIPanel();
            main.GameCanvas.f();
        }
    }

    private boolean J() {
        return GameWorld.e().ci || GameWorld.e().ch || GameWorld.e().cj || GameWorld.e().cG || this.Pos || GameWorld.e().bk;
    }

    private void a(bf bf2, boolean bl2) {
        if (GameWorld.e().ce) {
            return;
        }
        if (this.J()) {
            return;
        }
        if (GameWorld.e().aD.c <= 1) {
            return;
        }
        GameWorld.e().aC = bf2;
        if (this.ey != bf2 && this.ey != null) {
            GameService.a().i(bf2.GameCanvas.a);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            GameScreen.j().aX = 0;
            return;
        }
        if (GameWorld.e().x()) {
            MathUtil.c(">>>use skill spec: " + bf2.GameCanvas.a);
            GameWorld.e().a(bf2.GameCanvas.a);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            GameScreen.j().aX = 0;
            return;
        }
        if (GameWorld.e().w()) {
            MathUtil.c("use skill not focus");
            this.a(bf2);
            this.ey = bf2;
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            MathUtil.c("only select skill");
            if (this.ey != bf2) {
                GameService.a().i(bf2.GameCanvas.a);
                this.n();
            }
            if (GameWorld.e().aU == null && GameWorld.e().Message()) {
                MathUtil.c("return o day");
                return;
            }
            if (GameWorld.e().O()) {
                this.a(true, true);
            }
            this.ey = bf2;
        }
    }

    private void IActionListener(bf bf2, boolean bl2) {
        if ((bv.ResourceUtil == 112 || bv.ResourceUtil == 113) && GameWorld.e().aN == 0) {
            return;
        }
        if (GameWorld.e().w()) {
            this.a(bf2);
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            GameService.a().i(bf2.GameCanvas.a);
            this.n();
            GameWorld.e().aC = bf2;
            this.a(bl2, true);
        }
    }

    private void a(bf bf2) {
        if ((bv.ResourceUtil == 112 || bv.ResourceUtil == 113) && GameWorld.e().aN == 0) {
            return;
        }
        if (this.G()) {
            this.ex = -1;
            if (bf2 != null) {
                GameService.a().i(bf2.GameCanvas.a);
                this.n();
                GameWorld.e().aC = bf2;
                GameWorld.e();
                GameWorld.A();
                GameWorld.e();
                this.aX = 0;
            }
        }
    }

    public static void q() {
        int n2 = 0;
        while (n2 < GameWorld.e().aA.size() - 1) {
            bf bf2 = (Skill)GameWorld.e().aA.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < GameWorld.e().aA.size()) {
                bf bf3 = (Skill)GameWorld.e().aA.elementAt(n3);
                if (bf3.GameCanvas.a < bf2.GameCanvas.a) {
                    bf bf4 = bf3;
                    bf3 = bf2;
                    bf2 = bf4;
                    GameWorld.e().aA.setElementAt(bf2, n2);
                    GameWorld.e().aA.setElementAt(bf3, n3);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private void K() {
        if (this.N()) {
            return;
        }
        int n2 = 0;
        while (n2 < this.bm.length()) {
            int n3;
            int n4;
            int n5;
            int n6;
            this.bq[n2] = -1;
            if (main.GameCanvas.f && main.GameCanvas.a(n6 = (main.GameCanvas.A - this.bm.length() * eI) / 2, n5 = main.GameCanvas.B - 40, n4 = this.bm.length() * eI, n3 = eI)) {
                if (n2 == (n6 = (main.GameCanvas.GameScreen - n6) / eI)) {
                    this.bq[n2] = 1;
                }
                if (main.GameCanvas.ResourceUtil && main.GameCanvas.m && n2 == n6) {
                    char[] cArray = this.bs.toCharArray();
                    LoggingList el2 = new LoggingList("");
                    n5 = 0;
                    while (n5 < cArray.length) {
                        el2.addElement(String.valueOf(cArray[n5]));
                        ++n5;
                    }
                    el2.removeElementAt(0);
                    el2.insertElementAt(String.valueOf(this.bm.charAt(n2)), el2.size());
                    this.bs = "";
                    n5 = 0;
                    while (n5 < el2.size()) {
                        this.bs = String.valueOf(this.bs) + ((String)el2.elementAt(n5)).toUpperCase();
                        ++n5;
                    }
                    GameService.a().a(this.bm.charAt(n2));
                }
            }
            ++n2;
        }
    }

    public final void c() {
        Object object;
        if (main.GameCanvas.w % 100 == 0 && bv.ResourceUtil == 137) {
            SettingsManager = 30;
        }
        if (bj && main.GameCanvas.w % 20 == 0) {
            object = this;
            if (((GameScreen)object).ev > 0) {
                --((GameScreen)object).ev;
            }
            if (!(!bk || bl || GameWorld.e().H == 14 || GameWorld.e().H == 5 || GameWorld.e().bl || GameWorld.e().ci || GameWorld.e().z())) {
                Object object2;
                boolean bl2 = false;
                int n2 = 0;
                while (n2 < F.size()) {
                    object2 = (aa)F.elementAt(n2);
                    if (((aa)object2).GameScreen != 0 && ((aa)object2).GameScreen != 1) {
                        bl2 = true;
                    }
                    ++n2;
                }
                if (bl2) {
                    n2 = 0;
                    int n3 = 0;
                    while (n3 < GameWorld.e().aF.length) {
                        h h2 = GameWorld.e().aF[n3];
                        if (h2 != null && h2.IActionListener.IActionListener == 6) {
                            n2 = 1;
                            break;
                        }
                        ++n3;
                    }
                    if (n2 == 0 && main.GameCanvas.w % 150 == 0) {
                        GameService.a().v();
                    }
                    if (GameWorld.e().U <= GameWorld.e().V * 20L / 100L || GameWorld.e().T <= GameWorld.e().W * 20L / 100L) {
                        super.H();
                    }
                    if (GameWorld.e().aQ == null || GameWorld.e().aQ != null && GameWorld.e().aQ.J) {
                        n3 = 0;
                        while (n3 < F.size()) {
                            aa aa2 = (aa)F.elementAt(n3);
                            if (aa2.GameScreen != 0 && aa2.GameScreen != 1 && aa2.k > 0L && !aa2.J) {
                                GameWorld.e().B = aa2.m;
                                GameWorld.e().C = aa2.n;
                                GameWorld.e().aQ = aa2;
                                GameService.a().UIPanel();
                                MathUtil.c("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                                break;
                            }
                            ++n3;
                        }
                    } else if (GameWorld.e().aQ.k <= 0L || GameWorld.e().aQ.GameScreen == 1 || GameWorld.e().aQ.GameScreen == 0) {
                        GameWorld.e().aQ = null;
                    }
                    if (GameWorld.e().aQ != null && ((GameScreen)object).ev == 0 && (GameWorld.e().D() == null || GameWorld.e().cb >= GameWorld.e().D().length || GameWorld.e().cd == null || GameWorld.e().cc == null)) {
                        long l2;
                        object2 = null;
                        if (main.GameCanvas.e) {
                            int n4 = 0;
                            while (n4 < aQ.length) {
                                if (aQ[n4] != null && !GameScreen.aQ[n4].j && GameScreen.aQ[n4].GameCanvas.a != 10 && GameScreen.aQ[n4].GameCanvas.a != 11 && GameScreen.aQ[n4].GameCanvas.a != 14 && GameScreen.aQ[n4].GameCanvas.a != 23 && GameScreen.aQ[n4].GameCanvas.a != 7 && GameWorld.e().D() == null && !GameScreen.aQ[n4].GameCanvas.c() && GameWorld.e().T >= (l2 = GameScreen.aQ[n4].GameCanvas.d == 2 ? 1L : (GameScreen.aQ[n4].GameCanvas.d != 1 ? (long)GameScreen.aQ[n4].i : (long)GameScreen.aQ[n4].i * GameWorld.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aQ[n4];
                                    } else if (((Skill)object2).e < GameScreen.aQ[n4].e) {
                                        object2 = aQ[n4];
                                    }
                                }
                                ++n4;
                            }
                            if (object2 != null) {
                                super.a((Skill)object2, true);
                                super.IActionListener(GameWorld.e().aQ);
                            }
                        } else {
                            int n5 = 0;
                            while (n5 < aP.length) {
                                if (aP[n5] != null && !GameScreen.aP[n5].j && GameScreen.aP[n5].GameCanvas.a != 10 && GameScreen.aP[n5].GameCanvas.a != 11 && GameScreen.aP[n5].GameCanvas.a != 14 && GameScreen.aP[n5].GameCanvas.a != 23 && GameScreen.aP[n5].GameCanvas.a != 7 && GameWorld.e().D() == null && GameWorld.e().T >= (l2 = GameScreen.aP[n5].GameCanvas.d == 2 ? 1L : (GameScreen.aP[n5].GameCanvas.d != 1 ? (long)GameScreen.aP[n5].i : (long)GameScreen.aP[n5].i * GameWorld.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aP[n5];
                                    } else if (((Skill)object2).e < GameScreen.aP[n5].e) {
                                        object2 = aP[n5];
                                    }
                                }
                                ++n5;
                            }
                            if (object2 != null) {
                                super.a((Skill)object2, true);
                                super.IActionListener(GameWorld.e().aQ);
                            }
                        }
                    }
                }
            }
        }
        object = this;
        if (((GameScreen)object).fB != 0) {
            eF = System.currentTimeMillis();
            if (eF - eE > 1000L) {
                eE = System.currentTimeMillis();
                ++eG;
            }
            if (eG > 20) {
                int n6 = 0;
                while (n6 < ((GameScreen)object).fu.length) {
                    ((GameScreen)object).fv[n6] = ((GameScreen)object).fu[n6];
                    ++n6;
                }
                --((GameScreen)object).fB;
                if (((GameScreen)object).fB == 0) {
                    ((GameScreen)object).fF = "";
                    aD.a(((GameScreen)object).fA, 0);
                    eG = 0;
                }
            } else if (((GameScreen)object).fz > ((GameScreen)object).fu.length - 1) {
                --((GameScreen)object).fB;
                if (((GameScreen)object).fB == 0) {
                    ((GameScreen)object).fF = "";
                    aD.a(((GameScreen)object).fA, 0);
                }
            } else {
                if (((GameScreen)object).fz < ((GameScreen)object).fv.length) {
                    if (((GameScreen)object).fw[((GameScreen)object).fz] == 15) {
                        if (((GameScreen)object).fv[((GameScreen)object).fz] == ((GameScreen)object).fu[((GameScreen)object).fz] - 1) {
                            ((GameScreen)object).fy[((GameScreen)object).fz] = 10;
                        }
                        if (((GameScreen)object).fv[((GameScreen)object).fz] == ((GameScreen)object).fu[((GameScreen)object).fz]) {
                            ((GameScreen)object).fw[((GameScreen)object).fz] = -1;
                            ++((GameScreen)object).fz;
                        }
                    } else if (main.GameCanvas.w % 5 == 0) {
                        int n7 = ((GameScreen)object).fz;
                        ((GameScreen)object).fw[n7] = ((GameScreen)object).fw[n7] + 1;
                    }
                }
                int n8 = 0;
                while (n8 < ((GameScreen)object).fu.length) {
                    if (((GameScreen)object).fw[n8] != -1) {
                        int n9 = n8;
                        ((GameScreen)object).fx[n9] = ((GameScreen)object).fx[n9] + 1;
                        if (((GameScreen)object).fx[n8] > ((GameScreen)object).fw[n8] + ((GameScreen)object).fy[n8]) {
                            ((GameScreen)object).fx[n8] = 0;
                            int n10 = n8;
                            ((GameScreen)object).fv[n10] = ((GameScreen)object).fv[n10] + 1;
                            if (((GameScreen)object).fv[n8] >= 10) {
                                ((GameScreen)object).fv[n8] = 0;
                            }
                        }
                    }
                    ++n8;
                }
            }
        }
        bl.d();
        ++this.dR;
        if (this.dR == 100) {
            this.dR = 0;
        }
        try {
            if (x.c) {
                x.c = false;
            }
            if (M == 1) {
                eC = System.currentTimeMillis();
            }
            if (M == 100) {
                M = 0;
                eD = System.currentTimeMillis();
                int n11 = (int)(eD - eC) / 1000;
                GameService.a().UIPanel(n11);
            }
            if (z > 0 && --z == 0) {
                MessageHandler.IActionListener = false;
            }
            if (!a) {
                if (j != ResourceUtil || k != m) {
                    cD = ResourceUtil - j << 2;
                    cE = m - k << 2;
                    cB &= 0xF;
                    k += (cC += cE) >> 4;
                    cC &= 0xF;
                    if ((j += (cB += cD) >> 4) < 24) {
                        j = 24;
                    }
                    if (j > n) {
                        j = n;
                    }
                    if (k < 0) {
                        k = 0;
                    }
                    if (k > cF) {
                        k = cF;
                    }
                }
                if ((o = j / bv.i - 1) < 0) {
                    o = 0;
                }
                GameScreen = k / bv.i;
                q = o + cw;
                r = GameScreen + cx;
                if (GameScreen < 0) {
                    GameScreen = 0;
                }
                if (r > bv.IActionListener - 1) {
                    r = bv.IActionListener - 1;
                }
                if ((bv.B = (GameWorld.e().B - 2 * d) / bv.i) < 0) {
                    bv.B = 0;
                }
                if ((bv.C = bv.B + bv.F) > bv.a) {
                    bv.C = bv.a;
                    bv.B = bv.C - bv.F;
                }
                if ((bv.D = (GameWorld.e().C - 2 * e) / bv.i) < 0) {
                    bv.D = 0;
                }
                if ((bv.E = bv.D + bv.G) > bv.IActionListener) {
                    bv.E = bv.IActionListener;
                    bv.D = bv.E - bv.G;
                }
                cK.IActionListener();
                cJ.IActionListener();
            }
            cq.IActionListener().c();
            int n12 = 0;
            while (n12 < D.size()) {
                ((GameWorld)D.elementAt(n12)).a();
                ++n12;
            }
            n12 = 0;
            while (n12 < TileMap.GameCanvas.size()) {
                ((TileMap)TileMap.GameCanvas.elementAt(n12)).a();
                ++n12;
            }
            GameWorld.e().a();
            if (GameWorld.e().H == 1 && main.GameCanvas.w % 100 == 0) {
                System.gc();
            }
            if (this.bQ != null) {
                this.bQ.a();
            }
            ei.a();
            n12 = 0;
            while (n12 < F.size()) {
                ((aa)F.elementAt(n12)).c();
                ++n12;
            }
            n12 = 0;
            while (n12 < G.size()) {
                ((TextBox)G.elementAt(n12)).a();
                ++n12;
            }
            this.ew = aQ.length;
            n12 = aQ.length - 1;
            while (n12 >= 0) {
                bf bf2 = aQ[n12];
                if (bf2 != null) {
                    this.ew = n12 + 1;
                    break;
                }
                --this.ew;
                --n12;
            }
            GameScreen.m();
            main.GameCanvas.a().j();
            n12 = 0;
            while (n12 < 5) {
                if (bI[n12] != -1) {
                    if (bI[n12] > fa[n12]) {
                        int n13 = n12;
                        fd[n13] = fd[n13] + 1;
                        if (fd[n12] == 25) {
                            GameScreen.fd[n12] = 0;
                            GameScreen.bI[n12] = -1;
                            GameScreen.fa[n12] = 0;
                            GameScreen.fb[n12] = 0;
                            GameScreen.bG[n12] = 0;
                        }
                    } else {
                        int n14 = n12;
                        bI[n14] = bI[n14] + MathUtil.UIPanel(fc[n12]);
                        int n15 = n12;
                        bG[n15] = bG[n15] + fb[n12];
                        int n16 = n12;
                        bH[n16] = bH[n16] + fc[n12];
                    }
                }
                ++n12;
            }
            bo.IActionListener();
            n12 = 0;
            while (n12 < 2) {
                if (fg[n12] != -1) {
                    int n17 = n12;
                    fg[n17] = fg[n17] + 1;
                    int n18 = n12;
                    fe[n18] = fe[n18] + (fi[n12] << 2);
                    int n19 = n12;
                    ff[n19] = ff[n19] - 1;
                    if (fg[n12] >= 6) {
                        GameScreen.fg[n12] = -1;
                    } else {
                        GameScreen.fh[n12] = (fg[n12] >> 1) % 3;
                    }
                }
                ++n12;
            }
            if (fo != fp) {
                fr = fp - fo << 2;
                fo += (fq += fr) >> 4;
                fq &= 0xF;
            }
            if (Math.abs(fp - fo) < 15 && fo < 0) {
                fp = 0;
            }
            if (Math.abs(fp - fo) < 15 && fo > 0) {
                fp = 0;
            }
            GameScreen p2 = this;
            if (p2.eL > 0) {
                --p2.eL;
            }
            if (p2.aV) {
                p2.aV = false;
                bq bq2 = p2.e(p2.eh, p2.ei);
                if (bq2 == null || bq2 != null && bq2.equals(GameWorld.e().aT) && bv.ResourceUtil == 51) {
                    at.a(134, p2.eh, p2.ei + main.GameCanvas.ae / 2, 3);
                }
            }
            int n20 = 0;
            while (n20 < E.size()) {
                ((ce)E.elementAt(n20)).a();
                ++n20;
            }
            n20 = dc.Message.size() - 1;
            while (n20 >= 0) {
                dc.x.removeElement(dc.Message.elementAt(n20));
                dc.Message.removeElementAt(n20);
                --n20;
            }
            n20 = 0;
            while (n20 < dc.x.size()) {
                dc dc2 = (dc)dc.x.elementAt(n20);
                dc2.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.z.size()) {
                dc dc3 = (dc)dc.z.elementAt(n20);
                dc3.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.A.size()) {
                dc dc4 = (dc)dc.A.elementAt(n20);
                dc4.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.B.size()) {
                dc dc5 = (dc)dc.B.elementAt(n20);
                dc5.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.w.size()) {
                dc dc6 = (dc)dc.w.elementAt(n20);
                dc6.a();
                ++n20;
            }
            ed.c();
            aD.a();
            aE.a();
            if (Q != null && !Q.equals(GameWorld.e())) {
                Q.a();
            }
            ++this.eH;
            if (this.eH > 3) {
                this.eH = 0;
            }
            if (this.bE) {
                ++this.bD;
                if (this.bD == 20L) {
                    this.bD = 0L;
                    this.bE = false;
                }
            } else if (this.bC > GameWorld.e().U) {
                long l3 = this.bC - GameWorld.e().U >> 1;
                if (l3 < 1L) {
                    l3 = 1L;
                }
                this.bC -= l3;
            } else {
                this.bC = GameWorld.e().U;
            }
            if (this.bB) {
                ++this.bA;
                if (this.bA == 20L) {
                    this.bA = 0L;
                    this.bB = false;
                }
            } else if (this.bz > GameWorld.e().T) {
                long l4 = this.bz - GameWorld.e().T >> 1;
                if (l4 < 1L) {
                    l4 = 1L;
                }
                this.bz -= l4;
            } else {
                this.bz = GameWorld.e().T;
            }
            if (this.dv > 0) {
                --this.dv;
            }
            if (this.r()) {
                while (this.bg - 100 < k) {
                    --k;
                }
            }
            n20 = 0;
            while (n20 < GameWorld.NetworkService.size()) {
                ((cy)GameWorld.NetworkService.elementAt(n20)).a();
                ++n20;
            }
            n20 = 0;
            while (n20 < bv.size()) {
                ((cy)bv.elementAt(n20)).a();
                ++n20;
            }
            GameScreen p3 = this;
            if (p3.fE) {
                p3.fC -= 2;
                if (p3.fC < -p3.fD) {
                    p3.fC = main.GameCanvas.A;
                    ft.removeElementAt(0);
                    if (ft.size() == 0) {
                        p3.bR = false;
                        p3.fE = false;
                    } else {
                        p3.fD = mFont.c.a((String)ft.elementAt(0));
                    }
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        int n21 = main.GameCanvas.w % 4000;
        if (n21 == 1000) {
            as.a(as.a, 10);
        }
        dh.a();
    }

    public final boolean r() {
        return this.et;
    }

    public static void a(MGraphics en2, int n2) {
        int n3 = 0;
        while (n3 < bv.v.size()) {
            cz cz2 = (cz)bv.v.elementAt(n3);
            if (cz2.c != -1 && cz2.h == n2) {
                cz2.a(en2);
            }
            ++n3;
        }
        if (bv.ResourceUtil == 48 && n2 == 3 && main.GameCanvas.P != null && main.GameCanvas.P[0] != 0) {
            n3 = 0;
            while (n3 < bv.c / main.GameCanvas.P[0] + 1) {
                en2.a(main.GameCanvas.N[0], n3 * main.GameCanvas.P[0], bv.d - main.GameCanvas.Q[0] - 70, 0);
                ++n3;
            }
        }
    }

    public static void IActionListener(MGraphics en2) {
        if (main.GameCanvas.a) {
            return;
        }
        en2.a(MGraphics, 0, 0, main.GameCanvas.A, main.GameCanvas.B);
    }

    public final void a(MGraphics en2) {
        int n2;
        int n3;
        int n4;
        Object object;
        int n5;
        aN = 0;
        if (!GameService) {
            return;
        }
        if (this.aZ || this.ba && ae.m == null) {
            ++this.aY;
            if (this.aY < 30 && this.aY >= 0 && main.GameCanvas.w % 4 == 0 || this.aY >= 30 && this.aY <= 50 && main.GameCanvas.w % 3 == 0 || this.aY > 50) {
                en2.a(0xFFFFFF);
                en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                if (this.aY > 50) {
                    if (this.ba) {
                        this.ba = false;
                        this.aY = 0;
                        if (this.IConnectionListener) {
                            this.c(this.bf, this.bg);
                        } else {
                            GameScreen p2 = this;
                            this.Screen = false;
                            ei.a(17);
                            if (p2.bc) {
                                p2.bc = false;
                                ei.a(25);
                            }
                        }
                    }
                    this.e(en2);
                    en2.a(-j, -k);
                    en2.a(0, main.GameCanvas.ae);
                    GameWorld.e().a(en2);
                    ResourceUtil.a(en2);
                    GameScreen.c(en2);
                    this.f(en2);
                    return;
                }
                return;
            }
        }
        main.GameCanvas.c(en2);
        if ((this.Screen || this.bR) && bv.o != 3) {
            GameScreen.IActionListener(en2);
        }
        if (SettingsManager > 0) {
            en2.a(-j + eJ[SettingsManager % eJ.length], -k + eK[SettingsManager % eK.length]);
            --SettingsManager;
        } else {
            en2.a(-j, -k);
        }
        if (this.Pos) {
            n5 = main.GameCanvas.w % 3 == 0 ? 3 : -3;
            en2.a(n5, 0);
        }
        ed.c(en2);
        ei.a(en2);
        bv.a(en2);
        bv.IActionListener(en2);
        int n6 = 0;
        while (n6 < D.size()) {
            GameWorld af2 = (GameWorld)D.elementAt(n6);
            if (af2.ck && bv.ResourceUtil == 128) {
                af2.IActionListener(en2, af2.B, af2.C, 0);
            }
            ++n6;
        }
        if (GameWorld.e().ck && bv.ResourceUtil == 128) {
            GameWorld.e().IActionListener(en2, GameWorld.e().B, GameWorld.e().C, 0);
        }
        GameScreen.a(en2, 2);
        if (GameWorld.e().an != null && main.GameCanvas.e) {
            if (Screen.cs == 20) {
                en2.a(dz, GameWorld.e().an.j + j, GameWorld.e().an.k + k, 3);
            } else {
                en2.a(dy, GameWorld.e().an.j + j, GameWorld.e().an.k + k, 3);
            }
        }
        ed.f(en2);
        dh.GameCanvas.a(en2);
        n6 = 0;
        while (n6 < dc.B.size()) {
            dc dc2 = (dc)dc.B.elementAt(n6);
            dc2.a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < TileMap.GameCanvas.size()) {
            ((TileMap)TileMap.GameCanvas.elementAt(n6)).a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (TextBox)G.elementAt(n6);
            if (do_.U > 0L) {
                do_.c(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            ((TextBox)G.elementAt(n6)).a(en2);
            ++n6;
        }
        en2.a(0, main.GameCanvas.ae);
        n6 = 0;
        while (n6 < D.size()) {
            GameWorld af3 = null;
            try {
                af3 = (GameWorld)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af3 == null || main.GameCanvas.G.a && main.GameCanvas.G.F() || !af3.IConnectionListener)) {
                af3.c(en2);
            }
            ++n6;
        }
        GameWorld.e().c(en2);
        ei.IActionListener(en2);
        n6 = 0;
        while (n6 < F.size()) {
            ((aa)F.elementAt(n6)).a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < TileMap.GameCanvas.size()) {
            ((TileMap)TileMap.GameCanvas.elementAt(n6)).IActionListener(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            GameWorld af4 = null;
            try {
                af4 = (GameWorld)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af4 == null || main.GameCanvas.G.a && main.GameCanvas.G.F())) {
                af4.a(en2);
            }
            ++n6;
        }
        GameWorld.e().a(en2);
        if (GameWorld.e().cf != null && GameWorld.e().D() != null && GameWorld.e().cb < GameWorld.e().D().length) {
            GameWorld.e().d(en2);
            GameWorld.e().IActionListener(en2);
        }
        n6 = 0;
        while (n6 < D.size()) {
            GameWorld af5 = null;
            try {
                af5 = (GameWorld)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af5 == null || main.GameCanvas.G.a && main.GameCanvas.G.F() || af5.cf == null || af5.D() == null || af5.cb >= af5.D().length)) {
                af5.d(en2);
                af5.IActionListener(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < E.size()) {
            ((ce)E.elementAt(n6)).a(en2);
            ++n6;
        }
        en2.a(0, -main.GameCanvas.ae);
        Object object2 = en2;
        int n7 = 0;
        while (n7 < 2) {
            if (fg[n7] != -1) {
                if (fi[n7] == 1) {
                    ((MGraphics)object2).a(fj[fh[n7]], fe[n7], ff[n7], 3);
                } else {
                    ((MGraphics)object2).a(fj[fh[n7]], 0, 0, MGraphics.a(fj[fh[n7]]), MGraphics.IActionListener(fj[fh[n7]]), 2, fe[n7], ff[n7], 3);
                }
            }
            ++n7;
        }
        object2 = en2;
        n5 = 0;
        while (n5 < dc.x.size()) {
            object = (dc)dc.x.elementAt(n5);
            if (object != null && !(object instanceof ae)) {
                ((dc)object).a((MGraphics)object2);
            }
            ++n5;
        }
        if (!main.GameCanvas.a) {
            n5 = 0;
            while (n5 < dc.A.size()) {
                object = (dc)dc.A.elementAt(n5);
                ((dc)object).a((MGraphics)object2);
                ++n5;
            }
        }
        n5 = 0;
        while (n5 < dc.z.size()) {
            object = (dc)dc.z.elementAt(n5);
            ((dc)object).a((MGraphics)object2);
            ++n5;
        }
        GameScreen.a(en2, 3);
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (TextBox)G.elementAt(n6);
            do_.e(en2);
            ++n6;
        }
        ei.c(en2);
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (TextBox)G.elementAt(n6);
            if (do_ != null && do_.z != null) {
                do_.z.a(en2, do_.B, do_.C - do_.al - main.GameCanvas.ae, do_.I);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            GameWorld af6 = null;
            try {
                af6 = (GameWorld)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (af6 != null && af6.z != null) {
                af6.z.a(en2, af6.B, af6.C - af6.al, af6.I);
            }
            ++n6;
        }
        if (GameWorld.e().z != null) {
            GameWorld.e().z.a(en2, GameWorld.e().B, GameWorld.e().C - GameWorld.e().al, GameWorld.e().I);
        }
        dh.c.a(en2);
        dh.IActionListener.a(en2);
        ed.d(en2);
        int n8 = 0;
        while (n8 < bv.v.size()) {
            object = (cz)bv.v.elementAt(n8);
            if (((cz)object).c != -1 && ((cz)object).h > 3) {
                ((cz)object).a(en2);
            }
            ++n8;
        }
        bo.a(en2);
        if (bv.ResourceUtil == 120) {
            if (this.bS != 100) {
                n8 = this.bS * MGraphics.a(dQ) / 100;
                en2.a(dQ, bv.c / 2 - MGraphics.a(dQ) / 2, 220, 0);
                en2.e(bv.c / 2 - MGraphics.a(dQ) / 2, 220, n8, 10);
                en2.a(dO, bv.c / 2 - MGraphics.a(dQ) / 2, 220, 0);
                en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            }
            if (this.bT) {
                ++this.bU;
                if (main.GameCanvas.w % 3 == 0) {
                    ea ea2 = new ea(19, MathUtil.IActionListener(bv.c / 2 - 50, bv.c / 2 + 50), 340, 2, 1, -1);
                    ei.a(ea2);
                }
                if (main.GameCanvas.w % 15 == 0) {
                    ea ea3 = new ea(18, MathUtil.IActionListener(bv.c / 2 - 5, bv.c / 2 + 5), MathUtil.IActionListener(300, 320), 2, 1, -1);
                    ei.a(ea3);
                }
                if (this.bU == 100) {
                    this.b(bv.c / 2, 300);
                }
                if (this.bU == 110) {
                    this.bU = 0;
                    this.bT = false;
                }
            }
        }
        ed.a(en2);
        int n9 = 1;
        n6 = 0;
        while (n6 < ed.GameCanvas.size()) {
            object = (ed)ed.GameCanvas.elementAt(n6);
            if (((ed)object).IActionListener == 0) {
                n9 = 0;
                break;
            }
            ++n6;
        }
        if (MGraphics.IActionListener <= 1) {
            n9 = 0;
        }
        if (n9 != 0 && !this.Screen) {
            int n10 = bv.c / (MGraphics.a(bv.A) + 50);
            if (n10 <= 0) {
                n10 = 1;
            }
            if (bv.e != 28) {
                n6 = 0;
                while (n6 < n10) {
                    n4 = 100 + n6 * (MGraphics.a(bv.A) + 50) - j / 2;
                    if (n4 + (n9 = MGraphics.a(bv.A)) >= j && n4 <= j + main.GameCanvas.A && -20 + MGraphics.IActionListener(bv.A) >= k && -20 <= k + main.GameCanvas.B) {
                        en2.a(bv.A, 100 + n6 * (MGraphics.a(bv.A) + 50) - j / 2, -20, 0);
                    }
                    ++n6;
                }
            }
        }
        ResourceUtil.a(en2);
        object2 = en2;
        try {
            if (ae.m == null && (n9 = GameScreen.x()) != -1) {
                do do_ = null;
                n4 = 0;
                while (n4 < G.size()) {
                    do do_2 = (TextBox)G.elementAt(n4);
                    if (do_2.df.a == n9) {
                        if (do_ == null) {
                            do_ = do_2;
                        } else if (MathUtil.UIPanel(do_2.B - GameWorld.e().B) < MathUtil.UIPanel(do_.B - GameWorld.e().B)) {
                            do_ = do_2;
                        }
                    }
                    ++n4;
                }
                if (do_ != null && do_.H != 15 && (do_.B <= j || do_.B >= j + d || do_.C <= k || do_.C >= k + e) && main.GameCanvas.w % 10 >= 5) {
                    n4 = do_.B - GameWorld.e().B;
                    int n11 = do_.C - GameWorld.e().C;
                    n9 = 0;
                    int n12 = 0;
                    n3 = 0;
                    if (n4 > 0 && n11 >= 0) {
                        if (MathUtil.UIPanel(n4) >= MathUtil.UIPanel(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (main.GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 >= 0 && n11 < 0) {
                        if (MathUtil.UIPanel(n4) >= MathUtil.UIPanel(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (main.GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n9 = d / 2;
                            n12 = 10;
                            n3 = 6;
                        }
                    }
                    if (n4 < 0 && n11 >= 0) {
                        if (MathUtil.UIPanel(n4) >= MathUtil.UIPanel(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (main.GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 <= 0 && n11 < 0) {
                        if (MathUtil.UIPanel(n4) >= MathUtil.UIPanel(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (main.GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = 10;
                            n3 = 6;
                        }
                    }
                    GameScreen.c((MGraphics)object2);
                    ((MGraphics)object2).a(bw, 0, 0, 13, 16, n3, n9, n12, cj.f);
                }
            }
        }
        catch (Exception exception) {}
        if (!a && bn == 1 && !main.GameCanvas.G.a) {
            this.e(en2);
        }
        GameScreen.c(en2);
        object2 = en2;
        ((MGraphics)object2).a(0x808080);
        ((MGraphics)object2).d(0, main.GameCanvas.B - 2, main.GameCanvas.A, 2);
        n9 = (int)(GameWorld.e().Z * (long)main.GameCanvas.A / 10000L);
        ((MGraphics)object2).a(0xFFFFFF);
        ((MGraphics)object2).d(0, main.GameCanvas.B - 2, n9, 2);
        ((MGraphics)object2).a(0);
        n9 = main.GameCanvas.A / 10;
        int n13 = 1;
        while (n13 < 10) {
            ((MGraphics)object2).d(n13 * n9, main.GameCanvas.B - 2, 1, 2);
            ++n13;
        }
        if (!a) {
            if (main.GameCanvas.an && bv.ResourceUtil != 170) {
                if (main.GameCanvas.A > 250) {
                    en2.a(main.GameCanvas.ah, 160, 6, 0);
                    mFont.s.a(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y ", 180, 2, 0);
                    mFont.s.a(en2, "s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 180, 12, 0);
                } else {
                    en2.a(main.GameCanvas.ah, 5, main.GameCanvas.B - 67, 0);
                    mFont.s.a(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 25, main.GameCanvas.B - 70, 0);
                }
            }
            en2.a(-en2.a(), -en2.IActionListener());
            if ((bv.ResourceUtil == 128 || bv.ResourceUtil == 127) && bW != 0) {
                en2.a(0);
                en2.d(3, 88, 54, 8);
                en2.a(0xFF0000);
                en2.e(5, 90, bW, 4);
                en2.d(5, 90, 50, 4);
                en2.e(0, 0, 3000, 3000);
                mFont.c.a(en2, "Mabu", 30, 98, 2, mFont.f);
            }
            if (GameWorld.e().cL) {
                ++GameWorld.e().cM;
                if (main.GameCanvas.w % 3 == 0) {
                    en2.a(0xFFFFFF);
                    en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                }
                if (GameWorld.e().cM >= 100) {
                    GameWorld.e().U();
                }
            }
            int n14 = 0;
            while (n14 < D.size()) {
                GameWorld af7 = null;
                try {
                    af7 = (GameWorld)D.elementAt(n14);
                }
                catch (Exception exception) {}
                if (af7 != null && af7.cL && GameWorld.a(af7)) {
                    ++af7.cM;
                    if (main.GameCanvas.w % 3 == 0) {
                        en2.a(0xFFFFFF);
                        en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                    }
                    if (af7.cM >= 100) {
                        af7.U();
                    }
                }
                ++n14;
            }
            GameScreen.c(en2);
            this.f(en2);
            GameScreen.c(en2);
            if (main.GameCanvas.e && main.GameCanvas.f) {
                MGraphics en3 = en2;
                object2 = this;
                if (!((GameScreen)object2).N()) {
                    GameScreen.c(en3);
                    if (!bv.d() && !((GameScreen)object2).u()) {
                        if (Screen.cs == 15) {
                            en3.a(dz, eN + 17, eO + 17, 3);
                        } else {
                            en3.a(dy, eN + 17, eO + 17, 3);
                        }
                    }
                }
            }
            GameScreen.c(en2);
            MGraphics en4 = en2;
            object2 = this;
            if (ft.size() != 0 && bV) {
                en4.e(0, main.GameCanvas.B - 13, main.GameCanvas.A, 15);
                en4.a(0, main.GameCanvas.B - 13, main.GameCanvas.A, 15, 0);
                String string = (String)ft.elementAt(0);
                mFont.e.a(en4, string, ((GameScreen)object2).fC, main.GameCanvas.B - 12, 0);
            }
            if (!main.GameCanvas.G.a && main.GameCanvas.K == null && ae.m == null && ae.n == null && main.GameCanvas.E.equals(c)) {
                super.a(en2);
            }
            GameScreen.c(en2);
            int n15 = 100 + (GameWorld.NetworkService.size() != 0 ? bv.size() * 12 : 0);
            if (GameWorld.e().ai != null) {
                n4 = 0;
                n3 = 0;
                int n16 = (main.GameCanvas.B - 100 - 60) / 12;
                n14 = 0;
                while (n14 < D.size()) {
                    GameWorld af8 = (GameWorld)D.elementAt(n14);
                    if (af8.ah != -1 && af8.ah == GameWorld.e().ai.a) {
                        if (af8.F() && af8.B < GameWorld.e().B) {
                            int n17 = n16;
                            if (GameWorld.NetworkService.size() != 0) {
                                n17 -= bv.size();
                            }
                            if (n4 <= n17) {
                                mFont.r.a(en2, af8.ag, 20, n15 - 12 + n4 * 12, 0, mFont.o);
                                af8.a(en2, 10, n15 + n4 * 12 - 5);
                                ++n4;
                            }
                        } else if (af8.F() && af8.B > GameWorld.e().B && n3 <= n16) {
                            mFont.r.a(en2, af8.ag, main.GameCanvas.A - 25, n15 - 12 + n3 * 12, 1, mFont.o);
                            af8.a(en2, main.GameCanvas.A - 15, n15 + n3 * 12 - 5);
                            ++n3;
                        }
                    }
                    ++n14;
                }
            }
            cq.IActionListener().a(en2);
            if (aW && !main.GameCanvas.G.a && main.GameCanvas.w % 4 == 0) {
                en2.a(ce.f, this.aR.j + 15, this.aR.k + 30, 33);
            }
            if (this.Pos) {
                this.es += 5;
                if (this.ep >= 0) {
                    this.ep += this.es;
                }
                if (this.ep < 0) {
                    --this.ep;
                    if (this.ep == -20) {
                        this.Pos = false;
                        this.ep = 0;
                        this.es = 0;
                    }
                } else if ((this.eq - this.ep > 0 || this.ep < bv.c) && this.ep > 0) {
                    en2.a(0xFFFFFF);
                    if (!main.GameCanvas.a && ResourceUtil.c != 3 && ResourceUtil.c != 5) {
                        en2.a(this.eq - this.ep, this.er - this.ep, 2 * this.ep, 2 * this.ep, 0, 360);
                    } else {
                        en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
                    }
                } else {
                    this.ep = -1;
                }
            }
            n14 = 0;
            while (n14 < GameWorld.NetworkService.size()) {
                n15 = 55;
                int n18 = this.aR.j + 32 + n14 * 24;
                en4 = en2;
                object2 = (cy)GameWorld.NetworkService.elementAt(n14);
                bl.IActionListener(en4, ((cy)object2).a, n18, 55, 0, 3);
                String string = String.valueOf(((cy)object2).c) + "'";
                if (((cy)object2).c == 0) {
                    string = String.valueOf(((cy)object2).IActionListener) + "s";
                }
                mFont.c.a(en4, string, n18, 70, 2, mFont.f);
                ++n14;
            }
            n14 = 0;
            while (n14 < bv.size()) {
                ((cy)bv.elementAt(n14)).a(en2, this.aR.j + (GameWorld.NetworkService.size() != 0 ? 5 : 25), (GameWorld.NetworkService.size() != 0 ? 90 : 45) + n14 * 12);
                ++n14;
            }
            this.d(en2);
            if (GameStrings.fB == 1) {
                long l2;
                long l3 = l2 = ResourceUtil.d() - aS;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(l3 + 25200000L));
                n15 = calendar.get(11);
                int n19 = calendar.get(12);
                mFont.c.a(en2, String.valueOf(n15) + "h" + n19 + "m", 10, main.GameCanvas.B - 65, 0, mFont.f);
            }
            if (!this.fF.equals("")) {
                n14 = 0;
                while (n14 < this.fG.length) {
                    mFont.c.a(en2, this.fG[n14], 5, 85 + n14 * 18, 0, mFont.f);
                    ++n14;
                }
            }
        }
        if ((n2 = main.GameCanvas.C) > 200) {
            n2 = 200;
        }
        GameScreen.a(en2, 0 + main.GameCanvas.A / 2, 0, n2);
        dh.d.a(en2);
        if (cb > ResourceUtil.d() && bv.ResourceUtil == 170 && ce && cd / 2 > 0) {
            try {
                this.a(en2, 0 + main.GameCanvas.A / 2, 0);
            }
            catch (Exception exception) {}
        }
        if (bv.ResourceUtil == 172) {
            String cfr_ignored_0 = String.valueOf(GameStrings.aB) + "  " + ci + "/" + cj;
            mFont.f.a(en2, String.valueOf(GameStrings.aB) + "  " + ci + "/" + cj, main.GameCanvas.A - 10, 40, 1);
        }
    }

    private void d(MGraphics en2) {
        if (this.fB != 0) {
            String string = "";
            int n2 = 0;
            while (n2 < this.fu.length) {
                string = String.valueOf(string) + this.fv[n2] + " ";
                ++n2;
            }
            bo.a(en2, 20, 45, 95, 35, 0xFFFFFF, false);
            mFont.f.a(en2, GameStrings.m, 68, 50, 2);
            mFont.f.a(en2, String.valueOf(string), 68, 65, 2);
        }
    }

    public static do a(short s2) {
        int n2 = 0;
        while (n2 < G.size()) {
            do do_ = (TextBox)G.elementAt(n2);
            if (do_.df.a == s2) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static GameWorld IActionListener(int n2) {
        int n3 = 0;
        while (n3 < D.size()) {
            GameWorld af2 = (GameWorld)D.elementAt(n3);
            if (af2.J == n2) {
                return af2;
            }
            ++n3;
        }
        return null;
    }

    public static aa c(int n2) {
        int n3 = 0;
        while (n3 < F.size()) {
            aa aa2 = (aa)F.elementAt(n3);
            if (aa2.Message == n2) {
                return aa2;
            }
            ++n3;
        }
        return null;
    }

    public static aa a(byte by2) {
        return (aa)F.elementAt(by2);
    }

    public static do s() {
        int n2 = 0;
        while (n2 < G.size()) {
            do do_ = (TextBox)G.elementAt(n2);
            if (do_.df.a == GameScreen.x()) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static void c(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, -200, main.GameCanvas.A, 200 + main.GameCanvas.B);
    }

    private void a(MGraphics en2, GameWorld af2) {
        int n2 = (int)(af2.U * fm / af2.V);
        int n3 = (int)(af2.T * (long)fl / af2.W);
        int n4 = (int)(this.bC * fm / af2.V);
        int n5 = (int)(this.bz * (long)fl / af2.W);
        en2.e(main.GameCanvas.A / 2 + 58 - MGraphics.a(dM), 0, 95, 100);
        en2.IActionListener(dM, 0, 0, MGraphics.a(dM), MGraphics.IActionListener(dM), 2, main.GameCanvas.A / 2 + 60, 0, 24);
        en2.e((int)((long)(main.GameCanvas.A / 2 + 60 - 83) - fm + fm - (long)n4), 5, n4, 10);
        en2.a(dQ, main.GameCanvas.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e((int)((long)(main.GameCanvas.A / 2 + 60 - 83) - fm + fm - (long)n2), 5, n2, 10);
        en2.a(dO, main.GameCanvas.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e((int)((long)(main.GameCanvas.A / 2 + 60 - 83 - fl) + fm - (long)n5), 20, n5, 6);
        en2.a(aG, main.GameCanvas.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e((int)((long)(main.GameCanvas.A / 2 + 60 - 83 - fl) + fm - (long)n3), 20, n3, 6);
        en2.a(aF, main.GameCanvas.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
    }

    /*
     * WARNING - void declaration
     */
    private void a(MGraphics en2, boolean bl2, GameWorld af2) {
        void var2_5;
        int n2;
        int n3;
        void var3_6;
        if (var3_6 == null) {
            return;
        }
        if (var3_6.J == GameWorld.e().J) {
            int n4 = (int)(this.bC * fm / var3_6.V);
            n3 = (int)(this.bz * (long)fl / var3_6.W);
            n2 = (int)(var3_6.U * fm / var3_6.V);
        } else {
            int n5 = (int)(var3_6.cT * fm / var3_6.V);
            n3 = var3_6.cS * fl / 100;
            n2 = (int)(var3_6.U * fm / var3_6.V);
        }
        if (GameWorld.e().bN > 0) {
            int n6 = GameWorld.e().bL * fk / GameWorld.e().bM;
            en2.a(dN, 58, 29, 0);
            en2.e(83, 31, n6, 10);
            en2.a(dP, 83, 31, 0);
            en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            mFont.s.a(en2, String.valueOf(GameWorld.e().bK) + ":" + GameWorld.e().bL + "/" + GameWorld.e().bM, 115, 29, 2);
        }
        if (var3_6.J != GameWorld.e().J) {
            en2.e(MGraphics.a(dM) - 95, 0, 95, 100);
        }
        en2.a(dM, 0, 0, 0);
        en2.e(83, 5, (int)var2_5, 10);
        en2.a(dQ, 83, 5, 0);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e(83, 5, n2, 10);
        en2.a(dO, 83, 5, 0);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e(83, 20, n3, 6);
        en2.a(aG, 83, 20, 0);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        en2.e(83, 20, n3, 6);
        en2.a(aF, 83, 20, 0);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (GameWorld.e().T == 0L && main.GameCanvas.w % 10 > 5) {
            en2.e(83, 20, 2, 6);
            en2.a(aG, 83, 20, 0);
            en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        }
    }

    public final void t() {
        this.eX = this.eY = System.currentTimeMillis();
        this.eZ = 180;
    }

    private static GameWorld L() {
        int n2 = 0;
        while (n2 < D.size()) {
            GameWorld af2 = (GameWorld)D.elementAt(n2);
            if (af2.aN != 0) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private GameWorld M() {
        int n2 = 0;
        while (n2 < D.size()) {
            GameWorld af2 = (GameWorld)D.elementAt(n2);
            if (af2.aN != 0 && af2 != GameScreen.L()) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private void e(MGraphics en2) {
        if (GameWorld.bI) {
            return;
        }
        GameScreen.c(en2);
        if (bv.ResourceUtil == 130 && GameScreen.L() != null && this.M() != null) {
            en2.a(main.GameCanvas.A / 2 - 62, 0);
            this.a(en2, true, GameScreen.L());
            en2.a(-(main.GameCanvas.A / 2 - 65), 0);
            this.a(en2, this.M());
            GameScreen.L().IActionListener(en2, 137, 25, 0);
            this.M().IActionListener(en2, main.GameCanvas.A - 15 - 122, 25, 2);
        } else if (this.u() && GameWorld.e().aU != null) {
            en2.a(main.GameCanvas.A / 2 - 62, 0);
            this.a(en2, true, GameWorld.e().aU);
            en2.a(-(main.GameCanvas.A / 2 - 65), 0);
            this.a(en2, GameWorld.e());
            GameWorld.e().IActionListener(en2, 137, 25, 0);
            GameWorld.e().aU.IActionListener(en2, main.GameCanvas.A - 15 - 122, 25, 2);
        } else if (GameScreen.O() && main.GameCanvas.A <= 320) {
            GameWorld af2 = GameWorld.e();
            boolean bl2 = true;
            bl2 = true;
            MGraphics en3 = en2;
            en3.a(fM, 1, 1, 0);
            int n2 = fH.getWidth();
            int n3 = fH.getHeight() / 2;
            int n4 = (int)(af2.U * (long)n2 / af2.V);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.a(fH, 0, n3, n4, n3, 0, 4, 20, 0);
            n4 = (int)(af2.T * (long)n2 / af2.W);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.a(fH, 0, 0, n4, n3, 0, 4, 26, 0);
            n4 = 1 + fM.getWidth() / 2 + 1;
            mFont.m.a(en3, af2.ag, n4, 5, 2);
            if (af2.aQ != null) {
                if (af2.aQ.z() != null) {
                    mFont.m.a(en3, af2.aQ.z().e, n4, 33, 2);
                }
            } else if (af2.aT != null) {
                mFont.m.a(en3, af2.aT.Frame.IActionListener, n4, 33, 2);
            } else if (af2.aU != null) {
                mFont.m.a(en3, af2.aU.ag, n4, 33, 2);
            }
        } else {
            this.a(en2, true, GameWorld.e());
            if (GameWorld.e().i() != null || GameWorld.e().j() != null) {
                mFont.m.a(en2, GameStrings.bx, this.fn / 2, 8, 2);
            } else if (GameWorld.e().aQ != null) {
                if (GameWorld.e().aQ.z() != null) {
                    mFont.m.a(en2, GameWorld.e().aQ.z().e, this.fn / 2, 9, 2);
                }
                if (GameWorld.e().aQ.C != 0) {
                    mFont.m.a(en2, String.valueOf(ai.a(GameWorld.e().aQ.k)), this.fn / 2, 22, 2);
                }
            } else if (GameWorld.e().aT != null) {
                mFont.m.a(en2, GameWorld.e().aT.Frame.IActionListener, this.fn / 2, 9, 2);
                if (GameWorld.e().aT.df.a == 4) {
                    mFont.m.a(en2, String.valueOf(GameScreen.j().aM.IActionListener) + "/" + GameScreen.j().aM.d, this.fn / 2, 22, 2);
                }
            } else if (GameWorld.e().aU != null) {
                mFont.m.a(en2, GameWorld.e().aU.ag, this.fn / 2, 9, 2);
                mFont.m.a(en2, String.valueOf(ai.a(GameWorld.e().aU.U)), this.fn / 2, 22, 2);
            } else {
                mFont.m.a(en2, GameWorld.e().ag, this.fn / 2, 9, 2);
                mFont.m.a(en2, String.valueOf(ai.a(GameWorld.e().Message)), this.fn / 2, 22, 2);
            }
        }
        en2.a(-en2.a(), -en2.IActionListener());
        if (this.u() && this.eZ > 0) {
            this.eX = System.currentTimeMillis();
            if (this.eX - this.eY >= 1000L) {
                this.eY = System.currentTimeMillis();
                --this.eZ;
            }
            mFont.c.a(en2, String.valueOf(this.eZ), main.GameCanvas.A / 2, 13, 2, mFont.f);
        }
        if (this.ez) {
            en2.a(ce.f, 40, 35, 33);
            --this.eA;
            if (this.eA < 0) {
                this.eA = 0;
                this.ez = false;
            }
        }
    }

    public final boolean u() {
        return bv.a() && (GameWorld.e().aN != 0 || bv.ResourceUtil == 130 && GameScreen.L() != null && this.M() != null);
    }

    private void f(MGraphics en2) {
        if (this.aL != null) {
            MGraphics en3 = en2;
            GameScreen p2 = this;
            es.a(en3, GameWorld.e().B, GameWorld.e().C);
            en3.a(-en3.a(), -en3.IActionListener());
            if (!main.GameCanvas.F.a && !main.GameCanvas.G.a && ae.m == null && main.GameCanvas.e) {
                int n2 = 0;
                while (n2 < p2.bm.length()) {
                    int n3 = (main.GameCanvas.A - p2.bm.length() * eI) / 2 + n2 * eI + eI / 2;
                    if (p2.bq[n2] == -1) {
                        en3.a(bo, n3, main.GameCanvas.B - 25, 3);
                        mFont.f.a(en3, String.valueOf(p2.bm.charAt(n2)), n3, main.GameCanvas.B - 30, 2);
                    } else {
                        en3.a(bp, n3, main.GameCanvas.B - 25, 3);
                        mFont.UIPanel.a(en3, String.valueOf(p2.bm.charAt(n2)), n3, main.GameCanvas.B - 30, 2);
                    }
                    ++n2;
                }
            }
            return;
        }
        if (main.GameCanvas.K != null || ae.m != null || main.GameCanvas.F.a || main.GameCanvas.G.a || GameWorld.e().aD.c == 0 || cq.IActionListener().IActionListener || main.GameCanvas.E == GameCanvas.a) {
            return;
        }
        long l2 = ResourceUtil.d();
        long l3 = l2 - this.em;
        int n4 = 0;
        if (l3 < 10000L) {
            n4 = (int)(l3 * 20L / 10000L);
        }
        if (!main.GameCanvas.e) {
            en2.a(Screen.cs == 10 ? RMSManager : au, eV + bx - 1, by - 1, 0);
            bl.IActionListener(en2, 542, eV + bx + 3, by + 3, 0, 0);
            mFont.u.a(en2, "" + t, eV + bx + 22, by + 15, 1);
            if (l3 < 10000L) {
                en2.a(2721889);
                n4 = (int)(l3 * 20L / 10000L);
                en2.d(eV + bx + 3, by + 3 + n4, 20, 20 - n4);
            }
        } else if (GameWorld.e().H != 14) {
            if (GameScreen.dS.IActionListener) {
                if (aO != 1) {
                    en2.a(0x939090);
                    en2.d(bx + 9, by + 10 + 10, 22, 20);
                    en2.a(0xFFFFFF);
                    en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) + 10, 22, n4 != 0 ? n4 : 20);
                    en2.a(Screen.cs == 10 ? dD : dC, bx, by + 10, 0);
                    mFont.GameScreen.a(en2, "" + t, bx + 20, by + 15 + 10, 2);
                    if (ch) {
                        en2.a(Screen.cs == 14 ? dJ : dI, bx + 5, by - 6 - 40 + 10, 0);
                    } else if (ck) {
                        en2.a(Screen.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.IActionListener(en2, 1088, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.a(Screen.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.IActionListener(en2, 1087, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    }
                } else if (aO == 1) {
                    en2.a(Screen.cs == 10 ? RMSManager : au, eV + bx - 1, by - 1 + 10, 0);
                    bl.IActionListener(en2, 542, eV + bx + 3, by + 3 + 10, 0, 0);
                    mFont.u.a(en2, "" + t, eV + bx + 22, by + 13 + 10, 1);
                    if (l3 < 10000L) {
                        en2.a(2721889);
                        n4 = (int)(l3 * 20L / 10000L);
                        en2.d(eV + bx + 3, by + 3 + n4 + 10, 20, 20 - n4);
                    }
                    if (ch) {
                        en2.a(Screen.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    } else if (ck) {
                        en2.a(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.IActionListener(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.a(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.IActionListener(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    }
                }
            } else if (aO != 1) {
                en2.a(0x939090);
                en2.d(bx + 9, by + 10 - 6, 22, 20);
                en2.a(0xFFFFFF);
                en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6, 22, n4 != 0 ? n4 : 20);
                en2.a(Screen.cs == 10 ? dD : dC, bx, by - 6, 0);
                mFont.GameScreen.a(en2, "" + t, bx + 20, by + 15 - 6, 2);
                if (ch) {
                    en2.a(Screen.cs == 14 ? dJ : dI, bx, by - 6 - 40, 0);
                } else if (ck) {
                    en2.a(Screen.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.IActionListener(en2, 1088, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                } else if (cl) {
                    en2.a(Screen.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.IActionListener(en2, 1087, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                }
            } else {
                en2.a(0x939090);
                en2.d(bx + 10, by + 10 - 6 + 10, 20, 18);
                en2.a(0xFFFFFF);
                en2.d(bx + 10, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6 + 10, 20, n4 != 0 ? n4 : 18);
                en2.a(Screen.cs == 10 ? dF : dE, bx + 20, by + 20 - 6 + 10, 3);
                mFont.GameScreen.a(en2, "" + t, bx + 20, by + 15 - 6 + 10, 2);
                if (ch) {
                    en2.a(Screen.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                } else if (ck) {
                    en2.a(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.IActionListener(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                } else if (cl) {
                    en2.a(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.IActionListener(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                }
            }
        }
        if (O) {
            Skill[] bfArray;
            Skill[] bfArray2 = bfArray = main.GameCanvas.e ? aQ : aP;
            if (!main.GameCanvas.e) {
                en2.a(11152401);
                en2.d(eV + bx + 2, by - 10 + 6, 20, 10);
                mFont.s.a(en2, "*", eV + bx + 12, by - 8 + 6, 2);
            }
            int n5 = main.GameCanvas.e ? this.ew : bfArray.length;
            int n6 = 0;
            while (n6 < n5) {
                bf bf2;
                if (!main.GameCanvas.e) {
                    String[] stringArray;
                    if (cd.UIPanel) {
                        String[] stringArray2 = new String[5];
                        stringArray2[0] = "Q";
                        stringArray2[1] = "W";
                        stringArray2[2] = "E";
                        stringArray2[3] = "R";
                        stringArray = stringArray2;
                        stringArray2[4] = "T";
                    } else {
                        String[] stringArray3 = new String[5];
                        stringArray3[0] = "7";
                        stringArray3[1] = "8";
                        stringArray3[2] = "9";
                        stringArray3[3] = "1";
                        stringArray = stringArray3;
                        stringArray3[4] = "3";
                    }
                    String[] stringArray4 = stringArray;
                    en2.a(11152401);
                    en2.d(eV + eT[n6] + 2, eU[n6] - 10 + 8, 20, 10);
                    mFont.s.a(en2, stringArray4[n6], eV + eT[n6] + 12, eU[n6] - 10 + 6, 2);
                }
                if ((bf2 = bfArray[n6]) != GameWorld.e().aC) {
                    en2.a(au, eV + eT[n6] - 1, eU[n6] - 1, 0);
                }
                if (bf2 != null) {
                    if (bf2 == GameWorld.e().aC) {
                        en2.a(RMSManager, eV + eT[n6] - 1, eU[n6] - 1, 0);
                        if (main.GameCanvas.e) {
                            en2.a(aa.R, 0, 12, 9, 6, 0, eV + eT[n6] + 8, eU[n6] - 7, 0);
                        }
                    }
                    MGraphics en4 = en2;
                    int n7 = eU[n6] + 13;
                    int n8 = eV + eT[n6] + 13;
                    bl.IActionListener(en4, bf2.GameCanvas.f, n8, n7, 0, cj.f);
                    long l4 = System.currentTimeMillis();
                    long l5 = l4 - bf2.f;
                    if (l5 < (long)bf2.e) {
                        en4.a(2721889);
                        if (bf2.j && main.GameCanvas.w % 6 > 2) {
                            en4.a(876862);
                        }
                        int n9 = (int)(l5 * 20L / (long)bf2.e);
                        en4.d(n8 - 10, n7 - 10 + n9, 20, 20 - n9);
                    } else {
                        bf2.j = false;
                    }
                    if (n6 == this.ex && main.GameCanvas.w % 10 > 5 || n6 == this.eB) {
                        en2.a(ce.f, eV + eT[n6] + 13, eU[n6] + 14, 3);
                    }
                }
                ++n6;
            }
        }
        MGraphics en5 = en2;
        if (aO != 0 && GameWorld.e().H != 14) {
            en5.a(Screen.cs == 5 ? dH : dG, eP + 20, eQ + 20, 3);
            dS.a(en5);
            en5.a(Screen.cs == 13 ? dB : dA, eR + 20, eS + 20, 3);
        }
    }

    public static final void a(String string, int n2, int n3, int n4, int n5, int n6) {
        n4 = -1;
        int n7 = 0;
        while (n7 < 5) {
            if (bI[n7] == -1) {
                n4 = n7;
                break;
            }
            ++n7;
        }
        if (n4 == -1) {
            return;
        }
        GameScreen.bJ[n4] = n6;
        GameScreen.bF[n4] = string;
        GameScreen.bG[n4] = n2;
        GameScreen.bH[n4] = n3;
        GameScreen.fb[n4] = 0;
        GameScreen.fc[n4] = n5 < 0 ? -5 : 5;
        GameScreen.bI[n4] = 0;
        GameScreen.fd[n4] = 0;
        GameScreen.fa[n4] = 10;
        n7 = 0;
        while (n7 < 5) {
            if (bI[n7] != -1 && n4 != n7 && fc[n4] < 0 && MathUtil.UIPanel(bG[n4] - bG[n7]) <= 20 && fa[n4] == fa[n7]) {
                int n8 = n4;
                fa[n8] = fa[n8] + 10;
            }
            ++n7;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = fg[0] == -1 ? 0 : 1;
        if (fg[n5] != -1) {
            return false;
        }
        GameScreen.fg[n5] = 0;
        GameScreen.fi[n5] = n4;
        GameScreen.fe[n5] = n2;
        GameScreen.ff[n5] = n3;
        return true;
    }

    private boolean N() {
        if (!main.GameCanvas.f && main.GameCanvas.E == GameScreen.j()) {
            return true;
        }
        if (!main.GameCanvas.e) {
            return true;
        }
        if (cq.IActionListener().IActionListener) {
            return true;
        }
        if (bp.a) {
            return true;
        }
        return main.GameCanvas.K != null || ae.m != null || main.GameCanvas.F.a || main.GameCanvas.G.a;
        {
        }
    }

    public static void d(int n2, int n3) {
        if (main.GameCanvas.A == 128 || main.GameCanvas.B <= 208) {
            n2 = 126;
            n3 = 160;
        }
        bM = n2;
        bN = n3;
        bL = f - n2 / 2;
        bK = cz - n3 / 2;
        if (main.GameCanvas.e) {
            if (main.GameCanvas.B <= 240) {
                bK -= 10;
            }
            if (main.GameCanvas.e && !main.GameCanvas.UIPanel && main.GameCanvas.E instanceof GameScreen) {
                bM = 310;
                bL = d / 2 - bM / 2;
            }
        }
        if (bK < -10) {
            bK = -10;
        }
        if (main.GameCanvas.B > 208 && bK < 0) {
            bK = 0;
        }
        if (main.GameCanvas.B == 208 && bK < 10) {
            bK = 10;
        }
    }

    public static void v() {
        bv.e();
    }

    public static int w() {
        int n2 = GameWorld.e().aD == null ? -1 : ad[GameWorld.e().aD.a];
        return n2;
    }

    public static byte x() {
        byte by2 = 0;
        if (GameWorld.e().aD == null) {
            by2 = -1;
        } else if (GameWorld.e().aD.a <= MessageHandler.length - 1) {
            by2 = (byte)MessageHandler[GameWorld.e().aD.a];
        }
        return by2;
    }

    public final void a(String string, String string2) {
        cq.IActionListener().IActionListener = false;
        if (string2.equals(GameStrings.cQ)) {
            if (GameScreen.aE.h == GameWorld.e().J) {
                return;
            }
            GameService.a().a(string, GameScreen.aE.h);
            return;
        }
        if (string.equals("")) {
            return;
        }
        if (string.equals("pingABCD")) {
            GameService.a().d();
            GameService.a().e();
            boolean bl2 = bP = !bP;
        }
        if (string.equals("icon")) {
            boolean bl3 = MathUtil.IActionListener = !MathUtil.IActionListener;
        }
        if (string.equals("big")) {
            MathUtil.c = !MathUtil.c;
        }
        GameService.a().IActionListener(string);
    }

    public final void D() {
    }

    public final void a(Message y2) {
        bp.c();
        try {
            this.S = new int[y2.c().readByte()];
            this.T = new int[this.S.length];
            this.U = new int[this.S.length];
            this.V = new int[this.S.length];
            this.W = new int[this.S.length];
            this.Y = new String[this.S.length];
            this.X = new int[this.S.length];
            this.Z = new String[this.S.length];
            int n2 = 0;
            while (n2 < this.S.length) {
                this.S[n2] = y2.c().readByte();
                this.T[n2] = y2.c().readByte();
                this.U[n2] = y2.c().readByte();
                this.V[n2] = y2.c().readByte();
                byte by2 = y2.c().readByte();
                if (by2 == 1) {
                    this.Y[n2] = y2.c().readUTF();
                    this.W[n2] = y2.c().readInt();
                    this.Z[n2] = y2.c().readUTF();
                    this.X[n2] = y2.c().readInt();
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        main.GameCanvas.G.r();
        main.GameCanvas.G.s();
    }

    private void a(String string, Command de2, Command de3) {
        this.bQ = new CountdownDialog();
        this.bQ.a(string, de2, de3);
    }

    public final void a(int n2, String string, byte by2) {
        GameWorld af2 = GameScreen.IActionListener(n2);
        if (af2 != null) {
            if (by2 == 3) {
                this.a(string, new Command(GameStrings.bs, 2000, af2), new Command(GameStrings.bj, 2009, af2));
            }
            if (by2 == 4) {
                this.a(string, new Command(GameStrings.bs, 2005, af2), new Command(GameStrings.bj, 2009, af2));
            }
        }
    }

    public final void d(int n2) {
        GameWorld af2 = GameScreen.IActionListener(n2);
        if (af2 != null) {
            this.a(String.valueOf(af2.ag) + GameStrings.eC, new Command(GameStrings.bn, 11114, af2), new Command(GameStrings.bo, 2009, af2));
        }
    }

    public static void a(int n2, byte by2) {
        if (H.size() == 0) {
            GameService.a().IActionListener((byte)2, by2);
            MathUtil.c("getFlag1");
            return;
        }
        if (n2 == GameWorld.e().J) {
            MathUtil.c("my cflag: isme");
            GameWorld.e();
            if (GameWorld.a(by2)) {
                MathUtil.c("my cflag: true");
                int n3 = 0;
                while (n3 < H.size()) {
                    ep ep2 = (ep)H.elementAt(n3);
                    if (ep2 != null && ep2.a == by2) {
                        MathUtil.c("my cflag: cflag==");
                        GameWorld.e().bz = ep2.IActionListener;
                    }
                    ++n3;
                }
                return;
            }
            GameWorld.e();
            if (!GameWorld.a(by2)) {
                MathUtil.c("my cflag: false");
                GameService.a().IActionListener((byte)2, by2);
                return;
            }
        } else {
            MathUtil.c("my cflag: not me");
            if (GameScreen.IActionListener(n2) != null) {
                GameScreen.IActionListener(n2);
                if (GameWorld.a(by2)) {
                    MathUtil.c("my cflag: true");
                    int n4 = 0;
                    while (n4 < H.size()) {
                        ep ep3 = (ep)H.elementAt(n4);
                        if (ep3 != null && ep3.a == by2) {
                            MathUtil.c("my cflag: cflag==");
                            GameScreen.IActionListener((int)n2).bz = ep3.IActionListener;
                        }
                        ++n4;
                    }
                    return;
                }
                GameScreen.IActionListener(n2);
                if (!GameWorld.a(by2)) {
                    MathUtil.c("my cflag: false");
                    GameService.a().IActionListener((byte)2, by2);
                }
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void a(int n2, Object object) {
        MathUtil.c("PERFORM WITH ID = " + n2);
        int n3 = 0;
        block40: do {
            switch (n3 == 0 ? n2 : n3) {
                case 888351: {
                    GameService.a().UIPanel((byte)5);
                    main.GameCanvas.h();
                    return;
                }
                case 11112: {
                    GameWorld af2 = (GameWorld)object;
                    GameService.a().a((byte)1, af2.J);
                    return;
                }
                case 11113: {
                    GameWorld af3 = (GameWorld)object;
                    if (af3 == null) return;
                    GameService.a().a((byte)0, af3.J, (byte)-1, -1);
                    return;
                }
                case 11114: {
                    this.bQ = null;
                    GameWorld af4 = (GameWorld)object;
                    if (af4 == null) {
                        return;
                    }
                    GameService.a().a((byte)1, af4.J, (byte)-1, -1);
                    return;
                }
                case 11111: {
                    if (GameWorld.e().aU == null) {
                        return;
                    }
                    bp.a();
                    if (main.GameCanvas.G.S.size() <= 0) {
                        GameWorld.e();
                        this.F();
                    }
                    main.GameCanvas.G.a(GameWorld.e().aU);
                    main.GameCanvas.G.s();
                    GameService.a().c(GameWorld.e().aU.J);
                    GameService.a().Message(GameWorld.e().aU.J);
                    return;
                }
                case 11115: {
                    if (GameWorld.e().aU == null) {
                        return;
                    }
                    bp.a();
                    GameService.a().a(GameWorld.e().aU.J, (short)GameWorld.e().aU.M);
                    return;
                }
                case 2000: {
                    this.bQ = null;
                    if ((GameWorld)object == null) {
                        GameService.a().a((byte)1, (byte)3, -1);
                        return;
                    }
                    GameService.a().a((byte)1, (byte)3, ((GameWorld)object).J);
                    GameService.a().UIPanel();
                    return;
                }
                case 2001: {
                    main.GameCanvas.h();
                    return;
                }
                case 2003: {
                    main.GameCanvas.h();
                    bp.a();
                    GameService.a().a((byte)0, (byte)3, GameWorld.e().aU.J);
                    return;
                }
                case 2004: {
                    main.GameCanvas.h();
                    GameService.a().a((byte)0, (byte)4, GameWorld.e().aU.J);
                    return;
                }
                case 2005: {
                    main.GameCanvas.h();
                    this.bQ = null;
                    if ((GameWorld)object == null) {
                        GameService.a().a((byte)1, (byte)4, -1);
                        return;
                    }
                    GameService.a().a((byte)1, (byte)4, ((GameWorld)object).J);
                    return;
                }
                case 2009: {
                    this.bQ = null;
                    return;
                }
                case 2006: {
                    main.GameCanvas.h();
                    GameService.a().a((byte)2, (byte)4, GameWorld.e().aU.J);
                    return;
                }
                case 2007: {
                    main.GameCanvas.h();
                    n3 = 12006;
                    continue block40;
                }
                case 11038: {
                    LoggingList el2 = new LoggingList("");
                    el2.addElement(new Command(GameStrings.aX[1], 110381));
                    el2.addElement(new Command(GameStrings.aX[2], 110382));
                    el2.addElement(new Command(GameStrings.aX[3], 110383));
                    main.GameCanvas.F.a(el2);
                    return;
                }
                case 110382: {
                    GameService.a().j();
                    return;
                }
                case 110383: {
                    GameService.a().k();
                    return;
                }
                case 1: {
                    main.GameCanvas.h();
                    return;
                }
                case 2: {
                    main.GameCanvas.F.a = false;
                    return;
                }
                case 8002: {
                    this.a(false, true);
                    main.GameCanvas.UIPanel();
                    main.GameCanvas.f();
                    return;
                }
                case 11057: {
                    dc.z.removeAllElements();
                    dc.x.removeAllElements();
                    do do_ = (TextBox)object;
                    if (do_.dk == 0) {
                        GameService.a().a((short)do_.df.a, (byte)main.GameCanvas.F.IActionListener);
                        return;
                    }
                    if (main.GameCanvas.F.IActionListener != 0) return;
                    GameService.a().ResourceUtil(do_.dk);
                    return;
                }
                case 11000: {
                    main.GameCanvas.G.q();
                    main.GameCanvas.G.s();
                    return;
                }
                case 11001: {
                    GameWorld.e().J();
                    return;
                }
                case 11002: {
                    main.GameCanvas.G.A();
                    return;
                }
                case 11120: {
                    Object[] objectArray = (Object[])object;
                    object = (Skill)objectArray[0];
                    int n4 = Integer.parseInt((String)objectArray[1]);
                    int n5 = 0;
                    while (true) {
                        if (n5 >= aQ.length) {
                            GameScreen.aQ[n4] = object;
                            GameScreen.Message();
                            return;
                        }
                        if (aQ[n5] == object) {
                            GameScreen.aQ[n5] = null;
                        }
                        ++n5;
                    }
                }
                case 11121: {
                    Object[] objectArray = (Object[])object;
                    bf bf2 = (Skill)objectArray[0];
                    int n6 = Integer.parseInt((String)objectArray[1]);
                    int n7 = 0;
                    while (true) {
                        if (n7 >= aP.length) {
                            GameScreen.aP[n6] = bf2;
                            GameScreen.z();
                            return;
                        }
                        if (aP[n7] == bf2) {
                            GameScreen.aP[n7] = null;
                        }
                        ++n7;
                    }
                }
                case 110001: {
                    main.GameCanvas.G.q();
                    main.GameCanvas.G.s();
                    return;
                }
                case 110004: {
                    main.GameCanvas.F.a = false;
                    return;
                }
                case 11067: {
                    if (bv.n != 0) {
                        GameService.a().f(0);
                        bp.a();
                        return;
                    }
                    aD.a(GameStrings.aV, 0);
                    return;
                }
                case 11059: {
                    bf bf3 = aQ[this.ex];
                    this.b(bf3, false);
                    this.cn = null;
                    return;
                }
                case 12000: {
                    GameService.a().a((byte)1, -1, (String)null);
                    return;
                }
                case 12001: {
                    main.GameCanvas.h();
                    return;
                }
                case 12002: {
                    main.GameCanvas.h();
                    i i2 = (i)object;
                    GameService.a().a((byte)1, -1, i2.a, i2.IActionListener);
                    this.bQ = null;
                    return;
                }
                case 12003: {
                    i i3 = (i)object;
                    main.GameCanvas.h();
                    GameService.a().a((byte)2, -1, i3.a, i3.IActionListener);
                    this.bQ = null;
                    return;
                }
                case 12004: {
                    bf bf4 = (Skill)object;
                    this.b(bf4, true);
                    GameWorld.e();
                    return;
                }
                case 110391: {
                    GameService.a().a((byte)0, GameWorld.e().aU.J, -1, -1);
                    return;
                }
                case 12005: {
                    if (main.GameCanvas.al == null) {
                        main.GameCanvas.al = new eu();
                    }
                    main.GameCanvas.al.IActionListener();
                    main.GameCanvas.h();
                    return;
                }
                case 12006: {
                    GameMidlet.f.a();
                    return;
                }
            }
            return;
        } while (true);
    }

    public final void IActionListener(String string, String string2) {
        this.fu = new int[string.length()];
        this.fv = new int[string.length()];
        this.fw = new int[string.length()];
        this.fx = new int[string.length()];
        this.fy = new int[string.length()];
        int n2 = 0;
        while (n2 < string.length()) {
            this.fu[n2] = Short.parseShort(string.substring(n2, n2 + 1));
            this.fv[n2] = MathUtil.IActionListener(0, 11);
            this.fw[n2] = 1;
            this.fy[n2] = 0;
            ++n2;
        }
        this.fB = 100;
        this.fz = 0;
        this.fA = string2;
        eE = eF = ResourceUtil.d();
    }

    public final void a(String string) {
        if (!this.fE) {
            this.fD = mFont.e.a(string);
            this.fC = main.GameCanvas.A;
            this.fE = true;
        }
        if (string.startsWith("!")) {
            string = string.substring(1, string.length());
            this.bR = true;
        }
        ft.addElement(string);
    }

    public final void IActionListener(String string) {
        this.fF = string;
        this.fG = mFont.k.a(this.fF, 500);
    }

    private static boolean O() {
        return bv.c() && GameScreen.bY.a == 0;
    }

    private static void a(MGraphics en2, int n2, int n3, int n4) {
        if (bY == null) {
            return;
        }
        if (!a && bn == 1 && !main.GameCanvas.G.a && GameScreen.O()) {
            int n5;
            int n6;
            if (n4 < GameScreen.fJ.a + (GameScreen.fI.a << 2)) {
                n4 = GameScreen.fJ.a + (GameScreen.fI.a << 2);
            }
            if (n2 > main.GameCanvas.A - n4 / 2) {
                n2 = main.GameCanvas.A - n4 / 2;
            }
            if (n2 < MGraphics.a(fM) + n4 / 2 + 10) {
                n2 = MGraphics.a(fM) + n4 / 2 + 10;
            }
            n3 = GameScreen.fI.IActionListener;
            int n7 = n3 + 0 + MGraphics.IActionListener(fL) / 2 + 2;
            int n8 = GameScreen.fJ.a;
            int n9 = n4 / 2 - n8 / 2;
            n4 = n2 - n4 / 2;
            int n10 = n2 + n8 / 2;
            int n11 = n9 - GameScreen.fI.a;
            int n12 = n11 / GameScreen.fI.a;
            if (n11 % GameScreen.fI.a > 0) {
                ++n12;
            }
            int n13 = 0;
            while (n13 < n12) {
                if (n13 < n12 - 1) {
                    fI.a(1, n4 + GameScreen.fI.a + n13 * GameScreen.fI.a, 3, 0, 0, en2);
                } else {
                    fI.a(1, n4 + n11, 3, 0, 0, en2);
                }
                if (n13 < n12 - 1) {
                    fI.a(1, n10 + n13 * GameScreen.fI.a, 3, 0, 0, en2);
                } else {
                    fI.a(1, n10 + n11 - GameScreen.fI.a, 3, 0, 0, en2);
                }
                ++n13;
            }
            fI.a(0, n4, 3, 2, 0, en2);
            fI.a(0, n10 + n11, 3, 0, 0, en2);
            if (GameScreen.bY.c > 0) {
                n13 = 2;
                n6 = 3;
                if (GameScreen.bY.e == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = GameScreen.bY.c * n9 / GameScreen.bY.IActionListener) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n4 + n9 - n5, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.a(n6, n4 + GameScreen.fI.a + n5 * GameScreen.fI.a, 3, 0, 0, en2);
                    } else {
                        fI.a(n6, n4 + n11, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.a(n13, n4, 3, 2, 0, en2);
                main.GameCanvas.a(en2);
            }
            if (GameScreen.bY.d > 0) {
                n13 = 2;
                n6 = 3;
                if (GameScreen.bY.f == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = GameScreen.bY.d * n9 / GameScreen.bY.IActionListener) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n10, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.a(n6, n10 + n5 * GameScreen.fI.a, 3, 0, 0, en2);
                    } else {
                        fI.a(n6, n10 + n11 - GameScreen.fI.a, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.a(n13, n10 + n11, 3, 0, 0, en2);
                main.GameCanvas.a(en2);
            }
            fJ.a(0, n2 - n8 / 2, 0, 0, 0, en2);
            String string = ResourceUtil.a(GameScreen.bY.n, (int)GameScreen.bY.m, true, false);
            mFont.d.a(en2, string, n2 + 1, 0 + GameScreen.fJ.IActionListener / 2 - mFont.UIPanel.a() / 2, 2);
            UIPanel.IActionListener(GameScreen.bY.e, 1).IActionListener(en2, GameScreen.bY.j, n2 - 5, n7 + 5, 1, mFont.f);
            UIPanel.IActionListener(GameScreen.bY.f, 1).IActionListener(en2, GameScreen.bY.k, n2 + 5, n7 + 5, 0, mFont.f);
            if (GameScreen.bY.a != 0) {
                n6 = 0 + n3 / 2 - 2;
                mFont.w.a(en2, "" + GameScreen.bY.c, n4 + n9 / 2, n6, 2);
                mFont.w.a(en2, "" + GameScreen.bY.d, n10 + n9 / 2, n6, 2);
            }
            en2.a(fK, n2, 0 + GameScreen.fJ.IActionListener + 2, 3);
            if (GameScreen.bY.a == 0) {
                GameScreen.a(en2, GameScreen.bY.UIPanel, GameScreen.bY.h, n2 - 13, GameScreen.bY.i, n2 + 13, n7);
            }
        }
    }

    private static void a(MGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (fL != null) {
            int n8;
            int n9 = MGraphics.IActionListener(fL) / 2;
            int n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n3) {
                    n8 = 1;
                }
                en2.a(fL, 0, n8 * n9, MGraphics.a(fL), n9, 0, n4 - n10 * (n9 + 1), n7, 3);
                ++n10;
            }
            n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n5) {
                    n8 = 1;
                }
                en2.a(fL, 0, n8 * n9, MGraphics.a(fL), n9, 0, n6 + n10 * (n9 + 1), n7, 3);
                ++n10;
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bk[] bkArray) {
        ch ch2 = new ch(n2, n3, n4, n5, n6, n7, n8, s2, bkArray);
        GameScreen.a(ch2);
    }

    public static void a(int n2, int n3, int n4, GameWorld af2, bk bk2, int n5, short s2, short s3) {
        ch ch2 = new ch(n2, n3, n4, af2.Z(), bk2, n5, s2, s3);
        GameScreen.a(ch2);
    }

    private static void a(ch ch2) {
        if (ch2.a == 0) {
            dh.a(ch2);
            return;
        }
        if (ch2.a == 1) {
            dh.IActionListener(ch2);
            return;
        }
        if (ch2.a == 2) {
            dh.c(ch2);
            return;
        }
        dh.d(ch2);
    }

    private void a(MGraphics en2, int n2, int n3) {
        if (n2 > main.GameCanvas.A - 85) {
            n2 = main.GameCanvas.A - 85;
        }
        if (n2 < MGraphics.a(fM) + 85 + 10) {
            n2 = MGraphics.a(fM) + 85 + 10;
        }
        MGraphics.IActionListener(fL);
        n3 = GameScreen.fJ.a;
        int n4 = 85 - n3 / 2;
        int n5 = n2 - 85 + 3;
        int n6 = n2 + n3 / 2;
        int n7 = (n4 -= GameScreen.fI.a) / GameScreen.fI.a;
        if (n4 % GameScreen.fI.a > 0) {
            ++n7;
        }
        int n8 = 0;
        while (n8 < n7) {
            if (n8 < n7 - 1) {
                en2.IActionListener(dT, 0, 15, MGraphics.a(dT), 15, 2, n5 + GameScreen.fI.a + n8 * GameScreen.fI.a, 3, 20);
            } else {
                en2.IActionListener(dT, 0, 15, MGraphics.a(dT), 15, 2, n5 + n4, 3, 20);
            }
            if (n8 < n7 - 1) {
                en2.IActionListener(dT, 0, 15, MGraphics.a(dT), 15, 2, n6 + n8 * GameScreen.fI.a, 3, 20);
            } else {
                en2.IActionListener(dT, 0, 15, MGraphics.a(dT), 15, 2, n6 + n4 - GameScreen.fI.a, 3, 20);
            }
            ++n8;
        }
        fI.a(0, n5, 3, 2, 0, en2);
        fI.a(0, n6 + n4, 3, 0, 0, en2);
        n8 = ca * 100 / (cd / 2) * 66 / 100;
        if (n8 > 0) {
            if (n8 < 6) {
                n8 = 6;
            }
            en2.e(n5, 3, n8, 15);
        }
        if (ca > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    en2.IActionListener(dT, 0, 60, MGraphics.a(dT), 15, 2, n5, 3, 20);
                } else {
                    en2.IActionListener(dT, 0, 75, MGraphics.a(dT), 15, 2, n5 + n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.GameCanvas.a(en2);
        n7 = bZ * 100 / (cd / 2) * 66 / 100;
        if (66 - (66 - n7) > 0) {
            if (n7 < 6) {
                n7 = 6;
            }
            en2.e(n6 + 66 - n7, 3, 66 - (66 - n7), 15);
        }
        if (bZ > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    en2.IActionListener(dT, 0, 30, MGraphics.a(dT), 15, 0, n6 + n4, 3, 20);
                } else {
                    en2.IActionListener(dT, 0, 45, MGraphics.a(dT), 15, 0, n6 + n4 - n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.GameCanvas.a(en2);
        fJ.a(0, n2 - n3 / 2 + 1, 0, 0, 0, en2);
        String string = String.valueOf(ai.IActionListener((int)((cb - ResourceUtil.d()) / 1000L)));
        mFont.d.a(en2, string, n5 + 85 - 2, 5, 2);
        mFont.o.a(en2, "T\u1ea7ng " + cf, n5 + 85 - 3, 0 + GameScreen.fJ.IActionListener, 2);
        n4 = mFont.GameCanvas.a(String.valueOf(ca));
        mFont.IActionListener.a(en2, String.valueOf(ca), n2 - n3 / 2 - n4, 3 + GameScreen.fJ.IActionListener, 0);
        bl.IActionListener(en2, 2325, n2 - n3 / 2 - n4 - 15, 3 + GameScreen.fJ.IActionListener, 2, 20);
        n4 = mFont.GameCanvas.a(String.valueOf(bZ));
        mFont.GameCanvas.a(en2, String.valueOf(bZ), n2 + n3 / 2, 3 + GameScreen.fJ.IActionListener, 0);
        bl.IActionListener(en2, 2323, n2 + n3 / 2 + n4 + 3, 3 + GameScreen.fJ.IActionListener, 0, 20);
        mFont.f.a("#01 AAAAAAAAAA");
        GameScreen.IActionListener(en2, 40);
        main.GameCanvas.a(en2);
    }

    private static void IActionListener(MGraphics en2, int n2) {
        String string = "#01 nnnnnnnnnnnn";
        int n3 = mFont.k.a(string);
        n3 = main.GameCanvas.A - n3 - 20;
        int n4 = 0;
        while (n4 < fN) {
            mFont di2 = mFont.s;
            if (n4 == 0) {
                di2 = mFont.GameScreen;
            } else if (n4 == 1) {
                di2 = mFont.n;
            } else if (n4 == 2) {
                di2 = mFont.q;
            }
            if (n4 == fN - 1) {
                di2 = mFont.r;
            }
            String[] stringArray = MathUtil.a((String)cg.elementAt(n4), "|", 0);
            int[] nArray = new int[2];
            nArray[1] = 18;
            int[] nArray2 = nArray;
            int n5 = 0;
            while (n5 < 2) {
                di2.a(en2, stringArray[n5], n3 + nArray2[n5], 40 + n4 * mFont.k.a(), 0, mFont.k);
                ++n5;
            }
            ++n4;
        }
        main.GameCanvas.a(en2);
        main.GameCanvas.a(en2);
    }
}

