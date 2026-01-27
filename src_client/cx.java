/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class cx {
    private static int b = 15787715;
    private static Image[] c = new Image[6];
    public static int LoginScreen;
    private static int d;

    static {
        int n2 = 0;
        while (n2 < c.length) {
            cx.c[n2] = Res.loadImage("/mainImage/myTexture2dgoc" + (n2 + 1) + ".png");
            ++n2;
        }
        LoginScreen = 24;
        d = 0;
        Res.loadImage("/mainImage/myTexture2dcheck.png");
    }

    public cx() {
        int[] nArray = new int[]{15970400, -844109861, 0x225544, 16374659, 15906669, 12931125, 3108954};
    }

    public static void methodLoginScreen(mGraphics en2, de de2, de de3, de de4) {
        mFont di2 = mFont.f;
        if (de2 != null && (d = di2.LoginScreen(de2.b)) > 0) {
            if (de2.j >= 0 && de2.k > 0) {
                de2.LoginScreen(en2);
            } else {
                en2.LoginScreen(Screen.cs == 0 ? GameScreen.ax : GameScreen.T, 1, GameCanvas.B - Screen.cr - 1, 0);
                di2.LoginScreen(en2, de2.b, 35, GameCanvas.B - Screen.cr + 3 + 3, 2);
            }
        }
        if (de3 != null && (d = di2.LoginScreen(de3.b)) > 0) {
            if (de3.j > 0 && de3.k > 0) {
                de3.LoginScreen(en2);
            } else {
                en2.LoginScreen(Screen.cs == 1 ? GameScreen.ax : GameScreen.T, GameCanvas.C - 35, GameCanvas.B - Screen.cr - 1, 0);
                di2.LoginScreen(en2, de3.b, GameCanvas.C, GameCanvas.B - Screen.cr + 3 + 3, 2);
            }
        }
        if (de4 != null && (d = di2.LoginScreen(de4.b)) > 0) {
            if (de4.j > 0 && de4.k > 0) {
                de4.LoginScreen(en2);
                return;
            }
            en2.LoginScreen(Screen.cs == 2 ? GameScreen.ax : GameScreen.T, GameCanvas.A - 71, GameCanvas.B - Screen.cr - 1, 0);
            di2.LoginScreen(en2, de4.b, GameCanvas.A - 35, GameCanvas.B - Screen.cr + 3 + 3, 2);
        }
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, String[] stringArray) {
        cx.b(n2, n3, n4, 69, en2);
        n3 = n3 + 20 - mFont.MyHashtable.LoginScreen();
        n5 = 0;
        while (n5 < stringArray.length) {
            mFont.MyHashtable.LoginScreen(en2, stringArray[n5], n2 + n4 / 2, n3, 2);
            ++n5;
            n3 += mFont.MyHashtable.LoginScreen();
        }
    }

    public static void methodLoginScreen(int n2, int n3, int n4, int n5, mGraphics en2) {
        en2.LoginScreen(9340251);
        en2.c(n2 + 18, n3, (n4 - 36) / 2 - 32, n5);
        en2.c(n2 + 18 + (n4 - 36) / 2 + 32, n3, (n4 - 36) / 2 - 22, n5);
        en2.c(n2, n3 + 8, n4, n5 - 17);
        en2.LoginScreen(b);
        en2.d(n2 + 18, n3 + 3, (n4 - 36) / 2 - 32, n5 - 4);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 31, n3 + 3, (n4 - 38) / 2 - 22, n5 - 4);
        en2.d(n2 + 1, n3 + 6, n4 - 1, n5 - 11);
        en2.LoginScreen(14667919);
        en2.d(n2 + 18, n3 + 1, (n4 - 36) / 2 - 32, 2);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + 1, (n4 - 36) / 2 - 12, 2);
        en2.d(n2 + 18, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        en2.d(n2 + 1, n3 + 11, 2, n5 - 18);
        en2.d(n2 + n4 - 2, n3 + 11, 2, n5 - 18);
        en2.LoginScreen(c[0], n2 - 3, n3 - 2, 20);
        en2.LoginScreen(c[2], n2 + n4 + 3, n3 - 2, cj.b);
        en2.LoginScreen(c[1], n2 - 3, n3 + n5 + 3, cj.d);
        en2.LoginScreen(c[3], n2 + n4 + 4, n3 + n5 + 2, cj.e);
        en2.LoginScreen(c[4], n2 + n4 / 2, n3, cj.LoginScreen);
        en2.LoginScreen(c[5], n2 + n4 / 2, n3 + n5 + 1, cj.c);
    }

    public static void b(int n2, int n3, int n4, int n5, mGraphics en2) {
        en2.LoginScreen(13524492);
        en2.c(n2 + 6, n3, n4 - 12, n5);
        en2.c(n2, n3 + 6, n4, n5 - 12);
        en2.c(n2 + 7, n3 + 1, n4 - 14, n5 - 2);
        en2.c(n2 + 1, n3 + 7, n4 - 2, n5 - 14);
        en2.LoginScreen(14338484);
        en2.d(n2 + 8, n3 + 2, n4 - 16, n5 - 3);
        en2.d(n2 + 2, n3 + 8, n4 - 3, n5 - 14);
        en2.LoginScreen(GameCanvas.Z[2], n2, n3, 20);
        en2.LoginScreen(GameCanvas.Z[2], 0, 0, 16, 16, 2, n2 + n4 + 1, n3, cj.b);
        en2.LoginScreen(GameCanvas.Z[2], 0, 0, 16, 16, 1, n2, n3 + n5 + 1, cj.d);
        en2.LoginScreen(GameCanvas.Z[2], 0, 0, 16, 16, 3, n2 + n4 + 1, n3 + n5 + 1, cj.e);
    }

    public static void c(int n2, int n3, int n4, int n5, mGraphics en2) {
        en2.LoginScreen(0x664400);
        en2.d(n2, n3, n4, n5);
        en2.LoginScreen(14338484);
        en2.d(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
    }
}

