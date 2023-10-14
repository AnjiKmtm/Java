package com.javabasic;

import java.util.Scanner;

public class StrongNumber {
	
	//number is equal sum of the factorial of the digits of the number

	public static void main(String[] args) {
		int a=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			a=n%10;
			int product=1;
			for(int i=1;i<=a;i++) {
			product=product*i;
			}
			sum=sum+product;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("it is a strong number");
		}else {
			System.out.println("it is not a strong number");
		}
	}

}
