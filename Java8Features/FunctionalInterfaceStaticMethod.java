package com.java.Java8Features;

public class FunctionalInterfaceStaticMethod {
	public static void main(String[] args) {
		interface3 i3 = () -> System.out.println("display");
		i3.display();
		i3.same();
		interface3.show();
	}
}

@FunctionalInterface
interface interface3 {
	public static void show() {
		System.out.println("show");
	}

	public void display();
	default void same() {
		System.out.println("same");
	}

}