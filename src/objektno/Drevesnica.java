package objektno;


/**
 * author: Alenka
 */
public class Drevesnica {

	public static void main(String[] args) {
		Drevo d1 = new Drevo();
		d1.ime = "smreka";
		d1.nastaviStarost(-30);
		d1.visina = 52.5;
		
		Drevo d2 = new Drevo("jablana");
		//d2.izpis();
		d2.ime = "jablana nova";
		d2.nastaviStarost(0);
		d2.visina = 1.6;
		d2.izpis();
		double pr;
		pr = d2.povprecnaRast();
		System.out.printf("Povprecna rast je: %.2f, starost je %d\n", pr, d2.vrniStarost());
		d2.spremeniIme("ponovno jablana");
		//d2.izpis();
		Drevo d3 = new Drevo("hruska", 1, 1);
		System.out.printf("Povprecna rast je: %.2f\n", d3.povprecnaRast());
		//d1.izpis();
		//d2.izpis();
		//d3.izpis();
		
		d1.pomlad();
		d1.pomlad();
		d2.pomlad();
		d2.pomlad();
		d3.pomlad();
		d3.pomlad();
		//d1.izris();
		//d2.izris();
		//d3.izris();
		//d1.ID = 5;
		System.out.println(d1.toString());
		//d2.ID = 200;
		d1.izpis();
		d2.izpis();
		d3.izpis();
		System.out.println("ID je " + Drevo.ID);
		d3.izpisiNavodilaZaObrezovanje();
	}
}