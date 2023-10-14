package com.Assasement;

import java.util.Scanner;

public class AreaOfRhombus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First diagonal length");
		int n1=sc.nextInt();
		System.out.println("enter the Second Diagonal length");
		int n2=sc.nextInt();
		double area=(n1*n2)/2d;
		System.out.println("area of the rhombus is "+area);
	}
}