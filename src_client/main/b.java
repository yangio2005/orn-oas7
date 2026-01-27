/*
 * Decompiled with CFR 0.152.
 */
package main;


public final class b {
    private int e;
    private int f;
    private int g;
    private int Item;
    private int i;
    private int j;
    private int k = 28;
    private int Res;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private int SessionReceiver;
    private int MyHashtable;
    public int LoginScreen;
    private int u;
    private boolean v = false;
    public boolean b;
    public boolean c;
    public boolean d;

    public b() {
        if (GameCanvas.A < 300) {
            this.b = true;
            this.c = false;
            this.d = false;
        }
        if (GameCanvas.A >= 300 && GameCanvas.A <= 380) {
            this.b = false;
            this.c = true;
            this.d = false;
        }
        if (GameCanvas.A > 380) {
            this.b = false;
            this.c = false;
            this.d = true;
        }
        if (!this.d) {
            this.SessionReceiver = 0;
            this.LoginScreen = GameCanvas.C;
            this.MyHashtable = GameCanvas.D >> 1;
            this.u = GameCanvas.B - 80;
            return;
        }
        this.SessionReceiver = 0;
        this.LoginScreen = GameCanvas.C / 4 * 3 - 20;
        this.MyHashtable = GameCanvas.D >> 1;
        this.u = GameCanvas.B;
        if (Res.clientType == 2) {
            this.SessionReceiver = 0;
            this.MyHashtable = (GameCanvas.B >> 1) + 40;
            this.LoginScreen = GameCanvas.C / 4 * 3 - 40;
            this.u = GameCanvas.B;
        }
    }

    public final void methodLoginScreen() {
        block26: {
            try {
                if (GameScreen.aO == 0) {
                    return;
                }
                if (GameCanvas.k && !GameCanvas.m) {
                    boolean bl2;
                    block27: {
                        this.m = GameCanvas.r;
                        this.n = GameCanvas.SessionReceiver;
                        if (this.m < 0 || this.m > this.LoginScreen || this.n < this.MyHashtable || this.n > this.u) break block26;
                        if (!this.v) {
                            this.e = this.g = this.m;
                            this.f = this.Item = this.n;
                        }
                        this.v = true;
                        this.o = GameCanvas.GameScreen - this.e;
                        this.GameScreen = GameCanvas.q - this.f;
                        this.q = ds.e(this.o, 2) + ds.e(this.GameScreen, 2);
                        this.Res = ds.f(this.q);
                        if (ds.g(this.o) <= 4 && ds.g(this.GameScreen) <= 4) break block26;
                        this.r = ds.LoginScreen(this.o, this.GameScreen);
                        if (!GameCanvas.isLowGraphic(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k)) {
                            if (this.Res != 0) {
                                this.Item = this.GameScreen * this.k / this.Res;
                                this.g = this.o * this.k / this.Res;
                                this.g += this.e;
                                this.Item += this.f;
                                if (!ds.LoginScreen(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k, this.g, this.Item)) {
                                    this.g = this.i;
                                    this.Item = this.j;
                                } else {
                                    this.i = this.g;
                                    this.j = this.Item;
                                }
                            } else {
                                this.g = this.i;
                                this.Item = this.j;
                            }
                        } else {
                            this.g = GameCanvas.GameScreen;
                            this.Item = GameCanvas.q;
                        }
                        GameCanvas.resetKeys();
                        int n2 = 2;
                        if (GameScreen.aO == 0) {
                            bl2 = false;
                        } else if (Char.e().H == 3) {
                            bl2 = true;
                        } else {
                            n2 = 2;
                            while (n2 > 0) {
                                int n3 = GameCanvas.v[n2].LoginScreen - GameCanvas.v[n2 - 1].LoginScreen;
                                int n4 = GameCanvas.v[n2].b - GameCanvas.v[n2 - 1].b;
                                if (ds.g(n3) > 2 && ds.g(n4) > 2) {
                                    bl2 = false;
                                    break block27;
                                }
                                --n2;
                            }
                            bl2 = true;
                        }
                    }
                    if (bl2) {
                        if (this.r <= 360 && this.r >= 340 || this.r >= 0 && this.r <= 20) {
                            GameCanvas.j[6] = true;
                            GameCanvas.i[6] = true;
                            return;
                        }
                        if (this.r > 40 && this.r < 70) {
                            GameCanvas.j[6] = true;
                            GameCanvas.i[6] = true;
                            return;
                        }
                        if (this.r >= 70 && this.r <= 110) {
                            GameCanvas.j[8] = true;
                            GameCanvas.i[8] = true;
                            return;
                        }
                        if (this.r > 110 && this.r < 120) {
                            GameCanvas.j[4] = true;
                            GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r >= 120 && this.r <= 200) {
                            GameCanvas.j[4] = true;
                            GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r > 200 && this.r < 250) {
                            GameCanvas.j[2] = true;
                            GameCanvas.i[2] = true;
                            GameCanvas.j[4] = true;
                            GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r >= 250 && this.r <= 290) {
                            GameCanvas.j[2] = true;
                            GameCanvas.i[2] = true;
                            return;
                        }
                        if (this.r > 290 && this.r < 340) {
                            GameCanvas.j[2] = true;
                            GameCanvas.i[2] = true;
                            GameCanvas.j[6] = true;
                            GameCanvas.i[6] = true;
                            return;
                        }
                        break block26;
                    }
                    GameCanvas.resetKeys();
                    return;
                }
                this.e = 45;
                this.g = 45;
                this.Item = !this.d ? (this.f = GameCanvas.B - 90) : (this.f = GameCanvas.B - 45);
                this.v = false;
                GameCanvas.resetKeys();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (GameScreen.aO == 0) {
            return;
        }
        this.SessionReceiver = 0;
        this.MyHashtable = (GameCanvas.B >> 1) + 40;
        this.LoginScreen = GameCanvas.C / 4 * 3 - 40;
        this.u = GameCanvas.B;
        en2.LoginScreen(GameScreen.aA, this.e, this.f, 3);
        en2.LoginScreen(GameScreen.aB, this.g, this.Item, 3);
    }

    public final boolean b() {
        if (GameScreen.aO == 0) {
            return false;
        }
        return this.v;
    }

    public final boolean c() {
        block3: {
            try {
                if (GameScreen.aO != 0) break block3;
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        boolean bl2 = GameCanvas.GameScreen >= 0 && GameCanvas.GameScreen <= 0 + this.LoginScreen && GameCanvas.q >= this.MyHashtable && GameCanvas.q <= this.MyHashtable + this.u || GameCanvas.GameScreen >= 0 && GameCanvas.GameScreen <= GameCanvas.A && GameCanvas.q >= this.MyHashtable && GameCanvas.q <= this.MyHashtable + this.u || GameCanvas.GameScreen >= GameCanvas.A - 50;
        return bl2;
    }
}

