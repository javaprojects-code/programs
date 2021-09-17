package feec.vutbr.cz;

public class Osoba {
	private String jmenoMatky;
	private String jmenoOtce;
	private String jmeno;
	
	public Osoba(String jmeno, String jmenoMatky, String jmenoOtce) {
		super();
		this.jmenoMatky = jmenoMatky;
		this.jmenoOtce = jmenoOtce;
		this.jmeno=jmeno;
	}


	@Override
	public String toString() {
		return "Osoba [jmenoMatky=" + jmenoMatky + ", jmenoOtce=" + jmenoOtce + ", jmeno=" + jmeno + "]";
	}


	public static void main(String[] args) {
		Osoba osoba=new Osoba("Jan Novak","","");
		Osoba osoba1=new Osoba("Petra Novakova","","");
		Osoba osoba2=new Osoba("Alena Novakova","Petra Novakova","Jan Novak");

		System.out.println(""+osoba.jmeno+""+osoba.jmenoMatky+""+osoba.jmenoOtce);
		System.out.println(""+osoba1.jmeno+""+osoba1.jmenoMatky+""+osoba1.jmenoOtce);
		System.out.println(""+osoba2.jmeno+", matka: "+""+osoba2.jmenoMatky+", otec: "+""+osoba2.jmenoOtce);
		// TODO Auto-generated method stub
		System.out.println(osoba);
		System.out.println(osoba1);
		System.out.println(osoba2);
		

	}

}
