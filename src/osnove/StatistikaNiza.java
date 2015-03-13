package osnove;

import java.util.Scanner;

public class StatistikaNiza {
   public static void main(String [] args) {
     // iz tipkovnice preberen niz
     Scanner tipkovnica = new Scanner(System.in);
     System.out.print("Vpisi niz: ");
     String niz = tipkovnica.nextLine();

     // prebrani niz "analiziram"
     System.out.printf("Prva crka: %c \n", niz.charAt(0));
     System.out.printf("Zadnja crka: %c \n", niz.charAt(niz.length()-1));


     String brez = niz.replaceAll(" ", "");
     System.out.printf("Brez presledkov: %s \n", brez);

     // prestejemo presledke
     int presledki = 0;
     for(int i=0; i<niz.length(); i++) {
       // ce je i-ti znak presledek
       if (niz.charAt(i) == ' ') {
         presledki++;
       }
     }
     //System.out.printf("Stevilo besed: %d\n", ++presledki);
     System.out.printf("Stevilo besed: %d\n", presledki+1);
     System.out.printf("Razlika      : %d\n", niz.length() - brez.length()+1);

     System.out.printf("Obrnjen niz: ");
     for(int i=niz.length()-1; i>=0; i=i-1) {
       System.out.print(niz.charAt(i));
     }
     System.out.println();
   }
}
