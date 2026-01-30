/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class ag {
    private static int a;
    private static int IActionListener;
    private static int c;
    private static boolean d;
    private static String e;

    static {
        e = "";
    }

    public static void a() {
        a = 0;
        IActionListener = 0;
        d = false;
    }

    public static void a(MGraphics en2, String string, int n2, int n3, int n4, int n5, mFont di2) {
        if (c != di2.a(string) || !e.equals(string)) {
            e = string;
            a = 0;
            c = di2.a(string);
            d = false;
            IActionListener = 0;
        }
        en2.e(n2, n3, n4, n5);
        if (c > n4) {
            di2.a(en2, string, n2 - a, n3, 0);
        } else {
            di2.a(en2, string, n2 + n4 / 2, n3, 2);
        }
        main.GameCanvas.a(en2);
        if (c > n4) {
            if (!d) {
                if (++IActionListener > 50 && ++a >= c) {
                    IActionListener = 0;
                    a = -n4 + 30;
                    d = true;
                    return;
                }
            } else {
                if (a < 0) {
                    int n6 = n4 + a >> 1;
                    a += n6;
                }
                if (a > 0) {
                    a = 0;
                }
                if (a == 0 && ++IActionListener == 50) {
                    IActionListener = 0;
                    d = false;
                }
            }
        }
    }
}

