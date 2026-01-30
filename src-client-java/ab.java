/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class ab
extends Screen
implements IActionListener {
    private Command[] IActionListener;
    public static bg[] a;
    private int c;
    private int[] d = new int[]{main.GameCanvas.A / 2 - 100, main.GameCanvas.A / 2 - 100};
    private int e = 0;
    private int[] f = new int[2];
    private int[] UIPanel = new int[]{main.GameCanvas.A / 2 - 150, main.GameCanvas.B / 2 - 100, 300, 200};
    private int h = -35;
    private int i = -35;

    public final void IActionListener() {
        bs.c = false;
        GameWorld.bI = false;
        x.c = false;
        bs.m = false;
        GameScreen.j().a();
        super.IActionListener();
    }

    public final void c() {
        this.c = main.GameCanvas.w % 10 > 2 ? 1 : 0;
        int n2 = 0;
        while (n2 < this.b.length) {
            if (this.b[n2].c()) {
                this.b[n2].a();
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.length) {
            if (main.GameCanvas.a(this.d[n2] + this.i, this.f[n2] + this.h, this.g[2], 60) && main.GameCanvas.k) {
                this.e = n2;
                break;
            }
            ++n2;
        }
        super.c();
    }

    public final void a(MGraphics en2) {
        main.GameCanvas.c(en2);
        try {
            int n2;
            bo.a(en2, this.g[0] - 10, this.g[1], this.g[2] + 20, this.g[3], 0xFFFFFF, true);
            if (this.b != null) {
                n2 = 0;
                while (n2 < this.b.length) {
                    this.b[n2].a(en2);
                    ++n2;
                }
            }
            if (a != null) {
                n2 = 0;
                while (n2 < GameCanvas.length) {
                    bo.a(en2, this.d[n2] - 20, this.f[n2] + this.h, this.g[2], 60, 0xFFFFFF, false);
                    RMSManager av2 = GameScreen.x[ab.a[n2].c];
                    RMSManager av3 = GameScreen.x[ab.a[n2].e];
                    RMSManager av4 = GameScreen.x[ab.a[n2].d];
                    bl.IActionListener(en2, av2.a[GameWorld.bC[this.c][0][0]].a, this.d[n2] + GameWorld.bC[this.c][0][1] + av2.a[GameWorld.bC[this.c][0][0]].IActionListener, this.f[n2] - GameWorld.bC[this.c][0][2] + av2.a[GameWorld.bC[this.c][0][0]].c, 0, 0);
                    bl.IActionListener(en2, av3.a[GameWorld.bC[this.c][1][0]].a, this.d[n2] + GameWorld.bC[this.c][1][1] + av3.a[GameWorld.bC[this.c][1][0]].IActionListener, this.f[n2] - GameWorld.bC[this.c][1][2] + av3.a[GameWorld.bC[this.c][1][0]].c, 0, 0);
                    bl.IActionListener(en2, av4.a[GameWorld.bC[this.c][2][0]].a, this.d[n2] + GameWorld.bC[this.c][2][1] + av4.a[GameWorld.bC[this.c][2][0]].IActionListener, this.f[n2] - GameWorld.bC[this.c][2][2] + av4.a[GameWorld.bC[this.c][2][0]].c, 0, 0);
                    if (this.e == n2) {
                        mFont.d.a(en2, ab.a[n2].IActionListener, this.d[n2] + this.g[2] - 25, this.f[n2] + this.h, 1);
                        mFont.d.a(en2, String.valueOf(GameStrings.Command) + " " + MathUtil.IActionListener(ab.a[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.h + mFont.d.a(), 1);
                    } else {
                        mFont.f.a(en2, ab.a[n2].IActionListener, this.d[n2] + this.g[2] - 25, this.f[n2] + this.h, 1);
                        mFont.f.a(en2, String.valueOf(GameStrings.Command) + " " + MathUtil.IActionListener(ab.a[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.h + mFont.f.a(), 1);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {}
        super.a(en2);
    }

    public final void a(byte n2) {
        this.d = new int[n2];
        this.f = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.d[n3] = this.g[0] + 20;
            this.f[n3] = n3 * 70 + this.g[1] + 50;
            ++n3;
        }
        this.b = new Command[2];
        this.b[1] = new Command("V\u00e0o game", this, 1, null, this.g[0] + this.g[2] - 80 - 80, this.g[1] + this.g[3] - 30);
        this.b[0] = new Command("Tr\u1edd ra", this, 2, null, this.g[0] + this.g[2] - 80, this.g[1] + this.g[3] - 30);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                if (this.e == -1) break;
                main.GameCanvas.i();
                GameService.a().t(ab.a[this.e].a);
                return;
            }
            case 2: {
                main.GameCanvas.e();
            }
        }
    }
}

