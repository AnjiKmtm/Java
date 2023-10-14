package com.javabasic;

import java.util.Scanner;

public class Polindrome {
	
	// number is equal to the reverse of the number

	public static void main(String[] args) {
		int a = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n;
		while (n > 0) {
			a = n % 10;
			num = num * 10 + a;
			n = n / 10;
		}
		if (temp == num) {
			System.out.println("it is a polindrome");
		} else {
			System.out.println("it is not a polindrome");

		}

	}

}
