package cz.vutbr.feec.utko.mtin.cerekrat;

public abstract class Vozidlo {
	protected String vin;
	protected String barva;
	protected String nazev;

	public Vozidlo(String vin, String barva, String nazev) {
		super();
		this.vin = vin;
		this.barva = barva;
		this.nazev = nazev;
	}

	public abstract void vypisInfo();
}
