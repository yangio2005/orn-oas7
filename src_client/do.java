import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public class _do
extends Char {
    public ap df;
    public static ap[] BaseCanvas;
    public boolean dh;
    private int LoginScreen;
    private int b;
    public static boolean mFont;
    private static int c;
    public int[] dj;
    private int d;
    private long e;
    private long f;
    public int dk;

    static {
        int[] nArray = new int[]{1, -1, 1, -1};
        int[] nArray2 = new int[]{1, -1, -1, 1};
    }

    public _do(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bd = true;
        this.aO = n7;
        ds.c("npc avatar= " + this.aO);
        this.B = n4;
        this.C = n5;
        this.cl = n4;
        this.cm = n5;
        this.H = n3;
        if (n2 != -1) {
            this.df = BaseCanvas[n6];
        }
        if (n6 == 23 || n6 == 42) {
            this.al = 45;
        }
        if (n6 == 51) {
            this.bd = false;
            this.LoginScreen = n3;
            ds.c("duaHau = " + n3);
        }
        if (this.df != null) {
            if (this.df.b == null) {
                this.df.b = "";
            }
            this.df.b = ds.LoginScreen(this.df.b);
        }
    }

    public final void methodLoginScreen(byte by2, int n2) {
        this.LoginScreen = by2;
        this.e = this.f = System.currentTimeMillis();
        this.d = n2;
        ds.c("in ra second= " + this.d);
    }

    public static void Mob() {
        int n2 = 0;
        while (n2 < GameScreen.G.size()) {
            _do do_ = (_do)GameScreen.G.elementAt(n2);
            ((_do)GameScreen.G.elementAt(n2)).ca = null;
            do_.bZ = -1;
            ++n2;
        }
    }

    public void methodLoginScreen() {
        block10: {
            block13: {
                block11: {
                    block12: {
                        if (this.df.LoginScreen == 51) {
                            this.f = System.currentTimeMillis();
                            if (this.f - this.e >= 1000L) {
                                --this.d;
                                this.e = this.f;
                                if (this.d < 0) {
                                    this.d = 0;
                                }
                            }
                        }
                        if (this.bd) {
                            this.H();
                        }
                        if (this.ca != null) break block10;
                        byte[] byArray = new byte[]{-1, 9, 9, 10, 10, 11, 11};
                        if (Char.e().L < 9 || Char.e().L > 10 || Char.e().ax.LoginScreen <= 0 || byArray[Char.e().ax.LoginScreen] != this.df.LoginScreen) break block11;
                        if (Char.e().aD != null) break block12;
                        this.ca = GameScreen.Message[57];
                        break block13;
                    }
                    if (Char.e().aD == null || Char.e().aD.LoginScreen + 1 != Char.e().aD.f.length) break block10;
                    this.ca = GameScreen.Message[62];
                    break block13;
                }
                GameScreen.j();
                byte by2 = GameScreen.x();
                if (Char.e().aD == null && by2 == this.df.LoginScreen) break block13;
                if (Char.e().aD == null || by2 != this.df.LoginScreen) break block10;
                int cfr_ignored_0 = Char.e().aD.LoginScreen + 1;
                int cfr_ignored_1 = Char.e().aD.f.length;
                this.ca = GameScreen.Message[98];
            }
            this.bZ = 0;
        }
        super.LoginScreen();
        if (bv.Res == 51) {
            this.I = this.B > Char.e().B ? -1 : 1;
            if (this.df.LoginScreen % 2 == 0) {
                if (this.ImageCache == 1) {
                    this.ImageCache = 0;
                    return;
                }
                this.ImageCache = 1;
            }
        }
    }

    public void methodLoginScreen(mGraphics en2) {
        if (Char.bI) {
            return;
        }
        if (this.dh) {
            return;
        }
        if (!this.G()) {
            return;
        }
        if (this.H == 15) {
            return;
        }
        if (this.aN != 0) {
            super.LoginScreen(en2);
            return;
        }
        if (this.df == null) {
            return;
        }
        if (this.df.LoginScreen != 4 && this.df.LoginScreen != 51 && this.df.LoginScreen != 50) {
            en2.LoginScreen(bv.x, this.B, this.C, 3);
        }
        if (this.df.LoginScreen == 3) {
            bl.b(en2, 265, this.B, this.C, 0, 33);
            if (Char.e().aT != null && Char.e().aT.equals(this) && ae.m == null) {
                en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.B, this.C - this.al + 4, 33);
            }
            this.b = 60;
        } else if (this.df.LoginScreen != 4) {
            if (this.df.LoginScreen == 50 || this.df.LoginScreen == 51) {
                if (this.dj != null) {
                    if (this.df.LoginScreen == 50 && mFont) {
                        ea ea2;
                        ++c;
                        if (GameCanvas.w % 3 == 0) {
                            ea2 = new ea(19, this.B + ds.b(-50, 50), this.C, 2, 1, -1);
                            ei.LoginScreen(ea2);
                        }
                        if (GameCanvas.w % 15 == 0) {
                            ea2 = new ea(18, this.B + ds.b(-5, 5), this.C + ds.b(-90, 0), 2, 1, -1);
                            ei.LoginScreen(ea2);
                        }
                        if (c == 100) {
                            GameScreen.j().b(this.B, this.C);
                        }
                        if (c == 110) {
                            mFont = false;
                            this.df.LoginScreen = 4;
                        }
                    }
                    int n2 = 0;
                    if (bl.c[this.dj[this.LoginScreen]] != null && bl.c[this.dj[this.LoginScreen]].LoginScreen != null) {
                        n2 = mGraphics.b(bl.c[this.dj[this.LoginScreen]].LoginScreen);
                    }
                    bl.b(en2, this.dj[this.LoginScreen], this.B + ds.b(-1, 1), this.C, 0, 33);
                    if (Char.e().aT != null && Char.e().aT.equals(this)) {
                        if (ae.m == null) {
                            en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9 + 16 - n2, 33);
                        }
                        mFont.c.LoginScreen(en2, ai.b(this.d), this.B, this.C - this.al - 16 - mFont.k.LoginScreen() - 20 - n2 + 16, 2, mFont.f);
                    } else {
                        mFont.c.LoginScreen(en2, ai.b(this.d), this.B, this.C - this.al - 8 - mFont.k.LoginScreen() - 20 - n2 + 16, 2, mFont.f);
                    }
                }
            } else if (this.df.LoginScreen == 6) {
                bl.b(en2, 545, this.B, this.C + 5, 0, 33);
                if (Char.e().aT != null && Char.e().aT.equals(this) && ae.m == null) {
                    en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9, 33);
                }
                mFont.c.LoginScreen(en2, String.valueOf(bv.n), this.B, this.C - this.al + 19 - mFont.k.LoginScreen(), 2);
            } else {
                int n3 = this.df.c;
                int n4 = this.df.e;
                int n5 = this.df.d;
                RMS av2 = GameScreen.x[n3];
                RMS av3 = GameScreen.x[n4];
                RMS av4 = GameScreen.x[n5];
                if (this.I == 1) {
                    bl.b(en2, av2.LoginScreen[Char.bC[this.ImageCache][0][0]].LoginScreen, this.B + Char.bC[this.ImageCache][0][1] + av2.LoginScreen[Char.bC[this.ImageCache][0][0]].b, this.C - Char.bC[this.ImageCache][0][2] + av2.LoginScreen[Char.bC[this.ImageCache][0][0]].c, 0, 0);
                    bl.b(en2, av3.LoginScreen[Char.bC[this.ImageCache][1][0]].LoginScreen, this.B + Char.bC[this.ImageCache][1][1] + av3.LoginScreen[Char.bC[this.ImageCache][1][0]].b, this.C - Char.bC[this.ImageCache][1][2] + av3.LoginScreen[Char.bC[this.ImageCache][1][0]].c, 0, 0);
                    bl.b(en2, av4.LoginScreen[Char.bC[this.ImageCache][2][0]].LoginScreen, this.B + Char.bC[this.ImageCache][2][1] + av4.LoginScreen[Char.bC[this.ImageCache][2][0]].b, this.C - Char.bC[this.ImageCache][2][2] + av4.LoginScreen[Char.bC[this.ImageCache][2][0]].c, 0, 0);
                } else {
                    bl.b(en2, av2.LoginScreen[Char.bC[this.ImageCache][0][0]].LoginScreen, this.B - Char.bC[this.ImageCache][0][1] - av2.LoginScreen[Char.bC[this.ImageCache][0][0]].b, this.C - Char.bC[this.ImageCache][0][2] + av2.LoginScreen[Char.bC[this.ImageCache][0][0]].c, 2, 24);
                    bl.b(en2, av3.LoginScreen[Char.bC[this.ImageCache][1][0]].LoginScreen, this.B - Char.bC[this.ImageCache][1][1] - av3.LoginScreen[Char.bC[this.ImageCache][1][0]].b, this.C - Char.bC[this.ImageCache][1][2] + av3.LoginScreen[Char.bC[this.ImageCache][1][0]].c, 2, 24);
                    bl.b(en2, av4.LoginScreen[Char.bC[this.ImageCache][2][0]].LoginScreen, this.B - Char.bC[this.ImageCache][2][1] - av4.LoginScreen[Char.bC[this.ImageCache][2][0]].b, this.C - Char.bC[this.ImageCache][2][2] + av4.LoginScreen[Char.bC[this.ImageCache][2][0]].c, 2, 24);
                }
                if (bv.Res != 51) {
                    int n6 = 15;
                    if (this.df.LoginScreen == 47) {
                        n6 = 47;
                    }
                    if (Char.e().aT != null && Char.e().aT.equals(this) && ae.m == null) {
                        int n7 = 0;
                        int n8 = 0;
                        if (Char.e().aT.df.LoginScreen == 28 || Char.e().aT.df.LoginScreen == 41) {
                            n7 = 3;
                            n8 = -12;
                        }
                        en2.LoginScreen(Mob.R, 0, 0, 9, 6, 0, this.B + n7, this.C - this.al - (n6 - 8) + n8, 33);
                    }
                }
                this.b = 65;
            }
        }
        if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
            bl.b(en2, this.ca.LoginScreen[this.bZ].c, this.B + this.ca.LoginScreen[this.bZ].LoginScreen, this.C + this.ca.LoginScreen[this.bZ].b - this.b, 0, 3);
            if (GameCanvas.w % 2 == 0) {
                ++this.bZ;
                if (this.bZ >= this.ca.LoginScreen.length) {
                    this.bZ = 0;
                }
            }
        }
    }

    public final void e(mGraphics en2) {
        if (Char.bI) {
            return;
        }
        if (this.dh) {
            return;
        }
        if (!this.G()) {
            return;
        }
        if (this.H == 15) {
            return;
        }
        if (this.df == null) {
            return;
        }
        if (this.df.LoginScreen == 3) {
            if (Char.e().aT != null && Char.e().aT.equals(this)) {
                mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - mFont.k.LoginScreen() - 5, 2, mFont.o);
            } else {
                mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - 3 - mFont.k.LoginScreen(), 2, mFont.o);
            }
            this.b = 60;
            return;
        }
        if (this.df.LoginScreen != 4) {
            if (this.df.LoginScreen == 50 || this.df.LoginScreen == 51) {
                if (this.dj != null) {
                    int n2 = 0;
                    if (bl.c[this.dj[this.LoginScreen]] != null && bl.c[this.dj[this.LoginScreen]].LoginScreen != null) {
                        n2 = mGraphics.b(bl.c[this.dj[this.LoginScreen]].LoginScreen);
                    }
                    if (Char.e().aT != null && Char.e().aT.equals(this)) {
                        mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - mFont.k.LoginScreen() - n2, 2, mFont.o);
                        return;
                    }
                    mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - 8 - mFont.k.LoginScreen() - n2 + 16, 2, mFont.o);
                    return;
                }
            } else {
                if (this.df.LoginScreen == 6) {
                    if (Char.e().aT != null && Char.e().aT.equals(this)) {
                        mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - mFont.k.LoginScreen() - 16, 2, mFont.o);
                        return;
                    }
                    mFont.n.LoginScreen(en2, this.df.b, this.B, this.C - this.al - 8 - mFont.k.LoginScreen(), 2, mFont.o);
                    return;
                }
                if (bv.Res != 51) {
                    int n3 = 15;
                    if (this.df.LoginScreen == 47) {
                        n3 = 47;
                    }
                    if (Char.e().aT != null && Char.e().aT.equals(this)) {
                        if (bv.Res != 113) {
                            int n4 = 0;
                            int n5 = 0;
                            if (Char.e().aT.df.LoginScreen == 28 || Char.e().aT.df.LoginScreen == 41) {
                                n4 = 3;
                                n5 = -12;
                            }
                            mFont.n.LoginScreen(en2, this.df.b, this.B + n4, this.C - this.al - mFont.k.LoginScreen() - n3 + n5, 2, mFont.o);
                        }
                    } else {
                        n3 = 8;
                        if (this.df.LoginScreen == 47) {
                            n3 = 40;
                        }
                        if (bv.Res != 113) {
                            int n6 = 0;
                            int n7 = 0;
                            if (this.df.LoginScreen == 28 || this.df.LoginScreen == 41) {
                                n6 = 3;
                                n7 = -12;
                            }
                            mFont.n.LoginScreen(en2, this.df.b, this.B + n6, this.C - this.al - n3 - mFont.k.LoginScreen() + n7, 2, mFont.o);
                        }
                    }
                }
                this.b = 65;
            }
        }
    }

    public final void k() {
        this.H = 15;
        Char.x = null;
    }
}

