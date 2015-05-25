package dn10_v9;

import java.io.File;

public class Adria {

    public static void main(String[] args) throws Exception {
        if (args.length<4){
            System.out.println("java Adria letalisca.txt poleti.txt DUB 2");
            return;
        }
        
        MrezaLetov mrezaAdria = new MrezaLetov();
        mrezaAdria.preberiLetalisca(new File(args[0]));
        mrezaAdria.preberiPovezave(new File(args[1]));
        mrezaAdria.izpisi();

        MrezaLetov mrezaLH = new MrezaLetov();
        mrezaLH.preberiLetalisca(new File(args[0]));
        mrezaLH.preberiPovezave(new File(args[1]));
        mrezaLH.izpisi();
        
    }
}