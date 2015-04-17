

/**
 *
 * @author tomaz
 */
public class Krog extends Lik {
  double r;
 
  Krog(double x, double y, double r) {
    super(x,y);
    this.r=r;
  }
  
  void narisi() {
    StdDraw.circle(getX(), getY(), r);
  }
}
