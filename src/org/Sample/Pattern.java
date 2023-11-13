package org.Sample;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}
