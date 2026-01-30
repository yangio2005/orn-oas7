/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public class Screen {
    public Command cm;
    public Command cn;
    public Command co;
    public static int cp;
    public static int cq;
    public static int cr;
    public static int cs;

    static {
        cq = 68;
        cr = 26;
        cs = -1;
    }

    public void IActionListener() {
        GameCanvas.f();
        a.UIPanel();
        a.E = this;
        GameCanvas.h.setFullScreenMode(true);
    }

    public void a(int n2) {
    }

    public void c() {
    }

    public void d() {
        if (GameCanvas.i[5] || Screen.a(a.E.cn)) {
            GameCanvas.i[5] = false;
            cs = -1;
            GameCanvas.m = false;
            if (this.cn != null) {
                this.cn.a();
            }
        }
        if (GameCanvas.i[12] || Screen.a(a.E.cm)) {
            GameCanvas.i[12] = false;
            cs = -1;
            GameCanvas.m = false;
            if (cq.IActionListener().IActionListener) {
                if (cq.IActionListener().d != null) {
                    cq.IActionListener().d.a();
                }
            } else if (this.cm != null) {
                this.cm.a();
            }
        }
        if (GameCanvas.i[13] || Screen.a(a.E.co)) {
            GameCanvas.i[13] = false;
            cs = -1;
            GameCanvas.m = false;
            if (cq.IActionListener().IActionListener) {
                if (cq.IActionListener().e != null) {
                    cq.IActionListener().e.a();
                    return;
                }
            } else if (this.co != null) {
                this.co.a();
            }
        }
    }

    public static boolean a(Command de2) {
        if (de2 == null) {
            return false;
        }
        if (de2.j >= 0 && de2.k != 0) {
            return de2.c();
        }
        if (a.K != null) {
            if (a.K.c != null && GameCanvas.a(a.A - cq >> 1, a.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (de2 == a.K.c && a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
            if (a.K.IActionListener != null && GameCanvas.a(0, a.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (de2 == a.K.IActionListener && a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
            if (a.K.d != null && GameCanvas.a(a.A - cq, a.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if ((de2 == a.K.d || de2 == cq.IActionListener().e) && a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
        } else {
            if (de2 == a.E.cm && GameCanvas.a(0, a.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
            if (de2 == a.E.co && GameCanvas.a(a.A - cq, a.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if (a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
            if ((de2 == a.E.cn || ae.m != null) && GameCanvas.a(a.A - cq >> 1, a.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (a.ResourceUtil && GameCanvas.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, 0, a.A, a.B + 1);
        if (!cq.IActionListener().IActionListener && a.K == null && !a.F.a) {
            cx.a(en2, this.cm, this.cn, this.co);
        }
    }
}

