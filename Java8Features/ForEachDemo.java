package com.java.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(9);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("using forEach");
		list.forEach(Integer->System.out.println(Integer));
		
	}

}
