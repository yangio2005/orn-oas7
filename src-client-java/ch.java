/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class ch {
    private LoggingList d = new LoggingList("EffectEnd VecEffEnd");
    private Frame e;
    private byte[] f = new byte[10];
    private byte[] UIPanel = new byte[10];
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int ResourceUtil;
    private int m;
    private int n;
    private int o;
    private int GameScreen;
    private int q;
    private int r;
    private int s;
    private int t;
    public int a;
    private int u;
    private int v;
    private int w;
    private int x;
    private int Message;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private short G;
    private long H;
    public boolean IActionListener;
    private boolean I;
    private GameWorld J;
    private bk[] K;
    private bk L;
    public static short[][] c;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int[] R;
    private int[] S;
    private int[] T;
    private int[] U;
    private static int[][] V;
    private int[] W;
    private int X;
    private int Y;
    private int Z;
    private Frame[] aa;

    static {
        short[][] sArrayArray = new short[29][];
        sArrayArray[0] = new short[]{68, 264, 4};
        sArrayArray[1] = new short[]{30, 120, 4};
        sArrayArray[2] = new short[]{66, 280, 4};
        short[] sArray = new short[3];
        sArray[2] = 1;
        sArrayArray[3] = sArray;
        sArrayArray[4] = new short[]{111, 68, 2};
        sArrayArray[5] = new short[]{90, 68, 2};
        sArrayArray[6] = new short[]{125, 68, 2};
        sArrayArray[7] = new short[]{47, 282, 6};
        sArrayArray[8] = new short[]{10, 40, 4};
        sArrayArray[9] = new short[]{92, 525, 7};
        sArrayArray[10] = new short[]{62, 372, 6};
        sArrayArray[11] = new short[]{80, 352, 4};
        sArrayArray[12] = new short[]{80, 352, 4};
        sArrayArray[13] = new short[]{80, 352, 4};
        sArrayArray[14] = new short[]{72, 240, 3};
        sArrayArray[15] = new short[]{20, 42, 3};
        sArrayArray[16] = new short[]{65, 160, 4};
        sArrayArray[17] = new short[]{50, 300, 6};
        sArrayArray[18] = new short[]{84, 168, 2};
        sArrayArray[19] = new short[]{90, 540, 6};
        sArrayArray[20] = new short[]{180, 900, 6};
        sArrayArray[21] = new short[]{62, 186, 3};
        sArrayArray[22] = new short[]{34, 80, 4};
        sArrayArray[23] = new short[]{140, 560, 4};
        sArrayArray[24] = new short[]{64, 600, 6};
        sArrayArray[25] = new short[]{36, 200, 5};
        sArrayArray[26] = new short[]{35, 200, 5};
        sArrayArray[27] = new short[]{50, 250, 5};
        sArrayArray[28] = new short[]{50, 240, 6};
        c = sArrayArray;
        V = new int[][]{{16310304, 16298056, 0xFFFFFF}, {7045120, 12643960, 0xFFFFFF}, {2407423, 11987199, 0xFFFFFF}};
    }

    public static Image a(int n2) {
        if (n2 < 0) {
            return null;
        }
        String string = "/e/e_" + n2 + ".png";
        Image image = null;
        try {
            image = ResourceUtil.IActionListener(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public ch(int n2, int n3, int n4, GameWorld af2, bk bk2, int n5, short s2, short s3) {
        byte[] byArray = new byte[24];
        byArray[0] = 12;
        byArray[1] = 11;
        byArray[2] = 10;
        byArray[3] = 9;
        byArray[4] = 8;
        byArray[5] = 7;
        byArray[6] = 6;
        byArray[7] = 5;
        byArray[8] = 4;
        byArray[9] = 3;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 23;
        byArray[14] = 22;
        byArray[15] = 21;
        byArray[16] = 20;
        byArray[17] = 19;
        byArray[18] = 18;
        byArray[19] = 17;
        byArray[20] = 16;
        byArray[21] = 15;
        byArray[22] = 14;
        byArray[23] = 13;
        byte[] byArray2 = new byte[24];
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 2;
        byArray2[8] = 2;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 2;
        byArray2[14] = 2;
        byArray2[15] = 1;
        byArray2[16] = 1;
        byArray2[17] = 2;
        byArray2[20] = 2;
        byArray2[21] = 1;
        byArray2[22] = 1;
        byArray2[23] = 2;
        byte[] byArray3 = new byte[24];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 3;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArray3[10] = 5;
        byArray3[11] = 1;
        byArray3[17] = 7;
        byArray3[18] = 6;
        byArray3[19] = 6;
        byArray3[20] = 6;
        byArray3[21] = 6;
        byArray3[22] = 6;
        byArray3[23] = 2;
        this.X = 0;
        this.u = 0;
        this.E = 0;
        this.i = n2;
        this.j = n3;
        this.h = n4;
        this.J = af2;
        if (af2.IActionListener(1265)) {
            this.J.B = this.i == 21 || this.i == 22 || this.i == 23 ? (this.J.B += 10 * this.J.I) : (this.i == 18 || this.i == 19 || this.i == 20 ? (this.J.B += -15 * this.J.I) : (this.J.B += 15 * this.J.I));
        }
        this.o = this.J.B;
        this.GameScreen = this.J.C;
        this.s = this.J.I;
        this.t = this.s == -1 ? 2 : 0;
        this.L = bk2;
        this.a = n5;
        this.H = ResourceUtil.d();
        this.G = s2;
        this.k = s3;
        this.I = false;
        this.b = false;
        this.n = 4;
        this.f();
        this.b();
    }

    public ch(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bk[] bkArray) {
        byte[] byArray = new byte[24];
        byArray[0] = 12;
        byArray[1] = 11;
        byArray[2] = 10;
        byArray[3] = 9;
        byArray[4] = 8;
        byArray[5] = 7;
        byArray[6] = 6;
        byArray[7] = 5;
        byArray[8] = 4;
        byArray[9] = 3;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 23;
        byArray[14] = 22;
        byArray[15] = 21;
        byArray[16] = 20;
        byArray[17] = 19;
        byArray[18] = 18;
        byArray[19] = 17;
        byArray[20] = 16;
        byArray[21] = 15;
        byArray[22] = 14;
        byArray[23] = 13;
        byte[] byArray2 = new byte[24];
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 2;
        byArray2[8] = 2;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 2;
        byArray2[14] = 2;
        byArray2[15] = 1;
        byArray2[16] = 1;
        byArray2[17] = 2;
        byArray2[20] = 2;
        byArray2[21] = 1;
        byArray2[22] = 1;
        byArray2[23] = 2;
        byte[] byArray3 = new byte[24];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 3;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArray3[10] = 5;
        byArray3[11] = 1;
        byArray3[17] = 7;
        byArray3[18] = 6;
        byArray3[19] = 6;
        byArray3[20] = 6;
        byArray3[21] = 6;
        byArray3[22] = 6;
        byArray3[23] = 2;
        this.X = 0;
        this.u = 0;
        this.E = 0;
        this.i = n2;
        this.j = n3;
        this.h = n4;
        this.o = n5;
        this.GameScreen = n6;
        this.a = n7;
        this.s = n8;
        this.t = n8 == -1 ? 2 : 0;
        this.H = ResourceUtil.d();
        this.G = s2;
        this.I = false;
        this.b = false;
        this.n = 4;
        if (bkArray != null) {
            this.K = new bk[bkArray.length];
            n2 = 0;
            while (n2 < this.K.length) {
                this.K[n2] = bkArray[n2];
                ++n2;
            }
        }
        this.f();
        this.b();
    }

    private void IActionListener() {
        try {
            int n2 = this.GameScreen;
            int n3 = this.o;
            try {
                MathUtil.d(3);
            }
            catch (Exception exception) {
                MathUtil.IActionListener("ERR setSoundSkill_END: " + exception.toString());
            }
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    n2 = this.i;
                    ch ch2 = this;
                    switch (n2) {
                        case 0: {
                            ch2.e = new Frame(4);
                            break;
                        }
                        case 1: {
                            ch2.e = new Frame(5);
                            break;
                        }
                        case 2: {
                            ch2.e = new Frame(6);
                        }
                    }
                    ch2.ResourceUtil = 100;
                    ch2.B = main.GameCanvas.B / 3 + 10;
                    ch2.x = 10;
                    ch2.z = 0;
                    ch2.I = false;
                    return;
                }
                case 3: {
                    this.c();
                    return;
                }
                case 16: 
                case 17: {
                    ch ch3 = this;
                    if (ch3.i == 17) {
                        ch3.o = ch3.o + (ch3.s == 0 ? 0 : -ch3.aa[0].a);
                        ch3.GameScreen -= ch3.aa[0].IActionListener / 2;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    ch ch4 = this;
                    this.f = null;
                    ch4.n = 3;
                    if (ch4.i == 18) {
                        if (ch4.j == 0) {
                            byte[] byArray = new byte[9];
                            byArray[3] = 1;
                            byArray[4] = 1;
                            byArray[5] = 1;
                            byArray[6] = 2;
                            byArray[7] = 2;
                            byArray[8] = 2;
                            ch4.f = byArray;
                            break;
                        }
                        ch4.f = new byte[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    ch ch5 = this;
                    if (ch5.J != null) {
                        if (ch5.i == 21) {
                            ch5.o = ch5.J.B - 3 * ch5.J.I;
                            ch5.GameScreen = ch5.J.C;
                            break;
                        }
                        if (ch5.i == 22) {
                            ch5.o = ch5.J.B + 20 * ch5.J.I;
                            ch5.GameScreen = ch5.J.C - 4;
                            break;
                        }
                        if (ch5.i == 23) {
                            ch5.o = ch5.J.B;
                            ch5.GameScreen = ch5.J.C - 50;
                            break;
                        }
                        ch5.o = ch5.J.B;
                        ch5.GameScreen = ch5.J.C;
                    }
                    return;
                }
                case 24: {
                    ch ch6 = this;
                    this.q = ch6.aa[0].a;
                    ch6.r = ch6.aa[0].IActionListener;
                    ch6.C = MathUtil.UIPanel(ch6.o - ch6.L.IActionListener);
                    byte[] byArray = new byte[6];
                    byArray[3] = 1;
                    byArray[4] = 1;
                    byArray[5] = 1;
                    ch6.f = byArray;
                    ch6.I = false;
                    return;
                }
                case 25: {
                    this.d();
                    return;
                }
                case 26: {
                    ch ch7 = this;
                    byte[] byArray = new byte[9];
                    byArray[3] = 1;
                    byArray[4] = 1;
                    byArray[5] = 1;
                    byArray[6] = 2;
                    byArray[7] = 2;
                    byArray[8] = 2;
                    this.f = byArray;
                    ch7.I = false;
                    ch7.m = 10;
                    ch7.Message = ch7.o;
                    ch7.z = ch7.GameScreen + 12;
                    ch7.F = 25;
                    ch7.B = 19;
                    if (ch7.j == 1) {
                        ch7.B = 21;
                    } else if (ch7.j == 2) {
                        ch7.B = 31;
                    }
                    ch7.r = ch7.aa[1].IActionListener + 50 - ch7.B;
                    ch7.x = 1;
                    ch7.A = 1;
                    ch7.GameScreen = ch7.z - ch7.r;
                    ch7.M = 90;
                    ch7.C = 1;
                    ch7.O = 25;
                    ch7.N = 25;
                    ch7.Q = 1;
                    if (ch7.K != null && ch7.K.length > 0) {
                        ch7.Q = ch7.K.length;
                    }
                    ch7.P = 360 / ch7.Q;
                    ch7.R = new int[ch7.Q];
                    ch7.S = new int[ch7.Q];
                    ch7.T = new int[ch7.Q];
                    ch7.U = new int[ch7.Q];
                    GameScreen.a(16, 0, ch7.h, ch7.Message, ch7.z, 1, 0, (short)-1, null);
                    return;
                }
                case 9: {
                    ch ch8 = this;
                    this.X = ch8.j;
                    ch8.Message = ch8.o * 1000;
                    ch8.z = ch8.GameScreen * 1000;
                    ch8.ResourceUtil = MathUtil.IActionListener(4, 6);
                    ch8.C = 5;
                    ch8.Y = 10;
                    ch8.Z = 20;
                    ch8.a(ch8.C, ch8.Y, ch8.Z, 0);
                    return;
                }
                case 10: 
                case 11: {
                    this.e();
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            MathUtil.IActionListener("ERR create_Effect: " + exception.toString());
            ch ch9 = this;
            this.b = true;
        }
    }

    public final void a() {
        try {
            ++this.u;
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    ch ch2 = this;
                    this.o = main.GameCanvas.C;
                    ch2.GameScreen = ch2.z;
                    if (ch2.u > ch2.ResourceUtil) {
                        ch ch3 = ch2;
                        ch2.IActionListener = true;
                    }
                    ++ch2.x;
                    if (ch2.x > 15) {
                        ch2.x = 15;
                    }
                    if (ch2.z + ch2.x < ch2.B) {
                        ch2.z += ch2.x;
                        break;
                    }
                    ch2.z = ch2.B;
                    if (!ch2.I) {
                        ch2.I = true;
                        if (ch2.j != -1) {
                            GameScreen.a(ch2.j, 0, 0, ch2.o, ch2.GameScreen, ch2.a, 0, (short)-1, null);
                        }
                    }
                    return;
                }
                case 3: {
                    ch ch4 = this;
                    int n2 = 0;
                    while (n2 < ch4.d.size()) {
                        bk bk2 = (bk)ch4.d.elementAt(n2);
                        bk2.a();
                        if (bk2.i - bk2.j > bk2.GameScreen.c * 3 - 1) {
                            bk2.i = 0;
                            if (ch4.j == 0) {
                                bk2.j = MathUtil.d(10);
                                int n3 = 1;
                                if (n2 % 2 == 0) {
                                    n3 = -1;
                                }
                                bk2.IActionListener = ch4.o + MathUtil.d(c[5][0] / 2) * n3;
                                bk2.c = ch4.GameScreen - MathUtil.d(c[5][1] / 2);
                            }
                        }
                        ++n2;
                    }
                    if (ch4.u >= ch4.ResourceUtil) {
                        ch ch5 = ch4;
                        ch4.IActionListener = true;
                    }
                    return;
                }
                case 16: 
                case 17: {
                    ch ch6 = this;
                    if (ch6.G > 0) {
                        if (main.GameCanvas.IActionListener - ch6.H >= (long)ch6.G) {
                            ch ch7 = ch6;
                            ch6.IActionListener = true;
                            break;
                        }
                    } else if (ch6.u >= ch6.aa[0].c * ch6.n) {
                        ch ch8 = ch6;
                        ch6.IActionListener = true;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    ch ch9 = this;
                    if (ch9.J != null) {
                        ch9.o = ch9.J.B;
                        ch9.GameScreen = ch9.J.C + 13;
                    }
                    if (ch9.G > 0) {
                        if (main.GameCanvas.IActionListener - ch9.H >= (long)ch9.G) {
                            ch ch10 = ch9;
                            ch9.IActionListener = true;
                            break;
                        }
                    } else if (ch9.f != null) {
                        if (ch9.u > ch9.f.length) {
                            ch ch11 = ch9;
                            ch9.IActionListener = true;
                            break;
                        }
                    } else if (ch9.u >= ch9.aa[0].c * ch9.n) {
                        ch ch12 = ch9;
                        ch9.IActionListener = true;
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    ch ch13 = this;
                    if (ch13.J != null) {
                        if (ch13.i == 21) {
                            ch13.o = ch13.J.B - 3 * ch13.J.I;
                            ch13.GameScreen = ch13.J.C;
                        } else if (ch13.i == 22) {
                            ch13.o = ch13.J.B + 20 * ch13.J.I;
                            ch13.GameScreen = ch13.J.C - 4;
                        } else if (ch13.i == 23) {
                            ch13.o = ch13.J.B;
                            ch13.GameScreen = ch13.J.C - 50;
                        } else {
                            ch13.o = ch13.J.B;
                            ch13.GameScreen = ch13.J.C;
                        }
                    }
                    if (ch13.G > 0) {
                        if (main.GameCanvas.IActionListener - ch13.H >= (long)ch13.G) {
                            ch ch14 = ch13;
                            ch13.IActionListener = true;
                            break;
                        }
                    } else if (ch13.u >= ch13.aa[0].c * ch13.n) {
                        ch ch15 = ch13;
                        ch13.IActionListener = true;
                    }
                    return;
                }
                case 24: {
                    ch ch16 = this;
                    ++ch16.w;
                    ch16.q += 20;
                    if (ch16.q > ch16.C) {
                        ch16.q = ch16.C;
                    }
                    ch16.o = ch16.J.B + 10;
                    ch16.GameScreen = ch16.J.C - 3;
                    if (ch16.s == -1) {
                        ch16.o = ch16.J.B - ch16.q - 10;
                    }
                    if (!ch16.I && main.GameCanvas.IActionListener - ch16.H >= (long)ch16.G) {
                        ch16.u = 0;
                        ch16.f = new byte[]{2, 2, 2, 3, 3, 3};
                        ch16.I = true;
                    }
                    if (ch16.u > ch16.f.length - 1) {
                        if (ch16.I) {
                            ch ch17 = ch16;
                            ch16.IActionListener = true;
                            break;
                        }
                        ch16.u = 0;
                    }
                    return;
                }
                case 25: {
                    ch ch18 = this;
                    int n4 = 0;
                    int n5 = 0;
                    while (n5 < ch18.d.size()) {
                        bk bk3 = (bk)ch18.d.elementAt(n5);
                        if (!bk3.n && main.GameCanvas.IActionListener - ch18.H >= (long)(n5 * ch18.m)) {
                            bk3.n = true;
                            GameScreen.a(17, 0, ch18.h, ch18.J.B, ch18.J.C - 3, 2, ch18.t, (short)-1, null);
                            ch18.d.size();
                        }
                        if (bk3.n && !bk3.m) {
                            ++bk3.i;
                            if (!bk3.o) {
                                if (bk3.i < 10 && n5 == ch18.d.size() - 1 && ch18.J != null && !bv.a(ch18.J.B - (ch18.J.am + 1) * ch18.J.I, ch18.J.C, ch18.J.I == 1 ? 8 : 4)) {
                                    ch18.J.B -= ch18.J.I;
                                }
                                int n6 = bk3.h;
                                int n7 = bk3.UIPanel;
                                bk bk4 = bk3;
                                int n8 = n7 - bk4.IActionListener;
                                int n9 = n6 - bk4.c;
                                if (n8 > 1) {
                                    n8 = MathUtil.a(n8, n9);
                                    bk4.k = bk4.a(n8);
                                }
                                if (MathUtil.UIPanel(bk4.e) > 0 && MathUtil.UIPanel(bk4.IActionListener - n7) >= MathUtil.UIPanel(bk4.e)) {
                                    bk4.IActionListener += bk4.e;
                                } else {
                                    bk4.IActionListener = n7;
                                    bk4.e = 0;
                                }
                                if (MathUtil.UIPanel(bk4.f) > 0 && MathUtil.UIPanel(bk4.c - n6) >= MathUtil.UIPanel(bk4.f)) {
                                    bk4.c += bk4.f;
                                } else {
                                    bk4.c = n6;
                                    bk4.f = 0;
                                }
                                if (bk3.IActionListener == bk3.UIPanel) {
                                    bk3.o = true;
                                    bk3.i = 0;
                                }
                            }
                            if (bk3.o && bk3.i >= ch18.n * bk3.q.c) {
                                bk3.m = true;
                            }
                        }
                        if (bk3.m) {
                            ++n4;
                        }
                        ++n5;
                    }
                    if (n4 == ch18.d.size()) {
                        ch ch19 = ch18;
                        ch18.IActionListener = true;
                    }
                    return;
                }
                case 26: {
                    ch ch20 = this;
                    if (ch20.E == 0) {
                        ++ch20.v;
                        if (ch20.v > ch20.f.length - 1) {
                            ch20.v = ch20.f.length - 1;
                        }
                        if (ch20.u == ch20.m + 4) {
                            GameScreen.a(16, 1, ch20.h, ch20.o, ch20.GameScreen, 3, 0, (short)2945, null);
                        }
                        if (ch20.u > ch20.m + 4) {
                            --ch20.M;
                            if (ch20.M < 0) {
                                ch20.M = 0;
                                ch20.u = 0;
                                ch20.w = 0;
                                byte[] byArray = new byte[22];
                                byArray[0] = 1;
                                byArray[1] = 1;
                                byArray[6] = 1;
                                byArray[7] = 1;
                                byArray[8] = 1;
                                byArray[9] = 1;
                                byArray[13] = 1;
                                byArray[14] = 1;
                                byArray[15] = 1;
                                byArray[18] = 1;
                                byArray[19] = 1;
                                byArray[20] = 1;
                                byArray[21] = 2;
                                ch20.UIPanel = byArray;
                                boolean bl2 = true;
                                ch ch21 = ch20;
                                if (ch21.K != null) {
                                    int n10 = 0;
                                    while (n10 < ch21.K.length) {
                                        if (ch21.K[n10] != null) {
                                            bq bq2;
                                            if (ch21.K[n10].a == 0) {
                                                bq2 = GameScreen.c(ch21.K[n10].ResourceUtil);
                                                if (bq2 != null) {
                                                    bq2.Y = true;
                                                }
                                            } else {
                                                bq2 = GameWorld.e().J == ch21.K[n10].ResourceUtil ? GameWorld.e() : GameScreen.IActionListener(ch21.K[n10].ResourceUtil);
                                                if (bq2 != null) {
                                                    ((GameWorld)bq2).bR = true;
                                                }
                                            }
                                        }
                                        ++n10;
                                    }
                                }
                                ch20.E = 1;
                            } else {
                                ch ch22 = ch20;
                                if (ch22.C < 40) {
                                    ch22.C += 2;
                                }
                                ch22.N = ch22.O;
                                ch22.N -= ch22.C;
                                if (ch22.N >= 360) {
                                    ch22.N -= 360;
                                }
                                if (ch22.N < 0) {
                                    ch22.N += 360;
                                }
                                ch22.O = ch22.N;
                                ch22 = ch20;
                                int n11 = 0;
                                while (n11 < ch22.S.length) {
                                    if (ch22.N >= 360) {
                                        ch22.N -= 360;
                                    }
                                    if (ch22.N < 0) {
                                        ch22.N += 360;
                                    }
                                    ch22.S[n11] = MathUtil.UIPanel(ch22.M * MathUtil.a(ch22.N) / 1024);
                                    ch22.R[n11] = MathUtil.UIPanel(ch22.M * MathUtil.IActionListener(ch22.N) / 1024);
                                    if (ch22.N < 90) {
                                        ch22.T[n11] = ch22.o + ch22.R[n11];
                                        ch22.U[n11] = ch22.GameScreen - ch22.S[n11];
                                    } else if (ch22.N >= 90 && ch22.N < 180) {
                                        ch22.T[n11] = ch22.o - ch22.R[n11];
                                        ch22.U[n11] = ch22.GameScreen - ch22.S[n11];
                                    } else if (ch22.N >= 180 && ch22.N < 270) {
                                        ch22.T[n11] = ch22.o - ch22.R[n11];
                                        ch22.U[n11] = ch22.GameScreen + ch22.S[n11];
                                    } else {
                                        ch22.T[n11] = ch22.o + ch22.R[n11];
                                        ch22.U[n11] = ch22.GameScreen + ch22.S[n11];
                                    }
                                    ch22.N -= ch22.P;
                                    ++n11;
                                }
                                ch20.a(true);
                            }
                            break;
                        }
                    } else if (ch20.E == 1) {
                        ++ch20.w;
                        if (ch20.w > ch20.UIPanel.length - 1) {
                            ch20.w = ch20.UIPanel.length - 1;
                            if (main.GameCanvas.w % 2 == 0) {
                                ++ch20.A;
                            }
                            ch20.x += ch20.A;
                            if (ch20.x >= ch20.r - ch20.aa[0].IActionListener - ch20.F + ch20.B) {
                                ch20.x = ch20.r - ch20.aa[0].IActionListener - ch20.F + ch20.B;
                                ch20.u = 0;
                                ch20.w = 0;
                                ch20.E = 2;
                                ch20.UIPanel = new byte[]{3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
                                break;
                            }
                        }
                    } else if (ch20.E == 2) {
                        ++ch20.w;
                        if (ch20.w > ch20.UIPanel.length - 1) {
                            ch20.E = 3;
                            ch20.v = 0;
                            byte[] byArray = new byte[17];
                            byArray[0] = 2;
                            byArray[1] = 2;
                            byArray[2] = 1;
                            byArray[3] = 1;
                            byArray[6] = 3;
                            byArray[7] = 3;
                            byArray[8] = 3;
                            byArray[12] = 4;
                            byArray[13] = 4;
                            byArray[14] = 4;
                            ch20.f = byArray;
                            break;
                        }
                    } else if (ch20.E == 3) {
                        ++ch20.v;
                        if (ch20.v > ch20.f.length - 1) {
                            ch20.v = 0;
                            ch20.E = 4;
                            byte[] byArray = new byte[51];
                            byArray[17] = 3;
                            byArray[18] = 3;
                            byArray[19] = 3;
                            byArray[23] = 4;
                            byArray[24] = 4;
                            byArray[25] = 4;
                            byArray[45] = 3;
                            byArray[46] = 3;
                            byArray[49] = 4;
                            byArray[50] = 4;
                            ch20.f = byArray;
                            break;
                        }
                    } else {
                        ++ch20.v;
                        if (ch20.v > ch20.f.length - 1) {
                            ch20.v = 0;
                        }
                        if (main.GameCanvas.IActionListener - ch20.H >= (long)ch20.G) {
                            GameScreen.a(16, 0, ch20.h, ch20.Message, ch20.z, 1, 0, (short)-1, null);
                            ch20.a(false);
                            ch ch23 = ch20;
                            ch20.IActionListener = true;
                        }
                    }
                    return;
                }
                case 9: {
                    ch ch24 = this;
                    int n12 = 0;
                    while (n12 < ch24.d.size()) {
                        cm cm2;
                        cm cm3 = cm2 = (Map)ch24.d.elementAt(n12);
                        cm2.a += cm3.e;
                        cm3.c += cm3.e;
                        cm3.IActionListener += cm3.f;
                        cm3.d += cm3.f;
                        ++cm3.UIPanel;
                        if (ch24.u >= ch24.ResourceUtil) {
                            ch24.d.removeElement(cm2);
                            --n12;
                        }
                        ++n12;
                    }
                    if (ch24.u >= ch24.ResourceUtil) {
                        if (main.GameCanvas.IActionListener - ch24.H >= (long)ch24.G) {
                            ch24.d.removeAllElements();
                            ch ch25 = ch24;
                            ch24.IActionListener = true;
                            break;
                        }
                        ch24.ResourceUtil = MathUtil.IActionListener(4, 6);
                        ch24.u = 0;
                        ch24.a(ch24.C, ch24.Y, ch24.Z, 0);
                    }
                    return;
                }
                case 10: 
                case 11: {
                    ch ch26 = this;
                    int n13 = 0;
                    while (n13 < ch26.d.size()) {
                        bk bk5 = (bk)ch26.d.elementAt(n13);
                        bk5.a();
                        if (bk5.c < ch26.D) {
                            ch26.d.removeElementAt(n13);
                            --n13;
                        }
                        ++n13;
                    }
                    if (ch26.u >= ch26.ResourceUtil) {
                        ch ch27 = ch26;
                        ch26.IActionListener = true;
                    }
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            MathUtil.IActionListener("ERR update: " + exception.toString());
            ch ch28 = this;
            this.b = true;
        }
    }

    public final void a(MGraphics object) {
        try {
            if (this.b || this.u < 0) {
                return;
            }
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    Object object2 = object;
                    object = this;
                    if (((ch)object).e != null) {
                        ((ch)object).e.a(((ch)object).u / 5 % ((ch)object).e.c, ((ch)object).o, ((ch)object).GameScreen, 0, 33, (MGraphics)object2);
                    }
                    return;
                }
                case 3: {
                    Object object3 = object;
                    object = this;
                    int n2 = 0;
                    while (n2 < ((ch)object).d.size()) {
                        bk bk2 = (bk)((ch)object).d.elementAt(n2);
                        if (bk2.i - bk2.j >= 0 && bk2.GameScreen != null) {
                            bk2.GameScreen.a((bk2.i - bk2.j) / 3 % bk2.GameScreen.c, bk2.IActionListener, bk2.c, 0, 3, (MGraphics)object3);
                        }
                        ++n2;
                    }
                    return;
                }
                case 17: {
                    this.a((MGraphics)object, 0);
                    return;
                }
                case 16: {
                    if (this.j == 0) {
                        this.a((MGraphics)object, 33);
                        return;
                    }
                    this.a((MGraphics)object, 3);
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    int n3 = 33;
                    Object object4 = object;
                    object = this;
                    if (((ch)object).aa[0] != null) {
                        if (((ch)object).f != null) {
                            ((ch)object).aa[0].a(((ch)object).f[((ch)object).u % ((ch)object).f.length], ((ch)object).o, ((ch)object).GameScreen, ((ch)object).t, 33, (MGraphics)object4);
                            break;
                        }
                        ((ch)object).aa[0].a(((ch)object).u / ((ch)object).n % ((ch)object).aa[0].c, ((ch)object).o, ((ch)object).GameScreen, ((ch)object).t, 33, (MGraphics)object4);
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    int n4 = 3;
                    Object object5 = object;
                    object = this;
                    if (((ch)object).aa[0] != null) {
                        ((ch)object).aa[0].a(((ch)object).u / ((ch)object).n % ((ch)object).aa[0].c, ((ch)object).o, ((ch)object).GameScreen, ((ch)object).t, 3, (MGraphics)object5);
                    }
                    return;
                }
                case 24: {
                    Object object6 = object;
                    object = this;
                    if (((ch)object).aa != null) {
                        ((MGraphics)object6).e(((ch)object).o, ((ch)object).GameScreen - ((ch)object).r / 2, ((ch)object).q, ((ch)object).r);
                        int n5 = ((ch)object).C;
                        int n6 = ((ch)object).GameScreen;
                        int n7 = ((ch)object).o;
                        byte by2 = ((ch)object).f[((ch)object).u];
                        df df2 = ((ch)object).aa[2];
                        df df3 = ((ch)object).aa[1];
                        df df4 = ((ch)object).aa[0];
                        Object object7 = object6;
                        Object object8 = object;
                        int n8 = n5;
                        boolean bl2 = false;
                        if (df4 != null && df2 != null) {
                            bl2 = true;
                            n8 = n5 - (df4.a + df2.a);
                        }
                        if (n8 > 0) {
                            int n9 = n8 / df3.a;
                            if (n8 % df3.a > 0) {
                                ++n9;
                            }
                            if (((ch)object8).s == -1) {
                                n8 = 0;
                                while (n8 < n9) {
                                    int n10 = n8 == n9 - 1 ? (bl2 ? n7 + df2.a : n7 + n5 - df3.a) : (bl2 ? n7 + df2.a + df3.a + n8 * df3.a : n7 + n8 * df3.a);
                                    df3.a(by2, n10, n6 - df3.IActionListener / 2, 2, 0, (MGraphics)object7);
                                    ++n8;
                                }
                            } else {
                                n8 = 0;
                                while (n8 < n9) {
                                    int n11 = n8 == n9 - 1 ? (bl2 ? n7 + n5 - (df3.a + df2.a) : n7 + n5 - df3.a) : (bl2 ? n7 + n8 * df3.a + df4.a : n7 + n8 * df3.a);
                                    df3.a(by2, n11, n6 - df3.IActionListener / 2, 0, 0, (MGraphics)object7);
                                    ++n8;
                                }
                            }
                        }
                        if (((ch)object8).s == -1) {
                            if (df4 != null) {
                                df4.a(by2, n7 + n5 - df4.a, n6 - df4.IActionListener / 2, 2, 0, (MGraphics)object7);
                            }
                            if (df2 != null) {
                                df2.a(by2, n7, n6 - df2.IActionListener / 2, 2, 0, (MGraphics)object7);
                            }
                        } else {
                            if (df4 != null) {
                                df4.a(by2, n7, n6 - df4.IActionListener / 2, 0, 0, (MGraphics)object7);
                            }
                            if (df2 != null) {
                                df2.a(by2, n7 + n5 - df2.a - 1, n6 - df2.IActionListener / 2, 0, 0, (MGraphics)object7);
                            }
                        }
                        main.GameCanvas.IActionListener((MGraphics)object6);
                        if (((ch)object).s == -1 && ((ch)object).aa[0] != null) {
                            ((ch)object).aa[0].a(((ch)object).f[((ch)object).u], ((ch)object).o + ((ch)object).q - ((ch)object).aa[0].a, ((ch)object).GameScreen - ((ch)object).aa[0].IActionListener / 2 - 1, 2, 0, (MGraphics)object6);
                        }
                    }
                    return;
                }
                case 25: {
                    Object object9 = object;
                    object = this;
                    int n12 = 0;
                    while (n12 < ((ch)object).d.size()) {
                        bk bk3 = (bk)((ch)object).d.elementAt(n12);
                        if (bk3.n && !bk3.m) {
                            if (!bk3.o) {
                                bk3.a((MGraphics)object9, bk3.GameScreen, 3, false);
                            }
                            if (bk3.o) {
                                bk3.q.a(bk3.i / ((ch)object).n % bk3.q.c, bk3.IActionListener, bk3.c, ((ch)object).t, 3, (MGraphics)object9);
                            }
                        }
                        ++n12;
                    }
                    return;
                }
                case 26: {
                    Object object10 = object;
                    object = this;
                    if (((ch)object).aa != null) {
                        if (((ch)object).f != null) {
                            ((ch)object).aa[0].a(((ch)object).f[((ch)object).v], ((ch)object).Message, ((ch)object).z, 0, 33, (MGraphics)object10);
                        }
                        if (((ch)object).E == 1 || ((ch)object).E == 2) {
                            int n13 = 33;
                            int n14 = ((ch)object).F;
                            if (((ch)object).UIPanel[((ch)object).w] == 0 || ((ch)object).UIPanel[((ch)object).w] == 1) {
                                n13 = 3;
                                n14 = 0;
                            }
                            ((ch)object).aa[1].a(((ch)object).UIPanel[((ch)object).w], ((ch)object).o, ((ch)object).GameScreen + n14 + ((ch)object).x, 0, n13, (MGraphics)object10);
                        }
                    }
                    return;
                }
                case 9: {
                    Object object11 = object;
                    object = this;
                    int n15 = 0;
                    while (n15 < ((ch)object).d.size()) {
                        cm cm2 = (Map)((ch)object).d.elementAt(n15);
                        if (cm2 != null) {
                            int n16 = 0;
                            if (n15 / 2 < ((ch)object).W.length) {
                                n16 = ((ch)object).W[n15 / 2];
                            }
                            ((MGraphics)object11).a(n16);
                            ((MGraphics)object11).a(cm2.a / 1000, cm2.IActionListener / 1000, cm2.c / 1000, cm2.d / 1000);
                            if (cm2.h) {
                                ((MGraphics)object11).a(cm2.a / 1000 + 1, cm2.IActionListener / 1000, cm2.c / 1000 + 1, cm2.d / 1000);
                            }
                        }
                        ++n15;
                    }
                    return;
                }
                case 10: 
                case 11: {
                    Object object12 = object;
                    object = this;
                    int n17 = 0;
                    while (n17 < ((ch)object).d.size()) {
                        bk bk4 = (bk)((ch)object).d.elementAt(n17);
                        if (((ch)object).e != null) {
                            ((ch)object).e.a(bk4.k, bk4.IActionListener, bk4.c, 0, 3, (MGraphics)object12);
                        }
                        ++n17;
                    }
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            MathUtil.IActionListener(exception.toString());
            object = this;
            this.b = true;
        }
    }

    private void c() {
        int n2 = MathUtil.IActionListener(3, 5);
        this.l = 90;
        int n3 = 0;
        while (n3 < n2) {
            bk bk2 = new bk();
            new bk().IActionListener = this.o + MathUtil.e(4);
            bk2.c = this.GameScreen + MathUtil.e(5);
            if (this.j == 0) {
                bk2.j = MathUtil.d(10);
                int n4 = 1;
                if (n3 % 2 == 0) {
                    n4 = -1;
                }
                bk2.IActionListener = this.o + MathUtil.d(c[5][0] / 2) * n4;
                bk2.c = this.GameScreen - MathUtil.d(c[5][1] / 2);
                bk2.GameScreen = new Frame(7);
            }
            this.d.addElement(bk2);
            ++n3;
        }
    }

    private void d() {
        this.o = this.J.B + 20 * this.J.I;
        this.m = this.G / 15;
        if (this.L != null) {
            int n2 = 0;
            while (n2 < 15) {
                bk bk2 = new bk();
                new bk().GameScreen = this.aa[0];
                bk2.q = this.aa[2];
                bk2.IActionListener = this.o;
                bk2.c = this.GameScreen;
                if (this.L != null) {
                    bk2.UIPanel = this.L.IActionListener;
                    bk2.h = this.L.c;
                    if (this.k > 0) {
                        bk2.UIPanel += MathUtil.c(0, this.k);
                        bk2.h += MathUtil.c(0, this.k);
                    }
                }
                this.C = MathUtil.IActionListener(9, 12);
                if (n2 == 14) {
                    bk2.GameScreen = this.aa[1];
                    bk2.q = this.aa[3];
                    bk2.UIPanel = this.L.IActionListener;
                    bk2.h = this.L.c;
                    this.C = 9;
                }
                bk2.n = false;
                bk2.o = false;
                bk2.m = false;
                int n3 = this.C;
                bk bk3 = bk2;
                bk2.d = n3;
                n3 = bk3.UIPanel - bk3.IActionListener;
                int n4 = bk3.h - bk3.c;
                int n5 = MathUtil.a(n3, n4);
                bk3.k = bk3.a(n5);
                int n6 = MathUtil.d(n3, n4) / bk3.d;
                if (n6 == 0) {
                    n6 = 1;
                }
                n5 = n3 / n6;
                int n7 = n4 / n6;
                if (n5 == 0 && n3 < n6) {
                    int n8 = n5 = n3 < 0 ? -1 : 1;
                }
                if (n7 == 0 && n4 < n6) {
                    int n9 = n7 = n4 < 0 ? -1 : 1;
                }
                if (MathUtil.UIPanel(n5) > MathUtil.UIPanel(n3)) {
                    n5 = n3;
                }
                if (MathUtil.UIPanel(n7) > MathUtil.UIPanel(n4)) {
                    n7 = n4;
                }
                bk3.e = n5;
                bk3.f = n7;
                this.d.addElement(bk2);
                ++n2;
            }
            return;
        }
        ch ch2 = this;
        this.b = true;
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (this.u == -1) {
            this.d.removeAllElements();
        }
        this.W = new int[4];
        if (n4 <= n3) {
            n4 = n3 + 1;
        }
        n5 = 0;
        while (n5 < 4) {
            this.W[n5] = MathUtil.d(2) == 0 ? V[this.X][MathUtil.d(3)] : V[this.X][2];
            ++n5;
        }
        n5 = 0;
        while (n5 < 4) {
            cm cm2 = new Map();
            int n6 = 45 + n5 * 45 - 5;
            int n7 = 5 + n5 * 45;
            if (n6 <= n7) {
                n6 = n7 + 1;
            }
            int n8 = MathUtil.IActionListener(n3, n4);
            int n9 = MathUtil.IActionListener(n2, n2 + 3);
            n7 = MathUtil.IActionListener(n7, n6);
            n6 = MathUtil.IActionListener(13, 23);
            boolean bl2 = MathUtil.d(4) == 0;
            n7 = MathUtil.c(n7 % 360);
            cm2.a(this.Message - MathUtil.a(n7) * (n8 + n6), this.z - MathUtil.IActionListener(n7) * (n8 + n6), this.Message - MathUtil.a(n7) * n6, this.z - MathUtil.IActionListener(n7) * n6, MathUtil.a(n7) * n9, MathUtil.IActionListener(n7) * n9, bl2);
            this.d.addElement(cm2);
            cm2 = new Map();
            n7 += 180 + MathUtil.c(2, 5);
            n7 = MathUtil.c(n7 % 360);
            cm2.a(this.Message - MathUtil.a(n7) * (n8 + n6), this.z - MathUtil.IActionListener(n7) * (n8 + n6), this.Message - MathUtil.a(n7) * n6, this.z - MathUtil.IActionListener(n7) * n6, MathUtil.a(n7) * n9, MathUtil.IActionListener(n7) * n9, bl2);
            this.d.addElement(cm2);
            ++n5;
        }
    }

    private void e() {
        this.e = new Frame(8);
        this.l = MathUtil.IActionListener(23, 27);
        int n2 = MathUtil.IActionListener(1, 3);
        this.D = this.GameScreen - 40;
        int n3 = 0;
        while (n3 < n2) {
            bk bk2 = new bk();
            new bk().IActionListener = this.o + MathUtil.c(0, 20);
            bk2.c = this.GameScreen + MathUtil.e(7);
            bk2.k = this.i == 10 ? MathUtil.IActionListener(0, this.e.c - 2) : (this.i == 11 ? MathUtil.IActionListener(2, this.e.c) : MathUtil.IActionListener(0, this.e.c));
            MathUtil.d(2);
            bk2.f = -MathUtil.IActionListener(1, 4);
            this.d.addElement(bk2);
            ++n3;
        }
    }

    private void a(boolean bl2) {
        if (this.K == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.K.length) {
            if (this.K[n2] != null) {
                bq bq2;
                if (this.K[n2].a == 0) {
                    bq2 = GameScreen.c(this.K[n2].ResourceUtil);
                    if (bq2 != null) {
                        bq2.M = bl2;
                        bq2.Y = false;
                        bq2.N = this.T[n2];
                        bq2.O = this.U[n2];
                    }
                } else {
                    bq2 = GameWorld.e().J == this.K[n2].ResourceUtil ? GameWorld.e() : GameScreen.IActionListener(this.K[n2].ResourceUtil);
                    if (bq2 != null) {
                        ((GameWorld)bq2).dc = bl2;
                        ((GameWorld)bq2).bR = false;
                        ((GameWorld)bq2).dd = this.T[n2];
                        ((GameWorld)bq2).Command = this.U[n2];
                    }
                }
            }
            ++n2;
        }
    }

    private void f() {
        int n2;
        int n3 = 0;
        int[] nArray = null;
        int[] nArray2 = null;
        switch (this.i) {
            case 18: {
                n3 = 24;
                nArray = new int[1];
                nArray2 = new int[]{9};
                break;
            }
            case 21: {
                n3 = 24;
                nArray = new int[]{1};
                nArray2 = new int[]{10};
                break;
            }
            case 24: {
                n3 = 24;
                nArray = new int[]{2, 3, 4};
                nArray2 = new int[]{11, 12, 13};
                break;
            }
            case 19: {
                n3 = 25;
                nArray = new int[1];
                nArray2 = new int[]{14};
                break;
            }
            case 22: {
                n3 = 25;
                nArray = new int[]{1};
                nArray2 = new int[]{15};
                break;
            }
            case 17: {
                n3 = 25;
                nArray = new int[]{2};
                nArray2 = new int[]{16};
                break;
            }
            case 25: {
                n3 = 25;
                nArray = new int[]{3, 4, 5, 6};
                nArray2 = new int[]{17, 18, 19, 20};
                break;
            }
            case 20: {
                n3 = 26;
                nArray = new int[1];
                nArray2 = new int[]{21};
                break;
            }
            case 23: {
                n3 = 26;
                nArray = new int[]{1};
                nArray2 = new int[]{22};
                break;
            }
            case 16: {
                n3 = 26;
                if (this.j == 0) {
                    nArray = new int[]{7};
                    nArray2 = new int[]{28};
                }
                if (this.j != 1) break;
                nArray = new int[]{2};
                nArray2 = new int[]{23};
                break;
            }
            case 26: {
                n3 = 26;
                n2 = 0;
                int n4 = 0;
                if (this.j == 0) {
                    n2 = 4;
                    n4 = 25;
                } else if (this.j == 1) {
                    n2 = 5;
                    n4 = 26;
                } else if (this.j == 2) {
                    n2 = 6;
                    n4 = 27;
                }
                nArray = new int[]{n2, 3};
                nArray2 = new int[]{n4, 24};
            }
        }
        if (nArray != null && nArray2 != null) {
            this.aa = new Frame[nArray.length];
            n2 = 0;
            while (n2 < nArray.length) {
                Object object = "Skills_" + n3 + "_" + this.h + "_" + nArray[n2];
                if ((object = ResourceUtil.d((String)object)) == null) {
                    object = new Frame(nArray2[n2]);
                }
                if (object != null) {
                    this.aa[n2] = object;
                }
                ++n2;
            }
        }
    }

    private void a(MGraphics en2, int n2) {
        this.aa[0].a(this.u / this.n % this.aa[0].c, this.o, this.GameScreen, this.s, n2, en2);
    }
}

