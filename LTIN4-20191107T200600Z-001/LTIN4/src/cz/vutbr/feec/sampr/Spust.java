package cz.vutbr.feec.sampr;

import cz.vutbr.feec.strom.MujStrom;

public class Spust {

	public static void main(String[] args) {
		MujStrom s= new MujStrom();

		s.pridej(5);
		s.pridej(3);
		s.pridej(4);
		s.pridej(10);
		s.pridej(7);
		s.pridej(8);
		
		System.out.println("obsahuje strom prvkek 6 ?"+ s.obsahuje(6));
		System.out.println("obsahuje strom prvkek 7 ?"+ s.obsahuje(7));
		
		s.vypisVse();

	}

}
