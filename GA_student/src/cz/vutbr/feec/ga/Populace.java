package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.Vector;

public class Populace implements Iterable<Chromozome>{
private Vector<Chromozome> chromozomy = new Vector<>();
private TreeMap<Integer, Chromozome> ohodnoceneChromozomy= new TreeMap<>(Collections.reverseOrder());
private TreeMap<Double, Chromozome> pravdepodobnostChromozomy= new TreeMap<>();


public Populace(int j) {
	for (int i = 0; i < j; i++) {
		Chromozome ch = new Chromozome();
		ch.mutateAll();
		pridejChromozom(ch);		
	}
}

public void pridejChromozom(Chromozome ch) {
	chromozomy.add(ch);
}

@Override
public Iterator<Chromozome> iterator() {
	// TODO Auto-generated method stub
	return chromozomy.iterator();
}

public Chromozome getRandom() {
	Random rnd = new Random();
	return chromozomy.get(rnd.nextInt(chromozomy.size()));
}

public void Selection(Populace p) throws IOException{
	Fitness eval = new Fitness("image/orloj.jpg");
	//ohodnoceni chromozomu od nejvetsi chyby(nejhorsi) po nejmensi chybu(nejlepsi)
	for (int i = 0; i < chromozomy.size(); i++) {
		int s = eval.getFitness(p.getChromozomy().get(i));
		ohodnoceneChromozomy.put(s, p.getChromozomy().get(i));
	}
	//vlozeni hodnoty N od nejhorsiho 1 po nejlepsiho n
			for (int j = 0; j < ohodnoceneChromozomy.size(); j++) {
				ohodnoceneChromozomy.put(j+1, (Chromozome)ohodnoceneChromozomy.values());
			}
	//aplikovani vzorce a vypocet pravdepodobnosti
for (int j = 0; j < ohodnoceneChromozomy.size(); j++) {
   //	 double c =( ( (2-1.5) / ohodnoceneChromozomy.get())+(2*ohodnoceneChromozomy().key(i))*(1.5-1));
    	 //for
    	// pravdepodobnostChromozomy.put(c, (Chromozome)ohodnoceneChromozomy.values());
    	 
   // }

//	int N=p.ohodnoceneChromozomy.get(Key);
//	 double c =( ( (2-1.5) / ohodnoceneChromozomy.get(i+1))+(2*ohodnoceneChromozomy().key(i))*(1.5-1));
// pravdepodobnostChromozomy.put(c, (Chromozome)ohodnoceneChromozomy.values());
}

}

public Vector<Chromozome> getChromozomy() {
	return chromozomy;
}
}
