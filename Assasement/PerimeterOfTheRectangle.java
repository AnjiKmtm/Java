package com.Assasement;

import java.util.Scanner;

public class PerimeterOfTheRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int l=sc.nextInt();
		System.out.println("enter the bredth of the rectangle ");
		int b=sc.nextInt();
		int perimeter =2*(l+b);
		System.out.println("perimeter of the rectangle is "+ perimeter);
		
	}

}
