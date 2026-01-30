/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class CountdownDialog
implements IActionListener {
    public Command a;
    private Command IActionListener;
    private String[] c;
    private int d;
    private int e;
    private int f = 120;
    private int UIPanel;
    private int h;
    private long i;
    private long j;

    public final void a(String string, Command de2, Command de3) {
        this.c = new String[]{string};
        this.g = 29;
        this.a = de2;
        this.b = de3;
        this.a.UIPanel = this.b.UIPanel = GameScreen.bo;
        this.a.h = this.b.h = GameScreen.bp;
        this.a.ResourceUtil = MGraphics.a(de2.UIPanel);
        this.b.ResourceUtil = MGraphics.a(de2.UIPanel);
        this.a.m = MGraphics.IActionListener(de2.UIPanel);
        this.b.m = MGraphics.IActionListener(de2.UIPanel);
        this.i = System.currentTimeMillis();
        this.h = this.c[0].length() / 3;
        if (this.h < 15) {
            this.h = 15;
        }
        ag.a();
    }

    public final void a(MGraphics en2) {
        bo.a(en2, this.d, this.e, this.f, this.g + (!main.GameCanvas.e ? 10 : 0), 0xFFFFFF, false);
        if (this.c != null) {
            ag.a(en2, this.c[0], this.d + 5, this.e + this.g / 2 - (main.GameCanvas.e ? 4 : 6), this.f - 10, this.g, mFont.k);
            if (main.GameCanvas.e) {
                this.a.a(en2);
                mFont.n.a(en2, String.valueOf(this.h), this.a.j + this.a.ResourceUtil / 2, this.a.k + this.a.m + 5, 2, mFont.o);
                return;
            }
            if (cd.UIPanel) {
                mFont.IActionListener.a(en2, String.valueOf(GameStrings.cK) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
                return;
            }
            mFont.IActionListener.a(en2, String.valueOf(GameStrings.cL) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
        }
    }

    public final void a() {
        if (this.c != null) {
            this.d = main.GameCanvas.A - 5 - this.f;
            this.e = 45;
            if (main.GameCanvas.A - 50 > 155 + this.f) {
                this.d = main.GameCanvas.A - 55 - this.f;
                this.e = 5;
            }
            this.a.j = this.d - 35;
            this.a.k = this.e;
            this.j = System.currentTimeMillis();
            MathUtil.c("curr - last= " + (this.j - this.i));
            if (this.j - this.i >= 1000L) {
                this.i = System.currentTimeMillis();
                --this.h;
            }
            if (this.h == 0) {
                GameScreen.j().bQ = null;
            }
        }
    }

    public final void a(int n2, Object object) {
    }
}

