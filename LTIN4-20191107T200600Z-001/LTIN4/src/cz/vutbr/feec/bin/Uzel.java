package cz.vutbr.feec.bin;

public class Uzel {
	private int data;
	private Uzel dalsi;
	
	public Uzel(int hodnota) {
		super();
		this.data=hodnota;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Uzel getDalsi() {
		return dalsi;
	}
	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}
	
}
