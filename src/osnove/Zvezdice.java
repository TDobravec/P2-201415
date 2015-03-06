package osnove;

public class Zvezdice {

  static void trikotnik(int n) {
    for(int i = 1; i<=n; i=i+1) {
      for(int j=1; j<=n; j=j+1) {
        if (j <= n - i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }

  public static void main(String [] args) {
    int n;

    // preberem n...
    java.util.Scanner sc = new java.util.Scanner(System.in);
    n = sc.nextInt();

    //... in izrisem trikotnik velikosti n
    trikotnik(n);
  }

}
