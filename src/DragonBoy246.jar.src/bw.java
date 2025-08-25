import main.a;

public final class bw implements b {
  public short a;
  
  public short b;
  
  public short c;
  
  public short d;
  
  public boolean e;
  
  public boolean f;
  
  public bo g;
  
  public bw(short paramShort1, short paramShort2, short paramShort3, short paramShort4, boolean paramBoolean1, boolean paramBoolean2, String paramString) {
    this.a = paramShort1;
    this.b = paramShort2;
    this.c = paramShort3;
    this.d = paramShort4;
    paramString = ds.a(paramString);
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    if ((bv.l == 21 || bv.l == 22 || bv.l == 23) && this.a >= 0 && this.a <= 24)
      return; 
    if (((bv.l == 0 && (af.e()).K != 0) || (bv.l == 7 && (af.e()).K != 1) || (bv.l == 14 && (af.e()).K != 2)) && paramBoolean2)
      return; 
    if (bv.f() || bv.l == 47) {
      if (paramShort2 > 150 && bv.f())
        return; 
      this.g = new bo(paramString, paramShort1 + (paramShort3 - paramShort1) / 2, paramShort4 - ((paramShort1 > 100) ? 24 : 48));
      this.g.i = new de(null, this, 1, this);
      this.g.h = true;
      this.g.j = false;
      bo.a(this.g);
      bv.t.addElement(this);
      return;
    } 
    if (!paramBoolean1 && !paramBoolean2) {
      this.g = new bo(paramString, paramShort1, paramShort2 - 24);
      this.g.i = new de(null, this, 1, this);
      this.g.h = true;
      this.g.j = false;
      bo.a(this.g);
    } else {
      if (bv.b()) {
        this.g = new bo(paramString, paramShort1, paramShort2 - 16);
      } else {
        int i = paramShort1 + (paramShort3 - paramShort1) / 2;
        this.g = new bo(paramString, i, paramShort2 - ((paramShort2 != 0) ? 16 : -32));
      } 
      this.g.i = new de(null, this, 2, this);
      this.g.h = true;
      this.g.j = false;
      bo.a(this.g);
    } 
    bv.t.addElement(this);
  }
  
  public final void a(int paramInt, Object paramObject) {
    int i;
    switch (paramInt) {
      case 1:
        paramInt = (this.a + this.c) / 2;
        i = this.d;
        if (this.d > this.b + 24)
          i = (this.b + this.d) / 2; 
        (p.j()).aX = 0;
        (af.e()).bP = new dm(paramInt, i);
        (af.e()).I = ((af.e()).B - (af.e()).bP.a > 0) ? -1 : 1;
        bt.a().g();
        return;
      case 2:
        (p.j()).aX = 0;
        if (af.e().i() != null) {
          bt.a().g();
          bp.a();
          bt.a().q();
          af.bG = true;
          return;
        } 
        if (af.e().j() != null) {
          bt.a().g();
          bt.a().f();
          af.bH = true;
          af.bG = true;
          a.g();
          a.f();
          bp.a();
          return;
        } 
        paramInt = (this.a + this.c) / 2;
        i = this.d;
        (af.e()).bP = new dm(paramInt, i);
        (af.e()).I = ((af.e()).B - (af.e()).bP.a > 0) ? -1 : 1;
        (af.e()).ay = new de(null, this, 2, null);
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */