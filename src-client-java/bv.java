/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class bv {
    public static int a;
    public static int IActionListener;
    public static int c;
    public static int d;
    public static int e;
    private static int I;
    public static int[] f;
    public static int[] UIPanel;
    private static Image[] J;
    private static Image K;
    private static Image L;
    public static Image h;
    private static Image M;
    private static Image N;
    public static byte i;
    private static int O;
    private static int P;
    private static int Q;
    private static int R;
    public static boolean j;
    public static String k;
    public static int ResourceUtil;
    public static int m;
    public static int n;
    public static int o;
    public static int GameScreen;
    public static int q;
    public static byte r;
    public static byte s;
    public static LoggingList t;
    public static LoggingList u;
    public static LoggingList v;
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
        s = (byte)-1;
        t = new LoggingList("vGO");
        u = new LoggingList("vItemBg");
        v = new LoggingList("vCurrItem");
        x = ResourceUtil.IActionListener("/mainImage/myTexture2dbong.png");
        new LoggingList("vObject");
        S = new int[]{21, 22, 23, 39, 40, 41};
        int[] nArray = new int[]{21, 22, 23, 24, 25, 26};
        int[] nArray2 = new int[3];
        nArray2[1] = 7;
        nArray2[2] = 14;
        A = ResourceUtil.IActionListener("/bg/light.png");
        int[] nArray3 = new int[]{5257738, 8807192};
        H = 0;
    }

    public static boolean a() {
        return ResourceUtil == 51 || ResourceUtil == 103 || ResourceUtil == 112 || ResourceUtil == 113 || ResourceUtil == 129 || ResourceUtil == 130;
    }

    public static boolean IActionListener() {
        return ResourceUtil == 39 || ResourceUtil == 40 || ResourceUtil == 41;
    }

    public static boolean c() {
        return GameScreen.bY != null && ResourceUtil == GameScreen.bY.ResourceUtil;
    }

    public static cz a(int n2) {
        int n3 = 0;
        while (n3 < u.size()) {
            cz cz2 = (cz)u.elementAt(n3);
            if (cz2.a == n2) {
                return cz2;
            }
            ++n3;
        }
        return null;
    }

    public static boolean d() {
        int n2 = 0;
        while (n2 < S.length) {
            if (ResourceUtil == S[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean IActionListener(int n2) {
        if (n2 == 156 || n2 == 330 || n2 == 345 || n2 == 334) {
            return false;
        }
        if (ResourceUtil == 54 || ResourceUtil == 55 || ResourceUtil == 56 || ResourceUtil == 57 || ResourceUtil == 58 || ResourceUtil == 59 || ResourceUtil == 103) {
            return false;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < v.size()) {
            cz cz2 = (cz)v.elementAt(n4);
            if (cz2.a == n2) {
                ++n3;
            }
            ++n4;
        }
        return n3 > 2;
    }

    public static final void e() {
        if (K == null) {
            K = ResourceUtil.a("/tWater/wtf.png");
        }
        if (L == null) {
            L = ResourceUtil.a("/tWater/twtf.png");
        }
        if (h == null) {
            h = ResourceUtil.a("/tWater/wts.png");
        }
        if (M == null) {
            M = ResourceUtil.a("/tWater/wtsN.png");
        }
        if (N == null) {
            N = ResourceUtil.a("/tWater/wtsN2.png");
        }
        System.gc();
    }

    public static void c(int n2) {
        d = IActionListener * i;
        c = a * i;
        --n2;
        try {
            int n3 = 0;
            while (n3 < a * IActionListener) {
                int n4 = 0;
                while (n4 < Message[n2].length) {
                    int n5 = Message[n2][n4];
                    int[] nArray = z[n2][n4];
                    int n6 = n3;
                    int n7 = 0;
                    while (n7 < nArray.length) {
                        if (f[n6] == nArray[n7]) {
                            int n8 = n6;
                            UIPanel[n8] = UIPanel[n8] | n5;
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
            GameMidlet.f.a();
            return;
        }
    }

    public static boolean f() {
        return ResourceUtil == 45 || ResourceUtil == 46 || ResourceUtil == 48;
    }

    public static boolean UIPanel() {
        return j || ResourceUtil == 45 || ResourceUtil == 46 || ResourceUtil == 48 || ResourceUtil == 51 || ResourceUtil == 52 || ResourceUtil == 103 || ResourceUtil == 112 || ResourceUtil == 113 || ResourceUtil == 115 || ResourceUtil == 117 || ResourceUtil == 118 || ResourceUtil == 119 || ResourceUtil == 120 || ResourceUtil == 121 || ResourceUtil == 125 || ResourceUtil == 129 || ResourceUtil == 130;
    }

    private static void a(MGraphics en2, int n2, int n3, int n4) {
        try {
            if (J == null) {
                return;
            }
            if (J.length != 1) {
                en2.a(J[n2], n3 * i, n4 * i, 0);
                return;
            }
            en2.a(J[0], 0, n2 * i, i, i, 0, n3 * i, n4 * i, 0);
        }
        catch (Exception exception) {}
    }

    private static void a(MGraphics en2, int n2, int n3, int n4, int n5) {
        try {
            if (J == null) {
                return;
            }
            if (J.length == 1) {
                en2.a(J[0], 0, n2 * 24, 24, 24, 0, n3, n4, 0);
                return;
            }
            en2.a(J[n2], n3, n4, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void a(MGraphics en2) {
        try {
            int n2;
            int n3;
            if (GameWorld.bI) {
                return;
            }
            GameScreen.j();
            GameScreen.a(en2, 1);
            int n4 = GameScreen.o;
            while (n4 < GameScreen.q) {
                n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    if (n4 != 0 && n4 != a - 1) {
                        n2 = f[n3 * a + n4] - 1;
                        if ((bv.a(n4, n3) & 0x100) != 256) {
                            if ((bv.a(n4, n3) & 0x20) == 32) {
                                en2.a(K, 0, 24 * (main.GameCanvas.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if ((bv.a(n4, n3) & 0x80) == 128) {
                                en2.a(L, 0, 24 * (main.GameCanvas.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if (e != 13 || n2 == -1) {
                                if (e == 2 && (bv.a(n4, n3) & 0x200) == 512 && n2 != -1) {
                                    bv.a(en2, n2, n4 * i, n3 * i, 24);
                                    bv.a(en2, n2, n4 * i, n3 * i + 1, 24);
                                }
                                if ((bv.a(n4, n3) & 0x10) == 16) {
                                    O = n4 * i - GameScreen.j;
                                    P = O - GameScreen.f;
                                    R = (i - 2) * P / i;
                                    Q = R + GameScreen.f;
                                    bv.a(en2, n2, Q + GameScreen.j, n3 * i, 24);
                                } else if ((bv.a(n4, n3) & 0x200) == 512) {
                                    if (n2 != -1) {
                                        bv.a(en2, n2, n4 * i, n3 * i, 24);
                                        bv.a(en2, n2, n4 * i, n3 * i + 1, 24);
                                    }
                                } else if (n2 != -1) {
                                    bv.a(en2, n2, n4, n3);
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
                    n3 = f[n4 * a + 1] - 1;
                    if (n3 != -1) {
                        bv.a(en2, n3, 0, n4);
                    }
                    ++n4;
                }
            }
            if (GameScreen.j > GameScreen.n) {
                n4 = a - 2;
                n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    n2 = f[n3 * a + n4] - 1;
                    if (n2 != -1) {
                        bv.a(en2, n2, n4 + 1, n3);
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static boolean i() {
        return ResourceUtil != 54 && ResourceUtil != 55 && ResourceUtil != 56 && ResourceUtil != 57 && ResourceUtil != 138 && ResourceUtil != 167;
    }

    public static final void IActionListener(MGraphics en2) {
        if (main.GameCanvas.a) {
            return;
        }
        try {
            int n2 = GameScreen.o;
            while (n2 < GameScreen.q) {
                int n3 = GameScreen.GameScreen;
                while (n3 < GameScreen.r) {
                    if ((bv.a(n2, n3) & 0x40) == 64) {
                        Image image = e == 5 ? M : (e == 8 ? N : h);
                        if (!bv.i()) {
                            en2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 1, 0);
                            en2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 3, 0);
                        }
                        en2.a(image, 0, (main.GameCanvas.w % 8 >> 2) * 24, 24, 24, 0, n2 * i, n3 * i - 12, 0);
                        if (H == 0 && bv.i()) {
                            H = n3 * i - 12;
                            int n4 = 0xFFFFFF;
                            if (main.GameCanvas.ad == 2) {
                                n4 = 10871287;
                            } else if (main.GameCanvas.ad == 4) {
                                n4 = 8111470;
                            } else if (main.GameCanvas.ad == 7) {
                                n4 = 5693125;
                            } else if (main.GameCanvas.ad == 19) {
                                n4 = 0xFF0000;
                            }
                            ed.a(n4, H + 15);
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            ed.IActionListener(en2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void d(int n2) {
        InputStream inputStream = ad.a("/mymap/" + n2);
        inputStream = new DataInputStream(inputStream);
        a = (char)((FilterInputStream)inputStream).read();
        IActionListener = (char)((FilterInputStream)inputStream).read();
        f = new int[((FilterInputStream)inputStream).available()];
        int n3 = 0;
        while (n3 < a * IActionListener) {
            bv.f[n3] = (char)((FilterInputStream)inputStream).read();
            ++n3;
        }
        UIPanel = new int[f.length];
    }

    public static final int a(int n2, int n3) {
        try {
            return UIPanel[n3 * a + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int IActionListener(int n2, int n3) {
        try {
            return UIPanel[n3 / i * a + n2 / i];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        try {
            return (UIPanel[n3 / i * a + n2 / i] & n4) == n4;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final void IActionListener(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        UIPanel[n5] = UIPanel[n5] | 0x200;
    }

    public static final void c(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        UIPanel[n5] = UIPanel[n5] & 0xFFFFFDFF;
    }

    public static final int e(int n2) {
        return n2 / i * i;
    }

    public static final int f(int n2) {
        return n2 / i * i;
    }

    public static void h() {
        System.gc();
        if (I != e) {
            if (ResourceUtil.c == 5 || ResourceUtil.c == 3 || ResourceUtil.c == 8) {
                if (MGraphics.IActionListener == 1) {
                    Image[] imageArray = new Image[1];
                    J = imageArray;
                    imageArray[0] = ResourceUtil.c("/t/" + e + ".png");
                } else {
                    J = new Image[100];
                    int n2 = 0;
                    while (n2 < J.length) {
                        bv.J[n2] = ResourceUtil.c("/t/" + e + "/" + (n2 + 1) + ".png");
                        ++n2;
                    }
                }
            } else {
                Image image = ResourceUtil.a("/t/" + e + "$1.png");
                if (image != null) {
                    RMSManager.a("x" + MGraphics.IActionListener + "t" + e);
                    J = new Image[100];
                    int n3 = 0;
                    while (n3 < J.length) {
                        bv.J[n3] = ResourceUtil.a("/t/" + e + "$" + (n3 + 1) + ".png");
                        ++n3;
                    }
                } else {
                    image = ResourceUtil.a("/t/" + e + ".png");
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

