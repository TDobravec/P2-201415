package datoteke;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author tomaz
 */
public class DataOutputStreamTest  {
  public static void main(String[] args) throws Exception {
    File f = new File("../viri/data.bin");
    FileOutputStream fos = new FileOutputStream(f);
    DataOutputStream dos = new DataOutputStream(fos);
    
    dos.writeBoolean(true);
    dos.writeInt(32);
    dos.writeUTF("Danes je petekčšž!");
    dos.writeUTF("FRI");
    
    dos.close();
  }
}
