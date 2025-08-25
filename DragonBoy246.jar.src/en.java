import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class en {
  public Graphics a;
  
  public static int b = 1;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.fillArc(paramInt1, paramInt2, paramInt3, paramInt4, 0, 360);
  }
  
  public final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3) {
    if (paramImage == null)
      return; 
    paramInt1 *= b;
    paramInt2 *= b;
    this.a.drawImage(paramImage, paramInt1, paramInt2, paramInt3);
  }
  
  public final void a(Image paramImage, float paramFloat1, float paramFloat2, int paramInt) {
    int i = paramInt;
    float f = paramFloat2;
    paramFloat2 = paramFloat1;
    Image image = paramImage;
    en en1 = this;
    if (image != null) {
      paramFloat2 *= b;
      f *= b;
      en1.a.drawImage(image, (int)paramFloat2, (int)f, i);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.drawLine(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.setColor(paramInt5);
    this.a.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    d(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    d(paramInt1, paramInt2, 1, paramInt4);
    d(paramInt1 + paramInt3, paramInt2, 1, paramInt4);
    d(paramInt1, paramInt2, paramInt3, 1);
    d(paramInt1, paramInt2 + paramInt4, paramInt3 + 1, 1);
  }
  
  public final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    if (paramImage == null)
      return; 
    paramInt6 *= b;
    paramInt7 *= b;
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.drawRegion(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public final void b(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    if (paramImage == null)
      return; 
    a(paramImage, 0, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (paramInt1 = 0; paramInt1 < paramInt3 / a(paramImage) + 1; paramInt1++) {
      for (paramInt2 = 0; paramInt2 < paramInt4 / b(paramImage) + 1; paramInt2++)
        this.a.drawImage(paramImage, 0 + paramInt1 * a(paramImage), 0 + paramInt2 * b(paramImage), 0); 
    } 
  }
  
  public static int a(float paramFloat, int paramInt1, int paramInt2) {
    ds.c("blend color");
    paramFloat = (paramInt2 >> 16 & 0xFF);
    float f1 = (paramInt2 >> 8 & 0xFF);
    float f2 = (paramInt2 & 0xFF);
    paramFloat *= 0.4F;
    f1 *= 0.4F;
    f2 *= 0.4F;
    if (paramFloat > 255.0F)
      paramFloat = 255.0F; 
    if (paramFloat < 0.0F)
      paramFloat = 0.0F; 
    if (f1 > 255.0F)
      f1 = 255.0F; 
    if (f1 < 0.0F)
      f1 = 0.0F; 
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 255.0F)
      f2 = 255.0F; 
    int i;
    return i = 0xFF000000 | (int)paramFloat << 16 | (int)f1 << 8 | (int)f2 & 0xFF;
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int a() {
    return this.a.getTranslateX() / b;
  }
  
  public final int b() {
    return this.a.getTranslateY() / b;
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 *= b;
    paramInt2 *= b;
    paramInt3 *= b;
    paramInt4 *= b;
    this.a.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int c() {
    return this.a.getClipX();
  }
  
  public final int d() {
    return this.a.getClipY();
  }
  
  public final int e() {
    return this.a.getClipWidth();
  }
  
  public final int f() {
    return this.a.getClipHeight();
  }
  
  public final void a(int paramInt) {
    this.a.setColor(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    paramInt1 *= b;
    paramInt2 *= b;
    this.a.translate(paramInt1, paramInt2);
  }
  
  public static int a(Image paramImage) {
    return paramImage.getWidth() / b;
  }
  
  public static int b(Image paramImage) {
    return paramImage.getHeight() / b;
  }
  
  public static int c(Image paramImage) {
    return paramImage.getWidth();
  }
  
  public static int d(Image paramImage) {
    return paramImage.getHeight();
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\en.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */