package osnove;

// Program večkrat izpiše besedilo
public class Zanka {

  public static void main(String [] args) {
    String besedilo = "Java je zakon!";

    // v zanki bo sel i od 0 do 4, poveceval se bo za 1
    for(int i=0; i<5; i=i+1) {
      System.out.println(besedilo);
    }
  }

}
