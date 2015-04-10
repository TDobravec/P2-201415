package objektno;

/**
 *
 * @author tomaz
 */
public class Drevesnica2 {
  public static void main(String[] args) {
    
    Drevo d1 = new Drevo();
    Drevo d2 = new Drevo();
    
    d1.ime = "Lipa";
    d2.ime = "Hrast";
    
    System.out.println("d1.ime = " + d1.ime);
    System.out.println("d2.ime = " + d2.ime);
    
    d1.ID = 5;
    d2.ID = 7;
    System.out.println("d1.ID = " + d1.ID);
    System.out.println("d2.ID = " + d2.ID);
  }
}
