package sampr2;

public class Proces {
	public void vlozeniVstupnihoPortu(double hodnota){
	VstupniPort v =new VstupniPort();
	v.setHodnota(hodnota);
	}
	
	public void vlozeniVystupnihoPortu(double hodnota){
		VystupniPort v =new VystupniPort();
		v.setHodnota(hodnota);
		}
	
	public void operace(VstupniPort v1, VstupniPort v2) {
		if(v1.getHodnota()!=0 && v2.getHodnota()!=0) {
			// vlozeni vysledku do vystupniho portu
			//=return (v1 Operator v2)
		}
		
	}
	
	public void slozenaOperace(VstupniPort v1, VstupniPort v2) {
		if(v1.getHodnota()!=0 && v2.getHodnota()!=0) {
			// vlozeni vysledku do vystupniho portu
			//=return (v1 slozenyOperator v2)
		}
		
	}
	
}
