package osnove;

// Program večkrat izpiše besedilo
public class ZankaFormat {

  public static void main(String [] args) {
    String besedilo = "Java je zakon!";

    // v zanki bo sel i od 0 do 4, poveceval se bo za 1
    for(int i=1; i<=5; i=i+1) {
      // System.out.println(i + ". " + besedilo);
      // prvi parameter za printf je format
      // drugi (in ostali) pa so spremenljivke
      System.out.printf("%d. %s %s\n", i, besedilo, "!!!");
    }
  }

}
