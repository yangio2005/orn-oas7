import main.GameMidlet;
import main.a;

final class s implements Runnable {
  private br a;
  
  s(br parambr) {
    this.a = parambr;
  }
  
  public final void run() {
    try {
      while (this.a.d()) {
        s s1;
        byte b = (s1 = this).a.a.readByte();
        if (s1.a.j)
          b = br.a(s1.a, b); 
        b = b;
        int i = br.a((s1 = s1).a, s1.a.a.readByte()) + 128;
        int j = br.a(s1.a, s1.a.a.readByte()) + 128;
        int k;
        byte[] arrayOfByte = new byte[i = (((k = br.a(s1.a, s1.a.a.readByte()) + 128) << 8) + j << 8) + i];
        k = 0;
        int m = 0;
        while (k != -1 && m < i) {
          if ((k = s1.a.a.read(arrayOfByte, m, i - m)) > 0) {
            m += k;
            s1.a.i += m + 5;
            int n = (br.a()).i + (br.a()).h;
            s1.a.m = String.valueOf(n / 1024) + "." + (n % 1024 / 102) + "Kb";
          } 
        } 
        if (s1.a.j)
          for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
            arrayOfByte[b1] = br.a(s1.a, arrayOfByte[b1]);  
        if (s1.a.j) {
          byte b1 = s1.a.a.readByte();
          k = s1.a.a.readByte();
          i = (br.a(s1.a, b1) & 0xFF) << 8 | br.a(s1.a, k) & 0xFF;
        } else {
          i = s1.a.a.readUnsignedShort();
        } 
        arrayOfByte = new byte[i];
        k = 0;
        m = 0;
        while (k != -1 && m < i) {
          if ((k = s1.a.a.read(arrayOfByte, m, i - m)) > 0) {
            m += k;
            s1.a.i += m + 5;
            int n = (br.a()).i + (br.a()).h;
            s1.a.m = String.valueOf(n / 1024) + "." + (n % 1024 / 102) + "Kb";
          } 
        } 
        if (s1.a.j)
          for (byte b1 = 0; b1 < arrayOfByte.length; b1++)
            arrayOfByte[b1] = br.a(s1.a, arrayOfByte[b1]);  
        y y1;
        y y2;
        if ((y1 = (y)((b == -32 || b == -66 || b == 11 || b == -67 || b == -74 || b == -87 || b == 66 || b == 12) ? (y2 = new y(b, arrayOfByte)) : (y2 = new y(b, arrayOfByte)))) != null) {
          try {
            if (y1.a == -27) {
              a(y1);
              continue;
            } 
            this.a.b.a(y1);
          } catch (Exception exception) {
            (y1 = null).printStackTrace();
          } 
          continue;
        } 
        break;
      } 
    } catch (Exception exception) {}
    if (this.a.d) {
      if (this.a.b != null)
        if (System.currentTimeMillis() - this.a.l > 500L) {
          this.a.b.c(this.a.c);
        } else {
          this.a.b.b(this.a.c);
        }  
      if (br.a(this.a) != null)
        br.c(this.a); 
    } 
  }
  
  private void a(y paramy) {
    byte b = paramy.c().readByte();
    this.a.k = new byte[b];
    byte b1;
    for (b1 = 0; b1 < b; b1++)
      this.a.k[b1] = paramy.c().readByte(); 
    for (b1 = 0; b1 < this.a.k.length - 1; b1++)
      this.a.k[b1 + 1] = (byte)(this.a.k[b1 + 1] ^ this.a.k[b1]); 
    this.a.j = true;
    GameMidlet.c = paramy.c().readUTF();
    GameMidlet.d = paramy.c().readInt();
    GameMidlet.g = !(paramy.c().readByte() == 0);
    System.out.println("====> getKey " + this.a.j + " co nect 2 is " + GameMidlet.g);
    if (this.a.c && GameMidlet.g)
      a.c(); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */