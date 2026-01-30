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
implements IActionListener {
    public int a = 100;
    public int IActionListener;
    public int c;
    public String[] d;
    public int e;
    public int f;
    public int UIPanel;
    public int h;
    public TextBox i;
    private static long C;
    private static long D;
    private int E;
    private String[] F;
    public Command j;
    public Command k;
    public Command ResourceUtil;
    public static ae m;
    public static ae n;
    private static String G;
    private static do H;
    public byte o = 0;
    public byte GameScreen = 0;
    public static dv q;
    private static boolean I;
    private int J;
    private static int K;
    private int L;
    public boolean[] r = new boolean[20];
    public static int s;
    private int M = 0;
    private int N = 0;
    private int O = 0;
    private Image P;
    public int t;
    public boolean u = false;
    public static int v;
    private int Q = 0;
    private int R = 0;

    static {
        s = 7;
    }

    public static void a(String string, do do_) {
        G = string;
        H = do_;
        if (m == null) {
            ae.IActionListener(G, 100000, H);
            G = null;
            H = null;
        }
    }

    public static void a(String stringArray, int n2, do do_) {
        stringArray = new String[]{stringArray};
        if (do_.J != 5 && GameScreen.aD.e) {
            GameScreen.aD.f = false;
        }
        GameWorld.bH = true;
        n = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).t = 5;
        ae.n.e = main.GameCanvas.A / 2 - ae.n.a / 2 - 1;
        ae.n.f = main.GameCanvas.B - 20 - ae.Character.UIPanel;
        ae.Character.E = 0;
        ae.Character.F = stringArray;
        q = new dv();
        int n3 = ae.n.d.length;
        q.a(n3, 12, ae.n.e, ae.n.f - ae.n.t + 12, ae.n.a + 2, ae.Character.UIPanel - 25, true, 1);
        SettingsManager.a();
    }

    public static void IActionListener(String stringArray, int n2, do do_) {
        MathUtil.c("chat= " + (String)stringArray);
        stringArray = MathUtil.a((String)stringArray, "\n", 0);
        GameWorld.bH = true;
        m = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).E = 0;
        ae.m.F = stringArray;
        String string = GameStrings.bl;
        if (stringArray.length == 1) {
            string = GameStrings.bj;
        }
        ae.m.j = new Command(string, m, 8000, null);
        ae.m.j.j = main.GameCanvas.A / 2 - 35;
        ae.m.j.k = main.GameCanvas.B - 35;
        SettingsManager.a();
    }

    public static ae c(String string, int n2, do do_) {
        MathUtil.c("ADD POP");
        MathUtil.c(GameWorld.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().a = main.GameCanvas.A - 30 - (main.GameCanvas.F.a ? main.GameCanvas.F.c : 0);
        if (ae2.a > 320) {
            ae2.a = 320;
        }
        if (string.length() < 10) {
            ae2.a = 64;
        }
        if (main.GameCanvas.A == 128) {
            ae2.a = 128;
        }
        ae2.d = mFont.GameScreen.a(string, ae2.a - 10);
        ae2.IActionListener = n2;
        ae2.i = do_;
        GameWorld.x = ae2;
        ae2.UIPanel = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.UIPanel > main.GameCanvas.B - 80) {
            ae2.UIPanel = main.GameCanvas.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            GameScreen.aD.a("", 1);
        }
        C = D = ResourceUtil.d();
        return ae2;
    }

    public static ae a(String string, int n2, do do_, int n3) {
        MathUtil.c("ADD POP");
        MathUtil.c(GameWorld.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().a = main.GameCanvas.A - 30 - (main.GameCanvas.F.a ? main.GameCanvas.F.c : 0);
        if (ae2.a > 320) {
            ae2.a = 320;
        }
        if (string.length() < 10) {
            ae2.a = 64;
        }
        if (main.GameCanvas.A == 128) {
            ae2.a = 128;
        }
        ae2.d = mFont.GameScreen.a(string, ae2.a - 10);
        ae2.IActionListener = 100000;
        ae2.i = do_;
        ae2.J = 5820;
        GameWorld.x = ae2;
        ae2.UIPanel = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.UIPanel > main.GameCanvas.B - 80) {
            ae2.UIPanel = main.GameCanvas.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            GameScreen.aD.a("", 1);
        }
        ae2.UIPanel += 15;
        C = D = ResourceUtil.d();
        return ae2;
    }

    public final void a() {
        if (q != null) {
            GameScreen.aD.f = false;
            q.IActionListener();
        } else {
            GameScreen.aD.f = true;
        }
        if (main.GameCanvas.F.a) {
            this.t = 0;
            this.e = main.GameCanvas.A / 2 - this.a / 2 - 1;
            this.f = main.GameCanvas.F.d - this.g;
        } else {
            this.t = 0;
            if (GameScreen.j().co != null || GameScreen.j().cm != null || GameScreen.j().cn != null || this.j != null || this.k != null) {
                this.t = 5;
                this.e = main.GameCanvas.A / 2 - this.a / 2 - 1;
                this.f = main.GameCanvas.B - 20 - this.g;
            } else {
                this.e = main.GameCanvas.A / 2 - this.a / 2 - 1;
                this.f = main.GameCanvas.B - 5 - this.g;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (K > 0) {
            --K;
        } else {
            GameScreen.aD.IActionListener.e = 0;
            int n2 = 0;
            while (n2 < GameScreen.aD.IActionListener.GameCanvas.size()) {
                if (((r)GameScreen.aD.IActionListener.GameCanvas.elementAt((int)n2)).IActionListener != 70) {
                    ((r)GameScreen.aD.IActionListener.GameCanvas.elementAt((int)n2)).IActionListener = 10;
                }
                ++n2;
            }
        }
        if (this.c > 1) {
            --this.c;
        }
        if (this.i != null && GameWorld.x != null && GameWorld.x != this || this.i != null && GameWorld.x == null || this.b <= 0) {
            dc.z.removeElement(this);
            dc.x.removeElement(this);
        }
    }

    public final void a(MGraphics object) {
        int n2;
        Object object2;
        int n3;
        if (GameScreen.j().IConnectionListener && GameScreen.j().ba) {
            return;
        }
        main.GameCanvas.a((MGraphics)object);
        int n4 = this.e;
        int n5 = this.f;
        int n6 = this.a + 2;
        int n7 = this.g;
        if (!(n4 > 0 && n5 > 0 || main.GameCanvas.G.a)) {
            return;
        }
        if (this.i != null) {
            n3 = main.GameCanvas.w % 10 > 2 ? 0 : 1;
            bl.IActionListener((MGraphics)object, this.i.aO, this.e + 14, this.f + n3, 0, cj.d);
        }
        if (this.J != 0) {
            n3 = main.GameCanvas.w % 10 > 2 ? 0 : 1;
            bl.IActionListener((MGraphics)object, this.J, this.e + n6 / 2, this.f + this.g - 15 + n3, 0, cj.f);
        }
        bo.a((MGraphics)object, n4, n5, n6, n7, 0xFFFFFF, false);
        if (q != null) {
            ((MGraphics)object).e(n4, n5, n6, n7 - 16);
            ((MGraphics)object).a(0, -ae.q.d);
        }
        n3 = 0;
        int n8 = 0;
        if (this.u) {
            n3 = ((MGraphics)object).a();
            n8 = ((MGraphics)object).IActionListener();
            ((MGraphics)object).e(n4, n5 + 1, n6, n7 - 17);
            ((MGraphics)object).a(0, -v);
        }
        int n9 = -1;
        int n10 = 0;
        while (n10 < this.d.length) {
            if (this.d[n10].startsWith("--")) {
                ((MGraphics)object).a(0);
                ((MGraphics)object).d(n4 + 10, this.f + this.c + n10 * 12 + 6, n6 - 20, 1);
            } else {
                int n11;
                object2 = mFont.k;
                n2 = 2;
                Object object3 = this.d[n10];
                if (this.d[n10].startsWith("|")) {
                    String[] stringArray = MathUtil.a(this.d[n10], "|", 0);
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
                        object2 = mFont.h;
                        break;
                    }
                    case 2: {
                        object2 = mFont.IActionListener;
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
                        object2 = mFont.a;
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
                    String[] stringArray = MathUtil.a(this.d[n10], "<", 0);
                    object3 = MathUtil.a(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object3[1]);
                    } else {
                        C = ResourceUtil.d();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object3 = String.valueOf(this.L) + " " + object3[2];
                    ((mFont)object2).a((MGraphics)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.t + 12, n2);
                } else {
                    if (n2 == 2) {
                        ((mFont)object2).a((MGraphics)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.t + 12, n2);
                    }
                    if (n2 == 1) {
                        ((mFont)object2).a((MGraphics)object, (String)object3, this.e + this.a - 5, this.f + this.c + n10 * 12 - this.t + 12, n2);
                    }
                }
            }
            ++n10;
        }
        if (this.u) {
            main.GameCanvas.a((MGraphics)object);
            ((MGraphics)object).a(n3, n8);
        }
        if (this.GameScreen > 4) {
            this.N = (this.GameScreen + 1) / 2;
            this.M = this.GameScreen - this.N;
            int[] nArray = new int[this.GameScreen];
            object2 = new int[this.GameScreen];
            n2 = 0;
            while (n2 < this.N) {
                ((MGraphics)object).a(UIPanel.s, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + MGraphics.a(UIPanel.s), n5 + n7 - 17, 3);
                nArray[n2] = n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + MGraphics.a(UIPanel.s);
                object2[n2] = n5 + n7 - 17;
                ++n2;
            }
            n2 = 0;
            while (n2 < this.M) {
                ((MGraphics)object).a(UIPanel.s, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + MGraphics.a(UIPanel.s), n5 + n7 - 8, 3);
                nArray[this.N + n2] = n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + MGraphics.a(UIPanel.s);
                object2[this.N + n2] = n5 + n7 - 8;
                ++n2;
            }
            MathUtil.IActionListener(String.valueOf(this.GameScreen) + "maxStarSlot");
            if (this.GameScreen >= 7) {
                int n12 = 7;
                while (n12 < this.GameScreen) {
                    if (this.r[n12]) {
                        ((MGraphics)object).a(UIPanel.u, nArray[n12], (int)object2[n12], 3);
                    }
                    ++n12;
                }
            }
            if (this.o > 0) {
                this.P = UIPanel.r;
                if (this.o >= this.N) {
                    this.O = this.o - this.N;
                    n2 = 0;
                    while (n2 < this.N) {
                        ((MGraphics)object).a(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + MGraphics.a(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < this.O) {
                        if (n2 + this.N >= s) {
                            this.P = UIPanel.t;
                        }
                        ((MGraphics)object).a(this.P, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + MGraphics.a(this.P), n5 + n7 - 8, 3);
                        ++n2;
                    }
                } else {
                    n2 = 0;
                    while (n2 < this.o) {
                        ((MGraphics)object).a(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + MGraphics.a(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                }
            }
        } else {
            n10 = 0;
            while (n10 < this.GameScreen) {
                ((MGraphics)object).a(UIPanel.s, n4 + n6 / 2 - this.GameScreen * 20 / 2 + n10 * 20 + MGraphics.a(UIPanel.s), n5 + n7 - 13, 3);
                ++n10;
            }
            if (this.o > 0) {
                n10 = 0;
                while (n10 < this.o) {
                    ((MGraphics)object).a(UIPanel.r, n4 + n6 / 2 - this.GameScreen * 20 / 2 + n10 * 20 + MGraphics.a(UIPanel.r), n5 + n7 - 13, 3);
                    ++n10;
                }
            }
        }
        MGraphics en2 = object;
        object = this;
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (((ae)object).j != null) {
            cx.a(en2, null, ((ae)object).j, null);
        }
        if (((ae)object).k != null) {
            cx.a(en2, ((ae)object).k, null, ((ae)object).ResourceUtil);
        }
    }

    public final void a(MGraphics en2, int n2) {
        int n3 = this.e;
        int n4 = this.f;
        int n5 = this.a;
        int n6 = en2.a();
        int n7 = en2.IActionListener();
        en2.a(0, -n2);
        if (!(n3 > 0 && n4 > 0 || main.GameCanvas.G.a)) {
            return;
        }
        n2 = -1;
        n4 = 0;
        while (n4 < this.d.length) {
            if (this.d[n4].startsWith("--")) {
                en2.a(0xFFFFFF);
                en2.d(n3 + 10, this.f + this.c + n4 * 12 - 6, n5 - 20, 1);
            } else {
                int n8;
                mFont di2 = mFont.s;
                int n9 = 2;
                Object object = this.d[n4];
                if (this.d[n4].startsWith("|")) {
                    String[] stringArray = MathUtil.a(this.d[n4], "|", 0);
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
                        di2 = mFont.s;
                        break;
                    }
                    case 0: {
                        di2 = mFont.c;
                        break;
                    }
                    case 1: {
                        di2 = mFont.h;
                        break;
                    }
                    case 2: {
                        di2 = mFont.a;
                    }
                }
                if (this.d[n4].startsWith("<")) {
                    String[] stringArray = MathUtil.a(this.d[n4], "<", 0);
                    object = MathUtil.a(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object[1]);
                    } else {
                        C = ResourceUtil.d();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object = String.valueOf(this.L) + " " + object[2];
                    di2.a(en2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.t, n9);
                } else {
                    if (n9 == 2) {
                        di2.a(en2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.t, n9);
                    }
                    if (n9 == 1) {
                        di2.a(en2, (String)object, this.e + this.a - 5, this.f + this.c + n4 * 12 - this.t, n9);
                    }
                }
            }
            ++n4;
        }
        main.GameCanvas.a(en2);
        en2.a(n6, n7);
    }

    private void a(int n2) {
        if ((v += n2 * 12) < 0) {
            v = 0;
        }
        if (v > this.h) {
            v = this.h;
        }
    }

    public final void IActionListener() {
        if (this.u) {
            if (main.GameCanvas.i[8]) {
                main.GameCanvas.i[8] = false;
                this.a(1);
            }
            if (main.GameCanvas.i[2]) {
                main.GameCanvas.i[2] = false;
                this.a(-1);
            }
            if (main.GameCanvas.a(this.e, 0, this.a + 2, this.g)) {
                if (main.GameCanvas.n) {
                    if (this.R == 0) {
                        this.R = main.GameCanvas.q;
                    }
                    this.Q = this.R - main.GameCanvas.q;
                    if (this.Q != 0) {
                        v += this.Q;
                        this.R = main.GameCanvas.q;
                    }
                    if (v < 0) {
                        v = 0;
                    }
                    if (v > this.h) {
                        v = this.h;
                    }
                } else {
                    this.R = 0;
                    this.R = 0;
                }
            }
        }
        if (q != null) {
            if (main.GameCanvas.e) {
                q.a();
            }
            if (main.GameCanvas.j[2]) {
                ae.q.IActionListener -= 12;
                if (ae.q.IActionListener < 0) {
                    ae.q.IActionListener = 0;
                }
            }
            if (main.GameCanvas.j[8]) {
                main.GameCanvas.i[8] = false;
                ae.q.IActionListener += 12;
                if (ae.q.IActionListener > ae.q.ResourceUtil) {
                    ae.q.IActionListener = ae.q.ResourceUtil;
                }
            }
        }
        if (main.GameCanvas.i[5] || Screen.a(main.GameCanvas.E.cn)) {
            main.GameCanvas.i[5] = false;
            Screen.cs = -1;
            if (this.j != null) {
                this.j.a();
            } else if (this.k != null) {
                this.k.a();
            } else if (this.l != null) {
                this.l.a();
            }
        }
        if (q != null && ae.q.m) {
            return;
        }
        if (this.k != null && (main.GameCanvas.i[12] || main.GameCanvas.i[5] || Screen.a(this.k))) {
            main.GameCanvas.i[12] = false;
            main.GameCanvas.i[5] = false;
            main.GameCanvas.ResourceUtil = false;
            main.GameCanvas.m = false;
            this.k.a();
            Screen.cs = -1;
        }
        if (this.l != null && (main.GameCanvas.i[13] || Screen.a(this.l))) {
            main.GameCanvas.i[13] = false;
            main.GameCanvas.ResourceUtil = false;
            main.GameCanvas.m = false;
            this.l.a();
            Screen.cs = -1;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            try {
                GameMidlet.f.platformRequest((String)object);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            GameMidlet.f.notifyDestroyed();
            main.GameCanvas.h();
        }
        if (n2 == 1001) {
            q = null;
            GameWorld.x = null;
            n = null;
            GameScreen.aD.f = true;
            GameWorld.bH = false;
            if (I) {
                GameScreen.aD.IActionListener.e = 0;
                GameScreen.aD.IActionListener.IActionListener.IActionListener = 10;
            }
        }
        if (n2 == 8000) {
            if (K > 0) {
                return;
            }
            int n3 = ae.m.E;
            if (++n3 >= ae.m.F.length) {
                GameWorld.x = null;
                m = null;
                GameScreen.aD.f = true;
                GameWorld.bH = false;
                if (G != null) {
                    ae.IActionListener(G, 100000, H);
                    G = null;
                    H = null;
                    return;
                }
                if (I) {
                    GameScreen.aD.IActionListener.e = 0;
                    n2 = 0;
                    while (n2 < GameScreen.aD.IActionListener.GameCanvas.size()) {
                        if (((r)GameScreen.aD.IActionListener.GameCanvas.elementAt((int)n2)).IActionListener == 10000000) {
                            ((r)GameScreen.aD.IActionListener.GameCanvas.elementAt((int)n2)).IActionListener = 10;
                        }
                        ++n2;
                    }
                }
                return;
            }
            ae ae2 = ae.c(ae.m.F[n3], ae.m.IActionListener, ae.m.i);
            ae.c(ae.m.F[n3], ae.m.IActionListener, ae.m.i).E = n3;
            ae2.F = ae.m.F;
            ae2.j = ae.m.j;
            m = ae2;
        }
    }
}

