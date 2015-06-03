package datoteke;

import java.util.Scanner;
import java.net.URL;
/**
 *
 * @author tomaz
 */
public class OddaljenaDatoteka {
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://www.vreme-on.net/temperature-veter.html");
    Scanner sc = new Scanner(url.openStream());
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
  }
}
