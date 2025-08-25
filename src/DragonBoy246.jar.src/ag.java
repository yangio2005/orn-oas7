import main.a;

public final class ag {
  private static int a;
  
  private static int b;
  
  private static int c;
  
  private static boolean d;
  
  private static String e = "";
  
  public static void a() {
    a = 0;
    b = 0;
    d = false;
  }
  
  public static void a(en paramen, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, di paramdi) {
    if (c != paramdi.a(paramString) || !e.equals(paramString)) {
      e = paramString;
      a = 0;
      c = paramdi.a(paramString);
      d = false;
      b = 0;
    } 
    paramen.e(paramInt1, paramInt2, paramInt3, paramInt4);
    if (c > paramInt3) {
      paramdi.a(paramen, paramString, paramInt1 - a, paramInt2, 0);
    } else {
      paramdi.a(paramen, paramString, paramInt1 + paramInt3 / 2, paramInt2, 2);
    } 
    a.a(paramen);
    if (c > paramInt3)
      if (!d) {
        if (++b > 50 && ++a >= c) {
          b = 0;
          a = -paramInt3 + 30;
          d = true;
          return;
        } 
      } else {
        if (a < 0) {
          int i = paramInt3 + a >> 1;
          a += i;
        } 
        if (a > 0)
          a = 0; 
        if (a == 0 && ++b == 50) {
          b = 0;
          d = false;
        } 
      }  
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */