package objektno.predavanje7;

/**
 *
 * @author tomaz
 */
abstract public class Function {
  // v abstraktnem razredu lahko deklariram atribute...
  int x;
  
  abstract double vrednost(double x);
  abstract double odvod(double x);
  
  // ... ter dodam "prave" (ne abstraktne) metode
  void izpis() {
    System.out.println("Nekaj...");
  }
}
