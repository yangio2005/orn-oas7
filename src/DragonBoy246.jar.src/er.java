import main.a;

public final class er extends bb implements b {
  private static er b;
  
  public cd[] a;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private String[] g;
  
  private String h;
  
  private cq i;
  
  private int j;
  
  private int k;
  
  public static er a() {
    if (b == null)
      b = new er(); 
    return b;
  }
  
  public final void b() {
    if ((l.c == 5 && this.a.length == 1) || (l.c == 3 && this.a.length == 1)) {
      this.i = new cq();
      this.i.h = this.h;
      this.i.a.i = (this.a[0]).f;
      this.i.g = "";
      this.i.b = true;
      this.i.a.c(0);
      if (a.e)
        return; 
    } else {
      this.j = 0;
      super.b();
    } 
  }
  
  public final void a(int paramInt, String paramString) {
    this.k = paramInt;
    paramString = paramString;
    er er1;
    (er1 = this).h = paramString;
    er1.e = a.A - 20;
    if (er1.e > 320)
      er1.e = 320; 
    ds.c("title= " + paramString);
    er1.g = di.f.a(paramString, er1.e - 20);
    er1.c = (a.A - er1.e) / 2;
    er1.a = new cd[er1.k];
    er1.f = er1.a.length * 35 + (er1.g.length - 1) * 20 + 40;
    er1.d = a.B - er1.f - 40 - (er1.g.length - 1) * 20;
    for (byte b1 = 0; b1 < er1.a.length; b1++) {
      er1.a[b1] = new cd();
      (er1.a[b1]).i = "";
      (er1.a[b1]).a = er1.c + 10;
      (er1.a[b1]).b = er1.d + 35 + (er1.g.length - 1) * 20 + b1 * 35;
      (er1.a[b1]).c = er1.e - 20;
      (er1.a[b1]).d = bb.cp + 2;
      if (a.e) {
        (er1.a[0]).e = false;
      } else {
        (er1.a[0]).e = true;
      } 
      if (!a.e)
        er1.co = (er1.a[0]).j; 
    } 
    er1.cm = new de(aw.bi, er1, 1, null);
    er1.cn = new de(aw.br, er1, 2, null);
    if (a.e) {
      er1.cn.j = a.A / 2 + 18;
      er1.cm.j = a.A / 2 - 85;
      er1.cm.k = er1.d + er1.f + 5;
    } 
    b();
  }
  
  public final void a(en paramen) {
    p.j().a(paramen);
    bo.a(paramen, this.c, this.d, this.e, this.f, -1, true);
    byte b1;
    for (b1 = 0; b1 < this.g.length; b1++)
      di.g.a(paramen, this.g[b1], a.A / 2, this.d + 15 + b1 * 20, 2); 
    for (b1 = 0; b1 < this.a.length; b1++)
      this.a[b1].a(paramen); 
    super.a(paramen);
  }
  
  public final void c() {
    p.j().c();
    for (byte b1 = 0; b1 < this.a.length; b1++)
      this.a[b1].c(); 
  }
  
  public final void a(int paramInt) {
    for (byte b1 = 0; b1 < this.a.length; b1++) {
      if ((this.a[b1]).e) {
        this.a[b1].a(paramInt);
        break;
      } 
    } 
    super.a(paramInt);
  }
  
  public final void d() {
    if (a.i[2]) {
      this.j--;
      if (this.j < 0)
        this.j = this.a.length - 1; 
    } else if (a.i[8]) {
      this.j++;
      if (this.j > this.a.length - 1)
        this.j = 0; 
    } 
    if (a.i[2] || a.i[8]) {
      a.f();
      for (byte b1 = 0; b1 < this.a.length; b1++) {
        if (this.j == b1) {
          (this.a[b1]).e = true;
          if (!a.e)
            this.co = (this.a[b1]).j; 
        } else {
          (this.a[b1]).e = false;
        } 
        if (a.m && a.a((this.a[b1]).a, (this.a[b1]).b, (this.a[b1]).c, (this.a[b1]).d)) {
          this.j = b1;
          break;
        } 
      } 
    } 
    super.d();
    a.f();
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1) {
      p.c.b();
      b = null;
    } 
    if (paramInt == 2) {
      if ((l.c == 5 && this.a.length == 1) || (l.c == 3 && this.a.length == 1)) {
        if (this.i.a.d() == null || this.i.a.d().equals("")) {
          a.a(aw.gi);
          return;
        } 
        this.a[0].a(this.i.a.d());
        bt.a().a(this.a);
        p.c.b();
        return;
      } 
      for (paramInt = 0; paramInt < this.a.length; paramInt++) {
        if (this.a[paramInt].d() == null || this.a[paramInt].d().equals("")) {
          a.a(aw.gi);
          return;
        } 
      } 
      bt.a().a(this.a);
      p.c.b();
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\er.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */