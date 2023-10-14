package com.javabasic;

public class InheritanceDemo {
	public static void main(String[] args) {
		Poly p=new Poly();
		p.giant(4);
		p.wizard(5);
	}		
	}
class Inheritance{
	public void wizard(int x) {
		System.out.println("wizard");
	}
}


class Poly extends Inheritance {
	public void giant(int y) {
		System.out.println("giant");

	}
}
