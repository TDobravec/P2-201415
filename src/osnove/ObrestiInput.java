package osnove;

import java.util.*;

// program enbak programu Obresti, razlikuje se le v izpisu
public class ObrestiInput {

  public static void main(String [] args) {
    double g;  // glavnica
    double p;  // obrestna mera
    int    n;  // stevilo let

    double koncnaVrednost;

    Scanner sc = new Scanner(System.in);
    System.out.print("Vpisi glavnico: ");
    g = sc.nextDouble();

    System.out.print("Vpisi obrestno mero: ");
    p = sc.nextDouble();

    System.out.print("Vpisi stevilo let: ");
    n = sc.nextInt();

    koncnaVrednost = g * Math.pow((1+p/100),n);

    System.out.printf("Koncna vrednost glavnice %.2fEUR po obrestni meri %.1f%% je %.2fEUR\n",
         g, p, koncnaVrednost );

  }

}
