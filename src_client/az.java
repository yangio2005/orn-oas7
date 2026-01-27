/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class az {
    public boolean LoginScreen;
    private MyVector f;
    public int b;
    public int c;
    public int d;
    private int g;
    private int Item;
    private static int[] i;
    private static int j;
    private static int k;
    private static int Res;
    private static int m;
    private de n = new de(T.bw, 0);
    private de o = new de(T.bj, 0, GameCanvas.A - 71, GameCanvas.B - Screen.cr + 1);
    private de GameScreen = null;
    private static Image q;
    private static Image r;
    private boolean SessionReceiver;
    public int e;
    private int MyHashtable;
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
        q = Res.loadImage("/mainImage/myTexture2dbtMenu1.png");
        r = Res.loadImage("/mainImage/myTexture2dbtMenu2.png");
    }

    public final void methodLoginScreen(MyVector el2, int n2) {
        this.LoginScreen(el2);
        this.SessionReceiver = true;
    }

    public final void methodLoginScreen(MyVector el2, int n2, int n3) {
        this.LoginScreen(el2);
        this.c = n2;
        this.d = n3;
        while (this.d + this.Item > GameCanvas.B) {
            this.d -= 2;
        }
    }

    public final void methodLoginScreen(MyVector el2) {
        if (this.LoginScreen) {
            return;
        }
        this.F = false;
        this.B = false;
        this.C = false;
        this.e = 0;
        if (el2.size() == 1) {
            this.b = 0;
            de de2 = (de)el2.elementAt(0);
            if (de2 != null && de2.b.equals(T.cE)) {
                de2.LoginScreen();
                this.LoginScreen = false;
                bp.LoginScreen();
                return;
            }
        }
        bu.LoginScreen();
        this.G = new boolean[el2.size()];
        int n2 = 0;
        while (n2 < this.G.length) {
            this.G[n2] = false;
            ++n2;
        }
        this.SessionReceiver = false;
        ae.m = null;
        dc.x.removeAllElements();
        dc.z.removeAllElements();
        bp.c();
        if (el2.size() == 0) {
            return;
        }
        this.f = el2;
        this.g = 60;
        this.Item = 60;
        n2 = 0;
        while (n2 < el2.size()) {
            de de3 = (de)el2.elementAt(n2);
            ((de)el2.elementAt(n2)).f = false;
            mFont.n.LoginScreen(de3.b);
            de3.c = mFont.n.LoginScreen(de3.b, this.g - 10);
            ++n2;
        }
        i = new int[el2.size()];
        this.c = (GameCanvas.A - el2.size() * this.g) / 2;
        if (this.c <= 0) {
            this.c = 1;
        }
        this.d = GameCanvas.B - this.Item - (cx.LoginScreen + 1) - 1;
        if (GameCanvas.e) {
            this.d -= 3;
        }
        this.d += 27;
        n2 = 0;
        while (n2 < i.length) {
            az.i[n2] = GameCanvas.B;
            ++n2;
        }
        this.LoginScreen = true;
        this.b = 0;
        Res = this.f.size() * this.g - GameCanvas.A;
        if (Res < 0) {
            Res = 0;
        }
        j = 0;
        k = 0;
        m = 50;
        this.MyHashtable = el2.size() * this.g - 1;
        if (this.MyHashtable > GameCanvas.A - 2) {
            this.MyHashtable = GameCanvas.A - 2;
        }
        if (GameCanvas.e) {
            this.b = -1;
        }
    }

    private boolean c() {
        return !this.F && i[i.length - 1] > this.d || this.F && i[i.length - 1] < GameCanvas.B;
    }

    public final void methodLoginScreen() {
        int n2;
        if (GameScreen.j().bd && GameScreen.j().ba) {
            return;
        }
        if (!this.LoginScreen) {
            return;
        }
        if (this.c()) {
            return;
        }
        int n3 = 0;
        if (GameCanvas.i[2] || GameCanvas.i[4]) {
            n3 = 1;
            --this.b;
            if (this.b < 0) {
                this.b = this.f.size() - 1;
            }
        } else if (GameCanvas.i[8] || GameCanvas.i[6]) {
            n3 = 1;
            ++this.b;
            if (this.b > this.f.size() - 1) {
                this.b = 0;
            }
        } else if (GameCanvas.i[5]) {
            this.z = 2;
        } else if (GameCanvas.i[12] && !GameScreen.j().r()) {
            if (this.c()) {
                return;
            }
            if (this.n.e <= 0) {
                this.z = 2;
            }
            bu.LoginScreen();
        } else if (!GameScreen.j().r() && !this.SessionReceiver && (GameCanvas.i[13] || Screen.LoginScreen(this.o))) {
            if (this.c()) {
                return;
            }
            if (!this.C) {
                this.C = true;
            }
            this.F = true;
            bu.LoginScreen();
        }
        if (n3 != 0) {
            j = this.b * this.g + this.g - GameCanvas.A / 2;
            if (j > Res) {
                j = Res;
            }
            if (j < 0) {
                j = 0;
            }
            if (this.b == this.f.size() - 1 || this.b == 0) {
                k = j;
            }
        }
        n3 = 1;
        if (GameCanvas.G.ai != null && GameCanvas.G.ai.u) {
            if (!GameCanvas.isLowGraphic(GameCanvas.G.ai.e, 0, GameCanvas.G.ai.LoginScreen + 2, GameCanvas.G.ai.g)) {
                n3 = 1;
            } else {
                n3 = 0;
                GameCanvas.G.ai.b();
            }
        }
        if (!(this.SessionReceiver || !GameCanvas.m || GameCanvas.b(this.c, this.d, this.MyHashtable, this.Item) || this.x || GameScreen.j().r() || n3 == 0)) {
            if (this.c()) {
                return;
            }
            this.v = 0;
            this.u = 0;
            this.x = false;
            GameCanvas.Res();
            this.F = true;
            this.C = true;
            bu.LoginScreen();
            return;
        }
        if (GameCanvas.k) {
            if (!this.x && GameCanvas.b(this.c, this.d, this.MyHashtable, this.Item)) {
                n3 = 0;
                while (n3 < this.w.length) {
                    this.w[0] = GameCanvas.GameScreen;
                    ++n3;
                }
                this.v = GameCanvas.GameScreen;
                this.x = true;
                this.Message = this.A != 0;
                this.A = 0;
            } else if (this.x) {
                ++this.u;
                if (this.u > 5 && this.v == GameCanvas.GameScreen && !this.Message) {
                    this.v = -1000;
                    this.b = (j + GameCanvas.GameScreen - this.c) / this.g;
                }
                if ((n3 = GameCanvas.GameScreen - this.w[0]) != 0 && this.b != -1) {
                    this.b = -1;
                }
                n2 = this.w.length - 1;
                while (n2 > 0) {
                    this.w[n2] = this.w[n2 - 1];
                    --n2;
                }
                this.w[0] = GameCanvas.GameScreen;
                if ((j -= n3) < 0) {
                    j = 0;
                }
                if (j > Res) {
                    j = Res;
                }
                if (k < 0 || k > Res) {
                    n3 /= 2;
                }
                k -= n3;
            }
        }
        if (GameCanvas.m && this.x) {
            n3 = GameCanvas.GameScreen - this.w[0];
            GameCanvas.m = false;
            if (ds.g(n3) < 20 && ds.g(GameCanvas.GameScreen - this.v) < 20 && !this.Message) {
                this.A = 0;
                j = k;
                this.v = -1000;
                this.b = (j + GameCanvas.GameScreen - this.c) / this.g;
                this.u = 0;
                this.z = 10;
            } else if (this.b != -1 && this.u > 5) {
                this.u = 0;
                this.z = 1;
            } else if (this.b == -1 && !this.Message) {
                if (k < 0) {
                    j = 0;
                } else if (k > Res) {
                    j = Res;
                } else {
                    n2 = GameCanvas.GameScreen - this.w[0] + (this.w[0] - this.w[1]) + (this.w[1] - this.w[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.A = -n2 * 100;
                }
            }
            this.x = false;
            this.u = 0;
            GameCanvas.m = false;
        }
        GameCanvas.clearKeyHold();
        GameCanvas.resetKeys();
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (GameScreen.j().bd && GameScreen.j().ba) {
            return;
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.LoginScreen(-k, 0);
        int n2 = 0;
        while (n2 < this.f.size()) {
            if (n2 == this.b) {
                en2.LoginScreen(r, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            } else {
                en2.LoginScreen(q, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            }
            de de2 = (de)this.f.elementAt(n2);
            String[] stringArray = de2.c;
            if (de2.c == null) {
                stringArray = new String[]{((de)this.f.elementAt((int)n2)).b};
            }
            int n3 = i[n2] + (this.Item - stringArray.length * 14) / 2 + 1;
            int n4 = 0;
            while (n4 < stringArray.length) {
                if (n2 == this.b) {
                    mFont.g.LoginScreen(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else if (de2.LoginScreen) {
                    mFont.LoginScreen.LoginScreen(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else {
                    mFont.f.LoginScreen(en2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                }
                ++n4;
            }
            ++n2;
        }
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
    }

    public final void b() {
        az az2 = this;
        if (az2.A != 0 && !az2.x) {
            if ((j += az2.A / 100) < 0) {
                j = 0;
            } else if (j > Res) {
                j = Res;
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
                if (i[n5] < GameCanvas.B) {
                    int n6 = (GameCanvas.B - i[n5] >> 1) + 2;
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
            if (i[i.length - 1] >= GameCanvas.B) {
                this.e = 0;
                Object object = this;
                this.F = false;
                ((az)object).LoginScreen = false;
                bp.c();
                if (((az)object).C) {
                    GameCanvas.G.ai = null;
                    Char.x = null;
                    if (GameCanvas.H != null && GameCanvas.H.ai != null) {
                        GameCanvas.H.ai = null;
                    }
                } else if (((az)object).B) {
                    GameCanvas.G.ai = null;
                    if (GameCanvas.H != null && GameCanvas.H.ai != null) {
                        GameCanvas.H.ai = null;
                    }
                    if (((az)object).b >= 0 && (object = (de)((az)object).f.elementAt(((az)object).b)) != null) {
                        bu.LoginScreen();
                        ((de)object).LoginScreen();
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
                    GameCanvas.G.ai = null;
                    return;
                }
                Object object = this;
                bp.c();
                if (((az)object).b >= 0 && (object = (de)((az)object).f.elementAt(((az)object).b)) != null) {
                    ((de)object).LoginScreen();
                }
            }
        }
    }
}

