package operatorji;

/**
 *
 * @author tomaz
 */
public class Dvojisko {

  static String vDvojisko(int x) {
    if (x == 0) return "0";
    
    String rezultat = "";
    while (x > 0) {

//      if ((x & 1) == 1)
//        rezultat = "1" + rezultat;
//      else
//        rezultat = "0" + rezultat;
      
      rezultat = (((x & 1) == 1) ? "1" : "0") + rezultat;
      
      x = x >> 1;
    }
    return rezultat;
  }
  
  static int vDesetisko(String niz) {
    int rezultat = 0;
    for (int i = niz.length()-1; i >= 0; i--) {
      if (niz.charAt(i) == '1')
        rezultat = rezultat | 1; // prizgem zadnji bit
      if (i != 0)
        rezultat = rezultat << 1;
    }
    return rezultat;
    
  }
  
  public static void main(String[] args) {
    System.out.println(vDvojisko(15));
    System.out.println(vDvojisko(0));
    
    System.out.println(vDesetisko("1111"));
    System.out.println(vDesetisko("1010"));
  }
  
}
