package osnove;

import java.util.*;
import java.io.File;

public class Tecaj {

  public static void main(String [] args) throws Exception {
    Scanner file = new Scanner(new File("../viri/CHF2015.xml"));

    file.useDelimiter("<|/>");

    while (file.hasNext()) {
      String beseda = file.next();
      if (beseda.contains("time"))  {
        System.out.print(beseda);
      } else if (beseda.contains("CHF"))  {
        System.out.println(beseda);
      }
    }

    file.close();
  }
}
