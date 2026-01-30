/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class j
exteCharacterds n {
    private String[] e;
    public cd a;
    private int f = 40;

    public j() {
        if (main.GameCanvas.A <= 176) {
            this.f = 10;
        }
        this.a = new cd();
        this.a.a = this.f + 10;
        this.a.IActionListener = main.GameCanvas.B - Screen.cp - 43;
        this.a.c = main.GameCanvas.A - 2 * (this.f + 10);
        this.a.d = Screen.cp + 2;
        this.a.e = true;
        this.d = this.a.j;
    }

    public final void a(String object, Command de2, int n2) {
        this.a.a("");
        this.a.c(n2);
        this.e = mFont.t.a((String)object, main.GameCanvas.A - (this.f << 1));
        this.b = new Command(GameStrings.bj, main.GameCanvas.a(), 8882, null);
        this.c = de2;
        object = this;
        main.GameCanvas.K = object;
    }

    public final void a(MGraphics en2) {
        main.GameCanvas.M.a(en2, this.f, main.GameCanvas.B - 77 - Screen.cr, main.GameCanvas.A - (this.f << 1), 69, this.e);
        this.a.a(en2);
        super.a(en2);
    }

    public final void a(int n2) {
        this.a.a(n2);
        super.a(n2);
    }

    public final void a() {
        this.a.c();
        super.a();
    }
}

