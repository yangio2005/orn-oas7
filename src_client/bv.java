/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import main.GameMidlet;
import main.GameCanvas;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class bv {
    public static int LoginScreen;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static int I;
    public static int[] f;
    public static int[] g;
    private static Image[] J;
    private static Image K;
    private static Image L;
    public static Image Item;
    private static Image M;
    private static Image N;
    public static byte i;
    private static int O;
    private static int P;
    private static int Q;
    private static int R;
    public static boolean j;
    public static String k;
    public static int Res;
    public static int m;
    public static int n;
    public static int o;
    public static int GameScreen;
    public static int q;
    public static byte r;
    public static byte SessionReceiver;
    public static MyVector MyHashtable;
    public static MyVector u;
    public static MyVector v;
    public static String[] w;
    public static Image x;
    private static int[] S;
    public static int[][] Message;
    public static int[][][] z;
    public static Image A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;

    static {
        I = -1;
        i = (byte)24;
        j = false;
        k = "";
        m = -1;
        q = -1;
        SessionReceiver = (byte)-1;
        MyHashtable = new MyVector("vGO");
        u = new MyVector("vItemBg");
        v = new MyVector("vCurrItem");
        x = Res.loadImage("/mainImage/myTexture2dbong.png");
        new MyVector("vObject");
        S = new int[]{21, 22, 23, 39, 40, 41};
        int[] nArray = new int[]{21, 22, 23, 24, 25, 26};
        int[] nArray2 = new int[3];
        nArray2[1] = 7;
        nArray2[2] = 14;
        A = Res.loadImage("/bg/light.png");
        int[] nArray3 = new int[]{5257738, 8807192};
        H = 0;
    }

    public static boolean methodLoginScreen() {
        return Res == 51 || Res == 103 || Res == 112 || Res == 113 || Res == 129 || Res == 130;
    }

    public static boolean b() {
        return Res == 39 || Res == 40 || Res == 41;
    }

    public static boolean c() {
        return GameScreen.bY != null && Res == GameScreen.bY.Res;
    }

    public static cz LoginScreen(int n2) {
        int n3 = 0;
        while (n3 < u.size()) {
            cz cz2 = (cz)u.elementAt(n3);
            if (cz2.LoginScreen == n2) {
                return cz2;
            }
            ++n3;
        }
        return null;
    }

    public static boolean d() {
        int n2 = 0;
        while (n2 < S.length) {
            if (Res == S[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean b(int n2) {
        if (n2 == 156 || n2 == 330 || n2 == 345 || n2 == 334) {
            return false;
        }
        if (Res == 54 || Res == 55 || Res == 56 || Res == 57 || Res == 58 || Res == 59 || Res == 103) {
            return false;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < v.size()) {
            cz cz2 = (cz)v.elementAt(n4);
            if (cz2.LoginScreen == n2) {
                ++n3;
            }
            ++n4;
        }
        return n3 > 2;
    }

    public static final void e() {
        if (K == null) {
            K = Res.loadImageFromRMS("/tWater/wtf.png");
        }
        if (L == null) {
            L = Res.loadImageFromRMS("/tWater/twtf.png");
        }
        if (Item == null) {
            Item = Res.loadImageFromRMS("/tWater/wts.png");
        }
        if (M == null) {
            M = Res.loadImageFromRMS("/tWater/wtsN.png");
        }
        if (N == null) {
            N = Res.loadImageFromRMS("/tWater/wtsN2.png");
        }
        System.gc();
    }

    public static void c(int n2) {
        d = b * i;
        c = LoginScreen * i;
        --n2;
        try {
            int n3 = 0;
            while (n3 < LoginScreen * b) {
                int n4 = 0;
                while (n4 < Message[n2].length) {
                    int n5 = Message[n2][n4];
                    int[] nArray = z[n2][n4];
                    int n6 = n3;
                    int n7 = 0;
                    while (n7 < nArray.length) {
                        if (f[n6] == nArray[n7]) {
                            int n8 = n6;
                            g[n8] = g[n8] | n5;
                            break;
                        }
                        ++n7;
                    }
                    ++n4;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Error Load Map");
            exception.printStackTrace();
            GameMidlet.f.LoginScreen();
            return;
        }
    }

    public static boolean f() {
        return Res == 45 || Res == 46 || Res == 48;
    }

    public static boolean g() {
        return j || Res == 45 || Res == 46 || Res == 48 || Res == 51 || Res == 52 || Res == 103 || Res == 112 || Res == 113 || Res == 115 || Res == 117 || Res == 118 || Res == 119 || Res == 120 || Res == 121 || Res == 125 || Res == 129 || Res == 130;
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        try {
            if (J == null) {
                return;
            }
            if (J.length != 1) {
                en2.LoginScreen(J[n2], n3 * i, n4 * i, 0);
                return;
            }
            en2.LoginScreen(J[0], 0, n2 * i, i, i, 0, n3 * i, n4 * i, 0);
        }
        catch (Exception exception) {}
    }

    private static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5) {
        try {
            if (J == null) {
                return;
            }
            if (J.length == 1) {
                en2.LoginScreen(J[0], 0, n2 * 24, 24, 24, 0, n3, n4, 0);
                return;
            }
            en2.LoginScreen(J[n2], n3, n4, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void methodLoginScreen(mGraphics en2) {
        try {
            int n2;
            int n3;
            if (Char.bI) {
                return;
            }
            GameScreen.j();
            GameScreen.LoginScreen(en2, 1);
            int n4 = GameScreen.o;
            while (n4 < GameScreen.q) {
                n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    if (n4 != 0 && n4 != LoginScreen - 1) {
                        n2 = f[n3 * LoginScreen + n4] - 1;
                        if ((bv.LoginScreen(n4, n3) & 0x100) != 256) {
                            if ((bv.LoginScreen(n4, n3) & 0x20) == 32) {
                                en2.LoginScreen(K, 0, 24 * (GameCanvas.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if ((bv.LoginScreen(n4, n3) & 0x80) == 128) {
                                en2.LoginScreen(L, 0, 24 * (GameCanvas.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if (e != 13 || n2 == -1) {
                                if (e == 2 && (bv.LoginScreen(n4, n3) & 0x200) == 512 && n2 != -1) {
                                    bv.LoginScreen(en2, n2, n4 * i, n3 * i, 24);
                                    bv.LoginScreen(en2, n2, n4 * i, n3 * i + 1, 24);
                                }
                                if ((bv.LoginScreen(n4, n3) & 0x10) == 16) {
                                    O = n4 * i - GameScreen.j;
                                    P = O - GameScreen.f;
                                    R = (i - 2) * P / i;
                                    Q = R + GameScreen.f;
                                    bv.LoginScreen(en2, n2, Q + GameScreen.j, n3 * i, 24);
                                } else if ((bv.LoginScreen(n4, n3) & 0x200) == 512) {
                                    if (n2 != -1) {
                                        bv.LoginScreen(en2, n2, n4 * i, n3 * i, 24);
                                        bv.LoginScreen(en2, n2, n4 * i, n3 * i + 1, 24);
                                    }
                                } else if (n2 != -1) {
                                    bv.LoginScreen(en2, n2, n4, n3);
                                }
                            }
                        }
                    }
                    ++n3;
                }
                ++n4;
            }
            if (GameScreen.j < 24) {
                n4 = GameScreen.GameScreen;
                while (n4 < GameScreen.r) {
                    n3 = f[n4 * LoginScreen + 1] - 1;
                    if (n3 != -1) {
                        bv.LoginScreen(en2, n3, 0, n4);
                    }
                    ++n4;
                }
            }
            if (GameScreen.j > GameScreen.n) {
                n4 = LoginScreen - 2;
                n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    n2 = f[n3 * LoginScreen + n4] - 1;
                    if (n2 != -1) {
                        bv.LoginScreen(en2, n2, n4 + 1, n3);
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static boolean i() {
        return Res != 54 && Res != 55 && Res != 56 && Res != 57 && Res != 138 && Res != 167;
    }

    public static final void b(mGraphics en2) {
        if (GameCanvas.isLowGraphic) {
            return;
        }
        try {
            int n2 = GameScreen.o;
            while (n2 < GameScreen.q) {
                int n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    if ((bv.LoginScreen(n2, n3) & 0x40) == 64) {
                        Image image = e == 5 ? M : (e == 8 ? N : Item);
                        if (!bv.i()) {
                            en2.LoginScreen(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 1, 0);
                            en2.LoginScreen(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 3, 0);
                        }
                        en2.LoginScreen(image, 0, (GameCanvas.w % 8 >> 2) * 24, 24, 24, 0, n2 * i, n3 * i - 12, 0);
                        if (H == 0 && bv.i()) {
                            H = n3 * i - 12;
                            int n4 = 0xFFFFFF;
                            if (GameCanvas.ad == 2) {
                                n4 = 10871287;
                            } else if (GameCanvas.ad == 4) {
                                n4 = 8111470;
                            } else if (GameCanvas.ad == 7) {
                                n4 = 5693125;
                            } else if (GameCanvas.ad == 19) {
                                n4 = 0xFF0000;
                            }
                            WeatherEffect.LoginScreen(n4, H + 15);
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            WeatherEffect.b(en2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void d(int n2) {
        InputStream inputStream = ad.LoginScreen("/mymap/" + n2);
        inputStream = new DataInputStream(inputStream);
        LoginScreen = (char)((FilterInputStream)inputStream).read();
        b = (char)((FilterInputStream)inputStream).read();
        f = new int[((FilterInputStream)inputStream).available()];
        int n3 = 0;
        while (n3 < LoginScreen * b) {
            bv.f[n3] = (char)((FilterInputStream)inputStream).read();
            ++n3;
        }
        g = new int[f.length];
    }

    public static final int LoginScreen(int n2, int n3) {
        try {
            return g[n3 * LoginScreen + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int b(int n2, int n3) {
        try {
            return g[n3 / i * LoginScreen + n2 / i];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean methodLoginScreen(int n2, int n3, int n4) {
        try {
            return (g[n3 / i * LoginScreen + n2 / i] & n4) == n4;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final void b(int n2, int n3, int n4) {
        int n5 = n3 / i * LoginScreen + n2 / i;
        g[n5] = g[n5] | 0x200;
    }

    public static final void c(int n2, int n3, int n4) {
        int n5 = n3 / i * LoginScreen + n2 / i;
        g[n5] = g[n5] & 0xFFFFFDFF;
    }

    public static final int e(int n2) {
        return n2 / i * i;
    }

    public static final int f(int n2) {
        return n2 / i * i;
    }

    public static void methodItem() {
        System.gc();
        if (I != e) {
            if (Res.clientType == 5 || Res.clientType == 3 || Res.clientType == 8) {
                if (mGraphics.b == 1) {
                    Image[] imageArray = new Image[1];
                    J = imageArray;
                    imageArray[0] = Res.clientType("/MyHashtable/" + e + ".png");
                } else {
                    J = new Image[100];
                    int n2 = 0;
                    while (n2 < J.length) {
                        bv.J[n2] = Res.clientType("/MyHashtable/" + e + "/" + (n2 + 1) + ".png");
                        ++n2;
                    }
                }
            } else {
                Image image = Res.loadImageFromRMS("/MyHashtable/" + e + "$1.png");
                if (image != null) {
                    RMS.LoginScreen("x" + mGraphics.b + "MyHashtable" + e);
                    J = new Image[100];
                    int n3 = 0;
                    while (n3 < J.length) {
                        bv.J[n3] = Res.loadImageFromRMS("/MyHashtable/" + e + "$" + (n3 + 1) + ".png");
                        ++n3;
                    }
                } else {
                    image = Res.loadImageFromRMS("/MyHashtable/" + e + ".png");
                    if (image != null) {
                        Image[] imageArray = new Image[1];
                        J = imageArray;
                        imageArray[0] = image;
                    }
                }
            }
            I = e;
        }
    }
}

