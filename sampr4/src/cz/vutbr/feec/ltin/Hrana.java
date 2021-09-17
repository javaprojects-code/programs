package cz.vutbr.feec.ltin;
import java.util.Set;
import java.util.TreeSet;

public class Hrana {
	Set <Vrchol> vrcholy=new TreeSet<>();
	Set <Hrana> hrany=new TreeSet<>();
	//seøadit hrany podle ceny
	
	
	private Vrchol v1;
	private Vrchol v2;
	private int cena;

	public Hrana(Vrchol v1, Vrchol v2, int cena) {
		this.v1=v1;
		this.v2=v2;
		this.cena=cena;
	}

	public Vrchol getV1() {
		return v1;
	}

	public Vrchol getV2() {
		return v2;
	}

	public int getCena() {
		return cena;
	}
/* @Override
public String toString() {
	return "{"+v1.getCislo()+"-"+v2.getCislo()+"->"+cena+"}";
}*/
	
	public void KruskaluvAlgoritmus() {
		for (int i = 0; i < hrany.size(); i++) {
			if(v1!=vrcholy||v2!=vrcholy) {
//				vrcholy.v1=v1;
//				vrcholy.v1=v2;
			}
		}
	}

}
