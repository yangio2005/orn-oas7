/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class ed {
    public static LoggingList a = new LoggingList("vBG Effect");
    private int[] UIPanel;
    private int[] h;
    private int[] i;
    private int[] j;
    private static int[] k;
    private int ResourceUtil;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private static Image v;
    private static Image w;
    private static Image x;
    private static Image Message;
    private static Image z;
    private static Image A;
    private static Image B;
    private static Image C;
    private int[] D;
    private int E;
    public int IActionListener;
    private boolean[] F;
    private int[] G;
    private int[] H;
    private boolean[] I;
    private int J;
    private int K;
    private static int L;
    private static Image M;
    private static Image N;
    private static Image O;
    private static Image P;
    public static short c;
    private static Image Q;
    public static boolean d;
    private static boolean R;
    public static int e;
    private static Image S;
    private static Image T;
    private static int U;
    private static int V;
    public static int f;
    private static int W;
    private int[] X;
    private int[] Y;

    static {
        L = 16;
        M = ResourceUtil.IActionListener("/mainImage/myTexture2dwater1.png");
        N = ResourceUtil.IActionListener("/mainImage/myTexture2dwater2.png");
        Q = null;
    }

    public static void a() {
        bv.H = 0;
    }

    public static boolean IActionListener() {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            if (ed2.IActionListener == 0 || ed2.IActionListener == 12) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private ed(int n2) {
        int[] nArray = new int[6];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 1;
        this.X = nArray;
        this.b = n2;
        switch (this.b) {
            case 10: {
                this.l = 30;
                this.g = new int[this.l];
                this.h = new int[this.l];
                k = new int[this.l];
                this.i = new int[this.l];
                n2 = 0;
                int n3 = 0;
                while (n3 < this.l) {
                    this.g[n3] = MathUtil.UIPanel(MathUtil.IActionListener(0, main.GameCanvas.A)) + GameScreen.j;
                    if (++n2 > this.l / 2) {
                        this.h[n3] = MathUtil.UIPanel(MathUtil.IActionListener(20, 60));
                        ed.k[n3] = 10;
                    } else {
                        this.h[n3] = MathUtil.UIPanel(MathUtil.IActionListener(0, 20));
                        ed.k[n3] = 7;
                    }
                    this.i[n3] = k[n3] / 2 - 2;
                    ++n3;
                }
                return;
            }
            case 9: {
                if (O == null) {
                    O = ResourceUtil.a("/bg/cham-tron1.png");
                }
                if (P == null) {
                    P = ResourceUtil.a("/bg/cham-tron2.png");
                }
                this.l = 20;
                this.g = new int[this.l];
                this.h = new int[this.l];
                k = new int[this.l];
                this.i = new int[this.l];
                int n4 = 0;
                while (n4 < this.l) {
                    this.g[n4] = MathUtil.UIPanel(MathUtil.IActionListener(0, main.GameCanvas.A));
                    this.h[n4] = MathUtil.UIPanel(MathUtil.IActionListener(10, 80));
                    ed.k[n4] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                    this.i[n4] = k[n4];
                    ++n4;
                }
                return;
            }
            case 0: 
            case 12: {
                if (v == null) {
                    v = ResourceUtil.a("/bg/mua.png");
                }
                if (w == null) {
                    w = ResourceUtil.a("/bg/mua1.png");
                }
                if (x == null) {
                    x = ResourceUtil.a("/bg/mua2.png");
                }
                this.E = MathUtil.IActionListener(main.GameCanvas.A / 3, main.GameCanvas.A / 2);
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.i = new int[this.E];
                this.j = new int[this.E];
                this.D = new int[this.E];
                this.H = new int[this.E];
                this.G = new int[this.E];
                this.F = new boolean[this.E];
                this.I = new boolean[this.E];
                int n5 = 0;
                while (n5 < this.E) {
                    this.h[n5] = MathUtil.IActionListener(-10, main.GameCanvas.B + 100) + GameScreen.k;
                    this.g[n5] = MathUtil.IActionListener(-10, main.GameCanvas.A + 300) + GameScreen.j;
                    this.H[n5] = MathUtil.IActionListener(0, 1);
                    this.i[n5] = -12;
                    this.j[n5] = 12;
                    this.D[n5] = MathUtil.IActionListener(1, 3);
                    this.F[n5] = false;
                    if (this.D[n5] == 2 && n5 % 2 == 0) {
                        this.F[n5] = true;
                    }
                    this.I[n5] = false;
                    this.G[n5] = MathUtil.IActionListener(1, 2);
                    ++n5;
                }
                return;
            }
            case 1: 
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 11: 
            case 15: {
                if (this.b == 1) {
                    z = ResourceUtil.a("/bg/lacay.png");
                    L = 10;
                }
                if (this.b == 2) {
                    z = ResourceUtil.a("/bg/lacay2.png");
                    L = 18;
                }
                if (this.b == 5) {
                    z = ResourceUtil.a("/bg/lacay3.png");
                    L = 14;
                }
                if (this.b == 6) {
                    z = ResourceUtil.a("/bg/lacay4.png");
                    L = 14;
                }
                if (this.b == 7) {
                    z = ResourceUtil.a("/bg/lacay5.png");
                    L = 12;
                }
                if (this.b == 11) {
                    z = ResourceUtil.a("/bg/tuyet.png");
                }
                if (this.b == 15) {
                    eg eg2 = bl.c[11120];
                    if (eg2 == null) {
                        bl.a(11120);
                    }
                    L = 16;
                }
                this.E = MathUtil.IActionListener(15, 25);
                if (this.b == 11) {
                    this.E = 100;
                }
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.i = new int[this.E];
                this.j = new int[this.E];
                this.H = new int[this.E];
                this.G = new int[this.E];
                this.I = new boolean[this.E];
                int n6 = 0;
                while (n6 < this.E) {
                    this.g[n6] = MathUtil.IActionListener(-10, bv.c + 10);
                    this.h[n6] = MathUtil.IActionListener(0, bv.d);
                    this.G[n6] = MathUtil.IActionListener(0, 1);
                    this.H[n6] = MathUtil.IActionListener(0, 1);
                    this.i[n6] = MathUtil.IActionListener(-3, 3);
                    this.j[n6] = MathUtil.IActionListener(1, 4);
                    if (this.b == 11) {
                        this.G[n6] = MathUtil.IActionListener(0, 2);
                        this.i[n6] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                        this.j[n6] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                    }
                    if (this.b == 15) {
                        this.G[n6] = MathUtil.IActionListener(0, 2);
                        this.i[n6] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                        this.j[n6] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                    }
                    ++n6;
                }
                return;
            }
            case 4: {
                this.E = MathUtil.IActionListener(5, 10);
                if (Message == null) {
                    Message = ResourceUtil.a("/bg/sao.png");
                }
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.G = new int[this.E];
                this.H = new int[this.E];
                this.Y = new int[this.E];
                int n7 = 0;
                while (n7 < this.E) {
                    this.g[n7] = MathUtil.IActionListener(0, main.GameCanvas.A);
                    this.h[n7] = MathUtil.IActionListener(0, 50);
                    this.Y[n7] = n7 % 2 == 0 ? 0 : (n7 % 3 == 0 ? 1 : (n7 % 4 == 0 ? 2 : 3));
                    this.H[n7] = MathUtil.IActionListener(0, 10);
                    ++n7;
                }
                return;
            }
            case 3: {
                main.GameCanvas.MessageHandler = true;
                return;
            }
            case 8: {
                this.s = MathUtil.IActionListener(100, 300);
                if (A == null) {
                    A = ResourceUtil.a("/bg/ship.png");
                }
                if (B == null) {
                    B = ResourceUtil.a("/bg/fire1.png");
                }
                if (C == null) {
                    C = ResourceUtil.a("/bg/fire2.png");
                }
                this.u = false;
                this.e();
                return;
            }
            case 13: {
                int n8 = MathUtil.UIPanel(MathUtil.IActionListener(0, 2));
                if (n8 != 0) break;
                n2 = MathUtil.UIPanel(MathUtil.IActionListener(0, 2));
                R = n2 == 0;
                e = MathUtil.UIPanel(MathUtil.IActionListener(2, 5));
                ed.d();
                return;
            }
            case 14: {
                n2 = MathUtil.UIPanel(MathUtil.IActionListener(0, 2));
                if (n2 != 0) break;
                d = true;
                ed.d();
            }
        }
    }

    private static void d() {
        if (ResourceUtil.c == 1) {
            S = null;
            T = null;
            return;
        }
        if (main.GameCanvas.a) {
            S = null;
            T = null;
            return;
        }
        if (e > 0) {
            if (S == null) {
                S = ResourceUtil.IActionListener("/bg/fog1.png");
                U = S.getWidth();
            }
        } else {
            S = null;
        }
        if (!d) {
            T = null;
            return;
        }
        if (T == null) {
            T = ResourceUtil.IActionListener("/bg/fog0.png");
        }
        W = 287;
    }

    private static void UIPanel(MGraphics en2) {
        if (ResourceUtil.c == 1) {
            return;
        }
        if (main.GameCanvas.a) {
            return;
        }
        if (e == 0) {
            return;
        }
        if (S != null) {
            int n2 = 0;
            while (n2 < e) {
                en2.a(S, (float)main.GameCanvas.aa[n2], (float)main.GameCanvas.ab[n2], 3);
                ++n2;
            }
        }
    }

    public static void a(MGraphics en2) {
        if (ResourceUtil.c == 1) {
            return;
        }
        if (main.GameCanvas.a) {
            return;
        }
        if (!d) {
            return;
        }
        if (T != null) {
            int n2 = V;
            while (n2 < bv.c) {
                if (n2 >= GameScreen.j - W) {
                    en2.a(T, (float)n2, (float)f, 0);
                }
                n2 += W;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void e() {
        block7: {
            block5: {
                block6: {
                    block4: {
                        var1_1 = GameScreen.j;
                        var2_2 = GameScreen.k;
                        this.o = MathUtil.IActionListener(1, 3);
                        this.u = false;
                        this.t = MathUtil.IActionListener(3, 5);
                        if (this.o != 1) break block4;
                        this.m = -50;
                        this.n = MathUtil.IActionListener(var2_2, main.GameCanvas.B - 100 + var2_2);
                        v0 = this;
                        v1 = 0;
                        break block5;
                    }
                    if (this.o != 2) break block6;
                    this.m = bv.c + 50;
                    this.n = MathUtil.IActionListener(var2_2, main.GameCanvas.B - 100 + var2_2);
                    v0 = this;
                    ** GOTO lbl-1000
                }
                if (this.o == 3) {
                    this.m = MathUtil.IActionListener(var1_1 + 50, main.GameCanvas.A - 50 + var1_1);
                    this.n = -50;
                    var1_1 = MathUtil.IActionListener(0, 2);
                    this.GameScreen = var1_1 == 0 ? 0 : 2;
                    return;
                }
                if (this.o == 4) {
                    this.m = MathUtil.IActionListener(var1_1 + 50, main.GameCanvas.A - 50 + var1_1);
                    this.n = bv.d + 50;
                    var1_1 = MathUtil.IActionListener(0, 2);
                    v0 = this;
                    ** if (var1_1 != 0) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v1 = 0;
                        ** GOTO lbl35
                    }
                }
                break block7;
lbl-1000:
                // 2 sources

                {
                    v1 = 2;
                }
            }
            v0.GameScreen = v1;
        }
    }

    public static void a(int n2) {
        if (main.GameCanvas.a) {
            return;
        }
        ed ed2 = new ed(n2);
        GameCanvas.addElement(ed2);
    }

    public static void a(int n2, int n3) {
        ed ed2 = new ed(10);
        new ed(10).K = n2;
        ed2.J = n3;
        GameCanvas.addElement(ed2);
    }

    public static void IActionListener(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            MGraphics en3 = en2;
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            if (ed2.IActionListener == 10) {
                en3.a(ed2.K);
                int n3 = 0;
                while (n3 < ed2.ResourceUtil) {
                    en3.a(n3 < ed2.ResourceUtil / 2 ? N : M, ed2.UIPanel[n3], ed2.h[n3] + ed2.J, 0);
                    ++n3;
                }
                if (c != 0 && Q == null) {
                    Q = bl.c[ed.c].a;
                }
                if (Q != null) {
                    n3 = 0;
                    while (n3 < ed2.ResourceUtil / 2) {
                        en3.a(Q, ed2.UIPanel[n3], ed2.h[n3] + ed2.J, 0);
                        ++n3;
                    }
                }
            }
            ++n2;
        }
    }

    public static void c(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            MGraphics en3 = en2;
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            switch (ed2.IActionListener) {
                case 8: {
                    int n3;
                    en3.a(A, 0, 0, A.getWidth(), A.getHeight(), ed2.GameScreen, ed2.m, ed2.n, 3);
                    if (ed2.o == 1 || ed2.o == 2) {
                        n3 = ed2.GameScreen == 0 ? -25 : 25;
                        en3.a(B, 0, ed2.q << 3, 20, 8, ed2.GameScreen, ed2.m + n3, ed2.n + 5, 3);
                        break;
                    }
                    n3 = ed2.GameScreen == 0 ? 11 : -11;
                    en3.a(C, 0, ed2.q * 18, 8, 18, ed2.GameScreen, ed2.m + n3, ed2.n + 22, 3);
                    break;
                }
                case 13: {
                    if (!R) break;
                    ed.UIPanel(en3);
                }
            }
            ++n2;
        }
    }

    public static void d(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            MGraphics en3 = en2;
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            try {
                switch (ed2.IActionListener) {
                    case 3: {
                        break;
                    }
                    case 0: 
                    case 12: {
                        int n3 = 0;
                        while (n3 < ed2.E) {
                            if (ed2.D[n3] == 2 && ed2.UIPanel[n3] >= GameScreen.j && ed2.UIPanel[n3] <= main.GameCanvas.A + GameScreen.j && ed2.h[n3] >= GameScreen.k && ed2.h[n3] <= main.GameCanvas.B + GameScreen.k) {
                                if (ed2.I[n3]) {
                                    en3.a(v, 0, 10 * ed2.G[n3], 13, 10, 0, ed2.UIPanel[n3], ed2.h[n3] - 10, 0);
                                } else {
                                    en3.a(w, ed2.UIPanel[n3], ed2.h[n3], 0);
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        if (ed2.IActionListener == 15) {
                            if (bl.c[11120] != null && bl.c[11120].a != null) {
                                z = bl.c[11120].a;
                            }
                            if (z == null) break;
                        }
                        Image image = z;
                        if (ed2.IActionListener == 11) {
                            L = 5;
                        }
                        try {
                            int n4 = 0;
                            while (n4 < ed2.E) {
                                if (n4 % 3 == 0 && ed2.UIPanel[n4] >= GameScreen.j && ed2.UIPanel[n4] <= main.GameCanvas.A + GameScreen.j && ed2.h[n4] >= GameScreen.k && ed2.h[n4] <= main.GameCanvas.B + GameScreen.k && image != null) {
                                    en3.a(image, 0, L * ed2.G[n4], image.getWidth(), L, 0, ed2.UIPanel[n4], ed2.h[n4], 0);
                                }
                                ++n4;
                            }
                        }
                        catch (Exception exception) {}
                        break;
                    }
                    case 13: {
                        if (!R) {
                            ed.UIPanel(en3);
                        }
                        break;
                    }
                }
            }
            catch (Exception exception) {}
            ++n2;
        }
    }

    public static void e(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            int n3;
            MGraphics en3 = en2;
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            en3.a(-en3.a(), -en3.IActionListener());
            if (ed2.IActionListener == 4) {
                n3 = 0;
                while (n3 < ed2.E) {
                    en3.a(Message, 0, 16 * ed2.G[n3], 16, 16, 0, ed2.UIPanel[n3], ed2.h[n3], 0);
                    ++n3;
                }
            }
            if (ed2.IActionListener == 9) {
                en3.a(0xFFFFFF);
                n3 = 0;
                while (n3 < ed2.ResourceUtil) {
                    en3.a(k[n3] == 1 ? O : P, ed2.UIPanel[n3], ed2.h[n3], 3);
                    ++n3;
                }
            }
            ++n2;
        }
    }

    public static void f(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            MGraphics en3 = en2;
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            switch (ed2.IActionListener) {
                case 3: {
                    break;
                }
                case 0: {
                    en3.a(10742731);
                    int n3 = 0;
                    while (n3 < ed2.E) {
                        if (ed2.D[n3] != 2 && ed2.UIPanel[n3] >= GameScreen.j && ed2.UIPanel[n3] <= main.GameCanvas.A + GameScreen.j && ed2.h[n3] >= GameScreen.k && ed2.h[n3] <= main.GameCanvas.B + GameScreen.k) {
                            en3.a(x, ed2.UIPanel[n3], ed2.h[n3], 0);
                        }
                        ++n3;
                    }
                    break;
                }
                case 1: 
                case 2: 
                case 5: 
                case 6: 
                case 7: 
                case 11: 
                case 15: {
                    if (ed2.IActionListener == 15) {
                        if (bl.c[11120] != null && bl.c[11120].a != null) {
                            z = bl.c[11120].a;
                        }
                        if (z == null) break;
                    }
                    Image image = z;
                    if (ed2.IActionListener == 11) {
                        L = 5;
                    }
                    try {
                        int n4 = 0;
                        while (n4 < ed2.E) {
                            if (n4 % 3 != 0 && ed2.UIPanel[n4] >= GameScreen.j && ed2.UIPanel[n4] <= main.GameCanvas.A + GameScreen.j && ed2.h[n4] >= GameScreen.k && ed2.h[n4] <= main.GameCanvas.B + GameScreen.k && image != null) {
                                en3.a(image, 0, L * ed2.G[n4], image.getWidth(), L, 0, ed2.UIPanel[n4], ed2.h[n4], 0);
                            }
                            ++n4;
                        }
                        break;
                    }
                    catch (Exception exception) {}
                }
            }
            ++n2;
        }
    }

    public static void c() {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            ed ed2 = (ed)GameCanvas.elementAt(n2);
            try {
                switch (ed2.IActionListener) {
                    case 10: {
                        int n3 = 0;
                        while (n3 < ed2.ResourceUtil) {
                            int n4 = n3;
                            ed2.UIPanel[n4] = ed2.UIPanel[n4] - ed2.i[n3];
                            if (ed2.UIPanel[n3] < -ed2.i[n3] + GameScreen.j) {
                                ed2.UIPanel[n3] = main.GameCanvas.A + ed2.i[n3] + GameScreen.j;
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 9: {
                        int n3 = 0;
                        while (n3 < ed2.ResourceUtil) {
                            int n5 = n3;
                            ed2.UIPanel[n5] = ed2.UIPanel[n5] - ed2.i[n3];
                            if (ed2.UIPanel[n3] < -ed2.i[n3]) {
                                ed.k[n3] = MathUtil.UIPanel(MathUtil.IActionListener(1, 3));
                                ed2.i[n3] = k[n3];
                                ed2.UIPanel[n3] = main.GameCanvas.A + ed2.i[n3];
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 3: {
                        break;
                    }
                    case 0: 
                    case 12: {
                        int n3 = 0;
                        while (n3 < ed2.E) {
                            if (n3 % 3 != 0 && ed2.IActionListener != 12 && bv.a(ed2.UIPanel[n3], ed2.h[n3] - main.GameCanvas.ae, 2)) {
                                ed2.I[n3] = true;
                            }
                            if (n3 % 3 == 0 && ed2.h[n3] > main.GameCanvas.B + GameScreen.k) {
                                ed2.UIPanel[n3] = MathUtil.IActionListener(-10, main.GameCanvas.A + 300) + GameScreen.j;
                                ed2.h[n3] = MathUtil.IActionListener(-100, 0) + GameScreen.k;
                            }
                            if (!ed2.I[n3]) {
                                int n6 = n3;
                                ed2.h[n6] = ed2.h[n6] + ed2.j[n3];
                                int n7 = n3;
                                ed2.UIPanel[n7] = ed2.UIPanel[n7] + ed2.i[n3];
                            }
                            if (ed2.I[n3]) {
                                int n8 = n3;
                                ed2.H[n8] = ed2.H[n8] + 1;
                                if (ed2.H[n3] > 2) {
                                    int n9 = n3;
                                    ed2.G[n9] = ed2.G[n9] + 1;
                                    ed2.H[n3] = 0;
                                    if (ed2.G[n3] > 1) {
                                        ed2.G[n3] = 0;
                                        ed2.I[n3] = false;
                                        ed2.UIPanel[n3] = MathUtil.IActionListener(-10, main.GameCanvas.A + 300) + GameScreen.j;
                                        ed2.h[n3] = MathUtil.IActionListener(-100, 0) + GameScreen.k;
                                    }
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        int n10;
                        int n3 = 0;
                        while (n3 < ed2.E) {
                            if (n3 % 3 != 0 && bv.a(ed2.UIPanel[n3], ed2.h[n3] + (bv.e == 15 ? 10 : 0), 2)) {
                                ed2.I[n3] = true;
                            }
                            if (n3 % 3 == 0 && ed2.h[n3] > bv.d) {
                                ed2.UIPanel[n3] = MathUtil.IActionListener(-10, bv.c + 50);
                                ed2.h[n3] = MathUtil.IActionListener(-50, 0);
                            }
                            if (!ed2.I[n3]) {
                                n10 = 0;
                                while (n10 < TileMap.GameCanvas.size()) {
                                    cn cn2 = (TileMap)TileMap.GameCanvas.elementAt(n10);
                                    if (cn2 != null && cn2.e && ed2.UIPanel[n3] < cn2.IActionListener + 80 && ed2.UIPanel[n3] > cn2.IActionListener - 80 && ed2.h[n3] < cn2.c + 80 && ed2.h[n3] > cn2.c - 80) {
                                        int n11 = n3;
                                        ed2.UIPanel[n11] = ed2.UIPanel[n11] + (ed2.UIPanel[n3] < cn2.IActionListener ? -10 : 10);
                                    }
                                    ++n10;
                                }
                                int n12 = n3;
                                ed2.h[n12] = ed2.h[n12] + ed2.j[n3];
                                int n13 = n3;
                                ed2.UIPanel[n13] = ed2.UIPanel[n13] + ed2.i[n3];
                                int n14 = n3;
                                ed2.H[n14] = ed2.H[n14] + 1;
                                if (ed2.H[n3] > (ed2.IActionListener != 2 ? 2 : 4)) {
                                    if (ed2.IActionListener != 11 && ed2.IActionListener != 15) {
                                        int n15 = n3;
                                        ed2.G[n15] = ed2.G[n15] + 1;
                                    }
                                    ed2.H[n3] = 0;
                                    if (ed2.G[n3] > 3) {
                                        ed2.G[n3] = 0;
                                    }
                                }
                            } else {
                                int n16 = n3;
                                ed2.H[n16] = ed2.H[n16] + 1;
                                if (ed2.H[n3] == 100) {
                                    ed2.H[n3] = 0;
                                    ed2.UIPanel[n3] = MathUtil.IActionListener(-10, bv.c + 50);
                                    ed2.h[n3] = MathUtil.IActionListener(-50, 0);
                                    ed2.I[n3] = false;
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 4: {
                        int n3 = 0;
                        while (n3 < ed2.E) {
                            int n17 = n3;
                            ed2.H[n17] = ed2.H[n17] + 1;
                            if (ed2.H[n3] > 10) {
                                int n18 = n3;
                                ed2.Y[n18] = ed2.Y[n18] + 1;
                                ed2.H[n3] = 0;
                                if (ed2.Y[n3] > 5) {
                                    ed2.Y[n3] = 0;
                                }
                                ed2.G[n3] = ed2.X[ed2.Y[n3]];
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 8: {
                        ++ed2.r;
                        if (ed2.r == 3) {
                            ed2.r = 0;
                            ++ed2.q;
                            if (ed2.q > 1) {
                                ed2.q = 0;
                            }
                        }
                        if (main.GameCanvas.w % ed2.s == 0) {
                            ed2.u = true;
                        }
                        if (ed2.u) {
                            if (ed2.o == 1) {
                                ed2.m += ed2.t;
                                if (ed2.m > bv.c + 50) {
                                    ed2.e();
                                }
                            } else if (ed2.o == 2) {
                                ed2.m -= ed2.t;
                                if (ed2.m < -50) {
                                    ed2.e();
                                }
                            } else if (ed2.o == 3) {
                                ed2.n += ed2.t;
                                if (ed2.n > bv.d + 50) {
                                    ed2.e();
                                }
                            } else if (ed2.o == 4) {
                                ed2.n -= ed2.t;
                                if (ed2.n < -50) {
                                    ed2.e();
                                }
                            }
                        }
                        break;
                    }
                    case 13: {
                        int n10;
                        int n3;
                        if (ResourceUtil.c != 1 && !main.GameCanvas.a && e > 0) {
                            int n19 = main.GameCanvas.E == GameScreen.j() ? bv.c : GameScreen.j + main.GameCanvas.A;
                            n3 = 0;
                            while (n3 < e) {
                                n10 = n3 + 1;
                                int n20 = n3;
                                main.GameCanvas.aa[n20] = main.GameCanvas.aa[n20] - n10;
                                if (main.GameCanvas.aa[n3] < -U) {
                                    main.GameCanvas.aa[n3] = n19 + 100;
                                }
                                ++n3;
                            }
                        }
                        break;
                    }
                    case 14: {
                        if (ResourceUtil.c != 1 && !main.GameCanvas.a && d && --V < -W) {
                            V = 0;
                        }
                        break;
                    }
                }
            }
            catch (Exception exception) {}
            ++n2;
        }
    }
}

