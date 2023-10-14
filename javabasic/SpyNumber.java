package com.javabasic;

import java.util.Scanner;

public class SpyNumber {

	// sum of the digits of number is equal to product of the of the digits in number
	

	public static void main(String[] args) {
		int a = 0, sum = 0, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while (n > 0) {
			a = n % 10;
			sum = sum + a;
			product = product * a;
			n = n / 10;
		}
		if (sum == product) {
			System.out.println("it is a spy nuber");
		} else {
			System.out.println("it is not a spy number");
		}
	}

}
