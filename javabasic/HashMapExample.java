package com.javabasic;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String[] args) {

		String name;
		int age;
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Build HashMap with Details:");
			while (input.hasNext()) {
				name = input.next();
				age = input.nextInt();
				hMap.put(name, age);
			}
			System.out.println("HashMap with Details:");
			hMap.forEach((Name, Age) -> System.out.println("Name: " + Name + " Age:" + Age));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
