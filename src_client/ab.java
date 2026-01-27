import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class ab
extends Screen
implements b {
    private de[] b;
    public static bg[] LoginScreen;
    private int c;
    private int[] d = new int[]{GameCanvas.A / 2 - 100, GameCanvas.A / 2 - 100};
    private int e = 0;
    private int[] f = new int[2];
    private int[] g = new int[]{GameCanvas.A / 2 - 150, GameCanvas.B / 2 - 100, 300, 200};
    private int Item = -35;
    private int i = -35;

    public final void b() {
        ServerListScreen.c = false;
        Char.bI = false;
        x.c = false;
        ServerListScreen.m = false;
        GameScreen.j().LoginScreen();
        super.b();
    }

    public final void c() {
        this.c = GameCanvas.w % 10 > 2 ? 1 : 0;
        int n2 = 0;
        while (n2 < this.b.length) {
            if (this.b[n2].c()) {
                this.b[n2].LoginScreen();
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.length) {
            if (GameCanvas.isLowGraphic(this.d[n2] + this.i, this.f[n2] + this.Item, this.g[2], 60) && GameCanvas.k) {
                this.e = n2;
                break;
            }
            ++n2;
        }
        super.c();
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameCanvas.c(en2);
        try {
            int n2;
            bo.LoginScreen(en2, this.g[0] - 10, this.g[1], this.g[2] + 20, this.g[3], 0xFFFFFF, true);
            if (this.b != null) {
                n2 = 0;
                while (n2 < this.b.length) {
                    this.b[n2].LoginScreen(en2);
                    ++n2;
                }
            }
            if (LoginScreen != null) {
                n2 = 0;
                while (n2 < LoginScreen.length) {
                    bo.LoginScreen(en2, this.d[n2] - 20, this.f[n2] + this.Item, this.g[2], 60, 0xFFFFFF, false);
                    RMS av2 = GameScreen.x[ab.LoginScreen[n2].c];
                    RMS av3 = GameScreen.x[ab.LoginScreen[n2].e];
                    RMS av4 = GameScreen.x[ab.LoginScreen[n2].d];
                    bl.b(en2, av2.LoginScreen[Char.bC[this.c][0][0]].LoginScreen, this.d[n2] + Char.bC[this.c][0][1] + av2.LoginScreen[Char.bC[this.c][0][0]].b, this.f[n2] - Char.bC[this.c][0][2] + av2.LoginScreen[Char.bC[this.c][0][0]].c, 0, 0);
                    bl.b(en2, av3.LoginScreen[Char.bC[this.c][1][0]].LoginScreen, this.d[n2] + Char.bC[this.c][1][1] + av3.LoginScreen[Char.bC[this.c][1][0]].b, this.f[n2] - Char.bC[this.c][1][2] + av3.LoginScreen[Char.bC[this.c][1][0]].c, 0, 0);
                    bl.b(en2, av4.LoginScreen[Char.bC[this.c][2][0]].LoginScreen, this.d[n2] + Char.bC[this.c][2][1] + av4.LoginScreen[Char.bC[this.c][2][0]].b, this.f[n2] - Char.bC[this.c][2][2] + av4.LoginScreen[Char.bC[this.c][2][0]].c, 0, 0);
                    if (this.e == n2) {
                        mFont.d.LoginScreen(en2, ab.LoginScreen[n2].b, this.d[n2] + this.g[2] - 25, this.f[n2] + this.Item, 1);
                        mFont.d.LoginScreen(en2, String.valueOf(T.de) + " " + ds.b(ab.LoginScreen[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.Item + mFont.d.LoginScreen(), 1);
                    } else {
                        mFont.f.LoginScreen(en2, ab.LoginScreen[n2].b, this.d[n2] + this.g[2] - 25, this.f[n2] + this.Item, 1);
                        mFont.f.LoginScreen(en2, String.valueOf(T.de) + " " + ds.b(ab.LoginScreen[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.Item + mFont.f.LoginScreen(), 1);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {}
        super.LoginScreen(en2);
    }

    public final void methodLoginScreen(byte n2) {
        this.d = new int[n2];
        this.f = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.d[n3] = this.g[0] + 20;
            this.f[n3] = n3 * 70 + this.g[1] + 50;
            ++n3;
        }
        this.b = new de[2];
        this.b[1] = new de("V\u00e0o game", this, 1, null, this.g[0] + this.g[2] - 80 - 80, this.g[1] + this.g[3] - 30);
        this.b[0] = new de("Tr\u1edd ra", this, 2, null, this.g[0] + this.g[2] - 80, this.g[1] + this.g[3] - 30);
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 1: {
                if (this.e == -1) break;
                GameCanvas.i();
                GameService.LoginScreen().MyHashtable(ab.LoginScreen[this.e].LoginScreen);
                return;
            }
            case 2: {
                GameCanvas.e();
            }
        }
    }
}

