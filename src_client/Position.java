import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class Position {
    public int[][] LoginScreen = new int[3][];
    public ej b = new ej();
    private int j;
    private int k;
    private int Res;
    private int m;
    public int c;
    private int n;
    private int o;
    private int GameScreen;
    public int d;
    private int q;
    private int r;
    public boolean e;
    public boolean f = true;
    public int g;
    public int Item;
    public de i;

    public Position() {
        int n2 = 0;
        while (n2 < this.LoginScreen.length) {
            this.LoginScreen[n2] = new int[3];
            ++n2;
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (this.equals(GameScreen.aE) && GameScreen.j().u()) {
            return;
        }
        if (this.equals(GameScreen.aE) && GameScreen.j().bQ != null) {
            return;
        }
        if (!GameScreen.GameService) {
            return;
        }
        if (GameCanvas.currentScreen != GameScreen.j() && GameCanvas.currentScreen != ar.LoginScreen()) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        if (Char.bG) {
            return;
        }
        if (GameCanvas.G.LoginScreen && this.equals(GameScreen.aE)) {
            return;
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (this.b != null) {
            this.b.LoginScreen(en2, this.d, this.c, this.j);
        }
        if (this.b.b != null && this.b.b.c == null && this.LoginScreen != null) {
            bl.b(en2, this.LoginScreen[Char.e().K][this.k], this.d, this.c + 3 + (GameCanvas.w % 10 > 5 ? 1 : 0), this.j == 1 ? 0 : 2, cj.f);
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
    }

    public final void methodLoginScreen() {
        if (this.b != null && this.b.LoginScreen != null && this.b.LoginScreen.size() == 0 && this.c != -40) {
            --this.b.f;
            if (this.b.f <= 0) {
                this.c = -40;
                this.b.e = 0;
                this.b.LoginScreen.removeAllElements();
                this.b.d = null;
                this.b.f = 200;
            }
        }
        if (this.equals(GameScreen.aE) && GameScreen.j().bQ != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        Object object = this;
        if (((Position)object).c != ((Position)object).m) {
            ((Position)object).o = ((Position)object).m - ((Position)object).c << 2;
            ((Position)object).n += ((Position)object).o;
            ((Position)object).c += ((Position)object).n >> 4;
            ((Position)object).n &= 0xF;
        }
        if (((Position)object).d != ((Position)object).GameScreen) {
            ((Position)object).r = ((Position)object).GameScreen - ((Position)object).d << 2;
            ((Position)object).q += ((Position)object).r;
            ((Position)object).d += ((Position)object).q >> 4;
            ((Position)object).q &= 0xF;
        }
        ++((Position)object).Res;
        if (((Position)object).Res == 5) {
            ((Position)object).Res = 0;
            ((Position)object).k = ((Position)object).k == 0 ? 1 : 0;
        }
        if (this.b == null) {
            return;
        }
        if (this.b != null && this.b.b == null) {
            return;
        }
        if (!this.e) {
            if (this.g > 0) {
                --this.g;
                if (this.g == 0) {
                    GameCanvas.G.Res();
                    GameCanvas.G.SessionReceiver();
                }
            }
            if (GameCanvas.w % 3 == 0) {
                if (Char.e().I == 1) {
                    this.GameScreen = Char.e().B - 20 - GameScreen.j;
                }
                if (Char.e().I == -1) {
                    this.GameScreen = Char.e().B + 20 - GameScreen.j;
                }
                if (this.GameScreen <= 24) {
                    this.GameScreen += this.b.c / 2;
                }
                if (this.GameScreen >= GameCanvas.A - 24) {
                    this.GameScreen -= this.b.c / 2;
                }
                this.m = Char.e().C - 40 - GameScreen.k;
                if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                    this.m = (this.b.d.length + 1) * 12 + 10;
                }
                if (this.b.b.c != null) {
                    if (GameCanvas.A - 50 > 155 + this.b.i) {
                        this.GameScreen = GameCanvas.A - 60 - this.b.i / 2;
                        this.m = this.b.j + 10;
                    } else {
                        this.GameScreen = GameCanvas.A - 20 - this.b.i / 2;
                        this.m = 45 + this.b.j;
                        if (GameCanvas.A > GameCanvas.B || GameCanvas.A < 220) {
                            this.GameScreen = GameCanvas.A - 20 - this.b.i / 2;
                            this.m = this.b.j + 10;
                        }
                    }
                }
            }
            this.j = this.d > Char.e().B - GameScreen.j ? -1 : 1;
        }
        if (this.b.b != null) {
            if (this.b.LoginScreen.size() > 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.b.e = 0;
                        this.b.LoginScreen.removeElementAt(0);
                        this.b.b = object = (r)this.b.LoginScreen.firstElement();
                        this.b.c();
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.Item >= 1000L) {
                        this.b.b.Item = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.b.LoginScreen.removeElementAt(0);
                        if (this.b.LoginScreen.size() == 0) {
                            return;
                        }
                        this.b.b = object = (r)this.b.LoginScreen.firstElement();
                        this.b.c();
                        return;
                    }
                }
            } else if (this.b.LoginScreen.size() == 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.e = true;
                    }
                    if (this.b.e == this.b.b.b) {
                        this.m = -40;
                        this.GameScreen = Char.e().B - GameScreen.j + (Char.e().I == 1 ? -20 : 20);
                    }
                    if (this.b.e >= this.b.b.b + 20) {
                        this.b.e = 0;
                        this.b.LoginScreen.removeAllElements();
                        this.b.d = null;
                        this.b.f = 200;
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.Item >= 1000L) {
                        this.b.b.Item = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.e = true;
                        this.m = -40;
                        this.GameScreen = Char.e().B - GameScreen.j + (Char.e().I == 1 ? -20 : 20);
                        this.b.e = 0;
                        this.b.LoginScreen.removeAllElements();
                        this.b.d = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final void methodLoginScreen(String string, Char af2, boolean bl2) {
        this.Item = af2.J;
        this.b.LoginScreen(string, 3, af2, bl2);
        this.e = false;
    }

    public final void methodLoginScreen(String string, int n2) {
        string = ds.LoginScreen(string);
        if (this.b.LoginScreen.size() > 0 && string.equals(((r)this.b.LoginScreen.lastElement()).LoginScreen)) {
            return;
        }
        if (this.b.LoginScreen.size() > 10) {
            int n3 = 0;
            while (n3 < 5) {
                this.b.LoginScreen.removeElementAt(0);
                ++n3;
            }
        }
        this.b.LoginScreen(string, n2, null, false);
        if (this.b.LoginScreen.size() == 1) {
            this.c = 0;
            this.d = Char.e().B - GameScreen.j + (Char.e().I == 1 ? -20 : 20);
        }
        this.e = false;
    }
}

