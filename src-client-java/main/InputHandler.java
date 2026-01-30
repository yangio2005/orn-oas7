/*
 * Decompiled with CFR 0.152.
 */
package main;

import main.GameCanvas;

public final class IActionListener {
    private int e;
    private int f;
    private int UIPanel;
    private int h;
    private int i;
    private int j;
    private int k = 28;
    private int ResourceUtil;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private int s;
    private int t;
    public int a;
    private int u;
    private boolean v = false;
    public boolean IActionListener;
    public boolean c;
    public boolean d;

    public IActionListener() {
        if (main.GameCanvas.A < 300) {
            this.b = true;
            this.c = false;
            this.d = false;
        }
        if (main.GameCanvas.A >= 300 && main.GameCanvas.A <= 380) {
            this.b = false;
            this.c = true;
            this.d = false;
        }
        if (main.GameCanvas.A > 380) {
            this.b = false;
            this.c = false;
            this.d = true;
        }
        if (!this.d) {
            this.s = 0;
            this.a = main.GameCanvas.C;
            this.t = main.GameCanvas.D >> 1;
            this.u = main.GameCanvas.B - 80;
            return;
        }
        this.s = 0;
        this.a = main.GameCanvas.C / 4 * 3 - 20;
        this.t = main.GameCanvas.D >> 1;
        this.u = main.GameCanvas.B;
        if (ResourceUtil.c == 2) {
            this.s = 0;
            this.t = (main.GameCanvas.B >> 1) + 40;
            this.a = main.GameCanvas.C / 4 * 3 - 40;
            this.u = main.GameCanvas.B;
        }
    }

    public final void a() {
        block26: {
            try {
                if (GameScreen.aO == 0) {
                    return;
                }
                if (main.GameCanvas.k && !main.GameCanvas.m) {
                    boolean bl2;
                    block27: {
                        this.m = main.GameCanvas.r;
                        this.n = main.GameCanvas.s;
                        if (this.m < 0 || this.m > this.a || this.n < this.t || this.n > this.u) break block26;
                        if (!this.v) {
                            this.e = this.g = this.m;
                            this.f = this.h = this.n;
                        }
                        this.v = true;
                        this.o = main.GameCanvas.GameScreen - this.e;
                        this.GameScreen = main.GameCanvas.q - this.f;
                        this.q = MathUtil.e(this.o, 2) + MathUtil.e(this.GameScreen, 2);
                        this.l = MathUtil.f(this.q);
                        if (MathUtil.UIPanel(this.o) <= 4 && MathUtil.UIPanel(this.GameScreen) <= 4) break block26;
                        this.r = MathUtil.a(this.o, this.GameScreen);
                        if (!main.GameCanvas.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k)) {
                            if (this.l != 0) {
                                this.h = this.GameScreen * this.k / this.l;
                                this.g = this.o * this.k / this.l;
                                this.g += this.e;
                                this.h += this.f;
                                if (!MathUtil.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k, this.g, this.h)) {
                                    this.g = this.i;
                                    this.h = this.j;
                                } else {
                                    this.i = this.g;
                                    this.j = this.h;
                                }
                            } else {
                                this.g = this.i;
                                this.h = this.j;
                            }
                        } else {
                            this.g = main.GameCanvas.GameScreen;
                            this.h = main.GameCanvas.q;
                        }
                        main.GameCanvas.UIPanel();
                        int n2 = 2;
                        if (GameScreen.aO == 0) {
                            bl2 = false;
                        } else if (GameWorld.e().H == 3) {
                            bl2 = true;
                        } else {
                            n2 = 2;
                            while (n2 > 0) {
                                int n3 = main.GameCanvas.v[n2].a - main.GameCanvas.v[n2 - 1].a;
                                int n4 = main.GameCanvas.v[n2].IActionListener - main.GameCanvas.v[n2 - 1].IActionListener;
                                if (MathUtil.UIPanel(n3) > 2 && MathUtil.UIPanel(n4) > 2) {
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
                            main.GameCanvas.j[6] = true;
                            main.GameCanvas.i[6] = true;
                            return;
                        }
                        if (this.r > 40 && this.r < 70) {
                            main.GameCanvas.j[6] = true;
                            main.GameCanvas.i[6] = true;
                            return;
                        }
                        if (this.r >= 70 && this.r <= 110) {
                            main.GameCanvas.j[8] = true;
                            main.GameCanvas.i[8] = true;
                            return;
                        }
                        if (this.r > 110 && this.r < 120) {
                            main.GameCanvas.j[4] = true;
                            main.GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r >= 120 && this.r <= 200) {
                            main.GameCanvas.j[4] = true;
                            main.GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r > 200 && this.r < 250) {
                            main.GameCanvas.j[2] = true;
                            main.GameCanvas.i[2] = true;
                            main.GameCanvas.j[4] = true;
                            main.GameCanvas.i[4] = true;
                            return;
                        }
                        if (this.r >= 250 && this.r <= 290) {
                            main.GameCanvas.j[2] = true;
                            main.GameCanvas.i[2] = true;
                            return;
                        }
                        if (this.r > 290 && this.r < 340) {
                            main.GameCanvas.j[2] = true;
                            main.GameCanvas.i[2] = true;
                            main.GameCanvas.j[6] = true;
                            main.GameCanvas.i[6] = true;
                            return;
                        }
                        break block26;
                    }
                    main.GameCanvas.UIPanel();
                    return;
                }
                this.e = 45;
                this.g = 45;
                this.h = !this.d ? (this.f = main.GameCanvas.B - 90) : (this.f = main.GameCanvas.B - 45);
                this.v = false;
                main.GameCanvas.UIPanel();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void a(MGraphics en2) {
        if (GameScreen.aO == 0) {
            return;
        }
        this.s = 0;
        this.t = (main.GameCanvas.B >> 1) + 40;
        this.a = main.GameCanvas.C / 4 * 3 - 40;
        this.u = main.GameCanvas.B;
        en2.a(GameScreen.aA, this.e, this.f, 3);
        en2.a(GameScreen.aB, this.g, this.h, 3);
    }

    public final boolean IActionListener() {
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
        boolean bl2 = main.GameCanvas.GameScreen >= 0 && main.GameCanvas.GameScreen <= 0 + this.a && main.GameCanvas.q >= this.t && main.GameCanvas.q <= this.t + this.u || main.GameCanvas.GameScreen >= 0 && main.GameCanvas.GameScreen <= main.GameCanvas.A && main.GameCanvas.q >= this.t && main.GameCanvas.q <= this.t + this.u || main.GameCanvas.GameScreen >= main.GameCanvas.A - 50;
        return bl2;
    }
}

