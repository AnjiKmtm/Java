package com.Assasement;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next();
		int n=s1.length();
		char[] ch=s1.toCharArray();
		String s2="";
		for(int i=n-1;i>=0;i--) {
	      s2=s2+ch[i];
		}
		System.out.println("Reverse of string is "+s2);
	}

}
