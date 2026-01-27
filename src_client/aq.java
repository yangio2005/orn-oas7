/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class aq
extends Screen {
    private static aq Item;
    private static boolean i;
    private static df j;
    private static df k;
    public static df LoginScreen;
    private static Image Res;
    private static Image m;
    private static Image n;
    private static Image o;
    private static Image GameScreen;
    private static Image q;
    private static Image r;
    private static Image SessionReceiver;
    private static Image MyHashtable;
    private static Image u;
    private static Image v;
    private static Image w;
    private static Image x;
    private static Image Message;
    private static Image[] z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    public static int b;
    public static int c;
    public static int d;
    private static int G;
    public static int e;
    private static int H;
    private static int[] I;
    private static int[] J;
    private static int[][] K;
    private static int[][] L;
    private static int[] M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R = 0;
    public static MyVector f;
    public static MyVector g;
    private static int S;
    private ef T;
    private int U = 0;
    private int V = 0;
    private int W;
    private int X;
    private int Y;

    static {
        I = new int[0];
        J = new int[0];
        int[] nArray = new int[5];
        nArray[0] = -2;
        nArray[1] = -1;
        nArray[3] = 1;
        nArray[4] = 2;
        M = nArray;
    }

    public static aq LoginScreen() {
        if (Item == null) {
            Item = new aq();
        }
        return Item;
    }

    public aq() {
        i = true;
        Image image = Res.loadImage("/radar/17.png");
        Image image2 = Res.loadImage("/radar/3.png");
        Image image3 = Res.loadImage("/radar/23.png");
        j = new df(image, 28, 28);
        k = new df(image2, 30, 30);
        LoginScreen = new df(image3, 11, 11);
        Res = Res.loadImage("/radar/0.png");
        n = Res.loadImage("/radar/1.png");
        o = Res.loadImage("/radar/2.png");
        m = Res.loadImage("/radar/17.png");
        GameScreen = Res.loadImage("/radar/4.png");
        q = Res.loadImage("/radar/5.png");
        r = Res.loadImage("/radar/6.png");
        z = new Image[7];
        int n2 = 0;
        while (n2 < 7) {
            aq.z[n2] = Res.loadImage("/radar/" + (n2 + 7) + ".png");
            ++n2;
        }
        SessionReceiver = Res.loadImage("/radar/14.png");
        MyHashtable = Res.loadImage("/radar/15.png");
        u = Res.loadImage("/radar/16.png");
        m = Res.loadImage("/radar/18.png");
        w = Res.loadImage("/radar/19.png");
        x = Res.loadImage("/radar/20.png");
        Message = Res.loadImage("/radar/21.png");
        v = Res.loadImage("/radar/22.png");
        C = 200;
        D = 219;
        A = GameCanvas.C - (C + 40) / 2;
        B = GameCanvas.D - D / 2;
        b = A + C - 81;
        c = B + 29;
        d = 120;
        e = 80;
        K = new int[][]{{A + 34, B + D - 42}, {A + C / 2 - GameScreen.getWidth() / 2, B + D / 2 + 33}, {A + C - 41, B + D - 42}};
        L = new int[][]{{A + 25, B + D - 82}, {A + 57, B + D - 62}, {A + C / 2 - 14, B + D - 102}, {A + C - 57 - 28, B + D - 62}, {A + C - 25 - 28, B + D - 82}};
        this.O = new int[2];
        this.N = 0;
        E = A + 73;
        F = B + D / 2 + 5;
        H = B + D - 22;
        I = new int[]{A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80};
        J = new int[3];
        this.X = c + 10 + 70;
        this.Y = 0;
        f = new MyVector("");
        g = new MyVector("");
        this.P = 1;
        this.Q = 2;
    }

    public final void methodLoginScreen(MyVector el2, int n2, int n3) {
        f = el2;
        int n4 = n2;
        n2 = n3;
        n2 = n4;
        S = n4;
        this.P = 1;
        this.R = 2;
        this.f();
        i = true;
        aq.e();
        if (i) {
            this.Q = el2.size() / 5 + (el2.size() % 5 > 0 ? 1 : 0);
            return;
        }
        this.Q = g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
    }

    public static void methodLoginScreen(int n2, int n3) {
        S = n2;
    }

    public static void e() {
        g = new MyVector("");
        int n2 = 0;
        while (n2 < f.size()) {
            ef ef2 = (ef)f.elementAt(n2);
            if (ef2 != null && ef2.k == 1) {
                g.addElement(ef2);
            }
            ++n2;
        }
    }

    private void f() {
        MyVector el2 = g;
        if (i) {
            el2 = f;
        }
        int n2 = (this.P - 1) * 5;
        int n3 = n2 + 5;
        int n4 = n2;
        while (n4 < n3) {
            if (n4 >= el2.size()) {
                aq.M[n4 - n2] = -1;
            } else {
                ef ef2 = (ef)el2.elementAt(n4);
                if (ef2 != null) {
                    aq.M[n4 - n2] = ef2.e;
                }
            }
            ++n4;
        }
        bu.LoginScreen();
    }

    public final void c() {
        try {
            if (e < 80 && (e += 4) > 80) {
                e = 80;
            }
            this.T = ef.LoginScreen(g, M[this.R]);
            if (i) {
                this.T = ef.LoginScreen(f, M[this.R]);
            }
            GameScreen.j().c();
            if (GameCanvas.w % 10 < 6) {
                if (GameCanvas.w % 2 == 0) {
                    --this.N;
                }
            } else {
                this.N = 0;
            }
            if (this.T != null) {
                int n2 = this.T.b * 100 / this.T.c;
                this.Y = n2 * w.getHeight() / 100;
                n2 = S * 100 / f.size();
                this.W = n2 * Message.getWidth() / 100;
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd-radaScr-null: " + exception.toString());
        }
    }

    public final void d() {
        if (bp.b) {
            return;
        }
        if (GameCanvas.e && !cq.b().b && !GameCanvas.F.LoginScreen) {
            aq aq2 = this;
            if (GameCanvas.Res) {
                int n2 = 0;
                while (n2 < 5) {
                    if (GameCanvas.isLowGraphic(L[n2][0], L[n2][1], 30, 30) && GameCanvas.Res && GameCanvas.m && n2 != aq2.R) {
                        int n3 = n2;
                        aq aq3 = aq2;
                        aq2.R = n3;
                        aq3.f();
                    }
                    ++n2;
                }
                if (GameCanvas.isLowGraphic(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
                    if (GameCanvas.k) {
                        aq2.O[0] = 1;
                    }
                    if (GameCanvas.Res && GameCanvas.m) {
                        aq2.c(0);
                        aq2.O[0] = 0;
                    }
                }
                if (GameCanvas.isLowGraphic(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
                    if (GameCanvas.k) {
                        aq2.O[1] = 1;
                    }
                    if (GameCanvas.Res && GameCanvas.m) {
                        aq2.c(1);
                        aq2.O[1] = 0;
                    }
                }
                n2 = 0;
                while (n2 < I.length) {
                    if (GameCanvas.isLowGraphic(I[n2] - 5, H - 5, 20, 20)) {
                        if (GameCanvas.k) {
                            aq.J[n2] = 1;
                        }
                        if (GameCanvas.Res && GameCanvas.m) {
                            aq2.b(n2);
                            aq.J[n2] = 0;
                        }
                    }
                    ++n2;
                }
            } else {
                aq.J[0] = 0;
                aq.J[1] = 0;
                aq.J[2] = 0;
                aq2.O[0] = 0;
                aq2.O[1] = 0;
            }
            if (GameCanvas.isLowGraphic(b, 0, d, c + e)) {
                if (GameCanvas.n) {
                    if (aq2.V == 0) {
                        aq2.V = GameCanvas.q;
                    }
                    aq2.U = aq2.V - GameCanvas.q;
                    if (aq2.U != 0) {
                        G += aq2.U;
                        aq2.V = GameCanvas.q;
                    }
                    if (G < 0) {
                        G = 0;
                    }
                    if (G > aq2.T.r.Item) {
                        G = aq2.T.r.Item;
                    }
                } else {
                    aq2.V = 0;
                    aq2.V = 0;
                }
            }
        }
        if (GameCanvas.i[8]) {
            GameCanvas.i[8] = false;
            this.d(1);
        }
        if (GameCanvas.i[2]) {
            GameCanvas.i[2] = false;
            this.d(-1);
        }
        if (GameCanvas.i[4]) {
            GameCanvas.i[4] = false;
            this.e(1);
        }
        if (GameCanvas.i[6]) {
            GameCanvas.i[6] = false;
            this.e(0);
        }
        if (GameCanvas.i[12]) {
            GameCanvas.i[12] = false;
            this.b(0);
        }
        if (GameCanvas.i[5]) {
            GameCanvas.i[5] = false;
            this.b(1);
        }
        if (GameCanvas.i[13]) {
            this.b(2);
        }
        GameCanvas.clearKeyHold();
    }

    private void b(int n2) {
        if (n2 == 0) {
            aq aq2 = this;
            i = !i;
            aq2.P = 1;
            aq2.R = 0;
            aq2.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
            aq2.f();
            e = 0;
        } else if (n2 == 1) {
            if (this.T != null) {
                GameService.LoginScreen().b(1, this.T.e);
            }
        } else if (n2 == 2) {
            GameScreen.j().b();
        }
        bu.LoginScreen();
    }

    private void c(int n2) {
        this.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
        int n3 = this.P;
        if (n2 == 0) {
            if (this.P == 1) {
                return;
            }
            if (--n3 <= 0) {
                n3 = 1;
            }
        } else {
            if (this.P == this.Q) {
                return;
            }
            if (++n3 > this.Q) {
                n3 = this.Q;
            }
        }
        if (n3 != this.P) {
            this.P = n3;
            this.f();
        }
    }

    private void d(int n2) {
        if ((G += n2 * 12) < 0) {
            G = 0;
        }
        if (G > this.T.r.Item) {
            G = this.T.r.Item;
        }
    }

    private void e(int n2) {
        int n3 = this.R;
        int n4 = this.P;
        n3 = n2 == 0 ? ++n3 : --n3;
        if (n3 >= M.length) {
            if (this.P < this.Q) {
                n3 = 0;
                ++n4;
            } else {
                n3 = M.length - 1;
            }
        }
        if (n3 < 0) {
            if (this.P > 1) {
                n3 = M.length - 1;
                --n4;
            } else {
                n3 = 0;
            }
        }
        if (n3 != this.R) {
            this.R = n3;
            G = 0;
            e = 0;
        }
        if (n4 != this.P) {
            this.P = n4;
            this.f();
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        try {
            int n2;
            int n3;
            GameScreen.j().LoginScreen(en2);
            en2.LoginScreen(-GameScreen.j, -GameScreen.k);
            en2.LoginScreen(0, GameCanvas.ae);
            GameScreen.c(en2);
            en2.LoginScreen(Res, A, B, 0);
            en2.LoginScreen(x, A + C / 2 - Res.loadImageFromRMS(x) / 2, B - Res.loadImage(x) / 2 - 2, 0);
            en2.e(A + C / 2 - Res.loadImageFromRMS(x) / 2 + 13, B - Res.loadImage(x) / 2 + 3, this.W, Res.loadImage(x));
            en2.LoginScreen(Message, A + C / 2 - Res.loadImageFromRMS(x) / 2 + 13, B - Res.loadImage(x) / 2 + 3, 0);
            GameScreen.c(en2);
            en2.LoginScreen(u, I[0], H + J[0], 0);
            en2.LoginScreen(r, I[1], H + J[1], 0);
            en2.LoginScreen(MyHashtable, I[2], H + J[2], 0);
            if (i) {
                en2.LoginScreen(SessionReceiver, 0, 0, 17, 17, 0, I[1], H + J[1], 0);
            } else {
                en2.LoginScreen(SessionReceiver, 0, 0, 17, 17, 1, I[1], H + J[1], 0);
            }
            if (this.T != null) {
                en2.e(A + 30, B + 13, C - 60, D / 2);
                n3 = F;
                n2 = E;
                mGraphics en3 = en2;
                ef ef2 = this.T;
                ++ef2.GameScreen;
                if (ef2.GameScreen > ef2.o.length - 1) {
                    ef2.GameScreen = 0;
                }
                if (ef2.d == 0) {
                    if (Mob.c[ef2.m.C] != null) {
                        if (Mob.c[ef2.m.C].f != null) {
                            Mob.c[ef2.m.C].f.LoginScreen(en3, ef2.o[ef2.GameScreen], n2, n3, 0, 0);
                        } else if (ef2.q - GameCanvas.b < 0L) {
                            ef2.q = GameCanvas.b + 1500L;
                            ef2.m.v();
                        }
                    }
                } else if (ef2.Res != null) {
                    ef2.Res.loadImageFromRMS(en3, n2, n3, 1, ef2.o[ef2.GameScreen], true);
                }
                GameScreen.c(en2);
                mFont.d.LoginScreen(en2, String.valueOf(this.T.j > 0 ? "Lv." + this.T.j + " " : "") + this.T.Item, A + C / 2, B + 15, 2);
                mFont.SessionReceiver.LoginScreen(en2, "no." + this.T.f, A + 30, c - 2, 0);
                en2.LoginScreen(v, A + 36, c + 10, 0);
                en2.e(A + 36, this.X - this.Y, 7, this.Y);
                en2.LoginScreen(w, A + 36, c + 10, 0);
                GameScreen.c(en2);
                en2.LoginScreen(z[this.T.LoginScreen], A + 39 - 5 + 14, c + 12, 0);
            }
            en2.e(b, c, d + 5, e + 8);
            if (this.T != null) {
                en2.LoginScreen(m, b, c, 0);
            }
            GameScreen.c(en2);
            en2.e(b, c + 1, d, e + 5);
            if (this.T != null && this.T.r != null && this.T.r.d != null) {
                this.T.r.LoginScreen(en2, G);
            }
            GameScreen.c(en2);
            if (!i && g.size() > 5 || i) {
                if (this.P > 1) {
                    en2.LoginScreen(n, K[0][0], K[0][1] + this.O[0], 0);
                }
                if (this.P < this.Q) {
                    en2.LoginScreen(o, K[2][0], K[2][1] + this.O[1], 0);
                }
            }
            int n4 = 0;
            while (n4 < M.length) {
                int n5 = 0;
                n2 = 0;
                n3 = 0;
                if (n4 == this.R) {
                    n5 = this.N;
                    n2 = -10;
                    n3 = 1;
                    en2.LoginScreen(GameScreen, L[n4][0] + 10, L[n4][1] + this.N + 29 + -10, 0);
                }
                ef ef3 = ef.LoginScreen(g, M[n4]);
                if (i) {
                    ef3 = ef.LoginScreen(f, M[n4]);
                }
                if (ef3 != null) {
                    j.LoginScreen(ef3.LoginScreen, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    bl.b(en2, ef3.g, L[n4][0] + 14, L[n4][1] + 14 + n5 + n2, 0, cj.f);
                    ef3.LoginScreen(en2, L[n4][0], L[n4][1] + n5 + n2);
                    if (ef3.j == 0) {
                        en2.LoginScreen(q, L[n4][0], L[n4][1] + n5 + n2, 0);
                    }
                    if (n4 == this.R) {
                        j.LoginScreen(7, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    }
                    if (ef3.k == 1) {
                        j.LoginScreen(8, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    }
                } else {
                    k.LoginScreen(n3, L[n4][0] - 1, L[n4][1] - 1 + n5 + n2, 0, 0, en2);
                }
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint-radaScr-null: " + exception.toString());
            return;
        }
    }

    public final void b() {
        GameScreen.LoginScreen = true;
        super.b();
    }
}

