import main.GameCanvas;
import main.GameMidlet;
/*
 * Decompiled with CFR 0.152.
 */

public final class bi
extends Screen
implements b {
    private cd LoginScreen;
    private cd b;
    private cd c;
    private cd d;
    private cd e;
    private cd f;
    private cd g;
    private cd Item;
    private cd i;
    private static boolean j = false;
    private int k;
    private int Res;
    private int m;
    private boolean n = false;
    private boolean o = false;
    private de GameScreen;
    private de q;
    private de r;
    private de SessionReceiver;
    private de MyHashtable;
    private int u;
    private de v;
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

    public final void b() {
        System.out.println("Res switch");
        bu.LoginScreen();
        this.LoginScreen.e = true;
        this.b.e = false;
        if (GameCanvas.e) {
            this.LoginScreen.e = false;
        }
        super.b();
    }

    public bi(byte by2) {
        byte by3 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by3;
        if (by3 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        GameScreen.LoginScreen(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        this.m = GameCanvas.B > 200 ? GameCanvas.D - 80 : GameCanvas.D - 65;
        bi bi2 = this;
        this.Res = -50;
        this.u = GameCanvas.D - Screen.cp - 5;
        if (GameCanvas.B <= 160) {
            this.u = 20;
        }
        this.i = new cd();
        this.i.c(1);
        this.i.c = 220;
        this.i.d = Screen.cp + 2;
        this.i.i = "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i";
        if (by2 == 1) {
            this.i.LoginScreen("01234567890");
        }
        this.LoginScreen = new cd();
        this.LoginScreen.c = 220;
        this.LoginScreen.d = Screen.cp + 2;
        this.LoginScreen.e = true;
        this.LoginScreen.i = "H\u1ecd v\u00e0 MyHashtable\u00ean";
        if (by2 == 1) {
            this.LoginScreen.LoginScreen("Nguy\u1ec5n V\u0103n A");
        }
        this.LoginScreen.c(0);
        this.b = new cd();
        this.b.c(1);
        this.b.c = 70;
        this.b.d = Screen.cp + 2;
        this.b.i = "Ng\u00e0y sinh";
        if (by2 == 1) {
            this.b.LoginScreen("01");
        }
        this.c = new cd();
        this.c.c(1);
        this.c.c = 70;
        this.c.d = Screen.cp + 2;
        this.c.i = "Th\u00e1ng sinh";
        if (by2 == 1) {
            this.c.LoginScreen("01");
        }
        this.d = new cd();
        this.d.c(1);
        this.d.c = 70;
        this.d.d = Screen.cp + 2;
        this.d.i = "N\u0103m sinh";
        if (by2 == 1) {
            this.d.LoginScreen("1980");
        }
        this.e = new cd();
        this.e.c(0);
        this.e.c = 220;
        this.e.d = Screen.cp + 2;
        this.e.i = "\u0110\u1ecba ch\u1ec9 \u0111\u0103ng k\u00fd th\u01b0\u1eddng tr\u00fa";
        if (by2 == 1) {
            this.e.LoginScreen("123 \u0111\u01b0\u1eddng SessionReceiver\u1ed1 1, Qu\u1eadn 1, TP.HCM");
        }
        this.f = new cd();
        this.f.c(1);
        this.f.c = 220;
        this.f.d = Screen.cp + 2;
        this.f.i = "S\u1ed1 Ch\u1ee9ng minh nh\u00e2n d\u00e2n ho\u1eb7c SessionReceiver\u1ed1 Item\u1ed9 chi\u1ebfu";
        if (by2 == 1) {
            this.f.LoginScreen("123456789");
        }
        this.g = new cd();
        this.g.c(0);
        this.g.c = 220;
        this.g.d = Screen.cp + 2;
        this.g.i = "Ng\u00e0y c\u1ea5p";
        if (by2 == 1) {
            this.g.LoginScreen("01/01/1990");
        }
        this.Item = new cd();
        this.Item.c(0);
        this.Item.c = 220;
        this.Item.d = Screen.cp + 2;
        this.Item.i = "N\u01a1i c\u1ea5p";
        if (by2 == 1) {
            this.Item.LoginScreen("TP.HCM");
        }
        this.u += 35;
        this.n = true;
        this.k = 0;
        this.GameScreen = new de(GameCanvas.A > 200 ? T.ax : T.ay, GameCanvas.instance, 888393, null);
        new de(T.GameService, this, 2001, null);
        this.r = new de(T.az, this, 2002, null);
        this.MyHashtable = new de(T.bv, this, 10021, null);
        this.cm = this.SessionReceiver = new de(T.bi, this, 2003, null);
        if (GameCanvas.e) {
            this.GameScreen.j = GameCanvas.A / 2 - 100;
            this.SessionReceiver.j = GameCanvas.A / 2 - Screen.cq - 8;
            if (GameCanvas.B >= 200) {
                this.GameScreen.k = GameCanvas.B / 2 - 40;
                this.SessionReceiver.k = this.x + 110;
            }
            this.MyHashtable.j = GameCanvas.A / 2 + 3;
            this.MyHashtable.k = this.x + 110;
            this.r.j = GameCanvas.A / 2 - 84;
            this.r.k = this.SessionReceiver.k;
        }
        this.Message = 170;
        by2 = (byte)184;
        if (184 >= GameCanvas.A) {
            by2 = (byte)152;
        }
        this.w = GameCanvas.A / 2 - by2 / 2;
        this.x = 5;
        this.LoginScreen.LoginScreen = this.w + 10;
        this.LoginScreen.b = this.x + 20;
        this.v = new de(T.ServerListScreen, this, 2008, null);
        this.v.j = 260;
        this.v.k = GameCanvas.B - 60;
        this.q = new de("Tho\u00e1t", this, 1003, null);
        this.q.j = 260;
        this.q.k = GameCanvas.B - 30;
        this.v.j = GameCanvas.A / 2 - 80;
        this.q.j = GameCanvas.A / 2 + 10;
        this.q.k = this.v.k = GameCanvas.B - 25;
        this.cn = this.v;
        this.cm = this.q;
    }

    public final void c() {
        this.LoginScreen.c();
        this.i.c();
        this.b.c();
        this.c.c();
        this.d.c();
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.LoginScreen();
            ++n2;
        }
        if (++GameScreen.j > GameCanvas.A * 3 + 100) {
            GameScreen.j = 100;
        }
        if (ae.m != null) {
            return;
        }
        bi bi2 = this;
        if (bi2.m != bi2.Res) {
            bi2.Res += bi2.m - bi2.Res >> 1;
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
        if (this.z >= 0 && GameCanvas.w % 100 == 0) {
            bi2 = this;
            ++bi2.z;
            if (bi2.z >= T.aY.length) {
                bi2.z = 0;
            }
            if (GameCanvas.K == GameCanvas.L && GameCanvas.L.LoginScreen) {
                GameCanvas.L.LoginScreen(T.aY[bi2.z]);
            }
        }
        if (GameCanvas.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.MyHashtable;
                return;
            }
            this.cn = this.v;
            this.cm = this.q;
            return;
        }
        if (this.o) {
            this.cn = this.r;
            this.cm = this.MyHashtable;
            return;
        }
        this.cn = this.v;
        this.cm = this.q;
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
        if (ae.m != null) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (GameCanvas.K == null) {
            this.w = GameCanvas.C - 120;
            this.x = (GameCanvas.B - 110) / 2;
            bo.LoginScreen(en2, this.w, this.x, 240, 110, -1, true);
            this.LoginScreen.LoginScreen = this.w + 10;
            this.LoginScreen.b = this.x + 15;
            this.i.LoginScreen = this.LoginScreen.LoginScreen;
            this.i.b = this.LoginScreen.b + 30;
            this.b.LoginScreen = this.w + 10;
            this.b.b = this.i.b + 30;
            this.c.LoginScreen = this.b.LoginScreen + 75;
            this.c.b = this.b.b;
            this.d.LoginScreen = this.c.LoginScreen + 75;
            this.d.b = this.c.b;
            mFont.i.LoginScreen(en2, "C\u1eadp nh\u1eadt th\u00f4ng tin", GameCanvas.C, this.x + 2, 2);
            this.LoginScreen.LoginScreen(en2);
            this.i.LoginScreen(en2);
            this.b.LoginScreen(en2);
            this.c.LoginScreen(en2);
            this.d.LoginScreen(en2);
        }
        GameCanvas.isLowGraphic(en2);
        String string = Config.VERSION;
        en2.LoginScreen(GameCanvas.O);
        en2.d(GameCanvas.A - 40, 4, 36, 11);
        mFont.o.LoginScreen(en2, string, GameCanvas.A - 22, 4, 2);
        en2.LoginScreen(GameCanvas.ah, 10, 10, 0);
        super.LoginScreen(en2);
    }

    public final void d() {
        if (!GameCanvas.e) {
            this.co = this.LoginScreen.e ? this.LoginScreen.j : this.b.j;
        }
        if (GameCanvas.i[2]) {
            --this.k;
            if (this.k < 0) {
                this.k = 1;
            }
        } else if (GameCanvas.i[8]) {
            ++this.k;
            if (this.k > 1) {
                this.k = 1;
            }
        }
        if (GameCanvas.i[2] || GameCanvas.i[8]) {
            GameCanvas.clearKeyHold();
            if (this.k == 1) {
                this.LoginScreen.e = false;
                this.b.e = true;
            } else if (this.k == 0) {
                this.LoginScreen.e = true;
                this.b.e = false;
            } else {
                this.LoginScreen.e = false;
                this.b.e = false;
            }
        }
        if (GameCanvas.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.MyHashtable;
            } else {
                this.cn = this.v;
                this.cm = this.q;
            }
        } else if (this.o) {
            this.cn = this.r;
            this.cm = this.MyHashtable;
        } else {
            this.cn = this.v;
            this.cm = this.q;
        }
        if (GameCanvas.m) {
            if (GameCanvas.isLowGraphic(this.LoginScreen.LoginScreen, this.LoginScreen.b, this.LoginScreen.c, this.LoginScreen.d)) {
                this.k = 0;
            } else if (GameCanvas.isLowGraphic(this.b.LoginScreen, this.b.b, this.b.c, this.b.d)) {
                this.k = 1;
            }
        }
        super.d();
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
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
                this.o = false;
                return;
            }
            case 1002: {
                return;
            }
            case 1004: {
                ServerListScreen.LoginScreen();
                GameCanvas.ak.b();
                return;
            }
            case 10021: {
                bi bi2 = this;
                this.o = false;
                bi2.b.e = false;
                bi2.LoginScreen.e = true;
                bi2.cm = bi2.SessionReceiver;
                return;
            }
            case 1003: {
                GameCanvas.ak.b();
                Session.LoginScreen().e();
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
                if (bi3.LoginScreen.d().equals("")) {
                    GameCanvas.isLowGraphic(T.U);
                    break;
                }
                bi3.LoginScreen.d().toCharArray();
                if (bi3.b.d().equals("")) {
                    GameCanvas.isLowGraphic(T.V);
                    break;
                }
                if (bi3.LoginScreen.d().length() < 5) {
                    GameCanvas.isLowGraphic(T.W);
                    break;
                }
                object = null;
                if (T.fB == 2) {
                    if (bi3.LoginScreen.d().indexOf("@") == -1 || bi3.LoginScreen.d().indexOf(".") == -1) {
                        object = T.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(bi3.LoginScreen.d());
                        if (bi3.LoginScreen.d().length() < 8 || bi3.LoginScreen.d().length() > 12 || !bi3.LoginScreen.d().startsWith("0") && !bi3.LoginScreen.d().startsWith("84")) {
                            object = T.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (bi3.LoginScreen.d().indexOf("@") == -1 || bi3.LoginScreen.d().indexOf(".") == -1) {
                            object = T.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    GameCanvas.isLowGraphic((String)object);
                } else {
                    GameCanvas.L.LoginScreen(String.valueOf(T.ai) + (bl2 ? String.valueOf(T.aj) + ": " : String.valueOf(T.ak) + ": ") + bi3.LoginScreen.d() + "\n" + T.ad + ": " + bi3.b.d(), new de(T.bu, bi3, 4000, null), null, new de(T.bo, GameCanvas.instance, 8882, null));
                }
                GameCanvas.K = GameCanvas.L;
                return;
            }
            case 2003: {
                bi bi4 = this;
                object = new MyVector("vMenu Login");
                ((MyVector)object).addElement(new de(T.Z, bi4, 2004, null));
                ((MyVector)object).addElement(new de(T.Mob, bi4, 1004, null));
                ((MyVector)object).addElement(new de(T.MessageHandler, bi4, 1003, null));
                ((MyVector)object).addElement(new de(T.aI, bi4, 1005, null));
                int n3 = RMS.d("lowGraphic");
                if (n3 == 1) {
                    ((MyVector)object).addElement(new de(T.bV, bi4, 10041, null));
                } else {
                    ((MyVector)object).addElement(new de(T.bW, bi4, 10042, null));
                }
                ((MyVector)object).addElement(new de(T.bp, GameCanvas.instance, 8885, null));
                GameCanvas.F.LoginScreen((MyVector)object);
                return;
            }
            case 2004: {
                bi bi5 = this;
                GameCanvas.instance();
                GameCanvas.isLowGraphic(T.fW);
                bi5.o = true;
                bi5.b.e = false;
                bi5.LoginScreen.e = true;
                return;
            }
            case 2008: {
                if (this.b.d().equals("") || this.c.d().equals("") || this.d.d().equals("") || this.i.d().equals("") || this.LoginScreen.d().equals("")) {
                    GameCanvas.isLowGraphic("Vui Res\u00f2ng \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin");
                    return;
                }
                GameCanvas.isLowGraphic(T.aC);
                GameService.LoginScreen().LoginScreen(this.b.d(), this.c.d(), this.d.d(), "", "", "", "", this.i.d(), this.LoginScreen.d());
            }
        }
    }
}

