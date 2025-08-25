import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class x extends bb implements b {
  public cd a;
  
  public cd b;
  
  public static boolean c = false;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private de u;
  
  private de v;
  
  private de w;
  
  private de x;
  
  private de y;
  
  private de z;
  
  public static boolean d;
  
  public static boolean e;
  
  public static boolean f;
  
  public static boolean g;
  
  public static boolean h;
  
  public static String i;
  
  public static Image j;
  
  public static short k;
  
  public static long l;
  
  public static long m;
  
  private int A;
  
  private de B;
  
  private int C;
  
  private int D = a.D - 30;
  
  private int E;
  
  private int F = -1;
  
  public boolean n = false;
  
  private int G = 2;
  
  private int H = 0;
  
  private int I = -40;
  
  private int J = 1;
  
  private de K;
  
  static {
    (new int[5])[1] = 8;
    (new int[5])[2] = 2;
    (new int[5])[3] = 6;
    (new int[5])[4] = 9;
  }
  
  public final void b() {
    bu.a();
    this.a.e = true;
    this.b.e = false;
    if (a.e)
      this.a.e = false; 
    a.a(0);
    this.cm = new de(aw.bz, this, 101, null);
    super.b();
  }
  
  public x() {
    if ((bv.o = (byte)(int)(System.currentTimeMillis() % 9L)) == 5 || bv.o == 6)
      bv.o = 4; 
    p.a(-1, -1);
    p.j = 100;
    p.k = 200;
    if (a.B > 200) {
      this.r = a.D - 80;
    } else {
      this.r = a.D - 65;
    } 
    x x1;
    (x1 = this).q = -50;
    int i = (a.A >= 200) ? 160 : 140;
    this.p = i;
    this.A = a.D - bb.cp - 5;
    if (a.B <= 160)
      this.A = 20; 
    this.a = new cd();
    this.a.b = a.D - bb.cp - 9;
    this.a.c = this.p;
    this.a.d = bb.cp + 2;
    this.a.e = true;
    this.a.c(0);
    this.a.i = String.valueOf((aw.fA == 2) ? "" : (String.valueOf(aw.ai) + "/")) + aw.aj;
    this.b = new cd();
    this.b.b = a.D - 4;
    this.b.c(2);
    this.b.c = this.p;
    this.b.d = bb.cp + 2;
    this.A += 35;
    this.s = true;
    if ((i = av.d("check")) == 1) {
      this.s = true;
    } else if (i == 2) {
      this.s = false;
    } 
    this.a.a(av.c("acc"));
    this.b.a(av.c("pass"));
    this.a.a((String)null);
    this.b.a((String)null);
    if (this.K == null) {
      this.K = new de("Gọi hotline", this, 13, null);
      this.K.j = a.A - 75;
      if (l.c == 1 && !a.e) {
        this.K.k = a.B - 20;
      } else {
        this.K.k = 8;
      } 
    } 
    this.o = 0;
    this.u = new de((a.A > 200) ? aw.aw : aw.ax, (b)a.h, 888393, null);
    this.w = new de(aw.ay, this, 2002, null);
    this.y = new de(aw.bu, this, 10021, null);
    this.z = new de(aw.bz, this, 101, null);
    this.cm = this.x = new de(aw.bh, this, 2003, null);
    if (a.e) {
      this.u.j = a.A / 2 + 8;
      this.x.j = a.A / 2 - bb.cq - 8;
      if (a.B >= 200) {
        this.u.k = this.D + 110;
        this.x.k = this.D + 110;
      } 
      this.y.j = a.A / 2 + 3;
      this.y.k = this.D + 110;
      this.w.j = a.A / 2 - 84;
      this.w.k = this.x.k;
      this.z.j = 2;
      this.z.k = a.B - bb.cr;
    } 
    this.E = 170;
    i = 184;
    if (184 >= a.A)
      i = 152; 
    this.C = a.A / 2 - i / 2;
    this.D = a.D - 30;
    this.a.a = this.C + 10;
    this.a.b = this.D + 20;
    this.B = new de(aw.br, this, 2008, null);
    this.B.j = a.A / 2 - 84;
    this.B.k = this.u.k;
    this.v = new de(aw.ab, this, 1003, null);
    this.v.j = a.A / 2 + 3;
    this.v.k = this.u.k;
    this.cn = this.B;
    this.cm = this.v;
  }
  
  public final void a() {
    ds.c("user ao= " + av.c("userAo" + bs.n));
    String str1 = av.c("acc");
    String str2 = av.c("pass");
    if ((str1 == null || str1.equals("")) && av.c("userAo" + bs.n) != null && !av.c("userAo" + bs.n).equals("")) {
      this.n = true;
    } else {
      this.n = false;
    } 
    ds.c("isLogin 2= " + this.n);
    if ((str1 == null || str1.equals("")) && this.n) {
      str1 = av.c("userAo" + bs.n);
      str2 = "a";
    } 
    ds.c("user = " + str1 + " pass= " + str2);
    if (str1 == null || str2 == null || str1.equals(""))
      return; 
    if (str2.equals("")) {
      this.o = 1;
      this.a.e = false;
      this.b.e = true;
      if (!a.e)
        this.co = this.b.j; 
      return;
    } 
    if (!br.a().d())
      a.b(); 
    bt.a().a(str1, str2, "2.4.6", this.n ? 1 : 0);
    av.a(bs.w, bs.n);
    if ((br.a()).d) {
      a.i();
    } else {
      a.a(String.valueOf(aw.x) + " [0]", 8884, null);
    } 
    this.o = 0;
    if (!this.n)
      h(); 
    l.d();
  }
  
  public final void e() {
    if (this.s) {
      av.a("check", 1);
      av.a("acc", this.a.d().toLowerCase().trim());
      av.a("pass", this.b.d().toLowerCase().trim());
      return;
    } 
    av.a("check", 2);
    av.a("acc", "");
    av.a("pass", "");
  }
  
  public final void c() {
    a.i();
    if (k > 0 && (m = System.currentTimeMillis()) - l >= 1000L) {
      if ((k = (short)(k - 1)) == 0)
        a.I.a(); 
      l = m;
    } 
    if (this.n && !this.t) {
      this.a.i = String.valueOf((aw.fA == 2) ? "" : (String.valueOf(aw.ai) + "/")) + aw.aj;
      this.b.i = aw.ac;
      this.a.k = false;
      this.b.k = false;
      this.a.c();
      this.b.c();
    } else {
      this.a.i = String.valueOf((aw.fA == 2) ? "" : (String.valueOf(aw.ai) + "/")) + aw.aj;
      this.b.i = aw.ac;
      this.a.c();
      this.b.c();
    } 
    for (byte b1 = 0; b1 < dc.x.size(); b1++) {
      dc dc;
      (dc = dc.x.elementAt(b1)).a();
    } 
    if (d && !e && !h && !f && !g) {
      d = false;
      System.gc();
      bt.a().r();
    } 
    if (++p.j > a.A * 3 + 100)
      p.j = 100; 
    if (ae.m != null)
      return; 
    x x1;
    if ((x1 = this).r != x1.q)
      x1.q += x1.r - x1.q >> 1; 
    if (this.H >= 0) {
      this.I += this.J * this.H;
      this.H += this.J * this.G;
      if (this.H <= 0)
        this.J = -this.J; 
      if (this.I > 0) {
        this.J = -this.J;
        this.H -= 2 * this.G;
      } 
    } 
    if (this.F >= 0 && a.w % 100 == 0) {
      (x1 = this).F++;
      if (x1.F >= aw.aX.length)
        x1.F = 0; 
      if (a.K == a.L && a.L.a)
        a.L.a(aw.aX[x1.F]); 
    } 
    if (this.n && !this.t) {
      this.a.k = false;
      this.b.k = false;
      this.a.c();
      this.b.c();
    } else {
      this.a.i = String.valueOf((aw.fA == 2) ? "" : (String.valueOf(aw.ai) + "/")) + aw.aj;
      this.b.i = aw.ac;
      this.a.c();
      this.b.c();
    } 
    if (a.e) {
      if (this.t) {
        this.cn = this.w;
        this.cm = this.y;
      } else {
        this.cn = this.B;
        this.cm = this.v;
      } 
      if (this.z != null && this.z.c()) {
        this.z.a();
        return;
      } 
    } else {
      if (this.t) {
        this.cn = this.w;
        this.cm = this.y;
        return;
      } 
      this.cn = this.B;
      this.cm = this.v;
    } 
  }
  
  public final void a(int paramInt) {
    if (this.a.e) {
      this.a.a(paramInt);
    } else if (this.b.e) {
      this.b.a(paramInt);
    } 
    super.a(paramInt);
  }
  
  public final void a(en paramen) {
    a.c(paramen);
    int i = this.a.b - 50;
    if (a.B <= 220)
      i += 5; 
    di.s.a(paramen, "v2.4.6", a.A - 2, 17, 1, di.o);
    if (l.c == 1 && !a.e) {
      di.s.a(paramen, bs.l, a.A - 2, a.B - 15, 1, di.o);
    } else {
      di.s.a(paramen, bs.l, a.A - 2, 2, 1, di.o);
    } 
    if (a.K == null) {
      char c = (a.A >= 200) ? '´' : ' ';
      bo.a(paramen, this.C, this.D - 10, c, 105, -1, true);
      if (a.B > 160 && j != null)
        paramen.a(j, a.C, i, 3); 
      i = 184;
      if (184 >= a.A)
        i = 152; 
      this.C = a.A / 2 - i / 2;
      this.a.a = this.C + 10;
      this.a.b = this.D + 20;
      this.b.a = this.C + 10;
      this.b.b = this.D + 55;
      this.a.a(paramen);
      this.b.a(paramen);
      if (a.A < 176) {
        di.g.a(paramen, String.valueOf(aw.ak) + ":", this.a.a - 35, this.a.b + 7, 0);
        di.g.a(paramen, String.valueOf(aw.al) + ":", this.b.a - 35, this.b.b + 7, 0);
        di.g.a(paramen, String.valueOf(aw.aI) + ": " + i, a.A / 2, this.b.b + 32, 2);
      } 
    } 
    super.a(paramen);
    this.z.a(paramen);
  }
  
  public final void d() {
    if (a.e && this.K != null && this.K.c())
      this.K.a(); 
    if (c)
      return; 
    if (!a.e)
      if (this.a.e) {
        this.co = this.a.j;
      } else {
        this.co = this.b.j;
      }  
    if (a.i[2]) {
      this.o--;
      if (this.o < 0)
        this.o = 1; 
    } else if (a.i[8]) {
      this.o++;
      if (this.o > 1)
        this.o = 1; 
    } 
    if (a.i[2] || a.i[8]) {
      a.f();
      if (!this.n || this.t)
        if (this.o == 1) {
          this.a.e = false;
          this.b.e = true;
        } else if (this.o == 0) {
          this.a.e = true;
          this.b.e = false;
        } else {
          this.a.e = false;
          this.b.e = false;
        }  
    } 
    if (a.e) {
      if (this.t) {
        this.cn = this.w;
        this.cm = this.y;
      } else {
        this.cn = this.B;
        this.cm = this.v;
      } 
    } else if (this.t) {
      this.cn = this.w;
      this.cm = this.y;
    } else {
      this.cn = this.B;
      this.cm = this.v;
    } 
    if (a.m && (!this.n || this.t))
      if (a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
        this.o = 0;
      } else if (a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
        this.o = 1;
      }  
    super.d();
    a.f();
  }
  
  public final void a(int paramInt, Object paramObject) {
    String str;
    x x1;
    int i;
    switch (paramInt) {
      case 101:
        a.ak.b();
        return;
      case 13:
        switch (l.c) {
          case 1:
            l.b();
            return;
          case 3:
          case 5:
            return;
          case 6:
            return;
        } 
        return;
      case 1000:
        try {
          GameMidlet.f.platformRequest((String)paramObject);
        } catch (Exception exception2) {
          Exception exception1;
          (exception1 = null).printStackTrace();
        } 
        a.h();
        return;
      case 1001:
        a.h();
        this.t = false;
        return;
      case 1002:
        a.i();
        if ((str = av.c("userAo" + bs.n)) == null || str.equals("")) {
          bt.a().f("");
          return;
        } 
        a.I.n = true;
        a.b();
        bt.a().c();
        bt.a().a(str, "", "2.4.6", (byte)1);
        return;
      case 1004:
        bs.a();
        a.ak.b();
        return;
      case 10021:
        h();
        return;
      case 1003:
        a.a(aw.am);
        return;
      case 1005:
        try {
          GameMidlet.f.platformRequest("http://ngocrongonline.com");
          return;
        } catch (Exception exception) {
          (str = null).printStackTrace();
          return;
        } 
      case 10041:
        av.a("lowGraphic", 0);
        a.a(aw.cL, 8885, null);
        return;
      case 10042:
        av.a("lowGraphic", 1);
        a.a(aw.cL, 8885, null);
        return;
      case 2000:
        return;
      case 2001:
        if (this.s) {
          this.s = false;
          return;
        } 
        this.s = true;
        return;
      case 2002:
        if ((x1 = this).a.d().equals("")) {
          a.a(aw.T);
          break;
        } 
        x1.a.d().toCharArray();
        if (x1.b.d().equals("")) {
          a.a(aw.U);
          break;
        } 
        if (x1.a.d().length() < 5) {
          a.a(aw.V);
          break;
        } 
        paramObject = null;
        if (aw.fA == 2) {
          if (x1.a.d().indexOf("@") == -1 || x1.a.d().indexOf(".") == -1)
            paramObject = aw.X; 
          i = 0;
        } else {
          try {
            Long.parseLong(x1.a.d());
            if (x1.a.d().length() < 8 || x1.a.d().length() > 12 || (!x1.a.d().startsWith("0") && !x1.a.d().startsWith("84")))
              paramObject = aw.W; 
            i = 1;
          } catch (Exception exception) {
            if (x1.a.d().indexOf("@") == -1 || x1.a.d().indexOf(".") == -1)
              paramObject = aw.X; 
            i = 0;
          } 
        } 
        if (paramObject != null) {
          a.a((String)paramObject);
        } else {
          a.L.a(String.valueOf(aw.ah) + ((i == 1) ? (String.valueOf(aw.ai) + ": ") : (String.valueOf(aw.aj) + ": ")) + x1.a.d() + "\n" + aw.ac + ": " + x1.b.d(), new de(aw.bt, x1, 4000, null), null, new de(aw.bn, (b)a.h, 8882, null));
        } 
        a.K = a.L;
        return;
      case 2003:
        x1 = this;
        (paramObject = new el("vMenu Login")).addElement(new de(aw.Y, x1, 2004, null));
        if (!x1.n)
          paramObject.addElement(new de(aw.Z, x1, 1004, null)); 
        paramObject.addElement(new de(aw.ab, x1, 1003, null));
        paramObject.addElement(new de(aw.aH, x1, 1005, null));
        if ((i = av.d("lowGraphic")) == 1) {
          paramObject.addElement(new de(aw.bU, x1, 10041, null));
        } else {
          paramObject.addElement(new de(aw.bV, x1, 10042, null));
        } 
        paramObject.addElement(new de(aw.bo, (b)a.h, 8885, null));
        a.F.a((el)paramObject);
        return;
      case 2004:
        f();
        return;
      case 2008:
        av.a("acc", this.a.d().trim());
        av.a("pass", this.b.d().trim());
        if (bs.u) {
          a.ak.b();
          return;
        } 
        a.ak.j();
        return;
      case 4000:
        paramObject = this.a.d();
        x1 = this;
        a.b(aw.aC);
        a.b();
        a.b(aw.I);
        av.c("passAo");
        bt.a().a((String)paramObject, x1.b.d(), av.c("userAo" + bs.n), "2.4.6");
        av.a("acc", (String)paramObject);
        av.a("pass", x1.b.d());
        break;
    } 
  }
  
  private void h() {
    if (this.n) {
      a();
      return;
    } 
    this.t = false;
    this.b.e = false;
    this.a.e = true;
    this.cm = this.x;
  }
  
  public final void f() {
    a.h();
    a.a(aw.fV);
    this.t = true;
    this.b.e = false;
    this.a.e = true;
  }
  
  public static void g() {
    l.d();
    if (a.I.n) {
      a.a(aw.fU, new de(aw.bm, a.G, 10019, null), new de(aw.bn, a.G, 10020, null));
      return;
    } 
    eu.b = false;
    a.e();
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */