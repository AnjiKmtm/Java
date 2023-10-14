package com.java.RegularExpressions;

import java.util.regex.Pattern;

public class RegExValidation {
	public static void main(String[] args) {
		boolean b=Pattern.matches("[A-Z]{5}[1-9]{4}[A-Z]{1}","CMHPA1393R");
		System.out.println(b);
		boolean b1=Pattern.matches("[0-9]{2}-[0-9]{2}-[1-9]{4}","10-08-1996");
		System.out.println(b1);
		
		// it should be within 0-9 only
		
		boolean b2=Pattern.matches("[1-31]{1}[1-12]{1}[1-9]{4}","10081996");
		System.out.println(b2);
		
		// "*" means it repeat before elements any number of times
		
		boolean b3=Pattern.matches("[a-z0-9]*@[a-z]{5}.[a-z]{3}", "anjikmtm@gmail.com");
		System.out.println(b3);
		
		// "\d" means digits from [0-9] 
		
		boolean b4=Pattern.matches("[\\d]{10}", "7675814727");
		System.out.println(b4);
		
		// "\D" means any character except digits [0-9]
		
		boolean b5=Pattern.matches("[\\D]{12}", "sdfghjk;'.,/");
		System.out.println(b5);
		
		// "[_]" means any character including space and special characters
		
		
		boolean b6=Pattern.matches("[.]*", "nmn");
		System.out.println(b6);
	
		
	}

}
