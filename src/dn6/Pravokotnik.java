package dn6;

class Pravokotnik extends Lik {
    private int a;
    private int b;
    
    public Pravokotnik(int a, int b){
        this.a = a;
        this.b = b;
    }
    double povrsina(){
        return a*b;
    }
}
