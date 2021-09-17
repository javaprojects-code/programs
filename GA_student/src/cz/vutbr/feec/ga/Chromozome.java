package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.Random;

public class Chromozome {
	public static final int NUM_OF_POLYG = 30;
	public static final int NUM_OF_POINTS = 5;

	// body x, y, bravy R,G,B + ALPHA
	private int[] data = new int[NUM_OF_POLYG * (NUM_OF_POINTS * 2 + 3 + 1)]; // 420

	public int getData(int index) {
		return data[index];
	}
	
	public void crossOver(Chromozome ch) {
		Random rnd = new Random();

		// jeden polygon zabira 14 polozek
		int POLY_LENGTH = (NUM_OF_POINTS * 2 + 3 + 1);

		// pro kazdy polygon
		for (int i = 0; i < NUM_OF_POLYG; i++) {
			// nahodne
			if (rnd.nextBoolean()) {
				// prohod polygony
				for (int j = 0; j < POLY_LENGTH; j++) {
					// prohod
					int tmp = data[i * POLY_LENGTH + j];
					data[i * POLY_LENGTH + j] = ch.data[i * POLY_LENGTH + j];
					//radek zmenen od = na prumer ze dvou, ponechan potomek
					//ch.data[i * POLY_LENGTH + j] = tmp;
					ch.data[i * POLY_LENGTH + j] = (tmp+data[i * POLY_LENGTH + j])/2;
				}
			} else {
				// ponech jak je
			}
		}
	}

	/**
	 * Mutuj vsechny geny tohoto chromozomu.
	 */
	public void mutateAll() {
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] += rnd.nextInt(256);
			
		}
	} 


	public Chromozome cloneChromozome() {
		Chromozome ch = new Chromozome();
		ch.data = data.clone();
		return ch;
	}

}
