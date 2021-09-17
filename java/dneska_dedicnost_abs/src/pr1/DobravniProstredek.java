package pr1;

public abstract class DobravniProstredek {
	protected int pocetKol;
	protected String vyrobce;
	protected int maxRychlost;
	
	public int getPocetKol() {
		return pocetKol;
	}
	public void setPocetKol(int pocetKol) {
		this.pocetKol = pocetKol;
	}
	public String getVyrobce() {
		return vyrobce;
	}
	public void setVyrobce(String vyrobce) {
		this.vyrobce = vyrobce;
	}
	public int getMaxRychlost() {
		return maxRychlost;
	}
	public void setMaxRychlost(int maxRychlost) {
		this.maxRychlost = maxRychlost;
	}
	
	
	public abstract void zastav();
	public abstract void rozjedSe();
	
	public void vypisDopravnProstredek(){
		System.out.println("Prostredek spoctem kol " + pocetKol + " od vyrobce "+ vyrobce +" jede maximalní rychlostí "+ maxRychlost);
	}
}
