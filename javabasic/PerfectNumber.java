package com.javabasic;

import java.util.Scanner;

public class PerfectNumber {

	// number is equal to sum of the factors of that number

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("it is a Perfect number");
		} else {
			System.out.println("it is not a perfect number");
		}

	}

}
