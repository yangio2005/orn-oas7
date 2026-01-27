import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class v {
    public static int LoginScreen;
    public static int b;
    public static int c;
    public static int d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean Item;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean Res;
    public static boolean m;

    public static boolean methodLoginScreen(int n2, int n3) {
        return Char.e().aD != null && Char.e().aD.c == n2 && Char.e().aD.LoginScreen == 0;
    }

    public static void methodLoginScreen() {
        if (GameCanvas.G.LoginScreen) {
            i = false;
        }
        if (GameScreen.SessionReceiver() != null) {
            LoginScreen = GameScreen.SessionReceiver().B;
            b = GameScreen.SessionReceiver().C;
            k = 0;
            j = true;
            c = GameCanvas.e ? 1 : 0;
        }
    }

    public static void methodLoginScreen(int n2) {
        if (GameCanvas.G.LoginScreen) {
            return;
        }
        if (bo.LoginScreen.size() - 1 < n2) {
            return;
        }
        bo bo2 = (bo)bo.LoginScreen.elementAt(n2);
        LoginScreen = bo2.d + bo2.b / 2;
        b = bo2.e + 30;
        i = !bo2.k && bo2.j;
        c = 0;
        j = true;
        k = 0;
        if (!GameCanvas.e) {
            i = false;
        }
    }

    public static void b() {
        Mob aa2;
        c = 1;
        if (GameCanvas.G.LoginScreen) {
            i = false;
        }
        boolean bl2 = false;
        int n2 = 0;
        while (n2 < GameScreen.F.size()) {
            aa2 = (Mob)GameScreen.F.elementAt(n2);
            if (aa2.f) {
                bl2 = true;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < GameScreen.F.size()) {
            aa2 = (Mob)GameScreen.F.elementAt(n2);
            if (aa2.f) {
                LoginScreen = aa2.m;
                b = aa2.n + 5;
                j = true;
                if (aa2.GameScreen != 0) break;
                aa2.f = false;
                return;
            }
            if (!bl2) {
                if (aa2.GameScreen == 0) {
                    aa2.f = false;
                } else {
                    aa2.f = true;
                    return;
                }
            }
            ++n2;
        }
    }

    public static boolean c() {
        if (GameCanvas.G.LoginScreen) {
            i = false;
        }
        int n2 = 0;
        while (n2 < GameScreen.E.size()) {
            ItemMap ce2 = (ItemMap)GameScreen.E.elementAt(n2);
            if (ce2.c == Char.e().J && ce2.e.LoginScreen == 73) {
                c = 1;
                LoginScreen = ce2.LoginScreen;
                b = ce2.b + 5;
                j = true;
                return true;
            }
            ++n2;
        }
        return false;
    }
}

