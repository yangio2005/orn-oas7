import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class cy {
    public short LoginScreen;
    public int b = 0;
    public int c;
    private long d;
    private long e;
    private boolean f;
    private int g;
    private int Item;
    private boolean i;
    private boolean j;
    private String k;
    private int Res = 100;

    public cy(short s2, int n2) {
        this.LoginScreen = s2;
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.g = n2;
        this.Item = n2;
        this.d = this.e = System.currentTimeMillis();
        this.f = s2 == 14;
    }

    public cy() {
    }

    public static boolean methodLoginScreen(int n2) {
        int n3 = 0;
        while (n3 < Char.Session.size()) {
            cy cy2 = (cy)Char.Session.elementAt(n3);
            if (cy2.LoginScreen == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public static boolean b(int n2) {
        int n3 = 0;
        while (n3 < GameScreen.bv.size()) {
            cy cy2 = (cy)GameScreen.bv.elementAt(n3);
            if (cy2.LoginScreen == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public static cy c(int n2) {
        int n3 = 0;
        while (n3 < Char.Session.size()) {
            cy cy2 = (cy)Char.Session.elementAt(n3);
            if (cy2.LoginScreen == n2) {
                return cy2;
            }
            ++n3;
        }
        return null;
    }

    public static cy d(int n2) {
        int n3 = 0;
        while (n3 < GameScreen.bv.size()) {
            cy cy2 = (cy)GameScreen.bv.elementAt(n3);
            if (cy2.LoginScreen == n2) {
                return cy2;
            }
            ++n3;
        }
        return null;
    }

    public final void methodLoginScreen(byte by2, String string, int n2) {
        this.j = n2 == -1;
        this.i = true;
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.LoginScreen = by2;
        this.g = n2;
        this.Item = n2;
        this.k = string;
        this.d = this.e = System.currentTimeMillis();
        this.f = this.LoginScreen == 14;
    }

    public final void methodLoginScreen(int n2, boolean bl2) {
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.g = n2;
        this.Item = n2;
        this.i = false;
        this.d = this.e = System.currentTimeMillis();
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3) {
        if (this.f) {
            if (Char.e() != null) {
                n2 = GameCanvas.A / 2 - 40;
                n3 = GameCanvas.B - 80;
                en2.LoginScreen(0x808080);
                en2.d(n2, n3, 80, 2);
                en2.LoginScreen(0xFFFFFF);
                if (this.Res > 0) {
                    en2.d(n2, n3, 80 * this.Res / 100, 2);
                    return;
                }
            }
        } else {
            String string = String.valueOf(this.c) + "'";
            if (this.c <= 0) {
                string = String.valueOf(this.b) + "SessionReceiver";
            }
            if (this.c < 0) {
                string = "";
            }
            if (this.j) {
                string = "";
            }
            mFont.c.LoginScreen(en2, String.valueOf(this.k) + " " + string, n2, n3, 0, mFont.f);
        }
    }

    public final void methodLoginScreen() {
        this.d = System.currentTimeMillis();
        if (this.d - this.e >= 1000L) {
            this.e = System.currentTimeMillis();
            --this.b;
            --this.Item;
            if (this.b <= 0) {
                this.b = 60;
                --this.c;
            }
            if (this.g > 0) {
                this.Res = this.Item * 100 / this.g;
            }
        }
        if (this.c < 0 && !this.i) {
            Char.Session.removeElement(this);
        }
        if (this.c < 0 && this.i && !this.j) {
            GameScreen.bv.removeElement(this);
        }
    }
}

