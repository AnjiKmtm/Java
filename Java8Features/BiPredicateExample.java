package com.java.Java8Features;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer,String> p=(i,s)->(i<s.length());
		System.out.println(p.test(10, "havi"));
	}
}
