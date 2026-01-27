import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bc
extends n {
    private String[] e;
    public boolean LoginScreen;
    private int f;
    private int g = 35;
    private long Item = -1L;

    public bc() {
        if (GameCanvas.A <= 176) {
            this.g = 10;
        }
        if (GameCanvas.A > 320) {
            this.g = 80;
        }
    }

    public final void b() {
        this.LoginScreen(T.aC, null, null, null);
        GameCanvas.K = this;
        this.Item = Res.currentTimeMillis() + 5000L;
    }

    public final void c() {
        GameCanvas.K = this;
        this.Item = -1L;
    }

    public final void methodLoginScreen(String string) {
        this.e = mFont.MyHashtable.LoginScreen(string, GameCanvas.A - ((this.g << 1) + 20));
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * mFont.MyHashtable.LoginScreen() + 20;
        }
    }

    public final void methodLoginScreen(String string, de de2, de de3, de de4) {
        this.e = mFont.MyHashtable.LoginScreen(string, GameCanvas.A - ((this.g << 1) + 20));
        this.b = de2;
        this.c = de3;
        this.d = de4;
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * mFont.MyHashtable.LoginScreen() + 20;
        }
        if (GameCanvas.e) {
            if (de2 != null) {
                this.b.j = GameCanvas.A / 2 - 68 - 5;
                this.b.k = GameCanvas.B - 50;
            }
            if (de4 != null) {
                this.d.j = GameCanvas.A / 2 + 5;
                this.d.k = GameCanvas.B - 50;
            }
            if (de3 != null) {
                this.c.j = GameCanvas.A / 2 - 35;
                this.c.k = GameCanvas.B - 50;
            }
        }
        this.LoginScreen = false;
        this.Item = -1L;
    }

    public final void methodLoginScreen(mGraphics en2) {
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (x.c) {
            return;
        }
        int n2 = GameCanvas.B - this.f - 38;
        int n3 = GameCanvas.A - (this.g << 1);
        cx.LoginScreen(this.g, n2, n3, this.f, en2);
        n2 = n2 + (this.f - this.e.length * mFont.MyHashtable.LoginScreen()) / 2 - 2;
        if (this.LoginScreen) {
            GameCanvas.isLowGraphic(GameCanvas.C, (n2 += 8) - 12, en2);
        }
        n3 = 0;
        while (n3 < this.e.length) {
            mFont.f.LoginScreen(en2, this.e[n3], GameCanvas.C, n2, 2);
            ++n3;
            n2 += mFont.MyHashtable.LoginScreen();
        }
        super.LoginScreen(en2);
    }

    public final void methodLoginScreen() {
        super.LoginScreen();
        if (this.Item != -1L && Res.currentTimeMillis() > this.Item) {
            GameCanvas.instance();
        }
    }
}

