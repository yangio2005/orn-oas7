public final class bk {
  public byte a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public boolean m = false;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public df p;
  
  public df q;
  
  private byte[] t = new byte[] { 
      12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 
      2, 1, 23, 22, 21, 20, 19, 18, 17, 16, 
      15, 14, 13 };
  
  public byte[] r = new byte[] { 
      0, 0, 2, 1, 1, 2, 2, 1, 1, 2, 
      2, 1, 1, 2, 2, 1, 1, 2 };
  
  public byte[] s = new byte[] { 
      2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 
      5, 1, 7, 6, 6, 6, 6, 6, 2 };
  
  public final void a() {
    this.i++;
    this.b += this.e;
    this.c += this.f;
  }
  
  public final int a(int paramInt) {
    if (paramInt <= 15 || paramInt > 345) {
      paramInt = 12;
    } else {
      if ((paramInt = (paramInt - 15) / 15 + 1) > 24)
        paramInt = 24; 
      paramInt = this.t[paramInt];
    } 
    return paramInt;
  }
  
  public final void a(en paramen, df paramdf, int paramInt, boolean paramBoolean) {
    int i;
    if (paramdf == null)
      return; 
    if ((paramInt = paramdf.c / 3) <= 0)
      paramInt = 1; 
    if (paramdf.c > 3) {
      paramBoolean = !(this.i / 3 % 2 == 0);
    } else {
      i = this.i % paramInt;
    } 
    paramInt = paramInt * this.r[this.k] + i;
    if (paramdf.c < 3)
      paramInt = this.i / 3 % paramdf.c; 
    paramdf.a(paramInt, this.b, this.c, this.s[this.k], 3, paramen);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */