/**
 *
 * @author tomaz
 */
public class Risba {

  public static void main(String args[]) {
    StdDraw.setXscale(-100, 100);
    StdDraw.setYscale(-100, 100);
    StdDraw.circle(0, 0, 100);
    for (int i = 0; i < 100; i=i+10) {
      StdDraw.rectangle(0, 0, i, i);
    }
  }
  
}
