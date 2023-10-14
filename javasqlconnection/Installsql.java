package javasqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Installsql {
	public static void main(String[] args) {
		String username = "Anji";
		String password = "123456789";
		try {
			String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();

//			stmt.executeUpdate("create database organisation");
//			stmt.executeUpdate("drop database anji");
//			stmt.executeUpdate("insert into fruits3 Values(1,'mango',40)");
//			stmt.executeUpdate("insert into EmployeesInforamation values(107,'sugu',1000)");

//	    ResultSet rs=stmt.executeQuery("SELECT [Employee Name],[Employee Salary] FROM EMPLOYEESINFORAMATION");
//	    ResultSet rs=stmt.executeQuery("SELECT Distinct [Employee Salary] FROM EMPLOYEESINFORAMATION");
//    	ResultSet rs=stmt.executeQuery("SELECT count (distinct[Employee Salary]) FROM EMPLOYEESINFORAMATION");
//      ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEESINFORAMATION where [employee salary]=12000");
//      ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEESINFORAMATION where [Employee salary]=12000 And [Employee Name]='vishal'");
//	    ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEESINFORAMATION where [Employee salary]=12000 or [Employee Name]='anji'");
//	    ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEESINFORAMATION order by [employee name]");
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEESINFORAMATION order by [employee name]desc");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}

	}
}
