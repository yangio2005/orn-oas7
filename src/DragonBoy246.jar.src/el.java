import java.util.Vector;

public class el extends Vector {
  private String a;
  
  public el(String paramString) {
    this.a = paramString;
  }
  
  private el() {}
  
  public synchronized void removeAllElements() {
    super.removeAllElements();
  }
  
  public synchronized boolean removeElement(Object paramObject) {
    return super.removeElement(paramObject);
  }
  
  public synchronized void removeElementAt(int paramInt) {
    super.removeElementAt(paramInt);
  }
  
  public synchronized void addElement(Object paramObject) {
    if (size() > 1000)
      System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.a + " num= " + size()); 
    super.addElement(paramObject);
  }
  
  public synchronized void insertElementAt(Object paramObject, int paramInt) {
    if (size() > 1000)
      System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.a + " num= " + size()); 
    super.insertElementAt(paramObject, paramInt);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\el.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */