package com.javabasic.abstraction;

 public class Methodmain {
	public static void main(String[] args) {
		car c = new car();
		c.noofWheels();
		Jcb j = new Jcb();
		j.company();
	}

}

abstract class Abstract {
	abstract void design();

	abstract void company();

	void noofWheels() {
		System.out.println("no of wheels are 4");
	}
}

class car extends Abstract {
	void design() {
		System.out.println("the shape is like rectangle");
	}

	void company() {
		System.out.println("manufactured by tata");
	}
}

class Jcb extends Abstract {
	void design() {
		System.out.println("the shape is just like square");
	}

	void company() {
		System.out.println("manufactured by ashoklayland");
	}
}
