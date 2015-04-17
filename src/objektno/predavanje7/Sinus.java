package objektno.predavanje7;

/**
 *
 * @author tomaz
 */
public class Sinus extends Function {

  
  double vrednost(double x) {
    return Math.sin(x);
  }

  
  double odvod(double x) {
    return Math.cos(x);
  }
  
}
