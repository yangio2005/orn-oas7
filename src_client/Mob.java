/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import main.GameCanvas;
import javax.microedition.lcdui.Image;

public class Mob
implements bq {
    public static dy[] c;
    boolean d;
    short e;
    public boolean f;
    public boolean g = false;
    public int Item;
    public long i;
    public int j;
    public long k;
    public long Res;
    public int m;
    public int n;
    public int o = 1;
    private int LoginScreen = 1;
    public int GameScreen;
    public int q;
    public int r;
    public int SessionReceiver;
    public int MyHashtable;
    public int u;
    public int v;
    public int w;
    public int x;
    public int Message;
    public boolean z;
    public boolean A;
    public boolean B;
    private boolean b;
    private MyVector ad = new MyVector("vMobMove");
    public int C;
    public Char D;
    public long E;
    public long F;
    public int G;
    public byte H;
    public boolean I;
    public boolean J;
    public static MyVector K;
    public static MyVector L;
    public boolean M = false;
    public int N;
    public int O;
    public int P;
    public int Q;
    private boolean ae;
    private int Char;
    private boolean ag = true;
    private int ah;
    private int ai;
    public static Image R;
    private boolean aj;
    private int ak;
    private int al;
    private int am;
    public int S;
    public boolean T = true;
    private int[] an;
    private int[] ao;
    private int[] ap;
    private int[] aq;
    private int[] ar;
    private int[] ImageCache;
    public int U;
    public int V;
    public int W;
    public Image X;
    private int at;
    public boolean Y;
    public Char Z;
    public boolean Mob;
    private Mob au;
    private int RMS;
    public boolean ab;
    public boolean MessageHandler;
    private int[][] T;
    private boolean ax;

    static {
        K = new MyVector("lastMob");
        L = new MyVector("newMob");
        R = Res.loadImage("/mainImage/myTexture2dmobHP.png");
    }

    public final boolean u() {
        return this instanceof an || this instanceof d || this instanceof Npc || this instanceof cl;
    }

    public Mob() {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.an = nArray;
        this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
        this.aq = new int[]{4, 5, 6};
        this.ar = new int[]{7, 8, 9};
        this.ImageCache = new int[1];
        this.U = 24;
        this.V = 100;
        this.W = 100;
        this.at = 0;
        this.Y = false;
        byte[] byArray = new byte[]{-1, 1};
        this.Mob = false;
        int[][] nArrayArray = new int[6][];
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[1] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[2] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[3] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[4] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[5] = nArray7;
        this.T = nArrayArray;
        this.ax = true;
    }

    public final void v() {
        if (Mob.c[this.C].f == null) {
            Mob.c[this.C].f = new ck();
            String string = "/Mob/" + this.C;
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            if (inputStream != null) {
                Mob.c[this.C].f.LoginScreen(String.valueOf(string) + "/data");
                Mob.c[this.C].f.LoginScreen = Res.loadImage(String.valueOf(string) + "/img.png");
            } else {
                GameService.LoginScreen().Item(this.C);
            }
            if (K.size() > 15) {
                Mob.c[Integer.parseInt((String)((String)Mob.K.elementAt((int)0)))].f = null;
                K.removeElementAt(0);
            }
            K.addElement(String.valueOf(this.C));
            return;
        }
        this.v = Mob.c[this.C].f.f;
        this.w = Mob.c[this.C].f.g;
    }

    public void methodLoginScreen(short s2) {
        this.d = true;
        this.e = s2;
    }

    public void methodLoginScreen() {
        this.d = false;
    }

    public Mob(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n3, int n4, long l2, byte by2, long l3, short s2, short s3, byte by3, byte by4) {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.an = nArray;
        this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
        this.aq = new int[]{4, 5, 6};
        this.ar = new int[]{7, 8, 9};
        this.ImageCache = new int[1];
        this.U = 24;
        this.V = 100;
        this.W = 100;
        this.at = 0;
        this.Y = false;
        byte[] byArray = new byte[]{-1, 1};
        this.Mob = false;
        int[][] nArrayArray = new int[6][];
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[1] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[2] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[3] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[4] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[5] = nArray7;
        this.T = nArrayArray;
        this.ax = true;
        this.z = bl3;
        this.A = bl5;
        this.B = bl6;
        this.G = n4;
        this.Message = n2;
        this.C = n3;
        this.k = l2;
        short s4 = s2;
        this.m = s4;
        this.MyHashtable = s4;
        short s5 = s3;
        this.n = s5;
        this.u = s5;
        this.GameScreen = by3;
        if (n3 != 70) {
            Mob.C();
            this.v();
        }
        if (!Mob.LoginScreen(String.valueOf(n3))) {
            L.addElement(String.valueOf(n3));
        }
        this.Res = l3;
        this.H = by4;
        this.A();
        this.b = false;
        this.P = s2;
        this.Q = s3;
        if (this.D()) {
            int[] nArray8 = new int[17];
            nArray8[5] = 1;
            nArray8[6] = 1;
            nArray8[7] = 1;
            nArray8[8] = 1;
            nArray8[9] = 1;
            nArray8[10] = 2;
            nArray8[11] = 2;
            nArray8[12] = 2;
            nArray8[13] = 2;
            nArray8[14] = 2;
            nArray8[15] = 2;
            nArray8[16] = 2;
            this.an = nArray8;
            int[] nArray9 = new int[17];
            nArray9[5] = 1;
            nArray9[6] = 1;
            nArray9[7] = 1;
            nArray9[8] = 1;
            nArray9[9] = 1;
            nArray9[10] = 2;
            nArray9[11] = 2;
            nArray9[12] = 2;
            nArray9[13] = 2;
            nArray9[14] = 2;
            nArray9[15] = 2;
            nArray9[16] = 2;
            this.ao = nArray9;
            int[] nArray10 = new int[17];
            nArray10[5] = 1;
            nArray10[6] = 1;
            nArray10[7] = 1;
            nArray10[8] = 1;
            nArray10[9] = 1;
            nArray10[10] = 2;
            nArray10[11] = 2;
            nArray10[12] = 2;
            nArray10[13] = 2;
            nArray10[14] = 2;
            nArray10[15] = 2;
            nArray10[16] = 2;
            this.ap = nArray10;
            this.aq = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
            this.ar = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
        } else if (this.E()) {
            int[] nArray11 = new int[12];
            nArray11[8] = 1;
            nArray11[9] = 1;
            nArray11[10] = 1;
            nArray11[11] = 1;
            this.an = nArray11;
            this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
            this.ap = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
            this.aq = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
            this.ar = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
        } else if (this.e()) {
            int[] nArray12 = new int[12];
            nArray12[8] = 1;
            nArray12[9] = 1;
            nArray12[10] = 1;
            nArray12[11] = 1;
            this.an = nArray12;
            this.ao = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
            this.ap = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
            this.aq = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
            this.ar = new int[]{5, 12, 13, 14};
        } else {
            int[] nArray13 = new int[12];
            nArray13[8] = 1;
            nArray13[9] = 1;
            nArray13[10] = 1;
            nArray13[11] = 1;
            this.an = nArray13;
            this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
            this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
            this.aq = new int[]{4, 5, 6};
            this.ar = new int[]{7, 8, 9};
        }
        ds.c("MOB ID= " + n2);
    }

    private static boolean methodLoginScreen(String string) {
        int n2 = 0;
        while (n2 < L.size()) {
            String string2 = (String)L.elementAt(n2);
            if (string2.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static void C() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < c.length) {
            if (Mob.c[n3].f != null) {
                ++n2;
            }
            ++n3;
        }
        if (n2 >= 10) {
            n3 = 0;
            while (n3 < c.length) {
                if (Mob.c[n3].f != null && n2 > 5) {
                    Mob.c[n3].f = null;
                }
                ++n3;
            }
        }
    }

    public void methodLoginScreen(int[] nArray) {
        if (this.ah > nArray.length - 1) {
            this.ah = 0;
        }
        this.ai = nArray[this.ah];
        ++this.ah;
    }

    public void b() {
        if (this.S == 0 && GameCanvas.w % 25 == 0) {
            at.LoginScreen(114, this, 1);
        }
        if (this.S == 1 && GameCanvas.w % 4 == 0) {
            at.LoginScreen(132, this, 1);
        }
        if (this.S == 2 && GameCanvas.w % 7 == 0) {
            at.LoginScreen(131, this, 1);
        }
    }

    public void c() {
        if (this.M) {
            return;
        }
        this.B();
        if (this.ab && GameCanvas.w % 5 == 0) {
            at.LoginScreen(113, this.m, this.n, 1);
        }
        if (this.MessageHandler && GameCanvas.w % 10 == 0) {
            ei.LoginScreen(new ea(41, this.m, this.n, 3, 1, 1));
        }
        if (!GameCanvas.isLowGraphic && this.GameScreen != 1 && this.GameScreen != 0 && !GameCanvas.isLowGraphic && GameCanvas.w % (15 + (this.Message << 1)) == 0) {
            int n2 = 0;
            while (n2 < GameScreen.D.size()) {
                Char af2 = (Char)GameScreen.D.elementAt(n2);
                if (af2 != null && af2.ci && af2.ImageCache == 32) {
                    Char af3 = new Char();
                    new Char().B = af2.B;
                    af3.C = af2.C - af2.al;
                    if (af2.K == 0) {
                        ah.LoginScreen(this.m + this.o * this.v, this.n, this.j(), -100L, -100L, af3, 25);
                    }
                }
                ++n2;
            }
            if (Char.e().ci && Char.e().ImageCache == 32) {
                Char af4 = new Char();
                new Char().B = Char.e().B;
                af4.C = Char.e().C - Char.e().al;
                if (Char.e().K == 0) {
                    ah.LoginScreen(this.m + this.o * this.v, this.n, this.j(), -100L, -100L, af4, 25);
                }
            }
        }
        if (this.j != 0 && GameCanvas.w % 5 == 0) {
            ei.LoginScreen(new ea(this.j, this.m, this.n + 24, 3, 5, 1));
        }
        if (this.g) {
            long l2;
            if (GameCanvas.w % 5 == 0) {
                at.LoginScreen(113, this.m, this.n, 1);
            }
            if ((l2 = System.currentTimeMillis()) - this.i >= 1000L) {
                --this.Item;
                this.i = l2;
                if (this.Item < 0) {
                    this.g = false;
                    this.Item = 0;
                }
            }
            this.ai = this.F() ? this.ImageCache[GameCanvas.w % this.ImageCache.length] : (this.D() ? this.aq[GameCanvas.w % this.aq.length] : (this.E() ? (GameCanvas.w % 20 > 5 ? 11 : 10) : (this.e() ? (GameCanvas.w % 20 > 5 ? 1 : 15) : (GameCanvas.w % 20 > 5 ? 11 : 10))));
        }
        if (!this.i()) {
            return;
        }
        if (this.ag) {
            Mob aa2 = this;
            byte by2 = bv.i;
            aa2.P = aa2.m;
            aa2.Char = 0;
            if (aa2.Q > 0 && !bv.LoginScreen(aa2.P, aa2.Q, 2)) {
                if (bv.LoginScreen(aa2.P / by2, aa2.Q / by2) == 0) {
                    aa2.ae = true;
                } else if (bv.LoginScreen(aa2.P / by2, aa2.Q / by2) != 0 && !bv.LoginScreen(aa2.P, aa2.Q, 2)) {
                    aa2.P = aa2.m;
                    aa2.Q = aa2.n;
                    aa2.ae = false;
                }
                while (aa2.ae && aa2.Char < 10) {
                    ++aa2.Char;
                    aa2.Q += 24;
                    if (!bv.LoginScreen(aa2.P, aa2.Q, 2)) continue;
                    if (aa2.Q % 24 == 0) break;
                    aa2.Q -= aa2.Q % 24;
                    break;
                }
            }
        }
        if (this.ad == null && Mob.c[this.C].LoginScreen != 0) {
            return;
        }
        if (this.GameScreen != 3 && this.T) {
            if (this.D != null) {
                this.D.LoginScreen(this.E, this.F, false, true);
            } else if (this.au != null) {
                this.au.d();
            }
            this.T = false;
        }
        if (this.H > 0) {
            this.b();
        }
        switch (this.GameScreen) {
            case 1: {
                this.z = false;
                this.A = false;
                this.B = false;
                this.n += this.q;
                if (GameCanvas.w % 2 == 0) {
                    if (this.r > 1) {
                        --this.r;
                    } else if (this.r < -1) {
                        ++this.r;
                    }
                }
                this.m += this.r;
                this.ai = this.F() ? this.ImageCache[GameCanvas.w % this.ImageCache.length] : (this.D() ? this.aq[GameCanvas.w % this.aq.length] : (!this.E() && this.e() ? 15 : 11));
                if (this.b) {
                    this.b = false;
                    if (this.J) {
                        int n3 = 0;
                        while (n3 < GameScreen.F.size()) {
                            if (((Mob)GameScreen.F.elementAt((int)n3)).Message == this.Message) {
                                GameScreen.F.removeElementAt(n3);
                            }
                            ++n3;
                        }
                    }
                    this.q = 0;
                    this.r = 0;
                    this.n = 0;
                    this.m = 0;
                    this.k = this.z().d;
                    this.GameScreen = 0;
                    this.x = 0;
                    return;
                }
                if ((bv.b(this.m, this.n) & 2) == 2) {
                    int n4 = this.q = this.q > 4 ? -4 : -this.q;
                    if (this.SessionReceiver == 0) {
                        this.SessionReceiver = 16;
                    }
                } else {
                    ++this.q;
                }
                if (this.SessionReceiver <= 0) break;
                --this.SessionReceiver;
                if (this.SessionReceiver != 0) break;
                this.b = true;
                return;
            }
            case 2: {
                if (this.j != 0) {
                    return;
                }
                if (this.g) {
                    return;
                }
                if (this.ab) {
                    return;
                }
                if (this.MessageHandler) {
                    return;
                }
                this.x = 0;
                Mob aa3 = this;
                aa3.LoginScreen(aa3.an);
                switch (Mob.c[aa3.C].c) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        ++aa3.q;
                        if (aa3.q <= 10 + aa3.Message % 10 || aa3.D != null && ds.g(aa3.D.B - aa3.m) <= 80 || aa3.au != null && ds.g(aa3.au.m - aa3.m) <= 80) break;
                        aa3.GameScreen = 5;
                        break;
                    }
                    case 4: 
                    case 5: {
                        ++aa3.q;
                        if (aa3.q <= aa3.Message % 3 || aa3.D != null && ds.g(aa3.D.B - aa3.m) <= 80 || aa3.au != null && ds.g(aa3.au.m - aa3.m) <= 80) break;
                        aa3.GameScreen = 5;
                    }
                }
                if (aa3.D != null && GameCanvas.w % (10 + aa3.q % 20) == 0) {
                    aa3.o = aa3.D.B > aa3.m ? 1 : -1;
                } else if (aa3.au != null && GameCanvas.w % (10 + aa3.q % 20) == 0) {
                    aa3.o = aa3.au.m > aa3.m ? 1 : -1;
                }
                if (aa3.RMS > 0) {
                    --aa3.RMS;
                    aa3.GameScreen = 2;
                }
                return;
            }
            case 4: {
                if (this.j != 0) {
                    return;
                }
                if (this.ab) {
                    return;
                }
                if (this.MessageHandler) {
                    return;
                }
                if (this.g) {
                    return;
                }
                this.x = 0;
                ++this.q;
                if (this.q <= 40 + this.Message % 5) break;
                this.n -= 2;
                this.GameScreen = 5;
                this.q = 0;
                return;
            }
            case 3: {
                if (this.j != 0) {
                    return;
                }
                if (this.ab) {
                    return;
                }
                if (this.MessageHandler) {
                    return;
                }
                if (this.g) {
                    return;
                }
                this.f();
                return;
            }
            case 5: {
                if (this.j != 0) {
                    return;
                }
                if (this.ab) {
                    return;
                }
                if (this.MessageHandler) {
                    return;
                }
                if (this.g) {
                    if (Mob.c[this.C].c == 4) {
                        ++this.am;
                        ++this.ak;
                        this.al += !this.aj ? 1 : -1;
                        if (this.ak == 10) {
                            this.ak = 0;
                            this.aj = !this.aj;
                        }
                    }
                    return;
                }
                this.x = 0;
                this.g();
                return;
            }
            case 6: {
                this.x = 0;
                ++this.q;
                this.n += this.q;
                if (this.n < this.u) break;
                this.n = this.u;
                this.q = 0;
                this.GameScreen = 5;
                return;
            }
            case 7: {
                Mob aa4 = this;
                if (!aa4.T && GameCanvas.w % 4 == 0) {
                    aa4.ai = aa4.F() ? aa4.ImageCache[GameCanvas.w % aa4.ImageCache.length] : (aa4.D() ? aa4.aq[GameCanvas.w % aa4.aq.length] : (aa4.E() ? (aa4.ai != 10 ? 10 : 11) : (aa4.e() ? (aa4.ai != 1 ? 1 : 15) : (aa4.ai != 10 ? 10 : 11))));
                }
                --aa4.x;
                if (aa4.x <= 0 && (aa4.F() || aa4.D() || aa4.E() && aa4.ai == 11 || aa4.e() && aa4.ai == 15 || aa4.C < 58 && aa4.ai == 11)) {
                    if (aa4.Z != null && aa4.Mob || aa4.k == 0L) {
                        aa4.GameScreen = 1;
                        aa4.r = aa4.Z.I << 1;
                        aa4.q = -3;
                        aa4.SessionReceiver = 0;
                    } else {
                        aa4.GameScreen = 5;
                        if (aa4.Z != null) {
                            aa4.o = -aa4.Z.I;
                            if (ds.g(aa4.m - aa4.Z.B) < 24) {
                                aa4.GameScreen = 2;
                            }
                        }
                        aa4.SessionReceiver = 0;
                        aa4.r = 0;
                        aa4.q = 0;
                        aa4.x = 0;
                    }
                    aa4.Z = null;
                    return;
                }
                if (Mob.c[aa4.C].c == 0 || aa4.Z == null) break;
                int n5 = -aa4.Z.I << 1;
                if (aa4.m <= aa4.MyHashtable - Mob.c[aa4.C].LoginScreen || aa4.m >= aa4.MyHashtable + Mob.c[aa4.C].LoginScreen) break;
                aa4.m -= n5;
            }
        }
    }

    public void d() {
        if (this.k > 0L && this.GameScreen != 3 && this.GameScreen != 7) {
            this.x = 4;
            this.GameScreen = 7;
            if (this.z().c != 0 && ds.g(this.m - this.MyHashtable) < 30) {
                this.m -= 10 * this.o;
            }
        }
    }

    public static Npc w() {
        int n2 = 0;
        while (n2 < GameScreen.F.size()) {
            Mob aa2 = (Mob)GameScreen.F.elementAt(n2);
            if (aa2 instanceof Npc) {
                return (Npc)aa2;
            }
            ++n2;
        }
        return null;
    }

    public static d x() {
        int n2 = 0;
        while (n2 < GameScreen.F.size()) {
            Mob aa2 = (Mob)GameScreen.F.elementAt(n2);
            if (aa2 instanceof d) {
                return (d)aa2;
            }
            ++n2;
        }
        return null;
    }

    public static an Message() {
        int n2 = 0;
        while (n2 < GameScreen.F.size()) {
            Mob aa2 = (Mob)GameScreen.F.elementAt(n2);
            if (aa2 instanceof an) {
                return (an)aa2;
            }
            ++n2;
        }
        return null;
    }

    public static cl LoginScreen(byte by2) {
        Mob aa2 = (Mob)GameScreen.F.elementAt(by2);
        if (aa2 instanceof cl) {
            return (cl)aa2;
        }
        return null;
    }

    public void methodLoginScreen(Char af2) {
        this.T = true;
        this.au = null;
        this.D = af2;
        this.q = 0;
        this.r = 0;
        this.GameScreen = 3;
        this.ah = 0;
        this.o = af2.B > this.m ? 1 : -1;
        int n2 = af2.B;
        int n3 = af2.C;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.SessionReceiver = 0;
            return;
        }
        this.SessionReceiver = 1;
    }

    boolean e() {
        return this.C >= 58 && this.C <= 65 || this.C == 67 || this.C == 68;
    }

    private boolean D() {
        return this.C == 76;
    }

    private boolean E() {
        return this.C >= 73 && !this.D();
    }

    public void f() {
        Object object;
        int[] nArray = object = this.SessionReceiver == 0 ? this.aq : this.ar;
        if (this.ah < ((int[])object).length) {
            this.LoginScreen((int[])object);
            if (this.m >= GameScreen.j && this.m <= GameScreen.j + GameCanvas.A && this.SessionReceiver == 0 && GameCanvas.w % 2 == 0) {
                bu.LoginScreen();
            }
        }
        if (this.q == 0) {
            int n2;
            int n3 = this.D != null ? this.D.B : this.au.m;
            int n4 = n2 = this.D != null ? this.D.C : this.au.n;
            if (!this.E()) {
                if (this.m > this.MyHashtable + Mob.c[this.C].LoginScreen) {
                    this.q = 1;
                }
                if (this.m < this.MyHashtable - Mob.c[this.C].LoginScreen) {
                    this.q = 1;
                }
            }
            if (!(Mob.c[this.C].c != 4 && Mob.c[this.C].c != 5 || this.z)) {
                this.n += (n2 - this.n) / 20;
            }
            ++this.r;
            if (this.r > ((int[])object).length - 1 || this.q == 1) {
                this.q = 1;
                if (this.SessionReceiver == 0) {
                    if (this.D != null) {
                        this.D.LoginScreen(this.E, this.F, false, true);
                    } else {
                        this.au.d();
                    }
                    this.T = false;
                } else {
                    if (this.D != null) {
                        ah.LoginScreen(this.m + this.o * this.v, this.n, this.j(), this.E, this.F, this.D, this.z().g);
                    } else {
                        object = new Char();
                        new Char().B = this.au.m;
                        object.C = this.au.n;
                        object.J = -100;
                        ah.LoginScreen(this.m + this.o * this.v, this.n, this.j(), this.E, this.F, (Char)object, this.z().g);
                    }
                    this.T = false;
                }
            }
            this.o = this.m < n3 ? 1 : -1;
        } else if (this.q == 1 && this.ah == ((int[])object).length) {
            this.GameScreen = 2;
            this.q = 0;
            this.r = 0;
            this.ah = 0;
        }
        if (this.ah == 5 && this.D != null && this.D.J == Char.e().J) {
            if (this.C == 88 && this.SessionReceiver != 0) {
                GameScreen.bu = 2;
            }
            if (this.C == 89) {
                GameScreen.bu = 2;
            }
        }
    }

    public void g() {
        try {
            if (this.Mob) {
                this.GameScreen = 1;
                this.r = this.Z.I << 3;
                this.q = -5;
                this.SessionReceiver = 0;
            }
            if (this.A) {
                return;
            }
            if (this.z || this.B) {
                this.LoginScreen(this.an);
                return;
            }
            switch (Mob.c[this.C].c) {
                case 0: {
                    if (this.D()) {
                        this.ai = this.an[GameCanvas.w % this.an.length];
                        break;
                    }
                    this.ai = 0;
                    return;
                }
                case 1: 
                case 2: 
                case 3: {
                    byte by2 = Mob.c[this.C].b;
                    if (by2 == 1) {
                        if (GameCanvas.w % 2 == 1) {
                            return;
                        }
                    } else if (by2 > 2) {
                        by2 = (byte)(by2 + this.Message % 2);
                    } else if (GameCanvas.w % 2 == 1) {
                        by2 = (byte)(by2 - 1);
                    }
                    this.m += by2 * this.o;
                    if (this.m > this.MyHashtable + Mob.c[this.C].LoginScreen) {
                        this.o = -1;
                    } else if (this.m < this.MyHashtable - Mob.c[this.C].LoginScreen) {
                        this.o = 1;
                    }
                    if (ds.g(this.m - Char.e().B) < 40 && ds.g(this.m - this.MyHashtable) < Mob.c[this.C].LoginScreen) {
                        int n2 = this.o = this.m > Char.e().B ? -1 : 1;
                        if (ds.g(this.m - Char.e().B) < 20) {
                            this.m -= this.o * 10;
                        }
                        this.GameScreen = 2;
                        this.RMS = 20;
                    }
                    this.LoginScreen(this.v > 30 ? this.ao : this.ap);
                    return;
                }
                case 4: {
                    byte by3 = Mob.c[this.C].b;
                    by3 = (byte)(by3 + this.Message % 2);
                    this.m += by3 * this.o;
                    if (GameCanvas.w % 10 > 2) {
                        this.n += by3 * this.LoginScreen;
                    }
                    if (this.m > this.MyHashtable + Mob.c[this.C].LoginScreen) {
                        this.o = -1;
                        this.GameScreen = 2;
                        this.RMS = GameCanvas.w % 20 + 20;
                        this.q = 0;
                    } else if (this.m < this.MyHashtable - Mob.c[this.C].LoginScreen) {
                        this.o = 1;
                        this.GameScreen = 2;
                        this.RMS = GameCanvas.w % 20 + 20;
                        this.q = 0;
                    }
                    if (this.n > this.u + 24) {
                        this.LoginScreen = -1;
                    } else if (this.n < this.u - (20 + GameCanvas.w % 10)) {
                        this.LoginScreen = 1;
                    }
                    this.LoginScreen(this.ao);
                    return;
                }
                case 5: {
                    byte by4 = Mob.c[this.C].b;
                    by4 = (byte)(by4 + this.Message % 2);
                    this.m += by4 * this.o;
                    by4 = (byte)(by4 + (GameCanvas.w + this.Message) % 2);
                    if (GameCanvas.w % 10 > 2) {
                        this.n += by4 * this.LoginScreen;
                    }
                    if (this.m > this.MyHashtable + Mob.c[this.C].LoginScreen) {
                        this.o = -1;
                        this.GameScreen = 2;
                        this.RMS = GameCanvas.w % 20 + 20;
                        this.q = 0;
                    } else if (this.m < this.MyHashtable - Mob.c[this.C].LoginScreen) {
                        this.o = 1;
                        this.GameScreen = 2;
                        this.RMS = GameCanvas.w % 20 + 20;
                        this.q = 0;
                    }
                    if (this.n > this.u + 24) {
                        this.LoginScreen = -1;
                    } else if (this.n < this.u - (20 + GameCanvas.w % 10)) {
                        this.LoginScreen = 1;
                    }
                    if (!bv.LoginScreen(this.m, this.n, 2)) break;
                    if (GameCanvas.w % 10 > 5) {
                        this.n = bv.e(this.n);
                        this.GameScreen = 4;
                        this.q = 0;
                        this.LoginScreen = -1;
                        return;
                    }
                    this.LoginScreen = -1;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final dy z() {
        return c[this.C];
    }

    public boolean Item() {
        if (this.m < GameScreen.j) {
            return false;
        }
        if (this.m > GameScreen.j + GameScreen.d) {
            return false;
        }
        if (this.n < GameScreen.k) {
            return false;
        }
        if (this.n > GameScreen.k + GameScreen.e + 30) {
            return false;
        }
        if (c[this.C] == null) {
            return false;
        }
        if (Mob.c[this.C].f == null) {
            return false;
        }
        if (Mob.c[this.C].f.LoginScreen == null) {
            return false;
        }
        return this.GameScreen != 0;
    }

    public boolean i() {
        if (c[this.C] == null) {
            return false;
        }
        if (Mob.c[this.C].f == null) {
            return false;
        }
        return this.GameScreen != 0;
    }

    public boolean j() {
        return this.I || this.H > 0;
    }

    public final void A() {
        this.V = (int)(this.k * 100L / this.Res);
        if (this.V >= 100) {
            this.W = this.V;
        }
        this.at = 0;
        if (this.V < 30) {
            this.X = GameScreen.aH;
            return;
        }
        if (this.V < 60) {
            this.X = GameScreen.aI;
            return;
        }
        this.X = GameScreen.aK;
    }

    public void methodLoginScreen(mGraphics en2) {
        int n2;
        if (this.Y) {
            return;
        }
        if (this.M) {
            if (!this.d) {
                Mob.c[this.C].f.LoginScreen(en2, this.ai, this.N, this.O, this.o == 1 ? 0 : 1, 2);
                return;
            }
            bl.b(en2, this.e, this.N, this.O, this.o == 1 ? 0 : 2, 33);
            return;
        }
        if (this.ag && this.GameScreen != 0) {
            mGraphics en3 = en2;
            Mob aa2 = this;
            n2 = bv.i;
            if (bv.LoginScreen(aa2.P + n2 / 2, aa2.Q + 1, 4)) {
                en3.e(aa2.P / n2 * n2, (aa2.Q - 30) / n2 * n2, n2, 100);
            } else if (bv.LoginScreen((aa2.P - n2 / 2) / n2, (aa2.Q + 1) / n2) == 0) {
                en3.e(aa2.P / n2 * n2, (aa2.Q - 30) / n2 * n2, 100, 100);
            } else if (bv.LoginScreen((aa2.P + n2 / 2) / n2, (aa2.Q + 1) / n2) == 0) {
                en3.e(aa2.P / n2 * n2, (aa2.Q - 30) / n2 * n2, n2, 100);
            } else if (bv.LoginScreen(aa2.P - n2 / 2, aa2.Q + 1, 8)) {
                en3.e(aa2.P / 24 * n2, (aa2.Q - 30) / n2 * n2, n2, 100);
            }
            en3.LoginScreen(bv.x, aa2.P, aa2.Q, 3);
            en3.e(GameScreen.j, GameScreen.k - GameCanvas.ae, GameScreen.d, GameScreen.e + 2 * GameCanvas.ae);
        }
        if (!this.Item()) {
            return;
        }
        if (this.GameScreen == 1 && this.SessionReceiver > 0 && GameCanvas.w % 3 == 0) {
            return;
        }
        en2.LoginScreen(0, GameCanvas.ae);
        if (!this.d) {
            Mob.c[this.C].f.LoginScreen(en2, this.ai, this.m, this.n + this.al, this.o == 1 ? 0 : 1, 2);
        } else {
            bl.b(en2, this.e, this.m, this.n + this.al - 9, this.o == 1 ? 0 : 2, 33);
        }
        en2.LoginScreen(0, -GameCanvas.ae);
        if (Char.e().aQ != null && Char.e().aQ.equals(this) && this.GameScreen != 1 && this.k > 0L && this.X != null) {
            int n3 = mGraphics.LoginScreen(this.X);
            int n4 = mGraphics.b(this.X);
            int n5 = n2 = n3 * this.V / 100;
            if (this.W >= this.V) {
                int n6;
                if (GameCanvas.w % 6 > 3) {
                    int n7 = this.at;
                    n6 = n7;
                    this.at = n7 + 1;
                } else {
                    n6 = this.at;
                }
                n5 = n3 * (this.W -= n6) / 100;
                if (this.W <= 0) {
                    this.W = 0;
                }
                if (this.W < this.V) {
                    this.W = this.V;
                }
                if (this.at >= 3) {
                    this.at = 3;
                }
            }
            en2.LoginScreen(GameScreen.aJ, this.m - (n3 >> 1), this.n - this.w - 5, 20);
            en2.LoginScreen(0xFFFFFF);
            en2.d(this.m - (n3 >> 1), this.n - this.w - 5, n5, 2);
            en2.LoginScreen(this.X, 0, 0, n2, n4, 0, this.m - (n3 >> 1), this.n - this.w - 5, 20);
        }
    }

    public void k() {
        this.k = 0L;
        this.Mob = true;
        this.k = 0L;
        this.GameScreen = 1;
        this.q = -3;
        this.r = -this.o;
        this.SessionReceiver = 0;
    }

    public void methodLoginScreen(Mob aa2) {
        this.au = aa2;
        this.T = true;
        this.D = null;
        this.q = 0;
        this.r = 0;
        this.GameScreen = 3;
        this.ah = 0;
        this.o = aa2.m > this.m ? 1 : -1;
        int n2 = aa2.m;
        int n3 = aa2.n;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.SessionReceiver = 0;
            return;
        }
        this.SessionReceiver = 1;
    }

    public int Res() {
        return this.m;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.w;
    }

    public int o() {
        return this.v;
    }

    public void GameScreen() {
        if (this.GameScreen == 5) {
            this.GameScreen = 2;
            this.SessionReceiver = 0;
            this.r = 0;
            this.q = 0;
            this.RMS = 50;
        }
    }

    public boolean q() {
        return this.GameScreen == 0 || this.GameScreen == 1;
    }

    public void r() {
        if (this.j != 0) {
            this.j = 0;
        }
    }

    public void SessionReceiver() {
        this.ab = false;
    }

    public void MyHashtable() {
        this.MessageHandler = false;
    }

    public void B() {
        if (this.ax && this.F() && Mob.c[this.C].f != null) {
            this.T = (int[][])MessageHandler.d.get(String.valueOf(this.C));
            this.an = this.T[0];
            this.ao = this.T[1];
            this.ap = this.T[2];
            this.aq = this.T[3];
            this.ar = this.T[4];
            this.ImageCache = this.T[5];
            this.ax = false;
        }
    }

    private boolean F() {
        return Mob.c[this.C].f != null && Mob.c[this.C].f.e == 2;
    }
}

