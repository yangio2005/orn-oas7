/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import main.GameMidlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public abstract class BaseCanvas
extends Canvas
implements Runnable {
    public static boolean ao;

    public static void methodLoginScreen(GameMidlet gameMidlet) {
        Display.getDisplay((MIDlet)gameMidlet).setCurrent((Displayable)LoginScreen.Item);
    }

    public BaseCanvas() {
        this.setFullScreenMode(true);
        int n2 = super.getHeight();
        int n3 = super.getWidth();
        if (n3 * n2 >= 2073600) {
            mGraphics.b = 4;
            return;
        }
        if (n3 * n2 >= 691200) {
            mGraphics.b = 3;
            return;
        }
        if (n3 * n2 > 153600) {
            mGraphics.b = 2;
            return;
        }
        mGraphics.b = 1;
    }

    public int getHeight() {
        System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
        return -1;
    }

    public int getWidth() {
        System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
        return -1;
    }

    public final int m() {
        int n2 = super.getWidth();
        return n2 / mGraphics.b + (n2 % mGraphics.b == 0 ? 0 : 1);
    }

    public final int n() {
        int n2 = super.getHeight();
        return n2 / mGraphics.b + (n2 % mGraphics.b == 0 ? 0 : 1);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.LoginScreen(n2 /= mGraphics.b, n3 /= mGraphics.b);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b(n2 /= mGraphics.b, n3 /= mGraphics.b);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.c(n2 /= mGraphics.b, n3 /= mGraphics.b);
    }

    protected abstract void methodLoginScreen(int var1, int var2);

    protected abstract void b(int var1, int var2);

    protected abstract void c(int var1, int var2);

    protected abstract void d();

    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {}
        ao = true;
        while (ao) {
            long l2 = System.currentTimeMillis();
            this.d();
            this.repaint();
            this.serviceRepaints();
            long l3 = System.currentTimeMillis() - l2;
            try {
                if (l3 < 27L) {
                    long l4;
                    long l5;
                    do {
                        l4 = System.currentTimeMillis();
                        Thread.sleep(27L - l3);
                    } while ((l5 = System.currentTimeMillis()) - l4 < 27L - l3);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }
}

