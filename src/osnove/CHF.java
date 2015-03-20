package osnove;

import java.util.Scanner;
import java.io.File;
import java.util.*;

public class CHF {
  public static void main(String [] args) throws Exception {
    //Locale.setDefault(Locale.ENGLISH);

    Scanner datoteka = new Scanner(new File("../viri/CHF2015.txt"));

    // izpis celotne datoteke na zaslon
    // dokler je se kaksna vrstica v datoteki
    //   preberi vrstico in izpisi na zaslon
    //while (datoteka.hasNextLine()) {
    //  String vrstica = datoteka.nextLine();
    //  System.out.println(vrstica);
    //}

    String datum;
    double tecaj;

    double minTecaj=2;
    String minDatum="?";

    while (datoteka.hasNext()) {
      datum = datoteka.next();  // preberem besedo (datum)
      tecaj = datoteka.nextDouble();

      if (tecaj < minTecaj) {
        minTecaj = tecaj;
        minDatum = datum;
      }
    }
    datoteka.close();

    System.out.printf("Minimalni tecaj: %.4f na dan %s\n", minTecaj, minDatum);
  }
}
