/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class ef {
    public byte a;
    public byte IActionListener;
    public byte c;
    public byte d;
    public int e;
    public int f;
    public int UIPanel;
    public String h;
    public String i;
    public byte j;
    public byte k;
    public GameWorld ResourceUtil;
    public aa m;
    public ee[] n;
    int[] o;
    int GameScreen;
    long q;
    public ae r;
    private LoggingList s;

    public ef() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.o = nArray;
        this.GameScreen = 0;
        this.s = new LoggingList("");
    }

    public final void a(byte by2, byte by3) {
        this.b = by2;
        this.c = by3;
    }

    public final void a(byte by2) {
        this.j = by2;
        this.a();
    }

    public final void IActionListener(byte by2) {
        this.k = by2;
        this.a();
    }

    public static ef a(LoggingList el2, int n2) {
        if (el2 != null) {
            int n3 = 0;
            while (n3 < el2.size()) {
                ef ef2 = (ef)el2.elementAt(n3);
                if (ef2 != null && ef2.e == n2) {
                    return ef2;
                }
                ++n3;
            }
        }
        return null;
    }

    public final void a() {
        Object object;
        this.r = new ae();
        String string = "";
        string = String.valueOf(string) + "\n|6|" + this.i;
        string = String.valueOf(string) + "\n--";
        if (this.n != null) {
            int n2 = 0;
            while (true) {
                int n3 = 0;
                int n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].IActionListener) {
                        ++n3;
                        break;
                    }
                    ++n4;
                }
                if (n3 == 0) break;
                string = n2 == 0 ? String.valueOf(string) + "\n|6|2|--" + GameStrings.h + "--" : String.valueOf(string) + "\n|6|2|--" + GameStrings.UIPanel + " Lv." + n2 + "--";
                n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].IActionListener) {
                        String string2 = "1";
                        if (this.j == 0) {
                            string2 = "2";
                        } else if (this.n[n4].IActionListener != 0) {
                            if (this.k == 0) {
                                string2 = "2";
                            } else if (this.j < this.n[n4].IActionListener) {
                                string2 = "2";
                            }
                        }
                        string = String.valueOf(string) + "\n|" + string2 + "|1|" + (String)object;
                    }
                    ++n4;
                }
                if (n3 == 0) continue;
                ++n2;
            }
        }
        object = this.r;
        this.r.a = aq.d;
        ((ae)object).e = aq.IActionListener;
        ((ae)object).d = mFont.k.a(string, ((ae)object).a - 8);
        ((ae)object).IActionListener = 10000000;
        ((ae)object).i = null;
        ((ae)object).UIPanel = ((ae)object).d.length * 12;
        ((ae)object).f = aq.c;
        ((ae)object).t = 10;
        ((ae)object).h = ((ae)object).UIPanel - aq.e;
        if (((ae)object).h < 0) {
            ((ae)object).h = 0;
        }
    }

    public final void a(MGraphics en2, int n2, int n3) {
        ef ef2 = this;
        if (ef2.IActionListener == ef2.c && ef2.s.size() == 0) {
            int n4 = MathUtil.IActionListener(1, 5);
            int n5 = 0;
            while (n5 < n4) {
                be be2 = new be();
                new be().a = MathUtil.IActionListener(5, 25);
                be2.IActionListener = MathUtil.IActionListener(5, 25);
                be2.d = n5 * MathUtil.IActionListener(0, 8);
                be2.e = 0;
                be2.c = -1;
                ef2.s.addElement(be2);
                ++n5;
            }
        }
        int n6 = 0;
        while (n6 < this.s.size()) {
            be be3 = (be)this.s.elementAt(n6);
            if (be3 != null) {
                if (be3.e < be3.d) {
                    ++be3.e;
                }
                if (be3.e >= be3.d) {
                    be3.c = main.GameCanvas.w / 3 % (aq.GameCanvas.c + 1);
                    if (be3.c >= aq.GameCanvas.c) {
                        this.s.removeElementAt(n6);
                        --n6;
                    } else {
                        aq.GameCanvas.a(be3.c, n2 + be3.a, n3 + be3.IActionListener, 0, 3, en2);
                    }
                }
            }
            ++n6;
        }
    }
}

