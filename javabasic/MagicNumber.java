package com.javabasic;

import java.util.Scanner;

public class MagicNumber {
	
	//sum of all the digits(up to a single digit) is equal to 1

	public static void main(String[] args) {
		int a=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	
		while(n>9) {
			while(n>0) {
	       
			a=n%10;
			sum=sum+a;
			n=n/10;
			}
			n=sum;
		}
    if(n==1) {
    	System.out.println("it is magic number");
    }else {
    	System.out.println("not a magic number");
    }
	}
	}
