package javasqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DifferentQueriesInSQL {
	public static void main(String[] args) {
		String username = "Anji";
		String password = "123456789";
		try {
			String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();

			// for Creating database

//			stmt.executeUpdate("create database test");

			// for delete the database

//			stmt.executeUpdate("drop database test");

			// for creating a table and insert values into the table

//          	stmt.executeUpdate("create table bikes(car varchar(50),cost int,location varchar(50))");
//          	stmt.executeUpdate("insert into bikes values('tata',12000,'hyd')");

			// create a new table using another table

//			stmt.executeUpdate("create table tractors as SELECT cost,location from bikes");
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
