

public class UpdateQuery {
	public  void updateQuery(String empId,String name){

		String Query = "UPDATE \"EmployeeData\" SET name= "+name+"	WHERE \"empId\"=\'"+empId+"\'";
		System.out.println(Query);
		try{
			EmpData.st = EmpData.con.createStatement();
			int count=EmpData.st.executeUpdate(Query);
			System.out.println(
					"number of rows affected by this query= "
							+ count );
		}catch(Exception e){
			System.out.println("");
		}		

	}

}
