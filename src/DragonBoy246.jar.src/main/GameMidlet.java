package main;

import ac;
import bb;
import bd;
import br;
import dg;
import em;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
  public static String a = "112.213.94.23";
  
  public static int b = 14445;
  
  public static String c;
  
  public static int d;
  
  public static int e = 246;
  
  private static a h;
  
  public static GameMidlet f;
  
  private static boolean i;
  
  public static boolean g;
  
  public GameMidlet() {
    f = this;
  }
  
  protected void destroyApp(boolean paramBoolean) {}
  
  protected void pauseApp() {}
  
  public void startApp() {
    if (!i) {
      GameMidlet gameMidlet = this;
      a a1 = h = new a();
      (new Thread((Runnable)a1)).start();
      br.a().a((bd)ac.a());
      br.b().a((bd)ac.a());
      (br.b()).c = false;
      em.f();
      em.a();
      a.E = (bb)new em();
      dg.a(f);
      i = true;
    } 
  }
  
  public final void a() {
    dg.ao = false;
    System.gc();
    notifyDestroyed();
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\main\GameMidlet.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */