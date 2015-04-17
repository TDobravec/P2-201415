package objektno.predavanje7;

/**
 *
 * @author tomaz
 */
public class Newton {

  static double izracunajNiclo(double x0, Function f, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0)/f.odvod(x0);
    }
    return x0;
  }
  
  public static void main(String[] args) {
    Function f1 = new Sinus();
    double nicla = izracunajNiclo(3, f1, 5);
    System.out.printf("%.15f\n", nicla);
    System.out.printf("%.15f\n", Math.PI);
    
    Function f2   = new Polinom();
    double nicla2 = izracunajNiclo(-1.5, f2, 5);
    System.out.printf("%.15f\n", nicla2);
        
    Function f3 = new Function() {
      double vrednost(double x) {
        return Math.pow(Math.E, x);
      }
      double odvod(double x) {
        return Math.pow(Math.E, x);
      }
    };
    double nicla3 = izracunajNiclo(0, f3, 100);
    System.out.printf("%.15f\n", nicla3);
  }
}
