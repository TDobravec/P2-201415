public class Skupina {

    
    
    public static void main(String args[]) {
        
        // ustvarim tabelo int-ov velikosti 5
        int tabela[] = new int[5];
        tabela[0]=4;
        tabela[1]=2;
        // napaka
        // tabela[5]=6;
        
        // tabela studentov velosti 5
        Student tabS[] = new Student[5];
        
        tabS[0] = new Student();
        tabS[0].ime="Miha";
        tabS[0].vpisna="63141234";
        
        tabS[1]=new Student();
        tabS[1].ime="Micka";
        tabS[1].vpisna="63149876";
        
        tabS[2] = new Student();
        tabS[2].ime="Peter";
        tabS[2].vpisna="63123456";
       
    }
    
}