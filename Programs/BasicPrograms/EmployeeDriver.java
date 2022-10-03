import java.util.*;
class EmployeeDriver{
	public static void main(String args[]){
		List<Employee> list = new ArrayList<Employee>();
		Map<String,Employee> skillSetMap = new HashMap<String,Employee>();			
			Map<String,Employee> workRespoMap = new HashMap<String,Employee>();	
			
		
		System.out.println("Enter details for user:");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<2;i++){
			System.out.println("Enter name of Employee :" +(i+1));
			String name= s.next();
			System.out.println("Enter age of Employee " +(i+1));
			int age= s.nextInt();
			System.out.println("Enter employee ID of Employee " +(i+1));
			int e_id= s.nextInt();
			System.out.println("Enter Contact number of Employee " +(i+1));
			int contact_no= s.nextInt();
			
			List<String> skillset = new ArrayList<String>();
			
			List<String> workrespo = new ArrayList<String>();
		
			for(int j=0;j<2;j++){
				System.out.println("Enter the SkillSet"+(j+1)+" for Employee :" +(i+1));
				String skillset1=s.next();
		
				skillset.add(skillset1);
				
				
				System.out.println("Enter the Work Responsiblities "+(j+1)+" for Employee :" +(i+1));
				String workresponsiblity=s.next();
				
				
				workrespo.add(workresponsiblity);
			}
			Employee emp = new Employee(name,age,e_id,contact_no,skillset,workrespo);
			
			System.out.println("Enter primary skillset for employee");
			String skill= s.next();
			skillSetMap.put(skill,emp);
			
			
			System.out.println("Enter primary Work respo for employee");
			String work= s.next();			
			workRespoMap.put(work,emp);
			
			
			list.add(emp);
			
			
			
		}
		System.out.println("\n\n Employee details are as follows:");
		for(int k=0;k<list.size();k++){
			System.out.println(list.get(k));
		}
		System.out.println("Skillset :" +skillSetMap);
		System.out.println("WorkRespo :" +workRespoMap);
		
		System.out.println("Enter the skillset that you want to search :");
		String skills=s.next();
		System.out.println(""+skillSetMap.get(skills));
		
			System.out.println("Enter the workrespo that you want to search :");
		String workRespo=s.next();
		System.out.println(""+workRespoMap.get(workRespo));
	}
}