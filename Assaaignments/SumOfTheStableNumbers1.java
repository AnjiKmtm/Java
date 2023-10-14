package com.java.Assaaignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfTheStableNumbers1 {
	public static void main(String[] args) {
		int total = 0;
		int[] a = { 1234, 1221, 4341, 3223, 1234 };
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];

			while (temp > 0) {
				int x = temp % 10;
				l.add(x);
				temp = temp / 10;
			}
			Collections.reverse(l);
			Set<Integer> s = new HashSet<>(l);
			int k = l.size();
			int m = s.size();
			int sum = 0;
			int sum1 = 0;
			if (k % 2 == 0) {

				if (m == k | m == k / 2 | m == 1) {
					String s1 = "";
					for (int j = 0; j < l.size(); j++) {
						s1 = s1 + l.get(j);
					}
					int b = Integer.parseInt(s1);
					sum = sum + b;
				}

			} else {
				if (m == k | m == 1) {
					String s2 = "";
					for (int h = 0; h < l.size(); h++) {
						s2 = s2 + l.get(h);
					}
					int c = Integer.parseInt(s2);
					sum1 = sum1 + c;
				}
			}
			total = total + sum + sum1;

			l.removeAll(l);
			s.removeAll(s);
		}
		System.out.println(total);

	}

}
