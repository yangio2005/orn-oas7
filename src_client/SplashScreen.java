/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

import main.GameCanvas;
public final class SplashScreen
extends Screen {
    private static int c;
    private boolean d = false;
    private static int e;
    private static int f;
    public static SplashScreen LoginScreen;
    public static Image b;

    static {
        e = -1;
        f = -1;
        b = Res.loadImage("/gamelogo.png");
    }

    public SplashScreen() {
        LoginScreen = this;
    }

    public static void methodLoginScreen() {
        c = 0;
    }

    public final void c() {
        if (++c == 30 && !this.d) {
            this.d = true;
            if (RMS.d("serverchat") != -1) {
                boolean bl2 = GameScreen.bV = RMS.d("serverchat") == 0;
            }
            if (RMS.d("isPlaySound") != -1) {
                boolean bl3 = GameCanvas.aj = RMS.d("isPlaySound") == 1;
            }
            if (GameCanvas.aj) {
                bu.LoginScreen();
            }
            bu.LoginScreen();
            bu.g();
            ServerListScreen.f();
        }
        if (c >= 150) {
            if (Session.LoginScreen().d()) {
                ServerListScreen.u = true;
            } else {
                Res.loadImage(true);
                if (GameCanvas.ak == null) {
                    GameCanvas.ak = new ServerListScreen();
                }
            }
            GameCanvas.ak.b();
        }
        ServerListScreen.e();
    }

    public static void e() {
        ds.b(">>>>>loadIP:  svselect == " + RMS.d(ServerListScreen.w));
        ServerListScreen.LoginScreen(RMS.d(ServerListScreen.w), false);
        if (ServerListScreen.n == -1) {
            ds.b(">>>loadIP:  svselect == -1");
            ServerListScreen.LoginScreen(ServerListScreen.b, true);
        }
        ServerListScreen.k();
    }

    public final void methodLoginScreen(mGraphics en2) {
        if (b != null && c < 30) {
            en2.LoginScreen(0xFFFFFF);
            en2.d(0, 0, GameCanvas.A, GameCanvas.B);
            en2.LoginScreen(b, GameCanvas.A / 2, GameCanvas.B / 2, 3);
        }
        if (e != -1) {
            en2.LoginScreen(0);
            en2.d(0, 0, GameCanvas.A, GameCanvas.B);
            en2.LoginScreen(x.j, GameCanvas.A / 2, GameCanvas.B / 2 - 24, cj.c);
            GameCanvas.isLowGraphic(GameCanvas.C, GameCanvas.B / 2 + 24, en2);
            mFont.c.LoginScreen(en2, String.valueOf(T.aE) + e * 100 / f + "%", GameCanvas.A / 2, GameCanvas.B / 2, 2);
            return;
        }
        if (c >= 30) {
            en2.LoginScreen(0);
            en2.d(0, 0, GameCanvas.A, GameCanvas.B);
            GameCanvas.isLowGraphic(GameCanvas.C, GameCanvas.D, en2);
            ServerListScreen.b(en2);
        }
    }

    public static void f() {
        b = Res.loadImage("/gamelogo.png");
    }
}

