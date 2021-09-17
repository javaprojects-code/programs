package pr1;

public class OsobniAutomobil  extends DobravniProstredek {

	@Override
	public void zastav() {
		
		for (int i = maxRychlost; i >0; i--) {
			System.out.println("Nyní jedu rychlostí "+ maxRychlost);
			maxRychlost--;
		}
	}

	@Override
	public void rozjedSe() {
		
		for (int i = 0; i >5; i++) {
			System.out.println("Nyní jedu rychlostí "+ i);
			i++;
		}
		System.out.println("Rozjíždím se a akceleruji o 10m/s");
	}
	

}
