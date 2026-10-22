package firstbit.com;

public class Date {
	int day;
	int month;
	int year;
	String dow;
	
	Date(){
		
	}
	Date(int day, int month, int year, String dow){
		this.day =day;
		this.month=month;
		this.year=year;
		this.dow=dow;
	}
	//setters
	public void setDay(int day) {
		this.day=day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setDow(String dow) {
		this.dow=dow;
	}
	//getters
	public int  getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String getDow() {
		return dow;
	}
	public void display() {
	    System.out.println("Day: " + getDay());
	    System.out.println("Month: " + getMonth());
	    System.out.println("Year: " + getYear());
	    System.out.println("Day of Week: " + getDow());
	}
	@Override
	public String toString() {
	    return "Date [day=" + day+ ", month=" + month + ", year=" + year + ", dow=" + dow + "]";
	}
}
class Test{
	public static void main(String[] args) {
		Date d1 = new Date();
	
		d1.setDay(19);
		d1.setMonth(2);
		d1.setYear(2026);
		d1.setDow("Monday");
		
		System.out.println("Hashcode: " + d1.hashCode());

		d1.display();
		System.out.println(d1);
	}
}
