import javax.microedition.lcdui.Image;

public final class df {
  public int a;
  
  public int b;
  
  public int c;
  
  public Image d;
  
  public df(int paramInt) {
    Image image;
    if ((image = ch.a(paramInt)) != null) {
      this.d = image;
      this.a = ch.c[paramInt][0];
      this.b = ch.c[paramInt][1] / ch.c[paramInt][2];
      this.c = ch.c[paramInt][2];
    } 
  }
  
  public df(Image paramImage, int paramInt1, int paramInt2) {
    if (paramImage != null) {
      this.d = paramImage;
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramImage.getHeight() / paramInt2;
      if (this.c <= 0)
        this.c = 1; 
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, en paramen) {
    try {
      if (this.d != null) {
        if (paramInt1 > this.c)
          paramInt1 = this.c; 
        paramen.a(this.d, 0, paramInt1 * this.b, this.a, this.b, paramInt4, paramInt2, paramInt3, paramInt5);
        return;
      } 
    } catch (Exception exception) {}
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\df.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */