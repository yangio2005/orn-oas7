/*
 * Decompiled with CFR 0.152.
 */
final class cf
implements Runnable {
    private final String b;
    private int c;
    final Session LoginScreen;

    cf(Session br2, String string, int n2) {
        this.LoginScreen = br2;
        this.b = string;
        this.c = n2;
    }

    public final void run() {
        Session.n = false;
        new Thread(new ct(this)).start();
        this.LoginScreen.e = true;
        this.LoginScreen.d = true;
        try {
            int n2 = this.c;
            String string = this.b;
            cf cf2 = this;
            Session.LoginScreen(cf2.LoginScreen, new ay(string, n2));
            Session.LoginScreen(cf2.LoginScreen, Session.LoginScreen(cf2.LoginScreen).b());
            cf2.LoginScreen.LoginScreen = Session.LoginScreen(cf2.LoginScreen).c();
            cf2.LoginScreen.g = new Thread(Session.b(cf2.LoginScreen));
            cf2.LoginScreen.g.start();
            cf2.LoginScreen.f = new Thread(new SessionReceiver(cf2.LoginScreen));
            cf2.LoginScreen.f.start();
            cf2.LoginScreen.Res = System.currentTimeMillis();
            Session.LoginScreen(cf2.LoginScreen, new Message(-27));
            ds.c("=======================> gui message cmd = -27 to server");
            cf2.LoginScreen.e = false;
            this.LoginScreen.b.LoginScreen(this.LoginScreen.c);
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            if (Session.n) {
                return;
            }
            if (this.LoginScreen.b != null) {
                this.LoginScreen.e();
            }
            return;
        }
    }
}

