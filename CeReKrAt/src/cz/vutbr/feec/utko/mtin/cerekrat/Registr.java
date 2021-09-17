package cz.vutbr.feec.utko.mtin.cerekrat;

import java.util.HashMap;

public class Registr {
	private HashMap<String, Vozidlo> registrVozidel = new HashMap<>();
	
	public void pridejVozidlo(String vin, String nazev, String barva, TypyVozidel typ){
		switch (typ) {
		case OSOBAK:
			registrVozidel.put(vin, new Osobak(vin, barva, nazev));
			break;
		case NAKLADAK:
			registrVozidel.put(vin, new Nakladak(vin, barva, nazev));
			break;	
		default:
			registrVozidel.put(vin, new Specialni(vin, barva, nazev, typ));
			break;
		}
	}
	
	public void pripojPrives(String vinNakladaku, String vinPrivesu){
		Vozidlo vozidlo = registrVozidel.get(vinNakladaku);
		
		if(vozidlo instanceof Nakladak){
			((Nakladak) vozidlo).pripojPrives(vinPrivesu);
			System.out.println("Prives pripojen");
		}
		else{
			System.out.println("Nelze prives pripojit");
		}
	}
	
	public void vypisVsechnaVozidla(){
		for(Vozidlo aktVozidlo : registrVozidel.values()){
			aktVozidlo.vypisInfo();
		}
	}
}
