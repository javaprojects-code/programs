package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole g) {
		
		// TIP: Vyzkousejte s ruznyma strukturama
		
		//TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		
	
			LinkedList<HraciPole> open = new LinkedList<HraciPole>(); //nenav�t�ven� polozky
			HashSet<HraciPole> closed = new HashSet<HraciPole>();// nav�t�ven� polozky
			//LinkedList<HraciPole> closed = new LinkedList<HraciPole>(); //nenav�t�ven� polozky
	//cyklus, podminka
			
			open.addFirst(g);
			while(!open.isEmpty()){
				HraciPole tmp=open.removeLast();
				if(tmp.jeReseni()){
					System.out.println("Reseni nalezeno "+tmp );
					
					return;
					
			}
				for(int i=1;i<=4;i++){
					HraciPole nova= tmp.klonujAPohni(i);
					if(nova!=null && !closed.contains(nova)){
						open.addFirst(nova);
						closed.add(nova);
					}
				}
			
			}
			System.out.println("resen� neexistuje");
	
	}
}
