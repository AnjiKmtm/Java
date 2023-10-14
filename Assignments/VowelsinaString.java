package com.java.Training.Assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsinaString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String n = sc.next();
		char[] ch = n.toCharArray();
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a') {
				s.add('a');
			} else if (ch[i] == 'e') {
				s.add('e');
			} else if (ch[i] == 'i') {
				s.add('i');
			} else if (ch[i] == 'o') {
				s.add('o');
			} else if (ch[i] == 'u') {
				s.add('u');
			}
		}
		System.out.println("vowels in the string are");
		for (Character character : s) {
			System.out.println(character);
		}

	}

}
