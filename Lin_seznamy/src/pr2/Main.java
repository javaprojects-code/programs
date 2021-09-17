package pr2;

public class Main {
	public static void main(String[] args) {
	LinearniSeznam s= new LinearniSeznam();
	
	boolean jePrazdny=s.jePrazdny();
	System.out.println(s.jePrazdny());
	 s.pridejNaZacatek(10);
	 s.pridejNaZacatek(5);
	 System.out.println(s.jePrazdny());
	 
	// s.odstranZeZacatku();
	 
	 //System.out.println(s.jePrazdny());
	
	}
}
