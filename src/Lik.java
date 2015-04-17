

/**
 *
 * @author tomaz
 */
abstract public class Lik {
  private double x;
  private double y;
  
  Lik(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
  
  
  void move(double dx, double dy) {
    if (x + dx > 0 && x + dx < Risar.SIRINA)
      x += dx;
    
    if (y + dy > 0 && y + dy < Risar.VISINA)
      y += dy;
  }
  
  abstract void narisi();
}
