import java.sql.ResultSet;
import java.util.*;
import java.sql.*;
public class EmpData {
	static List<Employee> employee = new ArrayList<>();
	static Connection con = null;
	static  Statement st = null;
	public static void main(String args[]) {
		databaseConnection();
		employee=emp();	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		String empid=sc.next();
		System.out.println("Enter employee name:");
		String ename=sc.next();

		UpdateQuery update=new UpdateQuery();
		update.updateQuery(empid, ename);
		System.out.println(update);
	}

	public static void databaseConnection() {
		String driverClassName
		= "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/EmployeeData";
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

	public static List<Employee> emp(){

		//	List<Employee> emp=new ArrayList<>();
		String selectQuery = "SELECT * FROM  \"EmployeeData\"";



		try{
			st = con.createStatement();
			ResultSet rs = st.executeQuery(selectQuery);

			while(rs.next()){
				String empId = rs.getString("empId");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				System.out.println("Employee id:" +rs.getString("empId"));
				System.out.println("Employee Name:" +rs.getString("name"));
				System.out.println("Employee Age:" +rs.getInt("age"));

				System.out.println(empId);
				Employee employe=new Employee(empId,name,age);
				employee.add(employe);


			}  

		}catch(Exception e){
			System.out.println("");
		}	
		System.out.println(employee);
		return employee;
	}



}