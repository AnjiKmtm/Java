package com.Assasement;

import java.util.Scanner;

public class GCDofTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		int product = 1;
		for (int i = 1; i <= a && i<=b; i++) {
			if (a % i == 0 && b % i == 0) {
				product = product * i;
				a=a/i;
				b=b/i;
				i = 1;
			}

		}
		System.out.println("gcd of two numbers is " + product);

	}

}
