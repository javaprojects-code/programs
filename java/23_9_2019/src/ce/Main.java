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
		
		auto1.setDalsinasledj�c�(auto2.getNasledujici());
		auto2.setDalsinasledj�c�(auto3.getNasledujici());
		
		System.out.println("cena prvn�ho auta je: " +auto1.getCena()+ " znacka je "+ auto1.getZnacka()+"soused� s autem "+ auto1.getNasledujici().getZnacka()+" dal�� n�sleduj�c� auto je "+ auto1.getDalsinasledj�c�().getZnacka());
		System.out.println("cena druh�ho auta je: " +auto2.getCena()+ " znacka je "+ auto2.getZnacka()+"soused� s autem "+ auto2.getNasledujici().getZnacka()+" dal�� n�sleduj�c� auto je "+ auto2.getDalsinasledj�c�().getZnacka());
		System.out.println("cena tretiho auta je: " +auto3.getCena()+ " znacka je "+ auto3.getZnacka()+"soused� s autem "+ auto3.getNasledujici().getZnacka());
		System.out.println("cena ctvrt�ho auta je: " +auto4.getCena()+ " znacka je "+ auto4.getZnacka());
		auto3.setCena(-1);
		System.out.println("cena prvn�ho auta je: " +auto1.getCena()+ " znacka je "+ auto1.getZnacka());
		System.out.println("cena druh�ho auta je: " +auto2.getCena()+ " znacka je "+ auto2.getZnacka());
	}

}
