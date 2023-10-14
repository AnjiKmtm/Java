package com.Assasement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Info1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the how many elements u want to enter");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the " + i + " value");
			int n1 = sc.nextInt();
			list.add(n1);
		}
		System.out.println(list);

		// replace the elements

		list.add(4, 8);
		System.out.println(list);

		// remove the elements

		list.remove(2);
		System.out.println(list);

		// size

		System.out.println(list.size());

		System.out.println("enter the number to check whether it is present in the list or not");
		int n2 = sc.nextInt();
		if (list.contains(n)) {
			System.out.println("Present in the list");
		} else {
			System.out.println("not present in the list");

		}
	}

}
