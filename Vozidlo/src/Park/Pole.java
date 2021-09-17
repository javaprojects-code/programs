package Park;

public class Pole {
	public static void main(String[] args) {
		int Pole[];
		Pole=new int[10];
		for (int i = 0; i < Pole.length; i++) {
			Pole[i]=i*10;
		}
		for (int i = 0; i < Pole.length; i++) {
			System.out.print(" "+Pole[i]);
		}
	}


}
