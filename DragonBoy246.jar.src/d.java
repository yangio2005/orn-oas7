import javax.microedition.lcdui.Image;
import main.a;

public final class d extends aa implements bq {
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
  
  private boolean am;
  
  private int an;
  
  private int ao;
  
  private af[] ap;
  
  private long[] aq;
  
  private byte ar;
  
  private int[] as = new int[] { 
      0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 
      1, 1 };
  
  private int[] at;
  
  private int[] au;
  
  private int[] av;
  
  private int[] aw;
  
  private boolean ax;
  
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
  
  public d(int paramInt1, short paramShort1, short paramShort2, int paramInt2, long paramLong1, long paramLong2) {
    (new int[15])[0] = 1;
    (new int[15])[1] = 1;
    (new int[15])[2] = 1;
    (new int[15])[3] = 1;
    (new int[15])[4] = 2;
    (new int[15])[5] = 2;
    (new int[15])[6] = 2;
    (new int[15])[7] = 2;
    (new int[15])[8] = 3;
    (new int[15])[9] = 3;
    (new int[15])[10] = 3;
    (new int[15])[11] = 3;
    (new int[15])[12] = 2;
    (new int[15])[13] = 2;
    (new int[15])[14] = 2;
    (new int[7])[0] = 1;
    (new int[7])[1] = 1;
    (new int[7])[2] = 2;
    (new int[7])[3] = 2;
    (new int[7])[4] = 3;
    (new int[7])[5] = 3;
    (new int[7])[6] = 2;
    this.at = new int[] { 
        0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 
        9, 9 };
    this.au = new int[] { 
        0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 
        12, 12 };
    (new int[24])[2] = 1;
    (new int[24])[3] = 1;
    (new int[24])[4] = 4;
    (new int[24])[5] = 4;
    (new int[24])[6] = 6;
    (new int[24])[7] = 6;
    (new int[24])[8] = 8;
    (new int[24])[9] = 8;
    (new int[24])[10] = 25;
    (new int[24])[11] = 25;
    (new int[24])[12] = 26;
    (new int[24])[13] = 26;
    (new int[24])[14] = 28;
    (new int[24])[15] = 28;
    (new int[24])[16] = 30;
    (new int[24])[17] = 30;
    (new int[24])[18] = 32;
    (new int[24])[19] = 32;
    (new int[24])[20] = 2;
    (new int[24])[21] = 2;
    (new int[24])[22] = 1;
    (new int[24])[23] = 1;
    this.av = new int[] { 
        4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 
        6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 
        1 };
    this.aw = new int[] { 
        6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 
        1, 1 };
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.y = paramInt1;
    this.a = this.m = paramShort1 + 20;
    this.b = this.n = paramShort2;
    this.u = paramShort2;
    this.k = paramLong1;
    this.l = paramLong2;
    this.C = 72;
    this.U = 100;
    A();
    d d1 = this;
    ae = null;
    ae = new ck();
    String str = "/x" + en.b + "/effectdata/" + 'm' + "/data";
    try {
      ae.b(str);
      ae.a = l.c("/effectdata/109/img.png");
    } catch (Exception exception) {
      bt.a().h(d1.C);
    } 
    d1.v = ae.f;
    d1.w = ae.g;
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
    d d2;
    if (!i())
      return; 
    d d1 = this;
    byte b = bv.i;
    d1.af = d1.m;
    d1.ai = 0;
    if (d1.ag > 0 && !bv.a(d1.af, d1.ag, 2)) {
      if (bv.a(d1.af / b, d1.ag / b) == 0) {
        d1.ah = true;
      } else if (bv.a(d1.af / b, d1.ag / b) != 0 && !bv.a(d1.af, d1.ag, 2)) {
        d1.af = d1.m;
        d1.ag = d1.n;
        d1.ah = false;
      } 
      while (d1.ah && d1.ai < 10) {
        d1.ai++;
        d1.ag += 24;
        if (bv.a(d1.af, d1.ag, 2)) {
          if (d1.ag % 24 != 0)
            d1.ag -= d1.ag % 24; 
          break;
        } 
      } 
    } 
    switch (this.p) {
      case 2:
        (d1 = this).a(d1.as);
        if (d1.m != d1.a || d1.n != d1.b) {
          d1.m += (d1.a - d1.m) / 4;
          d1.n += (d1.b - d1.n) / 4;
        } 
        return;
      case 4:
        this.x = 0;
        if ((d1 = this).am) {
          d1.m = d1.a;
          d1.an += 2;
          d1.n += d1.an;
          d1.a(d1.aw);
          if (d1.n > d1.u) {
            d1.n = d1.u;
            d1.am = false;
            d1.an = 0;
            d1.p = 2;
            p.bu = 10;
            d1.ax = true;
          } 
        } 
        return;
      case 3:
        f();
        return;
      case 5:
        this.x = 0;
        d2 = this;
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
        (d1 = this).a(d1.as);
        if (a.w % 5 == 0) {
          d2 = d1;
          d2 = d1;
          d2 = d1;
          d2 = d1;
          at.a(167, ds.b(d1.m - 50 / 2, d1.m + 50 / 2), ds.b((d2 = d1).n - 50 + 40 / 2, (d2 = d1).n - 50 + 40), 1);
        } 
        if (d1.m != d1.a || d1.n != d1.b) {
          d1.m += (d1.a - d1.m) / 4;
          d1.n += (d1.b - d1.n) / 4;
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
    this.p = 3;
    this.ap = paramArrayOfaf;
    this.aq = paramArrayOflong;
    this.ar = paramByte;
    this.ak = 0;
  }
  
  public final void f() {
    if (this.ar == 0) {
      if (this.ak == this.at.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.ap[0]).B) ? 1 : -1;
      a(this.at);
      this.m += ((this.ap[0]).B - this.m) / 4;
      this.n += ((this.ap[0]).C - this.n) / 4;
      this.a = this.m;
      if (this.ak == 8)
        for (byte b = 0; b < this.ap.length; b++) {
          this.ap[b].a(this.aq[b], 0L, false, false);
          at.a(102, (this.ap[b]).B, (this.ap[b]).C, 1);
        }  
    } 
    if (this.ar == 1) {
      if (this.ak == this.au.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.ap[0]).B) ? 1 : -1;
      a(this.au);
      if (this.ak == 8)
        for (byte b = 0; b < this.ap.length; b++)
          ah.a(this.m + ((this.o == 1) ? 45 : -45), this.n - 25, true, this.aq[b], 0L, this.ap[b], 24);  
    } 
    if (this.ar == 2) {
      if (this.ak == this.av.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.ap[0]).B) ? 1 : -1;
      a(this.av);
      this.m += ((this.ap[0]).B - this.m) / 4;
      this.a = this.m;
      this.b = this.n;
      if (this.ak == 12)
        for (byte b = 0; b < this.ap.length; b++) {
          this.ap[b].a(this.aq[b], 0L, false, false);
          at.a(102, (this.ap[b]).B, (this.ap[b]).C, 1);
        }  
    } 
  }
  
  public final void g() {}
  
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
      d d1 = this;
      en1.a(ad, d1.af, d1.u, 3);
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
    if (this.ax) {
      this.ao++;
      ea ea;
      ei.a(ea = new ea((this.ar == 2) ? 19 : 22, this.m + this.ao * 50, this.n + 25, 2, 1, -1));
      ei.a(ea = new ea((this.ar == 2) ? 19 : 22, this.m - this.ao * 50, this.n + 25, 2, 1, -1));
      if (this.ao == 50) {
        this.ao = 0;
        this.ax = false;
      } 
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
    return this.n - 50;
  }
  
  public final int n() {
    return 40;
  }
  
  public final int o() {
    return 50;
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
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */