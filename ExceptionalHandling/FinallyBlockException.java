package com.java.ExceptionalHandling;

public class FinallyBlockException {
	public static void main(String[] args) {

		// finally block executed even though there is no exception and there is no proper catch block for exception
		// for execute the finally block compulsory there should be a try block
		// and there is no mandatory of catch block

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("finally block executed");
		}
	}
}
