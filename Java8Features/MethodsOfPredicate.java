package com.java.Java8Features;

import java.util.function.Predicate;

public class MethodsOfPredicate {
	public static void main(String[] args) {
		int[] x = { 10, 2, 3, 5, 7, 9, 12, 35 };
		Predicate<Integer> p = i -> i < 10;
		System.out.println("the numbers below 10 are");
		maintain(p, x);
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println("the even numbers are");
		maintain(p1, x);
		System.out.println("the odd numbers are");
		maintain(p1.negate(), x);
		Predicate<Integer> p2 = i -> i % 10 == 0;
		System.out.println("the numbers present in p1 or p2");
		maintain(p1.or(p2), x);
		System.out.println("the number present in p2 and p1");
		maintain(p2.and(p1), x);
	}

	public static void maintain(Predicate<Integer> a, int[] x) {
		for (int i : x) {
			if (a.test(i)) {
				System.out.println(i);
			}
		}
	}
}
