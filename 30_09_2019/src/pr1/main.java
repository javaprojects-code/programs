package pr1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresar adr1=new Adresar("adr1");
		Adresar adr2=new Adresar("adr2");
		Adresar adr3=new Adresar("adr3");
		Adresar adr4=new Adresar("adr4");
		Adresar adr5=new Adresar("adr5");
		Adresar adr6=new Adresar("adr6");
	
		
		adr1.add(adr4);
		adr1.add(adr5);
		adr1.add(adr2);
		adr1.add(adr6);
		
		adr2.add(adr1);
		adr2.add(adr5);
		adr2.add(adr3);
		
		adr5.add(adr4);
		
		
	
		adr1.print();
	
		
	
	}

}
