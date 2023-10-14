package com.Assasement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LargestAndSmallestWordsInString implements Comparable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		StringTokenizer tokens=new StringTokenizer(s);
		List<String> list=new ArrayList<>();
		
		while(tokens.hasMoreTokens()) {
			list.add(tokens.nextToken());
		}
		System.out.println("the largest word is "+list.get(list.size()-1));
		System.out.println("the smallest word is "+list.get(0));
	}

	@Override
	public int compareTo(Object o) {
		String s1=this.toString();
		String s2=o.toString();
		int n1=s1.length();
		int n2=s2.length();
		if(n1>n2) {
			return +1;
		}else if(n1<n2) {
			return -1;
		}else {
			return 0;
		}
	}

}
