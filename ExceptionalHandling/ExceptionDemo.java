package com.java.ExceptionalHandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		try {
			int b = a / 0;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("finally block executed");
		}

	}
}