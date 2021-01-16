package com.raystec.basicjava;

import java.util.Scanner;

/**
 * @author AYUSH These program is for print the fibonacci series.
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 0;
		int c = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		System.out.println("The resultant series is = ");
		for (int i = 0; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

}
