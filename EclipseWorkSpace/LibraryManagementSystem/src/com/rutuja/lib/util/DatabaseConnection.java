package com.rutuja.lib.util;
import java.sql.*;
public class DatabaseConnection {
	
	static Connection con = null;
	static  Statement st = null;
	public static void databaseConnection(){
	
		String driverClassName
            = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/EclipseLibrary";
        String username = "postgres";
         String password = "postgres";
        
			
			
  
        // Load driver class
		try{
        Class.forName(driverClassName);
		
        // Obtain a connection
	
         con = DriverManager.getConnection(
            url, username, password);
		}catch(Exception e){
			System.out.println("Exception occured" +e.getMessage());
		}
        
	}
	
	public static void selectQuery(){
		String Query = "SELECT * FROM Books";
		System.out.println(Query);
		try{
		st = con.createStatement();
		int count=st.executeUpdate(Query);
		System.out.println(
            "number of rows affected by this query= "
            + count );
		}catch(Exception e){
			System.out.println("");
		}		
		
	}

}
