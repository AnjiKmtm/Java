package com.java.Assaaignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumOfThePowersOfTheDigits {
	public static void main(String[] args) {
		double sum = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			int a = n % 10;
			list.add(a);
			n = n / 10;
		}
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				temp = Math.pow(list.get(i), list.get(i + 1));
			} else {
				temp = Math.pow(list.get(i), 0);
			}
			sum = sum + temp;
		}

		System.out.println("the power of the digits " + sum);
	}
}