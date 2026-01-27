/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class Npc
extends Mob
implements bq {
    private static Image ad = Res.loadImage("/mainImage/shadowBig.png");
    private static ck ae;
    public int LoginScreen;
    public boolean b;
    private int Char;
    private int ag;
    private boolean ah;
    private int ai;
    private boolean aj = true;
    private int ak;
    private int al;
    private boolean am;
    private boolean an;
    private int ao;
    private int ap;
    private Char[] aq;
    private long[] ar;
    private byte ImageCache;
    private int[] at;
    private int[] au;
    private int[] RMS;
    private int[] T;
    private int[] ax;
    private int[] ay;
    private int[] az;
    private int[] aA;
    private int[] aB;
    private boolean aC;

    public final void C() {
        ae = null;
        ae = new ck();
        String string = "/x" + mGraphics.b + "/effectdata/" + 100 + "/data";
        try {
            ae.b(string);
            Npc.ae.LoginScreen = Res.clientType("/effectdata/100/img.png");
        }
        catch (Exception exception) {
            GameService.LoginScreen().Item(this.C);
        }
        this.GameScreen = 2;
        this.v = Npc.ae.f;
        this.w = Npc.ae.g;
    }

    public final void methodLoginScreen(short s2) {
        this.d = true;
        this.e = s2;
    }

    public final void methodLoginScreen() {
        this.d = false;
    }

    public Npc(int n2, short s2, short s3, int n3, long l2, long l3, int n4) {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.at = nArray;
        this.au = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
        int[] nArray2 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        int[] nArray3 = new int[]{1, 1, 2, 2, 3, 3, 2};
        int[] nArray4 = new int[12];
        nArray4[2] = 34;
        nArray4[3] = 34;
        nArray4[4] = 35;
        nArray4[5] = 35;
        nArray4[6] = 36;
        nArray4[7] = 36;
        nArray4[8] = 2;
        nArray4[9] = 2;
        nArray4[10] = 1;
        nArray4[11] = 1;
        this.RMS = nArray4;
        int[] nArray5 = new int[23];
        nArray5[3] = 4;
        nArray5[4] = 4;
        nArray5[5] = 6;
        nArray5[6] = 6;
        nArray5[7] = 9;
        nArray5[8] = 9;
        nArray5[9] = 10;
        nArray5[10] = 10;
        nArray5[11] = 13;
        nArray5[12] = 13;
        nArray5[13] = 15;
        nArray5[14] = 15;
        nArray5[15] = 17;
        nArray5[16] = 17;
        nArray5[17] = 19;
        nArray5[18] = 19;
        nArray5[19] = 21;
        nArray5[20] = 21;
        nArray5[21] = 23;
        nArray5[22] = 23;
        this.T = nArray5;
        int[] nArray6 = new int[24];
        nArray6[2] = 1;
        nArray6[3] = 1;
        nArray6[4] = 4;
        nArray6[5] = 4;
        nArray6[6] = 6;
        nArray6[7] = 6;
        nArray6[8] = 8;
        nArray6[9] = 8;
        nArray6[10] = 25;
        nArray6[11] = 25;
        nArray6[12] = 26;
        nArray6[13] = 26;
        nArray6[14] = 28;
        nArray6[15] = 28;
        nArray6[16] = 30;
        nArray6[17] = 30;
        nArray6[18] = 32;
        nArray6[19] = 32;
        nArray6[20] = 2;
        nArray6[21] = 2;
        nArray6[22] = 1;
        nArray6[23] = 1;
        this.ax = nArray6;
        this.ay = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
        this.az = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
        this.aA = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
        int[] nArray7 = new int[24];
        nArray7[2] = 1;
        nArray7[3] = 1;
        nArray7[4] = 4;
        nArray7[5] = 4;
        nArray7[6] = 6;
        nArray7[7] = 6;
        nArray7[8] = 8;
        nArray7[9] = 8;
        nArray7[10] = 25;
        nArray7[11] = 25;
        nArray7[12] = 26;
        nArray7[13] = 26;
        nArray7[14] = 28;
        nArray7[15] = 28;
        nArray7[16] = 30;
        nArray7[17] = 30;
        nArray7[18] = 32;
        nArray7[19] = 32;
        nArray7[20] = 2;
        nArray7[21] = 2;
        nArray7[22] = 1;
        nArray7[23] = 1;
        this.aB = nArray7;
        byte[] byArray = new byte[]{-1, 1};
        this.MyHashtable = this.m = s2 + 20;
        short s4 = s3;
        this.n = s4;
        this.u = s4;
        this.Message = n2;
        this.k = l2;
        this.Res = l3;
        this.C = 70;
        this.U = 100;
        this.A();
        if (n4 == 0) {
            Npc cc2 = this;
            ae = null;
            ae = new ck();
            String string = "/x" + mGraphics.b + "/effectdata/" + 101 + "/data";
            try {
                ae.b(string);
                Npc.ae.LoginScreen = Res.clientType("/effectdata/101/img.png");
            }
            catch (Exception exception) {
                GameService.LoginScreen().Item(cc2.C);
            }
            cc2.v = Npc.ae.f;
            cc2.w = Npc.ae.g;
        }
        if (n4 == 1) {
            this.C();
        }
        if (n4 == 2) {
            this.C();
            this.b = true;
        }
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
        Npc cc2 = this;
        byte by2 = bv.i;
        cc2.Char = cc2.m;
        cc2.ai = 0;
        if (cc2.ag > 0 && !bv.LoginScreen(cc2.Char, cc2.ag, 2)) {
            if (bv.LoginScreen(cc2.Char / by2, cc2.ag / by2) == 0) {
                cc2.ah = true;
            } else if (bv.LoginScreen(cc2.Char / by2, cc2.ag / by2) != 0 && !bv.LoginScreen(cc2.Char, cc2.ag, 2)) {
                cc2.Char = cc2.m;
                cc2.ag = cc2.n;
                cc2.ah = false;
            }
            while (cc2.ah && cc2.ai < 10) {
                ++cc2.ai;
                cc2.ag += 24;
                if (!bv.LoginScreen(cc2.Char, cc2.ag, 2)) continue;
                if (cc2.ag % 24 == 0) break;
                cc2.ag -= cc2.ag % 24;
                break;
            }
        }
        switch (this.GameScreen) {
            case 2: {
                cc2 = this;
                cc2.LoginScreen(cc2.b ? cc2.au : cc2.at);
                if (cc2.m != cc2.MyHashtable || cc2.n != cc2.u) {
                    cc2.m += (cc2.MyHashtable - cc2.m) / 4;
                    cc2.n += (cc2.u - cc2.n) / 4;
                }
                return;
            }
            case 4: {
                this.x = 0;
                cc2 = this;
                if (cc2.am) {
                    ++cc2.ao;
                    cc2.n -= cc2.ao;
                    cc2.LoginScreen(cc2.aA);
                    if (cc2.n <= -500) {
                        cc2.am = false;
                        cc2.an = true;
                        cc2.ao = 0;
                    }
                }
                if (cc2.an) {
                    cc2.m = cc2.LoginScreen;
                    cc2.ao += 2;
                    cc2.n += cc2.ao;
                    cc2.LoginScreen(cc2.aB);
                    if (cc2.n > cc2.u) {
                        cc2.n = cc2.u;
                        cc2.an = false;
                        cc2.ao = 0;
                        cc2.GameScreen = 2;
                        GameScreen.bu = 10;
                        cc2.aC = true;
                    }
                }
                return;
            }
            case 3: {
                this.f();
                return;
            }
            case 5: {
                this.x = 0;
                Npc cc3 = this;
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
                cc2 = this;
                cc2.LoginScreen(cc2.b ? cc2.au : cc2.at);
                if (GameCanvas.w % 5 == 0) {
                    Npc cc4 = cc2;
                    cc4 = cc2;
                    cc4 = cc2;
                    cc4 = cc2;
                    at.LoginScreen(167, ds.b(cc2.m - 60 / 2, cc2.m + 60 / 2), ds.b(cc2.m() + 40 / 2, cc2.m() + 40), 1);
                }
                if (cc2.m == cc2.MyHashtable && cc2.n == cc2.u) break;
                cc2.m += (cc2.MyHashtable - cc2.m) / 4;
                cc2.n += (cc2.u - cc2.n) / 4;
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

    public final void D() {
        this.GameScreen = 4;
        this.am = true;
    }

    public final void methodLoginScreen(Char[] afArray, long[] lArray, byte by2) {
        this.aq = afArray;
        this.ar = lArray;
        this.ImageCache = by2;
        this.ak = 0;
        if (by2 < 3) {
            this.GameScreen = 3;
        }
        if (by2 == 3) {
            this.am = true;
            this.GameScreen = 4;
        }
        if (by2 == 4) {
            int n2 = 0;
            while (n2 < this.aq.length) {
                this.aq[n2].LoginScreen(this.ar[n2], 0L, false, false);
                ++n2;
            }
        }
        if (by2 == 7) {
            this.GameScreen = 3;
        }
    }

    public final void f() {
        int n2;
        if (this.ImageCache == 7) {
            if (this.ak > 8) {
                this.ak = 8;
            }
            this.LoginScreen(this.RMS);
            if (GameCanvas.w % 4 == 0) {
                at.LoginScreen(70, this.m + (this.o == 1 ? 15 : -15), this.n - 40, 1);
            }
        }
        if (this.ImageCache == 0) {
            if (this.ak == this.RMS.length - 1) {
                this.GameScreen = 2;
            }
            this.o = this.m < this.aq[0].B ? 1 : -1;
            this.LoginScreen(this.RMS);
            if (this.ak == 8) {
                n2 = 0;
                while (n2 < this.aq.length) {
                    ah.LoginScreen(this.m + (this.o == 1 ? 45 : -45), this.n - 30, true, this.ar[n2], 0L, this.aq[n2], 24);
                    ++n2;
                }
            }
        }
        if (this.ImageCache == 1) {
            if (this.ak == (this.b ? this.ay.length - 1 : this.T.length - 1)) {
                this.GameScreen = 2;
            }
            this.o = this.m < this.aq[0].B ? 1 : -1;
            this.LoginScreen(this.b ? this.ay : this.T);
            this.m += (this.aq[0].B - this.m) / 4;
            this.n += (this.aq[0].C - this.n) / 4;
            if (this.ak == 18) {
                n2 = 0;
                while (n2 < this.aq.length) {
                    this.aq[n2].LoginScreen(this.ar[n2], 0L, false, false);
                    at.LoginScreen(102, this.aq[n2].B, this.aq[n2].C, 1);
                    ++n2;
                }
            }
        }
        if (this.ImageCache == 2) {
            if (this.ak == (this.b ? this.az.length - 1 : this.ax.length - 1)) {
                this.GameScreen = 2;
            }
            this.o = this.m < this.aq[0].B ? 1 : -1;
            this.LoginScreen(this.b ? this.az : this.ax);
            if (this.ak == 13) {
                GameScreen.bu = 10;
                this.aC = true;
                n2 = 0;
                while (n2 < this.aq.length) {
                    this.aq[n2].LoginScreen(this.ar[n2], 0L, false, false);
                    ++n2;
                }
            }
        }
    }

    public final void g() {
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

    public final void methodLoginScreen(mGraphics object) {
        if (ae == null) {
            return;
        }
        if (this.Y) {
            return;
        }
        if (this.M) {
            if (!this.d) {
                ae.LoginScreen((mGraphics)object, this.al, this.N, this.O, this.o == 1 ? 0 : 1, 2);
                return;
            }
            bl.b((mGraphics)object, this.e, this.N, this.O, this.o == 1 ? 0 : 2, 33);
            return;
        }
        if (this.aj && this.GameScreen != 0) {
            mGraphics en2 = object;
            Npc cc2 = this;
            en2.LoginScreen(ad, cc2.Char, cc2.u, 3);
            en2.e(GameScreen.j, GameScreen.k - GameCanvas.ae, GameScreen.d, GameScreen.e + 2 * GameCanvas.ae);
        }
        ((mGraphics)object).LoginScreen(0, GameCanvas.ae);
        if (!this.d) {
            ae.LoginScreen((mGraphics)object, this.al, this.m, this.n, this.o == 1 ? 0 : 1, 2);
        } else {
            bl.b((mGraphics)object, this.e, this.m, this.n - 9, this.o == 1 ? 0 : 2, 33);
        }
        ((mGraphics)object).LoginScreen(0, -GameCanvas.ae);
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
        ((mGraphics)object).LoginScreen(GameScreen.aJ, n5, n6, 20);
        ((mGraphics)object).LoginScreen(GameScreen.aJ, n5 + n2, n6, 20);
        ((mGraphics)object).LoginScreen(this.X, 0, 0, n4, n3, 0, n5, n6, 20);
        ((mGraphics)object).LoginScreen(this.X, 0, 0, n7, n3, 0, n5 + n2, n6, 20);
        if (this.aC) {
            ++this.ap;
            object = new ea(this.ImageCache == 2 ? 19 : 22, this.m + this.ap * 50, this.n + 25, 2, 1, -1);
            ei.LoginScreen((ea)object);
            object = new ea(this.ImageCache == 2 ? 19 : 22, this.m - this.ap * 50, this.n + 25, 2, 1, -1);
            ei.LoginScreen((ea)object);
            if (this.ap == 50) {
                this.ap = 0;
                this.aC = false;
            }
        }
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
        if (this.b) {
            return this.n - 20;
        }
        return this.n - 60;
    }

    public final int n() {
        return 40;
    }

    public final int o() {
        return 60;
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
}

