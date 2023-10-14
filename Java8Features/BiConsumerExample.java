package com.java.Java8Features;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> b=(i1,i2)->System.out.println(i1.floatValue()+" "+i2.floatValue());
		b.accept(10, 12);
		BiConsumer<String, Integer> b1=(s,i)->System.out.println(s.length()+" "+i.SIZE);
	}

}
