import main.a;

public final class bj {
  private af b;
  
  private by c;
  
  private el d = new el("vDARTS");
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l = 0;
  
  private int m = 0;
  
  private boolean n = false;
  
  private boolean o = true;
  
  public ci a;
  
  public bj(af paramaf, int paramInt1, ci paramci, int paramInt2, int paramInt3) {
    this.a = paramci;
    this.b = paramaf;
    this.c = p.w[paramInt1];
    this.h = this.c.i;
    this.i = paramInt2;
    this.j = paramInt3;
    paramaf = (paramaf.aQ == null) ? paramaf.aU : (af)paramaf.aQ;
    paramInt1 = ds.a(paramaf.l() - paramInt2, paramaf.m() - paramInt3);
    bj bj1;
    (bj1 = this).e = paramInt1;
    bj1.f = bj1.h * ds.b(paramInt1) >> 10;
    bj1.g = bj1.h * ds.a(paramInt1) >> 10;
  }
  
  public final void a() {
    if (!this.o)
      return; 
    if (this.b.aQ == null && this.b.aU == null) {
      b();
      return;
    } 
    bq bq = (bq)((this.b.aQ == null) ? this.b.aU : this.b.aQ);
    byte b;
    for (b = 0; b < this.c.h; b++) {
      if (this.c.c.length > 0)
        this.d.addElement(new dx(this.i, this.j)); 
      int i = (this.b.l() > bq.l()) ? 10 : -10;
      this.l = bq.l() + i - this.i;
      this.m = bq.m() - bq.n() / 2 - this.j;
      this.k++;
      if (ds.g(this.l) < 20 && ds.g(this.m) < 20) {
        if (this.b.aU != null && this.b.aU.aq)
          this.b.aU.a(this.b.aU.ac, 0L, this.b.aU.ae, this.b.aU.ad); 
        b();
        return;
      } 
      if (Math.abs((i = ds.a(this.l, this.m)) - this.e) < 90 || this.l * this.l + this.m * this.m > 4096)
        if (Math.abs(i - this.e) < 15) {
          this.e = i;
        } else if ((i - this.e >= 0 && i - this.e < 180) || i - this.e < -180) {
          this.e = ds.c(this.e + 15);
        } else {
          this.e = ds.c(this.e - 15);
        }  
      if (this.h < 8192)
        this.h += 1024; 
      this.f = this.h * ds.b(this.e) >> 10;
      this.g = this.h * ds.a(this.e) >> 10;
      this.l += this.f;
      i = this.l >> 10;
      this.i += i;
      this.l &= 0x3FF;
      this.m += this.g;
      i = this.m >> 10;
      this.j += i;
      this.m &= 0x3FF;
    } 
    for (b = 0; b < this.d.size(); b++) {
      dx dx;
      (dx = this.d.elementAt(b)).a++;
      if (dx.a >= this.c.c.length)
        this.d.removeElementAt(b); 
    } 
  }
  
  private void b() {
    ds.c("END ME!");
    if (!this.b.ch && this.i >= p.j && this.i <= p.j + a.A)
      bu.a(); 
    this.b.E();
    if (this.b.ch) {
      this.b.ch = false;
      if (this.b.bJ && this.b.aq && this.b.H != 14 && this.b.H != 5)
        this.b.bJ = false; 
      if (this.b.K == 2) {
        int i;
        if (this.b.aq) {
          i = (af.e()).aC.b;
        } else {
          i = this.b.aP;
        } 
        if (i < 77 || i > 83)
          p.j().b(this.i, this.j); 
      } else {
        p.j().b(this.i, this.j);
      } 
    } 
    this.b.cd = null;
    this.b.ce = false;
    this.b.cf = null;
    this.b.cg = null;
    this.b.C();
  }
  
  public final void a(en paramen) {
    if (!this.o)
      return; 
    int i = ah.a(360 - this.e);
    byte b = ah.c[i];
    i = ah.b[i];
    int j;
    for (j = this.d.size() / 2; j < this.d.size(); j++) {
      dx dx = this.d.elementAt(j);
      bl.b(paramen, this.c.d[dx.a], dx.b, dx.c, 0, 3);
    } 
    j = a.w % this.c.b.length;
    bl.b(paramen, this.c.b[j][b], this.i, this.j, i, 3);
    byte b1;
    for (b1 = 0; b1 < this.d.size(); b1++) {
      dx dx = this.d.elementAt(b1);
      bl.b(paramen, this.c.c[dx.a], dx.b, dx.c, 0, 3);
    } 
    bl.b(paramen, this.c.a[j][b], this.i, this.j, i, 3);
    for (b1 = 0; b1 < this.d.size(); b1++) {
      dx dx = this.d.elementAt(b1);
      if (ds.g(ah.a.nextInt(100)) < this.c.g)
        bl.b(paramen, (a.w % 2 == 0) ? this.c.e[dx.a] : this.c.f[dx.a], dx.b, dx.c, 0, 3); 
    } 
    paramen.a(16711680);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */