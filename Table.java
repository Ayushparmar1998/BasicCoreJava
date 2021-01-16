package com.raystec.basicjava;

/**
 * @author AYUSH These program is made for print the table of given no.
 */
public class Table {

	public static void main(String[] args) {
		int a[] = new int[11];
		a[0] = 2;

		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - 1; j++) {
				a[i] = a[0] * j;

				System.out.println("" + a[i]);
			}
			System.out.println();
		}
	}
}
