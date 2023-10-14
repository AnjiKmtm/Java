package com.javabasic;

import java.util.Scanner;

public class LeapYearORnot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int a = sc.nextInt();
		if (a % 4 == 0) {
			if (a % 100 == 0) {
				if (a % 400 == 0) {
					System.out.println("it is a leap year");
				} else {
					System.out.println("it is not a leap year");
				}
			} else {
				System.out.println("it is leap year");
			}
		} else {
			System.out.println("it is not a leap year");
		}
	}

}
