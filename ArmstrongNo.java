package com.raystec.basicjava;

/**
 * @author AYUSH These program is for finding the number is Armstorng number or
 *         not.
 */
public class ArmstrongNo {

	public static void main(String[] args) {
		int c = 0, a, n, t;
		n = 2356;
		t = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (t == c) {
			System.out.println(c + "is armstrong no");
		} else {
			System.out.println(t + "   is not armstrong no.");
		}
	}
}
