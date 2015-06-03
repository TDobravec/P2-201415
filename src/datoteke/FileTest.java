package datoteke;

import java.io.File;

/**
 *
 * @author tomaz
 */
public class FileTest {
  public static void main(String[] args) {
    // preverim, ali datoteka obstaja in izpišem njeno dolžino
    File f1 = new File("test.txt");
    System.out.println(f1.exists() ? "OK" : "NOK");
    System.out.println(f1.length());
    
    // z ukazom mkdirs ustvarim dva direktorija - naprej vaje
    // in nato v direktoriju vaje poddirektorij test
    File f2 = new File("vaje/test");
    f2.mkdirs();
    
    System.out.println(f2.exists());
    System.out.println(f2.isDirectory());
    f2.delete();
  }
}
