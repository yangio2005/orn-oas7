import main.a;

public final class dz implements b {
  public de a;
  
  private de b;
  
  private String[] c;
  
  private int d;
  
  private int e;
  
  private int f = 120;
  
  private int g;
  
  private int h;
  
  private long i;
  
  private long j;
  
  public final void a(String paramString, de paramde1, de paramde2) {
    this.c = new String[] { paramString };
    this.g = 29;
    this.a = paramde1;
    this.b = paramde2;
    this.b.g = p.bo;
    this.b.h = p.bp;
    this.a.l = en.a(paramde1.g);
    this.b.l = en.a(paramde1.g);
    this.a.m = en.b(paramde1.g);
    this.b.m = en.b(paramde1.g);
    this.i = System.currentTimeMillis();
    this.h = this.c[0].length() / 3;
    if (this.h < 15)
      this.h = 15; 
    ag.a();
  }
  
  public final void a(en paramen) {
    bo.a(paramen, this.d, this.e, this.f, this.g + (!a.e ? 10 : 0), 16777215, false);
    if (this.c != null) {
      ag.a(paramen, this.c[0], this.d + 5, this.e + this.g / 2 - (a.e ? 4 : 6), this.f - 10, this.g, di.k);
      if (a.e) {
        this.a.a(paramen);
        di.n.a(paramen, (new StringBuffer(String.valueOf(this.h))).toString(), this.a.j + this.a.l / 2, this.a.k + this.a.m + 5, 2, di.o);
        return;
      } 
      if (cd.g) {
        di.b.a(paramen, String.valueOf(aw.cJ) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
        return;
      } 
      di.b.a(paramen, String.valueOf(aw.cK) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
    } 
  }
  
  public final void a() {
    if (this.c != null) {
      this.d = a.A - 5 - this.f;
      this.e = 45;
      if (a.A - 50 > 155 + this.f) {
        this.d = a.A - 55 - this.f;
        this.e = 5;
      } 
      this.a.j = this.d - 35;
      this.a.k = this.e;
      this.j = System.currentTimeMillis();
      ds.c("curr - last= " + (this.j - this.i));
      if (this.j - this.i >= 1000L) {
        this.i = System.currentTimeMillis();
        this.h--;
      } 
      if (this.h == 0)
        (p.j()).bQ = null; 
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {}
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */