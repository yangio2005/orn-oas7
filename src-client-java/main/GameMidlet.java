/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
package main;

import javax.microedition.midlet.MIDlet;
import main.GameCanvas;

public class GameMidlet
extends MIDlet {
    public static String a = "112.213.94.23";
    public static int IActionListener = 14445;
    public static String c;
    public static int d;
    public static int e;
    private static a h;
    public static GameMidlet f;
    private static boolean i;
    public static boolean UIPanel;

    static {
        e = 246;
    }

    public GameMidlet() {
        f = this;
    }

    protected void destroyApp(boolean bl2) {
    }

    protected void pauseApp() {
    }

    public void startApp() {
        if (!i) {
            Object object = this;
            h = new a();
            object = h;
            new Thread((Runnable)object).start();
            NetworkService.a().a(MessageHandler.a());
            NetworkService.IActionListener().a(MessageHandler.a());
            NetworkService.IActionListener().c = false;
            em.f();
            em.a();
            main.GameCanvas.E = new em();
            BaseCanvas.a(f);
            i = true;
        }
    }

    public final void a() {
        BaseCanvas.ao = false;
        System.gc();
        this.notifyDestroyed();
    }
}

