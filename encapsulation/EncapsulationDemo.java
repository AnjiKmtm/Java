package com.javabasic.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
	
		System.out.println(e);
		e.setRollno(14);
		System.out.println(e.getRollno());
	}
}

class Encapsulation {

	private int roll;
	private String name;
	public String college="havi";

	public int getRollno() {
		return roll;
	}

	public void setRollno(int rollno) {
		roll = rollno;

	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return name + " " + roll + " " + college;
	}
}
