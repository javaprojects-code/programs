package pr3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paket p1=new Paket();
		Paket p2=new Paket();
		Paket p3=new Paket();
		Paket p4=new Paket();
		
		p1.setData(1);
		p2.setData(2);
		p3.setData(6);
		p4.setData(8);
		
		p1.setDalsi(p2);
		p2.setDalsi(p3);
		p3.setDalsi(p4);
		p4.setDalsi(p1);
		
		Paket pomocna=p1;
		while(pomocna!= null){
			System.out.println(pomocna.getData());
			pomocna=pomocna.getDalsi();
		}
		//System.out.println(p1.getData()+" "+ p1.getDalsi().getData()+" "+ p2.getDalsi().getData());
	}

}
