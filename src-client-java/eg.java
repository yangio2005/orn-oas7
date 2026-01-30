/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class eg {
    public Image a;
    public int IActionListener;
    public int c;
    public int d;

    public eg(Image image, int n2) {
        this.a = image;
        this.b = n2;
        this.c = 0;
        this.d = 0;
    }

    public final void a(MGraphics en2, int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        int n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        MGraphics en3 = en2;
        eg eg2 = this;
        en3.IActionListener(eg2.a, 0, 0, MGraphics.a(eg2.a), MGraphics.IActionListener(eg2.a), n3, n4, n5, n6);
        if (main.GameCanvas.w % 1000 == 0) {
            ++eg2.c;
            eg2.d = eg2.c;
        }
    }

    public final void a(MGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        boolean bl2 = false;
        int n9 = n8;
        n8 = n7;
        n7 = n6;
        n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        MGraphics en3 = en2;
        eg eg2 = this;
        if (MGraphics.a(eg2.a) != 1) {
            en3.IActionListener(eg2.a, 0, n4 * n7, n7, n8, n3, n5, n6, n9);
            if (main.GameCanvas.w % 1000 == 0) {
                ++eg2.c;
                eg2.d = eg2.c;
            }
        }
    }
}

