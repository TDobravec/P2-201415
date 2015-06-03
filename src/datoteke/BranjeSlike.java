package datoteke;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author tomaz
 */
public class BranjeSlike {
  static void preberiVTabelo() throws Exception {
    File f = new File("../viri/lev.jpg");
    byte vsebina[] = new byte[(int) f.length()];
    
    FileInputStream fis = new FileInputStream(f);
    int enBajt;
    int koliko = 0;
    while((enBajt = fis.read()) != -1) {
      vsebina[koliko++] = (byte) enBajt;
    }
    fis.close();
  }
 
  static void preberiHitroVTabelo() throws Exception {
    File f = new File("../viri/lev.jpg");
    byte vsebina[] = new byte[(int) f.length()];
    
    BufferedInputStream fis = new BufferedInputStream(new FileInputStream(f));
    int enBajt;
    int koliko = 0;
    while((enBajt = fis.read()) != -1) {
      vsebina[koliko++] = (byte) enBajt;
    }
    fis.close();
  }
 
  static void preberiVString() throws Exception {
    File f = new File("../viri/lev.jpg");
    String vsebina = "";
    
    BufferedInputStream fis = new BufferedInputStream(new FileInputStream(f));
    int enBajt;
    int koliko = 0;
    while((enBajt = fis.read()) != -1) {
      // NIKOLI ne dodajajte v string!!!!
      vsebina = vsebina + Integer.toHexString(enBajt);
      koliko++;
      if (koliko%1000 == 0)
        System.out.println(koliko);
    }
    fis.close();
  }

  static void preberiVStringBuilder() throws Exception {
    File f = new File("../viri/lev.jpg");
    StringBuilder vsebina = new StringBuilder();
    
    BufferedInputStream fis = new BufferedInputStream(new FileInputStream(f));
    int enBajt;
    int koliko = 0;
    while((enBajt = fis.read()) != -1) {
      // NIKOLI ne dodajajte v string!!!!
      vsebina.append(Integer.toHexString(enBajt));
      koliko++;
      if (koliko%1000 == 0)
        System.out.println(koliko);
    }
    fis.close();
  }

  
  public static void main(String[] args) throws Exception {
    long time = System.currentTimeMillis();
    preberiVStringBuilder();
    time = System.currentTimeMillis() - time;
    System.out.println("Čas izvajanja: " + time + "ms");
  }
}
