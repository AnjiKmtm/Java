package com.java.Training.Assignments;

import java.util.Scanner;

public class RemoveCharcters {
	public static void main(String[] args) {
		String s3="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.next();
		System.out.println("enter the 2nd String");
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(c2[j]==c1[i]) {
					c1[i]=0;
				}				
			}
			 s3=s3+c1[i];
		}
		System.out.println(s3);
	}
}
