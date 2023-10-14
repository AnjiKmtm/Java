package com.javabasic.encapsulation;

public class Demo {
	public static void main(String[] args) {
		
	Demo1 d=new Demo2();
	d.show();
	}
}
class Demo1{
	public void show() {
		System.out.println("hi");
	}
}
class Demo2 extends Demo1{
	public void display() {
		System.out.println("hello");
	}
}
