package cz.vutbr.feec.utko.mtin.cerekrat;

public class Nakladak extends Vozidlo{
	private Prives prives = null;

	public Nakladak(String vin, String barva, String nazev) {
		super(vin, barva, nazev);
	}

	@Override
	public void vypisInfo() {
		if(prives==null){
			System.out.println("Nakladak s cislem: " + vin + " a znackou:"
					+ " " + nazev + " a barvou: " + barva);
		}
		else{
			System.out.println("Nakladak s cislem: " + vin + " a znackou:"
					+ " " + nazev + " a barvou: " + barva + 
					" a pripojenym privesem s cislem:" + prives.vin);
		}
	}
	
	public void pripojPrives(String vinPrivesu){
		prives = new Prives(vinPrivesu);
	}
	
	private class Prives{
		private String vin;

		public Prives(String vin) {
			super();
			this.vin = vin;
		}
		
	}
	
}
