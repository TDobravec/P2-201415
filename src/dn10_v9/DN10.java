package dn10_v9;


import java.io.File;
import java.util.*;

/**
 *
 * @author tomaz
 */
public class DN10 {

  public static void main(String args[]) throws Exception {
    final HashMap<String, Integer> besede = new HashMap();
    
    Scanner sc = new Scanner(new File("../viri/vesolje.txt"), "UTF-8");
    while (sc.hasNext()) {
      String beseda = sc.next();
      beseda = beseda.replaceAll("[.,!()]", "");
      if (beseda.isEmpty())
        continue;

      int pojavitve = besede.containsKey(beseda) ? besede.get(beseda) : 0;

      besede.put(beseda, pojavitve + 1);
    }
    sc.close();

    
//    // neurejen izpis
//    for(String beseda : besede.keySet()) { 
//      System.out.printf("%-5d %s\n", besede.get(beseda), beseda); 
//    }
    
    ArrayList<String> kljuci = new ArrayList(besede.keySet());
    Comparator<String> primerjalnik = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int v1 = besede.get(o1);
        int v2 = besede.get(o2);
        return v2 - v1;
      }
    };
    
    Collections.sort(kljuci, primerjalnik);
    for (String kljuc : kljuci) {
      System.out.printf("%d %s\n", besede.get(kljuc), kljuc);
    }
  }
}
