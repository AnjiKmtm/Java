package com.javabasic;

import java.util.Scanner;

public class Perfectnumbersupto {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the number upto which we need to print");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int sum=0;
		for(int j=1;j<i;j++) {
			if(i%j==0) {
				sum=sum+j;
			}
		}
	
			if(i==sum) {
				System.out.println(i);
			}
		}
	}
}			


