package com.java.ExceptionalHandling;

public class ReturnStatements01 {
	public static void main(String[] args) {

		Return01 r = new Return01();
		System.out.println(r.divideNumbers());
	}
}

class Return01 {
	public int divideNumbers() {
		int a = 10, b = 0, c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {

		} finally {

		}
		return c;
	}
}