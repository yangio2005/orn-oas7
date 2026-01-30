/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class v {
    public static int a;
    public static int IActionListener;
    public static int c;
    public static int d;
    public static boolean e;
    public static boolean f;
    public static boolean UIPanel;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean ResourceUtil;
    public static boolean m;

    public static boolean a(int n2, int n3) {
        return GameWorld.e().aD != null && GameWorld.e().aD.c == n2 && GameWorld.e().aD.a == 0;
    }

    public static void a() {
        if (main.GameCanvas.G.a) {
            i = false;
        }
        if (GameScreen.s() != null) {
            a = GameScreen.s().B;
            IActionListener = GameScreen.s().C;
            k = 0;
            j = true;
            c = main.GameCanvas.e ? 1 : 0;
        }
    }

    public static void a(int n2) {
        if (main.GameCanvas.G.a) {
            return;
        }
        if (bo.GameCanvas.size() - 1 < n2) {
            return;
        }
        bo bo2 = (bo)bo.GameCanvas.elementAt(n2);
        a = bo2.d + bo2.IActionListener / 2;
        IActionListener = bo2.e + 30;
        i = !bo2.k && bo2.j;
        c = 0;
        j = true;
        k = 0;
        if (!main.GameCanvas.e) {
            i = false;
        }
    }

    public static void IActionListener() {
        aa aa2;
        c = 1;
        if (main.GameCanvas.G.a) {
            i = false;
        }
        boolean bl2 = false;
        int n2 = 0;
        while (n2 < GameScreen.F.size()) {
            aa2 = (aa)GameScreen.F.elementAt(n2);
            if (aa2.f) {
                bl2 = true;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < GameScreen.F.size()) {
            aa2 = (aa)GameScreen.F.elementAt(n2);
            if (aa2.f) {
                a = aa2.m;
                IActionListener = aa2.n + 5;
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
        if (main.GameCanvas.G.a) {
            i = false;
        }
        int n2 = 0;
        while (n2 < GameScreen.E.size()) {
            ce ce2 = (ce)GameScreen.E.elementAt(n2);
            if (ce2.c == GameWorld.e().J && ce2.e.a == 73) {
                c = 1;
                a = ce2.a;
                IActionListener = ce2.IActionListener + 5;
                j = true;
                return true;
            }
            ++n2;
        }
        return false;
    }
}

