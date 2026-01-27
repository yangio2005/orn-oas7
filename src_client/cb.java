import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class cb
implements b {
    public int LoginScreen;
    public int b;
    public int c;
    public String d;
    public long e;
    public String[] f;
    public byte g;
    public byte Item;
    private int m;
    public int i;
    public int j;
    public String[] k;
    public static MyVector Res = new MyVector("v Message");

    public static void methodLoginScreen(cb cb2, int n2, boolean bl2) {
        int n3 = 0;
        while (n3 < Res.size()) {
            cb cb3 = (cb)Res.elementAt(n3);
            if (cb3.LoginScreen == cb2.LoginScreen) {
                Res.removeElement(cb3);
                if (!bl2) {
                    Res.insertElementAt(cb2, n3);
                    return;
                }
                Res.insertElementAt(cb2, 0);
                return;
            }
            if (cb3.j != 0 && cb3.i == cb3.j) {
                Res.removeElement(cb3);
            }
            ++n3;
        }
        if (n2 == -1) {
            Res.addElement(cb2);
        } else {
            Res.insertElementAt(cb2, 0);
        }
        if (Res.size() > 20) {
            Res.removeElementAt(Res.size() - 1);
        }
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3) {
        mFont di2 = mFont.f;
        if (this.Item == 0) {
            di2 = mFont.LoginScreen;
        } else if (this.Item == 1) {
            di2 = mFont.Item;
        } else if (this.Item == 2) {
            di2 = mFont.g;
        }
        if (this.b == 0) {
            di2.LoginScreen(en2, this.d, n2 + 3, n3 + 1, 0);
            if (this.g == 0) {
                mFont.o.LoginScreen(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            } else {
                mFont.GameScreen.LoginScreen(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            }
            mFont.o.LoginScreen(en2, String.valueOf(ai.c(this.m)) + " " + T.dJ, n2 + GameCanvas.G.ag - 3, n3 + 1, 1);
        }
        if (this.b == 1) {
            di2.LoginScreen(en2, String.valueOf(this.d) + " (" + this.i + "/" + this.j + ")", n2 + 3, n3 + 1, 0);
            mFont.q.LoginScreen(en2, String.valueOf(T.cX) + " " + ai.c(this.m) + " " + T.dJ, n2 + 3, n3 + 11, 0);
        }
        if (this.b == 2) {
            di2.LoginScreen(en2, this.d, n2 + 3, n3 + 1, 0);
            mFont.q.LoginScreen(en2, T.dA, n2 + 3, n3 + 11, 0);
        }
    }

    public final void methodLoginScreen(int n2, Object object) {
    }

    public final void methodLoginScreen() {
        if (this.e != 0L) {
            this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
        }
    }
}

