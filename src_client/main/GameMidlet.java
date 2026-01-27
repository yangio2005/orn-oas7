/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
package main;

import javax.microedition.midlet.MIDlet;

public class GameMidlet
extends MIDlet {
    public static String SERVER_IP = Config.SERVER_IP;
    public static int SERVER_PORT = Config.SERVER_PORT;
    public static String c;
    public static int d;
    public static int e;
    private static GameCanvas canvasInstance;
    public static GameMidlet f;
    private static boolean i;
    public static boolean g;

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
            canvasInstance = new GameCanvas();
            object = canvasInstance;
            new Thread((Runnable)object).start();
            Session.LoginScreen().LoginScreen(MessageHandler.LoginScreen());
            Session.b().LoginScreen(MessageHandler.LoginScreen());
            Session.b().c = false;
            SplashScreen.f();
            SplashScreen.LoginScreen();
            GameCanvas.currentScreen = new SplashScreen();
            BaseCanvas.LoginScreen(f);
            i = true;
        }
    }

    public final void exit() {
        BaseCanvas.ao = false;
        System.gc();
        this.notifyDestroyed();
    }
}

