package cz.vutbr.feec.ltin;

public class Spustitelna {
public static void main(String[] args) {
	Graf g = new Graf();
	g.pridejHranu(1, 2, 4);
	g.pridejHranu(2, 3, 24);
	g.pridejHranu(3, 4, 9);
	g.pridejHranu(4, 5, 11);
	g.pridejHranu(5, 6, 5);
	g.pridejHranu(6, 7, 8);
	g.pridejHranu(7, 8, 21);
	g.pridejHranu(1, 6, 6);
	g.pridejHranu(3, 6, 23);
	g.pridejHranu(3, 5, 18);
	g.pridejHranu(1, 7, 16);
	g.pridejHranu(5, 7, 10);
	g.pridejHranu(5 ,8 ,14);
	g.pridejHranu(4 ,8, 7);
	
	System.out.println(g.getHrany());
}
}