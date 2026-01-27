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

public final class GameCanvas
extends BaseCanvas
implements b {
    public static boolean LoginScreen = false;
    public static long b = 0L;
    public static boolean c = true;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static GameCanvas Item;
    public static boolean[] i;
    private static boolean[] ap;
    public static boolean[] j;
    public static boolean k;
    public static boolean Res;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public static int SessionReceiver;
    public static int MyHashtable;
    public static int u;
    public static be[] v;
    public static int w;
    public static int x;
    private static int aq;
    public static boolean Message;
    public static boolean z;
    private static long ar;
    private static long ImageCache;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static Screen E;
    public static az F;
    public static g G;
    public static g H;
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
    private mGraphics au = new mGraphics();
    public static Image[] R;
    public static Image[] S;
    public static MyHashtable T;
    public static MyVector U;
    private static MyVector RMS;
    private static MyVector T;
    public static MyVector V;
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
    public static int[] Mob;
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
    public static int[] Char;
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
    private static MyVector ba;
    private int Screen = 12;
    public static boolean ai;
    private int[] bc;
    private int[] bd;
    private int[] be;
    private static int[] bf;
    private static Image[] bg;
    private static Image bh;
    private static Image[][] bi;
    public static boolean aj;
    public static ServerListScreen ak;
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
        T = new MyHashtable("");
        U = new MyVector("");
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
        new MyVector("vFlyText");
        aU = 0;
        aZ = A - 60;
        ba = new MyVector("");
        ai = false;
        new Random();
        aj = true;
        bl = 15;
    }

    public LoginScreen() {
        GameCanvas a2 = this;
        A = a2.m();
        B = a2.n();
        Screen.cp = mFont.MyHashtable.LoginScreen() + 8;
        F = new az();
        G = new g();
        new MyVector("vCurrPopup");
        C = A / 2;
        D = B / 2;
        if (a2.hasPointerEvents()) {
            e = true;
            if (A >= 240) {
                f = true;
            }
            if (A < 320) {
                g = true;
            }
        }
        L = new bc();
        if (B <= 160) {
            cx.LoginScreen = 15;
            Screen.cr = 17;
        }
        Item = a2;
        System.gc();
        M = new cx();
        if (!LoginScreen) {
            if (bi == null) {
                bi = new Image[2][5];
                int n2 = 0;
                while (n2 < 2) {
                    int n3 = 0;
                    while (n3 < 5) {
                        GameCanvas.bi[n2][n3] = Res.loadImage("/e/d" + n2 + n3 + ".png");
                        ++n3;
                    }
                    ++n2;
                }
            }
            a2.bc = new int[2];
            a2.bd = new int[2];
            a2.be = new int[2];
            a2.be[1] = -1;
            a2.be[0] = -1;
        }
        GameCanvas.o();
        bh = Res.loadImage("/mainImage/myTexture2df.png");
        int n4 = RMS.d("clienttype");
        if (n4 != -1) {
            if (n4 > 7) {
                RMS.LoginScreen("clienttype", Res.clientType);
            } else {
                Res.clientType = n4;
            }
        }
        if (Res.clientType == 7 && (RMS.c("fake") == null || RMS.c("fake") == "")) {
            bh = Res.loadImage("/mainImage/wait.png");
        }
        RMS = new MyVector("vDebugUpdate");
        T = new MyVector("vDeBugPait");
        V = new MyVector("vDebugSesion");
        n4 = 0;
        while (n4 < 3) {
            GameCanvas.Z[n4] = Res.loadImage("/mainImage/myTexture2dbd" + n4 + ".png");
            ++n4;
        }
        mGraphics.LoginScreen(Z[0]);
        mGraphics.b(Z[0]);
        mGraphics.LoginScreen(Z[1]);
        mGraphics.b(Z[1]);
        g.I = RMS.d("lowGraphic");
        LoginScreen = RMS.d("lowGraphic") == 1;
        GameScreen.bV = RMS.d("serverchat") != 1;
        Char.cW = RMS.d("isPaintAura") == 1;
        Char.cX = RMS.d("isPaintAura2") == 1;
        ds.LoginScreen();
        bl.b();
        bo.LoginScreen();
        g.ab = 176;
        if (176 > A) {
            g.ab = A;
        }
        ah = Res.loadImage("/mainImage/18+.png");
        n4 = 0;
        while (n4 < 7) {
            GameCanvas.R[n4] = Res.loadImage("/effectdata/blue/" + n4 + ".png");
            GameCanvas.S[n4] = Res.loadImage("/effectdata/violet/" + n4 + ".png");
            ++n4;
        }
        ak = new ServerListScreen();
        al = new eu();
        I = new x();
        am = new am();
    }

    public static GameCanvas LoginScreen() {
        return Item;
    }

    public static void b() {
        if (!Session.LoginScreen().d()) {
            Session.LoginScreen().LoginScreen(GameMidlet.SERVER_IP, GameMidlet.SERVER_PORT);
        }
    }

    public static void c() {
        if (!Session.b().d()) {
            ds.c("IP2= " + GameMidlet.c + " PORT 2= " + GameMidlet.d);
            Session.b().LoginScreen(GameMidlet.c, GameMidlet.d);
        }
    }

    public static void methodLoginScreen(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, 0, A, B);
    }

    public static void b(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.LoginScreen(0, 0);
        en2.e(0, 0, A, B);
        en2.LoginScreen(-GameScreen.j, -GameScreen.k);
    }

    public final void d() {
        block140: {
            int n2;
            block139: {
                block141: {
                    Object object;
                    if (X == 1 && Y < Res.currentTimeMillis()) {
                        Y = Res.currentTimeMillis();
                        X = -1;
                        Char.bI = false;
                        K = null;
                        bp.c();
                        Res.loadImageFromRMS(true);
                    }
                    if (X == 2 && Y < Res.currentTimeMillis() && w % 2 == 0 && E != null) {
                        if (E == GameScreen.j()) {
                            if (Char.bI) {
                                Char.bI = false;
                            }
                            if (ServerListScreen.m) {
                                ServerListScreen.m = false;
                            }
                        }
                        if (bl.f.size() > 0) {
                            object = (eg)bl.f.elementAt(0);
                            GameService.LoginScreen().GameScreen(((eg)object).b);
                            bl.f.removeElementAt(0);
                        }
                        ea.n.size();
                    }
                    if (Res.currentTimeMillis() > this.aW) {
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
                        b = Res.currentTimeMillis();
                    }
                    if (Res.currentTimeMillis() > this.aX) {
                        this.aX += 1000L;
                        aV = 0;
                    }
                    ++aV;
                    RMS.removeAllElements();
                    long l2 = System.currentTimeMillis();
                    if (GameScreen.bP) {
                        ds.b();
                    }
                    if (l2 - ar >= 780L && !Message) {
                        ar = l2;
                        Message = true;
                    } else {
                        Message = false;
                    }
                    if (l2 - ImageCache >= 7800L && !z) {
                        ImageCache = l2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x > 0) {
                        --x;
                    }
                    if (++w > 10000) {
                        if (System.currentTimeMillis() - aT > 20000L && E == I) {
                            GameMidlet.f.LoginScreen();
                        }
                        w = 0;
                    }
                    if (E == null) break block140;
                    if (ae.n != null) {
                        ae.n.LoginScreen();
                        ae.n.b();
                    } else if (ae.m != null) {
                        ae.m.LoginScreen();
                        ae.m.b();
                    } else if (K != null) {
                        K.LoginScreen();
                    } else if (GameCanvas.F.LoginScreen) {
                        F.b();
                        F.LoginScreen();
                    } else if (GameCanvas.G.LoginScreen) {
                        G.B();
                        if (GameCanvas.b(GameCanvas.G.b, 0, GameCanvas.G.d, GameCanvas.G.e)) {
                            W = false;
                        }
                        if (H != null && GameCanvas.H.LoginScreen) {
                            H.B();
                            if (GameCanvas.b(GameCanvas.H.b, 0, GameCanvas.H.d, GameCanvas.H.e)) {
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
                        if (GameCanvas.G.o != null && GameCanvas.G.o.b) {
                            G.MyHashtable();
                        } else if (H != null && GameCanvas.H.o != null && GameCanvas.H.o.b) {
                            H.MyHashtable();
                        } else if (GameCanvas.b(GameCanvas.G.b, 0, GameCanvas.G.d, GameCanvas.G.e) && H != null || H == null) {
                            G.u();
                        } else if (H != null && GameCanvas.H.LoginScreen && GameCanvas.b(GameCanvas.H.b, 0, GameCanvas.H.d, GameCanvas.H.e)) {
                            H.u();
                        }
                        if (GameCanvas.b(GameCanvas.G.b + GameCanvas.G.d, 0, A - (GameCanvas.G.d << 1), GameCanvas.G.e) && m && GameCanvas.G.az) {
                            G.A();
                        }
                    }
                    if (!d) {
                        E.c();
                    }
                    if (!GameCanvas.G.LoginScreen && ae.n == null) {
                        E.d();
                    }
                    if (Char.e().aD == null || E != GameScreen.c) break block141;
                    int n3 = Char.e().aD.c;
                    int n4 = Char.e().aD.LoginScreen;
                    v.j = false;
                    v.k = 0;
                    v.c = 0;
                    v.i = true;
                    v.m = true;
                    if (GameCanvas.F.LoginScreen && n3 > 0) {
                        v.i = false;
                    }
                    switch (n3) {
                        case 0: {
                            if (ae.m != null || Char.e().H == 14) {
                                v.LoginScreen = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0 && bv.MyHashtable.size() != 0) {
                                    v.LoginScreen = ((bw)bv.MyHashtable.elementAt((int)0)).LoginScreen - 100;
                                    v.b = ((bw)bv.MyHashtable.elementAt((int)0)).b + 40;
                                    v.j = true;
                                }
                                if (n4 == 1) {
                                    v.LoginScreen(0);
                                }
                                if (n4 == 2) {
                                    v.LoginScreen();
                                }
                                if (n4 == 3) {
                                    if (!GameCanvas.G.LoginScreen) {
                                        v.LoginScreen();
                                    } else if (GameCanvas.G.B == 0) {
                                        if (GameCanvas.G.ai == null) {
                                            v.LoginScreen = GameCanvas.G.ae + GameCanvas.G.ag / 2;
                                            v.b = GameCanvas.G.Char + 20;
                                        } else if (GameCanvas.F.e != 0) {
                                            v.LoginScreen = GameCanvas.G.ae + 25;
                                            v.b = GameCanvas.G.Char + 60;
                                        }
                                    } else if (GameCanvas.G.B == 1) {
                                        v.LoginScreen = GameCanvas.G.C + 10;
                                        v.b = 65;
                                    }
                                }
                                if (n4 == 4) {
                                    if (GameCanvas.G.LoginScreen) {
                                        v.LoginScreen = GameCanvas.G.Mob.j + 5;
                                        v.b = GameCanvas.G.Mob.k + 5;
                                    } else if (GameCanvas.F.LoginScreen) {
                                        v.LoginScreen = A / 2;
                                        v.b = B - 20;
                                    } else {
                                        v.LoginScreen();
                                    }
                                }
                                if (n4 == 5) {
                                    v.LoginScreen();
                                }
                            }
                            break block139;
                        }
                        case 1: {
                            if (ae.m != null || Char.e().H == 14) {
                                v.LoginScreen = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (bv.d()) {
                                        v.LoginScreen(0);
                                    } else {
                                        v.b();
                                    }
                                }
                                if (n4 == 1) {
                                    if (!bv.d()) {
                                        v.LoginScreen(1);
                                    } else {
                                        v.LoginScreen();
                                    }
                                }
                            }
                            break block139;
                        }
                        case 2: {
                            if (ae.m != null || Char.e().H == 14) {
                                v.LoginScreen = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (!bv.d()) {
                                        v.f = true;
                                    }
                                    if (!GameCanvas.G.LoginScreen) {
                                        if (!v.f) {
                                            v.LoginScreen = GameScreen.j().aR.j;
                                            v.b = GameScreen.j().aR.k + 13;
                                            v.k = 1;
                                        } else {
                                            if (GameScreen.w() == bv.Res) {
                                                if (!v.c()) {
                                                    v.b();
                                                }
                                            } else {
                                                v.LoginScreen(0);
                                            }
                                            if (v.f) {
                                                v.g = true;
                                            }
                                        }
                                    } else if (!v.f) {
                                        if (GameCanvas.G.B == 0) {
                                            n3 = B > 300 ? 15 : 10;
                                            v.LoginScreen = GameCanvas.G.ae + GameCanvas.G.ag / 2;
                                            v.b = GameCanvas.G.Char + GameCanvas.G.ah - n3;
                                        } else {
                                            v.LoginScreen = GameCanvas.G.C + 10;
                                            v.b = 65;
                                        }
                                    } else if (!v.g) {
                                        v.LoginScreen = GameCanvas.G.Mob.j + 5;
                                        v.b = GameCanvas.G.Mob.k + 5;
                                    } else {
                                        v.i = false;
                                    }
                                    if (Char.e().T <= 0L) {
                                        v.LoginScreen = GameScreen.bx + 5;
                                        v.b = GameScreen.by + 13;
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
                            if (ae.m != null || Char.e().H == 14) {
                                v.LoginScreen = A / 2;
                                v.b = B - 15;
                            } else if (n4 == 0) {
                                if (!GameCanvas.G.LoginScreen) {
                                    if (!v.Item) {
                                        v.LoginScreen = GameScreen.j().aR.j;
                                        v.b = GameScreen.j().aR.k + 13;
                                        v.k = 1;
                                    } else {
                                        if (GameScreen.w() == bv.Res) {
                                            if (!v.c()) {
                                                v.b();
                                            }
                                        } else {
                                            v.LoginScreen(0);
                                        }
                                        if (v.f) {
                                            v.g = true;
                                        }
                                    }
                                } else if (!v.Item) {
                                    v.LoginScreen = GameCanvas.G.ae + 10 + 108 - 18;
                                    v.b = 65;
                                } else if (!v.g) {
                                    v.LoginScreen = GameCanvas.G.Mob.j + 5;
                                    v.b = GameCanvas.G.Mob.k + 5;
                                } else {
                                    v.i = false;
                                }
                                if (Char.e().T <= 0L) {
                                    v.LoginScreen = GameScreen.bx + 5;
                                    v.b = GameScreen.by + 13;
                                    v.j = false;
                                }
                            } else {
                                v.i = false;
                                v.m = false;
                            }
                            break block139;
                        }
                        default: {
                            if (Char.e().aD.c == 9 && Char.e().aD.LoginScreen == 2) {
                                n3 = 0;
                                while (n3 < bo.LoginScreen.size()) {
                                    bo bo2 = (bo)bo.LoginScreen.elementAt(n3);
                                    if (bo2.e <= 24) {
                                        v.LoginScreen = bo2.d + bo2.b / 2;
                                        v.b = bo2.e + 30;
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
                v.Res = false;
                if (++v.d == 50) {
                    v.d = 0;
                    v.e = true;
                }
            } else {
                ++v.d;
                if (v.c == 0) {
                    if (v.d == 2) {
                        v.LoginScreen += n2 * 2;
                        v.b -= 4;
                        v.Res = true;
                    }
                    if (v.d == 4) {
                        v.LoginScreen -= n2 * 2;
                        v.b += 4;
                        v.e = false;
                        v.Res = false;
                        v.d = 0;
                    }
                    if (v.d > 4) {
                        v.e = false;
                    }
                }
                if (v.c == 1) {
                    if (v.d == 2) {
                        if (e) {
                            GameScreen.LoginScreen(T.cI, v.LoginScreen, v.b + 10, 0, 20, 7);
                        }
                        v.Res = true;
                        v.LoginScreen += n2 * 2;
                        v.b -= 4;
                    }
                    if (v.d == 4) {
                        v.Res = false;
                        v.LoginScreen -= n2;
                        v.b += 2;
                    }
                    if (v.d == 6) {
                        v.Res = true;
                        v.LoginScreen += n2;
                        v.b -= 2;
                    }
                    if (v.d == 8) {
                        v.Res = false;
                        v.LoginScreen -= n2;
                        v.b += 2;
                    }
                    if (v.d == 10) {
                        v.LoginScreen -= n2;
                        v.b += 2;
                        v.e = false;
                        v.d = 0;
                    }
                }
            }
            bu.LoginScreen();
        }
        System.currentTimeMillis();
        bp.b();
        if (this.bj) {
            this.bj = false;
            GameCanvas.e();
        }
        if (E != null && E instanceof GameScreen && (aZ += ax << 1) - g.v.getWidth() <= 60) {
            ax = 0;
            ++this.ay;
            if (this.ay > 150) {
                this.ay = 0;
                aY = null;
            }
        }
        if (E != null && E.equals(GameScreen.j())) {
            if (GameScreen.aD != null) {
                GameScreen.aD.LoginScreen();
            }
            if (GameScreen.aE != null) {
                GameScreen.aE.LoginScreen();
            }
        }
        o = false;
    }

    public static void e() {
        try {
            Char.bI = false;
            Char.bG = false;
            bu.LoginScreen();
            x.c = false;
            bv.GameScreen = 0;
            bv.q = 0;
            Char.g();
            GameScreen.k();
            GameScreen.g();
            bp.c();
            Position eo2 = GameScreen.aD;
            eo2.b.LoginScreen();
            eo2 = GameScreen.aE;
            eo2.b.LoginScreen();
            GameScreen.aE.i = null;
            ae.m = null;
            MessageHandler.b = false;
            GameScreen.LoginScreen(-1, -1);
            GameScreen.bv.removeAllElements();
            GameScreen.j = 100;
            GameCanvas.G.B = 0;
            GameCanvas.G.ak = e ? -1 : 0;
            G.LoginScreen();
            H = null;
            GameScreen.GameService = true;
            cb.Res.removeAllElements();
            GameScreen.A.removeAllElements();
            GameScreen.B.removeAllElements();
            GameScreen.C.removeAllElements();
            bv.v.removeAllElements();
            WeatherEffect.LoginScreen.removeAllElements();
            ei.LoginScreen.removeAllElements();
            ea.m.removeAllElements();
            GameCanvas.F.LoginScreen = false;
            GameCanvas.G.LoginScreen = false;
            GameCanvas.G.k.removeAllElements();
            if (GameCanvas.G.j != null) {
                GameCanvas.G.j.k = false;
            }
            Session.LoginScreen().e();
            Session.b().e();
        }
        catch (Exception exception) {}
        ServerListScreen.v = true;
        ServerListScreen.MyHashtable = -1;
        ServerListScreen.u = true;
        if (ServerListScreen.n == -1) {
            al.b();
            return;
        }
        if (ak == null) {
            ak = new ServerListScreen();
        }
        ak.b();
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        en2.LoginScreen(n2);
        n2 = GameScreen.k;
        if (n2 > B) {
            n2 = B;
        }
        en2.d(0, n4 - (n7 != 0 ? n2 >> n7 : 0), n5, n6 + (n7 != 0 ? n2 >> n7 : 0));
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5) {
        block22: {
            try {
                int n6;
                int n7;
                int n8 = n2 - 1;
                if (n8 == N.length - 1 && (GameScreen.j().Screen || GameScreen.j().bR)) {
                    en2.LoginScreen(GameScreen.j().be);
                    en2.d(0, 0, A, B);
                    if (ad == 2 || ad == 4 || ad == 7) {
                        GameCanvas.d(en2);
                        GameCanvas.e(en2);
                    }
                    if (GameScreen.j().bR && !LoginScreen) {
                        du.LoginScreen(en2);
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
                        en2.LoginScreen(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                } else {
                    n6 = 0;
                    while (n6 < GameScreen.d) {
                        en2.LoginScreen(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                }
                if (n4 != -1) {
                    if (n8 == aO - 1) {
                        GameCanvas.isLowGraphic(en2, n4, 0, -(n7 >> n3), GameScreen.d, aM[n8], n3);
                    } else {
                        GameCanvas.isLowGraphic(en2, n4, 0, aM[n8 - 1] + Q[n8 - 1], GameScreen.d, aM[n8] - (aM[n8 - 1] + Q[n8 - 1]), n3);
                    }
                }
                if (n5 != -1) {
                    if (n8 == 0) {
                        GameCanvas.isLowGraphic(en2, n5, 0, aM[n8] + Q[n8], GameScreen.d, GameScreen.e - (aM[n8] + Q[n8]), n3);
                    } else {
                        GameCanvas.isLowGraphic(en2, n5, 0, aM[n8] + Q[n8], GameScreen.d, aM[n8 - 1] - (aM[n8] + Q[n8]) + 80, n3);
                    }
                }
                if (E == GameScreen.c) {
                    if (n2 == 1 && ad == 11 && bv.GameScreen == 0) {
                        en2.LoginScreen(aB, -(GameScreen.j >> aH[0]) + 400, aM[0] + 30 - (n7 >> 2), cj.c);
                    }
                    if (n2 == 1 && ad == 13) {
                        en2.LoginScreen(N[1], -(GameScreen.j >> aH[0]) + bv.LoginScreen * 24 / 4, aM[0] - (n7 >> 3) + 30, 0);
                        en2.LoginScreen(N[1], 0, 0, P[1], Q[1], 2, -(GameScreen.j >> aH[0]) + bv.LoginScreen * 24 / 4 + P[1], aM[0] - (n7 >> 3) + 30, 0);
                    }
                    if (n2 == 3 && bv.Res == 1) {
                        n6 = 0;
                        while (n6 < bv.d / mGraphics.b(aQ)) {
                            en2.LoginScreen(aQ, -(GameScreen.j >> aH[2]) + 300, n6 * mGraphics.b(aQ) - (n7 >> 3), 0);
                            ++n6;
                        }
                    }
                }
                n6 = -(GameScreen.j + aI[n8] >> aH[n8]);
                ei.LoginScreen(en2, n6, aM[n8] + Q[n8] - (n7 >> n3), n8);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void d(mGraphics en2) {
        if (aA != null) {
            en2.LoginScreen(aA, aD, aE, 0);
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
                    en2.LoginScreen(0xFFFFFF);
                    en2.d(0, 0, A, B);
                }
            }
        }
    }

    private static void e(mGraphics en2) {
        if (aB != null) {
            en2.LoginScreen(aB, aF, aG, 0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(mGraphics en2) {
        if (!aS) {
            en2.LoginScreen(0);
            en2.d(0, 0, A, B);
        }
        if (Char.bI) {
            return;
        }
        int n2 = GameScreen.d;
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.LoginScreen(0);
        en2.d(0, 0, A, B);
        try {
            if (az && !LoginScreen) {
                if (E == GameScreen.j()) {
                    if (bv.Res != 172 && (bv.Res == 137 || bv.Res == 115 || bv.Res == 117 || bv.Res == 118 || bv.Res == 120 || bv.j)) {
                        en2.LoginScreen(0);
                        en2.d(0, 0, A, B);
                        return;
                    }
                    if (bv.Res == 138) {
                        en2.LoginScreen(0x676767);
                        en2.d(0, 0, A, B);
                        return;
                    }
                }
                if (ad == 0) {
                    GameCanvas.isLowGraphic(en2, 4, 6, Char[3], aN[3]);
                    GameCanvas.isLowGraphic(en2, 3, 4, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 1) {
                    GameCanvas.isLowGraphic(en2, 4, 6, -1, -1);
                    GameCanvas.isLowGraphic(en2, 3, 3, -1, -1);
                    GameCanvas.isLowGraphic(en2, Char[2], 0, -(GameScreen.k >> 5), n2, aM[2], 5);
                    GameCanvas.isLowGraphic(en2, aN[2], 0, aM[2] + Q[2] - (GameScreen.k >> 3), n2, 70, 3);
                    GameCanvas.isLowGraphic(en2, 2, 2, -1, -1);
                    GameCanvas.isLowGraphic(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 2) {
                    GameCanvas.isLowGraphic(en2, 5, 10, Char[4], aN[4]);
                    GameCanvas.isLowGraphic(en2, 4, 8, -1, Char[2]);
                    GameCanvas.isLowGraphic(en2, 3, 5, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 2, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 3) {
                    int n3 = GameScreen.k - (325 - GameScreen.g);
                    en2.LoginScreen(0, -n3);
                    GameCanvas.isLowGraphic(en2, GameScreen.j().Screen || GameScreen.j().bR ? GameScreen.j().be : Char[2], 0, n3 - (GameScreen.k >> 3), n2, aM[2] - n3 + (GameScreen.k >> 3) + 100, 2);
                    GameCanvas.isLowGraphic(en2, 3, 2, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 0, -1, -1);
                    GameCanvas.isLowGraphic(en2, 1, 0, -1, aN[0]);
                    en2.LoginScreen(0, -en2.b());
                    return;
                }
                if (ad == 4) {
                    GameCanvas.isLowGraphic(en2, 4, 7, Char[3], -1);
                    GameCanvas.isLowGraphic(en2, 3, 3, -1, mGraphics.b > 1 ? aN[2] : Char[1]);
                    GameCanvas.isLowGraphic(en2, 2, 2, Char[1], aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 5) {
                    GameCanvas.isLowGraphic(en2, 4, 15, Char[3], -1);
                    GameCanvas.d(en2);
                    en2.LoginScreen(100, 10);
                    GameCanvas.d(en2);
                    en2.LoginScreen(-100, -10);
                    GameCanvas.e(en2);
                    GameCanvas.isLowGraphic(en2, 3, 10, -1, -1);
                    GameCanvas.isLowGraphic(en2, 2, 6, -1, -1);
                    GameCanvas.isLowGraphic(en2, 1, 4, -1, -1);
                    en2.LoginScreen(0, 27);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, -1);
                    en2.LoginScreen(0, 20);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    en2.LoginScreen(-en2.LoginScreen(), -en2.b());
                    return;
                }
                if (ad == 6) {
                    GameCanvas.isLowGraphic(en2, 5, 10, Char[4], aN[4]);
                    GameCanvas.d(en2);
                    GameCanvas.e(en2);
                    en2.LoginScreen(60, 40);
                    GameCanvas.e(en2);
                    en2.LoginScreen(-60, -40);
                    GameCanvas.isLowGraphic(en2, 4, 7, -1, aN[3]);
                    WeatherEffect.e(en2);
                    GameCanvas.isLowGraphic(en2, 3, 4, -1, -1);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 7) {
                    GameCanvas.isLowGraphic(en2, 4, 6, Char[3], aN[3]);
                    GameCanvas.isLowGraphic(en2, 3, 5, -1, -1);
                    GameCanvas.isLowGraphic(en2, 2, 4, -1, -1);
                    GameCanvas.isLowGraphic(en2, 1, 3, -1, aN[0]);
                    return;
                }
                if (ad == 8) {
                    GameCanvas.isLowGraphic(en2, 4, 8, Char[3], aN[3]);
                    GameCanvas.d(en2);
                    GameCanvas.e(en2);
                    GameCanvas.isLowGraphic(en2, 3, 4, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 2, -1, aN[1]);
                    if ((bv.Res >= 92 && bv.Res <= 96 || bv.Res == 51 || bv.Res == 52) && E != I) return;
                    GameCanvas.isLowGraphic(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 9) {
                    GameCanvas.isLowGraphic(en2, 4, 8, Char[3], aN[3]);
                    GameCanvas.d(en2);
                    GameCanvas.e(en2);
                    en2.LoginScreen(-80, 20);
                    GameCanvas.e(en2);
                    en2.LoginScreen(80, -20);
                    WeatherEffect.e(en2);
                    GameCanvas.isLowGraphic(en2, 3, 5, -1, -1);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, -1);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 10) {
                    int n4 = GameScreen.k - (380 - GameScreen.g);
                    en2.LoginScreen(0, -n4);
                    GameCanvas.isLowGraphic(en2, GameScreen.j().Screen ? GameScreen.j().be : Char[1], 0, n4 - (GameScreen.k >> 2), n2, aM[1] - n4 + (GameScreen.k >> 2) + 100, 2);
                    GameCanvas.isLowGraphic(en2, 2, 2, -1, aN[1]);
                    GameCanvas.d(en2);
                    GameCanvas.e(en2);
                    GameCanvas.isLowGraphic(en2, 1, 0, -1, -1);
                    en2.LoginScreen(0, -en2.b());
                    return;
                }
                if (ad == 11) {
                    GameCanvas.isLowGraphic(en2, 3, 6, Char[2], aN[2]);
                    GameCanvas.d(en2);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 12) {
                    en2.LoginScreen(9161471);
                    en2.d(0, 0, A, B);
                    GameCanvas.isLowGraphic(en2, 3, 4, -1, 0xDBFFFF);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, 0xDBFFFF);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, 0xDBFFFF);
                    return;
                }
                if (ad == 13) {
                    en2.LoginScreen(0xE8F8F8);
                    en2.d(0, 0, A, B);
                    GameCanvas.isLowGraphic(en2, 1, 5, -1, 0xE8F8F8);
                    return;
                }
                if (ad == 15) {
                    en2.LoginScreen(0x282848);
                    en2.d(0, 0, A, B);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 16) {
                    GameCanvas.isLowGraphic(en2, 4, 6, Char[3], aN[3]);
                    int n5 = 0;
                    while (n5 < aC.length) {
                        en2.LoginScreen(aC[n5], Mob[n5], ab[n5], 33);
                        ++n5;
                    }
                    GameCanvas.isLowGraphic(en2, 3, 4, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 19) {
                    GameCanvas.isLowGraphic(en2, 5, 10, Char[4], aN[4]);
                    GameCanvas.isLowGraphic(en2, 4, 8, -1, Char[2]);
                    GameCanvas.isLowGraphic(en2, 3, 5, -1, aN[2]);
                    GameCanvas.isLowGraphic(en2, 2, 2, -1, aN[1]);
                    GameCanvas.isLowGraphic(en2, 1, 1, -1, aN[0]);
                    return;
                }
                GameCanvas.isLowGraphic(en2, aN[3], 0, aM[3] + Q[3], GameScreen.d, aM[2] + Q[2], 6);
                GameCanvas.isLowGraphic(en2, 4, 6, Char[3], aN[3]);
                GameCanvas.d(en2);
                GameCanvas.isLowGraphic(en2, 3, 4, -1, aN[2]);
                GameCanvas.isLowGraphic(en2, 2, 3, -1, aN[1]);
                GameCanvas.isLowGraphic(en2, 1, 2, -1, aN[0]);
                return;
            }
            en2.LoginScreen(2315859);
            en2.d(0, 0, A, B);
            if (aR == null) return;
            int n6 = -((GameScreen.j >> 2) % mGraphics.LoginScreen(aR));
            while (n6 < GameScreen.d) {
                en2.LoginScreen(aR, n6, (GameScreen.k >> 3) + B / 2 - 50, 0);
                n6 += mGraphics.LoginScreen(aR);
            }
            en2.LoginScreen(5084791);
            en2.d(0, (GameScreen.k >> 3) + B / 2 - 50 + mGraphics.b(aR), n2, B);
            return;
        }
        catch (Exception exception) {
            en2.LoginScreen(0);
            en2.d(0, 0, A, B);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void b(int var0) {
        try {
            var1_1 = GameScreen.g;
            switch (var0) {
                case 0: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 70;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 20;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 30;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 50;
                    return;
                }
                case 1: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 120;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 40;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - 90;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - 25;
                    return;
                }
                case 2: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 150;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] - 60;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] - 40;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] - 10;
                    GameCanvas.aM[4] = GameCanvas.aM[3] - GameCanvas.Q[4];
                    return;
                }
                case 3: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 10;
                    GameCanvas.aM[1] = GameCanvas.aM[0] + 80;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] - 10;
                    return;
                }
                case 4: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 130;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1];
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] - 20;
                    GameCanvas.aM[3] = GameCanvas.aM[1] - GameCanvas.Q[2] - 80;
                    return;
                }
                case 5: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 40;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 10;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 15;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 50;
                    return;
                }
                case 6: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 100;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] - 30;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 10;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 15;
                    GameCanvas.aM[4] = GameCanvas.aM[3] - GameCanvas.Q[4] + 15;
                    return;
                }
                case 7: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 20;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 15;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 20;
                    GameCanvas.aM[3] = GameCanvas.aM[1] - GameCanvas.Q[2] - 10;
                    return;
                }
                case 8: {
                    GameCanvas.aM[0] = var1_1 - 103 + 150;
                    if (bv.Res == 103) {
                        GameCanvas.aM[0] = GameCanvas.aM[0] - 100;
                    }
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] - 10;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 40;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 10;
                    return;
                }
                case 9: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 100;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 22;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 50;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3];
                    return;
                }
                case 10: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] - 45;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] - 10;
                    return;
                }
                case 11: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 60;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 5;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] - 15;
                    return;
                }
                case 12: {
                    GameCanvas.aM[0] = var1_1 + 40;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - 40;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - 40;
                    return;
                }
                case 13: {
                    GameCanvas.aM[0] = var1_1 - 80;
                    GameCanvas.aM[1] = GameCanvas.aM[0];
                    return;
                }
                case 15: {
                    GameCanvas.aM[0] = var1_1 - 20;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - 80;
                    return;
                }
                case 16: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 75;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 50;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 50;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 90;
                    return;
                }
                case 19: {
                    GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 150;
                    GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] - 60;
                    GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] - 40;
                    GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] - 10;
                    GameCanvas.aM[4] = GameCanvas.aM[3] - GameCanvas.Q[4];
                    return;
                }
            }
            GameCanvas.aM[0] = var1_1 - GameCanvas.Q[0] + 75;
            GameCanvas.aM[1] = GameCanvas.aM[0] - GameCanvas.Q[1] + 50;
            GameCanvas.aM[2] = GameCanvas.aM[1] - GameCanvas.Q[2] + 50;
            GameCanvas.aM[3] = GameCanvas.aM[2] - GameCanvas.Q[3] + 90;
            return;
        }
        catch (Exception v0) {
            var0 = 0;
            // while (var0 < GameCanvas.aM.length)
        }
// LABEL:
        // 1 sources

        {
            GameCanvas.aM[var0] = 1;
            ++var0;
            continue;
        }
lbl113:
        // 1 sources

    }

    public static void methodLoginScreen(int n2) {
        try {
            Object object;
            Object object2;
            aS = true;
            WeatherEffect.f = ad == 12 ? bv.d - 100 : bv.d - 160;
            ds.c("load bg id= " + n2 + "map ID= " + bv.Res);
            WeatherEffect.LoginScreen();
            GameCanvas.c(n2);
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
                    aQ = Res.loadImageFromRMS("/bg/caycot.png");
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
                    WeatherEffect.LoginScreen(3);
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
                    WeatherEffect.LoginScreen(9);
                    aO = 4;
                    break;
                }
                case 10: {
                    aO = 2;
                    break;
                }
                case 11: {
                    ae = 7;
                    GameCanvas.aH[2] = 0;
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
                    ds.c("HELL");
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
                O = cj.g[ad];
            } else {
                try {
                    String string = "/bg/b" + ad + 3 + ".png";
                    if (bv.GameScreen != 0) {
                        string = "/bg/b" + ad + 3 + "-" + bv.GameScreen + ".png";
                    }
                    object2 = new int[1];
                    object = Res.loadImageFromRMS(string);
                    object.getRGB(object2, 0, 1, mGraphics.c(object) / 2, 0, 1, 1);
                    O = object2[0];
                }
                catch (Exception exception) {
                    O = cj.g[cj.g.length - 1];
                }
            }
            Char = new int[cj.g.length];
            aN = new int[cj.g.length];
            int n3 = 0;
            while (n3 < cj.g.length) {
                GameCanvas.Char[n3] = cj.g[n3];
                GameCanvas.aN[n3] = cj.g[n3];
                ++n3;
            }
            if (LoginScreen) {
                aR = Res.loadImageFromRMS("/bg/b63.png");
                return;
            }
            N = new Image[aO];
            P = new int[aO];
            Q = new int[aO];
            aN = new int[aO];
            Char = new int[aO];
            if (bv.GameScreen == 100) {
                GameCanvas.N[0] = Res.loadImageFromRMS("/bg/b100.png");
                GameCanvas.N[1] = Res.loadImageFromRMS("/bg/b100.png");
                GameCanvas.N[2] = Res.loadImageFromRMS("/bg/b82-1.png");
                GameCanvas.N[3] = Res.loadImageFromRMS("/bg/b93.png");
                n3 = 0;
                while (n3 < aO) {
                    if (N[n3] != null) {
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, mGraphics.c(N[n3]) / 2, 0, 1, 1);
                        GameCanvas.Char[n3] = object2[0];
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, mGraphics.c(N[n3]) / 2, mGraphics.d(N[n3]) - 1, 1, 1);
                        GameCanvas.aN[n3] = object2[0];
                        GameCanvas.P[n3] = mGraphics.LoginScreen(N[n3]);
                        GameCanvas.Q[n3] = mGraphics.b(N[n3]);
                    } else if (aO > 1) {
                        GameCanvas.N[n3] = Res.loadImageFromRMS("/bg/b" + ad + "0.png");
                        GameCanvas.P[n3] = mGraphics.LoginScreen(N[n3]);
                        GameCanvas.Q[n3] = mGraphics.b(N[n3]);
                    }
                    ++n3;
                }
            } else {
                n3 = 0;
                while (n3 < aO) {
                    object2 = "/bg/b" + ad + n3 + ".png";
                    if (bv.GameScreen != 0) {
                        object2 = "/bg/b" + ad + n3 + "-" + bv.GameScreen + ".png";
                    }
                    GameCanvas.N[n3] = Res.loadImageFromRMS((String)object2);
                    if (N[n3] != null) {
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, mGraphics.c(N[n3]) / 2, 0, 1, 1);
                        GameCanvas.Char[n3] = (int)object[0];
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, mGraphics.c(N[n3]) / 2, mGraphics.d(N[n3]) - 1, 1, 1);
                        GameCanvas.aN[n3] = (int)object[0];
                        GameCanvas.P[n3] = mGraphics.LoginScreen(N[n3]);
                        GameCanvas.Q[n3] = mGraphics.b(N[n3]);
                    } else if (aO > 1) {
                        GameCanvas.N[n3] = Res.loadImageFromRMS("/bg/b" + ad + "0.png");
                        GameCanvas.P[n3] = mGraphics.LoginScreen(N[n3]);
                        GameCanvas.Q[n3] = mGraphics.b(N[n3]);
                    }
                    ++n3;
                }
            }
            GameCanvas.b(ad);
            ds.c("5");
            Mob = new int[]{GameScreen.d / 2 - 40, GameScreen.d / 2 + 40, GameScreen.d / 2 - 100, GameScreen.d / 2 - 80, GameScreen.d / 2 - 120};
            ab = new int[]{130, 100, 150, 140, 80};
            aC = null;
            if (ad != 0) {
                if (ad == 2) {
                    aA = Res.loadImageFromRMS("/bg/sun0.png");
                    aD = GameScreen.d / 2 + 50;
                    aE = aM[4] - 40;
                    bv.Item = Res.loadImageFromRMS("/tWater/wts");
                } else if (ad == 19) {
                    bv.Item = Res.loadImageFromRMS("/tWater/water_flow_32");
                } else if (ad == 4) {
                    aA = Res.loadImageFromRMS("/bg/sun2.png");
                    aD = GameScreen.d / 2 + 30;
                    aE = aM[3];
                } else if (ad == 7) {
                    aA = Res.loadImageFromRMS("/bg/sun3" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun4" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[3] - 80;
                    aF = aD - 100;
                    aG = aM[3] - 30;
                } else if (ad == 6) {
                    aA = Res.loadImageFromRMS("/bg/sun5" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun6" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[4];
                    aF = aD - 100;
                    aG = aM[4] + 20;
                } else if (n2 == 5) {
                    aA = Res.loadImageFromRMS("/bg/sun8" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun7" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 50;
                    aE = aM[3] + 20;
                    aF = GameScreen.d / 2 + 20;
                    aG = aM[3] - 30;
                } else if (ad == 8 && bv.Res < 90) {
                    aA = Res.loadImageFromRMS("/bg/sun9" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun10" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 30;
                    aE = aM[3] + 60;
                    aF = GameScreen.d / 2 + 20;
                    aG = aM[3] + 10;
                } else if (n2 == 9) {
                    aA = Res.loadImageFromRMS("/bg/sun11" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun12" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[4] + 20;
                    aF = aD - 80;
                    aG = aM[4] + 40;
                } else if (n2 == 10) {
                    aA = Res.loadImageFromRMS("/bg/sun13" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/sun14" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d - GameScreen.d / 3;
                    aE = aM[1] - 30;
                    aF = aD - 80;
                    aG = aM[1];
                } else if (n2 == 11) {
                    aA = Res.loadImageFromRMS("/bg/sun15" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aB = Res.loadImageFromRMS("/bg/b113" + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    aD = GameScreen.d / 2 - 30;
                    aE = aM[2] - 30;
                } else if (n2 == 12) {
                    ab = new int[]{200, 170, 220, 150, 250};
                } else if (n2 == 16) {
                    Mob = new int[]{90, 170, 250, 320, 400, 450, 500};
                    ab = new int[]{aM[2] + 5, aM[2] - 20, aM[2] - 50, aM[2] - 30, aM[2] - 50, aM[2], aM[2] - 40};
                    aC = new Image[7];
                    n3 = 0;
                    while (n3 < aC.length) {
                        int n4 = 160;
                        if (n3 == 1 || n3 == 3) {
                            n4 = 161;
                        }
                        GameCanvas.aC[n3] = Res.loadImageFromRMS("/bg/sun" + n4 + ".png");
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
                    aA = Res.loadImageFromRMS("/bg/sun" + n2 + (bv.GameScreen == 0 ? "" : "-" + bv.GameScreen) + ".png");
                    if (Res.loadImageFromRMS("/tWater/water_flow_" + n2) != null) {
                        bv.Item = Res.loadImageFromRMS("/tWater/water_flow_" + n2);
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
            if (n2 == aP[n3] && (n4 = ds.b(0, 2)) == 0) {
                WeatherEffect.LoginScreen(0);
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
            K.LoginScreen(n2);
            ag = 0;
            return;
        }
        E.LoginScreen(n2);
        switch (n2) {
            case 48: {
                GameCanvas.j[0] = true;
                GameCanvas.i[0] = true;
                return;
            }
            case 49: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[1] = true;
                    GameCanvas.i[1] = true;
                }
                return;
            }
            case 51: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[3] = true;
                    GameCanvas.i[3] = true;
                }
                return;
            }
            case 55: {
                GameCanvas.j[7] = true;
                GameCanvas.i[7] = true;
                return;
            }
            case 57: {
                GameCanvas.j[9] = true;
                GameCanvas.i[9] = true;
                return;
            }
            case 42: {
                GameCanvas.j[10] = true;
                GameCanvas.i[10] = true;
                return;
            }
            case 35: {
                GameCanvas.j[11] = true;
                GameCanvas.i[11] = true;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.j[12] = true;
                GameCanvas.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.j[13] = true;
                GameCanvas.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                if (E instanceof GameScreen || E instanceof ar) {
                    Char.e();
                }
                GameCanvas.j[5] = true;
                GameCanvas.i[5] = true;
                return;
            }
            case -38: 
            case -1: {
                if (E instanceof GameScreen || E instanceof ar) {
                    Char.e();
                }
                GameCanvas.j[2] = true;
                GameCanvas.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                if (E instanceof GameScreen || E instanceof ar) {
                    Char.e();
                }
                GameCanvas.j[8] = true;
                GameCanvas.i[8] = true;
                return;
            }
            case -3: {
                if (E instanceof GameScreen || E instanceof ar) {
                    Char.e();
                }
                GameCanvas.j[4] = true;
                GameCanvas.i[4] = true;
                return;
            }
            case -4: {
                if (E instanceof GameScreen || E instanceof ar) {
                    Char.e();
                }
                GameCanvas.j[6] = true;
                GameCanvas.i[6] = true;
                return;
            }
            case 50: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[2] = true;
                    GameCanvas.i[2] = true;
                }
                return;
            }
            case 52: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[4] = true;
                    GameCanvas.i[4] = true;
                }
                return;
            }
            case 54: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[6] = true;
                    GameCanvas.i[6] = true;
                }
                return;
            }
            case 56: {
                if (E == ar.LoginScreen || E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[8] = true;
                    GameCanvas.i[8] = true;
                }
                return;
            }
            case 53: {
                if (E != ar.LoginScreen && (E != GameScreen.c || !c || cq.b().b)) break;
                GameCanvas.j[5] = true;
                GameCanvas.i[5] = true;
            }
        }
    }

    public final void keyReleased(int n2) {
        ag = 0;
        switch (n2) {
            case 48: {
                GameCanvas.j[0] = false;
                GameCanvas.ap[0] = true;
                return;
            }
            case 49: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[1] = false;
                    GameCanvas.ap[1] = true;
                }
                return;
            }
            case 51: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[3] = false;
                    GameCanvas.ap[3] = true;
                }
                return;
            }
            case 55: {
                GameCanvas.j[7] = false;
                GameCanvas.ap[7] = true;
                return;
            }
            case 57: {
                GameCanvas.j[9] = false;
                GameCanvas.ap[9] = true;
                return;
            }
            case 42: {
                GameCanvas.j[10] = false;
                GameCanvas.ap[10] = true;
                return;
            }
            case 35: {
                GameCanvas.j[11] = false;
                GameCanvas.ap[11] = true;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.j[12] = false;
                GameCanvas.ap[12] = true;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.j[13] = false;
                GameCanvas.ap[13] = true;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.j[5] = false;
                GameCanvas.ap[5] = true;
                return;
            }
            case -38: 
            case -1: {
                GameCanvas.j[2] = false;
                return;
            }
            case -39: 
            case -2: {
                GameCanvas.j[8] = false;
                return;
            }
            case -3: {
                GameCanvas.j[4] = false;
                return;
            }
            case -4: {
                GameCanvas.j[6] = false;
                return;
            }
            case 50: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[2] = false;
                    GameCanvas.ap[2] = true;
                }
                return;
            }
            case 52: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[4] = false;
                    GameCanvas.ap[4] = true;
                }
                return;
            }
            case 54: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[6] = false;
                    GameCanvas.ap[6] = true;
                }
                return;
            }
            case 56: {
                if (E == GameScreen.c && c && !cq.b().b) {
                    GameCanvas.j[8] = false;
                    GameCanvas.ap[8] = true;
                }
                return;
            }
            case 53: {
                if (E != GameScreen.c || !c || cq.b().b) break;
                GameCanvas.j[5] = false;
                GameCanvas.ap[5] = true;
            }
        }
    }

    public final void methodLoginScreen(int n2, int n3) {
        o = false;
        if (ds.g(n2 - MyHashtable) >= 10 || ds.g(n3 - u) >= 10) {
            Res = false;
            k = true;
            n = true;
        }
        GameScreen = n2;
        q = n3;
        if (++at > 3) {
            at = 0;
        }
        GameCanvas.v[GameCanvas.at] = new be(n2, n3);
    }

    public final void b(int n2, int n3) {
        o = false;
        m = false;
        ai = true;
        k = true;
        Res = false;
        n = false;
        aT = System.currentTimeMillis();
        r = n2;
        SessionReceiver = n3;
        MyHashtable = n2;
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
        Res = true;
        Screen.cs = -1;
        GameScreen = n2;
        q = n3;
    }

    public static boolean methodLoginScreen(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return GameScreen >= n2 && GameScreen <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public static void f() {
        int n2 = 0;
        while (n2 < i.length) {
            GameCanvas.i[n2] = false;
            ++n2;
        }
        m = false;
    }

    public static void g() {
        int n2 = 0;
        while (n2 < j.length) {
            GameCanvas.j[n2] = false;
            ++n2;
        }
    }

    public final void paint(Graphics object) {
        Object object2;
        this.au.LoginScreen = object;
        T.removeAllElements();
        if (E != null) {
            E.LoginScreen(this.au);
        }
        this.au.LoginScreen(-this.au.LoginScreen(), -this.au.b());
        this.au.e(0, 0, A, B);
        if (GameCanvas.G.LoginScreen) {
            G.LoginScreen(this.au);
            if (H != null && GameCanvas.H.LoginScreen) {
                H.LoginScreen(this.au);
            }
            if (GameCanvas.G.o != null && GameCanvas.G.o.b) {
                GameCanvas.G.o.LoginScreen(this.au);
            }
            if (H != null && GameCanvas.H.o != null && GameCanvas.H.o.b) {
                GameCanvas.H.o.LoginScreen(this.au);
            }
        }
        if (GameScreen.bP) {
            ds.LoginScreen(this.au);
        }
        bp.LoginScreen(this.au);
        if (K != null) {
            K.LoginScreen(this.au);
        } else if (GameCanvas.F.LoginScreen) {
            GameCanvas.isLowGraphic(this.au);
            F.LoginScreen(this.au);
        }
        GameScreen.aD.LoginScreen(this.au);
        GameScreen.aE.LoginScreen(this.au);
        if (GameScreen.j().bQ != null) {
            GameScreen.j().bQ.LoginScreen(this.au);
        }
        if (ae.m != null) {
            ae.m.LoginScreen(this.au);
        }
        object = this.au;
        if (ae.n == null && !Char.e().MyHashtable && !Char.e().SessionReceiver) {
            object2 = object;
            try {
                if (v.m && (v.LoginScreen <= GameScreen.j || v.LoginScreen >= GameScreen.j + GameScreen.d || v.b <= GameScreen.k || v.b >= GameScreen.k + GameScreen.e) && w % 10 >= 5 && ae.m == null && ae.n == null && !GameCanvas.G.LoginScreen && v.j) {
                    int n2 = v.LoginScreen - Char.e().B;
                    int n3 = v.b - Char.e().C;
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    if (n2 > 0 && n3 >= 0) {
                        if (ds.g(n2) >= ds.g(n3)) {
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
                        if (ds.g(n2) >= ds.g(n3)) {
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
                        if (ds.g(n2) >= ds.g(n3)) {
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
                        if (ds.g(n2) >= ds.g(n3)) {
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
                    GameScreen.c((mGraphics)object2);
                    ((mGraphics)object2).LoginScreen(GameScreen.bw, 0, 0, 13, 16, n6, n4, n5, cj.f);
                }
            }
            catch (Exception exception) {}
            if (!(GameCanvas.F.e != 0 || !v.i || ae.q != null || Char.bG || E != GameScreen.j() || GameCanvas.G.LoginScreen && GameCanvas.G.Item != 0)) {
                if (v.j) {
                    ((mGraphics)object).LoginScreen(-GameScreen.j, -GameScreen.k);
                }
                if (v.k == 0) {
                    ((mGraphics)object).LoginScreen(g.i, v.LoginScreen - 15, v.b, 0);
                }
                if (v.k == 1) {
                    ((mGraphics)object).LoginScreen(g.i, 0, 0, 14, 16, 2, v.LoginScreen + 15, v.b, cj.b);
                }
                if (v.Res) {
                    ((mGraphics)object).LoginScreen(ItemMap.f, v.LoginScreen, v.b, 3);
                }
                ((mGraphics)object).LoginScreen(-((mGraphics)object).LoginScreen(), -((mGraphics)object).b());
            }
        }
        if (ae.n != null) {
            ae.n.LoginScreen(this.au);
        }
        int n7 = 0;
        while (n7 < dc.x.size()) {
            object2 = (dc)dc.x.elementAt(n7);
            if (object2 instanceof ae && !object2.equals(ae.m) && !object2.equals(ae.n)) {
                ((dc)object2).LoginScreen(this.au);
            }
            ++n7;
        }
        if (K != null) {
            K.LoginScreen(this.au);
        }
        if (Char.bI || x.c || ServerListScreen.m || am.LoginScreen) {
            mGraphics en2 = this.au;
            String string = "";
            GameCanvas.isLowGraphic(en2);
            en2.LoginScreen(0);
            en2.d(0, 0, A, B);
            en2.LoginScreen(x.j, A / 2, B / 2 - 24, cj.c);
            GameCanvas.isLowGraphic(C, B / 2 + 24, en2);
            mFont.c.LoginScreen(en2, String.valueOf(T.aC) + (x.k > 0 ? " " + x.k + "SessionReceiver" : string), A / 2, B / 2, 2);
            if (bl > 0 && x.k <= 0 && Res.currentTimeMillis() - bk >= 1000L) {
                if (--bl == 0) {
                    bl = 15;
                }
                bk = Res.currentTimeMillis();
            }
        }
        GameCanvas.isLowGraphic(this.au);
        ei.d(this.au);
        if (an && !d) {
            if (E == I || E == ak || E == al) {
                this.au.LoginScreen(ah, 5, 5, 0);
            }
            if (E == cw.LoginScreen) {
                this.au.LoginScreen(ah, C, 5, 0);
            }
        }
        int n8 = 0;
        while (n8 < ba.size()) {
            object2 = (String)ba.elementAt(n8);
            mFont.LoginScreen.LoginScreen(this.au, (String)object2, A, B - this.Screen - n8 * this.Screen, 1);
            mFont.c.LoginScreen(this.au, (String)object2, A - 1, B - this.Screen - n8 * this.Screen - 1, 1);
            ++n8;
        }
        GameCanvas.isLowGraphic(this.au);
        n8 = B / 4;
        if (E != null && E instanceof GameScreen && aY != null) {
            this.au.e(60, n8, A - 120, mFont.SessionReceiver.LoginScreen() + 2);
            mFont.o.LoginScreen(this.au, aY, aZ, n8 + 1, 0);
            mFont.n.LoginScreen(this.au, aY, aZ, n8, 0);
            this.au.e(0, 0, A, B);
        }
    }

    public static void methodItem() {
        K = null;
        bp.c();
    }

    public static void methodLoginScreen(String string) {
        L.LoginScreen(string, null, new de(T.ServerListScreen, Item, 8882, null), null);
        K = L;
    }

    public static void b(String string) {
        L.LoginScreen(string, null, new de(T.bv, Item, 8882, null), null);
        K = L;
        GameCanvas.L.LoginScreen = true;
    }

    public static void c(String string) {
        L.LoginScreen(string, null, new de(T.bv, Item, 8882, null), null);
        K = L;
        GameCanvas.L.LoginScreen = true;
    }

    public static void i() {
        Char.bI = true;
    }

    public static void methodLoginScreen(String string, int n2, Object object) {
        L.LoginScreen(string, null, new de(T.ServerListScreen, Item, n2, null), null);
        L.c();
    }

    public static void methodLoginScreen(String string, de de2, de de3) {
        L.LoginScreen(string, de2, null, de3);
        L.c();
    }

    public final void sizeChanged(int n2, int n3) {
    }

    public final boolean methodLoginScreen(int n2, int n3, int n4) {
        if (LoginScreen) {
            return false;
        }
        int n5 = n2 = n2 == 1 ? 0 : 1;
        if (this.be[n2] != -1) {
            return false;
        }
        this.be[n2] = 0;
        this.bc[n2] = n3;
        this.bd[n2] = n4;
        return true;
    }

    private static void o() {
        if (LoginScreen) {
            return;
        }
        bg = new Image[3];
        int n2 = 0;
        while (n2 < 3) {
            GameCanvas.bg[n2] = Res.loadImage("/e/w" + n2 + ".png");
            ++n2;
        }
        int[] nArray = new int[2];
        bf = nArray;
        GameCanvas.bf[1] = -1;
        nArray[0] = -1;
    }

    public final void j() {
        if (LoginScreen) {
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
                    this.bd[n6] = this.bd[n6] - 1;
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

    public static void methodLoginScreen(int n2, int n3, mGraphics en2) {
        int n4 = aq % (Res.clientType == 7 ? 8 : 9);
        if (++aq == 1000) {
            aq = 0;
        }
        en2.LoginScreen(bh, 0, n4 << 4, 16, 16, 0, n2, n3, 3);
    }

    public final void k() {
        this.bj = true;
    }

    public static boolean b(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return GameScreen >= n2 && GameScreen <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public final void methodLoginScreen(int n2, Object object) {
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
                SplashScreen.b = null;
                bl.LoginScreen();
                System.gc();
                ServerListScreen.o = true;
                ServerListScreen.u = true;
                GameScreen.j().Res();
                if (E == I) break;
                ak.g();
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
                GameCanvas.b();
                GameService.LoginScreen().c();
                I.LoginScreen();
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
                ServerListScreen.v = false;
                return;
            }
            case 8884: {
                K = null;
                bp.c();
                if (al == null) {
                    al = new eu();
                }
                al.b();
                return;
            }
            case 8885: {
                GameMidlet.f.LoginScreen();
                return;
            }
            case 8886: {
                K = null;
                bp.c();
                String string = (String)object;
                GameService.LoginScreen().c(string);
                return;
            }
            case 8887: {
                K = null;
                bp.c();
                n2 = (Integer)object;
                GameService.LoginScreen().m(n2);
                return;
            }
            case 8888: {
                n2 = (Integer)object;
                GameService.LoginScreen().n(n2);
                K = null;
                bp.c();
                return;
            }
            case 8889: {
                String string = (String)object;
                K = null;
                bp.c();
                GameService.LoginScreen().d(string);
                return;
            }
            case 88810: {
                n2 = (Integer)object;
                K = null;
                bp.c();
                GameService.LoginScreen().k(n2);
                return;
            }
            case 88811: {
                K = null;
                bp.c();
                GameService.LoginScreen().i();
                return;
            }
            case 88814: {
                Item[] hArray = (Item[])object;
                K = null;
                bp.c();
                GameService.LoginScreen().LoginScreen(hArray);
                return;
            }
            case 88815: {
                return;
            }
            case 88817: {
                ae.c("", 1, Char.e().aT);
                GameService.LoginScreen().LoginScreen(Char.e().aT.df.LoginScreen, GameCanvas.F.b, 0);
                return;
            }
            case 88818: {
                n2 = ((Short)object).shortValue();
                GameService.LoginScreen().LoginScreen((short)n2, null.LoginScreen.d());
                K = null;
                bp.c();
                return;
            }
            case 88819: {
                n2 = ((Short)object).shortValue();
                GameService.LoginScreen().b((short)n2);
                return;
            }
            case 88820: {
                String[] stringArray = (String[])object;
                if (Char.e().aT == null) {
                    return;
                }
                object = new Integer(GameCanvas.F.b);
                if (stringArray.length > 1) {
                    MyVector el2 = new MyVector("vSub");
                    int n3 = 0;
                    while (n3 < stringArray.length - 1) {
                        el2.addElement(new de(stringArray[n3 + 1], Item, 88821, object));
                        ++n3;
                    }
                    F.LoginScreen(el2);
                    return;
                }
                ae.c("", 1, Char.e().aT);
                GameService.LoginScreen().LoginScreen(Char.e().aT.df.LoginScreen, ((Integer)object).intValue(), 0);
                return;
            }
            case 88821: {
                int n4 = (Integer)object;
                ae.c("", 1, Char.e().aT);
                GameService.LoginScreen().LoginScreen(Char.e().aT.df.LoginScreen, n4, GameCanvas.F.b);
                return;
            }
            case 88822: {
                ae.c("", 1, Char.e().aT);
                GameService.LoginScreen().LoginScreen(Char.e().aT.df.LoginScreen, GameCanvas.F.b, 0);
                return;
            }
            case 88823: {
                GameCanvas.isLowGraphic(T.K);
                return;
            }
            case 88824: {
                GameCanvas.isLowGraphic(T.L);
                return;
            }
            case 88825: {
                GameCanvas.c(T.M);
                return;
            }
            case 88826: {
                GameCanvas.c(T.N);
                return;
            }
            case 88827: {
                GameCanvas.isLowGraphic(T.O);
                return;
            }
            case 88828: {
                GameCanvas.isLowGraphic(T.P);
                return;
            }
            case 88829: {
                String string = null.LoginScreen.d();
                if (string.equals("")) {
                    return;
                }
                GameService.LoginScreen().b(string, (int)((Integer)object));
                bp.LoginScreen();
                return;
            }
            case 88836: {
                null.LoginScreen.b(6);
                ((j)null).LoginScreen(T.S, new de(T.bu, Item, 888361, null), 1);
                return;
            }
            case 888361: {
                String string = null.LoginScreen.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    GameCanvas.isLowGraphic(T.Q);
                    return;
                }
                try {
                    GameService.LoginScreen().q(Integer.parseInt(string));
                    return;
                }
                catch (Exception exception) {
                    GameCanvas.isLowGraphic(T.R);
                    return;
                }
            }
            case 88837: {
                String string = null.LoginScreen.d();
                K = null;
                bp.c();
                try {
                    GameService.LoginScreen().SessionReceiver(Integer.parseInt(string.trim()));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88839: {
                String string = null.LoginScreen.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    GameCanvas.isLowGraphic(T.Q);
                    return;
                }
                try {
                    String string2 = string;
                    string = null;
                    int n5 = 8882;
                    object = string2;
                    n5 = 888391;
                    String string3 = T.ah;
                    L.LoginScreen(string3, new de(T.ImageLoader, Item, 888391, object), new de("", Item, 888391, object), new de(T.bo, Item, 8882, null));
                    L.c();
                    return;
                }
                catch (Exception exception) {
                    GameCanvas.isLowGraphic(T.R);
                    return;
                }
            }
            case 888391: {
                String string = (String)object;
                K = null;
                bp.c();
                GameService.LoginScreen().r(Integer.parseInt(string));
                return;
            }
            case 888392: {
                GameService.LoginScreen().LoginScreen(4, GameCanvas.F.b, 0);
                return;
            }
            case 888393: {
                I.LoginScreen();
                return;
            }
            case 888394: {
                K = null;
                bp.c();
                return;
            }
            case 888395: {
                if (E.equals(SplashScreen.LoginScreen) || E.equals(ak)) {
                    ak.b();
                } else {
                    I.b();
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
                if (ServerListScreen.u) {
                    ak.b();
                    return;
                }
                ak.j();
                return;
            }
            case 101026: {
                Res.loadImage(true);
                return;
            }
            case 100001: {
                GameService.LoginScreen().b((byte)0, (byte)-1);
                bp.LoginScreen();
                return;
            }
            case 100002: {
                if (I == null) {
                    I = new x();
                }
                x.g();
                return;
            }
            case 100003: {
                return;
            }
            case 100004: {
                return;
            }
            case 100005: {
                if (Char.e().H == 14) {
                    GameCanvas.isLowGraphic(T.ex);
                    return;
                }
                GameService.LoginScreen().Item();
                return;
            }
            case 100006: {
                Res.loadImage(true);
                return;
            }
            case 100016: {
                ServerListScreen.LoginScreen(17, false);
                GameCanvas.e();
                ServerListScreen.m = true;
                K = null;
                bp.c();
            }
        }
    }

    public static void Res() {
        Res = false;
        k = false;
        ai = false;
        m = false;
        o = false;
        GameScreen.j().aU = 0L;
        GameScreen.j().aT = false;
    }
}

