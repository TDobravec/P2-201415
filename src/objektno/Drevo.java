package objektno;

/**
 * author: Alenka
 */
public class Drevo extends Object {

  static int ID = 0;

  String tip;

  String ime = "";

  private int starost = 0;
  private double visina = 0;
  int zapSt = 0;

  Drevo() {
    ID++;
    zapSt = ID;

    tip = "Drevo";
  }

  public Drevo(String ime) {
    this();
    this.ime = ime;
  }

  public Drevo(String i, int s, double v) {
    this(i);
    starost = s;
    visina = v;
  }

  public int getStarost() {
    return starost;
  }

  public void setStarost(int starost) {
    this.starost = starost;

    //visina = starost / ....;
  }

  public double getVisina() {
    return visina;
  }

  public void setVisina(double visina) {
    this.visina = visina;
  }

  public String toString() {
    return String.format("%s %s, staro %d let je veliko %.1f m, zap. stevilka: %d", tip, this.ime, starost, visina, zapSt);
  }

  void pomlad() {
    starost = starost + 1;
    povecajVisino();
  }

  void povecajVisino() {
    if (starost <= 3) {
      visina = visina + 1;
    } else {
      visina = visina + 0.2;
    }
  }

  void izris() {
    System.out.println(this.toString());
    int v = (int) Math.round(visina);
    for (int i = 0; i < v; i++) {
      if (i < v / 2) {
        System.out.println("*****");
      } else {
        System.out.println("  *");
      }
    }
  }

  void spremeniIme(String ime) {
    this.ime = ime;
  }

  double povprecnaRast() {
    if (starost == 0) {
      return 0;
    }
    return visina / starost;
  }

  static void izpisiNavodilaZaObrezovanje() {
    System.out.println("Drevo se obrezuje ...");
  }

  public void nastaviStarost(int st) {
    if (st > 0) {
      starost = st;
    }
  }

  public int vrniStarost() {
    return starost;
  }

}
