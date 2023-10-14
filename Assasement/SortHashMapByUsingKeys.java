package com.Assasement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByUsingKeys {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "rohan");
		map.put(107, "vishnu");
		map.put(108, "salman");
		map.put(105, "shiva");
		map.put(103, "kavya");
		map.put(102, "prathibha");
		System.out.println(map);
		ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Mycomparator());
		System.out.println(list);

	}

}

class Mycomparator implements Comparator<Map.Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		return o2.getKey().compareTo(o1.getKey());
//		return o1.getValue().compareTo(o2.getValue());
	}

}
