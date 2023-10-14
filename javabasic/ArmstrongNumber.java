package com.javabasic;

import java.util.Scanner;

public class ArmstrongNumber {

	// n digit number is equal to the sum of the nth power of their digits

	public static void main(String[] args) {
		int count = 0, product = 1, sum = 0, a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int num = n;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		n = num;
		while (n > 0) {
			a = n % 10;
			product = 1;
			for (int i = 1; i <= count; i++) {
				product = a * product;
			}
			sum = sum + product;
			n = n / 10;
		}

		if (num == sum) {
			System.out.println("it is armstrong number");
		} else {
			System.out.println("it is not armstrong number");
		}

	}
}