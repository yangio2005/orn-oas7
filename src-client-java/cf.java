/*
 * Decompiled with CFR 0.152.
 */
final class cf
implements Runnable {
    private final String IActionListener;
    private int c;
    final NetworkService a;

    cf(NetworkService br2, String string, int n2) {
        this.a = br2;
        this.b = string;
        this.c = n2;
    }

    public final void run() {
        NetworkService.n = false;
        new Thread(new ct(this)).start();
        this.a.e = true;
        this.a.d = true;
        try {
            int n2 = this.c;
            String string = this.b;
            cf cf2 = this;
            NetworkService.a(cf2.a, new ay(string, n2));
            NetworkService.a(cf2.a, NetworkService.a(cf2.a).IActionListener());
            cf2.GameCanvas.a = NetworkService.a(cf2.a).c();
            cf2.a.UIPanel = new Thread(NetworkService.IActionListener(cf2.a));
            cf2.a.UIPanel.start();
            cf2.GameCanvas.f = new Thread(new s(cf2.a));
            cf2.GameCanvas.f.start();
            cf2.a.ResourceUtil = System.currentTimeMillis();
            NetworkService.a(cf2.a, new Message(-27));
            MathUtil.c("=======================> gui message cmd = -27 to server");
            cf2.GameCanvas.e = false;
            this.a.IActionListener.a(this.a.c);
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            if (NetworkService.n) {
                return;
            }
            if (this.a.IActionListener != null) {
                this.a.e();
            }
            return;
        }
    }
}

