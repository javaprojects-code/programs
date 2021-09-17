package pr5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresar a1=new Adresar();
		Adresar a2= new Adresar();
		Adresar a3= new Adresar();
		Adresar a4= new Adresar();
		Adresar a5 = new Adresar();
		
		a1.setNazev("adresar1");
		a2.setNazev("adresar2");
		a3.setNazev("adresar3");
		a4.setNazev("adresar4");
		a5.setNazev("adresar5");
		
		a1.setLevy(a4);
		a1.setPravy(a2);
		a2.setLevy(a5);
		a2.setPravy(a3);
		
		System.out.println("levy je " + a1.getLevy().getNazev()+ " pravy je "+ a1.getPravy().getNazev());
		System.out.println("levy je " + a2.getLevy().getNazev()+ " pravy je "+ a2.getPravy().getNazev());		
	}

}
