public final class ak {
  public int a;
  
  public String b;
  
  public short[] c;
  
  public int d;
  
  public int e;
  
  public static el f = new el("vClanImage");
  
  public static t g = new t("h id images");
  
  public static void a(ak paramak) {
    bt.a().b((byte)paramak.a);
    f.addElement(paramak);
  }
  
  public static ak a(short paramShort) {
    for (byte b = 0; b < f.size(); b++) {
      ak ak1;
      if ((ak1 = f.elementAt(b)).a == paramShort)
        return ak1; 
    } 
    return null;
  }
  
  public static boolean a(int paramInt) {
    for (byte b = 0; b < f.size(); b++) {
      ak ak1;
      if ((ak1 = f.elementAt(b)).a == paramInt)
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */