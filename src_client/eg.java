/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class eg {
    public Image LoginScreen;
    public int b;
    public int c;
    public int d;

    public eg(Image image, int n2) {
        this.LoginScreen = image;
        this.b = n2;
        this.c = 0;
        this.d = 0;
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        int n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        mGraphics en3 = en2;
        eg eg2 = this;
        en3.b(eg2.LoginScreen, 0, 0, mGraphics.LoginScreen(eg2.LoginScreen), mGraphics.b(eg2.LoginScreen), n3, n4, n5, n6);
        if (GameCanvas.w % 1000 == 0) {
            ++eg2.c;
            eg2.d = eg2.c;
        }
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        boolean bl2 = false;
        int n9 = n8;
        n8 = n7;
        n7 = n6;
        n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        mGraphics en3 = en2;
        eg eg2 = this;
        if (mGraphics.LoginScreen(eg2.LoginScreen) != 1) {
            en3.b(eg2.LoginScreen, 0, n4 * n7, n7, n8, n3, n5, n6, n9);
            if (GameCanvas.w % 1000 == 0) {
                ++eg2.c;
                eg2.d = eg2.c;
            }
        }
    }
}

