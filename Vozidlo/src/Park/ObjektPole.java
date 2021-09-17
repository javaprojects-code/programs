package Park;

public class ObjektPole {
	public static void main(String[] args) {
		Integer Pole[];
		Pole=new Integer[10];
		for (int i = 0; i < Pole.length; i++) {
		Pole[i]=i*10;
		}
		for (int i = 0; i < Pole.length; i++) {
			System.out.print(" "+Pole[i]);
		}
	}

}
