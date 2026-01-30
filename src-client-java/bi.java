/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.GameCanvas;

public final class bi
extends Screen
implements IActionListener {
    private cd a;
    private cd IActionListener;
    private cd c;
    private cd d;
    private cd e;
    private cd f;
    private cd UIPanel;
    private cd h;
    private cd i;
    private static boolean j = false;
    private int k;
    private int ResourceUtil;
    private int m;
    private boolean n = false;
    private boolean o = false;
    private Command GameScreen;
    private Command q;
    private Command r;
    private Command s;
    private Command t;
    private int u;
    private Command v;
    private int w;
    private int x = 130;
    private int Message;
    private int z = -1;
    private boolean A = false;
    private int B = 2;
    private int C = 0;
    private int D = -40;
    private int E = 1;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void IActionListener() {
        System.out.println("Res switch");
        SettingsManager.a();
        this.a.e = true;
        this.b.e = false;
        if (main.GameCanvas.e) {
            this.a.e = false;
        }
        super.IActionListener();
    }

    public bi(byte by2) {
        byte by3 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by3;
        if (by3 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.a(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        this.m = main.GameCanvas.B > 200 ? main.GameCanvas.D - 80 : main.GameCanvas.D - 65;
        bi bi2 = this;
        this.l = -50;
        this.u = main.GameCanvas.D - Screen.cp - 5;
        if (main.GameCanvas.B <= 160) {
            this.u = 20;
        }
        this.i = new cd();
        this.i.c(1);
        this.i.c = 220;
        this.i.d = Screen.cp + 2;
        this.i.i = "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i";
        if (by2 == 1) {
            this.i.a("01234567890");
        }
        this.a = new cd();
        this.a.c = 220;
        this.a.d = Screen.cp + 2;
        this.a.e = true;
        this.a.i = "H\u1ecd v\u00e0 t\u00ean";
        if (by2 == 1) {
            this.a.a("Nguy\u1ec5n V\u0103n A");
        }
        this.a.c(0);
        this.b = new cd();
        this.b.c(1);
        this.b.c = 70;
        this.b.d = Screen.cp + 2;
        this.b.i = "Ng\u00e0y sinh";
        if (by2 == 1) {
            this.b.a("01");
        }
        this.c = new cd();
        this.c.c(1);
        this.c.c = 70;
        this.c.d = Screen.cp + 2;
        this.c.i = "Th\u00e1ng sinh";
        if (by2 == 1) {
            this.c.a("01");
        }
        this.d = new cd();
        this.d.c(1);
        this.d.c = 70;
        this.d.d = Screen.cp + 2;
        this.d.i = "N\u0103m sinh";
        if (by2 == 1) {
            this.d.a("1980");
        }
        this.e = new cd();
        this.e.c(0);
        this.e.c = 220;
        this.e.d = Screen.cp + 2;
        this.e.i = "\u0110\u1ecba ch\u1ec9 \u0111\u0103ng k\u00fd th\u01b0\u1eddng tr\u00fa";
        if (by2 == 1) {
            this.e.a("123 \u0111\u01b0\u1eddng s\u1ed1 1, Qu\u1eadn 1, TP.HCM");
        }
        this.f = new cd();
        this.f.c(1);
        this.f.c = 220;
        this.f.d = Screen.cp + 2;
        this.f.i = "S\u1ed1 Ch\u1ee9ng minh nh\u00e2n d\u00e2n ho\u1eb7c s\u1ed1 h\u1ed9 chi\u1ebfu";
        if (by2 == 1) {
            this.f.a("123456789");
        }
        this.g = new cd();
        this.g.c(0);
        this.g.c = 220;
        this.g.d = Screen.cp + 2;
        this.g.i = "Ng\u00e0y c\u1ea5p";
        if (by2 == 1) {
            this.g.a("01/01/1990");
        }
        this.h = new cd();
        this.h.c(0);
        this.h.c = 220;
        this.h.d = Screen.cp + 2;
        this.h.i = "N\u01a1i c\u1ea5p";
        if (by2 == 1) {
            this.h.a("TP.HCM");
        }
        this.u += 35;
        this.n = true;
        this.k = 0;
        this.GameScreen = new Command(main.GameCanvas.A > 200 ? GameStrings.ax : GameStrings.ay, main.GameCanvas.h, 888393, null);
        new Command(GameStrings.GameService, this, 2001, null);
        this.r = new Command(GameStrings.az, this, 2002, null);
        this.t = new Command(GameStrings.bv, this, 10021, null);
        this.cm = this.s = new Command(GameStrings.bi, this, 2003, null);
        if (main.GameCanvas.e) {
            this.GameScreen.j = main.GameCanvas.A / 2 - 100;
            this.s.j = main.GameCanvas.A / 2 - Screen.cq - 8;
            if (main.GameCanvas.B >= 200) {
                this.GameScreen.k = main.GameCanvas.B / 2 - 40;
                this.s.k = this.x + 110;
            }
            this.t.j = main.GameCanvas.A / 2 + 3;
            this.t.k = this.x + 110;
            this.r.j = main.GameCanvas.A / 2 - 84;
            this.r.k = this.s.k;
        }
        this.Message = 170;
        by2 = (byte)184;
        if (184 >= main.GameCanvas.A) {
            by2 = (byte)152;
        }
        this.w = main.GameCanvas.A / 2 - by2 / 2;
        this.x = 5;
        this.a.a = this.w + 10;
        this.a.IActionListener = this.x + 20;
        this.v = new Command(GameStrings.bs, this, 2008, null);
        this.v.j = 260;
        this.v.k = main.GameCanvas.B - 60;
        this.q = new Command("Tho\u00e1t", this, 1003, null);
        this.q.j = 260;
        this.q.k = main.GameCanvas.B - 30;
        this.v.j = main.GameCanvas.A / 2 - 80;
        this.q.j = main.GameCanvas.A / 2 + 10;
        this.q.k = this.v.k = main.GameCanvas.B - 25;
        this.cn = this.v;
        this.cm = this.q;
    }

    public final void c() {
        this.a.c();
        this.i.c();
        this.b.c();
        this.c.c();
        this.d.c();
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.a();
            ++n2;
        }
        if (++GameScreen.j > main.GameCanvas.A * 3 + 100) {
            GameScreen.j = 100;
        }
        if (ae.m != null) {
            return;
        }
        bi bi2 = this;
        if (bi2.m != bi2.ResourceUtil) {
            bi2.ResourceUtil += bi2.m - bi2.ResourceUtil >> 1;
        }
        if (this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if (this.C <= 0) {
                this.E = -this.E;
            }
            if (this.D > 0) {
                this.E = -this.E;
                this.C -= 2 * this.B;
            }
        }
        if (this.z >= 0 && main.GameCanvas.w % 100 == 0) {
            bi2 = this;
            ++bi2.z;
            if (bi2.z >= GameStrings.aY.length) {
                bi2.z = 0;
            }
            if (main.GameCanvas.K == main.GameCanvas.L && main.GameCanvas.L.a) {
                main.GameCanvas.L.a(GameStrings.aY[bi2.z]);
            }
        }
        if (main.GameCanvas.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.t;
                return;
            }
            this.cn = this.v;
            this.cm = this.q;
            return;
        }
        if (this.o) {
            this.cn = this.r;
            this.cm = this.t;
            return;
        }
        this.cn = this.v;
        this.cm = this.q;
    }

    public final void a(int n2) {
        if (this.a.e) {
            this.a.a(n2);
        } else if (this.b.e) {
            this.b.a(n2);
        }
        super.a(n2);
    }

    public final void a(MGraphics en2) {
        main.GameCanvas.c(en2);
        if (ae.m != null) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (main.GameCanvas.K == null) {
            this.w = main.GameCanvas.C - 120;
            this.x = (main.GameCanvas.B - 110) / 2;
            bo.a(en2, this.w, this.x, 240, 110, -1, true);
            this.a.a = this.w + 10;
            this.a.IActionListener = this.x + 15;
            this.i.a = this.a.a;
            this.i.IActionListener = this.a.IActionListener + 30;
            this.b.a = this.w + 10;
            this.b.IActionListener = this.i.IActionListener + 30;
            this.c.a = this.b.a + 75;
            this.c.IActionListener = this.b.IActionListener;
            this.d.a = this.c.a + 75;
            this.d.IActionListener = this.c.IActionListener;
            mFont.i.a(en2, "C\u1eadp nh\u1eadt th\u00f4ng tin", main.GameCanvas.C, this.x + 2, 2);
            this.a.a(en2);
            this.i.a(en2);
            this.b.a(en2);
            this.c.a(en2);
            this.d.a(en2);
        }
        main.GameCanvas.a(en2);
        String string = "2.4.6";
        en2.a(main.GameCanvas.O);
        en2.d(main.GameCanvas.A - 40, 4, 36, 11);
        mFont.o.a(en2, string, main.GameCanvas.A - 22, 4, 2);
        en2.a(main.GameCanvas.ah, 10, 10, 0);
        super.a(en2);
    }

    public final void d() {
        if (!main.GameCanvas.e) {
            this.co = this.a.e ? this.a.j : this.b.j;
        }
        if (main.GameCanvas.i[2]) {
            --this.k;
            if (this.k < 0) {
                this.k = 1;
            }
        } else if (main.GameCanvas.i[8]) {
            ++this.k;
            if (this.k > 1) {
                this.k = 1;
            }
        }
        if (main.GameCanvas.i[2] || main.GameCanvas.i[8]) {
            main.GameCanvas.f();
            if (this.k == 1) {
                this.a.e = false;
                this.b.e = true;
            } else if (this.k == 0) {
                this.a.e = true;
                this.b.e = false;
            } else {
                this.a.e = false;
                this.b.e = false;
            }
        }
        if (main.GameCanvas.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.t;
            } else {
                this.cn = this.v;
                this.cm = this.q;
            }
        } else if (this.o) {
            this.cn = this.r;
            this.cm = this.t;
        } else {
            this.cn = this.v;
            this.cm = this.q;
        }
        if (main.GameCanvas.m) {
            if (main.GameCanvas.a(this.a.a, this.a.IActionListener, this.a.c, this.a.d)) {
                this.k = 0;
            } else if (main.GameCanvas.a(this.b.a, this.b.IActionListener, this.b.c, this.b.d)) {
                this.k = 1;
            }
        }
        super.d();
        main.GameCanvas.f();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                try {
                    GameMidlet.f.platformRequest((String)object);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                main.GameCanvas.h();
                return;
            }
            case 1001: {
                main.GameCanvas.h();
                this.o = false;
                return;
            }
            case 1002: {
                return;
            }
            case 1004: {
                bs.a();
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 10021: {
                bi bi2 = this;
                this.o = false;
                bi2.IActionListener.e = false;
                bi2.GameCanvas.e = true;
                bi2.cm = bi2.s;
                return;
            }
            case 1003: {
                main.GameCanvas.ak.IActionListener();
                NetworkService.a().e();
                return;
            }
            case 1005: {
                try {
                    GameMidlet.f.platformRequest("http://ngocrongonline.com");
                    return;
                }
                catch (Exception exception) {
                    Exception exception3 = exception;
                    exception.printStackTrace();
                    return;
                }
            }
            case 10041: {
                return;
            }
            case 10042: {
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.n) {
                    this.n = false;
                    return;
                }
                this.n = true;
                return;
            }
            case 2002: {
                boolean bl2;
                bi bi3 = this;
                if (bi3.GameCanvas.d().equals("")) {
                    main.GameCanvas.a(GameStrings.U);
                    break;
                }
                bi3.GameCanvas.d().toCharArray();
                if (bi3.IActionListener.d().equals("")) {
                    main.GameCanvas.a(GameStrings.V);
                    break;
                }
                if (bi3.GameCanvas.d().length() < 5) {
                    main.GameCanvas.a(GameStrings.W);
                    break;
                }
                object = null;
                if (GameStrings.fB == 2) {
                    if (bi3.GameCanvas.d().indexOf("@") == -1 || bi3.GameCanvas.d().indexOf(".") == -1) {
                        object = GameStrings.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(bi3.GameCanvas.d());
                        if (bi3.GameCanvas.d().length() < 8 || bi3.GameCanvas.d().length() > 12 || !bi3.GameCanvas.d().startsWith("0") && !bi3.GameCanvas.d().startsWith("84")) {
                            object = GameStrings.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (bi3.GameCanvas.d().indexOf("@") == -1 || bi3.GameCanvas.d().indexOf(".") == -1) {
                            object = GameStrings.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.GameCanvas.a((String)object);
                } else {
                    main.GameCanvas.L.a(String.valueOf(GameStrings.ai) + (bl2 ? String.valueOf(GameStrings.aj) + ": " : String.valueOf(GameStrings.ak) + ": ") + bi3.GameCanvas.d() + "\n" + GameStrings.ad + ": " + bi3.IActionListener.d(), new Command(GameStrings.SettingsManager, bi3, 4000, null), null, new Command(GameStrings.bo, main.GameCanvas.h, 8882, null));
                }
                main.GameCanvas.K = main.GameCanvas.L;
                return;
            }
            case 2003: {
                bi bi4 = this;
                object = new LoggingList("vMenu Login");
                ((LoggingList)object).addElement(new Command(GameStrings.Z, bi4, 2004, null));
                ((LoggingList)object).addElement(new Command(GameStrings.aa, bi4, 1004, null));
                ((LoggingList)object).addElement(new Command(GameStrings.MessageHandler, bi4, 1003, null));
                ((LoggingList)object).addElement(new Command(GameStrings.aI, bi4, 1005, null));
                int n3 = RMSManager.d("lowGraphic");
                if (n3 == 1) {
                    ((LoggingList)object).addElement(new Command(GameStrings.bV, bi4, 10041, null));
                } else {
                    ((LoggingList)object).addElement(new Command(GameStrings.bW, bi4, 10042, null));
                }
                ((LoggingList)object).addElement(new Command(GameStrings.bp, main.GameCanvas.h, 8885, null));
                main.GameCanvas.F.a((LoggingList)object);
                return;
            }
            case 2004: {
                bi bi5 = this;
                main.GameCanvas.h();
                main.GameCanvas.a(GameStrings.fW);
                bi5.o = true;
                bi5.IActionListener.e = false;
                bi5.GameCanvas.e = true;
                return;
            }
            case 2008: {
                if (this.b.d().equals("") || this.c.d().equals("") || this.d.d().equals("") || this.i.d().equals("") || this.a.d().equals("")) {
                    main.GameCanvas.a("Vui ResourceUtil\u00f2ng \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin");
                    return;
                }
                main.GameCanvas.a(GameStrings.aC);
                GameService.a().a(this.b.d(), this.c.d(), this.d.d(), "", "", "", "", this.i.d(), this.a.d());
            }
        }
    }
}

