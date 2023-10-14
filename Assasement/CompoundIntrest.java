package com.Assasement;

import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int p = sc.nextInt();
		System.out.println("enter the rate of interest");
		int r = sc.nextInt();
		System.out.println("enter the no of years");
		int n = sc.nextInt();
		
		double c = (100 + r);
		double total = Math.pow(c, n);
		double Numenator = p * total;
		
		double Denominator= Math.pow(100, n);
		double totalamount = Numenator/ Denominator;
		Double compoundintrest = totalamount - p;
		System.out.println("the compound intrest is " + compoundintrest);

	}

}
