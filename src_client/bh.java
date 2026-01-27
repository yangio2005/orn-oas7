import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bh {
    private int d;
    private int e;
    private int f;
    private int g;
    private int Item;
    public int LoginScreen;
    public int b;
    public int c;
    private int i;
    private int j;
    private int[] k = new int[3];
    private boolean Res;
    private boolean m;
    private int n;
    private int o;
    private int GameScreen;

    public bh() {
    }

    public bh(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.f = n2;
        this.g = n3;
        this.d = n4;
        this.e = n5;
        this.c = 0;
        if (this.c < 0) {
            this.c = 0;
        }
    }

    public final void methodLoginScreen() {
        int n2;
        int n3;
        if (this.c <= 0) {
            return;
        }
        if (GameCanvas.k) {
            if (!this.Res && GameCanvas.b(this.f, this.g, this.d, this.e)) {
                n3 = 0;
                while (n3 < this.k.length) {
                    this.k[n3] = GameCanvas.q;
                    ++n3;
                }
                this.j = GameCanvas.q;
                this.Res = true;
                this.m = this.n != 0;
                this.n = 0;
            } else if (this.Res) {
                ++this.i;
                if (this.i > 5 && this.j == GameCanvas.q && !this.m) {
                    this.j = -1000;
                }
                if ((n3 = GameCanvas.q - this.k[0]) != 0 && this.Item != -1) {
                    this.Item = -1;
                }
                n2 = this.k.length - 1;
                while (n2 > 0) {
                    this.k[n2] = this.k[n2 - 1];
                    --n2;
                }
                this.k[0] = GameCanvas.q;
                this.LoginScreen -= n3;
                if (this.LoginScreen < 0) {
                    this.LoginScreen = 0;
                }
                if (this.LoginScreen > this.c) {
                    this.LoginScreen = this.c;
                }
                if (this.b < 0 || this.b > this.c) {
                    n3 /= 2;
                }
                this.b -= n3;
            }
        }
        if (GameCanvas.Res && this.Res) {
            n3 = GameCanvas.q - this.k[0];
            GameCanvas.Res = false;
            if (ds.g(n3) < 20 && ds.g(GameCanvas.q - this.j) < 20 && !this.m && GameCanvas.o) {
                this.n = 0;
                this.LoginScreen = this.b;
                this.j = -1000;
                this.i = 0;
            } else if (this.Item != -1 && this.i > 5) {
                this.i = 0;
            } else if (this.Item == -1 && !this.m) {
                if (this.b < 0) {
                    this.LoginScreen = 0;
                } else if (this.b > this.c) {
                    this.LoginScreen = this.c;
                } else {
                    n2 = GameCanvas.q - this.k[0] + (this.k[0] - this.k[1]) + (this.k[1] - this.k[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.n = -n2 * 100;
                }
            }
            this.Res = false;
            this.i = 0;
            GameCanvas.Res = false;
        }
        if (this.b <= 0) {
            this.b = 0;
        }
        if (this.b >= this.c) {
            this.b = this.c;
        }
    }

    public final void b() {
        if (this.n != 0 && !this.Res) {
            this.LoginScreen += this.n / 100;
            if (this.LoginScreen < 0) {
                this.LoginScreen = 0;
            } else if (this.LoginScreen > this.c) {
                this.LoginScreen = this.c;
            } else {
                this.b = this.LoginScreen;
            }
            this.n = this.n * 9 / 10;
            if (this.n < 100 && this.n > -100) {
                this.n = 0;
            }
        }
        if (this.b != this.LoginScreen && !this.Res) {
            this.o = this.LoginScreen - this.b << 2;
            this.GameScreen += this.o;
            this.b += this.GameScreen >> 4;
            this.GameScreen &= 0xF;
        }
    }
}

