package com.raystec.basicjava;

/**
 * @author AYUSH These program is made for the sum of numbers which are
 *         divisible by 7.
 */
public class Divisionby7 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0)
				result = result + i;

		}
		System.out.println(result);

	}

}
