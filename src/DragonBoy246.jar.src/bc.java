import main.a;

public final class bc extends n {
  private String[] e;
  
  public boolean a;
  
  private int f;
  
  private int g = 35;
  
  private long h = -1L;
  
  public bc() {
    if (a.A <= 176)
      this.g = 10; 
    if (a.A > 320)
      this.g = 80; 
  }
  
  public final void b() {
    a(aw.aB, null, null, null);
    a.K = this;
    this.h = l.d() + 5000L;
  }
  
  public final void c() {
    a.K = this;
    this.h = -1L;
  }
  
  public final void a(String paramString) {
    this.e = di.t.a(paramString, a.A - (this.g << 1) + 20);
    this.f = 80;
    if (this.e.length >= 5)
      this.f = this.e.length * di.t.a() + 20; 
  }
  
  public final void a(String paramString, de paramde1, de paramde2, de paramde3) {
    this.e = di.t.a(paramString, a.A - (this.g << 1) + 20);
    this.b = paramde1;
    this.c = paramde2;
    this.d = paramde3;
    this.f = 80;
    if (this.e.length >= 5)
      this.f = this.e.length * di.t.a() + 20; 
    if (a.e) {
      if (paramde1 != null) {
        this.b.j = a.A / 2 - 68 - 5;
        this.b.k = a.B - 50;
      } 
      if (paramde3 != null) {
        this.d.j = a.A / 2 + 5;
        this.d.k = a.B - 50;
      } 
      if (paramde2 != null) {
        this.c.j = a.A / 2 - 35;
        this.c.k = a.B - 50;
      } 
    } 
    this.a = false;
    this.h = -1L;
  }
  
  public final void a(en paramen) {
    paramen.e(0, 0, a.A, a.B);
    if (x.c)
      return; 
    int i = a.B - this.f - 38;
    int j = a.A - (this.g << 1);
    cx.a(this.g, i, j, this.f, paramen);
    i = i + (this.f - this.e.length * di.t.a()) / 2 - 2;
    if (this.a) {
      i += 8;
      a.a(a.C, i - 12, paramen);
    } 
    j = 0;
    for (i = i; j < this.e.length; i += di.t.a()) {
      di.f.a(paramen, this.e[j], a.C, i, 2);
      j++;
    } 
    super.a(paramen);
  }
  
  public final void a() {
    super.a();
    if (this.h != -1L && l.d() > this.h)
      a.h(); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */