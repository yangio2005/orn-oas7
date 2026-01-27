/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class k
extends _do
implements b {
    private static Image dl = Res.loadImage("/mainImage/myTexture2dhatdau.png");
    public int LoginScreen;
    public int b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public int[] g;
    public int[] Item;
    private bo dm = new bo("", 0, 0);
    public boolean i;
    public static boolean j = true;
    public boolean k;
    public int Res;
    public long m;
    public long n;
    private boolean dn;
    private int cfr_renamed_0 = 0;

    public k(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
        this.dm.i = new de(null, this, 1, null);
        bo.LoginScreen(this.dm);
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (this.LoginScreen == 0) {
            return;
        }
        bl.b(en2, this.LoginScreen, this.B, this.C, 0, cj.c);
        if (Char.e().aT != null && Char.e().aT.equals(this)) {
            en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.B, this.C - bl.LoginScreen[this.LoginScreen][4] - 1, 33);
            if (this.e != null) {
                mFont.n.LoginScreen(en2, this.e, this.B, this.C - bl.LoginScreen[this.LoginScreen][4] - 20, 2, mFont.o);
            }
        } else if (this.e != null) {
            mFont.n.LoginScreen(en2, this.e, this.B, this.C - bl.LoginScreen[this.LoginScreen][4] - 17, 2, mFont.o);
        }
        try {
            int n2 = 0;
            while (n2 < this.b) {
                en2.LoginScreen(dl, this.B + this.g[n2] - bl.LoginScreen[this.LoginScreen][3] / 2, this.C + this.Item[n2] - bl.LoginScreen[this.LoginScreen][4], 0);
                ++n2;
            }
        }
        catch (Exception exception) {}
        if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
            bl.b(en2, this.ca.LoginScreen[this.bZ].c, this.B + this.ca.LoginScreen[this.bZ].LoginScreen, this.C - 15 + this.ca.LoginScreen[this.bZ].b, 0, 3);
            if (GameCanvas.w % 2 == 0) {
                ++this.bZ;
                if (this.bZ >= this.ca.LoginScreen.length) {
                    this.bZ = 0;
                }
            }
        }
    }

    public final void methodLoginScreen() {
        this.dm.j = j;
        this.n = System.currentTimeMillis();
        if (this.n - this.m >= 1000L) {
            --this.Res;
            this.m = this.n;
            if (this.Res < 0) {
                this.Res = 0;
            }
        }
        if (!this.f) {
            if (this.b < this.d && this.Res == 0) {
                this.dn = true;
            }
        } else if (this.Res == 0) {
            this.f = false;
            this.dn = true;
        }
        if (this.dn) {
            ++this.cfr_renamed_0;
            if (this.cfr_renamed_0 == 20) {
                this.cfr_renamed_0 = 0;
                this.dn = false;
                GameService.LoginScreen().f((byte)2);
            }
        }
        if (this.i) {
            this.i = false;
            if (this.Res >= 0 && this.b < this.d || this.Res >= 0 && this.f || this.k) {
                this.dm.LoginScreen(new String[]{!this.f ? String.valueOf(this.b) + "/" + this.d : T.cz, ai.b(this.Res)}, this.B, this.C - 20 - bl.LoginScreen[this.LoginScreen][4]);
            } else if (this.b == this.d && !this.f) {
                this.dm.LoginScreen(new String[]{T.cJ, String.valueOf(this.b) + "/" + this.d}, this.B, this.C - 20 - bl.LoginScreen[this.LoginScreen][4]);
            }
        }
        if (this.Res >= 0 && this.b < this.d || this.Res >= 0 && this.f) {
            this.dm.c[this.dm.c.length - 1] = ai.b(this.Res);
        }
        if (this.k) {
            this.dm.j = false;
            at.LoginScreen(98, this.B + this.g[this.b - 1] - bl.LoginScreen[this.LoginScreen][3] / 2, this.C + this.Item[this.b - 1] - bl.LoginScreen[this.LoginScreen][4], 1);
            --this.b;
            if (GameCanvas.w % 2 == 0) {
                bu.LoginScreen();
            }
            if (this.b == this.c) {
                this.dm.j = true;
                this.i = true;
                this.k = false;
            }
        }
        super.LoginScreen();
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1) {
            GameService.LoginScreen().e((byte)1);
        }
    }
}

