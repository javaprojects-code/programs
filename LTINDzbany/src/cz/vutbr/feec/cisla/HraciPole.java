package cz.vutbr.feec.cisla;

import java.util.ArrayList;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class HraciPole implements Comparable<HraciPole> {
	private int[] pole = {0,0}; //misto data
	private int a=pole[0]; //prvni hodnota je a
	private int b=pole[1]; //druha je b
	private final int maxA=4;
	private final int maxB=3;
	
	private ArrayList<Integer> pohyby = new ArrayList<Integer>();

	public static final int VYNULUJA = 1;
	public static final int VYNULUJB = 2;
	public static final int PRELIJA = 3;
	public static final int PRELIJB = 4;
	
	public HraciPole klonujAPohni(int smer) {
		HraciPole nove = new HraciPole();
		nove.a = this.b;
		nove.a = this.b;
		nove.pohyby.addAll(this.pohyby);
		nove.pohyby.add(smer);
		for (int x = 0; x < 2; x++) {
				nove.pole[x] = this.pole[x];
		}

		boolean jeMozny = nove.prelij(smer);
		if (jeMozny) {
			return nove;
		} else {
			return null;
		}
	}


	public boolean prelij(int jak) {
		switch (jak) {
		case VYNULUJA:
			// vynuluje a, b ponecha, nebo nastavi na maximalni hodnotu
			if (a==0) {
				return false;
			}
			a=0;
			if(b==0)b=maxB;
			 pole[0]=a; 
			 pole[1]=b;
			return true;
		case VYNULUJB:
			// vynuluje a, b ponecha, nebo nastavi na maximalni hodnotu
			if (b==0) {
				return false;
			}
			b=0;
			if(a==0)a=maxA;
			pole[0]=a; 
			pole[1]=b;
			return true;
		case PRELIJA:
			// prelije z b do a po max
			if (a==maxA) {
				return false;
			}

			int pomA=a;
			int pomB=b;
			pomB=pomB-(maxA-pomA);
			
			if(pomB<=maxB) 
			{b=pomB;
			a=maxA;
			};
			return true;
		case PRELIJB:
			// prelije z a do b po max
			if (b==maxB) {
				return false;
			}
			
			int pA=a;
			int pB=b;
			pA=pA-(maxB-pB);
			
			if(pA<=maxA) 
			{a=pA;
			b=maxB;
			};
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(HraciPole p) {
		for (int ix = 0; ix < 2; ix++) {
				if (pole[ix]== p.pole[ix]) {
					continue;
				} else if (pole[ix]< p.pole[ix]) {
					return -1;
				} else {
					return 1;
				}
			}
		return 0;
	}


	@Override
	public boolean equals(Object obj) {
		HraciPole p = (HraciPole) obj;
		return compareTo(p) == 0;
	}

	@Override
	public String toString() {
		String res = "pohyby:" + pohyby + "\n";
		for (int iy = 0; iy < 2; iy++) {
			{
				res += pole[iy] + ",";
			}
			res += "\n";
		}
		return res;
	}

	public boolean jeReseni() {
		int[] reseni = {0,2};
		for (int x = 0; x < reseni.length; x++) {
				if (pole[x] != reseni[x]) {
					return false;
				}
		}
		return true;
		}

	@Override
	public int hashCode() {
		HashCodeBuilder h = new HashCodeBuilder();
		for (int x = 0; x < pole.length; x++) {
				h.append(pole[x]);
		}
		return h.toHashCode();
	}

}
