package com.Assasement;

import java.util.Scanner;

public class PolindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		int n=s1.length();
		char[] ch=s1.toCharArray();
		String s2="";
		for(int i=n-1;i>=0;i--) {
	      s2=s2+ch[i];
		}
		if(s1.equals(s2)) {
			System.out.println(s1+" is a polindrome");
		}else {
			System.out.println(s1+" is not a polindrome");
		}
	}

}
