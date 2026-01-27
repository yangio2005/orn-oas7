/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class es {
    private static Image c = Res.loadImage("/mainImage/myTexture2dmobCapcha.png");
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int Item;
    private static int i;
    private static int j;
    private static int k;
    public static boolean LoginScreen;
    private static int Res;
    private static int m;
    private static int n;
    private static int o;
    public static boolean b;

    static {
        Res = 0;
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3) {
        if (!b) {
            if (GameCanvas.w % 3 == 0) {
                if (Char.e().I == 1) {
                    Item = n2 - 20 - GameScreen.j;
                }
                if (Char.e().I == -1) {
                    Item = n2 + 20 - GameScreen.j;
                }
            }
            d = Char.e().C - 40 - GameScreen.k;
        } else {
            if (++Res == 5) {
                b = false;
                Res = 0;
            }
            Item = n2 - GameScreen.j;
            d = n3 - GameScreen.k;
        }
        o = i > n2 - GameScreen.j ? -1 : 1;
        en2.LoginScreen(GameScreen.Session, i, e - 40, 3);
        bo.LoginScreen(en2, i - 25, e - 70, 50, 20, 0xFFFFFF, false);
        mFont.f.LoginScreen(en2, GameScreen.j().ServerListScreen, i, e - 65, 2);
        if (LoginScreen) {
            LoginScreen = false;
            ei.LoginScreen(new ea(18, i + GameScreen.j, e + GameScreen.k, 2, 10, -1));
            GameScreen.j().aL = null;
            Item = -GameScreen.j;
            d = -GameScreen.k;
        }
        en2.LoginScreen(c, 0, n * 40, 40, 40, o == 1 ? 0 : 2, i, e + 3 + (GameCanvas.w % 10 > 5 ? 1 : 0), 3);
        if (e != d) {
            g = d - e << 2;
            e += (f += g) >> 4;
            f &= 0xF;
        }
        if (i != Item) {
            k = Item - i << 2;
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

