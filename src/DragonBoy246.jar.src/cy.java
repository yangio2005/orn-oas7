import main.a;

public final class cy {
  public short a;
  
  public int b = 0;
  
  public int c;
  
  private long d;
  
  private long e;
  
  private boolean f;
  
  private int g;
  
  private int h;
  
  private boolean i;
  
  private boolean j;
  
  private String k;
  
  private int l = 100;
  
  public cy(short paramShort, int paramInt) {
    this.a = paramShort;
    this.c = paramInt / 60;
    this.b = paramInt % 60;
    this.g = paramInt;
    this.h = paramInt;
    this.d = this.e = System.currentTimeMillis();
    this.f = (paramShort == 14);
  }
  
  public cy() {}
  
  public static boolean a(int paramInt) {
    for (byte b = 0; b < af.br.size(); b++) {
      cy cy1;
      if ((cy1 = af.br.elementAt(b)).a == paramInt)
        return true; 
    } 
    return false;
  }
  
  public static boolean b(int paramInt) {
    for (byte b = 0; b < p.bv.size(); b++) {
      cy cy1;
      if ((cy1 = p.bv.elementAt(b)).a == paramInt)
        return true; 
    } 
    return false;
  }
  
  public static cy c(int paramInt) {
    for (byte b = 0; b < af.br.size(); b++) {
      cy cy1;
      if ((cy1 = af.br.elementAt(b)).a == paramInt)
        return cy1; 
    } 
    return null;
  }
  
  public static cy d(int paramInt) {
    for (byte b = 0; b < p.bv.size(); b++) {
      cy cy1;
      if ((cy1 = p.bv.elementAt(b)).a == paramInt)
        return cy1; 
    } 
    return null;
  }
  
  public final void a(byte paramByte, String paramString, int paramInt) {
    if (paramInt == -1) {
      this.j = true;
    } else {
      this.j = false;
    } 
    this.i = true;
    this.c = paramInt / 60;
    this.b = paramInt % 60;
    this.a = paramByte;
    this.g = paramInt;
    this.h = paramInt;
    this.k = paramString;
    this.d = this.e = System.currentTimeMillis();
    this.f = (this.a == 14);
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    this.c = paramInt / 60;
    this.b = paramInt % 60;
    this.g = paramInt;
    this.h = paramInt;
    this.i = false;
    this.d = this.e = System.currentTimeMillis();
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2) {
    if (this.f) {
      if (af.e() != null) {
        paramInt1 = a.A / 2 - 40;
        paramInt2 = a.B - 80;
        paramen.a(8421504);
        paramen.d(paramInt1, paramInt2, 80, 2);
        paramen.a(16777215);
        if (this.l > 0) {
          paramen.d(paramInt1, paramInt2, 80 * this.l / 100, 2);
          return;
        } 
      } 
    } else {
      String str = String.valueOf(this.c) + "'";
      if (this.c <= 0)
        str = String.valueOf(this.b) + "s"; 
      if (this.c < 0)
        str = ""; 
      if (this.j)
        str = ""; 
      di.c.a(paramen, String.valueOf(this.k) + " " + str, paramInt1, paramInt2, 0, di.f);
    } 
  }
  
  public final void a() {
    this.d = System.currentTimeMillis();
    if (this.d - this.e >= 1000L) {
      this.e = System.currentTimeMillis();
      this.b--;
      this.h--;
      if (this.b <= 0) {
        this.b = 60;
        this.c--;
      } 
      if (this.g > 0)
        this.l = this.h * 100 / this.g; 
    } 
    if (this.c < 0 && !this.i)
      af.br.removeElement(this); 
    if (this.c < 0 && this.i && !this.j)
      p.bv.removeElement(this); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */