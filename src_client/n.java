/*
 * Decompiled with CFR 0.152.
 */

public abstract class n {
    public de b;
    public de c;
    public de d;

    public void methodLoginScreen(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, 0, LoginScreen.A, LoginScreen.B);
        cx.LoginScreen(en2, this.b, this.c, this.d);
    }

    public void methodLoginScreen(int n2) {
        switch (n2) {
            case -38: 
            case -1: {
                LoginScreen.j[2] = true;
                LoginScreen.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                LoginScreen.j[8] = true;
                LoginScreen.i[8] = true;
                return;
            }
            case -21: 
            case -6: {
                LoginScreen.j[12] = true;
                LoginScreen.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                LoginScreen.j[13] = true;
                LoginScreen.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                LoginScreen.j[5] = true;
                LoginScreen.i[5] = true;
                return;
            }
            case -27: {
                return;
            }
        }
    }

    public void methodLoginScreen() {
        if (this.c != null && (LoginScreen.i[5] || Screen.LoginScreen(this.c))) {
            LoginScreen.i[5] = false;
            LoginScreen.Res = false;
            Screen.cs = -1;
            LoginScreen.m = false;
            if (this.c != null) {
                this.c.LoginScreen();
            }
            Screen.cs = -1;
        }
        if (this.b != null && (LoginScreen.i[12] || Screen.LoginScreen(this.b))) {
            LoginScreen.i[12] = false;
            LoginScreen.Res = false;
            Screen.cs = -1;
            LoginScreen.m = false;
            if (this.b != null) {
                this.b.LoginScreen();
            }
            Screen.cs = -1;
        }
        if (this.d != null && (LoginScreen.i[13] || Screen.LoginScreen(this.d))) {
            LoginScreen.i[13] = false;
            LoginScreen.Res = false;
            LoginScreen.m = false;
            Screen.cs = -1;
            if (this.d != null) {
                this.d.LoginScreen();
            }
            Screen.cs = -1;
        }
        LoginScreen.f();
        LoginScreen.g();
    }
}

