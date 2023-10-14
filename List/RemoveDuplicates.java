package com.java.assaignment.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		List<String> duplicate = new ArrayList<String>();
		l.add("havi");
		l.add("solutions");
		l.add("hyderabad");
		l.add("havi");
		l.add("hyderabad");
		System.out.println(l);
		for (int i = 0; i < l.size(); i++) {

			if (duplicate.contains(l.get(i))) {
				continue;

			} else {
				duplicate.add(l.get(i));
			}
		}
		System.out.println(duplicate);
	}
}
