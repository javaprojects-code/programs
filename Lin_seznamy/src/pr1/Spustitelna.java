package pr1;

import java.util.LinkedList;

public class Spustitelna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seznam p1= new Seznam();
		Seznam p2= new Seznam();
		Seznam p3= new Seznam();
		Seznam p4= new Seznam();
	
		p1.setDalsi(p2);
		p2.setDalsi(p3);
		p3.setDalsi(p4);
		
		LinkedList<Integer> l= new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
	}

}
