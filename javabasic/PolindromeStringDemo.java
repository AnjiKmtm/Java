package com.Training.Assignments;

import java.util.Scanner;

public class PolindromeStringDemo {

	public static void main(String[] args) {
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + a[i];
		}
		
		if (s.equals(s1)) {

			System.out.println(s+" is a polindrome");
		} else {
			System.out.println( s+" is not polindrome");

		}
	}
}
