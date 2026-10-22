package firstbit.com;

public class Student {
	int frn;
	String studentName;
	int distanceCovered;
	
	//Default Constructor
	Student(){
		
	}
	//Parameterized Constructor
	Student(int frn, String studentName, int distanceCovered){
		this.frn=frn;
		this.studentName=studentName;
		this.distanceCovered=distanceCovered;
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
	//display method
	public void display() {
		System.out.println("Frn: "+getFrn());
		System.out.println("Student Name: "+getStudentName());
		System.out.println("Distance Covered: "+getDistanceCovered());
	}
	//String method
	@Override
	public String toString() {
		return "Student [Frn: " +frn+", Student Name: "+studentName+", Distance Covered: "+ distanceCovered+"]";
	}
} 
class Test2{
	public static void main(String[] args) {
		Student s1 =new Student();
		
		s1.setFrn(16);
		s1.setStudentName("Dasharath");
		s1.setDistanceCovered(10);
		
		System.out.println("Hashcode: "+ s1.hashCode());
		
		s1.display();
		System.out.println(s1);
	}
}