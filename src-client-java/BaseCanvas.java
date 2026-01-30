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
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.GameCanvas;

public abstract class BaseCanvas
extends Canvas
implements Runnable {
    public static boolean ao;

    public static void a(GameMidlet gameMidlet) {
        Display.getDisplay((MIDlet)gameMidlet).setCurrent((Displayable)GameCanvas.h);
    }

    public BaseCanvas() {
        this.setFullScreenMode(true);
        int n2 = super.getHeight();
        int n3 = super.getWidth();
        if (n3 * n2 >= 2073600) {
            MGraphics.IActionListener = 4;
            return;
        }
        if (n3 * n2 >= 691200) {
            MGraphics.IActionListener = 3;
            return;
        }
        if (n3 * n2 > 153600) {
            MGraphics.IActionListener = 2;
            return;
        }
        MGraphics.IActionListener = 1;
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
        return n2 / MGraphics.IActionListener + (n2 % MGraphics.IActionListener == 0 ? 0 : 1);
    }

    public final int n() {
        int n2 = super.getHeight();
        return n2 / MGraphics.IActionListener + (n2 % MGraphics.IActionListener == 0 ? 0 : 1);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.a(n2 /= MGraphics.IActionListener, n3 /= MGraphics.IActionListener);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b(n2 /= MGraphics.IActionListener, n3 /= MGraphics.IActionListener);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.c(n2 /= MGraphics.IActionListener, n3 /= MGraphics.IActionListener);
    }

    protected abstract void a(int var1, int var2);

    protected abstract void IActionListener(int var1, int var2);

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

