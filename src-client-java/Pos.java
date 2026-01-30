/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class Pos {
    public int[][] a = new int[3][];
    public ej IActionListener = new ej();
    private int j;
    private int k;
    private int ResourceUtil;
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
    public int UIPanel;
    public int h;
    public Command i;

    public Pos() {
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2] = new int[3];
            ++n2;
        }
    }

    public final void a(MGraphics en2) {
        if (this.equals(GameScreen.aE) && GameScreen.j().u()) {
            return;
        }
        if (this.equals(GameScreen.aE) && GameScreen.j().bQ != null) {
            return;
        }
        if (!GameScreen.GameService) {
            return;
        }
        if (main.GameCanvas.E != GameScreen.j() && main.GameCanvas.E != ar.a()) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        if (GameWorld.bG) {
            return;
        }
        if (main.GameCanvas.G.a && this.equals(GameScreen.aE)) {
            return;
        }
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (this.b != null) {
            this.b.a(en2, this.d, this.c, this.j);
        }
        if (this.b.IActionListener != null && this.b.IActionListener.c == null && this.a != null) {
            bl.IActionListener(en2, this.a[GameWorld.e().K][this.k], this.d, this.c + 3 + (main.GameCanvas.w % 10 > 5 ? 1 : 0), this.j == 1 ? 0 : 2, cj.f);
        }
        en2.a(-en2.a(), -en2.IActionListener());
    }

    public final void a() {
        if (this.b != null && this.b.a != null && this.b.GameCanvas.size() == 0 && this.c != -40) {
            --this.b.f;
            if (this.b.f <= 0) {
                this.c = -40;
                this.b.e = 0;
                this.b.GameCanvas.removeAllElements();
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
        if (((Pos)object).c != ((Pos)object).m) {
            ((Pos)object).o = ((Pos)object).m - ((Pos)object).c << 2;
            ((Pos)object).n += ((Pos)object).o;
            ((Pos)object).c += ((Pos)object).n >> 4;
            ((Pos)object).n &= 0xF;
        }
        if (((Pos)object).d != ((Pos)object).GameScreen) {
            ((Pos)object).r = ((Pos)object).GameScreen - ((Pos)object).d << 2;
            ((Pos)object).q += ((Pos)object).r;
            ((Pos)object).d += ((Pos)object).q >> 4;
            ((Pos)object).q &= 0xF;
        }
        ++((Pos)object).ResourceUtil;
        if (((Pos)object).ResourceUtil == 5) {
            ((Pos)object).ResourceUtil = 0;
            ((Pos)object).k = ((Pos)object).k == 0 ? 1 : 0;
        }
        if (this.b == null) {
            return;
        }
        if (this.b != null && this.b.IActionListener == null) {
            return;
        }
        if (!this.e) {
            if (this.g > 0) {
                --this.g;
                if (this.g == 0) {
                    main.GameCanvas.G.ResourceUtil();
                    main.GameCanvas.G.s();
                }
            }
            if (main.GameCanvas.w % 3 == 0) {
                if (GameWorld.e().I == 1) {
                    this.GameScreen = GameWorld.e().B - 20 - GameScreen.j;
                }
                if (GameWorld.e().I == -1) {
                    this.GameScreen = GameWorld.e().B + 20 - GameScreen.j;
                }
                if (this.GameScreen <= 24) {
                    this.GameScreen += this.b.c / 2;
                }
                if (this.GameScreen >= main.GameCanvas.A - 24) {
                    this.GameScreen -= this.b.c / 2;
                }
                this.m = GameWorld.e().C - 40 - GameScreen.k;
                if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                    this.m = (this.b.d.length + 1) * 12 + 10;
                }
                if (this.b.IActionListener.c != null) {
                    if (main.GameCanvas.A - 50 > 155 + this.b.i) {
                        this.GameScreen = main.GameCanvas.A - 60 - this.b.i / 2;
                        this.m = this.b.j + 10;
                    } else {
                        this.GameScreen = main.GameCanvas.A - 20 - this.b.i / 2;
                        this.m = 45 + this.b.j;
                        if (main.GameCanvas.A > main.GameCanvas.B || main.GameCanvas.A < 220) {
                            this.GameScreen = main.GameCanvas.A - 20 - this.b.i / 2;
                            this.m = this.b.j + 10;
                        }
                    }
                }
            }
            this.j = this.d > GameWorld.e().B - GameScreen.j ? -1 : 1;
        }
        if (this.b.IActionListener != null) {
            if (this.b.GameCanvas.size() > 1) {
                if (this.b.IActionListener.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.IActionListener.IActionListener) {
                        this.b.e = 0;
                        this.b.GameCanvas.removeElementAt(0);
                        this.b.IActionListener = object = (r)this.b.GameCanvas.firstElement();
                        this.b.c();
                        return;
                    }
                } else {
                    this.b.IActionListener.i = System.currentTimeMillis();
                    if (this.b.IActionListener.i - this.b.IActionListener.h >= 1000L) {
                        this.b.IActionListener.h = System.currentTimeMillis();
                        --this.b.IActionListener.f;
                    }
                    if (this.b.IActionListener.f == 0) {
                        this.b.GameCanvas.removeElementAt(0);
                        if (this.b.GameCanvas.size() == 0) {
                            return;
                        }
                        this.b.IActionListener = object = (r)this.b.GameCanvas.firstElement();
                        this.b.c();
                        return;
                    }
                }
            } else if (this.b.GameCanvas.size() == 1) {
                if (this.b.IActionListener.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.IActionListener.IActionListener) {
                        this.e = true;
                    }
                    if (this.b.e == this.b.IActionListener.IActionListener) {
                        this.m = -40;
                        this.GameScreen = GameWorld.e().B - GameScreen.j + (GameWorld.e().I == 1 ? -20 : 20);
                    }
                    if (this.b.e >= this.b.IActionListener.IActionListener + 20) {
                        this.b.e = 0;
                        this.b.GameCanvas.removeAllElements();
                        this.b.d = null;
                        this.b.f = 200;
                        return;
                    }
                } else {
                    this.b.IActionListener.i = System.currentTimeMillis();
                    if (this.b.IActionListener.i - this.b.IActionListener.h >= 1000L) {
                        this.b.IActionListener.h = System.currentTimeMillis();
                        --this.b.IActionListener.f;
                    }
                    if (this.b.IActionListener.f == 0) {
                        this.e = true;
                        this.m = -40;
                        this.GameScreen = GameWorld.e().B - GameScreen.j + (GameWorld.e().I == 1 ? -20 : 20);
                        this.b.e = 0;
                        this.b.GameCanvas.removeAllElements();
                        this.b.d = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final void a(String string, GameWorld af2, boolean bl2) {
        this.h = af2.J;
        this.b.a(string, 3, af2, bl2);
        this.e = false;
    }

    public final void a(String string, int n2) {
        string = MathUtil.a(string);
        if (this.b.GameCanvas.size() > 0 && string.equals(((r)this.b.GameCanvas.lastElement()).a)) {
            return;
        }
        if (this.b.GameCanvas.size() > 10) {
            int n3 = 0;
            while (n3 < 5) {
                this.b.GameCanvas.removeElementAt(0);
                ++n3;
            }
        }
        this.b.a(string, n2, null, false);
        if (this.b.GameCanvas.size() == 1) {
            this.c = 0;
            this.d = GameWorld.e().B - GameScreen.j + (GameWorld.e().I == 1 ? -20 : 20);
        }
        this.e = false;
    }
}

