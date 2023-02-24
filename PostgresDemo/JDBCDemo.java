import java.sql.*;
  
public class JDBCDemo {
    
    public static void main(String args[])
        throws SQLException, ClassNotFoundException
    {
        String driverClassName
            = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/student";
        String username = "postgres";
        String password = "postgres";
        String query
            = "INSERT INTO student VALUES (3,'Hiray',45,'Chennai')";
		String query1
            = "INSERT INTO student VALUES (2,'Rutuja',30,'Nasik')";
		String query2
            = "INSERT INTO student VALUES (1,'Sud',25,'Pune')";
			
			
  
        // Load driver class
        Class.forName(driverClassName);
  
        // Obtain a connection
        Connection con = DriverManager.getConnection(
            url, username, password);
  
        // Obtain a statement
        Statement st = con.createStatement();
		
		
  
        // Execute the query
        int count = st.executeUpdate(query);
		int count1 = st.executeUpdate(query1);
		int count2 = st.executeUpdate(query2);
        System.out.println(
            "number of rows affected by this query= "
            + count  + " " + count1 + " " + count2);
  
        // Closing the connection as per the
        // requirement with connection is completed
		st.close();
        con.close();
    }
}
  

