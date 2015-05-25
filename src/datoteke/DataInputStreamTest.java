package datoteke;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author tomaz
 */
public class DataInputStreamTest {
  public static void main(String[] args) throws Exception {
    File f = new File("../viri/data.bin");
    FileInputStream fis = new FileInputStream(f);
    DataInputStream dis = new DataInputStream(fis);
    
    boolean b = dis.readBoolean();
    int i = dis.readInt();
    String a = dis.readUTF();
    String a2 = dis.readUTF();
    
    System.out.println(a2);
    
    dis.close();
  }
}
