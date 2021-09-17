package strom;

public class Spust {

	public static void main(String[] args) {
		Adresar a1=new Adresar();
		Adresar a2= new Adresar();
		Adresar a3= new Adresar();
		Adresar a4= new Adresar();
		Adresar a5 = new Adresar();
		
		a1.setNazev("Adresáø 1");
		a2.setNazev("Adresáø 2");
		a3.setNazev("Adresáø 3");
		a4.setNazev("Adresáø 4");
		a5.setNazev("Adresáø 5");
		
		a1.setLevy(a4);
		a1.setPravy(a2);
		a2.setLevy(a5);
		a2.setPravy(a3);
		
		System.out.println("levı je " + a1.getLevy().getNazev()+ " pravı je "+ a1.getPravy().getNazev());
		System.out.println("levı je " + a2.getLevy().getNazev()+ " pravı je "+ a2.getPravy().getNazev());

	}

}
