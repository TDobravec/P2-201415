package objektno;

/**
 *
 * @author tomaz
 */
public class Drevesnica3 {
  public static void main(String[] args) {
    Drevo d = new Drevo();
    d.ime = "Lipa";
    d.pomlad();d.pomlad();d.pomlad();
    
    Bonsai b = new Bonsai();
    b.ime = "Mali hrast";
    b.pomlad();b.pomlad();b.pomlad();
    
    d.izris();;
    
    b.izris();
    
    b.strizenje();
    
    new Bonsai("Lipek");
    
    
    Drevo nekoDrevo = new Bonsai();
    nekoDrevo.pomlad();
    nekoDrevo.izris();
  
    if (nekoDrevo instanceof Bonsai)
      ((Bonsai)nekoDrevo).strizenje();
    
    if (d instanceof Bonsai)
      ((Bonsai)d).strizenje();
    
    
    d.setStarost(5);
  }
}
