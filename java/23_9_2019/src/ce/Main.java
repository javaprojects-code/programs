package ce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.setCena(20000);
		auto2.setCena(80000);
		auto1.setZnacka("skoda");
		auto2.setZnacka("BMW");
		
	//	Auto auto3=auto1;
		//Auto auto4=auto2;
		Auto auto3=new Auto();
		Auto auto4=new Auto();
		auto3.setCena(60000);
		auto3.setZnacka("Ford");
		
		auto4.setCena(800000);
		auto4.setZnacka("fiat");
		
		auto1.setNasledujici(auto2);
		auto2.setNasledujici(auto3);
		auto3.setNasledujici(auto4);
		
		auto1.setDalsinasledjící(auto2.getNasledujici());
		auto2.setDalsinasledjící(auto3.getNasledujici());
		
		System.out.println("cena prvního auta je: " +auto1.getCena()+ " znacka je "+ auto1.getZnacka()+"sousedí s autem "+ auto1.getNasledujici().getZnacka()+" další následující auto je "+ auto1.getDalsinasledjící().getZnacka());
		System.out.println("cena druhého auta je: " +auto2.getCena()+ " znacka je "+ auto2.getZnacka()+"sousedí s autem "+ auto2.getNasledujici().getZnacka()+" další následující auto je "+ auto2.getDalsinasledjící().getZnacka());
		System.out.println("cena tretiho auta je: " +auto3.getCena()+ " znacka je "+ auto3.getZnacka()+"sousedí s autem "+ auto3.getNasledujici().getZnacka());
		System.out.println("cena ctvrtého auta je: " +auto4.getCena()+ " znacka je "+ auto4.getZnacka());
		auto3.setCena(-1);
		System.out.println("cena prvního auta je: " +auto1.getCena()+ " znacka je "+ auto1.getZnacka());
		System.out.println("cena druhého auta je: " +auto2.getCena()+ " znacka je "+ auto2.getZnacka());
	}

}
