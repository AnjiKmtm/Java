package com.Assasement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the elements into array");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			a[i] = x;
		}
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);
		}

		System.out.println(set);
	}

}
