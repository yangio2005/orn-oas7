import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class dv {
    public int LoginScreen;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int Item;
    private int GameScreen;
    private int q;
    public int i;
    public int j;
    public int k;
    public int Res;
    private int r;
    private int SessionReceiver;
    private int[] MyHashtable = new int[3];
    public boolean m;
    private boolean u;
    private int v;
    public int n;
    public int o;
    private int w;
    private boolean x = true;

    public final ca LoginScreen() {
        int n2;
        if (this.x) {
            int n3 = 0;
            dv dv2 = this;
            int n4 = dv2.GameScreen;
            int n5 = dv2.q;
            int n6 = dv2.i;
            int n7 = dv2.j;
            if (GameCanvas.k) {
                if (!dv2.m && GameCanvas.b(n4, n5, n6, n7)) {
                    n6 = 0;
                    while (n6 < dv2.MyHashtable.length) {
                        dv2.MyHashtable[0] = GameCanvas.q;
                        ++n6;
                    }
                    dv2.SessionReceiver = GameCanvas.q;
                    dv2.m = true;
                    dv2.n = -1;
                    dv2.u = dv2.v != 0;
                    dv2.v = 0;
                } else if (dv2.m) {
                    ++dv2.r;
                    if (dv2.r > 5 && dv2.SessionReceiver == GameCanvas.q && !dv2.u) {
                        dv2.SessionReceiver = -1000;
                        if (dv2.w > 1) {
                            n6 = (dv2.b + GameCanvas.q - n5) / dv2.o;
                            n3 = (dv2.LoginScreen + GameCanvas.GameScreen - n4) / dv2.o;
                            dv2.n = n6 * dv2.w + n3;
                        } else {
                            dv2.n = (dv2.b + GameCanvas.q - n5) / dv2.o;
                        }
                    }
                    if ((n6 = GameCanvas.q - dv2.MyHashtable[0]) != 0 && dv2.n != -1) {
                        dv2.n = -1;
                    }
                    n3 = dv2.MyHashtable.length - 1;
                    while (n3 > 0) {
                        dv2.MyHashtable[n3] = dv2.MyHashtable[n3 - 1];
                        --n3;
                    }
                    dv2.MyHashtable[0] = GameCanvas.q;
                    dv2.b -= n6;
                    if (dv2.b < 0) {
                        dv2.b = 0;
                    }
                    if (dv2.b > dv2.Res) {
                        dv2.b = dv2.Res;
                    }
                    if (dv2.d < 0 || dv2.d > dv2.Res) {
                        n6 /= 2;
                    }
                    dv2.d -= n6;
                }
            }
            n6 = 0;
            if (GameCanvas.m && dv2.m) {
                n3 = GameCanvas.q - dv2.MyHashtable[0];
                GameCanvas.m = false;
                if (ds.g(n3) < 20 && ds.g(GameCanvas.q - dv2.SessionReceiver) < 20 && !dv2.u) {
                    dv2.v = 0;
                    dv2.b = dv2.d;
                    dv2.SessionReceiver = -1000;
                    if (dv2.w > 1) {
                        n3 = (dv2.b + GameCanvas.q - n5) / dv2.o;
                        n4 = (dv2.LoginScreen + GameCanvas.GameScreen - n4) / dv2.o;
                        dv2.n = n3 * dv2.w + n4;
                    } else {
                        dv2.n = (dv2.b + GameCanvas.q - n5) / dv2.o;
                    }
                    dv2.r = 0;
                    n6 = 1;
                } else if (dv2.n != -1 && dv2.r > 5) {
                    dv2.r = 0;
                    n6 = 1;
                } else if (dv2.n == -1 && !dv2.u) {
                    if (dv2.d < 0) {
                        dv2.b = 0;
                    } else if (dv2.d > dv2.Res) {
                        dv2.b = dv2.Res;
                    } else {
                        n3 = GameCanvas.q - dv2.MyHashtable[0] + (dv2.MyHashtable[0] - dv2.MyHashtable[1]) + (dv2.MyHashtable[1] - dv2.MyHashtable[2]);
                        n3 = n3 > 10 ? 10 : (n3 < -10 ? -10 : 0);
                        dv2.v = -n3 * 100;
                    }
                }
                dv2.m = false;
                dv2.r = 0;
                GameCanvas.m = false;
            }
            ca ca2 = new ca();
            new ca().b = dv2.n;
            ca2.c = n6;
            ca2.LoginScreen = dv2.m;
            return ca2;
        }
        dv dv3 = this;
        int n8 = dv3.GameScreen;
        int n9 = dv3.q;
        int n10 = dv3.i;
        int n11 = dv3.j;
        if (GameCanvas.k) {
            if (!dv3.m && GameCanvas.b(n8, n9, n10, n11)) {
                n2 = 0;
                while (n2 < dv3.MyHashtable.length) {
                    dv3.MyHashtable[0] = GameCanvas.GameScreen;
                    ++n2;
                }
                dv3.SessionReceiver = GameCanvas.GameScreen;
                dv3.m = true;
                dv3.n = -1;
                dv3.u = dv3.v != 0;
                dv3.v = 0;
            } else if (dv3.m) {
                ++dv3.r;
                if (dv3.r > 5 && dv3.SessionReceiver == GameCanvas.GameScreen && !dv3.u) {
                    dv3.SessionReceiver = -1000;
                    dv3.n = (dv3.LoginScreen + GameCanvas.GameScreen - n8) / dv3.o;
                }
                if ((n2 = GameCanvas.GameScreen - dv3.MyHashtable[0]) != 0 && dv3.n != -1) {
                    dv3.n = -1;
                }
                n11 = dv3.MyHashtable.length - 1;
                while (n11 > 0) {
                    dv3.MyHashtable[n11] = dv3.MyHashtable[n11 - 1];
                    --n11;
                }
                dv3.MyHashtable[0] = GameCanvas.GameScreen;
                dv3.LoginScreen -= n2;
                if (dv3.LoginScreen < 0) {
                    dv3.LoginScreen = 0;
                }
                if (dv3.LoginScreen > dv3.k) {
                    dv3.LoginScreen = dv3.k;
                }
                if (dv3.c < 0 || dv3.c > dv3.k) {
                    n2 /= 2;
                }
                dv3.c -= n2;
            }
        }
        n2 = 0;
        if (GameCanvas.m && dv3.m) {
            n11 = GameCanvas.GameScreen - dv3.MyHashtable[0];
            GameCanvas.m = false;
            if (ds.g(n11) < 20 && ds.g(GameCanvas.GameScreen - dv3.SessionReceiver) < 20 && !dv3.u) {
                dv3.v = 0;
                dv3.LoginScreen = dv3.c;
                dv3.SessionReceiver = -1000;
                dv3.n = (dv3.LoginScreen + GameCanvas.GameScreen - n8) / dv3.o;
                dv3.r = 0;
                n2 = 1;
            } else if (dv3.n != -1 && dv3.r > 5) {
                dv3.r = 0;
                n2 = 1;
            } else if (dv3.n == -1 && !dv3.u) {
                if (dv3.c < 0) {
                    dv3.LoginScreen = 0;
                } else if (dv3.c > dv3.k) {
                    dv3.LoginScreen = dv3.k;
                } else {
                    n8 = GameCanvas.GameScreen - dv3.MyHashtable[0] + (dv3.MyHashtable[0] - dv3.MyHashtable[1]) + (dv3.MyHashtable[1] - dv3.MyHashtable[2]);
                    n8 = n8 > 10 ? 10 : (n8 < -10 ? -10 : 0);
                    dv3.v = -n8 * 100;
                }
            }
            dv3.m = false;
            dv3.r = 0;
            GameCanvas.m = false;
        }
        ca ca3 = new ca();
        new ca().b = dv3.n;
        ca3.c = n2;
        ca3.LoginScreen = dv3.m;
        return ca3;
    }

    public final void b() {
        if (this.v != 0 && !this.m) {
            if (this.x) {
                this.b += this.v / 100;
                if (this.b < 0) {
                    this.b = 0;
                } else if (this.b > this.Res) {
                    this.b = this.Res;
                } else {
                    this.d = this.b;
                }
            } else {
                this.LoginScreen += this.v / 100;
                if (this.LoginScreen < 0) {
                    this.LoginScreen = 0;
                } else if (this.LoginScreen > this.k) {
                    this.LoginScreen = this.k;
                } else {
                    this.c = this.LoginScreen;
                }
            }
            this.v = this.v * 9 / 10;
            if (this.v < 100 && this.v > -100) {
                this.v = 0;
            }
        }
        if (this.c != this.LoginScreen && !this.m) {
            this.e = this.LoginScreen - this.c << 2;
            this.g += this.e;
            this.c += this.g >> 4;
            this.g &= 0xF;
        }
        if (this.d != this.b && !this.m) {
            this.f = this.b - this.d << 2;
            this.Item += this.f;
            this.d += this.Item >> 4;
            this.Item &= 0xF;
        }
    }

    public final void methodLoginScreen(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, int n8) {
        this.GameScreen = n4;
        this.q = n5;
        this.o = n3;
        this.i = n6;
        this.j = n7;
        this.x = true;
        this.w = 1;
        n4 = n2;
        if (false) {
            ++n4;
        }
        this.Res = n4 * n3 - n7;
        if (this.Res < 0) {
            this.Res = 0;
        }
        if (this.k < 0) {
            this.k = 0;
        }
    }

    public final void methodLoginScreen(int n2) {
        if (this.x) {
            this.b = n2 -= (this.j - this.o) / 2;
            if (this.b < 0) {
                this.b = 0;
            }
            if (this.b > this.Res) {
                this.b = this.Res;
                return;
            }
        } else {
            this.LoginScreen = n2 -= (this.i - this.o) / 2;
            if (this.LoginScreen < 0) {
                this.LoginScreen = 0;
            }
            if (this.LoginScreen > this.k) {
                this.LoginScreen = this.k;
            }
        }
    }
}

