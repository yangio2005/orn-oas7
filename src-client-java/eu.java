/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class eu
extends Screen
implements IActionListener {
    private int c = 0;
    private LoggingList d = new LoggingList("");
    private Command e;
    private int f;
    private int UIPanel;
    private int h;
    private int i;
    private int j;
    private Command k;
    private Command ResourceUtil;
    private static String m = "area_select";
    private boolean n;
    public boolean a;
    private bh o;
    private byte GameScreen = 0;
    private byte q = 0;
    private byte r = 0;
    private Command s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int Message;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V = 15;
    private String[] W;
    private String[] X;
    private String[] Y;
    private String Z;
    private static Image[] aa;
    public static boolean IActionListener;

    public final void IActionListener() {
        SettingsManager.a();
        super.IActionListener();
        if (aa == null) {
            aa = new Image[3];
            int n2 = 0;
            while (n2 < aa.length) {
                eu.aa[n2] = ResourceUtil.IActionListener("/iconHead_" + n2 + ".png");
                ++n2;
            }
        }
        this.c = bs.n;
        this.i = 1;
        this.j = 1;
        eu eu2 = this;
        if (main.GameCanvas.e) {
            if (RMSManager.IActionListener(m) == null) {
                eu2.n = true;
                eu2.s = new Command(GameStrings.bs, eu2, 999, null);
                eu2.s.j = main.GameCanvas.C - 38;
                eu2.s.k = main.GameCanvas.D + 50;
                eu2.d = new LoggingList("");
                eu2.d.addElement(eu2.s);
                eu2.O = main.GameCanvas.D - 30;
                eu2.P = 70;
                eu2.Q = 20;
            } else {
                eu2.n = false;
                eu2.UIPanel();
                eu2.a((int)eu2.GameScreen, (int)eu2.r);
            }
        }
        if (!this.a && !this.n) {
            this.k = new Command(this.W[0], this, 98, null);
            this.k.j = 0;
            this.k.k = 0;
            this.l = new Command(this.W[1], this, 97, null);
            this.l.j = 50;
            this.l.k = 0;
            this.d = new LoggingList("");
            this.d.addElement(this.k);
            this.d.addElement(this.l);
            this.a();
        }
    }

    public eu() {
        String[] stringArray = new String[]{"Ti\u1ebfng Vi\u1ec7t", "English", "Indo"};
        this.W = new String[]{"VI\u1ec6T NAM", "GLOBAL"};
        this.X = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n", "M\u00e1y ch\u1ee7 Super"};
        this.Y = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n:\nTi\u1ebfn tr\u00ecnh game IActionListener\u00ecnh th\u01b0\u1eddng.", "M\u00e1y ch\u1ee7 Super:\n -Kh\u00f4ng th\u1ec3 giao d\u1ecbch v\u00e0ng.\n x3 S\u1ee9c m\u1ea1nh\n x3 Ti\u1ec1m n\u0103ng\n x3 V\u00e0ng\n x3 V\u1eadt ph\u1ea9m kh\u00e1c"};
        this.Z = "Ch\u1ec9 hi\u1ec7n th\u1ecb m\u00e1y ch\u1ee7 \u0111\u00e3 ch\u01a1i.";
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.a(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
    }

    private void a() {
        this.c = bs.n;
        this.h = 5;
        this.f = 90;
        this.g = Screen.cr;
        this.i = 2;
        if (this.d.size() > 2) {
            this.i = main.GameCanvas.A / (this.f + this.h);
        }
        this.j = this.d.size() / this.i + (this.d.size() % this.i == 0 ? 0 : 1);
        int n2 = 0;
        while (n2 < this.d.size()) {
            Command de2 = (Command)this.d.elementAt(n2);
            if (de2 != null) {
                int n3 = main.GameCanvas.C - this.i * (this.f + this.h) / 2;
                int n4 = main.GameCanvas.D - this.j * (this.g + this.h) / 2;
                de2.j = n3 += n2 % this.i * (this.f + this.h);
                de2.k = n4 += n2 / this.i * (this.g + this.h);
                de2.ResourceUtil = this.f;
            }
            ++n2;
        }
    }

    public final void c() {
        if (++GameScreen.j > main.GameCanvas.A * 3 + 100) {
            GameScreen.j = 100;
        }
        if (!this.a) {
            int n2 = 0;
            while (n2 < this.d.size()) {
                Command de2 = (Command)this.d.elementAt(n2);
                if (!main.GameCanvas.e) {
                    if (n2 == this.c) {
                        de2.n = main.GameCanvas.w % 10 < 4;
                        this.cn = this.e = new Command(GameStrings.bw, this, de2.e, null);
                    } else {
                        de2.n = false;
                    }
                } else if (de2 != null && de2.c()) {
                    MathUtil.c("sellllect      " + this.c + "   " + de2.IActionListener);
                    de2.a();
                }
                ++n2;
            }
        }
        this.e();
        this.f();
        bs.e();
    }

    public final void a(MGraphics en2) {
        main.GameCanvas.c(en2);
        if (this.n) {
            MGraphics en3 = en2;
            eu eu2 = this;
            if (eu2.n) {
                eu2.a(en3, main.GameCanvas.C - eu2.P / 2, eu2.O);
                eu2.s.a(en3);
            }
        } else if (this.a) {
            MGraphics en4 = en2;
            eu eu3 = this;
            if (eu3.a) {
                int n2;
                en4.a(14601141);
                en4.d(eu3.u, eu3.v, eu3.w, eu3.x);
                bo.a(en4, eu3.Message - 50, eu3.z, 100, 20, 0, true);
                mFont.f.a(en4, GameStrings.ab, eu3.Message, eu3.z + 5, 2);
                int n3 = 0;
                while (n3 < eu3.R) {
                    n2 = eu3.H + n3 * (eu3.J + 5);
                    bo.a(en4, eu3.G, n2, eu3.I, eu3.J, eu3.r == n3 ? 1 : 0, true);
                    mFont.f.a(en4, eu3.X[n3], eu3.G + eu3.I / 2, n2 + 5, 2);
                    ++n3;
                }
                en4.a(10254674);
                en4.d(eu3.K, eu3.L, eu3.M, eu3.N);
                Object object = mFont.k.a(eu3.Y[eu3.r], eu3.M - 10);
                n2 = 0;
                while (n2 < ((String[])object).length) {
                    mFont.s.a(en4, object[n2], eu3.K + 5, eu3.L + 5 + n2 * 11, 0);
                    ++n2;
                }
                Object object2 = en4;
                object = eu3;
                int n4 = object.K;
                int n5 = object.L + object.N + 2;
                ((MGraphics)object2).a(0xFFFFFF);
                ((MGraphics)object2).d(n4, n5, object.S, object.S);
                if (IActionListener) {
                    ((MGraphics)object2).a(3329330);
                    ((MGraphics)object2).d(n4 + 1, n5 + 1, object.S - 2, object.S - 2);
                }
                mFont.f.a((MGraphics)object2, object.Z, n4 + object.S + 2, n5, 0);
                eu3.a(en4, 10, eu3.O);
                en4.a(10254674);
                en4.d(eu3.A, eu3.B, eu3.C, eu3.D);
                en4.e(eu3.A, eu3.B, eu3.C, eu3.D);
                en4.a(0, -eu3.o.IActionListener);
                int n6 = 0;
                while (n6 < eu3.d.size()) {
                    object2 = (Command)eu3.d.elementAt(n6);
                    if (object2 != null) {
                        ((Command)object2).a(en4);
                        if (((Command)object2).r && main.GameCanvas.w % 10 > 1) {
                            en4.a(UIPanel.v, ((Command)object2).j + 60, ((Command)object2).k, 0);
                        }
                    }
                    ++n6;
                }
                main.GameCanvas.a(en4);
            }
        } else {
            int n7 = 0;
            while (n7 < this.d.size()) {
                if (this.d.elementAt(n7) != null) {
                    ((Command)this.d.elementAt(n7)).a(en2);
                }
                ++n7;
            }
        }
        super.a(en2);
    }

    public final void d() {
        super.d();
        int n2 = this.c % this.i;
        int n3 = this.c / this.i;
        if (main.GameCanvas.i[4]) {
            if (n2 > 0) {
                --this.c;
            }
            main.GameCanvas.i[4] = false;
        } else if (main.GameCanvas.i[6]) {
            if (n2 < this.i - 1) {
                ++this.c;
            }
            main.GameCanvas.i[6] = false;
        } else if (main.GameCanvas.i[2]) {
            if (n3 > 0) {
                this.c -= this.i;
            }
            main.GameCanvas.i[2] = false;
        } else if (main.GameCanvas.i[8]) {
            System.out.println("-----------vo mainSelect: " + this.c);
            if (n3 < this.j - 1) {
                this.c += this.i;
            }
            main.GameCanvas.i[8] = false;
        }
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.c >= this.d.size()) {
            this.c = this.d.size() - 1;
        }
        if (main.GameCanvas.i[5]) {
            ((Command)this.d.elementAt(n2)).a();
            main.GameCanvas.i[5] = false;
        }
        main.GameCanvas.f();
    }

    public final void a(int n2, Object object) {
        block12: {
            MathUtil.c("perform trong ServerScr:" + n2);
            switch (n2) {
                case 999: {
                    eu eu2 = this;
                    byte[] byArray = new byte[2];
                    object = byArray;
                    byArray[0] = eu2.GameScreen;
                    object[1] = eu2.q;
                    RMSManager.a(m, (byte[])object);
                    this.a((int)this.GameScreen, 0);
                    return;
                }
                case 97: {
                    if (!this.a) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < bs.GameCanvas.length) {
                            if (bs.d[n2] != 0) {
                                this.d.addElement(new Command(bs.a[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.a();
                        return;
                    }
                    break block12;
                }
                case 98: {
                    if (!this.a) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < bs.GameCanvas.length) {
                            if (bs.d[n2] == 0) {
                                this.d.addElement(new Command(bs.a[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.a();
                        return;
                    }
                    break block12;
                }
                case 99: {
                    NetworkService.a().c();
                    bs.a(this.c, false);
                    break;
                }
                default: {
                    NetworkService.a().e();
                    bs.a(n2 - 100, true);
                    bs.k();
                    if (main.GameCanvas.ak != null) break;
                    main.GameCanvas.ak = new bs();
                }
            }
            main.GameCanvas.ak.i();
            main.GameCanvas.ak.IActionListener();
        }
    }

    private void a(int n2, int n3) {
        this.n = false;
        if (ResourceUtil.c != 1) {
            this.a = true;
        }
        this.S = 10;
        this.w = main.GameCanvas.A / 3 << 1;
        this.x = main.GameCanvas.B / 3 << 1;
        this.u = (main.GameCanvas.A - this.w) / 2;
        this.v = (main.GameCanvas.B - this.x) / 2 + 20;
        this.Message = main.GameCanvas.A / 2;
        this.z = this.v - 30;
        this.C = this.w / 3 << 1;
        this.I = this.w - this.C - 15;
        if (this.I < 80) {
            this.I = 80;
            this.C = this.w - this.I - 15;
        }
        this.D = this.x - 10 - this.S;
        this.A = this.u + this.w - this.C - 5;
        this.B = this.v + 5;
        this.G = this.u + 5;
        this.H = this.v + 5;
        this.J = 20;
        this.K = this.u + 5;
        this.L = this.v + this.X.length * (this.J + 5) + 5;
        this.M = this.I;
        this.N = this.x - (5 + this.X.length * (this.J + 5) + 5) - this.S;
        this.O = 10;
        this.P = 70;
        this.Q = 20;
        this.a((byte)n2, (byte)n3);
    }

    private void a(byte by2, byte by3) {
        Command de2;
        int n2;
        this.d.removeAllElements();
        this.R = 1;
        this.GameScreen = by2;
        GameStrings.a(by2);
        int n3 = 0;
        while (n3 < bs.GameCanvas.length) {
            if (by2 == 1) {
                if (bs.d[n3] != 0 && bs.h[n3] == 1) {
                    this.R = 2;
                }
            } else if (bs.h[n3] == 1) {
                this.R = 2;
            }
            ++n3;
        }
        if (by3 > (byte)(this.R - 1)) {
            by3 = (byte)(this.R - 1);
        }
        this.r = by3;
        n3 = 0;
        while (n3 < bs.GameCanvas.length) {
            if (by2 == 1) {
                if (bs.d[n3] != 0) {
                    if (bs.h[n3] == 1) {
                        this.R = 2;
                    }
                    if (bs.h[n3] == by3) {
                        n2 = -1;
                        if (bs.e != null && n3 < bs.e.length) {
                            n2 = bs.e[n3];
                        }
                        if (!IActionListener || n2 != -1) {
                            de2 = new Command(bs.a[n3], this, n3 + 100, null);
                            boolean bl2 = new Command(bs.a[n3], this, n3 + 100, null).r = bs.i[n3] == 1;
                            if (n2 >= 0) {
                                de2.i = aa[n2];
                            }
                            this.d.addElement(de2);
                        }
                    }
                }
            } else {
                if (bs.h[n3] == 1) {
                    this.R = 2;
                }
                if (bs.d[n3] == 0 && bs.h[n3] == by3) {
                    n2 = -1;
                    if (bs.e != null && n3 < bs.e.length) {
                        n2 = bs.e[n3];
                    }
                    if (!IActionListener || n2 != -1) {
                        de2 = new Command(bs.a[n3], this, n3 + 100, null);
                        boolean bl3 = new Command(bs.a[n3], this, n3 + 100, null).r = bs.i[n3] == 1;
                        if (n2 >= 0) {
                            de2.i = aa[n2];
                        }
                        this.d.addElement(de2);
                    }
                }
            }
            ++n3;
        }
        eu eu2 = this;
        by3 = 0;
        while (by3 < eu2.d.size() - 1) {
            Command de3 = (Command)eu2.d.elementAt(by3);
            n2 = by3 + 1;
            while (n2 < eu2.d.size()) {
                de2 = (Command)eu2.d.elementAt(n2);
                if (de2.r && !de3.r) {
                    Command de4 = de2;
                    de2 = de3;
                    de3 = de4;
                    eu2.d.setElementAt(de3, by3);
                    eu2.d.setElementAt(de2, n2);
                }
                ++n2;
            }
            by3 = (byte)(by3 + 1);
        }
        eu2 = this;
        this.c = bs.n;
        eu2.h = 5;
        eu2.f = 76;
        eu2.UIPanel = Screen.cr;
        eu2.i = 1;
        by3 = (byte)(eu2.A + eu2.C / 2 + 3);
        eu2.F = eu2.B + 5;
        eu2.i = eu2.C / (eu2.f + eu2.h);
        if (eu2.i <= 0) {
            eu2.i = 1;
        }
        eu2.j = eu2.d.size() / eu2.i + (eu2.d.size() % eu2.i == 0 ? 0 : 1);
        eu2.E = by3 - eu2.i * (eu2.f + eu2.h) / 2;
        int n4 = 0;
        while (n4 < eu2.d.size()) {
            Command de5 = (Command)eu2.d.elementAt(n4);
            if (de5 != null) {
                int n5 = eu2.E + n4 % eu2.i * (eu2.f + eu2.h);
                int n6 = eu2.F + n4 / eu2.i * (eu2.UIPanel + eu2.h);
                de5.j = n5;
                de5.k = n6;
                de5.ResourceUtil = eu2.f;
            }
            ++n4;
        }
        eu2.o = new bh(eu2.A, eu2.B, eu2.C, eu2.D, 0, 0, 0, true);
        n4 = eu2.j * (eu2.UIPanel + eu2.h) - eu2.D;
        bh bh2 = eu2.o;
        if (n4 < 0) {
            n4 = 0;
        }
        bh2.c = n4;
        if (bh2.IActionListener > bh2.c) {
            bh2.IActionListener = bh2.c;
        }
        if (bh2.a > bh2.c) {
            bh2.a = bh2.c;
        }
        bh2 = eu2.o;
        eu2.o.a = 0;
    }

    private void a(MGraphics en2, int n2, int n3) {
        this.T = n2 -= 5;
        bo.a(en2, n2, n3, this.P, this.Q, 0, true);
        mFont.f.a(en2, this.W[this.GameScreen], n2 + (this.P - 10) / 2, n3 + 5, 2);
        en2.a(aa.R, 0, 30, 9, 6, 0, n2 + this.P - 10, n3 + 14, 33);
        if (this.t) {
            this.U = n3 + this.Q + 5;
            en2.a(10254674);
            en2.d(n2, this.U, this.P, this.W.length * this.V + 1);
            n3 = 0;
            while (n3 < this.W.length) {
                mFont.s.a(en2, this.W[n3], n2 + this.P / 2, this.U + n3 * this.V + 2, 2);
                if (this.GameScreen == n3) {
                    en2.a(15591444);
                    en2.c(n2 + 2, this.U + n3 * this.V + 1, this.P - 4, this.V - 2);
                }
                ++n3;
            }
        }
    }

    private void e() {
        int n2;
        byte by2;
        if (!this.a) {
            return;
        }
        int n3 = 0;
        if (this.o != null) {
            this.o.IActionListener();
            if (main.GameCanvas.IActionListener(this.A, 0, this.C, main.GameCanvas.B)) {
                this.o.a();
            }
            n3 = this.o.IActionListener;
        }
        if (main.GameCanvas.IActionListener(this.A, this.B, this.C, this.D)) {
            by2 = (main.GameCanvas.GameScreen - this.E) / (this.f + this.h) + (main.GameCanvas.q - this.F + n3) / (this.g + this.h) * this.i;
            n2 = this.d.size();
            if (by2 >= 0 && by2 < n2) {
                this.c = by2;
                by2 = 0;
                while (by2 < this.d.size()) {
                    Command de2 = (Command)this.d.elementAt(by2);
                    if (de2 != null) {
                        if (by2 == this.c) {
                            if (de2.a(0, n3)) {
                                de2.a();
                            }
                        } else {
                            de2.n = false;
                        }
                    }
                    ++by2;
                }
            }
        }
        if (main.GameCanvas.IActionListener(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && main.GameCanvas.m) {
            IActionListener = !IActionListener;
            this.a(this.GameScreen, this.r);
        }
        if (this.R == 1) {
            return;
        }
        by2 = 0;
        while (by2 < this.R) {
            n2 = this.H + by2 * (this.J + 5);
            if (main.GameCanvas.a(this.G, n2, this.I, this.J) && main.GameCanvas.k) {
                this.a(this.GameScreen, by2);
                return;
            }
            by2 = (byte)(by2 + 1);
        }
    }

    private void f() {
        if (main.GameCanvas.IActionListener(this.T, this.O, this.P, this.Q) && main.GameCanvas.m) {
            this.t = !this.t;
            main.GameCanvas.m = false;
        }
        if (this.t) {
            int n2 = 0;
            while (n2 < this.W.length) {
                int n3 = this.U + n2 * this.V;
                if (main.GameCanvas.a(this.T, n3, this.P, this.V) && main.GameCanvas.k) {
                    if (this.n) {
                        this.GameScreen = (byte)n2;
                    } else {
                        this.a(n2, (int)this.r);
                    }
                    this.t = false;
                    return;
                }
                n2 = (byte)(n2 + 1);
            }
        }
    }

    private void UIPanel() {
        byte[] byArray = RMSManager.IActionListener(m);
        try {
            this.GameScreen = byArray[0];
            this.q = byArray[1];
            return;
        }
        catch (Exception exception) {
            this.q = 0;
            this.GameScreen = 0;
            return;
        }
    }
}

