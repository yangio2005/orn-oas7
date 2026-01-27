/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mGraphics {
    public Graphics LoginScreen;
    public static int b = 1;

    public final void methodLoginScreen(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.LoginScreen.fillArc(n2 *= b, n3 *= b, n4 *= b, n5 *= b, 0, 360);
    }

    public final void methodLoginScreen(Image image, int n2, int n3, int n4) {
        if (image == null) {
            return;
        }
        this.LoginScreen.drawImage(image, n2 *= b, n3 *= b, n4);
    }

    public final void methodLoginScreen(Image object, float f2, float f3, int n2) {
        int n3 = n2;
        float f4 = f3;
        f3 = f2;
        Image image = object;
        object = this;
        if (image != null) {
            object.LoginScreen.drawImage(image, (int)(f3 *= (float)b), (int)(f4 *= (float)b), n3);
        }
    }

    public final void methodLoginScreen(int n2, int n3, int n4, int n5) {
        this.LoginScreen.drawLine(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void methodLoginScreen(int n2, int n3, int n4, int n5, int n6) {
        this.LoginScreen.setColor(n6);
        this.LoginScreen.fillRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void b(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, n4, n5);
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, 1, n5);
        this.d(n2 + n4, n3, 1, n5);
        this.d(n2, n3, n4, 1);
        this.d(n2, n3 + n5, n4 + 1, 1);
    }

    public final void methodLoginScreen(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.LoginScreen.drawRegion(image, n2 *= b, n3 *= b, n4 *= b, n5 *= b, n6, n7 *= b, n8 *= b, n9);
    }

    public final void b(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.LoginScreen(image, 0, n3, n4, n5, n6, n7, n8, n9);
    }

    public final void methodLoginScreen(Image image, int n2, int n3, int n4, int n5) {
        n2 = 0;
        while (n2 < n4 / mGraphics.LoginScreen(image) + 1) {
            n3 = 0;
            while (n3 < n5 / mGraphics.b(image) + 1) {
                this.LoginScreen.drawImage(image, 0 + n2 * mGraphics.LoginScreen(image), 0 + n3 * mGraphics.b(image), 0);
                ++n3;
            }
            ++n2;
        }
    }

    public static int LoginScreen(float f2, int n2, int n3) {
        ds.c("blend color");
        f2 = n3 >> 16 & 0xFF;
        float f3 = n3 >> 8 & 0xFF;
        float f4 = n3 & 0xFF;
        f2 *= 0.4f;
        f3 *= 0.4f;
        f4 *= 0.4f;
        if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 255.0f) {
            f4 = 255.0f;
        }
        int n4 = 0xFF000000 | (int)f2 << 16 | (int)f3 << 8 | (int)f4 & 0xFF;
        return n4;
    }

    public final void d(int n2, int n3, int n4, int n5) {
        this.LoginScreen.fillRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final int LoginScreen() {
        return this.LoginScreen.getTranslateX() / b;
    }

    public final int b() {
        return this.LoginScreen.getTranslateY() / b;
    }

    public final void e(int n2, int n3, int n4, int n5) {
        this.LoginScreen.setClip(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final int c() {
        return this.LoginScreen.getClipX();
    }

    public final int d() {
        return this.LoginScreen.getClipY();
    }

    public final int e() {
        return this.LoginScreen.getClipWidth();
    }

    public final int f() {
        return this.LoginScreen.getClipHeight();
    }

    public final void methodLoginScreen(int n2) {
        this.LoginScreen.setColor(n2);
    }

    public final void methodLoginScreen(int n2, int n3) {
        this.LoginScreen.translate(n2 *= b, n3 *= b);
    }

    public static int LoginScreen(Image image) {
        return image.getWidth() / b;
    }

    public static int b(Image image) {
        return image.getHeight() / b;
    }

    public static int c(Image image) {
        return image.getWidth();
    }

    public static int d(Image image) {
        return image.getHeight();
    }
}

