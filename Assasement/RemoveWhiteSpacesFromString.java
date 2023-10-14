package com.Assasement;

import java.util.Scanner;

public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
        s=s.replace(" ", "");
        System.out.println(s);
	}

}
