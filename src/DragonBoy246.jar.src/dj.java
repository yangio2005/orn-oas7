import main.a;

final class dj implements Runnable {
  private int a;
  
  private boolean b;
  
  private ar c;
  
  dj(ar paramar) {
    this.c = paramar;
    this.a = 0;
    this.b = false;
  }
  
  public final void run() {
    try {
      while (ar.d) {
        if (a.E != ar.a)
          return; 
        this.c.c = 2;
        while (this.a < 7 && this.c.b != 5) {
          ar.a(this.c, this.a);
          this.a++;
          Thread.sleep(300L);
        } 
        if (this.a == 7) {
          Thread.sleep(800L);
          ar.a(ar.a());
          Thread.sleep(4000L);
          if (ar.e) {
            this.c.e();
            Thread.yield();
            return;
          } 
          if (this.c.b == 5) {
            ar.a(ar.a());
            this.a = 0;
          } 
          Thread.sleep(1000L);
        } 
        if (this.c.b == 5 && this.a == 0 && !this.b) {
          this.b = true;
          ar.a(ar.a());
        } 
      } 
    } catch (Exception exception) {}
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */