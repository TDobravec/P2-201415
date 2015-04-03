package ski;

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Tekma {

  Smucar [] tekmovalci;

  void preberiTekmovalce(String imeDatoteke) throws Exception {
    Scanner sc = new Scanner(new File(imeDatoteke));
    int steviloTek = sc.nextInt();

    // preberem (in pozabim) dve vrstici
    sc.nextLine(); sc.nextLine();

    tekmovalci = new Smucar[steviloTek];
    int i=0;
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      tekmovalci[i++] = new Smucar(vrstica);
    }

    System.out.println(steviloTek);

    sc.close();
  }

  void izpisiTekmovalce() {
    for(int i=0; i<tekmovalci.length; i++) {
      System.out.println(tekmovalci[i]);
    }
  }

  void izpisiPoVrsti() {
    int [] vsiCasi = new int[tekmovalci.length];

    for(int i=0; i<tekmovalci.length; i++) {
      vsiCasi[i] = tekmovalci[i].getCas();
    }

    Arrays.sort(vsiCasi);

    for(int i=0; i<vsiCasi.length; i++) {
      // poiscem in izpisem tekmovalca, ki ima ta cas
      for(int j=0; j<tekmovalci.length; j++) {
        if (tekmovalci[j].getCas() == vsiCasi[i])
          System.out.println(tekmovalci[j]);
      }
    }


  }

  // prejme cas oblike "1:03.26" in vrne 6326
  static int casVStotinkah(String cas) {
    int minute=0, sekunde=0, stotinke=0;


    if (cas.contains(":")) {
      String tab1[] = cas.split(":");
      minute = Integer.parseInt(tab1[0]);
      cas = tab1[1]; // iz "1:03.26" dobim "03.26"
    }

    // parameter pri split je regularni izraz
    String tab2[] = cas.split("\\.");
    sekunde  = Integer.parseInt(tab2[0]);
    stotinke = Integer.parseInt(tab2[1]);

    return minute*6000 + sekunde * 100 + stotinke;
  }

}
