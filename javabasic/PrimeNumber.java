package com.javabasic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int i=sc.nextInt();
for(int j=1;j<=i;j++) {
	if(i%j==0) {
		count++;
	}
}

	if(count==2) {
		System.out.println(i+" is a prime number");
	}else {
		System.out.println(i+"is not a prime number");
	}	
	}

}
