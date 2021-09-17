package pr1;
import java.util.Vector;
public class Adresar {
	private String nasevAdr;
	public Adresar(String nasevAdr) {
		super();
		this.nasevAdr = nasevAdr;
	}

	private Vector<Adresar> adresare = new Vector<>();
	
	
	
	public String getNasevAdr() {
		return nasevAdr;
	}
	


	public Adresar getSoused(int pocet) {

		return adresare.get(pocet);
		
	}


	public void add(Adresar adresar){
		adresare.add(adresar);
		
	}
	
	
	public void print(){
		for(Adresar adr:adresare){
			System.out.println("adresar " +adr.getNasevAdr());
		}
		
	}
	
}
