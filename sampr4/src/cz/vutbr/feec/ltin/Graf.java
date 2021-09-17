package cz.vutbr.feec.ltin;

import java.util.HashMap;
import java.util.HashSet;

public class Graf {
	private HashMap<Integer, Vrchol> vrcholy=new HashMap<>();
	private HashSet<Hrana> hrany= new HashSet<>();
	
	public void pridejHranu(int v1, int v2, int cena) {
		Vrchol o1 = vytvorNeboVezmiExistujiciVrchol(v1);
		Vrchol o2 = vytvorNeboVezmiExistujiciVrchol(v2);
		
		Hrana h = new Hrana(o1, o2, cena);
		hrany.add(h);
	}

	private Vrchol vytvorNeboVezmiExistujiciVrchol(int cisloVrcholu) {
		Vrchol v = vrcholy.get(cisloVrcholu);
		if(v==null) {
			v = vrcholy.put(cisloVrcholu, new Vrchol(cisloVrcholu));
		}
		return v;
	}

	public HashSet<Hrana> getHrany() {
		return hrany;
	}

}
