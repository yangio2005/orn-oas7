/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class an
extends Mob
implements bq {
    private static Image ad = Res.loadImage("/mainImage/shadowBig.png");
    private static ck ae;
    public int LoginScreen;
    public int b;
    private int Char;
    private int ag;
    private boolean ah;
    private int ai;
    private boolean aj = true;
    private int ak;
    private int al;
    private Char[] am;
    private long[] an;
    private byte ao;
    private int[] ap;
    private int[] aq;
    private int[] ar;
    private int[] ImageCache;

    static {
        Res.loadImage("/mainImage/myTexture2dmobHP.png");
    }

    public final void methodLoginScreen(short s2) {
        this.d = true;
        this.e = s2;
    }

    public final void methodLoginScreen() {
        this.d = false;
    }

    public an(int n2, short s2, short s3, int n3, long l2, long l3) {
        int[] nArray = new int[12];
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.ap = nArray;
        int[] nArray2 = new int[12];
        nArray2[3] = 2;
        nArray2[4] = 2;
        nArray2[5] = 2;
        nArray2[6] = 3;
        nArray2[7] = 3;
        nArray2[8] = 3;
        nArray2[9] = 4;
        nArray2[10] = 4;
        nArray2[11] = 4;
        this.aq = nArray2;
        int[] nArray3 = new int[12];
        nArray3[3] = 4;
        nArray3[4] = 4;
        nArray3[5] = 4;
        nArray3[6] = 5;
        nArray3[7] = 5;
        nArray3[8] = 5;
        nArray3[9] = 6;
        nArray3[10] = 6;
        nArray3[11] = 6;
        this.ar = nArray3;
        int[] nArray4 = new int[17];
        nArray4[3] = 7;
        nArray4[4] = 7;
        nArray4[5] = 7;
        nArray4[6] = 8;
        nArray4[7] = 8;
        nArray4[8] = 8;
        nArray4[9] = 9;
        nArray4[10] = 9;
        nArray4[11] = 9;
        nArray4[12] = 10;
        nArray4[13] = 10;
        nArray4[14] = 10;
        nArray4[15] = 11;
        nArray4[16] = 11;
        this.ImageCache = nArray4;
        int[] nArray5 = new int[]{1, 1, 7, 7};
        byte[] byArray = new byte[]{-1, 1};
        this.Message = n2;
        this.m = s2 + 20;
        this.n = s3;
        this.LoginScreen = this.m;
        this.b = this.n;
        this.Res = l3;
        this.k = l2;
        this.C = 71;
        this.U = 100;
        this.A();
        an an2 = this;
        ae = null;
        ae = new ck();
        String string = "/x" + mGraphics.b + "/effectdata/" + 108 + "/data";
        try {
            ae.b(string);
            an.ae.LoginScreen = Res.clientType("/effectdata/108/img.png");
        }
        catch (Exception exception) {
            GameService.LoginScreen().Item(an2.C);
        }
        an2.v = an.ae.f;
        an2.w = an.ae.g;
        this.GameScreen = 2;
    }

    public final void methodLoginScreen(int[] nArray) {
        ++this.ak;
        if (this.ak > nArray.length - 1) {
            this.ak = 0;
        }
        this.al = nArray[this.ak];
    }

    public final void b() {
    }

    public final void c() {
        if (!this.i()) {
            return;
        }
        an an2 = this;
        byte by2 = bv.i;
        an2.Char = an2.m;
        an2.ai = 0;
        if (an2.ag > 0 && !bv.LoginScreen(an2.Char, an2.ag, 2)) {
            if (bv.LoginScreen(an2.Char / by2, an2.ag / by2) == 0) {
                an2.ah = true;
            } else if (bv.LoginScreen(an2.Char / by2, an2.ag / by2) != 0 && !bv.LoginScreen(an2.Char, an2.ag, 2)) {
                an2.Char = an2.m;
                an2.ag = an2.n;
                an2.ah = false;
            }
            while (an2.ah && an2.ai < 10) {
                ++an2.ai;
                an2.ag += 24;
                if (!bv.LoginScreen(an2.Char, an2.ag, 2)) continue;
                if (an2.ag % 24 == 0) break;
                an2.ag -= an2.ag % 24;
                break;
            }
        }
        switch (this.GameScreen) {
            case 2: {
                an2 = this;
                an2.LoginScreen(an2.ap);
                if (an2.m != an2.LoginScreen || an2.n != an2.b) {
                    an2.m += (an2.LoginScreen - an2.m) / 4;
                    an2.n += (an2.b - an2.n) / 4;
                }
                return;
            }
            case 3: {
                this.f();
                return;
            }
            case 5: {
                this.x = 0;
                this.g();
                return;
            }
            case 6: {
                this.x = 0;
                ++this.q;
                this.n += this.q;
                if (this.n < this.u) break;
                this.n = this.u;
                this.q = 0;
                this.GameScreen = 5;
                return;
            }
            case 7: {
                return;
            }
            case 0: 
            case 1: {
                an2 = this;
                an2.LoginScreen(an2.ap);
                if (GameCanvas.w % 5 == 0) {
                    an an3 = an2;
                    an3 = an2;
                    an an4 = an2;
                    an3 = an4;
                    an3 = an2;
                    an an5 = an2;
                    an3 = an5;
                    an3 = an2;
                    at.LoginScreen(167, ds.b(an2.m - 40 / 2, an2.m + 40 / 2), ds.b(an4.n - 40 + 40 / 2, an5.n - 40 + 40), 1);
                }
                if (an2.m == an2.LoginScreen && an2.n == an2.b) break;
                an2.m += (an2.LoginScreen - an2.m) / 4;
                an2.n += (an2.b - an2.n) / 4;
            }
        }
    }

    public final void d() {
    }

    public final void methodLoginScreen(Char af2) {
        this.D = af2;
        this.q = 0;
        this.r = 0;
        this.GameScreen = 3;
        this.ak = 0;
        this.o = af2.B > this.m ? 1 : -1;
        int n2 = af2.B;
        int n3 = af2.C;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.SessionReceiver = 0;
            return;
        }
        this.SessionReceiver = 1;
    }

    final boolean e() {
        return this.C >= 58 && this.C <= 65 || this.C == 67 || this.C == 68;
    }

    public final void methodLoginScreen(Char[] afArray, long[] lArray, byte by2) {
        this.am = afArray;
        this.an = lArray;
        this.ao = by2;
        this.GameScreen = 3;
    }

    public final void f() {
        int n2;
        if (this.ao == 3) {
            if (this.ak == this.ar.length - 1) {
                this.GameScreen = 2;
            }
            this.o = this.m < this.am[0].B ? 1 : -1;
            this.LoginScreen(this.ar);
            this.m += (this.am[0].B - this.m) / 4;
            this.n += (this.am[0].C - this.n) / 4;
            this.LoginScreen = this.m;
            if (this.ak == 8) {
                n2 = 0;
                while (n2 < this.am.length) {
                    this.am[n2].LoginScreen(this.an[n2], 0L, false, false);
                    at.LoginScreen(102, this.am[n2].B, this.am[n2].C, 1);
                    ++n2;
                }
            }
        }
        if (this.ao == 4) {
            if (this.ak == this.ImageCache.length - 1) {
                this.GameScreen = 2;
            }
            this.o = this.m < this.am[0].B ? 1 : -1;
            this.LoginScreen(this.ImageCache);
            if (this.ak == 8) {
                n2 = 0;
                while (n2 < this.am.length) {
                    this.am[n2].LoginScreen(this.an[n2], 0L, false, false);
                    at.LoginScreen(102, this.am[n2].B, this.am[n2].C, 1);
                    ++n2;
                }
            }
        }
    }

    public final void g() {
        this.LoginScreen(this.aq);
        this.m += this.m < this.LoginScreen ? 2 : -2;
        this.n = this.b;
        int n2 = this.o = this.m < this.LoginScreen ? 1 : -1;
        if (ds.g(this.m - this.LoginScreen) <= 1) {
            this.m = this.LoginScreen;
            this.GameScreen = 2;
        }
    }

    public final boolean Item() {
        if (this.m < GameScreen.j) {
            return false;
        }
        if (this.m > GameScreen.j + GameScreen.d) {
            return false;
        }
        if (this.n < GameScreen.k) {
            return false;
        }
        if (this.n > GameScreen.k + GameScreen.e + 30) {
            return false;
        }
        return this.GameScreen != 0;
    }

    public final boolean i() {
        return this.GameScreen != 0;
    }

    public final boolean j() {
        return this.I || this.H > 0;
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (ae == null) {
            return;
        }
        if (this.Y) {
            return;
        }
        if (this.M) {
            if (!this.d) {
                ae.LoginScreen(en2, this.al, this.N, this.O, this.o == 1 ? 0 : 1, 2);
                return;
            }
            bl.b(en2, this.e, this.N, this.O, this.o == 1 ? 0 : 2, 33);
            return;
        }
        if (this.aj && this.GameScreen != 0) {
            mGraphics en3 = en2;
            an an2 = this;
            en3.LoginScreen(ad, an2.Char, an2.u, 3);
            en3.e(GameScreen.j, GameScreen.k - GameCanvas.ae, GameScreen.d, GameScreen.e + 2 * GameCanvas.ae);
        }
        en2.LoginScreen(0, GameCanvas.ae);
        if (!this.d) {
            ae.LoginScreen(en2, this.al, this.m, this.n, this.o == 1 ? 0 : 1, 2);
        } else {
            bl.b(en2, this.e, this.m, this.n - 9, this.o == 1 ? 0 : 2, 33);
        }
        en2.LoginScreen(0, -GameCanvas.ae);
        int n2 = mGraphics.LoginScreen(this.X);
        int n3 = mGraphics.b(this.X);
        int n4 = n2;
        int n5 = this.m - n2;
        int n6 = this.n - this.w - 5;
        int n7 = (n2 << 1) * this.V / 100;
        if (n7 > n2) {
            if ((n7 -= n2) <= 0) {
                n7 = 0;
            }
        } else {
            n4 = n7;
            n7 = 0;
        }
        en2.LoginScreen(GameScreen.aJ, n5, n6, 20);
        en2.LoginScreen(GameScreen.aJ, n5 + n2, n6, 20);
        en2.LoginScreen(this.X, 0, 0, n4, n3, 0, n5, n6, 20);
        en2.LoginScreen(this.X, 0, 0, n7, n3, 0, n5 + n2, n6, 20);
    }

    public final void k() {
        this.k = 0L;
        this.k = 0L;
        this.GameScreen = 1;
        this.q = -3;
        this.r = -this.o;
        this.SessionReceiver = 0;
    }

    public final void methodLoginScreen(Mob aa2) {
        this.D = null;
        this.q = 0;
        this.r = 0;
        this.GameScreen = 3;
        this.ak = 0;
        this.o = aa2.m > this.m ? 1 : -1;
        int n2 = aa2.m;
        int n3 = aa2.n;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.SessionReceiver = 0;
            return;
        }
        this.SessionReceiver = 1;
    }

    public final int Res() {
        return this.m;
    }

    public final int m() {
        return this.n - 40;
    }

    public final int n() {
        return 40;
    }

    public final int o() {
        return 40;
    }

    public final void GameScreen() {
        if (this.GameScreen == 5) {
            this.GameScreen = 2;
            this.SessionReceiver = 0;
            this.r = 0;
            this.q = 0;
        }
    }

    public final boolean q() {
        return this.GameScreen == 0 || this.GameScreen == 1;
    }

    public final void r() {
        if (this.j != 0) {
            this.j = 0;
        }
    }

    public final void SessionReceiver() {
    }

    public final void MyHashtable() {
    }

    public final void b(short s2) {
        this.LoginScreen = s2;
        this.GameScreen = 5;
    }
}

