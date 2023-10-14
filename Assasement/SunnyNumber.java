package com.Assasement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=1000;i++) {
			int a=i*i;
			list.add(a);
		}
		if(list.contains(n+1)) {
			System.out.println(n+" is a sunny number");
		}else {
			System.out.println(n+" is not a sunny number");
		}
}
}