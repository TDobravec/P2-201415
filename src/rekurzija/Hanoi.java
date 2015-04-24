package rekurzija;

/**
 *
 * @author tomaz
 */
public class Hanoi {

  static void doHanoi(int n, char a, char b, char c) {
    if (n == 0) return ;
    
    doHanoi(n-1, a, c, b);
    System.out.printf("Iz %c na %c\n", a, c);
    doHanoi(n-1, b, a, c);
  }
  
  public static void main(String[] args) {
    doHanoi(3, 'a', 'b', 'c');
  }
}

