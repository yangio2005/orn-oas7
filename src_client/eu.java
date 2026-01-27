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
implements b {
    private int c = 0;
    private MyVector d = new MyVector("");
    private de e;
    private int f;
    private int g;
    private int Item;
    private int i;
    private int j;
    private de k;
    private de Res;
    private static String m = "area_select";
    private boolean n;
    public boolean LoginScreen;
    private bh o;
    private byte GameScreen = 0;
    private byte q = 0;
    private byte r = 0;
    private de SessionReceiver;
    private boolean MyHashtable;
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
    private static Image[] Mob;
    public static boolean b;

    public final void b() {
        bu.LoginScreen();
        super.b();
        if (Mob == null) {
            Mob = new Image[3];
            int n2 = 0;
            while (n2 < Mob.length) {
                eu.Mob[n2] = Res.loadImage("/iconHead_" + n2 + ".png");
                ++n2;
            }
        }
        this.c = ServerListScreen.n;
        this.i = 1;
        this.j = 1;
        eu eu2 = this;
        if (GameCanvas.e) {
            if (RMS.b(m) == null) {
                eu2.n = true;
                eu2.SessionReceiver = new de(T.ServerListScreen, eu2, 999, null);
                eu2.SessionReceiver.j = GameCanvas.C - 38;
                eu2.SessionReceiver.k = GameCanvas.D + 50;
                eu2.d = new MyVector("");
                eu2.d.addElement(eu2.SessionReceiver);
                eu2.O = GameCanvas.D - 30;
                eu2.P = 70;
                eu2.Q = 20;
            } else {
                eu2.n = false;
                eu2.g();
                eu2.LoginScreen((int)eu2.GameScreen, (int)eu2.r);
            }
        }
        if (!this.LoginScreen && !this.n) {
            this.k = new de(this.W[0], this, 98, null);
            this.k.j = 0;
            this.k.k = 0;
            this.Res = new de(this.W[1], this, 97, null);
            this.Res.j = 50;
            this.Res.k = 0;
            this.d = new MyVector("");
            this.d.addElement(this.k);
            this.d.addElement(this.Res);
            this.LoginScreen();
        }
    }

    public eu() {
        String[] stringArray = new String[]{"Ti\u1ebfng Vi\u1ec7t", "English", "Indo"};
        this.W = new String[]{"VI\u1ec6T NAM", "GLOBAL"};
        this.X = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n", "M\u00e1y ch\u1ee7 Super"};
        this.Y = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n:\nTi\u1ebfn tr\u00ecnh game b\u00ecnh th\u01b0\u1eddng.", "M\u00e1y ch\u1ee7 Super:\n -Kh\u00f4ng th\u1ec3 giao d\u1ecbch v\u00e0ng.\n x3 S\u1ee9c m\u1ea1nh\n x3 Ti\u1ec1m n\u0103ng\n x3 V\u00e0ng\n x3 V\u1eadt ph\u1ea9m kh\u00e1c"};
        this.Z = "Ch\u1ec9 hi\u1ec7n th\u1ecb m\u00e1y ch\u1ee7 \u0111\u00e3 ch\u01a1i.";
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.LoginScreen(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
    }

    private void methodLoginScreen() {
        this.c = ServerListScreen.n;
        this.Item = 5;
        this.f = 90;
        this.g = Screen.cr;
        this.i = 2;
        if (this.d.size() > 2) {
            this.i = GameCanvas.A / (this.f + this.Item);
        }
        this.j = this.d.size() / this.i + (this.d.size() % this.i == 0 ? 0 : 1);
        int n2 = 0;
        while (n2 < this.d.size()) {
            de de2 = (de)this.d.elementAt(n2);
            if (de2 != null) {
                int n3 = GameCanvas.C - this.i * (this.f + this.Item) / 2;
                int n4 = GameCanvas.D - this.j * (this.g + this.Item) / 2;
                de2.j = n3 += n2 % this.i * (this.f + this.Item);
                de2.k = n4 += n2 / this.i * (this.g + this.Item);
                de2.Res = this.f;
            }
            ++n2;
        }
    }

    public final void c() {
        if (++GameScreen.j > GameCanvas.A * 3 + 100) {
            GameScreen.j = 100;
        }
        if (!this.LoginScreen) {
            int n2 = 0;
            while (n2 < this.d.size()) {
                de de2 = (de)this.d.elementAt(n2);
                if (!GameCanvas.e) {
                    if (n2 == this.c) {
                        de2.n = GameCanvas.w % 10 < 4;
                        this.cn = this.e = new de(T.bw, this, de2.e, null);
                    } else {
                        de2.n = false;
                    }
                } else if (de2 != null && de2.c()) {
                    ds.c("sellllect      " + this.c + "   " + de2.b);
                    de2.LoginScreen();
                }
                ++n2;
            }
        }
        this.e();
        this.f();
        ServerListScreen.e();
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameCanvas.c(en2);
        if (this.n) {
            mGraphics en3 = en2;
            eu eu2 = this;
            if (eu2.n) {
                eu2.LoginScreen(en3, GameCanvas.C - eu2.P / 2, eu2.O);
                eu2.SessionReceiver.LoginScreen(en3);
            }
        } else if (this.LoginScreen) {
            mGraphics en4 = en2;
            eu eu3 = this;
            if (eu3.LoginScreen) {
                int n2;
                en4.LoginScreen(14601141);
                en4.d(eu3.u, eu3.v, eu3.w, eu3.x);
                bo.LoginScreen(en4, eu3.Message - 50, eu3.z, 100, 20, 0, true);
                mFont.f.LoginScreen(en4, T.ab, eu3.Message, eu3.z + 5, 2);
                int n3 = 0;
                while (n3 < eu3.R) {
                    n2 = eu3.H + n3 * (eu3.J + 5);
                    bo.LoginScreen(en4, eu3.G, n2, eu3.I, eu3.J, eu3.r == n3 ? 1 : 0, true);
                    mFont.f.LoginScreen(en4, eu3.X[n3], eu3.G + eu3.I / 2, n2 + 5, 2);
                    ++n3;
                }
                en4.LoginScreen(10254674);
                en4.d(eu3.K, eu3.L, eu3.M, eu3.N);
                Object object = mFont.k.LoginScreen(eu3.Y[eu3.r], eu3.M - 10);
                n2 = 0;
                while (n2 < ((String[])object).length) {
                    mFont.SessionReceiver.LoginScreen(en4, object[n2], eu3.K + 5, eu3.L + 5 + n2 * 11, 0);
                    ++n2;
                }
                Object object2 = en4;
                object = eu3;
                int n4 = object.K;
                int n5 = object.L + object.N + 2;
                ((mGraphics)object2).LoginScreen(0xFFFFFF);
                ((mGraphics)object2).d(n4, n5, object.S, object.S);
                if (b) {
                    ((mGraphics)object2).LoginScreen(3329330);
                    ((mGraphics)object2).d(n4 + 1, n5 + 1, object.S - 2, object.S - 2);
                }
                mFont.f.LoginScreen((mGraphics)object2, object.Z, n4 + object.S + 2, n5, 0);
                eu3.LoginScreen(en4, 10, eu3.O);
                en4.LoginScreen(10254674);
                en4.d(eu3.A, eu3.B, eu3.C, eu3.D);
                en4.e(eu3.A, eu3.B, eu3.C, eu3.D);
                en4.LoginScreen(0, -eu3.o.b);
                int n6 = 0;
                while (n6 < eu3.d.size()) {
                    object2 = (de)eu3.d.elementAt(n6);
                    if (object2 != null) {
                        ((de)object2).LoginScreen(en4);
                        if (((de)object2).r && GameCanvas.w % 10 > 1) {
                            en4.LoginScreen(g.v, ((de)object2).j + 60, ((de)object2).k, 0);
                        }
                    }
                    ++n6;
                }
                GameCanvas.isLowGraphic(en4);
            }
        } else {
            int n7 = 0;
            while (n7 < this.d.size()) {
                if (this.d.elementAt(n7) != null) {
                    ((de)this.d.elementAt(n7)).LoginScreen(en2);
                }
                ++n7;
            }
        }
        super.LoginScreen(en2);
    }

    public final void d() {
        super.d();
        int n2 = this.c % this.i;
        int n3 = this.c / this.i;
        if (GameCanvas.i[4]) {
            if (n2 > 0) {
                --this.c;
            }
            GameCanvas.i[4] = false;
        } else if (GameCanvas.i[6]) {
            if (n2 < this.i - 1) {
                ++this.c;
            }
            GameCanvas.i[6] = false;
        } else if (GameCanvas.i[2]) {
            if (n3 > 0) {
                this.c -= this.i;
            }
            GameCanvas.i[2] = false;
        } else if (GameCanvas.i[8]) {
            System.out.println("-----------vo mainSelect: " + this.c);
            if (n3 < this.j - 1) {
                this.c += this.i;
            }
            GameCanvas.i[8] = false;
        }
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.c >= this.d.size()) {
            this.c = this.d.size() - 1;
        }
        if (GameCanvas.i[5]) {
            ((de)this.d.elementAt(n2)).LoginScreen();
            GameCanvas.i[5] = false;
        }
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(int n2, Object object) {
        block12: {
            ds.c("perform trong ServerScr:" + n2);
            switch (n2) {
                case 999: {
                    eu eu2 = this;
                    byte[] byArray = new byte[2];
                    object = byArray;
                    byArray[0] = eu2.GameScreen;
                    object[1] = eu2.q;
                    RMS.LoginScreen(m, (byte[])object);
                    this.LoginScreen((int)this.GameScreen, 0);
                    return;
                }
                case 97: {
                    if (!this.LoginScreen) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < ServerListScreen.LoginScreen.length) {
                            if (ServerListScreen.d[n2] != 0) {
                                this.d.addElement(new de(ServerListScreen.LoginScreen[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.LoginScreen();
                        return;
                    }
                    break block12;
                }
                case 98: {
                    if (!this.LoginScreen) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < ServerListScreen.LoginScreen.length) {
                            if (ServerListScreen.d[n2] == 0) {
                                this.d.addElement(new de(ServerListScreen.LoginScreen[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.LoginScreen();
                        return;
                    }
                    break block12;
                }
                case 99: {
                    Session.LoginScreen().c();
                    ServerListScreen.LoginScreen(this.c, false);
                    break;
                }
                default: {
                    Session.LoginScreen().e();
                    ServerListScreen.LoginScreen(n2 - 100, true);
                    ServerListScreen.k();
                    if (GameCanvas.ak != null) break;
                    GameCanvas.ak = new ServerListScreen();
                }
            }
            GameCanvas.ak.i();
            GameCanvas.ak.b();
        }
    }

    private void methodLoginScreen(int n2, int n3) {
        this.n = false;
        if (Res.clientType != 1) {
            this.LoginScreen = true;
        }
        this.S = 10;
        this.w = GameCanvas.A / 3 << 1;
        this.x = GameCanvas.B / 3 << 1;
        this.u = (GameCanvas.A - this.w) / 2;
        this.v = (GameCanvas.B - this.x) / 2 + 20;
        this.Message = GameCanvas.A / 2;
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
        this.LoginScreen((byte)n2, (byte)n3);
    }

    private void methodLoginScreen(byte by2, byte by3) {
        de de2;
        int n2;
        this.d.removeAllElements();
        this.R = 1;
        this.GameScreen = by2;
        T.LoginScreen(by2);
        int n3 = 0;
        while (n3 < ServerListScreen.LoginScreen.length) {
            if (by2 == 1) {
                if (ServerListScreen.d[n3] != 0 && ServerListScreen.Item[n3] == 1) {
                    this.R = 2;
                }
            } else if (ServerListScreen.Item[n3] == 1) {
                this.R = 2;
            }
            ++n3;
        }
        if (by3 > (byte)(this.R - 1)) {
            by3 = (byte)(this.R - 1);
        }
        this.r = by3;
        n3 = 0;
        while (n3 < ServerListScreen.LoginScreen.length) {
            if (by2 == 1) {
                if (ServerListScreen.d[n3] != 0) {
                    if (ServerListScreen.Item[n3] == 1) {
                        this.R = 2;
                    }
                    if (ServerListScreen.Item[n3] == by3) {
                        n2 = -1;
                        if (ServerListScreen.e != null && n3 < ServerListScreen.e.length) {
                            n2 = ServerListScreen.e[n3];
                        }
                        if (!b || n2 != -1) {
                            de2 = new de(ServerListScreen.LoginScreen[n3], this, n3 + 100, null);
                            boolean bl2 = new de(ServerListScreen.LoginScreen[n3], this, n3 + 100, null).r = ServerListScreen.i[n3] == 1;
                            if (n2 >= 0) {
                                de2.i = Mob[n2];
                            }
                            this.d.addElement(de2);
                        }
                    }
                }
            } else {
                if (ServerListScreen.Item[n3] == 1) {
                    this.R = 2;
                }
                if (ServerListScreen.d[n3] == 0 && ServerListScreen.Item[n3] == by3) {
                    n2 = -1;
                    if (ServerListScreen.e != null && n3 < ServerListScreen.e.length) {
                        n2 = ServerListScreen.e[n3];
                    }
                    if (!b || n2 != -1) {
                        de2 = new de(ServerListScreen.LoginScreen[n3], this, n3 + 100, null);
                        boolean bl3 = new de(ServerListScreen.LoginScreen[n3], this, n3 + 100, null).r = ServerListScreen.i[n3] == 1;
                        if (n2 >= 0) {
                            de2.i = Mob[n2];
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
            de de3 = (de)eu2.d.elementAt(by3);
            n2 = by3 + 1;
            while (n2 < eu2.d.size()) {
                de2 = (de)eu2.d.elementAt(n2);
                if (de2.r && !de3.r) {
                    de de4 = de2;
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
        this.c = ServerListScreen.n;
        eu2.Item = 5;
        eu2.f = 76;
        eu2.g = Screen.cr;
        eu2.i = 1;
        by3 = (byte)(eu2.A + eu2.C / 2 + 3);
        eu2.F = eu2.B + 5;
        eu2.i = eu2.C / (eu2.f + eu2.Item);
        if (eu2.i <= 0) {
            eu2.i = 1;
        }
        eu2.j = eu2.d.size() / eu2.i + (eu2.d.size() % eu2.i == 0 ? 0 : 1);
        eu2.E = by3 - eu2.i * (eu2.f + eu2.Item) / 2;
        int n4 = 0;
        while (n4 < eu2.d.size()) {
            de de5 = (de)eu2.d.elementAt(n4);
            if (de5 != null) {
                int n5 = eu2.E + n4 % eu2.i * (eu2.f + eu2.Item);
                int n6 = eu2.F + n4 / eu2.i * (eu2.g + eu2.Item);
                de5.j = n5;
                de5.k = n6;
                de5.Res = eu2.f;
            }
            ++n4;
        }
        eu2.o = new bh(eu2.A, eu2.B, eu2.C, eu2.D, 0, 0, 0, true);
        n4 = eu2.j * (eu2.g + eu2.Item) - eu2.D;
        bh bh2 = eu2.o;
        if (n4 < 0) {
            n4 = 0;
        }
        bh2.c = n4;
        if (bh2.b > bh2.c) {
            bh2.b = bh2.c;
        }
        if (bh2.LoginScreen > bh2.c) {
            bh2.LoginScreen = bh2.c;
        }
        bh2 = eu2.o;
        eu2.o.LoginScreen = 0;
    }

    private void methodLoginScreen(mGraphics en2, int n2, int n3) {
        this.T = n2 -= 5;
        bo.LoginScreen(en2, n2, n3, this.P, this.Q, 0, true);
        mFont.f.LoginScreen(en2, this.W[this.GameScreen], n2 + (this.P - 10) / 2, n3 + 5, 2);
        en2.LoginScreen(Mob.R, 0, 30, 9, 6, 0, n2 + this.P - 10, n3 + 14, 33);
        if (this.MyHashtable) {
            this.U = n3 + this.Q + 5;
            en2.LoginScreen(10254674);
            en2.d(n2, this.U, this.P, this.W.length * this.V + 1);
            n3 = 0;
            while (n3 < this.W.length) {
                mFont.SessionReceiver.LoginScreen(en2, this.W[n3], n2 + this.P / 2, this.U + n3 * this.V + 2, 2);
                if (this.GameScreen == n3) {
                    en2.LoginScreen(15591444);
                    en2.c(n2 + 2, this.U + n3 * this.V + 1, this.P - 4, this.V - 2);
                }
                ++n3;
            }
        }
    }

    private void e() {
        int n2;
        byte by2;
        if (!this.LoginScreen) {
            return;
        }
        int n3 = 0;
        if (this.o != null) {
            this.o.b();
            if (GameCanvas.b(this.A, 0, this.C, GameCanvas.B)) {
                this.o.LoginScreen();
            }
            n3 = this.o.b;
        }
        if (GameCanvas.b(this.A, this.B, this.C, this.D)) {
            by2 = (GameCanvas.GameScreen - this.E) / (this.f + this.Item) + (GameCanvas.q - this.F + n3) / (this.g + this.Item) * this.i;
            n2 = this.d.size();
            if (by2 >= 0 && by2 < n2) {
                this.c = by2;
                by2 = 0;
                while (by2 < this.d.size()) {
                    de de2 = (de)this.d.elementAt(by2);
                    if (de2 != null) {
                        if (by2 == this.c) {
                            if (de2.LoginScreen(0, n3)) {
                                de2.LoginScreen();
                            }
                        } else {
                            de2.n = false;
                        }
                    }
                    ++by2;
                }
            }
        }
        if (GameCanvas.b(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && GameCanvas.m) {
            b = !b;
            this.LoginScreen(this.GameScreen, this.r);
        }
        if (this.R == 1) {
            return;
        }
        by2 = 0;
        while (by2 < this.R) {
            n2 = this.H + by2 * (this.J + 5);
            if (GameCanvas.isLowGraphic(this.G, n2, this.I, this.J) && GameCanvas.k) {
                this.LoginScreen(this.GameScreen, by2);
                return;
            }
            by2 = (byte)(by2 + 1);
        }
    }

    private void f() {
        if (GameCanvas.b(this.T, this.O, this.P, this.Q) && GameCanvas.m) {
            this.MyHashtable = !this.MyHashtable;
            GameCanvas.m = false;
        }
        if (this.MyHashtable) {
            int n2 = 0;
            while (n2 < this.W.length) {
                int n3 = this.U + n2 * this.V;
                if (GameCanvas.isLowGraphic(this.T, n3, this.P, this.V) && GameCanvas.k) {
                    if (this.n) {
                        this.GameScreen = (byte)n2;
                    } else {
                        this.LoginScreen(n2, (int)this.r);
                    }
                    this.MyHashtable = false;
                    return;
                }
                n2 = (byte)(n2 + 1);
            }
        }
    }

    private void g() {
        byte[] byArray = RMS.b(m);
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

