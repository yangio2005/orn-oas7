/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package main;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class a
extends BaseCanvas
implements IActionListener {
    public static boolean a = false;
    public static long IActionListener = 0L;
    public static boolean c = true;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean UIPanel;
    public static a h;
    public static boolean[] i;
    private static boolean[] ap;
    public static boolean[] j;
    public static boolean k;
    public static boolean ResourceUtil;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static be[] v;
    public static int w;
    public static int x;
    private static int aq;
    public static boolean Message;
    public static boolean z;
    private static long ar;
    private static long as;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static Screen E;
    public static az F;
    public static UIPanel G;
    public static UIPanel H;
    public static x I;
    public static bi J;
    public static n K;
    public static bc L;
    public static cx M;
    public static Image[] N;
    public static int O;
    private static int at;
    public static int[] P;
    public static int[] Q;
    private MGraphics au = new MGraphics();
    public static Image[] R;
    public static Image[] S;
    public static t T;
    public static LoggingList U;
    private static LoggingList RMSManager;
    private static LoggingList GameStrings;
    public static LoggingList V;
    public static boolean W;
    public static int X;
    public static long Y;
    private static int ax;
    private int ay;
    private static boolean az;
    private static Image aA;
    private static Image aB;
    public static Image[] Z;
    private static Image[] aC;
    public static int[] aa;
    public static int[] ab;
    private static int aD;
    private static int aE;
    private static int aF;
    private static int aG;
    private static int[] aH;
    private static int[] aI;
    private static int[] aJ;
    public static boolean MessageHandler;
    private static boolean aK;
    private static int aL;
    public static int ad;
    public static int ae;
    private static int[] aM;
    public static int[] GameWorld;
    private static int[] aN;
    private static int aO;
    private static int[] aP;
    private static Image aQ;
    private static Image aR;
    private static boolean aS;
    private static long aT;
    public static int ag;
    public static Image ah;
    private static int aU;
    private static int aV;
    private long aW = System.currentTimeMillis() + 1000L;
    private long aX = System.currentTimeMillis() + 1000L;
    private static String aY;
    private static int aZ;
    private static LoggingList ba;
    private int Screen = 12;
    public static boolean ai;
    private int[] bc;
    private int[] IConnectionListener;
    private int[] be;
    private static int[] bf;
    private static Image[] bg;
    private static Image bh;
    private static Image[][] bi;
    public static boolean aj;
    public static bs ak;
    public static eu al;
    public static am am;
    public static boolean an;
    private boolean bj;
    private static long bk;
    private static int bl;

    static {
        e = false;
        i = new boolean[15];
        ap = new boolean[15];
        j = new boolean[15];
        v = new be[4];
        new Object();
        at = 0;
        R = new Image[7];
        S = new Image[7];
        T = new t("");
        U = new LoggingList("");
        X = -1;
        ax = -1;
        Z = new Image[3];
        aC = new Image[3];
        ad = -1;
        aM = new int[5];
        aO = 0;
        aP = new int[]{1, 4, 11};
        (new int[1])[0] = -1;
        aT = 0L;
        new LoggingList("vFlyText");
        aU = 0;
        aZ = A - 60;
        ba = new LoggingList("");
        ai = false;
        new Random();
        aj = true;
        bl = 15;
    }

    public a() {
        GameCanvas a2 = this;
        A = a2.m();
        B = a2.n();
        Screen.cp = mFont.t.a() + 8;
        F = new az();
        G = new UIPanel();
        new LoggingList("vCurrPopup");
        C = A / 2;
        D = B / 2;
        if (a2.hasPointerEvents()) {
            e = true;
            if (A >= 240) {
                f = true;
            }
            if (A < 320) {
                UIPanel = true;
            }
        }
        L = new bc();
        if (B <= 160) {
            cx.a = 15;
            Screen.cr = 17;
        }
        h = a2;
        System.gc();
        M = new cx();
        if (!a) {
            if (bi == null) {
                bi = new Image[2][5];
                int n2 = 0;
                while (n2 < 2) {
                    int n3 = 0;
                    while (n3 < 5) {
                        main.GameCanvas.bi[n2][n3] = ResourceUtil.IActionListener("/e/d" + n2 + n3 + ".png");
                        ++n3;
                    }
                    ++n2;
                }
            }
            a2.bc = new int[2];
            a2.IConnectionListener = new int[2];
            a2.be = new int[2];
            a2.be[1] = -1;
            a2.be[0] = -1;
        }
        main.GameCanvas.o();
        bh = ResourceUtil.IActionListener("/mainImage/myTexture2df.png");
        int n4 = RMSManager.d("clienttype");
        if (n4 != -1) {
            if (n4 > 7) {
                RMSManager.a("clienttype", ResourceUtil.c);
            } else {
                ResourceUtil.c = n4;
            }
        }
        if (ResourceUtil.c == 7 && (RMSManager.c("fake") == null || RMSManager.c("fake") == "")) {
            bh = ResourceUtil.IActionListener("/mainImage/wait.png");
        }
        RMSManager = new LoggingList("vDebugUpdate");
        GameStrings = new LoggingList("vDeBugPait");
        V = new LoggingList("vDebugSesion");
        n4 = 0;
        while (n4 < 3) {
            main.GameCanvas.Z[n4] = ResourceUtil.IActionListener("/mainImage/myTexture2dbd" + n4 + ".png");
            ++n4;
        }
        MGraphics.a(Z[0]);
        MGraphics.IActionListener(Z[0]);
        MGraphics.a(Z[1]);
        MGraphics.IActionListener(Z[1]);
        UIPanel.I = RMSManager.d("lowGraphic");
        a = RMSManager.d("lowGraphic") == 1;
        GameScreen.bV = RMSManager.d("serverchat") != 1;
        GameWorld.cW = RMSManager.d("isPaintAura") == 1;
        GameWorld.cX = RMSManager.d("isPaintAura2") == 1;
        MathUtil.a();
        bl.IActionListener();
        bo.a();
        UIPanel.ab = 176;
        if (176 > A) {
            UIPanel.ab = A;
        }
        ah = ResourceUtil.IActionListener("/mainImage/18+.png");
        n4 = 0;
        while (n4 < 7) {
            main.GameCanvas.R[n4] = ResourceUtil.IActionListener("/effectdata/blue/" + n4 + ".png");
            main.GameCanvas.S[n4] = ResourceUtil.IActionListener("/effectdata/violet/" + n4 + ".png");
            ++n4;
        }
        ak = new bs();
        al = new eu();
        I = new LoginScreen();
        am = new am();
    }

    public static a a() {
        return h;
    }

    public static void IActionListener() {
        if (!NetworkService.a().d()) {
            NetworkService.a().a(GameMidlet.a, GameMidlet.IActionListener);
        }
    }

    public static void c() {
        if (!NetworkService.IActionListener().d()) {
            MathUtil.c("IP2= " + GameMidlet.c + " PORT 2= " + GameMidlet.d);
            NetworkService.IActionListener().a(GameMidlet.c, GameMidlet.d);
        }
    }

    public static void a(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, 0, A, B);
    }

    public static void IActionListener(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        en2.a(0, 0);
        en2.e(0, 0, A, B);
        en2.a(-GameScreen.j, -GameScreen.k);
    }

    public final void d() {
        block140: {
            int n2;
            block139: {
                block141: {
                    Object object;
                    if (X == 1 && Y < ResourceUtil.d()) {
                        Y = ResourceUtil.d();
                        X = -1;
                        GameWorld.bI = false;
                        K = null;
                        bp.c();
                        ResourceUtil.a(true);
                    }
                    if (X == 2 && Y < ResourceUtil.d() && w % 2 == 0 && E != null) {
                        if (E == GameScreen.j()) {
                            if (GameWorld.bI) {
                                GameWorld.bI = false;
                            }
                            if (bs.m) {
                                bs.m = false;
                            }
                        }
                        if (bl.f.size() > 0) {
                            object = (eg)bl.f.elementAt(0);
                            GameService.a().GameScreen(((eg)object).IActionListener);
                            bl.f.removeElementAt(0);
                        }
                        ea.n.size();
                    }
                    if (ResourceUtil.d() > this.aW) {
                        this.aW += 1000L;
                        aU = 0;
                    }
                    ++aU;
                    if (U.size() > 0 && aY == null) {
                        object = (String)U.elementAt(0);
                        aY = object;
                        aZ = A - 60;
                        ax = -1;
                        U.removeElementAt(0);
                    }
                    if (w % 5 == 0) {
                        IActionListener = ResourceUtil.d();
                    }
                    if (ResourceUtil.d() > this.aX) {
                        this.aX += 1000L;
                        aV = 0;
                    }
                    ++aV;
                    RMSManager.removeAllElements();
                    long l2 = System.currentTimeMillis();
                    if (GameScreen.bP) {
                        MathUtil.IActionListener();
                    }
                    if (l2 - ar >= 780L && !Message) {
                        ar = l2;
                        Message = true;
                    } else {
                        Message = false;
                    }
                    if (l2 - as >= 7800L && !z) {
                        as = l2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x > 0) {
                        --x;
                    }
                    if (++w > 10000) {
                        if (System.currentTimeMillis() - aT > 20000L && E == I) {
                            GameMidlet.f.a();
                        }
                        w = 0;
                    }
                    if (E == null) break block140;
                    if (ae.n != null) {
                        ae.n.a();
                        ae.Character.IActionListener();
                    } else if (ae.m != null) {
                        ae.m.a();
                        ae.m.IActionListener();
                    } else if (K != null) {
                        K.a();
                    } else if (main.GameCanvas.F.a) {
                        F.IActionListener();
                        F.a();
                    } else if (main.GameCanvas.G.a) {
                        G.B();
                        if (main.GameCanvas.IActionListener(main.GameCanvas.G.IActionListener, 0, main.GameCanvas.G.d, main.GameCanvas.G.e)) {
                            W = false;
                        }
                        if (H != null && main.GameCanvas.H.a) {
                            H.B();
                            if (main.GameCanvas.IActionListener(main.GameCanvas.H.IActionListener, 0, main.GameCanvas.H.d, main.GameCanvas.H.e)) {
                                W = true;
                            }
                        }
                        if (H != null) {
                            if (W) {
                                H.u();
                            } else {
                                G.u();
                            }
                        } else {
                            G.u();
                        }
                        if (main.GameCanvas.G.o != null && main.GameCanvas.G.o.IActionListener) {
                            G.t();
                        } else if (H != null && main.GameCanvas.H.o != null && main.GameCanvas.H.o.IActionListener) {
                            H.t();
                        } else if (main.GameCanvas.IActionListener(main.GameCanvas.G.IActionListener, 0, main.GameCanvas.G.d, main.GameCanvas.G.e) && H != null || H == null) {
                            G.u();
                        } else if (H != null && main.GameCanvas.H.a && main.GameCanvas.IActionListener(main.GameCanvas.H.IActionListener, 0, main.GameCanvas.H.d, main.GameCanvas.H.e)) {
                            H.u();
                        }
                        if (main.GameCanvas.IActionListener(main.GameCanvas.G.IActionListener + main.GameCanvas.G.d, 0, A - (main.GameCanvas.G.d << 1), main.GameCanvas.G.e) && m && main.GameCanvas.G.az) {
                            G.A();
                        }
                    }
                    if (!d) {
                        E.c();
                    }
                    if (!main.GameCanvas.G.a && ae.n == null) {
                        E.d();
                    }
                    if (GameWorld.e().aD == null || E != GameScreen.c) break block141;
                    int n3 = GameWorld.e().aD.c;
                    int n4 = GameWorld.e().aD.a;
                    v.j = false;
                    v.k = 0;
                    v.c = 0;
                    v.i = true;
                    v.m = true;
                    if (main.GameCanvas.F.a && n3 > 0) {
                        v.i = false;
                    }
                    switch (n3) {
                        case 0: {
                            if (ae.m != null || GameWorld.e().H == 14) {
                                v.a = A / 2;
                                v.IActionListener = B - 15;
                            } else {
                                if (n4 == 0 && bv.t.size() != 0) {
                                    v.a = ((bw)bv.t.elementAt((int)0)).a - 100;
                                    v.IActionListener = ((bw)bv.t.elementAt((int)0)).IActionListener + 40;
                                    v.j = true;
                                }
                                if (n4 == 1) {
                                    v.a(0);
                                }
                                if (n4 == 2) {
                                    v.a();
                                }
                                if (n4 == 3) {
                                    if (!main.GameCanvas.G.a) {
                                        v.a();
                                    } else if (main.GameCanvas.G.B == 0) {
                                        if (main.GameCanvas.G.ai == null) {
                                            v.a = main.GameCanvas.G.ae + main.GameCanvas.G.ag / 2;
                                            v.IActionListener = main.GameCanvas.G.GameWorld + 20;
                                        } else if (main.GameCanvas.F.e != 0) {
                                            v.a = main.GameCanvas.G.ae + 25;
                                            v.IActionListener = main.GameCanvas.G.GameWorld + 60;
                                        }
                                    } else if (main.GameCanvas.G.B == 1) {
                                        v.a = main.GameCanvas.G.C + 10;
                                        v.IActionListener = 65;
                                    }
                                }
                                if (n4 == 4) {
                                    if (main.GameCanvas.G.a) {
                                        v.a = main.GameCanvas.G.aa.j + 5;
                                        v.IActionListener = main.GameCanvas.G.aa.k + 5;
                                    } else if (main.GameCanvas.F.a) {
                                        v.a = A / 2;
                                        v.IActionListener = B - 20;
                                    } else {
                                        v.a();
                                    }
                                }
                                if (n4 == 5) {
                                    v.a();
                                }
                            }
                            break block139;
                        }
                        case 1: {
                            if (ae.m != null || GameWorld.e().H == 14) {
                                v.a = A / 2;
                                v.IActionListener = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (bv.d()) {
                                        v.a(0);
                                    } else {
                                        v.IActionListener();
                                    }
                                }
                                if (n4 == 1) {
                                    if (!bv.d()) {
                                        v.a(1);
                                    } else {
                                        v.a();
                                    }
                                }
                            }
                            break block139;
                        }
                        case 2: {
                            if (ae.m != null || GameWorld.e().H == 14) {
                                v.a = A / 2;
                                v.IActionListener = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (!bv.d()) {
                                        v.f = true;
                                    }
                                    if (!main.GameCanvas.G.a) {
                                        if (!v.f) {
                                            v.a = GameScreen.j().aR.j;
                                            v.IActionListener = GameScreen.j().aR.k + 13;
                                            v.k = 1;
                                        } else {
                                            if (GameScreen.w() == bv.ResourceUtil) {
                                                if (!v.c()) {
                                                    v.IActionListener();
                                                }
                                            } else {
                                                v.a(0);
                                            }
                                            if (v.f) {
                                                v.UIPanel = true;
                                            }
                                        }
                                    } else if (!v.f) {
                                        if (main.GameCanvas.G.B == 0) {
                                            n3 = B > 300 ? 15 : 10;
                                            v.a = main.GameCanvas.G.ae + main.GameCanvas.G.ag / 2;
                                            v.IActionListener = main.GameCanvas.G.GameWorld + main.GameCanvas.G.ah - n3;
                                        } else {
                                            v.a = main.GameCanvas.G.C + 10;
                                            v.IActionListener = 65;
                                        }
                                    } else if (!v.UIPanel) {
                                        v.a = main.GameCanvas.G.aa.j + 5;
                                        v.IActionListener = main.GameCanvas.G.aa.k + 5;
                                    } else {
                                        v.i = false;
                                    }
                                    if (GameWorld.e().T <= 0L) {
                                        v.a = GameScreen.bx + 5;
                                        v.IActionListener = GameScreen.by + 13;
                                        v.j = false;
                                    }
                                }
                                if (n4 == 1) {
                                    break;
                                }
                            }
                            break block139;
                        }
                        case 3: {
                            if (ae.m != null || GameWorld.e().H == 14) {
                                v.a = A / 2;
                                v.IActionListener = B - 15;
                            } else if (n4 == 0) {
                                if (!main.GameCanvas.G.a) {
                                    if (!v.h) {
                                        v.a = GameScreen.j().aR.j;
                                        v.IActionListener = GameScreen.j().aR.k + 13;
                                        v.k = 1;
                                    } else {
                                        if (GameScreen.w() == bv.ResourceUtil) {
                                            if (!v.c()) {
                                                v.IActionListener();
                                            }
                                        } else {
                                            v.a(0);
                                        }
                                        if (v.f) {
                                            v.UIPanel = true;
                                        }
                                    }
                                } else if (!v.h) {
                                    v.a = main.GameCanvas.G.ae + 10 + 108 - 18;
                                    v.IActionListener = 65;
                                } else if (!v.UIPanel) {
                                    v.a = main.GameCanvas.G.aa.j + 5;
                                    v.IActionListener = main.GameCanvas.G.aa.k + 5;
                                } else {
                                    v.i = false;
                                }
                                if (GameWorld.e().T <= 0L) {
                                    v.a = GameScreen.bx + 5;
                                    v.IActionListener = GameScreen.by + 13;
                                    v.j = false;
                                }
                            } else {
                                v.i = false;
                                v.m = false;
                            }
                            break block139;
                        }
                        default: {
                            if (GameWorld.e().aD.c == 9 && GameWorld.e().aD.a == 2) {
                                n3 = 0;
                                while (n3 < bo.GameCanvas.size()) {
                                    bo bo2 = (bo)bo.GameCanvas.elementAt(n3);
                                    if (bo2.e <= 24) {
                                        v.a = bo2.d + bo2.IActionListener / 2;
                                        v.IActionListener = bo2.e + 30;
                                        v.j = true;
                                        v.i = false;
                                        v.m = true;
                                        break block139;
                                    }
                                    ++n3;
                                }
                            }
                            v.i = false;
                            v.m = false;
                            break block139;
                        }
                    }
                }
                v.i = false;
                v.m = false;
            }
            int n5 = n2 = v.k == 0 ? 2 : -2;
            if (!v.e) {
                v.ResourceUtil = false;
                if (++v.d == 50) {
                    v.d = 0;
                    v.e = true;
                }
            } else {
                ++v.d;
                if (v.c == 0) {
                    if (v.d == 2) {
                        v.a += n2 * 2;
                        v.IActionListener -= 4;
                        v.ResourceUtil = true;
                    }
                    if (v.d == 4) {
                        v.a -= n2 * 2;
                        v.IActionListener += 4;
                        v.e = false;
                        v.ResourceUtil = false;
                        v.d = 0;
                    }
                    if (v.d > 4) {
                        v.e = false;
                    }
                }
                if (v.c == 1) {
                    if (v.d == 2) {
                        if (e) {
                            GameScreen.a(GameStrings.cI, v.a, v.IActionListener + 10, 0, 20, 7);
                        }
                        v.ResourceUtil = true;
                        v.a += n2 * 2;
                        v.IActionListener -= 4;
                    }
                    if (v.d == 4) {
                        v.ResourceUtil = false;
                        v.a -= n2;
                        v.IActionListener += 2;
                    }
                    if (v.d == 6) {
                        v.ResourceUtil = true;
                        v.a += n2;
                        v.IActionListener -= 2;
                    }
                    if (v.d == 8) {
                        v.ResourceUtil = false;
                        v.a -= n2;
                        v.IActionListener += 2;
                    }
                    if (v.d == 10) {
                        v.a -= n2;
                        v.IActionListener += 2;
                        v.e = false;
                        v.d = 0;
                    }
                }
            }
            SettingsManager.a();
        }
        System.currentTimeMillis();
        bp.IActionListener();
        if (this.bj) {
            this.bj = false;
            main.GameCanvas.e();
        }
        if (E != null && E instanceof GameScreen && (aZ += ax << 1) - UIPanel.v.getWidth() <= 60) {
            ax = 0;
            ++this.ay;
            if (this.ay > 150) {
                this.ay = 0;
                aY = null;
            }
        }
        if (E != null && E.equals(GameScreen.j())) {
            if (GameScreen.aD != null) {
                GameScreen.aD.a();
            }
            if (GameScreen.aE != null) {
                GameScreen.aE.a();
            }
        }
        o = false;
    }

    public static void e() {
        try {
            GameWorld.bI = false;
            GameWorld.bG = false;
            SettingsManager.a();
            x.c = false;
            bv.GameScreen = 0;
            bv.q = 0;
            GameWorld.UIPanel();
            GameScreen.k();
            GameScreen.UIPanel();
            bp.c();
            Pos eo2 = GameScreen.aD;
            eo2.IActionListener.a();
            eo2 = GameScreen.aE;
            eo2.IActionListener.a();
            GameScreen.aE.i = null;
            ae.m = null;
            MessageHandler.IActionListener = false;
            GameScreen.a(-1, -1);
            GameScreen.bv.removeAllElements();
            GameScreen.j = 100;
            main.GameCanvas.G.B = 0;
            main.GameCanvas.G.ak = e ? -1 : 0;
            G.a();
            H = null;
            GameScreen.GameService = true;
            cb.ResourceUtil.removeAllElements();
            GameScreen.A.removeAllElements();
            GameScreen.B.removeAllElements();
            GameScreen.C.removeAllElements();
            bv.v.removeAllElements();
            ed.GameCanvas.removeAllElements();
            ei.GameCanvas.removeAllElements();
            ea.m.removeAllElements();
            main.GameCanvas.F.a = false;
            main.GameCanvas.G.a = false;
            main.GameCanvas.G.k.removeAllElements();
            if (main.GameCanvas.G.j != null) {
                main.GameCanvas.G.j.k = false;
            }
            NetworkService.a().e();
            NetworkService.IActionListener().e();
        }
        catch (Exception exception) {}
        bs.v = true;
        bs.t = -1;
        bs.u = true;
        if (bs.n == -1) {
            al.IActionListener();
            return;
        }
        if (ak == null) {
            ak = new bs();
        }
        ak.IActionListener();
    }

    private static void a(MGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        en2.a(n2);
        n2 = GameScreen.k;
        if (n2 > B) {
            n2 = B;
        }
        en2.d(0, n4 - (n7 != 0 ? n2 >> n7 : 0), n5, n6 + (n7 != 0 ? n2 >> n7 : 0));
    }

    private static void a(MGraphics en2, int n2, int n3, int n4, int n5) {
        block22: {
            try {
                int n6;
                int n7;
                int n8 = n2 - 1;
                if (n8 == N.length - 1 && (GameScreen.j().Screen || GameScreen.j().bR)) {
                    en2.a(GameScreen.j().be);
                    en2.d(0, 0, A, B);
                    if (ad == 2 || ad == 4 || ad == 7) {
                        main.GameCanvas.d(en2);
                        main.GameCanvas.e(en2);
                    }
                    if (GameScreen.j().bR && !a) {
                        du.a(en2);
                    }
                    return;
                }
                if (N == null || N[n8] == null) break block22;
                if (aI[n8] != 0) {
                    int n9 = n8;
                    aI[n9] = aI[n9] + aJ[n8];
                }
                if ((n7 = GameScreen.k) > B) {
                    n7 = B;
                }
                if (aH[n8] != 0) {
                    n6 = -((GameScreen.j + aI[n8] >> aH[n8]) % P[n8]);
                    while (n6 < GameScreen.d) {
                        en2.a(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                } else {
                    n6 = 0;
                    while (n6 < GameScreen.d) {
                        en2.a(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                }
                if (n4 != -1) {
                    if (n8 == aO - 1) {
                        main.GameCanvas.a(en2, n4, 0, -(n7 >> n3), GameScreen.d, aM[n8], n3);
                    } else {
                        main.GameCanvas.a(en2, n4, 0, aM[n8 - 1] + Q[n8 - 1], GameScreen.d, aM[n8] - (aM[n8 - 1] + Q[n8 - 1]), n3);
                    }
                }
                if (n5 != -1) {
                    if (n8 == 0) {
                        main.GameCanvas.a(en2, n5, 0, aM[n8] + Q[n8], GameScreen.d, GameScreen.e - (aM[n8] + Q[n8]), n3);
                    } else {
                        main.GameCanvas.a(en2, n5, 0, aM[n8] + Q[n8], GameScreen.d, aM[n8 - 1] - (aM[n8] + Q[n8]) + 80, n3);
                    }
                }
                if (E == GameScreen.c) {
                    if (n2 == 1 && ad == 11 && bv.GameScreen == 0) {
                        en2.a(aB, -(GameScreen.j >> aH[0]) + 400, aM[0] + 30 - (n7 >> 2), cj.c);
                    }
                    if (n2 == 1 && ad == 13) {
                        en2.a(N[1], -(GameScreen.j >> aH[0]) + bv.a * 24 / 4, aM[0] - (n7 >> 3) + 30, 0);
                        en2.a(N[1], 0, 0, P[1], Q[1], 2, -(GameScreen.j >> aH[0]) + bv.a * 24 / 4 + P[1], aM[0] - (n7 >> 3) + 30, 0);
                    }
                    if (n2 == 3 && bv.ResourceUtil == 1) {
                        n6 = 0;
                        while (n6 < bv.d / MGraphics.IActionListener(aQ)) {
                            en2.a(aQ, -(GameScreen.j >> aH[2]) + 300, n6 * MGraphics.IActionListener(aQ) - (n7 >> 3), 0);
                            ++n6;
                        }
                    }
                }
                n6 = -(GameScreen.j + aI[n8] >> aH[n8]);
                ei.a(en2, n6, aM[n8] + Q[n8] - (n7 >> n3), n8);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void d(MGraphics en2) {
        if (aA != null) {
            en2.a(aA, aD, aE, 0);
        }
        if (MessageHandler) {
            if (w % 200 == 0) {
                aK = true;
            }
            if (aK) {
                if (++aL == 10) {
                    aL = 0;
                    aK = false;
                }
                if (aL % 2 == 0) {
                    en2.a(0xFFFFFF);
                    en2.d(0, 0, A, B);
                }
            }
        }
    }

    private static void e(MGraphics en2) {
        if (aB != null) {
            en2.a(aB, aF, aG, 0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(MGraphics en2) {
        if (!aS) {
            en2.a(0);
            en2.d(0, 0, A, B);
        }
        if (GameWorld.bI) {
            return;
        }
        int n2 = GameScreen.d;
        en2.a(-en2.a(), -en2.IActionListener());
        en2.a(0);
        en2.d(0, 0, A, B);
        try {
            if (az && !a) {
                if (E == GameScreen.j()) {
                    if (bv.ResourceUtil != 172 && (bv.ResourceUtil == 137 || bv.ResourceUtil == 115 || bv.ResourceUtil == 117 || bv.ResourceUtil == 118 || bv.ResourceUtil == 120 || bv.j)) {
                        en2.a(0);
                        en2.d(0, 0, A, B);
                        return;
                    }
                    if (bv.ResourceUtil == 138) {
                        en2.a(0x676767);
                        en2.d(0, 0, A, B);
                        return;
                    }
                }
                if (ad == 0) {
                    main.GameCanvas.a(en2, 4, 6, GameWorld[3], aN[3]);
                    main.GameCanvas.a(en2, 3, 4, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 1) {
                    main.GameCanvas.a(en2, 4, 6, -1, -1);
                    main.GameCanvas.a(en2, 3, 3, -1, -1);
                    main.GameCanvas.a(en2, GameWorld[2], 0, -(GameScreen.k >> 5), n2, aM[2], 5);
                    main.GameCanvas.a(en2, aN[2], 0, aM[2] + Q[2] - (GameScreen.k >> 3), n2, 70, 3);
                    main.GameCanvas.a(en2, 2, 2, -1, -1);
                    main.GameCanvas.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 2) {
                    main.GameCanvas.a(en2, 5, 10, GameWorld[4], aN[4]);
                    main.GameCanvas.a(en2, 4, 8, -1, GameWorld[2]);
                    main.GameCanvas.a(en2, 3, 5, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 2, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 3) {
                    int n3 = GameScreen.k - (325 - GameScreen.UIPanel);
                    en2.a(0, -n3);
                    main.GameCanvas.a(en2, GameScreen.j().Screen || GameScreen.j().bR ? GameScreen.j().be : GameWorld[2], 0, n3 - (GameScreen.k >> 3), n2, aM[2] - n3 + (GameScreen.k >> 3) + 100, 2);
                    main.GameCanvas.a(en2, 3, 2, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 0, -1, -1);
                    main.GameCanvas.a(en2, 1, 0, -1, aN[0]);
                    en2.a(0, -en2.IActionListener());
                    return;
                }
                if (ad == 4) {
                    main.GameCanvas.a(en2, 4, 7, GameWorld[3], -1);
                    main.GameCanvas.a(en2, 3, 3, -1, MGraphics.IActionListener > 1 ? aN[2] : GameWorld[1]);
                    main.GameCanvas.a(en2, 2, 2, GameWorld[1], aN[1]);
                    main.GameCanvas.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 5) {
                    main.GameCanvas.a(en2, 4, 15, GameWorld[3], -1);
                    main.GameCanvas.d(en2);
                    en2.a(100, 10);
                    main.GameCanvas.d(en2);
                    en2.a(-100, -10);
                    main.GameCanvas.e(en2);
                    main.GameCanvas.a(en2, 3, 10, -1, -1);
                    main.GameCanvas.a(en2, 2, 6, -1, -1);
                    main.GameCanvas.a(en2, 1, 4, -1, -1);
                    en2.a(0, 27);
                    main.GameCanvas.a(en2, 1, 2, -1, -1);
                    en2.a(0, 20);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    en2.a(-en2.a(), -en2.IActionListener());
                    return;
                }
                if (ad == 6) {
                    main.GameCanvas.a(en2, 5, 10, GameWorld[4], aN[4]);
                    main.GameCanvas.d(en2);
                    main.GameCanvas.e(en2);
                    en2.a(60, 40);
                    main.GameCanvas.e(en2);
                    en2.a(-60, -40);
                    main.GameCanvas.a(en2, 4, 7, -1, aN[3]);
                    ed.e(en2);
                    main.GameCanvas.a(en2, 3, 4, -1, -1);
                    main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 7) {
                    main.GameCanvas.a(en2, 4, 6, GameWorld[3], aN[3]);
                    main.GameCanvas.a(en2, 3, 5, -1, -1);
                    main.GameCanvas.a(en2, 2, 4, -1, -1);
                    main.GameCanvas.a(en2, 1, 3, -1, aN[0]);
                    return;
                }
                if (ad == 8) {
                    main.GameCanvas.a(en2, 4, 8, GameWorld[3], aN[3]);
                    main.GameCanvas.d(en2);
                    main.GameCanvas.e(en2);
                    main.GameCanvas.a(en2, 3, 4, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 2, -1, aN[1]);
                    if ((bv.ResourceUtil >= 92 && bv.ResourceUtil <= 96 || bv.ResourceUtil == 51 || bv.ResourceUtil == 52) && E != I) return;
                    main.GameCanvas.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 9) {
                    main.GameCanvas.a(en2, 4, 8, GameWorld[3], aN[3]);
                    main.GameCanvas.d(en2);
                    main.GameCanvas.e(en2);
                    en2.a(-80, 20);
                    main.GameCanvas.e(en2);
                    en2.a(80, -20);
                    ed.e(en2);
                    main.GameCanvas.a(en2, 3, 5, -1, -1);
                    main.GameCanvas.a(en2, 2, 3, -1, -1);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 10) {
                    int n4 = GameScreen.k - (380 - GameScreen.UIPanel);
                    en2.a(0, -n4);
                    main.GameCanvas.a(en2, GameScreen.j().Screen ? GameScreen.j().be : GameWorld[1], 0, n4 - (GameScreen.k >> 2), n2, aM[1] - n4 + (GameScreen.k >> 2) + 100, 2);
                    main.GameCanvas.a(en2, 2, 2, -1, aN[1]);
                    main.GameCanvas.d(en2);
                    main.GameCanvas.e(en2);
                    main.GameCanvas.a(en2, 1, 0, -1, -1);
                    en2.a(0, -en2.IActionListener());
                    return;
                }
                if (ad == 11) {
                    main.GameCanvas.a(en2, 3, 6, GameWorld[2], aN[2]);
                    main.GameCanvas.d(en2);
                    main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 12) {
                    en2.a(9161471);
                    en2.d(0, 0, A, B);
                    main.GameCanvas.a(en2, 3, 4, -1, 0xDBFFFF);
                    main.GameCanvas.a(en2, 2, 3, -1, 0xDBFFFF);
                    main.GameCanvas.a(en2, 1, 2, -1, 0xDBFFFF);
                    return;
                }
                if (ad == 13) {
                    en2.a(0xE8F8F8);
                    en2.d(0, 0, A, B);
                    main.GameCanvas.a(en2, 1, 5, -1, 0xE8F8F8);
                    return;
                }
                if (ad == 15) {
                    en2.a(0x282848);
                    en2.d(0, 0, A, B);
                    main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 16) {
                    main.GameCanvas.a(en2, 4, 6, GameWorld[3], aN[3]);
                    int n5 = 0;
                    while (n5 < aC.length) {
                        en2.a(aC[n5], aa[n5], ab[n5], 33);
                        ++n5;
                    }
                    main.GameCanvas.a(en2, 3, 4, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 19) {
                    main.GameCanvas.a(en2, 5, 10, GameWorld[4], aN[4]);
                    main.GameCanvas.a(en2, 4, 8, -1, GameWorld[2]);
                    main.GameCanvas.a(en2, 3, 5, -1, aN[2]);
                    main.GameCanvas.a(en2, 2, 2, -1, aN[1]);
                    main.GameCanvas.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                main.GameCanvas.a(en2, aN[3], 0, aM[3] + Q[3], GameScreen.d, aM[2] + Q[2], 6);
                main.GameCanvas.a(en2, 4, 6, GameWorld[3], aN[3]);
                main.GameCanvas.d(en2);
                main.GameCanvas.a(en2, 3, 4, -1, aN[2]);
                main.GameCanvas.a(en2, 2, 3, -1, aN[1]);
                main.GameCanvas.a(en2, 1, 2, -1, aN[0]);
                return;
            }
            en2.a(2315859);
            en2.d(0, 0, A, B);
            if (aR == null) return;
            int n6 = -((GameScreen.j >> 2) % MGraphics.a(aR));
            while (n6 < GameScreen.d) {
                en2.a(aR, n6, (GameScreen.k >> 3) + B / 2 - 50, 0);
                n6 += MGraphics.a(aR);
            }
            en2.a(5084791);
            en2.d(0, (GameScreen.k >> 3) + B / 2 - 50 + MGraphics.IActionListener(aR), n2, B);
            return;
        }
        catch (Exception exception) {
            en2.a(0);
            en2.d(0, 0, A, B);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void IActionListener(int var0) {
        try {
            var1_1 = GameScreen.UIPanel;
            switch (var0) {
                case 0: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 70;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 20;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 30;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 50;
                    return;
                }
                case 1: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 120;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 40;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - 90;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - 25;
                    return;
                }
                case 2: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 150;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] - 60;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 40;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] - 10;
                    main.GameCanvas.aM[4] = main.GameCanvas.aM[3] - main.GameCanvas.Q[4];
                    return;
                }
                case 3: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 10;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] + 80;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 10;
                    return;
                }
                case 4: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 130;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1];
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 20;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 80;
                    return;
                }
                case 5: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 40;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 10;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 15;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 50;
                    return;
                }
                case 6: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 100;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] - 30;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 10;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 15;
                    main.GameCanvas.aM[4] = main.GameCanvas.aM[3] - main.GameCanvas.Q[4] + 15;
                    return;
                }
                case 7: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 20;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 15;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 20;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 10;
                    return;
                }
                case 8: {
                    main.GameCanvas.aM[0] = var1_1 - 103 + 150;
                    if (bv.ResourceUtil == 103) {
                        main.GameCanvas.aM[0] = main.GameCanvas.aM[0] - 100;
                    }
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] - 10;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 40;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 10;
                    return;
                }
                case 9: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 100;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 22;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 50;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3];
                    return;
                }
                case 10: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] - 45;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] - 10;
                    return;
                }
                case 11: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 60;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 5;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 15;
                    return;
                }
                case 12: {
                    main.GameCanvas.aM[0] = var1_1 + 40;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - 40;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - 40;
                    return;
                }
                case 13: {
                    main.GameCanvas.aM[0] = var1_1 - 80;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0];
                    return;
                }
                case 15: {
                    main.GameCanvas.aM[0] = var1_1 - 20;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - 80;
                    return;
                }
                case 16: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 75;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 50;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 50;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 90;
                    return;
                }
                case 19: {
                    main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 150;
                    main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] - 60;
                    main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] - 40;
                    main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] - 10;
                    main.GameCanvas.aM[4] = main.GameCanvas.aM[3] - main.GameCanvas.Q[4];
                    return;
                }
            }
            main.GameCanvas.aM[0] = var1_1 - main.GameCanvas.Q[0] + 75;
            main.GameCanvas.aM[1] = main.GameCanvas.aM[0] - main.GameCanvas.Q[1] + 50;
            main.GameCanvas.aM[2] = main.GameCanvas.aM[1] - main.GameCanvas.Q[2] + 50;
            main.GameCanvas.aM[3] = main.GameCanvas.aM[2] - main.GameCanvas.Q[3] + 90;
            return;
        }
        catch (Exception v0) {
            var0 = 0;
            ** while (var0 < main.GameCanvas.aM.length)
        }
lbl-1000:
        // 1 sources

        {
            main.GameCanvas.aM[var0] = 1;
            ++var0;
            continue;
        }
lbl113:
        // 1 sources

    }

    public static void a(int n2) {
        try {
            Object object;
            Object object2;
            aS = true;
            ed.f = ad == 12 ? bv.d - 100 : bv.d - 160;
            MathUtil.c("load bg id= " + n2 + "map ID= " + bv.ResourceUtil);
            ed.a();
            main.GameCanvas.c(n2);
            if (bv.m == n2 && bv.q == bv.GameScreen || n2 == -1) {
                return;
            }
            ae = 12;
            bv.m = (byte)n2;
            bv.q = (byte)bv.GameScreen;
            aH = new int[]{1, 2, 3, 7, 8};
            aI = new int[5];
            aJ = new int[5];
            ad = n2;
            MessageHandler = false;
            N = null;
            aA = null;
            aQ = null;
            switch (ad) {
                case 0: {
                    aQ = ResourceUtil.a("/bg/caycot.png");
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                    if (bv.GameScreen != 2) break;
                    ae = 8;
                    break;
                }
                case 1: {
                    ae = 7;
                    aO = 4;
                    break;
                }
                case 2: {
                    int[] nArray = new int[5];
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray2 = new int[5];
                    nArray2[2] = 2;
                    aJ = nArray2;
                    aO = 5;
                    break;
                }
                case 3: {
                    aO = 3;
                    break;
                }
                case 4: {
                    ed.a(3);
                    int[] nArray = new int[5];
                    nArray[1] = 1;
                    aI = nArray;
                    int[] nArray3 = new int[5];
                    nArray3[1] = 1;
                    aJ = nArray3;
                    aO = 4;
                    break;
                }
                case 5: {
                    aO = 4;
                    break;
                }
                case 6: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    aI = nArray;
                    int[] nArray4 = new int[5];
                    nArray4[0] = 2;
                    aJ = nArray4;
                    aO = 5;
                    break;
                }
                case 7: {
                    aO = 4;
                    break;
                }
                case 8: {
                    ae = 8;
                    aO = 4;
                    break;
                }
                case 9: {
                    ed.a(9);
                    aO = 4;
                    break;
                }
                case 10: {
                    aO = 2;
                    break;
                }
                case 11: {
                    ae = 7;
                    main.GameCanvas.aH[2] = 0;
                    aO = 3;
                    break;
                }
                case 12: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    nArray[1] = 1;
                    aI = nArray;
                    int[] nArray5 = new int[5];
                    nArray5[0] = 2;
                    nArray5[1] = 1;
                    aJ = nArray5;
                    aO = 3;
                    break;
                }
                case 13: {
                    aO = 2;
                    break;
                }
                case 15: {
                    MathUtil.c("HELL");
                    aO = 2;
                    break;
                }
                case 16: {
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                    break;
                }
                case 19: {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray6 = new int[5];
                    nArray6[1] = 2;
                    nArray6[2] = 1;
                    aJ = nArray6;
                    aO = 5;
                    break;
                }
                default: {
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                }
            }
            if (n2 <= 16) {
                O = cj.UIPanel[ad];
            } else {
                try {
                    String string = "/bg/IActionListener" + ad + 3 + ".png";
                    if (bv.GameScreen != 0) {
                        string = "/bg/IActionListener" + ad + 3 + "-" + bv.GameScreen + ".png";
                    }
                    object2 = new int[1];
                    object = ResourceUtil.a(string);
                    object.getRGB(object2, 0, 1, MGraphics.c(object) / 2, 0, 1, 1);
                    O = object2[0];
                }
                catch (Exception exception) {
                    O = cj.UIPanel[cj.UIPanel.length - 1];
                }
            }
            GameWorld = new int[cj.UIPanel.length];
            aN = new int[cj.UIPanel.length];
            int n3 = 0;
            while (n3 < cj.UIPanel.length) {
                main.GameCanvas.GameWorld[n3] = cj.UIPanel[n3];
                main.GameCanvas.aN[n3] = cj.UIPanel[n3];
                ++n3;
            }
            if (a) {
                aR = ResourceUtil.a("/bg/b63.png");
                return;
            }
            N = new Image[aO];
            P = new int[aO];
            Q = new int[aO];
            aN = new int[aO];
            GameWorld = new int[aO];
            if (bv.GameScreen == 100) {
                main.GameCanvas.N[0] = ResourceUtil.a("/bg/b100.png");
                main.GameCanvas.N[1] = ResourceUtil.a("/bg/b100.png");
                main.GameCanvas.N[2] = ResourceUtil.a("/bg/b82-1.png");
                main.GameCanvas.N[3] = ResourceUtil.a("/bg/b93.png");
                n3 = 0;
                while (n3 < aO) {
                    if (N[n3] != null) {
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, MGraphics.c(N[n3]) / 2, 0, 1, 1);
                        main.GameCanvas.GameWorld[n3] = object2[0];
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, MGraphics.c(N[n3]) / 2, MGraphics.d(N[n3]) - 1, 1, 1);
                        main.GameCanvas.aN[n3] = object2[0];
                        main.GameCanvas.P[n3] = MGraphics.a(N[n3]);
                        main.GameCanvas.Q[n3] = MGraphics.IActionListener(N[n3]);
                    } else if (aO > 1) {
                        main.GameCanvas.N[n3] = ResourceUtil.a("/bg/IActionListener" + ad + "0.png");
                        main.GameCanvas.P[n3] = MGraphics.a(N[n3]);
                        main.GameCanvas.Q[n3] = MGraphics.IActionListener(N[n3]);
                    }
                    ++n3;
                }
            } else {
                n3 = 0;
                while (n3 < aO) {
                    object2 = "/bg/IActionListener" + ad + n3 + ".png";
                    if (bv.GameScreen != 0) {
                        object2 = "/bg/IActionListener" + ad + n3 + "-" + bv.GameScreen + ".png";
                    }
                    main.GameCanvas.N[n3] = ResourceUtil.a((String)object2);
                    if (N[n3] != null) {
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, MGraphics.c(N[n3]) / 2, 0, 1, 1);
                        main.GameCanvas.GameWorld[n3] = (int)object[0];
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, MGraphics.c(N[n3]) / 2, MGraphics.d(N[n3]) - 1, 1, 1);
                        main.GameCanvas.aN[n3] = (int)object[0];
                        main.GameCanvas.P[n3] = MGraphics.a(N[n3]);
                        main.GameCanvas.Q[n3] = MGraphics.IActionListener(N[n3]);
                    } else if (aO > 1) {
                        main.GameCanvas.N[n3] = ResourceUtil.a("/bg/IActionListener" + ad + "0.png");
                        main.GameCanvas.P[n3] = MGraphics.a(N[n3]);
                        main.GameCanvas.Q[n3] = MGraphics.IActionListener(N[n3]);
                    }
                    ++n3;
                }
            }
            main.GameCanvas.IActionListener(ad);
            MathUtil.c("5");
            aa = new int[]{GameScreen.d / 2 - 40, GameScreen.d / 2 + 40, GameScreen.d / 2 - 100, GameScreen.d / 2 - 80, GameScreen.d / 2 - 120};
            ab = new int[]{130, 100, 150, 140, 80};
            aC = null;
            if (ad != 0) {
                if (ad == 2) {
                    aA = ResourceUtil.a("/bg/sun0.png");
                    aD = GameScreen.d / 2 + 50;
                    aE = aM[4] - 40;
                    bv.h = ResourceUtil.a("/tWater/wts");
                } else if (ad == 19) {
                    bv.h = ResourceUtil.a("/tWater/water_flow_32");
                } else if (ad == 4) {
                    aA = ResourceUtil.a("/bg/sun2.png");
                    aD = GameScreen.d / 2 + 30;
                    aE = aM[3];
                } else if (ad == 7) {
                    aA = ResourceUtil.a("/bg/sun3" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun4" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[3] - 80;
                    aF = aD - 100;
                    aG = aM[3] - 30;
                } else if (ad == 6) {
                    aA = ResourceUtil.a("/bg/sun5" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun6" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[4];
                    aF = aD - 100;
                    aG = aM[4] + 20;
                } else if (n2 == 5) {
                    aA = ResourceUtil.a("/bg/sun8" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun7" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 50;
                    aE = aM[3] + 20;
                    aF = GameScreen.d / 2 + 20;
                    aG = aM[3] - 30;
                } else if (ad == 8 && bv.ResourceUtil < 90) {
                    aA = ResourceUtil.a("/bg/sun9" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun10" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 30;
                    aE = aM[3] + 60;
                    aF = GameScreen.d / 2 + 20;
                    aG = aM[3] + 10;
                } else if (n2 == 9) {
                    aA = ResourceUtil.a("/bg/sun11" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun12" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[4] + 20;
                    aF = aD - 80;
                    aG = aM[4] + 40;
                } else if (n2 == 10) {
                    aA = ResourceUtil.a("/bg/sun13" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/sun14" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[1] - 30;
                    aF = aD - 80;
                    aG = aM[1];
                } else if (n2 == 11) {
                    aA = ResourceUtil.a("/bg/sun15" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = ResourceUtil.a("/bg/b113" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 30;
                    aE = aM[2] - 30;
                } else if (n2 == 12) {
                    ab = new int[]{200, 170, 220, 150, 250};
                } else if (n2 == 16) {
                    aa = new int[]{90, 170, 250, 320, 400, 450, 500};
                    ab = new int[]{aM[2] + 5, aM[2] - 20, aM[2] - 50, aM[2] - 30, aM[2] - 50, aM[2], aM[2] - 40};
                    aC = new Image[7];
                    n3 = 0;
                    while (n3 < aC.length) {
                        int n4 = 160;
                        if (n3 == 1 || n3 == 3) {
                            n4 = 161;
                        }
                        main.GameCanvas.aC[n3] = ResourceUtil.a("/bg/sun" + n4 + ".png");
                        ++n3;
                    }
                } else if (n2 == 19) {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray7 = new int[5];
                    nArray7[1] = 2;
                    nArray7[2] = 1;
                    aJ = nArray7;
                    aO = 5;
                } else {
                    aA = null;
                    aB = null;
                    aA = ResourceUtil.a("/bg/sun" + n2 + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    if (ResourceUtil.a("/tWater/water_flow_" + n2) != null) {
                        bv.h = ResourceUtil.a("/tWater/water_flow_" + n2);
                    }
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[2] - 30;
                }
            }
            az = false;
            if (!false) {
                az = true;
                return;
            }
        }
        catch (Exception exception) {
            aS = false;
        }
    }

    private static void c(int n2) {
        int n3 = 0;
        while (n3 < aP.length) {
            int n4;
            if (n2 == aP[n3] && (n4 = MathUtil.IActionListener(0, 2)) == 0) {
                ed.a(0);
                return;
            }
            ++n3;
        }
    }

    public final void keyPressed(int n2) {
        aT = System.currentTimeMillis();
        if (n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 122 || n2 == 10 || n2 == 8 || n2 == 13 || n2 == 32 || n2 == 31) {
            ag = n2;
        }
        if (K != null) {
            K.a(n2);
            ag = 0;
            return;
        }
        E.a(n2);
        switch (n2) {
            case 48: {
                main.GameCanvas.j[0] = true;
                main.GameCanvas.i[0] = true;
                return;
            }
            case 49: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[1] = true;
                    main.GameCanvas.i[1] = true;
                }
                return;
            }
            case 51: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[3] = true;
                    main.GameCanvas.i[3] = true;
                }
                return;
            }
            case 55: {
                main.GameCanvas.j[7] = true;
                main.GameCanvas.i[7] = true;
                return;
            }
            case 57: {
                main.GameCanvas.j[9] = true;
                main.GameCanvas.i[9] = true;
                return;
            }
            case 42: {
                main.GameCanvas.j[10] = true;
                main.GameCanvas.i[10] = true;
                return;
            }
            case 35: {
                main.GameCanvas.j[11] = true;
                main.GameCanvas.i[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.GameCanvas.j[12] = true;
                main.GameCanvas.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.GameCanvas.j[13] = true;
                main.GameCanvas.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                if (E instanceof GameScreen || E instanceof ar) {
                    GameWorld.e();
                }
                main.GameCanvas.j[5] = true;
                main.GameCanvas.i[5] = true;
                return;
            }
            case -38: 
            case -1: {
                if (E instanceof GameScreen || E instanceof ar) {
                    GameWorld.e();
                }
                main.GameCanvas.j[2] = true;
                main.GameCanvas.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                if (E instanceof GameScreen || E instanceof ar) {
                    GameWorld.e();
                }
                main.GameCanvas.j[8] = true;
                main.GameCanvas.i[8] = true;
                return;
            }
            case -3: {
                if (E instanceof GameScreen || E instanceof ar) {
                    GameWorld.e();
                }
                main.GameCanvas.j[4] = true;
                main.GameCanvas.i[4] = true;
                return;
            }
            case -4: {
                if (E instanceof GameScreen || E instanceof ar) {
                    GameWorld.e();
                }
                main.GameCanvas.j[6] = true;
                main.GameCanvas.i[6] = true;
                return;
            }
            case 50: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[2] = true;
                    main.GameCanvas.i[2] = true;
                }
                return;
            }
            case 52: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[4] = true;
                    main.GameCanvas.i[4] = true;
                }
                return;
            }
            case 54: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[6] = true;
                    main.GameCanvas.i[6] = true;
                }
                return;
            }
            case 56: {
                if (E == ar.a || E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[8] = true;
                    main.GameCanvas.i[8] = true;
                }
                return;
            }
            case 53: {
                if (E != ar.a && (E != GameScreen.c || !c || cq.IActionListener().IActionListener)) break;
                main.GameCanvas.j[5] = true;
                main.GameCanvas.i[5] = true;
            }
        }
    }

    public final void keyReleased(int n2) {
        ag = 0;
        switch (n2) {
            case 48: {
                main.GameCanvas.j[0] = false;
                main.GameCanvas.ap[0] = true;
                return;
            }
            case 49: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[1] = false;
                    main.GameCanvas.ap[1] = true;
                }
                return;
            }
            case 51: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[3] = false;
                    main.GameCanvas.ap[3] = true;
                }
                return;
            }
            case 55: {
                main.GameCanvas.j[7] = false;
                main.GameCanvas.ap[7] = true;
                return;
            }
            case 57: {
                main.GameCanvas.j[9] = false;
                main.GameCanvas.ap[9] = true;
                return;
            }
            case 42: {
                main.GameCanvas.j[10] = false;
                main.GameCanvas.ap[10] = true;
                return;
            }
            case 35: {
                main.GameCanvas.j[11] = false;
                main.GameCanvas.ap[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.GameCanvas.j[12] = false;
                main.GameCanvas.ap[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.GameCanvas.j[13] = false;
                main.GameCanvas.ap[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.GameCanvas.j[5] = false;
                main.GameCanvas.ap[5] = true;
                return;
            }
            case -38: 
            case -1: {
                main.GameCanvas.j[2] = false;
                return;
            }
            case -39: 
            case -2: {
                main.GameCanvas.j[8] = false;
                return;
            }
            case -3: {
                main.GameCanvas.j[4] = false;
                return;
            }
            case -4: {
                main.GameCanvas.j[6] = false;
                return;
            }
            case 50: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[2] = false;
                    main.GameCanvas.ap[2] = true;
                }
                return;
            }
            case 52: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[4] = false;
                    main.GameCanvas.ap[4] = true;
                }
                return;
            }
            case 54: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[6] = false;
                    main.GameCanvas.ap[6] = true;
                }
                return;
            }
            case 56: {
                if (E == GameScreen.c && c && !cq.IActionListener().IActionListener) {
                    main.GameCanvas.j[8] = false;
                    main.GameCanvas.ap[8] = true;
                }
                return;
            }
            case 53: {
                if (E != GameScreen.c || !c || cq.IActionListener().IActionListener) break;
                main.GameCanvas.j[5] = false;
                main.GameCanvas.ap[5] = true;
            }
        }
    }

    public final void a(int n2, int n3) {
        o = false;
        if (MathUtil.UIPanel(n2 - t) >= 10 || MathUtil.UIPanel(n3 - u) >= 10) {
            ResourceUtil = false;
            k = true;
            n = true;
        }
        GameScreen = n2;
        q = n3;
        if (++at > 3) {
            at = 0;
        }
        main.GameCanvas.v[main.GameCanvas.at] = new be(n2, n3);
    }

    public final void IActionListener(int n2, int n3) {
        o = false;
        m = false;
        ai = true;
        k = true;
        ResourceUtil = false;
        n = false;
        aT = System.currentTimeMillis();
        r = n2;
        s = n3;
        t = n2;
        u = n3;
        GameScreen = n2;
        q = n3;
    }

    public final void c(int n2, int n3) {
        if (!n) {
            o = true;
        }
        k = false;
        m = true;
        n = false;
        ResourceUtil = true;
        Screen.cs = -1;
        GameScreen = n2;
        q = n3;
    }

    public static boolean a(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return GameScreen >= n2 && GameScreen <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public static void f() {
        int n2 = 0;
        while (n2 < i.length) {
            main.GameCanvas.i[n2] = false;
            ++n2;
        }
        m = false;
    }

    public static void UIPanel() {
        int n2 = 0;
        while (n2 < j.length) {
            main.GameCanvas.j[n2] = false;
            ++n2;
        }
    }

    public final void paint(Graphics object) {
        Object object2;
        this.au.a = object;
        GameStrings.removeAllElements();
        if (E != null) {
            E.a(this.au);
        }
        this.au.a(-this.au.a(), -this.au.IActionListener());
        this.au.e(0, 0, A, B);
        if (main.GameCanvas.G.a) {
            G.a(this.au);
            if (H != null && main.GameCanvas.H.a) {
                H.a(this.au);
            }
            if (main.GameCanvas.G.o != null && main.GameCanvas.G.o.IActionListener) {
                main.GameCanvas.G.o.a(this.au);
            }
            if (H != null && main.GameCanvas.H.o != null && main.GameCanvas.H.o.IActionListener) {
                main.GameCanvas.H.o.a(this.au);
            }
        }
        if (GameScreen.bP) {
            MathUtil.a(this.au);
        }
        bp.a(this.au);
        if (K != null) {
            K.a(this.au);
        } else if (main.GameCanvas.F.a) {
            main.GameCanvas.a(this.au);
            F.a(this.au);
        }
        GameScreen.aD.a(this.au);
        GameScreen.aE.a(this.au);
        if (GameScreen.j().bQ != null) {
            GameScreen.j().bQ.a(this.au);
        }
        if (ae.m != null) {
            ae.m.a(this.au);
        }
        object = this.au;
        if (ae.n == null && !GameWorld.e().t && !GameWorld.e().s) {
            object2 = object;
            try {
                if (v.m && (v.a <= GameScreen.j || v.a >= GameScreen.j + GameScreen.d || v.IActionListener <= GameScreen.k || v.IActionListener >= GameScreen.k + GameScreen.e) && w % 10 >= 5 && ae.m == null && ae.n == null && !main.GameCanvas.G.a && v.j) {
                    int n2 = v.a - GameWorld.e().B;
                    int n3 = v.IActionListener - GameWorld.e().C;
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    if (n2 > 0 && n3 >= 0) {
                        if (MathUtil.UIPanel(n2) >= MathUtil.UIPanel(n3)) {
                            n4 = GameScreen.d - 10;
                            n5 = GameScreen.e / 2 + 30;
                            if (e) {
                                n5 = GameScreen.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = GameScreen.d / 2;
                            n5 = GameScreen.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 >= 0 && n3 < 0) {
                        if (MathUtil.UIPanel(n2) >= MathUtil.UIPanel(n3)) {
                            n4 = GameScreen.d - 10;
                            n5 = GameScreen.e / 2 + 30;
                            if (e) {
                                n5 = GameScreen.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = GameScreen.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    if (n2 < 0 && n3 >= 0) {
                        if (MathUtil.UIPanel(n2) >= MathUtil.UIPanel(n3)) {
                            n4 = 10;
                            n5 = GameScreen.e / 2 + 30;
                            if (e) {
                                n5 = GameScreen.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = GameScreen.d / 2;
                            n5 = GameScreen.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 <= 0 && n3 < 0) {
                        if (MathUtil.UIPanel(n2) >= MathUtil.UIPanel(n3)) {
                            n4 = 10;
                            n5 = GameScreen.e / 2 + 30;
                            if (e) {
                                n5 = GameScreen.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = GameScreen.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    GameScreen.c((MGraphics)object2);
                    ((MGraphics)object2).a(GameScreen.bw, 0, 0, 13, 16, n6, n4, n5, cj.f);
                }
            }
            catch (Exception exception) {}
            if (!(main.GameCanvas.F.e != 0 || !v.i || ae.q != null || GameWorld.bG || E != GameScreen.j() || main.GameCanvas.G.a && main.GameCanvas.G.h != 0)) {
                if (v.j) {
                    ((MGraphics)object).a(-GameScreen.j, -GameScreen.k);
                }
                if (v.k == 0) {
                    ((MGraphics)object).a(UIPanel.i, v.a - 15, v.IActionListener, 0);
                }
                if (v.k == 1) {
                    ((MGraphics)object).a(UIPanel.i, 0, 0, 14, 16, 2, v.a + 15, v.IActionListener, cj.IActionListener);
                }
                if (v.ResourceUtil) {
                    ((MGraphics)object).a(ce.f, v.a, v.IActionListener, 3);
                }
                ((MGraphics)object).a(-((MGraphics)object).a(), -((MGraphics)object).IActionListener());
            }
        }
        if (ae.n != null) {
            ae.n.a(this.au);
        }
        int n7 = 0;
        while (n7 < dc.x.size()) {
            object2 = (dc)dc.x.elementAt(n7);
            if (object2 instanceof ae && !object2.equals(ae.m) && !object2.equals(ae.n)) {
                ((dc)object2).a(this.au);
            }
            ++n7;
        }
        if (K != null) {
            K.a(this.au);
        }
        if (GameWorld.bI || x.c || bs.m || am.a) {
            MGraphics en2 = this.au;
            String string = "";
            main.GameCanvas.a(en2);
            en2.a(0);
            en2.d(0, 0, A, B);
            en2.a(x.j, A / 2, B / 2 - 24, cj.c);
            main.GameCanvas.a(C, B / 2 + 24, en2);
            mFont.c.a(en2, String.valueOf(GameStrings.aC) + (x.k > 0 ? " " + x.k + "s" : string), A / 2, B / 2, 2);
            if (bl > 0 && x.k <= 0 && ResourceUtil.d() - bk >= 1000L) {
                if (--bl == 0) {
                    bl = 15;
                }
                bk = ResourceUtil.d();
            }
        }
        main.GameCanvas.a(this.au);
        ei.d(this.au);
        if (an && !d) {
            if (E == I || E == ak || E == al) {
                this.au.a(ah, 5, 5, 0);
            }
            if (E == cw.a) {
                this.au.a(ah, C, 5, 0);
            }
        }
        int n8 = 0;
        while (n8 < ba.size()) {
            object2 = (String)ba.elementAt(n8);
            mFont.GameCanvas.a(this.au, (String)object2, A, B - this.Screen - n8 * this.Screen, 1);
            mFont.c.a(this.au, (String)object2, A - 1, B - this.Screen - n8 * this.Screen - 1, 1);
            ++n8;
        }
        main.GameCanvas.a(this.au);
        n8 = B / 4;
        if (E != null && E instanceof GameScreen && aY != null) {
            this.au.e(60, n8, A - 120, mFont.s.a() + 2);
            mFont.o.a(this.au, aY, aZ, n8 + 1, 0);
            mFont.n.a(this.au, aY, aZ, n8, 0);
            this.au.e(0, 0, A, B);
        }
    }

    public static void h() {
        K = null;
        bp.c();
    }

    public static void a(String string) {
        L.a(string, null, new Command(GameStrings.bs, h, 8882, null), null);
        K = L;
    }

    public static void IActionListener(String string) {
        L.a(string, null, new Command(GameStrings.bv, h, 8882, null), null);
        K = L;
        main.GameCanvas.L.a = true;
    }

    public static void c(String string) {
        L.a(string, null, new Command(GameStrings.bv, h, 8882, null), null);
        K = L;
        main.GameCanvas.L.a = true;
    }

    public static void i() {
        GameWorld.bI = true;
    }

    public static void a(String string, int n2, Object object) {
        L.a(string, null, new Command(GameStrings.bs, h, n2, null), null);
        L.c();
    }

    public static void a(String string, Command de2, Command de3) {
        L.a(string, de2, null, de3);
        L.c();
    }

    public final void sizeChanged(int n2, int n3) {
    }

    public final boolean a(int n2, int n3, int n4) {
        if (a) {
            return false;
        }
        int n5 = n2 = n2 == 1 ? 0 : 1;
        if (this.be[n2] != -1) {
            return false;
        }
        this.be[n2] = 0;
        this.bc[n2] = n3;
        this.IConnectionListener[n2] = n4;
        return true;
    }

    private static void o() {
        if (a) {
            return;
        }
        bg = new Image[3];
        int n2 = 0;
        while (n2 < 3) {
            main.GameCanvas.bg[n2] = ResourceUtil.IActionListener("/e/w" + n2 + ".png");
            ++n2;
        }
        int[] nArray = new int[2];
        bf = nArray;
        main.GameCanvas.bf[1] = -1;
        nArray[0] = -1;
    }

    public final void j() {
        if (a) {
            return;
        }
        try {
            int n2 = 0;
            while (n2 < 2) {
                if (this.be[n2] != -1) {
                    int n3 = n2;
                    this.be[n3] = this.be[n3] + 1;
                    if (this.be[n2] >= 5) {
                        this.be[n2] = -1;
                    }
                    if (n2 == 0) {
                        int n4 = n2;
                        this.bc[n4] = this.bc[n4] - 1;
                    } else {
                        int n5 = n2;
                        this.bc[n5] = this.bc[n5] + 1;
                    }
                    int n6 = n2;
                    this.IConnectionListener[n6] = this.IConnectionListener[n6] - 1;
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean d(int n2, int n3) {
        if (n2 < GameScreen.j) {
            return false;
        }
        if (n2 > GameScreen.j + GameScreen.d) {
            return false;
        }
        if (n3 < GameScreen.k) {
            return false;
        }
        return n3 <= GameScreen.k + GameScreen.e + 30;
    }

    public static void a(int n2, int n3, MGraphics en2) {
        int n4 = aq % (ResourceUtil.c == 7 ? 8 : 9);
        if (++aq == 1000) {
            aq = 0;
        }
        en2.a(bh, 0, n4 << 4, 16, 16, 0, n2, n3, 3);
    }

    public final void k() {
        this.bj = true;
    }

    public static boolean IActionListener(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return GameScreen >= n2 && GameScreen <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 10001: {
                K = null;
                bp.c();
                return;
            }
            case 10000: {
                K = null;
                bp.c();
                return;
            }
            case 9000: {
                K = null;
                bp.c();
                em.IActionListener = null;
                bl.a();
                System.gc();
                bs.o = true;
                bs.u = true;
                GameScreen.j().ResourceUtil();
                if (E == I) break;
                ak.UIPanel();
                return;
            }
            case 999: {
                K = null;
                bp.c();
                return;
            }
            case 9999: {
                K = null;
                bp.c();
                main.GameCanvas.IActionListener();
                GameService.a().c();
                I.a();
                return;
            }
            case 8881: {
                Object object2 = (String)object;
                try {
                    GameMidlet.f.platformRequest((String)object2);
                }
                catch (Exception exception) {
                    object2 = exception;
                    exception.printStackTrace();
                }
                K = null;
                return;
            }
            case 8882: {
                bp.c();
                K = null;
                bs.v = false;
                return;
            }
            case 8884: {
                K = null;
                bp.c();
                if (al == null) {
                    al = new eu();
                }
                al.IActionListener();
                return;
            }
            case 8885: {
                GameMidlet.f.a();
                return;
            }
            case 8886: {
                K = null;
                bp.c();
                String string = (String)object;
                GameService.a().c(string);
                return;
            }
            case 8887: {
                K = null;
                bp.c();
                n2 = (Integer)object;
                GameService.a().m(n2);
                return;
            }
            case 8888: {
                n2 = (Integer)object;
                GameService.a().n(n2);
                K = null;
                bp.c();
                return;
            }
            case 8889: {
                String string = (String)object;
                K = null;
                bp.c();
                GameService.a().d(string);
                return;
            }
            case 88810: {
                n2 = (Integer)object;
                K = null;
                bp.c();
                GameService.a().k(n2);
                return;
            }
            case 88811: {
                K = null;
                bp.c();
                GameService.a().i();
                return;
            }
            case 88814: {
                h[] hArray = (h[])object;
                K = null;
                bp.c();
                GameService.a().a(hArray);
                return;
            }
            case 88815: {
                return;
            }
            case 88817: {
                ae.c("", 1, GameWorld.e().aT);
                GameService.a().a(GameWorld.e().aT.df.a, main.GameCanvas.F.IActionListener, 0);
                return;
            }
            case 88818: {
                n2 = ((Short)object).shortValue();
                GameService.a().a((short)n2, null.GameCanvas.d());
                K = null;
                bp.c();
                return;
            }
            case 88819: {
                n2 = ((Short)object).shortValue();
                GameService.a().IActionListener((short)n2);
                return;
            }
            case 88820: {
                String[] stringArray = (String[])object;
                if (GameWorld.e().aT == null) {
                    return;
                }
                object = new Integer(main.GameCanvas.F.IActionListener);
                if (stringArray.length > 1) {
                    LoggingList el2 = new LoggingList("vSub");
                    int n3 = 0;
                    while (n3 < stringArray.length - 1) {
                        el2.addElement(new Command(stringArray[n3 + 1], h, 88821, object));
                        ++n3;
                    }
                    F.a(el2);
                    return;
                }
                ae.c("", 1, GameWorld.e().aT);
                GameService.a().a(GameWorld.e().aT.df.a, ((Integer)object).intValue(), 0);
                return;
            }
            case 88821: {
                int n4 = (Integer)object;
                ae.c("", 1, GameWorld.e().aT);
                GameService.a().a(GameWorld.e().aT.df.a, n4, main.GameCanvas.F.IActionListener);
                return;
            }
            case 88822: {
                ae.c("", 1, GameWorld.e().aT);
                GameService.a().a(GameWorld.e().aT.df.a, main.GameCanvas.F.IActionListener, 0);
                return;
            }
            case 88823: {
                main.GameCanvas.a(GameStrings.K);
                return;
            }
            case 88824: {
                main.GameCanvas.a(GameStrings.L);
                return;
            }
            case 88825: {
                main.GameCanvas.c(GameStrings.M);
                return;
            }
            case 88826: {
                main.GameCanvas.c(GameStrings.N);
                return;
            }
            case 88827: {
                main.GameCanvas.a(GameStrings.O);
                return;
            }
            case 88828: {
                main.GameCanvas.a(GameStrings.P);
                return;
            }
            case 88829: {
                String string = null.GameCanvas.d();
                if (string.equals("")) {
                    return;
                }
                GameService.a().IActionListener(string, (int)((Integer)object));
                bp.a();
                return;
            }
            case 88836: {
                null.a.IActionListener(6);
                ((j)null).a(GameStrings.S, new Command(GameStrings.SettingsManager, h, 888361, null), 1);
                return;
            }
            case 888361: {
                String string = null.GameCanvas.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    main.GameCanvas.a(GameStrings.Q);
                    return;
                }
                try {
                    GameService.a().q(Integer.parseInt(string));
                    return;
                }
                catch (Exception exception) {
                    main.GameCanvas.a(GameStrings.R);
                    return;
                }
            }
            case 88837: {
                String string = null.GameCanvas.d();
                K = null;
                bp.c();
                try {
                    GameService.a().s(Integer.parseInt(string.trim()));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88839: {
                String string = null.GameCanvas.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    main.GameCanvas.a(GameStrings.Q);
                    return;
                }
                try {
                    String string2 = string;
                    string = null;
                    int n5 = 8882;
                    object = string2;
                    n5 = 888391;
                    String string3 = GameStrings.ah;
                    L.a(string3, new Command(GameStrings.bn, h, 888391, object), new Command("", h, 888391, object), new Command(GameStrings.bo, h, 8882, null));
                    L.c();
                    return;
                }
                catch (Exception exception) {
                    main.GameCanvas.a(GameStrings.R);
                    return;
                }
            }
            case 888391: {
                String string = (String)object;
                K = null;
                bp.c();
                GameService.a().r(Integer.parseInt(string));
                return;
            }
            case 888392: {
                GameService.a().a(4, main.GameCanvas.F.IActionListener, 0);
                return;
            }
            case 888393: {
                I.a();
                return;
            }
            case 888394: {
                K = null;
                bp.c();
                return;
            }
            case 888395: {
                if (E.equals(em.a) || E.equals(ak)) {
                    ak.IActionListener();
                } else {
                    I.IActionListener();
                }
                K = null;
                bp.c();
                return;
            }
            case 888396: {
                K = null;
                bp.c();
                return;
            }
            case 888397: {
                K = null;
                bp.c();
                return;
            }
            case 101024: {
                K = null;
                bp.c();
                return;
            }
            case 101025: {
                K = null;
                bp.c();
                if (bs.u) {
                    ak.IActionListener();
                    return;
                }
                ak.j();
                return;
            }
            case 101026: {
                ResourceUtil.IActionListener(true);
                return;
            }
            case 100001: {
                GameService.a().IActionListener((byte)0, (byte)-1);
                bp.a();
                return;
            }
            case 100002: {
                if (I == null) {
                    I = new LoginScreen();
                }
                LoginScreen.UIPanel();
                return;
            }
            case 100003: {
                return;
            }
            case 100004: {
                return;
            }
            case 100005: {
                if (GameWorld.e().H == 14) {
                    main.GameCanvas.a(GameStrings.ex);
                    return;
                }
                GameService.a().h();
                return;
            }
            case 100006: {
                ResourceUtil.IActionListener(true);
                return;
            }
            case 100016: {
                bs.a(17, false);
                main.GameCanvas.e();
                bs.m = true;
                K = null;
                bp.c();
            }
        }
    }

    public static void ResourceUtil() {
        ResourceUtil = false;
        k = false;
        ai = false;
        m = false;
        o = false;
        GameScreen.j().aU = 0L;
        GameScreen.j().aT = false;
    }
}

