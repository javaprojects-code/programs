package strom;

public class Spust {

	public static void main(String[] args) {
		Adresar a1=new Adresar();
		Adresar a2= new Adresar();
		Adresar a3= new Adresar();
		Adresar a4= new Adresar();
		Adresar a5 = new Adresar();
		
		a1.setNazev("Adres�� 1");
		a2.setNazev("Adres�� 2");
		a3.setNazev("Adres�� 3");
		a4.setNazev("Adres�� 4");
		a5.setNazev("Adres�� 5");
		
		a1.setLevy(a4);
		a1.setPravy(a2);
		a2.setLevy(a5);
		a2.setPravy(a3);
		
		System.out.println("lev� je " + a1.getLevy().getNazev()+ " prav� je "+ a1.getPravy().getNazev());
		System.out.println("lev� je " + a2.getLevy().getNazev()+ " prav� je "+ a2.getPravy().getNazev());

	}

}
