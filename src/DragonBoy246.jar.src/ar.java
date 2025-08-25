import javax.microedition.lcdui.Image;
import main.a;

public final class ar extends bb implements b {
  public static ar a;
  
  private eb[] f;
  
  byte b = 0;
  
  private byte g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  int c;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w = 0;
  
  private int x = 0;
  
  private int y;
  
  private int z;
  
  private int[] A;
  
  private int[] B;
  
  private int[] C;
  
  private int[] D;
  
  private short[] E;
  
  private long F;
  
  private long G;
  
  private boolean H;
  
  private boolean I;
  
  private boolean J;
  
  private short K;
  
  private static int L;
  
  private static int[] M;
  
  private static df N;
  
  private static df O;
  
  private static Image P;
  
  private static Image Q;
  
  public static boolean d = false;
  
  public static boolean e = false;
  
  private byte[] R = new byte[] { 
      19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 
      19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 
      20 };
  
  private byte[] S = new byte[] { 
      0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 
      3, 3 };
  
  public ar() {
    (M = new int[3])[0] = 16;
    L = a.B - 41;
    M[1] = a.A - 40;
    M[2] = (M[0] + M[1]) / 2;
    Image image = l.b("/e/e_1.png");
    N = new df(image, 30, 30);
    image = l.b("/e/e_0.png");
    O = new df(image, 68, 65);
    image = l.b("/e/e_2.png");
    Q = l.b("/e/nut2.png");
    P = l.b("/e/nut3.png");
    this.s = 230;
    this.q = a.C - this.s / 2;
    this.t = 40;
    this.r = -this.t;
  }
  
  public static ar a() {
    if (a == null)
      a = new ar(); 
    return a;
  }
  
  public final void a(short[] paramArrayOfshort, byte paramByte, int paramInt, short paramShort) {
    if (paramArrayOfshort == null || paramArrayOfshort.length <= 0)
      return; 
    this.n = (af.e()).C - 10;
    ar ar2;
    (ar2 = this).h = a.D / 3 + 10;
    if (ar2.h > 50)
      ar2.h = 50; 
    ar2.i = 360;
    p.j = p.n / 2;
    ar2.j = p.k + a.D / 3 + 30;
    ar2.m = 175;
    ar2.k = 0;
    ar2.l = 360 / ar2.m;
    ar2.A = new int[ar2.m];
    ar2.B = new int[ar2.m];
    ar2.C = new int[ar2.m];
    ar2.D = new int[ar2.m];
    ar ar1 = ar2;
    if (!a.a)
      for (byte b2 = 0; b2 < ar1.B.length; b2++) {
        ar1.B[b2] = ds.g(ar1.h * ds.a(ar1.k) / 1024);
        ar1.A[b2] = ds.g(ar1.h * ds.b(ar1.k) / 1024);
        if (ar1.k < 90) {
          ar1.C[b2] = ar1.i + ar1.A[b2];
          ar1.D[b2] = ar1.j - ar1.B[b2];
        } else if (ar1.k >= 90 && ar1.k < 180) {
          ar1.C[b2] = ar1.i - ar1.A[b2];
          ar1.D[b2] = ar1.j - ar1.B[b2];
        } else if (ar1.k >= 180 && ar1.k < 270) {
          ar1.C[b2] = ar1.i - ar1.A[b2];
          ar1.D[b2] = ar1.j + ar1.B[b2];
        } else {
          ar1.C[b2] = ar1.i + ar1.A[b2];
          ar1.D[b2] = ar1.j + ar1.B[b2];
        } 
        ar1.k += ar1.l;
      }  
    this.f = new eb[paramArrayOfshort.length];
    for (byte b1 = 0; b1 < this.f.length; b1++) {
      this.f[b1] = new eb();
      (this.f[b1]).i = paramArrayOfshort[b1];
      (this.f[b1]).e = b1 * 25;
      (this.f[b1]).d = -999;
      (this.f[b1]).g = ds.b(2, 5);
      (this.f[b1]).h = ds.b(-1, 2);
      eb eb1;
      (eb1 = this.f[b1]).m = new af();
      eb1.m.J = ds.b(-999, -800);
      eb1.m.bU = -1;
      eb1.m.bW = -1;
      eb1.m.bV = -1;
      eb1.m.bX = -1;
      eb1.m.ag = "";
      eb1.m.U = eb1.m.V = 20L;
    } 
    this.I = false;
    this.H = false;
    this.J = false;
    this.F = a.b + ds.b(1000, 2000);
    this.b = 0;
    this.o = -1;
    this.c = -1;
    this.g = paramByte;
    this.u = paramInt;
    this.v = 0;
    af.e().b(470, 408, 1);
    (af.e()).I = -1;
    (af.e()).H = 1;
    this.w = 0;
    this.x = 0;
    this.y = 0;
    this.z = 0;
    this.r = -this.t;
    this.K = paramShort;
    this.p = 0;
    h();
    b();
    bu.a();
  }
  
  public final void a(int paramInt, Object paramObject) {}
  
  public final void c() {
    try {
      this.v = this.u * g();
      h();
      p.j().c();
      if (this.F - a.b > 0L) {
        for (byte b1 = 0; b1 < this.f.length; b1++) {
          (this.f[b1]).e += 2;
          if ((this.f[b1]).e >= this.m)
            (this.f[b1]).e = 0; 
          (this.f[b1]).a = this.C[(this.f[b1]).e];
          (this.f[b1]).b = this.D[(this.f[b1]).e];
        } 
        return;
      } 
      if (this.b == 0)
        this.b = 1; 
      if (this.b == 1)
        for (byte b1 = 0; b1 < this.f.length; b1++) {
          if ((this.f[b1]).d != -999 && !(this.f[b1]).k) {
            if ((this.f[b1]).b < (this.f[b1]).d) {
              if ((this.f[b1]).f < 0)
                (this.f[b1]).f = 0; 
              if ((this.f[b1]).b + (this.f[b1]).f > (this.f[b1]).d) {
                (this.f[b1]).b = (this.f[b1]).d;
              } else {
                (this.f[b1]).b += (this.f[b1]).f;
              } 
              (this.f[b1]).f++;
            } else {
              if ((this.f[b1]).f > 0)
                (this.f[b1]).f = 0; 
              (this.f[b1]).b += (this.f[b1]).f;
              (this.f[b1]).f--;
            } 
            if ((this.f[b1]).b == (this.f[b1]).d) {
              ea ea;
              ei.a(ea = new ea(19, (this.f[b1]).a - 5, (this.f[b1]).b + 25, 2, 1, -1));
              bu.a();
              (this.f[b1]).k = true;
              if (!this.I)
                this.I = true; 
            } 
          } 
        }  
      if (this.b == 2) {
        for (byte b1 = 0; b1 < this.f.length; b1++) {
          if (!(this.f[b1]).k) {
            if ((this.f[b1]).b > -10) {
              if ((this.f[b1]).f > 0)
                (this.f[b1]).f = 0; 
              (this.f[b1]).b += (this.f[b1]).f;
              (this.f[b1]).f--;
              (this.f[b1]).a += (this.f[b1]).g * (this.f[b1]).h;
              (this.f[b1]).g -= 3;
            } 
            if ((this.f[b1]).b == -10)
              (this.f[b1]).j = false; 
          } 
        } 
        this.w++;
        if (this.w > this.R.length - 1) {
          this.w = this.R.length - 1;
          this.H = true;
          bu.a();
          if (!this.J && this.G - a.b < 0L) {
            bt.a().c((byte)2, (byte)(f() + g()));
            this.J = true;
          } 
        } 
        (af.e()).as = this.R[this.w];
        this.x++;
        if (this.x > 5)
          this.x = 0; 
        this.y = this.S[this.x];
      } 
      if (this.b == 3) {
        if (this.x <= 5)
          this.x = 5; 
        this.x++;
        if (this.x > this.S.length - 1) {
          this.x = this.S.length - 1;
          this.b = 4;
          this.H = false;
          byte b1 = 0;
          for (byte b2 = 0; b2 < this.f.length; b2++) {
            if ((this.f[b2]).k && !(this.f[b2]).l) {
              (this.f[b2]).i = this.E[b1];
              (this.f[b2]).l = true;
              b1++;
            } 
          } 
        } 
        this.y = this.S[this.x];
      } 
      if (this.b == 4) {
        for (byte b1 = 0; b1 < this.f.length; b1++) {
          if ((this.f[b1]).j)
            (this.f[b1]).c = (af.e()).B; 
        } 
        this.b = 5;
      } 
      if (this.b == 5) {
        this.z++;
        if (this.r < a.D / 3)
          if (this.r + this.z > a.D / 3) {
            this.r = a.D / 3;
          } else {
            this.r += this.z;
          }  
        for (byte b1 = 0; b1 < this.f.length; b1++) {
          if ((this.f[b1]).j) {
            if ((this.f[b1]).a < (this.f[b1]).c) {
              if ((this.f[b1]).g < 0)
                (this.f[b1]).g = 0; 
              if ((this.f[b1]).a + (this.f[b1]).g > (this.f[b1]).c) {
                (this.f[b1]).a = (this.f[b1]).c;
              } else {
                (this.f[b1]).a += (this.f[b1]).g;
              } 
              (this.f[b1]).g++;
            } else {
              if ((this.f[b1]).g > 0)
                (this.f[b1]).g = 0; 
              (this.f[b1]).a += (this.f[b1]).g;
              (this.f[b1]).g--;
            } 
            if ((this.f[b1]).a == (this.f[b1]).c)
              (this.f[b1]).j = false; 
          } 
        } 
        return;
      } 
    } catch (Exception exception) {
      System.out.println("-upd--null: " + exception.toString());
    } 
  }
  
  public final void d() {
    if (bp.b)
      return; 
    if (a.e && !(cq.b()).b && !a.F.a) {
      ar ar1;
      if ((ar1 = this).b == 1 && a.l)
        for (byte b2 = 0; b2 < ar1.f.length; b2++) {
          if (a.a((ar1.f[b2]).a - 20 - p.j, (ar1.f[b2]).b - 10 - p.k, 30, 30) && a.l && a.m)
            ar1.b(b2); 
        }  
      if (a.l)
        for (byte b2 = 0; b2 < M.length; b2++) {
          if (a.a(M[b2], L, 36, 36) && a.l && a.m)
            if (!d || b2 == 2) {
              ar1.c(b2);
            } else {
              break;
            }  
        }  
    } 
    if (d && !a.i[0]) {
      a.g();
      a.f();
    } 
    if (a.i[0])
      c(2); 
    for (byte b1 = 1; b1 < 8; b1++) {
      if (a.i[b1]) {
        a.i[b1] = false;
        b(b1 - 1);
      } 
    } 
    if (a.i[12]) {
      a.i[12] = false;
      c(0);
    } 
    if (a.i[13]) {
      a.i[13] = false;
      c(1);
    } 
    a.f();
  }
  
  private void b(int paramInt) {
    String str;
    if ((this.f[paramInt]).k)
      return; 
    bu.a();
    long l = (this.g == 0) ? (af.e()).at : af.e().Y();
    if (f() >= this.p && l < (this.v + this.u)) {
      str = String.valueOf(aw.j) + " " + ((this.g == 0) ? aw.bC : aw.bD);
      p.aD.a(str, 0);
      return;
    } 
    this.o = str;
    (this.f[this.o]).d = this.n + ds.b(-3, 3);
  }
  
  private void c(int paramInt) {
    Thread thread;
    this.c = paramInt;
    if (this.c == 2) {
      if (d = !d) {
        ar ar1 = this;
        (thread = new Thread(new dj(ar1))).start();
        return;
      } 
      e = true;
      return;
    } 
    if (thread == null) {
      if (this.b < 2) {
        if (f() + g() > 0) {
          this.b = 2;
          bu.a();
          af.e().a(p.u[13], 0);
          this.G = a.b + ds.b(2000, 3000);
          return;
        } 
      } else if (this.r == a.D / 3) {
        bt.a().c(this.g, (byte)0);
        return;
      } 
    } else {
      if (d)
        e(); 
      (p.j()).bb = false;
      p.j().b();
    } 
  }
  
  public final void a(en paramen) {
    try {
      p.j().a(paramen);
      paramen.a(-p.j, -p.k);
      paramen.a(0, a.ae);
      int i;
      for (i = 0; i < this.f.length; i++) {
        if ((this.f[i]).j && (this.f[i]).b > (this.f[i]).d - 20)
          paramen.a(bv.x, (this.f[i]).a, (this.f[i]).d + 7, 3); 
      } 
      for (i = 0; i < this.f.length; i++) {
        if ((this.f[i]).j)
          bl.b(paramen, (this.f[i]).i, (this.f[i]).a, (this.f[i]).b, 0, 3); 
      } 
      if (this.H) {
        if (N != null) {
          i = (af.e()).B - N.a - 28;
          for (byte b1 = 0; b1 < a.A / N.a + 1; b1++)
            N.a(this.y, i - b1 * (N.a - 1), (af.e()).C - N.b / 2 - 12 + 2, 0, 0, paramen); 
        } 
        if (O != null) {
          i = (af.e()).B - O.a - 10;
          O.a(this.y, i - 5, (af.e()).C - O.b / 2 - 12, 0, 0, paramen);
        } 
      } 
      p.c(paramen);
      int j = a.A - 240;
      paramen.a(13524492);
      paramen.d(j, 0, 240, 15);
      paramen.a(g.w, j + 11, 8, 3);
      paramen.a(g.y, j + 90, 7, 3);
      di.n.a(paramen, (new StringBuffer(String.valueOf((af.e()).o))).toString(), j + 24, 2, 0, di.o);
      di.n.a(paramen, (new StringBuffer(String.valueOf((af.e()).p))).toString(), j + 100, 2, 0, di.o);
      paramen.a(g.z, j + 150, 8, 3);
      di.n.a(paramen, (new StringBuffer(String.valueOf((af.e()).q))).toString(), j + 160, 2, 0, di.o);
      paramen.a(g.x, j + 200, 8, 3);
      di.n.a(paramen, (new StringBuffer(String.valueOf(this.p))).toString(), j + 210, 2, 0, di.o);
      if (this.b < 4) {
        j = a.A - 140;
        paramen.a(11837316);
        paramen.d(j, 15, 140, 15);
        if (this.g == 0) {
          paramen.a(g.w, j + 21, 23, 3);
        } else {
          paramen.a(g.z, j + 21, 22, 3);
          paramen.a(g.y, j + 18, 22, 3);
        } 
        di.p.a(paramen, "-" + this.v, j + 30, 17, 0, di.o);
        paramen.a(g.x, j + 80, 22, 3);
        di.p.a(paramen, "-" + f(), j + 90, 17, 0, di.o);
      } 
      paramen.a(p.au, M[0], L, 0);
      if (this.c == 0)
        paramen.a(p.av, M[0], L, 0); 
      if (this.b < 3) {
        bl.b(paramen, 540, M[0] + 14, L + 14, 0, cj.f);
      } else {
        paramen.a(Q, M[0] + 14 - 10, L + 14 - 10, 0);
      } 
      paramen.a(p.au, M[1], L, 0);
      if (this.c == 1)
        paramen.a(p.av, M[1], L, 0); 
      paramen.a(P, M[1] + 14 - 10, L + 14 - 10, 0);
      if (this.b > 3) {
        cx.c(this.q, this.r, this.s, this.t, paramen);
        i = a.C - this.E.length * 30 / 2;
        for (j = 0; j < this.E.length; j++)
          bl.b(paramen, this.E[j], i + 5 + j * 30, this.r + 10, 0, 0); 
      } 
      if (d) {
        paramen.a(p.av, (M[0] + M[1]) / 2, L, 0);
      } else {
        paramen.a(p.au, (M[0] + M[1]) / 2, L, 0);
      } 
      bl.b(paramen, 4387, (M[0] + M[1]) / 2 + 14, L + 14, 0, cj.f);
      return;
    } catch (Exception exception) {
      System.out.println("-paint--null: " + exception.toString());
      return;
    } 
  }
  
  public final void a(short[] paramArrayOfshort) {
    this.b = 3;
    this.E = paramArrayOfshort;
  }
  
  public final void b() {
    p.a = true;
    (p.j()).bb = true;
    super.b();
  }
  
  private byte f() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.f.length; b2++) {
      if ((this.f[b2]).k)
        b1 = (byte)(b1 + 1); 
    } 
    if (b1 > this.p)
      b1 = (byte)this.p; 
    return b1;
  }
  
  private byte g() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.f.length; b2++) {
      if ((this.f[b2]).k)
        b1 = (byte)(b1 + 1); 
    } 
    if ((b1 = (byte)(b1 - f())) <= 0)
      b1 = 0; 
    return b1;
  }
  
  private void h() {
    for (byte b1 = 0; b1 < (af.e()).aF.length; b1++) {
      if ((af.e()).aF[b1] != null && ((af.e()).aF[b1]).b.a == this.K) {
        this.p = ((af.e()).aF[b1]).h;
        return;
      } 
    } 
  }
  
  public final void e() {
    d = false;
    this.c = -1;
    e = false;
  }
  
  static void a(ar paramar, int paramInt) {
    paramar.b(paramInt);
  }
  
  static void a(ar paramar) {
    if ((paramar = paramar).b < 2) {
      if (paramar.f() + paramar.g() > 0) {
        paramar.b = 2;
        bu.a();
        af.e().a(p.u[13], 0);
        paramar.G = a.b + ds.b(2000, 3000);
        return;
      } 
    } else if (paramar.r == a.D / 3) {
      bt.a().c(paramar.g, (byte)0);
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ar.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */