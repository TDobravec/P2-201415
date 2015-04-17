package objektno.predavanje7;

/**
 *
 * @author tomaz
 */
public class Polinom extends Function {

  double vrednost(double x) {
    return x*x*x + x*x - 2*x;
  }

  double odvod(double x) {
    return 3 * x * x + 2 * x - 2;
  }

}
