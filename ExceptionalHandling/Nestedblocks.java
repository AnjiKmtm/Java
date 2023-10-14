package com.java.ExceptionalHandling;

public class Nestedblocks {
	public static void main(String[] args) {
		int a = 10, b = 0, c = 10;
		try {
			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				System.out.println(e);
			} finally {

			}
		} catch (Exception e) {
			try {
				System.out.println(c / a);
			} catch (Exception e1) {
				System.out.println(e1);
			} finally {

			}
		} finally {
			try {

			} catch (Exception e) {

			} finally {

			}
		}
	}

}
