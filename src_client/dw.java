/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class dw
implements Runnable {
    private final Vector LoginScreen;
    private Session b;

    public dw(Session br2) {
        this.b = br2;
        this.LoginScreen = new Vector();
    }

    public final void methodLoginScreen(Message y2) {
        this.LoginScreen.addElement(y2);
    }

    public final void run() {
        while (this.b.d) {
            Object object;
            try {
                if (this.b.j) {
                    while (this.LoginScreen.size() > 0) {
                        object = (Message)this.LoginScreen.elementAt(0);
                        this.LoginScreen.removeElementAt(0);
                        Session.LoginScreen(this.b, (Message)object);
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

    static Vector LoginScreen(dw dw2) {
        return dw2.LoginScreen;
    }
}

