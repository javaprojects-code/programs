package cz.vutbr.feec.strom;

public class MujStrom {
	private Uzel koren;

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

	public void vypisVse() {
		// TODO Auto-generated method stub

	}

	public boolean jePrazdny() {
		return koren == null;
	}

	public boolean obsahuje(int hodnota) {
		Uzel tmp = koren;

		while (tmp != null) {

			if (hodnota == tmp.getData()) {
				return true;
			} else if (hodnota < tmp.getData()) {
				tmp = tmp.getLevy();
			} else {
				tmp = tmp.getPravy();
			}

		}
		return false;
	}

}
