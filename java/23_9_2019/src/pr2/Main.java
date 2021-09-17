package pr2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapa m1=new Mapa();
		Auto a1=new Auto();
				
		a1.setZnacka("Ford");
		a1.setPoziceX(50);
		a1.setPoziceY(25);

		m1.setAuto1(a1);
		System.out.println(m1.getAuto1().getZnacka());
	}

}
