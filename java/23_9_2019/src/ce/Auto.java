package ce;

public class Auto {
	private int cena;
	private String znacka;
	
	private Auto nasledujici;
	private Auto dalsinasledj�c�;
	
	// private geter seter,public ne :D
	
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public String getZnacka() {
		return znacka;
	}
	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}
	public Auto getNasledujici() {
		return nasledujici;
	}
	public void setNasledujici(Auto nasledujici) {
		this.nasledujici = nasledujici;
		
	}
	public Auto getDalsinasledj�c�() {
		return dalsinasledj�c�;
	}
	public void setDalsinasledj�c�(Auto dalsinasledj�c�) {
		this.dalsinasledj�c� = dalsinasledj�c�;
	}
	
}
