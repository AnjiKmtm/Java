package com.javabasic;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number upto which we have to print");
		int n=sc.nextInt();
		System.out.println("even numbers are");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("odd numbers are");
			for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			 }
			}
		}
			
			}
			
		
	




