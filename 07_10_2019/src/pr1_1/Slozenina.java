package pr1_1;

import java.util.Vector;

public class Slozenina extends GrafickyObject {
// vector <graficky objekt>
	Vector<GrafickyObject> slozenina= new Vector<>();

	@Override
	public void vykresli() {
		// TODO Auto-generated method stub
		System.out.println("Vykresluji slozeninu");
	}
	public void pridej(GrafickyObject e) {
		slozenina.add(e);
	}
	
	public void odstran(GrafickyObject e) {
		slozenina.remove(e);
	}
}
