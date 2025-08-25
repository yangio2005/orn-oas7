import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ck {
  public Image a;
  
  private z[] h;
  
  private cs[] i;
  
  public short[] b;
  
  public short[][] c = new short[16][];
  
  public int d;
  
  public int e = 0;
  
  public int f;
  
  public int g;
  
  public final void a(String paramString) {
    InputStream inputStream;
    try {
      inputStream = ad.a(paramString);
      inputStream = new DataInputStream(inputStream);
    } catch (Exception exception) {
      return;
    } 
    b((DataInputStream)inputStream);
  }
  
  public final void b(String paramString) {
    InputStream inputStream;
    try {
      inputStream = ad.a(paramString);
      inputStream = new DataInputStream(inputStream);
    } catch (Exception exception) {
      return;
    } 
    a((DataInputStream)inputStream);
  }
  
  private void a(DataInputStream paramDataInputStream) {
    short s1 = 0;
    short s2 = 0;
    int i = 0;
    int j = 0;
    try {
      byte b = paramDataInputStream.readByte();
      this.h = new z[b];
      short s;
      for (s = 0; s < b; s++) {
        this.h[s] = new z();
        (this.h[s]).a = paramDataInputStream.readByte();
        (this.h[s]).b = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s]).c = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s]).d = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s]).e = (short)paramDataInputStream.readUnsignedByte();
      } 
      s = paramDataInputStream.readShort();
      this.i = new cs[s];
      for (b = 0; b < this.i.length; b++) {
        this.i[b] = new cs();
        s = paramDataInputStream.readByte();
        (this.i[b]).a = new short[s];
        (this.i[b]).b = new short[s];
        (this.i[b]).c = new byte[s];
        for (byte b1 = 0; b1 < s; b1++) {
          (this.i[b]).a[b1] = paramDataInputStream.readShort();
          (this.i[b]).b[b1] = paramDataInputStream.readShort();
          (this.i[b]).c[b1] = paramDataInputStream.readByte();
          if (b == 0) {
            if (s1 > (this.i[b]).a[b1])
              s1 = (this.i[b]).a[b1]; 
            if (s2 > (this.i[b]).b[b1])
              s2 = (this.i[b]).b[b1]; 
            if (i < (this.i[b]).a[b1] + (this.h[(this.i[b]).c[b1]]).d)
              i = (this.i[b]).a[b1] + (this.h[(this.i[b]).c[b1]]).d; 
            if (j < (this.i[b]).b[b1] + (this.h[(this.i[b]).c[b1]]).e)
              j = (this.i[b]).b[b1] + (this.h[(this.i[b]).c[b1]]).e; 
            this.f = i - s1;
            this.g = j - s2;
          } 
        } 
      } 
      this.b = new short[paramDataInputStream.readShort()];
      for (b = 0; b < this.b.length; b++)
        this.b[b] = paramDataInputStream.readShort(); 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void b(DataInputStream paramDataInputStream) {
    short s1 = 0;
    short s2 = 0;
    int i = 0;
    int j = 0;
    try {
      byte b = paramDataInputStream.readByte();
      ds.c("small num= " + b);
      this.h = new z[b];
      short s3;
      for (s3 = 0; s3 < b; s3++) {
        this.h[s3] = new z();
        (this.h[s3]).a = paramDataInputStream.readByte();
        (this.h[s3]).b = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s3]).c = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s3]).d = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s3]).e = (short)paramDataInputStream.readUnsignedByte();
      } 
      s3 = paramDataInputStream.readShort();
      this.i = new cs[s3];
      for (b = 0; b < s3; b++) {
        this.i[b] = new cs();
        byte b2 = paramDataInputStream.readByte();
        (this.i[b]).a = new short[b2];
        (this.i[b]).b = new short[b2];
        (this.i[b]).c = new byte[b2];
        for (byte b3 = 0; b3 < b2; b3++) {
          (this.i[b]).a[b3] = paramDataInputStream.readShort();
          (this.i[b]).b[b3] = paramDataInputStream.readShort();
          (this.i[b]).c[b3] = paramDataInputStream.readByte();
          if (b == 0) {
            if (s1 > (this.i[b]).a[b3])
              s1 = (this.i[b]).a[b3]; 
            if (s2 > (this.i[b]).b[b3])
              s2 = (this.i[b]).b[b3]; 
            if (i < (this.i[b]).a[b3] + (this.h[(this.i[b]).c[b3]]).d)
              i = (this.i[b]).a[b3] + (this.h[(this.i[b]).c[b3]]).d; 
            if (j < (this.i[b]).b[b3] + (this.h[(this.i[b]).c[b3]]).e)
              j = (this.i[b]).b[b3] + (this.h[(this.i[b]).c[b3]]).e; 
            this.f = i - s1;
            this.g = j - s2;
          } 
        } 
      } 
      short s = paramDataInputStream.readShort();
      this.b = new short[s];
      if (this.d >= 201) {
        short[] arrayOfShort = new short[s];
        s1 = 0;
        String str = "";
        i = 0;
        for (j = 0; j < s; j++) {
          s3 = paramDataInputStream.readShort();
          str = String.valueOf(str) + s3 + ",";
          this.b[j] = s3;
          if (s3 + 500 >= 500) {
            arrayOfShort[s1++] = s3;
            i = 1;
          } else {
            short s4 = (short)ds.g(s3 + 500);
            this.c[s4] = new short[s1];
            System.arraycopy(arrayOfShort, 0, this.c[s4], 0, s1);
            s1 = 0;
          } 
        } 
        if (i == 0) {
          this.c[0] = new short[s1];
          System.arraycopy(arrayOfShort, 0, this.c[0], 0, s1);
          return;
        } 
        for (j = 0; j < 16; j++) {
          if (this.c[j] == null)
            this.c[j] = this.c[2]; 
        } 
        return;
      } 
      for (byte b1 = 0; b1 < s; b1++)
        this.b[b1] = paramDataInputStream.readShort(); 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a(byte[] paramArrayOfbyte, byte paramByte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    a(dataInputStream, paramByte);
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    b(dataInputStream);
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : [Lcs;
    //   4: ifnull -> 397
    //   7: aload_0
    //   8: getfield i : [Lcs;
    //   11: arraylength
    //   12: ifeq -> 397
    //   15: aload_0
    //   16: getfield i : [Lcs;
    //   19: iload_2
    //   20: aaload
    //   21: astore_2
    //   22: iconst_0
    //   23: istore #7
    //   25: goto -> 387
    //   28: aload_0
    //   29: aload_2
    //   30: getfield c : [B
    //   33: iload #7
    //   35: baload
    //   36: istore #9
    //   38: astore #8
    //   40: iconst_0
    //   41: istore #10
    //   43: goto -> 76
    //   46: aload #8
    //   48: getfield h : [Lz;
    //   51: iload #10
    //   53: aaload
    //   54: getfield a : I
    //   57: iload #9
    //   59: if_icmpne -> 73
    //   62: aload #8
    //   64: getfield h : [Lz;
    //   67: iload #10
    //   69: aaload
    //   70: goto -> 88
    //   73: iinc #10, 1
    //   76: iload #10
    //   78: aload #8
    //   80: getfield h : [Lz;
    //   83: arraylength
    //   84: if_icmplt -> 46
    //   87: aconst_null
    //   88: astore #8
    //   90: iload #5
    //   92: iconst_m1
    //   93: if_icmpne -> 148
    //   96: aload_1
    //   97: aload_0
    //   98: getfield a : Ljavax/microedition/lcdui/Image;
    //   101: aload #8
    //   103: getfield b : I
    //   106: aload #8
    //   108: getfield c : I
    //   111: aload #8
    //   113: getfield d : I
    //   116: aload #8
    //   118: getfield e : I
    //   121: iconst_0
    //   122: iload_3
    //   123: aload_2
    //   124: getfield a : [S
    //   127: iload #7
    //   129: saload
    //   130: iadd
    //   131: iload #4
    //   133: aload_2
    //   134: getfield b : [S
    //   137: iload #7
    //   139: saload
    //   140: iadd
    //   141: iconst_0
    //   142: invokevirtual a : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   145: goto -> 384
    //   148: iload #5
    //   150: ifne -> 224
    //   153: aload_1
    //   154: aload_0
    //   155: getfield a : Ljavax/microedition/lcdui/Image;
    //   158: aload #8
    //   160: getfield b : I
    //   163: aload #8
    //   165: getfield c : I
    //   168: aload #8
    //   170: getfield d : I
    //   173: aload #8
    //   175: getfield e : I
    //   178: iconst_0
    //   179: iload_3
    //   180: aload_2
    //   181: getfield a : [S
    //   184: iload #7
    //   186: saload
    //   187: iadd
    //   188: iload #4
    //   190: aload_2
    //   191: getfield b : [S
    //   194: iload #7
    //   196: saload
    //   197: iadd
    //   198: iload #6
    //   200: iconst_4
    //   201: if_icmpge -> 215
    //   204: iload #6
    //   206: ifle -> 215
    //   209: getstatic main/a.ae : I
    //   212: goto -> 216
    //   215: iconst_0
    //   216: isub
    //   217: iconst_0
    //   218: invokevirtual a : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   221: goto -> 384
    //   224: iload #5
    //   226: iconst_1
    //   227: if_icmpne -> 303
    //   230: aload_1
    //   231: aload_0
    //   232: getfield a : Ljavax/microedition/lcdui/Image;
    //   235: aload #8
    //   237: getfield b : I
    //   240: aload #8
    //   242: getfield c : I
    //   245: aload #8
    //   247: getfield d : I
    //   250: aload #8
    //   252: getfield e : I
    //   255: iconst_2
    //   256: iload_3
    //   257: aload_2
    //   258: getfield a : [S
    //   261: iload #7
    //   263: saload
    //   264: isub
    //   265: iload #4
    //   267: aload_2
    //   268: getfield b : [S
    //   271: iload #7
    //   273: saload
    //   274: iadd
    //   275: iload #6
    //   277: iconst_4
    //   278: if_icmpge -> 292
    //   281: iload #6
    //   283: ifle -> 292
    //   286: getstatic main/a.ae : I
    //   289: goto -> 293
    //   292: iconst_0
    //   293: isub
    //   294: getstatic cj.b : I
    //   297: invokevirtual a : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   300: goto -> 384
    //   303: iload #5
    //   305: iconst_2
    //   306: if_icmpne -> 384
    //   309: aload_1
    //   310: aload_0
    //   311: getfield a : Ljavax/microedition/lcdui/Image;
    //   314: aload #8
    //   316: getfield b : I
    //   319: aload #8
    //   321: getfield c : I
    //   324: aload #8
    //   326: getfield d : I
    //   329: aload #8
    //   331: getfield e : I
    //   334: bipush #7
    //   336: iload_3
    //   337: aload_2
    //   338: getfield a : [S
    //   341: iload #7
    //   343: saload
    //   344: isub
    //   345: iload #4
    //   347: aload_2
    //   348: getfield b : [S
    //   351: iload #7
    //   353: saload
    //   354: iadd
    //   355: iload #6
    //   357: iconst_4
    //   358: if_icmpge -> 372
    //   361: iload #6
    //   363: ifle -> 372
    //   366: getstatic main/a.ae : I
    //   369: goto -> 373
    //   372: iconst_0
    //   373: isub
    //   374: getstatic cj.f : I
    //   377: invokevirtual a : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   380: goto -> 384
    //   383: pop
    //   384: iinc #7, 1
    //   387: iload #7
    //   389: aload_2
    //   390: getfield a : [S
    //   393: arraylength
    //   394: if_icmplt -> 28
    //   397: return
    // Exception table:
    //   from	to	target	type
    //   90	380	383	java/lang/Exception
  }
  
  private void a(DataInputStream paramDataInputStream, byte paramByte) {
    short s1 = 0;
    short s2 = 0;
    int i = 0;
    int j = 0;
    try {
      byte b = paramDataInputStream.readByte();
      this.h = new z[b];
      short s;
      for (s = 0; s < b; s++) {
        this.h[s] = new z();
        (this.h[s]).a = paramDataInputStream.readByte();
        if (paramByte == 1) {
          (this.h[s]).b = (short)paramDataInputStream.readUnsignedByte();
          (this.h[s]).c = (short)paramDataInputStream.readUnsignedByte();
        } else {
          (this.h[s]).b = paramDataInputStream.readShort();
          (this.h[s]).c = paramDataInputStream.readShort();
        } 
        (this.h[s]).d = (short)paramDataInputStream.readUnsignedByte();
        (this.h[s]).e = (short)paramDataInputStream.readUnsignedByte();
      } 
      s = paramDataInputStream.readShort();
      this.i = new cs[s];
      for (paramByte = 0; paramByte < this.i.length; paramByte++) {
        this.i[paramByte] = new cs();
        b = paramDataInputStream.readByte();
        (this.i[paramByte]).a = new short[b];
        (this.i[paramByte]).b = new short[b];
        (this.i[paramByte]).c = new byte[b];
        for (s = 0; s < b; s++) {
          (this.i[paramByte]).a[s] = paramDataInputStream.readShort();
          (this.i[paramByte]).b[s] = paramDataInputStream.readShort();
          (this.i[paramByte]).c[s] = paramDataInputStream.readByte();
          if (paramByte == 0) {
            if (s1 > (this.i[paramByte]).a[s])
              s1 = (this.i[paramByte]).a[s]; 
            if (s2 > (this.i[paramByte]).b[s])
              s2 = (this.i[paramByte]).b[s]; 
            if (i < (this.i[paramByte]).a[s] + (this.h[(this.i[paramByte]).c[s]]).d)
              i = (this.i[paramByte]).a[s] + (this.h[(this.i[paramByte]).c[s]]).d; 
            if (j < (this.i[paramByte]).b[s] + (this.h[(this.i[paramByte]).c[s]]).e)
              j = (this.i[paramByte]).b[s] + (this.h[(this.i[paramByte]).c[s]]).e; 
            this.f = i - s1;
            this.g = j - s2;
          } 
        } 
      } 
      this.b = new short[paramDataInputStream.readShort()];
      for (paramByte = 0; paramByte < this.b.length; paramByte++)
        this.b[paramByte] = paramDataInputStream.readShort(); 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ck.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */