import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class dz
implements b {
    public de LoginScreen;
    private de b;
    private String[] c;
    private int d;
    private int e;
    private int f = 120;
    private int g;
    private int Item;
    private long i;
    private long j;

    public final void methodLoginScreen(String string, de de2, de de3) {
        this.c = new String[]{string};
        this.g = 29;
        this.LoginScreen = de2;
        this.b = de3;
        this.LoginScreen.g = this.b.g = GameScreen.bo;
        this.LoginScreen.Item = this.b.Item = GameScreen.bp;
        this.LoginScreen.Res = mGraphics.LoginScreen(de2.g);
        this.b.Res = mGraphics.LoginScreen(de2.g);
        this.LoginScreen.m = mGraphics.b(de2.g);
        this.b.m = mGraphics.b(de2.g);
        this.i = System.currentTimeMillis();
        this.Item = this.c[0].length() / 3;
        if (this.Item < 15) {
            this.Item = 15;
        }
        ag.LoginScreen();
    }

    public final void methodLoginScreen(mGraphics en2) {
        bo.LoginScreen(en2, this.d, this.e, this.f, this.g + (!GameCanvas.e ? 10 : 0), 0xFFFFFF, false);
        if (this.c != null) {
            ag.LoginScreen(en2, this.c[0], this.d + 5, this.e + this.g / 2 - (GameCanvas.e ? 4 : 6), this.f - 10, this.g, mFont.k);
            if (GameCanvas.e) {
                this.LoginScreen.LoginScreen(en2);
                mFont.n.LoginScreen(en2, String.valueOf(this.Item), this.LoginScreen.j + this.LoginScreen.Res / 2, this.LoginScreen.k + this.LoginScreen.m + 5, 2, mFont.o);
                return;
            }
            if (cd.g) {
                mFont.b.LoginScreen(en2, String.valueOf(T.cK) + this.Item + ")", this.d + this.f / 2, this.e + this.g, 2);
                return;
            }
            mFont.b.LoginScreen(en2, String.valueOf(T.cL) + this.Item + ")", this.d + this.f / 2, this.e + this.g, 2);
        }
    }

    public final void methodLoginScreen() {
        if (this.c != null) {
            this.d = GameCanvas.A - 5 - this.f;
            this.e = 45;
            if (GameCanvas.A - 50 > 155 + this.f) {
                this.d = GameCanvas.A - 55 - this.f;
                this.e = 5;
            }
            this.LoginScreen.j = this.d - 35;
            this.LoginScreen.k = this.e;
            this.j = System.currentTimeMillis();
            ds.c("curr - last= " + (this.j - this.i));
            if (this.j - this.i >= 1000L) {
                this.i = System.currentTimeMillis();
                --this.Item;
            }
            if (this.Item == 0) {
                GameScreen.j().bQ = null;
            }
        }
    }

    public final void methodLoginScreen(int n2, Object object) {
    }
}

