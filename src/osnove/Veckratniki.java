package osnove;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;

public class Veckratniki {
  public static void main(String [] args) throws Exception {
    int a, b, n;

    Scanner sc = new Scanner(System.in);

    System.out.print("Vpisi n: ");
    n = sc.nextInt();
    System.out.print("Vpisi a: ");
    a = sc.nextInt();
    System.out.print("Vpisi b: ");
    b = sc.nextInt();

    PrintWriter izhod = new PrintWriter("veckratniki.txt");

    for (int i=a; i<=b; i++) {
      izhod.printf("%2d * %2d = %2d\n", i, n, i*n);
    }

    izhod.close();
  }
}
