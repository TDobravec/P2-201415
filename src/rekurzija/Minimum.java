package rekurzija;

/**
 *
 * @author tomaz
 */
public class Minimum {
  
  
  static int minimum(int [] tabela, int z, int k) {
    if (z == k)
      return tabela[z];
    
    int s = (z + k) / 2;
    
    int min1 = minimum(tabela, z, s);
    int min2 = minimum(tabela, s+1, k);
    
    return Math.min(min1, min2);
  }
  
  public static void main(String[] args) {
    int [] tabela = {4,5,7};
    
    int min = minimum(tabela, 0, tabela.length-1);
    System.out.println(min);
  }
}
