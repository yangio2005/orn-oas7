/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameMidlet;
import main.GameCanvas;
public final class x
extends Screen
implements b {
    public cd LoginScreen;
    public cd b;
    public static boolean c = false;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private boolean SessionReceiver = false;
    private boolean MyHashtable = false;
    private de u;
    private de v;
    private de w;
    private de x;
    private de Message;
    private de z;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean Item;
    public static String i;
    public static Image j;
    public static short k;
    public static long Res;
    public static long m;
    private int A;
    private de B;
    private int C;
    private int D = GameCanvas.D - 30;
    private int E;
    private int F = -1;
    public boolean n = false;
    private int G = 2;
    private int H = 0;
    private int I = -40;
    private int J = 1;
    private de K;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void b() {
        bu.LoginScreen();
        this.LoginScreen.e = true;
        this.b.e = false;
        if (GameCanvas.e) {
            this.LoginScreen.e = false;
        }
        GameCanvas.isLowGraphic(0);
        this.cm = new de(T.bA, this, 101, null);
        super.b();
    }

    public x() {
        int n2;
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.LoginScreen(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        this.r = GameCanvas.B > 200 ? GameCanvas.D - 80 : GameCanvas.D - 65;
        x x2 = this;
        this.q = -50;
        this.GameScreen = n2 = GameCanvas.A >= 200 ? 160 : 140;
        this.A = GameCanvas.D - Screen.cp - 5;
        if (GameCanvas.B <= 160) {
            this.A = 20;
        }
        this.LoginScreen = new cd();
        this.LoginScreen.b = GameCanvas.D - Screen.cp - 9;
        this.LoginScreen.c = this.GameScreen;
        this.LoginScreen.d = Screen.cp + 2;
        this.LoginScreen.e = true;
        this.LoginScreen.c(0);
        this.LoginScreen.i = String.valueOf(T.fB == 2 ? "" : String.valueOf(T.aj) + "/") + T.ak;
        this.b = new cd();
        this.b.b = GameCanvas.D - 4;
        this.b.c(2);
        this.b.c = this.GameScreen;
        this.b.d = Screen.cp + 2;
        this.A += 35;
        this.SessionReceiver = true;
        n2 = RMS.d("check");
        if (n2 == 1) {
            this.SessionReceiver = true;
        } else if (n2 == 2) {
            this.SessionReceiver = false;
        }
        this.LoginScreen.LoginScreen(RMS.c("acc"));
        this.b.LoginScreen(RMS.c("pass"));
        this.LoginScreen.LoginScreen((String)null);
        this.b.LoginScreen((String)null);
        if (this.K == null) {
            this.K = new de("G\u1ecdi hotline", this, 13, null);
            this.K.j = GameCanvas.A - 75;
            this.K.k = Res.clientType == 1 && !GameCanvas.e ? GameCanvas.B - 20 : 8;
        }
        this.o = 0;
        this.u = new de(GameCanvas.A > 200 ? T.ax : T.ay, GameCanvas.instance, 888393, null);
        new de(T.GameService, this, 2001, null);
        this.w = new de(T.az, this, 2002, null);
        this.Message = new de(T.bv, this, 10021, null);
        this.z = new de(T.bA, this, 101, null);
        this.cm = this.x = new de(T.bi, this, 2003, null);
        if (GameCanvas.e) {
            this.u.j = GameCanvas.A / 2 + 8;
            this.x.j = GameCanvas.A / 2 - Screen.cq - 8;
            if (GameCanvas.B >= 200) {
                this.u.k = this.D + 110;
                this.x.k = this.D + 110;
            }
            this.Message.j = GameCanvas.A / 2 + 3;
            this.Message.k = this.D + 110;
            this.w.j = GameCanvas.A / 2 - 84;
            this.w.k = this.x.k;
            this.z.j = 2;
            this.z.k = GameCanvas.B - Screen.cr;
        }
        this.E = 170;
        n2 = 184;
        if (184 >= GameCanvas.A) {
            n2 = 152;
        }
        this.C = GameCanvas.A / 2 - n2 / 2;
        this.D = GameCanvas.D - 30;
        this.LoginScreen.LoginScreen = this.C + 10;
        this.LoginScreen.b = this.D + 20;
        this.B = new de(T.ServerListScreen, this, 2008, null);
        this.B.j = GameCanvas.A / 2 - 84;
        this.B.k = this.u.k;
        this.v = new de(T.MessageHandler, this, 1003, null);
        this.v.j = GameCanvas.A / 2 + 3;
        this.v.k = this.u.k;
        this.cn = this.B;
        this.cm = this.v;
    }

    public final void methodLoginScreen() {
        ds.c("user ao= " + RMS.c("userAo" + ServerListScreen.n));
        String string = RMS.c("acc");
        String string2 = RMS.c("pass");
        this.n = (string == null || string.equals("")) && RMS.c("userAo" + ServerListScreen.n) != null && !RMS.c("userAo" + ServerListScreen.n).equals("");
        ds.c("isLogin 2= " + this.n);
        if ((string == null || string.equals("")) && this.n) {
            string = RMS.c("userAo" + ServerListScreen.n);
            string2 = "LoginScreen";
        }
        ds.c("user = " + string + " pass= " + string2);
        if (string == null || string2 == null || string.equals("")) {
            return;
        }
        if (string2.equals("")) {
            this.o = 1;
            this.LoginScreen.e = false;
            this.b.e = true;
            if (!GameCanvas.e) {
                this.co = this.b.j;
            }
            return;
        }
        if (!Session.LoginScreen().d()) {
            GameCanvas.b();
        }
        GameService.LoginScreen().LoginScreen(string, string2, Config.VERSION, this.n ? (byte)1 : 0);
        RMS.LoginScreen(ServerListScreen.w, ServerListScreen.n);
        if (Session.LoginScreen().d) {
            GameCanvas.i();
        } else {
            GameCanvas.isLowGraphic(String.valueOf(T.x) + " [0]", 8884, null);
        }
        this.o = 0;
        if (!this.n) {
            this.Item();
        }
        Res.currentTimeMillis();
    }

    public final void e() {
        if (this.SessionReceiver) {
            RMS.LoginScreen("check", 1);
            RMS.LoginScreen("acc", this.LoginScreen.d().toLowerCase().trim());
            RMS.LoginScreen("pass", this.b.d().toLowerCase().trim());
            return;
        }
        RMS.LoginScreen("check", 2);
        RMS.LoginScreen("acc", "");
        RMS.LoginScreen("pass", "");
    }

    public final void c() {
        if (k > 0) {
            GameCanvas.i();
            m = System.currentTimeMillis();
            if (m - Res >= 1000L) {
                if ((k = (short)(k - 1)) == 0) {
                    GameCanvas.I.LoginScreen();
                }
                Res = m;
            }
        }
        if (this.n && !this.MyHashtable) {
            this.LoginScreen.i = String.valueOf(T.fB == 2 ? "" : String.valueOf(T.aj) + "/") + T.ak;
            this.b.i = T.ad;
            this.LoginScreen.k = false;
            this.b.k = false;
            this.LoginScreen.c();
            this.b.c();
        } else {
            this.LoginScreen.i = String.valueOf(T.fB == 2 ? "" : String.valueOf(T.aj) + "/") + T.ak;
            this.b.i = T.ad;
            this.LoginScreen.c();
            this.b.c();
        }
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.LoginScreen();
            ++n2;
        }
        if (!(!d || e || Item || f || g)) {
            d = false;
            System.gc();
            GameService.LoginScreen().r();
        }
        if (++GameScreen.j > GameCanvas.A * 3 + 100) {
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
        if (this.F >= 0 && GameCanvas.w % 100 == 0) {
            x2 = this;
            ++x2.F;
            if (x2.F >= T.aY.length) {
                x2.F = 0;
            }
            if (GameCanvas.K == GameCanvas.L && GameCanvas.L.LoginScreen) {
                GameCanvas.L.LoginScreen(T.aY[x2.F]);
            }
        }
        if (this.n && !this.MyHashtable) {
            this.LoginScreen.k = false;
            this.b.k = false;
            this.LoginScreen.c();
            this.b.c();
        } else {
            this.LoginScreen.i = String.valueOf(T.fB == 2 ? "" : String.valueOf(T.aj) + "/") + T.ak;
            this.b.i = T.ad;
            this.LoginScreen.c();
            this.b.c();
        }
        if (GameCanvas.e) {
            if (this.MyHashtable) {
                this.cn = this.w;
                this.cm = this.Message;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
            if (this.z != null && this.z.c()) {
                this.z.LoginScreen();
                return;
            }
        } else {
            if (this.MyHashtable) {
                this.cn = this.w;
                this.cm = this.Message;
                return;
            }
            this.cn = this.B;
            this.cm = this.v;
        }
    }

    public final void methodLoginScreen(int n2) {
        if (this.LoginScreen.e) {
            this.LoginScreen.LoginScreen(n2);
        } else if (this.b.e) {
            this.b.LoginScreen(n2);
        }
        super.LoginScreen(n2);
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameCanvas.c(en2);
        int n2 = this.LoginScreen.b - 50;
        if (GameCanvas.B <= 220) {
            n2 += 5;
        }
        mFont.SessionReceiver.LoginScreen(en2, "v2.4.6", GameCanvas.A - 2, 17, 1, mFont.o);
        if (Res.clientType == 1 && !GameCanvas.e) {
            mFont.SessionReceiver.LoginScreen(en2, ServerListScreen.Res, GameCanvas.A - 2, GameCanvas.B - 15, 1, mFont.o);
        } else {
            mFont.SessionReceiver.LoginScreen(en2, ServerListScreen.Res, GameCanvas.A - 2, 2, 1, mFont.o);
        }
        if (GameCanvas.K == null) {
            int n3 = GameCanvas.A >= 200 ? 180 : 160;
            bo.LoginScreen(en2, this.C, this.D - 10, n3, 105, -1, true);
            if (GameCanvas.B > 160 && j != null) {
                en2.LoginScreen(j, GameCanvas.C, n2, 3);
            }
            n2 = 184;
            if (184 >= GameCanvas.A) {
                n2 = 152;
            }
            this.C = GameCanvas.A / 2 - n2 / 2;
            this.LoginScreen.LoginScreen = this.C + 10;
            this.LoginScreen.b = this.D + 20;
            this.b.LoginScreen = this.C + 10;
            this.b.b = this.D + 55;
            this.LoginScreen.LoginScreen(en2);
            this.b.LoginScreen(en2);
            if (GameCanvas.A < 176) {
                mFont.g.LoginScreen(en2, String.valueOf(T.al) + ":", this.LoginScreen.LoginScreen - 35, this.LoginScreen.b + 7, 0);
                mFont.g.LoginScreen(en2, String.valueOf(T.am) + ":", this.b.LoginScreen - 35, this.b.b + 7, 0);
                mFont.g.LoginScreen(en2, String.valueOf(T.aJ) + ": " + i, GameCanvas.A / 2, this.b.b + 32, 2);
            }
        }
        super.LoginScreen(en2);
        this.z.LoginScreen(en2);
    }

    public final void d() {
        if (GameCanvas.e && this.K != null && this.K.c()) {
            this.K.LoginScreen();
        }
        if (c) {
            return;
        }
        if (!GameCanvas.e) {
            this.co = this.LoginScreen.e ? this.LoginScreen.j : this.b.j;
        }
        if (GameCanvas.i[2]) {
            --this.o;
            if (this.o < 0) {
                this.o = 1;
            }
        } else if (GameCanvas.i[8]) {
            ++this.o;
            if (this.o > 1) {
                this.o = 1;
            }
        }
        if (GameCanvas.i[2] || GameCanvas.i[8]) {
            GameCanvas.clearKeyHold();
            if (!this.n || this.MyHashtable) {
                if (this.o == 1) {
                    this.LoginScreen.e = false;
                    this.b.e = true;
                } else if (this.o == 0) {
                    this.LoginScreen.e = true;
                    this.b.e = false;
                } else {
                    this.LoginScreen.e = false;
                    this.b.e = false;
                }
            }
        }
        if (GameCanvas.e) {
            if (this.MyHashtable) {
                this.cn = this.w;
                this.cm = this.Message;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
        } else if (this.MyHashtable) {
            this.cn = this.w;
            this.cm = this.Message;
        } else {
            this.cn = this.B;
            this.cm = this.v;
        }
        if (GameCanvas.m && (!this.n || this.MyHashtable)) {
            if (GameCanvas.isLowGraphic(this.LoginScreen.LoginScreen, this.LoginScreen.b, this.LoginScreen.c, this.LoginScreen.d)) {
                this.o = 0;
            } else if (GameCanvas.isLowGraphic(this.b.LoginScreen, this.b.b, this.b.c, this.b.d)) {
                this.o = 1;
            }
        }
        super.d();
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 101: {
                GameCanvas.ak.b();
                return;
            }
            case 13: {
                switch (Res.clientType) {
                    case 1: {
                        Res.loadImage();
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
                GameCanvas.instance();
                return;
            }
            case 1001: {
                GameCanvas.instance();
                this.MyHashtable = false;
                return;
            }
            case 1002: {
                GameCanvas.i();
                String string = RMS.c("userAo" + ServerListScreen.n);
                if (string == null || string.equals("")) {
                    GameService.LoginScreen().f("");
                    return;
                }
                GameCanvas.I.n = true;
                GameCanvas.b();
                GameService.LoginScreen().c();
                GameService.LoginScreen().LoginScreen(string, "", Config.VERSION, (byte)1);
                return;
            }
            case 1004: {
                ServerListScreen.LoginScreen();
                GameCanvas.ak.b();
                return;
            }
            case 10021: {
                this.Item();
                return;
            }
            case 1003: {
                GameCanvas.isLowGraphic(T.an);
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
                RMS.LoginScreen("lowGraphic", 0);
                GameCanvas.isLowGraphic(T.cM, 8885, null);
                return;
            }
            case 10042: {
                RMS.LoginScreen("lowGraphic", 1);
                GameCanvas.isLowGraphic(T.cM, 8885, null);
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.SessionReceiver) {
                    this.SessionReceiver = false;
                    return;
                }
                this.SessionReceiver = true;
                return;
            }
            case 2002: {
                boolean bl2;
                x x2 = this;
                if (x2.LoginScreen.d().equals("")) {
                    GameCanvas.isLowGraphic(T.U);
                    break;
                }
                x2.LoginScreen.d().toCharArray();
                if (x2.b.d().equals("")) {
                    GameCanvas.isLowGraphic(T.V);
                    break;
                }
                if (x2.LoginScreen.d().length() < 5) {
                    GameCanvas.isLowGraphic(T.W);
                    break;
                }
                object = null;
                if (T.fB == 2) {
                    if (x2.LoginScreen.d().indexOf("@") == -1 || x2.LoginScreen.d().indexOf(".") == -1) {
                        object = T.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(x2.LoginScreen.d());
                        if (x2.LoginScreen.d().length() < 8 || x2.LoginScreen.d().length() > 12 || !x2.LoginScreen.d().startsWith("0") && !x2.LoginScreen.d().startsWith("84")) {
                            object = T.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (x2.LoginScreen.d().indexOf("@") == -1 || x2.LoginScreen.d().indexOf(".") == -1) {
                            object = T.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    GameCanvas.isLowGraphic((String)object);
                } else {
                    GameCanvas.L.LoginScreen(String.valueOf(T.ai) + (bl2 ? String.valueOf(T.aj) + ": " : String.valueOf(T.ak) + ": ") + x2.LoginScreen.d() + "\n" + T.ad + ": " + x2.b.d(), new de(T.bu, x2, 4000, null), null, new de(T.bo, GameCanvas.instance, 8882, null));
                }
                GameCanvas.K = GameCanvas.L;
                return;
            }
            case 2003: {
                x x3 = this;
                object = new MyVector("vMenu Login");
                ((MyVector)object).addElement(new de(T.Z, x3, 2004, null));
                if (!x3.n) {
                    ((MyVector)object).addElement(new de(T.Mob, x3, 1004, null));
                }
                ((MyVector)object).addElement(new de(T.MessageHandler, x3, 1003, null));
                ((MyVector)object).addElement(new de(T.aI, x3, 1005, null));
                int n3 = RMS.d("lowGraphic");
                if (n3 == 1) {
                    ((MyVector)object).addElement(new de(T.bV, x3, 10041, null));
                } else {
                    ((MyVector)object).addElement(new de(T.bW, x3, 10042, null));
                }
                ((MyVector)object).addElement(new de(T.bp, GameCanvas.instance, 8885, null));
                GameCanvas.F.LoginScreen((MyVector)object);
                return;
            }
            case 2004: {
                this.f();
                return;
            }
            case 2008: {
                RMS.LoginScreen("acc", this.LoginScreen.d().trim());
                RMS.LoginScreen("pass", this.b.d().trim());
                if (ServerListScreen.u) {
                    GameCanvas.ak.b();
                    return;
                }
                GameCanvas.ak.j();
                return;
            }
            case 4000: {
                object = this.LoginScreen.d();
                x x4 = this;
                GameCanvas.b(T.aD);
                GameCanvas.b();
                GameCanvas.b(T.J);
                GameService bt2 = GameService.LoginScreen();
                String string = x4.b.d();
                String string2 = RMS.c("userAo" + ServerListScreen.n);
                RMS.c("passAo");
                bt2.LoginScreen((String)object, string, string2, Config.VERSION);
                RMS.LoginScreen("acc", (String)object);
                RMS.LoginScreen("pass", x4.b.d());
            }
        }
    }

    private void methodItem() {
        if (this.n) {
            this.LoginScreen();
            return;
        }
        this.MyHashtable = false;
        this.b.e = false;
        this.LoginScreen.e = true;
        this.cm = this.x;
    }

    public final void f() {
        GameCanvas.instance();
        GameCanvas.isLowGraphic(T.fW);
        this.MyHashtable = true;
        this.b.e = false;
        this.LoginScreen.e = true;
    }

    public static void g() {
        Res.currentTimeMillis();
        if (GameCanvas.I.n) {
            GameCanvas.isLowGraphic(T.fV, new de(T.ImageLoader, GameCanvas.G, 10019, null), new de(T.bo, GameCanvas.G, 10020, null));
            return;
        }
        eu.b = false;
        GameCanvas.e();
    }
}

