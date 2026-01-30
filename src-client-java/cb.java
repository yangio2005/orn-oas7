/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class cb
implements IActionListener {
    public int a;
    public int IActionListener;
    public int c;
    public String d;
    public long e;
    public String[] f;
    public byte UIPanel;
    public byte h;
    private int m;
    public int i;
    public int j;
    public String[] k;
    public static LoggingList ResourceUtil = new LoggingList("v Message");

    public static void a(cb cb2, int n2, boolean bl2) {
        int n3 = 0;
        while (n3 < ResourceUtil.size()) {
            cb cb3 = (cb)ResourceUtil.elementAt(n3);
            if (cb3.a == cb2.a) {
                ResourceUtil.removeElement(cb3);
                if (!bl2) {
                    ResourceUtil.insertElementAt(cb2, n3);
                    return;
                }
                ResourceUtil.insertElementAt(cb2, 0);
                return;
            }
            if (cb3.j != 0 && cb3.i == cb3.j) {
                ResourceUtil.removeElement(cb3);
            }
            ++n3;
        }
        if (n2 == -1) {
            ResourceUtil.addElement(cb2);
        } else {
            ResourceUtil.insertElementAt(cb2, 0);
        }
        if (ResourceUtil.size() > 20) {
            ResourceUtil.removeElementAt(ResourceUtil.size() - 1);
        }
    }

    public final void a(MGraphics en2, int n2, int n3) {
        mFont di2 = mFont.f;
        if (this.h == 0) {
            di2 = mFont.a;
        } else if (this.h == 1) {
            di2 = mFont.h;
        } else if (this.h == 2) {
            di2 = mFont.UIPanel;
        }
        if (this.b == 0) {
            di2.a(en2, this.d, n2 + 3, n3 + 1, 0);
            if (this.g == 0) {
                mFont.o.a(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            } else {
                mFont.GameScreen.a(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            }
            mFont.o.a(en2, String.valueOf(ai.c(this.m)) + " " + GameStrings.dJ, n2 + main.GameCanvas.G.ag - 3, n3 + 1, 1);
        }
        if (this.b == 1) {
            di2.a(en2, String.valueOf(this.d) + " (" + this.i + "/" + this.j + ")", n2 + 3, n3 + 1, 0);
            mFont.q.a(en2, String.valueOf(GameStrings.cX) + " " + ai.c(this.m) + " " + GameStrings.dJ, n2 + 3, n3 + 11, 0);
        }
        if (this.b == 2) {
            di2.a(en2, this.d, n2 + 3, n3 + 1, 0);
            mFont.q.a(en2, GameStrings.dA, n2 + 3, n3 + 11, 0);
        }
    }

    public final void a(int n2, Object object) {
    }

    public final void a() {
        if (this.e != 0L) {
            this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
        }
    }
}

