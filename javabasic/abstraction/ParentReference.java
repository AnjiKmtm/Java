package com.javabasic.abstraction;

public class ParentReference {
	public static void main(String[] args) {

		// we can't call child methods with parent reference

		base b = new Derived();
		b.show();

	}

}

class base {
	public void show() {
		System.out.println("hi");
	}
}

class Derived extends base {
	public void show() {
		System.out.println("display");
	}
}