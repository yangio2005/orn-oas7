/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import main.GameCanvas;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class ImageCache {
    public static MyHashtable LoginScreen = new MyHashtable("Item ImgByName");

    public static void methodLoginScreen(String string, Image image, byte by2) {
        LoginScreen.put(string, new bm(image, by2));
    }

    public static bm LoginScreen(String string, MyHashtable t2) {
        bm bm2 = (bm)t2.get(string);
        if (bm2 == null) {
            bm2 = new bm();
            bm bm3 = ImageCache.imgCache(string);
            if (bm3 != null) {
                bm2.LoginScreen = bm3.LoginScreen;
                bm2.d = bm3.d;
            }
            t2.put(string, bm2);
        }
        bm2.b = GameCanvas.b / 1000L;
        if (bm2.LoginScreen == null) {
            --bm2.c;
            if (bm2.c <= 0) {
                GameService.LoginScreen().g(string);
                bm2.c = 200;
            }
        }
        return bm2;
    }

    private static bm LoginScreen(String object) {
        object = String.valueOf(mGraphics.b) + "ImgByName_" + (String)object;
        byte[] byArray = RMS.b((String)object);
        if (byArray == null) {
            return null;
        }
        try {
            object = new bm();
            new bm().d = byArray[0];
            ((bm)object).LoginScreen = Image.createImage((byte[])byArray, (int)1, (int)(byArray.length - 1));
        }
        catch (Exception exception) {
            return null;
        }
        return object;
    }

    public static void methodLoginScreen(String string, byte by2, byte[] byArray) {
        string = String.valueOf(mGraphics.b) + "ImgByName_" + string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by2);
            by2 = 0;
            while (by2 < byArray.length) {
                dataOutputStream.writeByte(byArray[by2]);
                by2 = (byte)(by2 + 1);
            }
            RMS.LoginScreen(string, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void methodLoginScreen(MyHashtable t2, int n2) {
        MyVector el2 = new MyVector("checkDelHash");
        Enumeration enumeration = t2.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            bm bm2 = (bm)t2.get(string);
            if (GameCanvas.b / 1000L - bm2.b <= 600L) continue;
            el2.addElement(string);
        }
        int n3 = 0;
        while (n3 < el2.size()) {
            t2.remove((String)el2.elementAt(n3));
            ++n3;
        }
    }
}

