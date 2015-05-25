package dn10_v9;

import java.util.*;

class Letalisce implements Comparable<Letalisce> {
    private String koda;
    private String mesto;
    private String drzava;
    private TreeSet<Letalisce> prihodi;
    private TreeSet<Letalisce> odhodi;
    
    
    Letalisce(String koda, String mesto, String drzava) {
        this.koda = koda;
        this.mesto = mesto;
        this.drzava = drzava;
        this.prihodi = new TreeSet();
        this.odhodi = new TreeSet();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s: %s, %s", this.koda, this.mesto, this.drzava));
        sb.append("\n     prihodi iz:");
        for(Letalisce l: prihodi)
            sb.append(" "+l.getKoda());
        sb.append("\n     odhodi v:");
        for(Letalisce l: odhodi)
            sb.append(" "+l.getKoda());
        sb.append("\n");
        return sb.toString();
    }
    
    public int compareTo(Letalisce l) {
        return this.koda.compareTo(l.koda);
    }
    
    public String getKoda() {
        return this.koda;
    }
    
    public TreeSet<Letalisce> getPrihodi() {
        return this.prihodi;
    }
    
    public TreeSet<Letalisce> getOdhodi() {
        return this.odhodi;
    }
    
    public TreeSet<Letalisce> dosegljivo(int p) {
        TreeSet<Letalisce> vsaLetalisca = new TreeSet<Letalisce>();
        vsaLetalisca.add(this);
        for (int i=0; i<p; i++) {
            TreeSet<Letalisce> dosegljiva = new TreeSet<Letalisce>();
            for(Letalisce l: vsaLetalisca)
                dosegljiva.addAll(l.odhodi);
            vsaLetalisca.addAll(dosegljiva);
        }
        return vsaLetalisca;
    }
    
    
}

