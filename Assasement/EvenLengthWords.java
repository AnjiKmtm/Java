package com.Assasement;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenLengthWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s1=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens()) {
			String s2=st.nextToken();
			if((s2.length())%2==0) {
				System.out.println(s2);
			}
		}
	}

}
