/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class ar
extends Screen
implements b {
    public static ar LoginScreen;
    private eb[] f;
    byte b = 0;
    private byte g;
    private int Item;
    private int i;
    private int j;
    private int k;
    private int Res;
    private int m;
    private int n;
    private int o;
    int c;
    private int GameScreen;
    private int q;
    private int r;
    private int SessionReceiver;
    private int MyHashtable;
    private int u;
    private int v;
    private int w = 0;
    private int x = 0;
    private int Message;
    private int z;
    private int[] A;
    private int[] B;
    private int[] C;
    private int[] D;
    private short[] E;
    private long F;
    private long G;
    private boolean H;
    private boolean I;
    private boolean J;
    private short K;
    private static int L;
    private static int[] M;
    private static df N;
    private static df O;
    private static Image P;
    private static Image Q;
    public static boolean d;
    public static boolean e;
    private byte[] R = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
    private byte[] S;

    static {
        d = false;
        e = false;
    }

    public ar() {
        byte[] byArray = new byte[12];
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 2;
        byArray[8] = 2;
        byArray[9] = 3;
        byArray[10] = 3;
        byArray[11] = 3;
        this.S = byArray;
        int[] nArray = new int[3];
        M = nArray;
        nArray[0] = 16;
        L = GameCanvas.B - 41;
        ar.M[1] = GameCanvas.A - 40;
        ar.M[2] = (M[0] + M[1]) / 2;
        Image image = Res.loadImage("/e/e_1.png");
        N = new df(image, 30, 30);
        image = Res.loadImage("/e/e_0.png");
        O = new df(image, 68, 65);
        image = Res.loadImage("/e/e_2.png");
        new df(image, 66, 70);
        Q = Res.loadImage("/e/nut2.png");
        P = Res.loadImage("/e/nut3.png");
        this.SessionReceiver = 230;
        this.q = GameCanvas.C - this.SessionReceiver / 2;
        this.MyHashtable = 40;
        this.r = -this.MyHashtable;
    }

    public static ar LoginScreen() {
        if (LoginScreen == null) {
            LoginScreen = new ar();
        }
        return LoginScreen;
    }

    public final void methodLoginScreen(short[] sArray, byte by2, int n2, short s2) {
        if (sArray == null || sArray.length <= 0) {
            return;
        }
        this.n = Char.e().C - 10;
        Object object = this;
        this.Item = GameCanvas.D / 3 + 10;
        if (((ar)object).Item > 50) {
            ((ar)object).Item = 50;
        }
        ((ar)object).i = 360;
        GameScreen.j = GameScreen.n / 2;
        ((ar)object).j = GameScreen.k + GameCanvas.D / 3 + 30;
        ((ar)object).m = 175;
        ((ar)object).k = 0;
        ((ar)object).Res = 360 / ((ar)object).m;
        ((ar)object).A = new int[((ar)object).m];
        ((ar)object).B = new int[((ar)object).m];
        ((ar)object).C = new int[((ar)object).m];
        ((ar)object).D = new int[((ar)object).m];
        ar ar2 = object;
        if (!GameCanvas.isLowGraphic) {
            int n3 = 0;
            while (n3 < ar2.B.length) {
                ar2.B[n3] = ds.g(ar2.Item * ds.LoginScreen(ar2.k) / 1024);
                ar2.A[n3] = ds.g(ar2.Item * ds.b(ar2.k) / 1024);
                if (ar2.k < 90) {
                    ar2.C[n3] = ar2.i + ar2.A[n3];
                    ar2.D[n3] = ar2.j - ar2.B[n3];
                } else if (ar2.k >= 90 && ar2.k < 180) {
                    ar2.C[n3] = ar2.i - ar2.A[n3];
                    ar2.D[n3] = ar2.j - ar2.B[n3];
                } else if (ar2.k >= 180 && ar2.k < 270) {
                    ar2.C[n3] = ar2.i - ar2.A[n3];
                    ar2.D[n3] = ar2.j + ar2.B[n3];
                } else {
                    ar2.C[n3] = ar2.i + ar2.A[n3];
                    ar2.D[n3] = ar2.j + ar2.B[n3];
                }
                ar2.k += ar2.Res;
                ++n3;
            }
        }
        this.f = new eb[sArray.length];
        int n4 = 0;
        while (n4 < this.f.length) {
            this.f[n4] = new eb();
            this.f[n4].i = sArray[n4];
            this.f[n4].e = n4 * 25;
            this.f[n4].d = -999;
            this.f[n4].g = ds.b(2, 5);
            this.f[n4].Item = ds.b(-1, 2);
            object = this.f[n4];
            this.f[n4].m = new Char();
            ((eb)object).m.J = ds.b(-999, -800);
            ((eb)object).m.bU = -1;
            ((eb)object).m.bW = -1;
            ((eb)object).m.bV = -1;
            ((eb)object).m.bX = -1;
            ((eb)object).m.ag = "";
            ((eb)object).m.V = 20L;
            ((eb)object).m.U = 20L;
            ++n4;
        }
        this.I = false;
        this.H = false;
        this.J = false;
        this.F = GameCanvas.b + (long)ds.b(1000, 2000);
        this.b = 0;
        this.o = -1;
        this.c = -1;
        this.g = by2;
        this.u = n2;
        this.v = 0;
        Char.e().b(470, 408, 1);
        Char.e().I = -1;
        Char.e().H = 1;
        this.w = 0;
        this.x = 0;
        this.Message = 0;
        this.z = 0;
        this.r = -this.MyHashtable;
        this.K = s2;
        this.GameScreen = 0;
        this.Item();
        this.b();
        bu.LoginScreen();
    }

    public final void methodLoginScreen(int n2, Object object) {
    }

    public final void c() {
        try {
            int n2;
            this.v = this.u * this.g();
            this.Item();
            GameScreen.j().c();
            if (this.F - GameCanvas.b > 0L) {
                int n3 = 0;
                while (n3 < this.f.length) {
                    this.f[n3].e += 2;
                    if (this.f[n3].e >= this.m) {
                        this.f[n3].e = 0;
                    }
                    this.f[n3].LoginScreen = this.C[this.f[n3].e];
                    this.f[n3].b = this.D[this.f[n3].e];
                    ++n3;
                }
                return;
            }
            if (this.b == 0) {
                this.b = 1;
            }
            if (this.b == 1) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].d != -999 && !this.f[n2].k) {
                        if (this.f[n2].b < this.f[n2].d) {
                            if (this.f[n2].f < 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b = this.f[n2].b + this.f[n2].f > this.f[n2].d ? this.f[n2].d : (this.f[n2].b += this.f[n2].f);
                            ++this.f[n2].f;
                        } else {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                        }
                        if (this.f[n2].b == this.f[n2].d) {
                            ea ea2 = new ea(19, this.f[n2].LoginScreen - 5, this.f[n2].b + 25, 2, 1, -1);
                            ei.LoginScreen(ea2);
                            bu.LoginScreen();
                            this.f[n2].k = true;
                            if (!this.I) {
                                this.I = true;
                            }
                        }
                    }
                    ++n2;
                }
            }
            if (this.b == 2) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (!this.f[n2].k) {
                        if (this.f[n2].b > -10) {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                            this.f[n2].LoginScreen += this.f[n2].g * this.f[n2].Item;
                            this.f[n2].g -= 3;
                        }
                        if (this.f[n2].b == -10) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                ++this.w;
                if (this.w > this.R.length - 1) {
                    this.w = this.R.length - 1;
                    this.H = true;
                    bu.LoginScreen();
                    if (!this.J && this.G - GameCanvas.b < 0L) {
                        GameService.LoginScreen().c((byte)2, (byte)(this.f() + this.g()));
                        this.J = true;
                    }
                }
                Char.e().ImageCache = this.R[this.w];
                ++this.x;
                if (this.x > 5) {
                    this.x = 0;
                }
                this.Message = this.S[this.x];
            }
            if (this.b == 3) {
                if (this.x <= 5) {
                    this.x = 5;
                }
                ++this.x;
                if (this.x > this.S.length - 1) {
                    this.x = this.S.length - 1;
                    this.b = (byte)4;
                    this.H = false;
                    n2 = 0;
                    int n4 = 0;
                    while (n4 < this.f.length) {
                        if (this.f[n4].k && !this.f[n4].Res) {
                            this.f[n4].i = this.E[n2];
                            this.f[n4].Res = true;
                            ++n2;
                        }
                        ++n4;
                    }
                }
                this.Message = this.S[this.x];
            }
            if (this.b == 4) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        this.f[n2].c = Char.e().B;
                    }
                    ++n2;
                }
                this.b = (byte)5;
            }
            if (this.b == 5) {
                ++this.z;
                if (this.r < GameCanvas.D / 3) {
                    this.r = this.r + this.z > GameCanvas.D / 3 ? GameCanvas.D / 3 : (this.r += this.z);
                }
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        if (this.f[n2].LoginScreen < this.f[n2].c) {
                            if (this.f[n2].g < 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].LoginScreen = this.f[n2].LoginScreen + this.f[n2].g > this.f[n2].c ? this.f[n2].c : (this.f[n2].LoginScreen += this.f[n2].g);
                            ++this.f[n2].g;
                        } else {
                            if (this.f[n2].g > 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].LoginScreen += this.f[n2].g;
                            --this.f[n2].g;
                        }
                        if (this.f[n2].LoginScreen == this.f[n2].c) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd--null: " + exception.toString());
        }
    }

    public final void d() {
        if (bp.b) {
            return;
        }
        if (GameCanvas.e && !cq.b().b && !GameCanvas.F.LoginScreen) {
            int n2;
            ar ar2 = this;
            if (ar2.b == 1 && GameCanvas.Res) {
                n2 = 0;
                while (n2 < ar2.f.length) {
                    if (GameCanvas.isLowGraphic(ar2.f[n2].LoginScreen - 20 - GameScreen.j, ar2.f[n2].b - 10 - GameScreen.k, 30, 30) && GameCanvas.Res && GameCanvas.m) {
                        ar2.b(n2);
                    }
                    ++n2;
                }
            }
            if (GameCanvas.Res) {
                n2 = 0;
                while (n2 < M.length) {
                    if (GameCanvas.isLowGraphic(M[n2], L, 36, 36) && GameCanvas.Res && GameCanvas.m) {
                        if (d && n2 != 2) break;
                        ar2.c(n2);
                    }
                    ++n2;
                }
            }
        }
        if (d && !GameCanvas.i[0]) {
            GameCanvas.resetKeys();
            GameCanvas.clearKeyHold();
        }
        if (GameCanvas.i[0]) {
            this.c(2);
        }
        int n3 = 1;
        while (n3 < 8) {
            if (GameCanvas.i[n3]) {
                GameCanvas.i[n3] = false;
                this.b(n3 - 1);
            }
            ++n3;
        }
        if (GameCanvas.i[12]) {
            GameCanvas.i[12] = false;
            this.c(0);
        }
        if (GameCanvas.i[13]) {
            GameCanvas.i[13] = false;
            this.c(1);
        }
        GameCanvas.clearKeyHold();
    }

    private void b(int n2) {
        long l2;
        if (this.f[n2].k) {
            return;
        }
        bu.LoginScreen();
        long l3 = l2 = this.g == 0 ? Char.e().at : (long)Char.e().Y();
        if (this.f() >= this.GameScreen && l2 < (long)(this.v + this.u)) {
            String string = String.valueOf(T.j) + " " + (this.g == 0 ? T.bD : T.bE);
            GameScreen.aD.LoginScreen(string, 0);
            return;
        }
        this.o = n2;
        this.f[this.o].d = this.n + ds.b(-3, 3);
    }

    private void c(int n2) {
        this.c = n2;
        if (this.c == 2) {
            if (d = !d) {
                Object object = this;
                object = new Thread(new dj((ar)object));
                ((Thread)object).start();
                return;
            }
            e = true;
            return;
        }
        if (n2 == 0) {
            if (this.b < 2) {
                if (this.f() + this.g() > 0) {
                    this.b = (byte)2;
                    bu.LoginScreen();
                    Char.e().LoginScreen(GameScreen.u[13], 0);
                    this.G = GameCanvas.b + (long)ds.b(2000, 3000);
                    return;
                }
            } else if (this.r == GameCanvas.D / 3) {
                GameService.LoginScreen().c(this.g, (byte)0);
                return;
            }
        } else {
            if (d) {
                this.e();
            }
            GameScreen.j().Screen = false;
            GameScreen.j().b();
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        try {
            int n2;
            GameScreen.j().LoginScreen(en2);
            en2.LoginScreen(-GameScreen.j, -GameScreen.k);
            en2.LoginScreen(0, GameCanvas.ae);
            int n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j && this.f[n3].b > this.f[n3].d - 20) {
                    en2.LoginScreen(bv.x, this.f[n3].LoginScreen, this.f[n3].d + 7, 3);
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j) {
                    bl.b(en2, this.f[n3].i, this.f[n3].LoginScreen, this.f[n3].b, 0, 3);
                }
                ++n3;
            }
            if (this.H) {
                if (N != null) {
                    n3 = Char.e().B - ar.N.LoginScreen - 28;
                    n2 = 0;
                    while (n2 < GameCanvas.A / ar.N.LoginScreen + 1) {
                        N.LoginScreen(this.Message, n3 - n2 * (ar.N.LoginScreen - 1), Char.e().C - ar.N.b / 2 - 12 + 2, 0, 0, en2);
                        ++n2;
                    }
                }
                if (O != null) {
                    n3 = Char.e().B - ar.O.LoginScreen - 10;
                    O.LoginScreen(this.Message, n3 - 5, Char.e().C - ar.O.b / 2 - 12, 0, 0, en2);
                }
            }
            GameScreen.c(en2);
            n2 = GameCanvas.A - 240;
            en2.LoginScreen(13524492);
            en2.d(n2, 0, 240, 15);
            en2.LoginScreen(g.w, n2 + 11, 8, 3);
            en2.LoginScreen(g.Message, n2 + 90, 7, 3);
            mFont.n.LoginScreen(en2, String.valueOf(Char.e().o), n2 + 24, 2, 0, mFont.o);
            mFont.n.LoginScreen(en2, String.valueOf(Char.e().GameScreen), n2 + 100, 2, 0, mFont.o);
            en2.LoginScreen(g.z, n2 + 150, 8, 3);
            mFont.n.LoginScreen(en2, String.valueOf(Char.e().q), n2 + 160, 2, 0, mFont.o);
            en2.LoginScreen(g.x, n2 + 200, 8, 3);
            mFont.n.LoginScreen(en2, String.valueOf(this.GameScreen), n2 + 210, 2, 0, mFont.o);
            if (this.b < 4) {
                n2 = GameCanvas.A - 140;
                en2.LoginScreen(11837316);
                en2.d(n2, 15, 140, 15);
                if (this.g == 0) {
                    en2.LoginScreen(g.w, n2 + 21, 23, 3);
                } else {
                    en2.LoginScreen(g.z, n2 + 21, 22, 3);
                    en2.LoginScreen(g.Message, n2 + 18, 22, 3);
                }
                mFont.GameScreen.LoginScreen(en2, "-" + this.v, n2 + 30, 17, 0, mFont.o);
                en2.LoginScreen(g.x, n2 + 80, 22, 3);
                mFont.GameScreen.LoginScreen(en2, "-" + this.f(), n2 + 90, 17, 0, mFont.o);
            }
            en2.LoginScreen(GameScreen.au, M[0], L, 0);
            if (this.c == 0) {
                en2.LoginScreen(GameScreen.RMS, M[0], L, 0);
            }
            if (this.b < 3) {
                bl.b(en2, 540, M[0] + 14, L + 14, 0, cj.f);
            } else {
                en2.LoginScreen(Q, M[0] + 14 - 10, L + 14 - 10, 0);
            }
            en2.LoginScreen(GameScreen.au, M[1], L, 0);
            if (this.c == 1) {
                en2.LoginScreen(GameScreen.RMS, M[1], L, 0);
            }
            en2.LoginScreen(P, M[1] + 14 - 10, L + 14 - 10, 0);
            if (this.b > 3) {
                cx.c(this.q, this.r, this.SessionReceiver, this.MyHashtable, en2);
                n3 = GameCanvas.C - this.E.length * 30 / 2;
                n2 = 0;
                while (n2 < this.E.length) {
                    bl.b(en2, this.E[n2], n3 + 5 + n2 * 30, this.r + 10, 0, 0);
                    ++n2;
                }
            }
            if (d) {
                en2.LoginScreen(GameScreen.RMS, (M[0] + M[1]) / 2, L, 0);
            } else {
                en2.LoginScreen(GameScreen.au, (M[0] + M[1]) / 2, L, 0);
            }
            bl.b(en2, 4387, (M[0] + M[1]) / 2 + 14, L + 14, 0, cj.f);
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint--null: " + exception.toString());
            return;
        }
    }

    public final void methodLoginScreen(short[] sArray) {
        this.b = (byte)3;
        this.E = sArray;
    }

    public final void b() {
        GameScreen.LoginScreen = true;
        GameScreen.j().Screen = true;
        super.b();
    }

    private byte f() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if (by2 > this.GameScreen) {
            by2 = (byte)this.GameScreen;
        }
        return by2;
    }

    private byte g() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if ((by2 = (byte)(by2 - this.f())) <= 0) {
            by2 = 0;
        }
        return by2;
    }

    private void methodItem() {
        int n2 = 0;
        while (n2 < Char.e().aF.length) {
            if (Char.e().aF[n2] != null && Char.e().aF[n2].b.LoginScreen == this.K) {
                this.GameScreen = Char.e().aF[n2].Item;
                return;
            }
            ++n2;
        }
    }

    public final void e() {
        d = false;
        this.c = -1;
        e = false;
    }

    static void methodLoginScreen(ar ar2, int n2) {
        ar2.b(n2);
    }

    static void methodLoginScreen(ar ar2) {
        if (ar2.b < 2) {
            if (ar2.f() + ar2.g() > 0) {
                ar2.b = (byte)2;
                bu.LoginScreen();
                Char.e().LoginScreen(GameScreen.u[13], 0);
                ar2.G = GameCanvas.b + (long)ds.b(2000, 3000);
                return;
            }
        } else if (ar2.r == GameCanvas.D / 3) {
            GameService.LoginScreen().c(ar2.g, (byte)0);
        }
    }
}

