/*import java.sql.*;

class JDBCSelectQuery{
	public static void main(String args[])throws SQLException, ClassNotFoundException{
	
	String driverClassName = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/student";
	String username = "postgres";
	String password = "postgres";
	String query = "SELECT name FROM student WHERE city='nasik'";
	
	
	Class.forName(driverClassName);
	
	Connection con = DriverManager.getConnection(url,username,password);
	
	Statement st = con.createStatement();
	
	boolean result = st.execute(query);
	System.out.println("No of statements affected by this query :"+ result);
	st.close();
	con.close();
	}
}*/


import java.sql.*;
  
public class JDBCSelectQuery {
    
    public static void main(String args[])
        throws SQLException, ClassNotFoundException
    {
        String driverClassName
            = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/student";
        String username = "postgres";
        String password = "postgres";
        String query = "SELECT * FROM student WHERE city='Nasik'";
			
			
  
        // Load driver class
        Class.forName(driverClassName);
  
        // Obtain a connection
        Connection con = DriverManager.getConnection(
            url, username, password);
  
        // Obtain a statement
        Statement st = con.createStatement();
		
		
  
        // Execute the query
        
		 ResultSet rs = st.executeQuery(query);
		  while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.println(", City: " + rs.getString("city"));
         }
		//System.out.println("No of statements affected by this query :"+rs );
  
        // Closing the connection as per the
        // requirement with connection is completed
		st.close();
        con.close();
    }
}
  

