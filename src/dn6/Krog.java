package dn6;


class Krog extends Lik {
    private int polmer;
    
    public Krog(int polmer){
        this.polmer = polmer;
    }
    double povrsina(){
        return polmer * Math.PI * polmer;
    }
}
