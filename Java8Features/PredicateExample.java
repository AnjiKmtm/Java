package com.java.Java8Features;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> p=(s)->(s<10);
		System.out.println(p.test(12));
		
		Predicate<String> p1=s1->(s1.length()<5);
        System.out.println(p1.test("havi"));
        
        Predicate<Collection > p2=c->c.isEmpty();
        System.out.println(p2.test(null));
}
}