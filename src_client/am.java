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

public final class am
extends Screen
implements b {
    public static boolean LoginScreen;
    private Char b;
    private int c;
    private int d;
    private int e;
    private int f = 45;
    private de g;
    private int[] Item;
    private int[] i;
    private int j;

    private static void methodLoginScreen(byte[] byArray) {
        if (GameCanvas.isLowGraphic) {
            return;
        }
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
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public am() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.Item = nArray;
        int[] nArray2 = new int[10];
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArray2[8] = 1;
        nArray2[9] = 1;
        this.i = nArray2;
        this.j = 0;
        try {
            if (!GameCanvas.isLowGraphic) {
                byte[] byArray = new byte[]{39, 40, 41};
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
            am.LoginScreen(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {}
        this.d = 168;
        this.e = 350;
        bl.c = new eg[32000];
        bl.e = new byte[32000];
        bl.g = (short)32000;
    }

    public final void methodLoginScreen(Char af2) {
        this.b = new Char();
        this.c = this.b.K = af2.K;
        this.b.bU = af2.bU;
        this.b.bT = af2.bT;
        this.b.bW = af2.bW;
        this.b.bV = af2.bV;
        this.b.bX = af2.bX;
        this.b.ag = af2.ag;
        this.b();
    }

    public final void b() {
        GameCanvas.F.LoginScreen = false;
        GameCanvas.instance();
        GameScreen.j().LoginScreen();
        super.b();
        am am2 = this;
        bv.f = new int[dl.e[am2.c].length];
        int n2 = 0;
        while (n2 < dl.e[am2.c].length) {
            bv.f[n2] = dl.e[am2.c][n2];
            ++n2;
        }
        bv.g = dl.f[am2.c];
        bv.d = dl.d[am2.c];
        bv.c = dl.c[am2.c];
        bv.e = dl.c[am2.c];
        bv.LoginScreen = dl.LoginScreen[am2.c];
        bv.b = dl.b[am2.c];
        bv.e = am2.Item[am2.c] + 1;
        bv.Item();
        GameCanvas.isLowGraphic(am2.Item[am2.c]);
        GameScreen.LoginScreen(am2.d, am2.e);
        Char.bI = false;
        this.cn = new de(T.bw, this, 100, null);
        this.cm = new de(T.bA, this, 101, null);
        this.g = new de(ServerListScreen.LoginScreen[ServerListScreen.n], this, 102, null);
        this.g.j = 1;
        this.g.k = 3;
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (!MessageHandler.c) {
            return;
        }
        if (LoginScreen) {
            return;
        }
        if (Char.bI) {
            return;
        }
        GameCanvas.c(en2);
        en2.LoginScreen(-GameScreen.j, -GameScreen.k);
        int n2 = 0;
        while (n2 < dl.g[this.c].size()) {
            cz cz2 = (cz)dl.g[this.c].elementAt(n2);
            if (cz2.c != -1 && cz2.Item == 1) {
                cz2.LoginScreen(en2);
            }
            ++n2;
        }
        bv.LoginScreen(en2);
        en2.LoginScreen(bv.x, GameScreen.j + GameCanvas.C, this.e + this.f + 1, 3);
        if (this.b != null) {
            this.b.LoginScreen(en2, GameScreen.j + GameCanvas.C, this.e + this.f, 1, this.i[this.j], true);
            mFont.d.LoginScreen(en2, this.b.ag, GameScreen.j + GameCanvas.C, this.e - 15, 2, mFont.E);
        }
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        super.LoginScreen(en2);
        this.g.LoginScreen(en2);
    }

    public final void c() {
        super.c();
        if (!Session.LoginScreen().d()) {
            LoginScreen = true;
            ++this.j;
            if (this.j > 50) {
                ServerListScreen.k();
                this.j = 0;
            }
            return;
        }
        LoginScreen = false;
        ++this.j;
        if (this.j > this.i.length - 1) {
            this.j = 0;
        }
        if (this.g != null && this.g.c()) {
            this.g.LoginScreen();
        }
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 100: {
                ServerListScreen.Res();
                return;
            }
            case 101: {
                GameCanvas.ak.b();
                return;
            }
            case 102: {
                ServerListScreen.LoginScreen(-1, true);
                eu.b = false;
                GameCanvas.al.b();
            }
        }
    }
}

