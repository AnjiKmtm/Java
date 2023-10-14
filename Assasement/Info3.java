package com.Assasement;

import java.util.HashMap;
import java.util.Scanner;

public class Info3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of hash map");
		int n = sc.nextInt();
		HashMap<Integer, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			System.out.println("enter each pair");
			System.out.println("enter the key");
			int n1 = sc.nextInt();
			System.out.println("enter the value");
			String s = sc.next();
			map.put(n1, s);
		}
		
		// retrive value using key
		
		System.out.println("enter the key value");
		int n2=sc.nextInt();
		System.out.println(map.get(n2));
		
		// check whether given pair is present or not
		
		System.out.println("enter the key value pair whether it is in the list or not");
		System.out.println("enter key");
		int n3=sc.nextInt();
		System.out.println("enter the value");
		String s1=sc.next();
		if(map.containsKey(n3)&map.containsValue(s1)) {
			System.out.println(n3+"="+s1+"key value pair is present");
		}else {
			System.out.println("key value pair is not present");
		}
		
		// retrive all keys present in the hashmap
		
		System.out.println(map.keySet());
		
		//remove the key-value pair from hashmap
		
		System.out.println("enter the key value pair to remove the elements");
		System.out.println("enter key");
		int n4=sc.nextInt();
		System.out.println("enter the value");
		String s2=sc.next();
		if(map.containsKey(n4)&map.containsValue(s2)) {
			map.remove(n4, s2);
		}else {
			System.out.println("key-value pair not present in the hashmap");
		}
		System.out.println(map);
sc.close();
	}

}
