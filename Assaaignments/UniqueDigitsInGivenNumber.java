package com.java.Assaaignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueDigitsInGivenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		Set<Integer> set=new HashSet<>();
		while(n>0){
			int a=n%10;
			set.add(a);
			n=n/10;
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
