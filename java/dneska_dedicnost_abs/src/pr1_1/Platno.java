package pr1_1;

import java.util.Vector;

public class Platno {
	Vector<GrafickyObject> platno= new Vector<>();
	
	private int sirka;
	private int delka;
	
	public int getSirka() {
		return sirka;
	}

	public void setSirka(int sirka) {
		this.sirka = sirka;
	}

	public int getDelka() {
		return delka;
	}

	public void setDelka(int delka) {
		this.delka = delka;
	}

	public void pridejObj(GrafickyObject e) {
		platno.add(e);
	}
	
	public void vykreslivsechny() {
		System.out.println("vykresluji vsechno");
	for (GrafickyObject obj:platno) {
		obj.vykresli();
	}
	}
}
