/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class u {
    private byte c;
    public String a;
    public static LoggingList IActionListener = new LoggingList("");
    private static LoggingList d = new LoggingList("");

    public u(String string, byte by2) {
        this.a = string;
        this.c = by2;
    }

    public static void a() {
        LoggingList el2 = new LoggingList("");
        Object object = RMSManager.IActionListener("ImageSource");
        if (object == null) {
            GameService.a().a(el2);
            return;
        }
        d = new LoggingList("");
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            int n2 = object.readShort();
            String[] stringArray = new String[n2];
            byte[] byArray = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                stringArray[n3] = object.readUTF();
                byArray[n3] = object.readByte();
                d.addElement(new u(stringArray[n3], byArray[n3]));
                ++n3;
            }
            object.close();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        MathUtil.c("vS size= " + IActionListener.size() + " vRMS size= " + d.size());
        GameService.a().a(el2);
    }

    public static void IActionListener() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(IActionListener.size());
            int n2 = 0;
            while (n2 < IActionListener.size()) {
                dataOutputStream.writeUTF(((u)u.IActionListener.elementAt((int)n2)).a);
                dataOutputStream.writeByte(((u)u.IActionListener.elementAt((int)n2)).c);
                ++n2;
            }
            RMSManager.a("ImageSource", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

