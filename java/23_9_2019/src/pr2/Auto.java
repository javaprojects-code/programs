package pr2;

public class Auto {
	private int cena;
	private String znacka;
	
	private Auto nasledujici;
	private Auto dalsinasledjící;
	
	private int poziceX;
	private int poziceY;
	
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
	public Auto getDalsinasledjící() {
		return dalsinasledjící;
	}
	public void setDalsinasledjící(Auto dalsinasledjící) {
		this.dalsinasledjící = dalsinasledjící;
	}
	public int getPoziceX() {
		return poziceX;
	}
	public void setPoziceX(int poziceX) {
		this.poziceX = poziceX;
	}
	public int getPoziceY() {
		return poziceY;
	}
	public void setPoziceY(int poziceY) {
		this.poziceY = poziceY;
	}
	
}

