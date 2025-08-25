public final class dq {
  public int a = 0;
  
  public int b;
  
  public int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private af j;
  
  private cv k = null;
  
  private static byte[] l = new byte[] { 
      0, 1, 2, 1, 1, 2, 1, 1, 2, 1, 
      1, 2, 1, 1, 2, 1, 1, 2, 1 };
  
  private static int[] m = new int[] { 
      0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 
      217, 232, 255, 285, 307, 322, 345, 370 };
  
  private static int[] n = new int[] { 
      0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 
      3, 4, 5, 5, 5, 1 };
  
  public dq(af paramaf, cv paramcv) {
    this.j = paramaf;
    this.k = paramcv;
  }
  
  public final void a() {
    if (this.j.aQ != null || this.j.aU != null) {
      if (this.j.aQ != null) {
        this.d = this.j.aQ.m;
        this.e = this.j.aQ.n - this.j.aQ.w / 4;
      } else if (this.j.aU != null) {
        this.d = this.j.aU.B;
        this.e = this.j.aU.C - this.j.aU.al / 4;
      } 
      int i = this.d - this.b;
      int j = this.e - this.c;
      int k = 4;
      if (i + j < 60) {
        k = 3;
      } else if (i + j < 30) {
        k = 2;
      } 
      if (this.b != this.d)
        if (i > 0 && i < 5) {
          this.b = this.d;
        } else if (i < 0 && i > -5) {
          this.b = this.d;
        } else {
          this.f = this.d - this.b << 2;
          this.h += this.f;
          this.b += this.h >> k;
          this.h &= 0xF;
        }  
      if (this.c != this.e)
        if (j > 0 && j < 5) {
          this.c = this.e;
        } else if (j < 0 && j > -5) {
          this.c = this.e;
        } else {
          this.g = this.e - this.c << 2;
          this.i += this.g;
          this.c += this.i >> k;
          this.i &= 0xF;
        }  
      i = 0;
      j = 0;
      k = 0;
      int m = 0;
      if (this.j.aQ != null) {
        i = this.d - this.j.aQ.v / 4;
        k = this.d + this.j.aQ.v / 4;
        j = this.e - this.j.aQ.w / 4;
        m = this.e + this.j.aQ.w / 4;
      } else if (this.j.aU != null) {
        i = this.d - this.j.aU.ak / 4;
        k = this.d + this.j.aU.ak / 4;
        j = this.e - this.j.aU.al / 4;
        m = this.e + this.j.aU.al / 4;
      } 
      if (this.a > 0)
        this.a--; 
      if (this.a == 0 || (this.b >= i && this.b <= k && this.c >= j && this.c <= m)) {
        b();
        return;
      } 
      return;
    } 
    b();
  }
  
  private void b() {
    this.j.cc = null;
    this.b = this.c = this.d = this.e = this.f = this.g = this.h = this.i = 0;
    this.j.E();
  }
  
  public final void a(en paramen) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: aload_0
    //   5: getfield b : I
    //   8: isub
    //   9: istore_2
    //   10: aload_0
    //   11: getfield e : I
    //   14: aload_0
    //   15: getfield c : I
    //   18: isub
    //   19: istore_3
    //   20: iload_2
    //   21: iload_3
    //   22: ineg
    //   23: invokestatic a : (II)I
    //   26: istore_2
    //   27: iconst_0
    //   28: istore_3
    //   29: goto -> 69
    //   32: iload_2
    //   33: getstatic dq.m : [I
    //   36: iload_3
    //   37: iaload
    //   38: if_icmplt -> 66
    //   41: iload_2
    //   42: getstatic dq.m : [I
    //   45: iload_3
    //   46: iconst_1
    //   47: iadd
    //   48: iaload
    //   49: if_icmpgt -> 66
    //   52: iload_3
    //   53: bipush #16
    //   55: if_icmplt -> 62
    //   58: iconst_0
    //   59: goto -> 80
    //   62: iload_3
    //   63: goto -> 80
    //   66: iinc #3, 1
    //   69: iload_3
    //   70: getstatic dq.m : [I
    //   73: arraylength
    //   74: iconst_1
    //   75: isub
    //   76: if_icmplt -> 32
    //   79: iconst_0
    //   80: istore_2
    //   81: aload_1
    //   82: aload_0
    //   83: getfield k : Lcv;
    //   86: getfield a : [I
    //   89: getstatic dq.l : [B
    //   92: iload_2
    //   93: baload
    //   94: iaload
    //   95: aload_0
    //   96: getfield b : I
    //   99: aload_0
    //   100: getfield c : I
    //   103: getstatic dq.n : [I
    //   106: iload_2
    //   107: iaload
    //   108: iconst_3
    //   109: invokestatic b : (Len;IIIII)V
    //   112: return
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */