

/**
 *
 * @author tomaz
 */
public class Risar {

  static final int SIRINA = 100;
  static final int VISINA = 100;
  
  public static void main(String[] args) {
    
    StdDraw.setXscale(0, SIRINA);
    StdDraw.setYscale(0, VISINA);
    
    Lik [] liki = new Lik[100];
    int steviloLikov = 0;
    
    liki[steviloLikov++] = new Krog(20, 20, 10);
    liki[steviloLikov++] = new Kvadrat(50, 50, 30);
    liki[steviloLikov++] = new Krog   (50, 50, 15);

    
    while(true) {
      StdDraw.clear();
      for (int i = 0; i < steviloLikov; i++) {
        liki[i].narisi();
      }
      
      while(!StdDraw.hasNextKeyTyped());
      char tipka = StdDraw.nextKeyTyped();
      
      int dx=0, dy=0;
      switch (tipka) {
        case 'W':
          dy = 5;
          break;
        case 'A':
          dx = -5;
          break;
        case 'S':
          dy = -5;
          break;
        case 'D':
          dx = 5;
      }
      for (int i = 0; i < steviloLikov; i++) {
        liki[i].move(dx, dy);
      }
    }
  }
}
