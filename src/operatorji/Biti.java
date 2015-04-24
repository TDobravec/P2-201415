package operatorji;

/**
 *
 * @author tomaz
 */
public class Biti {
  
  // metoda vrne število prižganih bitov v številu x
  static int steviloBitov(int x) {
    int rezultat = 0;
    while (x > 0) {
      if (x % 2 == 1) // liho število
        rezultat++;
      x /= 2;
    }
    return rezultat;
  }

  // metoda vrne število prižganih bitov v številu x
  // za računanje uporabimo SAMO bitne operatorje
  static int steviloBitov2(int x) {
    int rezultat = 0;
    while (x > 0) {
      if ((x & 1) == 1) // liho število
        rezultat++;
      x = x >> 1;
    }
    return rezultat;
  }

  public static void main(String[] args) {
    System.out.println(steviloBitov2(15));
    System.out.println(steviloBitov2(128));
    System.out.println(steviloBitov2(11));
  }

}
