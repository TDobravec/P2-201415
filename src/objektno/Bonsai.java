package objektno;

/**
 *
 * @author tomaz
 */
public class Bonsai extends Drevo {

  int sirina; // sirina v cm
  
  public Bonsai() {
    super();
    
    sirina = 0;
    
    tip = "Bonsai";
  }
  
  public Bonsai(String ime) {
    super(ime);
  }

  
  void povecajVisino() {
    if (getStarost() <= 2)
      setVisina(getVisina() + 0.05);
    
    sirina += 5;
  }
  
  void izris() {
    System.out.println(this.toString());
    System.out.println("Q");
  }
  
  void strizenje() {
    if (sirina > 5)
      sirina = sirina - 5;
  }
  
  

  
}
