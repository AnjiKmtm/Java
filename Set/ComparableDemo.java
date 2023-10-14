package com.java.Set;

import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
	
		TreeSet<Employee> treeSet = new TreeSet<>();
		Employee emp1=new Employee(123, "havi", "hyd");
		Employee emp2=new Employee(142, "wipro", "chennai");
	    Employee emp3=new Employee(96, "tcs", "delhi");
	   treeSet.add(emp1);
	   treeSet.add(emp2);
	   treeSet.add(emp3);
	   System.out.println(treeSet);
	}

}

class Employee implements Comparable<Employee>{
	public int id;
	private String name;
	private String location;

	Employee(int Id, String Name,String Location){
		id=Id;
		name=Name;
		location=Location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String toString() {
		return id+" "+name+" "+location;
	}

	@Override
	public int compareTo(Employee o) {
		Integer i1=(Integer)this.getId();
		Integer i2=(Integer)o.getId();
		return i2.compareTo(i1) ;
	}

     // descending order of the names 
	
//	public int compareTo(Employee o) {
//		
//		return o.getName().compareTo(this.getName());
//	}

	
	// ascending order of the name
	
//public int compareTo(Employee o) {
//		
//		return this.getName().compareTo(o.getName());
//	}

	
	// ascending order of the location
	
//public int compareTo(Employee o) {
//		
//		return this.getLocation().compareTo(o.getLocation());
//	}

	
	// Descending order of the id's
	
//public int compareTo(Employee o) {
//		if(this.getId()>o.getId()) {
//			return -1;
//		}else if(this.getId()<o.getId()) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
	
	// Ascending order of the id's
	
//	public int compareTo(Employee o) {
//		if(this.getId()>o.getId()) {
//			return 1;
//		}else if(this.getId()<o.getId()) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
//	
	
	
	// no need of get method
	
//public int compareTo(Employee o) {
//		
//		return name.compareTo(o.name);
//	}
}

	