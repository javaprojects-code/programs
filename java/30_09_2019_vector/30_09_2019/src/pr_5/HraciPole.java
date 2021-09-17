package pr_5;

public class HraciPole {
	private int[][] pole;	
 	private int poziceX;
 	private int poziceY;
 	private int[][] data={{7,2,4},{5,0,6},{8,3,1}};
 	
 	public static int NAHORU=0;
 	public static int  DOLU=1;
 	public static int VLEVO=2;
 	public static int VPRAVO=3;
 	
 	public void pohniPolickem(int smer){
 		switch (smer) {
		case 0:
			if (poziceY>0){
				data[poziceY][poziceX]=data[poziceY-1][poziceX];
				data[poziceY-1][poziceX]=0;
				poziceY-= 1;	
			}
			
			break;
		case 1:
			if (poziceY<2){
				data[poziceY][poziceX]=data[poziceY+1][poziceX];
				data[poziceY+1][poziceX]=0;
				poziceY += 1;	
			}
			
			break;
		default:
			break;
		}
 	}
 	
 	public void vypisPole(){
 		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
 	}
 	
	/*public HraciPole(int size) {
		int pozice0=1;
		pole = new int[size][size];
		for (int i = 0; i < size; i++) { // nejdøive y osa
			for (int j = 0; j < size; j++) { //potom x osa
				pole[i][j]= pozice0++;	
			}
		}
		poziceX= size -1;
		poziceY=size -1;
		pole[poziceX][poziceY]=0;
	}*/
	
	
 	
 	

 	
}
