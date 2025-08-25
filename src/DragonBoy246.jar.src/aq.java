import javax.microedition.lcdui.Image;
import main.a;

public final class aq extends bb {
  private static aq h;
  
  private static boolean i;
  
  private static df j;
  
  private static df k;
  
  public static df a;
  
  private static Image l;
  
  private static Image m;
  
  private static Image n;
  
  private static Image o;
  
  private static Image p;
  
  private static Image q;
  
  private static Image r;
  
  private static Image s;
  
  private static Image t;
  
  private static Image u;
  
  private static Image v;
  
  private static Image w;
  
  private static Image x;
  
  private static Image y;
  
  private static Image[] z;
  
  private static int A;
  
  private static int B;
  
  private static int C;
  
  private static int D;
  
  private static int E;
  
  private static int F;
  
  public static int b;
  
  public static int c;
  
  public static int d;
  
  private static int G;
  
  public static int e;
  
  private static int H;
  
  private static int[] I = new int[0];
  
  private static int[] J = new int[0];
  
  private static int[][] K;
  
  private static int[][] L;
  
  private static int[] M = new int[] { -2, -1, 1, 2 };
  
  private int N;
  
  private int[] O;
  
  private int P;
  
  private int Q;
  
  private int R = 0;
  
  public static el f;
  
  public static el g;
  
  private static int S;
  
  private ef T;
  
  private int U = 0;
  
  private int V = 0;
  
  private int W;
  
  private int X;
  
  private int Y;
  
  public static aq a() {
    if (h == null)
      h = new aq(); 
    return h;
  }
  
  public aq() {
    i = true;
    Image image1 = l.b("/radar/17.png");
    Image image2 = l.b("/radar/3.png");
    Image image3 = l.b("/radar/23.png");
    j = new df(image1, 28, 28);
    k = new df(image2, 30, 30);
    a = new df(image3, 11, 11);
    l = l.b("/radar/0.png");
    n = l.b("/radar/1.png");
    o = l.b("/radar/2.png");
    m = l.b("/radar/17.png");
    p = l.b("/radar/4.png");
    q = l.b("/radar/5.png");
    r = l.b("/radar/6.png");
    z = new Image[7];
    for (byte b = 0; b < 7; b++)
      z[b] = l.b("/radar/" + (b + 7) + ".png"); 
    s = l.b("/radar/14.png");
    t = l.b("/radar/15.png");
    u = l.b("/radar/16.png");
    m = l.b("/radar/18.png");
    w = l.b("/radar/19.png");
    x = l.b("/radar/20.png");
    y = l.b("/radar/21.png");
    v = l.b("/radar/22.png");
    C = 200;
    D = 219;
    A = a.C - (C + 40) / 2;
    B = a.D - D / 2;
    b = A + C - 81;
    c = B + 29;
    d = 120;
    e = 80;
    K = new int[][] { { A + 34, B + D - 42 }, { A + C / 2 - p.getWidth() / 2, B + D / 2 + 33 }, { A + C - 41, B + D - 42 } };
    L = new int[][] { { A + 25, B + D - 82 }, { A + 57, B + D - 62 }, { A + C / 2 - 14, B + D - 102 }, { A + C - 57 - 28, B + D - 62 }, { A + C - 25 - 28, B + D - 82 } };
    this.O = new int[2];
    this.N = 0;
    E = A + 73;
    F = B + D / 2 + 5;
    H = B + D - 22;
    I = new int[] { A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80 };
    J = new int[3];
    this.X = c + 10 + 70;
    this.Y = 0;
    f = new el("");
    g = new el("");
    this.P = 1;
    this.Q = 2;
  }
  
  public final void a(el paramel, int paramInt1, int paramInt2) {
    f = paramel;
    paramInt1 = paramInt2;
    S = paramInt1 = paramInt1;
    this.P = 1;
    this.R = 2;
    f();
    i = true;
    e();
    if (i) {
      this.Q = paramel.size() / 5 + ((paramel.size() % 5 > 0) ? 1 : 0);
      return;
    } 
    this.Q = g.size() / 5 + ((g.size() % 5 > 0) ? 1 : 0);
  }
  
  public static void a(int paramInt1, int paramInt2) {
    S = paramInt1;
  }
  
  public static void e() {
    g = new el("");
    for (byte b = 0; b < f.size(); b++) {
      ef ef1;
      if ((ef1 = f.elementAt(b)) != null && ef1.k == 1)
        g.addElement(ef1); 
    } 
  }
  
  private void f() {
    el el1 = g;
    if (i)
      el1 = f; 
    int i;
    int j = (i = (this.P - 1) * 5) + 5;
    for (int k = i; k < j; k++) {
      if (k >= el1.size()) {
        M[k - i] = -1;
      } else {
        ef ef1;
        if ((ef1 = el1.elementAt(k)) != null)
          M[k - i] = ef1.e; 
      } 
    } 
    bu.a();
  }
  
  public final void c() {
    try {
      if (e < 80 && (e += 4) > 80)
        e = 80; 
      this.T = ef.a(g, M[this.R]);
      if (i)
        this.T = ef.a(f, M[this.R]); 
      p.j().c();
      if (a.w % 10 < 6) {
        if (a.w % 2 == 0)
          this.N--; 
      } else {
        this.N = 0;
      } 
      if (this.T != null) {
        int i = this.T.b * 100 / this.T.c;
        this.Y = i * w.getHeight() / 100;
        i = S * 100 / f.size();
        this.W = i * y.getWidth() / 100;
        return;
      } 
    } catch (Exception exception) {
      System.out.println("-upd-radaScr-null: " + exception.toString());
    } 
  }
  
  public final void d() {
    if (bp.b)
      return; 
    if (a.e && !(cq.b()).b && !a.F.a) {
      aq aq1 = this;
      if (a.l) {
        byte b;
        for (b = 0; b < 5; b++) {
          if (a.a(L[b][0], L[b][1], 30, 30) && a.l && a.m && b != aq1.R) {
            byte b1 = b;
            aq aq2;
            (aq2 = aq1).R = b1;
            aq2.f();
          } 
        } 
        if (a.a(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
          if (a.k)
            aq1.O[0] = 1; 
          if (a.l && a.m) {
            aq1.c(0);
            aq1.O[0] = 0;
          } 
        } 
        if (a.a(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
          if (a.k)
            aq1.O[1] = 1; 
          if (a.l && a.m) {
            aq1.c(1);
            aq1.O[1] = 0;
          } 
        } 
        for (b = 0; b < I.length; b++) {
          if (a.a(I[b] - 5, H - 5, 20, 20)) {
            if (a.k)
              J[b] = 1; 
            if (a.l && a.m) {
              aq1.b(b);
              J[b] = 0;
            } 
          } 
        } 
      } else {
        J[0] = 0;
        J[1] = 0;
        J[2] = 0;
        aq1.O[0] = 0;
        aq1.O[1] = 0;
      } 
      if (a.a(b, 0, d, c + e))
        if (a.n) {
          if (aq1.V == 0)
            aq1.V = a.q; 
          aq1.U = aq1.V - a.q;
          if (aq1.U != 0) {
            G += aq1.U;
            aq1.V = a.q;
          } 
          if (G < 0)
            G = 0; 
          if (G > aq1.T.r.h)
            G = aq1.T.r.h; 
        } else {
          aq1.V = 0;
          aq1.V = 0;
        }  
    } 
    if (a.i[8]) {
      a.i[8] = false;
      d(1);
    } 
    if (a.i[2]) {
      a.i[2] = false;
      d(-1);
    } 
    if (a.i[4]) {
      a.i[4] = false;
      e(1);
    } 
    if (a.i[6]) {
      a.i[6] = false;
      e(0);
    } 
    if (a.i[12]) {
      a.i[12] = false;
      b(0);
    } 
    if (a.i[5]) {
      a.i[5] = false;
      b(1);
    } 
    if (a.i[13])
      b(2); 
    a.f();
  }
  
  private void b(int paramInt) {
    aq aq1;
    if (paramInt == 0) {
      aq1 = this;
      i = !i;
      aq1.P = 1;
      aq1.R = 0;
      if (i) {
        aq1.Q = f.size() / 5 + ((f.size() % 5 > 0) ? 1 : 0);
      } else {
        aq1.Q = g.size() / 5 + ((g.size() % 5 > 0) ? 1 : 0);
      } 
      aq1.f();
      e = 0;
    } else if (aq1 == true) {
      if (this.T != null)
        bt.a().b(1, this.T.e); 
    } else if (aq1 == 2) {
      p.j().b();
    } 
    bu.a();
  }
  
  private void c(int paramInt) {
    if (i) {
      this.Q = f.size() / 5 + ((f.size() % 5 > 0) ? 1 : 0);
    } else {
      this.Q = g.size() / 5 + ((g.size() % 5 > 0) ? 1 : 0);
    } 
    int i = this.P;
    if (paramInt == 0) {
      if (this.P == 1)
        return; 
      if (--i <= 0)
        i = 1; 
    } else {
      if (this.P == this.Q)
        return; 
      if (++i > this.Q)
        i = this.Q; 
    } 
    if (i != this.P) {
      this.P = i;
      f();
    } 
  }
  
  private void d(int paramInt) {
    if ((G += paramInt * 12) < 0)
      G = 0; 
    if (G > this.T.r.h)
      G = this.T.r.h; 
  }
  
  private void e(int paramInt) {
    int i = this.R;
    int j = this.P;
    if (paramInt == 0) {
      i++;
    } else {
      i--;
    } 
    if (i >= M.length)
      if (this.P < this.Q) {
        i = 0;
        j++;
      } else {
        i = M.length - 1;
      }  
    if (i < 0)
      if (this.P > 1) {
        i = M.length - 1;
        j--;
      } else {
        i = 0;
      }  
    if (i != this.R) {
      this.R = i;
      G = 0;
      e = 0;
    } 
    if (j != this.P) {
      this.P = j;
      f();
    } 
  }
  
  public final void a(en paramen) {
    try {
      p.j().a(paramen);
      paramen.a(-p.j, -p.k);
      paramen.a(0, a.ae);
      p.c(paramen);
      paramen.a(l, A, B, 0);
      paramen.a(x, A + C / 2 - l.a(x) / 2, B - l.b(x) / 2 - 2, 0);
      paramen.e(A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, this.W, l.b(x));
      paramen.a(y, A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, 0);
      p.c(paramen);
      paramen.a(u, I[0], H + J[0], 0);
      paramen.a(r, I[1], H + J[1], 0);
      paramen.a(t, I[2], H + J[2], 0);
      if (i) {
        paramen.a(s, 0, 0, 17, 17, 0, I[1], H + J[1], 0);
      } else {
        paramen.a(s, 0, 0, 17, 17, 1, I[1], H + J[1], 0);
      } 
      if (this.T != null) {
        paramen.e(A + 30, B + 13, C - 60, D / 2);
        int j = F;
        int i = E;
        en en1 = paramen;
        ef ef1;
        (ef1 = this.T).p++;
        if (ef1.p > ef1.o.length - 1)
          ef1.p = 0; 
        if (ef1.d == 0) {
          if (aa.c[ef1.m.C] != null)
            if ((aa.c[ef1.m.C]).f != null) {
              (aa.c[ef1.m.C]).f.a(en1, ef1.o[ef1.p], i, j, 0, 0);
            } else if (ef1.q - a.b < 0L) {
              ef1.q = a.b + 1500L;
              ef1.m.v();
            }  
        } else if (ef1.l != null) {
          ef1.l.a(en1, i, j, 1, ef1.o[ef1.p], true);
        } 
        p.c(paramen);
        di.d.a(paramen, String.valueOf((this.T.j > 0) ? ("Lv." + this.T.j + " ") : "") + this.T.h, A + C / 2, B + 15, 2);
        di.s.a(paramen, "no." + this.T.f, A + 30, c - 2, 0);
        paramen.a(v, A + 36, c + 10, 0);
        paramen.e(A + 36, this.X - this.Y, 7, this.Y);
        paramen.a(w, A + 36, c + 10, 0);
        p.c(paramen);
        paramen.a(z[this.T.a], A + 39 - 5 + 14, c + 12, 0);
      } 
      paramen.e(b, c, d + 5, e + 8);
      if (this.T != null)
        paramen.a(m, b, c, 0); 
      p.c(paramen);
      paramen.e(b, c + 1, d, e + 5);
      if (this.T != null && this.T.r != null && this.T.r.d != null)
        this.T.r.a(paramen, G); 
      p.c(paramen);
      if ((!i && g.size() > 5) || i) {
        if (this.P > 1)
          paramen.a(n, K[0][0], K[0][1] + this.O[0], 0); 
        if (this.P < this.Q)
          paramen.a(o, K[2][0], K[2][1] + this.O[1], 0); 
      } 
      for (byte b = 0; b < M.length; b++) {
        int i = 0;
        byte b1 = 0;
        boolean bool = false;
        if (b == this.R) {
          i = this.N;
          b1 = -10;
          bool = true;
          paramen.a(p, L[b][0] + 10, L[b][1] + this.N + 29 + -10, 0);
        } 
        ef ef1 = ef.a(g, M[b]);
        if (i)
          ef1 = ef.a(f, M[b]); 
        if (ef1 != null) {
          j.a(ef1.a, L[b][0], L[b][1] + i + b1, 0, 0, paramen);
          bl.b(paramen, ef1.g, L[b][0] + 14, L[b][1] + 14 + i + b1, 0, cj.f);
          ef1.a(paramen, L[b][0], L[b][1] + i + b1);
          if (ef1.j == 0)
            paramen.a(q, L[b][0], L[b][1] + i + b1, 0); 
          if (b == this.R)
            j.a(7, L[b][0], L[b][1] + i + b1, 0, 0, paramen); 
          if (ef1.k == 1)
            j.a(8, L[b][0], L[b][1] + i + b1, 0, 0, paramen); 
        } else {
          k.a(bool, L[b][0] - 1, L[b][1] - 1 + i + b1, 0, 0, paramen);
        } 
      } 
      return;
    } catch (Exception exception) {
      System.out.println("-paint-radaScr-null: " + exception.toString());
      return;
    } 
  }
  
  public final void b() {
    p.a = true;
    super.b();
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */