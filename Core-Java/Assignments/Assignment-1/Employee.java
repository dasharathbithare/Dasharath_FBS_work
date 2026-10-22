package firstbit.com;

public class Employee {
	int id;
	String name;
	double salary;
	
	//Default Constructor
	Employee(){	
	}
	//Parameterized Constructor
	 Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 //setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//String
	public String toString() {
		return "Employee [Id: "+id+", Name: "+name+", Salary: "+salary+"]";
	}
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
class Test4{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Employee e2= new Employee(102, "Anushka", 45000);
		
		e1.setId(101);
		e1.setName("Dasharath");
		e1.setSalary(500000);
		
		System.out.println("Hashcode: "+e1.hashCode());
		
		e1.display();
		System.out.println(e1);
		System.out.println(e2);
	}
}
