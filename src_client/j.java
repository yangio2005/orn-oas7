import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class j
extends n {
    private String[] e;
    public cd LoginScreen;
    private int f = 40;

    public j() {
        if (GameCanvas.A <= 176) {
            this.f = 10;
        }
        this.LoginScreen = new cd();
        this.LoginScreen.LoginScreen = this.f + 10;
        this.LoginScreen.b = GameCanvas.B - Screen.cp - 43;
        this.LoginScreen.c = GameCanvas.A - 2 * (this.f + 10);
        this.LoginScreen.d = Screen.cp + 2;
        this.LoginScreen.e = true;
        this.d = this.LoginScreen.j;
    }

    public final void methodLoginScreen(String object, de de2, int n2) {
        this.LoginScreen.LoginScreen("");
        this.LoginScreen.c(n2);
        this.e = mFont.MyHashtable.LoginScreen((String)object, GameCanvas.A - (this.f << 1));
        this.b = new de(T.bj, GameCanvas.isLowGraphic(), 8882, null);
        this.c = de2;
        object = this;
        GameCanvas.K = object;
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameCanvas.M.LoginScreen(en2, this.f, GameCanvas.B - 77 - Screen.cr, GameCanvas.A - (this.f << 1), 69, this.e);
        this.LoginScreen.LoginScreen(en2);
        super.LoginScreen(en2);
    }

    public final void methodLoginScreen(int n2) {
        this.LoginScreen.LoginScreen(n2);
        super.LoginScreen(n2);
    }

    public final void methodLoginScreen() {
        this.LoginScreen.c();
        super.LoginScreen();
    }
}

