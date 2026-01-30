/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class ResourceUtil {
    public static boolean a = false;
    public static boolean IActionListener = false;
    private static Image i = ResourceUtil.IActionListener("/mainImage/black.png");
    public static int c = 1;
    public static byte d = 0;
    public static byte e = 0;
    public static byte f = (byte)5;
    public static String UIPanel;
    public static boolean h;

    static {
        h = false;
    }

    public static void a() {
        e = 0;
    }

    public static int a(Image image) {
        if (c == 5) {
            return image.getWidth();
        }
        return image.getWidth();
    }

    public static int IActionListener(Image image) {
        if (c == 5) {
            return image.getHeight();
        }
        return image.getWidth();
    }

    public static String a(long l2, int n2, boolean bl2, boolean bl3) {
        long l3 = (l2 + (long)(n2 * 1000) - System.currentTimeMillis()) / 1000L;
        if (l3 <= 0L) {
            return "";
        }
        return String.valueOf(l3);
    }

    public static String a(long l2) {
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
                    string = "IActionListener";
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

    public static void IActionListener() {
        try {
            GameMidlet.f.platformRequest(bs.ResourceUtil);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public static void a(MGraphics en2, int n2, int n3, int n4) {
        n4 = n4 / MGraphics.a(i) + 1;
        int n5 = 0;
        while (n5 < n4) {
            en2.a(i, n2 + n5 * MGraphics.a(i), n3, 0);
            ++n5;
        }
    }

    public static void c() {
        while (MessageHandler.IActionListener) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    public static void a(boolean bl2) {
        if (main.GameCanvas.E.equals(em.a)) {
            main.GameCanvas.a(String.valueOf(GameStrings.x) + " [1]", 8884, null);
            return;
        }
        NetworkService.a().c();
        NetworkService.IActionListener().c();
        bs.c = false;
        if (MessageHandler.a) {
            main.GameCanvas.a(GameStrings.x, 8885, null);
            return;
        }
        x.c = false;
        x.i = bs.a[bs.n];
        if (main.GameCanvas.E != main.GameCanvas.ak) {
            MathUtil.c("===========> 2 v\u00e0o OnconnectFail");
        } else {
            main.GameCanvas.h();
            bs.u = true;
            main.GameCanvas.ak.IActionListener();
        }
        GameWorld.bI = false;
        if (bl2) {
            bs.t = 0;
        }
    }

    public static void IActionListener(boolean bl2) {
        NetworkService.a().c();
        NetworkService.IActionListener().c();
        if (MessageHandler.a) {
            main.GameCanvas.h.k();
            main.GameCanvas.a(GameStrings.aF, 8885, null);
            return;
        }
        if (main.GameCanvas.E != main.GameCanvas.ak) {
            main.GameCanvas.a(String.valueOf(GameStrings.x) + " [2]", 8884, null);
        } else {
            main.GameCanvas.h();
        }
        GameWorld.bI = false;
        if (bl2) {
            bs.t = 0;
        }
        main.GameCanvas.h.k();
    }

    public static Image a(String string) {
        Object object = "/x" + MGraphics.IActionListener + string;
        MathUtil.c("path load rms= " + string);
        string = bn.a(string);
        if (string == null) {
            object = MathUtil.a((String)object, ".", 0);
            object = MathUtil.a(object[0], "/", 0);
            object = "x" + MGraphics.IActionListener + object[((String[])object).length - 1];
            byte[] byArray = RMSManager.IActionListener((String)object);
            object = byArray;
            if (byArray != null) {
                string = Image.createImage((byte[])object, (int)0, (int)((String[])object).length);
            }
        }
        return string;
    }

    public static Image IActionListener(String string) {
        Image image = null;
        try {
            image = bn.a(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static Image c(String string) {
        string = "/x" + MGraphics.IActionListener + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static void a(MGraphics en2) {
        int n2 = 0;
        while (n2 < 5) {
            if (GameScreen.bI[n2] != -1 && main.GameCanvas.d(GameScreen.bG[n2], GameScreen.bH[n2])) {
                if (GameScreen.bJ[n2] == 0) {
                    mFont.v.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 1) {
                    mFont.LoginScreen.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 2) {
                    mFont.Message.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 3) {
                    mFont.LoginScreen.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.Message);
                } else if (GameScreen.bJ[n2] == 8) {
                    mFont.r.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 4) {
                    mFont.s.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.o);
                } else if (GameScreen.bJ[n2] == 5) {
                    mFont.z.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2);
                } else if (GameScreen.bJ[n2] == 6) {
                    mFont.LoginScreen.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.v);
                } else if (GameScreen.bJ[n2] == 7) {
                    mFont.c.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 9) {
                    mFont.GameScreen.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
                } else if (GameScreen.bJ[n2] == 10) {
                    mFont.ResourceUtil.IActionListener(en2, GameScreen.bF[n2], GameScreen.bG[n2], GameScreen.bH[n2], 2, mFont.f);
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
        bm2 = as.a(string, as.a);
        if (bm2.a != null) {
            int n2 = bm2.GameCanvas.getHeight() / bm2.d;
            if (n2 <= 0) {
                n2 = 1;
            }
            df2 = new Frame(bm2.a, bm2.GameCanvas.getWidth(), n2);
        }
        return df2;
    }

    public static void e(String string) {
    }
}

