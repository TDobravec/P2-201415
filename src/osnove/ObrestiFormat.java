package osnove;

// program enbak programu Obresti, razlikuje se le v izpisu
public class ObrestiFormat {

  public static void main(String [] args) {
    double g;  // glavnica
    double p;  // obrestna mera
    int    n;  // stevilo let

    double koncnaVrednost;

    g = 1000;
    p = 3;
    n = 10;

    koncnaVrednost = g * Math.pow((1+p/100),n);

    System.out.printf("Koncna vrednost glavnice %.2fEUR po obrestni meri %.1f%% je %.2fEUR\n",
         g, p, koncnaVrednost );

  }

}
