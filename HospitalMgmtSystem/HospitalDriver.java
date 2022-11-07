class HospitalDriver{
	static List<Doctor> doctorList = new ArrayList<>();
	static List<Patient> patientList=new ArrayList<>();
	public static void main(String args[]){
		listOfDoctors();
		
		HospitalDriver hd=new HospitalDriver();
		hd.hospitalOpetations();
	}
	
	public void hospitalOpetations(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice to perform following operations");
		System.out.println("1.Check list of Patients:");
		System.out.println("2.Generate Bill of patient:");
		System.out.println("3.Previous Medical history details:");
		System.out.println("4.Check list of Doctors:");
		System.out.println("Select from above:");
		int choice=s.nextInt();
		List<String> existingList = null;
		
		switch(choice){
			case 1:
					System.out.println("Check list of patients :");
					for(int i=0;i<patientList.size();i++){
						Patient patient=patientList.get(i);
						
							System.out.println("List of all patient is " +patient.toString());
					}
					
					break;
			case 2:
					System.out.println("Generate bill of patient");
					System.out.println("Enter the patient ID:");
					int patientid=s.nextInt();
					boolen repeatingPatientFlag=false;
					for(int i=0;i<patientList.size();i++){
						Patient patient=patientList.get(i);
						
						if(patient.getPatientId().equals(patientid)){
							// THe bill for the patient is:100;
							repeatingPatientFlag=true;
						}
					}
					if(!repeatingPatientFlag){
						//the bill for the patient is : 200
						System.out.println("Enter ID of patient");
						int patientId=s.nextInt();
						System.out.println("Enter patientName ");
						String patientName=s.next();
						System.out.println("Enter patientContactNumber");
						String patientContactNumber=s.next();
						System.out.println("Enter patientAddress");
						String patientAddress=s.next();
						System.out.println("Add Tablet list");
						tabletList.add();
						System.out.println("Add previousMedicalHistory:");
						previousMedicalHistory.add();
						
						Patient p=new Patient(patientId,patientName,patientContactNumber,patientAddress,new ArrayList<String>(),new ArrayList<String>());
						patientList.add(p);
						
					}
					System.out.println(patientList);
					
					break;
			case 3:
					System.out.println("Previous medical history");
					System.out.println("Enter the patient ID:");
					int patientid=s.nextInt();
					
					if(patient.getPatientId().equals(patientid)){
						System.out.println("Previous medical history:" + p.getPreviousMedicalHistory());
							
					}
					
					
					break;
			case 4:
					System.out.println("Check list of doctors:");
					for(int i=0;i<doctorList.size();i++){
						Doctor doctor=doctorList.get(i);
						
						
							System.out.println("List of all doctors:" + doctor.toString());
						
					}
					break;
			default:
					System.out.println("Enter valid choice :");
					break;
		}
		char ch;
		
		System.out.println("press Y/N to continue or not :");
		ch=s.next().charAt(0);
		
		if(ch=='Y' || ch=='y')
		{
			hospitalOpetations();
		}else
			System.out.println("You have entered No :");
	}

	public static void listOfDoctors(){
		                  //doctorId,Name,ContactNo,Qualification,Specalization
		Doctor d1=new Doctor(1,'ABC','546577856','MD','General');
		Doctor d2=new Doctor(2,'DEF','5677454','MBBS','physician');
		Doctor d3=new Doctor(3,'GHI','9876676','BAMS','E&T');
		Doctor d4=new Doctor(4,'JKL','546342353','BHMS','eyes');
		Doctor d5=new Doctor(5,'PQR','5465743','MD','dental');
		
		doctorList.add(d1);
		doctorList.add(d2);
		doctorList.add(d3);
		doctorList.add(d4);
		doctorList.add(d5);
		
		
		//patientId,patientName,patientContactNumber,patientAddress,List<String> tabletList,List<String> previousMedicalHistory
		Patient p1=new Patient(1,'XYZ','12345','Nasik',new ArrayList<>(),new ArrayList<>());
		Patient p2=new Patient(2,'LMN','6789','Mumbai',new ArrayList<>(),new ArrayList<>());
		Patient p3=new Patient(3,'OPQ','1345','pune',new ArrayList<>(),new ArrayList<>());
		Patient p4=new Patient(4,'PQR','1235','mumbai',new ArrayList<>(),new ArrayList<>());
		Patient p5=new Patient(5,'RST','1245','Nagpur',new ArrayList<>(),new ArrayList<>());
		
		patientList.add(p1);
		patientList.add(p2);
		patientList.add(p3);
		patientList.add(p4);
		patientList.add(p5);
	}
}