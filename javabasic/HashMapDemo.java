package com.javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo  {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(8, "Three");
		map.put(5, "Five");
		map.put(2, "Seven");
		map.put(9, "Nine");
		System.out.println(map);
	
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list,new MyComparator());

	}

}

class MyComparator implements Comparator<Map.Entry<Integer, String>> {

	public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
		return e2.getKey().compareTo(e1.getKey());

	}

}