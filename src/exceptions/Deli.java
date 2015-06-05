package exceptions;

/**
 *
 * @author tomaz
 */
public class Deli {
  public static void main(String[] args) {
    try {
      int i = 10/0;
    } catch (Exception e) {
      System.out.println("Ne gre, ker " + e.toString());
      e.printStackTrace();
    }
    
    System.out.println("JUHUHU!");
  }
}
