import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

final class dj
implements Runnable {
    private int LoginScreen;
    private boolean b;
    private ar c;

    dj(ar ar2) {
        this.c = ar2;
        this.LoginScreen = 0;
        this.b = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            while (ar.d) {
                block8: {
                    if (GameCanvas.currentScreen != ar.LoginScreen) {
                        return;
                    }
                    this.c.c = 2;
                    while (true) {
                        if (this.LoginScreen >= 7 || this.c.b == 5) {
                            if (this.LoginScreen == 7) {
                                Thread.sleep(800L);
                                ar.LoginScreen(ar.LoginScreen());
                                Thread.sleep(4000L);
                                if (!ar.e) break;
                                this.c.e();
                                Thread.yield();
                                return;
                            }
                            break block8;
                        }
                        ar.LoginScreen(this.c, this.LoginScreen);
                        ++this.LoginScreen;
                        Thread.sleep(300L);
                    }
                    if (this.c.b == 5) {
                        ar.LoginScreen(ar.LoginScreen());
                        this.LoginScreen = 0;
                    }
                    Thread.sleep(1000L);
                }
                if (this.c.b != 5 || this.LoginScreen != 0 || this.b) continue;
                this.b = true;
                ar.LoginScreen(ar.LoginScreen());
            }
            return;
        }
        catch (Exception exception) {}
    }
}

