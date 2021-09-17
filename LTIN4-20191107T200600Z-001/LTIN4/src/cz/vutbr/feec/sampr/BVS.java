package cz.vutbr.feec.sampr;

import cz.vutbr.feec.strom.Uzel;

public class BVS {
	
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
		
		public void pridej(int i) {
			Uzel novy = new Uzel(i);

			if (koren == null) {
				novy.setData(i);
			}
			else {
				while (koren != null) {
					if (i == koren.getData()) {
						return;
					} else if(i < koren.getData()){
						koren = koren.getLevy();
					} else{
						koren = koren.getPravy();
					}
				}
				if (i == koren.getData()) {
					return;
				} else if (i < koren.getData()){
					novy.setLevy(koren);
				}else{
					novy.setPravy(koren);
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
