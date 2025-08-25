import javax.microedition.lcdui.Image;
import main.a;

public final class an extends aa implements bq {
  private static Image ad = l.b("/mainImage/shadowBig.png");
  
  private static ck ae;
  
  public int a;
  
  public int b;
  
  private int af;
  
  private int ag;
  
  private boolean ah;
  
  private int ai;
  
  private boolean aj = true;
  
  private int ak;
  
  private int al;
  
  private af[] am;
  
  private long[] an;
  
  private byte ao;
  
  private int[] ap = new int[] { 
      0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 
      1, 1 };
  
  private int[] aq = new int[] { 
      0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 
      4, 4 };
  
  private int[] ar = new int[] { 
      0, 0, 0, 4, 4, 4, 5, 5, 5, 6, 
      6, 6 };
  
  private int[] as = new int[] { 
      0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 
      9, 9, 10, 10, 10, 11, 11 };
  
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
  
  public an(int paramInt1, short paramShort1, short paramShort2, int paramInt2, long paramLong1, long paramLong2) {
    (new int[4])[0] = 1;
    (new int[4])[1] = 1;
    (new int[4])[2] = 7;
    (new int[4])[3] = 7;
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.y = paramInt1;
    this.m = paramShort1 + 20;
    this.n = paramShort2;
    this.a = this.m;
    this.b = this.n;
    this.l = paramLong2;
    this.k = paramLong1;
    this.C = 71;
    this.U = 100;
    A();
    an an1 = this;
    ae = null;
    ae = new ck();
    String str = "/x" + en.b + "/effectdata/" + 'l' + "/data";
    try {
      ae.b(str);
      ae.a = l.c("/effectdata/108/img.png");
    } catch (Exception exception) {
      bt.a().h(an1.C);
    } 
    an1.v = ae.f;
    an1.w = ae.g;
    this.p = 2;
  }
  
  public final void a(int[] paramArrayOfint) {
    this.ak++;
    if (this.ak > paramArrayOfint.length - 1)
      this.ak = 0; 
    this.al = paramArrayOfint[this.ak];
  }
  
  public final void b() {}
  
  public final void c() {
    if (!i())
      return; 
    an an1 = this;
    byte b = bv.i;
    an1.af = an1.m;
    an1.ai = 0;
    if (an1.ag > 0 && !bv.a(an1.af, an1.ag, 2)) {
      if (bv.a(an1.af / b, an1.ag / b) == 0) {
        an1.ah = true;
      } else if (bv.a(an1.af / b, an1.ag / b) != 0 && !bv.a(an1.af, an1.ag, 2)) {
        an1.af = an1.m;
        an1.ag = an1.n;
        an1.ah = false;
      } 
      while (an1.ah && an1.ai < 10) {
        an1.ai++;
        an1.ag += 24;
        if (bv.a(an1.af, an1.ag, 2)) {
          if (an1.ag % 24 != 0)
            an1.ag -= an1.ag % 24; 
          break;
        } 
      } 
    } 
    switch (this.p) {
      case 2:
        (an1 = this).a(an1.ap);
        if (an1.m != an1.a || an1.n != an1.b) {
          an1.m += (an1.a - an1.m) / 4;
          an1.n += (an1.b - an1.n) / 4;
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
        return;
      case 0:
      case 1:
        (an1 = this).a(an1.ap);
        if (a.w % 5 == 0) {
          an an2 = an1;
          an2 = an1;
          an2 = an1;
          an2 = an1;
          at.a(167, ds.b(an1.m - 40 / 2, an1.m + 40 / 2), ds.b((an2 = an1).n - 40 + 40 / 2, (an2 = an1).n - 40 + 40), 1);
        } 
        if (an1.m != an1.a || an1.n != an1.b) {
          an1.m += (an1.a - an1.m) / 4;
          an1.n += (an1.b - an1.n) / 4;
        } 
        break;
    } 
  }
  
  public final void d() {}
  
  public final void a(af paramaf) {
    this.D = paramaf;
    this.q = 0;
    this.r = 0;
    this.p = 3;
    this.ak = 0;
    this.o = (paramaf.B > this.m) ? 1 : -1;
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
  
  final boolean e() {
    return ((this.C >= 58 && this.C <= 65) || this.C == 67 || this.C == 68);
  }
  
  public final void a(af[] paramArrayOfaf, long[] paramArrayOflong, byte paramByte) {
    this.am = paramArrayOfaf;
    this.an = paramArrayOflong;
    this.ao = paramByte;
    this.p = 3;
  }
  
  public final void f() {
    if (this.ao == 3) {
      if (this.ak == this.ar.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.am[0]).B) ? 1 : -1;
      a(this.ar);
      this.m += ((this.am[0]).B - this.m) / 4;
      this.n += ((this.am[0]).C - this.n) / 4;
      this.a = this.m;
      if (this.ak == 8)
        for (byte b = 0; b < this.am.length; b++) {
          this.am[b].a(this.an[b], 0L, false, false);
          at.a(102, (this.am[b]).B, (this.am[b]).C, 1);
        }  
    } 
    if (this.ao == 4) {
      if (this.ak == this.as.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.am[0]).B) ? 1 : -1;
      a(this.as);
      if (this.ak == 8)
        for (byte b = 0; b < this.am.length; b++) {
          this.am[b].a(this.an[b], 0L, false, false);
          at.a(102, (this.am[b]).B, (this.am[b]).C, 1);
        }  
    } 
  }
  
  public final void g() {
    a(this.aq);
    this.m += (this.m < this.a) ? 2 : -2;
    this.n = this.b;
    this.o = (this.m < this.a) ? 1 : -1;
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
    if (ae == null)
      return; 
    if (this.Y)
      return; 
    if (this.M) {
      if (!this.d) {
        ae.a(paramen, this.al, this.N, this.O, (this.o == 1) ? 0 : 1, 2);
        return;
      } 
      bl.b(paramen, this.e, this.N, this.O, (this.o == 1) ? 0 : 2, 33);
      return;
    } 
    if (this.aj && this.p != 0) {
      en en1 = paramen;
      an an1 = this;
      en1.a(ad, an1.af, an1.u, 3);
      en1.e(p.j, p.k - a.ae, p.d, p.e + 2 * a.ae);
    } 
    paramen.a(0, a.ae);
    if (!this.d) {
      ae.a(paramen, this.al, this.m, this.n, (this.o == 1) ? 0 : 1, 2);
    } else {
      bl.b(paramen, this.e, this.m, this.n - 9, (this.o == 1) ? 0 : 2, 33);
    } 
    paramen.a(0, -a.ae);
    int i = en.a(this.X);
    int j = en.b(this.X);
    int k = i;
    int n = this.m - i;
    int i1 = this.n - this.w - 5;
    int m;
    if ((m = (i << 1) * this.V / 100) > i) {
      if ((m -= i) <= 0)
        m = 0; 
    } else {
      k = m;
      m = 0;
    } 
    paramen.a(p.aJ, n, i1, 20);
    paramen.a(p.aJ, n + i, i1, 20);
    paramen.a(this.X, 0, 0, k, j, 0, n, i1, 20);
    paramen.a(this.X, 0, 0, m, j, 0, n + i, i1, 20);
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
    this.ak = 0;
    this.o = (paramaa.m > this.m) ? 1 : -1;
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
    return this.n - 40;
  }
  
  public final int n() {
    return 40;
  }
  
  public final int o() {
    return 40;
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
  
  public final void b(short paramShort) {
    this.a = paramShort;
    this.p = 5;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\an.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */