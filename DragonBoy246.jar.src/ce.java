import javax.microedition.lcdui.Image;
import main.a;

public final class ce implements bq {
  public int a;
  
  public int b;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  public int c;
  
  public int d;
  
  public dd e;
  
  private byte k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int[] r;
  
  private int[] s;
  
  private int[] t;
  
  private int[] u;
  
  private int v;
  
  private int w;
  
  public static Image f = l.b("/mainImage/myTexture2dflare.png");
  
  private static Image x = l.b("/mainImage/myTexture2ditemaura1.png");
  
  private static Image y = l.b("/mainImage/myTexture2ditemaura2.png");
  
  private static Image z = l.b("/mainImage/myTexture2ditemaura3.png");
  
  public ce(short paramShort1, short paramShort2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d = paramShort1;
    this.e = dp.a(paramShort2);
    this.a = paramInt3;
    this.b = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
    this.i = paramInt3 - paramInt1 >> 2;
    this.j = 5;
  }
  
  public ce(int paramInt1, short paramShort1, short paramShort2, int paramInt2, int paramInt3, short paramShort3) {
    this.d = paramShort1;
    this.e = dp.a(paramShort2);
    this.a = this.g = paramInt2;
    this.b = this.h = paramInt3;
    this.k = 1;
    this.c = paramInt1;
    if (b()) {
      this.l = paramShort3;
      ce ce1;
      (ce1 = this).m = ce1.a;
      ce1.n = ce1.b;
      ce1.q = 120;
      ce1.o = 0;
      if (!a.a) {
        ce1.p = 360 / ce1.q;
        ce1.r = new int[ce1.q];
        ce1.s = new int[ce1.q];
        ce1.t = new int[ce1.q];
        ce1.u = new int[ce1.q];
        ce1.c();
      } 
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt1 - this.a >> 2;
    this.j = paramInt2 - this.b >> 2;
    this.k = 2;
  }
  
  public final void a() {
    if (this.k == 2 && this.a == this.g && this.b == this.h) {
      p.E.removeElement(this);
      if ((af.e()).aV != null && (af.e()).aV.equals(this))
        (af.e()).aV = null; 
      return;
    } 
    if (this.k > 0) {
      if (this.i == 0)
        this.a = this.g; 
      if (this.j == 0)
        this.b = this.h; 
      if (this.a != this.g) {
        this.a += this.i;
        if ((this.i > 0 && this.a > this.g) || (this.i < 0 && this.a < this.g))
          this.a = this.g; 
      } 
      if (this.b != this.h) {
        this.b += this.j;
        if ((this.j > 0 && this.b > this.h) || (this.j < 0 && this.b < this.h))
          this.b = this.h; 
      } 
    } else {
      this.k = (byte)(this.k - 4);
      if (this.k < -12) {
        this.b -= 12;
        this.k = 1;
      } 
    } 
    if (b()) {
      ce ce1;
      (ce1 = this).v++;
      ce1.w++;
      if (ce1.w >= 40)
        ce1.w = 0; 
      if (ce1.v >= ce1.q)
        ce1.v = 0; 
      if (ce1.v % 10 == 0 && !a.a)
        at.a(114, ce1.a - 5, ce1.b - 30, 1); 
    } 
  }
  
  public final void a(en paramen) {
    ce ce1;
    if (b()) {
      paramen.a(bv.x, this.a + 3, this.b, 3);
      if (this.k <= 0) {
        if (this.w < 10) {
          paramen.a(x, this.a, this.b + this.k + 3, 33);
        } else {
          paramen.a(y, this.a, this.b + this.k + 3, 33);
        } 
      } else if (this.w < 10) {
        paramen.a(x, this.a, this.b + 3, 33);
      } else {
        paramen.a(y, this.a, this.b + 3, 33);
      } 
      en en1 = paramen;
      ce1 = this;
      if (!a.a && ce1.b())
        for (byte b = 0; b < ce1.s.length; b++) {
          if (ce1.v == b)
            if (ce1.w <= 20) {
              en1.a(z, ce1.t[b], ce1.u[b] + 3, 33);
            } else {
              bl.b(en1, ce1.e.f, ce1.t[b], ce1.u[b] + 3, 0, 33);
            }  
        }  
      return;
    } 
    if (!b()) {
      if (a.w % 4 == 0)
        ce1.a(f, this.a, this.b + this.k + 13, 33); 
      if (this.k <= 0) {
        bl.b((en)ce1, this.e.f, this.a, this.b + this.k + 3, 0, 33);
      } else {
        bl.b((en)ce1, this.e.f, this.a, this.b + 3, 0, 33);
      } 
      if ((af.e()).aV != null && (af.e()).aV.equals(this) && this.k != 2)
        ce1.a(aa.R, 0, 24, 9, 6, 0, this.a, this.b - 17, 3); 
    } 
  }
  
  private boolean b() {
    boolean bool;
    if (this.e.b == 22) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void c() {
    if (!a.a)
      for (byte b = 0; b < this.s.length; b++) {
        this.s[b] = ds.g(this.l * ds.a(this.o) / 1024);
        this.r[b] = ds.g(this.l * ds.b(this.o) / 1024);
        if (this.o < 90) {
          this.t[b] = this.m + this.r[b];
          this.u[b] = this.n - this.s[b];
        } else if (this.o >= 90 && this.o < 180) {
          this.t[b] = this.m - this.r[b];
          this.u[b] = this.n - this.s[b];
        } else if (this.o >= 180 && this.o < 270) {
          this.t[b] = this.m - this.r[b];
          this.u[b] = this.n + this.s[b];
        } else {
          this.t[b] = this.m + this.r[b];
          this.u[b] = this.n + this.s[b];
        } 
        this.o += this.p;
      }  
  }
  
  public final int l() {
    return this.a;
  }
  
  public final int m() {
    return this.b;
  }
  
  public final int n() {
    return 20;
  }
  
  public final int o() {
    return 20;
  }
  
  public final void p() {}
  
  public final boolean q() {
    return false;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ce.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */