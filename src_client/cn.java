/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class cn {
    public static MyVector LoginScreen = new MyVector("vTeleport");
    public int b;
    public int c;
    private int f;
    private int g;
    private boolean Item;
    private int i;
    public int d;
    private int j;
    private int k;
    private static Image[] Res = new Image[5];
    private static Image m;
    private boolean n;
    private boolean o;
    private boolean GameScreen = false;
    public boolean e;
    private boolean q;
    private int r;
    private int SessionReceiver = 1;
    private int MyHashtable;
    private int u;
    private boolean v;
    private boolean w;

    public cn(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7) {
        this.b = n2;
        this.c = 5;
        this.i = n3;
        ds.c("TELEPORT x= " + n2 + " Message= " + n3 + " type= " + n6);
        this.f = n4;
        this.g = n6;
        this.Item = bl2;
        this.j = n5;
        this.k = n7;
        this.r = 0;
        n3 = 0;
        while (n3 < 100) {
            ++n3;
            this.i += 12;
            if (!bv.LoginScreen(n2, this.i, 2)) continue;
            if (this.i % 24 == 0) break;
            this.i -= this.i % 24;
            break;
        }
        ds.c("Y2= " + this.i + "--------------------------------------------------------------");
        this.o = true;
        this.n = false;
        if (this.k > 2) {
            this.i += 4;
            if (Res[3] == null) {
                cn.Res[3] = Res.clientType("/mainImage/myTexture2dmaybay4a.png");
            }
            if (Res[4] == null) {
                cn.Res[4] = Res.clientType("/mainImage/myTexture2dmaybay4b.png");
            }
            if (m == null) {
                m = Res.clientType("/mainImage/hole.png");
            }
        } else if (Res[n7] == null) {
            cn.Res[n7] = Res.loadImage("/mainImage/myTexture2dmaybay" + (n7 + 1) + ".png");
        }
        if (n2 > GameScreen.j && n2 < GameScreen.j + GameCanvas.A && this.i > 100) {
            bu.LoginScreen();
            bu.LoginScreen();
            this.GameScreen = true;
            bu.LoginScreen();
        }
    }

    public static void methodLoginScreen(cn cn2) {
        LoginScreen.addElement(cn2);
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (this.k > 2 && this.v) {
            en2.LoginScreen(m, this.b, this.i + 20, cj.c);
        }
    }

    public final void b(mGraphics en2) {
        if (Char.bI) {
            return;
        }
        if (this.b < GameScreen.j || this.b > GameScreen.j + GameCanvas.A) {
            return;
        }
        RMS av2 = GameScreen.x[this.f];
        int n2 = 0;
        int n3 = 0;
        if (this.k == 0) {
            n2 = 15;
            n3 = 40;
        }
        if (this.k == 1) {
            n2 = 7;
            n3 = 55;
        }
        if (this.k == 2) {
            n2 = 18;
            n3 = 52;
        }
        if (this.q && this.k < 3) {
            bl.b(en2, av2.LoginScreen[Char.bC[0][0][0]].LoginScreen, this.b + (this.j == 1 ? n2 : -n2), this.c - n3, this.j == 1 ? 0 : 2, cj.LoginScreen);
        }
        if (this.k < 3) {
            en2.LoginScreen(Res[this.k], 0, 0, mGraphics.LoginScreen(Res[this.k]), mGraphics.b(Res[this.k]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.o) {
            if (this.r > 10) {
                en2.LoginScreen(Res[4], 0, 0, mGraphics.LoginScreen(Res[4]), mGraphics.b(Res[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
                return;
            }
            en2.LoginScreen(Res[3], 0, 0, mGraphics.LoginScreen(Res[3]), mGraphics.b(Res[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.r < 20) {
            en2.LoginScreen(Res[4], 0, 0, mGraphics.LoginScreen(Res[4]), mGraphics.b(Res[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
            return;
        }
        en2.LoginScreen(Res[3], 0, 0, mGraphics.LoginScreen(Res[3]), mGraphics.b(Res[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
    }

    public final void methodLoginScreen() {
        if (this.k > 2 && this.e && this.c != -80) {
            if (this.o && this.r == 0) {
                if (GameCanvas.w % 3 == 0) {
                    at.LoginScreen(1, this.b, this.c, 1, 0);
                }
            } else if (this.n && GameCanvas.w % 3 == 0) {
                at.LoginScreen(1, this.b, this.c + 16, 1, 1);
            }
        }
        ++this.MyHashtable;
        if (this.MyHashtable > 3) {
            this.MyHashtable = 0;
        }
        if (this.o) {
            this.e = true;
            boolean bl2 = this.q = this.g != 0;
            if (this.k < 3) {
                int n2 = this.i - this.c >> 3;
                if (n2 <= 0) {
                    n2 = 1;
                    this.e = false;
                }
                this.c += n2;
            } else {
                if (GameCanvas.w % 2 == 0) {
                    ++this.SessionReceiver;
                }
                if (this.i - this.c < this.SessionReceiver) {
                    this.c = this.i;
                    this.e = false;
                } else {
                    this.c += this.SessionReceiver;
                }
            }
            if (this.Item && this.g == 1 && Char.e().SessionReceiver) {
                Char.e().B = this.b;
                Char.e().C = this.c - 30;
                Char.e().H = 4;
                GameScreen.Res = this.b - GameScreen.f;
                GameScreen.m = this.c - GameScreen.g - 1;
                GameScreen.aD.f = false;
            }
            if (GameScreen.b(this.d) != null && !this.Item && this.g == 1 && GameScreen.b((int)this.d).SessionReceiver) {
                GameScreen.b((int)this.d).B = this.b;
                GameScreen.b((int)this.d).C = this.c - 30;
                GameScreen.b((int)this.d).H = 4;
            }
            if (ds.g(this.c - this.i) < 50 && bv.LoginScreen(this.b, this.c, 2)) {
                this.v = true;
                if (this.k < 3) {
                    bu.LoginScreen();
                    if (this.c % 24 != 0) {
                        this.c -= this.c % 24;
                    }
                    ++this.r;
                    if (this.r > 10) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.Item) {
                            Char.e().SessionReceiver = false;
                        } else if (GameScreen.b(this.d) != null) {
                            GameScreen.b((int)this.d).SessionReceiver = false;
                        }
                        this.q = false;
                    }
                } else {
                    this.c = this.i;
                    if (!this.w) {
                        at.LoginScreen(92, this.b + 4, this.c + 14, 1, 0);
                        GameScreen.bu = 10;
                        this.w = true;
                    }
                    ++this.r;
                    if (this.r > 30) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.Item) {
                            Char.e().SessionReceiver = false;
                        } else if (GameScreen.b(this.d) != null) {
                            GameScreen.b((int)this.d).SessionReceiver = false;
                        }
                        this.q = false;
                    }
                }
            }
        } else if (this.n) {
            ++this.r;
            if (this.r > 30) {
                int n3 = this.i + 24 - this.c >> 3;
                if (n3 > 30) {
                    n3 = 30;
                }
                this.c -= n3;
                this.e = true;
            } else {
                if (this.r == 14 && this.GameScreen) {
                    bu.LoginScreen();
                }
                if (this.r > 0 && this.g == 0) {
                    if (this.Item) {
                        Char.e().SessionReceiver = false;
                        if (Char.e().H != 14) {
                            Char.e().H = 3;
                        }
                        Char.e().E = -3;
                    } else if (GameScreen.b(this.d) != null) {
                        GameScreen.b((int)this.d).SessionReceiver = false;
                        if (GameScreen.b((int)this.d).H != 14) {
                            GameScreen.b((int)this.d).H = 3;
                        }
                        GameScreen.b((int)this.d).E = -3;
                    }
                    this.q = false;
                }
                if (this.r > 12 && this.g == 0) {
                    if (this.Item) {
                        Char.e().SessionReceiver = true;
                    } else if (GameScreen.b(this.d) != null) {
                        GameScreen.b((int)this.d).B = this.b;
                        GameScreen.b((int)this.d).C = this.c;
                        GameScreen.b((int)this.d).SessionReceiver = true;
                    }
                    this.q = true;
                }
            }
            if (this.Item) {
                if (this.g == 0) {
                    GameScreen.Res = this.b - GameScreen.f;
                    GameScreen.m = this.c - GameScreen.g - 1;
                }
                if (this.g == 1) {
                    GameScreen.aD.f = true;
                }
            }
            if (this.c <= -80) {
                if (this.Item && this.g == 0) {
                    MessageHandler.b = false;
                    Char.bG = true;
                }
                if (!this.Item && GameScreen.b(this.d) != null && this.g == 0) {
                    GameScreen.D.removeElement(GameScreen.b(this.d));
                }
                if (this.k < 3) {
                    LoginScreen.removeElement(this);
                } else {
                    this.c = -80;
                    ++this.u;
                    if (this.u > 80) {
                        this.u = 0;
                        LoginScreen.removeElement(this);
                    }
                }
            }
        }
        if (this.e && this.k < 3 && ds.g(this.c - this.i) <= 50 && GameCanvas.w % 5 == 0) {
            ea ea2 = new ea(19, this.b, this.i + 20, 2, 1, -1);
            ei.LoginScreen(ea2);
        }
    }
}

