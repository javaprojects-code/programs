package pr1_1;

public class Kruh extends GrafickyObject {
 private int prumer;

@Override
public void vykresli() {
	// TODO Auto-generated method stub
	System.out.println("vykresluje se kruh o prùmeru " + prumer);
}

public int getPrumer() {
	return prumer;
}

public void setPrumer(int prumer) {
	this.prumer = prumer;
}
 
}
