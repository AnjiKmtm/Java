package com.java.Object;

public class TypeCastingDemo {
	public static void main(String[] args) {

		// downcasting

		long l = 19;
		int a = (int) l;
		System.out.println(a);

		// upcasting

		int b = 10;
		long c = (long) b;
		System.out.println(c);

		// valueof() method convert primitive to wrapper object

		Long i = Long.valueOf(105);
		long l1 = Integer.valueOf(10);
		System.out.println(l1);

		// value() for convert wrapper object to primitive

		Integer x = 123;
		int y = x.intValue();
		System.out.println(y);

		// parseXXX() used to convert string to primitive type

		int j = Integer.parseInt("3");
		System.out.println(j);

		// Autoboxing
		// autoboxing internally uses valueof() method

		Integer m = 10;
		System.out.println(m);

		// Autounboxing
		// autounboxing internally uses value() method

		Integer z = new Integer(10);
		int z1 = z;
		System.out.println(z1);
	}

}
