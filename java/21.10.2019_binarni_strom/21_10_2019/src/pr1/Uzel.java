package pr1;

public class Uzel {
	private int data;
	
	private Uzel pravy;
	private Uzel levy;
	private Uzel koren;
	
	public Uzel(int data, Uzel koren){
		this.koren=koren;
		this.data= data	;
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

	public Uzel getKoren() {
		return koren;
	}

	public void setKoren(Uzel koren) {
		this.koren = koren;
	}
	
	
}
