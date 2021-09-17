package pr1;

public class BinarniStrom {
	private Uzel koren=null;
	private Uzel aktualni=null;
	
	public boolean jePrazdny(){
		return (this.koren==null);
	}
	
	public boolean obsahuje(int data){
		if (this.koren!=null){
			this.aktualni=this.koren;
			
			while (this.aktualni!=null) {
				if(this.aktualni.getData()== data){
					return true;
				}
				
				if (this.aktualni.getData()< data){
					this.aktualni= this.aktualni.getPravy();
				}else{
					this.aktualni=this.aktualni.getLevy();
				}
				
			}return false;
			
		}else{
			return false;
		}
	}
	
	public void vlozeniPrvku(int data){
		Uzel uzel= new Uzel(data, null);
		 if(this.koren==null){
			 this.koren=uzel;
		 }else {
			 this.aktualni=this.koren;
			 boolean je=false;
			 while(!je){
				 if(this.aktualni.getData()== data){
					 je=true;
				 }else {
					 uzel.setKoren(this.aktualni);
					 
					 if(this.aktualni.getData()<data){
						 if(this.aktualni.getPravy()==null){
							 this.aktualni.setPravy(uzel);
							 this.aktualni=this.aktualni.getPravy(); 
						 }else{
							 this.aktualni=this.aktualni.getPravy(); 
						 }
					 }else{
						 if(this.aktualni.getLevy()==null){
							 this.aktualni.setLevy(uzel);
							 this.aktualni= this.aktualni.getLevy();
						 }else{
							 this.aktualni= this.aktualni.getLevy();
						 }
						
					 }
				 }
			 }
		 }
	}
	public void vypis(){
		this.vypis(this.koren);
		System.out.println();
	}
	public void vypis(Uzel uzel) {
		if(uzel==null){
			return;
		}
		System.out.print(""+uzel.getData()+" ");
		vypis(uzel.getLevy());
		
		vypis(uzel.getPravy());
	}
}
