package com.java.Java8Features;

public class FunctionalInterfaceUsingReturnType {
	public static void main(String[] args) {
		interface2 i2=(a,b)-> a+b;
		int result =i2.sum(12, 12);
		System.out.println(result);
		i2.division(19, 5);
		
	}
}
@FunctionalInterface
interface interface2{
	public int sum(int a,int b);
	default void division(int c, int d) {
		System.out.println(c/d);
	}
	
}