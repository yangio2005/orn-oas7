public final class dh extends el {
  public static dh a = new dh("low");
  
  public static dh b = new dh("mid");
  
  public static dh c = new dh("mid2");
  
  public static dh d = new dh("hi");
  
  private void c() {
    for (int i = size() - 1; i >= 0; i--) {
      ch ch;
      if ((ch = (ch)elementAt(i)) != null) {
        ch.a();
        if (ch.b)
          removeElementAt(i); 
      } 
    } 
  }
  
  public static void a() {
    d.c();
    b.c();
    c.c();
    a.c();
  }
  
  public final void a(en paramen) {
    for (byte b = 0; b < size(); b++) {
      ch ch;
      if ((ch = (ch)elementAt(b)) != null && !ch.b)
        ((ch)elementAt(b)).a(paramen); 
    } 
  }
  
  private void d() {
    for (int i = size() - 1; i >= 0; i--) {
      ch ch;
      if ((ch = (ch)elementAt(i)) != null) {
        ch.b = true;
        removeElementAt(i);
      } 
    } 
  }
  
  public static void b() {
    d.d();
    a.d();
    b.d();
    c.d();
  }
  
  public static void a(ch paramch) {
    d.addElement(paramch);
  }
  
  public static void b(ch paramch) {
    b.addElement(paramch);
  }
  
  public static void c(ch paramch) {
    c.addElement(paramch);
  }
  
  public static void d(ch paramch) {
    a.addElement(paramch);
  }
  
  private dh(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */