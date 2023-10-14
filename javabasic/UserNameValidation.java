package com.javabasic;

import java.util.Scanner;

public class UserNameValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user name");
		String s = sc.next();
		int n = s.length();
		if (n >= 8 & n <= 15) {
			int count = 0;
			for (int i = 0; i < 1; i++) {

				for (char j = 65; j <= 90; j++) {
					if (s.charAt(i) == j) {
						count++;
					}
				}
			}
			if (count == 1) {
				int sum = 0;
				for (int i = 1; i < s.length(); i++) {
					for (char j = 64; j < 65; j++) {
						if (s.charAt(i) == j) {
							sum++;
						}
					}
				}
				if (sum == 1) {
					int count1 = 0;
					for (int i = 1; i < s.length(); i++) {
						for (char j = 48; j < 57; j++) {
							if (s.charAt(i) == j) {
								count1++;
							}
						}
					}
					if (count >= 1) {
						System.out.println("valid user name");

					} else {
						System.out.println("must contain atleast one integer");
					}
				} else if (sum == 0) {
					System.err.println(" one  @ charcter is required");
				} else {
					System.err.println("more than one @ character is not allowed");
				}

			} else {
				System.err.println("please start with Capital letter");
			}
		} else {
			System.err.println("the username must containt 8 to 15 characters");
		}
	}
}
