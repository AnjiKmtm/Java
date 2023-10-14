package com.Assasement;

import java.util.Scanner;

public class LeftTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
