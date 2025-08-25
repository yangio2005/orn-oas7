import main.a;

public final class cq implements b {
  private static cq i;
  
  public cd a = new cd();
  
  public boolean b = false;
  
  public bx c;
  
  private long j = 0L;
  
  public de d;
  
  public de e;
  
  public de f = null;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  public String g;
  
  public String h = String.valueOf(aw.bp) + " ";
  
  public final void a() {
    this.d = new de(aw.br, this, 8000, null, 1, a.B - bb.cr + 1);
    this.e = new de(aw.bj, this, 8001, null, a.A - 70, a.B - bb.cr + 1);
    this.f = null;
    this.m = this.a.c + 28;
    this.n = this.a.d + 26;
    this.k = a.A / 2 - this.m / 2;
    this.l = this.a.b - 18;
    if (this.m > 320)
      this.m = 320; 
    this.d.j = this.k;
    this.e.j = this.k + this.m - 68;
    if (a.e) {
      this.a.b -= 5;
      this.l -= 20;
      this.n += 30;
      this.d.j = a.A / 2 - 68 - 5;
      this.e.j = a.A / 2 + 5;
      this.d.k = a.B - 30;
      this.e.k = a.B - 30;
    } 
  }
  
  public final void a(int paramInt) {
    if (this.b)
      this.a.a(paramInt); 
    if (this.a.d().equals("")) {
      this.e.b = aw.bi;
      return;
    } 
    this.e.b = aw.bj;
  }
  
  public static cq b() {
    return (i == null) ? (i = new cq()) : i;
  }
  
  public cq() {
    this.a.i = aw.bp;
    this.a.c = a.A - 32;
    if (this.a.c > 250)
      this.a.c = 250; 
    this.a.d = bb.cp + 2;
    this.a.a = a.A / 2 - this.a.c / 2;
    this.a.e = true;
    this.a.b(80);
  }
  
  public final void a(int paramInt, bx parambx, String paramString) {
    this.e.b = aw.bi;
    this.g = paramString;
    this.a.a(paramInt);
    if (!this.a.d().equals("") && a.K == null) {
      this.c = parambx;
      this.b = true;
    } 
  }
  
  public final void a(String paramString) {
    this.e.b = aw.bi;
    this.g = paramString;
    if (a.K == null) {
      this.b = true;
      if (a.e)
        this.a.a(); 
    } 
  }
  
  public final void c() {
    if (!this.b)
      return; 
    if (l.c != 5 && l.c != 3)
      this.a.c(); 
    if (this.a.h) {
      this.a.h = false;
      this.c.a(this.a.d(), this.g);
      this.a.a("");
      this.e.b = aw.bi;
    } 
  }
  
  public final void a(en paramen) {
    if (!this.b)
      return; 
    if (l.c == 5 || l.c == 3)
      return; 
    bo.a(paramen, this.k, this.l, this.m, this.n, -1, true);
    di.g.a(paramen, String.valueOf(this.h) + this.g, this.a.a, this.a.b - (a.e ? 17 : 12), 0);
    cx.a(paramen, this.d, this.f, this.e);
    this.a.a(paramen);
  }
  
  public final void a(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 8000:
        ds.c("perform chat 1");
        if (this.c != null) {
          long l;
          if ((l = System.currentTimeMillis()) - this.j < 1000L)
            return; 
          this.j = l;
          this.c.a(this.a.d(), this.g);
          this.a.a("");
          this.e.b = aw.bi;
          return;
        } 
        break;
      case 8001:
        ds.c("perform chat 2");
        if (this.a.d().equals("")) {
          this.b = false;
          this.c.D();
        } 
        this.a.b();
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */