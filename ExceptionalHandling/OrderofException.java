package com.java.ExceptionalHandling;

public class OrderofException {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("finally block executed");
		}

	}

}
