package com.Assasement;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while (n > 0) {
			int a = n % 10;
			count++;
			n = n / 10;
		}
		n = temp;
		int sum = 0;
		while (n > 0) {
			int a = n % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product * a;
			}
			sum = sum + product;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a polindrome number");
		} else {
			System.out.println(temp + " is not a polindrome number");
		}
	}

}
