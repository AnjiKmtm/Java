package com.Assasement;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year ");
		int n = sc.nextInt();
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					System.out.println(n + " is a leap year");
				} else {
					System.out.println(n + " is not a leap year");
				}

			} else {
				System.out.println(n + " is a leap year");
			}

		} else {
			System.out.println(n + " is not a leap year");
		}

	}

}
