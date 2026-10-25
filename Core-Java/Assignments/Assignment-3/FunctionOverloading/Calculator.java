package FunctionOverloading;

public class Calculator {

// Addition
	public static int add(int a, int b) {
		int c = a + b;
		return c;	
	}
	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}
	public static double add(int a, double b) {
		double c = a +b;
		return c;
	}
	public static double add(double a, int b) {
		double c = a+b;
		return c;
	}
// Subtraction
	public static int sub(int a, int b) {
		int c = a - b;
		return c;	
	}
	public static double sub(double a, double b) {
		double c = a -  b;
		return c;
	}
	public static double sub(int a, double b) {
		double c = a - b;
		return c;
	}
	public static double sub(double a, int b) {
		double c = a-b;
		return c;
	}
//Multiplication
	public static int mul(int a, int b) {
		int c = a * b;
		return c;	
	}
	public static double mul(double a, double b) {
		double c = a *  b;
		return c;
	}
	public static double mul(int a, double b) {
		double c = a * b;
		return c;
	}
	public static double mul(double a, int b) {
		double c = a*b;
		return c;
	}
//Division
	public static double div(int a, int b) {
		double c =a / (double) b;
		return c;	
	}
	public static double div(double a, double b) {
		double c = a / b;
		return c;
	}
	public static double div(int a, double b) {
		double c = a / b;
		return c;
	}
	public static double div(double a, int b) {
		double c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		//add
		int result= add(10, 345);
		System.out.println(result);
		
		double result1 = add(10.12, 23.786);
		System.out.println(result1);
		
		double result2= add(18, 34.65);
		System.out.println(result2);
		
		double result3=add(45.65, 67);
		System.out.println(result3);
		
		// sub
		int result4= sub(10, 345);
		System.out.println(result4);
		
		double result5 = sub(10.12, 23.786);
		System.out.println(result5);
		
		double result6= sub(18, 34.65);
		System.out.println(result6);
		
		double result7=sub(45.65, 67);
		System.out.println(result7);
		
		//mul
		int result8= mul(10, 345);
		System.out.println(result8);
		
		double result9 = mul(10.12, 23.786);
		System.out.println(result9);
		
		double result10= mul(18, 34.65);
		System.out.println(result10);
		
		double result11=mul(45.65, 67);
		System.out.println(result11);
		
		//div
		double result12= div(10, 345);
		System.out.println(result12);
		
		double result13 = div(10.12, 23.786);
		System.out.println(result13);
		
		double result14= div(18, 34.65);
		System.out.println(result14);
		
		double result15=div(45.65, 67);
		System.out.println(result15);
		
	
	}
}

