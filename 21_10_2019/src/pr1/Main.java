package pr1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarniStrom b=new BinarniStrom();
		
		b.vlozeniPrvku(5);
		b.vlozeniPrvku(4);
		b.vlozeniPrvku(1);
		b.vlozeniPrvku(6);
		
		System.out.println("obsahuje strom prvkek 6 ?"+ b.obsahuje(6));
		System.out.println("obsahuje strom prvkek 7 ?"+ b.obsahuje(7));
		
		b.vypis();
	
	}

}
