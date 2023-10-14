package com.Assasement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements you want to sort");
		int n = sc.nextInt();
		System.out.println("enter the elements into ArrayList");
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int[] a = new int[n];
		for (int i = 0; i < list.size(); i++) {
			a[i] = list.get(i);
		}

		System.out.println(Arrays.toString(a));

	}

}
