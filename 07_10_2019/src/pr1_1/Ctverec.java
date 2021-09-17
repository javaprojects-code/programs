package pr1_1;

public class Ctverec extends GrafickyObject{

	private int tlouska;
	
	public int getTlouska() {
		return tlouska;
	}

	public void setTlouska(int tlouska) {
		this.tlouska = tlouska;
	}

	@Override
	public void vykresli() {
		// TODO Auto-generated method stub
		barva ="cervena";
		System.out.println("Velikost strany a je "+ tlouska + " barva ctverce je "+ barva);
	}

}
