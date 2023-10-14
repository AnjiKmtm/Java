package com.javabasic.encapsulation;

public class EncapsulationDemo1 {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.setId(101);
		e1.setName("vishnu");
		e1.setOrg("havi");
		e1.setSalary(40000);
		Employees e2 = new Employees();
		e2.setName("rohan");
		e2.setId(102);
		e2.setOrg("havi");
		e2.setSalary(45000);
		System.out.println(e1);
		System.out.println(e2);
	}


}

class Employees {
	private int id;
	private String name;
	private String org;
	private long Salary;

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}
	public String toString() {
		return id+" "+name+" "+org;
	}

}

