/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class mFont {
    private int K;
    private int L;
    private Image M;
    private String N;
    private int[][] O;
    private static String P = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
    public static mFont a = new mFont(P, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
    public static mFont IActionListener = new mFont(P, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
    public static mFont c = new mFont(P, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
    public static mFont d = new mFont(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static mFont e = new mFont(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static mFont f = new mFont(P, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
    public static mFont UIPanel = new mFont(P, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
    public static mFont h = new mFont(P, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
    public static mFont i = new mFont(P, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
    public static mFont j = new mFont(P, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
    public static mFont k = new mFont(P, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
    public static mFont ResourceUtil = new mFont(P, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
    public static mFont m = new mFont(P, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
    public static mFont n = new mFont(P, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
    public static mFont o = new mFont(P, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
    public static mFont GameScreen = new mFont(P, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
    public static mFont q = new mFont(P, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
    public static mFont r = new mFont(P, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
    public static mFont s = new mFont(P, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
    public static mFont t = new mFont(P, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
    private static mFont Q = new mFont(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
    private static mFont R = new mFont(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
    private static mFont S = new mFont(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
    public static mFont u = new mFont(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
    private static mFont T = new mFont(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
    public static mFont v = R;
    public static mFont w = c;
    public static mFont x = Q;
    public static mFont Message = S;
    public static mFont z = T;
    public static mFont A = ResourceUtil;
    public static mFont B = GameScreen;
    public static mFont C = n;
    public static mFont D = r;
    public static mFont E = o;
    public static mFont F = n;
    public static mFont G = UIPanel;
    public static mFont H = s;
    public static mFont I = h;
    public static mFont J = ResourceUtil;
    private String U;

    private mFont(String object, String string, String string2, int n2) {
        try {
            this.N = object;
            this.K = n2;
            this.U = string;
            object = null;
            mFont di2 = this;
            this.M = ResourceUtil.IActionListener(di2.U);
            try {
                object = new DataInputStream(ad.a(string2));
                this.O = new int[((DataInputStream)object).readShort()][];
                int n3 = 0;
                while (n3 < this.O.length) {
                    this.O[n3] = new int[4];
                    this.O[n3][0] = ((DataInputStream)object).readShort();
                    this.O[n3][1] = ((DataInputStream)object).readShort();
                    this.O[n3][2] = ((DataInputStream)object).readShort();
                    this.O[n3][3] = ((DataInputStream)object).readShort();
                    int n4 = this.O[n3][3];
                    di2 = this;
                    this.L = n4;
                    ++n3;
                }
                return;
            }
            catch (Exception exception) {
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            System.out.println("paht data:" + string);
            return;
        }
    }

    public final int a() {
        return this.L;
    }

    public final int a(String string) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < string.length()) {
            int n4 = this.N.indexOf(string.charAt(n3));
            if (n4 == -1) {
                n4 = 0;
            }
            n2 += this.O[n4][2] + this.K;
            ++n3;
        }
        return n2;
    }

    public final void a(MGraphics en2, String string, int n2, int n3, int n4) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        int n6 = 0;
        while (n6 < n5) {
            n2 = this.N.indexOf(string.charAt(n6));
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 >= 0) {
                en2.a(this.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3, 20);
            }
            n4 += this.O[n2][2] + this.K;
            ++n6;
        }
    }

    public final void a(MGraphics en2, String string, int n2, int n3, int n4, mFont di2) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        int n6 = 0;
        while (n6 < n5) {
            n2 = this.N.indexOf(string.charAt(n6));
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 >= 0) {
                if (!main.GameCanvas.a) {
                    en2.a(di2.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4 + 1, n3, 20);
                    en2.a(di2.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3 + 1, 20);
                }
                en2.a(this.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3, 20);
            }
            n4 += this.O[n2][2] + this.K;
            ++n6;
        }
    }

    public final String[] a(String object, int n2) {
        int n3 = n2;
        String[] stringArray = object;
        object = this;
        LoggingList el2 = new LoggingList("vLine");
        String string = "";
        int n4 = 0;
        while (n4 < stringArray.length()) {
            if (stringArray.charAt(n4) == '\n' || stringArray.charAt(n4) == '\r') {
                el2.addElement(string);
                string = "";
            } else {
                if (((mFont)object).a(string = String.valueOf(string) + stringArray.charAt(n4)) > n3) {
                    int n5 = string.length() - 1;
                    while (n5 >= 0) {
                        if (string.charAt(n5) == ' ') break;
                        --n5;
                    }
                    if (n5 < 0) {
                        n5 = string.length() - 1;
                    }
                    el2.addElement(string.substring(0, n5));
                    n4 = n4 - (string.length() - n5) + 1;
                    string = "";
                }
                if (n4 == stringArray.length() - 1 && !string.trim().equals("")) {
                    el2.addElement(string);
                }
            }
            ++n4;
        }
        object = el2;
        stringArray = new String[((Vector)object).size()];
        n3 = 0;
        while (n3 < ((Vector)object).size()) {
            stringArray[n3] = ((Vector)object).elementAt(n3).toString();
            ++n3;
        }
        return stringArray;
    }

    public final void IActionListener(MGraphics en2, String string, int n2, int n3, int n4) {
        this.a(en2, string, n2, n3, 2);
    }

    public final void IActionListener(MGraphics en2, String string, int n2, int n3, int n4, mFont di2) {
        this.a(en2, string, n2, n3, n4, di2);
    }
}

