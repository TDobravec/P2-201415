package izjeme;

/**
 *
 * @author tomaz
 */
public class IzjemaDeliZNic extends RuntimeException {

  @Override
  public String getMessage() {
    return "Deljenje z nic ni dovoljeno";
  }
  
}
