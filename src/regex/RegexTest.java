package regex;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
[...]  ... katerikoli znak, ki je v oklepajih
[^...] ... katerikoli znak, ki ni v oklepajih
.      ... katerikoli znak

\d     ... števka
\D     ... ne števka
\w     ... črka
\W     ... ne črka

\.     ... znak pika

^      ... začetek vrstice
$      ... konec   vrstice


+     .... ena ali več ponovitev prejšnjega znaka
*     .... nič ali več ponovitev prejšnjega znaka
?     .... nič ali ena ponovitev prejšnjega znaka
{m,n} .... najmanj m in največ n ponovitev prejšnjega znaka

() ... skupina (group)

*/

/**
 *
 * @author tomaz
 */
public class RegexTest {

  public static void main(String[] args) throws Exception {
    Pattern vzorec = Pattern.compile("(\\d{1,2}\\.\\d{1,2}\\.\\d{4,4})");
    Scanner sc = new Scanner(new File("../viri/RegexPrimer.txt"));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      Matcher m = vzorec.matcher(vrstica);
      if (m.find()) {
        System.out.println(m.group(0));
      }
    }
    sc.close();
  }
  
}
