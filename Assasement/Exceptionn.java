package com.Assasement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exceptionn {
		public static void main(String[] args) {
			String username = "Anji";
			String password = "123456789";
			try {
				String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(url);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}