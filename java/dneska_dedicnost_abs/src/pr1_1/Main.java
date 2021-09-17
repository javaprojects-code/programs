package pr1_1;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Slozenina slozenina1=new Slozenina();
		Kruh kruh= new Kruh();
		Ctverec ctverec= new Ctverec();
		
		//Vector<GrafickyObject> objekty = new Vector<>();
		
		Platno platno = new Platno();
		slozenina1.pridej(kruh);
		ctverec.setTlouska(5);
		kruh.setPrumer(10);
		platno.pridejObj(slozenina1);
		platno.pridejObj(ctverec);
		platno.pridejObj(kruh);
		platno.vykreslivsechny();
	}

}
