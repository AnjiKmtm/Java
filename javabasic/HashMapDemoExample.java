package com.javabasic;

import java.util.*;

class Employee {
	public int id;
	public String name;
	public String city;
	public String date;
	public String dob;
	public int age;

	public Employee(String name, String city, String date, String dob, int age) {

		this.name = name;
		this.city = city;
		this.date = date;
		this.dob = dob;
		this.age = age;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " " + city + "   " + date + "  " + dob + "  " + age + " \n";

	}
}

public class HashMapDemoExample {
	public static void main(String[] args) {

		HashMap<Integer, Employee> m = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee("Ravi", "Delhi", "1-1-2000", "1-1-1990", 10);
		m.put(10, emp1);
		Employee emp2 = new Employee("Raj", "Mumbai", "1-1-2001", "1-1-1991", 11);
		m.put(6, emp2);
		Employee emp3 = new Employee("Rekha", "Chennai", "1-1-2002", "1-1-1992", 12);
		m.put(8, emp3);

		Employee emp4 = new Employee("Ram", "Siliguri", "1-1-2003", "1-1-1993", 14);
		m.put(3, emp4);
		System.out.println(m);
		List<Map.Entry<Integer, Employee>> list = new ArrayList<>(m.entrySet());

		Collections.sort(list, new MyComparator1());
		System.out.println(list);
	}
}

class MyComparator1 implements Comparator<Map.Entry<Integer, Employee>> {
	public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
		return e1.getValue().getCity().compareTo(e2.getValue().getCity());

	}

}
