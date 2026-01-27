import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class cq
implements b {
    private static cq i;
    public cd LoginScreen;
    public boolean b = false;
    public bx c;
    private long j = 0L;
    public de d;
    public de e;
    public de f = null;
    private int k;
    private int Res;
    private int m;
    private int n;
    public String g;
    public String Item = String.valueOf(T.bq) + " ";

    public final void methodLoginScreen() {
        this.d = new de(T.ServerListScreen, this, 8000, null, 1, GameCanvas.B - Screen.cr + 1);
        this.e = new de(T.bk, this, 8001, null, GameCanvas.A - 70, GameCanvas.B - Screen.cr + 1);
        this.f = null;
        this.m = this.LoginScreen.c + 28;
        this.n = this.LoginScreen.d + 26;
        this.k = GameCanvas.A / 2 - this.m / 2;
        this.Res = this.LoginScreen.b - 18;
        if (this.m > 320) {
            this.m = 320;
        }
        this.d.j = this.k;
        this.e.j = this.k + this.m - 68;
        if (GameCanvas.e) {
            this.LoginScreen.b -= 5;
            this.Res -= 20;
            this.n += 30;
            this.d.j = GameCanvas.A / 2 - 68 - 5;
            this.e.j = GameCanvas.A / 2 + 5;
            this.d.k = GameCanvas.B - 30;
            this.e.k = GameCanvas.B - 30;
        }
    }

    public final void methodLoginScreen(int n2) {
        if (this.b) {
            this.LoginScreen.LoginScreen(n2);
        }
        if (this.LoginScreen.d().equals("")) {
            this.e.b = T.bj;
            return;
        }
        this.e.b = T.bk;
    }

    public static cq b() {
        if (i == null) {
            i = new cq();
            return i;
        }
        return i;
    }

    public cq() {
        this.LoginScreen = new cd();
        this.LoginScreen.i = T.bq;
        this.LoginScreen.c = GameCanvas.A - 32;
        if (this.LoginScreen.c > 250) {
            this.LoginScreen.c = 250;
        }
        this.LoginScreen.d = Screen.cp + 2;
        this.LoginScreen.LoginScreen = GameCanvas.A / 2 - this.LoginScreen.c / 2;
        this.LoginScreen.e = true;
        this.LoginScreen.b(80);
    }

    public final void methodLoginScreen(int n2, bx bx2, String string) {
        this.e.b = T.bj;
        this.g = string;
        this.LoginScreen.LoginScreen(n2);
        if (!this.LoginScreen.d().equals("") && GameCanvas.K == null) {
            this.c = bx2;
            this.b = true;
        }
    }

    public final void methodLoginScreen(String string) {
        this.e.b = T.bj;
        this.g = string;
        if (GameCanvas.K == null) {
            this.b = true;
            if (GameCanvas.e) {
                this.LoginScreen.LoginScreen();
            }
        }
    }

    public final void c() {
        if (!this.b) {
            return;
        }
        if (Res.clientType != 5 && Res.clientType != 3) {
            this.LoginScreen.c();
        }
        if (this.LoginScreen.Item) {
            this.LoginScreen.Item = false;
            this.c.LoginScreen(this.LoginScreen.d(), this.g);
            this.LoginScreen.LoginScreen("");
            this.e.b = T.bj;
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (!this.b) {
            return;
        }
        if (Res.clientType == 5 || Res.clientType == 3) {
            return;
        }
        bo.LoginScreen(en2, this.k, this.Res, this.m, this.n, -1, true);
        mFont.g.LoginScreen(en2, String.valueOf(this.Item) + this.g, this.LoginScreen.LoginScreen, this.LoginScreen.b - (GameCanvas.e ? 17 : 12), 0);
        cx.LoginScreen(en2, this.d, this.f, this.e);
        this.LoginScreen.LoginScreen(en2);
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 8000: {
                ds.c("perform chat 1");
                if (this.c == null) break;
                long l2 = System.currentTimeMillis();
                if (l2 - this.j < 1000L) {
                    return;
                }
                this.j = l2;
                this.c.LoginScreen(this.LoginScreen.d(), this.g);
                this.LoginScreen.LoginScreen("");
                this.e.b = T.bj;
                return;
            }
            case 8001: {
                ds.c("perform chat 2");
                if (this.LoginScreen.d().equals("")) {
                    this.b = false;
                    this.c.D();
                }
                this.LoginScreen.b();
            }
        }
    }
}

