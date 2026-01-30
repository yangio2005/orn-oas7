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
import main.GameCanvas;

public final class am
extends Screen
implements IActionListener {
    public static boolean a;
    private GameWorld IActionListener;
    private int c;
    private int d;
    private int e;
    private int f = 45;
    private Command UIPanel;
    private int[] h;
    private int[] i;
    private int j;

    private static void a(byte[] byArray) {
        if (main.GameCanvas.a) {
            return;
        }
        try {
            int n2 = 0;
            while (n2 < byArray.length) {
                InputStream inputStream = ad.a("/mymap/mapTable" + byArray[n2]);
                inputStream = new DataInputStream(inputStream);
                int n3 = ((DataInputStream)inputStream).readShort();
                dl.UIPanel[n2] = new LoggingList("MapTemplate.vCurrItem[a] ");
                int n4 = 0;
                while (n4 < n3) {
                    short s2 = ((DataInputStream)inputStream).readShort();
                    short s3 = ((DataInputStream)inputStream).readShort();
                    short s4 = ((DataInputStream)inputStream).readShort();
                    if (bv.a(s2) != null) {
                        cz cz2 = bv.a(s2);
                        cz cz3 = new cz();
                        new cz().a = s2;
                        cz3.c = cz2.c;
                        cz3.f = cz2.f;
                        cz3.UIPanel = cz2.UIPanel;
                        cz3.d = s3 * bv.i;
                        cz3.e = s4 * bv.i;
                        cz3.h = cz2.h;
                        dl.UIPanel[n2].addElement(cz3);
                        if (!cz.k.containsKey(String.valueOf(cz3.c))) {
                            Image image;
                            try {
                                image = ResourceUtil.IActionListener("/mapBackGround/" + cz3.c + ".png");
                                cz.k.put(String.valueOf(cz3.c), image);
                            }
                            catch (Exception exception) {
                                image = ResourceUtil.c("/mapBackGround/" + cz3.c + ".png");
                                if (image == null) {
                                    image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    GameService.a().c(cz3.c);
                                }
                                cz.k.put(String.valueOf(cz3.c), image);
                            }
                            cz.m.addElement(String.valueOf(cz3.c));
                        }
                        if (!cz.a(String.valueOf(cz3.c))) {
                            cz.ResourceUtil.addElement(String.valueOf(cz3.c));
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
        this.h = nArray;
        int[] nArray2 = new int[10];
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArray2[8] = 1;
        nArray2[9] = 1;
        this.i = nArray2;
        this.j = 0;
        try {
            if (!main.GameCanvas.a) {
                byte[] byArray = new byte[]{39, 40, 41};
                int n2 = 0;
                while (n2 < byArray.length) {
                    InputStream inputStream = ad.a("/mymap/" + byArray[n2]);
                    inputStream = new DataInputStream(inputStream);
                    dl.a[n2] = (char)((FilterInputStream)inputStream).read();
                    dl.IActionListener[n2] = (char)((FilterInputStream)inputStream).read();
                    dl.e[n2] = new int[((FilterInputStream)inputStream).available()];
                    int n3 = 0;
                    while (n3 < dl.a[n2] * dl.IActionListener[n2]) {
                        dl.e[n2][n3] = ((FilterInputStream)inputStream).read();
                        ++n3;
                    }
                    dl.f[n2] = new int[dl.e[n2].length];
                    ++n2;
                }
            }
            am.a(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {}
        this.d = 168;
        this.e = 350;
        bl.c = new eg[32000];
        bl.e = new byte[32000];
        bl.UIPanel = (short)32000;
    }

    public final void a(GameWorld af2) {
        this.b = new GameWorld();
        this.c = this.b.K = af2.K;
        this.b.bU = af2.bU;
        this.b.bT = af2.bT;
        this.b.bW = af2.bW;
        this.b.bV = af2.bV;
        this.b.bX = af2.bX;
        this.b.ag = af2.ag;
        this.b();
    }

    public final void IActionListener() {
        main.GameCanvas.F.a = false;
        main.GameCanvas.h();
        GameScreen.j().a();
        super.IActionListener();
        am am2 = this;
        bv.f = new int[dl.e[am2.c].length];
        int n2 = 0;
        while (n2 < dl.e[am2.c].length) {
            bv.f[n2] = dl.e[am2.c][n2];
            ++n2;
        }
        bv.UIPanel = dl.f[am2.c];
        bv.d = dl.d[am2.c];
        bv.c = dl.c[am2.c];
        bv.e = dl.c[am2.c];
        bv.a = dl.a[am2.c];
        bv.IActionListener = dl.IActionListener[am2.c];
        bv.e = am2.h[am2.c] + 1;
        bv.h();
        main.GameCanvas.a(am2.h[am2.c]);
        GameScreen.a(am2.d, am2.e);
        GameWorld.bI = false;
        this.cn = new Command(GameStrings.bw, this, 100, null);
        this.cm = new Command(GameStrings.bA, this, 101, null);
        this.g = new Command(bs.a[bs.n], this, 102, null);
        this.g.j = 1;
        this.g.k = 3;
    }

    public final void a(MGraphics en2) {
        if (!MessageHandler.c) {
            return;
        }
        if (a) {
            return;
        }
        if (GameWorld.bI) {
            return;
        }
        main.GameCanvas.c(en2);
        en2.a(-GameScreen.j, -GameScreen.k);
        int n2 = 0;
        while (n2 < dl.UIPanel[this.c].size()) {
            cz cz2 = (cz)dl.UIPanel[this.c].elementAt(n2);
            if (cz2.c != -1 && cz2.h == 1) {
                cz2.a(en2);
            }
            ++n2;
        }
        bv.a(en2);
        en2.a(bv.x, GameScreen.j + main.GameCanvas.C, this.e + this.f + 1, 3);
        if (this.b != null) {
            this.b.a(en2, GameScreen.j + main.GameCanvas.C, this.e + this.f, 1, this.i[this.j], true);
            mFont.d.a(en2, this.b.ag, GameScreen.j + main.GameCanvas.C, this.e - 15, 2, mFont.E);
        }
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        super.a(en2);
        this.g.a(en2);
    }

    public final void c() {
        super.c();
        if (!NetworkService.a().d()) {
            a = true;
            ++this.j;
            if (this.j > 50) {
                bs.k();
                this.j = 0;
            }
            return;
        }
        a = false;
        ++this.j;
        if (this.j > this.i.length - 1) {
            this.j = 0;
        }
        if (this.g != null && this.g.c()) {
            this.g.a();
        }
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 100: {
                bs.ResourceUtil();
                return;
            }
            case 101: {
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 102: {
                bs.a(-1, true);
                eu.IActionListener = false;
                main.GameCanvas.al.IActionListener();
            }
        }
    }
}

