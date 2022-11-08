import java.sql.*;
 class JDBCUpdateQuery{ 
    
    public static void main(String args[])
        throws SQLException, ClassNotFoundException
    {
        String driverClassName
            = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/student";
        String username = "postgres";
        String password = "postgres";
        String query = "update student set name='rut' WHERE city='Pune'";
			
			
  
        // Load driver class
        Class.forName(driverClassName);
  
        // Obtain a connection
        Connection con = DriverManager.getConnection(
            url, username, password);
  
        // Obtain a statement
        Statement st = con.createStatement();
		
		
  
        // Execute the query
        
		 int count = st.executeUpdate(query);
		   System.out.println(
            "number of rows affected by this query= "
            + count );
		st.close();
        con.close();
    }
}
  