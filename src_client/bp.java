import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bp {
    public static boolean LoginScreen;
    private static String c;
    private static String d;
    private static int e;
    public static boolean b;

    public static void methodLoginScreen(String string, String string2, int n2) {
        if (string == null) {
            return;
        }
        LoginScreen = true;
        c = string;
        d = string2;
        e = n2;
    }

    public static void methodLoginScreen() {
        bp.LoginScreen(T.aC, null, 1000);
        b = true;
    }

    public static void methodLoginScreen(mGraphics en2) {
        if (!LoginScreen) {
            return;
        }
        if (b && e > 4990) {
            return;
        }
        cx.LoginScreen(GameCanvas.C - 75, 10, 150, 55, en2);
        if (b) {
            GameCanvas.isLowGraphic(GameCanvas.C - mFont.MyHashtable.LoginScreen(c) / 2 - 10, 38, en2);
            mFont.MyHashtable.LoginScreen(en2, c, GameCanvas.C + 5, 31, 2);
            return;
        }
        if (d != null) {
            mFont.MyHashtable.LoginScreen(en2, c, GameCanvas.C, 23, 2);
            mFont.m.LoginScreen(en2, d, GameCanvas.C, 40, 2);
            return;
        }
        mFont.MyHashtable.LoginScreen(en2, c, GameCanvas.C, 31, 2);
    }

    public static void b() {
        if (!LoginScreen) {
            return;
        }
        if (e > 0 && --e <= 0) {
            bp.c();
        }
    }

    public static void c() {
        c = "";
        d = null;
        b = false;
        e = 0;
        LoginScreen = false;
    }
}

