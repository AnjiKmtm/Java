package com.java.Java8Features;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String[] s=new String[15];
		Optional<String > s1=Optional.ofNullable(s[5]);
		if(s1.isPresent()) {
			System.out.println(s[5].length());
		}else {
			System.out.println("it is empty");
		}
	}

}
