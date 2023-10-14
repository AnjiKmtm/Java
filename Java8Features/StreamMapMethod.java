package com.java.Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapMethod {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("havi");
		l.add("anji");
		l.add("vishnu");
		l.add("kavya");
		l.add("salman");
		l.add("shiva");
		l.add("vishnu");
		l.add("kavya");
		l.add("salman");
		l.add("shiva");
		l.forEach(i -> System.err.println(i));
		List<String> s1 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		Set<String> s2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet());
		System.out.println(s2);
		Set<String> s3 = l.stream().filter(s -> s.endsWith("a")).collect(Collectors.toSet());
		System.out.println(s3);
		Long s4 = l.stream().filter(s -> s.startsWith("s")).collect(Collectors.counting());
		System.out.println(s4);
		Long s5 = l.stream().filter(s -> s.startsWith("s")).count();
		System.out.println(s5);
		List<String> s6 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(s6);
		Optional<String> s7 = l.stream().min((i1, i2) -> i1.compareTo(i2));
		System.out.println(s7);
		Comparator<String> s8 = (i1, i2) -> i2.compareTo(i1);
		Optional<String> min = l.stream().min(s8);
		System.out.println(min);
		Optional<String> max = l.stream().max(s8);
		System.out.println(max);

	}
}