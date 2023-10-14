package com.java.Assaaignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeneratingOfID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the first name");
		String s1 = sc.next();
		System.out.println("enter the last name");
		String s2 = sc.next();
		System.out.println("enter the pin number");
		int n = sc.nextInt();
		System.out.println("enter the number which should be less than length of the pin");
		int n1 = sc.nextInt();
		String s3 = null;
		if (s1.length() < s2.length()) {
			String smallName = s1;
			String largeName = s2;
			s3 = smallName.substring(s1.length() - 1) + largeName;
		} else if (s1.length() > s2.length()) {
			String smallName = s2;
			String largeName = s1;
			s3 = smallName.substring(s2.length() - 1) + largeName;
		} else {
			String[] s4 = { s1, s2 };
			Arrays.sort(s4);
			String smallName = s4[0];
			String largeName = s4[1];
			s3 = smallName.substring(s4[0].length() - 1) + largeName;
		}
		List<Integer> l = new ArrayList<>();
		while (n > 0) {
			int a = n % 10;
			l.add(a);
			n = n / 10;
		}
		Collections.reverse(l);
		String s5 = "";
		for (int i = 0; i < s3.length(); i++) {
			char c = s3.charAt(i);
			if (c>= 97 & c <= 122) {
				c = (char) (s3.charAt(i) - (char)32);

			} else {
				c = (char) (s3.charAt(i) +(char) 32);
			}
			s5 = s5 + c;
		}
		String s6 = s5 + l.get(n1 - 1) + l.get(l.size() - n1);

        System.out.println(s6);
	}

}
