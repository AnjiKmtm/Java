package com.java.Training.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfTimesCharacterRepeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();
		char[] c = s.toCharArray();
		List<Character> al=new ArrayList<>();
		List<Character> al1=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			al.add(c[i]);
			if(!al1.contains(c[i])) {
			al1.add(c[i]);
			}
		}
		for(int i=0;i<al1.size();i++) {
			int count=0;
			for(int j=0;j<al.size();j++) {
				if(al1.get(i).equals(al.get(j))) {
					count++;
				}
			}
			System.out.println(al1.get(i)+" is "+ count+" times repeated");
		}
		
	}

}
