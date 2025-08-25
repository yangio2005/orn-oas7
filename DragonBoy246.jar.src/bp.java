import main.a;

public final class bp {
  public static boolean a;
  
  private static String c;
  
  private static String d;
  
  private static int e;
  
  public static boolean b;
  
  public static void a(String paramString1, String paramString2, int paramInt) {
    if (paramString1 == null)
      return; 
    a = true;
    c = paramString1;
    d = paramString2;
    e = paramInt;
  }
  
  public static void a() {
    a(aw.aB, null, 1000);
    b = true;
  }
  
  public static void a(en paramen) {
    if (!a)
      return; 
    if (b && e > 4990)
      return; 
    cx.a(a.C - 75, 10, 150, 55, paramen);
    if (b) {
      a.a(a.C - di.t.a(c) / 2 - 10, 38, paramen);
      di.t.a(paramen, c, a.C + 5, 31, 2);
      return;
    } 
    if (d != null) {
      di.t.a(paramen, c, a.C, 23, 2);
      di.m.a(paramen, d, a.C, 40, 2);
      return;
    } 
    di.t.a(paramen, c, a.C, 31, 2);
  }
  
  public static void b() {
    if (!a)
      return; 
    if (e > 0 && --e <= 0)
      c(); 
  }
  
  public static void c() {
    c = "";
    d = null;
    b = false;
    e = 0;
    a = false;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */