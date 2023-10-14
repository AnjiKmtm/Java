package com.Assasement;

import java.util.Scanner;

public class FibanociiSeries {
	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("upto which limit we want to print fibanocii series");
		int n=sc.nextInt();
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
			
			if(c>n) {
				break;
			}else {
				System.out.println(c);
			}
		}
		
	}

}
