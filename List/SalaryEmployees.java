package com.java.assaignment.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalaryEmployees {
	public static void main(String[] args) {

		Employee emp1 = new Employee("anji", 101, 25000);
		Employee emp2 = new Employee("sugu", 102, 35000);
		Employee emp3 = new Employee("vishal", 103, 45000);
		Employee emp4 = new Employee("havi", 104, 15000);
		List<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		System.out.println("the Highest salary employee is " + al.get(0));
		System.out.println("the second highest salary employee is " + al.get(1));
		System.out.println("the lowest salary employee is " + al.get(al.size() - 1));

	}
}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		Double d1 =  e1.getSalary();
		Double d2 =  e2.getSalary();

		return d2.compareTo(d1);
	}
}
class Employee {
	private String name;
	private int id;
	private int salary;

	public Employee(String Name, int Id, int Salary) {
		name = Name;
		id = Id;
		salary = Salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return name + " " + id + " " + salary;
	}
}