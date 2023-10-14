package com.java.Training.Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		StringTokenizer t=new StringTokenizer(s);
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
	}

}
