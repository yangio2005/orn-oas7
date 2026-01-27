/*
 * Decompiled with CFR 0.152.
 */
public final class ei {
    public static MyVector LoginScreen = new MyVector("vEff");

    public static void methodLoginScreen(ea ea2) {
        LoginScreen.addElement(ea2);
    }

    public static void methodLoginScreen(int n2) {
        if (ei.b(n2) != null) {
            LoginScreen.removeElement(ei.b(n2));
        }
    }

    private static ea b(int n2) {
        int n3 = 0;
        while (n3 < LoginScreen.size()) {
            ea ea2 = (ea)LoginScreen.elementAt(n3);
            if (ea2.LoginScreen == n2) {
                return ea2;
            }
            ++n3;
        }
        return null;
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < LoginScreen.size()) {
            if (((ea)ei.LoginScreen.elementAt((int)n5)).Item == -n4) {
                ((ea)LoginScreen.elementAt(n5)).LoginScreen(en2, n2, n3);
            }
            ++n5;
        }
    }

    public static void methodLoginScreen(mGraphics en2) {
        int n2 = 0;
        while (n2 < LoginScreen.size()) {
            if (((ea)ei.LoginScreen.elementAt((int)n2)).Item == 1) {
                ((ea)LoginScreen.elementAt(n2)).LoginScreen(en2);
            }
            ++n2;
        }
    }

    public static void b(mGraphics en2) {
        int n2 = 0;
        while (n2 < LoginScreen.size()) {
            if (((ea)ei.LoginScreen.elementAt((int)n2)).Item == 2) {
                ((ea)LoginScreen.elementAt(n2)).LoginScreen(en2);
            }
            ++n2;
        }
    }

    public static void c(mGraphics en2) {
        int n2 = 0;
        while (n2 < LoginScreen.size()) {
            if (((ea)ei.LoginScreen.elementAt((int)n2)).Item == 3) {
                ((ea)LoginScreen.elementAt(n2)).LoginScreen(en2);
            }
            ++n2;
        }
    }

    public static void d(mGraphics en2) {
        int n2 = 0;
        while (n2 < LoginScreen.size()) {
            if (((ea)ei.LoginScreen.elementAt((int)n2)).Item == 4) {
                ((ea)LoginScreen.elementAt(n2)).LoginScreen(en2);
            }
            ++n2;
        }
    }

    public static void methodLoginScreen() {
        int n2 = 0;
        while (n2 < LoginScreen.size()) {
            ((ea)LoginScreen.elementAt(n2)).LoginScreen();
            ++n2;
        }
    }
}

