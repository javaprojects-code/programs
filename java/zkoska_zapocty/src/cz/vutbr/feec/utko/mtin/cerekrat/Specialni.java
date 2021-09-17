package cz.vutbr.feec.utko.mtin.cerekrat;

public class Specialni extends Vozidlo{
	private TypyVozidel typ;

	public Specialni(String vin, String barva, String nazev, TypyVozidel typ) {
		super(vin, barva, nazev);
		this.typ = typ;
	}

	@Override
	public void vypisInfo() {
		System.out.println(typ + " s cislem: " + vin + " a znackou:"
				+ " " + nazev + " a barvou: " + barva);
		
	}

}
