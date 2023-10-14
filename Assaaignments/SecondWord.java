package com.java.Assaaignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SecondWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		StringTokenizer t=new StringTokenizer(s);
		
		if(t.countTokens()>=2) {
			String s1=t.nextToken();
			System.out.println(t.nextToken().toUpperCase());
		}else {
			System.out.println("LESS");
		}
	}

}
