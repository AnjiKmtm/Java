package com.java.Training.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first String");
		String s1 = sc.nextLine();
		System.out.println("enter the 2nd String");
		String s2 = sc.nextLine();
		List<Character> al = new ArrayList<>();
		List<Character> al1 = new ArrayList<>();
		if (s1.equals(s2)) {
			System.out.println("they are anagram to each other");
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		try {
			if (c1.length != c2.length) {
				throw new AnagramException("they are not anagram to each other");
			}
		} catch (AnagramException e) {
			System.out.println(e.getMessage());
		}
		for (char c : c1) {

			al.add(c);
		}
		for (char d : c2) {
			al1.add(d);

		}
		if (al.containsAll(al1)) {
			System.out.println("they are anagram to each other");
		}

	}
}

class AnagramException extends RuntimeException {
	AnagramException(String s) {
		super(s);
	}
}
