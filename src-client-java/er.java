/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class er
extends Screen
implements IActionListener {
    private static er IActionListener;
    public cd[] a;
    private int c;
    private int d;
    private int e;
    private int f;
    private String[] UIPanel;
    private String h;
    private cq i;
    private int j;
    private int k;

    public static er a() {
        if (IActionListener == null) {
            IActionListener = new er();
        }
        return IActionListener;
    }

    public final void IActionListener() {
        if (ResourceUtil.c == 5 && this.a.length == 1 || ResourceUtil.c == 3 && this.a.length == 1) {
            this.i = new cq();
            this.i.h = this.h;
            this.i.GameCanvas.i = this.a[0].f;
            this.i.UIPanel = "";
            this.i.IActionListener = true;
            this.i.GameCanvas.c(0);
            if (main.GameCanvas.e) {
                return;
            }
        } else {
            this.j = 0;
            super.IActionListener();
        }
    }

    public final void a(int n2, String string) {
        this.k = n2;
        er er2 = this;
        this.h = string;
        er2.e = main.GameCanvas.A - 20;
        if (er2.e > 320) {
            er2.e = 320;
        }
        MathUtil.c("title= " + string);
        er2.UIPanel = mFont.f.a(string, er2.e - 20);
        er2.c = (main.GameCanvas.A - er2.e) / 2;
        er2.a = new cd[er2.k];
        er2.f = er2.GameCanvas.length * 35 + (er2.UIPanel.length - 1) * 20 + 40;
        er2.d = main.GameCanvas.B - er2.f - 40 - (er2.UIPanel.length - 1) * 20;
        int n3 = 0;
        while (n3 < er2.GameCanvas.length) {
            er2.a[n3] = new cd();
            er2.a[n3].i = "";
            er2.a[n3].a = er2.c + 10;
            er2.a[n3].IActionListener = er2.d + 35 + (er2.UIPanel.length - 1) * 20 + n3 * 35;
            er2.a[n3].c = er2.e - 20;
            er2.a[n3].d = Screen.cp + 2;
            er2.a[0].e = !main.GameCanvas.e;
            if (!main.GameCanvas.e) {
                er2.co = er2.a[0].j;
            }
            ++n3;
        }
        er2.cm = new Command(GameStrings.bj, er2, 1, null);
        er2.cn = new Command(GameStrings.bs, er2, 2, null);
        if (main.GameCanvas.e) {
            er2.cn.j = main.GameCanvas.A / 2 + 18;
            er2.cm.j = main.GameCanvas.A / 2 - 85;
            er2.cn.k = er2.cm.k = er2.d + er2.f + 5;
        }
        this.b();
    }

    public final void a(MGraphics en2) {
        GameScreen.j().a(en2);
        bo.a(en2, this.c, this.d, this.e, this.f, -1, true);
        int n2 = 0;
        while (n2 < this.g.length) {
            mFont.UIPanel.a(en2, this.g[n2], main.GameCanvas.A / 2, this.d + 15 + n2 * 20, 2);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].a(en2);
            ++n2;
        }
        super.a(en2);
    }

    public final void c() {
        GameScreen.j().c();
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].c();
            ++n2;
        }
    }

    public final void a(int n2) {
        int n3 = 0;
        while (n3 < this.a.length) {
            if (this.a[n3].e) {
                this.a[n3].a(n2);
                break;
            }
            ++n3;
        }
        super.a(n2);
    }

    public final void d() {
        if (main.GameCanvas.i[2]) {
            --this.j;
            if (this.j < 0) {
                this.j = this.a.length - 1;
            }
        } else if (main.GameCanvas.i[8]) {
            ++this.j;
            if (this.j > this.a.length - 1) {
                this.j = 0;
            }
        }
        if (main.GameCanvas.i[2] || main.GameCanvas.i[8]) {
            main.GameCanvas.f();
            int n2 = 0;
            while (n2 < this.a.length) {
                if (this.j == n2) {
                    this.a[n2].e = true;
                    if (!main.GameCanvas.e) {
                        this.co = this.a[n2].j;
                    }
                } else {
                    this.a[n2].e = false;
                }
                if (main.GameCanvas.m && main.GameCanvas.a(this.a[n2].a, this.a[n2].IActionListener, this.a[n2].c, this.a[n2].d)) {
                    this.j = n2;
                    break;
                }
                ++n2;
            }
        }
        super.d();
        main.GameCanvas.f();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            GameScreen.c.IActionListener();
            IActionListener = null;
        }
        if (n2 == 2) {
            if (ResourceUtil.c == 5 && this.a.length == 1 || ResourceUtil.c == 3 && this.a.length == 1) {
                if (this.i.GameCanvas.d() == null || this.i.GameCanvas.d().equals("")) {
                    main.GameCanvas.a(GameStrings.gj);
                    return;
                }
                this.a[0].a(this.i.GameCanvas.d());
                GameService.a().a(this.a);
                GameScreen.c.IActionListener();
                return;
            }
            n2 = 0;
            while (n2 < this.a.length) {
                if (this.a[n2].d() == null || this.a[n2].d().equals("")) {
                    main.GameCanvas.a(GameStrings.gj);
                    return;
                }
                ++n2;
            }
            GameService.a().a(this.a);
            GameScreen.c.IActionListener();
        }
    }
}

