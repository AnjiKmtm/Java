package com.javabasic;

import java.util.Scanner;

public class PatternRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
		}
	}
}