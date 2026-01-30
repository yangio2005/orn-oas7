/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class LoginScreen
extends Screen
implements IActionListener {
    public cd a;
    public cd IActionListener;
    public static boolean c = false;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private boolean s = false;
    private boolean t = false;
    private Command u;
    private Command v;
    private Command w;
    private Command x;
    private Command Message;
    private Command z;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean UIPanel;
    public static boolean h;
    public static String i;
    public static Image j;
    public static short k;
    public static long ResourceUtil;
    public static long m;
    private int A;
    private Command B;
    private int C;
    private int D = main.GameCanvas.D - 30;
    private int E;
    private int F = -1;
    public boolean n = false;
    private int G = 2;
    private int H = 0;
    private int I = -40;
    private int J = 1;
    private Command K;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void IActionListener() {
        SettingsManager.a();
        this.a.e = true;
        this.b.e = false;
        if (main.GameCanvas.e) {
            this.a.e = false;
        }
        main.GameCanvas.a(0);
        this.cm = new Command(GameStrings.bA, this, 101, null);
        super.IActionListener();
    }

    public LoginScreen() {
        int n2;
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.a(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        this.r = main.GameCanvas.B > 200 ? main.GameCanvas.D - 80 : main.GameCanvas.D - 65;
        x x2 = this;
        this.q = -50;
        this.GameScreen = n2 = main.GameCanvas.A >= 200 ? 160 : 140;
        this.A = main.GameCanvas.D - Screen.cp - 5;
        if (main.GameCanvas.B <= 160) {
            this.A = 20;
        }
        this.a = new cd();
        this.a.IActionListener = main.GameCanvas.D - Screen.cp - 9;
        this.a.c = this.GameScreen;
        this.a.d = Screen.cp + 2;
        this.a.e = true;
        this.a.c(0);
        this.a.i = String.valueOf(GameStrings.fB == 2 ? "" : String.valueOf(GameStrings.aj) + "/") + GameStrings.ak;
        this.b = new cd();
        this.b.IActionListener = main.GameCanvas.D - 4;
        this.b.c(2);
        this.b.c = this.GameScreen;
        this.b.d = Screen.cp + 2;
        this.A += 35;
        this.s = true;
        n2 = RMSManager.d("check");
        if (n2 == 1) {
            this.s = true;
        } else if (n2 == 2) {
            this.s = false;
        }
        this.a.a(RMSManager.c("acc"));
        this.b.a(RMSManager.c("pass"));
        this.a.a((String)null);
        this.b.a((String)null);
        if (this.K == null) {
            this.K = new Command("G\u1ecdi hotline", this, 13, null);
            this.K.j = main.GameCanvas.A - 75;
            this.K.k = ResourceUtil.c == 1 && !main.GameCanvas.e ? main.GameCanvas.B - 20 : 8;
        }
        this.o = 0;
        this.u = new Command(main.GameCanvas.A > 200 ? GameStrings.ax : GameStrings.ay, main.GameCanvas.h, 888393, null);
        new Command(GameStrings.GameService, this, 2001, null);
        this.w = new Command(GameStrings.az, this, 2002, null);
        this.Message = new Command(GameStrings.bv, this, 10021, null);
        this.z = new Command(GameStrings.bA, this, 101, null);
        this.cm = this.x = new Command(GameStrings.bi, this, 2003, null);
        if (main.GameCanvas.e) {
            this.u.j = main.GameCanvas.A / 2 + 8;
            this.x.j = main.GameCanvas.A / 2 - Screen.cq - 8;
            if (main.GameCanvas.B >= 200) {
                this.u.k = this.D + 110;
                this.x.k = this.D + 110;
            }
            this.Message.j = main.GameCanvas.A / 2 + 3;
            this.Message.k = this.D + 110;
            this.w.j = main.GameCanvas.A / 2 - 84;
            this.w.k = this.x.k;
            this.z.j = 2;
            this.z.k = main.GameCanvas.B - Screen.cr;
        }
        this.E = 170;
        n2 = 184;
        if (184 >= main.GameCanvas.A) {
            n2 = 152;
        }
        this.C = main.GameCanvas.A / 2 - n2 / 2;
        this.D = main.GameCanvas.D - 30;
        this.a.a = this.C + 10;
        this.a.IActionListener = this.D + 20;
        this.B = new Command(GameStrings.bs, this, 2008, null);
        this.B.j = main.GameCanvas.A / 2 - 84;
        this.B.k = this.u.k;
        this.v = new Command(GameStrings.MessageHandler, this, 1003, null);
        this.v.j = main.GameCanvas.A / 2 + 3;
        this.v.k = this.u.k;
        this.cn = this.B;
        this.cm = this.v;
    }

    public final void a() {
        MathUtil.c("user ao= " + RMSManager.c("userAo" + bs.n));
        String string = RMSManager.c("acc");
        String string2 = RMSManager.c("pass");
        this.n = (string == null || string.equals("")) && RMSManager.c("userAo" + bs.n) != null && !RMSManager.c("userAo" + bs.n).equals("");
        MathUtil.c("isLogin 2= " + this.n);
        if ((string == null || string.equals("")) && this.n) {
            string = RMSManager.c("userAo" + bs.n);
            string2 = "a";
        }
        MathUtil.c("user = " + string + " pass= " + string2);
        if (string == null || string2 == null || string.equals("")) {
            return;
        }
        if (string2.equals("")) {
            this.o = 1;
            this.a.e = false;
            this.b.e = true;
            if (!main.GameCanvas.e) {
                this.co = this.b.j;
            }
            return;
        }
        if (!NetworkService.a().d()) {
            main.GameCanvas.IActionListener();
        }
        GameService.a().a(string, string2, "2.4.6", this.n ? (byte)1 : 0);
        RMSManager.a(bs.w, bs.n);
        if (NetworkService.a().d) {
            main.GameCanvas.i();
        } else {
            main.GameCanvas.a(String.valueOf(GameStrings.x) + " [0]", 8884, null);
        }
        this.o = 0;
        if (!this.n) {
            this.h();
        }
        ResourceUtil.d();
    }

    public final void e() {
        if (this.s) {
            RMSManager.a("check", 1);
            RMSManager.a("acc", this.a.d().toLowerCase().trim());
            RMSManager.a("pass", this.b.d().toLowerCase().trim());
            return;
        }
        RMSManager.a("check", 2);
        RMSManager.a("acc", "");
        RMSManager.a("pass", "");
    }

    public final void c() {
        if (k > 0) {
            main.GameCanvas.i();
            m = System.currentTimeMillis();
            if (m - ResourceUtil >= 1000L) {
                if ((k = (short)(k - 1)) == 0) {
                    main.GameCanvas.I.a();
                }
                ResourceUtil = m;
            }
        }
        if (this.n && !this.t) {
            this.a.i = String.valueOf(GameStrings.fB == 2 ? "" : String.valueOf(GameStrings.aj) + "/") + GameStrings.ak;
            this.b.i = GameStrings.ad;
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
        } else {
            this.a.i = String.valueOf(GameStrings.fB == 2 ? "" : String.valueOf(GameStrings.aj) + "/") + GameStrings.ak;
            this.b.i = GameStrings.ad;
            this.a.c();
            this.b.c();
        }
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.a();
            ++n2;
        }
        if (!(!d || e || h || f || UIPanel)) {
            d = false;
            System.gc();
            GameService.a().r();
        }
        if (++GameScreen.j > main.GameCanvas.A * 3 + 100) {
            GameScreen.j = 100;
        }
        if (ae.m != null) {
            return;
        }
        x x2 = this;
        if (x2.r != x2.q) {
            x2.q += x2.r - x2.q >> 1;
        }
        if (this.H >= 0) {
            this.I += this.J * this.H;
            this.H += this.J * this.G;
            if (this.H <= 0) {
                this.J = -this.J;
            }
            if (this.I > 0) {
                this.J = -this.J;
                this.H -= 2 * this.G;
            }
        }
        if (this.F >= 0 && main.GameCanvas.w % 100 == 0) {
            x2 = this;
            ++x2.F;
            if (x2.F >= GameStrings.aY.length) {
                x2.F = 0;
            }
            if (main.GameCanvas.K == main.GameCanvas.L && main.GameCanvas.L.a) {
                main.GameCanvas.L.a(GameStrings.aY[x2.F]);
            }
        }
        if (this.n && !this.t) {
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
        } else {
            this.a.i = String.valueOf(GameStrings.fB == 2 ? "" : String.valueOf(GameStrings.aj) + "/") + GameStrings.ak;
            this.b.i = GameStrings.ad;
            this.a.c();
            this.b.c();
        }
        if (main.GameCanvas.e) {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.Message;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
            if (this.z != null && this.z.c()) {
                this.z.a();
                return;
            }
        } else {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.Message;
                return;
            }
            this.cn = this.B;
            this.cm = this.v;
        }
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
        int n2 = this.a.IActionListener - 50;
        if (main.GameCanvas.B <= 220) {
            n2 += 5;
        }
        mFont.s.a(en2, "v2.4.6", main.GameCanvas.A - 2, 17, 1, mFont.o);
        if (ResourceUtil.c == 1 && !main.GameCanvas.e) {
            mFont.s.a(en2, bs.ResourceUtil, main.GameCanvas.A - 2, main.GameCanvas.B - 15, 1, mFont.o);
        } else {
            mFont.s.a(en2, bs.ResourceUtil, main.GameCanvas.A - 2, 2, 1, mFont.o);
        }
        if (main.GameCanvas.K == null) {
            int n3 = main.GameCanvas.A >= 200 ? 180 : 160;
            bo.a(en2, this.C, this.D - 10, n3, 105, -1, true);
            if (main.GameCanvas.B > 160 && j != null) {
                en2.a(j, main.GameCanvas.C, n2, 3);
            }
            n2 = 184;
            if (184 >= main.GameCanvas.A) {
                n2 = 152;
            }
            this.C = main.GameCanvas.A / 2 - n2 / 2;
            this.a.a = this.C + 10;
            this.a.IActionListener = this.D + 20;
            this.b.a = this.C + 10;
            this.b.IActionListener = this.D + 55;
            this.a.a(en2);
            this.b.a(en2);
            if (main.GameCanvas.A < 176) {
                mFont.UIPanel.a(en2, String.valueOf(GameStrings.al) + ":", this.a.a - 35, this.a.IActionListener + 7, 0);
                mFont.UIPanel.a(en2, String.valueOf(GameStrings.am) + ":", this.b.a - 35, this.b.IActionListener + 7, 0);
                mFont.UIPanel.a(en2, String.valueOf(GameStrings.aJ) + ": " + i, main.GameCanvas.A / 2, this.b.IActionListener + 32, 2);
            }
        }
        super.a(en2);
        this.z.a(en2);
    }

    public final void d() {
        if (main.GameCanvas.e && this.K != null && this.K.c()) {
            this.K.a();
        }
        if (c) {
            return;
        }
        if (!main.GameCanvas.e) {
            this.co = this.a.e ? this.a.j : this.b.j;
        }
        if (main.GameCanvas.i[2]) {
            --this.o;
            if (this.o < 0) {
                this.o = 1;
            }
        } else if (main.GameCanvas.i[8]) {
            ++this.o;
            if (this.o > 1) {
                this.o = 1;
            }
        }
        if (main.GameCanvas.i[2] || main.GameCanvas.i[8]) {
            main.GameCanvas.f();
            if (!this.n || this.t) {
                if (this.o == 1) {
                    this.a.e = false;
                    this.b.e = true;
                } else if (this.o == 0) {
                    this.a.e = true;
                    this.b.e = false;
                } else {
                    this.a.e = false;
                    this.b.e = false;
                }
            }
        }
        if (main.GameCanvas.e) {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.Message;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
        } else if (this.t) {
            this.cn = this.w;
            this.cm = this.Message;
        } else {
            this.cn = this.B;
            this.cm = this.v;
        }
        if (main.GameCanvas.m && (!this.n || this.t)) {
            if (main.GameCanvas.a(this.a.a, this.a.IActionListener, this.a.c, this.a.d)) {
                this.o = 0;
            } else if (main.GameCanvas.a(this.b.a, this.b.IActionListener, this.b.c, this.b.d)) {
                this.o = 1;
            }
        }
        super.d();
        main.GameCanvas.f();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 101: {
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 13: {
                switch (ResourceUtil.c) {
                    case 1: {
                        ResourceUtil.IActionListener();
                        return;
                    }
                    case 3: 
                    case 5: {
                        return;
                    }
                    case 6: {
                        return;
                    }
                }
                return;
            }
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
                this.t = false;
                return;
            }
            case 1002: {
                main.GameCanvas.i();
                String string = RMSManager.c("userAo" + bs.n);
                if (string == null || string.equals("")) {
                    GameService.a().f("");
                    return;
                }
                main.GameCanvas.I.n = true;
                main.GameCanvas.IActionListener();
                GameService.a().c();
                GameService.a().a(string, "", "2.4.6", (byte)1);
                return;
            }
            case 1004: {
                bs.a();
                main.GameCanvas.ak.IActionListener();
                return;
            }
            case 10021: {
                this.h();
                return;
            }
            case 1003: {
                main.GameCanvas.a(GameStrings.an);
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
                RMSManager.a("lowGraphic", 0);
                main.GameCanvas.a(GameStrings.cM, 8885, null);
                return;
            }
            case 10042: {
                RMSManager.a("lowGraphic", 1);
                main.GameCanvas.a(GameStrings.cM, 8885, null);
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.s) {
                    this.s = false;
                    return;
                }
                this.s = true;
                return;
            }
            case 2002: {
                boolean bl2;
                x x2 = this;
                if (x2.GameCanvas.d().equals("")) {
                    main.GameCanvas.a(GameStrings.U);
                    break;
                }
                x2.GameCanvas.d().toCharArray();
                if (x2.IActionListener.d().equals("")) {
                    main.GameCanvas.a(GameStrings.V);
                    break;
                }
                if (x2.GameCanvas.d().length() < 5) {
                    main.GameCanvas.a(GameStrings.W);
                    break;
                }
                object = null;
                if (GameStrings.fB == 2) {
                    if (x2.GameCanvas.d().indexOf("@") == -1 || x2.GameCanvas.d().indexOf(".") == -1) {
                        object = GameStrings.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(x2.GameCanvas.d());
                        if (x2.GameCanvas.d().length() < 8 || x2.GameCanvas.d().length() > 12 || !x2.GameCanvas.d().startsWith("0") && !x2.GameCanvas.d().startsWith("84")) {
                            object = GameStrings.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (x2.GameCanvas.d().indexOf("@") == -1 || x2.GameCanvas.d().indexOf(".") == -1) {
                            object = GameStrings.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.GameCanvas.a((String)object);
                } else {
                    main.GameCanvas.L.a(String.valueOf(GameStrings.ai) + (bl2 ? String.valueOf(GameStrings.aj) + ": " : String.valueOf(GameStrings.ak) + ": ") + x2.GameCanvas.d() + "\n" + GameStrings.ad + ": " + x2.IActionListener.d(), new Command(GameStrings.SettingsManager, x2, 4000, null), null, new Command(GameStrings.bo, main.GameCanvas.h, 8882, null));
                }
                main.GameCanvas.K = main.GameCanvas.L;
                return;
            }
            case 2003: {
                x x3 = this;
                object = new LoggingList("vMenu Login");
                ((LoggingList)object).addElement(new Command(GameStrings.Z, x3, 2004, null));
                if (!x3.n) {
                    ((LoggingList)object).addElement(new Command(GameStrings.aa, x3, 1004, null));
                }
                ((LoggingList)object).addElement(new Command(GameStrings.MessageHandler, x3, 1003, null));
                ((LoggingList)object).addElement(new Command(GameStrings.aI, x3, 1005, null));
                int n3 = RMSManager.d("lowGraphic");
                if (n3 == 1) {
                    ((LoggingList)object).addElement(new Command(GameStrings.bV, x3, 10041, null));
                } else {
                    ((LoggingList)object).addElement(new Command(GameStrings.bW, x3, 10042, null));
                }
                ((LoggingList)object).addElement(new Command(GameStrings.bp, main.GameCanvas.h, 8885, null));
                main.GameCanvas.F.a((LoggingList)object);
                return;
            }
            case 2004: {
                this.f();
                return;
            }
            case 2008: {
                RMSManager.a("acc", this.a.d().trim());
                RMSManager.a("pass", this.b.d().trim());
                if (bs.u) {
                    main.GameCanvas.ak.IActionListener();
                    return;
                }
                main.GameCanvas.ak.j();
                return;
            }
            case 4000: {
                object = this.a.d();
                x x4 = this;
                main.GameCanvas.IActionListener(GameStrings.aD);
                main.GameCanvas.IActionListener();
                main.GameCanvas.IActionListener(GameStrings.J);
                GameService bt2 = GameService.a();
                String string = x4.IActionListener.d();
                String string2 = RMSManager.c("userAo" + bs.n);
                RMSManager.c("passAo");
                bt2.a((String)object, string, string2, "2.4.6");
                RMSManager.a("acc", (String)object);
                RMSManager.a("pass", x4.IActionListener.d());
            }
        }
    }

    private void h() {
        if (this.n) {
            this.a();
            return;
        }
        this.t = false;
        this.b.e = false;
        this.a.e = true;
        this.cm = this.x;
    }

    public final void f() {
        main.GameCanvas.h();
        main.GameCanvas.a(GameStrings.fW);
        this.t = true;
        this.b.e = false;
        this.a.e = true;
    }

    public static void UIPanel() {
        ResourceUtil.d();
        if (main.GameCanvas.I.n) {
            main.GameCanvas.a(GameStrings.fV, new Command(GameStrings.bn, main.GameCanvas.G, 10019, null), new Command(GameStrings.bo, main.GameCanvas.G, 10020, null));
            return;
        }
        eu.IActionListener = false;
        main.GameCanvas.e();
    }
}

