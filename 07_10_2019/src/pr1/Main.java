package pr1;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DobravniProstredek osobak1= new OsobniAutomobil();
		DobravniProstredek osobak2= new OsobniAutomobil();
		DobravniProstredek horskekolo= new HorskeKolo();
		
		Vector<DobravniProstredek> dopravniProstredky= new Vector<>();
		dopravniProstredky.add(osobak2);
		dopravniProstredky.add(osobak1);
		dopravniProstredky.add(horskekolo);
		
		for(DobravniProstredek dopravniProstredek:dopravniProstredky) {
			dopravniProstredek.zastav();
		}
	}

}
