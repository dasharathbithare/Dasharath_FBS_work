package firstbit.com;

public class Admin {
	int id;
	String name;
	double salary;
	double allowance;
	
	//Default Constructor
	Admin(){	
	}
	//Parameterized Constructor
	Admin(int id, String name, double salary, double allowance) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance =allowance;
	}
	 public double getCommision() {
		return allowance;
	}
	public void setCommision(double commision) {
		this.allowance = commision;
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
		return "Admin [Id: "+id+", Name: "+name+", Salary: "+salary+", Allowance: "+allowance+"]";
	}
	//Display
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Allowace: "+allowance);
	}
}
class Test7{
	public static void main(String[] args) {
		Admin a1= new Admin();
		
		Admin a2= new Admin(102, "Anushka", 45000, 1000);
		
		a1.setId(101);
		a1.setName("Dasharath");
		a1.setSalary(500000);
		a1.setCommision(1000);
		
		System.out.println("Hashcode: "+a1.hashCode());
		
		a1.display();
		System.out.println(a1);
		System.out.println(a2);
	}
}

