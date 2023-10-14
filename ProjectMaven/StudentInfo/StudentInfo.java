package com.ProjectMaven.StudentInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInfo {
	
	
	@Id
	long id;
	String name;
	String city;
	int age;
	
	public StudentInfo(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	
	public StudentInfo() {

	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	
	
}
