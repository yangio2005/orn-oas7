/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class ej
implements b {
    public MyVector LoginScreen = new MyVector("infoWaitToShow");
    public r b;
    public int c = 100;
    private int k;
    public String[] d;
    private int Res;
    private int m;
    private boolean n = false;
    private static Image o = Res.loadImage("/mainImage/myTexture2dgocnhon.png");
    public int e;
    public int f;
    private int GameScreen;
    public int g;
    public int Item;
    public int i;
    public int j;

    public final void methodLoginScreen() {
        this.d = null;
        this.LoginScreen.removeAllElements();
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        if (this.LoginScreen.size() != 0) {
            en2.LoginScreen(n2, n3);
            if (this.d != null && this.d.length != 0 && this.GameScreen != 1) {
                int n5;
                int n6 = n5 = mGraphics.b == 1 ? 0 : 10;
                if (this.b.c == null) {
                    bo.LoginScreen(en2, this.g, this.Item, this.i, this.j, 0xFFFFFF, false);
                } else {
                    Res.loadImageFromRMS(en2, this.g - 23, this.Item - n5 / 2, this.i + 15);
                }
                if (this.b.c == null) {
                    en2.LoginScreen(o, 0, 0, 9, 8, n4 == 1 ? 0 : 2, this.Res - 3 + (n4 == 1 ? -15 : 20), this.m - 20 + this.k + 2, 17);
                }
                n4 = -1;
                int n7 = 0;
                while (n7 < this.d.length) {
                    int n8;
                    mFont di2 = mFont.k;
                    String string = this.d[n7];
                    if (this.d[n7].startsWith("|")) {
                        String[] stringArray = ds.LoginScreen(this.d[n7], "|", 0);
                        if (stringArray.length == 3) {
                            string = stringArray[2];
                        }
                        if (stringArray.length == 4) {
                            string = stringArray[3];
                            Integer.parseInt(stringArray[2]);
                        }
                        n4 = n8 = Integer.parseInt(stringArray[1]);
                    } else {
                        n8 = n4;
                    }
                    switch (n8) {
                        case -1: {
                            di2 = mFont.k;
                            break;
                        }
                        case 0: {
                            di2 = mFont.f;
                            break;
                        }
                        case 1: {
                            di2 = mFont.Item;
                            break;
                        }
                        case 2: {
                            di2 = mFont.b;
                            break;
                        }
                        case 3: {
                            di2 = mFont.GameScreen;
                            break;
                        }
                        case 4: {
                            di2 = mFont.r;
                            break;
                        }
                        case 5: {
                            di2 = mFont.q;
                            break;
                        }
                        case 7: {
                            di2 = mFont.LoginScreen;
                        }
                    }
                    if (this.b.c == null) {
                        di2.LoginScreen(en2, string, this.Res, this.m - 15 + this.k + n7 * 12 - this.d.length * 12 - 9, 2);
                    } else {
                        n8 = this.g - 23;
                        int n9 = this.Item - n5 / 2;
                        int n10 = Res.clientType == 1 ? this.i + 28 : this.i + 25;
                        int n11 = this.j + (GameCanvas.e ? 0 : 14) + n5;
                        en2.LoginScreen(0x442211);
                        en2.d(n8, n9 + n11, n10, 2);
                        n10 = this.b.f * n10 / this.b.g;
                        if (n10 < 0) {
                            n10 = 0;
                        }
                        en2.LoginScreen(43758);
                        en2.d(n8, n9 + n11, n10, 2);
                        if (this.b.f == 0) {
                            return;
                        }
                        this.b.c.LoginScreen(en2, this.g + 5, this.Item + this.j / 2, 0);
                        if (mGraphics.b == 1) {
                            (this.b.d ? mFont.F : mFont.I).LoginScreen(en2, this.b.c.ag, this.g + 12, this.Item + 3, 0);
                        } else {
                            (this.b.d ? mFont.F : mFont.I).LoginScreen(en2, this.b.c.ag, this.g + 12, this.Item - 3, 0);
                        }
                        if (!GameCanvas.e) {
                            if (!cd.g) {
                                mFont.G.LoginScreen(en2, "Nh\u1ea5n # \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.Item + this.j, 2);
                            } else {
                                mFont.G.LoginScreen(en2, "Nh\u1ea5n Y \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.Item + this.j, 2);
                            }
                        }
                        if (mGraphics.b == 1) {
                            ag.LoginScreen(en2, string, this.g + 14, this.Item + this.j / 2 + 2, this.i - 16, this.j, mFont.H);
                        } else {
                            String[] stringArray = mFont.H.LoginScreen(string, 120);
                            int n12 = 0;
                            while (n12 < stringArray.length) {
                                mFont.H.LoginScreen(en2, stringArray[n12], this.g + 12, this.Item + 12 + n12 * 12 - 3, 0);
                                ++n12;
                            }
                            GameCanvas.isLowGraphic(en2);
                        }
                    }
                    ++n7;
                }
            }
            en2.LoginScreen(-n2, -n3);
        }
    }

    public final void b() {
        if (this.LoginScreen.size() != 0 && this.b.f == 0) {
            ++this.e;
            if (this.e >= this.b.b) {
                r r2;
                this.e = 0;
                this.LoginScreen.removeElementAt(0);
                if (this.LoginScreen.size() == 0) {
                    return;
                }
                this.b = r2 = (r)this.LoginScreen.firstElement();
                this.c();
            }
        }
    }

    public final void c() {
        int n2;
        this.c = 100;
        if (GameCanvas.A == 128) {
            this.c = 128;
        }
        if (this.b.c != null) {
            this.d = new String[]{this.b.LoginScreen};
            if (mGraphics.b == 1) {
                n2 = this.d.length;
            } else {
                String[] stringArray = mFont.H.LoginScreen(this.b.LoginScreen, 120);
                n2 = stringArray.length;
            }
        } else {
            this.d = mFont.k.LoginScreen(this.b.LoginScreen, this.c - 10);
            n2 = this.d.length;
        }
        this.k = 7;
        this.g = this.Res - this.c / 2 - 1;
        this.Item = this.m - 15 + this.k - n2 * 12 - 15;
        this.i = this.c + 2 + (this.b.c != null ? 30 : 0);
        this.j = (n2 + 1) * 12 + 1 + (this.b.c != null ? 5 : 0);
    }

    public final void methodLoginScreen(String string, int n2, Char af2, boolean bl2) {
        this.GameScreen = n2;
        if (this.LoginScreen.size() > 10) {
            this.LoginScreen.removeElementAt(0);
        }
        if (this.LoginScreen.size() > 0) {
            string.equals(((r)this.LoginScreen.lastElement()).LoginScreen);
        }
        r r2 = new r(string);
        if (this.GameScreen == 0) {
            r2.b = string.length();
        }
        if (r2.b < 70) {
            r2.b = 70;
        }
        if (this.GameScreen == 1) {
            r2.b = 10000000;
        }
        if (this.GameScreen == 3) {
            r2.b = 300;
            r2.Item = Res.currentTimeMillis();
            r2.f = string.length();
            if (r2.f < 15) {
                r2.f = 15;
            }
            if (r2.f > 100) {
                r2.f = 100;
            }
            r2.g = r2.f;
        }
        if (af2 != null) {
            r2.c = af2;
            r2.d = bl2;
            GameCanvas.G.LoginScreen(r2);
            if (GameCanvas.e && GameCanvas.G.au) {
                GameScreen.aE.i = new de(T.bq, this, 1000, r2);
            }
        }
        if (af2 != null && GameCanvas.G.au || af2 == null) {
            this.LoginScreen.addElement(r2);
        }
        if (this.LoginScreen.size() == 1) {
            this.b = (r)this.LoginScreen.firstElement();
            this.c();
        }
        if (GameCanvas.e && af2 != null && GameCanvas.G.au && GameCanvas.A - 50 > 155 + this.i) {
            GameScreen.aE.i.j = GameCanvas.A - this.i - 50;
            GameScreen.aE.i.k = 35;
        }
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1000) {
            cq cq2 = cq.b();
            GameScreen.j();
            cq2.LoginScreen(T.cQ);
        }
    }
}

