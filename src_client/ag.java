import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class ag {
    private static int LoginScreen;
    private static int b;
    private static int c;
    private static boolean d;
    private static String e;

    static {
        e = "";
    }

    public static void methodLoginScreen() {
        LoginScreen = 0;
        b = 0;
        d = false;
    }

    public static void methodLoginScreen(mGraphics en2, String string, int n2, int n3, int n4, int n5, mFont di2) {
        if (c != di2.LoginScreen(string) || !e.equals(string)) {
            e = string;
            LoginScreen = 0;
            c = di2.LoginScreen(string);
            d = false;
            b = 0;
        }
        en2.e(n2, n3, n4, n5);
        if (c > n4) {
            di2.LoginScreen(en2, string, n2 - LoginScreen, n3, 0);
        } else {
            di2.LoginScreen(en2, string, n2 + n4 / 2, n3, 2);
        }
        GameCanvas.isLowGraphic(en2);
        if (c > n4) {
            if (!d) {
                if (++b > 50 && ++LoginScreen >= c) {
                    b = 0;
                    LoginScreen = -n4 + 30;
                    d = true;
                    return;
                }
            } else {
                if (LoginScreen < 0) {
                    int n6 = n4 + LoginScreen >> 1;
                    LoginScreen += n6;
                }
                if (LoginScreen > 0) {
                    LoginScreen = 0;
                }
                if (LoginScreen == 0 && ++b == 50) {
                    b = 0;
                    d = false;
                }
            }
        }
    }
}

