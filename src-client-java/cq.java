/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class cq
implements IActionListener {
    private static cq i;
    public cd a;
    public boolean IActionListener = false;
    public bx c;
    private long j = 0L;
    public Command d;
    public Command e;
    public Command f = null;
    private int k;
    private int ResourceUtil;
    private int m;
    private int n;
    public String UIPanel;
    public String h = String.valueOf(GameStrings.bq) + " ";

    public final void a() {
        this.d = new Command(GameStrings.bs, this, 8000, null, 1, main.GameCanvas.B - Screen.cr + 1);
        this.e = new Command(GameStrings.bk, this, 8001, null, main.GameCanvas.A - 70, main.GameCanvas.B - Screen.cr + 1);
        this.f = null;
        this.m = this.a.c + 28;
        this.n = this.a.d + 26;
        this.k = main.GameCanvas.A / 2 - this.m / 2;
        this.l = this.a.IActionListener - 18;
        if (this.m > 320) {
            this.m = 320;
        }
        this.d.j = this.k;
        this.e.j = this.k + this.m - 68;
        if (main.GameCanvas.e) {
            this.a.IActionListener -= 5;
            this.l -= 20;
            this.n += 30;
            this.d.j = main.GameCanvas.A / 2 - 68 - 5;
            this.e.j = main.GameCanvas.A / 2 + 5;
            this.d.k = main.GameCanvas.B - 30;
            this.e.k = main.GameCanvas.B - 30;
        }
    }

    public final void a(int n2) {
        if (this.b) {
            this.a.a(n2);
        }
        if (this.a.d().equals("")) {
            this.e.IActionListener = GameStrings.bj;
            return;
        }
        this.e.IActionListener = GameStrings.bk;
    }

    public static cq IActionListener() {
        if (i == null) {
            i = new cq();
            return i;
        }
        return i;
    }

    public cq() {
        this.a = new cd();
        this.a.i = GameStrings.bq;
        this.a.c = main.GameCanvas.A - 32;
        if (this.a.c > 250) {
            this.a.c = 250;
        }
        this.a.d = Screen.cp + 2;
        this.a.a = main.GameCanvas.A / 2 - this.a.c / 2;
        this.a.e = true;
        this.a.IActionListener(80);
    }

    public final void a(int n2, bx bx2, String string) {
        this.e.IActionListener = GameStrings.bj;
        this.g = string;
        this.a.a(n2);
        if (!this.a.d().equals("") && main.GameCanvas.K == null) {
            this.c = bx2;
            this.b = true;
        }
    }

    public final void a(String string) {
        this.e.IActionListener = GameStrings.bj;
        this.g = string;
        if (main.GameCanvas.K == null) {
            this.b = true;
            if (main.GameCanvas.e) {
                this.a.a();
            }
        }
    }

    public final void c() {
        if (!this.b) {
            return;
        }
        if (ResourceUtil.c != 5 && ResourceUtil.c != 3) {
            this.a.c();
        }
        if (this.a.h) {
            this.a.h = false;
            this.c.a(this.a.d(), this.g);
            this.a.a("");
            this.e.IActionListener = GameStrings.bj;
        }
    }

    public final void a(MGraphics en2) {
        if (!this.b) {
            return;
        }
        if (ResourceUtil.c == 5 || ResourceUtil.c == 3) {
            return;
        }
        bo.a(en2, this.k, this.l, this.m, this.n, -1, true);
        mFont.UIPanel.a(en2, String.valueOf(this.h) + this.g, this.a.a, this.a.IActionListener - (main.GameCanvas.e ? 17 : 12), 0);
        cx.a(en2, this.d, this.f, this.e);
        this.a.a(en2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                MathUtil.c("perform chat 1");
                if (this.c == null) break;
                long l2 = System.currentTimeMillis();
                if (l2 - this.j < 1000L) {
                    return;
                }
                this.j = l2;
                this.c.a(this.a.d(), this.g);
                this.a.a("");
                this.e.IActionListener = GameStrings.bj;
                return;
            }
            case 8001: {
                MathUtil.c("perform chat 2");
                if (this.a.d().equals("")) {
                    this.b = false;
                    this.c.D();
                }
                this.a.IActionListener();
            }
        }
    }
}

