
import java.util.Collection;


/**
 *
 * @author tomaz
 */
public class ZaOdKodiraj {

  static String kodiraj(String niz) {
    if (niz.length() == 0)  return "";
    String rezultat = "";

    int z = 0, k;

    do {
      k = z + 1;
      while (k < niz.length() && niz.charAt(k) == niz.charAt(z)) {
        k++;
      }
      
      // rezultat += "" + (k-z) + niz.charAt(z);
      rezultat += String.format("%d%c", k-z, niz.charAt(z));
      
      //z = k; k = k + 1;
      z = k++;
    } while (k <= niz.length());
    

    return rezultat;
  }

  static String kodirajZBufferjem(String niz) {
    if (niz.length() == 0)  return "";
    StringBuffer rezultat = new StringBuffer();

    int z = 0, k;

    do {
      k = z + 1;
      while (k < niz.length() && niz.charAt(k) == niz.charAt(z)) {
        k++;
      }
      
      
      rezultat.append(String.format("%d%c", k-z, niz.charAt(z)));
      
      //z = k; k = k + 1;
      z = k++;
    } while (k <= niz.length());
    
    
    return rezultat.toString();
  }
  
  
  public static void main(String[] args) {
    String niz = "aaaabbbddd";
    String zakodirano = kodirajZBufferjem(niz);
    System.out.println(zakodirano);
  }

}
