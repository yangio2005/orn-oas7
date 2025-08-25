final class cf implements Runnable {
  private final String b;
  
  private int c;
  
  final br a;
  
  cf(br parambr, String paramString, int paramInt) {
    this.a = parambr;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final void run() {
    br.n = false;
    (new Thread(new ct(this))).start();
    this.a.e = true;
    this.a.d = true;
    try {
      int i = this.c;
      String str = this.b;
      cf cf1;
      br.a((cf1 = this).a, new ay(str, i));
      br.a(cf1.a, br.a(cf1.a).b());
      cf1.a.a = br.a(cf1.a).c();
      cf1.a.g = new Thread(br.b(cf1.a));
      cf1.a.g.start();
      cf1.a.f = new Thread(new s(cf1.a));
      cf1.a.f.start();
      cf1.a.l = System.currentTimeMillis();
      br.a(cf1.a, new y((byte)-27));
      ds.c("=======================> gui message cmd = -27 to server");
      cf1.a.e = false;
      this.a.b.a(this.a.c);
      return;
    } catch (Exception exception) {
      try {
        Thread.sleep(500L);
      } catch (InterruptedException interruptedException) {}
      if (br.n)
        return; 
      if (this.a.b != null)
        this.a.e(); 
      return;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */