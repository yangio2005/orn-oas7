/*
 * Decompiled with CFR 0.152.
 */

public class Screen {
    public de cm;
    public de cn;
    public de co;
    public static int cp;
    public static int cq;
    public static int cr;
    public static int cs;

    static {
        cq = 68;
        cr = 26;
        cs = -1;
    }

    public void b() {
        LoginScreen.f();
        LoginScreen.g();
        LoginScreen.E = this;
        LoginScreen.Item.setFullScreenMode(true);
    }

    public void methodLoginScreen(int n2) {
    }

    public void c() {
    }

    public void d() {
        if (LoginScreen.i[5] || Screen.LoginScreen(LoginScreen.E.cn)) {
            LoginScreen.i[5] = false;
            cs = -1;
            LoginScreen.m = false;
            if (this.cn != null) {
                this.cn.LoginScreen();
            }
        }
        if (LoginScreen.i[12] || Screen.LoginScreen(LoginScreen.E.cm)) {
            LoginScreen.i[12] = false;
            cs = -1;
            LoginScreen.m = false;
            if (cq.b().b) {
                if (cq.b().d != null) {
                    cq.b().d.LoginScreen();
                }
            } else if (this.cm != null) {
                this.cm.LoginScreen();
            }
        }
        if (LoginScreen.i[13] || Screen.LoginScreen(LoginScreen.E.co)) {
            LoginScreen.i[13] = false;
            cs = -1;
            LoginScreen.m = false;
            if (cq.b().b) {
                if (cq.b().e != null) {
                    cq.b().e.LoginScreen();
                    return;
                }
            } else if (this.co != null) {
                this.co.LoginScreen();
            }
        }
    }

    public static boolean methodLoginScreen(de de2) {
        if (de2 == null) {
            return false;
        }
        if (de2.j >= 0 && de2.k != 0) {
            return de2.c();
        }
        if (LoginScreen.K != null) {
            if (LoginScreen.K.c != null && LoginScreen.LoginScreen(LoginScreen.A - cq >> 1, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (de2 == LoginScreen.K.c && LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
            if (LoginScreen.K.b != null && LoginScreen.LoginScreen(0, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (de2 == LoginScreen.K.b && LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
            if (LoginScreen.K.d != null && LoginScreen.LoginScreen(LoginScreen.A - cq, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if ((de2 == LoginScreen.K.d || de2 == cq.b().e) && LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
        } else {
            if (de2 == LoginScreen.E.cm && LoginScreen.LoginScreen(0, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
            if (de2 == LoginScreen.E.co && LoginScreen.LoginScreen(LoginScreen.A - cq, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if (LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
            if ((de2 == LoginScreen.E.cn || ae.m != null) && LoginScreen.LoginScreen(LoginScreen.A - cq >> 1, LoginScreen.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (LoginScreen.Res && LoginScreen.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public void methodLoginScreen(mGraphics en2) {
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, 0, LoginScreen.A, LoginScreen.B + 1);
        if (!cq.b().b && LoginScreen.K == null && !LoginScreen.F.LoginScreen) {
            cx.LoginScreen(en2, this.cm, this.cn, this.co);
        }
    }
}

