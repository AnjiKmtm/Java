package com.java.ExceptionalHandling;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	try {
	int e=a*b-c/d;
	}
	catch(ArithmeticException ex) {
		System.out.println();
		System.out.println(ex.getMessage());
	}
	
}
}
