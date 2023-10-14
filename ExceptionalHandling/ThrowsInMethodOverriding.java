package com.java.ExceptionalHandling;

public class ThrowsInMethodOverriding extends parent {

	// if parent class throws one exception the child class should throw Same
	// exception or child class exception or no need of any exception
	// if child class throws one exception , parent class should throw same
	// exception or super type Exception
	// child class can extend unchecked exception without any exception in the
	// parent class

	@Override
	public void show() {
		System.out.println("showw");
	}

	public static void main(String[] args) {

		ThrowsInMethodOverriding th = new ThrowsInMethodOverriding();
		th.show();
	}
}

class parent {
	public void show() throws Exception {
		System.out.println("hi");
	}
}
