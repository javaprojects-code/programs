package cz.vutbr.feec.bin;

public class MujSeznam {
	private Uzel prvni;

	public void pridej(int hodnota) {
	Uzel novy= new Uzel(hodnota);
	novy.setDalsi(prvni);
	prvni=novy;
	
		
	}

	public void vypisVse() {
		Uzel tmp = prvni;
		while (tmp != null){
		System.out.println(tmp.getData());
		tmp = tmp.getDalsi();
	}
		
	}

}
