package zbirke;

/**
 *
 * @author tomaz
 */
public class Oseba implements Comparable<Oseba> {
  private String ime;
  private int visina;

  public Oseba(String ime, int visina) {
    this.ime = ime;
    this.visina = visina;
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }

  public int getVisina() {
    return visina;
  }

  public void setVisina(int visina) {
    this.visina = visina;
  }

  @Override
  public String toString() {
    return String.format("%s, %d", ime, visina);
  }

//  urejanje po visini  
//  @Override
//  public int compareTo(Oseba o) {
//    return this.visina - o.visina;
//  }
  
  // urajanje po abacednem redu imen
  @Override
  public int compareTo(Oseba o) {
    return o.ime.compareTo(this.ime);
  }
  
  
  
}
