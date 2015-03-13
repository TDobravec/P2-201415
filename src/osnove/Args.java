package osnove;

public class Args {

   public static void main(String [] args) {
     System.out.printf("Stevilo argumentov: %d\n", args.length);

     for (int i=0; i<args.length; i = i+1) {
       System.out.printf("Argument %d: %s\n", i+1, args[i]);
     }
   }
}
