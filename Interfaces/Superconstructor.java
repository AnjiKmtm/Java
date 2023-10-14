package com.java.Interfaces;

abstract class main {
	int x = 20;
	public String name;
	public String email;
	public int id;

	public main(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	static void show() {
		System.out.println("show");
	}

	public String toString() {
		return name + " " + email + " " + id;
	}
}

class Super extends main {
	int x = 10;

	void show1() {
		System.out.println("show1");
	}

	void thisusage() {
		int x = 1;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.show();
		this.show1();
	}

	private int number;

	Super(String name, String email, int id, int number) {
		super(name, email, id);
		this.number = number;
	}

	public String toString() {
		return name + " " + email + " " + id + " " + number + " ";
	}
}

public class Superconstructor {
	public static void main(String[] args) {
		Super s = new Super("havi", "a@gmail.com", 123, 767581);
		System.out.println(s);
		s.thisusage();
	}
}