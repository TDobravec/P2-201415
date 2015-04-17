package funkcije;

/**
 *
 * @author tomaz
 */
public class TestFunkcija {
  
  // vsota(x) = f1(x) + f2(x);
  static double vsota(Funkcija f1, Funkcija f2, double x) {
    return f1.vrednost(x) + f2.vrednost(x);
  }
  
  public static void main(String[] args) {
    Funkcija f1 = new MojSinus();
    Funkcija f2 = new MojCosinus();
    
    vsota(f1, f2, Math.PI);
    
    System.out.println(f1.vrednost(0));
    
  }
}
