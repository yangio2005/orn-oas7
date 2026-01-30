/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class ce
implements bq {
    public int a;
    public int IActionListener;
    private int UIPanel;
    private int h;
    private int i;
    private int j;
    public int c;
    public int d;
    public dd e;
    private byte k;
    private int ResourceUtil;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int[] r;
    private int[] s;
    private int[] t;
    private int[] u;
    private int v;
    private int w;
    public static Image f = ResourceUtil.IActionListener("/mainImage/myTexture2dflare.png");
    private static Image x = ResourceUtil.IActionListener("/mainImage/myTexture2ditemaura1.png");
    private static Image Message = ResourceUtil.IActionListener("/mainImage/myTexture2ditemaura2.png");
    private static Image z = ResourceUtil.IActionListener("/mainImage/myTexture2ditemaura3.png");

    public ce(short s2, short s3, int n2, int n3, int n4, int n5) {
        this.d = s2;
        this.e = dp.a(s3);
        this.a = n4;
        this.b = n3;
        this.g = n4;
        this.h = n5;
        this.i = n4 - n2 >> 2;
        this.j = 5;
    }

    public ce(int n2, short s2, short s3, int n3, int n4, short s4) {
        this.d = s2;
        this.e = dp.a(s3);
        this.a = this.g = n3;
        this.b = this.h = n4;
        this.k = 1;
        this.c = n2;
        if (this.b()) {
            this.l = s4;
            ce ce2 = this;
            this.m = ce2.a;
            ce2.n = ce2.IActionListener;
            ce2.q = 120;
            ce2.o = 0;
            if (!main.GameCanvas.a) {
                ce2.GameScreen = 360 / ce2.q;
                ce2.r = new int[ce2.q];
                ce2.s = new int[ce2.q];
                ce2.t = new int[ce2.q];
                ce2.u = new int[ce2.q];
                ce2.c();
            }
        }
    }

    public final void a(int n2, int n3) {
        this.g = n2;
        this.h = n3;
        this.i = n2 - this.a >> 2;
        this.j = n3 - this.b >> 2;
        this.k = (byte)2;
    }

    public final void a() {
        if (this.k == 2 && this.a == this.g && this.b == this.h) {
            GameScreen.E.removeElement(this);
            if (GameWorld.e().aV != null && GameWorld.e().aV.equals(this)) {
                GameWorld.e().aV = null;
            }
            return;
        }
        if (this.k > 0) {
            if (this.i == 0) {
                this.a = this.g;
            }
            if (this.j == 0) {
                this.b = this.h;
            }
            if (this.a != this.g) {
                this.a += this.i;
                if (this.i > 0 && this.a > this.g || this.i < 0 && this.a < this.g) {
                    this.a = this.g;
                }
            }
            if (this.b != this.h) {
                this.b += this.j;
                if (this.j > 0 && this.b > this.h || this.j < 0 && this.b < this.h) {
                    this.b = this.h;
                }
            }
        } else {
            this.k = (byte)(this.k - 4);
            if (this.k < -12) {
                this.b -= 12;
                this.k = 1;
            }
        }
        if (this.b()) {
            ce ce2 = this;
            ++ce2.v;
            ++ce2.w;
            if (ce2.w >= 40) {
                ce2.w = 0;
            }
            if (ce2.v >= ce2.q) {
                ce2.v = 0;
            }
            if (ce2.v % 10 == 0 && !main.GameCanvas.a) {
                at.a(114, ce2.a - 5, ce2.IActionListener - 30, 1);
            }
        }
    }

    public final void a(MGraphics object) {
        if (this.b()) {
            ((MGraphics)object).a(bv.x, this.a + 3, this.b, 3);
            if (this.k <= 0) {
                if (this.w < 10) {
                    ((MGraphics)object).a(x, this.a, this.b + this.k + 3, 33);
                } else {
                    ((MGraphics)object).a(Message, this.a, this.b + this.k + 3, 33);
                }
            } else if (this.w < 10) {
                ((MGraphics)object).a(x, this.a, this.b + 3, 33);
            } else {
                ((MGraphics)object).a(Message, this.a, this.b + 3, 33);
            }
            MGraphics en2 = object;
            object = this;
            if (!main.GameCanvas.a && super.IActionListener()) {
                int n2 = 0;
                while (n2 < ((ce)object).s.length) {
                    if (((ce)object).v == n2) {
                        if (((ce)object).w <= 20) {
                            en2.a(z, ((ce)object).t[n2], ((ce)object).u[n2] + 3, 33);
                        } else {
                            bl.IActionListener(en2, ((ce)object).e.f, ((ce)object).t[n2], ((ce)object).u[n2] + 3, 0, 33);
                        }
                    }
                    ++n2;
                }
            }
            return;
        }
        if (!this.b()) {
            if (main.GameCanvas.w % 4 == 0) {
                ((MGraphics)object).a(f, this.a, this.b + this.k + 13, 33);
            }
            if (this.k <= 0) {
                bl.IActionListener((MGraphics)object, this.e.f, this.a, this.b + this.k + 3, 0, 33);
            } else {
                bl.IActionListener((MGraphics)object, this.e.f, this.a, this.b + 3, 0, 33);
            }
            if (GameWorld.e().aV != null && GameWorld.e().aV.equals(this) && this.k != 2) {
                ((MGraphics)object).a(aa.R, 0, 24, 9, 6, 0, this.a, this.b - 17, 3);
            }
        }
    }

    private boolean IActionListener() {
        boolean bl2 = this.e.IActionListener == 22;
        return bl2;
    }

    private void c() {
        if (!main.GameCanvas.a) {
            int n2 = 0;
            while (n2 < this.s.length) {
                this.s[n2] = MathUtil.UIPanel(this.l * MathUtil.a(this.o) / 1024);
                this.r[n2] = MathUtil.UIPanel(this.l * MathUtil.IActionListener(this.o) / 1024);
                if (this.o < 90) {
                    this.t[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n - this.s[n2];
                } else if (this.o >= 90 && this.o < 180) {
                    this.t[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n - this.s[n2];
                } else if (this.o >= 180 && this.o < 270) {
                    this.t[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n + this.s[n2];
                } else {
                    this.t[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n + this.s[n2];
                }
                this.o += this.GameScreen;
                ++n2;
            }
        }
    }

    public final int ResourceUtil() {
        return this.a;
    }

    public final int m() {
        return this.b;
    }

    public final int n() {
        return 20;
    }

    public final int o() {
        return 20;
    }

    public final void GameScreen() {
    }

    public final boolean q() {
        return false;
    }
}

