package com.java.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set; 

public class HashMapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "vishnu");
		map.put(2, "rohan");
		map.put(6, "kavya");
		map.put(3, "vishal");
		map.put(3, "havi");
		map.put(null, "shiva");
		map.put(null, "shica");
		map.put(9, "rohan");
		System.out.println();
		System.out.println(map);
		
		Set<Entry<Integer,String>> set=map.entrySet();
		for (Entry<Integer, String> entry : set) {
		System.out.println(entry);
		
	}
}
	
}
