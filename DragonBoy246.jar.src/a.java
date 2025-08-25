import main.GameMidlet;
import main.a;

public final class a extends bb implements b {
  public static a a;
  
  private cd b;
  
  private cd c;
  
  private int d;
  
  private int e;
  
  private int f = a.A - 20;
  
  private int g;
  
  private String[] h;
  
  private int i;
  
  public a() {
    if (this.f > 320)
      this.f = 320; 
    this.h = di.g.a(aw.bb, this.f - 20);
    this.d = (a.A - this.f) / 2;
    this.e = a.B - 150 - (this.h.length - 1) * 20;
    this.g = 110 + (this.h.length - 1) * 20;
    this.b = new cd();
    this.b.i = aw.aZ;
    this.b.a = this.d + 10;
    this.b.b = this.e + 35 + (this.h.length - 1) * 20;
    this.b.c = this.f - 20;
    this.b.d = bb.cp + 2;
    if (a.e) {
      this.b.e = false;
    } else {
      this.b.e = true;
    } 
    this.b.c(0);
    if (!a.e)
      this.co = this.b.j; 
    this.c = new cd();
    this.c.i = aw.ba;
    this.c.a = this.d + 10;
    this.b.b += 35;
    this.c.c = this.f - 20;
    this.c.d = bb.cp + 2;
    this.c.e = false;
    this.c.c(0);
    this.cm = new de(aw.bi, this, 1, null);
    this.cn = new de(aw.bc, this, 2, null);
    if (a.e) {
      this.cn.j = a.A / 2 + 18;
      this.cm.j = a.A / 2 - 85;
      this.cm.k = this.e + this.g + 5;
    } 
  }
  
  public static a a() {
    if (a == null)
      a = new a(); 
    return a;
  }
  
  public final void b() {
    this.i = 0;
    try {
      if (aw.fA == 0)
        GameMidlet.f.platformRequest("http://ngocrongonline.com/"); 
      if (aw.fA == 2)
        GameMidlet.f.platformRequest("http://dragonball.indonaga.com/"); 
      if (aw.fA == 1) {
        GameMidlet.f.platformRequest("http://world.teamobi.com/games-page-0.html");
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void a(en paramen) {
    p.j().a(paramen);
    bo.a(paramen, this.d, this.e, this.f, this.g, -1, true);
    for (byte b1 = 0; b1 < this.h.length; b1++)
      di.g.a(paramen, this.h[b1], a.A / 2, this.e + 15 + b1 * 20, 2); 
    this.b.a(paramen);
    this.c.a(paramen);
    super.a(paramen);
  }
  
  public final void c() {
    p.j().c();
    this.b.c();
    this.c.c();
  }
  
  public final void a(int paramInt) {
    if (this.b.e) {
      this.b.a(paramInt);
    } else if (this.c.e) {
      this.c.a(paramInt);
    } 
    super.a(paramInt);
  }
  
  public final void d() {
    if (a.i[2]) {
      this.i--;
      if (this.i < 0)
        this.i = 1; 
    } else if (a.i[8]) {
      this.i++;
      if (this.i > 1)
        this.i = 1; 
    } 
    if (a.i[2] || a.i[8]) {
      a.f();
      if (this.i == 1) {
        this.b.e = false;
        this.c.e = true;
        if (!a.e)
          this.co = this.c.j; 
      } else if (this.i == 0) {
        this.b.e = true;
        this.c.e = false;
        if (!a.e)
          this.co = this.b.j; 
      } else {
        this.b.e = false;
        this.c.e = false;
      } 
    } 
    if (a.m)
      if (a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
        this.i = 0;
      } else if (a.a(this.c.a, this.c.b, this.c.c, this.c.d)) {
        this.i = 1;
      }  
    super.d();
    a.f();
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1) {
      p.c.b();
      a = null;
    } 
    if (paramInt == 2) {
      if (this.b.d() == null || this.b.d().equals("")) {
        a.a(aw.bd);
        return;
      } 
      if (this.c.d() == null || this.c.d().equals("")) {
        a.a(aw.be);
        return;
      } 
      bt.a().a(this.b.d(), this.c.d());
      p.c.b();
      a = null;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */