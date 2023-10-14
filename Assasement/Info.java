package com.Assasement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import com.Assasement.Exceptionn;

class EmployeeDetails {
	int id;
	String name;
	String Createdate;
	String DOB;
	int age;

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

	public String getCreatedate() {
		return Createdate;
	}

	public void setCreatedate(String createdate) {
		Createdate = createdate;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", Createdate=" + Createdate + ", DOB=" + DOB + ", age="
				+ age + "]";
	}

}

public class Info {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, EmployeeDetails> map = new HashMap<>();
		System.out.println("how many members u want to add");
		int l = sc.nextInt();
		while (l > 0) {
			EmployeeDetails emp = new EmployeeDetails();
			System.out.println("enter the employee id ");
			int n = sc.nextInt();
			System.out.println("enter the Employee name ");
			String n1 = sc.next();
			emp.setName(n1);

			System.out.println("enter the creating date ");
			String n2 = sc.next();
			emp.setCreatedate(n2);

			System.out.println("enter the employee Dob ");
			String n3 = sc.next();
			emp.setDOB(n3);
			System.out.println("enter the emloyee age ");
			int n4 = sc.nextInt();
			emp.setAge(n4);
			map.put(n, emp);
			l--;
		}
		List<Map.Entry<Integer, EmployeeDetails>> list = new ArrayList<>(map.entrySet());
		Mycomparator0 m=new Mycomparator0();
		Collections.sort(list,m );
		System.out.println(list);
		System.out.println(map);
		System.out.println(map.entrySet());

		for (Map.Entry<Integer, EmployeeDetails> z : map.entrySet()) {
			String username = "Anji";
			String password = "123456789";
			try {
				String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
				Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement stmt = conn.prepareStatement("insert into EmployeeDetails values(?,?,?,?,?)");
				stmt.setInt(1, z.getKey());
				stmt.setString(2, z.getValue().getName());
				stmt.setString(3, z.getValue().getCreatedate());
				stmt.setString(4, z.getValue().getDOB());
				stmt.setInt(5, z.getValue().getAge());
				stmt.executeUpdate();
				Statement stmt1=conn.createStatement();
				ResultSet rs=stmt1.executeQuery("select * from employeedetails");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3)+" "+rs.getString(4)+rs.getInt(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}

class Mycomparator0 implements Comparator<Map.Entry<Integer, EmployeeDetails>> {

	@Override
	public int compare(Entry<Integer, EmployeeDetails> o1, Entry<Integer, EmployeeDetails> o2) {
		
		return o2.getValue().getCreatedate().compareTo(o1.getValue().getCreatedate()); 
	}

	

}