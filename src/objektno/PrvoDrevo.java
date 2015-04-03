package objektno;


/**
 * author: Alenka
 */
public class PrvoDrevo {
	static int ID = 0;
	String ime = "drevo";
	private int starost = 0;
	double visina = 0;
	int zapSt = 0;
	
	
	Drevo() {
		ID++;
		zapSt = ID;
	}
	
	public Drevo(String ime) {
		this();
		this.ime = ime;
	}
	
	public Drevo(String i, int s, double v) {
		this(i);
		starost = s;
		visina = v;
	}
	
	public String toString() {
		return String.format("Drevo %s, staro %d let je veliko %.1f m, zap. stevilka: %d\n", this.ime, starost, visina, zapSt);
	}
	
	void izpis() {
		System.out.printf("Drevo %s, staro %d let je veliko %.1f m, zap. stevilka: %d\n", this.ime, starost, visina, zapSt);
	}
	
	void pomlad() {
		starost = starost + 1;
		if(starost <= 3) {
			visina = visina + 1;
		}
		else {
			visina = visina + 0.2;
		}
	}
	
	void izris() {
		System.out.printf(this.toString());
		int v = (int)Math.round(visina);
		for(int i=0; i<v; i++) {
			if(i < v/2) {
				System.out.println("*****");
			}
			else {
				System.out.println("  *");
			}
		}
	}
	
	void spremeniIme(String ime) {
		this.ime = ime;
	}
	
	double povprecnaRast() {
		if(starost == 0) {
			return 0;
		}
		return visina/starost;
	}
	
	static void izpisiNavodilaZaObrezovanje() {
		System.out.println("Drevo se obrezuje ...");
	} 
	
	public void nastaviStarost(int st) {
		if(st > 0)
			starost = st;
	}
	
	public int vrniStarost() {
		return starost;
	}
	
}



