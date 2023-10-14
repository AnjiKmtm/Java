package com.Assasement;

import java.util.Scanner;

public class ReverseOfPyramidPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<2*(n-i);k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
