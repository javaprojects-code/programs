package cz.vutbr.feec.utko.mtin.cerekrat;

public class Osobak extends Vozidlo {

	public Osobak(String vin, String barva, String nazev) {
		super(vin, barva, nazev);
	}

	@Override
	public void vypisInfo() {
		System.out.println("Osobak s cislem: " + vin + " a znackou:"
							+ " " + nazev + " a barvou: " + barva);
	}

}
