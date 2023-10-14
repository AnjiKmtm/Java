package com.java.String;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		try {
			String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
			java.sql.Connection conn = DriverManager.getConnection(url);
			System.out.println("connection is sucessful");

		} catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}

	}

}
