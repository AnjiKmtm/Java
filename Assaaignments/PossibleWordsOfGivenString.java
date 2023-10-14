package com.java.Assaaignments;

public class PossibleWordsOfGivenString {
	public static void main(String[] args) {
		String s = "p_t";
		String[] s1 = { "put", "pot", "pet", "pist" };
		int n = s.length();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() == n) {
				if (s1[i].charAt(0) == 'p') {
					if (s1[i].charAt(n - 1) == 't') {
						System.out.println(s1[i] + " is possible word for the string");
					} else {
						System.out.println(s1[i] + " is not possible word for the string");
					}

				} else {
					System.out.println(s1[i] + " is not possible word for the string");
				}
			} else {
				System.out.println(s1[i] + " is not possible word for the string");
			}
		}

	}

}
