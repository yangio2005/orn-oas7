/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import main.GameMidlet;
import main.GameCanvas;
import javax.microedition.lcdui.Image;

public final class Res {
    public static boolean LoginScreen = false;
    public static boolean b = false;
    private static Image i = Res.loadImage("/mainImage/black.png");
    public static int c = 1;
    public static byte d = 0;
    public static byte e = 0;
    public static byte f = (byte)5;
    public static String g;
    public static boolean Item;

    static {
        Item = false;
    }

    public static void methodLoginScreen() {
        e = 0;
    }

    public static int LoginScreen(Image image) {
        if (c == 5) {
            return image.getWidth();
        }
        return image.getWidth();
    }

    public static int b(Image image) {
        if (c == 5) {
            return image.getHeight();
        }
        return image.getWidth();
    }

    public static String LoginScreen(long l2, int n2, boolean bl2, boolean bl3) {
        long l3 = (l2 + (long)(n2 * 1000) - System.currentTimeMillis()) / 1000L;
        if (l3 <= 0L) {
            return "";
        }
        return String.valueOf(l3);
    }

    public static String LoginScreen(long l2) {
        int n2;
        String string;
        boolean bl2;
        String string2;
        block9: {
            string2 = "" + l2;
            bl2 = false;
            try {
                if (l2 < 0L) {
                    bl2 = true;
                    l2 = -l2;
                    string2 = "" + l2;
                }
                if (l2 >= 1000000000L) {
                    string = "b";
                    n2 = ("" + (l2 /= 1000000000L)).length();
                    break block9;
                }
                if (l2 >= 1000000L) {
                    string = "m";
                    n2 = ("" + (l2 /= 1000000L)).length();
                    break block9;
                }
                if (l2 >= 1000L) {
                    string = "k";
                    n2 = ("" + (l2 /= 1000L)).length();
                    break block9;
                }
                if (bl2) {
                    return "-" + string2;
                }
                return string2;
            }
            catch (Exception exception) {}
        }
        int n3 = Integer.parseInt(string2.substring(n2, 2));
        string2 = n3 == 0 ? String.valueOf(string2.substring(0, n2)) + string : (n3 % 10 == 0 ? String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 1) + string : String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 2) + string);
        if (bl2) {
            return "-" + string2;
        }
        return string2;
    }

    public static void b() {
        try {
            GameMidlet.f.platformRequest(ServerListScreen.Res);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        n4 = n4 / mGraphics.LoginScreen(i) + 1;
        int n5 = 0;
        while (n5 < n4) {
            en2.LoginScreen(i, n2 + n5 * mGraphics.LoginScreen(i), n3, 0);
            ++n5;
        }
    }

    public static void c() {
        while (MessageHandler.b) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    public static void methodLoginScreen(boolean bl2) {
        if (GameCanvas.currentScreen.equals(SplashScreen.LoginScreen)) {
            GameCanvas.isLowGraphic(String.valueOf(T.x) + " [1]", 8884, null);
            return;
        }
        Session.LoginScreen().c();
        Session.b().c();
        ServerListScreen.c = false;
        if (MessageHandler.LoginScreen) {
            GameCanvas.isLowGraphic(T.x, 8885, null);
            return;
        }
        x.c = false;
        x.i = ServerListScreen.LoginScreen[ServerListScreen.n];
        if (GameCanvas.currentScreen != GameCanvas.ak) {
            ds.c("===========> 2 v\u00e0o OnconnectFail");
        } else {
            GameCanvas.instance();
            ServerListScreen.u = true;
            GameCanvas.ak.b();
        }
        Char.bI = false;
        if (bl2) {
            ServerListScreen.MyHashtable = 0;
        }
    }

    public static void b(boolean bl2) {
        Session.LoginScreen().c();
        Session.b().c();
        if (MessageHandler.LoginScreen) {
            GameCanvas.instance.k();
            GameCanvas.isLowGraphic(T.aF, 8885, null);
            return;
        }
        if (GameCanvas.currentScreen != GameCanvas.ak) {
            GameCanvas.isLowGraphic(String.valueOf(T.x) + " [2]", 8884, null);
        } else {
            GameCanvas.instance();
        }
        Char.bI = false;
        if (bl2) {
            ServerListScreen.MyHashtable = 0;
        }
        GameCanvas.instance.k();
    }

    public static Image LoginScreen(String string) {
        Object object = "/x" + mGraphics.b + string;
        ds.c("path load rms= " + string);
        string = ImageLoader.loadImage(string);
        if (string == null) {
            object = ds.LoginScreen((String)object, ".", 0);
            object = ds.LoginScreen(object[0], "/", 0);
            object = "x" + mGraphics.b + object[((String[])object).length - 1];
            byte[] byArray = RMS.b((String)object);
            object = byArray;
            if (byArray != null) {
                string = Image.createImage((byte[])object, (int)0, (int)((String[])object).length);
            }
        }
        return string;
    }

    public static Image b(String string) {
        Image image = null;
        try {
            image = ImageLoader.loadImage(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static Image c(String string) {
        string = "/x" + mGraphics.b + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static void methodLoginScreen(mGraphics en2) {
        int n2 = 0;
        while (n2 < 5) {
            if (GameScreen.bI[n2] != -1 && GameCanvas.d(GameScreen.bG[n2], GameScreen.bH[n2])) {
                if (GameScreen.bJ[n2] == 0) {
                    mFont.v.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 1) {
                    mFont.x.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 2) {
                    mFont.Message.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 3) {
                    mFont.x.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.Message);
                } else if (GameScreen.bJ[n2] == 8) {
                    mFont.r.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 4) {
                    mFont.SessionReceiver.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.o);
                } else if (GameScreen.bJ[n2] == 5) {
                    mFont.z.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 6) {
                    mFont.x.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.v);
                } else if (GameScreen.bJ[n2] == 7) {
                    mFont.c.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 9) {
                    mFont.GameScreen.b(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 10) {
                    mFont.Res.loadImage(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                }
            }
            ++n2;
        }
    }

    public static long d() {
        return System.currentTimeMillis();
    }

    public static df d(String string) {
        df df2 = null;
        bm bm2 = null;
        bm2 = ImageCache.imgCache(string, ImageCache.imgCache);
        if (bm2.LoginScreen != null) {
            int n2 = bm2.LoginScreen.getHeight() / bm2.d;
            if (n2 <= 0) {
                n2 = 1;
            }
            df2 = new df(bm2.LoginScreen, bm2.LoginScreen.getWidth(), n2);
        }
        return df2;
    }

    public static void e(String string) {
    }
}

