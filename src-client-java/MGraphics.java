/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class MGraphics {
    public Graphics a;
    public static int zoom = 1;

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillArc(n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom, 0, 360);
    }

    public final void a(Image image, int n2, int n3, int n4) {
        if (image == null) {
            return;
        }
        this.a.drawImage(image, n2 *= zoom, n3 *= zoom, n4);
    }

    public final void a(Image object, float f2, float f3, int n2) {
        int n3 = n2;
        float f4 = f3;
        f3 = f2;
        Image image = object;
        object = this;
        if (image != null) {
            object.GameCanvas.drawImage(image, (int)(f3 *= (float)zoom), (int)(f4 *= (float)zoom), n3);
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a.drawLine(n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        this.a.setColor(n6);
        this.a.fillRect(n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom);
    }

    public final void zoom(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, n4, n5);
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, 1, n5);
        this.d(n2 + n4, n3, 1, n5);
        this.d(n2, n3, n4, 1);
        this.d(n2, n3 + n5, n4 + 1, 1);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.a.drawRegion(image, n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom, n6, n7 *= zoom, n8 *= zoom, n9);
    }

    public final void zoom(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.a(image, 0, n3, n4, n5, n6, n7, n8, n9);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5) {
        n2 = 0;
        while (n2 < n4 / MGraphics.a(image) + 1) {
            n3 = 0;
            while (n3 < n5 / MGraphics.zoom(image) + 1) {
                this.a.drawImage(image, 0 + n2 * MGraphics.a(image), 0 + n3 * MGraphics.zoom(image), 0);
                ++n3;
            }
            ++n2;
        }
    }

    public static int a(float f2, int n2, int n3) {
        MathUtil.c("blend color");
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
        this.a.fillRect(n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom);
    }

    public final int a() {
        return this.a.getTranslateX() / zoom;
    }

    public final int zoom() {
        return this.a.getTranslateY() / zoom;
    }

    public final void e(int n2, int n3, int n4, int n5) {
        this.a.setClip(n2 *= zoom, n3 *= zoom, n4 *= zoom, n5 *= zoom);
    }

    public final int c() {
        return this.a.getClipX();
    }

    public final int d() {
        return this.a.getClipY();
    }

    public final int e() {
        return this.a.getClipWidth();
    }

    public final int f() {
        return this.a.getClipHeight();
    }

    public final void a(int n2) {
        this.a.setColor(n2);
    }

    public final void a(int n2, int n3) {
        this.a.translate(n2 *= zoom, n3 *= zoom);
    }

    public static int a(Image image) {
        return image.getWidth() / zoom;
    }

    public static int zoom(Image image) {
        return image.getHeight() / zoom;
    }

    public static int c(Image image) {
        return image.getWidth();
    }

    public static int d(Image image) {
        return image.getHeight();
    }
}

