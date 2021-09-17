package streamovani;

public class Prehravac {
	private Paket prvni;

	public void pridej(String hodnota) {
	Paket novy= new Paket(hodnota);
	novy.setDalsi(prvni);
	prvni=novy;	
	}

	public void vypisVse() {
		Paket tmp = prvni;
		while (tmp != null){
		System.out.println(tmp.getData());
		tmp = tmp.getDalsi();
	}
		
	}

}
