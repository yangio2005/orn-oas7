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

public final class cw
extends Screen
implements IActionListener {
    public static cw a;
    public static boolean IActionListener;
    private Command c;
    private static cd d;
    private static int e;
    private static int f;
    private static int UIPanel;
    private static int[][] h;
    private static int[] i;
    private static int[] j;
    private int[] k;
    private int ResourceUtil;
    private int m;
    private int n;
    private int o;
    private int GameScreen;

    static {
        IActionListener = false;
        h = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
        i = new int[]{2, 13, 8};
        j = new int[]{1, 12, 7};
    }

    public static cw a() {
        if (a == null) {
            a = new cw();
        }
        return a;
    }

    private static void a(byte[] byArray) {
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

    public final void IActionListener() {
        x.c = false;
        main.GameCanvas.F.a = false;
        main.GameCanvas.h();
        super.IActionListener();
        e = MathUtil.IActionListener(0, 3);
        f = MathUtil.IActionListener(0, 3);
        this.e();
        GameWorld.bI = false;
        if (d != null) {
            cw.d.i = GameStrings.GameStrings;
        }
        if (main.GameCanvas.e) {
            this.c = new Command(bs.a[bs.n], this, 10018, null);
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
        bv.UIPanel = dl.f[e];
        bv.d = dl.d[e];
        bv.c = dl.c[e];
        bv.e = dl.c[e];
        bv.a = dl.a[e];
        bv.IActionListener = dl.IActionListener[e];
        bv.e = this.k[e] + 1;
        bv.h();
        main.GameCanvas.a(this.k[e]);
        GameScreen.a(this.l, this.m);
    }

    public cw() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.k = nArray;
        this.l = 168;
        this.m = 350;
        this.n = 45;
        if (main.GameCanvas.I == null) {
            main.GameCanvas.I = new LoginScreen();
        }
        try {
            if (!main.GameCanvas.a) {
                byte[] byArray = new byte[]{39, 40, 41};
                if (!main.GameCanvas.a) {
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
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                }
            }
            cw.a(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        if (main.GameCanvas.A <= 200) {
            GameScreen.d(128, 100);
            GameScreen.bL = (main.GameCanvas.A - 128) / 2;
            GameScreen.bK = 10;
            this.m += 15;
            this.n -= 15;
        }
        e = 1;
        d = new cd();
        new cd().c = main.GameCanvas.I.GameCanvas.c;
        if (main.GameCanvas.A < 200) {
            cw.d.c = 60;
        }
        cw.d.d = 26;
        if (main.GameCanvas.A < 200) {
            cw.d.a = GameScreen.bL + 45;
            cw.d.IActionListener = GameScreen.bK + 12;
        } else {
            cw.d.a = main.GameCanvas.A / 2 - cw.d.c / 2;
            cw.d.IActionListener = 35;
        }
        if (!main.GameCanvas.e) {
            cw.d.e = true;
        }
        d.c(0);
        cw.d.i = GameStrings.GameStrings;
        if (d.d().equals("@")) {
            d.a(main.GameCanvas.I.GameCanvas.d().substring(0, main.GameCanvas.I.GameCanvas.d().indexOf("@")));
        }
        e = 1;
        f = 0;
        this.cn = new Command(GameStrings.bz, this, 8000, null);
        this.cm = new Command(GameStrings.bA, this, 8001, null);
        if (!main.GameCanvas.e) {
            this.co = cw.d.j;
        }
    }

    public final void a(int n2) {
        d.a(n2);
    }

    public final void c() {
        ++this.o;
        if (this.o > 30) {
            this.o = 0;
        }
        this.GameScreen = this.o % 15 < 5 ? 0 : 1;
        d.c();
        if (this.c != null && this.c.c()) {
            this.c.a();
        }
        if (UIPanel != 0) {
            cw.d.e = false;
        }
    }

    public final void d() {
        if (main.GameCanvas.i[2] && --UIPanel < 0) {
            UIPanel = GameStrings.aK.length - 1;
        }
        if (main.GameCanvas.i[8] && ++UIPanel >= GameStrings.aK.length) {
            UIPanel = 0;
        }
        if (UIPanel == 0) {
            if (!main.GameCanvas.e) {
                this.co = cw.d.j;
            }
            d.c();
        }
        if (UIPanel == 1) {
            if (main.GameCanvas.i[4]) {
                if (--e < 0) {
                    e = GameStrings.aL.length - 1;
                }
                this.e();
            }
            if (main.GameCanvas.i[6]) {
                if (++e > GameStrings.aL.length - 1) {
                    e = 0;
                }
                this.e();
            }
            this.co = null;
        }
        if (UIPanel == 2) {
            if (main.GameCanvas.i[4] && --f < 0) {
                f = GameStrings.fp[0].length - 1;
            }
            if (main.GameCanvas.i[6] && ++f > GameStrings.fp[0].length - 1) {
                f = 0;
            }
            this.co = null;
        }
        if (main.GameCanvas.m) {
            int n2;
            int n3 = 110;
            int n4 = 60;
            if (main.GameCanvas.A > main.GameCanvas.B) {
                n3 = 100;
                n4 = 40;
            }
            if (main.GameCanvas.a(main.GameCanvas.A / 2 - 117, 15, 234, 80)) {
                UIPanel = 0;
                cw.d.e = true;
            }
            if (main.GameCanvas.a(main.GameCanvas.A / 2 - 117, n3 - 30, 234, n4 + 5)) {
                UIPanel = 1;
                n2 = e;
                e = (main.GameCanvas.GameScreen - (main.GameCanvas.A / 2 - 117)) / 78;
                if (e < 0) {
                    e = 0;
                }
                if (e > GameStrings.aL.length - 1) {
                    e = GameStrings.aL.length - 1;
                }
                if (n2 != e) {
                    this.e();
                }
            }
            if (main.GameCanvas.a(main.GameCanvas.A / 2 - 117, n3 - 30 + n4 + 5, 234, 65)) {
                UIPanel = 2;
                n2 = f;
                f = (main.GameCanvas.GameScreen - (main.GameCanvas.A / 2 - 117)) / 78;
                if (f < 0) {
                    f = 0;
                }
                if (f > GameStrings.fp[0].length - 1) {
                    f = GameStrings.fp[0].length - 1;
                }
                if (n2 != UIPanel) {
                    this.e();
                }
            }
        }
        super.d();
        main.GameCanvas.UIPanel();
        main.GameCanvas.f();
    }

    public final void a(MGraphics en2) {
        int n2;
        int n3;
        if (GameWorld.bI) {
            return;
        }
        main.GameCanvas.c(en2);
        en2.a(-GameScreen.j, -GameScreen.k);
        if (!main.GameCanvas.a) {
            n3 = 0;
            while (n3 < dl.UIPanel[e].size()) {
                cz cz2 = (cz)dl.UIPanel[e].elementAt(n3);
                if (cz2.c != -1 && cz2.h == 1) {
                    cz2.a(en2);
                }
                ++n3;
            }
        }
        bv.a(en2);
        n3 = 30;
        if (main.GameCanvas.A == 128) {
            n3 = 20;
        }
        int n4 = h[e][f];
        int n5 = i[e];
        int n6 = j[e];
        en2.a(bv.x, this.l, this.m + this.n, 3);
        RMSManager av2 = GameScreen.x[n4];
        RMSManager av3 = GameScreen.x[n5];
        RMSManager av4 = GameScreen.x[n6];
        bl.IActionListener(en2, av2.a[GameWorld.bC[this.GameScreen][0][0]].a, this.l + GameWorld.bC[this.GameScreen][0][1] + av2.a[GameWorld.bC[this.GameScreen][0][0]].IActionListener, this.m - GameWorld.bC[this.GameScreen][0][2] + av2.a[GameWorld.bC[this.GameScreen][0][0]].c + this.n, 0, 0);
        bl.IActionListener(en2, av3.a[GameWorld.bC[this.GameScreen][1][0]].a, this.l + GameWorld.bC[this.GameScreen][1][1] + av3.a[GameWorld.bC[this.GameScreen][1][0]].IActionListener, this.m - GameWorld.bC[this.GameScreen][1][2] + av3.a[GameWorld.bC[this.GameScreen][1][0]].c + this.n, 0, 0);
        bl.IActionListener(en2, av4.a[GameWorld.bC[this.GameScreen][2][0]].a, this.l + GameWorld.bC[this.GameScreen][2][1] + av4.a[GameWorld.bC[this.GameScreen][2][0]].IActionListener, this.m - GameWorld.bC[this.GameScreen][2][2] + av4.a[GameWorld.bC[this.GameScreen][2][0]].c + this.n, 0, 0);
        if (!main.GameCanvas.a) {
            n2 = 0;
            while (n2 < dl.UIPanel[e].size()) {
                cz cz3 = (cz)dl.UIPanel[e].elementAt(n2);
                if (cz3.c != -1 && cz3.h == 3) {
                    cz3.a(en2);
                }
                ++n2;
            }
        }
        en2.a(-en2.a(), -en2.IActionListener());
        if (main.GameCanvas.A < 200) {
            cx.IActionListener(GameScreen.bL, GameScreen.bK, GameScreen.bM, GameScreen.bN, en2);
            bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, main.GameCanvas.A / 2 + GameWorld.bC[0][0][1] + av2.a[GameWorld.bC[0][0][0]].IActionListener, GameScreen.bK + 30 + n3 * 3 - GameWorld.bC[0][0][2] + av2.a[GameWorld.bC[0][0][0]].c + this.n, 0, 0);
            bl.IActionListener(en2, av3.a[GameWorld.bC[0][1][0]].a, main.GameCanvas.A / 2 + GameWorld.bC[0][1][1] + av3.a[GameWorld.bC[0][1][0]].IActionListener, GameScreen.bK + 30 + n3 * 3 - GameWorld.bC[0][1][2] + av3.a[GameWorld.bC[0][1][0]].c + this.n, 0, 0);
            bl.IActionListener(en2, av4.a[GameWorld.bC[0][2][0]].a, main.GameCanvas.A / 2 + GameWorld.bC[0][2][1] + av4.a[GameWorld.bC[0][2][0]].IActionListener, GameScreen.bK + 30 + n3 * 3 - GameWorld.bC[0][2][2] + av4.a[GameWorld.bC[0][2][0]].c + this.n, 0, 0);
            n2 = 0;
            while (n2 < GameStrings.aK.length) {
                if (UIPanel == n2) {
                    en2.a(GameScreen.bw, 0, 0, 13, 16, 2, GameScreen.bL + 10 + (main.GameCanvas.w % 7 > 3 ? 1 : 0), GameScreen.bK + 35 + n2 * n3, cj.f);
                    en2.a(GameScreen.bw, 0, 0, 13, 16, 0, GameScreen.bL + GameScreen.bM - 10 - (main.GameCanvas.w % 7 > 3 ? 1 : 0), GameScreen.bK + 35 + n2 * n3, cj.f);
                }
                mFont.f.a(en2, GameStrings.aK[n2], GameScreen.bL + 20, GameScreen.bK + 30 + n2 * n3, 0);
                ++n2;
            }
            mFont.f.a(en2, GameStrings.aL[e], GameScreen.bL + 70, GameScreen.bK + 30 + n3 * 1, 0);
            mFont.f.a(en2, GameStrings.fp[e][f], GameScreen.bL + 55, GameScreen.bK + 30 + n3 * 2, 0);
        } else {
            n2 = 110;
            int n7 = 60;
            if (main.GameCanvas.A > main.GameCanvas.B) {
                n2 = 100;
                n7 = 45;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != e) {
                    en2.a(GameScreen.GameStrings, main.GameCanvas.A / 2 - 78 + n3 * 78, n2, 3);
                } else {
                    if (UIPanel == 1) {
                        en2.a(GameScreen.bw, 0, 0, 13, 16, 4, main.GameCanvas.A / 2 - 78 + n3 * 78, n2 - 20 + (main.GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.a(GameScreen.ax, main.GameCanvas.A / 2 - 78 + n3 * 78, n2, 3);
                }
                mFont.f.a(en2, GameStrings.aL[n3], main.GameCanvas.A / 2 - 78 + n3 * 78, n2 - 5, 2);
                ++n3;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != f) {
                    en2.a(GameScreen.GameStrings, main.GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                } else {
                    if (UIPanel == 2) {
                        en2.a(GameScreen.bw, 0, 0, 13, 16, 4, main.GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7 - 20 + (main.GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.a(GameScreen.ax, main.GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                }
                mFont.f.a(en2, GameStrings.fp[e][n3], main.GameCanvas.A / 2 - 78 + n3 * 78, n2 + n7 - 5, 2);
                ++n3;
            }
            if (UIPanel == 0) {
                en2.a(GameScreen.bw, 0, 0, 13, 16, 4, main.GameCanvas.A / 2, 20 + (main.GameCanvas.w % 7 > 3 ? 1 : 0), cj.f);
            }
        }
        d.a(en2);
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (this.c != null) {
            this.c.a(en2);
        }
        super.a(en2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                if (d.d().equals("")) {
                    main.GameCanvas.a(GameStrings.as);
                    return;
                }
                if (d.d().length() < 5) {
                    main.GameCanvas.a(GameStrings.at);
                    return;
                }
                if (d.d().length() > 15) {
                    main.GameCanvas.a(GameStrings.au);
                    return;
                }
                bp.a();
                GameService.a().a(d.d(), e, h[e][f]);
                return;
            }
            case 8001: {
                if (main.GameCanvas.I.n) {
                    main.GameCanvas.a(GameStrings.fV, new Command(GameStrings.bn, this, 10019, null), new Command(GameStrings.bo, this, 10020, null));
                    return;
                }
                NetworkService.a().e();
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 10020: {
                main.GameCanvas.h();
                return;
            }
            case 10019: {
                NetworkService.a().e();
                main.GameCanvas.h();
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 10018: {
                bs.a(-1, true);
                eu.IActionListener = false;
                main.GameCanvas.al.IActionListener();
            }
        }
    }
}

