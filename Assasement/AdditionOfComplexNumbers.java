package com.Assasement;

public class AdditionOfComplexNumbers {
	int a;
	int b;

	AdditionOfComplexNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void addition(AdditionOfComplexNumbers a, AdditionOfComplexNumbers a1) {
		int x = a.a + a1.a;
		int y = a.b + a1.b;
		System.out.println("the addition of two complex numbers is " + x + "+i" + y);
	}

	public static void main(String[] args) {
		AdditionOfComplexNumbers a = new AdditionOfComplexNumbers(5, 6);
		AdditionOfComplexNumbers a1 = new AdditionOfComplexNumbers(4, 6);
		addition(a, a1);
	}

}
