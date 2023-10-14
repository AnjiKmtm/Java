package com.Assasement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumNearToZero1 {
	public static void main(String[] args) {
		int n1 = 0,n2 = 0;
		int[] a = { 45, 36, 143, 23, 789, 1 ,-5};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		int sum = 0;
		int neartozero = 789;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i != j) {
					sum = sum + list.get(i) + list.get(j);
					if (sum <= neartozero) {
						neartozero = sum;
						 n1=list.get(i);
						 n2=list.get(j);
					}
					sum = 0;

				}
			}
		}
		Collections.sort(list);
		System.out.println("the elements are "+ list.get(0)+" "+list.get(1));
		
		System.out.println(neartozero);
		System.out.println("the two elements are "+n1+" & "+n2);
	}
}
