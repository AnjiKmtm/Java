package com.java.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	Set<String> set =new LinkedHashSet<>();
	set.add("havi");
	set.add("hyd");
	set.add("chennai");
	set.add("solutions");
	set.add("chennai");
	set.add("solutions");
	System.out.println(set);
}
}
