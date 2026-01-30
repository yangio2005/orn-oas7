/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class em
extends Screen {
    private static int c;
    private boolean d = false;
    private static int e;
    private static int f;
    public static em a;
    public static Image IActionListener;

    static {
        e = -1;
        f = -1;
        IActionListener = ResourceUtil.IActionListener("/gamelogo.png");
    }

    public em() {
        a = this;
    }

    public static void a() {
        c = 0;
    }

    public final void c() {
        if (++c == 30 && !this.d) {
            this.d = true;
            if (RMSManager.d("serverchat") != -1) {
                boolean bl2 = GameScreen.bV = RMSManager.d("serverchat") == 0;
            }
            if (RMSManager.d("isPlaySound") != -1) {
                boolean bl3 = main.GameCanvas.aj = RMSManager.d("isPlaySound") == 1;
            }
            if (main.GameCanvas.aj) {
                SettingsManager.a();
            }
            SettingsManager.a();
            SettingsManager.UIPanel();
            bs.f();
        }
        if (c >= 150) {
            if (NetworkService.a().d()) {
                bs.u = true;
            } else {
                ResourceUtil.IActionListener(true);
                if (main.GameCanvas.ak == null) {
                    main.GameCanvas.ak = new bs();
                }
            }
            main.GameCanvas.ak.IActionListener();
        }
        bs.e();
    }

    public static void e() {
        MathUtil.IActionListener(">>>>>loadIP:  svselect == " + RMSManager.d(bs.w));
        bs.a(RMSManager.d(bs.w), false);
        if (bs.n == -1) {
            MathUtil.IActionListener(">>>loadIP:  svselect == -1");
            bs.a(bs.IActionListener, true);
        }
        bs.k();
    }

    public final void a(MGraphics en2) {
        if (IActionListener != null && c < 30) {
            en2.a(0xFFFFFF);
            en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            en2.a(IActionListener, main.GameCanvas.A / 2, main.GameCanvas.B / 2, 3);
        }
        if (e != -1) {
            en2.a(0);
            en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            en2.a(x.j, main.GameCanvas.A / 2, main.GameCanvas.B / 2 - 24, cj.c);
            main.GameCanvas.a(main.GameCanvas.C, main.GameCanvas.B / 2 + 24, en2);
            mFont.c.a(en2, String.valueOf(GameStrings.aE) + e * 100 / f + "%", main.GameCanvas.A / 2, main.GameCanvas.B / 2, 2);
            return;
        }
        if (c >= 30) {
            en2.a(0);
            en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            main.GameCanvas.a(main.GameCanvas.C, main.GameCanvas.D, en2);
            bs.IActionListener(en2);
        }
    }

    public static void f() {
        IActionListener = ResourceUtil.IActionListener("/gamelogo.png");
    }
}

