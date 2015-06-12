package izjeme;

/**
 *
 * @author tomaz
 */
public class MojaMath {

  static double deli(double x, double y) throws RuntimeException {
    if (y != 0)
      return x/y;
    else
      throw new IzjemaDeliZNic();
  }
  
}
