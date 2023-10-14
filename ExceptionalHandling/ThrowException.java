package com.java.ExceptionalHandling;

public class ThrowException {
	public static void main(String[] args) {
		int n = 100;
		if (n / 5 > 0) {
			throw new ArithmeticException("we cant devide number with five");
		}
	}
}