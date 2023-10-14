package com.java.assaignment.List;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> l= new LinkedList<>();
	l.add("havi");
	l.add("solu");
	l.add("hyd");
	l.add("insurance");
	l.add("banking");
	l.remove(0);
	System.out.println(l.get(0));
	System.out.println(l);
}
}
