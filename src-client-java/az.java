/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class az {
    public boolean a;
    private LoggingList f;
    public int IActionListener;
    public int c;
    public int d;
    private int UIPanel;
    private int h;
    private static int[] i;
    private static int j;
    private static int k;
    private static int ResourceUtil;
    private static int m;
    private Command n = new Command(GameStrings.bw, 0);
    private Command o = new Command(GameStrings.bj, 0, main.GameCanvas.A - 71, main.GameCanvas.B - Screen.cr + 1);
    private Command GameScreen = null;
    private static Image q;
    private static Image r;
    private boolean s;
    public int e;
    private int t;
    private int u;
    private int v;
    private int[] w = new int[3];
    private boolean x;
    private boolean Message;
    private int z;
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private boolean F;
    private boolean[] G;

    static {
        q = ResourceUtil.IActionListener("/mainImage/myTexture2dbtMenu1.png");
        r = ResourceUtil.IActionListener("/mainImage/myTexture2dbtMenu2.png");
    }

    public final void a(LoggingList el2, int n2) {
        this.a(el2);
        this.s = true;
    }

    public final void a(LoggingList el2, int n2, int n3) {
        this.a(el2);
        this.c = n2;
        this.d = n3;
        while (this.d + this.h > main.GameCanvas.B) {
            this.d -= 2;
        }
    }

    public final void a(LoggingList el2) {
        if (this.a) {
            return;
        }
        this.F = false;
        this.B = false;
        this.C = false;
        this.e = 0;
        if (el2.size() == 1) {
            this.b = 0;
            Command de2 = (Command)el2.elementAt(0);
            if (de2 != null && de2.IActionListener.equals(GameStrings.cE)) {
                de2.a();
                this.a = false;
                bp.a();
                return;
            }
        }
        SettingsManager.a();
        this.G = new boolean[el2.size()];
        int n2 = 0;
        while (n2 < this.G.length) {
            this.G[n2] = false;
            ++n2;
        }
        this.s = false;
        ae.m = null;
        dc.x.removeAllElements();
        dc.z.removeAllElements();
        bp.c();
        if (el2.size() == 0) {
            return;
        }
        this.f = el2;
        this.g = 60;
        this.h = 60;
        n2 = 0;
        while (n2 < el2.size()) {
            Command de3 = (Command)el2.elementAt(n2);
            ((Command)el2.elementAt(n2)).f = false;
            mFont.n.a(de3.IActionListener);
            de3.c = mFont.n.a(de3.IActionListener, this.g - 10);
            ++n2;
        }
        i = new int[el2.size()];
        this.c = (main.GameCanvas.A - el2.size() * this.g) / 2;
        if (this.c <= 0) {
            this.c = 1;
        }
        this.d = main.GameCanvas.B - this.h - (cx.a + 1) - 1;
        if (main.GameCanvas.e) {
            this.d -= 3;
        }
        this.d += 27;
        n2 = 0;
        while (n2 < i.length) {
            az.i[n2] = main.GameCanvas.B;
            ++n2;
        }
        this.a = true;
        this.b = 0;
        ResourceUtil = this.f.size() * this.g - main.GameCanvas.A;
        if (ResourceUtil < 0) {
            ResourceUtil = 0;
        }
        j = 0;
        k = 0;
        m = 50;
        this.t = el2.size() * this.g - 1;
        if (this.t > main.GameCanvas.A - 2) {
            this.t = main.GameCanvas.A - 2;
        }
        if (main.GameCanvas.e) {
            this.b = -1;
        }
    }

    private boolean c() {
        return !this.F && i[i.length - 1] > this.d || this.F && i[i.length - 1] < main.GameCanvas.B;
    }

    public final void a() {
        int n2;
        if (GameScreen.j().IConnectionListener && GameScreen.j().ba) {
            return;
        }
        if (!this.a) {
            return;
        }
        if (this.c()) {
            return;
        }
        int n3 = 0;
        if (main.GameCanvas.i[2] || main.GameCanvas.i[4]) {
            n3 = 1;
            --this.b;
            if (this.b < 0) {
                this.b = this.f.size() - 1;
            }
        } else if (main.GameCanvas.i[8] || main.GameCanvas.i[6]) {
            n3 = 1;
            ++this.b;
            if (this.b > this.f.size() - 1) {
                this.b = 0;
            }
        } else if (main.GameCanvas.i[5]) {
            this.z = 2;
        } else if (main.GameCanvas.i[12] && !GameScreen.j().r()) {
            if (this.c()) {
                return;
            }
            if (this.n.e <= 0) {
                this.z = 2;
            }
            SettingsManager.a();
        } else if (!GameScreen.j().r() && !this.s && (main.GameCanvas.i[13] || Screen.a(this.o))) {
            if (this.c()) {
                return;
            }
            if (!this.C) {
                this.C = true;
            }
            this.F = true;
            SettingsManager.a();
        }
        if (n3 != 0) {
            j = this.b * this.g + this.g - main.GameCanvas.A / 2;
            if (j > ResourceUtil) {
                j = ResourceUtil;
            }
            if (j < 0) {
                j = 0;
            }
            if (this.b == this.f.size() - 1 || this.b == 0) {
                k = j;
            }
        }
        n3 = 1;
        if (main.GameCanvas.G.ai != null && main.GameCanvas.G.ai.u) {
            if (!main.GameCanvas.a(main.GameCanvas.G.ai.e, 0, main.GameCanvas.G.ai.a + 2, main.GameCanvas.G.ai.UIPanel)) {
                n3 = 1;
            } else {
                n3 = 0;
                main.GameCanvas.G.ai.IActionListener();
            }
        }
        if (!(this.s || !main.GameCanvas.m || main.GameCanvas.IActionListener(this.c, this.d, this.t, this.h) || this.x || GameScreen.j().r() || n3 == 0)) {
            if (this.c()) {
                return;
            }
            this.v = 0;
            this.u = 0;
            this.x = false;
            main.GameCanvas.ResourceUtil();
            this.F = true;
            this.C = true;
            SettingsManager.a();
            return;
        }
        if (main.GameCanvas.k) {
            if (!this.x && main.GameCanvas.IActionListener(this.c, this.d, this.t, this.h)) {
                n3 = 0;
                while (n3 < this.w.length) {
                    this.w[0] = main.GameCanvas.GameScreen;
                    ++n3;
                }
                this.v = main.GameCanvas.GameScreen;
                this.x = true;
                this.Message = this.A != 0;
                this.A = 0;
            } else if (this.x) {
                ++this.u;
                if (this.u > 5 && this.v == main.GameCanvas.GameScreen && !this.Message) {
                    this.v = -1000;
                    this.b = (j + main.GameCanvas.GameScreen - this.c) / this.g;
                }
                if ((n3 = main.GameCanvas.GameScreen - this.w[0]) != 0 && this.b != -1) {
                    this.b = -1;
                }
                n2 = this.w.length - 1;
                while (n2 > 0) {
                    this.w[n2] = this.w[n2 - 1];
                    --n2;
                }
                this.w[0] = main.GameCanvas.GameScreen;
                if ((j -= n3) < 0) {
                    j = 0;
                }
                if (j > ResourceUtil) {
                    j = ResourceUtil;
                }
                if (k < 0 || k > ResourceUtil) {
                    n3 /= 2;
                }
                k -= n3;
            }
        }
        if (main.GameCanvas.m && this.x) {
            n3 = main.GameCanvas.GameScreen - this.w[0];
            main.GameCanvas.m = false;
            if (MathUtil.UIPanel(n3) < 20 && MathUtil.UIPanel(main.GameCanvas.GameScreen - this.v) < 20 && !this.Message) {
                this.A = 0;
                j = k;
                this.v = -1000;
                this.b = (j + main.GameCanvas.GameScreen - this.c) / this.g;
                this.u = 0;
                this.z = 10;
            } else if (this.b != -1 && this.u > 5) {
                this.u = 0;
                this.z = 1;
            } else if (this.b == -1 && !this.Message) {
                if (k < 0) {
                    j = 0;
                } else if (k > ResourceUtil) {
                    j = ResourceUtil;
                } else {
                    n2 = main.GameCanvas.GameScreen - this.w[0] + (this.w[0] - this.w[1]) + (this.w[1] - this.w[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.A = -n2 * 100;
                }
            }
            this.x = false;
            this.u = 0;
            main.GameCanvas.m = false;
        }
        main.GameCanvas.f();
        main.GameCanvas.UIPanel();
    }

    public final void a(MGraphics en2) {
        if (GameScreen.j().IConnectionListener && GameScreen.j().ba) {
            return;
        }
        en2.a(-en2.a(), -en2.IActionListener());
        en2.a(-k, 0);
        int n2 = 0;
        while (n2 < this.f.size()) {
            if (n2 == this.b) {
                en2.a(r, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            } else {
                en2.a(q, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            }
            Command de2 = (Command)this.f.elementAt(n2);
            String[] stringArray = de2.c;
            if (de2.c == null) {
                stringArray = new String[]{((Command)this.f.elementAt((int)n2)).IActionListener};
            }
            int n3 = i[n2] + (this.h - stringArray.length * 14) / 2 + 1;
            int n4 = 0;
            while (n4 < stringArray.length) {
                if (n2 == this.b) {
                    mFont.UIPanel.a(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else if (de2.a) {
                    mFont.GameCanvas.a(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else {
                    mFont.f.a(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                }
                ++n4;
            }
            ++n2;
        }
        en2.a(-en2.a(), -en2.IActionListener());
    }

    public final void IActionListener() {
        az az2 = this;
        if (az2.A != 0 && !az2.x) {
            if ((j += az2.A / 100) < 0) {
                j = 0;
            } else if (j > ResourceUtil) {
                j = ResourceUtil;
            } else {
                k = j;
            }
            az2.A = az2.A * 9 / 10;
            if (az2.A < 100 && az2.A > -100) {
                az2.A = 0;
            }
        }
        if (k != j && !az2.x) {
            az2.D = j - k << 2;
            az2.E += az2.D;
            k += az2.E >> 4;
            az2.E &= 0xF;
        }
        if (!this.F) {
            ++this.e;
            int n2 = 0;
            while (n2 < i.length) {
                if (i[n2] > this.d) {
                    int n3 = i[n2] - this.d >> 1;
                    if (n3 <= 0) {
                        n3 = 1;
                    }
                    if (this.e > n2) {
                        int n4 = n2;
                        i[n4] = i[n4] - n3;
                    }
                }
                ++n2;
            }
            if (i[i.length - 1] <= this.d) {
                this.e = 0;
            }
        } else {
            ++this.e;
            int n5 = 0;
            while (n5 < i.length) {
                if (i[n5] < main.GameCanvas.B) {
                    int n6 = (main.GameCanvas.B - i[n5] >> 1) + 2;
                    if (n6 <= 0) {
                        n6 = 1;
                    }
                    if (this.e > n5) {
                        int n7 = n5;
                        i[n7] = i[n7] + n6;
                    }
                }
                ++n5;
            }
            if (i[i.length - 1] >= main.GameCanvas.B) {
                this.e = 0;
                Object object = this;
                this.F = false;
                ((az)object).a = false;
                bp.c();
                if (((az)object).C) {
                    main.GameCanvas.G.ai = null;
                    GameWorld.x = null;
                    if (main.GameCanvas.H != null && main.GameCanvas.H.ai != null) {
                        main.GameCanvas.H.ai = null;
                    }
                } else if (((az)object).B) {
                    main.GameCanvas.G.ai = null;
                    if (main.GameCanvas.H != null && main.GameCanvas.H.ai != null) {
                        main.GameCanvas.H.ai = null;
                    }
                    if (((az)object).IActionListener >= 0 && (object = (Command)((az)object).f.elementAt(((az)object).IActionListener)) != null) {
                        SettingsManager.a();
                        ((Command)object).a();
                    }
                }
            }
        }
        if (m != 0 && (m >>= 1) < 0) {
            m = 0;
        }
        if (this.c()) {
            return;
        }
        if (this.z > 0) {
            --this.z;
            if (this.z == 0) {
                if (this.b >= 0 && !this.G[this.b]) {
                    this.F = true;
                    this.B = true;
                    main.GameCanvas.G.ai = null;
                    return;
                }
                Object object = this;
                bp.c();
                if (((az)object).IActionListener >= 0 && (object = (Command)((az)object).f.elementAt(((az)object).IActionListener)) != null) {
                    ((Command)object).a();
                }
            }
        }
    }
}

