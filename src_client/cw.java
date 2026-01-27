/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import main.GameCanvas;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class cw
extends Screen
implements b {
    public static cw LoginScreen;
    public static boolean b;
    private de c;
    private static cd d;
    private static int e;
    private static int f;
    private static int g;
    private static int[][] Item;
    private static int[] i;
    private static int[] j;
    private int[] k;
    private int Res;
    private int m;
    private int n;
    private int o;
    private int GameScreen;

    static {
        b = false;
        Item = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
        i = new int[]{2, 13, 8};
        j = new int[]{1, 12, 7};
    }

    public static cw LoginScreen() {
        if (LoginScreen == null) {
            LoginScreen = new cw();
        }
        return LoginScreen;
    }

    private static void methodLoginScreen(byte[] byArray) {
        int n2 = 0;
        while (n2 < byArray.length) {
            InputStream inputStream = ad.LoginScreen("/mymap/" + byArray[n2]);
            inputStream = new DataInputStream(inputStream);
            dl.LoginScreen[n2] = (char)((FilterInputStream)inputStream).read();
            dl.b[n2] = (char)((FilterInputStream)inputStream).read();
            dl.e[n2] = new int[((FilterInputStream)inputStream).available()];
            int n3 = 0;
            while (n3 < dl.LoginScreen[n2] * dl.b[n2]) {
                dl.e[n2][n3] = ((FilterInputStream)inputStream).read();
                ++n3;
            }
            dl.f[n2] = new int[dl.e[n2].length];
            ++n2;
        }
    }

    public final void b() {
        x.c = false;
        GameCanvas.F.LoginScreen = false;
        GameCanvas.instance();
        super.b();
        e = ds.b(0, 3);
        f = ds.b(0, 3);
        this.e();
        Char.bI = false;
        if (d != null) {
            cw.d.i = T.T;
        }
        if (GameCanvas.e) {
            this.c = new de(ServerListScreen.LoginScreen[ServerListScreen.n], this, 10018, null);
            this.c.j = 1;
            this.c.k = 3;
        }
    }

    private void e() {
        bv.f = new int[dl.e[e].length];
        int n2 = 0;
        while (n2 < dl.e[e].length) {
            bv.f[n2] = dl.e[e][n2];
            ++n2;
        }
        bv.g = dl.f[e];
        bv.d = dl.d[e];
        bv.c = dl.c[e];
        bv.e = dl.c[e];
        bv.LoginScreen = dl.LoginScreen[e];
        bv.b = dl.b[e];
        bv.e = this.k[e] + 1;
        bv.Item();
        GameCanvas.isLowGraphic(this.k[e]);
        GameScreen.LoginScreen(this.Res, this.m);
    }

    public cw() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.k = nArray;
        this.Res = 168;
        this.m = 350;
        this.n = 45;
        if (GameCanvas.I == null) {
            GameCanvas.I = new x();
        }
        try {
            if (!GameCanvas.isLowGraphic) {
                byte[] byArray = new byte[]{39, 40, 41};
                if (!GameCanvas.isLowGraphic) {
                    try {
                        int n2 = 0;
                        while (n2 < byArray.length) {
                            InputStream inputStream = ad.LoginScreen("/mymap/mapTable" + byArray[n2]);
                            inputStream = new DataInputStream(inputStream);
                            int n3 = ((DataInputStream)inputStream).readShort();
                            dl.g[n2] = new MyVector("MapTemplate.vCurrItem[GameCanvas] ");
                            int n4 = 0;
                            while (n4 < n3) {
                                short s2 = ((DataInputStream)inputStream).readShort();
                                short s3 = ((DataInputStream)inputStream).readShort();
                                short s4 = ((DataInputStream)inputStream).readShort();
                                if (bv.LoginScreen(s2) != null) {
                                    cz cz2 = bv.LoginScreen(s2);
                                    cz cz3 = new cz();
                                    new cz().LoginScreen = s2;
                                    cz3.c = cz2.c;
                                    cz3.f = cz2.f;
                                    cz3.g = cz2.g;
                                    cz3.d = s3 * bv.i;
                                    cz3.e = s4 * bv.i;
                                    cz3.Item = cz2.Item;
                                    dl.g[n2].addElement(cz3);
                                    if (!cz.k.containsKey(String.valueOf(cz3.c))) {
                                        Image image;
                                        try {
                                            image = Res.loadImage("/mapBackGround/" + cz3.c + ".png");
                                            cz.k.put(String.valueOf(cz3.c), image);
                                        }
                                        catch (Exception exception) {
                                            image = Res.clientType("/mapBackGround/" + cz3.c + ".png");
                                            if (image == null) {
                                                image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                                GameService.LoginScreen().c(cz3.c);
                                            }
                                            cz.k.put(String.valueOf(cz3.c), image);
                                        }
                                        cz.m.addElement(String.valueOf(cz3.c));
                                    }
                                    if (!cz.LoginScreen(String.valueOf(cz3.c))) {
                                        cz.Res.addElement(String.valueOf(cz3.c));
                                    }
                                }
                                ++n4;
                            }
                            ++n2;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                }
            }
            cw.LoginScreen(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        if (GameCanvas.A <= 200) {
            GameScreen.d(128, 100);
            GameScreen.bL = (GameCanvas.A - 128) / 2;
            GameScreen.bK = 10;
            this.m += 15;
            this.n -= 15;
        }
        e = 1;
        d = new cd();
        new cd().c = GameCanvas.I.LoginScreen.c;
        if (GameCanvas.A < 200) {
            cw.d.c = 60;
        }
        cw.d.d = 26;
        if (GameCanvas.A < 200) {
            cw.d.LoginScreen = GameScreen.bL + 45;
            cw.d.b = GameScreen.bK + 12;
        } else {
            cw.d.LoginScreen = GameCanvas.A / 2 - cw.d.c / 2;
            cw.d.b = 35;
        }
        if (!GameCanvas.e) {
            cw.d.e = true;
        }
        d.c(0);
        cw.d.i = T.T;
        if (d.d().equals("@")) {
            d.LoginScreen(GameCanvas.I.LoginScreen.d().substring(0, GameCanvas.I.LoginScreen.d().indexOf("@")));
        }
        e = 1;
        f = 0;
        this.cn = new de(T.bz, this, 8000, null);
        this.cm = new de(T.bA, this, 8001, null);
        if (!GameCanvas.e) {
            this.co = cw.d.j;
        }
    }

    public final void methodLoginScreen(int n2) {
        d.LoginScreen(n2);
    }

    public final void c() {
        ++this.o;
        if (this.o > 30) {
            this.o = 0;
        }
        this.GameScreen = this.o % 15 < 5 ? 0 : 1;
        d.c();
        if (this.c != null && this.c.c()) {
            this.c.LoginScreen();
        }
        if (g != 0) {
            cw.d.e = false;
        }
    }

    public final void d() {
        if (GameCanvas.i[2] && --g < 0) {
            g = T.aK.length - 1;
        }
        if (GameCanvas.i[8] && ++g >= T.aK.length) {
            g = 0;
        }
        if (g == 0) {
            if (!GameCanvas.e) {
                this.co = cw.d.j;
            }
            d.c();
        }
        if (g == 1) {
            if (GameCanvas.i[4]) {
                if (--e < 0) {
                    e = T.aL.length - 1;
                }
                this.e();
            }
            if (GameCanvas.i[6]) {
                if (++e > T.aL.length - 1) {
                    e = 0;
                }
                this.e();
            }
            this.co = null;
        }
        if (g == 2) {
            if (GameCanvas.i[4] && --f < 0) {
                f = T.fp[0].length - 1;
            }
            if (GameCanvas.i[6] && ++f > T.fp[0].length - 1) {
                f = 0;
            }
            this.co = null;
        }
        if (GameCanvas.m) {
            int n2;
            int n3 = 110;
            int n4 = 60;
            if (GameCanvas.A > GameCanvas.B) {
                n3 = 100;
                n4 = 40;
            }
            if (GameCanvas.isLowGraphic(GameCanvas.A / 2 - 117, 15, 234, 80)) {
                g = 0;
                cw.d.e = true;
            }
            if (GameCanvas.isLowGraphic(GameCanvas.A / 2 - 117, n3 - 30, 234, n4 + 5)) {
                g = 1;
                n2 = e;
                e = (GameCanvas.GameScreen - (GameCanvas.A / 2 - 117)) / 78;
                if (e < 0) {
                    e = 0;
                }
                if (e > T.aL.length - 1) {
                    e = T.aL.length - 1;
                }
                if (n2 != e) {
                    this.e();
                }
            }
            if (GameCanvas.isLowGraphic(GameCanvas.A / 2 - 117, n3 - 30 + n4 + 5, 234, 65)) {
                g = 2;
                n2 = f;
                f = (GameCanvas.GameScreen - (GameCanvas.A / 2 - 117)) / 78;
                if (f < 0) {
                    f = 0;
                }
                if (f > T.fp[0].length - 1) {
                    f = T.fp[0].length - 1;
                }
                if (n2 != g) {
                    this.e();
                }
            }
        }
        super.d();
        GameCanvas.resetKeys();
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(mGraphics en2) {
        int n2;
        int n3;
        if (Char.bI) {
            return;
        }
        GameCanvas.c(en2);
        en2.LoginScreen(-GameScreen.j, -GameScreen.k);
        if (!GameCanvas.isLowGraphic) {
            n3 = 0;
            while (n3 < dl.g[e].size()) {
                cz cz2 = (cz)dl.g[e].elementAt(n3);
                if (cz2.c != -1 && cz2.Item == 1) {
                    cz2.LoginScreen(en2);
                }
                ++n3;
            }
        }
        bv.LoginScreen(en2);
        n3 = 30;
        if (GameCanvas.A == 128) {
            n3 = 20;
        }
        int n4 = Item[e][f];
        int n5 = i[e];
        int n6 = j[e];
        en2.LoginScreen(bv.x, this.Res, this.m + this.n, 3);
        RMS av2 = GameScreen.x[n4];
        RMS av3 = GameScreen.x[n5];
        RMS av4 = GameScreen.x[n6];
        bl.b(en2, av2.LoginScreen[Char.bC[this.GameScreen][0][0]].LoginScreen, this.Res + Char.bC[this.GameScreen][0][1] + av2.LoginScreen[Char.bC[this.GameScreen][0][0]].b, this.m - Char.bC[this.GameScreen][0][2] + av2.LoginScreen[Char.bC[this.GameScreen][0][0]].c + this.n, 0, 0);
        bl.b(en2, av3.LoginScreen[Char.bC[this.GameScreen][1][0]].LoginScreen, this.Res + Char.bC[this.GameScreen][1][1] + av3.LoginScreen[Char.bC[this.GameScreen][1][0]].b, this.m - Char.bC[this.GameScreen][1][2] + av3.LoginScreen[Char.bC[this.GameScreen][1][0]].c + this.n, 0, 0);
        bl.b(en2, av4.LoginScreen[Char.bC[this.GameScreen][2][0]].LoginScreen, this.Res + Char.bC[this.GameScreen][2][1] + av4.LoginScreen[Char.bC[this.GameScreen][2][0]].b, this.m - Char.bC[this.GameScreen][2][2] + av4.LoginScreen[Char.bC[this.GameScreen][2][0]].c + this.n, 0, 0);
        if (!GameCanvas.isLowGraphic) {
            n2 = 0;
            while (n2 < dl.g[e].size()) {
                cz cz3 = (cz)dl.g[e].elementAt(n2);
                if (cz3.c != -1 && cz3.Item == 3) {
                    cz3.LoginScreen(en2);
                }
                ++n2;
            }
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        if (GameCanvas.A < 200) {
            cx.b(GameScreen.bL, GameScreen.bK, GameScreen.bM, GameScreen.bN, en2);
            bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, GameCanvas.A / 2 + Char.bC[0][0][1] + av2.LoginScreen[Char.bC[0][0][0]].b, GameScreen.bK + 30 + n3 * 3 - Char.bC[0][0][2] + av2.LoginScreen[Char.bC[0][0][0]].c + this.n, 0, 0);
            bl.b(en2, av3.LoginScreen[Char.bC[0][1][0]].LoginScreen, GameCanvas.A / 2 + Char.bC[0][1][1] + av3.LoginScreen[Char.bC[0][1][0]].b, GameScreen.bK + 30 + n3 * 3 - Char.bC[0][1][2] + av3.LoginScreen[Char.bC[0][1][0]].c + this.n, 0, 0);
            bl.b(en2, av4.LoginScreen[Char.bC[0][2][0]].LoginScreen, GameCanvas.A / 2 + Char.bC[0][2][1] + av4.LoginScreen[Char.bC[0][2][0]].b, GameScreen.bK + 30 + n3 * 3 - Char.bC[0][2][2] + av4.LoginScreen[Char.bC[0][2][0]].c + this.n, 0, 0);
            n2 = 0;
            while (n2 < T.aK.length) {
                if (g == n2) {
                    en2.LoginScreen(GameScreen.bw, 0, 0, 13, 16, 2, GameScreen.bL + 10 + (GameCanvas.w % 7 > 3 ? 1 : 0), GameScreen.bK + 35 + n2 * n3, cj.f);
                    en2.LoginScreen(GameScreen.bw, 0, 0, 13, 16, 0, GameScreen.bL + GameScreen.bM - 10 - (GameCanvas.w % 7 > 3 ? 1 : 0), GameScreen.bK + 35 + n2 * n3, cj.f);
                }
                mFont.f.LoginScreen(en2, T.aK[n2], GameScreen.bL + 20, GameScreen.bK + 30 + n2 * n3, 0);
                ++n2;
            }
            mFont.f.LoginScreen(en2, T.aL[e], GameScreen.bL + 70, GameScreen.bK + 30 + n3 * 1, 0);
            mFont.f.LoginScreen(en2, T.fp[e][f], GameScreen.bL + 55, GameScreen.bK + 30 + n3 * 2, 0);
        } else {
            n2 = 110;
            int n7 = 60;
            if (GameCanvas.A > GameCanvas.B) {
                n2 = 100;
                n7 = 45;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != e) {
                    en2.LoginScreen(GameScreen.T, GameCanvas.A / 2 - 78 + n3 * 78, n2, 3);
                } else {
                    if (g == 1) {
                        en2.LoginScreen(GameScreen.bw, 0, 0, 13, 16, 4, GameCanvas.A / 2 - 78 + n3 * 78, n2 - 20 + (GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.LoginScreen(GameScreen.ax, GameCanvas.A / 2 - 78 + n3 * 78, n2, 3);
                }
                mFont.f.LoginScreen(en2, T.aL[n3], GameCanvas.A / 2 - 78 + n3 * 78, n2 - 5, 2);
                ++n3;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != f) {
                    en2.LoginScreen(GameScreen.T, GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                } else {
                    if (g == 2) {
                        en2.LoginScreen(GameScreen.bw, 0, 0, 13, 16, 4, GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7 - 20 + (GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.LoginScreen(GameScreen.ax, GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                }
                mFont.f.LoginScreen(en2, T.fp[e][n3], GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7 - 5, 2);
                ++n3;
            }
            if (g == 0) {
                en2.LoginScreen(GameScreen.bw, 0, 0, 13, 16, 4, GameCanvas.A / 2, 20 + (GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
            }
        }
        d.LoginScreen(en2);
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (this.c != null) {
            this.c.LoginScreen(en2);
        }
        super.LoginScreen(en2);
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 8000: {
                if (d.d().equals("")) {
                    GameCanvas.isLowGraphic(T.ImageCache);
                    return;
                }
                if (d.d().length() < 5) {
                    GameCanvas.isLowGraphic(T.at);
                    return;
                }
                if (d.d().length() > 15) {
                    GameCanvas.isLowGraphic(T.au);
                    return;
                }
                bp.LoginScreen();
                GameService.LoginScreen().LoginScreen(d.d(), e, Item[e][f]);
                return;
            }
            case 8001: {
                if (GameCanvas.I.n) {
                    GameCanvas.isLowGraphic(T.fV, new de(T.ImageLoader, this, 10019, null), new de(T.bo, this, 10020, null));
                    return;
                }
                Session.LoginScreen().e();
                GameCanvas.ak.b();
                return;
            }
            case 10020: {
                GameCanvas.instance();
                return;
            }
            case 10019: {
                Session.LoginScreen().e();
                GameCanvas.instance();
                GameCanvas.ak.b();
                return;
            }
            case 10018: {
                ServerListScreen.LoginScreen(-1, true);
                eu.b = false;
                GameCanvas.al.b();
            }
        }
    }
}

