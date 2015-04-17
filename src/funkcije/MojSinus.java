package funkcije;

/**
 *
 * @author tomaz
 */
public class MojSinus extends Funkcija {

  double vrednost(double x) {
    return Math.sin(x);
  }
  
  double odvod(double x) {
    return Math.cos(x);
  }
}
