package com.Assasement;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("eneter the value of b");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}

}
