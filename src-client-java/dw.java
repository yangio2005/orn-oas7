/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class dw
implements Runnable {
    private final Vector a;
    private NetworkService IActionListener;

    public dw(NetworkService br2) {
        this.b = br2;
        this.a = new Vector();
    }

    public final void a(Message y2) {
        this.a.addElement(y2);
    }

    public final void run() {
        while (this.b.d) {
            Object object;
            try {
                if (this.b.j) {
                    while (this.a.size() > 0) {
                        object = (Message)this.a.elementAt(0);
                        this.a.removeElementAt(0);
                        NetworkService.a(this.b, (Message)object);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (Exception exception) {}
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }

    static Vector a(dw dw2) {
        return dw2.a;
    }
}

