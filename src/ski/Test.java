package ski;

public class Test {

  public static void main(String args[]) throws Exception {
    Smucar s1 = new Smucar("X 31 565268 DREV Ana SLO 1:00.76 1:01.93 24.60");
    System.out.println(s1.toString());

    Tekma t1 = new Tekma();
    t1.preberiTekmovalce("../viri/vs2.txt");
    t1.izpisiTekmovalce();

    t1.izpisiPoVrsti();
  }
}
