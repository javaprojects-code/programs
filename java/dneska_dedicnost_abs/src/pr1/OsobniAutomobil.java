package pr1;

public class OsobniAutomobil  extends DobravniProstredek {

	@Override
	public void zastav() {
		
		for (int i = maxRychlost; i >0; i--) {
			System.out.println("Nyn� jedu rychlost� "+ maxRychlost);
			maxRychlost--;
		}
	}

	@Override
	public void rozjedSe() {
		
		for (int i = 0; i >5; i++) {
			System.out.println("Nyn� jedu rychlost� "+ i);
			i++;
		}
		System.out.println("Rozj�d�m se a akceleruji o 10m/s");
	}
	

}
