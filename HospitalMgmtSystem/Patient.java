import java.util.*;
class Patient{
	private String patientName,patientContactNumber,patientAddress;
	private int patientId;
	
	private List<String> tabletList=new ArrayList<>();
	private List<String> previousMedicalHistory= new ArrayList<>();
	
	Patient(){
	}
	Patient(int patientId,String patientName,String patientContactNumber,String patientAddress,List<String> tabletList,List<String> previousMedicalHistory){
		this.patientId=patientId;
		this.patientName=patientName;
		this.patientContactNumber=patientContactNumber;
		this.patientAddress=patientAddress;
		this.tabletList=tabletList;
	}
	
	public int getPatientId(){
		return this.patientId;
	}
	public String getPatientName(){
		return this.patientName;
	}
	public int getPatientContactNumber(){
		return this.patientContactNumber;
	}
	public int getPatientAddress(){
		return this.patientAddress;
	}
	public int getPatientAddress(){
		return this.patientAddress;
	}
	public List<String> getTabletList(){
		return this.tabletList;
	}
	public List<String> getPreviousMedicalHistory(){
		return this.previousMedicalHistory;
	}
	
	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	public void setPatientName(String PatientName){
		this.PatientName=PatientName;
	}
	public void setPatientContactNumber(String PatientContactNumber){
		this.PatientContactNumber=PatientContactNumber;
	}
	public void setPatientAddress(String PatientAddress){
		this.PatientAddress=PatientAddress;
	}
	public void setTabletList(list<String> tabletList){
		this.TabletList=TabletList;
	}
	public void setPreviousMedicalHistory(List<String> previousMedicalHistory){
		this.previousMedicalHistory=previousMedicalHistory;
	}
	
	public String toString(){
		return this.patientId + " " + patientName + " " + patientContactNumber + " " + patientAddress + " " + tabletList + " " + previousMedicalHistory;
	}
}