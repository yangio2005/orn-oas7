import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class ad {
  private Random b;
  
  Vector a;
  
  private int[] c;
  
  public ad(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b = new Random();
    this.a = new Vector();
    this.c = new int[] { 16711680, 16776960, 65280, 16777215, 255, 65535, 15790320, 12632256 };
    for (paramInt3 = 0; paramInt3 < 72; paramInt3++)
      this.a.addElement(new aj(paramInt1, paramInt2, Math.abs(this.b.nextInt() % 8) + 3, paramInt3 * 5, this.c[Math.abs(this.b.nextInt() % this.c.length)])); 
  }
  
  public ad() {}
  
  public static InputStream a(String paramString) {
    return "".getClass().getResourceAsStream(paramString);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */