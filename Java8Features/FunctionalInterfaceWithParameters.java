package com.java.Java8Features;

public class FunctionalInterfaceWithParameters {
	public static void main(String[] args) {
		interface1 i1 = (int c, int d) -> System.out.println(c * d);

		i1.multiply(10, 12);
		i1.add(123, 0);

	}
}

@FunctionalInterface
interface interface1 {
	void multiply(int c, int d);

	default void add(int x, int y) {
		System.out.println(x + y);
	}
}