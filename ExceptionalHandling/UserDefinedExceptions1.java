package com.java.ExceptionalHandling;

public class UserDefinedExceptions1 {
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		} else {
			System.out.println("product valid");
		}
	}

	public static void main(String args[]) {
		UserDefinedExceptions1 obj = new UserDefinedExceptions1();
		try {
			obj.productCheck(60);
		} catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}

@SuppressWarnings("serial")
class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		super(s);
	}
}