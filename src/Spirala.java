/**
 *
 * @author tomaz
 */
public class Spirala {
  public static void main(String[] args) {
    StdDraw.setXscale(-100, 100);
    StdDraw.setYscale(-100, 100);
    
    int steviloKorakov = 1000;
    
    double r  = 1;
    double fi = 0;
    
    double lastX=0;
    double lastY=0;
    
    while(steviloKorakov > 0) {
      double x = r * Math.cos(fi);
      double y = r * Math.sin(fi);
      
      //StdDraw.point(x, y);
      StdDraw.line(lastX, lastY, x, y);
      
      lastX = x;
      lastY = y;
      
      r  = r  * 1.01;
      fi = fi + 0.2; 
      
      steviloKorakov--;
    }
  }
}
