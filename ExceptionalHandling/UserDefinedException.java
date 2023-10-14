package com.java.ExceptionalHandling;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		try {
		if(age==18) {
			throw new Marriage("ready to marriege");
		}else {
			throw new Marriage("wait for some more time");
		}	}
		catch(Marriage e) {
			System.out.println(e.getMessage());
		}
	}
}
class Marriage extends RuntimeException {
	Marriage(String s){
		super(s);
	}
}