package dn6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;


/**
 *
 * @author 63130014, popravil td
 */
public class DN6 {
    public static Lik[] Liki = new Lik[100];
    public static int mesto;
    
    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.ENGLISH);
      
        preberi(args[0]);
        izracunaj();
    }
    
    public static void preberi(String datoteka) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(datoteka));  // Scanner
        String[] zacana = null;
        String izpis = "";
        
        
        while(br.ready()){
            izpis = br.readLine();
            zacana = izpis.split(":");
            
            int p1 = Integer.parseInt(zacana[1]);
            int p2=0;
            if (zacana.length > 2)
              p2 = Integer.parseInt(zacana[2]);
            
            switch (zacana[0]) {
              case "kvadrat":
                Liki[mesto++] = new Kvadrat(p1);
                break;
              case "krog":
                Liki[mesto++] = new Krog(p1);
                break;
              case "provokotnik":
                Liki[mesto++] = new Pravokotnik(p1, p2);
                break;
            }
        }
        
        br.close();
    }
    
    public static void izracunaj(){
        double skupna = 0;
        String izpis ;
        for(int i = 0;i < mesto; i++ ){
            skupna = skupna + Liki[i].povrsina();
        }
        System.out.printf("Skupna povrsina: %.2f", skupna);
    }
}