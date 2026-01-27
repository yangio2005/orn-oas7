import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bj {
    private Char b;
    private by c;
    private MyVector d = new MyVector("vDARTS");
    private int e;
    private int f;
    private int g;
    private int Item;
    private int i;
    private int j;
    private int k;
    private int Res = 0;
    private int m = 0;
    private boolean n = false;
    private boolean o = true;
    public ci LoginScreen;

    public bj(Char object, int n2, ci ci2, int n3, int n4) {
        this.LoginScreen = ci2;
        this.b = object;
        this.c = GameScreen.w[n2];
        this.Item = this.c.i;
        this.i = n3;
        this.j = n4;
        object = ((Char)object).aQ == null ? ((Char)object).aU : ((Char)object).aQ;
        n2 = ds.LoginScreen(object.Res() - n3, object.m() - n4);
        object = this;
        this.e = n2;
        ((bj)object).f = ((bj)object).Item * ds.b(n2) >> 10;
        ((bj)object).g = ((bj)object).Item * ds.LoginScreen(n2) >> 10;
    }

    public final void methodLoginScreen() {
        if (!this.o) {
            return;
        }
        if (this.b.aQ == null && this.b.aU == null) {
            this.b();
            return;
        }
        bq bq2 = this.b.aQ == null ? this.b.aU : this.b.aQ;
        int n2 = 0;
        while (n2 < this.c.Item) {
            if (this.c.c.length > 0) {
                this.d.addElement(new dx(this.i, this.j));
            }
            int n3 = this.b.Res() > bq2.Res() ? 10 : -10;
            this.Res = bq2.Res() + n3 - this.i;
            this.m = bq2.m() - bq2.n() / 2 - this.j;
            ++this.k;
            if (ds.g(this.Res) < 20 && ds.g(this.m) < 20) {
                if (this.b.aU != null && this.b.aU.aq) {
                    this.b.aU.LoginScreen(this.b.aU.MessageHandler, 0L, this.b.aU.ae, this.b.aU.ad);
                }
                this.b();
                return;
            }
            n3 = ds.LoginScreen(this.Res, this.m);
            if (Math.abs(n3 - this.e) < 90 || this.Res * this.Res + this.m * this.m > 4096) {
                this.e = Math.abs(n3 - this.e) < 15 ? n3 : (n3 - this.e >= 0 && n3 - this.e < 180 || n3 - this.e < -180 ? ds.c(this.e + 15) : ds.c(this.e - 15));
            }
            if (this.Item < 8192) {
                this.Item += 1024;
            }
            this.f = this.Item * ds.b(this.e) >> 10;
            this.g = this.Item * ds.LoginScreen(this.e) >> 10;
            this.Res += this.f;
            n3 = this.Res >> 10;
            this.i += n3;
            this.Res &= 0x3FF;
            this.m += this.g;
            n3 = this.m >> 10;
            this.j += n3;
            this.m &= 0x3FF;
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.size()) {
            dx dx2 = (dx)this.d.elementAt(n2);
            ++dx2.LoginScreen;
            if (dx2.LoginScreen >= this.c.c.length) {
                this.d.removeElementAt(n2);
            }
            ++n2;
        }
    }

    private void b() {
        ds.c("END ME!");
        if (!this.b.ch && this.i >= GameScreen.j && this.i <= GameScreen.j + GameCanvas.A) {
            bu.LoginScreen();
        }
        this.b.E();
        if (this.b.ch) {
            this.b.ch = false;
            if (this.b.bJ && this.b.aq && this.b.H != 14 && this.b.H != 5) {
                this.b.bJ = false;
            }
            if (this.b.K == 2) {
                int n2 = this.b.aq ? Char.e().aC.b : this.b.aP;
                if (n2 < 77 || n2 > 83) {
                    GameScreen.j().b(this.i, this.j);
                }
            } else {
                GameScreen.j().b(this.i, this.j);
            }
        }
        this.b.cd = null;
        this.b.ItemMap = false;
        this.b.cf = null;
        this.b.cg = null;
        this.b.C();
    }

    public final void methodLoginScreen(mGraphics en2) {
        dx dx2;
        if (!this.o) {
            return;
        }
        int n2 = ah.LoginScreen(360 - this.e);
        byte by2 = ah.c[n2];
        n2 = ah.b[n2];
        int n3 = this.d.size() / 2;
        while (n3 < this.d.size()) {
            dx dx3 = (dx)this.d.elementAt(n3);
            bl.b(en2, this.c.d[dx3.LoginScreen], dx3.b, dx3.c, 0, 3);
            ++n3;
        }
        n3 = GameCanvas.w % this.c.b.length;
        bl.b(en2, this.c.b[n3][by2], this.i, this.j, n2, 3);
        int n4 = 0;
        while (n4 < this.d.size()) {
            dx2 = (dx)this.d.elementAt(n4);
            bl.b(en2, this.c.c[dx2.LoginScreen], dx2.b, dx2.c, 0, 3);
            ++n4;
        }
        bl.b(en2, this.c.LoginScreen[n3][by2], this.i, this.j, n2, 3);
        n4 = 0;
        while (n4 < this.d.size()) {
            dx2 = (dx)this.d.elementAt(n4);
            if (ds.g(ah.LoginScreen.nextInt(100)) < this.c.g) {
                bl.b(en2, GameCanvas.w % 2 == 0 ? this.c.e[dx2.LoginScreen] : this.c.f[dx2.LoginScreen], dx2.b, dx2.c, 0, 3);
            }
            ++n4;
        }
        en2.LoginScreen(0xFF0000);
    }
}

