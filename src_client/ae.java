/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameMidlet;
import main.GameCanvas;
public final class ae
extends dc
implements b {
    public int LoginScreen = 100;
    public int b;
    public int c;
    public String[] d;
    public int e;
    public int f;
    public int g;
    public int Item;
    public _do i;
    private static long C;
    private static long D;
    private int E;
    private String[] F;
    public de j;
    public de k;
    public de Res;
    public static ae m;
    public static ae n;
    private static String G;
    private static _do H;
    public byte o = 0;
    public byte GameScreen = 0;
    public static dv q;
    private static boolean I;
    private int J;
    private static int K;
    private int L;
    public boolean[] r = new boolean[20];
    public static int SessionReceiver;
    private int M = 0;
    private int N = 0;
    private int O = 0;
    private Image P;
    public int MyHashtable;
    public boolean u = false;
    public static int v;
    private int Q = 0;
    private int R = 0;

    static {
        SessionReceiver = 7;
    }

    public static void methodLoginScreen(String string, _do do_) {
        G = string;
        H = do_;
        if (m == null) {
            ae.b(G, 100000, H);
            G = null;
            H = null;
        }
    }

    public static void methodLoginScreen(String stringArray, int n2, _do do_) {
        stringArray = new String[]{stringArray};
        if (do_.J != 5 && GameScreen.aD.e) {
            GameScreen.aD.f = false;
        }
        Char.bH = true;
        n = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).MyHashtable = 5;
        ae.n.e = GameCanvas.A / 2 - ae.n.LoginScreen / 2 - 1;
        ae.n.f = GameCanvas.B - 20 - ae.n.g;
        ae.n.E = 0;
        ae.n.F = stringArray;
        q = new dv();
        int n3 = ae.n.d.length;
        q.LoginScreen(n3, 12, ae.n.e, ae.n.f - ae.n.MyHashtable + 12, ae.n.LoginScreen + 2, ae.n.g - 25, true, 1);
        bu.LoginScreen();
    }

    public static void b(String stringArray, int n2, _do do_) {
        ds.c("chat= " + (String)stringArray);
        stringArray = ds.LoginScreen((String)stringArray, "\n", 0);
        Char.bH = true;
        m = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).E = 0;
        ae.m.F = stringArray;
        String string = T.bl;
        if (stringArray.length == 1) {
            string = T.bj;
        }
        ae.m.j = new de(string, m, 8000, null);
        ae.m.j.j = GameCanvas.A / 2 - 35;
        ae.m.j.k = GameCanvas.B - 35;
        bu.LoginScreen();
    }

    public static ae c(String string, int n2, _do do_) {
        ds.c("ADD POP");
        ds.c(Char.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().LoginScreen = GameCanvas.A - 30 - (GameCanvas.F.LoginScreen ? GameCanvas.F.c : 0);
        if (ae2.LoginScreen > 320) {
            ae2.LoginScreen = 320;
        }
        if (string.length() < 10) {
            ae2.LoginScreen = 64;
        }
        if (GameCanvas.A == 128) {
            ae2.LoginScreen = 128;
        }
        ae2.d = mFont.GameScreen.LoginScreen(string, ae2.LoginScreen - 10);
        ae2.b = n2;
        ae2.i = do_;
        Char.x = ae2;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > GameCanvas.B - 80) {
            ae2.g = GameCanvas.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            GameScreen.aD.LoginScreen("", 1);
        }
        C = D = Res.currentTimeMillis();
        return ae2;
    }

    public static ae LoginScreen(String string, int n2, _do do_, int n3) {
        ds.c("ADD POP");
        ds.c(Char.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().LoginScreen = GameCanvas.A - 30 - (GameCanvas.F.LoginScreen ? GameCanvas.F.c : 0);
        if (ae2.LoginScreen > 320) {
            ae2.LoginScreen = 320;
        }
        if (string.length() < 10) {
            ae2.LoginScreen = 64;
        }
        if (GameCanvas.A == 128) {
            ae2.LoginScreen = 128;
        }
        ae2.d = mFont.GameScreen.LoginScreen(string, ae2.LoginScreen - 10);
        ae2.b = 100000;
        ae2.i = do_;
        ae2.J = 5820;
        Char.x = ae2;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > GameCanvas.B - 80) {
            ae2.g = GameCanvas.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            GameScreen.aD.LoginScreen("", 1);
        }
        ae2.g += 15;
        C = D = Res.currentTimeMillis();
        return ae2;
    }

    public final void methodLoginScreen() {
        if (q != null) {
            GameScreen.aD.f = false;
            q.b();
        } else {
            GameScreen.aD.f = true;
        }
        if (GameCanvas.F.LoginScreen) {
            this.MyHashtable = 0;
            this.e = GameCanvas.A / 2 - this.LoginScreen / 2 - 1;
            this.f = GameCanvas.F.d - this.g;
        } else {
            this.MyHashtable = 0;
            if (GameScreen.j().co != null || GameScreen.j().cm != null || GameScreen.j().cn != null || this.j != null || this.k != null) {
                this.MyHashtable = 5;
                this.e = GameCanvas.A / 2 - this.LoginScreen / 2 - 1;
                this.f = GameCanvas.B - 20 - this.g;
            } else {
                this.e = GameCanvas.A / 2 - this.LoginScreen / 2 - 1;
                this.f = GameCanvas.B - 5 - this.g;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (K > 0) {
            --K;
        } else {
            GameScreen.aD.b.e = 0;
            int n2 = 0;
            while (n2 < GameScreen.aD.b.LoginScreen.size()) {
                if (((r)GameScreen.aD.b.LoginScreen.elementAt((int)n2)).b != 70) {
                    ((r)GameScreen.aD.b.LoginScreen.elementAt((int)n2)).b = 10;
                }
                ++n2;
            }
        }
        if (this.c > 1) {
            --this.c;
        }
        if (this.i != null && Char.x != null && Char.x != this || this.i != null && Char.x == null || this.b <= 0) {
            dc.z.removeElement(this);
            dc.x.removeElement(this);
        }
    }

    public final void methodLoginScreen(mGraphics object) {
        int n2;
        Object object2;
        int n3;
        if (GameScreen.j().bd && GameScreen.j().ba) {
            return;
        }
        GameCanvas.isLowGraphic((mGraphics)object);
        int n4 = this.e;
        int n5 = this.f;
        int n6 = this.LoginScreen + 2;
        int n7 = this.g;
        if (!(n4 > 0 && n5 > 0 || GameCanvas.G.LoginScreen)) {
            return;
        }
        if (this.i != null) {
            n3 = GameCanvas.w % 10 > 2 ? 0 : 1;
            bl.b((mGraphics)object, this.i.aO, this.e + 14, this.f + n3, 0, cj.d);
        }
        if (this.J != 0) {
            n3 = GameCanvas.w % 10 > 2 ? 0 : 1;
            bl.b((mGraphics)object, this.J, this.e + n6 / 2, this.f + this.g - 15 + n3, 0, cj.f);
        }
        bo.LoginScreen((mGraphics)object, n4, n5, n6, n7, 0xFFFFFF, false);
        if (q != null) {
            ((mGraphics)object).e(n4, n5, n6, n7 - 16);
            ((mGraphics)object).LoginScreen(0, -ae.q.d);
        }
        n3 = 0;
        int n8 = 0;
        if (this.u) {
            n3 = ((mGraphics)object).LoginScreen();
            n8 = ((mGraphics)object).b();
            ((mGraphics)object).e(n4, n5 + 1, n6, n7 - 17);
            ((mGraphics)object).LoginScreen(0, -v);
        }
        int n9 = -1;
        int n10 = 0;
        while (n10 < this.d.length) {
            if (this.d[n10].startsWith("--")) {
                ((mGraphics)object).LoginScreen(0);
                ((mGraphics)object).d(n4 + 10, this.f + this.c + n10 * 12 + 6, n6 - 20, 1);
            } else {
                int n11;
                object2 = mFont.k;
                n2 = 2;
                Object object3 = this.d[n10];
                if (this.d[n10].startsWith("|")) {
                    String[] stringArray = ds.LoginScreen(this.d[n10], "|", 0);
                    if (stringArray.length == 3) {
                        object3 = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object3 = stringArray[3];
                        n2 = Integer.parseInt(stringArray[2]);
                    }
                    n9 = n11 = Integer.parseInt(stringArray[1]);
                } else {
                    n11 = n9;
                }
                switch (n11) {
                    case -1: {
                        object2 = mFont.k;
                        break;
                    }
                    case 0: {
                        object2 = mFont.f;
                        break;
                    }
                    case 1: {
                        object2 = mFont.Item;
                        break;
                    }
                    case 2: {
                        object2 = mFont.b;
                        break;
                    }
                    case 3: {
                        object2 = mFont.GameScreen;
                        break;
                    }
                    case 4: {
                        object2 = mFont.r;
                        break;
                    }
                    case 5: {
                        object2 = mFont.q;
                        break;
                    }
                    case 7: {
                        object2 = mFont.LoginScreen;
                        break;
                    }
                    case 8: {
                        object2 = mFont.d;
                        break;
                    }
                    case 9: {
                        object2 = mFont.d;
                    }
                }
                if (this.d[n10].startsWith("<")) {
                    String[] stringArray = ds.LoginScreen(this.d[n10], "<", 0);
                    object3 = ds.LoginScreen(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object3[1]);
                    } else {
                        C = Res.currentTimeMillis();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object3 = String.valueOf(this.L) + " " + object3[2];
                    ((mFont)object2).LoginScreen((mGraphics)object, (String)object3, this.e + this.LoginScreen / 2, this.f + this.c + n10 * 12 - this.MyHashtable + 12, n2);
                } else {
                    if (n2 == 2) {
                        ((mFont)object2).LoginScreen((mGraphics)object, (String)object3, this.e + this.LoginScreen / 2, this.f + this.c + n10 * 12 - this.MyHashtable + 12, n2);
                    }
                    if (n2 == 1) {
                        ((mFont)object2).LoginScreen((mGraphics)object, (String)object3, this.e + this.LoginScreen - 5, this.f + this.c + n10 * 12 - this.MyHashtable + 12, n2);
                    }
                }
            }
            ++n10;
        }
        if (this.u) {
            GameCanvas.isLowGraphic((mGraphics)object);
            ((mGraphics)object).LoginScreen(n3, n8);
        }
        if (this.GameScreen > 4) {
            this.N = (this.GameScreen + 1) / 2;
            this.M = this.GameScreen - this.N;
            int[] nArray = new int[this.GameScreen];
            object2 = new int[this.GameScreen];
            n2 = 0;
            while (n2 < this.N) {
                ((mGraphics)object).LoginScreen(g.SessionReceiver, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(g.SessionReceiver), n5 + n7 - 17, 3);
                nArray[n2] = n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(g.SessionReceiver);
                object2[n2] = n5 + n7 - 17;
                ++n2;
            }
            n2 = 0;
            while (n2 < this.M) {
                ((mGraphics)object).LoginScreen(g.SessionReceiver, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(g.SessionReceiver), n5 + n7 - 8, 3);
                nArray[this.N + n2] = n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(g.SessionReceiver);
                object2[this.N + n2] = n5 + n7 - 8;
                ++n2;
            }
            ds.b(String.valueOf(this.GameScreen) + "maxStarSlot");
            if (this.GameScreen >= 7) {
                int n12 = 7;
                while (n12 < this.GameScreen) {
                    if (this.r[n12]) {
                        ((mGraphics)object).LoginScreen(g.u, nArray[n12], (int)object2[n12], 3);
                    }
                    ++n12;
                }
            }
            if (this.o > 0) {
                this.P = g.r;
                if (this.o >= this.N) {
                    this.O = this.o - this.N;
                    n2 = 0;
                    while (n2 < this.N) {
                        ((mGraphics)object).LoginScreen(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < this.O) {
                        if (n2 + this.N >= SessionReceiver) {
                            this.P = g.MyHashtable;
                        }
                        ((mGraphics)object).LoginScreen(this.P, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(this.P), n5 + n7 - 8, 3);
                        ++n2;
                    }
                } else {
                    n2 = 0;
                    while (n2 < this.o) {
                        ((mGraphics)object).LoginScreen(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + mGraphics.LoginScreen(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                }
            }
        } else {
            n10 = 0;
            while (n10 < this.GameScreen) {
                ((mGraphics)object).LoginScreen(g.SessionReceiver, n4 + n6 / 2 - this.GameScreen * 20 / 2 + n10 * 20 + mGraphics.LoginScreen(g.SessionReceiver), n5 + n7 - 13, 3);
                ++n10;
            }
            if (this.o > 0) {
                n10 = 0;
                while (n10 < this.o) {
                    ((mGraphics)object).LoginScreen(g.r, n4 + n6 / 2 - this.GameScreen * 20 / 2 + n10 * 20 + mGraphics.LoginScreen(g.r), n5 + n7 - 13, 3);
                    ++n10;
                }
            }
        }
        mGraphics en2 = object;
        object = this;
        en2.LoginScreen(-en2.LoginScreen(), -en2.b());
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (((ae)object).j != null) {
            cx.LoginScreen(en2, null, ((ae)object).j, null);
        }
        if (((ae)object).k != null) {
            cx.LoginScreen(en2, ((ae)object).k, null, ((ae)object).Res);
        }
    }

    public final void methodLoginScreen(mGraphics en2, int n2) {
        int n3 = this.e;
        int n4 = this.f;
        int n5 = this.LoginScreen;
        int n6 = en2.LoginScreen();
        int n7 = en2.b();
        en2.LoginScreen(0, -n2);
        if (!(n3 > 0 && n4 > 0 || GameCanvas.G.LoginScreen)) {
            return;
        }
        n2 = -1;
        n4 = 0;
        while (n4 < this.d.length) {
            if (this.d[n4].startsWith("--")) {
                en2.LoginScreen(0xFFFFFF);
                en2.d(n3 + 10, this.f + this.c + n4 * 12 - 6, n5 - 20, 1);
            } else {
                int n8;
                mFont di2 = mFont.SessionReceiver;
                int n9 = 2;
                Object object = this.d[n4];
                if (this.d[n4].startsWith("|")) {
                    String[] stringArray = ds.LoginScreen(this.d[n4], "|", 0);
                    if (stringArray.length == 3) {
                        object = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object = stringArray[3];
                        n9 = Integer.parseInt(stringArray[2]);
                    }
                    n2 = n8 = Integer.parseInt(stringArray[1]);
                } else {
                    n8 = n2;
                }
                switch (n8) {
                    case -1: {
                        di2 = mFont.SessionReceiver;
                        break;
                    }
                    case 0: {
                        di2 = mFont.c;
                        break;
                    }
                    case 1: {
                        di2 = mFont.Item;
                        break;
                    }
                    case 2: {
                        di2 = mFont.LoginScreen;
                    }
                }
                if (this.d[n4].startsWith("<")) {
                    String[] stringArray = ds.LoginScreen(this.d[n4], "<", 0);
                    object = ds.LoginScreen(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object[1]);
                    } else {
                        C = Res.currentTimeMillis();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object = String.valueOf(this.L) + " " + object[2];
                    di2.LoginScreen(en2, (String)object, this.e + this.LoginScreen / 2, this.f + this.c + n4 * 12 - this.MyHashtable, n9);
                } else {
                    if (n9 == 2) {
                        di2.LoginScreen(en2, (String)object, this.e + this.LoginScreen / 2, this.f + this.c + n4 * 12 - this.MyHashtable, n9);
                    }
                    if (n9 == 1) {
                        di2.LoginScreen(en2, (String)object, this.e + this.LoginScreen - 5, this.f + this.c + n4 * 12 - this.MyHashtable, n9);
                    }
                }
            }
            ++n4;
        }
        GameCanvas.isLowGraphic(en2);
        en2.LoginScreen(n6, n7);
    }

    private void methodLoginScreen(int n2) {
        if ((v += n2 * 12) < 0) {
            v = 0;
        }
        if (v > this.Item) {
            v = this.Item;
        }
    }

    public final void b() {
        if (this.u) {
            if (GameCanvas.i[8]) {
                GameCanvas.i[8] = false;
                this.LoginScreen(1);
            }
            if (GameCanvas.i[2]) {
                GameCanvas.i[2] = false;
                this.LoginScreen(-1);
            }
            if (GameCanvas.isLowGraphic(this.e, 0, this.LoginScreen + 2, this.g)) {
                if (GameCanvas.n) {
                    if (this.R == 0) {
                        this.R = GameCanvas.q;
                    }
                    this.Q = this.R - GameCanvas.q;
                    if (this.Q != 0) {
                        v += this.Q;
                        this.R = GameCanvas.q;
                    }
                    if (v < 0) {
                        v = 0;
                    }
                    if (v > this.Item) {
                        v = this.Item;
                    }
                } else {
                    this.R = 0;
                    this.R = 0;
                }
            }
        }
        if (q != null) {
            if (GameCanvas.e) {
                q.LoginScreen();
            }
            if (GameCanvas.j[2]) {
                ae.q.b -= 12;
                if (ae.q.b < 0) {
                    ae.q.b = 0;
                }
            }
            if (GameCanvas.j[8]) {
                GameCanvas.i[8] = false;
                ae.q.b += 12;
                if (ae.q.b > ae.q.Res) {
                    ae.q.b = ae.q.Res;
                }
            }
        }
        if (GameCanvas.i[5] || Screen.LoginScreen(GameCanvas.currentScreen.cn)) {
            GameCanvas.i[5] = false;
            Screen.cs = -1;
            if (this.j != null) {
                this.j.LoginScreen();
            } else if (this.k != null) {
                this.k.LoginScreen();
            } else if (this.Res != null) {
                this.Res.loadImageFromRMS();
            }
        }
        if (q != null && ae.q.m) {
            return;
        }
        if (this.k != null && (GameCanvas.i[12] || GameCanvas.i[5] || Screen.LoginScreen(this.k))) {
            GameCanvas.i[12] = false;
            GameCanvas.i[5] = false;
            GameCanvas.Res = false;
            GameCanvas.m = false;
            this.k.LoginScreen();
            Screen.cs = -1;
        }
        if (this.Res != null && (GameCanvas.i[13] || Screen.LoginScreen(this.Res))) {
            GameCanvas.i[13] = false;
            GameCanvas.Res = false;
            GameCanvas.m = false;
            this.Res.loadImageFromRMS();
            Screen.cs = -1;
        }
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1000) {
            try {
                GameMidlet.f.platformRequest((String)object);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            GameMidlet.f.notifyDestroyed();
            GameCanvas.instance();
        }
        if (n2 == 1001) {
            q = null;
            Char.x = null;
            n = null;
            GameScreen.aD.f = true;
            Char.bH = false;
            if (I) {
                GameScreen.aD.b.e = 0;
                GameScreen.aD.b.b.b = 10;
            }
        }
        if (n2 == 8000) {
            if (K > 0) {
                return;
            }
            int n3 = ae.m.E;
            if (++n3 >= ae.m.F.length) {
                Char.x = null;
                m = null;
                GameScreen.aD.f = true;
                Char.bH = false;
                if (G != null) {
                    ae.b(G, 100000, H);
                    G = null;
                    H = null;
                    return;
                }
                if (I) {
                    GameScreen.aD.b.e = 0;
                    n2 = 0;
                    while (n2 < GameScreen.aD.b.LoginScreen.size()) {
                        if (((r)GameScreen.aD.b.LoginScreen.elementAt((int)n2)).b == 10000000) {
                            ((r)GameScreen.aD.b.LoginScreen.elementAt((int)n2)).b = 10;
                        }
                        ++n2;
                    }
                }
                return;
            }
            ae ae2 = ae.c(ae.m.F[n3], ae.m.b, ae.m.i);
            ae.c(ae.m.F[n3], ae.m.b, ae.m.i).E = n3;
            ae2.F = ae.m.F;
            ae2.j = ae.m.j;
            m = ae2;
        }
    }
}

