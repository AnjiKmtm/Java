package com.java.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("havi");
//		System.out.println(set.hashCode());
		set.add("hyd");
//		System.out.println(set.hashCode());
		set.add("chennai");
//		System.out.println(set.hashCode());
		set.add("solutions");
		set.add("chennai");
		set.add("solutions");
//		System.out.println(set.hashCode());
		set.add(null);
//		System.out.println(set.hashCode());
		System.out.println(set);
//		System.out.println(set.hashCode());
	
	}
	}

