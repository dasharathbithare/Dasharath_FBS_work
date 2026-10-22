
public class SafeDivision {
	public static void main(String[] args) {
		divide(10,0);
		divide(10,4);
	}
	static void divide(int a, int b) {
		try {
			int divide=a/b;
			System.out.println(divide);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		
	}

}
