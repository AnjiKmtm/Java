package com.java.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		MyComparator m = new MyComparator();
		Set<String> set = new TreeSet<>(m);
		set.add("havi");
		set.add("hyd");
		set.add("chennai");
		set.add("solutions");
		set.add("chennai");
		set.add("solutions");
		set.add("gujarath");
		System.out.println(set);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}

}