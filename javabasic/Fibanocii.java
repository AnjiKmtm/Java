package com.javabasic;

import java.util.Scanner;

public class Fibanocii {
	static int c;
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		System.out.println("enter 2nd number");
		
		int b=sc.nextInt();
		while(b<100) {
	   b=a+b;
	   a=b-a;
	   if(b>100) {
		   break;
	   }
		System.out.println(b);
		}
		

	}

}
