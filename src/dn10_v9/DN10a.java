package dn10_v9;

// avtor: 63140040
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class DN10a {

  public static void main(String[] args) {
    try {
      final HashMap<String, Integer> slovar = new HashMap<String, Integer>();
      Scanner sc = new Scanner(new File("../viri/vesolje.txt"), "UTF-8");
      String b;
      while (sc.hasNext()) {

        b = sc.next();//.toLowerCase();
        if (b.endsWith(".") || b.endsWith(",") || b.endsWith(")") || b.endsWith("\"")) {
          b = b.substring(0, b.length() - 1);
        }
        if (b.startsWith("\"") || b.startsWith("(")) {
          b = b.substring(1, b.length());
        }

        if (slovar.containsKey(b)) {
          slovar.put(b, (int) slovar.get(b) + 1);
        } else {
          slovar.put(b, 1);
        }

        //System.out.println(b + " " + slovar.get(b).toString());
      }
      //output
      TreeMap<String, Integer> tm = new TreeMap<String, Integer>(new Comparator<String>() {
        public int compare(String a, String b) {
          int v1 = slovar.get(a);int v2 = slovar.get(b);
          if (v1 == v2) {
            return -a.compareTo(b);
          } else
            return Integer.compare(slovar.get(b), slovar.get(a));
        }
      });
      tm.putAll(slovar);
      
      System.out.printf("%-11.11s  %-11.11s\n\n", "pojavitve", "beseda");
      for (Map.Entry i : tm.entrySet()) {
        System.out.printf("%-11.11s  %-11.11s\n", i.getValue(), i.getKey());
      }

    } catch (FileNotFoundException e) {
      System.out.print(e);
    }
  }
}
