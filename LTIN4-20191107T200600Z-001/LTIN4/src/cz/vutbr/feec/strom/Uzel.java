package cz.vutbr.feec.strom;

public class Uzel {
	private int data;
	private Uzel pravy;
	private Uzel levy;
	
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

	public Uzel getPravy() {
		return pravy;
	}

	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}

	public Uzel getLevy() {
		return levy;
	}

	public void setLevy(Uzel levy) {
		this.levy = levy;
	}
	
	

}
