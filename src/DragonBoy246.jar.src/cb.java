import main.a;

public final class cb implements b {
  public int a;
  
  public int b;
  
  public int c;
  
  public String d;
  
  public long e;
  
  public String[] f;
  
  public byte g;
  
  public byte h;
  
  private int m;
  
  public int i;
  
  public int j;
  
  public String[] k;
  
  public static el l = new el("v Message");
  
  public static void a(cb paramcb, int paramInt, boolean paramBoolean) {
    for (byte b1 = 0; b1 < l.size(); b1++) {
      cb cb1;
      if ((cb1 = l.elementAt(b1)).a == paramcb.a) {
        paramcb = paramcb;
        l.removeElement(cb1);
        if (!paramBoolean) {
          l.insertElementAt(paramcb, b1);
          return;
        } 
        l.insertElementAt(paramcb, 0);
        return;
      } 
      if (cb1.j != 0 && cb1.i == cb1.j)
        l.removeElement(cb1); 
    } 
    if (paramInt == -1) {
      l.addElement(paramcb);
    } else {
      l.insertElementAt(paramcb, 0);
    } 
    if (l.size() > 20)
      l.removeElementAt(l.size() - 1); 
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2) {
    di di = di.f;
    if (this.h == 0) {
      di = di.a;
    } else if (this.h == 1) {
      di = di.h;
    } else if (this.h == 2) {
      di = di.g;
    } 
    if (this.b == 0) {
      di.a(paramen, this.d, paramInt1 + 3, paramInt2 + 1, 0);
      if (this.g == 0) {
        di.o.a(paramen, String.valueOf(this.f[0]) + ((this.f.length > 1) ? "..." : ""), paramInt1 + 3, paramInt2 + 11, 0);
      } else {
        di.p.a(paramen, String.valueOf(this.f[0]) + ((this.f.length > 1) ? "..." : ""), paramInt1 + 3, paramInt2 + 11, 0);
      } 
      di.o.a(paramen, String.valueOf(ai.c(this.m)) + " " + aw.dI, paramInt1 + a.G.ag - 3, paramInt2 + 1, 1);
    } 
    if (this.b == 1) {
      di.a(paramen, String.valueOf(this.d) + " (" + this.i + "/" + this.j + ")", paramInt1 + 3, paramInt2 + 1, 0);
      di.q.a(paramen, String.valueOf(aw.cW) + " " + ai.c(this.m) + " " + aw.dI, paramInt1 + 3, paramInt2 + 11, 0);
    } 
    if (this.b == 2) {
      di.a(paramen, this.d, paramInt1 + 3, paramInt2 + 1, 0);
      di.q.a(paramen, aw.dz, paramInt1 + 3, paramInt2 + 11, 0);
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {}
  
  public final void a() {
    if (this.e != 0L)
      this.m = (int)(System.currentTimeMillis() / 1000L - this.e); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */