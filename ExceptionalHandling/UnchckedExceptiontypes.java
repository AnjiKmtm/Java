package com.java.ExceptionalHandling;

public class UnchckedExceptiontypes {
	public static void main(String[] args) {

		// NullPointer Exception

		String s = null;
		System.out.println(s.length());

		// arithmetic exception

		int a = 10;
		int b = 0;
		System.out.println(a/b);

		// Arrayindexoutofbound exception

		int[] c = new int[4];
		System.out.println(c[0]);
		System.out.println(c[5]);
		
		//Stringindexoutofbound exception
		
		String s1="havi";
		System.out.println(s1.charAt(6));

		
		//Number format exception
		
		String s2="ten";
		System.out.println(Integer.parseInt(s2));
		
		// classcast exception
		// we can't use parent object reference to child object
		
		Object o=new Object();
		String s5=(String)o;
		System.out.println("true");
		}
		
	}

