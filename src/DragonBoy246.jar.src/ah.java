import java.util.Random;
import main.a;

public final class ah extends dc {
  private int d;
  
  private by e;
  
  public static Random a = new Random(System.currentTimeMillis());
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private boolean l = false;
  
  private long m;
  
  private long n;
  
  private af o;
  
  private el p = new el("vDarts");
  
  private int q = 0;
  
  private int r = 0;
  
  private static int[] s = new int[] { 
      0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 
      217, 232, 255, 285, 307, 322, 345, 370 };
  
  public static final int[] b = new int[] { 
      0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 
      3, 4, 5, 5, 5, 1 };
  
  public static final byte[] c = new byte[] { 
      0, 1, 2, 1, 1, 2, 1, 1, 2, 1, 
      1, 2, 1, 1, 2, 1, 1, 2, 1 };
  
  public static void a(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2, af paramaf, int paramInt3) {
    dc.x.addElement(new ah(paramInt1, paramInt2, paramBoolean, paramLong1, paramLong2, paramaf, paramInt3));
  }
  
  private ah(int paramInt1, int paramInt2, boolean paramBoolean, long paramLong1, long paramLong2, af paramaf, int paramInt3) {
    this.e = p.w[paramInt3];
    this.i = paramInt1;
    this.j = paramInt2;
    this.m = paramLong1;
    this.n = paramLong2;
    this.o = paramaf;
    this.d = this.e.i;
    int i = ds.a(paramaf.B - paramInt1, paramaf.C - paramInt2);
    ah ah1;
    (ah1 = this).f = i;
    ah1.g = ah1.d * ds.b(i) >> 10;
    ah1.h = ah1.d * ds.a(i) >> 10;
    if (paramInt1 >= p.j && paramInt1 <= p.j + a.A)
      bu.a(); 
  }
  
  public final void a() {
    byte b;
    for (b = 0; b < this.e.h; b++) {
      if (this.e.c.length > 0)
        this.p.addElement(new dx(this.i, this.j)); 
      this.q = ((this.o != null) ? this.o.B : 0) - this.i;
      this.r = ((this.o != null) ? this.o.C : 0) - 10 - this.j;
      int i = 60;
      if (bv.l == 0)
        i = 600; 
      this.k++;
      if ((this.o != null && (this.o.H == 5 || this.o.H == 14)) || this.o == null) {
        this.i += (((this.o != null) ? this.o.B : 0) - this.i) / 2;
        this.j += (((this.o != null) ? this.o.C : 0) - this.j) / 2;
      } 
      if ((ds.g(this.q) < 16 && ds.g(this.r) < 16) || this.k > i) {
        if (this.o != null && this.o.J >= 0 && this.n != -1L)
          if (this.n != -100L) {
            this.o.a(this.m, this.n, false, true);
          } else {
            at.a(80, this.o, 1);
          }  
        dc.x.removeElement(this);
        if (this.n != -100L) {
          at.a(81, this.o, 1);
          if (this.i >= p.j && this.i <= p.j + a.A)
            bu.a(); 
        } 
      } 
      if (Math.abs((i = ds.a(this.q, this.r)) - this.f) < 90 || this.q * this.q + this.r * this.r > 4096)
        if (Math.abs(i - this.f) < 15) {
          this.f = i;
        } else if ((i - this.f >= 0 && i - this.f < 180) || i - this.f < -180) {
          this.f = ds.c(this.f + 15);
        } else {
          this.f = ds.c(this.f - 15);
        }  
      if (this.d < 8192)
        this.d += 1024; 
      this.g = this.d * ds.b(this.f) >> 10;
      this.h = this.d * ds.a(this.f) >> 10;
      this.q += this.g;
      i = this.q >> 10;
      this.i += i;
      this.q &= 0x3FF;
      this.r += this.h;
      i = this.r >> 10;
      this.j += i;
      this.r &= 0x3FF;
    } 
    for (b = 0; b < this.p.size(); b++) {
      dx dx;
      (dx = this.p.elementAt(b)).a++;
      if (dx.a >= this.e.c.length)
        this.p.removeElementAt(b); 
    } 
  }
  
  public static int a(int paramInt) {
    for (byte b = 0; b < s.length - 1; b++) {
      if (paramInt >= s[b] && paramInt <= s[b + 1])
        return (b >= 16) ? 0 : b; 
    } 
    return 0;
  }
  
  public final void a(en paramen) {
    int i = a(360 - this.f);
    byte b = c[i];
    i = b[i];
    int j;
    for (j = this.p.size() / 2; j < this.p.size(); j++) {
      dx dx = this.p.elementAt(j);
      bl.b(paramen, this.e.d[dx.a], dx.b, dx.c, 0, 3);
    } 
    j = a.w % this.e.b.length;
    bl.b(paramen, this.e.b[j][b], this.i, this.j, i, 3);
    byte b1;
    for (b1 = 0; b1 < this.p.size(); b1++) {
      dx dx = this.p.elementAt(b1);
      bl.b(paramen, this.e.c[dx.a], dx.b, dx.c, 0, 3);
    } 
    bl.b(paramen, this.e.a[j][b], this.i, this.j, i, 3);
    for (b1 = 0; b1 < this.p.size(); b1++) {
      dx dx = this.p.elementAt(b1);
      if (ds.g(a.nextInt(100)) < this.e.g)
        bl.b(paramen, (a.w % 2 == 0) ? this.e.e[dx.a] : this.e.f[dx.a], dx.b, dx.c, 0, 3); 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */