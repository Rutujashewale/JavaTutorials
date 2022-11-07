import java.util.*;
class Doctor{
	private String doctorName,doctorContactNo,doctorQualification,doctorSpecalization;
	private int doctorId;
	
	
	
	Doctor(){
	}
	Doctor(int doctorId,String doctorName,String doctorContactNo,String doctorQualification,String doctorSpecalization){
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.doctorContactNo=doctorContactNo;
		this.doctorQualification=doctorQualification;
		this.doctorSpecalization=doctorSpecalization;
	}
	
	public int getDoctorId(){
		return this.doctorId;
	}
	public String getDoctorName(){
		return this.doctorName;
	}
	public String getDoctorContactNo(){
		return this.doctorContactNo;
	}
	public String getDoctorQualification(){
		return this.doctorQualification;
	}
	public String getDoctorSpecalization(){
		return this.doctorSpecalization=doctorSpecalization;
	}
	public void setDoctorId(int doctorId){
		this.doctorId=doctorId;
	}
	public void setDoctorName(String doctorName){
		 this.doctorName=doctorName;
	} 
	public void setDoctorContactNo(String doctorContactNo){
		 this.doctorContactNo=doctorContactNo;
	}
	public void setDoctorQualification(String doctorQualification){
		 this.doctorQualification=doctorQualification;
	}
	public void setDoctorSpecalization(String doctorSpecalization){
		this.doctorSpecalization=doctorSpecalization;
	}
	
	public String toString(){
		return this.doctorId + " " + doctorName + " " + doctorContactNo + " " + doctorQualification + " " + doctorSpecalization;
	}
}