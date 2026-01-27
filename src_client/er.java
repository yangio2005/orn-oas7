import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class er
extends Screen
implements b {
    private static er b;
    public cd[] LoginScreen;
    private int c;
    private int d;
    private int e;
    private int f;
    private String[] g;
    private String Item;
    private cq i;
    private int j;
    private int k;

    public static er LoginScreen() {
        if (b == null) {
            b = new er();
        }
        return b;
    }

    public final void b() {
        if (Res.clientType == 5 && this.LoginScreen.length == 1 || Res.clientType == 3 && this.LoginScreen.length == 1) {
            this.i = new cq();
            this.i.Item = this.Item;
            this.i.LoginScreen.i = this.LoginScreen[0].f;
            this.i.g = "";
            this.i.b = true;
            this.i.LoginScreen.c(0);
            if (GameCanvas.e) {
                return;
            }
        } else {
            this.j = 0;
            super.b();
        }
    }

    public final void methodLoginScreen(int n2, String string) {
        this.k = n2;
        er er2 = this;
        this.Item = string;
        er2.e = GameCanvas.A - 20;
        if (er2.e > 320) {
            er2.e = 320;
        }
        ds.c("title= " + string);
        er2.g = mFont.f.LoginScreen(string, er2.e - 20);
        er2.c = (GameCanvas.A - er2.e) / 2;
        er2.LoginScreen = new cd[er2.k];
        er2.f = er2.LoginScreen.length * 35 + (er2.g.length - 1) * 20 + 40;
        er2.d = GameCanvas.B - er2.f - 40 - (er2.g.length - 1) * 20;
        int n3 = 0;
        while (n3 < er2.LoginScreen.length) {
            er2.LoginScreen[n3] = new cd();
            er2.LoginScreen[n3].i = "";
            er2.LoginScreen[n3].LoginScreen = er2.c + 10;
            er2.LoginScreen[n3].b = er2.d + 35 + (er2.g.length - 1) * 20 + n3 * 35;
            er2.LoginScreen[n3].c = er2.e - 20;
            er2.LoginScreen[n3].d = Screen.cp + 2;
            er2.LoginScreen[0].e = !GameCanvas.e;
            if (!GameCanvas.e) {
                er2.co = er2.LoginScreen[0].j;
            }
            ++n3;
        }
        er2.cm = new de(T.bj, er2, 1, null);
        er2.cn = new de(T.ServerListScreen, er2, 2, null);
        if (GameCanvas.e) {
            er2.cn.j = GameCanvas.A / 2 + 18;
            er2.cm.j = GameCanvas.A / 2 - 85;
            er2.cn.k = er2.cm.k = er2.d + er2.f + 5;
        }
        this.b();
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameScreen.j().LoginScreen(en2);
        bo.LoginScreen(en2, this.c, this.d, this.e, this.f, -1, true);
        int n2 = 0;
        while (n2 < this.g.length) {
            mFont.g.LoginScreen(en2, this.g[n2], GameCanvas.A / 2, this.d + 15 + n2 * 20, 2);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.LoginScreen.length) {
            this.LoginScreen[n2].LoginScreen(en2);
            ++n2;
        }
        super.LoginScreen(en2);
    }

    public final void c() {
        GameScreen.j().c();
        int n2 = 0;
        while (n2 < this.LoginScreen.length) {
            this.LoginScreen[n2].c();
            ++n2;
        }
    }

    public final void methodLoginScreen(int n2) {
        int n3 = 0;
        while (n3 < this.LoginScreen.length) {
            if (this.LoginScreen[n3].e) {
                this.LoginScreen[n3].LoginScreen(n2);
                break;
            }
            ++n3;
        }
        super.LoginScreen(n2);
    }

    public final void d() {
        if (GameCanvas.i[2]) {
            --this.j;
            if (this.j < 0) {
                this.j = this.LoginScreen.length - 1;
            }
        } else if (GameCanvas.i[8]) {
            ++this.j;
            if (this.j > this.LoginScreen.length - 1) {
                this.j = 0;
            }
        }
        if (GameCanvas.i[2] || GameCanvas.i[8]) {
            GameCanvas.clearKeyHold();
            int n2 = 0;
            while (n2 < this.LoginScreen.length) {
                if (this.j == n2) {
                    this.LoginScreen[n2].e = true;
                    if (!GameCanvas.e) {
                        this.co = this.LoginScreen[n2].j;
                    }
                } else {
                    this.LoginScreen[n2].e = false;
                }
                if (GameCanvas.m && GameCanvas.isLowGraphic(this.LoginScreen[n2].LoginScreen, this.LoginScreen[n2].b, this.LoginScreen[n2].c, this.LoginScreen[n2].d)) {
                    this.j = n2;
                    break;
                }
                ++n2;
            }
        }
        super.d();
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1) {
            GameScreen.c.b();
            b = null;
        }
        if (n2 == 2) {
            if (Res.clientType == 5 && this.LoginScreen.length == 1 || Res.clientType == 3 && this.LoginScreen.length == 1) {
                if (this.i.LoginScreen.d() == null || this.i.LoginScreen.d().equals("")) {
                    GameCanvas.isLowGraphic(T.gj);
                    return;
                }
                this.LoginScreen[0].LoginScreen(this.i.LoginScreen.d());
                GameService.LoginScreen().LoginScreen(this.LoginScreen);
                GameScreen.c.b();
                return;
            }
            n2 = 0;
            while (n2 < this.LoginScreen.length) {
                if (this.LoginScreen[n2].d() == null || this.LoginScreen[n2].d().equals("")) {
                    GameCanvas.isLowGraphic(T.gj);
                    return;
                }
                ++n2;
            }
            GameService.LoginScreen().LoginScreen(this.LoginScreen);
            GameScreen.c.b();
        }
    }
}

