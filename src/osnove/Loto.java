package osnove;

import java.util.Random;

public class Loto {
   // Program izpiše 7 števil med 1 in 39
   public static void main(String [] args) {
     Random rnd = new Random();

     for(int i=1; i<=7; i++) {
       int x = rnd.nextInt(39);  // [0..39)
       x = x+1;                  // [1..39]

       System.out.print(x+ " ");
     }
     System.out.println();
   }
}
