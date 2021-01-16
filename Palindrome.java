package com.raystec.basicjava;

/**
 * @author AYUSH These program is made for finding the no is palindrome or not.
 */
public class Palindrome {

	public static void main(String[] args) {
		int a, b = 0, n, r;
		n = 111;
		a = n;
		for (; n != 0; n /= 10) {
			r = n % 10;
			b = b * 10 + r;
		}
		if (a == b) {
			System.out.println(a + "is palindrome no");
		} else {
			System.out.println(a + "   is not palindrome no.");
		}

	}

}
