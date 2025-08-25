import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class br implements db {
  private static br o = new br();
  
  private static br p = new br();
  
  private DataOutputStream q;
  
  public DataInputStream a;
  
  public bd b;
  
  public boolean c = true;
  
  private ay r;
  
  public boolean d;
  
  public boolean e;
  
  private final dw s = new dw(this);
  
  private Thread t;
  
  public Thread f;
  
  public Thread g;
  
  public int h;
  
  public int i;
  
  boolean j;
  
  public byte[] k = null;
  
  private byte u;
  
  private byte v;
  
  long l;
  
  public String m = "";
  
  private long w = 0L;
  
  public static boolean n;
  
  private static int x;
  
  public static br a() {
    return o;
  }
  
  public static br b() {
    return p;
  }
  
  public final void c() {
    dw.a(this.s).removeAllElements();
  }
  
  public final boolean d() {
    return (this.d && this.r != null && this.r.a != null && this.a != null);
  }
  
  public final void a(bd parambd) {
    this.b = parambd;
  }
  
  public final void a(String paramString, int paramInt) {
    System.out.println(">>connect: " + paramString + ":" + paramInt);
    if (this.d || this.e)
      return; 
    if (l.d() < this.w)
      return; 
    this.w = l.d() + 50L;
    if (this.c)
      bs.t = -1; 
    this.j = false;
    br br1;
    (br1 = this).f();
    this.t = new Thread(new cf(this, paramString, paramInt));
    this.t.start();
  }
  
  public final void a(y paramy) {
    x++;
    this.s.a(paramy);
  }
  
  private synchronized void b(y paramy) {
    System.out.println("DO SEND MSG: " + paramy.a);
    byte[] arrayOfByte = paramy.a();
    try {
      byte b;
      if (this.j) {
        b = a(paramy.a);
        this.q.writeByte(b);
      } else {
        this.q.writeByte(b.a);
      } 
      if (arrayOfByte != null) {
        int i = arrayOfByte.length;
        if (this.j) {
          byte b1 = a((byte)(i >> 8));
          this.q.writeByte(b1);
          i = a((byte)i);
          this.q.writeByte(i);
        } else {
          this.q.writeShort(i);
        } 
        if (this.j)
          for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
            arrayOfByte[b1] = a(arrayOfByte[b1]);  
        this.q.write(arrayOfByte);
        this.h += 5 + arrayOfByte.length;
      } else {
        this.q.writeShort(0);
        this.h += 5;
      } 
      this.q.flush();
      return;
    } catch (IOException iOException) {
      (paramy = null).printStackTrace();
      return;
    } 
  }
  
  private byte a(byte paramByte) {
    this.v = (byte)(this.v + 1);
    paramByte = (byte)(this.k[this.v] & 0xFF ^ paramByte & 0xFF);
    if (this.v >= this.k.length)
      this.v = (byte)(this.v % this.k.length); 
    return paramByte;
  }
  
  public final void e() {
    f();
  }
  
  private void f() {
    this.k = null;
    this.u = 0;
    this.v = 0;
    try {
      this.d = false;
      this.e = false;
      if (this.r != null && this.r.a != null)
        this.r.a(); 
      this.r = null;
      if (this.q != null)
        this.q.close(); 
      this.q = null;
      if (this.a != null)
        this.a.close(); 
      this.a = null;
      if (this.g != null)
        this.g.interrupt(); 
      this.g = null;
      if (this.f != null)
        this.f.interrupt(); 
      this.f = null;
      if (this.c)
        bs.t = 0; 
      System.gc();
      ac.c = false;
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  static ay a(br parambr) {
    return parambr.r;
  }
  
  static void a(br parambr, ay paramay) {
    parambr.r = paramay;
  }
  
  static void a(br parambr, DataOutputStream paramDataOutputStream) {
    parambr.q = paramDataOutputStream;
  }
  
  static dw b(br parambr) {
    return parambr.s;
  }
  
  static void a(br parambr, y paramy) {
    parambr.b(paramy);
  }
  
  static void c(br parambr) {
    parambr.f();
  }
  
  static byte a(br parambr, byte paramByte) {
    paramByte = paramByte;
    parambr.u = (byte)(parambr.u + 1);
    paramByte = (byte)((parambr = parambr).k[parambr.u] & 0xFF ^ paramByte & 0xFF);
    if (parambr.u >= parambr.k.length)
      parambr.u = (byte)(parambr.u % parambr.k.length); 
    return paramByte;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\br.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */