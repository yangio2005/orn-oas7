/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
extends TextBox
implements IActionListener {
    private static Image dl = ResourceUtil.IActionListener("/mainImage/myTexture2dhatdau.png");
    public int a;
    public int IActionListener;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public int[] UIPanel;
    public int[] h;
    private bo dm = new bo("", 0, 0);
    public boolean i;
    public static boolean j = true;
    public boolean k;
    public int ResourceUtil;
    public long m;
    public long n;
    private boolean dn;
    private int do = 0;

    public k(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
        this.dm.i = new Command(null, this, 1, null);
        bo.a(this.dm);
    }

    public final void a(MGraphics en2) {
        if (this.a == 0) {
            return;
        }
        bl.IActionListener(en2, this.a, this.B, this.C, 0, cj.c);
        if (GameWorld.e().aT != null && GameWorld.e().aT.equals(this)) {
            en2.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - bl.a[this.a][4] - 1, 33);
            if (this.e != null) {
                mFont.n.a(en2, this.e, this.B, this.C - bl.a[this.a][4] - 20, 2, mFont.o);
            }
        } else if (this.e != null) {
            mFont.n.a(en2, this.e, this.B, this.C - bl.a[this.a][4] - 17, 2, mFont.o);
        }
        try {
            int n2 = 0;
            while (n2 < this.b) {
                en2.a(dl, this.B + this.g[n2] - bl.a[this.a][3] / 2, this.C + this.h[n2] - bl.a[this.a][4], 0);
                ++n2;
            }
        }
        catch (Exception exception) {}
        if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
            bl.IActionListener(en2, this.ca.a[this.bZ].c, this.B + this.ca.a[this.bZ].a, this.C - 15 + this.ca.a[this.bZ].IActionListener, 0, 3);
            if (main.GameCanvas.w % 2 == 0) {
                ++this.bZ;
                if (this.bZ >= this.ca.GameCanvas.length) {
                    this.bZ = 0;
                }
            }
        }
    }

    public final void a() {
        this.dm.j = j;
        this.n = System.currentTimeMillis();
        if (this.n - this.m >= 1000L) {
            --this.l;
            this.m = this.n;
            if (this.l < 0) {
                this.l = 0;
            }
        }
        if (!this.f) {
            if (this.b < this.d && this.l == 0) {
                this.dn = true;
            }
        } else if (this.l == 0) {
            this.f = false;
            this.dn = true;
        }
        if (this.dn) {
            ++this.do;
            if (this.do == 20) {
                this.do = 0;
                this.dn = false;
                GameService.a().f((byte)2);
            }
        }
        if (this.i) {
            this.i = false;
            if (this.l >= 0 && this.b < this.d || this.l >= 0 && this.f || this.k) {
                this.dm.a(new String[]{!this.f ? String.valueOf(this.b) + "/" + this.d : GameStrings.cz, ai.IActionListener(this.l)}, this.B, this.C - 20 - bl.a[this.a][4]);
            } else if (this.b == this.d && !this.f) {
                this.dm.a(new String[]{GameStrings.cJ, String.valueOf(this.b) + "/" + this.d}, this.B, this.C - 20 - bl.a[this.a][4]);
            }
        }
        if (this.l >= 0 && this.b < this.d || this.l >= 0 && this.f) {
            this.dm.c[this.dm.c.length - 1] = ai.IActionListener(this.l);
        }
        if (this.k) {
            this.dm.j = false;
            at.a(98, this.B + this.g[this.b - 1] - bl.a[this.a][3] / 2, this.C + this.h[this.b - 1] - bl.a[this.a][4], 1);
            --this.b;
            if (main.GameCanvas.w % 2 == 0) {
                SettingsManager.a();
            }
            if (this.b == this.c) {
                this.dm.j = true;
                this.i = true;
                this.k = false;
            }
        }
        super.a();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            GameService.a().e((byte)1);
        }
    }
}

