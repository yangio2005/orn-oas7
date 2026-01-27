/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import main.GameMidlet;
import main.GameCanvas;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;

import main.b;

public final class GameScreen
extends Screen
implements bx {
    private boolean ct;
    private long cu;
    private long cv;
    public static boolean LoginScreen = false;
    public static boolean b = false;
    public static GameScreen c;
    public static int d;
    public static int e;
    public static int f;
    private static int cw;
    private static int cx;
    public static int g;
    private static int cy;
    private static int cz;
    private static int cA;
    public static int Item;
    public static int i;
    public static int j;
    public static int k;
    private static int cB;
    private static int cC;
    private static int cD;
    private static int cE;
    public static int Res;
    public static int m;
    public static int n;
    private static int cF;
    public static int o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public de SessionReceiver;
    public static int MyHashtable;
    public static ci[] u;
    public static cv[] v;
    public static by[] w;
    public static RMS[] x;
    public static cp[] Message;
    public static int z;
    public static MyVector A;
    public static MyVector B;
    public static MyVector C;
    public static MyVector D;
    public static MyVector E;
    private static MyVector cG;
    public static MyVector F;
    public static MyVector G;
    public static MyVector H;
    public static da[] I;
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
    private static boolean db;
    private static boolean dc;
    private static boolean dd;
    private static boolean de;
    private static boolean df;
    private static boolean BaseCanvas;
    private static boolean dh;
    private static boolean mFont;
    private static boolean dj;
    private static boolean dk;
    private static boolean dl;
    private static boolean dm;
    private static boolean dn;
    private static boolean cfr_renamed_0;
    private static boolean dp;
    private static boolean dq;
    private static boolean dr;
    private static boolean ds;
    private static boolean dt;
    private static boolean du;
    public static Char Q;
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
    public int Mob = 0;
    public int ab = 0;
    private int dw = -1;
    private boolean dx;
    public static int[] MessageHandler;
    public static int[] ad;
    public static Image ae;
    public static Image Char;
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
    public static byte ImageCache;
    private static Image dy;
    private static Image dz;
    public static Image at;
    private static Image dA;
    private static Image dB;
    public static Image au;
    public static Image RMS;
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
    public static Image T;
    public static Image ax;
    public static Image ay;
    public static Image az;
    public static Image aA;
    public static Image aB;
    public static byte aC;
    public static Position aD;
    public static Position aE;
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
    public Mob aL;
    public k aM;
    private int dR;
    public static int aN;
    private static b dS;
    public static int aO;
    private static Image dT;
    private de dU;
    private de dV;
    private de dW;
    private de dX;
    public static bf[] aP;
    public static bf[] aQ;
    public de aR;
    private static int dY;
    public static long aS;
    public boolean aT;
    private boolean dZ;
    private int ea;
    private int eb;
    private int ec;
    private int WeatherEffect;
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
    private long MyVector;
    private long SplashScreen;
    public int aX;
    int aY;
    public boolean aZ;
    public boolean ba;
    private static Image mGraphics;
    public boolean Screen = false;
    public boolean bc = false;
    private boolean Position = false;
    private int ep;
    private int eq;
    private int er;
    private int es;
    public boolean bd;
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
    private bf ey;
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
    public static int ImageLoader;
    public static Image bo;
    public static Image bp;
    public int[] bq;
    public static Image Session;
    public String ServerListScreen;
    private static int eI;
    public static boolean GameService;
    public static int bu;
    private static int[] eJ;
    private static int[] eK;
    public static MyVector bv;
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
    private de fs;
    public static boolean bO;
    public static boolean bP;
    public dz bQ;
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
    public static String Npc;
    public static int cd;
    public static boolean ItemMap;
    public static byte cf;
    public static MyVector cg;
    private static int fN;
    public static boolean ch;
    public static int ci;
    public static int cj;
    public static boolean ck;
    public static boolean cl;

    static {
        A = new MyVector("vClan");
        new MyVector("vPtMap");
        B = new MyVector("vFriend");
        C = new MyVector("vEnemies");
        D = new MyVector("vCharInMap");
        E = new MyVector("vItemMap");
        cG = new MyVector("vMobAttack");
        new MyVector("vSet");
        F = new MyVector("vMob");
        G = new MyVector("vNpc");
        H = new MyVector("vFlag");
        cH = 0;
        J = -1;
        cI = 0;
        cJ = new dv();
        cK = new dv();
        new MyVector("vItemUpGrade");
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
        db = false;
        dc = false;
        dd = false;
        de = false;
        df = false;
        BaseCanvas = false;
        dh = false;
        mFont = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        cfr_renamed_0 = false;
        dp = false;
        dq = false;
        dr = false;
        ds = false;
        dt = false;
        du = false;
        ae = Res.loadImage("/mainImage/myTexture2dstat.png");
        Char = Res.loadImage("/mainImage/myTexture2dlineColor20.png");
        ag = Res.loadImage("/mainImage/myTexture2dlineColor21.png");
        ah = Res.loadImage("/mainImage/myTexture2dlineColor22.png");
        ai = Res.loadImage("/mainImage/myTexture2dlineColor00.png");
        aj = Res.loadImage("/mainImage/myTexture2dlineColor01.png");
        ak = Res.loadImage("/mainImage/myTexture2dlineColor02.png");
        aC = 0;
        aD = new Position();
        aE = new Position();
        dS = new b();
        aO = 0;
        dT = Res.loadImage("/mainImage/i_pve_bar_0.png");
        Res.loadImage("/mainImage/i_pve_bar_1.png");
        fI = new df(Res.loadImage("/mainImage/i_pve_bar_0.png"), 6, 15);
        fJ = new df(Res.loadImage("/mainImage/i_pve_bar_1.png"), 38, 21);
        fK = Res.loadImage("/mainImage/i_vs.png");
        fL = Res.loadImage("/mainImage/i_charlife.png");
        fH = Res.loadImage("/mainImage/i_hp.png");
        fM = Res.loadImage("/mainImage/i_khung.png");
        T = Res.loadImage("/mainImage/myTexture2dbtnl.png");
        ax = Res.loadImage("/mainImage/myTexture2dbtnlf.png");
        ay = Res.loadImage("/mainImage/myTexture2dbtnl2.png");
        az = Res.loadImage("/mainImage/myTexture2dbtnlf2.png");
        dM = Res.loadImage("/mainImage/myTexture2dpanel.png");
        dN = Res.loadImage("/mainImage/panel2.png");
        dO = Res.loadImage("/mainImage/myTexture2dHP.png");
        dP = Res.loadImage("/mainImage/SP.png");
        dQ = Res.loadImage("/mainImage/myTexture2dhpLost.png");
        aG = Res.loadImage("/mainImage/myTexture2dmpLost.png");
        aF = Res.loadImage("/mainImage/myTexture2dMP.png");
        au = Res.loadImage("/mainImage/myTexture2dskill.png");
        RMS = Res.loadImage("/mainImage/myTexture2dskill2.png");
        at = Res.loadImage("/mainImage/myTexture2dmenu.png");
        dA = Res.loadImage("/mainImage/myTexture2dfocus.png");
        aH = Res.loadImage("/mainImage/tm-do.png");
        aI = Res.loadImage("/mainImage/tm-vang.png");
        aJ = Res.loadImage("/mainImage/tm-xam.png");
        aK = Res.loadImage("/mainImage/tm-xanh.png");
        if (GameCanvas.e) {
            Res.loadImage("/mainImage/myTexture2darrow.png");
            Res.loadImage("/mainImage/myTexture2darrow2.png");
            dy = Res.loadImage("/mainImage/myTexture2dchat.png");
            dz = Res.loadImage("/mainImage/myTexture2dchat2.png");
            dB = Res.loadImage("/mainImage/myTexture2dfocus2.png");
            dC = Res.loadImage("/mainImage/myTexture2dPea0.png");
            dD = Res.loadImage("/mainImage/myTexture2dPea1.png");
            aA = Res.loadImage("/mainImage/myTexture2danalog1.png");
            aB = Res.loadImage("/mainImage/myTexture2danalog2.png");
            dE = Res.loadImage("/mainImage/myTexture2dPea2.png");
            dF = Res.loadImage("/mainImage/myTexture2dPea3.png");
            dG = Res.loadImage("/mainImage/myTexture2dfirebtn0.png");
            dH = Res.loadImage("/mainImage/myTexture2dfirebtn1.png");
        }
        dI = Res.loadImage("/mainImage/myTexture2dPea_0.png");
        dJ = Res.loadImage("/mainImage/myTexture2dPea_1.png");
        dK = Res.loadImage("/mainImage/myTexture2dPea_2.png");
        dL = Res.loadImage("/mainImage/myTexture2dPea_3.png");
        aO = RMS.d("analog") == 1 ? 1 : 0;
        dS = new b();
        byte[] byArray = RMS.b("NRdataVersion");
        byte[] byArray2 = RMS.b("NRmapVersion");
        byte[] byArray3 = RMS.b("NRskillVersion");
        byte[] byArray4 = RMS.b("NRitemVersion");
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
        aP = new bf[10];
        aQ = new bf[10];
        mGraphics = Res.loadImage("/bg/trans.png");
        eu = 0;
        bo = Res.loadImage("/mainImage/myTexture2dnut.png");
        bp = Res.loadImage("/mainImage/myTexture2dnutF.png");
        GameService = true;
        eJ = new int[]{1, -1, 1, -1};
        eK = new int[]{1, -1, -1, 1};
        bv = new MyVector("");
        bw = Res.loadImage("/mainImage/myTexture2darrow3.png");
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
        cg = new MyVector("");
        fN = 1;
        ch = false;
    }

    public final void methodLoginScreen() {
        block13: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_part")));
                    int n2 = ((DataInputStream)object).readShort();
                    x = new RMS[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        int n4 = ((DataInputStream)object).readByte();
                        GameScreen.x[n3] = new RMS(n4);
                        n4 = 0;
                        while (n4 < GameScreen.x[n3].LoginScreen.length) {
                            GameScreen.x[n3].LoginScreen[n4] = new w();
                            GameScreen.x[n3].LoginScreen[n4].LoginScreen = ((DataInputStream)object).readShort();
                            GameScreen.x[n3].LoginScreen[n4].b = ((DataInputStream)object).readByte();
                            GameScreen.x[n3].LoginScreen[n4].c = ((DataInputStream)object).readByte();
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

    public static void methodLoginScreen(Image image, Image image2, Image image3, float f2, float f3, int n2, float f4, mGraphics en2) {
        n2 = en2.c();
        int n3 = en2.d();
        int n4 = en2.e();
        int n5 = en2.f();
        en2.e((int)f2, (int)f3, (int)f4, 13);
        int n6 = 0;
        while (n6 < 4) {
            en2.LoginScreen(image2, f2 + (float)((n6 + 1) * 15), f3, 0);
            ++n6;
        }
        en2.LoginScreen(image, f2, f3, 0);
        en2.LoginScreen(image2, f2 + 100.0f - 30.0f, f3, 0);
        en2.LoginScreen(image3, f2 + 100.0f - 15.0f, f3, 0);
        en2.e(n2, n3, n4, n5);
    }

    public static boolean e() {
        return bv.Res >= 53 && bv.Res <= 62;
    }

    public static boolean f() {
        return bv.Res >= 63;
    }

    public final void b() {
        ServerListScreen.c = false;
        if (WeatherEffect.b()) {
            bu.LoginScreen();
        }
        x.c = false;
        Char.bI = false;
        if (!LoginScreen) {
            GameService.LoginScreen().SessionReceiver();
        }
        if (bv.b()) {
            GameScreen p2 = this;
            if (cw.b) {
                cw.b = false;
                p2.co = null;
            }
        }
        GameScreen.aD.f = true;
        GameScreen.aE.f = true;
        b = true;
        this.dR = 0;
        LoginScreen = false;
        super.b();
    }

    public static void g() {
        cn.LoginScreen.removeAllElements();
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
        Char.e().bF.removeAllElements();
    }

    public final void methodLoginScreen(byte[] object) {
        ds.c("GET ONSCREENSKILL!");
        aQ = new bf[10];
        if (object == null) {
            ds.c("null");
            object = this;
            ds.c("LOAD DEFAULT ONSCREEN SKILL");
            int n2 = 0;
            while (n2 < aQ.length) {
                bf bf2;
                if (n2 >= Char.e().aA.size()) break;
                GameScreen.aQ[n2] = bf2 = (bf)Char.e().aA.elementAt(n2);
                ++n2;
            }
            GameScreen.Message();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < Char.e().aA.size()) {
                bf bf3 = (bf)Char.e().aA.elementAt(n4);
                if (bf3.LoginScreen.LoginScreen == object[n3]) {
                    GameScreen.aQ[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void b(byte[] object) {
        ds.c("GET KEYSKILL!");
        aP = new bf[10];
        if (object == null) {
            object = this;
            ds.c("LOAD DEFAULT KEY SKILL");
            int n2 = 0;
            while (n2 < aP.length) {
                bf bf2;
                if (n2 >= Char.e().aA.size()) break;
                GameScreen.aP[n2] = bf2 = (bf)Char.e().aA.elementAt(n2);
                ++n2;
            }
            GameScreen.z();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < Char.e().aA.size()) {
                bf bf3 = (bf)Char.e().aA.elementAt(n4);
                if (bf3.LoginScreen.LoginScreen == object[n3]) {
                    GameScreen.aP[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void c(byte[] byArray) {
        ds.c("GET CURRENTSKILL!");
        if (byArray == null || byArray.length == 0) {
            if (Char.e().aA.size() > 0) {
                Char.e().aC = (bf)Char.e().aA.elementAt(0);
            }
        } else {
            int n2 = 0;
            while (n2 < Char.e().aA.size()) {
                bf bf2 = (bf)Char.e().aA.elementAt(n2);
                if (bf2.LoginScreen.LoginScreen == byArray[0]) {
                    Char.e().aC = bf2;
                    break;
                }
                ++n2;
            }
        }
        if (Char.e().aC != null) {
            GameService.LoginScreen().i(Char.e().aC.LoginScreen.LoginScreen);
            Char.e();
        }
    }

    protected static void methodLoginScreen(et object) {
        ds.c("DO SET ONSCREEN SKILL");
        object = Char.e().LoginScreen((et)object);
        MyVector el2 = new MyVector("");
        int n2 = 0;
        while (n2 < (GameCanvas.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object object2 = objectArray;
            objectArray[0] = object;
            object2[1] = String.valueOf(n2);
            object2 = new de(String.valueOf(T.cB) + (n2 + 1), 11120, object2);
            bf bf2 = aQ[n2];
            if (bf2 != null) {
                object2.LoginScreen = true;
            }
            el2.addElement(object2);
            ++n2;
        }
        GameCanvas.F.LoginScreen(el2);
    }

    protected static void b(et object) {
        ds.c("DO SET KEY SKILL");
        object = Char.e().LoginScreen((et)object);
        String[] stringArray = cd.g ? T.aR : T.aS;
        MyVector el2 = new MyVector("");
        int n2 = 0;
        while (n2 < (GameCanvas.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            el2.addElement(new de(stringArray[n2], 11121, objectArray2));
            ++n2;
        }
        GameCanvas.F.LoginScreen(el2);
    }

    private static void Message() {
        byte[] byArray = new byte[aQ.length];
        int n2 = 0;
        while (n2 < aQ.length) {
            byArray[n2] = aQ[n2] == null ? -1 : GameScreen.aQ[n2].LoginScreen.LoginScreen;
            ++n2;
        }
        GameService.LoginScreen().LoginScreen(byArray);
    }

    private static void z() {
        byte[] byArray = new byte[aP.length];
        int n2 = 0;
        while (n2 < aP.length) {
            byArray[n2] = aP[n2] == null ? -1 : GameScreen.aP[n2].LoginScreen.LoginScreen;
            ++n2;
        }
        GameService.LoginScreen().LoginScreen(byArray);
    }

    public static boolean Item() {
        int n2 = Char.e().aF.length - 1;
        while (n2 >= 0) {
            if (Char.e().aF[n2] == null) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static void methodLoginScreen(String[] stringArray, _do do_) {
        MyVector el2 = new MyVector("");
        int n2 = 0;
        while (n2 < stringArray.length) {
            el2.addElement(new de(stringArray[n2], 11057, do_));
            ++n2;
        }
        GameCanvas.F.LoginScreen(el2);
    }

    private static void A() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_effect")));
                int n2 = ((DataInputStream)object).readShort();
                Message = new cp[n2];
                int n3 = 0;
                while (n3 < n2) {
                    GameScreen.Message[n3] = new cp();
                    ((DataInputStream)object).readShort();
                    GameScreen.Message[n3].LoginScreen = new eq[((DataInputStream)object).readByte()];
                    int n4 = 0;
                    while (n4 < GameScreen.Message[n3].LoginScreen.length) {
                        GameScreen.Message[n3].LoginScreen[n4] = new eq();
                        GameScreen.Message[n3].LoginScreen[n4].c = ((DataInputStream)object).readShort();
                        GameScreen.Message[n3].LoginScreen[n4].LoginScreen = ((DataInputStream)object).readByte();
                        GameScreen.Message[n3].LoginScreen[n4].b = ((DataInputStream)object).readByte();
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
                object = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_arrow")));
                int n2 = ((DataInputStream)object).readShort();
                v = new cv[n2];
                int n3 = 0;
                while (n3 < n2) {
                    GameScreen.v[n3] = new cv();
                    ((DataInputStream)object).readShort();
                    GameScreen.v[n3].LoginScreen[0] = ((DataInputStream)object).readShort();
                    GameScreen.v[n3].LoginScreen[1] = ((DataInputStream)object).readShort();
                    GameScreen.v[n3].LoginScreen[2] = ((DataInputStream)object).readShort();
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
                object = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_dart")));
                int n2 = ((DataInputStream)object).readShort();
                w = new by[n2];
                int n3 = 0;
                while (n3 < n2) {
                    int n4;
                    int n5;
                    GameScreen.w[n3] = new by();
                    ((DataInputStream)object).readShort();
                    GameScreen.w[n3].Item = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].i = ((DataInputStream)object).readShort() << 8;
                    GameScreen.w[n3].g = ((DataInputStream)object).readShort();
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
                    GameScreen.w[n3].LoginScreen = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        GameScreen.w[n3].LoginScreen[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            GameScreen.w[n3].LoginScreen[n7][n4] = ((DataInputStream)object).readShort();
                            ++n4;
                        }
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    GameScreen.w[n3].b = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        GameScreen.w[n3].b[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            GameScreen.w[n3].b[n7][n4] = ((DataInputStream)object).readShort();
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
                    object = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_skill")));
                    short s2 = ((DataInputStream)object).readShort();
                    int n2 = o.LoginScreen.size();
                    u = new ci[n2];
                    n2 = 0;
                    while (n2 < s2) {
                        short s3 = ((DataInputStream)object).readShort();
                        if (s3 == 1111) {
                            s3 = (short)(s2 - 1);
                        }
                        GameScreen.u[s3] = new ci();
                        GameScreen.u[s3].LoginScreen = s3;
                        GameScreen.u[s3].b = ((DataInputStream)object).readShort();
                        if (GameScreen.u[s3].b <= 0) {
                            GameScreen.u[s3].b = 80;
                        }
                        ((DataInputStream)object).readByte();
                        GameScreen.u[s3].c = new f[((DataInputStream)object).readByte()];
                        int n3 = 0;
                        while (n3 < GameScreen.u[s3].c.length) {
                            GameScreen.u[s3].c[n3] = new f();
                            GameScreen.u[s3].c[n3].LoginScreen = ((DataInputStream)object).readByte();
                            GameScreen.u[s3].c[n3].b = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].c = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].d = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].e = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].f = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].g = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].Item = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].i = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].j = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].k = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].Res = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].c[n3].m = ((DataInputStream)object).readShort();
                            ++n3;
                        }
                        GameScreen.u[s3].d = new f[((DataInputStream)object).readByte()];
                        n3 = 0;
                        while (n3 < GameScreen.u[s3].d.length) {
                            GameScreen.u[s3].d[n3] = new f();
                            GameScreen.u[s3].d[n3].LoginScreen = ((DataInputStream)object).readByte();
                            GameScreen.u[s3].d[n3].b = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].c = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].d = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].e = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].f = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].g = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].Item = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].i = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].j = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].k = ((DataInputStream)object).readShort();
                            GameScreen.u[s3].d[n3].Res = ((DataInputStream)object).readShort();
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
        ds.c("READ SKILL DONE");
    }

    public static void i() {
        try {
            ds.c("<readOk><vsData<" + ap + "==" + al);
            ds.c("<readOk><vsMap<" + aq + "==" + am);
            ds.c("<readOk><vsSkill<" + ar + "==" + an);
            ds.c("<readOk><vsItem<" + ImageCache + "==" + ao);
            if (ap == al && aq == am && ar == an && ImageCache == ao) {
                ds.c(String.valueOf(ap) + "," + aq + "," + ar + "," + ImageCache);
                GameScreen.j();
                GameScreen.C();
                GameScreen.j();
                GameScreen.A();
                GameScreen.j();
                GameScreen.B();
                GameScreen.j();
                GameScreen.E();
                GameService.LoginScreen().GameScreen();
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

    public final void Res() {
        if (fj == null) {
            fj = new Image[3];
            int n2 = 0;
            while (n2 < 3) {
                GameScreen.fj[n2] = Res.loadImage("/e/sp" + n2 + ".png");
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
        new de("", 11021);
        this.aR = new de("  ", 11000);
        this.SessionReceiver = new de("", 11001);
        this.aR.g = at;
        this.aR.Res = mGraphics.LoginScreen(this.aR.g) + 20;
        this.aR.f = false;
        this.SessionReceiver.g = dA;
        if (GameCanvas.e) {
            this.aR.j = 0;
            this.aR.k = 50;
            this.SessionReceiver = null;
        } else {
            this.aR.j = 0;
            this.aR.k = e - 30;
            this.SessionReceiver.j = d - 32;
            this.SessionReceiver.k = e - 32;
        }
        this.co = this.SessionReceiver;
        ImageLoader = 1;
        if (GameCanvas.e) {
            O = true;
        }
        this.dU = new de("\u0110\u1ed5i c\u1edd", GameCanvas.isLowGraphic(), 100001, null);
        this.dV = new de("Logout", GameCanvas.isLowGraphic(), 100002, null);
        this.dW = new de("chat world", GameCanvas.isLowGraphic(), 100003, null);
        this.dX = new de("InfoLog", GameCanvas.isLowGraphic(), 100004, null);
        this.dU.b();
        this.dV.b();
        this.dW.b();
        this.dX.b();
        this.dW.j = GameCanvas.A - this.dW.Res;
        this.dX.j = GameCanvas.A - this.dX.Res;
        this.dV.j = GameCanvas.A - this.dV.Res;
        this.dU.j = GameCanvas.A - this.dU.Res;
        this.dW.k = this.dW.m + mFont.SessionReceiver.LoginScreen();
        this.dX.k = (this.dW.m << 1) + mFont.SessionReceiver.LoginScreen();
        this.dV.k = this.dW.m * 3 + mFont.SessionReceiver.LoginScreen();
        this.dU.k = (this.dW.m << 2) + mFont.SessionReceiver.LoginScreen();
    }

    public static final void methodLoginScreen(int n2, int n3) {
        boolean bl2;
        g g2;
        d = GameCanvas.A;
        Item = 39;
        e = GameCanvas.B;
        cA = GameCanvas.B / 6;
        if (cA < 48) {
            cA = 48;
        }
        f = d >> 1;
        cz = e >> 1;
        cy = e - 120;
        g = (e << 1) / 3;
        i = d / 6;
        cw = d / bv.i + 2;
        cx = e / bv.i + 2;
        if (d % 24 != 0) {
            ++cw;
        }
        n = (bv.LoginScreen - 1) * bv.i - d;
        cF = (bv.b - 1) * bv.i - e;
        if (n2 == -1 && n3 == -1) {
            j = Res = Char.e().B - f + i * Char.e().I;
            k = m = Char.e().C - g - 1;
        } else {
            j = Res = n2 - cy + i * Char.e().I;
            k = m = n3 - g - 1;
        }
        if (j < 24) {
            Res = 24;
            j = 24;
        }
        if (j > n) {
            j = Res = n;
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
        if (r > bv.b - 1) {
            r = bv.b - 1;
        }
        if ((bv.F = q - o << 2) > bv.LoginScreen) {
            bv.F = bv.LoginScreen;
        }
        if ((bv.G = r - GameScreen << 2) > bv.b) {
            bv.G = bv.b;
        }
        if ((bv.B = (Char.e().B - 2 * d) / bv.i) < 0) {
            bv.B = 0;
        }
        if ((bv.C = bv.B + bv.F) > bv.LoginScreen) {
            bv.C = bv.LoginScreen;
        }
        if ((bv.D = (Char.e().C - 2 * e) / bv.i) < 0) {
            bv.D = 0;
        }
        if ((bv.E = bv.D + bv.G) > bv.b) {
            bv.E = bv.b;
        }
        cq.b().c = c;
        cq.b().LoginScreen.b = GameCanvas.B - 35 - cq.b().LoginScreen.d;
        cq.b().LoginScreen();
        if (GameCanvas.e) {
            eM = e - 88;
            eN = d - 40;
            eO = 2;
            if (GameCanvas.A <= 240) {
                eN = d - 35;
                eO = 5;
            }
            eP = d - 55;
            eQ = eM + 35;
            eR = d - 37;
            eS = eM - 1;
            if (GameCanvas.A >= 450) {
                eS -= 12;
                by -= 7;
                eP -= 10;
                eQ -= 5;
                eR -= 10;
            }
        }
        GameScreen.m();
        int n4 = eI = GameCanvas.A > 200 ? 40 : 30;
        if (RMS.d("viewchat") == -1) {
            g2 = GameCanvas.G;
            bl2 = true;
        } else {
            g2 = GameCanvas.G;
            bl2 = RMS.d("viewchat") == 1;
        }
        g2.au = bl2;
    }

    public static void m() {
        bf[] bfArray = GameCanvas.e ? aQ : aP;
        eT = new int[bfArray.length];
        eU = new int[bfArray.length];
        dY = 30;
        if (GameCanvas.A <= 320) {
            eW = e - dY - 6;
            eV = f - bfArray.length * dY / 2 - 25;
        } else {
            dY = 40;
            eV = 10;
            eW = GameCanvas.B - dY + 7;
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
        if (GameCanvas.e) {
            eV = 17;
            eW = GameCanvas.B - 40;
            if (GameScreen.dS.b && aO == 1) {
                bx = bfArray.length * dY;
                by = eW;
            } else {
                bx = GameCanvas.A - 45;
                by = GameCanvas.B - 45;
            }
            if (aO != 0) {
                eR = eP = GameCanvas.A - 45;
                if (GameScreen.dS.d) {
                    eV = GameScreen.dS.LoginScreen + 20;
                    dY = 35;
                    bx = eP - 45;
                } else if (GameScreen.dS.c) {
                    bx = eP - 45;
                }
                eQ = GameCanvas.B - 45;
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

    public final void methodLoginScreen(String string, int n2, int n3) {
        i i2 = new i();
        new i().b = n3;
        i2.LoginScreen = n2;
        this.LoginScreen(string, new de(T.ImageLoader, 12002, i2), new de(T.bo, 12003, i2));
    }

    private void F() {
        this.aX = 0;
        GameCanvas.resetKeys();
        if (Char.e().aU.J < 0) {
            return;
        }
        if (Char.e().J < 0) {
            return;
        }
        MyVector el2 = GameCanvas.G.S;
        if (el2.size() > 0) {
            return;
        }
        if (Char.e().aD != null && Char.e().aD.c > 1) {
            el2.addElement(new de(T.cP, 11112, Char.e().aU));
            el2.addElement(new de(T.dL, 11113, Char.e().aU));
        }
        if (Char.e().ai != null && Char.e().aj < 2 && Char.e().aU.ah == -1) {
            el2.addElement(new de(T.aM[4], 110391));
        }
        if (Char.e().aU.H != 14 && Char.e().aU.H != 5) {
            if (Char.e().aD != null && Char.e().aD.c >= 14) {
                el2.addElement(new de(T.aM[0], 2003));
            }
        } else {
            Char.e();
        }
        if (Char.e().ai != null && Char.e().ai.LoginScreen == Char.e().aU.ah && Char.e().aU.H != 14 && Char.e().aD != null && Char.e().aD.c >= 14) {
            el2.addElement(new de(T.aM[1], 2004));
        }
        int n2 = Char.e().ax.b.length;
        int n3 = 0;
        while (n3 < n2) {
            et et2 = Char.e().ax.b[n3];
            bf bf2 = Char.e().LoginScreen(et2);
            if (bf2 != null && et2.LoginScreen() && bf2.c > 0) {
                el2.addElement(new de(et2.b, 12004, bf2));
            }
            ++n3;
        }
    }

    public static boolean methodLoginScreen(Mob bq2) {
        if (bq2 == null) {
            return false;
        }
        if (Char.e().aN == 5) {
            return true;
        }
        if (Char.e().I() && !bq2.J) {
            return false;
        }
        if (Char.e().aR != null && bq2.equals(Char.e().aR)) {
            return false;
        }
        bq2 = GameScreen.b(bq2.Message);
        if (bq2 == null) {
            return true;
        }
        if (((Char)bq2).aN == 5) {
            return true;
        }
        return Char.e().c((Char)bq2);
    }

    private boolean G() {
        if (Char.e().aC != null && (Char.e().aC.LoginScreen.d != 1 && Char.e().T < (long)Char.e().aC.i || Char.e().aC.LoginScreen.d == 1 && Char.e().T < Char.e().W * (long)Char.e().aC.i / 100L)) {
            aD.LoginScreen(T.bI, 0);
            this.aX = 0;
            return false;
        }
        if (Char.e().aC == null || Char.e().aC.LoginScreen.c > 0 && Char.e().aC.c == 0) {
            GameCanvas.isLowGraphic(T.aT);
            return false;
        }
        return true;
    }

    public final void n() {
        GameCanvas.F.LoginScreen = false;
        Object object = cq.b();
        ((cq)object).LoginScreen.LoginScreen("");
        ((cq)object).b = false;
        cq.b().f = null;
        this.dx = false;
        this.Mob = 0;
        cI = 0;
        cH = 0;
        this.dw = -1;
        J = -1;
        this.ab = 0;
        this.Mob = 0;
        if (Char.e().U <= 0L || Char.e().H == 14 || Char.e().H == 5) {
            if (Char.e().cH) {
                this.cn = this.fs = new de(T.aX[0], 11038);
                Char.e().U = 0L;
            }
            O = false;
        } else {
            O = true;
        }
        object = cK;
        cK.LoginScreen = 0;
        ((dv)object).b = 0;
        ((dv)object).c = 0;
        ((dv)object).d = 0;
        ((dv)object).e = 0;
        ((dv)object).f = 0;
        ((dv)object).g = 0;
        ((dv)object).Item = 0;
        ((dv)object).k = 0;
        ((dv)object).Res = 0;
        ((dv)object).i = 0;
        ((dv)object).j = 0;
    }

    public final void methodLoginScreen(int n2) {
        super.LoginScreen(n2);
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
                                                                                    if (MessageHandler.b || Char.e().SessionReceiver || Char.e().db) {
                                                                                        return;
                                                                                    }
                                                                                    if (bp.b) {
                                                                                        return;
                                                                                    }
                                                                                    if (!GameCanvas.e || cq.b().b || GameCanvas.F.LoginScreen || (var1_1 = this).N()) break block237;
                                                                                    Screen.cs = -1;
                                                                                    if (!GameCanvas.clearKeyHold) break block236;
                                                                                    if (!GameCanvas.isLowGraphic(0, 0, 60, 50) || !GameCanvas.Res || !GameCanvas.m) break block238;
                                                                                    if (Char.e().an != null) {
                                                                                        Char.e().an.LoginScreen();
                                                                                    }
                                                                                    Char.e().bP = null;
                                                                                    GameCanvas.Res();
                                                                                    var1_1.ez = true;
                                                                                    var1_1.eA = 5;
                                                                                    break block237;
                                                                                }
                                                                                if (bv.d() || !GameCanvas.isLowGraphic(GameScreen.eN, GameScreen.eO, 34, 34)) break block239;
                                                                                Screen.cs = 15;
                                                                                GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                cq.b().Item = T.bq;
                                                                                if (!GameCanvas.Res || !GameCanvas.m) break block239;
                                                                                cq.b().LoginScreen("");
                                                                                bu.LoginScreen();
                                                                                Char.e().bP = null;
                                                                                GameCanvas.Res();
                                                                                break block237;
                                                                            }
                                                                            if (Char.e().an == null || !GameCanvas.isLowGraphic(Char.e().an.j - 17, Char.e().an.k - 17, 34, 34)) break block240;
                                                                            Screen.cs = 20;
                                                                            GameCanvas.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (!GameCanvas.Res || !GameCanvas.m) break block240;
                                                                            GameCanvas.Res();
                                                                            Char.e().an.LoginScreen();
                                                                            break block237;
                                                                        }
                                                                        var3_9 = var1_1;
                                                                        if (GameScreen.aO != 0 && Char.e().H != 14) {
                                                                            if (GameCanvas.isLowGraphic(GameScreen.eP, GameScreen.eQ, 40, 40)) {
                                                                                Screen.cs = 5;
                                                                                if (GameCanvas.m) {
                                                                                    GameCanvas.i[5] = true;
                                                                                    GameCanvas.m = false;
                                                                                    GameCanvas.ai = false;
                                                                                    GameCanvas.Res = false;
                                                                                }
                                                                            }
                                                                            GameScreen.dS.LoginScreen();
                                                                            if (GameCanvas.isLowGraphic(GameScreen.eR, GameScreen.eS, 34, 34)) {
                                                                                Screen.cs = 13;
                                                                                GameCanvas.ai = false;
                                                                                var3_9.aT = false;
                                                                                if (GameCanvas.Res && GameCanvas.m) {
                                                                                    Char.e().J();
                                                                                    GameCanvas.m = false;
                                                                                    GameCanvas.ai = false;
                                                                                    GameCanvas.Res = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if ((GameScreen.aO == 0 ? GameCanvas.isLowGraphic(GameScreen.bx, GameScreen.by + 10, 40, 40) != false : GameCanvas.isLowGraphic(GameScreen.bx, GameScreen.by + 10, 34, 34) != false) && Char.e().H != 14 && var1_1.aL == null) {
                                                                            Screen.cs = 10;
                                                                            GameCanvas.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (GameCanvas.Res && GameCanvas.m) {
                                                                                GameCanvas.i[10] = true;
                                                                                GameCanvas.m = false;
                                                                                GameCanvas.ai = false;
                                                                                GameCanvas.Res = false;
                                                                            }
                                                                        }
                                                                        if ((GameScreen.aO == 0 ? GameCanvas.isLowGraphic(GameScreen.bx + 5, GameScreen.by - 6 - 40 + 10, 40, 40) != false : GameCanvas.isLowGraphic(GameScreen.bx + 5, GameScreen.by - 6 - 34 + 10, 34, 34) != false) && Char.e().H != 14 && var1_1.aL == null) {
                                                                            if (GameScreen.ch) {
                                                                                Screen.cs = 14;
                                                                                GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (GameCanvas.Res && GameCanvas.m) {
                                                                                    GameCanvas.i[14] = true;
                                                                                    GameCanvas.m = false;
                                                                                    GameCanvas.ai = false;
                                                                                    GameCanvas.Res = false;
                                                                                    GameScreen.ch = false;
                                                                                    GameService.LoginScreen().LoginScreen((byte)-1, (byte)-1, (byte)-1, (short)-1);
                                                                                }
                                                                            } else if (GameScreen.ck) {
                                                                                Screen.cs = 14;
                                                                                GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (GameCanvas.Res && GameCanvas.m) {
                                                                                    GameCanvas.i[14] = true;
                                                                                    GameCanvas.m = false;
                                                                                    GameCanvas.ai = false;
                                                                                    GameCanvas.Res = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < Char.e().aF.length) {
                                                                                        var7_20 = Char.e().aF[var6_16];
                                                                                        if (var7_20 != null) {
                                                                                            ds.b("find " + var7_20.b.LoginScreen);
                                                                                            if (var7_20.b.LoginScreen == 194 && (GameScreen.ck = var7_20.Item > 0)) {
                                                                                                GameService.LoginScreen().LoginScreen((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            } else if (GameScreen.cl) {
                                                                                Screen.cs = 14;
                                                                                GameCanvas.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (GameCanvas.Res && GameCanvas.m) {
                                                                                    GameCanvas.i[14] = true;
                                                                                    GameCanvas.m = false;
                                                                                    GameCanvas.ai = false;
                                                                                    GameCanvas.Res = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < Char.e().aF.length) {
                                                                                        var7_20 = Char.e().aF[var6_16];
                                                                                        if (var7_20 != null && var7_20.b.LoginScreen == 193 && (GameScreen.cl = var7_20.Item > 0)) {
                                                                                            GameService.LoginScreen().LoginScreen((byte)0, (byte)1, (byte)var6_16, (short)-1);
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
                                                                if (GameScreen.aQ.length > 5 && (GameCanvas.isLowGraphic(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY) || GameCanvas.isLowGraphic(GameScreen.eV + GameScreen.eT[5] - GameScreen.dY / 2 + 12, GameScreen.eU[5] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY))) {
                                                                    var6_16 = 1;
                                                                }
                                                                if (var6_16 != 0 || GameCanvas.isLowGraphic(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, 5 * GameScreen.dY, GameScreen.dY) || !GameCanvas.clearKeyHold && GameCanvas.isLowGraphic(GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12, GameScreen.eU[0] - GameScreen.dY / 2 + 12, GameScreen.dY, GameScreen.aQ.length * GameScreen.dY)) {
                                                                    GameCanvas.ai = false;
                                                                    var1_1.aT = false;
                                                                    var7_21 = (GameCanvas.MyHashtable - (GameScreen.eV + GameScreen.eT[0] - GameScreen.dY / 2 + 12)) / GameScreen.dY;
                                                                    if (var6_16 != 0 && GameCanvas.u < GameScreen.eU[0]) {
                                                                        var7_21 += 5;
                                                                    }
                                                                    var1_1.eB = var7_21;
                                                                    if (GameCanvas.Res && GameCanvas.m) {
                                                                        GameCanvas.m = false;
                                                                        GameCanvas.ai = false;
                                                                        GameCanvas.Res = false;
                                                                        var1_1.ex = var7_21;
                                                                        if (var1_1.ex > GameScreen.aQ.length - 1) {
                                                                            var1_1.ex = GameScreen.aQ.length - 1;
                                                                        }
                                                                        if ((var2_23 = GameScreen.aQ[var1_1.ex]) != null) {
                                                                            super.LoginScreen((bf)var2_23, true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (GameCanvas.m) {
                                                                if (GameCanvas.j[1] || GameCanvas.j[2] || GameCanvas.j[3] || GameCanvas.j[4] || GameCanvas.j[6]) {
                                                                    GameCanvas.m = false;
                                                                }
                                                                GameCanvas.j[1] = false;
                                                                GameCanvas.j[2] = false;
                                                                GameCanvas.j[3] = false;
                                                                GameCanvas.j[4] = false;
                                                                GameCanvas.j[6] = false;
                                                            }
                                                        }
                                                        var1_1 = this;
                                                        var6_17 = System.currentTimeMillis();
                                                        if (GameCanvas.i[2] || GameCanvas.i[4] || GameCanvas.i[6] || GameCanvas.i[1] || GameCanvas.i[3]) {
                                                            var1_1.aX = 0;
                                                            GameScreen.bj = false;
                                                        }
                                                        if (GameCanvas.i[5]) {
                                                            if (var1_1.aX == 0) {
                                                                if (var6_17 - var1_1.MyVector < 800L && (Char.e().aC != null && (Char.e().aC.LoginScreen.d != 1 && Char.e().T < (long)Char.e().aC.i || Char.e().aC.LoginScreen.d == 1 && Char.e().T < Char.e().W * (long)Char.e().aC.i / 100L) ? false : Char.e().aC != null && (Char.e().aC.LoginScreen.c <= 0 || Char.e().aC.c != 0)) && (Char.e().aQ != null || Char.e().aU != null && Char.e().c(Char.e().aU))) {
                                                                    var1_1.aX = 10;
                                                                    GameCanvas.i[5] = false;
                                                                }
                                                            } else {
                                                                var1_1.aX = 0;
                                                                GameCanvas.i[6] = false;
                                                                GameCanvas.i[4] = false;
                                                            }
                                                            var1_1.MyVector = var6_17;
                                                        }
                                                        if (GameCanvas.w % 5 != 0 || var1_1.aX <= 0 || Char.e().bP != null) break block243;
                                                        if (Char.e().aC != null && (Char.e().aC.LoginScreen.b() || Char.e().aC.j)) break block244;
                                                        if ((Char.e().aQ == null || Char.e().aQ.GameScreen == 1 || Char.e().aQ.GameScreen == 0 || Char.e().aU != null) && (Char.e().aU == null || !Char.e().c(Char.e().aU))) break block243;
                                                        if (Char.e().aC.j) break block244;
                                                        super.LoginScreen(false, true);
                                                    }
                                                    if (var1_1.aX > 1) {
                                                        --var1_1.aX;
                                                    }
                                                }
                                                if (ae.m != null) {
                                                    var1_1 = ae.m.j;
                                                    if ((GameCanvas.i[5] || Screen.LoginScreen((de)var1_1)) && var1_1 != null) {
                                                        GameCanvas.m = false;
                                                        GameCanvas.i[5] = false;
                                                        Screen.cs = -1;
                                                        if (var1_1 != null) {
                                                            var1_1.LoginScreen();
                                                        }
                                                    }
                                                } else if (!cq.b().b) {
                                                    if ((GameCanvas.i[12] || Screen.LoginScreen(GameCanvas.currentScreen.cm)) && this.cm != null) {
                                                        GameCanvas.m = false;
                                                        GameCanvas.Res = false;
                                                        GameCanvas.i[12] = false;
                                                        Screen.cs = -1;
                                                        if (this.cm != null) {
                                                            this.cm.LoginScreen();
                                                        }
                                                    }
                                                    if ((GameCanvas.i[13] || Screen.LoginScreen(GameCanvas.currentScreen.co)) && this.co != null) {
                                                        GameCanvas.m = false;
                                                        GameCanvas.Res = false;
                                                        GameCanvas.i[13] = false;
                                                        Screen.cs = -1;
                                                        if (this.co != null) {
                                                            this.co.LoginScreen();
                                                        }
                                                    }
                                                    if ((GameCanvas.i[5] || Screen.LoginScreen(GameCanvas.currentScreen.cn)) && this.cn != null) {
                                                        GameCanvas.m = false;
                                                        GameCanvas.i[5] = false;
                                                        Screen.cs = -1;
                                                        if (this.cn != null) {
                                                            this.cn.LoginScreen();
                                                        }
                                                    }
                                                } else {
                                                    if (cq.b().d != null && (GameCanvas.i[12] || Screen.LoginScreen(cq.b().d)) && cq.b().d != null) {
                                                        cq.b().d.LoginScreen();
                                                    }
                                                    if (cq.b().e != null && (GameCanvas.i[13] || Screen.LoginScreen(cq.b().e)) && cq.b().e != null) {
                                                        cq.b().e.LoginScreen();
                                                    }
                                                    if (cq.b().f != null && (GameCanvas.i[5] || Screen.LoginScreen(cq.b().f)) && cq.b().f != null) {
                                                        cq.b().f.LoginScreen();
                                                    }
                                                }
                                                var1_1 = this;
                                                if (Char.e().bP != null) {
                                                    var1_2 = 0;
                                                    while (var1_2 < GameCanvas.i.length) {
                                                        if (GameCanvas.i[var1_2]) {
                                                            Char.e().bP = null;
                                                            break;
                                                        }
                                                        ++var1_2;
                                                    }
                                                }
                                                if (cq.b().b && GameCanvas.ag != 0) {
                                                    cq.b().LoginScreen(GameCanvas.ag);
                                                    GameCanvas.ag = 0;
                                                    return;
                                                }
                                                if (GameCanvas.F.LoginScreen || Char.bH) {
                                                    return;
                                                }
                                                if (GameCanvas.i[10]) {
                                                    GameCanvas.i[10] = false;
                                                    this.H();
                                                    GameCanvas.clearKeyHold();
                                                }
                                                if (GameCanvas.i[11] && this.aL == null) {
                                                    if (this.bQ != null) {
                                                        this.bQ.LoginScreen.LoginScreen();
                                                    } else if (GameScreen.aE.b.b != null && GameScreen.aE.b.b.c != null) {
                                                        GameCanvas.G.Res();
                                                        GameCanvas.G.SessionReceiver();
                                                    }
                                                    GameCanvas.i[11] = false;
                                                    GameCanvas.clearKeyHold();
                                                }
                                                if (GameCanvas.ag != 0 && cd.g && GameCanvas.ag == 32) {
                                                    this.H();
                                                    GameCanvas.ag = 0;
                                                    GameCanvas.clearKeyHold();
                                                }
                                                if (GameCanvas.ag != 0 && this.aL == null && cd.g && GameCanvas.ag == 121) {
                                                    if (this.bQ != null) {
                                                        this.bQ.LoginScreen.LoginScreen();
                                                        GameCanvas.ag = 0;
                                                        GameCanvas.clearKeyHold();
                                                    } else if (GameScreen.aE.b.b != null && GameScreen.aE.b.b.c != null) {
                                                        GameCanvas.G.Res();
                                                        GameCanvas.G.SessionReceiver();
                                                        GameCanvas.ag = 0;
                                                        GameCanvas.clearKeyHold();
                                                    }
                                                }
                                                if (GameCanvas.i[10] && this.aL == null) {
                                                    GameCanvas.i[10] = false;
                                                    var1_3 = 10;
                                                    var1_4 = GameScreen.aE;
                                                    GameScreen.aE.g = 10;
                                                    GameCanvas.clearKeyHold();
                                                }
                                                var1_5 = this;
                                                if (!GameScreen.dS.b() && GameScreen.aO != 1) {
                                                    Char.e().ap = true;
                                                    if (GameCanvas.ai) {
                                                        GameCanvas.ai = false;
                                                        var1_5.aT = true;
                                                        var1_5.ee = 0;
                                                        var1_5.ea = var1_5.ec = GameCanvas.GameScreen;
                                                        var1_5.eb = var1_5.WeatherEffect = GameCanvas.q;
                                                    }
                                                    if (var1_5.aT) {
                                                        var6_18 = GameCanvas.GameScreen - var1_5.ea;
                                                        var7_22 = GameCanvas.q - var1_5.eb;
                                                        if (!(var1_5.dZ || ds.g(GameCanvas.GameScreen - var1_5.ec) <= 15 && ds.g(GameCanvas.q - var1_5.WeatherEffect) <= 15)) {
                                                            var1_5.dZ = true;
                                                        }
                                                        var1_5.ea = GameCanvas.GameScreen;
                                                        var1_5.eb = GameCanvas.q;
                                                        ++var1_5.ee;
                                                        if (var1_5.dZ) {
                                                            Char.e().ap = false;
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
                                                            GameScreen.Res = GameScreen.j;
                                                            GameScreen.m = GameScreen.k;
                                                        }
                                                    }
                                                    if (var1_5.aT && GameCanvas.m) {
                                                        var1_5.aT = false;
                                                        var1_5.dZ = false;
                                                        if (ds.g(GameCanvas.GameScreen - var1_5.ec) > 15 || ds.g(GameCanvas.q - var1_5.WeatherEffect) > 15) {
                                                            GameCanvas.m = false;
                                                        }
                                                    }
                                                }
                                                if (Char.e().ci || (var1_5 = this).J()) break block245;
                                                if (var1_5.bQ == null || var1_5.bQ.LoginScreen == null || !var1_5.bQ.LoginScreen.c()) break block246;
                                                var1_5.bQ.LoginScreen.LoginScreen();
                                                break block245;
                                            }
                                            var2_23 = var1_5;
                                            if (var2_23.aL != null && GameCanvas.isLowGraphic(var3_10 = (GameCanvas.A - 5 * GameScreen.eI) / 2, var5_28 = GameCanvas.B - 40, var4_27 = 5 * GameScreen.eI, var8_31 = GameScreen.eI) != false) break block245;
                                            var6_19 = System.currentTimeMillis();
                                            if (var1_5.aU != 0L) {
                                                var1_5.aU = 0L;
                                                GameCanvas.ai = false;
                                                if (!var1_5.ef) {
                                                    var2_23 = var1_5;
                                                    var3_11 = GameCanvas.GameScreen + var2_23.ej;
                                                    var4_27 = GameCanvas.q + var2_23.ek;
                                                    if (!super.g(var3_11, var4_27) && !super.f(var3_11, var4_27)) {
                                                        super.Item(var3_11, var4_27);
                                                    }
                                                    GameCanvas.m = false;
                                                    var1_5.ct = true;
                                                    var1_5.cu = Res.currentTimeMillis();
                                                }
                                            }
                                            if (!var1_5.ct) break block247;
                                            var1_5.cv = Res.currentTimeMillis();
                                            if (var1_5.cv - var1_5.cu >= 300L || !GameCanvas.m) break block247;
                                            var1_5.ct = false;
                                            var2_23 = var1_5;
                                            var3_12 = GameCanvas.GameScreen + var2_23.ej;
                                            var4_27 = GameCanvas.q + var2_23.ek;
                                            Char.e();
                                            var8_32 = super.e(var3_12, var4_27);
                                            if (var8_32 == null) break block248;
                                            if (var8_32 instanceof Mob && !GameScreen.LoginScreen((Mob)var8_32)) break block249;
                                            if (super.LoginScreen(var8_32) || !var8_32.equals(Char.e().aT) && var2_23.aL != null) break block247;
                                            if (!Char.e().I() || Char.e().aU == null || var8_32.equals(Char.e().aU) || var8_32.equals(Char.e().aU.aR) || !(var8_32 instanceof Char)) break block250;
                                            var5_29 = (Char)var8_32;
                                            if (var5_29.aN != 5 && !var5_29.I()) break block249;
                                        }
                                        if (bv.Res == 51 && var8_32.equals(Char.e().aT)) break block249;
                                        super.b(var8_32);
                                        break block247;
                                    }
                                    if (super.g(var3_12, var4_27) || super.f(var3_12, var4_27)) break block247;
                                }
                                super.Item(var3_12, var4_27);
                            }
                            if (!GameCanvas.m) break block245;
                            var2_23 = var1_5;
                            var3_13 = GameCanvas.GameScreen + GameScreen.j;
                            var4_27 = GameCanvas.q + GameScreen.k;
                            Char.e();
                            var5_30 = super.e(var3_13, var4_27);
                            if (var5_30 == null) break; // GOTO lbl380
                            if (!Char.e().I() || Char.e().aU == null || var5_30.equals(Char.e().aU) || var5_30.equals(Char.e().aU.aR) || !(var5_30 instanceof Char)) break block251;
                            var8_33 = (Char)var5_30;
                            if (var8_33.aN == 5 || var8_33.I()) break block251;
                            super.Item(var3_13, var4_27);
                            break; // GOTO lbl380
                        }
                        if (Char.e().aQ != var5_30 && Char.e().aV != var5_30) break block252;
                        super.b(var5_30);
                        v0 = true;
                        break block253;
                    }
                    if (bv.Res != 51 || !var5_30.equals(Char.e().aT)) break block254;
                    super.Item(var3_13, var4_27);
                    break; // GOTO lbl380
                }
                if (Char.e().cf != null || Char.e().Npc != null || Char.e().cd != null || Char.e().D() != null) {
                    v0 = false;
                } else {
                    Char.e().LoginScreen(var5_30);
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
            GameCanvas.m = false;
        }
        if (Char.e().an != null && Char.e().an.c()) {
            Char.e().an.LoginScreen();
        }
        if (Char.e().cf != null) {
            return;
        }
        if (Char.e().H == 1) {
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
                this.LoginScreen(false, false);
            } else if (GameCanvas.j[2]) {
                if (!Char.e().bJ) {
                    var1_6 = false;
                    if (Char.e().B - Char.e().bD != 0 || Char.e().C - Char.e().bE != 0) {
                        GameService.LoginScreen().g();
                    }
                    Char.e().E = -10;
                    Char.e().D = 0;
                    Char.e().H = 3;
                    Char.e().F = 0;
                }
            } else if (GameCanvas.j[4]) {
                GameScreen.bj = false;
                Char.e().ar = false;
                if (Char.e().I == 1) {
                    Char.e().I = -1;
                } else if (!Char.e().bJ) {
                    if (Char.e().B - Char.e().bD != 0) {
                        GameService.LoginScreen().g();
                    }
                    Char.e().H = 2;
                    Char.e().D = -Char.e().O;
                }
                Char.e().cJ = false;
            } else if (GameCanvas.j[6]) {
                GameScreen.bj = false;
                Char.e().ar = false;
                if (Char.e().I == -1) {
                    Char.e().I = 1;
                } else if (!Char.e().bJ) {
                    if (Char.e().B - Char.e().bD != 0) {
                        GameService.LoginScreen().g();
                    }
                    Char.e().H = 2;
                    Char.e().D = Char.e().O;
                }
                Char.e().cJ = false;
            }
        } else if (Char.e().H == 2) {
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
                this.LoginScreen(false, true);
            } else if (GameCanvas.j[2]) {
                if (Char.e().B - Char.e().bD != 0 || Char.e().C - Char.e().bE != 0) {
                    GameService.LoginScreen().g();
                }
                Char.e().E = -10;
                Char.e().H = 3;
                Char.e().F = 0;
            } else if (GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (Char.e().I == 1) {
                    Char.e().I = -1;
                } else {
                    v1 = Char.e();
                    v2 = -Char.e().O;
                    Char.e();
                    v1.D = v2;
                }
            } else if (GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (Char.e().I == -1) {
                    Char.e().I = 1;
                } else {
                    v3 = Char.e();
                    v4 = Char.e().O;
                    Char.e();
                    v3.D = v4;
                }
            }
        } else if (Char.e().H == 3) {
            GameScreen.bj = false;
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
                this.LoginScreen(false, true);
            }
            if (GameCanvas.j[4] || GameCanvas.j[1] && this.aL == null) {
                if (Char.e().I == 1) {
                    Char.e().I = -1;
                } else {
                    Char.e().D = -Char.e().O;
                }
            } else if (GameCanvas.j[6] || GameCanvas.j[3] && this.aL == null) {
                if (Char.e().I == -1) {
                    Char.e().I = 1;
                } else {
                    Char.e().D = Char.e().O;
                }
            }
            if ((GameCanvas.j[2] || (GameCanvas.j[1] || GameCanvas.j[3]) && this.aL == null) && Char.e().ao && Char.e().T > 0L && Char.e().F < 8 && Char.e().E > -4) {
                ++Char.e().F;
                Char.e().E = -7;
            }
        } else if (Char.e().H == 4) {
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
                this.LoginScreen(false, true);
            }
            if (GameCanvas.j[2] && Char.e().T > 0L && Char.e().ao) {
                GameScreen.bj = false;
                if (!(Char.e().B - Char.e().bD == 0 && Char.e().C - Char.e().bE == 0 || ds.g(Char.e().B - Char.e().bD) <= 96 && ds.g(Char.e().C - Char.e().bE) <= 24)) {
                    GameService.LoginScreen().g();
                }
                Char.e().E = -10;
                Char.e().H = 3;
                Char.e().F = 0;
            }
            if (GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (Char.e().I == 1) {
                    Char.e().I = -1;
                } else {
                    ++Char.e().F;
                    Char.e().D = -Char.e().O;
                    if (Char.e().F > 5 && Char.e().E > 6) {
                        Char.e().H = 10;
                        Char.e().F = 0;
                        Char.e().E = 0;
                    }
                }
            } else if (GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (Char.e().I == -1) {
                    Char.e().I = 1;
                } else {
                    ++Char.e().F;
                    Char.e().D = Char.e().O;
                    if (Char.e().F > 5 && Char.e().E > 6) {
                        Char.e().H = 10;
                        Char.e().F = 0;
                        Char.e().E = 0;
                    }
                }
            }
        } else if (Char.e().H == 10) {
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
                this.LoginScreen(false, true);
            }
            if (Char.e().ao && Char.e().T > 0L) {
                if (GameCanvas.j[2]) {
                    GameScreen.bj = false;
                    if (!(Char.e().B - Char.e().bD == 0 && Char.e().C - Char.e().bE == 0 || ds.g(Char.e().B - Char.e().bD) <= 96 && ds.g(Char.e().C - Char.e().bE) <= 24)) {
                        GameService.LoginScreen().g();
                    }
                    Char.e().E = -10;
                    Char.e().H = 3;
                    Char.e().F = 0;
                } else if (GameCanvas.j[4]) {
                    GameScreen.bj = false;
                    if (Char.e().I == 1) {
                        Char.e().I = -1;
                    } else {
                        Char.e().D = -(Char.e().O + 1);
                    }
                } else if (GameCanvas.j[6]) {
                    if (Char.e().I == -1) {
                        Char.e().I = 1;
                    } else {
                        Char.e().D = Char.e().O + 1;
                    }
                }
            }
        } else if (Char.e().H == 7) {
            if (GameCanvas.i[5]) {
                GameCanvas.i[5] = false;
            }
            if (GameCanvas.j[4]) {
                GameScreen.bj = false;
                if (Char.e().I == 1) {
                    Char.e().I = -1;
                } else {
                    Char.e().D = -Char.e().O + 2;
                }
            } else if (GameCanvas.j[6]) {
                GameScreen.bj = false;
                if (Char.e().I == -1) {
                    Char.e().I = 1;
                } else {
                    Char.e().D = Char.e().O - 2;
                }
            }
        }
        if (GameCanvas.i[8] && GameCanvas.ag != 56) {
            GameCanvas.i[8] = false;
            Char.e().bQ = 0;
        }
        if (GameCanvas.i[10]) {
            GameCanvas.i[10] = false;
            this.H();
        }
        if (GameCanvas.ag != 0) {
            if (this.aL == null) {
                if (cd.g) {
                    if (GameCanvas.ag == 113) {
                        if (GameScreen.aP[0] != null) {
                            this.LoginScreen(GameScreen.aP[0], true);
                        }
                    } else if (GameCanvas.ag == 119) {
                        if (GameScreen.aP[1] != null) {
                            this.LoginScreen(GameScreen.aP[1], true);
                        }
                    } else if (GameCanvas.ag == 101) {
                        if (GameScreen.aP[2] != null) {
                            this.LoginScreen(GameScreen.aP[2], true);
                        }
                    } else if (GameCanvas.ag == 114) {
                        if (GameScreen.aP[3] != null) {
                            this.LoginScreen(GameScreen.aP[3], true);
                        }
                    } else if (GameCanvas.ag == 116) {
                        if (GameScreen.aP[4] != null) {
                            this.LoginScreen(GameScreen.aP[4], true);
                        }
                    } else if (GameCanvas.ag != 50 && GameCanvas.ag != 53) {
                        cq.b().LoginScreen(GameCanvas.ag, this, "");
                    }
                } else if (!GameCanvas.c) {
                    cq.b().LoginScreen(GameCanvas.ag, this, "");
                } else if (GameCanvas.ag == 55) {
                    if (GameScreen.aP[0] != null) {
                        this.LoginScreen(GameScreen.aP[0], true);
                    }
                } else if (GameCanvas.ag == 56) {
                    if (GameScreen.aP[1] != null) {
                        this.LoginScreen(GameScreen.aP[1], true);
                    }
                } else if (GameCanvas.ag == 57) {
                    if (GameScreen.aP[2] != null) {
                        this.LoginScreen(GameScreen.aP[2], true);
                    }
                } else if (GameCanvas.ag == 49) {
                    if (GameScreen.aP[3] != null) {
                        this.LoginScreen(GameScreen.aP[3], true);
                    }
                } else if (GameCanvas.ag == 51) {
                    if (GameScreen.aP[4] != null) {
                        this.LoginScreen(GameScreen.aP[4], true);
                    }
                } else if (GameCanvas.ag == 48) {
                    cq.b().LoginScreen("");
                }
            } else {
                var1_7 = this.ServerListScreen.toCharArray();
                var2_23 = new MyVector("");
                var3_14 = 0;
                while (var3_14 < var1_7.length) {
                    var2_23.addElement(String.valueOf(var1_7[var3_14]));
                    ++var3_14;
                }
                var2_23.removeElementAt(0);
                var3_15 = String.valueOf((char)GameCanvas.ag);
                if (var3_15.equals("") || var3_15 == null || var3_15.equals("\n")) {
                    var3_15 = "-";
                }
                var2_23.insertElementAt(var3_15, var2_23.size());
                this.ServerListScreen = "";
                var1_8 = 0;
                while (var1_8 < var2_23.size()) {
                    this.ServerListScreen = String.valueOf(this.ServerListScreen) + ((String)var2_23.elementAt(var1_8)).toUpperCase();
                    ++var1_8;
                }
                GameService.LoginScreen().LoginScreen((char)GameCanvas.ag);
            }
            GameCanvas.ag = 0;
        }
        GameCanvas.clearKeyHold();
    }

    private bq e(int n2, int n3) {
        bq bq2 = null;
        int n4 = 0;
        MyVector[] elArray = new MyVector[]{F, G, E, D};
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
                        if (!(bq3 instanceof Mob)) break block11;
                        Mob aa2 = (Mob)bq3;
                        if (aa2.J && aa2.equals(Char.e().aR)) break block10;
                    }
                    int n8 = bq3.Res();
                    int n9 = bq3.m();
                    int n10 = bq3.o();
                    if (GameScreen.LoginScreen(n2, n3, n8 - n10 / 2 - 30, n9 - (n7 = bq3.n()) - 30, n10 + 60, n7 + 60)) {
                        if (bq2 == null) {
                            bq2 = bq3;
                            n4 = ds.g(n2 - n8) + ds.g(n3 - n9);
                            if (n5 == 1) {
                                return bq2;
                            }
                        } else if ((n8 = ds.g(n2 - n8) + ds.g(n3 - n9)) < n4) {
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

    private static boolean methodLoginScreen(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n2 >= n4 && n2 <= n4 + n6 && n3 >= n5 && n3 <= n5 + n7;
    }

    private boolean methodLoginScreen(bq bq2) {
        int n2;
        if (bq2 == null) {
            return false;
        }
        int n3 = bq2.m();
        if (n3 < (n2 = Char.e().C)) {
            while (n3 < n2) {
                if (!bv.LoginScreen(Char.e().B, n2 -= 5, 8192)) continue;
                this.aX = 0;
                Char.e();
                Char.e().bP = null;
                return true;
            }
        }
        return false;
    }

    private void b(bq bq2) {
        if (!bq2.equals(Char.e().aT) && this.aL != null) {
            return;
        }
        if (this.LoginScreen(bq2)) {
            return;
        }
        boolean bl2 = false;
        bq bq3 = bq2;
        GameScreen p2 = this;
        if (bq3 != null && p2.eL <= 0) {
            p2.eL = 10;
            int n2 = bq3.Res();
            n2 = (n2 = ds.g(Char.e().B - n2)) <= 80 ? 1 : (n2 > 80 && n2 <= 200 ? 2 : (n2 > 200 && n2 <= 400 ? 3 : 4));
            if (bq3.equals(Char.e().aQ) || bq3.equals(Char.e().aU) && Char.e().c(Char.e().aU)) {
                at.LoginScreen(135, bq3.Res(), bq3.m(), n2);
            } else if (bq3.equals(Char.e().aT) || bq3.equals(Char.e().aV) || bq3.equals(Char.e().aU)) {
                at.LoginScreen(136, bq3.Res(), bq3.m(), n2);
            }
        }
        Char.e();
        Char.e().bP = null;
        Char.e().E = 0;
        Char.e().D = 0;
        bq2.GameScreen();
        this.aX = 10;
        this.LoginScreen(false, true);
        this.eh = bq2.Res();
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
        if (GameScreen.aE.b.b != null && GameScreen.aE.b.b.c != null && GameScreen.LoginScreen(n2 - j, n3 - k, n5 = ds.g(GameScreen.aE.d) + GameScreen.aE.b.g - 40, n4 = ds.g(GameScreen.aE.c) + GameScreen.aE.b.Item, 200, GameScreen.aE.b.j)) {
            n2 = 10;
            Position eo2 = aE;
            aE.g = 10;
            return true;
        }
        return false;
    }

    private boolean g(int n2, int n3) {
        int n4 = 0;
        while (n4 < bo.LoginScreen.size()) {
            bo bo2 = (bo)bo.LoginScreen.elementAt(n4);
            if (GameScreen.LoginScreen(n2, n3, bo2.d, bo2.e, bo2.f, bo2.g)) {
                if (bo2.e <= 24 && bv.f() && Char.e().aN != 0) {
                    return false;
                }
                if (bo2.j) {
                    bo2.LoginScreen(10);
                    return true;
                }
            }
            ++n4;
        }
        return false;
    }

    private void methodItem(int n2, int n3) {
        if (dS.c()) {
            return;
        }
        Char.e();
        if (n2 < bv.c && n2 > bv.c - 32) {
            Char.e().bP = new dm(bv.c, n3);
            return;
        }
        if (n2 < 32 && n2 > 0) {
            Char.e().bP = new dm(0, n3);
            return;
        }
        this.eh = n2;
        this.ei = n3;
        this.eg = false;
        Char.e().bQ = 0;
        int n4 = n2 = Char.e().ao && Char.e().T > 0L ? 0 : 1000;
        if (this.ei > Char.e().C && ds.g(this.eh - Char.e().B) < 12) {
            return;
        }
        n3 = 0;
        while (n3 < n2 + 60) {
            if (this.ei + n3 >= bv.d - 24) break;
            if (bv.LoginScreen(this.eh, this.ei + n3, 2)) {
                this.ei = bv.e(this.ei + n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        n3 = 0;
        while (n3 < n2 + 40) {
            if (bv.LoginScreen(this.eh, this.ei - n3, 2)) {
                this.ei = bv.e(this.ei - n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        this.aV = true;
        Char.e().bQ = 0;
        if (!this.eg && this.ei < Char.e().C - 50) {
            Char.e().bQ = 20;
        }
        this.aX = 0;
        if (Char.e().cJ) {
            Char.e().P();
        }
        Char.e().bP = new dm(this.eh, this.ei);
        Char.e().I = Char.e().B - Char.e().bP.LoginScreen > 0 ? -1 : 1;
        Char.e().ay = null;
        bj = false;
    }

    private void H() {
        if (Char.e().cR) {
            return;
        }
        if (Char.e().cO) {
            return;
        }
        if (Char.e().cI > 0) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.SplashScreen < 10000L) {
            return;
        }
        if (!Char.e().M()) {
            aD.LoginScreen(T.aU, 0);
            return;
        }
        at.LoginScreen(11, Char.e(), 5);
        at.LoginScreen(104, Char.e(), 4);
        this.SplashScreen = l2;
        bu.LoginScreen();
    }

    public final void b(int n2, int n3) {
        if (!this.Position) {
            bu.LoginScreen();
            ds.c("ACTIVE SUPER POWER");
            this.Position = true;
            this.ep = 0;
            this.es = 0;
            this.eq = n2 - j;
            this.er = n3 - k;
        }
    }

    public final void methodLoginScreen(boolean bl2) {
        this.bd = true;
        this.ba = true;
        this.et = true;
        if (bl2) {
            ea ea2 = new ea(20, Char.e().B, Char.e().C - 77, 2, 8, 1);
            ei.LoginScreen(ea2);
        }
    }

    public final void o() {
        this.bd = false;
        this.ba = true;
        this.et = false;
    }

    public final void GameScreen() {
        this.Screen = true;
        this.be = mGraphics.LoginScreen(0.4f, 0, GameCanvas.Char[GameCanvas.Char.length - 1]);
    }

    public final void c(int n2, int n3) {
        ds.c("VE RONG THAN O VI TRI x= " + n2 + " Message=" + n3);
        this.GameScreen();
        ea ea2 = new ea(this.bc ? 25 : 17, n2, n3 - 77, 2, -1, 1);
        ei.LoginScreen(ea2);
    }

    /*
     * Unable to fully structure code
     */
    private void methodLoginScreen(boolean var1_1, boolean var2_9) {
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
                                                                                                                                            if (Char.e().aU != null && Char.e().aU.C >= Char.e().C + 48 && bv.LoginScreen(Char.e().B, Char.e().C, 2)) {
                                                                                                                                                this.aX = 0;
                                                                                                                                                Char.e().bP = null;
                                                                                                                                                Char.bH = false;
                                                                                                                                                Char.e().bJ = false;
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            ds.c("do fire");
                                                                                                                                            ++GameScreen.eu;
                                                                                                                                            var1_2 = Char.e().i();
                                                                                                                                            var3_10 = Char.e().j();
                                                                                                                                            if (var2_9 == 0 && var1_2 != null && (Char.e().aQ == null || Char.e().aQ != null && Char.e().aQ.C == 0)) {
                                                                                                                                                var1_2.g.i.LoginScreen();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (var2_9 == 0 && var3_10 != null && (Char.e().aQ == null || Char.e().aQ != null && Char.e().aQ.C == 0)) {
                                                                                                                                                var3_10.g.i.LoginScreen();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (bv.Res == 51 && Char.e().aT != null) {
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (Char.e().H == 14) break block46;
                                                                                                                                            Char.e().E = 0;
                                                                                                                                            Char.e().D = 0;
                                                                                                                                            if (!Char.e().w() || !Char.e().O()) break block47;
                                                                                                                                            if (this.G()) {
                                                                                                                                                Char.e();
                                                                                                                                                Char.e();
                                                                                                                                                Char.A();
                                                                                                                                            }
                                                                                                                                            break block48;
                                                                                                                                        }
                                                                                                                                        var1_2 = this;
                                                                                                                                        if (!var1_2.LoginScreen(Char.e().aU)) break block49;
                                                                                                                                        v0 = false;
                                                                                                                                        break block50;
                                                                                                                                    }
                                                                                                                                    if (!super.LoginScreen(Char.e().aQ)) break block51;
                                                                                                                                    v0 = false;
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                if (!super.LoginScreen(Char.e().aT)) break block52;
                                                                                                                                v0 = false;
                                                                                                                                break block50;
                                                                                                                            }
                                                                                                                            if (!cq.b().b) break block53;
                                                                                                                            v0 = false;
                                                                                                                            break block50;
                                                                                                                        }
                                                                                                                        if (bp.b) break block54;
                                                                                                                        Char.e();
                                                                                                                        if (!Char.bH) break block55;
                                                                                                                    }
                                                                                                                    v0 = false;
                                                                                                                    break block50;
                                                                                                                }
                                                                                                                if (Char.e().aC == null || Char.e().aC.LoginScreen.LoginScreen != 6 || Char.e().aV == null) break block56;
                                                                                                                super.I();
                                                                                                                v0 = false;
                                                                                                                break block50;
                                                                                                            }
                                                                                                            if (Char.e().aC == null || Char.e().aC.LoginScreen.e != 2 || Char.e().aT != null || Char.e().aC.LoginScreen.LoginScreen == 6) break block57;
                                                                                                            v0 = super.G();
                                                                                                            break block50;
                                                                                                        }
                                                                                                        if (Char.e().cf == null && (Char.e().aQ != null || Char.e().aT != null || Char.e().aU != null || Char.e().aV != null)) break block58;
                                                                                                        v0 = false;
                                                                                                        break block50;
                                                                                                    }
                                                                                                    if (Char.e().aQ == null) break block59;
                                                                                                    if (Char.e().aQ.u() && Char.e().aQ.GameScreen == 4) {
                                                                                                        Char.e().aQ = null;
                                                                                                        Char.e().bP = null;
                                                                                                    }
                                                                                                    GameScreen.bj = true;
                                                                                                    if (GameScreen.LoginScreen(Char.e().aQ)) break block60;
                                                                                                    v0 = false;
                                                                                                    break block50;
                                                                                                }
                                                                                                if (var1_2.aL == null) break block61;
                                                                                                v0 = false;
                                                                                                break block50;
                                                                                            }
                                                                                            if (Char.e().aC != null) break block62;
                                                                                            v0 = false;
                                                                                            break block50;
                                                                                        }
                                                                                        if (!Char.e().w()) break block63;
                                                                                        v0 = false;
                                                                                        break block50;
                                                                                    }
                                                                                    var2_9 = -1;
                                                                                    var3_11 = ds.g(Char.e().B - GameScreen.j) * mGraphics.b;
                                                                                    if (Char.e().aU != null) {
                                                                                        var2_9 = ds.g(Char.e().B - Char.e().aU.B) * mGraphics.b;
                                                                                    } else if (Char.e().aQ != null) {
                                                                                        var2_9 = ds.g(Char.e().B - Char.e().aQ.m) * mGraphics.b;
                                                                                    }
                                                                                    if ((Char.e().aQ.GameScreen == 1 || Char.e().aQ.GameScreen == 0 || Char.e().aC.LoginScreen.e == 4 || var2_9 == -1 || var2_9 > var3_11) && Char.e().aC.LoginScreen.e == 4) {
                                                                                        Char.e().I = Char.e().aQ.m < Char.e().B ? -1 : 1;
                                                                                        super.LoginScreen(Char.e().aC, true);
                                                                                    }
                                                                                    if (super.G()) break block64;
                                                                                    v0 = false;
                                                                                    break block50;
                                                                                }
                                                                                Char.e().I = Char.e().B < Char.e().aQ.Res() ? 1 : -1;
                                                                                var1_3 = Math.abs(Char.e().B - Char.e().aQ.Res());
                                                                                var3_11 = Math.abs(Char.e().C - Char.e().aQ.m());
                                                                                Char.e().D = 0;
                                                                                if (var1_3 > Char.e().aC.g || var3_11 > Char.e().aC.Item) break block65;
                                                                                if (Char.e().aC.LoginScreen.LoginScreen == 20) break; // GOTO lbl-1000
                                                                                if (var3_11 <= var1_3 || ds.g(Char.e().C - Char.e().aQ.m()) <= 30 || Char.e().aQ.z().c != 4) break block66;
                                                                                Char.e().bP = new dm(Char.e().B + Char.e().I, Char.e().aQ.m());
                                                                                Char.e().ay = new de(null, null, 8002, null);
                                                                                GameCanvas.resetKeys();
                                                                                GameCanvas.clearKeyHold();
                                                                                v0 = false;
                                                                                break block50;
                                                                            }
                                                                            var4_14 = 20;
                                                                            var2_9 = 0;
                                                                            if (Char.e().aQ instanceof Npc || Char.e().aQ instanceof d) {
                                                                                var2_9 = 1;
                                                                            }
                                                                            if (Char.e().aC.g > 100) {
                                                                                var4_14 = 60;
                                                                                if (var1_3 < 20) {
                                                                                    Char.e().LoginScreen(Char.e().B, Char.e().C, 10);
                                                                                }
                                                                            }
                                                                            ds.c("dt= " + var4_14);
                                                                            var3_11 = 0;
                                                                            if ((bv.b(Char.e().B, Char.e().C + 3) & 2) == 2) {
                                                                                v1 = var5_17 = Char.e().B > Char.e().aQ.Res() ? 1 : -1;
                                                                                if ((bv.b(Char.e().aQ.Res() + var4_14 * var5_17, Char.e().C + 3) & 2) != 2) {
                                                                                    var3_11 = 1;
                                                                                }
                                                                            }
                                                                            if (var1_3 <= var4_14 && var3_11 == 0) {
                                                                                if (Char.e().B > Char.e().aQ.Res()) {
                                                                                    var5_17 = Char.e().aQ.Res() + var4_14 + (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = Char.e().aQ.Res();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 < var5_17) {
                                                                                        if (bv.b(var1_3, Char.e().C + 3) == 8 || bv.b(var1_3, Char.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 += 24;
                                                                                    }
                                                                                    Char.e().B = var2_9 != 0 ? var1_3 - 24 : var5_17;
                                                                                    Char.e().I = -1;
                                                                                } else {
                                                                                    var5_17 = Char.e().aQ.Res() - var4_14 - (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = Char.e().aQ.Res();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 > var5_17) {
                                                                                        if (bv.b(var1_3, Char.e().C + 3) == 8 || bv.b(var1_3, Char.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 -= 24;
                                                                                    }
                                                                                    Char.e().B = var2_9 != 0 ? var1_3 + 24 : var5_17;
                                                                                    Char.e().I = 1;
                                                                                }
                                                                                GameService.LoginScreen().g();
                                                                            }
                                                                            GameCanvas.resetKeys();
                                                                            GameCanvas.clearKeyHold();
                                                                            break; // GOTO lbl-1000
                                                                        }
                                                                        var4_15 = false;
                                                                        if (Char.e().aQ instanceof Npc || Char.e().aQ instanceof d) {
                                                                            var4_15 = true;
                                                                        }
                                                                        var2_9 = (Char.e().aC.g - (var4_15 != false ? 50 : 20)) * (Char.e().B > Char.e().aQ.Res() ? 1 : -1);
                                                                        if (var1_3 <= Char.e().aC.g) {
                                                                            var2_9 = 0;
                                                                        }
                                                                        Char.e().bP = new dm(Char.e().aQ.Res() + var2_9, Char.e().aQ.m());
                                                                        Char.e().ay = new de(null, null, 8002, null);
                                                                        GameCanvas.resetKeys();
                                                                        GameCanvas.clearKeyHold();
                                                                        v0 = false;
                                                                        break block50;
                                                                    }
                                                                    if (Char.e().aT == null) break block67;
                                                                    if (!Char.e().aT.dh) break block68;
                                                                    v0 = false;
                                                                    break block50;
                                                                }
                                                                Char.e().I = Char.e().B < Char.e().aT.B ? 1 : -1;
                                                                Char.e().aT.I = Char.e().B < Char.e().aT.B ? -1 : 1;
                                                                var2_9 = Math.abs(Char.e().B - Char.e().aT.B);
                                                                var3_12 = Math.abs(Char.e().C - Char.e().aT.C);
                                                                if (var3_12 > 40) {
                                                                    Char.e().C = Char.e().aT.C - 40;
                                                                }
                                                                if (var2_9 >= 60) break block69;
                                                                GameCanvas.resetKeys();
                                                                GameCanvas.clearKeyHold();
                                                                if (var1_2.dv != 0) break block70;
                                                                if (Char.e().aD == null || Char.e().aD.c != 0) break block71;
                                                                if (Char.e().aD.LoginScreen >= 4 || Char.e().aT.df.LoginScreen != 4) break block72;
                                                                v0 = false;
                                                                break block50;
                                                            }
                                                            if (Char.e().aD.LoginScreen >= 3 || Char.e().aT.df.LoginScreen != 3) break block71;
                                                            v0 = false;
                                                            break block50;
                                                        }
                                                        var1_2.dv = 50;
                                                        bp.LoginScreen();
                                                        GameService.LoginScreen().g();
                                                        GameService.LoginScreen().j(Char.e().aT.df.LoginScreen);
                                                        break block70;
                                                    }
                                                    var1_4 = (20 + ds.LoginScreen.nextInt(20)) * (Char.e().B > Char.e().aT.B ? 1 : -1);
                                                    Char.e().bP = new dm(Char.e().aT.B + var1_4, Char.e().C);
                                                    Char.e().ay = new de(null, null, 8002, null);
                                                    GameCanvas.resetKeys();
                                                    GameCanvas.clearKeyHold();
                                                }
                                                v0 = false;
                                                break block50;
                                            }
                                            if (Char.e().aU == null) break block73;
                                            if (var1_2.aL == null) break block74;
                                            v0 = false;
                                            break block50;
                                        }
                                        Char.e().I = Char.e().B < Char.e().aU.B ? 1 : -1;
                                        var2_9 = Math.abs(Char.e().B - Char.e().aU.B);
                                        var3_13 = Math.abs(Char.e().C - Char.e().aU.C);
                                        if (!Char.e().c(Char.e().aU) && !Char.e().Message()) break block75;
                                        if (Char.e().aC != null) break block76;
                                        v0 = false;
                                        break block50;
                                    }
                                    if (super.G()) break block77;
                                    v0 = false;
                                    break block50;
                                }
                                Char.e().I = Char.e().B < Char.e().aU.B ? 1 : -1;
                                Char.e().D = 0;
                                if (var2_9 > Char.e().aC.g || var3_13 > Char.e().aC.Item) break block78;
                                if (Char.e().aC.LoginScreen.LoginScreen != 20) {
                                    var1_5 = 20;
                                    if (Char.e().aC.g > 60) {
                                        var1_5 = 60;
                                        if (var2_9 < 20) {
                                            Char.e().LoginScreen(Char.e().B, Char.e().C, 10);
                                        }
                                    }
                                    var3_13 = 0;
                                    if ((bv.b(Char.e().B, Char.e().C + 3) & 2) == 2) {
                                        v2 = var4_16 = Char.e().B > Char.e().aU.B ? 1 : -1;
                                        if ((bv.b(Char.e().aU.B + var1_5 * var4_16, Char.e().C + 3) & 2) != 2) {
                                            var3_13 = 1;
                                        }
                                    }
                                    if (var2_9 <= var1_5 && var3_13 == 0) {
                                        if (Char.e().B > Char.e().aU.B) {
                                            Char.e().B = Char.e().aU.B + var1_5;
                                            Char.e().I = -1;
                                        } else {
                                            Char.e().B = Char.e().aU.B - var1_5;
                                            Char.e().I = 1;
                                        }
                                        GameService.LoginScreen().g();
                                    }
                                    GameCanvas.resetKeys();
                                    GameCanvas.clearKeyHold();
                                }
                                break; // GOTO lbl-1000
                            }
                            var1_6 = (Char.e().aC.g - 20) * (Char.e().B > Char.e().aU.B ? 1 : -1);
                            if (var2_9 <= Char.e().aC.g) {
                                var1_6 = 0;
                            }
                            Char.e().bP = new dm(Char.e().aU.B + var1_6, Char.e().aU.C);
                            Char.e().ay = new de(null, null, 8002, null);
                            GameCanvas.resetKeys();
                            GameCanvas.clearKeyHold();
                            v0 = false;
                            break block50;
                        }
                        if (var2_9 < 60 && var3_13 < 40) {
                            Char.e();
                            super.F();
                            if (!GameCanvas.e && Char.e().aU.J >= 0 && bv.Res != 51 && bv.Res != 52 && var1_2.bQ == null) {
                                GameCanvas.G.LoginScreen(Char.e().aU);
                                GameCanvas.G.SessionReceiver();
                                GameService.LoginScreen().c(Char.e().aU.J);
                                GameService.LoginScreen().Message(Char.e().aU.J);
                            }
                        } else {
                            var1_7 = (20 + ds.LoginScreen.nextInt(20)) * (Char.e().B > Char.e().aU.B ? 1 : -1);
                            Char.e().bP = new dm(Char.e().aU.B + var1_7, Char.e().aU.C);
                            Char.e().ay = new de(null, null, 8002, null);
                            GameCanvas.resetKeys();
                            GameCanvas.clearKeyHold();
                        }
                        v0 = false;
                        break block50;
                    }
                    if (Char.e().aV != null) {
                        super.I();
                        v0 = false;
                    } else { }
                    // 4 sources

                    {
                        v0 = true;
                    }
                }
                if (v0) {
                    if (Char.e().z() && Char.e().O()) {
                        if (this.G()) {
                            Char.e();
                            Char.e().B();
                        } else {
                            Char.e().C();
                        }
                    } else {
                        var1_8 = bv.LoginScreen(Char.e().B, Char.e().C, 2);
                        Char.e().LoginScreen(GameScreen.u[Char.e().aC.b], var1_8 != false ? 0 : 1);
                        if (var1_8) {
                            Char.e().bQ = 20;
                        }
                        Char.e();
                    }
                }
            }
            if (Char.e().Message()) {
                this.aX = 0;
            }
        }
    }

    private void I() {
        if (Char.e().aV != null) {
            Char.e().I = Char.e().B < Char.e().aV.LoginScreen ? 1 : -1;
            int n2 = Math.abs(Char.e().B - Char.e().aV.LoginScreen);
            int n3 = Math.abs(Char.e().C - Char.e().aV.b);
            if (n2 <= 40 && n3 < 40) {
                GameCanvas.resetKeys();
                GameCanvas.clearKeyHold();
                if (Char.e().aV.e.LoginScreen != 673) {
                    GameService.LoginScreen().Res(Char.e().aV.d);
                    return;
                }
                _do do_ = new _do(5, 0, -100, 100, 5, GameScreen.aD.LoginScreen[Char.e().K][2]);
                ds.c(Char.e().aT != null ? "!null" : "null");
                String string = T.aA;
                String[] stringArray = new String[]{T.ImageLoader, T.bo};
                ds.c(Char.e().aT != null ? "!null" : "null");
                do_.dk = 673;
                GameScreen.j();
                GameScreen.LoginScreen(stringArray, do_);
                ae.LoginScreen(string, 100000, do_, 5820);
                return;
            }
            Char.e().bP = new dm(Char.e().aV.LoginScreen, Char.e().aV.b);
            Char.e().ay = new de(null, null, 8002, null);
            GameCanvas.resetKeys();
            GameCanvas.clearKeyHold();
        }
    }

    private boolean J() {
        return Char.e().ci || Char.e().ch || Char.e().cj || Char.e().cG || this.Position || Char.e().bk;
    }

    private void methodLoginScreen(bf bf2, boolean bl2) {
        if (Char.e().ItemMap) {
            return;
        }
        if (this.J()) {
            return;
        }
        if (Char.e().aD.c <= 1) {
            return;
        }
        Char.e().aC = bf2;
        if (this.ey != bf2 && this.ey != null) {
            GameService.LoginScreen().i(bf2.LoginScreen.LoginScreen);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            GameScreen.j().aX = 0;
            return;
        }
        if (Char.e().x()) {
            ds.c(">>>use skill spec: " + bf2.LoginScreen.LoginScreen);
            Char.e().LoginScreen(bf2.LoginScreen.LoginScreen);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            GameScreen.j().aX = 0;
            return;
        }
        if (Char.e().w()) {
            ds.c("use skill not focus");
            this.LoginScreen(bf2);
            this.ey = bf2;
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            ds.c("only select skill");
            if (this.ey != bf2) {
                GameService.LoginScreen().i(bf2.LoginScreen.LoginScreen);
                this.n();
            }
            if (Char.e().aU == null && Char.e().Message()) {
                ds.c("return o day");
                return;
            }
            if (Char.e().O()) {
                this.LoginScreen(true, true);
            }
            this.ey = bf2;
        }
    }

    private void b(bf bf2, boolean bl2) {
        if ((bv.Res == 112 || bv.Res == 113) && Char.e().aN == 0) {
            return;
        }
        if (Char.e().w()) {
            this.LoginScreen(bf2);
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            GameService.LoginScreen().i(bf2.LoginScreen.LoginScreen);
            this.n();
            Char.e().aC = bf2;
            this.LoginScreen(bl2, true);
        }
    }

    private void methodLoginScreen(bf bf2) {
        if ((bv.Res == 112 || bv.Res == 113) && Char.e().aN == 0) {
            return;
        }
        if (this.G()) {
            this.ex = -1;
            if (bf2 != null) {
                GameService.LoginScreen().i(bf2.LoginScreen.LoginScreen);
                this.n();
                Char.e().aC = bf2;
                Char.e();
                Char.A();
                Char.e();
                this.aX = 0;
            }
        }
    }

    public static void q() {
        int n2 = 0;
        while (n2 < Char.e().aA.size() - 1) {
            bf bf2 = (bf)Char.e().aA.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < Char.e().aA.size()) {
                bf bf3 = (bf)Char.e().aA.elementAt(n3);
                if (bf3.LoginScreen.LoginScreen < bf2.LoginScreen.LoginScreen) {
                    bf bf4 = bf3;
                    bf3 = bf2;
                    bf2 = bf4;
                    Char.e().aA.setElementAt(bf2, n2);
                    Char.e().aA.setElementAt(bf3, n3);
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
            if (GameCanvas.clearKeyHold && GameCanvas.isLowGraphic(n6 = (GameCanvas.A - this.bm.length() * eI) / 2, n5 = GameCanvas.B - 40, n4 = this.bm.length() * eI, n3 = eI)) {
                if (n2 == (n6 = (GameCanvas.GameScreen - n6) / eI)) {
                    this.bq[n2] = 1;
                }
                if (GameCanvas.Res && GameCanvas.m && n2 == n6) {
                    char[] cArray = this.ServerListScreen.toCharArray();
                    MyVector el2 = new MyVector("");
                    n5 = 0;
                    while (n5 < cArray.length) {
                        el2.addElement(String.valueOf(cArray[n5]));
                        ++n5;
                    }
                    el2.removeElementAt(0);
                    el2.insertElementAt(String.valueOf(this.bm.charAt(n2)), el2.size());
                    this.ServerListScreen = "";
                    n5 = 0;
                    while (n5 < el2.size()) {
                        this.ServerListScreen = String.valueOf(this.ServerListScreen) + ((String)el2.elementAt(n5)).toUpperCase();
                        ++n5;
                    }
                    GameService.LoginScreen().LoginScreen(this.bm.charAt(n2));
                }
            }
            ++n2;
        }
    }

    public final void c() {
        Object object;
        if (GameCanvas.w % 100 == 0 && bv.Res == 137) {
            bu = 30;
        }
        if (bj && GameCanvas.w % 20 == 0) {
            object = this;
            if (((GameScreen)object).ev > 0) {
                --((GameScreen)object).ev;
            }
            if (!(!bk || bl || Char.e().H == 14 || Char.e().H == 5 || Char.e().bl || Char.e().ci || Char.e().z())) {
                Object object2;
                boolean bl2 = false;
                int n2 = 0;
                while (n2 < F.size()) {
                    object2 = (Mob)F.elementAt(n2);
                    if (((Mob)object2).GameScreen != 0 && ((Mob)object2).GameScreen != 1) {
                        bl2 = true;
                    }
                    ++n2;
                }
                if (bl2) {
                    n2 = 0;
                    int n3 = 0;
                    while (n3 < Char.e().aF.length) {
                        Item h2 = Char.e().aF[n3];
                        if (h2 != null && h2.b.b == 6) {
                            n2 = 1;
                            break;
                        }
                        ++n3;
                    }
                    if (n2 == 0 && GameCanvas.w % 150 == 0) {
                        GameService.LoginScreen().v();
                    }
                    if (Char.e().U <= Char.e().V * 20L / 100L || Char.e().T <= Char.e().W * 20L / 100L) {
                        super.H();
                    }
                    if (Char.e().aQ == null || Char.e().aQ != null && Char.e().aQ.J) {
                        n3 = 0;
                        while (n3 < F.size()) {
                            Mob aa2 = (Mob)F.elementAt(n3);
                            if (aa2.GameScreen != 0 && aa2.GameScreen != 1 && aa2.k > 0L && !aa2.J) {
                                Char.e().B = aa2.m;
                                Char.e().C = aa2.n;
                                Char.e().aQ = aa2;
                                GameService.LoginScreen().g();
                                ds.c("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                                break;
                            }
                            ++n3;
                        }
                    } else if (Char.e().aQ.k <= 0L || Char.e().aQ.GameScreen == 1 || Char.e().aQ.GameScreen == 0) {
                        Char.e().aQ = null;
                    }
                    if (Char.e().aQ != null && ((GameScreen)object).ev == 0 && (Char.e().D() == null || Char.e().cb >= Char.e().D().length || Char.e().cd == null || Char.e().Npc == null)) {
                        long l2;
                        object2 = null;
                        if (GameCanvas.e) {
                            int n4 = 0;
                            while (n4 < aQ.length) {
                                if (aQ[n4] != null && !GameScreen.aQ[n4].j && GameScreen.aQ[n4].LoginScreen.LoginScreen != 10 && GameScreen.aQ[n4].LoginScreen.LoginScreen != 11 && GameScreen.aQ[n4].LoginScreen.LoginScreen != 14 && GameScreen.aQ[n4].LoginScreen.LoginScreen != 23 && GameScreen.aQ[n4].LoginScreen.LoginScreen != 7 && Char.e().D() == null && !GameScreen.aQ[n4].LoginScreen.c() && Char.e().T >= (l2 = GameScreen.aQ[n4].LoginScreen.d == 2 ? 1L : (GameScreen.aQ[n4].LoginScreen.d != 1 ? (long)GameScreen.aQ[n4].i : (long)GameScreen.aQ[n4].i * Char.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aQ[n4];
                                    } else if (((bf)object2).e < GameScreen.aQ[n4].e) {
                                        object2 = aQ[n4];
                                    }
                                }
                                ++n4;
                            }
                            if (object2 != null) {
                                super.LoginScreen((bf)object2, true);
                                super.b(Char.e().aQ);
                            }
                        } else {
                            int n5 = 0;
                            while (n5 < aP.length) {
                                if (aP[n5] != null && !GameScreen.aP[n5].j && GameScreen.aP[n5].LoginScreen.LoginScreen != 10 && GameScreen.aP[n5].LoginScreen.LoginScreen != 11 && GameScreen.aP[n5].LoginScreen.LoginScreen != 14 && GameScreen.aP[n5].LoginScreen.LoginScreen != 23 && GameScreen.aP[n5].LoginScreen.LoginScreen != 7 && Char.e().D() == null && Char.e().T >= (l2 = GameScreen.aP[n5].LoginScreen.d == 2 ? 1L : (GameScreen.aP[n5].LoginScreen.d != 1 ? (long)GameScreen.aP[n5].i : (long)GameScreen.aP[n5].i * Char.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aP[n5];
                                    } else if (((bf)object2).e < GameScreen.aP[n5].e) {
                                        object2 = aP[n5];
                                    }
                                }
                                ++n5;
                            }
                            if (object2 != null) {
                                super.LoginScreen((bf)object2, true);
                                super.b(Char.e().aQ);
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
                    aD.LoginScreen(((GameScreen)object).fA, 0);
                    eG = 0;
                }
            } else if (((GameScreen)object).fz > ((GameScreen)object).fu.length - 1) {
                --((GameScreen)object).fB;
                if (((GameScreen)object).fB == 0) {
                    ((GameScreen)object).fF = "";
                    aD.LoginScreen(((GameScreen)object).fA, 0);
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
                    } else if (GameCanvas.w % 5 == 0) {
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
                GameService.LoginScreen().g(n11);
            }
            if (z > 0 && --z == 0) {
                MessageHandler.b = false;
            }
            if (!LoginScreen) {
                if (j != Res || k != m) {
                    cD = Res - j << 2;
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
                if (r > bv.b - 1) {
                    r = bv.b - 1;
                }
                if ((bv.B = (Char.e().B - 2 * d) / bv.i) < 0) {
                    bv.B = 0;
                }
                if ((bv.C = bv.B + bv.F) > bv.LoginScreen) {
                    bv.C = bv.LoginScreen;
                    bv.B = bv.C - bv.F;
                }
                if ((bv.D = (Char.e().C - 2 * e) / bv.i) < 0) {
                    bv.D = 0;
                }
                if ((bv.E = bv.D + bv.G) > bv.b) {
                    bv.E = bv.b;
                    bv.D = bv.E - bv.G;
                }
                cK.b();
                cJ.b();
            }
            cq.b().c();
            int n12 = 0;
            while (n12 < D.size()) {
                ((Char)D.elementAt(n12)).LoginScreen();
                ++n12;
            }
            n12 = 0;
            while (n12 < cn.LoginScreen.size()) {
                ((cn)cn.LoginScreen.elementAt(n12)).LoginScreen();
                ++n12;
            }
            Char.e().LoginScreen();
            if (Char.e().H == 1 && GameCanvas.w % 100 == 0) {
                System.gc();
            }
            if (this.bQ != null) {
                this.bQ.LoginScreen();
            }
            ei.LoginScreen();
            n12 = 0;
            while (n12 < F.size()) {
                ((Mob)F.elementAt(n12)).c();
                ++n12;
            }
            n12 = 0;
            while (n12 < G.size()) {
                ((_do)G.elementAt(n12)).LoginScreen();
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
            GameCanvas.isLowGraphic().j();
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
                        bI[n14] = bI[n14] + ds.g(fc[n12]);
                        int n15 = n12;
                        bG[n15] = bG[n15] + fb[n12];
                        int n16 = n12;
                        bH[n16] = bH[n16] + fc[n12];
                    }
                }
                ++n12;
            }
            bo.b();
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
                if (bq2 == null || bq2 != null && bq2.equals(Char.e().aT) && bv.Res == 51) {
                    at.LoginScreen(134, p2.eh, p2.ei + GameCanvas.ae / 2, 3);
                }
            }
            int n20 = 0;
            while (n20 < E.size()) {
                ((ItemMap)E.elementAt(n20)).LoginScreen();
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
                dc2.LoginScreen();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.z.size()) {
                dc dc3 = (dc)dc.z.elementAt(n20);
                dc3.LoginScreen();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.A.size()) {
                dc dc4 = (dc)dc.A.elementAt(n20);
                dc4.LoginScreen();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.B.size()) {
                dc dc5 = (dc)dc.B.elementAt(n20);
                dc5.LoginScreen();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.w.size()) {
                dc dc6 = (dc)dc.w.elementAt(n20);
                dc6.LoginScreen();
                ++n20;
            }
            WeatherEffect.c();
            aD.LoginScreen();
            aE.LoginScreen();
            if (Q != null && !Q.equals(Char.e())) {
                Q.LoginScreen();
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
            } else if (this.bC > Char.e().U) {
                long l3 = this.bC - Char.e().U >> 1;
                if (l3 < 1L) {
                    l3 = 1L;
                }
                this.bC -= l3;
            } else {
                this.bC = Char.e().U;
            }
            if (this.bB) {
                ++this.bA;
                if (this.bA == 20L) {
                    this.bA = 0L;
                    this.bB = false;
                }
            } else if (this.bz > Char.e().T) {
                long l4 = this.bz - Char.e().T >> 1;
                if (l4 < 1L) {
                    l4 = 1L;
                }
                this.bz -= l4;
            } else {
                this.bz = Char.e().T;
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
            while (n20 < Char.Session.size()) {
                ((cy)Char.Session.elementAt(n20)).LoginScreen();
                ++n20;
            }
            n20 = 0;
            while (n20 < bv.size()) {
                ((cy)bv.elementAt(n20)).LoginScreen();
                ++n20;
            }
            GameScreen p3 = this;
            if (p3.fE) {
                p3.fC -= 2;
                if (p3.fC < -p3.fD) {
                    p3.fC = GameCanvas.A;
                    ft.removeElementAt(0);
                    if (ft.size() == 0) {
                        p3.bR = false;
                        p3.fE = false;
                    } else {
                        p3.fD = mFont.c.LoginScreen((String)ft.elementAt(0));
                    }
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        int n21 = GameCanvas.w % 4000;
        if (n21 == 1000) {
            ImageCache.imgCache(ImageCache.imgCache, 10);
        }
        dh.LoginScreen();
    }

    public final boolean r() {
        return this.et;
    }

    public static void methodLoginScreen(mGraphics en2, int n2) {
        int n3 = 0;
        while (n3 < bv.v.size()) {
            cz cz2 = (cz)bv.v.elementAt(n3);
            if (cz2.c != -1 && cz2.Item == n2) {
                cz2.LoginScreen(en2);
            }
            ++n3;
        }
        if (bv.Res == 48 && n2 == 3 && GameCanvas.P != null && GameCanvas.P[0] != 0) {
            n3 = 0;
            while (n3 < bv.c / GameCanvas.P[0] + 1) {
                en2.LoginScreen(GameCanvas.N[0], n3 * GameCanvas.P[0], bv.d - GameCanvas.Q[0] - 70, 0);
                ++n3;
            }
        }
    }

    public static void b(mGraphics en2) {
        if (GameCanvas.isLowGraphic) {
            return;
        }
        en2.LoginScreen(mGraphics, 0, 0, GameCanvas.A, GameCanvas.B);
    }

    public final void methodLoginScreen(mGraphics en2) {
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
            if (this.aY < 30 && this.aY >= 0 && GameCanvas.w % 4 == 0 || this.aY >= 30 && this.aY <= 50 && GameCanvas.w % 3 == 0 || this.aY > 50) {
                en2.LoginScreen(0xFFFFFF);
                en2.d(0, 0, GameCanvas.A, GameCanvas.B);
                if (this.aY > 50) {
                    if (this.ba) {
                        this.ba = false;
                        this.aY = 0;
                        if (this.bd) {
                            this.c(this.bf, this.bg);
                        } else {
                            GameScreen p2 = this;
                            this.Screen = false;
                            ei.LoginScreen(17);
                            if (p2.bc) {
                                p2.bc = false;
                                ei.LoginScreen(25);
                            }
                        }
                    }
                    this.e(en2);
                    en2.LoginScreen(-j, -k);
                    en2.LoginScreen(0, GameCanvas.ae);
                    Char.e().LoginScreen(en2);
                    Res.loadImageFromRMS(en2);
                    GameScreen.c(en2);
                    this.f(en2);
                    return;
                }
                return;
            }
        }
        GameCanvas.c(en2);
        if ((this.Screen || this.bR) && bv.o != 3) {
            GameScreen.b(en2);
        }
        if (bu > 0) {
            en2.LoginScreen(-j + eJ[bu % eJ.length], -k + eK[bu % eK.length]);
            --bu;
        } else {
            en2.LoginScreen(-j, -k);
        }
        if (this.Position) {
            n5 = GameCanvas.w % 3 == 0 ? 3 : -3;
            en2.LoginScreen(n5, 0);
        }
        WeatherEffect.c(en2);
        ei.LoginScreen(en2);
        bv.LoginScreen(en2);
        bv.b(en2);
        int n6 = 0;
        while (n6 < D.size()) {
            Char af2 = (Char)D.elementAt(n6);
            if (af2.ck && bv.Res == 128) {
                af2.b(en2, af2.B, af2.C, 0);
            }
            ++n6;
        }
        if (Char.e().ck && bv.Res == 128) {
            Char.e().b(en2, Char.e().B, Char.e().C, 0);
        }
        GameScreen.LoginScreen(en2, 2);
        if (Char.e().an != null && GameCanvas.e) {
            if (Screen.cs == 20) {
                en2.LoginScreen(dz, Char.e().an.j + j, Char.e().an.k + k, 3);
            } else {
                en2.LoginScreen(dy, Char.e().an.j + j, Char.e().an.k + k, 3);
            }
        }
        WeatherEffect.f(en2);
        dh.LoginScreen.LoginScreen(en2);
        n6 = 0;
        while (n6 < dc.B.size()) {
            dc dc2 = (dc)dc.B.elementAt(n6);
            dc2.LoginScreen(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < cn.LoginScreen.size()) {
            ((cn)cn.LoginScreen.elementAt(n6)).LoginScreen(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            _do do_ = (_do)G.elementAt(n6);
            if (do_.U > 0L) {
                do_.c(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            ((_do)G.elementAt(n6)).LoginScreen(en2);
            ++n6;
        }
        en2.LoginScreen(0, GameCanvas.ae);
        n6 = 0;
        while (n6 < D.size()) {
            Char af3 = null;
            try {
                af3 = (Char)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af3 == null || GameCanvas.G.LoginScreen && GameCanvas.G.F() || !af3.bd)) {
                af3.c(en2);
            }
            ++n6;
        }
        Char.e().c(en2);
        ei.b(en2);
        n6 = 0;
        while (n6 < F.size()) {
            ((Mob)F.elementAt(n6)).LoginScreen(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < cn.LoginScreen.size()) {
            ((cn)cn.LoginScreen.elementAt(n6)).b(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            Char af4 = null;
            try {
                af4 = (Char)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af4 == null || GameCanvas.G.LoginScreen && GameCanvas.G.F())) {
                af4.LoginScreen(en2);
            }
            ++n6;
        }
        Char.e().LoginScreen(en2);
        if (Char.e().cf != null && Char.e().D() != null && Char.e().cb < Char.e().D().length) {
            Char.e().d(en2);
            Char.e().b(en2);
        }
        n6 = 0;
        while (n6 < D.size()) {
            Char af5 = null;
            try {
                af5 = (Char)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af5 == null || GameCanvas.G.LoginScreen && GameCanvas.G.F() || af5.cf == null || af5.D() == null || af5.cb >= af5.D().length)) {
                af5.d(en2);
                af5.b(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < E.size()) {
            ((ItemMap)E.elementAt(n6)).LoginScreen(en2);
            ++n6;
        }
        en2.LoginScreen(0, -GameCanvas.ae);
        Object object2 = en2;
        int n7 = 0;
        while (n7 < 2) {
            if (fg[n7] != -1) {
                if (fi[n7] == 1) {
                    ((mGraphics)object2).LoginScreen(fj[fh[n7]], fe[n7], ff[n7], 3);
                } else {
                    ((mGraphics)object2).LoginScreen(fj[fh[n7]], 0, 0, mGraphics.LoginScreen(fj[fh[n7]]), mGraphics.b(fj[fh[n7]]), 2, fe[n7], ff[n7], 3);
                }
            }
            ++n7;
        }
        object2 = en2;
        n5 = 0;
        while (n5 < dc.x.size()) {
            object = (dc)dc.x.elementAt(n5);
            if (object != null && !(object instanceof ae)) {
                ((dc)object).LoginScreen((mGraphics)object2);
            }
            ++n5;
        }
        if (!GameCanvas.isLowGraphic) {
            n5 = 0;
            while (n5 < dc.A.size()) {
                object = (dc)dc.A.elementAt(n5);
                ((dc)object).LoginScreen((mGraphics)object2);
                ++n5;
            }
        }
        n5 = 0;
        while (n5 < dc.z.size()) {
            object = (dc)dc.z.elementAt(n5);
            ((dc)object).LoginScreen((mGraphics)object2);
            ++n5;
        }
        GameScreen.LoginScreen(en2, 3);
        n6 = 0;
        while (n6 < G.size()) {
            _do do_ = (_do)G.elementAt(n6);
            do_.e(en2);
            ++n6;
        }
        ei.c(en2);
        n6 = 0;
        while (n6 < G.size()) {
            _do do_ = (_do)G.elementAt(n6);
            if (do_ != null && do_.z != null) {
                do_.z.LoginScreen(en2, do_.B, do_.C - do_.al - GameCanvas.ae, do_.I);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            Char af6 = null;
            try {
                af6 = (Char)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (af6 != null && af6.z != null) {
                af6.z.LoginScreen(en2, af6.B, af6.C - af6.al, af6.I);
            }
            ++n6;
        }
        if (Char.e().z != null) {
            Char.e().z.LoginScreen(en2, Char.e().B, Char.e().C - Char.e().al, Char.e().I);
        }
        dh.c.LoginScreen(en2);
        dh.b.LoginScreen(en2);
        WeatherEffect.d(en2);
        int n8 = 0;
        while (n8 < bv.v.size()) {
            object = (cz)bv.v.elementAt(n8);
            if (((cz)object).c != -1 && ((cz)object).Item > 3) {
                ((cz)object).LoginScreen(en2);
            }
            ++n8;
        }
        bo.LoginScreen(en2);
        if (bv.Res == 120) {
            if (this.bS != 100) {
                n8 = this.bS * mGraphics.LoginScreen(dQ) / 100;
                en2.LoginScreen(dQ, bv.c / 2 - mGraphics.LoginScreen(dQ) / 2, 220, 0);
                en2.e(bv.c / 2 - mGraphics.LoginScreen(dQ) / 2, 220, n8, 10);
                en2.LoginScreen(dO, bv.c / 2 - mGraphics.LoginScreen(dQ) / 2, 220, 0);
                en2.e(0, 0, GameCanvas.A, GameCanvas.B);
            }
            if (this.bT) {
                ++this.bU;
                if (GameCanvas.w % 3 == 0) {
                    ea ea2 = new ea(19, ds.b(bv.c / 2 - 50, bv.c / 2 + 50), 340, 2, 1, -1);
                    ei.LoginScreen(ea2);
                }
                if (GameCanvas.w % 15 == 0) {
                    ea ea3 = new ea(18, ds.b(bv.c / 2 - 5, bv.c / 2 + 5), ds.b(300, 320), 2, 1, -1);
                    ei.LoginScreen(ea3);
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
        WeatherEffect.LoginScreen(en2);
        int n9 = 1;
        n6 = 0;
        while (n6 < WeatherEffect.LoginScreen.size()) {
            object = (WeatherEffect)WeatherEffect.LoginScreen.elementAt(n6);
            if (((WeatherEffect)object).b == 0) {
                n9 = 0;
                break;
            }
            ++n6;
        }
        if (mGraphics.b <= 1) {
            n9 = 0;
        }
        if (n9 != 0 && !this.Screen) {
            int n10 = bv.c / (mGraphics.LoginScreen(bv.A) + 50);
            if (n10 <= 0) {
                n10 = 1;
            }
            if (bv.e != 28) {
                n6 = 0;
                while (n6 < n10) {
                    n4 = 100 + n6 * (mGraphics.LoginScreen(bv.A) + 50) - j / 2;
                    if (n4 + (n9 = mGraphics.LoginScreen(bv.A)) >= j && n4 <= j + GameCanvas.A && -20 + mGraphics.b(bv.A) >= k && -20 <= k + GameCanvas.B) {
                        en2.LoginScreen(bv.A, 100 + n6 * (mGraphics.LoginScreen(bv.A) + 50) - j / 2, -20, 0);
                    }
                    ++n6;
                }
            }
        }
        Res.loadImageFromRMS(en2);
        object2 = en2;
        try {
            if (ae.m == null && (n9 = GameScreen.x()) != -1) {
                _do do_ = null;
                n4 = 0;
                while (n4 < G.size()) {
                    _do do_2 = (_do)G.elementAt(n4);
                    if (do_2.df.LoginScreen == n9) {
                        if (do_ == null) {
                            do_ = do_2;
                        } else if (ds.g(do_2.B - Char.e().B) < ds.g(do_.B - Char.e().B)) {
                            do_ = do_2;
                        }
                    }
                    ++n4;
                }
                if (do_ != null && do_.H != 15 && (do_.B <= j || do_.B >= j + d || do_.C <= k || do_.C >= k + e) && GameCanvas.w % 10 >= 5) {
                    n4 = do_.B - Char.e().B;
                    int n11 = do_.C - Char.e().C;
                    n9 = 0;
                    int n12 = 0;
                    n3 = 0;
                    if (n4 > 0 && n11 >= 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 >= 0 && n11 < 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (GameCanvas.e) {
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
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 <= 0 && n11 < 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (GameCanvas.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = 10;
                            n3 = 6;
                        }
                    }
                    GameScreen.c((mGraphics)object2);
                    ((mGraphics)object2).LoginScreen(bw, 0, 0, 13, 16, n3, n9, n12, cj.f);
                }
            }
        }
        catch (Exception exception) {}
        if (!LoginScreen && ImageLoader == 1 && !GameCanvas.G.LoginScreen) {
            this.e(en2);
        }
        GameScreen.c(en2);
        object2 = en2;
        ((mGraphics)object2).LoginScreen(0x808080);
        ((mGraphics)object2).d(0, GameCanvas.B - 2, GameCanvas.A, 2);
        n9 = (int)(Char.e().Z * (long)GameCanvas.A / 10000L);
        ((mGraphics)object2).LoginScreen(0xFFFFFF);
        ((mGraphics)object2).d(0, GameCanvas.B - 2, n9, 2);
        ((mGraphics)object2).LoginScreen(0);
        n9 = GameCanvas.A / 10;
        int n13 = 1;
        while (n13 < 10) {
            ((mGraphics)object2).d(n13 * n9, GameCanvas.B - 2, 1, 2);
            ++n13;
        }
        if (!LoginScreen) {
            if (GameCanvas.an && bv.Res != 170) {
                if (GameCanvas.A > 250) {
                    en2.LoginScreen(GameCanvas.ah, 160, 6, 0);
                    mFont.SessionReceiver.LoginScreen(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y ", 180, 2, 0);
                    mFont.SessionReceiver.LoginScreen(en2, "SessionReceiver\u1ebd \u1ea3nh Item\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn SessionReceiver\u1ee9c kh\u1ecfe.", 180, 12, 0);
                } else {
                    en2.LoginScreen(GameCanvas.ah, 5, GameCanvas.B - 67, 0);
                    mFont.SessionReceiver.LoginScreen(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y SessionReceiver\u1ebd \u1ea3nh Item\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn SessionReceiver\u1ee9c kh\u1ecfe.", 25, GameCanvas.B - 70, 0);
                }
            }
            en2.LoginScreen(-en2.LoginScreen(), -en2.b());
            if ((bv.Res == 128 || bv.Res == 127) && bW != 0) {
                en2.LoginScreen(0);
                en2.d(3, 88, 54, 8);
                en2.LoginScreen(0xFF0000);
                en2.e(5, 90, bW, 4);
                en2.d(5, 90, 50, 4);
                en2.e(0, 0, 3000, 3000);
                mFont.c.LoginScreen(en2, "Mabu", 30, 98, 2, mFont.f);
            }
            if (Char.e().cL) {
                ++Char.e().cM;
                if (GameCanvas.w % 3 == 0) {
                    en2.LoginScreen(0xFFFFFF);
                    en2.d(0, 0, GameCanvas.A, GameCanvas.B);
                }
                if (Char.e().cM >= 100) {
                    Char.e().U();
                }
            }
            int n14 = 0;
            while (n14 < D.size()) {
                Char af7 = null;
                try {
                    af7 = (Char)D.elementAt(n14);
                }
                catch (Exception exception) {}
                if (af7 != null && af7.cL && Char.LoginScreen(af7)) {
                    ++af7.cM;
                    if (GameCanvas.w % 3 == 0) {
                        en2.LoginScreen(0xFFFFFF);
                        en2.d(0, 0, GameCanvas.A, GameCanvas.B);
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
            if (GameCanvas.e && GameCanvas.clearKeyHold) {
                mGraphics en3 = en2;
                object2 = this;
                if (!((GameScreen)object2).N()) {
                    GameScreen.c(en3);
                    if (!bv.d() && !((GameScreen)object2).u()) {
                        if (Screen.cs == 15) {
                            en3.LoginScreen(dz, eN + 17, eO + 17, 3);
                        } else {
                            en3.LoginScreen(dy, eN + 17, eO + 17, 3);
                        }
                    }
                }
            }
            GameScreen.c(en2);
            mGraphics en4 = en2;
            object2 = this;
            if (ft.size() != 0 && bV) {
                en4.e(0, GameCanvas.B - 13, GameCanvas.A, 15);
                en4.LoginScreen(0, GameCanvas.B - 13, GameCanvas.A, 15, 0);
                String string = (String)ft.elementAt(0);
                mFont.e.LoginScreen(en4, string, ((GameScreen)object2).fC, GameCanvas.B - 12, 0);
            }
            if (!GameCanvas.G.LoginScreen && GameCanvas.K == null && ae.m == null && ae.n == null && GameCanvas.currentScreen.equals(c)) {
                super.LoginScreen(en2);
            }
            GameScreen.c(en2);
            int n15 = 100 + (Char.Session.size() != 0 ? bv.size() * 12 : 0);
            if (Char.e().ai != null) {
                n4 = 0;
                n3 = 0;
                int n16 = (GameCanvas.B - 100 - 60) / 12;
                n14 = 0;
                while (n14 < D.size()) {
                    Char af8 = (Char)D.elementAt(n14);
                    if (af8.ah != -1 && af8.ah == Char.e().ai.LoginScreen) {
                        if (af8.F() && af8.B < Char.e().B) {
                            int n17 = n16;
                            if (Char.Session.size() != 0) {
                                n17 -= bv.size();
                            }
                            if (n4 <= n17) {
                                mFont.r.LoginScreen(en2, af8.ag, 20, n15 - 12 + n4 * 12, 0, mFont.o);
                                af8.LoginScreen(en2, 10, n15 + n4 * 12 - 5);
                                ++n4;
                            }
                        } else if (af8.F() && af8.B > Char.e().B && n3 <= n16) {
                            mFont.r.LoginScreen(en2, af8.ag, GameCanvas.A - 25, n15 - 12 + n3 * 12, 1, mFont.o);
                            af8.LoginScreen(en2, GameCanvas.A - 15, n15 + n3 * 12 - 5);
                            ++n3;
                        }
                    }
                    ++n14;
                }
            }
            cq.b().LoginScreen(en2);
            if (aW && !GameCanvas.G.LoginScreen && GameCanvas.w % 4 == 0) {
                en2.LoginScreen(ItemMap.f, this.aR.j + 15, this.aR.k + 30, 33);
            }
            if (this.Position) {
                this.es += 5;
                if (this.ep >= 0) {
                    this.ep += this.es;
                }
                if (this.ep < 0) {
                    --this.ep;
                    if (this.ep == -20) {
                        this.Position = false;
                        this.ep = 0;
                        this.es = 0;
                    }
                } else if ((this.eq - this.ep > 0 || this.ep < bv.c) && this.ep > 0) {
                    en2.LoginScreen(0xFFFFFF);
                    if (!GameCanvas.isLowGraphic && Res.clientType != 3 && Res.clientType != 5) {
                        en2.LoginScreen(this.eq - this.ep, this.er - this.ep, 2 * this.ep, 2 * this.ep, 0, 360);
                    } else {
                        en2.d(0, 0, GameCanvas.A, GameCanvas.B);
                    }
                } else {
                    this.ep = -1;
                }
            }
            n14 = 0;
            while (n14 < Char.Session.size()) {
                n15 = 55;
                int n18 = this.aR.j + 32 + n14 * 24;
                en4 = en2;
                object2 = (cy)Char.Session.elementAt(n14);
                bl.b(en4, ((cy)object2).LoginScreen, n18, 55, 0, 3);
                String string = String.valueOf(((cy)object2).c) + "'";
                if (((cy)object2).c == 0) {
                    string = String.valueOf(((cy)object2).b) + "SessionReceiver";
                }
                mFont.c.LoginScreen(en4, string, n18, 70, 2, mFont.f);
                ++n14;
            }
            n14 = 0;
            while (n14 < bv.size()) {
                ((cy)bv.elementAt(n14)).LoginScreen(en2, this.aR.j + (Char.Session.size() != 0 ? 5 : 25), (Char.Session.size() != 0 ? 90 : 45) + n14 * 12);
                ++n14;
            }
            this.d(en2);
            if (T.fB == 1) {
                long l2;
                long l3 = l2 = Res.currentTimeMillis() - aS;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(l3 + 25200000L));
                n15 = calendar.get(11);
                int n19 = calendar.get(12);
                mFont.c.LoginScreen(en2, String.valueOf(n15) + "Item" + n19 + "m", 10, GameCanvas.B - 65, 0, mFont.f);
            }
            if (!this.fF.equals("")) {
                n14 = 0;
                while (n14 < this.fG.length) {
                    mFont.c.LoginScreen(en2, this.fG[n14], 5, 85 + n14 * 18, 0, mFont.f);
                    ++n14;
                }
            }
        }
        if ((n2 = GameCanvas.C) > 200) {
            n2 = 200;
        }
        GameScreen.LoginScreen(en2, 0 + GameCanvas.A / 2, 0, n2);
        dh.d.LoginScreen(en2);
        if (cb > Res.currentTimeMillis() && bv.Res == 170 && ItemMap && cd / 2 > 0) {
            try {
                this.LoginScreen(en2, 0 + GameCanvas.A / 2, 0);
            }
            catch (Exception exception) {}
        }
        if (bv.Res == 172) {
            String cfr_ignored_0 = String.valueOf(T.aB) + "  " + ci + "/" + cj;
            mFont.f.LoginScreen(en2, String.valueOf(T.aB) + "  " + ci + "/" + cj, GameCanvas.A - 10, 40, 1);
        }
    }

    private void d(mGraphics en2) {
        if (this.fB != 0) {
            String string = "";
            int n2 = 0;
            while (n2 < this.fu.length) {
                string = String.valueOf(string) + this.fv[n2] + " ";
                ++n2;
            }
            bo.LoginScreen(en2, 20, 45, 95, 35, 0xFFFFFF, false);
            mFont.f.LoginScreen(en2, T.m, 68, 50, 2);
            mFont.f.LoginScreen(en2, String.valueOf(string), 68, 65, 2);
        }
    }

    public static _do LoginScreen(short s2) {
        int n2 = 0;
        while (n2 < G.size()) {
            _do do_ = (_do)G.elementAt(n2);
            if (do_.df.LoginScreen == s2) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static Char b(int n2) {
        int n3 = 0;
        while (n3 < D.size()) {
            Char af2 = (Char)D.elementAt(n3);
            if (af2.J == n2) {
                return af2;
            }
            ++n3;
        }
        return null;
    }

    public static Mob c(int n2) {
        int n3 = 0;
        while (n3 < F.size()) {
            Mob aa2 = (Mob)F.elementAt(n3);
            if (aa2.Message == n2) {
                return aa2;
            }
            ++n3;
        }
        return null;
    }

    public static Mob LoginScreen(byte by2) {
        return (Mob)F.elementAt(by2);
    }

    public static _do SessionReceiver() {
        int n2 = 0;
        while (n2 < G.size()) {
            _do do_ = (_do)G.elementAt(n2);
            if (do_.df.LoginScreen == GameScreen.x()) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static void c(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, -200, GameCanvas.A, 200 + GameCanvas.B);
    }

    private void methodLoginScreen(mGraphics en2, Char af2) {
        int n2 = (int)(af2.U * fm / af2.V);
        int n3 = (int)(af2.T * (long)fl / af2.W);
        int n4 = (int)(this.bC * fm / af2.V);
        int n5 = (int)(this.bz * (long)fl / af2.W);
        en2.e(GameCanvas.A / 2 + 58 - mGraphics.LoginScreen(dM), 0, 95, 100);
        en2.b(dM, 0, 0, mGraphics.LoginScreen(dM), mGraphics.b(dM), 2, GameCanvas.A / 2 + 60, 0, 24);
        en2.e((int)((long)(GameCanvas.A / 2 + 60 - 83) - fm + fm - (long)n4), 5, n4, 10);
        en2.LoginScreen(dQ, GameCanvas.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e((int)((long)(GameCanvas.A / 2 + 60 - 83) - fm + fm - (long)n2), 5, n2, 10);
        en2.LoginScreen(dO, GameCanvas.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e((int)((long)(GameCanvas.A / 2 + 60 - 83 - fl) + fm - (long)n5), 20, n5, 6);
        en2.LoginScreen(aG, GameCanvas.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e((int)((long)(GameCanvas.A / 2 + 60 - 83 - fl) + fm - (long)n3), 20, n3, 6);
        en2.LoginScreen(aF, GameCanvas.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
    }

    /*
     * WARNING - void declaration
     */
    private void methodLoginScreen(mGraphics en2, boolean bl2, Char af2) {

        int n2;
        int n3;

        if (var3_6 == null) {
            return;
        }
        if (var3_6.J == Char.e().J) {
            int n4 = (int)(this.bC * fm / var3_6.V);
            n3 = (int)(this.bz * (long)fl / var3_6.W);
            n2 = (int)(var3_6.U * fm / var3_6.V);
        } else {
            int n5 = (int)(var3_6.cT * fm / var3_6.V);
            n3 = var3_6.cS * fl / 100;
            n2 = (int)(var3_6.U * fm / var3_6.V);
        }
        if (Char.e().bN > 0) {
            int n6 = Char.e().bL * fk / Char.e().bM;
            en2.LoginScreen(dN, 58, 29, 0);
            en2.e(83, 31, n6, 10);
            en2.LoginScreen(dP, 83, 31, 0);
            en2.e(0, 0, GameCanvas.A, GameCanvas.B);
            mFont.SessionReceiver.LoginScreen(en2, String.valueOf(Char.e().bK) + ":" + Char.e().bL + "/" + Char.e().bM, 115, 29, 2);
        }
        if (var3_6.J != Char.e().J) {
            en2.e(mGraphics.LoginScreen(dM) - 95, 0, 95, 100);
        }
        en2.LoginScreen(dM, 0, 0, 0);
        en2.e(83, 5, (int)var2_5, 10);
        en2.LoginScreen(dQ, 83, 5, 0);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e(83, 5, n2, 10);
        en2.LoginScreen(dO, 83, 5, 0);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e(83, 20, n3, 6);
        en2.LoginScreen(aG, 83, 20, 0);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        en2.e(83, 20, n3, 6);
        en2.LoginScreen(aF, 83, 20, 0);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (Char.e().T == 0L && GameCanvas.w % 10 > 5) {
            en2.e(83, 20, 2, 6);
            en2.LoginScreen(aG, 83, 20, 0);
            en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        }
    }

    public final void MyHashtable() {
        this.eX = this.eY = System.currentTimeMillis();
        this.eZ = 180;
    }

    private static Char L() {
        int n2 = 0;
        while (n2 < D.size()) {
            Char af2 = (Char)D.elementAt(n2);
            if (af2.aN != 0) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private Char M() {
        int n2 = 0;
        while (n2 < D.size()) {
            Char af2 = (Char)D.elementAt(n2);
            if (af2.aN != 0 && af2 != GameScreen.L()) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private void e(mGraphics en2) {
        if (Char.bI) {
            return;
        }
        GameScreen.c(en2);
        if (bv.Res == 130 && GameScreen.L() != null && this.M() != null) {
            en2.LoginScreen(GameCanvas.A / 2 - 62, 0);
            this.LoginScreen(en2, true, GameScreen.L());
            en2.LoginScreen(-(GameCanvas.A / 2 - 65), 0);
            this.LoginScreen(en2, this.M());
            GameScreen.L().b(en2, 137, 25, 0);
            this.M().b(en2, GameCanvas.A - 15 - 122, 25, 2);
        } else if (this.u() && Char.e().aU != null) {
            en2.LoginScreen(GameCanvas.A / 2 - 62, 0);
            this.LoginScreen(en2, true, Char.e().aU);
            en2.LoginScreen(-(GameCanvas.A / 2 - 65), 0);
            this.LoginScreen(en2, Char.e());
            Char.e().b(en2, 137, 25, 0);
            Char.e().aU.b(en2, GameCanvas.A - 15 - 122, 25, 2);
        } else if (GameScreen.O() && GameCanvas.A <= 320) {
            Char af2 = Char.e();
            boolean bl2 = true;
            bl2 = true;
            mGraphics en3 = en2;
            en3.LoginScreen(fM, 1, 1, 0);
            int n2 = fH.getWidth();
            int n3 = fH.getHeight() / 2;
            int n4 = (int)(af2.U * (long)n2 / af2.V);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.LoginScreen(fH, 0, n3, n4, n3, 0, 4, 20, 0);
            n4 = (int)(af2.T * (long)n2 / af2.W);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.LoginScreen(fH, 0, 0, n4, n3, 0, 4, 26, 0);
            n4 = 1 + fM.getWidth() / 2 + 1;
            mFont.m.LoginScreen(en3, af2.ag, n4, 5, 2);
            if (af2.aQ != null) {
                if (af2.aQ.z() != null) {
                    mFont.m.LoginScreen(en3, af2.aQ.z().e, n4, 33, 2);
                }
            } else if (af2.aT != null) {
                mFont.m.LoginScreen(en3, af2.aT.df.b, n4, 33, 2);
            } else if (af2.aU != null) {
                mFont.m.LoginScreen(en3, af2.aU.ag, n4, 33, 2);
            }
        } else {
            this.LoginScreen(en2, true, Char.e());
            if (Char.e().i() != null || Char.e().j() != null) {
                mFont.m.LoginScreen(en2, T.bx, this.fn / 2, 8, 2);
            } else if (Char.e().aQ != null) {
                if (Char.e().aQ.z() != null) {
                    mFont.m.LoginScreen(en2, Char.e().aQ.z().e, this.fn / 2, 9, 2);
                }
                if (Char.e().aQ.C != 0) {
                    mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen(Char.e().aQ.k)), this.fn / 2, 22, 2);
                }
            } else if (Char.e().aT != null) {
                mFont.m.LoginScreen(en2, Char.e().aT.df.b, this.fn / 2, 9, 2);
                if (Char.e().aT.df.LoginScreen == 4) {
                    mFont.m.LoginScreen(en2, String.valueOf(GameScreen.j().aM.b) + "/" + GameScreen.j().aM.d, this.fn / 2, 22, 2);
                }
            } else if (Char.e().aU != null) {
                mFont.m.LoginScreen(en2, Char.e().aU.ag, this.fn / 2, 9, 2);
                mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen(Char.e().aU.U)), this.fn / 2, 22, 2);
            } else {
                mFont.m.LoginScreen(en2, Char.e().ag, this.fn / 2, 9, 2);
                mFont.m.LoginScreen(en2, String.valueOf(ai.LoginScreen(Char.e().Message)), this.fn / 2, 22, 2);
            }
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        if (this.u() && this.eZ > 0) {
            this.eX = System.currentTimeMillis();
            if (this.eX - this.eY >= 1000L) {
                this.eY = System.currentTimeMillis();
                --this.eZ;
            }
            mFont.c.LoginScreen(en2, String.valueOf(this.eZ), GameCanvas.A / 2, 13, 2, mFont.f);
        }
        if (this.ez) {
            en2.LoginScreen(ItemMap.f, 40, 35, 33);
            --this.eA;
            if (this.eA < 0) {
                this.eA = 0;
                this.ez = false;
            }
        }
    }

    public final boolean u() {
        return bv.LoginScreen() && (Char.e().aN != 0 || bv.Res == 130 && GameScreen.L() != null && this.M() != null);
    }

    private void f(mGraphics en2) {
        if (this.aL != null) {
            mGraphics en3 = en2;
            GameScreen p2 = this;
            es.LoginScreen(en3, Char.e().B, Char.e().C);
            en3.LoginScreen(-en3.LoginScreen(), -en3.b());
            if (!GameCanvas.F.LoginScreen && !GameCanvas.G.LoginScreen && ae.m == null && GameCanvas.e) {
                int n2 = 0;
                while (n2 < p2.bm.length()) {
                    int n3 = (GameCanvas.A - p2.bm.length() * eI) / 2 + n2 * eI + eI / 2;
                    if (p2.bq[n2] == -1) {
                        en3.LoginScreen(bo, n3, GameCanvas.B - 25, 3);
                        mFont.f.LoginScreen(en3, String.valueOf(p2.bm.charAt(n2)), n3, GameCanvas.B - 30, 2);
                    } else {
                        en3.LoginScreen(bp, n3, GameCanvas.B - 25, 3);
                        mFont.g.LoginScreen(en3, String.valueOf(p2.bm.charAt(n2)), n3, GameCanvas.B - 30, 2);
                    }
                    ++n2;
                }
            }
            return;
        }
        if (GameCanvas.K != null || ae.m != null || GameCanvas.F.LoginScreen || GameCanvas.G.LoginScreen || Char.e().aD.c == 0 || cq.b().b || GameCanvas.currentScreen == LoginScreen.LoginScreen) {
            return;
        }
        long l2 = Res.currentTimeMillis();
        long l3 = l2 - this.SplashScreen;
        int n4 = 0;
        if (l3 < 10000L) {
            n4 = (int)(l3 * 20L / 10000L);
        }
        if (!GameCanvas.e) {
            en2.LoginScreen(Screen.cs == 10 ? RMS : au, eV + bx - 1, by - 1, 0);
            bl.b(en2, 542, eV + bx + 3, by + 3, 0, 0);
            mFont.u.LoginScreen(en2, "" + MyHashtable, eV + bx + 22, by + 15, 1);
            if (l3 < 10000L) {
                en2.LoginScreen(2721889);
                n4 = (int)(l3 * 20L / 10000L);
                en2.d(eV + bx + 3, by + 3 + n4, 20, 20 - n4);
            }
        } else if (Char.e().H != 14) {
            if (GameScreen.dS.b) {
                if (aO != 1) {
                    en2.LoginScreen(0x939090);
                    en2.d(bx + 9, by + 10 + 10, 22, 20);
                    en2.LoginScreen(0xFFFFFF);
                    en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) + 10, 22, n4 != 0 ? n4 : 20);
                    en2.LoginScreen(Screen.cs == 10 ? dD : dC, bx, by + 10, 0);
                    mFont.GameScreen.LoginScreen(en2, "" + MyHashtable, bx + 20, by + 15 + 10, 2);
                    if (ch) {
                        en2.LoginScreen(Screen.cs == 14 ? dJ : dI, bx + 5, by - 6 - 40 + 10, 0);
                    } else if (ck) {
                        en2.LoginScreen(Screen.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.b(en2, 1088, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.LoginScreen(Screen.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.b(en2, 1087, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    }
                } else if (aO == 1) {
                    en2.LoginScreen(Screen.cs == 10 ? RMS : au, eV + bx - 1, by - 1 + 10, 0);
                    bl.b(en2, 542, eV + bx + 3, by + 3 + 10, 0, 0);
                    mFont.u.LoginScreen(en2, "" + MyHashtable, eV + bx + 22, by + 13 + 10, 1);
                    if (l3 < 10000L) {
                        en2.LoginScreen(2721889);
                        n4 = (int)(l3 * 20L / 10000L);
                        en2.d(eV + bx + 3, by + 3 + n4 + 10, 20, 20 - n4);
                    }
                    if (ch) {
                        en2.LoginScreen(Screen.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    } else if (ck) {
                        en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.b(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.b(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    }
                }
            } else if (aO != 1) {
                en2.LoginScreen(0x939090);
                en2.d(bx + 9, by + 10 - 6, 22, 20);
                en2.LoginScreen(0xFFFFFF);
                en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6, 22, n4 != 0 ? n4 : 20);
                en2.LoginScreen(Screen.cs == 10 ? dD : dC, bx, by - 6, 0);
                mFont.GameScreen.LoginScreen(en2, "" + MyHashtable, bx + 20, by + 15 - 6, 2);
                if (ch) {
                    en2.LoginScreen(Screen.cs == 14 ? dJ : dI, bx, by - 6 - 40, 0);
                } else if (ck) {
                    en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.b(en2, 1088, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                } else if (cl) {
                    en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.b(en2, 1087, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                }
            } else {
                en2.LoginScreen(0x939090);
                en2.d(bx + 10, by + 10 - 6 + 10, 20, 18);
                en2.LoginScreen(0xFFFFFF);
                en2.d(bx + 10, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6 + 10, 20, n4 != 0 ? n4 : 18);
                en2.LoginScreen(Screen.cs == 10 ? dF : dE, bx + 20, by + 20 - 6 + 10, 3);
                mFont.GameScreen.LoginScreen(en2, "" + MyHashtable, bx + 20, by + 15 - 6 + 10, 2);
                if (ch) {
                    en2.LoginScreen(Screen.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                } else if (ck) {
                    en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.b(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                } else if (cl) {
                    en2.LoginScreen(Screen.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.b(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                }
            }
        }
        if (O) {
            bf[] bfArray;
            bf[] bfArray2 = bfArray = GameCanvas.e ? aQ : aP;
            if (!GameCanvas.e) {
                en2.LoginScreen(11152401);
                en2.d(eV + bx + 2, by - 10 + 6, 20, 10);
                mFont.SessionReceiver.LoginScreen(en2, "*", eV + bx + 12, by - 8 + 6, 2);
            }
            int n5 = GameCanvas.e ? this.ew : bfArray.length;
            int n6 = 0;
            while (n6 < n5) {
                bf bf2;
                if (!GameCanvas.e) {
                    String[] stringArray;
                    if (cd.g) {
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
                    en2.LoginScreen(11152401);
                    en2.d(eV + eT[n6] + 2, eU[n6] - 10 + 8, 20, 10);
                    mFont.SessionReceiver.LoginScreen(en2, stringArray4[n6], eV + eT[n6] + 12, eU[n6] - 10 + 6, 2);
                }
                if ((bf2 = bfArray[n6]) != Char.e().aC) {
                    en2.LoginScreen(au, eV + eT[n6] - 1, eU[n6] - 1, 0);
                }
                if (bf2 != null) {
                    if (bf2 == Char.e().aC) {
                        en2.LoginScreen(RMS, eV + eT[n6] - 1, eU[n6] - 1, 0);
                        if (GameCanvas.e) {
                            en2.LoginScreen(Mob.R, 0, 12, 9, 6, 0, eV + eT[n6] + 8, eU[n6] - 7, 0);
                        }
                    }
                    mGraphics en4 = en2;
                    int n7 = eU[n6] + 13;
                    int n8 = eV + eT[n6] + 13;
                    bl.b(en4, bf2.LoginScreen.f, n8, n7, 0, cj.f);
                    long l4 = System.currentTimeMillis();
                    long l5 = l4 - bf2.f;
                    if (l5 < (long)bf2.e) {
                        en4.LoginScreen(2721889);
                        if (bf2.j && GameCanvas.w % 6 > 2) {
                            en4.LoginScreen(876862);
                        }
                        int n9 = (int)(l5 * 20L / (long)bf2.e);
                        en4.d(n8 - 10, n7 - 10 + n9, 20, 20 - n9);
                    } else {
                        bf2.j = false;
                    }
                    if (n6 == this.ex && GameCanvas.w % 10 > 5 || n6 == this.eB) {
                        en2.LoginScreen(ItemMap.f, eV + eT[n6] + 13, eU[n6] + 14, 3);
                    }
                }
                ++n6;
            }
        }
        mGraphics en5 = en2;
        if (aO != 0 && Char.e().H != 14) {
            en5.LoginScreen(Screen.cs == 5 ? dH : dG, eP + 20, eQ + 20, 3);
            dS.LoginScreen(en5);
            en5.LoginScreen(Screen.cs == 13 ? dB : dA, eR + 20, eS + 20, 3);
        }
    }

    public static final void methodLoginScreen(String string, int n2, int n3, int n4, int n5, int n6) {
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
            if (bI[n7] != -1 && n4 != n7 && fc[n4] < 0 && ds.g(bG[n4] - bG[n7]) <= 20 && fa[n4] == fa[n7]) {
                int n8 = n4;
                fa[n8] = fa[n8] + 10;
            }
            ++n7;
        }
    }

    public static final boolean methodLoginScreen(int n2, int n3, int n4) {
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
        if (!GameCanvas.clearKeyHold && GameCanvas.currentScreen == GameScreen.j()) {
            return true;
        }
        if (!GameCanvas.e) {
            return true;
        }
        if (cq.b().b) {
            return true;
        }
        if (bp.LoginScreen) {
            return true;
        }
        return GameCanvas.K != null || ae.m != null || GameCanvas.F.LoginScreen || GameCanvas.G.LoginScreen;
        {
        }
    }

    public static void d(int n2, int n3) {
        if (GameCanvas.A == 128 || GameCanvas.B <= 208) {
            n2 = 126;
            n3 = 160;
        }
        bM = n2;
        bN = n3;
        bL = f - n2 / 2;
        bK = cz - n3 / 2;
        if (GameCanvas.e) {
            if (GameCanvas.B <= 240) {
                bK -= 10;
            }
            if (GameCanvas.e && !GameCanvas.resetKeys && GameCanvas.currentScreen instanceof GameScreen) {
                bM = 310;
                bL = d / 2 - bM / 2;
            }
        }
        if (bK < -10) {
            bK = -10;
        }
        if (GameCanvas.B > 208 && bK < 0) {
            bK = 0;
        }
        if (GameCanvas.B == 208 && bK < 10) {
            bK = 10;
        }
    }

    public static void v() {
        bv.e();
    }

    public static int w() {
        int n2 = Char.e().aD == null ? -1 : ad[Char.e().aD.LoginScreen];
        return n2;
    }

    public static byte x() {
        byte by2 = 0;
        if (Char.e().aD == null) {
            by2 = -1;
        } else if (Char.e().aD.LoginScreen <= MessageHandler.length - 1) {
            by2 = (byte)MessageHandler[Char.e().aD.LoginScreen];
        }
        return by2;
    }

    public final void methodLoginScreen(String string, String string2) {
        cq.b().b = false;
        if (string2.equals(T.cQ)) {
            if (GameScreen.aE.Item == Char.e().J) {
                return;
            }
            GameService.LoginScreen().LoginScreen(string, GameScreen.aE.Item);
            return;
        }
        if (string.equals("")) {
            return;
        }
        if (string.equals("pingABCD")) {
            GameService.LoginScreen().d();
            GameService.LoginScreen().e();
            boolean bl2 = bP = !bP;
        }
        if (string.equals("icon")) {
            boolean bl3 = ds.b = !ds.b;
        }
        if (string.equals("big")) {
            ds.c = !ds.c;
        }
        GameService.LoginScreen().b(string);
    }

    public final void D() {
    }

    public final void methodLoginScreen(Message y2) {
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
        GameCanvas.G.r();
        GameCanvas.G.SessionReceiver();
    }

    private void methodLoginScreen(String string, de de2, de de3) {
        this.bQ = new dz();
        this.bQ.LoginScreen(string, de2, de3);
    }

    public final void methodLoginScreen(int n2, String string, byte by2) {
        Char af2 = GameScreen.b(n2);
        if (af2 != null) {
            if (by2 == 3) {
                this.LoginScreen(string, new de(T.ServerListScreen, 2000, af2), new de(T.bj, 2009, af2));
            }
            if (by2 == 4) {
                this.LoginScreen(string, new de(T.ServerListScreen, 2005, af2), new de(T.bj, 2009, af2));
            }
        }
    }

    public final void d(int n2) {
        Char af2 = GameScreen.b(n2);
        if (af2 != null) {
            this.LoginScreen(String.valueOf(af2.ag) + T.eC, new de(T.ImageLoader, 11114, af2), new de(T.bo, 2009, af2));
        }
    }

    public static void methodLoginScreen(int n2, byte by2) {
        if (H.size() == 0) {
            GameService.LoginScreen().b((byte)2, by2);
            ds.c("getFlag1");
            return;
        }
        if (n2 == Char.e().J) {
            ds.c("my cflag: isme");
            Char.e();
            if (Char.LoginScreen(by2)) {
                ds.c("my cflag: true");
                int n3 = 0;
                while (n3 < H.size()) {
                    ep ep2 = (ep)H.elementAt(n3);
                    if (ep2 != null && ep2.LoginScreen == by2) {
                        ds.c("my cflag: cflag==");
                        Char.e().bz = ep2.b;
                    }
                    ++n3;
                }
                return;
            }
            Char.e();
            if (!Char.LoginScreen(by2)) {
                ds.c("my cflag: false");
                GameService.LoginScreen().b((byte)2, by2);
                return;
            }
        } else {
            ds.c("my cflag: not me");
            if (GameScreen.b(n2) != null) {
                GameScreen.b(n2);
                if (Char.LoginScreen(by2)) {
                    ds.c("my cflag: true");
                    int n4 = 0;
                    while (n4 < H.size()) {
                        ep ep3 = (ep)H.elementAt(n4);
                        if (ep3 != null && ep3.LoginScreen == by2) {
                            ds.c("my cflag: cflag==");
                            GameScreen.b((int)n2).bz = ep3.b;
                        }
                        ++n4;
                    }
                    return;
                }
                GameScreen.b(n2);
                if (!Char.LoginScreen(by2)) {
                    ds.c("my cflag: false");
                    GameService.LoginScreen().b((byte)2, by2);
                }
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void methodLoginScreen(int n2, Object object) {
        ds.c("PERFORM WITH ID = " + n2);
        int n3 = 0;
        block40: do {
            switch (n3 == 0 ? n2 : n3) {
                case 888351: {
                    GameService.LoginScreen().g((byte)5);
                    GameCanvas.instance();
                    return;
                }
                case 11112: {
                    Char af2 = (Char)object;
                    GameService.LoginScreen().LoginScreen((byte)1, af2.J);
                    return;
                }
                case 11113: {
                    Char af3 = (Char)object;
                    if (af3 == null) return;
                    GameService.LoginScreen().LoginScreen((byte)0, af3.J, (byte)-1, -1);
                    return;
                }
                case 11114: {
                    this.bQ = null;
                    Char af4 = (Char)object;
                    if (af4 == null) {
                        return;
                    }
                    GameService.LoginScreen().LoginScreen((byte)1, af4.J, (byte)-1, -1);
                    return;
                }
                case 11111: {
                    if (Char.e().aU == null) {
                        return;
                    }
                    bp.LoginScreen();
                    if (GameCanvas.G.S.size() <= 0) {
                        Char.e();
                        this.F();
                    }
                    GameCanvas.G.LoginScreen(Char.e().aU);
                    GameCanvas.G.SessionReceiver();
                    GameService.LoginScreen().c(Char.e().aU.J);
                    GameService.LoginScreen().Message(Char.e().aU.J);
                    return;
                }
                case 11115: {
                    if (Char.e().aU == null) {
                        return;
                    }
                    bp.LoginScreen();
                    GameService.LoginScreen().LoginScreen(Char.e().aU.J, (short)Char.e().aU.M);
                    return;
                }
                case 2000: {
                    this.bQ = null;
                    if ((Char)object == null) {
                        GameService.LoginScreen().LoginScreen((byte)1, (byte)3, -1);
                        return;
                    }
                    GameService.LoginScreen().LoginScreen((byte)1, (byte)3, ((Char)object).J);
                    GameService.LoginScreen().g();
                    return;
                }
                case 2001: {
                    GameCanvas.instance();
                    return;
                }
                case 2003: {
                    GameCanvas.instance();
                    bp.LoginScreen();
                    GameService.LoginScreen().LoginScreen((byte)0, (byte)3, Char.e().aU.J);
                    return;
                }
                case 2004: {
                    GameCanvas.instance();
                    GameService.LoginScreen().LoginScreen((byte)0, (byte)4, Char.e().aU.J);
                    return;
                }
                case 2005: {
                    GameCanvas.instance();
                    this.bQ = null;
                    if ((Char)object == null) {
                        GameService.LoginScreen().LoginScreen((byte)1, (byte)4, -1);
                        return;
                    }
                    GameService.LoginScreen().LoginScreen((byte)1, (byte)4, ((Char)object).J);
                    return;
                }
                case 2009: {
                    this.bQ = null;
                    return;
                }
                case 2006: {
                    GameCanvas.instance();
                    GameService.LoginScreen().LoginScreen((byte)2, (byte)4, Char.e().aU.J);
                    return;
                }
                case 2007: {
                    GameCanvas.instance();
                    n3 = 12006;
                    continue block40;
                }
                case 11038: {
                    MyVector el2 = new MyVector("");
                    el2.addElement(new de(T.aX[1], 110381));
                    el2.addElement(new de(T.aX[2], 110382));
                    el2.addElement(new de(T.aX[3], 110383));
                    GameCanvas.F.LoginScreen(el2);
                    return;
                }
                case 110382: {
                    GameService.LoginScreen().j();
                    return;
                }
                case 110383: {
                    GameService.LoginScreen().k();
                    return;
                }
                case 1: {
                    GameCanvas.instance();
                    return;
                }
                case 2: {
                    GameCanvas.F.LoginScreen = false;
                    return;
                }
                case 8002: {
                    this.LoginScreen(false, true);
                    GameCanvas.resetKeys();
                    GameCanvas.clearKeyHold();
                    return;
                }
                case 11057: {
                    dc.z.removeAllElements();
                    dc.x.removeAllElements();
                    _do do_ = (_do)object;
                    if (do_.dk == 0) {
                        GameService.LoginScreen().LoginScreen((short)do_.df.LoginScreen, (byte)GameCanvas.F.b);
                        return;
                    }
                    if (GameCanvas.F.b != 0) return;
                    GameService.LoginScreen().Res(do_.dk);
                    return;
                }
                case 11000: {
                    GameCanvas.G.q();
                    GameCanvas.G.SessionReceiver();
                    return;
                }
                case 11001: {
                    Char.e().J();
                    return;
                }
                case 11002: {
                    GameCanvas.G.A();
                    return;
                }
                case 11120: {
                    Object[] objectArray = (Object[])object;
                    object = (bf)objectArray[0];
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
                    bf bf2 = (bf)objectArray[0];
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
                    GameCanvas.G.q();
                    GameCanvas.G.SessionReceiver();
                    return;
                }
                case 110004: {
                    GameCanvas.F.LoginScreen = false;
                    return;
                }
                case 11067: {
                    if (bv.n != 0) {
                        GameService.LoginScreen().f(0);
                        bp.LoginScreen();
                        return;
                    }
                    aD.LoginScreen(T.aV, 0);
                    return;
                }
                case 11059: {
                    bf bf3 = aQ[this.ex];
                    this.b(bf3, false);
                    this.cn = null;
                    return;
                }
                case 12000: {
                    GameService.LoginScreen().LoginScreen((byte)1, -1, (String)null);
                    return;
                }
                case 12001: {
                    GameCanvas.instance();
                    return;
                }
                case 12002: {
                    GameCanvas.instance();
                    i i2 = (i)object;
                    GameService.LoginScreen().LoginScreen((byte)1, -1, i2.LoginScreen, i2.b);
                    this.bQ = null;
                    return;
                }
                case 12003: {
                    i i3 = (i)object;
                    GameCanvas.instance();
                    GameService.LoginScreen().LoginScreen((byte)2, -1, i3.LoginScreen, i3.b);
                    this.bQ = null;
                    return;
                }
                case 12004: {
                    bf bf4 = (bf)object;
                    this.b(bf4, true);
                    Char.e();
                    return;
                }
                case 110391: {
                    GameService.LoginScreen().LoginScreen((byte)0, Char.e().aU.J, -1, -1);
                    return;
                }
                case 12005: {
                    if (GameCanvas.al == null) {
                        GameCanvas.al = new eu();
                    }
                    GameCanvas.al.b();
                    GameCanvas.instance();
                    return;
                }
                case 12006: {
                    GameMidlet.f.LoginScreen();
                    return;
                }
            }
            return;
        } while (true);
    }

    public final void b(String string, String string2) {
        this.fu = new int[string.length()];
        this.fv = new int[string.length()];
        this.fw = new int[string.length()];
        this.fx = new int[string.length()];
        this.fy = new int[string.length()];
        int n2 = 0;
        while (n2 < string.length()) {
            this.fu[n2] = Short.parseShort(string.substring(n2, n2 + 1));
            this.fv[n2] = ds.b(0, 11);
            this.fw[n2] = 1;
            this.fy[n2] = 0;
            ++n2;
        }
        this.fB = 100;
        this.fz = 0;
        this.fA = string2;
        eE = eF = Res.currentTimeMillis();
    }

    public final void methodLoginScreen(String string) {
        if (!this.fE) {
            this.fD = mFont.e.LoginScreen(string);
            this.fC = GameCanvas.A;
            this.fE = true;
        }
        if (string.startsWith("!")) {
            string = string.substring(1, string.length());
            this.bR = true;
        }
        ft.addElement(string);
    }

    public final void b(String string) {
        this.fF = string;
        this.fG = mFont.k.LoginScreen(this.fF, 500);
    }

    private static boolean O() {
        return bv.c() && GameScreen.bY.LoginScreen == 0;
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        if (bY == null) {
            return;
        }
        if (!LoginScreen && ImageLoader == 1 && !GameCanvas.G.LoginScreen && GameScreen.O()) {
            int n5;
            int n6;
            if (n4 < GameScreen.fJ.LoginScreen + (GameScreen.fI.LoginScreen << 2)) {
                n4 = GameScreen.fJ.LoginScreen + (GameScreen.fI.LoginScreen << 2);
            }
            if (n2 > GameCanvas.A - n4 / 2) {
                n2 = GameCanvas.A - n4 / 2;
            }
            if (n2 < mGraphics.LoginScreen(fM) + n4 / 2 + 10) {
                n2 = mGraphics.LoginScreen(fM) + n4 / 2 + 10;
            }
            n3 = GameScreen.fI.b;
            int n7 = n3 + 0 + mGraphics.b(fL) / 2 + 2;
            int n8 = GameScreen.fJ.LoginScreen;
            int n9 = n4 / 2 - n8 / 2;
            n4 = n2 - n4 / 2;
            int n10 = n2 + n8 / 2;
            int n11 = n9 - GameScreen.fI.LoginScreen;
            int n12 = n11 / GameScreen.fI.LoginScreen;
            if (n11 % GameScreen.fI.LoginScreen > 0) {
                ++n12;
            }
            int n13 = 0;
            while (n13 < n12) {
                if (n13 < n12 - 1) {
                    fI.LoginScreen(1, n4 + GameScreen.fI.LoginScreen + n13 * GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                } else {
                    fI.LoginScreen(1, n4 + n11, 3, 0, 0, en2);
                }
                if (n13 < n12 - 1) {
                    fI.LoginScreen(1, n10 + n13 * GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                } else {
                    fI.LoginScreen(1, n10 + n11 - GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                }
                ++n13;
            }
            fI.LoginScreen(0, n4, 3, 2, 0, en2);
            fI.LoginScreen(0, n10 + n11, 3, 0, 0, en2);
            if (GameScreen.bY.c > 0) {
                n13 = 2;
                n6 = 3;
                if (GameScreen.bY.e == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = GameScreen.bY.c * n9 / GameScreen.bY.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n4 + n9 - n5, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.LoginScreen(n6, n4 + GameScreen.fI.LoginScreen + n5 * GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                    } else {
                        fI.LoginScreen(n6, n4 + n11, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.LoginScreen(n13, n4, 3, 2, 0, en2);
                GameCanvas.isLowGraphic(en2);
            }
            if (GameScreen.bY.d > 0) {
                n13 = 2;
                n6 = 3;
                if (GameScreen.bY.f == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = GameScreen.bY.d * n9 / GameScreen.bY.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n10, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.LoginScreen(n6, n10 + n5 * GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                    } else {
                        fI.LoginScreen(n6, n10 + n11 - GameScreen.fI.LoginScreen, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.LoginScreen(n13, n10 + n11, 3, 0, 0, en2);
                GameCanvas.isLowGraphic(en2);
            }
            fJ.LoginScreen(0, n2 - n8 / 2, 0, 0, 0, en2);
            String string = Res.loadImageFromRMS(GameScreen.bY.n, (int)GameScreen.bY.m, true, false);
            mFont.d.LoginScreen(en2, string, n2 + 1, 0 + GameScreen.fJ.b / 2 - mFont.g.LoginScreen() / 2, 2);
            g.b(GameScreen.bY.e, 1).b(en2, GameScreen.bY.j, n2 - 5, n7 + 5, 1, mFont.f);
            g.b(GameScreen.bY.f, 1).b(en2, GameScreen.bY.k, n2 + 5, n7 + 5, 0, mFont.f);
            if (GameScreen.bY.LoginScreen != 0) {
                n6 = 0 + n3 / 2 - 2;
                mFont.w.LoginScreen(en2, "" + GameScreen.bY.c, n4 + n9 / 2, n6, 2);
                mFont.w.LoginScreen(en2, "" + GameScreen.bY.d, n10 + n9 / 2, n6, 2);
            }
            en2.LoginScreen(fK, n2, 0 + GameScreen.fJ.b + 2, 3);
            if (GameScreen.bY.LoginScreen == 0) {
                GameScreen.LoginScreen(en2, GameScreen.bY.g, GameScreen.bY.Item, n2 - 13, GameScreen.bY.i, n2 + 13, n7);
            }
        }
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (fL != null) {
            int n8;
            int n9 = mGraphics.b(fL) / 2;
            int n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n3) {
                    n8 = 1;
                }
                en2.LoginScreen(fL, 0, n8 * n9, mGraphics.LoginScreen(fL), n9, 0, n4 - n10 * (n9 + 1), n7, 3);
                ++n10;
            }
            n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n5) {
                    n8 = 1;
                }
                en2.LoginScreen(fL, 0, n8 * n9, mGraphics.LoginScreen(fL), n9, 0, n6 + n10 * (n9 + 1), n7, 3);
                ++n10;
            }
        }
    }

    public static void methodLoginScreen(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bk[] bkArray) {
        ch ch2 = new ch(n2, n3, n4, n5, n6, n7, n8, s2, bkArray);
        GameScreen.LoginScreen(ch2);
    }

    public static void methodLoginScreen(int n2, int n3, int n4, Char af2, bk bk2, int n5, short s2, short s3) {
        ch ch2 = new ch(n2, n3, n4, af2.Z(), bk2, n5, s2, s3);
        GameScreen.LoginScreen(ch2);
    }

    private static void methodLoginScreen(ch ch2) {
        if (ch2.LoginScreen == 0) {
            dh.LoginScreen(ch2);
            return;
        }
        if (ch2.LoginScreen == 1) {
            dh.b(ch2);
            return;
        }
        if (ch2.LoginScreen == 2) {
            dh.c(ch2);
            return;
        }
        dh.d(ch2);
    }

    private void methodLoginScreen(mGraphics en2, int n2, int n3) {
        if (n2 > GameCanvas.A - 85) {
            n2 = GameCanvas.A - 85;
        }
        if (n2 < mGraphics.LoginScreen(fM) + 85 + 10) {
            n2 = mGraphics.LoginScreen(fM) + 85 + 10;
        }
        mGraphics.b(fL);
        n3 = GameScreen.fJ.LoginScreen;
        int n4 = 85 - n3 / 2;
        int n5 = n2 - 85 + 3;
        int n6 = n2 + n3 / 2;
        int n7 = (n4 -= GameScreen.fI.LoginScreen) / GameScreen.fI.LoginScreen;
        if (n4 % GameScreen.fI.LoginScreen > 0) {
            ++n7;
        }
        int n8 = 0;
        while (n8 < n7) {
            if (n8 < n7 - 1) {
                en2.b(dT, 0, 15, mGraphics.LoginScreen(dT), 15, 2, n5 + GameScreen.fI.LoginScreen + n8 * GameScreen.fI.LoginScreen, 3, 20);
            } else {
                en2.b(dT, 0, 15, mGraphics.LoginScreen(dT), 15, 2, n5 + n4, 3, 20);
            }
            if (n8 < n7 - 1) {
                en2.b(dT, 0, 15, mGraphics.LoginScreen(dT), 15, 2, n6 + n8 * GameScreen.fI.LoginScreen, 3, 20);
            } else {
                en2.b(dT, 0, 15, mGraphics.LoginScreen(dT), 15, 2, n6 + n4 - GameScreen.fI.LoginScreen, 3, 20);
            }
            ++n8;
        }
        fI.LoginScreen(0, n5, 3, 2, 0, en2);
        fI.LoginScreen(0, n6 + n4, 3, 0, 0, en2);
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
                    en2.b(dT, 0, 60, mGraphics.LoginScreen(dT), 15, 2, n5, 3, 20);
                } else {
                    en2.b(dT, 0, 75, mGraphics.LoginScreen(dT), 15, 2, n5 + n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        GameCanvas.isLowGraphic(en2);
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
                    en2.b(dT, 0, 30, mGraphics.LoginScreen(dT), 15, 0, n6 + n4, 3, 20);
                } else {
                    en2.b(dT, 0, 45, mGraphics.LoginScreen(dT), 15, 0, n6 + n4 - n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        GameCanvas.isLowGraphic(en2);
        fJ.LoginScreen(0, n2 - n3 / 2 + 1, 0, 0, 0, en2);
        String string = String.valueOf(ai.b((int)((cb - Res.currentTimeMillis()) / 1000L)));
        mFont.d.LoginScreen(en2, string, n5 + 85 - 2, 5, 2);
        mFont.o.LoginScreen(en2, "T\u1ea7ng " + cf, n5 + 85 - 3, 0 + GameScreen.fJ.b, 2);
        n4 = mFont.LoginScreen.LoginScreen(String.valueOf(ca));
        mFont.b.LoginScreen(en2, String.valueOf(ca), n2 - n3 / 2 - n4, 3 + GameScreen.fJ.b, 0);
        bl.b(en2, 2325, n2 - n3 / 2 - n4 - 15, 3 + GameScreen.fJ.b, 2, 20);
        n4 = mFont.LoginScreen.LoginScreen(String.valueOf(bZ));
        mFont.LoginScreen.LoginScreen(en2, String.valueOf(bZ), n2 + n3 / 2, 3 + GameScreen.fJ.b, 0);
        bl.b(en2, 2323, n2 + n3 / 2 + n4 + 3, 3 + GameScreen.fJ.b, 0, 20);
        mFont.f.LoginScreen("#01 AAAAAAAAAA");
        GameScreen.b(en2, 40);
        GameCanvas.isLowGraphic(en2);
    }

    private static void b(mGraphics en2, int n2) {
        String string = "#01 nnnnnnnnnnnn";
        int n3 = mFont.k.LoginScreen(string);
        n3 = GameCanvas.A - n3 - 20;
        int n4 = 0;
        while (n4 < fN) {
            mFont di2 = mFont.SessionReceiver;
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
            String[] stringArray = ds.LoginScreen((String)cg.elementAt(n4), "|", 0);
            int[] nArray = new int[2];
            nArray[1] = 18;
            int[] nArray2 = nArray;
            int n5 = 0;
            while (n5 < 2) {
                di2.LoginScreen(en2, stringArray[n5], n3 + nArray2[n5], 40 + n4 * mFont.k.LoginScreen(), 0, mFont.k);
                ++n5;
            }
            ++n4;
        }
        GameCanvas.isLowGraphic(en2);
        GameCanvas.isLowGraphic(en2);
    }
}

