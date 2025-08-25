import java.util.Vector;

final class dw implements Runnable {
  private final Vector a;
  
  private br b;
  
  public dw(br parambr) {
    this.b = parambr;
    this.a = new Vector();
  }
  
  public final void a(y paramy) {
    this.a.addElement(paramy);
  }
  
  public final void run() {
    while (this.b.d) {
      try {
        if (this.b.j)
          while (this.a.size() > 0) {
            y y = this.a.elementAt(0);
            this.a.removeElementAt(0);
            br.a(this.b, y);
          }  
        try {
          Thread.sleep(10L);
        } catch (Exception exception) {}
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
    } 
  }
  
  static Vector a(dw paramdw) {
    return paramdw.a;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */