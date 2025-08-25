import java.io.IOException;
import java.io.InputStream;
import main.a;

public final class bt {
  db a = br.a();
  
  private static bt g;
  
  public static long b;
  
  public static long c;
  
  public static long d;
  
  public static long e;
  
  public static boolean f;
  
  public static bt a() {
    if (g == null)
      g = new bt(); 
    return g;
  }
  
  public final void a(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)18)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9) {
    y y = null;
    try {
      (y = new y((byte)42)).d().writeUTF(paramString1);
      y.d().writeUTF(paramString2);
      y.d().writeUTF(paramString3);
      y.d().writeUTF(paramString4);
      y.d().writeUTF(paramString5);
      y.d().writeUTF(paramString6);
      y.d().writeUTF(paramString7);
      y.d().writeUTF(paramString8);
      y.d().writeUTF(paramString9);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, el paramel) {
    ds.c("combine");
    y y = null;
    try {
      (y = new y((byte)-81)).d().writeByte(1);
      y.d().writeByte(paramel.size());
      for (byte b = 0; b < paramel.size(); b++) {
        y.d().writeByte(((h)paramel.elementAt(b)).g);
        ds.c("gui id " + ((h)paramel.elementAt(b)).g);
      } 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, int paramInt1, byte paramByte2, int paramInt2) {
    ds.c("giao dich action = " + paramByte1);
    y y = null;
    try {
      (y = new y((byte)-86)).d().writeByte(paramByte1);
      if (paramByte1 == 0 || paramByte1 == 1)
        y.d().writeInt(paramInt1); 
      if (paramByte1 == 2) {
        ds.c("gui len indxe =" + paramByte2 + " num= " + paramInt2);
        y.d().writeByte(paramByte2);
        y.d().writeInt(paramInt2);
      } 
      if (paramByte1 == 4)
        y.d().writeByte(paramByte2); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(cd[] paramArrayOfcd) {
    y y = null;
    try {
      (y = new y((byte)-125)).d().writeByte(paramArrayOfcd.length);
      for (byte b = 0; b < paramArrayOfcd.length; b++)
        y.d().writeUTF(paramArrayOfcd[b].d()); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte) {
    y y = null;
    try {
      (y = new y((byte)112)).d().writeByte(0);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(char paramChar) {
    ds.c("cap char c= " + paramChar);
    y y = null;
    try {
      (y = new y((byte)-85)).d().writeChar(paramChar);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, int paramInt) {
    ds.c("add friend");
    y y = null;
    try {
      (y = new y((byte)-80)).d().writeByte(paramByte);
      if (paramInt != -1)
        y.d().writeInt(paramInt); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(int paramInt) {
    ds.c("get ngoc");
    y y = null;
    try {
      (y = new y((byte)-76)).d().writeByte(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void c(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-79)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(byte paramByte) {
    y y = null;
    try {
      (y = new y((byte)-62)).d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void c(byte paramByte) {
    ds.c("Skill not focus so " + paramByte);
    y y = null;
    try {
      (y = new y((byte)-45)).d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void d(int paramInt) {
    y y = null;
    try {
      ds.c("CLAN DONATE");
      (y = new y((byte)-54)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2) {
    y y = null;
    try {
      ds.c("CLAN MESSAGE");
      (y = new y((byte)-51)).d().writeByte(paramInt1);
      if (paramInt1 == 0)
        y.d().writeUTF(paramString); 
      if (paramInt1 == 2)
        y.d().writeInt(paramInt2); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2, byte paramByte3, short paramShort) {
    if ((af.e()).H == 14)
      return; 
    y y = null;
    try {
      (y = new y((byte)-43)).d().writeByte(paramByte1);
      y.d().writeByte(paramByte2);
      y.d().writeByte(paramByte3);
      if (paramByte3 == -1)
        y.d().writeShort(paramShort); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(int paramInt, byte paramByte) {
    ds.c("JOIN CLAN " + paramInt);
    y y = null;
    try {
      (y = new y((byte)-49)).d().writeInt(paramInt);
      y.d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void e(int paramInt) {
    ds.c("MEMBER CLAN " + paramInt);
    y y = null;
    try {
      (y = new y((byte)-50)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(String paramString) {
    ds.c("send SEARCH CLAN " + paramString);
    y y = null;
    try {
      (y = new y((byte)-47)).d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(int paramInt, byte paramByte) {
    ds.c("REMOTE CLAN id = " + paramInt + " role= " + paramByte);
    y y = null;
    try {
      (y = new y((byte)-56)).d().writeInt(paramInt);
      y.d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b() {
    ds.c("LEAVE CLAN");
    y y = null;
    try {
      y = new y((byte)-55);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
    ds.c("invite action = " + paramByte + "layerid= " + paramInt1 + " clanID= " + paramInt2 + " code= " + paramInt3);
    y y = null;
    try {
      (y = new y((byte)-57)).d().writeByte(paramByte);
      if (paramByte == 0)
        y.d().writeInt(paramInt1); 
      if (paramByte == 1 || paramByte == 2) {
        y.d().writeInt(paramInt2);
        y.d().writeInt(paramInt3);
      } 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, int paramInt, String paramString) {
    y y = null;
    try {
      (y = new y((byte)-46)).d().writeByte(paramByte);
      if (paramByte == 2 || paramByte == 4) {
        y.d().writeShort((short)paramInt);
        y.d().writeUTF(paramString);
        ds.c("SEND SLOGAN= " + paramString);
      } 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2) {
    y y = null;
    try {
      (y = new y((byte)-40)).d().writeByte(paramByte1);
      y.d().writeByte(paramByte2);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public static y d(byte paramByte) {
    y y;
    (y = new y((byte)-29)).d().writeByte(paramByte);
    return y;
  }
  
  private static y i(byte paramByte) {
    y y;
    (y = new y((byte)-28)).d().writeByte(paramByte);
    return y;
  }
  
  public final void c() {
    if (av.d("clienttype") != -1)
      l.c = av.d("clienttype"); 
    try {
      ds.c("setType");
      y y;
      (y = d((byte)2)).d().writeByte(l.c);
      y.d().writeByte(en.b);
      y.d().writeBoolean(false);
      y.d().writeInt(a.A);
      y.d().writeInt(a.B);
      y.d().writeBoolean(cd.g);
      y.d().writeBoolean(a.e);
      y.d().writeUTF(String.valueOf(System.getProperty("microedition.platform")) + "|" + "2.4.6");
      InputStream inputStream;
      if ((inputStream = getClass().getResourceAsStream("res\\info")) != null) {
        inputStream.read(null);
        y.d().writeShort(null.length);
        y.d().write((byte[])null);
        ds.b("write " + null.length + "|" + "2.4.6");
      } 
      this.a.a(y);
      y.e();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void d() {
    y y = null;
    try {
      y = new y((byte)-120);
      this.a.a(y);
    } catch (Exception exception) {
      return;
    } finally {
      b = l.d();
      y.e();
    } 
  }
  
  public final void e() {
    y y = null;
    try {
      y = new y((byte)-121);
      this.a.a(y);
    } catch (Exception exception) {
      return;
    } finally {
      c = l.d();
      y.e();
    } 
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, byte paramByte) {
    ds.c("Login " + paramString1 + " " + paramString2 + " " + paramString3);
    try {
      y y;
      (y = d((byte)0)).d().writeUTF(paramString1);
      y.d().writeUTF(paramString2);
      y.d().writeUTF(paramString3);
      y.d().writeByte(paramByte);
      y.d().writeByte(aw.fA);
      this.a.a(y);
      y.e();
      return;
    } catch (IOException iOException) {
      (paramString1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4) {
    ds.c("Request Register " + paramString1 + " " + paramString2 + " " + paramString4);
    try {
      y y;
      (y = d((byte)1)).d().writeUTF(paramString1);
      y.d().writeUTF(paramString2);
      if (paramString3 != null && !paramString3.equals("")) {
        y.d().writeUTF(paramString3);
        y.d().writeUTF("a");
      } 
      this.a.a(y);
      y.e();
      return;
    } catch (IOException iOException) {
      (paramString4 = null).printStackTrace();
      return;
    } 
  }
  
  public final void f() {
    y y = new y((byte)-23);
    this.a.a(y);
    y.e();
  }
  
  public final void e(byte paramByte) {
    y y = new y((byte)-34);
    try {
      y.d().writeByte(paramByte);
      this.a.a(y);
      y.e();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void f(int paramInt) {
    y y = new y((byte)21);
    try {
      y.d().writeByte(paramInt);
      this.a.a(y);
      y.e();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void g(int paramInt) {
    y y = new y((byte)-78);
    try {
      y.d().writeInt(paramInt);
      this.a.a(y);
      y.e();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void g() {
    int i = (af.e()).B - (af.e()).bD;
    int j = (af.e()).C - (af.e()).bE;
    if (af.bG || (i == 0 && j == 0) || ac.b || (af.e()).s || (af.e()).C <= 0 || (af.e()).cP)
      return; 
    try {
      y y = new y((byte)-7);
      (af.e()).bD = (af.e()).B;
      (af.e()).bE = (af.e()).C;
      af.e();
      af.e();
      af.e();
      af.e();
      if (bv.a((af.e()).B / bv.i, (af.e()).C / bv.i) == 0) {
        y.d().writeByte(1);
      } else {
        y.d().writeByte(0);
      } 
      y.d().writeShort((af.e()).B);
      if (j != 0)
        y.d().writeShort((af.e()).C); 
      this.a.a(y);
      p.M++;
      y.e();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2) {
    y y = new y((byte)-28);
    try {
      y.d().writeByte(2);
      y.d().writeUTF(paramString);
      y.d().writeByte(paramInt1);
      y.d().writeByte(paramInt2);
      ds.c("name= " + paramString + " gender= " + paramInt1 + " hair=" + paramInt2);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
    } 
    this.a.a(y);
  }
  
  public final void h(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)11)).d().writeShort(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2, short paramShort) {
    y y = null;
    try {
      (y = new y((byte)7)).d().writeByte(paramByte1);
      y.d().writeByte(paramByte2);
      y.d().writeShort(paramShort);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, int paramInt1, int paramInt2) {
    y y = null;
    try {
      (y = new y((byte)6)).d().writeByte(paramByte);
      y.d().writeShort(paramInt1);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void i(int paramInt) {
    ds.c(String.valueOf((af.e()).ag) + " SELECT SKILL " + paramInt);
    y y = null;
    try {
      (y = new y((byte)34)).d().writeShort(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(short paramShort) {
    y y = null;
    try {
      (y = new y((byte)-66)).d().writeShort(paramShort);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void h() {
    y y = null;
    try {
      y = new y((byte)29);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(short paramShort, byte paramByte) {
    ds.c("confirme menu=" + paramByte + " npc= " + paramShort);
    y y = null;
    try {
      (y = new y((byte)32)).d().writeShort(paramShort);
      y.d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void j(int paramInt) {
    ds.c("npc id" + paramInt);
    y y = null;
    try {
      (y = new y((byte)33)).d().writeShort(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    y y = null;
    try {
      (y = new y((byte)22)).d().writeByte(paramInt1);
      y.d().writeByte(paramInt2);
      y.d().writeByte(paramInt3);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(short paramShort) {
    y y = null;
    try {
      (y = new y((byte)27)).d().writeShort(paramShort);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(short paramShort, String paramString) {
    y y = null;
    try {
      (y = new y((byte)88)).d().writeShort(paramShort);
      y.d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(h[] paramArrayOfh) {
    a.L.b();
    y y = null;
    try {
      y = new y((byte)13);
      for (byte b = 0; b < paramArrayOfh.length; b++) {
        if (paramArrayOfh[b] != null)
          y.d().writeByte((paramArrayOfh[b]).g); 
      } 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void k(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)37)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void i() {
    y y = null;
    try {
      y = new y((byte)50);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(el paramel1, el paramel2, int paramInt) {
    try {
      ds.c("SEND ATTACT vChar=  " + paramel2.size());
      y y = null;
      if (paramInt == 0)
        return; 
      if (paramel1.size() > 0 && paramel2.size() > 0) {
        if (paramInt == 1) {
          y = new y((byte)-4);
        } else if (paramInt == 2) {
          y = new y((byte)67);
        } 
        y.d().writeByte(paramel1.size());
        for (paramInt = 0; paramInt < paramel1.size(); paramInt++) {
          aa aa = paramel1.elementAt(paramInt);
          y.d().writeByte(aa.y);
        } 
        for (paramInt = 0; paramInt < paramel2.size(); paramInt++) {
          af af;
          if ((af = paramel2.elementAt(paramInt)) != null) {
            y.d().writeInt(af.J);
          } else {
            y.d().writeInt(-1);
          } 
        } 
      } else if (paramel1.size() > 0) {
        ds.c("PLAYER ATTACK NPC");
        y = new y((byte)54);
        for (paramInt = 0; paramInt < paramel1.size(); paramInt++) {
          aa aa;
          if (!(aa = paramel1.elementAt(paramInt)).J) {
            y.d().writeByte(aa.y);
          } else {
            y.d().writeByte(-1);
            y.d().writeInt(aa.y);
          } 
        } 
      } else if (paramel2.size() > 0) {
        ds.c("player attack player ");
        y = new y((byte)-60);
        for (paramInt = 0; paramInt < paramel2.size(); paramInt++) {
          af af = paramel2.elementAt(paramInt);
          y.d().writeInt(af.J);
        } 
      } 
      y.d().writeByte((byte)(af.e()).I);
      if (y == null)
        return; 
      this.a.a(y);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void l(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-20)).d().writeShort(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void j() {
    y y = null;
    try {
      y = new y((byte)-15);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void k() {
    y y = null;
    try {
      y = new y((byte)-16);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(String paramString) {
    y y = null;
    try {
      ds.c("Send chat " + paramString);
      (y = new y((byte)44)).d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void l() {
    y y = null;
    try {
      y = new y((byte)-87);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void m() {
    y y = null;
    try {
      y = i((byte)6);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void n() {
    y y = null;
    try {
      y = i((byte)7);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void o() {
    y y = null;
    try {
      y = i((byte)8);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void p() {
    y y = null;
    try {
      y = i((byte)13);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void c(String paramString) {
    y y = null;
    try {
      (y = new y((byte)53)).d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void m(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)76)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void n(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)77)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2, int paramInt) {
    ds.c("PLAYER VS PLAYER");
    y y = null;
    try {
      (y = new y((byte)-59)).d().writeByte(paramByte1);
      y.d().writeByte(paramByte2);
      y.d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void o(int paramInt) {
    y y = null;
    try {
      (y = i((byte)10)).d().writeByte(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void d(String paramString) {
    y y = null;
    try {
      (y = new y((byte)17)).d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(String paramString, int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-72)).d().writeInt(paramInt);
      y.d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void e(String paramString) {
    y y = null;
    try {
      (y = new y((byte)-71)).d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(String paramString1, String paramString2) {
    y y = null;
    try {
      (y = i((byte)16)).d().writeUTF(paramString1);
      y.d().writeUTF(paramString2);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(String paramString, int paramInt) {
    y y = null;
    try {
      (y = i((byte)18)).d().writeInt(paramInt);
      y.d().writeUTF(paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void p(int paramInt) {
    a.b();
    y y = null;
    try {
      System.out.println("REQUEST ICON " + paramInt);
      (y = new y((byte)-67)).d().writeInt(paramInt);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void q(int paramInt) {
    y y = null;
    try {
      (y = i((byte)37)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void r(int paramInt) {
    y y = null;
    try {
      (y = i((byte)41)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void s(int paramInt) {
    y y = null;
    try {
      (y = i((byte)39)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void c(short paramShort) {
    ds.c("get image id= " + paramShort);
    y y = null;
    try {
      (y = new y((byte)-32)).d().writeShort(paramShort);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void q() {
    ds.c("send map offline");
    y y = null;
    try {
      y = new y((byte)-33);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void r() {
    y y = null;
    try {
      y = new y((byte)-38);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void t(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-38)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception) {
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void s() {
    ds.c("finishLoadMap");
    y y = null;
    try {
      y = new y((byte)-39);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void u(int paramInt) {
    ds.c("request bag image");
    y y = null;
    try {
      (y = new y((byte)-63)).d().writeShort(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void f(String paramString) {
    ds.c("Login 2");
    y y = null;
    try {
      (y = new y((byte)-101)).d().writeUTF(paramString);
      y.d().writeByte(1);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void f(byte paramByte) {
    ds.c("request magic tree");
    y y = null;
    try {
      (y = new y((byte)-34)).d().writeByte(2);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    y y = null;
    try {
      byte b = 16;
      y y1;
      (y1 = new y((byte)-30)).d().writeByte(16);
      (y = y1).d().writeByte(paramInt1);
      y.d().writeShort(paramInt2);
      ds.c("gửi tăng tiềm năng NUM= " + paramInt2 + " type= " + paramInt1);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(byte paramByte, el paramel) {
    y y;
    ds.c("request resource action= " + paramByte);
    paramel = null;
    try {
      (y = new y((byte)-74)).d().writeByte(paramByte);
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        f = true;
        this.a = br.a();
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void v(int paramInt) {
    ds.c("request magic tree");
    y y = null;
    try {
      (y = new y((byte)-91)).d().writeByte(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void t() {
    y y = null;
    try {
      y = new y((byte)-107);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(String paramString, byte paramByte) {
    y y = null;
    try {
      (y = new y((byte)-96)).d().writeUTF(paramString);
      y.d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void w(int paramInt) {
    ds.c("GUI THACH DAUA");
    y y = null;
    try {
      (y = new y((byte)-118)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(byte paramByte, int paramInt) {
    ds.c("add friend");
    y y = null;
    try {
      (y = new y((byte)-99)).d().writeByte(paramByte);
      if (paramByte == 1 || paramByte == 2)
        y.d().writeInt(paramInt); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, int paramInt1, byte paramByte2, int paramInt2, int paramInt3) {
    y y = null;
    try {
      ds.c("ki gui action= " + paramByte1 + " item id= " + paramInt1);
      (y = new y((byte)-100)).d().writeByte(paramByte1);
      if (paramByte1 == 0) {
        y.d().writeShort(paramInt1);
        y.d().writeByte(paramByte2);
        y.d().writeInt(paramInt2);
        y.d().writeInt(paramInt3);
        ds.c("ki gui so luong " + paramInt3);
      } 
      if (paramByte1 == 1 || paramByte1 == 2)
        y.d().writeShort(paramInt1); 
      if (paramByte1 == 3) {
        y.d().writeShort(paramInt1);
        y.d().writeByte(paramByte2);
        y.d().writeInt(paramInt2);
      } 
      if (paramByte1 == 4) {
        y.d().writeByte(paramByte2);
        y.d().writeByte(paramInt2);
        ds.c("currTab= " + paramByte2 + " page= " + paramInt2);
      } 
      if (paramByte1 == 5)
        y.d().writeShort(paramInt1); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(byte paramByte1, byte paramByte2) {
    y y = null;
    try {
      (y = new y((byte)-103)).d().writeByte(paramByte1);
      ds.c("------------service--  " + paramByte1 + "   " + paramByte2);
      if (paramByte1 != 0)
        y.d().writeByte(paramByte2); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void x(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-104)).d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void g(byte paramByte) {
    y y = null;
    try {
      (y = new y((byte)-108)).d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void u() {
    y y = null;
    try {
      y = new y((byte)-105);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void h(byte paramByte) {
    y y = null;
    try {
      ds.c("FUNSION");
      (y = new y((byte)125)).d().writeByte(paramByte);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(el paramel) {
    y y = null;
    try {
      ds.c("IMAGE SOURCE size= " + paramel.size());
      (y = new y((byte)-111)).d().writeShort(paramel.size());
      if (paramel.size() > 0)
        for (byte b = 0; b < paramel.size(); b++) {
          ds.c("gui len str " + ((u)paramel.elementAt(b)).a);
          y.d().writeUTF(((u)paramel.elementAt(b)).a);
        }  
      if (br.b().d() && !(br.b()).e) {
        this.a = br.b();
      } else {
        this.a = br.a();
        f = true;
      } 
      this.a.a(y);
      this.a = br.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte, int paramInt, byte[] paramArrayOfbyte) {
    y y = null;
    try {
      ds.c("SERVER DATA");
      (y = new y((byte)-110)).d().writeByte(1);
      y.d().writeInt(paramInt);
      if (paramArrayOfbyte != null) {
        paramInt = paramArrayOfbyte.length;
        y.d().writeShort(paramInt);
        y.d().write(paramArrayOfbyte, 0, paramInt);
      } 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    y y = null;
    try {
      y = new y((byte)-113);
      for (byte b = 0; b < p.aQ.length; b++)
        y.d().writeByte(paramArrayOfbyte[b]); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void v() {
    y y = null;
    try {
      y = new y((byte)-114);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void y(int paramInt) {
    y y = null;
    try {
      (y = new y((byte)-30)).d().writeByte(63);
      y.d().writeInt(paramInt);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(int paramInt, short paramShort) {
    y y = null;
    try {
      (y = new y((byte)-30)).d().writeByte(64);
      y.d().writeInt(paramInt);
      y.d().writeShort(paramShort);
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void g(String paramString) {
    y y = null;
    try {
      (y = new y((byte)66)).d().writeUTF(paramString);
      ds.c(">>>getGetImgByName = " + paramString);
      this.a.a(y);
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void c(byte paramByte1, byte paramByte2) {
    y y = new y((byte)-127);
    try {
      y.d().writeByte(paramByte1);
      if (paramByte2 > 0)
        y.d().writeByte(paramByte2); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    y y = new y(127);
    try {
      y.d().writeByte(paramInt1);
      if (paramInt2 != -1)
        y.d().writeShort(paramInt2); 
      this.a.a(y);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void w() {
    y y = new y((byte)69);
    try {
      this.a.a(y);
    } catch (Exception exception) {
      return;
    } finally {
      y.e();
    } 
  }
  
  public final void a(byte paramByte1, byte paramByte2, short paramShort1, short paramShort2) {
    y y = null;
    try {
      (y = new y((byte)-45)).d().writeByte(20);
      y.d().writeByte(paramByte1);
      y.d().writeShort((af.e()).B);
      y.d().writeShort((af.e()).C);
      y.d().writeByte(paramByte2);
      y.d().writeShort(paramShort1);
      y.d().writeShort(paramShort2);
      this.a.a(y);
    } catch (Exception exception) {
      return;
    } finally {
      y.e();
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */