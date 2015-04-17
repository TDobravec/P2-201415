package dn6;


class Kvadrat extends Lik {
    private int stranica;
    
    public Kvadrat(int stranica){
        this.stranica = stranica;
    }
    double povrsina(){
        return stranica * stranica;
    }
}
