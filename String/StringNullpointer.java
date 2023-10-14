package com.java.String;

public class StringNullpointer {
	public static void main(String[] args) {
		String s = null;
		if ("havi".equals(s)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (s.equals("havi")) {
			System.out.println("true");
		}
	}
}
