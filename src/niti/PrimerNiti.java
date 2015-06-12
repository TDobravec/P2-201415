package niti;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


class MojaNit extends Thread {
  String besedilo;
  Podatki p;
  
  MojaNit(String besedilo, Podatki p) {
    this.besedilo = besedilo;
    this.p = p;
  }
  
  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      //System.out.println(besedilo);
      synchronized(p) {
       p.stevec++;      
      }
    }
  }  
} 

class Podatki {
  int stevec;
}

/**
 *
 * @author tomaz
 */
public class PrimerNiti {

  public static void main(String[] args) {
    Podatki p = new Podatki();
    
    MojaNit nit1 = new MojaNit("PINK", p);
    MojaNit nit2 = new MojaNit("PONK", p);
    
    nit1.start();
    nit2.start();
    
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    System.out.println(p.stevec);
    System.exit(0);
    
  }
  
}
