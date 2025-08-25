import main.GameMidlet;
import main.a;

public final class bi extends bb implements b {
  private cd a;
  
  private cd b;
  
  private cd c;
  
  private cd d;
  
  private cd e;
  
  private cd f;
  
  private cd g;
  
  private cd h;
  
  private cd i;
  
  private static boolean j = false;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private de p;
  
  private de q;
  
  private de r;
  
  private de s;
  
  private de t;
  
  private int u;
  
  private de v;
  
  private int w;
  
  private int x = 130;
  
  private int y;
  
  private int z = -1;
  
  private boolean A = false;
  
  private int B = 2;
  
  private int C = 0;
  
  private int D = -40;
  
  private int E = 1;
  
  static {
    (new int[5])[1] = 8;
    (new int[5])[2] = 2;
    (new int[5])[3] = 6;
    (new int[5])[4] = 9;
  }
  
  public final void b() {
    System.out.println("Res switch");
    bu.a();
    this.a.e = true;
    this.b.e = false;
    if (a.e)
      this.a.e = false; 
    super.b();
  }
  
  public bi(byte paramByte) {
    if ((bv.o = (byte)(int)(System.currentTimeMillis() % 9L)) == 5 || bv.o == 6)
      bv.o = 4; 
    p.a(-1, -1);
    p.j = 100;
    p.k = 200;
    if (a.B > 200) {
      this.m = a.D - 80;
    } else {
      this.m = a.D - 65;
    } 
    bi bi1;
    (bi1 = this).l = -50;
    this.u = a.D - bb.cp - 5;
    if (a.B <= 160)
      this.u = 20; 
    this.i = new cd();
    this.i.c(1);
    this.i.c = 220;
    this.i.d = bb.cp + 2;
    this.i.i = "Số điện thoại";
    if (paramByte == 1)
      this.i.a("01234567890"); 
    this.a = new cd();
    this.a.c = 220;
    this.a.d = bb.cp + 2;
    this.a.e = true;
    this.a.i = "Họ và tên";
    if (paramByte == 1)
      this.a.a("Nguyễn Văn A"); 
    this.a.c(0);
    this.b = new cd();
    this.b.c(1);
    this.b.c = 70;
    this.b.d = bb.cp + 2;
    this.b.i = "Ngày sinh";
    if (paramByte == 1)
      this.b.a("01"); 
    this.c = new cd();
    this.c.c(1);
    this.c.c = 70;
    this.c.d = bb.cp + 2;
    this.c.i = "Tháng sinh";
    if (paramByte == 1)
      this.c.a("01"); 
    this.d = new cd();
    this.d.c(1);
    this.d.c = 70;
    this.d.d = bb.cp + 2;
    this.d.i = "Năm sinh";
    if (paramByte == 1)
      this.d.a("1980"); 
    this.e = new cd();
    this.e.c(0);
    this.e.c = 220;
    this.e.d = bb.cp + 2;
    this.e.i = "Địa chỉ đăng ký thường trú";
    if (paramByte == 1)
      this.e.a("123 đường số 1, Quận 1, TP.HCM"); 
    this.f = new cd();
    this.f.c(1);
    this.f.c = 220;
    this.f.d = bb.cp + 2;
    this.f.i = "Số Chứng minh nhân dân hoặc số hộ chiếu";
    if (paramByte == 1)
      this.f.a("123456789"); 
    this.g = new cd();
    this.g.c(0);
    this.g.c = 220;
    this.g.d = bb.cp + 2;
    this.g.i = "Ngày cấp";
    if (paramByte == 1)
      this.g.a("01/01/1990"); 
    this.h = new cd();
    this.h.c(0);
    this.h.c = 220;
    this.h.d = bb.cp + 2;
    this.h.i = "Nơi cấp";
    if (paramByte == 1)
      this.h.a("TP.HCM"); 
    this.u += 35;
    this.n = true;
    this.k = 0;
    this.p = new de((a.A > 200) ? aw.aw : aw.ax, (b)a.h, 888393, null);
    this.r = new de(aw.ay, this, 2002, null);
    this.t = new de(aw.bu, this, 10021, null);
    this.cm = this.s = new de(aw.bh, this, 2003, null);
    if (a.e) {
      this.p.j = a.A / 2 - 100;
      this.s.j = a.A / 2 - bb.cq - 8;
      if (a.B >= 200) {
        this.p.k = a.B / 2 - 40;
        this.s.k = this.x + 110;
      } 
      this.t.j = a.A / 2 + 3;
      this.t.k = this.x + 110;
      this.r.j = a.A / 2 - 84;
      this.r.k = this.s.k;
    } 
    this.y = 170;
    char c = '¸';
    if (184 >= a.A)
      c = ''; 
    this.w = a.A / 2 - c / 2;
    this.x = 5;
    this.a.a = this.w + 10;
    this.a.b = this.x + 20;
    this.v = new de(aw.br, this, 2008, null);
    this.v.j = 260;
    this.v.k = a.B - 60;
    this.q = new de("Thoát", this, 1003, null);
    this.q.j = 260;
    this.q.k = a.B - 30;
    this.v.j = a.A / 2 - 80;
    this.q.j = a.A / 2 + 10;
    this.v.k = a.B - 25;
    this.cn = this.v;
    this.cm = this.q;
  }
  
  public final void c() {
    this.a.c();
    this.i.c();
    this.b.c();
    this.c.c();
    this.d.c();
    for (byte b1 = 0; b1 < dc.x.size(); b1++) {
      dc dc;
      (dc = dc.x.elementAt(b1)).a();
    } 
    if (++p.j > a.A * 3 + 100)
      p.j = 100; 
    if (ae.m != null)
      return; 
    bi bi1;
    if ((bi1 = this).m != bi1.l)
      bi1.l += bi1.m - bi1.l >> 1; 
    if (this.C >= 0) {
      this.D += this.E * this.C;
      this.C += this.E * this.B;
      if (this.C <= 0)
        this.E = -this.E; 
      if (this.D > 0) {
        this.E = -this.E;
        this.C -= 2 * this.B;
      } 
    } 
    if (this.z >= 0 && a.w % 100 == 0) {
      (bi1 = this).z++;
      if (bi1.z >= aw.aX.length)
        bi1.z = 0; 
      if (a.K == a.L && a.L.a)
        a.L.a(aw.aX[bi1.z]); 
    } 
    if (a.e) {
      if (this.o) {
        this.cn = this.r;
        this.cm = this.t;
        return;
      } 
      this.cn = this.v;
      this.cm = this.q;
      return;
    } 
    if (this.o) {
      this.cn = this.r;
      this.cm = this.t;
      return;
    } 
    this.cn = this.v;
    this.cm = this.q;
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
    if (ae.m != null)
      return; 
    if (ae.n != null)
      return; 
    if (a.K == null) {
      this.w = a.C - 120;
      this.x = (a.B - 110) / 2;
      bo.a(paramen, this.w, this.x, 240, 110, -1, true);
      this.a.a = this.w + 10;
      this.a.b = this.x + 15;
      this.i.a = this.a.a;
      this.a.b += 30;
      this.b.a = this.w + 10;
      this.i.b += 30;
      this.b.a += 75;
      this.c.b = this.b.b;
      this.c.a += 75;
      this.d.b = this.c.b;
      di.i.a(paramen, "Cập nhật thông tin", a.C, this.x + 2, 2);
      this.a.a(paramen);
      this.i.a(paramen);
      this.b.a(paramen);
      this.c.a(paramen);
      this.d.a(paramen);
    } 
    a.a(paramen);
    String str = "2.4.6";
    paramen.a(a.O);
    paramen.d(a.A - 40, 4, 36, 11);
    di.o.a(paramen, str, a.A - 22, 4, 2);
    paramen.a(a.ah, 10, 10, 0);
    super.a(paramen);
  }
  
  public final void d() {
    if (!a.e)
      if (this.a.e) {
        this.co = this.a.j;
      } else {
        this.co = this.b.j;
      }  
    if (a.i[2]) {
      this.k--;
      if (this.k < 0)
        this.k = 1; 
    } else if (a.i[8]) {
      this.k++;
      if (this.k > 1)
        this.k = 1; 
    } 
    if (a.i[2] || a.i[8]) {
      a.f();
      if (this.k == 1) {
        this.a.e = false;
        this.b.e = true;
      } else if (this.k == 0) {
        this.a.e = true;
        this.b.e = false;
      } else {
        this.a.e = false;
        this.b.e = false;
      } 
    } 
    if (a.e) {
      if (this.o) {
        this.cn = this.r;
        this.cm = this.t;
      } else {
        this.cn = this.v;
        this.cm = this.q;
      } 
    } else if (this.o) {
      this.cn = this.r;
      this.cm = this.t;
    } else {
      this.cn = this.v;
      this.cm = this.q;
    } 
    if (a.m)
      if (a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
        this.k = 0;
      } else if (a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
        this.k = 1;
      }  
    super.d();
    a.f();
  }
  
  public final void a(int paramInt, Object paramObject) {
    bi bi1;
    int i;
    switch (paramInt) {
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
        this.o = false;
        return;
      case 1002:
        return;
      case 1004:
        bs.a();
        a.ak.b();
        return;
      case 10021:
        (bi1 = this).o = false;
        bi1.b.e = false;
        bi1.a.e = true;
        bi1.cm = bi1.s;
        return;
      case 1003:
        a.ak.b();
        br.a().e();
        return;
      case 1005:
        try {
          GameMidlet.f.platformRequest("http://ngocrongonline.com");
          return;
        } catch (Exception exception) {
          (bi1 = null).printStackTrace();
          return;
        } 
      case 10041:
        return;
      case 10042:
        return;
      case 2000:
        return;
      case 2001:
        if (this.n) {
          this.n = false;
          return;
        } 
        this.n = true;
        return;
      case 2002:
        if ((bi1 = this).a.d().equals("")) {
          a.a(aw.T);
          break;
        } 
        bi1.a.d().toCharArray();
        if (bi1.b.d().equals("")) {
          a.a(aw.U);
          break;
        } 
        if (bi1.a.d().length() < 5) {
          a.a(aw.V);
          break;
        } 
        paramObject = null;
        if (aw.fA == 2) {
          if (bi1.a.d().indexOf("@") == -1 || bi1.a.d().indexOf(".") == -1)
            paramObject = aw.X; 
          i = 0;
        } else {
          try {
            Long.parseLong(bi1.a.d());
            if (bi1.a.d().length() < 8 || bi1.a.d().length() > 12 || (!bi1.a.d().startsWith("0") && !bi1.a.d().startsWith("84")))
              paramObject = aw.W; 
            i = 1;
          } catch (Exception exception) {
            if (bi1.a.d().indexOf("@") == -1 || bi1.a.d().indexOf(".") == -1)
              paramObject = aw.X; 
            i = 0;
          } 
        } 
        if (paramObject != null) {
          a.a((String)paramObject);
        } else {
          a.L.a(String.valueOf(aw.ah) + ((i == 1) ? (String.valueOf(aw.ai) + ": ") : (String.valueOf(aw.aj) + ": ")) + bi1.a.d() + "\n" + aw.ac + ": " + bi1.b.d(), new de(aw.bt, bi1, 4000, null), null, new de(aw.bn, (b)a.h, 8882, null));
        } 
        a.K = a.L;
        return;
      case 2003:
        bi1 = this;
        (paramObject = new el("vMenu Login")).addElement(new de(aw.Y, bi1, 2004, null));
        paramObject.addElement(new de(aw.Z, bi1, 1004, null));
        paramObject.addElement(new de(aw.ab, bi1, 1003, null));
        paramObject.addElement(new de(aw.aH, bi1, 1005, null));
        if ((i = av.d("lowGraphic")) == 1) {
          paramObject.addElement(new de(aw.bU, bi1, 10041, null));
        } else {
          paramObject.addElement(new de(aw.bV, bi1, 10042, null));
        } 
        paramObject.addElement(new de(aw.bo, (b)a.h, 8885, null));
        a.F.a((el)paramObject);
        return;
      case 2004:
        bi1 = this;
        a.h();
        a.a(aw.fV);
        bi1.o = true;
        bi1.b.e = false;
        bi1.a.e = true;
        return;
      case 2008:
        if (this.b.d().equals("") || this.c.d().equals("") || this.d.d().equals("") || this.i.d().equals("") || this.a.d().equals("")) {
          a.a("Vui lòng điền đầy đủ thông tin");
          return;
        } 
        a.a(aw.aB);
        bt.a().a(this.b.d(), this.c.d(), this.d.d(), "", "", "", "", this.i.d(), this.a.d());
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */