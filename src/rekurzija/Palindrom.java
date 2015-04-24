package rekurzija;

/**
 *
 * @author tomaz
 */
public class Palindrom {

  public static boolean jePalindrom(String niz) {
    if (niz.length() < 2)
      return true;
    
    boolean je = niz.charAt(0) == niz.charAt(niz.length()-1);
    je = je && (jePalindrom(niz.substring(1, niz.length()-1)));
    
    return je;
  }
  
  public static void main(String[] args) {
    String niz = "pericarezeracirep";
    
    
    if (jePalindrom(niz))
      System.out.printf("Niz %s JE palindrom.\n", niz);
    else
      System.out.printf("Niz %s NI palindrom.\n", niz);
  }
  
}
