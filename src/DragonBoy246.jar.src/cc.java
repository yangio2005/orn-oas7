import javax.microedition.lcdui.Image;
import main.a;

public final class cc extends aa implements bq {
  private static Image ad = l.b("/mainImage/shadowBig.png");
  
  private static ck ae;
  
  public int a;
  
  public boolean b;
  
  private int af;
  
  private int ag;
  
  private boolean ah;
  
  private int ai;
  
  private boolean aj = true;
  
  private int ak;
  
  private int al;
  
  private boolean am;
  
  private boolean an;
  
  private int ao;
  
  private int ap;
  
  private af[] aq;
  
  private long[] ar;
  
  private byte as;
  
  private int[] at = new int[] { 
      0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
      1, 1 };
  
  private int[] au = new int[] { 
      37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 
      40, 39, 39, 39, 38, 38, 38 };
  
  private int[] av;
  
  private int[] aw;
  
  private int[] ax;
  
  private int[] ay;
  
  private int[] az;
  
  private int[] aA;
  
  private int[] aB;
  
  private boolean aC;
  
  public final void C() {
    ae = null;
    ae = new ck();
    String str = "/x" + en.b + "/effectdata/" + 'd' + "/data";
    try {
      ae.b(str);
      ae.a = l.c("/effectdata/100/img.png");
    } catch (Exception exception) {
      bt.a().h(this.C);
    } 
    this.p = 2;
    this.v = ae.f;
    this.w = ae.g;
  }
  
  public final void a(short paramShort) {
    this.d = true;
    this.e = paramShort;
  }
  
  public final void a() {
    this.d = false;
  }
  
  public cc(int paramInt1, short paramShort1, short paramShort2, int paramInt2, long paramLong1, long paramLong2, int paramInt3) {
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
    this.av = new int[] { 
        0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 
        1, 1 };
    this.aw = new int[] { 
        0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 
        10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 
        21, 23, 23 };
    this.ax = new int[] { 
        0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 
        25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 
        2, 2, 1, 1 };
    this.ay = new int[] { 
        37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 
        16, 16, 18, 18, 20, 20, 22, 22, 24, 24 };
    this.az = new int[] { 
        37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 
        11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 
        38 };
    this.aA = new int[] { 8, 8, 9, 9, 10, 10, 12, 12 };
    this.aB = new int[] { 
        0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 
        25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 
        2, 2, 1, 1 };
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.t = this.m = paramShort1 + 20;
    this.u = this.n = paramShort2;
    this.y = paramInt1;
    this.k = paramLong1;
    this.l = paramLong2;
    this.C = 70;
    this.U = 100;
    A();
    if (paramInt3 == 0) {
      cc cc1 = this;
      ae = null;
      ae = new ck();
      String str = "/x" + en.b + "/effectdata/" + 'e' + "/data";
      try {
        ae.b(str);
        ae.a = l.c("/effectdata/101/img.png");
      } catch (Exception exception) {
        bt.a().h(cc1.C);
      } 
      cc1.v = ae.f;
      cc1.w = ae.g;
    } 
    if (paramInt3 == 1)
      C(); 
    if (paramInt3 == 2) {
      C();
      this.b = true;
    } 
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
    cc cc2;
    if (!i())
      return; 
    cc cc1 = this;
    byte b = bv.i;
    cc1.af = cc1.m;
    cc1.ai = 0;
    if (cc1.ag > 0 && !bv.a(cc1.af, cc1.ag, 2)) {
      if (bv.a(cc1.af / b, cc1.ag / b) == 0) {
        cc1.ah = true;
      } else if (bv.a(cc1.af / b, cc1.ag / b) != 0 && !bv.a(cc1.af, cc1.ag, 2)) {
        cc1.af = cc1.m;
        cc1.ag = cc1.n;
        cc1.ah = false;
      } 
      while (cc1.ah && cc1.ai < 10) {
        cc1.ai++;
        cc1.ag += 24;
        if (bv.a(cc1.af, cc1.ag, 2)) {
          if (cc1.ag % 24 != 0)
            cc1.ag -= cc1.ag % 24; 
          break;
        } 
      } 
    } 
    switch (this.p) {
      case 2:
        (cc1 = this).a(cc1.b ? cc1.au : cc1.at);
        if (cc1.m != cc1.t || cc1.n != cc1.u) {
          cc1.m += (cc1.t - cc1.m) / 4;
          cc1.n += (cc1.u - cc1.n) / 4;
        } 
        return;
      case 4:
        this.x = 0;
        if ((cc1 = this).am) {
          cc1.ao++;
          cc1.n -= cc1.ao;
          cc1.a(cc1.aA);
          if (cc1.n <= -500) {
            cc1.am = false;
            cc1.an = true;
            cc1.ao = 0;
          } 
        } 
        if (cc1.an) {
          cc1.m = cc1.a;
          cc1.ao += 2;
          cc1.n += cc1.ao;
          cc1.a(cc1.aB);
          if (cc1.n > cc1.u) {
            cc1.n = cc1.u;
            cc1.an = false;
            cc1.ao = 0;
            cc1.p = 2;
            p.bu = 10;
            cc1.aC = true;
          } 
        } 
        return;
      case 3:
        f();
        return;
      case 5:
        this.x = 0;
        cc2 = this;
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
        (cc1 = this).a(cc1.b ? cc1.au : cc1.at);
        if (a.w % 5 == 0) {
          cc2 = cc1;
          cc2 = cc1;
          cc2 = cc1;
          cc2 = cc1;
          at.a(167, ds.b(cc1.m - 60 / 2, cc1.m + 60 / 2), ds.b(cc1.m() + 40 / 2, cc1.m() + 40), 1);
        } 
        if (cc1.m != cc1.t || cc1.n != cc1.u) {
          cc1.m += (cc1.t - cc1.m) / 4;
          cc1.n += (cc1.u - cc1.n) / 4;
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
  
  public final void D() {
    this.p = 4;
    this.am = true;
  }
  
  public final void a(af[] paramArrayOfaf, long[] paramArrayOflong, byte paramByte) {
    this.aq = paramArrayOfaf;
    this.ar = paramArrayOflong;
    this.as = paramByte;
    this.ak = 0;
    if (paramByte < 3)
      this.p = 3; 
    if (paramByte == 3) {
      this.am = true;
      this.p = 4;
    } 
    if (paramByte == 4)
      for (byte b = 0; b < this.aq.length; b++)
        this.aq[b].a(this.ar[b], 0L, false, false);  
    if (paramByte == 7)
      this.p = 3; 
  }
  
  public final void f() {
    if (this.as == 7) {
      if (this.ak > 8)
        this.ak = 8; 
      a(this.av);
      if (a.w % 4 == 0)
        at.a(70, this.m + ((this.o == 1) ? 15 : -15), this.n - 40, 1); 
    } 
    if (this.as == 0) {
      if (this.ak == this.av.length - 1)
        this.p = 2; 
      this.o = (this.m < (this.aq[0]).B) ? 1 : -1;
      a(this.av);
      if (this.ak == 8)
        for (byte b = 0; b < this.aq.length; b++)
          ah.a(this.m + ((this.o == 1) ? 45 : -45), this.n - 30, true, this.ar[b], 0L, this.aq[b], 24);  
    } 
    if (this.as == 1) {
      if (this.ak == (this.b ? (this.ay.length - 1) : (this.aw.length - 1)))
        this.p = 2; 
      this.o = (this.m < (this.aq[0]).B) ? 1 : -1;
      a(this.b ? this.ay : this.aw);
      this.m += ((this.aq[0]).B - this.m) / 4;
      this.n += ((this.aq[0]).C - this.n) / 4;
      if (this.ak == 18)
        for (byte b = 0; b < this.aq.length; b++) {
          this.aq[b].a(this.ar[b], 0L, false, false);
          at.a(102, (this.aq[b]).B, (this.aq[b]).C, 1);
        }  
    } 
    if (this.as == 2) {
      if (this.ak == (this.b ? (this.az.length - 1) : (this.ax.length - 1)))
        this.p = 2; 
      this.o = (this.m < (this.aq[0]).B) ? 1 : -1;
      a(this.b ? this.az : this.ax);
      if (this.ak == 13) {
        p.bu = 10;
        this.aC = true;
        for (byte b = 0; b < this.aq.length; b++)
          this.aq[b].a(this.ar[b], 0L, false, false); 
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
      cc cc1 = this;
      en1.a(ad, cc1.af, cc1.u, 3);
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
    if (this.aC) {
      this.ap++;
      ea ea;
      ei.a(ea = new ea((this.as == 2) ? 19 : 22, this.m + this.ap * 50, this.n + 25, 2, 1, -1));
      ei.a(ea = new ea((this.as == 2) ? 19 : 22, this.m - this.ap * 50, this.n + 25, 2, 1, -1));
      if (this.ap == 50) {
        this.ap = 0;
        this.aC = false;
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
    return this.b ? (this.n - 20) : (this.n - 60);
  }
  
  public final int n() {
    return 40;
  }
  
  public final int o() {
    return 60;
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


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */