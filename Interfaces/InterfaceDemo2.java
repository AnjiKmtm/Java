package com.java.Interfaces;

public class InterfaceDemo2 implements x {
	public void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		x.display();
		InterfaceDemo2 i = new InterfaceDemo2();
		i.show();
	}
}

interface x {
	
	// we can create static methods in Interface also with implementation.
	
	void show();

	static void display() {
		System.out.println("static");
	}
}