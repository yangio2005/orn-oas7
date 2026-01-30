/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class TileMap {
    public static LoggingList a = new LoggingList("vTeleport");
    public int IActionListener;
    public int c;
    private int f;
    private int UIPanel;
    private boolean h;
    private int i;
    public int d;
    private int j;
    private int k;
    private static Image[] ResourceUtil = new Image[5];
    private static Image m;
    private boolean n;
    private boolean o;
    private boolean GameScreen = false;
    public boolean e;
    private boolean q;
    private int r;
    private int s = 1;
    private int t;
    private int u;
    private boolean v;
    private boolean w;

    public TileMap(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7) {
        this.b = n2;
        this.c = 5;
        this.i = n3;
        MathUtil.c("TELEPORT x= " + n2 + " Message= " + n3 + " type= " + n6);
        this.f = n4;
        this.g = n6;
        this.h = bl2;
        this.j = n5;
        this.k = n7;
        this.r = 0;
        n3 = 0;
        while (n3 < 100) {
            ++n3;
            this.i += 12;
            if (!bv.a(n2, this.i, 2)) continue;
            if (this.i % 24 == 0) break;
            this.i -= this.i % 24;
            break;
        }
        MathUtil.c("Y2= " + this.i + "--------------------------------------------------------------");
        this.o = true;
        this.n = false;
        if (this.k > 2) {
            this.i += 4;
            if (ResourceUtil[3] == null) {
                TileMap.ResourceUtil[3] = ResourceUtil.c("/mainImage/myTexture2dmaybay4a.png");
            }
            if (ResourceUtil[4] == null) {
                TileMap.ResourceUtil[4] = ResourceUtil.c("/mainImage/myTexture2dmaybay4b.png");
            }
            if (m == null) {
                m = ResourceUtil.c("/mainImage/hole.png");
            }
        } else if (ResourceUtil[n7] == null) {
            TileMap.ResourceUtil[n7] = ResourceUtil.IActionListener("/mainImage/myTexture2dmaybay" + (n7 + 1) + ".png");
        }
        if (n2 > GameScreen.j && n2 < GameScreen.j + main.GameCanvas.A && this.i > 100) {
            SettingsManager.a();
            SettingsManager.a();
            this.GameScreen = true;
            SettingsManager.a();
        }
    }

    public static void a(cn cn2) {
        GameCanvas.addElement(cn2);
    }

    public final void a(MGraphics en2) {
        if (this.k > 2 && this.v) {
            en2.a(m, this.b, this.i + 20, cj.c);
        }
    }

    public final void IActionListener(MGraphics en2) {
        if (GameWorld.bI) {
            return;
        }
        if (this.b < GameScreen.j || this.b > GameScreen.j + main.GameCanvas.A) {
            return;
        }
        RMSManager av2 = GameScreen.x[this.f];
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
            bl.IActionListener(en2, av2.a[GameWorld.bC[0][0][0]].a, this.b + (this.j == 1 ? n2 : -n2), this.c - n3, this.j == 1 ? 0 : 2, cj.a);
        }
        if (this.k < 3) {
            en2.a(ResourceUtil[this.k], 0, 0, MGraphics.a(ResourceUtil[this.k]), MGraphics.IActionListener(ResourceUtil[this.k]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.o) {
            if (this.r > 10) {
                en2.a(ResourceUtil[4], 0, 0, MGraphics.a(ResourceUtil[4]), MGraphics.IActionListener(ResourceUtil[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
                return;
            }
            en2.a(ResourceUtil[3], 0, 0, MGraphics.a(ResourceUtil[3]), MGraphics.IActionListener(ResourceUtil[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.r < 20) {
            en2.a(ResourceUtil[4], 0, 0, MGraphics.a(ResourceUtil[4]), MGraphics.IActionListener(ResourceUtil[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
            return;
        }
        en2.a(ResourceUtil[3], 0, 0, MGraphics.a(ResourceUtil[3]), MGraphics.IActionListener(ResourceUtil[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
    }

    public final void a() {
        if (this.k > 2 && this.e && this.c != -80) {
            if (this.o && this.r == 0) {
                if (main.GameCanvas.w % 3 == 0) {
                    at.a(1, this.b, this.c, 1, 0);
                }
            } else if (this.n && main.GameCanvas.w % 3 == 0) {
                at.a(1, this.b, this.c + 16, 1, 1);
            }
        }
        ++this.t;
        if (this.t > 3) {
            this.t = 0;
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
                if (main.GameCanvas.w % 2 == 0) {
                    ++this.s;
                }
                if (this.i - this.c < this.s) {
                    this.c = this.i;
                    this.e = false;
                } else {
                    this.c += this.s;
                }
            }
            if (this.h && this.g == 1 && GameWorld.e().s) {
                GameWorld.e().B = this.b;
                GameWorld.e().C = this.c - 30;
                GameWorld.e().H = 4;
                GameScreen.ResourceUtil = this.b - GameScreen.f;
                GameScreen.m = this.c - GameScreen.UIPanel - 1;
                GameScreen.aD.f = false;
            }
            if (GameScreen.IActionListener(this.d) != null && !this.h && this.g == 1 && GameScreen.IActionListener((int)this.d).s) {
                GameScreen.IActionListener((int)this.d).B = this.b;
                GameScreen.IActionListener((int)this.d).C = this.c - 30;
                GameScreen.IActionListener((int)this.d).H = 4;
            }
            if (MathUtil.UIPanel(this.c - this.i) < 50 && bv.a(this.b, this.c, 2)) {
                this.v = true;
                if (this.k < 3) {
                    SettingsManager.a();
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
                        if (this.h) {
                            GameWorld.e().s = false;
                        } else if (GameScreen.IActionListener(this.d) != null) {
                            GameScreen.IActionListener((int)this.d).s = false;
                        }
                        this.q = false;
                    }
                } else {
                    this.c = this.i;
                    if (!this.w) {
                        at.a(92, this.b + 4, this.c + 14, 1, 0);
                        GameScreen.SettingsManager = 10;
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
                        if (this.h) {
                            GameWorld.e().s = false;
                        } else if (GameScreen.IActionListener(this.d) != null) {
                            GameScreen.IActionListener((int)this.d).s = false;
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
                    SettingsManager.a();
                }
                if (this.r > 0 && this.g == 0) {
                    if (this.h) {
                        GameWorld.e().s = false;
                        if (GameWorld.e().H != 14) {
                            GameWorld.e().H = 3;
                        }
                        GameWorld.e().E = -3;
                    } else if (GameScreen.IActionListener(this.d) != null) {
                        GameScreen.IActionListener((int)this.d).s = false;
                        if (GameScreen.IActionListener((int)this.d).H != 14) {
                            GameScreen.IActionListener((int)this.d).H = 3;
                        }
                        GameScreen.IActionListener((int)this.d).E = -3;
                    }
                    this.q = false;
                }
                if (this.r > 12 && this.g == 0) {
                    if (this.h) {
                        GameWorld.e().s = true;
                    } else if (GameScreen.IActionListener(this.d) != null) {
                        GameScreen.IActionListener((int)this.d).B = this.b;
                        GameScreen.IActionListener((int)this.d).C = this.c;
                        GameScreen.IActionListener((int)this.d).s = true;
                    }
                    this.q = true;
                }
            }
            if (this.h) {
                if (this.g == 0) {
                    GameScreen.ResourceUtil = this.b - GameScreen.f;
                    GameScreen.m = this.c - GameScreen.UIPanel - 1;
                }
                if (this.g == 1) {
                    GameScreen.aD.f = true;
                }
            }
            if (this.c <= -80) {
                if (this.h && this.g == 0) {
                    MessageHandler.IActionListener = false;
                    GameWorld.bG = true;
                }
                if (!this.h && GameScreen.IActionListener(this.d) != null && this.g == 0) {
                    GameScreen.D.removeElement(GameScreen.IActionListener(this.d));
                }
                if (this.k < 3) {
                    GameCanvas.removeElement(this);
                } else {
                    this.c = -80;
                    ++this.u;
                    if (this.u > 80) {
                        this.u = 0;
                        GameCanvas.removeElement(this);
                    }
                }
            }
        }
        if (this.e && this.k < 3 && MathUtil.UIPanel(this.c - this.i) <= 50 && main.GameCanvas.w % 5 == 0) {
            ea ea2 = new ea(19, this.b, this.i + 20, 2, 1, -1);
            ei.a(ea2);
        }
    }
}

