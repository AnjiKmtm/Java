package com.webService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pathparam")
public class PathParameter {
	
	@Path("/info/{moviename}/{location}/{cost}")
	@GET()
	@Produces(MediaType.TEXT_PLAIN)
	public String movieinformation(@PathParam("moviename") String moviename, @PathParam("location") String location,
			@PathParam("cost") int cost) {
		if (moviename != null & location != null & cost != 0) {
			System.out.println(moviename + " " + location + " " + cost);
			String username = "Anji";
			String password = "123456789";
			try {

				String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement stmt = conn.prepareStatement("insert into Movie values(?,?,?)");
				stmt.setString(1, moviename);
				stmt.setString(2, location);
				stmt.setInt(3, cost);
				stmt.executeUpdate();

				return "recorded";
			} catch (Exception e) {
				System.out.println("connection failed");
				e.printStackTrace();
				return "error";
			}

		} else {
			return "notrecoreded";
		}

	}

	@Path("/all")
	@GET()
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllMovies() {
		String username = "Anji";
		String password = "123456789";
		try {
			String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt1 = conn.createStatement();
			ResultSet rs = stmt1.executeQuery("select * from Movie");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "   " + rs.getInt(3));
			}

			return "List displayed";
		} catch (Exception e) {
			return "error";
		}

	}

}
