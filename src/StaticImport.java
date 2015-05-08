
import static java.lang.Math.*;

/**
 * Razred za testiranje komentarjev.
 * @author tomaz
 */
public class StaticImport {

  /**
   * Stevilo 3.
   */
  public static double PI = 3;

  /**
   * Metoda vrne število 7.
   */
  public static double PI() {
    return 7;
  }

  // metoda main
  public static void main(String[] args) {
    System.out.println(PI());
    
    /*
    Komentar
    v več
    vrsticah
    */
    System.out.println(E);

  }
}
