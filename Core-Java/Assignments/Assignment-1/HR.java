package firstbit.com;

public class HR {
	int id;
	String name;
	double salary;
	double commision;
	
	//Default Constructor
	HR(){	
	}
	//Parameterized Constructor
	HR(int id, String name, double salary, double commision) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commision =commision;
	}
	 public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
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
		return "Employee [Id: "+id+", Name: "+name+", Salary: "+salary+", Commision: "+commision+"]";
	}
	//Display
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Commison: "+commision);
	}
}
class Test5{
	public static void main(String[] args) {
		HR h1= new HR();
		
		HR h2= new HR(102, "Anushka", 45000, 1000);
		
		h1.setId(101);
		h1.setName("Dasharath");
		h1.setSalary(500000);
		h1.setCommision(1000);
		
		System.out.println("Hashcode: "+h1.hashCode());
		
		h1.display();
		System.out.println(h1);
		System.out.println(h2);
	}
}

