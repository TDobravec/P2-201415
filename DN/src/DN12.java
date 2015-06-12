package dn12;

import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tomaz
 */
public class Vreme {

  static void vreme1() throws Exception {
    URL url = new URL("http://www.arso.si/vreme/napovedi%20in%20podatki/vreme_avt.html");
    Scanner sc = new Scanner(url.openStream());
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      if (vrstica.contains("Ljubljana")) {
        int z = vrstica.indexOf("onlinedesno");
        if (z != -1) {
          int k = vrstica.indexOf("</td>", z);
          System.out.println(vrstica.subSequence(z+13, k));
        }        
      }
    }
    sc.close();
  }

  static void vreme2() throws Exception {
    URL url = new URL("http://www.arso.si/vreme/napovedi%20in%20podatki/vreme_avt.html");
    Scanner sc = new Scanner(url.openStream());
    Pattern vzorec = Pattern.compile("Ljubljana\\D*(\\d+)"); 
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
//      if (vrstica.contains("Ljubljana"))
//        System.out.println(vrstica);
      Matcher m = vzorec.matcher(vrstica);
      if (m.find())
        System.out.println(m.group(1));
    }
    sc.close();
  }
    
  public static void main(String[] args) throws Exception  {
    vreme2();
  }
  
}
