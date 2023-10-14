package com.java.Training.Assignments;

import java.util.Scanner;

public class DeleteWhiteSpaces {
public static void  main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String s1=s.trim();
	String s2=s.replace(" ", "");
	
	System.out.println(s2.toString());
}
}
