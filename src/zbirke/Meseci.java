package zbirke;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author tomaz
 */
public class Meseci {
  public static void main(String[] args) {
   // ustvarim nov slovar ...
    TreeMap<String, Integer> meseci = new TreeMap();
    
    //... in vanj vstavim mesece (ključ=ime meseca, vrednost=število dni v mesecu)
    meseci.put("Jan", 31);
    meseci.put("Feb", 29);
    meseci.put("Mar", 31);
    meseci.put("Apr", 30);
    meseci.put("Maj", 31);
    meseci.put("Jun", 30);
    meseci.put("Jul", 31);
    
    // če dodam vrednost s ključem, ki že obstaja, se prejšnja vrednost prepiše
    // (pri enem ključu imam lahko samo eno vrednost)
    meseci.put("Jan", 45);
    
    // izpis mesecev - uporaba iteratorja
    System.out.println("Meseci - izpis z iteratorjem");
    Set kljuci = meseci.keySet();
    Iterator<String> it = kljuci.iterator();
    while(it.hasNext()) {
      String kljuc = it.next();
      System.out.printf("%s = %d\n", kljuc, meseci.get(kljuc));
    }
    
    // 2. možnost za izpis: sprehod po zbirki kljucev s for zanko
    System.out.println("\nIzpis mesecev - uporaba for zanke");
    for (String kljuc : meseci.keySet()) {
      System.out.printf("%s = %d\n", kljuc, meseci.get(kljuc));      
    }
  }
}
