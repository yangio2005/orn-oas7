/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import main.GameCanvas;
import java.util.Vector;

public final class du {
    private static Random LoginScreen = new Random();
    private static Vector b = new Vector();
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int Item;
    private static int i;
    private static float j;
    private static int[] k;
    private static int[] Res;
    private static boolean m;
    private static long n;
    private static long o;

    static {
        k = new int[3];
        Res = new int[3];
        m = false;
        n = 0L;
        o = 150L;
    }

    public static void methodLoginScreen(mGraphics en2) {
        if (m) {
            du.Res[2] = Res[1];
            du.k[2] = k[1];
            du.Res[1] = Res[0];
            du.k[1] = k[0];
            du.Res[0] = d;
            du.k[0] = c;
            c = (int)(Math.cos((double)e * Math.PI / 180.0) * (double)i * (double)Item) + f;
            d = (int)((double)i * Math.sin((double)e * Math.PI / 180.0) * (double)Item - (double)(0.0f * (float)Item * (float)Item / 2.0f));
            if (System.currentTimeMillis() - n >= o) {
                ++Item;
                n = System.currentTimeMillis();
            }
        }
        if (Item > 32 && m) {
            m = false;
            b.removeAllElements();
            b.addElement(new ad(ds.b(50, GameCanvas.A - 50), ds.b(GameCanvas.B - 100, GameCanvas.B), 5, 72));
        }
        en2.LoginScreen(0);
        en2.d(0, 0, 0, 0);
        en2.LoginScreen(0xFF0000);
        int n2 = 0;
        while (n2 < b.size()) {
            mGraphics en3 = en2;
            ad ad2 = (ad)b.elementAt(n2);
            int n3 = 0;
            while (n3 < ad2.LoginScreen.size()) {
                aj aj2 = (aj)ad2.LoginScreen.elementAt(n3);
                if (aj2.f < -200) {
                    ad2.LoginScreen.removeElementAt(n3);
                }
                mGraphics en4 = en3;
                aj.LoginScreen(en4, aj2.LoginScreen - aj2.e, aj2.b - aj2.f, aj2.j);
                int n4 = 0;
                while (n4 < 2) {
                    aj.LoginScreen(en4, aj2.LoginScreen - aj2.o[n4], aj2.b - aj2.GameScreen[n4], aj2.j);
                    ++n4;
                }
                if (aj2.n && System.currentTimeMillis() - aj2.Res >= aj2.m) {
                    ++aj2.i;
                    aj2.Res = System.currentTimeMillis();
                    aj2.o[1] = aj2.o[0];
                    aj2.GameScreen[1] = aj2.GameScreen[0];
                    aj2.o[0] = aj2.e;
                    aj2.GameScreen[0] = aj2.f;
                    aj2.e = (int)(Math.cos((double)aj2.Item * Math.PI / 180.0) * (double)aj2.c * (double)aj2.i) + aj2.d;
                    aj2.f = (int)((double)aj2.c * Math.sin((double)aj2.Item * Math.PI / 180.0) * (double)aj2.i - (double)(aj2.k * (float)aj2.i * (float)aj2.i / 2.0f)) + aj2.g;
                }
                ++n3;
            }
            ++n2;
        }
        if (!m) {
            int n5 = -(Math.abs(LoginScreen.nextInt() % 3) + 5);
            if (n5 == -5 && !m) {
                f = 0;
                e = 80;
                m = true;
                du.LoginScreen();
                return;
            }
            if (n5 == -7 && !m) {
                e = 60;
                f = 0;
                m = true;
                du.LoginScreen();
                return;
            }
            if (n5 == -6 && !m) {
                e = 120;
                f = 0;
                m = true;
                du.LoginScreen();
            }
        }
    }

    private static void methodLoginScreen() {
        g = 0;
        i = 16;
        Item = 0;
        j = 0.0f;
        int n2 = 0;
        while (n2 < 3) {
            du.Res[n2] = 0;
            du.k[n2] = f;
            ++n2;
        }
        m = true;
    }
}

