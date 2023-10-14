package com.javabasic;

import java.util.Scanner;

public class PatternRhombus01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 0; k <= (2 * i) - 1; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int k = 1; k <= n-1 ; k++) {
			for (int m = 1; m <= 2 * k - 1; m++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int i=1;i<=n;i++) {
				
			}
			
			System.out.println();
		}
	}
}
