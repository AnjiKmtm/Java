package com.webService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/query")
public class QueryParameter {

	@Path("/info")
	@GET()
	@Produces(MediaType.APPLICATION_XML)
	public String movieinformation(@QueryParam("moviename") String moviename, @QueryParam("location") String location,
			@QueryParam("cost") int cost) throws Exception{
		if (moviename != null & location != null & cost != 0)  {
			String username = "Anji";
			String password = "123456789";
			try {
				String url = "jdbc:sqlserver://DESKTOP-NL05O6V;databaseName=sum;IntegratedSecurity=true;encrypt=false";
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("insert into Movie values('bahubali','uppal',200)");
			} catch (Exception e) {
				System.out.println("connection failed");
				e.printStackTrace();
			}
			return "<result><status>Recorded</status></result>";
		} else {
			return "<result><status>notRecorded</status></result>";
		}
	}

}