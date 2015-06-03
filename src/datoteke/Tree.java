package datoteke;

import java.io.File;

/**
 *
 * @author tomaz
 */
public class Tree {
  
  static void tree(String path, String odmik) {
    File f1 = new File(path);
    String [] vsebina = f1.list();
    for (String file : vsebina) {
      System.out.println(odmik + file);
      File f2 = new File(path + File.separator + file);
      if (f2.isDirectory()) {
        tree(path + File.separator + file, odmik+"  ");
      }
    }
  }
  
  public static void main(String[] args) {
    String path = "/Users/Tomaz/Dropbox/FRI/Pedagosko/P2/L201415/programi/Predavanja";
    
    tree(path, "");
  }
}
