package com.java.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Set<Integer> l1=l.stream().filter(i->(i!=5)).collect(Collectors.toSet());
		System.out.println(l1);
		Object l2=l.stream().min((i1,i2)->i1.compareTo(i2));
		System.out.println(l2);
		Optional<Integer> l3=l.stream().max((i1,i2)->i1.compareTo(i2));
		
		
	}

}
