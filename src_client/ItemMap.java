/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class ItemMap
implements bq {
    public int LoginScreen;
    public int b;
    private int g;
    private int Item;
    private int i;
    private int j;
    public int c;
    public int d;
    public dd e;
    private byte k;
    private int Res;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int[] r;
    private int[] SessionReceiver;
    private int[] MyHashtable;
    private int[] u;
    private int v;
    private int w;
    public static Image f = Res.loadImage("/mainImage/myTexture2dflare.png");
    private static Image x = Res.loadImage("/mainImage/myTexture2ditemaura1.png");
    private static Image Message = Res.loadImage("/mainImage/myTexture2ditemaura2.png");
    private static Image z = Res.loadImage("/mainImage/myTexture2ditemaura3.png");

    public ItemMap(short s2, short s3, int n2, int n3, int n4, int n5) {
        this.d = s2;
        this.e = dp.LoginScreen(s3);
        this.LoginScreen = n4;
        this.b = n3;
        this.g = n4;
        this.Item = n5;
        this.i = n4 - n2 >> 2;
        this.j = 5;
    }

    public ItemMap(int n2, short s2, short s3, int n3, int n4, short s4) {
        this.d = s2;
        this.e = dp.LoginScreen(s3);
        this.LoginScreen = this.g = n3;
        this.b = this.Item = n4;
        this.k = 1;
        this.c = n2;
        if (this.b()) {
            this.Res = s4;
            ItemMap ce2 = this;
            this.m = ce2.LoginScreen;
            ce2.n = ce2.b;
            ce2.q = 120;
            ce2.o = 0;
            if (!GameCanvas.isLowGraphic) {
                ce2.GameScreen = 360 / ce2.q;
                ce2.r = new int[ce2.q];
                ce2.SessionReceiver = new int[ce2.q];
                ce2.MyHashtable = new int[ce2.q];
                ce2.u = new int[ce2.q];
                ce2.c();
            }
        }
    }

    public final void methodLoginScreen(int n2, int n3) {
        this.g = n2;
        this.Item = n3;
        this.i = n2 - this.LoginScreen >> 2;
        this.j = n3 - this.b >> 2;
        this.k = (byte)2;
    }

    public final void methodLoginScreen() {
        if (this.k == 2 && this.LoginScreen == this.g && this.b == this.Item) {
            GameScreen.E.removeElement(this);
            if (Char.e().aV != null && Char.e().aV.equals(this)) {
                Char.e().aV = null;
            }
            return;
        }
        if (this.k > 0) {
            if (this.i == 0) {
                this.LoginScreen = this.g;
            }
            if (this.j == 0) {
                this.b = this.Item;
            }
            if (this.LoginScreen != this.g) {
                this.LoginScreen += this.i;
                if (this.i > 0 && this.LoginScreen > this.g || this.i < 0 && this.LoginScreen < this.g) {
                    this.LoginScreen = this.g;
                }
            }
            if (this.b != this.Item) {
                this.b += this.j;
                if (this.j > 0 && this.b > this.Item || this.j < 0 && this.b < this.Item) {
                    this.b = this.Item;
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
            ItemMap ce2 = this;
            ++ce2.v;
            ++ce2.w;
            if (ce2.w >= 40) {
                ce2.w = 0;
            }
            if (ce2.v >= ce2.q) {
                ce2.v = 0;
            }
            if (ce2.v % 10 == 0 && !GameCanvas.isLowGraphic) {
                at.LoginScreen(114, ce2.LoginScreen - 5, ce2.b - 30, 1);
            }
        }
    }

    public final void methodLoginScreen(mGraphics object) {
        if (this.b()) {
            ((mGraphics)object).LoginScreen(bv.x, this.LoginScreen + 3, this.b, 3);
            if (this.k <= 0) {
                if (this.w < 10) {
                    ((mGraphics)object).LoginScreen(x, this.LoginScreen, this.b + this.k + 3, 33);
                } else {
                    ((mGraphics)object).LoginScreen(Message, this.LoginScreen, this.b + this.k + 3, 33);
                }
            } else if (this.w < 10) {
                ((mGraphics)object).LoginScreen(x, this.LoginScreen, this.b + 3, 33);
            } else {
                ((mGraphics)object).LoginScreen(Message, this.LoginScreen, this.b + 3, 33);
            }
            mGraphics en2 = object;
            object = this;
            if (!GameCanvas.isLowGraphic && super.b()) {
                int n2 = 0;
                while (n2 < ((ItemMap)object).SessionReceiver.length) {
                    if (((ItemMap)object).v == n2) {
                        if (((ItemMap)object).w <= 20) {
                            en2.LoginScreen(z, ((ItemMap)object).MyHashtable[n2], ((ItemMap)object).u[n2] + 3, 33);
                        } else {
                            bl.b(en2, ((ItemMap)object).e.f, ((ItemMap)object).MyHashtable[n2], ((ItemMap)object).u[n2] + 3, 0, 33);
                        }
                    }
                    ++n2;
                }
            }
            return;
        }
        if (!this.b()) {
            if (GameCanvas.w % 4 == 0) {
                ((mGraphics)object).LoginScreen(f, this.LoginScreen, this.b + this.k + 13, 33);
            }
            if (this.k <= 0) {
                bl.b((mGraphics)object, this.e.f, this.LoginScreen, this.b + this.k + 3, 0, 33);
            } else {
                bl.b((mGraphics)object, this.e.f, this.LoginScreen, this.b + 3, 0, 33);
            }
            if (Char.e().aV != null && Char.e().aV.equals(this) && this.k != 2) {
                ((mGraphics)object).LoginScreen(Mob.R, 0, 24, 9, 6, 0, this.LoginScreen, this.b - 17, 3);
            }
        }
    }

    private boolean b() {
        boolean bl2 = this.e.b == 22;
        return bl2;
    }

    private void c() {
        if (!GameCanvas.isLowGraphic) {
            int n2 = 0;
            while (n2 < this.SessionReceiver.length) {
                this.SessionReceiver[n2] = ds.g(this.Res * ds.LoginScreen(this.o) / 1024);
                this.r[n2] = ds.g(this.Res * ds.b(this.o) / 1024);
                if (this.o < 90) {
                    this.MyHashtable[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n - this.SessionReceiver[n2];
                } else if (this.o >= 90 && this.o < 180) {
                    this.MyHashtable[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n - this.SessionReceiver[n2];
                } else if (this.o >= 180 && this.o < 270) {
                    this.MyHashtable[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n + this.SessionReceiver[n2];
                } else {
                    this.MyHashtable[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n + this.SessionReceiver[n2];
                }
                this.o += this.GameScreen;
                ++n2;
            }
        }
    }

    public final int Res() {
        return this.LoginScreen;
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

