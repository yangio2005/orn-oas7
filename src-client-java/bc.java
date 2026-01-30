/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class bc
exteCharacterds n {
    private String[] e;
    public boolean a;
    private int f;
    private int UIPanel = 35;
    private long h = -1L;

    public bc() {
        if (main.GameCanvas.A <= 176) {
            this.g = 10;
        }
        if (main.GameCanvas.A > 320) {
            this.g = 80;
        }
    }

    public final void IActionListener() {
        this.a(GameStrings.aC, null, null, null);
        main.GameCanvas.K = this;
        this.h = ResourceUtil.d() + 5000L;
    }

    public final void c() {
        main.GameCanvas.K = this;
        this.h = -1L;
    }

    public final void a(String string) {
        this.e = mFont.t.a(string, main.GameCanvas.A - ((this.g << 1) + 20));
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * mFont.t.a() + 20;
        }
    }

    public final void a(String string, Command de2, Command de3, Command de4) {
        this.e = mFont.t.a(string, main.GameCanvas.A - ((this.g << 1) + 20));
        this.b = de2;
        this.c = de3;
        this.d = de4;
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * mFont.t.a() + 20;
        }
        if (main.GameCanvas.e) {
            if (de2 != null) {
                this.b.j = main.GameCanvas.A / 2 - 68 - 5;
                this.b.k = main.GameCanvas.B - 50;
            }
            if (de4 != null) {
                this.d.j = main.GameCanvas.A / 2 + 5;
                this.d.k = main.GameCanvas.B - 50;
            }
            if (de3 != null) {
                this.c.j = main.GameCanvas.A / 2 - 35;
                this.c.k = main.GameCanvas.B - 50;
            }
        }
        this.a = false;
        this.h = -1L;
    }

    public final void a(MGraphics en2) {
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (x.c) {
            return;
        }
        int n2 = main.GameCanvas.B - this.f - 38;
        int n3 = main.GameCanvas.A - (this.g << 1);
        cx.a(this.g, n2, n3, this.f, en2);
        n2 = n2 + (this.f - this.e.length * mFont.t.a()) / 2 - 2;
        if (this.a) {
            main.GameCanvas.a(main.GameCanvas.C, (n2 += 8) - 12, en2);
        }
        n3 = 0;
        while (n3 < this.e.length) {
            mFont.f.a(en2, this.e[n3], main.GameCanvas.C, n2, 2);
            ++n3;
            n2 += mFont.t.a();
        }
        super.a(en2);
    }

    public final void a() {
        super.a();
        if (this.h != -1L && ResourceUtil.d() > this.h) {
            main.GameCanvas.h();
        }
    }
}

