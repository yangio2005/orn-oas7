import main.a;

public final class bu {
  public static boolean a = false;
  
  private static bu l;
  
  public static float b = 0.5F;
  
  public static int c = 30;
  
  public static int d = 31;
  
  public static int e = 32;
  
  public static int f = 33;
  
  public static int g = 34;
  
  public static int h = 35;
  
  public static int i = 36;
  
  public static int j = 37;
  
  public static int k = 38;
  
  public static bu a() {
    if (l == null)
      l = new bu(); 
    return l;
  }
  
  public final void b() {
    if (af.cW) {
      av.a("isPaintAura", 0);
      af.cW = false;
    } else {
      av.a("isPaintAura", 1);
      af.cW = true;
    } 
    g();
  }
  
  public final void c() {
    if (!a.e) {
      bu bu2 = this;
      if (p.bV = !p.bV) {
        av.a("serverchat", 0);
      } else {
        av.a("serverchat", 1);
      } 
      g();
      return;
    } 
    bu bu1 = this;
    if (p.aO == 0) {
      p.aO = 1;
      av.a("analog", p.aO);
      p.m();
    } else {
      p.aO = 0;
      av.a("analog", p.aO);
      p.m();
    } 
    g();
  }
  
  public final void d() {
    if (a.a) {
      av.a("lowGraphic", 0);
      a.a(aw.cL, 8885, null);
    } else {
      av.a("lowGraphic", 1);
      a.a(aw.cL, 8885, null);
    } 
    g();
  }
  
  public final void e() {
    if (af.cX) {
      av.a("isPaintAura2", 0);
      af.cX = false;
    } else {
      av.a("isPaintAura2", 1);
      af.cX = true;
    } 
    g();
  }
  
  public static void f() {
    if (a.I.n && (af.e()).aD != null && (af.e()).aD.c >= 2) {
      g.G = new String[] { aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, aw.H };
      if ((af.e()).bO)
        g.G = new String[] { 
            aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, 
            aw.H }; 
    } else {
      g.G = new String[] { aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S };
      if ((af.e()).bO)
        g.G = new String[] { aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S }; 
    } 
    if (a) {
      String[] arrayOfString = new String[g.G.length + 1];
      for (byte b = 0; b < g.G.length; b++)
        arrayOfString[b] = g.G[b]; 
      arrayOfString[g.G.length] = aw.d;
      g.G = arrayOfString;
    } 
  }
  
  public static void g() {
    String str1 = "[x]   ";
    String str2 = "[  ]   ";
    String str3 = (p.aO == 0) ? (String.valueOf(str2) + aw.E) : (String.valueOf(str1) + aw.F);
    if (!a.e)
      str3 = !p.bV ? (String.valueOf(str2) + aw.bW) : (String.valueOf(str1) + aw.bW); 
    g.H = new String[] { af.cW ? (String.valueOf(str1) + aw.ca.trim()) : (String.valueOf(str2) + aw.ca.trim()), af.cX ? (String.valueOf(str1) + aw.cb.trim()) : (String.valueOf(str2) + aw.cb.trim()), a.aj ? (String.valueOf(str1) + aw.fB.trim()) : (String.valueOf(str2) + aw.fB.trim()), a.a ? (String.valueOf(str1) + aw.y.trim()) : (String.valueOf(str2) + aw.y.trim()), str3 };
  }
  
  public static void h() {
    br.a().e();
    a.G.A();
    a.I.f();
    a.I.b();
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */