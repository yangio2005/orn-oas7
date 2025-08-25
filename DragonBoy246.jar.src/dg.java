import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.a;

public abstract class dg extends Canvas implements Runnable {
  public static boolean ao;
  
  public static void a(GameMidlet paramGameMidlet) {
    Display.getDisplay((MIDlet)paramGameMidlet).setCurrent((Displayable)a.h);
  }
  
  public dg() {
    setFullScreenMode(true);
    int j = super.getHeight();
    int i;
    if ((i = super.getWidth()) * j >= 2073600) {
      en.b = 4;
      return;
    } 
    if (i * j >= 691200) {
      en.b = 3;
      return;
    } 
    if (i * j > 153600) {
      en.b = 2;
      return;
    } 
    en.b = 1;
  }
  
  public int getHeight() {
    System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
    return -1;
  }
  
  public int getWidth() {
    System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
    return -1;
  }
  
  public final int m() {
    int i;
    return (i = super.getWidth()) / en.b + ((i % en.b == 0) ? 0 : 1);
  }
  
  public final int n() {
    int i;
    return (i = super.getHeight()) / en.b + ((i % en.b == 0) ? 0 : 1);
  }
  
  protected final void pointerDragged(int paramInt1, int paramInt2) {
    paramInt1 /= en.b;
    paramInt2 /= en.b;
    a(paramInt1, paramInt2);
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    paramInt1 /= en.b;
    paramInt2 /= en.b;
    b(paramInt1, paramInt2);
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2) {
    paramInt1 /= en.b;
    paramInt2 /= en.b;
    c(paramInt1, paramInt2);
  }
  
  protected abstract void a(int paramInt1, int paramInt2);
  
  protected abstract void b(int paramInt1, int paramInt2);
  
  protected abstract void c(int paramInt1, int paramInt2);
  
  protected abstract void d();
  
  public void run() {
    try {
      Thread.sleep(100L);
    } catch (Exception exception) {}
    ao = true;
    while (ao) {
      long l1 = System.currentTimeMillis();
      d();
      repaint();
      serviceRepaints();
      long l2 = System.currentTimeMillis() - l1;
      try {
        if (l2 < 27L) {
          long l3;
          long l4;
          do {
            l3 = System.currentTimeMillis();
            Thread.sleep(27L - l2);
          } while ((l4 = System.currentTimeMillis()) - l3 < 27L - l2);
          continue;
        } 
        Thread.sleep(1L);
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */