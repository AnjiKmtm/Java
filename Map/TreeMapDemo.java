package com.java.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo implements Comparable{
	public static void main(String[] args) {
	
		TreeMap<Integer,String > map=new TreeMap<Integer,String>();
	
 		map.put(5, "havi");
		map.put(1, "vishnu");
		map.put(2, "vishal");
		map.put(3, "kavya");
		map.put(4, "rohan");
		map.put(0, "shiv");
		map.put(10,null);
		map.put(6, "prathiba");
		System.out.println(map);
	}

	@Override
	public int compareTo(Object o) {
		
		return ((TreeMapDemo) o).compareTo(this);
	}
	

}
