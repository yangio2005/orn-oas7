import javax.microedition.lcdui.Image;
import main.a;

public final class eu extends bb implements b {
  private int c = 0;
  
  private el d = new el("");
  
  private de e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private de k;
  
  private de l;
  
  private static String m = "area_select";
  
  private boolean n;
  
  public boolean a;
  
  private bh o;
  
  private byte p = 0;
  
  private byte q = 0;
  
  private byte r = 0;
  
  private de s;
  
  private boolean t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  private int K;
  
  private int L;
  
  private int M;
  
  private int N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private int R;
  
  private int S;
  
  private int T;
  
  private int U;
  
  private int V = 15;
  
  private String[] W;
  
  private String[] X;
  
  private String[] Y;
  
  private String Z;
  
  private static Image[] aa;
  
  public static boolean b;
  
  public final void b() {
    bu.a();
    super.b();
    if (aa == null) {
      aa = new Image[3];
      for (byte b1 = 0; b1 < aa.length; b1++)
        aa[b1] = l.b("/iconHead_" + b1 + ".png"); 
    } 
    this.c = bs.n;
    this.i = 1;
    this.j = 1;
    eu eu1 = this;
    if (a.e)
      if (av.b(m) == null) {
        eu1.n = true;
        eu1.s = new de(aw.br, eu1, 999, null);
        eu1.s.j = a.C - 38;
        eu1.s.k = a.D + 50;
        eu1.d = new el("");
        eu1.d.addElement(eu1.s);
        eu1.O = a.D - 30;
        eu1.P = 70;
        eu1.Q = 20;
      } else {
        eu1.n = false;
        eu1.g();
        eu1.a(eu1.p, eu1.r);
      }  
    if (!this.a && !this.n) {
      this.k = new de(this.W[0], this, 98, null);
      this.k.j = 0;
      this.k.k = 0;
      this.l = new de(this.W[1], this, 97, null);
      this.l.j = 50;
      this.l.k = 0;
      this.d = new el("");
      this.d.addElement(this.k);
      this.d.addElement(this.l);
      a();
    } 
  }
  
  public eu() {
    (new String[3])[0] = "Tiếng Việt";
    (new String[3])[1] = "English";
    (new String[3])[2] = "Indo";
    this.W = new String[] { "VIỆT NAM", "GLOBAL" };
    this.X = new String[] { "Máy chủ tiêu chuẩn", "Máy chủ Super" };
    this.Y = new String[] { "Máy chủ tiêu chuẩn:\nTiến trình game bình thường.", "Máy chủ Super:\n -Không thể giao dịch vàng.\n x3 Sức mạnh\n x3 Tiềm năng\n x3 Vàng\n x3 Vật phẩm khác" };
    this.Z = "Chỉ hiện thị máy chủ đã chơi.";
    if ((bv.o = (byte)(int)(System.currentTimeMillis() % 9L)) == 5 || bv.o == 6)
      bv.o = 4; 
    p.a(-1, -1);
    p.j = 100;
    p.k = 200;
  }
  
  private void a() {
    this.c = bs.n;
    this.h = 5;
    this.f = 90;
    this.g = bb.cr;
    this.i = 2;
    if (this.d.size() > 2)
      this.i = a.A / (this.f + this.h); 
    this.j = this.d.size() / this.i + ((this.d.size() % this.i == 0) ? 0 : 1);
    for (byte b1 = 0; b1 < this.d.size(); b1++) {
      de de1;
      if ((de1 = this.d.elementAt(b1)) != null) {
        int i = (i = a.C - this.i * (this.f + this.h) / 2) + b1 % this.i * (this.f + this.h);
        int j = (j = a.D - this.j * (this.g + this.h) / 2) + b1 / this.i * (this.g + this.h);
        de1.j = i;
        de1.k = j;
        de1.l = this.f;
      } 
    } 
  }
  
  public final void c() {
    if (++p.j > a.A * 3 + 100)
      p.j = 100; 
    if (!this.a)
      for (byte b1 = 0; b1 < this.d.size(); b1++) {
        de de1 = this.d.elementAt(b1);
        if (!a.e) {
          if (b1 == this.c) {
            if (a.w % 10 < 4) {
              de1.n = true;
            } else {
              de1.n = false;
            } 
            this.e = new de(aw.bv, this, de1.e, null);
            this.cn = this.e;
          } else {
            de1.n = false;
          } 
        } else if (de1 != null && de1.c()) {
          ds.c("sellllect      " + this.c + "   " + de1.b);
          de1.a();
        } 
      }  
    e();
    f();
    bs.e();
  }
  
  public final void a(en paramen) {
    a.c(paramen);
    if (this.n) {
      en en1 = paramen;
      eu eu1;
      if ((eu1 = this).n) {
        eu1.a(en1, a.C - eu1.P / 2, eu1.O);
        eu1.s.a(en1);
      } 
    } else if (this.a) {
      en en1 = paramen;
      eu eu1;
      if ((eu1 = this).a) {
        en1.a(14601141);
        en1.d(eu1.u, eu1.v, eu1.w, eu1.x);
        bo.a(en1, eu1.y - 50, eu1.z, 100, 20, 0, true);
        di.f.a(en1, aw.aa, eu1.y, eu1.z + 5, 2);
        for (byte b2 = 0; b2 < eu1.R; b2++) {
          int k = eu1.H + b2 * (eu1.J + 5);
          bo.a(en1, eu1.G, k, eu1.I, eu1.J, (eu1.r == b2) ? 1 : 0, true);
          di.f.a(en1, eu1.X[b2], eu1.G + eu1.I / 2, k + 5, 2);
        } 
        en1.a(10254674);
        en1.d(eu1.K, eu1.L, eu1.M, eu1.N);
        String[] arrayOfString = di.k.a(eu1.Y[eu1.r], eu1.M - 10);
        for (byte b3 = 0; b3 < arrayOfString.length; b3++)
          di.s.a(en1, arrayOfString[b3], eu1.K + 5, eu1.L + 5 + b3 * 11, 0); 
        en en2 = en1;
        eu eu2;
        int i = (eu2 = eu1).K;
        int j = eu2.L + eu2.N + 2;
        en2.a(16777215);
        en2.d(i, j, eu2.S, eu2.S);
        if (b) {
          en2.a(3329330);
          en2.d(i + 1, j + 1, eu2.S - 2, eu2.S - 2);
        } 
        di.f.a(en2, eu2.Z, i + eu2.S + 2, j, 0);
        eu1.a(en1, 10, eu1.O);
        en1.a(10254674);
        en1.d(eu1.A, eu1.B, eu1.C, eu1.D);
        en1.e(eu1.A, eu1.B, eu1.C, eu1.D);
        en1.a(0, -eu1.o.b);
        for (byte b1 = 0; b1 < eu1.d.size(); b1++) {
          de de1;
          if ((de1 = eu1.d.elementAt(b1)) != null) {
            de1.a(en1);
            if (de1.r && a.w % 10 > 1)
              en1.a(g.v, de1.j + 60, de1.k, 0); 
          } 
        } 
        a.a(en1);
      } 
    } else {
      for (byte b1 = 0; b1 < this.d.size(); b1++) {
        if (this.d.elementAt(b1) != null)
          ((de)this.d.elementAt(b1)).a(paramen); 
      } 
    } 
    super.a(paramen);
  }
  
  public final void d() {
    super.d();
    int i = this.c % this.i;
    int j = this.c / this.i;
    if (a.i[4]) {
      if (i > 0)
        this.c--; 
      a.i[4] = false;
    } else if (a.i[6]) {
      if (i < this.i - 1)
        this.c++; 
      a.i[6] = false;
    } else if (a.i[2]) {
      if (j > 0)
        this.c -= this.i; 
      a.i[2] = false;
    } else if (a.i[8]) {
      System.out.println("-----------vo mainSelect: " + this.c);
      if (j < this.j - 1)
        this.c += this.i; 
      a.i[8] = false;
    } 
    if (this.c < 0)
      this.c = 0; 
    if (this.c >= this.d.size())
      this.c = this.d.size() - 1; 
    if (a.i[5]) {
      ((de)this.d.elementAt(i)).a();
      a.i[5] = false;
    } 
    a.f();
  }
  
  public final void a(int paramInt, Object paramObject) {
    eu eu1;
    byte b1;
    ds.c("perform trong ServerScr:" + paramInt);
    switch (paramInt) {
      case 999:
        eu1 = this;
        (paramObject = new byte[2])[0] = eu1.p;
        paramObject[1] = eu1.q;
        av.a(m, (byte[])paramObject);
        a(this.p, 0);
        return;
      case 97:
        if (!this.a) {
          this.d.removeAllElements();
          for (b1 = 0; b1 < bs.a.length; b1++) {
            if (bs.d[b1] != 0)
              this.d.addElement(new de(bs.a[b1], this, b1 + 100, null)); 
          } 
          a();
          return;
        } 
        return;
      case 98:
        if (!this.a) {
          this.d.removeAllElements();
          for (b1 = 0; b1 < bs.a.length; b1++) {
            if (bs.d[b1] == 0)
              this.d.addElement(new de(bs.a[b1], this, b1 + 100, null)); 
          } 
          a();
          return;
        } 
        return;
      case 99:
        br.a().c();
        bs.a(this.c, false);
        break;
      default:
        br.a().e();
        bs.a(b1 - 100, true);
        bs.k();
        if (a.ak == null)
          a.ak = new bs(); 
        break;
    } 
    a.ak.i();
    a.ak.b();
  }
  
  private void a(int paramInt1, int paramInt2) {
    this.n = false;
    if (l.c != 1)
      this.a = true; 
    this.S = 10;
    this.w = a.A / 3 << 1;
    this.x = a.B / 3 << 1;
    this.u = (a.A - this.w) / 2;
    this.v = (a.B - this.x) / 2 + 20;
    this.y = a.A / 2;
    this.z = this.v - 30;
    this.C = this.w / 3 << 1;
    this.I = this.w - this.C - 15;
    if (this.I < 80) {
      this.I = 80;
      this.C = this.w - this.I - 15;
    } 
    this.D = this.x - 10 - this.S;
    this.A = this.u + this.w - this.C - 5;
    this.B = this.v + 5;
    this.G = this.u + 5;
    this.H = this.v + 5;
    this.J = 20;
    this.K = this.u + 5;
    this.L = this.v + this.X.length * (this.J + 5) + 5;
    this.M = this.I;
    this.N = this.x - 5 + this.X.length * (this.J + 5) + 5 - this.S;
    this.O = 10;
    this.P = 70;
    this.Q = 20;
    a((byte)paramInt1, (byte)paramInt2);
  }
  
  private void a(byte paramByte1, byte paramByte2) {
    this.d.removeAllElements();
    this.R = 1;
    this.p = paramByte1;
    aw.a(paramByte1);
    int j;
    for (j = 0; j < bs.a.length; j++) {
      if (paramByte1 == 1) {
        if (bs.d[j] != 0 && bs.h[j] == 1)
          this.R = 2; 
      } else if (bs.h[j] == 1) {
        this.R = 2;
      } 
    } 
    if (paramByte2 > (byte)(this.R - 1))
      paramByte2 = (byte)(this.R - 1); 
    this.r = paramByte2;
    for (j = 0; j < bs.a.length; j++) {
      if (paramByte1 == 1) {
        if (bs.d[j] != 0) {
          if (bs.h[j] == 1)
            this.R = 2; 
          if (bs.h[j] == paramByte2) {
            byte b1 = -1;
            if (bs.e != null && j < bs.e.length)
              b1 = bs.e[j]; 
            if (!b || b1 != -1) {
              de de1;
              (de1 = new de(bs.a[j], this, j + 100, null)).r = (bs.i[j] == 1);
              if (b1 >= 0)
                de1.i = aa[b1]; 
              this.d.addElement(de1);
            } 
          } 
        } 
      } else {
        if (bs.h[j] == 1)
          this.R = 2; 
        if (bs.d[j] == 0 && bs.h[j] == paramByte2) {
          byte b1 = -1;
          if (bs.e != null && j < bs.e.length)
            b1 = bs.e[j]; 
          if (!b || b1 != -1) {
            de de1;
            (de1 = new de(bs.a[j], this, j + 100, null)).r = (bs.i[j] == 1);
            if (b1 >= 0)
              de1.i = aa[b1]; 
            this.d.addElement(de1);
          } 
        } 
      } 
    } 
    eu eu1 = this;
    for (paramByte2 = 0; paramByte2 < eu1.d.size() - 1; paramByte2++) {
      de de1 = eu1.d.elementAt(paramByte2);
      for (int k = paramByte2 + 1; k < eu1.d.size(); k++) {
        de de2;
        if ((de2 = eu1.d.elementAt(k)).r && !de1.r) {
          de de3 = de2;
          de2 = de1;
          de1 = de3;
          eu1.d.setElementAt(de1, paramByte2);
          eu1.d.setElementAt(de2, k);
        } 
      } 
    } 
    (eu1 = this).c = bs.n;
    eu1.h = 5;
    eu1.f = 76;
    eu1.g = bb.cr;
    eu1.i = 1;
    int i = eu1.A + eu1.C / 2 + 3;
    eu1.F = eu1.B + 5;
    System.out.println(">>>>" + eu1.C + "/(" + eu1.f + " + " + eu1.h + ")");
    eu1.i = eu1.C / (eu1.f + eu1.h);
    if (eu1.i <= 0)
      eu1.i = 1; 
    eu1.j = eu1.d.size() / eu1.i + ((eu1.d.size() % eu1.i == 0) ? 0 : 1);
    eu1.E = i - eu1.i * (eu1.f + eu1.h) / 2;
    for (j = 0; j < eu1.d.size(); j++) {
      de de1;
      if ((de1 = eu1.d.elementAt(j)) != null) {
        int k = eu1.E + j % eu1.i * (eu1.f + eu1.h);
        int m = eu1.F + j / eu1.i * (eu1.g + eu1.h);
        de1.j = k;
        de1.k = m;
        de1.l = eu1.f;
      } 
    } 
    eu1.o = new bh(eu1.A, eu1.B, eu1.C, eu1.D, 0, 0, 0, true);
    j = eu1.j * (eu1.g + eu1.h) - eu1.D;
    bh bh1 = eu1.o;
    if (j < 0)
      j = 0; 
    bh1.c = j;
    if (bh1.b > bh1.c)
      bh1.b = bh1.c; 
    if (bh1.a > bh1.c)
      bh1.a = bh1.c; 
    (bh1 = eu1.o).a = 0;
  }
  
  private void a(en paramen, int paramInt1, int paramInt2) {
    paramInt1 -= 5;
    this.T = paramInt1;
    bo.a(paramen, paramInt1, paramInt2, this.P, this.Q, 0, true);
    di.f.a(paramen, this.W[this.p], paramInt1 + (this.P - 10) / 2, paramInt2 + 5, 2);
    paramen.a(aa.R, 0, 30, 9, 6, 0, paramInt1 + this.P - 10, paramInt2 + 14, 33);
    if (this.t) {
      this.U = paramInt2 + this.Q + 5;
      paramen.a(10254674);
      paramen.d(paramInt1, this.U, this.P, this.W.length * this.V + 1);
      for (paramInt2 = 0; paramInt2 < this.W.length; paramInt2++) {
        di.s.a(paramen, this.W[paramInt2], paramInt1 + this.P / 2, this.U + paramInt2 * this.V + 2, 2);
        if (this.p == paramInt2) {
          paramen.a(15591444);
          paramen.c(paramInt1 + 2, this.U + paramInt2 * this.V + 1, this.P - 4, this.V - 2);
        } 
      } 
    } 
  }
  
  private void e() {
    if (!this.a)
      return; 
    int i = 0;
    if (this.o != null) {
      this.o.b();
      if (a.b(this.A, 0, this.C, a.B))
        this.o.a(); 
      i = this.o.b;
    } 
    if (a.b(this.A, this.B, this.C, this.D)) {
      int j = (a.p - this.E) / (this.f + this.h) + (a.q - this.F + i) / (this.g + this.h) * this.i;
      int k = this.d.size();
      if (j >= 0 && j < k) {
        this.c = j;
        for (j = 0; j < this.d.size(); j++) {
          de de1;
          if ((de1 = this.d.elementAt(j)) != null)
            if (j == this.c) {
              if (de1.a(0, i))
                de1.a(); 
            } else {
              de1.n = false;
            }  
        } 
      } 
    } 
    if (a.b(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && a.m) {
      b = !b;
      a(this.p, this.r);
    } 
    if (this.R == 1)
      return; 
    for (byte b1 = 0; b1 < this.R; b1 = (byte)(b1 + 1)) {
      int j = this.H + b1 * (this.J + 5);
      if (a.a(this.G, j, this.I, this.J) && a.k) {
        a(this.p, b1);
        return;
      } 
    } 
  }
  
  private void f() {
    if (a.b(this.T, this.O, this.P, this.Q) && a.m) {
      this.t = !this.t;
      a.m = false;
    } 
    if (this.t)
      for (byte b1 = 0; b1 < this.W.length; b1 = (byte)(b1 + 1)) {
        int i = this.U + b1 * this.V;
        if (a.a(this.T, i, this.P, this.V) && a.k) {
          if (this.n) {
            this.p = b1;
          } else {
            a(b1, this.r);
          } 
          this.t = false;
          return;
        } 
      }  
  }
  
  private void g() {
    byte[] arrayOfByte = av.b(m);
    try {
      this.p = arrayOfByte[0];
      this.q = arrayOfByte[1];
      return;
    } catch (Exception exception) {
      this.p = this.q = 0;
      return;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\eu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */