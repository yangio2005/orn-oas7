/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class es {
    private static Image c = ResourceUtil.IActionListener("/mainImage/myTexture2dmobCapcha.png");
    private static int d;
    private static int e;
    private static int f;
    private static int UIPanel;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    public static boolean a;
    private static int ResourceUtil;
    private static int m;
    private static int n;
    private static int o;
    public static boolean IActionListener;

    static {
        ResourceUtil = 0;
    }

    public static void a(MGraphics en2, int n2, int n3) {
        if (!IActionListener) {
            if (main.GameCanvas.w % 3 == 0) {
                if (GameWorld.e().I == 1) {
                    h = n2 - 20 - GameScreen.j;
                }
                if (GameWorld.e().I == -1) {
                    h = n2 + 20 - GameScreen.j;
                }
            }
            d = GameWorld.e().C - 40 - GameScreen.k;
        } else {
            if (++ResourceUtil == 5) {
                IActionListener = false;
                ResourceUtil = 0;
            }
            h = n2 - GameScreen.j;
            d = n3 - GameScreen.k;
        }
        o = i > n2 - GameScreen.j ? -1 : 1;
        en2.a(GameScreen.NetworkService, i, e - 40, 3);
        bo.a(en2, i - 25, e - 70, 50, 20, 0xFFFFFF, false);
        mFont.f.a(en2, GameScreen.j().bs, i, e - 65, 2);
        if (a) {
            a = false;
            ei.a(new ea(18, i + GameScreen.j, e + GameScreen.k, 2, 10, -1));
            GameScreen.j().aL = null;
            h = -GameScreen.j;
            d = -GameScreen.k;
        }
        en2.a(c, 0, n * 40, 40, 40, o == 1 ? 0 : 2, i, e + 3 + (main.GameCanvas.w % 10 > 5 ? 1 : 0), 3);
        if (e != d) {
            UIPanel = d - e << 2;
            e += (f += UIPanel) >> 4;
            f &= 0xF;
        }
        if (i != h) {
            k = h - i << 2;
            i += (j += k) >> 4;
            j &= 0xF;
        }
        if (++m == 5) {
            m = 0;
            if (++n > 2) {
                n = 0;
            }
        }
    }
}

