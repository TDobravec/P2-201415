package ski;

public class Smucar {

    private String ime;
    private String priimek;
    private String drzava;
    private String cas1, cas2;

    private int cas; // cas v stotinkah

    // konstruktor prejme vrstico oblike
    // X 31 565268 DREV Ana SLO 1:00.76 1:01.93 24.60
    // in nastavi vrednost atributov
    Smucar(String vrstica) {
        String [] deli = vrstica.split(" ");
        ime = deli[4];
        priimek = deli[3];
        drzava = deli[5];
        cas1 = deli[6];
        cas2 = deli[7];

        cas = -1;
    }

    public void setIme(String ime) {
      this.ime = ime;
    }

    public int getCas() {
      if (cas == -1) {
        cas = Tekma.casVStotinkah(cas1) + Tekma.casVStotinkah(cas2);
      }
      
      return cas;
    }

    public String toString() {
      //return ime + " " + priimek + ...;
      return String.format("Ime: %s, Priimek: %s, Država: %s\nCas1: %s, Cas2: %s, Skupaj: %d\n",
        ime, priimek, drzava, cas1, cas2, cas);
    }

}
