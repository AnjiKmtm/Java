package com.Assasement;

import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the cylinder");
		int r=sc.nextInt();
		System.out.println("enter the height of the cylinder");
		int h=sc.nextInt();
		
//		Total Surface Area of Cylinder=2*pi*r(h+r)
		
		float pi=22/7f;
		int c=h+r;
    	float area= 2*pi*r*c;
    	System.out.println("total surface area of cylinder is "+area);
	}

}
