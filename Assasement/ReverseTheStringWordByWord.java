package com.Assasement;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseTheStringWordByWord {
	public static void main(String[] args) {
		String s3 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		StringTokenizer tokens = new StringTokenizer(s);
		while (tokens.hasMoreTokens()) {
			String s1 = tokens.nextToken();
			char[] ch = s1.toCharArray();
			String s2 = "";
			for (int i = (s1.length() - 1); i >= 0; i--) {
				s2 = s2 + ch[i];
			}
			s3 = s3 + s2 + " ";
		}
		System.out.println("Reverse of the Strings word by word is --" + s3);
	}

}
