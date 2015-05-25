package dn10_v9;

import java.util.*;
import java.io.File;


class MrezaLetov {
    private  TreeMap<String, Letalisce> destinacije;
    
    MrezaLetov() {
        this.destinacije = new TreeMap<String, Letalisce>();
    }
    
    public void dodajDestinacijo(Letalisce destinacija) {
        destinacije.put(destinacija.getKoda(), destinacija);
    }
    
    public TreeMap<String, Letalisce> getDestinacije() {
        return destinacije;
    }
    
    public  void preberiLetalisca(File f) throws Exception {
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
                String[] razbij = sc.nextLine().split(" ");
                if( (razbij.length == 3) && (!destinacije.containsKey(razbij[0])))
                  destinacije.put(razbij[0], new Letalisce(razbij[0], razbij[1], razbij[2]));
        }
        sc.close();
    }
    
    public  void izpisi() {
        Iterator<String> keySetIterator = destinacije.keySet().iterator();

        while(keySetIterator.hasNext()){
            String koda = keySetIterator.next();
            System.out.println(destinacije.get(koda));
        }
    }
    
    public  void preberiPovezave(File f) throws Exception {
        Letalisce l1, l2;
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
                String[] razbij = sc.nextLine().split(" ");
                if (razbij.length != 2)
                    continue;
                l1 = destinacije.get(razbij[0]);
                l2 = destinacije.get(razbij[1]);
                if(l1 != null && l2 != null) {
                    l1.getOdhodi().add(l2);
                    l2.getOdhodi().add(l1);
                    l1.getPrihodi().add(l2);
                    l2.getPrihodi().add(l1);
                }
        }
        sc.close();
    }
}