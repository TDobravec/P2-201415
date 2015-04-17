

/**
 *
 * @author tomaz
 */
public class Kvadrat extends Lik {
  double a;
 
  Kvadrat(double x, double y, double a) {
    super(x,y);
    this.a=a;
  }
  
  void narisi() {
    StdDraw.rectangle(getX(), getY(), a/2, a/2);
  }
}
