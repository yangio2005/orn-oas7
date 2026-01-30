/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class Command {
    public boolean a = false;
    public String IActionListener;
    public String[] c;
    public IActionListener d;
    public int e;
    public boolean f = true;
    public Image UIPanel;
    public Image h;
    public Image i;
    public int j = 0;
    public int k = 0;
    public int ResourceUtil = Screen.cq;
    public int m = Screen.cr;
    public boolean n = false;
    public Object o;
    public String GameScreen = "";
    private static Image s = ResourceUtil.IActionListener("/mainImage/btn0left.png");
    private static Image t = ResourceUtil.IActionListener("/mainImage/btn0mid.png");
    private static Image u = ResourceUtil.IActionListener("/mainImage/btn0right.png");
    private static Image v = ResourceUtil.IActionListener("/mainImage/btn1left.png");
    private static Image w = ResourceUtil.IActionListener("/mainImage/btn1mid.png");
    private static Image x = ResourceUtil.IActionListener("/mainImage/btn1right.png");
    public boolean q;
    public boolean r;

    public Command(String string, IActionListener b2, int n2, Object object, int n3, int n4) {
        this.b = string;
        this.e = n2;
        this.d = b2;
        this.o = null;
        this.j = n3;
        this.k = n4;
    }

    public Command(String string, IActionListener b2, int n2, Object object) {
        this.b = string;
        this.e = n2;
        this.d = b2;
        this.o = object;
    }

    public Command(String string, int n2, Object object) {
        this.b = string;
        this.e = n2;
        this.o = object;
    }

    public Command(String string, int n2) {
        this.b = string;
        this.e = n2;
    }

    public Command(String string, int n2, int n3, int n4) {
        this.b = string;
        this.e = 0;
        this.j = n3;
        this.k = n4;
    }

    public final void a() {
        main.GameCanvas.ResourceUtil();
        if (this.f && (this.b != null && !this.b.equals("") && !this.b.equals(GameStrings.cE) || this.g != null)) {
            SettingsManager.a();
        }
        if (this.e > 0) {
            if (this.d != null) {
                this.d.a(this.e, this.o);
                return;
            }
            GameScreen.j().a(this.e, this.o);
        }
    }

    public final void IActionListener() {
        this.l = 160;
    }

    public final void a(MGraphics en2) {
        if (this.g != null) {
            en2.a(this.g, this.j, this.k, 0);
            if (this.n) {
                if (this.h == null) {
                    if (this.q) {
                        en2.a(ce.f, this.j + 8, this.k + 8, 3);
                    } else {
                        en2.a(ce.f, this.j - (this.g.equals(GameScreen.at) ? 10 : 0), this.k, 0);
                    }
                } else {
                    en2.a(this.h, this.j, this.k, 0);
                }
            }
            if (this.b != "" && this.b != null) {
                if (!this.n) {
                    mFont.f.a(en2, this.b, this.j + MGraphics.a(this.g) / 2, this.k + MGraphics.IActionListener(this.g) / 2 - 5, 2);
                    return;
                }
                mFont.UIPanel.a(en2, this.b, this.j + MGraphics.a(this.g) / 2, this.k + MGraphics.IActionListener(this.g) / 2 - 5, 2);
            }
            return;
        }
        if (this.b != "") {
            if (!this.n) {
                Command.a(s, t, u, this.j, this.k, this.l, en2);
            } else {
                Command.a(v, w, x, this.j, this.k, this.l, en2);
            }
        }
        int n2 = 0;
        int n3 = this.j + this.l / 2;
        if (this.i != null) {
            n2 = this.i.getWidth();
            n3 = this.j + n2;
            if (!this.n) {
                en2.a(this.i, this.j, this.k, 0);
            } else {
                en2.a(this.i, this.j, this.k + 1, 0);
            }
        }
        if (!this.n) {
            mFont.f.a(en2, this.b, n3, this.k + 7, n2 == 0 ? 2 : 0);
            return;
        }
        mFont.UIPanel.a(en2, this.b, n3, this.k + 7, n2 == 0 ? 2 : 0);
    }

    private static void a(Image image, Image image2, Image image3, int n2, int n3, int n4, MGraphics en2) {
        int n5 = 10;
        while (n5 <= n4 - 20) {
            en2.a(image2, n2 + n5, n3, 0);
            n5 += 10;
        }
        n5 = n4 % 10;
        if (n5 > 0) {
            en2.a(image2, 0, 0, n5, 24, 0, n2 + n4 - 10 - n5, n3, 0);
        }
        en2.a(image, n2, n3, 0);
        en2.a(image3, n2 + n4 - 10, n3, 0);
    }

    public final boolean c() {
        this.n = false;
        if (main.GameCanvas.a(this.j, this.k, this.l, this.m)) {
            if (main.GameCanvas.k) {
                this.n = true;
            }
            if (main.GameCanvas.m) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int n2, int n3) {
        this.n = false;
        if (main.GameCanvas.a(this.j, this.k - n3, this.l, this.m)) {
            if (main.GameCanvas.k) {
                this.n = true;
            }
            if (main.GameCanvas.m) {
                return true;
            }
        }
        return false;
    }
}

