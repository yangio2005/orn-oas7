import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class dr
implements b {
    int LoginScreen;
    private int GameScreen;
    int b;
    private int q;
    de c;
    de d;
    private int r = 24;
    public int e = 0;
    private int SessionReceiver = 50;
    public static dv f;
    public int g;
    public int Item;
    public int i;
    public int j;
    public boolean k;
    public boolean Res;
    public String m;
    private MyVector MyHashtable = new MyVector("vItems");
    int n;
    int o;

    public final void methodLoginScreen(boolean bl2) {
        Char.e();
        this.k = true;
        this.Res = false;
        dr dr2 = this;
        if (dr2.Res) {
            dr2.b = 170;
            dr2.q = 118;
            dr2.LoginScreen = GameCanvas.A / 2 - dr2.b / 2;
            dr2.GameScreen = GameCanvas.B / 2 - dr2.q / 2;
        } else {
            dr2.b = 170;
            dr2.q = 170;
            dr2.LoginScreen = GameCanvas.A / 2 - dr2.b / 2;
            dr2.GameScreen = GameCanvas.B / 2 - dr2.q / 2;
            if (GameCanvas.B < 240) {
                dr2.GameScreen -= 10;
            }
        }
        dr2.Item = dr2.LoginScreen;
        dr2.g = 0;
        dr2.e = ak.f.size();
        if (GameCanvas.e) {
            dr2.c.j = dr2.LoginScreen;
            dr2.c.k = dr2.GameScreen + dr2.q + 5;
            dr2.d.j = dr2.LoginScreen + dr2.b - 68;
            dr2.d.k = dr2.GameScreen + dr2.q + 5;
        }
        f = new dv();
        f.LoginScreen(dr2.e, dr2.r, dr2.LoginScreen, dr2.GameScreen + dr2.SessionReceiver, dr2.b, dr2.q - dr2.SessionReceiver, true, 1);
    }

    private void methodLoginScreen() {
        this.g = this.LoginScreen + this.b;
    }

    public dr() {
        this.c = new de(T.bw, this, 1, null);
        this.d = new de(T.bj, this, 2, null);
    }

    public final void methodLoginScreen(mGraphics en2) {
        en2.LoginScreen(-this.Item, 0);
        bo.LoginScreen(en2, this.LoginScreen, this.GameScreen - 17, this.b, this.q + 17, -1, true);
        mFont.f.LoginScreen(en2, T.dz, this.LoginScreen + this.b / 2, this.GameScreen - 7, 2);
        if (this.o >= 0 && this.o <= ak.f.size() - 1) {
            ak ak2 = (ak)ak.f.elementAt(this.o);
            if (ak2.c != null) {
                Char.e().LoginScreen(en2, ak2.c, GameCanvas.A / 2, this.GameScreen + 45, 1, false);
            }
        }
        Char.e().LoginScreen(en2, GameCanvas.A / 2, this.GameScreen + 45, 1, Char.e().ImageCache, false);
        en2.e(this.LoginScreen, this.GameScreen + this.SessionReceiver, this.b, this.q - this.SessionReceiver - 10);
        if (f != null) {
            en2.LoginScreen(0, -dr.f.d);
        }
        int n2 = 0;
        while (n2 < this.e) {
            int n3 = this.LoginScreen + 10;
            int n4 = this.GameScreen + n2 * this.r + this.SessionReceiver;
            if (n4 + this.r - (f != null ? dr.f.d : 0) >= this.GameScreen + this.SessionReceiver && n4 - (f != null ? dr.f.d : 0) <= this.GameScreen + this.SessionReceiver + this.q) {
                ak ak3 = (ak)ak.f.elementAt(n2);
                mFont di2 = mFont.o;
                if (n2 == this.o) {
                    di2 = mFont.q;
                }
                if (ak3.b != null) {
                    di2.LoginScreen(en2, ak3.b, n3 + 20, n4, 0);
                }
                if (ak3.d > 0) {
                    di2.LoginScreen(en2, String.valueOf(ak3.d) + " " + T.bD, n3 + this.b - 20, n4, 1);
                } else if (ak3.e > 0) {
                    di2.LoginScreen(en2, String.valueOf(ak3.e) + " " + T.bE, n3 + this.b - 20, n4, 1);
                }
                if (ak3.c != null) {
                    bl.b(en2, ak3.c[0], n3, n4, 0, 0);
                }
            }
            ++n2;
        }
        en2.LoginScreen(0, -en2.b());
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        cx.LoginScreen(en2, this.c, null, this.d);
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 2) {
            this.LoginScreen();
        }
        if (n2 == 1 && !this.Res && this.o >= 0) {
            this.LoginScreen();
            if (Char.e().ai == null) {
                GameService.LoginScreen().LoginScreen((byte)2, ((ak)ak.f.elementAt((int)this.o)).LoginScreen, this.m);
                return;
            }
            GameService.LoginScreen().LoginScreen((byte)4, ((ak)ak.f.elementAt((int)this.o)).LoginScreen, "");
        }
    }
}

