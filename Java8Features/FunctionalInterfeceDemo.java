package com.java.Java8Features;

public class FunctionalInterfeceDemo {

	public static void main(String[] args) {
		FunctionalinterfaceExample f = () -> System.out.println("hii");
		f.add();
		System.out.println(f.multiply(10, 0));

	}
}

@FunctionalInterface
interface FunctionalinterfaceExample {
	public void add();

	public default int multiply(int c, int d) {
		return c * d;

	}

}