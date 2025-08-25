import javax.microedition.lcdui.Image;
import main.a;

public final class eg {
  public Image a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public eg(Image paramImage, int paramInt) {
    this.a = paramImage;
    this.b = paramInt;
    this.c = 0;
    this.d = 0;
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = false;
    int i = paramInt4;
    paramInt4 = paramInt3;
    paramInt3 = paramInt2;
    paramInt2 = paramInt1;
    en en1 = paramen;
    eg eg1 = this;
    en1.b(eg1.a, 0, 0, en.a(eg1.a), en.b(eg1.a), paramInt2, paramInt3, paramInt4, i);
    if (a.w % 1000 == 0)
      eg1.d = ++eg1.c; 
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    boolean bool = false;
    int i = paramInt7;
    paramInt7 = paramInt6;
    paramInt6 = paramInt5;
    paramInt5 = paramInt4;
    paramInt4 = paramInt3;
    paramInt3 = paramInt2;
    paramInt2 = paramInt1;
    en en1 = paramen;
    eg eg1;
    if (en.a((eg1 = this).a) != 1) {
      en1.b(eg1.a, 0, paramInt3 * paramInt6, paramInt6, paramInt7, paramInt2, paramInt4, paramInt5, i);
      if (a.w % 1000 == 0)
        eg1.d = ++eg1.c; 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\eg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */