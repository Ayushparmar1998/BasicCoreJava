package com.raystec.basicjava;

import java.util.Random;

/**
 * @author AYUSH These program is for printing five random integer.
 */
public class RandomNo {

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		for (int j = 0; j < 5; j++) {
			Random r = new Random();
			int i = min + r.nextInt(max);
			System.out.println(i);

		}
	}
}
