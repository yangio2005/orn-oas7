/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class au
extends Screen
implements b {
    private static au f;
    private static Image g;
    private static Image Item;
    public byte LoginScreen;
    private int i = 5;
    private int[] j = new int[this.o];
    private int[] k = new int[this.o];
    private int[] Res;
    private int[] m;
    private int n;
    private int o = 20;
    public short b;
    public short c;
    public long d;
    public long e;
    private boolean GameScreen;
    private boolean q;
    private int r;

    static {
        g = Res.loadImage("/mainImage/myTexture2dfutherShip.png");
        Item = Res.loadImage("/mainImage/taungam.png");
    }

    public au() {
        int n2 = 0;
        while (n2 < this.o) {
            this.j[n2] = ds.b(0, GameCanvas.A);
            this.k[n2] = n2 * (GameCanvas.B / this.o);
            ++n2;
        }
        this.Res = new int[this.o];
        this.m = new int[this.o];
        n2 = 0;
        while (n2 < this.o) {
            this.Res[n2] = ds.b(0, GameCanvas.A);
            this.m[n2] = n2 * (GameCanvas.B / this.o);
            ++n2;
        }
    }

    public static au LoginScreen() {
        if (f == null) {
            f = new au();
        }
        return f;
    }

    public final void b() {
        this.GameScreen = false;
        this.q = false;
        this.cn = Char.e().Y() > 0 && this.LoginScreen == 0 ? new de(T.ga, this, 1, null) : null;
        this.r = 0;
        super.b();
    }

    public final void methodLoginScreen(mGraphics en2) {
        en2.LoginScreen(this.LoginScreen == 0 ? 0 : 3056895);
        en2.d(0, 0, GameCanvas.A, GameCanvas.B);
        int n2 = 0;
        while (n2 < this.o) {
            en2.LoginScreen(this.LoginScreen == 0 ? 0xE1DEDE : 11140863);
            en2.d(this.j[n2], this.k[n2], 10, 2);
            ++n2;
        }
        if (this.LoginScreen == 0) {
            en2.LoginScreen(g, 0, 0, 72, 95, 7, this.n + this.r, GameCanvas.B / 2, 3);
        }
        if (this.LoginScreen == 1) {
            en2.LoginScreen(Item, 0, 0, 144, 79, 2, this.n + this.r, GameCanvas.B / 2, 3);
        }
        n2 = 0;
        while (n2 < this.o) {
            en2.LoginScreen(this.LoginScreen == 0 ? 0xE3E3E3 : 7536127);
            en2.d(this.Res[n2], this.m[n2], 18, 3);
            ++n2;
        }
        super.LoginScreen(en2);
    }

    public final void c() {
        if (this.LoginScreen == 0) {
            if (!this.GameScreen) {
                this.r = GameCanvas.A / 2 * this.b / this.c;
            }
        } else {
            this.r += 2;
        }
        MessageHandler.b = false;
        this.n = (((GameCanvas.A / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
        if (this.LoginScreen == 1) {
            this.n = 0;
        }
        int n2 = 0;
        while (n2 < this.o) {
            int n3 = n2;
            this.j[n3] = this.j[n3] - this.i / 2;
            if (this.j[n2] < -20) {
                this.j[n2] = GameCanvas.A;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.o) {
            int n4 = n2;
            this.Res[n4] = this.Res[n4] - this.i;
            if (this.Res[n2] < -20) {
                this.Res[n2] = GameCanvas.A;
            }
            ++n2;
        }
        if (GameCanvas.w % 3 == 0) {
            this.i += this.GameScreen ? 2 : 1;
        }
        if (this.i > (this.GameScreen ? 80 : 25)) {
            this.i = this.GameScreen ? 80 : 25;
        }
        this.e = System.currentTimeMillis();
        if (this.e - this.d >= 1000L) {
            this.b = (short)(this.b + 1);
            this.d = this.e;
        }
        if (this.GameScreen) {
            this.r += 3;
        }
        if (this.r >= GameCanvas.A / 2 + 30 && !this.q) {
            this.q = true;
            GameService.LoginScreen().u();
        }
        super.c();
    }

    public final void d() {
        super.d();
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1) {
            GameCanvas.isLowGraphic(T.gb, new de(T.ImageLoader, this, 2, null), new de(T.bo, this, 3, null));
        }
        if (n2 == 2 && Char.e().Y() > 0) {
            this.GameScreen = true;
            GameCanvas.instance();
            this.cn = null;
        }
        if (n2 == 3) {
            GameCanvas.instance();
        }
    }
}

