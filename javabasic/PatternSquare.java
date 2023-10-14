package com.javabasic;

import java.util.Scanner;

public class PatternSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++) {
				System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=n-2;i++) {
				System.out.print("*");				
		      
		        for(int j=1;j<=2*(n-1)-1;j++) {
		        System.out.print(" ");
		        }
		        System.out.print("*");
		        System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
	}
}