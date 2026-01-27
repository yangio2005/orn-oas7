import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class at
extends dc {
    private cp LoginScreen;
    private int b;
    private int c;
    private int d;
    private Char e;
    private Mob f;
    private short g = 0;
    private long Item = 0L;
    private int i;

    public static void methodLoginScreen(int n2, int n3, int n4, int n5) {
        at at2 = new at();
        new at().LoginScreen = GameScreen.Message[n2 - 1];
        at2.c = n3;
        at2.d = n4;
        at2.g = (short)n5;
        dc.x.addElement(at2);
    }

    public static void methodLoginScreen(int n2, int n3, int n4, int n5, int n6) {
        at at2 = new at();
        new at().LoginScreen = GameScreen.Message[n2 - 1];
        at2.c = n3;
        at2.d = n4;
        at2.g = 1;
        at2.i = n6;
        dc.x.addElement(at2);
    }

    public static void methodLoginScreen(int n2, Mob aa2, int n3) {
        at at2 = new at();
        new at().LoginScreen = GameScreen.Message[n2 - 1];
        at2.f = aa2;
        at2.g = 1;
        dc.x.addElement(at2);
    }

    public static void methodLoginScreen(int n2, Char af2, int n3) {
        at at2 = new at();
        new at().LoginScreen = GameScreen.Message[n2 - 1];
        at2.e = af2;
        at2.g = (short)n3;
        dc.x.addElement(at2);
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (mGraphics.b == 1) {
            ++GameScreen.aN;
        }
        if (GameScreen.aN < 11) {
            int n2;
            int n3;
            if (this.e != null) {
                this.c = this.e.B;
                this.d = this.e.C + GameCanvas.ae;
            }
            if (this.f != null) {
                this.c = this.f.m;
                this.d = this.f.n + GameCanvas.ae;
            }
            if (GameCanvas.d(n3 = this.c + this.LoginScreen.LoginScreen[this.b].LoginScreen, n2 = this.d + this.LoginScreen.LoginScreen[this.b].b)) {
                bl.b(en2, this.LoginScreen.LoginScreen[this.b].c, n3, n2, this.i, 3);
            }
        }
    }

    public final void methodLoginScreen() {
        if (0L != 0L) {
            ++this.b;
            if (this.b >= this.LoginScreen.LoginScreen.length) {
                this.b = 0;
            }
            if (System.currentTimeMillis() > 0L) {
                dc.x.removeElement(this);
            }
        } else {
            ++this.b;
            if (this.b >= this.LoginScreen.LoginScreen.length) {
                this.g = (short)(this.g - 1);
                if (this.g <= 0) {
                    dc.x.removeElement(this);
                } else {
                    this.b = 0;
                }
            }
        }
        if (GameCanvas.w % 11 == 0 && this.e != null && this.e != Char.e() && !GameScreen.D.contains(this.e)) {
            dc.x.removeElement(this);
        }
    }
}

