/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class bp {
    public static boolean a;
    private static String c;
    private static String d;
    private static int e;
    public static boolean IActionListener;

    public static void a(String string, String string2, int n2) {
        if (string == null) {
            return;
        }
        a = true;
        c = string;
        d = string2;
        e = n2;
    }

    public static void a() {
        bp.a(GameStrings.aC, null, 1000);
        IActionListener = true;
    }

    public static void a(MGraphics en2) {
        if (!a) {
            return;
        }
        if (IActionListener && e > 4990) {
            return;
        }
        cx.a(main.GameCanvas.C - 75, 10, 150, 55, en2);
        if (IActionListener) {
            main.GameCanvas.a(main.GameCanvas.C - mFont.t.a(c) / 2 - 10, 38, en2);
            mFont.t.a(en2, c, main.GameCanvas.C + 5, 31, 2);
            return;
        }
        if (d != null) {
            mFont.t.a(en2, c, main.GameCanvas.C, 23, 2);
            mFont.m.a(en2, d, main.GameCanvas.C, 40, 2);
            return;
        }
        mFont.t.a(en2, c, main.GameCanvas.C, 31, 2);
    }

    public static void IActionListener() {
        if (!a) {
            return;
        }
        if (e > 0 && --e <= 0) {
            bp.c();
        }
    }

    public static void c() {
        c = "";
        d = null;
        IActionListener = false;
        e = 0;
        a = false;
    }
}

