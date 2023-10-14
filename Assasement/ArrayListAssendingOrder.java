package com.Assasement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListAssendingOrder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elements you want to sort");
	int n=sc.nextInt();
	System.out.println("enter the elements into ArrayList");
	List<Integer> list=new ArrayList<>();
	for(int i=1;i<=n;i++) {
		int a=sc.nextInt();
		list.add(a);
	}
	Collections.sort(list);
	System.out.println(list);
	

	}

}
