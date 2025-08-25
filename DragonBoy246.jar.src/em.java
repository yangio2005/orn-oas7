import javax.microedition.lcdui.Image;
import main.a;

public final class em extends bb {
  private static int c;
  
  private boolean d = false;
  
  private static int e = -1;
  
  private static int f = -1;
  
  public static em a;
  
  public static Image b = l.b("/gamelogo.png");
  
  public em() {
    a = this;
  }
  
  public static void a() {
    c = 0;
  }
  
  public final void c() {
    if (++c == 30 && !this.d) {
      this.d = true;
      if (av.d("serverchat") != -1)
        p.bV = (av.d("serverchat") == 0); 
      if (av.d("isPlaySound") != -1)
        a.aj = (av.d("isPlaySound") == 1); 
      if (a.aj)
        bu.a(); 
      bu.a();
      bu.g();
      bs.f();
    } 
    if (c >= 150) {
      if (br.a().d()) {
        bs.u = true;
      } else {
        l.b(true);
        if (a.ak == null)
          a.ak = new bs(); 
      } 
      a.ak.b();
    } 
    bs.e();
  }
  
  public static void e() {
    ds.b(">>>>>loadIP:  svselect == " + av.d(bs.w));
    bs.a(av.d(bs.w), false);
    if (bs.n == -1) {
      ds.b(">>>loadIP:  svselect == -1");
      -1;
      bs.a(bs.b, true);
    } 
    bs.k();
  }
  
  public final void a(en paramen) {
    if (b != null && c < 30) {
      paramen.a(16777215);
      paramen.d(0, 0, a.A, a.B);
      paramen.a(b, a.A / 2, a.B / 2, 3);
    } 
    if (e != -1) {
      paramen.a(0);
      paramen.d(0, 0, a.A, a.B);
      paramen.a(x.j, a.A / 2, a.B / 2 - 24, cj.c);
      a.a(a.C, a.B / 2 + 24, paramen);
      di.c.a(paramen, String.valueOf(aw.aD) + (e * 100 / f) + "%", a.A / 2, a.B / 2, 2);
      return;
    } 
    if (c >= 30) {
      paramen.a(0);
      paramen.d(0, 0, a.A, a.B);
      a.a(a.C, a.D, paramen);
      bs.b(paramen);
    } 
  }
  
  public static void f() {
    b = l.b("/gamelogo.png");
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\em.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */