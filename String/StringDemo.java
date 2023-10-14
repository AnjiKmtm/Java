package com.java.String;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "we are doing java programs now";
		String s2 = "";
		char[] ch = s1.toCharArray();
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + ch[i];
		}
     System.out.println(s2);
	}
}
