/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class Session
implements db {
    private static Session o = new Session();
    private static Session GameScreen = new Session();
    private DataOutputStream q;
    public DataInputStream LoginScreen;
    public bd b;
    public boolean c = true;
    private ay r;
    public boolean d;
    public boolean e;
    private final dw SessionReceiver = new dw(this);
    private Thread MyHashtable;
    public Thread f;
    public Thread g;
    public int Item;
    public int i;
    boolean j;
    public byte[] k = null;
    private byte u;
    private byte v;
    long Res;
    public String m = "";
    private long w = 0L;
    public static boolean n;
    private static int x;

    public static Session LoginScreen() {
        return o;
    }

    public static Session b() {
        return GameScreen;
    }

    public final void c() {
        dw.LoginScreen(this.SessionReceiver).removeAllElements();
    }

    public final boolean d() {
        return this.d && this.r != null && this.r.LoginScreen != null && this.LoginScreen != null;
    }

    public final void methodLoginScreen(bd bd2) {
        this.b = bd2;
    }

    public final void methodLoginScreen(String string, int n2) {
        System.out.println(">>connect: " + string + ":" + n2);
        if (this.d || this.e) {
            return;
        }
        if (Res.currentTimeMillis() < this.w) {
            return;
        }
        this.w = Res.currentTimeMillis() + 50L;
        if (this.c) {
            ServerListScreen.MyHashtable = -1;
        }
        this.j = false;
        Session br2 = this;
        br2.f();
        this.MyHashtable = new Thread(new cf(this, string, n2));
        this.MyHashtable.start();
    }

    public final void methodLoginScreen(Message y2) {
        ++x;
        this.SessionReceiver.LoginScreen(y2);
        System.out.println("SEND MSG: " + y2.LoginScreen);
    }

    private synchronized void b(Message object) {
        System.out.println("DO SEND MSG: " + ((Message)object).LoginScreen);
        byte[] byArray = ((Message)object).LoginScreen();
        try {
            if (this.j) {
                byte by2 = this.LoginScreen(((Message)object).LoginScreen);
                this.q.writeByte(by2);
            } else {
                this.q.writeByte(((Message)object).LoginScreen);
            }
            if (byArray != null) {
                int n2;
                int n3 = byArray.length;
                if (this.j) {
                    n2 = this.LoginScreen((byte)(n3 >> 8));
                    this.q.writeByte(n2);
                    n3 = this.LoginScreen((byte)n3);
                    this.q.writeByte(n3);
                } else {
                    this.q.writeShort(n3);
                }
                if (this.j) {
                    n2 = 0;
                    while (n2 < byArray.length) {
                        byArray[n2] = this.LoginScreen(byArray[n2]);
                        ++n2;
                    }
                }
                ((OutputStream)this.q).write(byArray);
                this.Item += 5 + byArray.length;
            } else {
                this.q.writeShort(0);
                this.Item += 5;
            }
            this.q.flush();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private byte LoginScreen(byte by2) {
        byte by3 = this.v;
        this.v = (byte)(by3 + 1);
        by2 = (byte)(this.k[by3] & 0xFF ^ by2 & 0xFF);
        if (this.v >= this.k.length) {
            this.v = (byte)(this.v % this.k.length);
        }
        return by2;
    }

    public final void e() {
        this.f();
    }

    private void f() {
        this.k = null;
        this.u = 0;
        this.v = 0;
        try {
            this.d = false;
            this.e = false;
            if (this.r != null && this.r.LoginScreen != null) {
                this.r.LoginScreen();
            }
            this.r = null;
            if (this.q != null) {
                this.q.close();
            }
            this.q = null;
            if (this.LoginScreen != null) {
                this.LoginScreen.close();
            }
            this.LoginScreen = null;
            if (this.g != null) {
                this.g.interrupt();
            }
            this.g = null;
            if (this.f != null) {
                this.f.interrupt();
            }
            this.f = null;
            if (this.c) {
                ServerListScreen.MyHashtable = 0;
            }
            System.gc();
            MessageHandler.c = false;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    static ay LoginScreen(Session br2) {
        return br2.r;
    }

    static void methodLoginScreen(Session br2, ay ay2) {
        br2.r = ay2;
    }

    static void methodLoginScreen(Session br2, DataOutputStream dataOutputStream) {
        br2.q = dataOutputStream;
    }

    static dw b(Session br2) {
        return br2.SessionReceiver;
    }

    static void methodLoginScreen(Session br2, Message y2) {
        br2.b(y2);
    }

    static void c(Session br2) {
        br2.f();
    }

    static byte LoginScreen(Session br2, byte by2) {
        byte by3 = br2.u;
        br2.u = (byte)(by3 + 1);
        by2 = (byte)(br2.k[by3] & 0xFF ^ by2 & 0xFF);
        if (br2.u >= br2.k.length) {
            br2.u = (byte)(br2.u % br2.k.length);
        }
        return by2;
    }
}

