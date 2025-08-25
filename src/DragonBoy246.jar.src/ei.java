public final class ei {
  public static el a = new el("vEff");
  
  public static void a(ea paramea) {
    a.addElement(paramea);
  }
  
  public static void a(int paramInt) {
    if (b(paramInt) != null)
      a.removeElement(b(paramInt)); 
  }
  
  private static ea b(int paramInt) {
    for (byte b = 0; b < a.size(); b++) {
      ea ea;
      if ((ea = a.elementAt(b)).a == paramInt)
        return ea; 
    } 
    return null;
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < a.size(); b++) {
      if (((ea)a.elementAt(b)).h == -paramInt3)
        ((ea)a.elementAt(b)).a(paramen, paramInt1, paramInt2); 
    } 
  }
  
  public static void a(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      if (((ea)a.elementAt(b)).h == 1)
        ((ea)a.elementAt(b)).a(paramen); 
    } 
  }
  
  public static void b(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      if (((ea)a.elementAt(b)).h == 2)
        ((ea)a.elementAt(b)).a(paramen); 
    } 
  }
  
  public static void c(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      if (((ea)a.elementAt(b)).h == 3)
        ((ea)a.elementAt(b)).a(paramen); 
    } 
  }
  
  public static void d(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      if (((ea)a.elementAt(b)).h == 4)
        ((ea)a.elementAt(b)).a(paramen); 
    } 
  }
  
  public static void a() {
    for (byte b = 0; b < a.size(); b++)
      ((ea)a.elementAt(b)).a(); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ei.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */