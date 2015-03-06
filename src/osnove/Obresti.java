package osnove;

public class Obresti {

  public static void main(String [] args) {
    double g;  // glavnica
    double p;  // obrestna mera
    int    n;  // stevilo let

    double koncnaVrednost;

    g = 1000;
    p = 3;
    n = 10;

    koncnaVrednost = g * Math.pow((1+p/100),n);

    System.out.println("Koncna vrednost: " + koncnaVrednost );

  }

}
