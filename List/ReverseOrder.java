package com.java.assaignment.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("havi");
		al.add("trainer");
		al.add("solutions");
		al.add("private");
		al.add("public");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	
	}

}
