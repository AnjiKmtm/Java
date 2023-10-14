package com.java.Training.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RepeatedCharcters {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String n = sc.next();
		List<Character> al = new ArrayList<>();
		Set<Character> s = new HashSet<>();
		char[] c = n.toCharArray();
		for (int i = 0; i < n.length(); i++) {
			al.add(c[i]);
		}
		for (int i = 0; i < al.size(); i++) {

			for (int j = 0; j < al.size(); j++) {
                if(i!=j) {
				if (al.get(i).equals(al.get(j))) {
					s.add(al.get(i));

				}
			}
			}
		}
		for (char d : s) {
			System.out.println(d);
		}

	}
}
