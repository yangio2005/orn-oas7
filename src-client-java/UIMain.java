/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.Vector;
import main.GameCanvas;

public final class UIMain {
    private static Random a = new Random();
    private static Vector IActionListener = new Vector();
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int UIPanel;
    private static int h;
    private static int i;
    private static float j;
    private static int[] k;
    private static int[] ResourceUtil;
    private static boolean m;
    private static long n;
    private static long o;

    static {
        k = new int[3];
        ResourceUtil = new int[3];
        m = false;
        n = 0L;
        o = 150L;
    }

    public static void a(MGraphics en2) {
        if (m) {
            UIMain.ResourceUtil[2] = ResourceUtil[1];
            du.k[2] = k[1];
            UIMain.ResourceUtil[1] = ResourceUtil[0];
            du.k[1] = k[0];
            UIMain.ResourceUtil[0] = d;
            du.k[0] = c;
            c = (int)(Math.cos((double)e * Math.PI / 180.0) * (double)i * (double)h) + f;
            d = (int)((double)i * Math.sin((double)e * Math.PI / 180.0) * (double)h - (double)(0.0f * (float)h * (float)h / 2.0f));
            if (System.currentTimeMillis() - n >= o) {
                ++h;
                n = System.currentTimeMillis();
            }
        }
        if (h > 32 && m) {
            m = false;
            IActionListener.removeAllElements();
            IActionListener.addElement(new ad(MathUtil.IActionListener(50, main.GameCanvas.A - 50), MathUtil.IActionListener(main.GameCanvas.B - 100, main.GameCanvas.B), 5, 72));
        }
        en2.a(0);
        en2.d(0, 0, 0, 0);
        en2.a(0xFF0000);
        int n2 = 0;
        while (n2 < IActionListener.size()) {
            MGraphics en3 = en2;
            ad ad2 = (ad)IActionListener.elementAt(n2);
            int n3 = 0;
            while (n3 < ad2.GameCanvas.size()) {
                aj aj2 = (aj)ad2.GameCanvas.elementAt(n3);
                if (aj2.f < -200) {
                    ad2.GameCanvas.removeElementAt(n3);
                }
                MGraphics en4 = en3;
                aj.a(en4, aj2.a - aj2.e, aj2.IActionListener - aj2.f, aj2.j);
                int n4 = 0;
                while (n4 < 2) {
                    aj.a(en4, aj2.a - aj2.o[n4], aj2.IActionListener - aj2.GameScreen[n4], aj2.j);
                    ++n4;
                }
                if (aj2.n && System.currentTimeMillis() - aj2.ResourceUtil >= aj2.m) {
                    ++aj2.i;
                    aj2.ResourceUtil = System.currentTimeMillis();
                    aj2.o[1] = aj2.o[0];
                    aj2.GameScreen[1] = aj2.GameScreen[0];
                    aj2.o[0] = aj2.e;
                    aj2.GameScreen[0] = aj2.f;
                    aj2.e = (int)(Math.cos((double)aj2.h * Math.PI / 180.0) * (double)aj2.c * (double)aj2.i) + aj2.d;
                    aj2.f = (int)((double)aj2.c * Math.sin((double)aj2.h * Math.PI / 180.0) * (double)aj2.i - (double)(aj2.k * (float)aj2.i * (float)aj2.i / 2.0f)) + aj2.UIPanel;
                }
                ++n3;
            }
            ++n2;
        }
        if (!m) {
            int n5 = -(Math.abs(GameCanvas.nextInt() % 3) + 5);
            if (n5 == -5 && !m) {
                f = 0;
                e = 80;
                m = true;
                du.a();
                return;
            }
            if (n5 == -7 && !m) {
                e = 60;
                f = 0;
                m = true;
                du.a();
                return;
            }
            if (n5 == -6 && !m) {
                e = 120;
                f = 0;
                m = true;
                du.a();
            }
        }
    }

    private static void a() {
        UIPanel = 0;
        i = 16;
        h = 0;
        j = 0.0f;
        int n2 = 0;
        while (n2 < 3) {
            UIMain.ResourceUtil[n2] = 0;
            du.k[n2] = f;
            ++n2;
        }
        m = true;
    }
}

