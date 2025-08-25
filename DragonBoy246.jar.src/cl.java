import javax.microedition.lcdui.Image;
import main.a;

public final class cl extends aa implements bq {
  private static Image ad = l.b("/mainImage/shadowBig.png");
  
  public int a;
  
  public int b;
  
  private int ae;
  
  private int af;
  
  private boolean ag = true;
  
  private int ah;
  
  private int ai;
  
  private af[] aj;
  
  private long[] ak;
  
  private byte al;
  
  private int am;
  
  private int an = -1;
  
  private int ao = -1;
  
  private int ap = -1;
  
  private int[][] aq;
  
  static {
    l.b("/mainImage/myTexture2dmobHP.png");
  }
  
  public final void a(short paramShort) {
    this.d = true;
    this.e = paramShort;
  }
  
  public final void a() {
    this.d = false;
  }
  
  public cl(int paramInt1, short paramShort1, short paramShort2, int paramInt2, long paramLong1, long paramLong2) {
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.aq = new int[][] { 
        { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, 
        { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 } };
    this.y = paramInt1;
    this.m = this.t = paramShort1 + 20;
    this.n = this.u = paramShort2;
    this.a = this.m;
    this.b = this.n;
    this.l = paramLong2;
    this.k = paramLong1;
    this.C = paramInt2;
    this.U = 100;
    A();
    if ((aa.c[this.C]).f == null)
      bt.a().h(this.C); 
    this.p = 2;
    this.aq = null;
  }
  
  public final void a(int[] paramArrayOfint) {
    this.ah++;
    if (this.ah > paramArrayOfint.length - 1)
      this.ah = 0; 
    this.ai = paramArrayOfint[this.ah];
  }
  
  public final void b() {}
  
  public final void c() {
    if (this.aq == null && (aa.c[this.C]).f != null)
      B(); 
    if (this.aq == null)
      return; 
    if (!i())
      return; 
    cl cl1 = this;
    byte b = 0;
    cl1.ae = cl1.m;
    if (bv.a(cl1.m, cl1.n, 2)) {
      cl1.af = cl1.n;
    } else {
      cl1.af = cl1.n;
      while (b < 30) {
        b++;
        cl1.af += 24;
        if (bv.a(cl1.ae, cl1.af, 2)) {
          if (cl1.af % 24 != 0)
            cl1.af -= cl1.af % 24; 
          break;
        } 
      } 
    } 
    switch (this.p) {
      case 2:
        (cl1 = this).a(cl1.aq[0]);
        if (cl1.m != cl1.a || cl1.n != cl1.b) {
          cl1.m += (cl1.a - cl1.m) / 4;
          cl1.n += (cl1.b - cl1.n) / 4;
        } 
        return;
      case 3:
        f();
        return;
      case 5:
        this.x = 0;
        g();
        return;
      case 6:
        this.x = 0;
        this.q++;
        this.n += this.q;
        if (this.n >= this.u) {
          this.n = this.u;
          this.q = 0;
          this.p = 5;
          return;
        } 
        break;
      case 7:
        super.c();
        return;
      case 0:
      case 1:
        (cl1 = this).ah++;
        if (cl1.ah > (cl1.aq[13]).length - 1)
          cl1.ah = (cl1.aq[13]).length - 1; 
        cl1.ai = cl1.aq[13][cl1.ah];
        if (cl1.m != cl1.a || cl1.n != cl1.b) {
          cl1.m += (cl1.a - cl1.m) / 4;
          cl1.n += (cl1.b - cl1.n) / 4;
        } 
        break;
    } 
  }
  
  public final void a(af paramaf) {
    this.D = paramaf;
    this.q = 0;
    this.r = 0;
    this.p = 3;
    this.ah = 0;
    int j = paramaf.B;
    int i = paramaf.C;
    if (ds.g(j - this.m) < this.v << 1 && ds.g(i - this.n) < this.w << 1) {
      if (this.m < j) {
        this.m = j - this.v;
      } else {
        this.m = j + this.v;
      } 
      this.s = 0;
      return;
    } 
    this.s = 1;
  }
  
  public final void C() {
    this.p = 4;
  }
  
  public final void a(af[] paramArrayOfaf, long[] paramArrayOflong, byte paramByte1, byte paramByte2) {
    this.aj = paramArrayOfaf;
    this.ak = paramArrayOflong;
    this.al = paramByte1;
    this.o = paramByte2;
    this.p = 3;
    if (this.m != this.a || this.n != this.b) {
      this.m += (this.a - this.m) / 4;
      this.n += (this.b - this.n) / 4;
    } 
  }
  
  public final void f() {
    if (this.ah == (this.aq[this.al + 1]).length - 1)
      this.p = 2; 
    a(this.aq[this.al + 1]);
    if (this.ah == this.aq[15][this.al - 1])
      for (byte b = 0; b < this.aj.length; b++) {
        this.aj[b].a(this.ak[b], 0L, false, false);
        at.a(this.aq[16][this.al - 1], (this.aj[b]).B, (this.aj[b]).C, 1);
      }  
  }
  
  public final void g() {
    a(this.aq[1]);
    byte b = (aa.c[this.C]).b;
    int i = b;
    if (ds.g(this.m - this.a) < b)
      i = ds.g(this.m - this.a); 
    this.m += (this.m < this.a) ? i : -i;
    this.n = this.b;
    if (this.m < this.a) {
      this.o = 1;
    } else if (this.m > this.a) {
      this.o = -1;
    } 
    if (ds.g(this.m - this.a) <= 1) {
      this.m = this.a;
      this.p = 2;
    } 
  }
  
  public final boolean h() {
    return (this.m < p.j) ? false : ((this.m > p.j + p.d) ? false : ((this.n < p.k) ? false : ((this.n > p.k + p.e + 30) ? false : (!(this.p == 0)))));
  }
  
  public final boolean i() {
    return !(this.p == 0);
  }
  
  public final boolean j() {
    return (this.I || this.H > 0);
  }
  
  public final void a(en paramen) {
    if ((aa.c[this.C]).f == null)
      return; 
    if (this.Y)
      return; 
    if (this.M) {
      if (!this.d) {
        (aa.c[this.C]).f.a(paramen, this.ai, this.N, this.O, (this.o == 1) ? 0 : 1, 2);
        return;
      } 
      bl.b(paramen, this.e, this.N, this.O, (this.o == 1) ? 0 : 2, 33);
      return;
    } 
    if (this.ag) {
      en en1 = paramen;
      cl cl1 = this;
      byte b = bv.i;
      if ((bv.l < 114 || bv.l > 120) && bv.l != 127 && bv.l != 128)
        if (bv.a(cl1.ae + b / 2, cl1.af + 1, 4)) {
          en1.e(cl1.ae / b * b, (cl1.af - 30) / b * b, b, 100);
        } else if (bv.a((cl1.ae - b / 2) / b, (cl1.af + 1) / b) == 0) {
          en1.e(cl1.ae / b * b, (cl1.af - 30) / b * b, 100, 100);
        } else if (bv.a((cl1.ae + b / 2) / b, (cl1.af + 1) / b) == 0) {
          en1.e(cl1.ae / b * b, (cl1.af - 30) / b * b, b, 100);
        } else if (bv.a(cl1.ae - b / 2, cl1.af + 1, 8)) {
          en1.e(cl1.ae / 24 * b, (cl1.af - 30) / b * b, b, 100);
        }  
      en1.a(ad, cl1.ae, cl1.af - 5, 3);
      en1.e(p.j, p.k - a.ae, p.d, p.e + 2 * a.ae);
    } 
    paramen.a(0, a.ae);
    if (!this.d) {
      if (this.ap == -1)
        this.ap = this.n; 
      if (bv.a(this.m + 33, this.n, 4)) {
        this.ao = bv.f(this.m + 33) - 33;
        this.an = bv.f(this.m + 33);
        if (this.m > this.ao && this.m < this.an && this.an != -1)
          this.m = this.ao; 
      } 
      if (this.n < this.ap && this.ap != -1) {
        this.ap = this.n;
        this.m += 33;
      } 
      if (this.n > this.ap) {
        this.ap = this.n;
        this.m -= 33;
      } 
      (aa.c[this.C]).f.a(paramen, this.ai, this.m, this.n, (this.o == 1) ? 0 : 1, 2);
    } else {
      bl.b(paramen, this.e, this.m, this.n - 9, (this.o == 1) ? 0 : 2, 33);
    } 
    paramen.a(0, -a.ae);
    if (this.k > 0L) {
      int i = en.a(this.X);
      int j = en.b(this.X);
      int k = i;
      int n = this.m - i;
      int i1 = this.n - this.w - 5;
      int m = (i << 1) * this.V / 100;
      int i2 = m;
      if (this.W >= this.V) {
        i2 = i * (this.W -= (a.w % 6 > 3) ? this.am++ : this.am) / 100;
        if (this.W <= 0)
          this.W = 0; 
        if (this.W < this.V)
          this.W = this.V; 
        if (this.am >= 3)
          this.am = 3; 
      } 
      if (m > i) {
        if ((m -= i) <= 0)
          m = 0; 
      } else {
        k = m;
        m = 0;
      } 
      paramen.a(p.aJ, n, i1, 20);
      paramen.a(p.aJ, n + i, i1, 20);
      paramen.a(16777215);
      paramen.d(n, i1, i2, 2);
      paramen.a(this.X, 0, 0, k, j, 0, n, i1, 20);
      paramen.a(this.X, 0, 0, m, j, 0, n + i, i1, 20);
    } 
  }
  
  public final void k() {
    this.k = 0L;
    this.k = 0L;
    this.p = 1;
    this.q = -3;
    this.r = -this.o;
    this.s = 0;
  }
  
  public final void a(aa paramaa) {
    this.D = null;
    this.q = 0;
    this.r = 0;
    this.p = 3;
    this.ah = 0;
    int j = paramaa.m;
    int i = paramaa.n;
    if (ds.g(j - this.m) < this.v << 1 && ds.g(i - this.n) < this.w << 1) {
      if (this.m < j) {
        this.m = j - this.v;
      } else {
        this.m = j + this.v;
      } 
      this.s = 0;
      return;
    } 
    this.s = 1;
  }
  
  public final int l() {
    return this.m;
  }
  
  public final int m() {
    return this.n;
  }
  
  public final int n() {
    return this.w;
  }
  
  public final int o() {
    return this.v;
  }
  
  public final void p() {
    if (this.p == 5) {
      this.p = 2;
      this.q = this.r = this.s = 0;
    } 
  }
  
  public final boolean q() {
    return !(this.p != 0 && this.p != 1);
  }
  
  public final void r() {
    if (this.j != 0)
      this.j = 0; 
  }
  
  public final void s() {}
  
  public final void t() {}
  
  public final void a(short paramShort1, short paramShort2) {
    if (paramShort2 != -1) {
      if (ds.a(this.m, this.n, this.a, this.b) > 100) {
        this.m = paramShort1;
        this.n = paramShort2;
        this.p = 2;
        return;
      } 
      this.a = paramShort1;
      this.b = paramShort2;
      this.p = 5;
      return;
    } 
    this.a = paramShort1;
    this.p = 5;
  }
  
  public final void B() {
    try {
      this.aq = (int[][])ac.d.get((new StringBuffer(String.valueOf(this.C))).toString());
      this.v = (aa.c[this.C]).f.f;
      this.w = (aa.c[this.C]).f.g;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void D() {
    this.p = 0;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */