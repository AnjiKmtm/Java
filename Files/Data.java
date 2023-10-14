package com.java.Files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Message {
	{
		System.out.println("select the below options");
		System.out.println("");
		System.out.println("1.Insert the data of Employee");
		System.out.println("2.Retrive the data by using Employee id");
		System.out.println("3.Get the employeees information");
		System.out.println("4.exit");
	}
}

class EmployeeDetails {
	int employeeId;
	String firstName;
	String lastname;
	int salary;


	public int getemployeeId() {
		return employeeId;
	}

	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", salary=" + salary + "]";
	}
}

class EmpOptions {
	public static void insertData() {
		
		EmpOptions e = new EmpOptions();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many Employees data u want to enter");
		int l = sc.nextInt();
		
		List<EmployeeDetails> list=new ArrayList<>();
		Iterator<EmployeeDetails>df=list.iterator();
		HashMap<Integer, EmployeeDetails> map=new HashMap<>();
		while(l>0) {
			EmployeeDetails emp = new EmployeeDetails();
			System.out.println("please mention employee id");
			int n = sc.nextInt();
			emp.setemployeeId(n);
			System.out.println("plese mention first name");
			String s=sc.next();
			emp.setFirstName(s);
			System.out.println("plese enter last name");
			String s1=sc.next();
			emp.setLastname(s1);
			System.out.println("enter the salary");
			int n4=sc.nextInt();
			emp.setSalary(n4);
			list.add(emp);
		    map.put(n, emp);
		l--;
		}	
		System.out.println("Your details are saved");
		Message m=new Message();
		int n1 = sc.nextInt();
		if (n1 == 2) {
			System.out.println("enter Employee id");
			int n2 = sc.nextInt();
     	if (map.values().contains(n1)) {
     	
			}else {
				System.out.println("we dont have employee details");
			}
		} else if (n1 == 3) {
			
			for(EmployeeDetails i : list) {
				System.out.println(i);
			
			}


		} else if (n1 == 4) {
			System.exit(0);
		}
	}
	public static void getDetails() {
		EmpOptions e = new EmpOptions();
		EmployeeDetails e1 = new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Employee Id");
		int n = sc.nextInt();
		if (n == e1.getemployeeId()) {
		} else {
			System.out.println("We don't have Employee Details");
		}
	}

	public static void getEmployeesAllDetails() {
		System.out.println("we dont have any Employee details");
	}
}

public class Data {
	public static void main(String[] args) {
		EmpOptions p = new EmpOptions();
		Scanner sc = new Scanner(System.in);
		Message m = new Message();
		int n = sc.nextInt();
		if (n == 1) {
			p.insertData();

		} else if (n == 2) {
			p.getDetails();

		} else if (n == 3) {
			p.getEmployeesAllDetails();
		} else if (n == 4) {
			System.exit(0);
		}

	}

}
