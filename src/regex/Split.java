package regex;

/**
 *
 * @author tomaz
 */
public class Split {
  public static void main(String[] args) {
    String niz = "To   je  \t   niz:niz2";
    String [] deli = niz.split("[ \t:]+");
    for (int i = 0; i < deli.length; i++) {
      System.out.println(deli[i]);
    }
  }
}
