package cz.vutbr.feec.utko.mtin.cerekrat;

public class Main {

	public static void main(String[] args) {
		Registr reg = new Registr();
		reg.pridejVozidlo("s12d", "Skoda", "Cervea", TypyVozidel.OSOBAK);
		reg.pridejVozidlo("s12da", "Volvo", "Cerna", TypyVozidel.NAKLADAK);
		
		reg.pripojPrives("s12d", "s12daaaa");
		
		reg.vypisVsechnaVozidla();

	}

}
