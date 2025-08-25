import main.a;

public final class at extends dc {
  private cp a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private af e;
  
  private aa f;
  
  private short g = 0;
  
  private long h = 0L;
  
  private int i;
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    at at1;
    (at1 = new at()).a = p.y[paramInt1 - 1];
    at1.c = paramInt2;
    at1.d = paramInt3;
    at1.g = (short)paramInt4;
    dc.x.addElement(at1);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    at at1;
    (at1 = new at()).a = p.y[paramInt1 - 1];
    at1.c = paramInt2;
    at1.d = paramInt3;
    at1.g = 1;
    at1.i = paramInt5;
    dc.x.addElement(at1);
  }
  
  public static void a(int paramInt1, aa paramaa, int paramInt2) {
    at at1;
    (at1 = new at()).a = p.y[paramInt1 - 1];
    at1.f = paramaa;
    at1.g = 1;
    dc.x.addElement(at1);
  }
  
  public static void a(int paramInt1, af paramaf, int paramInt2) {
    at at1;
    (at1 = new at()).a = p.y[paramInt1 - 1];
    at1.e = paramaf;
    at1.g = (short)paramInt2;
    dc.x.addElement(at1);
  }
  
  public final void a(en paramen) {
    if (en.b == 1)
      p.aN++; 
    if (p.aN < 11) {
      if (this.e != null) {
        this.c = this.e.B;
        this.d = this.e.C + a.ae;
      } 
      if (this.f != null) {
        this.c = this.f.m;
        this.d = this.f.n + a.ae;
      } 
      int i = this.c + (this.a.a[this.b]).a;
      int j = this.d + (this.a.a[this.b]).b;
      if (a.d(i, j))
        bl.b(paramen, (this.a.a[this.b]).c, i, j, this.i, 3); 
    } 
  }
  
  public final void a() {
    if (0L != 0L) {
      this.b++;
      if (this.b >= this.a.a.length)
        this.b = 0; 
      if (System.currentTimeMillis() > 0L)
        dc.x.removeElement(this); 
    } else {
      this.b++;
      if (this.b >= this.a.a.length) {
        this.g = (short)(this.g - 1);
        if (this.g <= 0) {
          dc.x.removeElement(this);
        } else {
          this.b = 0;
        } 
      } 
    } 
    if (a.w % 11 == 0 && this.e != null && this.e != af.e() && !p.D.contains(this.e))
      dc.x.removeElement(this); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\at.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */