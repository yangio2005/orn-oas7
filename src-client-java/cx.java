/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class cx {
    private static int IActionListener = 15787715;
    private static Image[] c = new Image[6];
    public static int a;
    private static int d;

    static {
        int n2 = 0;
        while (n2 < c.length) {
            cx.c[n2] = ResourceUtil.IActionListener("/mainImage/myTexture2dgoc" + (n2 + 1) + ".png");
            ++n2;
        }
        a = 24;
        d = 0;
        ResourceUtil.IActionListener("/mainImage/myTexture2dcheck.png");
    }

    public cx() {
        int[] nArray = new int[]{15970400, -844109861, 0x225544, 16374659, 15906669, 12931125, 3108954};
    }

    public static void a(MGraphics en2, Command de2, Command de3, Command de4) {
        mFont di2 = mFont.f;
        if (de2 != null && (d = di2.a(de2.IActionListener)) > 0) {
            if (de2.j >= 0 && de2.k > 0) {
                de2.a(en2);
            } else {
                en2.a(Screen.cs == 0 ? GameScreen.ax : GameScreen.GameStrings, 1, main.GameCanvas.B - Screen.cr - 1, 0);
                di2.a(en2, de2.IActionListener, 35, main.GameCanvas.B - Screen.cr + 3 + 3, 2);
            }
        }
        if (de3 != null && (d = di2.a(de3.IActionListener)) > 0) {
            if (de3.j > 0 && de3.k > 0) {
                de3.a(en2);
            } else {
                en2.a(Screen.cs == 1 ? GameScreen.ax : GameScreen.GameStrings, main.GameCanvas.C - 35, main.GameCanvas.B - Screen.cr - 1, 0);
                di2.a(en2, de3.IActionListener, main.GameCanvas.C, main.GameCanvas.B - Screen.cr + 3 + 3, 2);
            }
        }
        if (de4 != null && (d = di2.a(de4.IActionListener)) > 0) {
            if (de4.j > 0 && de4.k > 0) {
                de4.a(en2);
                return;
            }
            en2.a(Screen.cs == 2 ? GameScreen.ax : GameScreen.GameStrings, main.GameCanvas.A - 71, main.GameCanvas.B - Screen.cr - 1, 0);
            di2.a(en2, de4.IActionListener, main.GameCanvas.A - 35, main.GameCanvas.B - Screen.cr + 3 + 3, 2);
        }
    }

    public final void a(MGraphics en2, int n2, int n3, int n4, int n5, String[] stringArray) {
        cx.IActionListener(n2, n3, n4, 69, en2);
        n3 = n3 + 20 - mFont.t.a();
        n5 = 0;
        while (n5 < stringArray.length) {
            mFont.t.a(en2, stringArray[n5], n2 + n4 / 2, n3, 2);
            ++n5;
            n3 += mFont.t.a();
        }
    }

    public static void a(int n2, int n3, int n4, int n5, MGraphics en2) {
        en2.a(9340251);
        en2.c(n2 + 18, n3, (n4 - 36) / 2 - 32, n5);
        en2.c(n2 + 18 + (n4 - 36) / 2 + 32, n3, (n4 - 36) / 2 - 22, n5);
        en2.c(n2, n3 + 8, n4, n5 - 17);
        en2.a(IActionListener);
        en2.d(n2 + 18, n3 + 3, (n4 - 36) / 2 - 32, n5 - 4);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 31, n3 + 3, (n4 - 38) / 2 - 22, n5 - 4);
        en2.d(n2 + 1, n3 + 6, n4 - 1, n5 - 11);
        en2.a(14667919);
        en2.d(n2 + 18, n3 + 1, (n4 - 36) / 2 - 32, 2);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + 1, (n4 - 36) / 2 - 12, 2);
        en2.d(n2 + 18, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        en2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        en2.d(n2 + 1, n3 + 11, 2, n5 - 18);
        en2.d(n2 + n4 - 2, n3 + 11, 2, n5 - 18);
        en2.a(c[0], n2 - 3, n3 - 2, 20);
        en2.a(c[2], n2 + n4 + 3, n3 - 2, cj.IActionListener);
        en2.a(c[1], n2 - 3, n3 + n5 + 3, cj.d);
        en2.a(c[3], n2 + n4 + 4, n3 + n5 + 2, cj.e);
        en2.a(c[4], n2 + n4 / 2, n3, cj.a);
        en2.a(c[5], n2 + n4 / 2, n3 + n5 + 1, cj.c);
    }

    public static void IActionListener(int n2, int n3, int n4, int n5, MGraphics en2) {
        en2.a(13524492);
        en2.c(n2 + 6, n3, n4 - 12, n5);
        en2.c(n2, n3 + 6, n4, n5 - 12);
        en2.c(n2 + 7, n3 + 1, n4 - 14, n5 - 2);
        en2.c(n2 + 1, n3 + 7, n4 - 2, n5 - 14);
        en2.a(14338484);
        en2.d(n2 + 8, n3 + 2, n4 - 16, n5 - 3);
        en2.d(n2 + 2, n3 + 8, n4 - 3, n5 - 14);
        en2.a(main.GameCanvas.Z[2], n2, n3, 20);
        en2.a(main.GameCanvas.Z[2], 0, 0, 16, 16, 2, n2 + n4 + 1, n3, cj.IActionListener);
        en2.a(main.GameCanvas.Z[2], 0, 0, 16, 16, 1, n2, n3 + n5 + 1, cj.d);
        en2.a(main.GameCanvas.Z[2], 0, 0, 16, 16, 3, n2 + n4 + 1, n3 + n5 + 1, cj.e);
    }

    public static void c(int n2, int n3, int n4, int n5, MGraphics en2) {
        en2.a(0x664400);
        en2.d(n2, n3, n4, n5);
        en2.a(14338484);
        en2.d(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
    }
}

