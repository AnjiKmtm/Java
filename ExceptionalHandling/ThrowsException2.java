package com.java.ExceptionalHandling;

public class ThrowsException2 {
	static void divideNumber() throws ArithmeticException,NullPointerException{
		int c=10/0;
		System.out.println(c);
	}
	static void nullCheck() throws ArithmeticException,NullPointerException {
		String s=null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {
		try {
		divideNumber();
		nullCheck();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	

}

