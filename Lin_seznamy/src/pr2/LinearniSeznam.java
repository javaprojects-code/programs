package pr2;



public class LinearniSeznam {
	//private int data;
	//private LinearniSeznam next
	private Polozka prvni;
	private Polozka posledni;
	 public void pridejNaZacatek(int data){
		 Polozka p= new Polozka();
		 p.setData(data);
		 p.setDalsi(prvni);
		 
		 if(jePrazdny()){
			 posledni=p;
		 }
		 prvni=p;
		 
	 }
	 
	 public boolean jePrazdny(){
			 return prvni==null;
	 }
	 
	 public void odstranZeZacatku(){
		 prvni=prvni.getDalsi();
		 if(prvni==null){
			 posledni=null;
		 }
	 }
	 
	 public void konkHodota(int pol){
	
		 Polozka pom= prvni;
		 if(pom.getData()== pol){
			 System.out.println("obsahuje");
		 }else{
			 System.out.println("neobsahuje");
		 }
		
		 
	 }
	 
	 public void vypisVsechny(){
		
		 for(Polozka pom= prvni; pom!=null;pom=pom.getDalsi()){
			 System.out.println(pom.getData()); 
		 }
		 /*while(pom !=null){
			 System.out.println(pom.getData());
			 pom=pom.getDalsi();
		 }*/
		
		 
	 }
	 
}
