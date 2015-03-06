package osnove;

import java.util.Scanner;

public class Branje {

  public static void main(String [] args) {
    String ime;

    Scanner tipkovnica = new Scanner(System.in);

    System.out.print("Vpisi ime: ");

    // program prebere ime
    ime = tipkovnica.nextLine();

    System.out.printf("Pozdravljen, %s\n", ime);
  }

}
