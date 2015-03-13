package osnove;

public class Racunalo {

  // Program v argumentih dobi dve stevili in ju sesteje
  public static void main(String [] args) {
    // == ... je enako
    // != ... razlicno
    if (args.length != 2) {
      System.out.println("Napacno stevilko argumentov!");
      System.exit(0);
    }

    // pretvori args[0] iz String -> int
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.printf("%d + %d = %d\n", a, b, a+b);
  }
}
