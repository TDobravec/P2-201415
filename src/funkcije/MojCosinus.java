package funkcije;

/**
 *
 * @author tomaz
 */
public class MojCosinus extends Funkcija {

  double vrednost(double x) {
    return Math.cos(x);
  }

  double odvod(double x) {
    return -Math.sin(x);
  }
  
  
}
