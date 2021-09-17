package strom;

public class Adresar {
	private String nazev;
	private String data;
	private Adresar pravy;
	private Adresar levy;
	
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
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
}
