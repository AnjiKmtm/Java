package com.java.Training.Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SmallestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		StringTokenizer t = new StringTokenizer(s);
		String s1 = t.nextToken();
		int n1 = s1.length();
		while (t.hasMoreTokens()) {
			String s2 = t.nextToken();
			int n2 = s2.length();
			if (n2 < n1) {
				s1 = s2;
				n1 = n2;
			}
		}
		System.out.println(s1);
	}
}
