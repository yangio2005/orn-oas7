/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class bo {
    public static LoggingList a = new LoggingList("vPopups");
    public int IActionListener = 100;
    private int ResourceUtil;
    public String[] c;
    public int d;
    public int e;
    public int f;
    public int UIPanel;
    public boolean h = false;
    private int m = 0;
    private int n;
    public Command i;
    public boolean j = true;
    public boolean k = false;
    private static Image o;
    private static Image GameScreen;
    private static Image q;
    private static Image r;

    public static void a() {
        if (o == null) {
            o = ResourceUtil.IActionListener("/mainImage/myTexture2dbd3.png");
        }
        if (q == null) {
            q = ResourceUtil.IActionListener("/mainImage/myTexture2dimgPopup.png");
        }
        if (r == null) {
            r = ResourceUtil.IActionListener("/mainImage/myTexture2dimgPopup2.png");
        }
        if (GameScreen == null && ResourceUtil.c == 1) {
            GameScreen = ResourceUtil.IActionListener("/mainImage/portal.png");
        }
    }

    public bo(String string, int n2, int n3) {
        if (string.length() < 10) {
            this.b = 60;
        }
        if (main.GameCanvas.A == 128) {
            this.b = 128;
        }
        this.c = mFont.f.a(string, this.b - 10);
        this.l = 7;
        this.d = n2 - this.b / 2 - 1;
        this.e = n3 - 15 + this.l - this.c.length * 12 - 10;
        this.f = this.b + 2;
        this.g = (this.c.length + 1) * 12 + 1;
        while (this.f % 10 != 0) {
            ++this.f;
        }
        while (this.g % 10 != 0) {
            ++this.g;
        }
        if (n2 >= 0 && n2 <= 24) {
            this.d += this.f / 2 + 30;
        }
        if (n2 <= bv.a * 24 && n2 >= bv.a * 24 - 24) {
            this.d -= this.f / 2 + 6;
        }
        while (this.d <= 30) {
            this.d += 2;
        }
        while (this.d + this.f >= bv.a * 24 - 30) {
            this.d -= 2;
        }
    }

    public final void a(String[] stringArray, int n2, int n3) {
        this.b = 0;
        int n4 = 0;
        while (n4 < stringArray.length) {
            if (this.b < mFont.f.a(stringArray[n4])) {
                this.b = mFont.f.a(stringArray[n4]);
            }
            ++n4;
        }
        this.b += 20;
        this.c = stringArray;
        this.l = 7;
        this.d = n2 - this.b / 2 - 1;
        this.e = n3 - 15 + this.l - this.c.length * 12 - 10;
        this.f = this.b + 2;
        this.g = (this.c.length + 1) * 12 + 1;
        while (this.f % 10 != 0) {
            ++this.f;
        }
        while (this.g % 10 != 0) {
            ++this.g;
        }
        if (n2 >= 0 && n2 <= 24) {
            this.d += this.f / 2 + 30;
        }
        if (n2 <= bv.a * 24 && n2 >= bv.a * 24 - 24) {
            this.d -= this.f / 2 + 6;
        }
        while (this.d <= 30) {
            this.d += 2;
        }
        while (this.d + this.f >= bv.a * 24 - 30) {
            this.d -= 2;
        }
    }

    public static void a(bo bo2) {
        GameCanvas.addElement(bo2);
    }

    public static void a(MGraphics en2, int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        if (!bl2) {
            en2.a(0);
            en2.d(n2 + 6, n3, n4 - 14 + 1, n5);
            en2.d(n2, n3 + 6, n4, n5 - 12 + 1);
            en2.a(n6);
            en2.d(n2 + 6, n3 + 1, n4 - 12, n5 - 2);
            en2.d(n2 + 1, n3 + 6, n4 - 2, n5 - 12);
            en2.a(o, 0, 0, 7, 6, 0, n2, n3, 0);
            en2.a(o, 0, 0, 7, 6, 2, n2 + n4 - 7, n3, 0);
            en2.a(o, 0, 0, 7, 6, 6, n2, n3 + n5 - 7, 0);
            en2.a(o, 0, 0, 7, 6, 3, n2 + n4 - 7, n3 + n5 - 6, 0);
            return;
        }
        Image image = n6 == 1 ? r : q;
        en2.a(image, 0, 0, 10, 10, 0, n2, n3, 0);
        en2.a(image, 0, 20, 10, 10, 0, n2 + n4 - 10, n3, 0);
        en2.a(image, 0, 50, 10, 10, 0, n2, n3 + n5 - 10, 0);
        en2.a(image, 0, 70, 10, 10, 0, n2 + n4 - 10, n3 + n5 - 10, 0);
        int n7 = (n4 - 20) % 10 == 0 ? (n4 - 20) / 10 : (n4 - 20) / 10 + 1;
        int n8 = (n5 - 20) % 10 == 0 ? (n5 - 20) / 10 : (n5 - 20) / 10 + 1;
        int n9 = 0;
        while (n9 < n7) {
            en2.a(image, 0, 10, 10, 10, 0, n2 + 10 + n9 * 10, n3, 0);
            ++n9;
        }
        n9 = 0;
        while (n9 < n8) {
            en2.a(image, 0, 30, 10, 10, 0, n2, n3 + 10 + n9 * 10, 0);
            ++n9;
        }
        n9 = 0;
        while (n9 < n7) {
            en2.a(image, 0, 60, 10, 10, 0, n2 + 10 + n9 * 10, n3 + n5 - 10, 0);
            ++n9;
        }
        n9 = 0;
        while (n9 < n8) {
            en2.a(image, 0, 40, 10, 10, 0, n2 + n4 - 10, n3 + 10 + n9 * 10, 0);
            ++n9;
        }
        en2.a(n6 == 1 ? 12052656 : 16770503);
        en2.d(n2 + 10, n3 + 10, n4 - 20, n5 - 20);
    }

    public final void a(int n2) {
        this.n = 10;
    }

    public static void a(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            MGraphics en3 = en2;
            bo bo2 = (bo)GameCanvas.elementAt(n2);
            if (bo2.j && bo2.c != null && ae.m == null && !bo2.k) {
                int n3;
                int n4;
                if (ResourceUtil.c == 1) {
                    n4 = bo2.d;
                    n3 = bo2.e - main.GameCanvas.ae;
                    en3.e(n4, n3, bo2.f, bo2.UIPanel);
                    en3.a(GameScreen, n4, n3, 0);
                    if (bo2.f > 70) {
                        en3.a(GameScreen, n4 + 70, n3, 0);
                    }
                    if (bo2.UIPanel > 30) {
                        en3.a(GameScreen, n4, n3 + 30, 0);
                        if (bo2.f > 70) {
                            en3.a(GameScreen, n4 + 70, n3 + 30, 0);
                        }
                    }
                    en3.e(GameScreen.j, GameScreen.k, main.GameCanvas.A, main.GameCanvas.B);
                } else {
                    boolean bl2 = bo2.n != 0;
                    int n5 = bo2.UIPanel;
                    int n6 = bo2.f;
                    int n7 = bo2.e - main.GameCanvas.ae;
                    n3 = bo2.d;
                    MGraphics en4 = en3;
                    if (bl2) {
                        en4.a(n3, n7, n6, n5, 0xFFFFFF);
                    } else {
                        en4.a(n3, n7, n6, n5, 0);
                    }
                }
                n4 = 0;
                while (n4 < bo2.c.length) {
                    (bo2.n == 0 ? mFont.c : mFont.UIPanel).a(en3, bo2.c[n4], bo2.d + bo2.f / 2, bo2.e + (bo2.UIPanel / 2 - bo2.c.length * 12 / 2) + n4 * 12 - main.GameCanvas.ae, 2);
                    ++n4;
                }
            }
            ++n2;
        }
    }

    public static void IActionListener() {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            bo bo2 = (bo)GameCanvas.elementAt(n2);
            if (GameWorld.e().aD != null && GameWorld.e().aD.c == 0) {
                bo2.k = bo2.d + bo2.f < GameScreen.j || bo2.d > main.GameCanvas.A + GameScreen.j || bo2.e + bo2.UIPanel < GameScreen.k || bo2.e > main.GameCanvas.B + GameScreen.k;
            }
            if (GameWorld.e().aD == null || GameWorld.e().aD != null && GameWorld.e().aD.c != 0) {
                bo2.k = bo2.d + bo2.f / 2 < GameWorld.e().B - 100 || bo2.d + bo2.f / 2 > GameWorld.e().B + 100 || bo2.e + bo2.UIPanel < GameScreen.k || bo2.e > main.GameCanvas.B + GameScreen.k;
            }
            if (bo2.n > 0) {
                --bo2.n;
                if (bo2.n == 0 && bo2.i != null) {
                    bo2.i.a();
                }
            }
            if (bo2.h) {
                if (GameWorld.e().aD != null) {
                    if (GameWorld.e().aD.c == 0) {
                        if (GameWorld.e().aD.a == 0) {
                            bo2.j = false;
                        }
                        if (GameWorld.e().aD.a == 1) {
                            bo2.j = true;
                        }
                        if (GameWorld.e().aD.a > 1 && GameWorld.e().aD.a < 6) {
                            bo2.j = false;
                        }
                    } else if (!bo2.j) {
                        ++bo2.m;
                        if (bo2.m == 50) {
                            bo2.j = true;
                        }
                    }
                } else if (!bo2.j) {
                    v.i = false;
                    ++bo2.m;
                    if (bo2.m == 50) {
                        bo2.j = true;
                        v.i = true;
                    }
                }
            }
            ++n2;
        }
    }
}

