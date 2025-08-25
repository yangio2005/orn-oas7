import javax.microedition.lcdui.Image;
import main.a;

public final class ed {
  public static el a = new el("vBG Effect");
  
  private int[] g;
  
  private int[] h;
  
  private int[] i;
  
  private int[] j;
  
  private static int[] k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private boolean u;
  
  private static Image v;
  
  private static Image w;
  
  private static Image x;
  
  private static Image y;
  
  private static Image z;
  
  private static Image A;
  
  private static Image B;
  
  private static Image C;
  
  private int[] D;
  
  private int E;
  
  public int b;
  
  private boolean[] F;
  
  private int[] G;
  
  private int[] H;
  
  private boolean[] I;
  
  private int J;
  
  private int K;
  
  private static int L = 16;
  
  private static Image M = l.b("/mainImage/myTexture2dwater1.png");
  
  private static Image N = l.b("/mainImage/myTexture2dwater2.png");
  
  private static Image O;
  
  private static Image P;
  
  public static short c;
  
  private static Image Q = null;
  
  public static boolean d;
  
  private static boolean R;
  
  public static int e;
  
  private static Image S;
  
  private static Image T;
  
  private static int U;
  
  private static int V;
  
  public static int f;
  
  private static int W;
  
  private int[] X;
  
  private int[] Y;
  
  public static void a() {
    bv.H = 0;
  }
  
  public static boolean b() {
    for (byte b = 0; b < a.size(); b++) {
      ed ed1;
      if ((ed1 = a.elementAt(b)).b == 0 || ed1.b == 12)
        return true; 
    } 
    return false;
  }
  
  private ed(int paramInt) {
    int i;
    this.X = new int[] { 0, 1, 2, 1 };
    this.b = paramInt;
    switch (this.b) {
      case 10:
        this.l = 30;
        this.g = new int[this.l];
        this.h = new int[this.l];
        k = new int[this.l];
        this.i = new int[this.l];
        paramInt = 0;
        for (i = 0; i < this.l; i++) {
          this.g[i] = ds.g(ds.b(0, a.A)) + p.j;
          if (++paramInt > this.l / 2) {
            this.h[i] = ds.g(ds.b(20, 60));
            k[i] = 10;
          } else {
            this.h[i] = ds.g(ds.b(0, 20));
            k[i] = 7;
          } 
          this.i[i] = k[i] / 2 - 2;
        } 
        return;
      case 9:
        if (O == null)
          O = l.a("/bg/cham-tron1.png"); 
        if (P == null)
          P = l.a("/bg/cham-tron2.png"); 
        this.l = 20;
        this.g = new int[this.l];
        this.h = new int[this.l];
        k = new int[this.l];
        this.i = new int[this.l];
        for (i = 0; i < this.l; i++) {
          this.g[i] = ds.g(ds.b(0, a.A));
          this.h[i] = ds.g(ds.b(10, 80));
          k[i] = ds.g(ds.b(1, 3));
          this.i[i] = k[i];
        } 
        return;
      case 0:
      case 12:
        if (v == null)
          v = l.a("/bg/mua.png"); 
        if (w == null)
          w = l.a("/bg/mua1.png"); 
        if (x == null)
          x = l.a("/bg/mua2.png"); 
        this.E = ds.b(a.A / 3, a.A / 2);
        this.g = new int[this.E];
        this.h = new int[this.E];
        this.i = new int[this.E];
        this.j = new int[this.E];
        this.D = new int[this.E];
        this.H = new int[this.E];
        this.G = new int[this.E];
        this.F = new boolean[this.E];
        this.I = new boolean[this.E];
        for (i = 0; i < this.E; i++) {
          this.h[i] = ds.b(-10, a.B + 100) + p.k;
          this.g[i] = ds.b(-10, a.A + 300) + p.j;
          this.H[i] = ds.b(0, 1);
          this.i[i] = -12;
          this.j[i] = 12;
          this.D[i] = ds.b(1, 3);
          this.F[i] = false;
          if (this.D[i] == 2 && i % 2 == 0)
            this.F[i] = true; 
          this.I[i] = false;
          this.G[i] = ds.b(1, 2);
        } 
        return;
      case 1:
      case 2:
      case 5:
      case 6:
      case 7:
      case 11:
      case 15:
        if (this.b == 1) {
          z = l.a("/bg/lacay.png");
          L = 10;
        } 
        if (this.b == 2) {
          z = l.a("/bg/lacay2.png");
          L = 18;
        } 
        if (this.b == 5) {
          z = l.a("/bg/lacay3.png");
          L = 14;
        } 
        if (this.b == 6) {
          z = l.a("/bg/lacay4.png");
          L = 14;
        } 
        if (this.b == 7) {
          z = l.a("/bg/lacay5.png");
          L = 12;
        } 
        if (this.b == 11)
          z = l.a("/bg/tuyet.png"); 
        if (this.b == 15) {
          eg eg;
          if ((eg = bl.c[11120]) == null)
            bl.a(11120); 
          L = 16;
        } 
        this.E = ds.b(15, 25);
        if (this.b == 11)
          this.E = 100; 
        this.g = new int[this.E];
        this.h = new int[this.E];
        this.i = new int[this.E];
        this.j = new int[this.E];
        this.H = new int[this.E];
        this.G = new int[this.E];
        this.I = new boolean[this.E];
        for (i = 0; i < this.E; i++) {
          this.g[i] = ds.b(-10, bv.c + 10);
          this.h[i] = ds.b(0, bv.d);
          this.G[i] = ds.b(0, 1);
          this.H[i] = ds.b(0, 1);
          this.i[i] = ds.b(-3, 3);
          this.j[i] = ds.b(1, 4);
          if (this.b == 11) {
            this.G[i] = ds.b(0, 2);
            this.i[i] = ds.g(ds.b(1, 3));
            this.j[i] = ds.g(ds.b(1, 3));
          } 
          if (this.b == 15) {
            this.G[i] = ds.b(0, 2);
            this.i[i] = ds.g(ds.b(1, 3));
            this.j[i] = ds.g(ds.b(1, 3));
          } 
        } 
        return;
      case 4:
        this.E = ds.b(5, 10);
        if (y == null)
          y = l.a("/bg/sao.png"); 
        this.g = new int[this.E];
        this.h = new int[this.E];
        this.G = new int[this.E];
        this.H = new int[this.E];
        this.Y = new int[this.E];
        for (i = 0; i < this.E; i++) {
          this.g[i] = ds.b(0, a.A);
          this.h[i] = ds.b(0, 50);
          if (i % 2 == 0) {
            this.Y[i] = 0;
          } else if (i % 3 == 0) {
            this.Y[i] = 1;
          } else if (i % 4 == 0) {
            this.Y[i] = 2;
          } else {
            this.Y[i] = 3;
          } 
          this.H[i] = ds.b(0, 10);
        } 
        return;
      case 3:
        a.ac = true;
        return;
      case 8:
        this.s = ds.b(100, 300);
        if (A == null)
          A = l.a("/bg/ship.png"); 
        if (B == null)
          B = l.a("/bg/fire1.png"); 
        if (C == null)
          C = l.a("/bg/fire2.png"); 
        this.u = false;
        e();
        return;
      case 13:
        if ((i = ds.g(ds.b(0, 2))) == 0) {
          if ((paramInt = ds.g(ds.b(0, 2))) == 0) {
            R = true;
          } else {
            R = false;
          } 
          e = ds.g(ds.b(2, 5));
          d();
          return;
        } 
        break;
      case 14:
        if ((paramInt = ds.g(ds.b(0, 2))) == 0) {
          d = true;
          d();
        } 
        break;
    } 
  }
  
  private static void d() {
    if (l.c == 1) {
      S = null;
      T = null;
      return;
    } 
    if (a.a) {
      S = null;
      T = null;
      return;
    } 
    if (e > 0) {
      if (S == null)
        U = (S = l.b("/bg/fog1.png")).getWidth(); 
    } else {
      S = null;
    } 
    if (!d) {
      T = null;
      return;
    } 
    if (T == null)
      T = l.b("/bg/fog0.png"); 
    W = 287;
  }
  
  private static void g(en paramen) {
    if (l.c == 1)
      return; 
    if (a.a)
      return; 
    if (e == 0)
      return; 
    if (S != null)
      for (byte b = 0; b < e; b++)
        paramen.a(S, a.aa[b], a.ab[b], 3);  
  }
  
  public static void a(en paramen) {
    if (l.c == 1)
      return; 
    if (a.a)
      return; 
    if (!d)
      return; 
    if (T != null)
      for (int i = V; i < bv.c; i += W) {
        if (i >= p.j - W)
          paramen.a(T, i, f, 0); 
      }  
  }
  
  private void e() {
    // Byte code:
    //   0: getstatic p.j : I
    //   3: istore_1
    //   4: getstatic p.k : I
    //   7: istore_2
    //   8: aload_0
    //   9: iconst_1
    //   10: iconst_3
    //   11: invokestatic b : (II)I
    //   14: putfield o : I
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield u : Z
    //   22: aload_0
    //   23: iconst_3
    //   24: iconst_5
    //   25: invokestatic b : (II)I
    //   28: putfield t : I
    //   31: aload_0
    //   32: getfield o : I
    //   35: iconst_1
    //   36: if_icmpne -> 66
    //   39: aload_0
    //   40: bipush #-50
    //   42: putfield m : I
    //   45: aload_0
    //   46: iload_2
    //   47: getstatic main/a.B : I
    //   50: bipush #100
    //   52: isub
    //   53: iload_2
    //   54: iadd
    //   55: invokestatic b : (II)I
    //   58: putfield n : I
    //   61: aload_0
    //   62: iconst_0
    //   63: goto -> 210
    //   66: aload_0
    //   67: getfield o : I
    //   70: iconst_2
    //   71: if_icmpne -> 104
    //   74: aload_0
    //   75: getstatic bv.c : I
    //   78: bipush #50
    //   80: iadd
    //   81: putfield m : I
    //   84: aload_0
    //   85: iload_2
    //   86: getstatic main/a.B : I
    //   89: bipush #100
    //   91: isub
    //   92: iload_2
    //   93: iadd
    //   94: invokestatic b : (II)I
    //   97: putfield n : I
    //   100: aload_0
    //   101: goto -> 209
    //   104: aload_0
    //   105: getfield o : I
    //   108: iconst_3
    //   109: if_icmpne -> 157
    //   112: aload_0
    //   113: iload_1
    //   114: bipush #50
    //   116: iadd
    //   117: getstatic main/a.A : I
    //   120: bipush #50
    //   122: isub
    //   123: iload_1
    //   124: iadd
    //   125: invokestatic b : (II)I
    //   128: putfield m : I
    //   131: aload_0
    //   132: bipush #-50
    //   134: putfield n : I
    //   137: iconst_0
    //   138: iconst_2
    //   139: invokestatic b : (II)I
    //   142: istore_1
    //   143: aload_0
    //   144: iload_1
    //   145: ifne -> 152
    //   148: iconst_0
    //   149: goto -> 153
    //   152: iconst_2
    //   153: putfield p : I
    //   156: return
    //   157: aload_0
    //   158: getfield o : I
    //   161: iconst_4
    //   162: if_icmpne -> 213
    //   165: aload_0
    //   166: iload_1
    //   167: bipush #50
    //   169: iadd
    //   170: getstatic main/a.A : I
    //   173: bipush #50
    //   175: isub
    //   176: iload_1
    //   177: iadd
    //   178: invokestatic b : (II)I
    //   181: putfield m : I
    //   184: aload_0
    //   185: getstatic bv.d : I
    //   188: bipush #50
    //   190: iadd
    //   191: putfield n : I
    //   194: iconst_0
    //   195: iconst_2
    //   196: invokestatic b : (II)I
    //   199: istore_1
    //   200: aload_0
    //   201: iload_1
    //   202: ifne -> 209
    //   205: iconst_0
    //   206: goto -> 210
    //   209: iconst_2
    //   210: putfield p : I
    //   213: return
  }
  
  public static void a(int paramInt) {
    if (a.a)
      return; 
    ed ed1 = new ed(paramInt);
    a.addElement(ed1);
  }
  
  public static void a(int paramInt1, int paramInt2) {
    ed ed1;
    (ed1 = new ed(10)).K = paramInt1;
    ed1.J = paramInt2;
    a.addElement(ed1);
  }
  
  public static void b(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      en en1 = paramen;
      ed ed1;
      if ((ed1 = a.elementAt(b)).b == 10) {
        en1.a(ed1.K);
        byte b1;
        for (b1 = 0; b1 < ed1.l; b1++)
          en1.a((b1 < ed1.l / 2) ? N : M, ed1.g[b1], ed1.h[b1] + ed1.J, 0); 
        if (c != 0 && Q == null)
          Q = (bl.c[c]).a; 
        if (Q != null)
          for (b1 = 0; b1 < ed1.l / 2; b1++)
            en1.a(Q, ed1.g[b1], ed1.h[b1] + ed1.J, 0);  
      } 
    } 
  }
  
  public static void c(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      byte b1;
      en en1 = paramen;
      ed ed1;
      switch ((ed1 = a.elementAt(b)).b) {
        case 8:
          en1.a(A, 0, 0, A.getWidth(), A.getHeight(), ed1.p, ed1.m, ed1.n, 3);
          if (ed1.o == 1 || ed1.o == 2) {
            byte b2 = (ed1.p == 0) ? -25 : 25;
            en1.a(B, 0, ed1.q << 3, 20, 8, ed1.p, ed1.m + b2, ed1.n + 5, 3);
            break;
          } 
          b1 = (ed1.p == 0) ? 11 : -11;
          en1.a(C, 0, ed1.q * 18, 8, 18, ed1.p, ed1.m + b1, ed1.n + 22, 3);
          break;
        case 13:
          if (R)
            g(en1); 
          break;
      } 
    } 
  }
  
  public static void d(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      en en1 = paramen;
      ed ed1 = a.elementAt(b);
      try {
        byte b1;
        switch (ed1.b) {
          case 0:
          case 12:
            for (b1 = 0; b1 < ed1.E; b1++) {
              if (ed1.D[b1] == 2 && ed1.g[b1] >= p.j && ed1.g[b1] <= a.A + p.j && ed1.h[b1] >= p.k && ed1.h[b1] <= a.B + p.k)
                if (ed1.I[b1]) {
                  en1.a(v, 0, 10 * ed1.G[b1], 13, 10, 0, ed1.g[b1], ed1.h[b1] - 10, 0);
                } else {
                  en1.a(w, ed1.g[b1], ed1.h[b1], 0);
                }  
            } 
            break;
          case 1:
          case 2:
          case 5:
          case 6:
          case 7:
          case 11:
          case 15:
          
          case 13:
            if (!R)
              g(en1); 
            break;
        } 
      } catch (Exception exception) {}
      continue;
    } 
  }
  
  public static void e(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      en en1 = paramen;
      ed ed1 = a.elementAt(b);
      en1.a(-en1.a(), -en1.b());
      if (ed1.b == 4)
        for (byte b1 = 0; b1 < ed1.E; b1++)
          en1.a(y, 0, 16 * ed1.G[b1], 16, 16, 0, ed1.g[b1], ed1.h[b1], 0);  
      if (ed1.b == 9) {
        en1.a(16777215);
        for (byte b1 = 0; b1 < ed1.l; b1++)
          en1.a((k[b1] == 1) ? O : P, ed1.g[b1], ed1.h[b1], 3); 
      } 
    } 
  }
  
  public static void f(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      byte b1;
      en en1 = paramen;
      ed ed1;
      switch ((ed1 = a.elementAt(b)).b) {
        case 0:
          en1.a(10742731);
          for (b1 = 0; b1 < ed1.E; b1++) {
            if (ed1.D[b1] != 2 && ed1.g[b1] >= p.j && ed1.g[b1] <= a.A + p.j && ed1.h[b1] >= p.k && ed1.h[b1] <= a.B + p.k)
              en1.a(x, ed1.g[b1], ed1.h[b1], 0); 
          } 
          break;
        case 1:
        case 2:
        case 5:
        case 6:
        case 7:
        case 11:
        case 15:
        
      } 
      continue;
    } 
  }
  
  public static void c() {
    for (byte b = 0; b < a.size(); b++) {
      ed ed1 = a.elementAt(b);
      try {
        byte b1;
        switch (ed1.b) {
          case 10:
            for (b1 = 0; b1 < ed1.l; b1++) {
              ed1.g[b1] = ed1.g[b1] - ed1.i[b1];
              if (ed1.g[b1] < -ed1.i[b1] + p.j)
                ed1.g[b1] = a.A + ed1.i[b1] + p.j; 
            } 
            break;
          case 9:
            for (b1 = 0; b1 < ed1.l; b1++) {
              ed1.g[b1] = ed1.g[b1] - ed1.i[b1];
              if (ed1.g[b1] < -ed1.i[b1]) {
                k[b1] = ds.g(ds.b(1, 3));
                ed1.i[b1] = k[b1];
                ed1.g[b1] = a.A + ed1.i[b1];
              } 
            } 
            break;
          case 0:
          case 12:
            for (b1 = 0; b1 < ed1.E; b1++) {
              if (b1 % 3 != 0 && ed1.b != 12 && bv.a(ed1.g[b1], ed1.h[b1] - a.ae, 2))
                ed1.I[b1] = true; 
              if (b1 % 3 == 0 && ed1.h[b1] > a.B + p.k) {
                ed1.g[b1] = ds.b(-10, a.A + 300) + p.j;
                ed1.h[b1] = ds.b(-100, 0) + p.k;
              } 
              if (!ed1.I[b1]) {
                ed1.h[b1] = ed1.h[b1] + ed1.j[b1];
                ed1.g[b1] = ed1.g[b1] + ed1.i[b1];
              } 
              if (ed1.I[b1]) {
                ed1.H[b1] = ed1.H[b1] + 1;
                if (ed1.H[b1] > 2) {
                  ed1.G[b1] = ed1.G[b1] + 1;
                  ed1.H[b1] = 0;
                  if (ed1.G[b1] > 1) {
                    ed1.G[b1] = 0;
                    ed1.I[b1] = false;
                    ed1.g[b1] = ds.b(-10, a.A + 300) + p.j;
                    ed1.h[b1] = ds.b(-100, 0) + p.k;
                  } 
                } 
              } 
            } 
            break;
          case 1:
          case 2:
          case 5:
          case 6:
          case 7:
          case 11:
          case 15:
            for (b1 = 0; b1 < ed1.E; b1++) {
              if (b1 % 3 != 0 && bv.a(ed1.g[b1], ed1.h[b1] + ((bv.e == 15) ? 10 : 0), 2))
                ed1.I[b1] = true; 
              if (b1 % 3 == 0 && ed1.h[b1] > bv.d) {
                ed1.g[b1] = ds.b(-10, bv.c + 50);
                ed1.h[b1] = ds.b(-50, 0);
              } 
              if (!ed1.I[b1]) {
                for (byte b2 = 0; b2 < cn.a.size(); b2++) {
                  cn cn;
                  if ((cn = cn.a.elementAt(b2)) != null && cn.e && ed1.g[b1] < cn.b + 80 && ed1.g[b1] > cn.b - 80 && ed1.h[b1] < cn.c + 80 && ed1.h[b1] > cn.c - 80)
                    ed1.g[b1] = ed1.g[b1] + ((ed1.g[b1] < cn.b) ? -10 : 10); 
                } 
                ed1.h[b1] = ed1.h[b1] + ed1.j[b1];
                ed1.g[b1] = ed1.g[b1] + ed1.i[b1];
                ed1.H[b1] = ed1.H[b1] + 1;
                if (ed1.H[b1] > ((ed1.b != 2) ? 2 : 4)) {
                  if (ed1.b != 11 && ed1.b != 15)
                    ed1.G[b1] = ed1.G[b1] + 1; 
                  ed1.H[b1] = 0;
                  if (ed1.G[b1] > 3)
                    ed1.G[b1] = 0; 
                } 
              } else {
                ed1.H[b1] = ed1.H[b1] + 1;
                if (ed1.H[b1] == 100) {
                  ed1.H[b1] = 0;
                  ed1.g[b1] = ds.b(-10, bv.c + 50);
                  ed1.h[b1] = ds.b(-50, 0);
                  ed1.I[b1] = false;
                } 
              } 
            } 
            break;
          case 4:
            for (b1 = 0; b1 < ed1.E; b1++) {
              ed1.H[b1] = ed1.H[b1] + 1;
              if (ed1.H[b1] > 10) {
                ed1.Y[b1] = ed1.Y[b1] + 1;
                ed1.H[b1] = 0;
                if (ed1.Y[b1] > 5)
                  ed1.Y[b1] = 0; 
                ed1.G[b1] = ed1.X[ed1.Y[b1]];
              } 
            } 
            break;
          case 8:
            ed1.r++;
            if (ed1.r == 3) {
              ed1.r = 0;
              ed1.q++;
              if (ed1.q > 1)
                ed1.q = 0; 
            } 
            if (a.w % ed1.s == 0)
              ed1.u = true; 
            if (ed1.u) {
              if (ed1.o == 1) {
                ed1.m += ed1.t;
                if (ed1.m > bv.c + 50)
                  ed1.e(); 
                break;
              } 
              if (ed1.o == 2) {
                ed1.m -= ed1.t;
                if (ed1.m < -50)
                  ed1.e(); 
                break;
              } 
              if (ed1.o == 3) {
                ed1.n += ed1.t;
                if (ed1.n > bv.d + 50)
                  ed1.e(); 
                break;
              } 
              if (ed1.o == 4) {
                ed1.n -= ed1.t;
                if (ed1.n < -50)
                  ed1.e(); 
              } 
            } 
            break;
          case 13:
            if (l.c != 1 && !a.a && e > 0) {
              int i = (a.E == p.j()) ? bv.c : (p.j + a.A);
              for (b1 = 0; b1 < e; b1++) {
                int j = b1 + 1;
                a.aa[b1] = a.aa[b1] - j;
                if (a.aa[b1] < -U)
                  a.aa[b1] = i + 100; 
              } 
            } 
            break;
          case 14:
            if (l.c != 1 && !a.a && d && --V < -W)
              V = 0; 
            break;
        } 
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ed.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */