package zbirke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author tomaz
 */
public class DneviVTednu {

  public static void main(String[] args) {
    Collection<String> dnevi;

    //dnevi = new HashSet();
    //dnevi = new ArrayList();
    dnevi = new TreeSet();

    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    
    if (dnevi.contains("PET"))
      System.out.println("Hura!");
    else  
      System.out.println("Škoda!");

    dnevi.remove("PON");
    System.out.println(dnevi.size());
    
    dnevi.add("TOR");
    System.out.println(dnevi.size());    
    
//    boolean jeBil = dnevi.remove("TOR");
//    System.out.println(jeBil);
    
    Iterator<String> i = dnevi.iterator();
    while (i.hasNext()) {
      String dan = i.next();
      System.out.println(dan);
    }
    
    // druga možnost za sprehod po zbirki (Collection): for zanka
    for (String dan : dnevi) {
      System.out.println(dan);
    }
    
  }
}
