package pr5;

public class Adresar {
	private String nazev;
	private Adresar pravy;
	private Adresar levy;
	
	public Adresar getPravy() {
		return pravy;
	}
	public void setPravy(Adresar pravy) {
		this.pravy = pravy;
	}
	public Adresar getLevy() {
		return levy;
	}
	public void setLevy(Adresar levy) {
		this.levy = levy;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

}
