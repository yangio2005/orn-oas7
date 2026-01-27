/*
 * Decompiled with CFR 0.152.
 */
final class ct
implements Runnable {
    private cf LoginScreen;

    ct(cf cf2) {
        this.LoginScreen = cf2;
    }

    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException interruptedException) {}
        cf cf2 = this.LoginScreen;
        if (cf2.LoginScreen.e) {
            try {
                cf2 = this.LoginScreen;
                Session.LoginScreen(cf2.LoginScreen).LoginScreen();
            }
            catch (Exception exception) {}
            Session.n = true;
            cf2 = this.LoginScreen;
            this.LoginScreen.LoginScreen.e = false;
            cf2 = this.LoginScreen;
            this.LoginScreen.LoginScreen.d = false;
            cf cf3 = this.LoginScreen;
            cf2 = cf3;
            cf2 = this.LoginScreen;
            cf3.LoginScreen.b.b(cf2.LoginScreen.c);
        }
    }
}

