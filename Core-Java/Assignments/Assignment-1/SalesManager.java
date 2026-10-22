package firstbit.com;

public class SalesManager {
	int id;
	String name;
	double salary;
	double incentive;
	double target;
	
	//Default Constructor
	SalesManager(){	
	}
	//Parameterized Constructor
	SalesManager(int id, String name, double salary, double incentive,
	double target) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive =incentive;
		this.target=target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public double getTarget() {
		return target;
	}
	public void setTarget(double target) {
		this.target = target;
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
	@Override
	public String toString() {
		return "SalesManager [Id: "+id+", Name: "+name+", Salary: "+salary+", Incentive: "+incentive+", Target: "+target+"]";
	}
	//Display
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Incentive: "+incentive);
		System.out.println("Target: "+target);
	}
}
class Test6{
	public static void main(String[] args) {
		SalesManager sm = new SalesManager();
		
		SalesManager sm1 = new SalesManager(102, "Anushka", 45000, 1000, 455);
		
		sm.setId(101);
		sm.setName("Dasharath");
		sm.setSalary(500000);
		sm.setIncentive(1000);
		sm.setTarget(387);
		
		System.out.println("Hashcode: "+sm.hashCode());
		
		sm.display();
		System.out.println(sm);
		System.out.println(sm1);
	}
}

