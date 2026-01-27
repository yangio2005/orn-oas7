/*
 * Decompiled with CFR 0.152.
 */
public final class dh
extends MyVector {
    public static dh LoginScreen = new dh("low");
    public static dh b = new dh("mid");
    public static dh c = new dh("mid2");
    public static dh d = new dh("hi");

    private void c() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null) {
                ch2.LoginScreen();
                if (ch2.b) {
                    this.removeElementAt(n2);
                }
            }
            --n2;
        }
    }

    public static void methodLoginScreen() {
        d.c();
        b.c();
        c.c();
        LoginScreen.c();
    }

    public final void methodLoginScreen(mGraphics en2) {
        int n2 = 0;
        while (n2 < this.size()) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null && !ch2.b) {
                ((ch)this.elementAt(n2)).LoginScreen(en2);
            }
            ++n2;
        }
    }

    private void d() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null) {
                ch2.b = true;
                this.removeElementAt(n2);
            }
            --n2;
        }
    }

    public static void b() {
        d.d();
        LoginScreen.d();
        b.d();
        c.d();
    }

    public static void methodLoginScreen(ch ch2) {
        d.addElement(ch2);
    }

    public static void b(ch ch2) {
        b.addElement(ch2);
    }

    public static void c(ch ch2) {
        c.addElement(ch2);
    }

    public static void d(ch ch2) {
        LoginScreen.addElement(ch2);
    }

    private dh(String string) {
        super(string);
    }
}

