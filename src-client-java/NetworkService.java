/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class NetworkService
implements IMessageHandler {
    private static NetworkService o = new NetworkService();
    private static NetworkService GameScreen = new NetworkService();
    private DataOutputStream q;
    public DataInputStream a;
    public IConnectionListener IActionListener;
    public boolean c = true;
    private ay r;
    public boolean d;
    public boolean e;
    private final dw s = new dw(this);
    private Thread t;
    public Thread f;
    public Thread UIPanel;
    public int h;
    public int i;
    boolean j;
    public byte[] k = null;
    private byte u;
    private byte v;
    long ResourceUtil;
    public String m = "";
    private long w = 0L;
    public static boolean n;
    private static int x;

    public static NetworkService a() {
        return o;
    }

    public static NetworkService IActionListener() {
        return GameScreen;
    }

    public final void c() {
        dw.a(this.s).removeAllElements();
    }

    public final boolean d() {
        return this.d && this.r != null && this.r.a != null && this.a != null;
    }

    public final void a(IConnectionListener bd2) {
        this.b = bd2;
    }

    public final void a(String string, int n2) {
        System.out.println(">>connect: " + string + ":" + n2);
        if (this.d || this.e) {
            return;
        }
        if (ResourceUtil.d() < this.w) {
            return;
        }
        this.w = ResourceUtil.d() + 50L;
        if (this.c) {
            bs.t = -1;
        }
        this.j = false;
        NetworkService br2 = this;
        br2.f();
        this.t = new Thread(new cf(this, string, n2));
        this.t.start();
    }

    public final void a(Message y2) {
        ++x;
        this.s.a(y2);
        System.out.println("SEND MSG: " + y2.a);
    }

    private synchronized void IActionListener(Message object) {
        System.out.println("DO SEND MSG: " + ((Message)object).a);
        byte[] byArray = ((Message)object).a();
        try {
            if (this.j) {
                byte by2 = this.a(((Message)object).a);
                this.q.writeByte(by2);
            } else {
                this.q.writeByte(((Message)object).a);
            }
            if (byArray != null) {
                int n2;
                int n3 = byArray.length;
                if (this.j) {
                    n2 = this.a((byte)(n3 >> 8));
                    this.q.writeByte(n2);
                    n3 = this.a((byte)n3);
                    this.q.writeByte(n3);
                } else {
                    this.q.writeShort(n3);
                }
                if (this.j) {
                    n2 = 0;
                    while (n2 < byArray.length) {
                        byArray[n2] = this.a(byArray[n2]);
                        ++n2;
                    }
                }
                ((OutputStream)this.q).write(byArray);
                this.h += 5 + byArray.length;
            } else {
                this.q.writeShort(0);
                this.h += 5;
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

    private byte a(byte by2) {
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
            if (this.r != null && this.r.a != null) {
                this.r.a();
            }
            this.r = null;
            if (this.q != null) {
                this.q.close();
            }
            this.q = null;
            if (this.a != null) {
                this.a.close();
            }
            this.a = null;
            if (this.g != null) {
                this.g.interrupt();
            }
            this.g = null;
            if (this.f != null) {
                this.f.interrupt();
            }
            this.f = null;
            if (this.c) {
                bs.t = 0;
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

    static ay a(NetworkService br2) {
        return br2.r;
    }

    static void a(NetworkService br2, ay ay2) {
        br2.r = ay2;
    }

    static void a(NetworkService br2, DataOutputStream dataOutputStream) {
        br2.q = dataOutputStream;
    }

    static dw IActionListener(NetworkService br2) {
        return br2.s;
    }

    static void a(NetworkService br2, Message y2) {
        br2.IActionListener(y2);
    }

    static void c(NetworkService br2) {
        br2.f();
    }

    static byte a(NetworkService br2, byte by2) {
        byte by3 = br2.u;
        br2.u = (byte)(by3 + 1);
        by2 = (byte)(br2.k[by3] & 0xFF ^ by2 & 0xFF);
        if (br2.u >= br2.k.length) {
            br2.u = (byte)(br2.u % br2.k.length);
        }
        return by2;
    }
}

