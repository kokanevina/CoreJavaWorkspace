package maths;

public class MathOperation {

	public double add(int a, int  b) {
		return a+b;
	}
	
	public double subtract(int a, int b) {
		return a-b;
	}
	
	public double multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		double div=0;
		try {
		div= a/b;     // ArithmeticException object
		double result=div+7;
		System.out.println("this stmt gets skipped if exception occurs above");
		}
		catch(ArithmeticException ae) {
				System.out.println("Exception occured");
				System.out.println(ae);  // toString
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			System.out.println(e); // toString of subclass
		}
		System.out.println("normal execution contiues from here");
		return div;
	}
	
}
