package com.Assasement;

import java.util.Scanner;

public class Permutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j <ch.length; j++) {
				if (i != j) {
					s1 = s1 + ch[j];
				}
			}
			System.out.println(ch[i]+s1);
		}
	}

}
