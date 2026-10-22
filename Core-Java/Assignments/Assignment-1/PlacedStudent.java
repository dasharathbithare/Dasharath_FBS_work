package firstbit.com;

public class PlacedStudent {
	int frn;
	String studentName;
	int distanceCovered;
	String companyName;
	String designation;
	
	//Default Constructor
	PlacedStudent(){
		
	}
	//Parameterized Constructor
	PlacedStudent(int frn, String studentName, int distanceCovered, String companyName,
	String designation){
		this.frn=frn;
		this.studentName=studentName;
		this.distanceCovered=distanceCovered;
		this.companyName=companyName;
		this.designation=designation;
	}
	
	//setters
	public void setFrn(int frn) {
		this.frn=frn;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setDistanceCovered(int distanceCovered) {
		this.distanceCovered=distanceCovered;
	}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	//Getters
	public int getFrn() {
		return frn;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getDistanceCovered() {
		return distanceCovered;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getDesignation() {
		return designation;
	}
	
	//display method
	public void display() {
		System.out.println("Frn: "+getFrn());
		System.out.println("Student Name: "+getStudentName());
		System.out.println("Distance Covered: "+getDistanceCovered());
		System.out.println("Company Name: "+getCompanyName());
		System.out.println("Designation: "+getDesignation());
	}
	//String method
	@Override
	public String toString() {
		return "PlacedStudent [Frn: " +frn+", Student Name: "+studentName+", Distance Covered: "+ distanceCovered+", Company Name: "+companyName+", Designation: "+designation+"]";
	}
} 
class Test3{
	public static void main(String[] args) {
		PlacedStudent s1 =new PlacedStudent();
		
		s1.setFrn(16);
		s1.setStudentName("Dasharath");
		s1.setDistanceCovered(10);
		s1.setCompanyName("Amazon");
		s1.setDesignation("2-2-2026");
		
		System.out.println("Hashcode: "+ s1.hashCode());
		
		s1.display();
		System.out.println(s1);
	}
}


