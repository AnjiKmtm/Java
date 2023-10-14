package com.Assasement;

import java.util.Scanner;

public class AdditionComplexNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		System.out.println("enter the value of d");
		int d=sc.nextInt();
		String e=a+"+i"+b;
		String f=c+"+i"+d;
		int x= a+c;
		int y=b+d;
		System.out.println("addition of two complex numbers"+x+"+i"+y);
		
	}

}
