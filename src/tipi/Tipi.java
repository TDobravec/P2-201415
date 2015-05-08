package tipi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Tipi {
  
  static  String [] ukazi = {"ADD", "LD", "BRA"}; 
  
  static  String [] meseci = {"Jan", "Feb", "Mar"};
  
  public static void m\u0061in(String[] args) {
     
     int število = 12; 
    
     Object [] nekObjekt = new Object[3];
    
    nekObjekt[0] = new Random();
    
    nekObjekt[1] = new Scanner(System.in);
    
    nekObjekt[2] = 5.0;
    
    if (nekObjekt[2] instanceof Double)
      System.out.println("OK");
    
    char pi = '\u0061';
    System.out.println(pi);
    
    
    String niz = "Pehta";
    System.out.println(niz.charAt(2));
    
    //to ne gre!
    //niz.setCharAt(2, 'a');
    
    niz = "Kekec";
    System.out.println(niz);
    
    String niz2="AAABBB";
    niz2 = niz2.replaceAll("A+", "Z");
    System.out.println(niz2);
    
    
    StringBuffer a = new StringBuffer("");
    for (int i = 0; i < 100000; i++) {
      a.append("a");
    }
    System.out.println(a);
    
    a = new StringBuffer("miha");
    a.setCharAt(0, 'M');
    System.out.println(a);
    a.replace(0, 2, "BLABLA");
    System.out.println(a);
    
    int tab[] = new int[5];
    tab[3]=13;
    tab[7]=5;
    
  }
}
