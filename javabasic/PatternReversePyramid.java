package com.javabasic;

import java.util.Scanner;

public class PatternReversePyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= 2*(n-i); k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

