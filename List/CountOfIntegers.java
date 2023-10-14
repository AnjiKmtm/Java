package com.java.assaignment.List;

import java.util.ArrayList;
import java.util.List;

public class CountOfIntegers {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> s = new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(49);
		al.add(35);
		al.add(1);
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			if (!s.contains(al.get(i))) {
				s.add(al.get(i));
			}
		}

		for (int i = 0; i < s.size(); i++) {
			int count = 0;
			for (int j = 0; j < al.size(); j++) {
				if (s.get(i).equals(al.get(j)))
					count++;
			}
			System.out.println(s.get(i) + " is " + count + " times repeated");
		}
	}
}
