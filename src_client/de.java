/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class de {
    public boolean LoginScreen = false;
    public String b;
    public String[] c;
    public b d;
    public int e;
    public boolean f = true;
    public Image g;
    public Image Item;
    public Image i;
    public int j = 0;
    public int k = 0;
    public int Res = Screen.cq;
    public int m = Screen.cr;
    public boolean n = false;
    public Object o;
    public String GameScreen = "";
    private static Image SessionReceiver = Res.loadImage("/mainImage/btn0left.png");
    private static Image MyHashtable = Res.loadImage("/mainImage/btn0mid.png");
    private static Image u = Res.loadImage("/mainImage/btn0right.png");
    private static Image v = Res.loadImage("/mainImage/btn1left.png");
    private static Image w = Res.loadImage("/mainImage/btn1mid.png");
    private static Image x = Res.loadImage("/mainImage/btn1right.png");
    public boolean q;
    public boolean r;

    public de(String string, b b2, int n2, Object object, int n3, int n4) {
        this.b = string;
        this.e = n2;
        this.d = b2;
        this.o = null;
        this.j = n3;
        this.k = n4;
    }

    public de(String string, b b2, int n2, Object object) {
        this.b = string;
        this.e = n2;
        this.d = b2;
        this.o = object;
    }

    public de(String string, int n2, Object object) {
        this.b = string;
        this.e = n2;
        this.o = object;
    }

    public de(String string, int n2) {
        this.b = string;
        this.e = n2;
    }

    public de(String string, int n2, int n3, int n4) {
        this.b = string;
        this.e = 0;
        this.j = n3;
        this.k = n4;
    }

    public final void methodLoginScreen() {
        GameCanvas.Res();
        if (this.f && (this.b != null && !this.b.equals("") && !this.b.equals(T.cE) || this.g != null)) {
            bu.LoginScreen();
        }
        if (this.e > 0) {
            if (this.d != null) {
                this.d.LoginScreen(this.e, this.o);
                return;
            }
            GameScreen.j().LoginScreen(this.e, this.o);
        }
    }

    public final void b() {
        this.Res = 160;
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (this.g != null) {
            en2.LoginScreen(this.g, this.j, this.k, 0);
            if (this.n) {
                if (this.Item == null) {
                    if (this.q) {
                        en2.LoginScreen(ItemMap.f, this.j + 8, this.k + 8, 3);
                    } else {
                        en2.LoginScreen(ItemMap.f, this.j - (this.g.equals(GameScreen.at) ? 10 : 0), this.k, 0);
                    }
                } else {
                    en2.LoginScreen(this.Item, this.j, this.k, 0);
                }
            }
            if (this.b != "" && this.b != null) {
                if (!this.n) {
                    mFont.f.LoginScreen(en2, this.b, this.j + mGraphics.LoginScreen(this.g) / 2, this.k + mGraphics.b(this.g) / 2 - 5, 2);
                    return;
                }
                mFont.g.LoginScreen(en2, this.b, this.j + mGraphics.LoginScreen(this.g) / 2, this.k + mGraphics.b(this.g) / 2 - 5, 2);
            }
            return;
        }
        if (this.b != "") {
            if (!this.n) {
                de.LoginScreen(SessionReceiver, MyHashtable, u, this.j, this.k, this.Res, en2);
            } else {
                de.LoginScreen(v, w, x, this.j, this.k, this.Res, en2);
            }
        }
        int n2 = 0;
        int n3 = this.j + this.Res / 2;
        if (this.i != null) {
            n2 = this.i.getWidth();
            n3 = this.j + n2;
            if (!this.n) {
                en2.LoginScreen(this.i, this.j, this.k, 0);
            } else {
                en2.LoginScreen(this.i, this.j, this.k + 1, 0);
            }
        }
        if (!this.n) {
            mFont.f.LoginScreen(en2, this.b, n3, this.k + 7, n2 == 0 ? 2 : 0);
            return;
        }
        mFont.g.LoginScreen(en2, this.b, n3, this.k + 7, n2 == 0 ? 2 : 0);
    }

    private static void methodLoginScreen(Image image, Image image2, Image image3, int n2, int n3, int n4, mGraphics en2) {
        int n5 = 10;
        while (n5 <= n4 - 20) {
            en2.LoginScreen(image2, n2 + n5, n3, 0);
            n5 += 10;
        }
        n5 = n4 % 10;
        if (n5 > 0) {
            en2.LoginScreen(image2, 0, 0, n5, 24, 0, n2 + n4 - 10 - n5, n3, 0);
        }
        en2.LoginScreen(image, n2, n3, 0);
        en2.LoginScreen(image3, n2 + n4 - 10, n3, 0);
    }

    public final boolean c() {
        this.n = false;
        if (GameCanvas.isLowGraphic(this.j, this.k, this.Res, this.m)) {
            if (GameCanvas.k) {
                this.n = true;
            }
            if (GameCanvas.m) {
                return true;
            }
        }
        return false;
    }

    public final boolean methodLoginScreen(int n2, int n3) {
        this.n = false;
        if (GameCanvas.isLowGraphic(this.j, this.k - n3, this.Res, this.m)) {
            if (GameCanvas.k) {
                this.n = true;
            }
            if (GameCanvas.m) {
                return true;
            }
        }
        return false;
    }
}

