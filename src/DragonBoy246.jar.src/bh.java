import main.a;

public final class bh {
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  public int a;
  
  public int b;
  
  public int c;
  
  private int i;
  
  private int j;
  
  private int[] k = new int[3];
  
  private boolean l;
  
  private boolean m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  public bh() {}
  
  public bh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean) {
    this.f = paramInt1;
    this.g = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.c = 0;
    if (this.c < 0)
      this.c = 0; 
  }
  
  public final void a() {
    if (this.c <= 0)
      return; 
    if (a.k)
      if (!this.l && a.b(this.f, this.g, this.d, this.e)) {
        for (byte b = 0; b < this.k.length; b++)
          this.k[b] = a.q; 
        this.j = a.q;
        this.l = true;
        this.m = (this.n != 0);
        this.n = 0;
      } else if (this.l) {
        this.i++;
        if (this.i > 5 && this.j == a.q && !this.m)
          this.j = -1000; 
        int i;
        if ((i = a.q - this.k[0]) != 0 && this.h != -1)
          this.h = -1; 
        for (int j = this.k.length - 1; j > 0; j--)
          this.k[j] = this.k[j - 1]; 
        this.k[0] = a.q;
        this.a -= i;
        if (this.a < 0)
          this.a = 0; 
        if (this.a > this.c)
          this.a = this.c; 
        if (this.b < 0 || this.b > this.c)
          i /= 2; 
        this.b -= i;
      }  
    if (a.l && this.l) {
      int i = a.q - this.k[0];
      a.l = false;
      if (ds.g(i) < 20 && ds.g(a.q - this.j) < 20 && !this.m && a.o) {
        this.n = 0;
        this.a = this.b;
        this.j = -1000;
        this.i = 0;
      } else if (this.h != -1 && this.i > 5) {
        this.i = 0;
      } else if (this.h == -1 && !this.m) {
        if (this.b < 0) {
          this.a = 0;
        } else if (this.b > this.c) {
          this.a = this.c;
        } else {
          int j;
          if ((j = a.q - this.k[0] + this.k[0] - this.k[1] + this.k[1] - this.k[2]) > 10) {
            j = 10;
          } else if (j < -10) {
            j = -10;
          } else {
            j = 0;
          } 
          this.n = -j * 100;
        } 
      } 
      this.l = false;
      this.i = 0;
      a.l = false;
    } 
    if (this.b <= 0)
      this.b = 0; 
    if (this.b >= this.c)
      this.b = this.c; 
  }
  
  public final void b() {
    if (this.n != 0 && !this.l) {
      this.a += this.n / 100;
      if (this.a < 0) {
        this.a = 0;
      } else if (this.a > this.c) {
        this.a = this.c;
      } else {
        this.b = this.a;
      } 
      this.n = this.n * 9 / 10;
      if (this.n < 100 && this.n > -100)
        this.n = 0; 
    } 
    if (this.b != this.a && !this.l) {
      this.o = this.a - this.b << 2;
      this.p += this.o;
      this.b += this.p >> 4;
      this.p &= 0xF;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */