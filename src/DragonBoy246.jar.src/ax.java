public final class ax extends dc {
  private cp a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private short e = 0;
  
  private long f = 0L;
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ax ax1;
    (ax1 = new ax()).a = p.y[paramInt1 - 1];
    ax1.c = paramInt2;
    ax1.d = paramInt3;
    ax1.e = 2;
    dc.w.addElement(ax1);
  }
  
  public final void a(en paramen) {
    if (en.b == 1)
      p.aN++; 
    if (p.aN < 8) {
      int i = this.c + (this.a.a[this.b]).a;
      int j = this.d + (this.a.a[this.b]).b;
      bl.b(paramen, (this.a.a[this.b]).c, i, j, 0, 3);
    } 
  }
  
  public final void a() {
    if (0L != 0L) {
      this.b++;
      if (this.b >= this.a.a.length)
        this.b = 0; 
      if (System.currentTimeMillis() > 0L) {
        dc.w.removeElement(this);
        return;
      } 
    } else {
      this.b++;
      if (this.b >= this.a.a.length) {
        this.e = (short)(this.e - 1);
        if (this.e <= 0) {
          dc.w.removeElement(this);
          return;
        } 
        this.b = 0;
      } 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */