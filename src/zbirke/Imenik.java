package zbirke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tomaz
 */
public class Imenik {
  public static void main(String[] args) {
    ArrayList<Oseba> osebe = new ArrayList();
    
    Oseba o1 = new Oseba("Janez",    194);
    
    Oseba o2 = new Oseba("Micka",    170);
    Oseba o3 = new Oseba("Polde",    201);
    
    // osebe lahko dodajam tako, da prej naredim objekt in ga shranim v spremenljivki ...
    osebe.add(o1);
    osebe.add(o2);
    osebe.add(o3);
    
    // ... ali pa tako, da osebo ustvarim ob dodajanju v seznam
    osebe.add(new Oseba("Marjanca", 205));
    osebe.add(new Oseba("Marjanca", 193));
    osebe.add(new Oseba("Marjanca", 200));
    
    
    System.out.println("Izpis oseb - neurejeno (po vrsti, kot so bile dodane)");
    for (Oseba oseba : osebe) {
      System.out.println(oseba);
    }

    // "Primerjalnik" - za primerjavo oseb glede na njihovo visino
    Comparator<Oseba> c = new Comparator<Oseba>() {
      @Override
      public int compare(Oseba o1, Oseba o2) {
        return o1.getVisina() - o2.getVisina();
      }
    };
    
    // osebe uredim s primerjalnikom c (urejanje po visini) ...
    Collections.sort(osebe, c);

    // ... nato po imenu (uporabi se metoda compareTo, ki je definirana v Oseba)
    Collections.sort(osebe);
    
    // .. in izpisem
    System.out.println("Urejeno:");
    for (Oseba oseba : osebe) {
      System.out.println(oseba);
    }
        
  }
}
