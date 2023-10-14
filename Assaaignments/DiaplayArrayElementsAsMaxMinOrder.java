package com.java.Assaaignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiaplayArrayElementsAsMaxMinOrder {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 6, 7, 8, 9 };
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		Collections.sort(l);
		List<Integer> l1 = new ArrayList<>();

		int min = 0;
		int max = 0;
		for (int i = 0; i < l.size(); i++) {
			if (i % 2 == 0) {
				l1.add(l.get(((l.size() - 1) - max)));
				max++;
			} else {
				l1.add(l.get(min));
				min++;
			}

		}
		System.out.println(l1);

	}
}
