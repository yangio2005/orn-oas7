public final class bf {
  public et a;
  
  public short b;
  
  public int c;
  
  public long d;
  
  public int e;
  
  public long f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public boolean j = false;
  
  public short k;
  
  public String l;
  
  public short m;
  
  public final String a() {
    if (this.e % 1000 == 0)
      return (new StringBuffer(String.valueOf(this.e / 1000))).toString(); 
    int i = this.e % 1000;
    return String.valueOf(this.e / 1000) + "." + ((i % 100 == 0) ? (i / 100) : (i / 10));
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */