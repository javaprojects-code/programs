package cz.vutbr.feec.strom;

public class Spustitelna {

	public static void main(String[] args) {
		MujStrom s= new MujStrom();

		s.pridej(5);
		s.pridej(7);
		s.pridej(2);
		s.pridej(1);
		s.pridej(9);
		s.pridej(4);
		s.pridej(8);
		
		s.jePrazdny();
		s.obsahuje(8);
		//	s.vypisVse();
	}

}
