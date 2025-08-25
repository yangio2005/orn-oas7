import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class ae extends dc implements b {
  public int a = 100;
  
  public int b;
  
  public int c;
  
  public String[] d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public do i;
  
  private static long C;
  
  private static long D;
  
  private int E;
  
  private String[] F;
  
  public de j;
  
  public de k;
  
  public de l;
  
  public static ae m;
  
  public static ae n;
  
  private static String G;
  
  private static do H;
  
  public byte o = 0;
  
  public byte p = 0;
  
  public static dv q;
  
  private static boolean I;
  
  private int J;
  
  private static int K;
  
  private int L;
  
  public boolean[] r = new boolean[20];
  
  public static int s = 7;
  
  private int M = 0;
  
  private int N = 0;
  
  private int O = 0;
  
  private Image P;
  
  public int t;
  
  public boolean u = false;
  
  public static int v;
  
  private int Q = 0;
  
  private int R = 0;
  
  public static void a(String paramString, do paramdo) {
    G = paramString;
    H = paramdo;
    if (m == null) {
      b(G, 100000, H);
      G = null;
      H = null;
    } 
  }
  
  public static void a(String paramString, int paramInt, do paramdo) {
    String[] arrayOfString = { paramString };
    if (paramdo.J != 5 && p.aD.e)
      p.aD.f = false; 
    af.bH = true;
    (n = c(arrayOfString[0], 100000, paramdo)).t = 5;
    n.e = a.A / 2 - n.a / 2 - 1;
    n.f = a.B - 20 - n.g;
    n.E = 0;
    n.F = arrayOfString;
    q = new dv();
    int i = n.d.length;
    q.a(i, 12, n.e, n.f - n.t + 12, n.a + 2, n.g - 25, true, 1);
    bu.a();
  }
  
  public static void b(String paramString, int paramInt, do paramdo) {
    ds.c("chat= " + paramString);
    String[] arrayOfString = ds.a(paramString, "\n", 0);
    af.bH = true;
    (m = c(arrayOfString[0], 100000, paramdo)).E = 0;
    m.F = arrayOfString;
    String str = aw.bk;
    if (arrayOfString.length == 1)
      str = aw.bi; 
    m.j = new de(str, m, 8000, null);
    m.j.j = a.A / 2 - 35;
    m.j.k = a.B - 35;
    bu.a();
  }
  
  public static ae c(String paramString, int paramInt, do paramdo) {
    ds.c("ADD POP");
    ds.c(((af.e()).aT != null) ? "!null" : "null");
    K = 10;
    ae ae1;
    (ae1 = new ae()).a = a.A - 30 - (a.F.a ? a.F.c : 0);
    if (ae1.a > 320)
      ae1.a = 320; 
    if (paramString.length() < 10)
      ae1.a = 64; 
    if (a.A == 128)
      ae1.a = 128; 
    ae1.d = di.p.a(paramString, ae1.a - 10);
    ae1.b = paramInt;
    ae1.i = paramdo;
    af.x = ae1;
    ae1.g = 15 - ae1.c + ae1.d.length * 12 + 10;
    if (ae1.g > a.B - 80)
      ae1.g = a.B - 80; 
    dc.x.addElement(ae1);
    I = false;
    if (paramdo != null && paramdo.J == 5) {
      I = true;
      p.aD.a("", 1);
    } 
    C = D = l.d();
    return ae1;
  }
  
  public static ae a(String paramString, int paramInt1, do paramdo, int paramInt2) {
    ds.c("ADD POP");
    ds.c(((af.e()).aT != null) ? "!null" : "null");
    K = 10;
    ae ae1;
    (ae1 = new ae()).a = a.A - 30 - (a.F.a ? a.F.c : 0);
    if (ae1.a > 320)
      ae1.a = 320; 
    if (paramString.length() < 10)
      ae1.a = 64; 
    if (a.A == 128)
      ae1.a = 128; 
    ae1.d = di.p.a(paramString, ae1.a - 10);
    ae1.b = 100000;
    ae1.i = paramdo;
    ae1.J = 5820;
    af.x = ae1;
    ae1.g = 15 - ae1.c + ae1.d.length * 12 + 10;
    if (ae1.g > a.B - 80)
      ae1.g = a.B - 80; 
    dc.x.addElement(ae1);
    I = false;
    if (paramdo != null && paramdo.J == 5) {
      I = true;
      p.aD.a("", 1);
    } 
    ae1.g += 15;
    C = D = l.d();
    return ae1;
  }
  
  public final void a() {
    if (q != null) {
      p.aD.f = false;
      q.b();
    } else {
      p.aD.f = true;
    } 
    if (a.F.a) {
      this.t = 0;
      this.e = a.A / 2 - this.a / 2 - 1;
      this.f = a.F.d - this.g;
    } else {
      this.t = 0;
      if ((p.j()).co != null || (p.j()).cm != null || (p.j()).cn != null || this.j != null || this.k != null) {
        this.t = 5;
        this.e = a.A / 2 - this.a / 2 - 1;
        this.f = a.B - 20 - this.g;
      } else {
        this.e = a.A / 2 - this.a / 2 - 1;
        this.f = a.B - 5 - this.g;
      } 
    } 
    if (this.b > 0)
      this.b--; 
    if (K > 0) {
      K--;
    } else {
      p.aD.b.e = 0;
      for (byte b1 = 0; b1 < p.aD.b.a.size(); b1++) {
        if (((r)p.aD.b.a.elementAt(b1)).b != 70)
          ((r)p.aD.b.a.elementAt(b1)).b = 10; 
      } 
    } 
    if (this.c > 1)
      this.c--; 
    if ((this.i != null && af.x != null && af.x != this) || (this.i != null && af.x == null) || this.b <= 0) {
      dc.z.removeElement(this);
      dc.x.removeElement(this);
    } 
  }
  
  public final void a(en paramen) {
    if ((p.j()).bd && (p.j()).ba)
      return; 
    a.a(paramen);
    int i = this.e;
    int j = this.f;
    int k = this.a + 2;
    int m = this.g;
    if ((i <= 0 || j <= 0) && !a.G.a)
      return; 
    if (this.i != null) {
      byte b2;
      if (a.w % 10 > 2) {
        b2 = 0;
      } else {
        b2 = 1;
      } 
      bl.b(paramen, this.i.aO, this.e + 14, this.f + b2, 0, cj.d);
    } 
    if (this.J != 0) {
      byte b2;
      if (a.w % 10 > 2) {
        b2 = 0;
      } else {
        b2 = 1;
      } 
      bl.b(paramen, this.J, this.e + k / 2, this.f + this.g - 15 + b2, 0, cj.f);
    } 
    bo.a(paramen, i, j, k, m, 16777215, false);
    if (q != null) {
      paramen.e(i, j, k, m - 16);
      paramen.a(0, -q.d);
    } 
    int n = 0;
    int i1 = 0;
    if (this.u) {
      n = paramen.a();
      i1 = paramen.b();
      paramen.e(i, j + 1, k, m - 17);
      paramen.a(0, -v);
    } 
    int i2 = -1;
    byte b1;
    for (b1 = 0; b1 < this.d.length; b1++) {
      if (this.d[b1].startsWith("--")) {
        paramen.a(0);
        paramen.d(i + 10, this.f + this.c + b1 * 12 + 6, k - 20, 1);
      } else {
        int i4;
        di di = di.k;
        int i3 = 2;
        String str = this.d[b1];
        if (this.d[b1].startsWith("|")) {
          String[] arrayOfString;
          if ((arrayOfString = ds.a(this.d[b1], "|", 0)).length == 3)
            str = arrayOfString[2]; 
          if (arrayOfString.length == 4) {
            str = arrayOfString[3];
            i3 = Integer.parseInt(arrayOfString[2]);
          } 
          i2 = i4 = Integer.parseInt(arrayOfString[1]);
        } else {
          i4 = i2;
        } 
        switch (i4) {
          case -1:
            di = di.k;
            break;
          case 0:
            di = di.f;
            break;
          case 1:
            di = di.h;
            break;
          case 2:
            di = di.b;
            break;
          case 3:
            di = di.p;
            break;
          case 4:
            di = di.r;
            break;
          case 5:
            di = di.q;
            break;
          case 7:
            di = di.a;
            break;
          case 8:
            di = di.d;
            break;
          case 9:
            di = di.d;
            break;
        } 
        if (this.d[b1].startsWith("<")) {
          String[] arrayOfString2;
          String[] arrayOfString1 = ds.a((arrayOfString2 = ds.a(this.d[b1], "<", 0))[1], ">", 1);
          if (this.L == 0) {
            this.L = Integer.parseInt(arrayOfString1[1]);
          } else if ((C = l.d()) - D >= 1000L) {
            D = C;
            this.L--;
          } 
          str = String.valueOf(this.L) + " " + arrayOfString1[2];
          di.a(paramen, str, this.e + this.a / 2, this.f + this.c + b1 * 12 - this.t + 12, i3);
        } else {
          if (i3 == 2)
            di.a(paramen, str, this.e + this.a / 2, this.f + this.c + b1 * 12 - this.t + 12, i3); 
          if (i3 == 1)
            di.a(paramen, str, this.e + this.a - 5, this.f + this.c + b1 * 12 - this.t + 12, i3); 
        } 
      } 
    } 
    if (this.u) {
      a.a(paramen);
      paramen.a(n, i1);
    } 
    if (this.p > 4) {
      this.N = (this.p + 1) / 2;
      this.M = this.p - this.N;
      int[] arrayOfInt1 = new int[this.p];
      int[] arrayOfInt2 = new int[this.p];
      byte b2;
      for (b2 = 0; b2 < this.N; b2++) {
        paramen.a(g.s, i + k / 2 - this.N * 20 / 2 + b2 * 20 + en.a(g.s), j + m - 17, 3);
        arrayOfInt1[b2] = i + k / 2 - this.N * 20 / 2 + b2 * 20 + en.a(g.s);
        arrayOfInt2[b2] = j + m - 17;
      } 
      for (b2 = 0; b2 < this.M; b2++) {
        paramen.a(g.s, i + k / 2 - this.M * 20 / 2 + b2 * 20 + en.a(g.s), j + m - 8, 3);
        arrayOfInt1[this.N + b2] = i + k / 2 - this.M * 20 / 2 + b2 * 20 + en.a(g.s);
        arrayOfInt2[this.N + b2] = j + m - 8;
      } 
      ds.b(String.valueOf(this.p) + "maxStarSlot");
      if (this.p >= 7)
        for (byte b3 = 7; b3 < this.p; b3++) {
          if (this.r[b3])
            paramen.a(g.u, arrayOfInt1[b3], arrayOfInt2[b3], 3); 
        }  
      if (this.o > 0) {
        this.P = g.r;
        if (this.o >= this.N) {
          this.O = this.o - this.N;
          for (b2 = 0; b2 < this.N; b2++)
            paramen.a(this.P, i + k / 2 - this.N * 20 / 2 + b2 * 20 + en.a(this.P), j + m - 17, 3); 
          for (b2 = 0; b2 < this.O; b2++) {
            if (b2 + this.N >= s)
              this.P = g.t; 
            paramen.a(this.P, i + k / 2 - this.M * 20 / 2 + b2 * 20 + en.a(this.P), j + m - 8, 3);
          } 
        } else {
          for (b2 = 0; b2 < this.o; b2++)
            paramen.a(this.P, i + k / 2 - this.N * 20 / 2 + b2 * 20 + en.a(this.P), j + m - 17, 3); 
        } 
      } 
    } else {
      for (b1 = 0; b1 < this.p; b1++)
        paramen.a(g.s, i + k / 2 - this.p * 20 / 2 + b1 * 20 + en.a(g.s), j + m - 13, 3); 
      if (this.o > 0)
        for (b1 = 0; b1 < this.o; b1++)
          paramen.a(g.r, i + k / 2 - this.p * 20 / 2 + b1 * 20 + en.a(g.r), j + m - 13, 3);  
    } 
    en en1 = paramen;
    ae ae1 = this;
    en1.a(-en1.a(), -en1.b());
    en1.e(0, 0, a.A, a.B);
    if (ae1.j != null)
      cx.a(en1, null, ae1.j, null); 
    if (ae1.k != null)
      cx.a(en1, ae1.k, null, ae1.l); 
  }
  
  public final void a(en paramen, int paramInt) {
    int i = this.e;
    int j = this.f;
    int k = this.a;
    int m = paramen.a();
    int n = paramen.b();
    paramen.a(0, -paramInt);
    if ((i <= 0 || j <= 0) && !a.G.a)
      return; 
    paramInt = -1;
    for (j = 0; j < this.d.length; j++) {
      if (this.d[j].startsWith("--")) {
        paramen.a(16777215);
        paramen.d(i + 10, this.f + this.c + j * 12 - 6, k - 20, 1);
      } else {
        int i2;
        di di = di.s;
        int i1 = 2;
        String str = this.d[j];
        if (this.d[j].startsWith("|")) {
          String[] arrayOfString;
          if ((arrayOfString = ds.a(this.d[j], "|", 0)).length == 3)
            str = arrayOfString[2]; 
          if (arrayOfString.length == 4) {
            str = arrayOfString[3];
            i1 = Integer.parseInt(arrayOfString[2]);
          } 
          paramInt = i2 = Integer.parseInt(arrayOfString[1]);
        } else {
          i2 = paramInt;
        } 
        switch (i2) {
          case -1:
            di = di.s;
            break;
          case 0:
            di = di.c;
            break;
          case 1:
            di = di.h;
            break;
          case 2:
            di = di.a;
            break;
        } 
        if (this.d[j].startsWith("<")) {
          String[] arrayOfString2;
          String[] arrayOfString1 = ds.a((arrayOfString2 = ds.a(this.d[j], "<", 0))[1], ">", 1);
          if (this.L == 0) {
            this.L = Integer.parseInt(arrayOfString1[1]);
          } else if ((C = l.d()) - D >= 1000L) {
            D = C;
            this.L--;
          } 
          str = String.valueOf(this.L) + " " + arrayOfString1[2];
          di.a(paramen, str, this.e + this.a / 2, this.f + this.c + j * 12 - this.t, i1);
        } else {
          if (i1 == 2)
            di.a(paramen, str, this.e + this.a / 2, this.f + this.c + j * 12 - this.t, i1); 
          if (i1 == 1)
            di.a(paramen, str, this.e + this.a - 5, this.f + this.c + j * 12 - this.t, i1); 
        } 
      } 
    } 
    a.a(paramen);
    paramen.a(m, n);
  }
  
  private void a(int paramInt) {
    if ((v += paramInt * 12) < 0)
      v = 0; 
    if (v > this.h)
      v = this.h; 
  }
  
  public final void b() {
    if (this.u) {
      if (a.i[8]) {
        a.i[8] = false;
        a(1);
      } 
      if (a.i[2]) {
        a.i[2] = false;
        a(-1);
      } 
      if (a.a(this.e, 0, this.a + 2, this.g))
        if (a.n) {
          if (this.R == 0)
            this.R = a.q; 
          this.Q = this.R - a.q;
          if (this.Q != 0) {
            v += this.Q;
            this.R = a.q;
          } 
          if (v < 0)
            v = 0; 
          if (v > this.h)
            v = this.h; 
        } else {
          this.R = 0;
          this.R = 0;
        }  
    } 
    if (q != null) {
      if (a.e)
        q.a(); 
      if (a.j[2]) {
        q.b -= 12;
        if (q.b < 0)
          q.b = 0; 
      } 
      if (a.j[8]) {
        a.i[8] = false;
        q.b += 12;
        if (q.b > q.l)
          q.b = q.l; 
      } 
    } 
    if (a.i[5] || bb.a(a.E.cn)) {
      a.i[5] = false;
      bb.cs = -1;
      if (this.j != null) {
        this.j.a();
      } else if (this.k != null) {
        this.k.a();
      } else if (this.l != null) {
        this.l.a();
      } 
    } 
    if (q != null && q.m)
      return; 
    if (this.k != null && (a.i[12] || a.i[5] || bb.a(this.k))) {
      a.i[12] = false;
      a.i[5] = false;
      a.l = false;
      a.m = false;
      this.k.a();
      bb.cs = -1;
    } 
    if (this.l != null && (a.i[13] || bb.a(this.l))) {
      a.i[13] = false;
      a.l = false;
      a.m = false;
      this.l.a();
      bb.cs = -1;
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1000) {
      try {
        GameMidlet.f.platformRequest((String)paramObject);
      } catch (Exception exception) {
        (paramObject = null).printStackTrace();
      } 
      GameMidlet.f.notifyDestroyed();
      a.h();
    } 
    if (paramInt == 1001) {
      q = null;
      af.x = null;
      n = null;
      p.aD.f = true;
      af.bH = false;
      if (I) {
        p.aD.b.e = 0;
        p.aD.b.b.b = 10;
      } 
    } 
    if (paramInt == 8000) {
      if (K > 0)
        return; 
      int i = m.E;
      if (++i >= m.F.length) {
        af.x = null;
        m = null;
        p.aD.f = true;
        af.bH = false;
        if (G != null) {
          b(G, 100000, H);
          G = null;
          H = null;
          return;
        } 
        if (I) {
          p.aD.b.e = 0;
          for (paramInt = 0; paramInt < p.aD.b.a.size(); paramInt++) {
            if (((r)p.aD.b.a.elementAt(paramInt)).b == 10000000)
              ((r)p.aD.b.a.elementAt(paramInt)).b = 10; 
          } 
        } 
        return;
      } 
      ae ae1;
      (ae1 = c(m.F[i], m.b, m.i)).E = i;
      ae1.F = m.F;
      ae1.j = m.j;
      m = ae1;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */