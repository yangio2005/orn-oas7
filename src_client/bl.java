/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import main.GameCanvas;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class bl {
    public static int[][] LoginScreen;
    public static Image[] b;
    public static eg[] c;
    public static MyVector d;
    private static Image Item;
    public static byte[] e;
    public static MyVector f;
    private static int i;
    public static short g;

    static {
        d = new MyVector("vKeys");
        Item = null;
        f = new MyVector("");
    }

    public static void methodLoginScreen() {
        if (b == null) {
            b = new Image[]{Res.loadImageFromRMS("/img/Big0.png"), Res.loadImageFromRMS("/img/Big1.png"), Res.loadImageFromRMS("/img/Big2.png"), Res.loadImageFromRMS("/img/Big3.png")};
            System.gc();
        }
    }

    public static void b() {
        System.gc();
        Item = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
    }

    public bl() {
        bl.e();
    }

    public static void c() {
        new bl();
    }

    private static void e() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NR_image")));
            int n2 = dataInputStream.readShort();
            LoginScreen = new int[n2][5];
            int n3 = 0;
            while (n3 < n2) {
                bl.LoginScreen[n3][0] = dataInputStream.readUnsignedByte();
                bl.LoginScreen[n3][1] = dataInputStream.readShort();
                bl.LoginScreen[n3][2] = dataInputStream.readShort();
                bl.LoginScreen[n3][3] = dataInputStream.readShort();
                bl.LoginScreen[n3][4] = dataInputStream.readShort();
                if (!(n3 >= 84 && n3 <= 90 || n3 >= 372 && n3 <= 384 || n3 >= 371 && n3 <= 377 || LoginScreen[n3][1] < 256 && LoginScreen[n3][3] < 256 && LoginScreen[n3][2] < 256 && LoginScreen[n3][4] < 256)) {
                    bl.LoginScreen[n3] = null;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void methodLoginScreen(int n2) {
        if (mGraphics.b == 1) {
            Image image = Res.loadImage("/SmallImage/Small" + n2 + ".png");
            if (image != null) {
                bl.c[n2] = new eg(image, n2);
                return;
            }
            bl.c[n2] = new eg(Item, n2);
            if (GameCanvas.currentScreen == GameCanvas.am) {
                GameService.LoginScreen().GameScreen(n2);
                return;
            }
            f.addElement(c[n2]);
            return;
        }
        Image image = Res.loadImage("/SmallImage/Small" + n2 + ".png");
        if (image != null) {
            bl.c[n2] = new eg(image, n2);
            return;
        }
        boolean bl2 = false;
        Object object = RMS.b(String.valueOf(mGraphics.b) + "Small" + n2);
        if (object != null) {
            if (e != null && ((byte[])object).length % 127 != e[n2]) {
                bl2 = true;
            }
            if (!bl2) {
                Image image2 = Image.createImage((byte[])object, (int)0, (int)((byte[])object).length);
                object = image2;
                if (image2 != null) {
                    bl.c[n2] = new eg((Image)object, n2);
                } else {
                    bl2 = true;
                }
            }
        } else {
            bl2 = true;
        }
        if (bl2) {
            bl.c[n2] = new eg(Item, n2);
            if (GameCanvas.currentScreen == GameCanvas.am) {
                GameService.LoginScreen().GameScreen(n2);
                return;
            }
            f.addElement(c[n2]);
        }
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6) {
        bl.b(en2, n2, n3, n4, 0, n6);
    }

    public static void b(mGraphics en2, int n2, int n3, int n4, int n5, int n6) {
        try {
            if (b == null) {
                eg eg2 = c[n2];
                if (eg2 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                en2.LoginScreen(eg2.LoginScreen, 0, 0, mGraphics.LoginScreen(eg2.LoginScreen), mGraphics.b(eg2.LoginScreen), n5, n3, n4, n6);
                return;
            }
            if (LoginScreen != null) {
                if (n2 >= LoginScreen.length || LoginScreen[n2] == null || LoginScreen[n2][1] >= 256 || LoginScreen[n2][3] >= 256 || LoginScreen[n2][2] >= 256 || LoginScreen[n2][4] >= 256) {
                    eg eg3 = c[n2];
                    if (eg3 == null) {
                        bl.LoginScreen(n2);
                        return;
                    }
                    eg3.LoginScreen(en2, n5, n3, n4, n6);
                    return;
                }
                if (LoginScreen[n2][0] != 4 && b[LoginScreen[n2][0]] != null) {
                    en2.LoginScreen(b[LoginScreen[n2][0]], LoginScreen[n2][1], LoginScreen[n2][2], LoginScreen[n2][3], LoginScreen[n2][4], n5, n3, n4, n6);
                    return;
                }
                eg eg4 = c[n2];
                if (eg4 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                eg4.LoginScreen(en2, n5, n3, n4, n6);
                return;
            }
            if (GameCanvas.currentScreen != GameScreen.j()) {
                eg eg5 = c[n2];
                if (eg5 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                eg5.LoginScreen(en2, n5, n3, n4, n6);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        try {
            if (b == null) {
                eg eg2 = c[n2];
                if (eg2 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                en2.LoginScreen(eg2.LoginScreen, 0, n3 * n6, n6, n7, n8, n4, n5, n9);
                return;
            }
            if (LoginScreen != null) {
                if (n2 >= LoginScreen.length || LoginScreen[n2] == null || LoginScreen[n2][1] >= 256 || LoginScreen[n2][3] >= 256 || LoginScreen[n2][2] >= 256 || LoginScreen[n2][4] >= 256) {
                    eg eg3 = c[n2];
                    if (eg3 == null) {
                        bl.LoginScreen(n2);
                        return;
                    }
                    eg3.LoginScreen(en2, n8, n3, n4, n5, n6, n7, n9);
                    return;
                }
                if (LoginScreen[n2][0] != 4 && b[LoginScreen[n2][0]] != null) {
                    en2.LoginScreen(b[LoginScreen[n2][0]], 0, n3 * n6, n6, n7, n8, n4, n5, n9);
                    return;
                }
                eg eg4 = c[n2];
                if (eg4 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                eg4.LoginScreen(en2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
            if (GameCanvas.currentScreen != GameScreen.j()) {
                eg eg5 = c[n2];
                if (eg5 == null) {
                    bl.LoginScreen(n2);
                    return;
                }
                eg5.LoginScreen(en2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void d() {
        int n2 = 0;
        if (GameCanvas.w % 1000 == 0) {
            int n3 = 0;
            while (n3 < c.length) {
                if (c[n3] != null) {
                    ++n2;
                    eg eg2 = c[n3];
                    ++eg2.d;
                    if (eg2.d - eg2.c > 1 && !Char.e().LoginScreen(eg2.b)) {
                        bl.c[eg2.b] = null;
                    }
                    ++i;
                }
                ++n3;
            }
            if (n2 > 200 && GameCanvas.isLowGraphic) {
                c = new eg[g];
            }
        }
    }
}

