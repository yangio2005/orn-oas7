/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class ea {
    public int LoginScreen;
    public int b;
    public int c;
    public int d;
    private boolean o;
    private Char GameScreen;
    public int e;
    private int q;
    public int f;
    public int g;
    private int r;
    private int SessionReceiver;
    private int MyHashtable;
    private boolean u = true;
    public int Item;
    public int i = 0;
    public static MyVector j = new MyVector("vEffData");
    public int k = 0;
    public long Res = 0L;
    private static MyVector v = new MyVector("vLastEff");
    public static MyVector m = new MyVector("vNewEff");
    public static MyVector n = new MyVector("vdowloadEff");
    private int[] w;
    private int[] x;
    private int[] Message;
    private int[] z;
    private int[] A;
    private boolean B;
    private short[] C;

    private static void b(int n2) {
        int n3 = 0;
        while (n3 < j.size()) {
            ck ck2 = (ck)j.elementAt(n3);
            if (ck2.d == n2) {
                j.removeElement(ck2);
                return;
            }
            ++n3;
        }
    }

    public static ck LoginScreen(int n2) {
        int n3 = 0;
        while (n3 < j.size()) {
            ck ck2 = (ck)j.elementAt(n3);
            if (ck2.d == n2) {
                return ck2;
            }
            ++n3;
        }
        return null;
    }

    public ea() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.Message = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
    }

    public ea(int n2, Char object, int n3, int n4, int n5, byte by2) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.Message = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.GameScreen = object;
        this.LoginScreen = n2;
        this.Item = n3;
        this.r = n4;
        this.SessionReceiver = n5;
        this.i = by2;
        if (ea.LoginScreen(n2) == null) {
            object = new ck();
            new ck().d = n2;
            if (n2 >= 42 && n2 <= 46) {
                n2 = 106;
            }
            String string = "/x" + mGraphics.b + "/effectdata/" + n2 + "/data";
            InputStream inputStream = null;
            try {
                inputStream = ad.LoginScreen(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n2 > 100 && n2 < 200) {
                    ((ck)object).b(string);
                } else {
                    ((ck)object).LoginScreen(string);
                }
                ((ck)object).LoginScreen = Res.loadImage("/effectdata/" + n2 + "/img.png");
            } else {
                GameService.LoginScreen().LoginScreen((short)n2);
            }
            j.addElement(object);
        }
        this.c = -1;
        this.d = -1;
        this.k = -1;
        this.b = 4;
        if (n2 == 78) {
            this.b = 5;
        }
    }

    public ea(int n2, int n3, int n4, int n5, int n6, int n7) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.Message = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.f = n3;
        this.g = n4;
        this.LoginScreen = n2;
        this.Item = n5;
        this.r = n6;
        this.SessionReceiver = n7;
        if (ea.LoginScreen(n2) == null) {
            ck ck2 = new ck();
            new ck().d = n2;
            if (n2 >= 42 && n2 <= 46) {
                n2 = 106;
            }
            String string = "/x" + mGraphics.b + "/effectdata/" + n2 + "/data";
            InputStream inputStream = null;
            try {
                inputStream = ad.LoginScreen(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n2 > 100 && n2 < 200) {
                    ck2.b(string);
                } else {
                    ck2.LoginScreen(string);
                }
                ck2.LoginScreen = Res.loadImage("/effectdata/" + n2 + "/img.png");
            } else {
                GameService.LoginScreen().LoginScreen((short)n2);
            }
            j.addElement(ck2);
            if (v.size() > 20) {
                ea.b(Integer.parseInt((String)v.elementAt(0)));
                v.removeElementAt(0);
            }
            v.addElement(String.valueOf(this.LoginScreen));
        }
        this.c = -1;
        this.d = -1;
        this.b = n2 == 78 ? 5 : 1;
        if (!ea.LoginScreen(String.valueOf(this.LoginScreen))) {
            m.addElement(String.valueOf(this.LoginScreen));
        }
    }

    private static boolean methodLoginScreen(String string) {
        int n2 = 0;
        while (n2 < m.size()) {
            String string2 = (String)m.elementAt(n2);
            if (string2.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private boolean b() {
        return this.u;
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3) {
        if (!this.b()) {
            return;
        }
        if (ea.LoginScreen((int)this.LoginScreen).LoginScreen != null) {
            ea.LoginScreen(this.LoginScreen).LoginScreen(en2, this.q, this.f + n2, this.g + n3, this.k, this.Item);
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (!this.b()) {
            return;
        }
        if (ea.LoginScreen(this.LoginScreen) == null) {
            return;
        }
        if (ea.LoginScreen((int)this.LoginScreen).LoginScreen != null) {
            try {
                ea.LoginScreen(this.LoginScreen).LoginScreen(en2, this.q, this.f, this.g, this.k, this.Item);
                return;
            }
            catch (Exception exception) {
                ds.c("Effect " + this.LoginScreen + " err at frame " + this.q + " vitri " + this.f + "_" + this.g + "   " + this.Item);
                exception.printStackTrace();
            }
        }
    }

    public final void methodLoginScreen() {
        block45: {
            try {
                ck ck2;
                if (this.LoginScreen >= 42 && this.LoginScreen <= 46) {
                    ea ea2 = this;
                    if (ea2.LoginScreen == 42) {
                        ea2.q = ea2.w[ea2.e];
                    }
                    if (ea2.LoginScreen == 43) {
                        ea2.q = ea2.x[ea2.e];
                    }
                    if (ea2.LoginScreen == 44) {
                        ea2.q = ea2.Message[ea2.e];
                    }
                    if (ea2.LoginScreen == 45) {
                        ea2.q = ea2.z[ea2.e];
                    }
                    if (ea2.LoginScreen == 46) {
                        ea2.q = ea2.A[ea2.e];
                    }
                    ++ea2.e;
                    if (ea2.e > ea2.w.length - 1) {
                        ea2.e = 0;
                    }
                    return;
                }
                if (ea.LoginScreen(this.LoginScreen) == null) {
                    return;
                }
                if (ea.LoginScreen((int)this.LoginScreen).LoginScreen == null) {
                    return;
                }
                if (this.b == 5) {
                    int n2 = this.GameScreen.H;
                    ck2 = ea.LoginScreen(this.LoginScreen);
                    if (n2 >= ck2.c.length) {
                        n2 = 0;
                    }
                    this.C = ck2.c[n2] == null ? new short[1] : ck2.c[n2];
                } else {
                    ck2 = ea.LoginScreen(this.LoginScreen);
                    this.C = ck2.b;
                }
                if (this.C != null) {
                    if (!this.B) {
                        this.B = true;
                        int n3 = this.C.length - 1;
                        if (n3 > 0 && this.b != 1) {
                            this.e = ds.b(0, n3);
                        }
                        if (this.b == 0) {
                            this.e = ds.b(this.c, this.d);
                        }
                    }
                    switch (this.b) {
                        case 4: {
                            this.f = this.GameScreen.B;
                            this.g = this.GameScreen.C;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 5: {
                            this.k = this.GameScreen.I == 1 ? 0 : 1;
                            this.f = this.GameScreen.I == 1 ? this.GameScreen.B - 15 : this.GameScreen.B + 15;
                            this.g = this.GameScreen.cE == 0 ? this.GameScreen.C - 25 : this.GameScreen.C - 35;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 1: 
                        case 3: {
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 0: {
                            if (ds.LoginScreen(this.f - 50, this.g - 50, 100, 100, Char.e().B, Char.e().C) && this.e > this.c && this.e < this.d) {
                                if (this.e < this.d) {
                                    this.e = this.d;
                                }
                                this.o = true;
                            }
                            if (!this.o) {
                                ++this.e;
                                if (this.e != this.d) break;
                                this.e = this.c;
                                break;
                            }
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 2: {
                            if (this.e < this.C.length) {
                                ++this.e;
                            }
                            ++this.MyHashtable;
                            if (this.MyHashtable != this.SessionReceiver) break;
                            this.MyHashtable = 0;
                            this.k = ds.b(0, 2);
                        }
                    }
                    if (this.e <= this.C.length - 1) {
                        this.q = this.C[this.e];
                    }
                }
                if (this.e >= this.C.length - 1) {
                    if (this.b == 0 || this.b == 3) {
                        this.u = false;
                    }
                    if (this.SessionReceiver == -1) {
                        ei.LoginScreen.removeElement(this);
                    }
                    if (this.b == 2) {
                        this.e = 0;
                        return;
                    }
                    if (this.b == 1 && this.r == 1) {
                        this.u = false;
                    }
                    if (this.b == 4 || this.b == 5) {
                        if (this.r == -1) {
                            this.e = 0;
                            return;
                        }
                        ++this.MyHashtable;
                        if (this.MyHashtable == this.SessionReceiver) {
                            this.MyHashtable = 0;
                            --this.r;
                            this.e = 0;
                            if (this.r == 0) {
                                this.GameScreen.b(0, this.LoginScreen);
                            }
                        }
                        return;
                    }
                    this.o = false;
                    if (this.r == -1) {
                        ++this.MyHashtable;
                        this.e = 0;
                        if (this.MyHashtable == this.SessionReceiver) {
                            this.MyHashtable = 0;
                            if (this.SessionReceiver > 1) {
                                this.k = ds.b(0, 2);
                                return;
                            }
                        }
                    } else {
                        ++this.MyHashtable;
                        this.e = 0;
                        if (this.MyHashtable == this.SessionReceiver) {
                            this.MyHashtable = 0;
                            --this.r;
                            if (this.r == 0) {
                                ei.LoginScreen.removeElement(this);
                                return;
                            }
                        }
                    }
                    break block45;
                }
                this.u = true;
                return;
            }
            catch (Exception exception) {
                System.out.println("err  Effect.update: " + this.LoginScreen + "  " + this.b);
                exception.printStackTrace();
                ei.LoginScreen.removeElement(this);
            }
        }
    }
}

