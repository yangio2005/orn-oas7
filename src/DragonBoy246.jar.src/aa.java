import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public class aa implements bq {
  public static dy[] c;
  
  boolean d;
  
  short e;
  
  public boolean f;
  
  public boolean g = false;
  
  public int h;
  
  public long i;
  
  public int j;
  
  public long k;
  
  public long l;
  
  public int m;
  
  public int n;
  
  public int o = 1;
  
  private int a = 1;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public int v;
  
  public int w;
  
  public int x;
  
  public int y;
  
  public boolean z;
  
  public boolean A;
  
  public boolean B;
  
  private boolean b;
  
  private el ad = new el("vMobMove");
  
  public int C;
  
  public af D;
  
  public long E;
  
  public long F;
  
  public int G;
  
  public byte H;
  
  public boolean I;
  
  public boolean J;
  
  public static el K = new el("lastMob");
  
  public static el L = new el("newMob");
  
  public boolean M = false;
  
  public int N;
  
  public int O;
  
  public int P;
  
  public int Q;
  
  private boolean ae;
  
  private int af;
  
  private boolean ag = true;
  
  private int ah;
  
  private int ai;
  
  public static Image R = l.b("/mainImage/myTexture2dmobHP.png");
  
  private boolean aj;
  
  private int ak;
  
  private int al;
  
  private int am;
  
  public int S;
  
  public boolean T = true;
  
  private int[] an = new int[] { 
      0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
      1, 1 };
  
  private int[] ao = new int[] { 
      1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 
      3, 3, 2, 2, 2 };
  
  private int[] ap = new int[] { 1, 1, 2, 2, 3, 3, 2 };
  
  private int[] aq = new int[] { 4, 5, 6 };
  
  private int[] ar = new int[] { 7, 8, 9 };
  
  private int[] as = new int[1];
  
  public int U = 24;
  
  public int V = 100;
  
  public int W = 100;
  
  public Image X;
  
  private int at = 0;
  
  public boolean Y = false;
  
  public af Z;
  
  public boolean aa;
  
  private aa au;
  
  private int av;
  
  public boolean ab;
  
  public boolean ac;
  
  private int[][] aw;
  
  private boolean ax;
  
  public final boolean u() {
    return !(!(this instanceof an) && !(this instanceof d) && !(this instanceof cc) && !(this instanceof cl));
  }
  
  public aa() {
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.aa = false;
    this.aw = new int[][] { { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 } };
    this.ax = true;
  }
  
  public final void v() {
    if ((c[this.C]).f == null) {
      (c[this.C]).f = new ck();
      String str = "/Mob/" + this.C;
      InputStream inputStream;
      if ((inputStream = "".getClass().getResourceAsStream(str)) != null) {
        (c[this.C]).f.a(String.valueOf(str) + "/data");
        (c[this.C]).f.a = l.b(String.valueOf(str) + "/img.png");
      } else {
        bt.a().h(this.C);
      } 
      if (K.size() > 15) {
        (c[Integer.parseInt((String)K.elementAt(0))]).f = null;
        K.removeElementAt(0);
      } 
      K.addElement((new StringBuffer(String.valueOf(this.C))).toString());
      return;
    } 
    this.v = (c[this.C]).f.f;
    this.w = (c[this.C]).f.g;
  }
  
  public void a(short paramShort) {
    this.d = true;
    this.e = paramShort;
  }
  
  public void a() {
    this.d = false;
  }
  
  public aa(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt2, int paramInt3, long paramLong1, byte paramByte1, long paramLong2, short paramShort1, short paramShort2, byte paramByte2, byte paramByte3) {
    (new byte[2])[0] = -1;
    (new byte[2])[1] = 1;
    this.aa = false;
    this.aw = new int[][] { { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 } };
    this.ax = true;
    this.z = paramBoolean2;
    this.A = paramBoolean4;
    this.B = paramBoolean5;
    this.G = paramInt3;
    this.y = paramInt1;
    this.C = paramInt2;
    this.k = paramLong1;
    this.t = this.m = paramShort1;
    this.u = this.n = paramShort2;
    this.p = paramByte2;
    if (paramInt2 != 70) {
      C();
      v();
    } 
    if (!a((new StringBuffer(String.valueOf(paramInt2))).toString()))
      L.addElement((new StringBuffer(String.valueOf(paramInt2))).toString()); 
    this.l = paramLong2;
    this.H = paramByte3;
    A();
    this.b = false;
    this.P = paramShort1;
    this.Q = paramShort2;
    if (D()) {
      this.an = new int[] { 
          0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 
          2, 2, 2, 2, 2, 2, 2 };
      this.ao = new int[] { 
          0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 
          2, 2, 2, 2, 2, 2, 2 };
      this.ap = new int[] { 
          0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 
          2, 2, 2, 2, 2, 2, 2 };
      this.aq = new int[] { 
          3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 
          5, 5 };
      this.ar = new int[] { 
          3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 
          5, 5 };
    } else if (E()) {
      this.an = new int[] { 
          0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
          1, 1 };
      this.ao = new int[] { 
          1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 
          1, 1, 3, 3, 3, 3 };
      this.ap = new int[] { 1, 1, 2, 2, 1, 1, 3, 3 };
      this.aq = new int[] { 
          4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 
          6 };
      this.ar = new int[] { 
          7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 
          9 };
    } else if (e()) {
      this.an = new int[] { 
          0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
          1, 1 };
      this.ao = new int[] { 
          2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 
          3, 3, 2, 2, 4, 4 };
      this.ap = new int[] { 2, 2, 3, 3, 2, 2, 4, 4 };
      this.aq = new int[] { 5, 6, 7, 8, 9, 10, 11, 12 };
      this.ar = new int[] { 5, 12, 13, 14 };
    } else {
      this.an = new int[] { 
          0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
          1, 1 };
      this.ao = new int[] { 
          1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 
          3, 3, 2, 2, 2 };
      this.ap = new int[] { 1, 1, 2, 2, 3, 3, 2 };
      this.aq = new int[] { 4, 5, 6 };
      this.ar = new int[] { 7, 8, 9 };
    } 
    ds.c("MOB ID= " + paramInt1);
  }
  
  private static boolean a(String paramString) {
    for (byte b = 0; b < L.size(); b++) {
      String str;
      if ((str = L.elementAt(b)).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private static void C() {
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b2 < c.length; b2++) {
      if ((c[b2]).f != null)
        b1++; 
    } 
    if (b1 >= 10)
      for (b2 = 0; b2 < c.length; b2++) {
        if ((c[b2]).f != null && b1 > 5)
          (c[b2]).f = null; 
      }  
  }
  
  public void a(int[] paramArrayOfint) {
    if (this.ah > paramArrayOfint.length - 1)
      this.ah = 0; 
    this.ai = paramArrayOfint[this.ah];
    this.ah++;
  }
  
  public void b() {
    if (this.S == 0 && a.w % 25 == 0)
      at.a(114, this, 1); 
    if (this.S == 1 && a.w % 4 == 0)
      at.a(132, this, 1); 
    if (this.S == 2 && a.w % 7 == 0)
      at.a(131, this, 1); 
  }
  
  public void c() {
    aa aa1;
    if (this.M)
      return; 
    B();
    if (this.ab && a.w % 5 == 0)
      at.a(113, this.m, this.n, 1); 
    if (this.ac && a.w % 10 == 0)
      ei.a(new ea(41, this.m, this.n, 3, 1, 1)); 
    if (!a.a && this.p != 1 && this.p != 0 && !a.a && a.w % (15 + (this.y << 1)) == 0) {
      for (byte b = 0; b < p.D.size(); b++) {
        af af1;
        if ((af1 = p.D.elementAt(b)) != null && af1.ci && af1.as == 32) {
          af af2;
          (af2 = new af()).B = af1.B;
          af1.C -= af1.al;
          if (af1.K == 0)
            ah.a(this.m + this.o * this.v, this.n, j(), -100L, -100L, af2, 25); 
        } 
      } 
      if ((af.e()).ci && (af.e()).as == 32) {
        af af1;
        (af1 = new af()).B = (af.e()).B;
        (af.e()).C -= (af.e()).al;
        if ((af.e()).K == 0)
          ah.a(this.m + this.o * this.v, this.n, j(), -100L, -100L, af1, 25); 
      } 
    } 
    if (this.j != 0 && a.w % 5 == 0)
      ei.a(new ea(this.j, this.m, this.n + 24, 3, 5, 1)); 
    if (this.g) {
      if (a.w % 5 == 0)
        at.a(113, this.m, this.n, 1); 
      long l;
      if ((l = System.currentTimeMillis()) - this.i >= 1000L) {
        this.h--;
        this.i = l;
        if (this.h < 0) {
          this.g = false;
          this.h = 0;
        } 
      } 
      if (F()) {
        this.ai = this.as[a.w % this.as.length];
      } else if (D()) {
        this.ai = this.aq[a.w % this.aq.length];
      } else if (E()) {
        if (a.w % 20 > 5) {
          this.ai = 11;
        } else {
          this.ai = 10;
        } 
      } else if (e()) {
        if (a.w % 20 > 5) {
          this.ai = 1;
        } else {
          this.ai = 15;
        } 
      } else if (a.w % 20 > 5) {
        this.ai = 11;
      } else {
        this.ai = 10;
      } 
    } 
    if (!i())
      return; 
    if (this.ag) {
      aa aa2 = this;
      byte b = bv.i;
      aa2.P = aa2.m;
      aa2.af = 0;
      if (aa2.Q > 0 && !bv.a(aa2.P, aa2.Q, 2)) {
        if (bv.a(aa2.P / b, aa2.Q / b) == 0) {
          aa2.ae = true;
        } else if (bv.a(aa2.P / b, aa2.Q / b) != 0 && !bv.a(aa2.P, aa2.Q, 2)) {
          aa2.P = aa2.m;
          aa2.Q = aa2.n;
          aa2.ae = false;
        } 
        while (aa2.ae && aa2.af < 10) {
          aa2.af++;
          aa2.Q += 24;
          if (bv.a(aa2.P, aa2.Q, 2)) {
            if (aa2.Q % 24 != 0)
              aa2.Q -= aa2.Q % 24; 
            break;
          } 
        } 
      } 
    } 
    if (this.ad == null && (c[this.C]).a != 0)
      return; 
    if (this.p != 3 && this.T) {
      if (this.D != null) {
        this.D.a(this.E, this.F, false, true);
      } else if (this.au != null) {
        this.au.d();
      } 
      this.T = false;
    } 
    if (this.H > 0)
      b(); 
    switch (this.p) {
      case 1:
        this.z = false;
        this.A = false;
        this.B = false;
        this.n += this.q;
        if (a.w % 2 == 0)
          if (this.r > 1) {
            this.r--;
          } else if (this.r < -1) {
            this.r++;
          }  
        this.m += this.r;
        if (F()) {
          this.ai = this.as[a.w % this.as.length];
        } else if (D()) {
          this.ai = this.aq[a.w % this.aq.length];
        } else if (!E() && e()) {
          this.ai = 15;
        } else {
          this.ai = 11;
        } 
        if (this.b) {
          this.b = false;
          if (this.J)
            for (byte b = 0; b < p.F.size(); b++) {
              if (((aa)p.F.elementAt(b)).y == this.y)
                p.F.removeElementAt(b); 
            }  
          this.q = 0;
          this.r = 0;
          this.m = this.n = 0;
          this.k = (z()).d;
          this.p = 0;
          this.x = 0;
          return;
        } 
        if ((bv.b(this.m, this.n) & 0x2) == 2) {
          this.q = (this.q > 4) ? -4 : -this.q;
          if (this.s == 0)
            this.s = 16; 
        } else {
          this.q++;
        } 
        if (this.s > 0) {
          this.s--;
          if (this.s == 0) {
            this.b = true;
            return;
          } 
        } 
        break;
      case 2:
        if (this.j != 0)
          return; 
        if (this.g)
          return; 
        if (this.ab)
          return; 
        if (this.ac)
          return; 
        this.x = 0;
        (aa1 = this).a(aa1.an);
        switch ((c[aa1.C]).c) {
          case 0:
          case 1:
          case 2:
          case 3:
            aa1.q++;
            if (aa1.q > 10 + aa1.y % 10 && (aa1.D == null || ds.g(aa1.D.B - aa1.m) > 80) && (aa1.au == null || ds.g(aa1.au.m - aa1.m) > 80))
              aa1.p = 5; 
            break;
          case 4:
          case 5:
            aa1.q++;
            if (aa1.q > aa1.y % 3 && (aa1.D == null || ds.g(aa1.D.B - aa1.m) > 80) && (aa1.au == null || ds.g(aa1.au.m - aa1.m) > 80))
              aa1.p = 5; 
            break;
        } 
        if (aa1.D != null && a.w % (10 + aa1.q % 20) == 0) {
          if (aa1.D.B > aa1.m) {
            aa1.o = 1;
          } else {
            aa1.o = -1;
          } 
        } else if (aa1.au != null && a.w % (10 + aa1.q % 20) == 0) {
          if (aa1.au.m > aa1.m) {
            aa1.o = 1;
          } else {
            aa1.o = -1;
          } 
        } 
        if (aa1.av > 0) {
          aa1.av--;
          aa1.p = 2;
        } 
        return;
      case 4:
        if (this.j != 0)
          return; 
        if (this.ab)
          return; 
        if (this.ac)
          return; 
        if (this.g)
          return; 
        this.x = 0;
        this.q++;
        if (this.q > 40 + this.y % 5) {
          this.n -= 2;
          this.p = 5;
          this.q = 0;
          return;
        } 
        break;
      case 3:
        if (this.j != 0)
          return; 
        if (this.ab)
          return; 
        if (this.ac)
          return; 
        if (this.g)
          return; 
        f();
        return;
      case 5:
        if (this.j != 0)
          return; 
        if (this.ab)
          return; 
        if (this.ac)
          return; 
        if (this.g) {
          if ((c[this.C]).c == 4) {
            this.am++;
            this.ak++;
            this.al += !this.aj ? 1 : -1;
            if (this.ak == 10) {
              this.ak = 0;
              this.aj = !this.aj;
            } 
          } 
          return;
        } 
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
        if (!(aa1 = this).T && a.w % 4 == 0)
          if (aa1.F()) {
            aa1.ai = aa1.as[a.w % aa1.as.length];
          } else if (aa1.D()) {
            aa1.ai = aa1.aq[a.w % aa1.aq.length];
          } else if (aa1.E()) {
            if (aa1.ai != 10) {
              aa1.ai = 10;
            } else {
              aa1.ai = 11;
            } 
          } else if (aa1.e()) {
            if (aa1.ai != 1) {
              aa1.ai = 1;
            } else {
              aa1.ai = 15;
            } 
          } else if (aa1.ai != 10) {
            aa1.ai = 10;
          } else {
            aa1.ai = 11;
          }  
        aa1.x--;
        if (aa1.x <= 0 && (aa1.F() || aa1.D() || (aa1.E() && aa1.ai == 11) || (aa1.e() && aa1.ai == 15) || (aa1.C < 58 && aa1.ai == 11))) {
          if ((aa1.Z != null && aa1.aa) || aa1.k == 0L) {
            aa1.p = 1;
            aa1.r = aa1.Z.I << 1;
            aa1.q = -3;
            aa1.s = 0;
          } else {
            aa1.p = 5;
            if (aa1.Z != null) {
              aa1.o = -aa1.Z.I;
              if (ds.g(aa1.m - aa1.Z.B) < 24)
                aa1.p = 2; 
            } 
            aa1.q = aa1.r = aa1.s = 0;
            aa1.x = 0;
          } 
          aa1.Z = null;
          return;
        } 
        if ((c[aa1.C]).c != 0 && aa1.Z != null) {
          int i = -aa1.Z.I << 1;
          if (aa1.m > aa1.t - (c[aa1.C]).a && aa1.m < aa1.t + (c[aa1.C]).a)
            aa1.m -= i; 
        } 
        break;
    } 
  }
  
  public void d() {
    if (this.k > 0L && this.p != 3 && this.p != 7) {
      this.x = 4;
      this.p = 7;
      if ((z()).c != 0 && ds.g(this.m - this.t) < 30)
        this.m -= 10 * this.o; 
    } 
  }
  
  public static cc w() {
    for (byte b = 0; b < p.F.size(); b++) {
      aa aa1;
      if (aa1 = p.F.elementAt(b) instanceof cc)
        return (cc)aa1; 
    } 
    return null;
  }
  
  public static d x() {
    for (byte b = 0; b < p.F.size(); b++) {
      aa aa1;
      if (aa1 = p.F.elementAt(b) instanceof d)
        return (d)aa1; 
    } 
    return null;
  }
  
  public static an y() {
    for (byte b = 0; b < p.F.size(); b++) {
      aa aa1;
      if (aa1 = p.F.elementAt(b) instanceof an)
        return (an)aa1; 
    } 
    return null;
  }
  
  public static cl a(byte paramByte) {
    aa aa1;
    return (aa1 = p.F.elementAt(paramByte) instanceof cl) ? (cl)aa1 : null;
  }
  
  public void a(af paramaf) {
    this.T = true;
    this.au = null;
    this.D = paramaf;
    this.q = 0;
    this.r = 0;
    this.p = 3;
    this.ah = 0;
    this.o = (paramaf.B > this.m) ? 1 : -1;
    int j = paramaf.B;
    int i = paramaf.C;
    if (ds.g(j - this.m) < this.v << 1 && ds.g(i - this.n) < this.w << 1) {
      this.s = 0;
      return;
    } 
    this.s = 1;
  }
  
  boolean e() {
    return ((this.C >= 58 && this.C <= 65) || this.C == 67 || this.C == 68);
  }
  
  private boolean D() {
    return (this.C == 76);
  }
  
  private boolean E() {
    return (this.C >= 73 && !D());
  }
  
  public void f() {
    af af1;
    int[] arrayOfInt = (this.s == 0) ? this.aq : this.ar;
    if (this.ah < arrayOfInt.length) {
      a(arrayOfInt);
      if (this.m >= p.j && this.m <= p.j + a.A && this.s == 0 && a.w % 2 == 0)
        bu.a(); 
    } 
    if (this.q == 0) {
      int i = (this.D != null) ? this.D.B : this.au.m;
      int j = (this.D != null) ? this.D.C : this.au.n;
      if (!E()) {
        if (this.m > this.t + (c[this.C]).a)
          this.q = 1; 
        if (this.m < this.t - (c[this.C]).a)
          this.q = 1; 
      } 
      if (((c[this.C]).c == 4 || (c[this.C]).c == 5) && !this.z)
        this.n += (j - this.n) / 20; 
      this.r++;
      if (this.r > arrayOfInt.length - 1 || this.q == 1) {
        this.q = 1;
        if (this.s == 0) {
          if (this.D != null) {
            this.D.a(this.E, this.F, false, true);
          } else {
            this.au.d();
          } 
          this.T = false;
        } else {
          if (this.D != null) {
            ah.a(this.m + this.o * this.v, this.n, j(), this.E, this.F, this.D, (z()).g);
          } else {
            (af1 = new af()).B = this.au.m;
            af1.C = this.au.n;
            af1.J = -100;
            ah.a(this.m + this.o * this.v, this.n, j(), this.E, this.F, af1, (z()).g);
          } 
          this.T = false;
        } 
      } 
      this.o = (this.m < i) ? 1 : -1;
    } else if (this.q == 1 && this.ah == af1.length) {
      this.p = 2;
      this.q = 0;
      this.r = 0;
      this.ah = 0;
    } 
    if (this.ah == 5 && this.D != null && this.D.J == (af.e()).J) {
      if (this.C == 88 && this.s != 0)
        p.bu = 2; 
      if (this.C == 89)
        p.bu = 2; 
    } 
  }
  
  public void g() {
    try {
      byte b;
      if (this.aa) {
        this.p = 1;
        this.r = this.Z.I << 3;
        this.q = -5;
        this.s = 0;
      } 
      if (this.A)
        return; 
      if (this.z || this.B) {
        a(this.an);
        return;
      } 
      switch ((c[this.C]).c) {
        case 0:
          if (D()) {
            this.ai = this.an[a.w % this.an.length];
          } else {
            this.ai = 0;
            return;
          } 
          return;
        case 1:
        case 2:
        case 3:
          if ((b = (c[this.C]).b) == 1) {
            if (a.w % 2 == 1)
              return; 
          } else if (b > 2) {
            b = (byte)(b + this.y % 2);
          } else if (a.w % 2 == 1) {
            b = (byte)(b - 1);
          } 
          this.m += b * this.o;
          if (this.m > this.t + (c[this.C]).a) {
            this.o = -1;
          } else if (this.m < this.t - (c[this.C]).a) {
            this.o = 1;
          } 
          if (ds.g(this.m - (af.e()).B) < 40 && ds.g(this.m - this.t) < (c[this.C]).a) {
            this.o = (this.m > (af.e()).B) ? -1 : 1;
            if (ds.g(this.m - (af.e()).B) < 20)
              this.m -= this.o * 10; 
            this.p = 2;
            this.av = 20;
          } 
          a((this.v > 30) ? this.ao : this.ap);
          return;
        case 4:
          b = (byte)((b = (c[this.C]).b) + this.y % 2);
          this.m += b * this.o;
          if (a.w % 10 > 2)
            this.n += b * this.a; 
          if (this.m > this.t + (c[this.C]).a) {
            this.o = -1;
            this.p = 2;
            this.av = a.w % 20 + 20;
            this.q = 0;
          } else if (this.m < this.t - (c[this.C]).a) {
            this.o = 1;
            this.p = 2;
            this.av = a.w % 20 + 20;
            this.q = 0;
          } 
          if (this.n > this.u + 24) {
            this.a = -1;
          } else if (this.n < this.u - 20 + a.w % 10) {
            this.a = 1;
          } 
          a(this.ao);
          return;
        case 5:
          b = (byte)((b = (c[this.C]).b) + this.y % 2);
          this.m += b * this.o;
          b = (byte)(b + (a.w + this.y) % 2);
          if (a.w % 10 > 2)
            this.n += b * this.a; 
          if (this.m > this.t + (c[this.C]).a) {
            this.o = -1;
            this.p = 2;
            this.av = a.w % 20 + 20;
            this.q = 0;
          } else if (this.m < this.t - (c[this.C]).a) {
            this.o = 1;
            this.p = 2;
            this.av = a.w % 20 + 20;
            this.q = 0;
          } 
          if (this.n > this.u + 24) {
            this.a = -1;
          } else if (this.n < this.u - 20 + a.w % 10) {
            this.a = 1;
          } 
          if (bv.a(this.m, this.n, 2)) {
            if (a.w % 10 > 5) {
              this.n = bv.e(this.n);
              this.p = 4;
              this.q = 0;
              this.a = -1;
              return;
            } 
            this.a = -1;
            break;
          } 
          return;
      } 
      return;
    } catch (Exception exception) {}
  }
  
  public final dy z() {
    return c[this.C];
  }
  
  public boolean h() {
    return (this.m < p.j) ? false : ((this.m > p.j + p.d) ? false : ((this.n < p.k) ? false : ((this.n > p.k + p.e + 30) ? false : ((c[this.C] == null) ? false : (((c[this.C]).f == null) ? false : (((c[this.C]).f.a == null) ? false : (!(this.p == 0))))))));
  }
  
  public boolean i() {
    return (c[this.C] == null) ? false : (((c[this.C]).f == null) ? false : (!(this.p == 0)));
  }
  
  public boolean j() {
    return (this.I || this.H > 0);
  }
  
  public final void A() {
    this.V = (int)(this.k * 100L / this.l);
    if (this.V >= 100)
      this.W = this.V; 
    this.at = 0;
    if (this.V < 30) {
      this.X = p.aH;
      return;
    } 
    if (this.V < 60) {
      this.X = p.aI;
      return;
    } 
    this.X = p.aK;
  }
  
  public void a(en paramen) {
    if (this.Y)
      return; 
    if (this.M) {
      if (!this.d) {
        (c[this.C]).f.a(paramen, this.ai, this.N, this.O, (this.o == 1) ? 0 : 1, 2);
        return;
      } 
      bl.b(paramen, this.e, this.N, this.O, (this.o == 1) ? 0 : 2, 33);
      return;
    } 
    if (this.ag && this.p != 0) {
      en en1 = paramen;
      aa aa1 = this;
      byte b = bv.i;
      if (bv.a(aa1.P + b / 2, aa1.Q + 1, 4)) {
        en1.e(aa1.P / b * b, (aa1.Q - 30) / b * b, b, 100);
      } else if (bv.a((aa1.P - b / 2) / b, (aa1.Q + 1) / b) == 0) {
        en1.e(aa1.P / b * b, (aa1.Q - 30) / b * b, 100, 100);
      } else if (bv.a((aa1.P + b / 2) / b, (aa1.Q + 1) / b) == 0) {
        en1.e(aa1.P / b * b, (aa1.Q - 30) / b * b, b, 100);
      } else if (bv.a(aa1.P - b / 2, aa1.Q + 1, 8)) {
        en1.e(aa1.P / 24 * b, (aa1.Q - 30) / b * b, b, 100);
      } 
      en1.a(bv.x, aa1.P, aa1.Q, 3);
      en1.e(p.j, p.k - a.ae, p.d, p.e + 2 * a.ae);
    } 
    if (!h())
      return; 
    if (this.p == 1 && this.s > 0 && a.w % 3 == 0)
      return; 
    paramen.a(0, a.ae);
    if (!this.d) {
      (c[this.C]).f.a(paramen, this.ai, this.m, this.n + this.al, (this.o == 1) ? 0 : 1, 2);
    } else {
      bl.b(paramen, this.e, this.m, this.n + this.al - 9, (this.o == 1) ? 0 : 2, 33);
    } 
    paramen.a(0, -a.ae);
    if ((af.e()).aQ != null && (af.e()).aQ.equals(this) && this.p != 1 && this.k > 0L && this.X != null) {
      int i = en.a(this.X);
      int j = en.b(this.X);
      int k = i * this.V / 100;
      int m = k;
      if (this.W >= this.V) {
        m = i * (this.W -= (a.w % 6 > 3) ? this.at++ : this.at) / 100;
        if (this.W <= 0)
          this.W = 0; 
        if (this.W < this.V)
          this.W = this.V; 
        if (this.at >= 3)
          this.at = 3; 
      } 
      paramen.a(p.aJ, this.m - (i >> 1), this.n - this.w - 5, 20);
      paramen.a(16777215);
      paramen.d(this.m - (i >> 1), this.n - this.w - 5, m, 2);
      paramen.a(this.X, 0, 0, k, j, 0, this.m - (i >> 1), this.n - this.w - 5, 20);
    } 
  }
  
  public void k() {
    this.k = 0L;
    this.aa = true;
    this.k = 0L;
    this.p = 1;
    this.q = -3;
    this.r = -this.o;
    this.s = 0;
  }
  
  public void a(aa paramaa) {
    this.au = paramaa;
    this.T = true;
    this.D = null;
    this.q = 0;
    this.r = 0;
    this.p = 3;
    this.ah = 0;
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
  
  public int l() {
    return this.m;
  }
  
  public int m() {
    return this.n;
  }
  
  public int n() {
    return this.w;
  }
  
  public int o() {
    return this.v;
  }
  
  public void p() {
    if (this.p == 5) {
      this.p = 2;
      this.q = this.r = this.s = 0;
      this.av = 50;
    } 
  }
  
  public boolean q() {
    return !(this.p != 0 && this.p != 1);
  }
  
  public void r() {
    if (this.j != 0)
      this.j = 0; 
  }
  
  public void s() {
    this.ab = false;
  }
  
  public void t() {
    this.ac = false;
  }
  
  public void B() {
    if (this.ax && F() && (c[this.C]).f != null) {
      this.aw = (int[][])ac.d.get((new StringBuffer(String.valueOf(this.C))).toString());
      this.an = this.aw[0];
      this.ao = this.aw[1];
      this.ap = this.aw[2];
      this.aq = this.aw[3];
      this.ar = this.aw[4];
      this.as = this.aw[5];
      this.ax = false;
    } 
  }
  
  private boolean F() {
    return ((c[this.C]).f != null && (c[this.C]).f.e == 2);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\aa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */