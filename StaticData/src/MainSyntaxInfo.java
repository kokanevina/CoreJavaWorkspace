//parseInt: static : Integer class
public class MainSyntaxInfo {

	//1. public : full visibility
	//2. static : MainSyntaxInfo.main(....), 
	//to start with execution method should in the memory
	//3. void : does not return anything
	//4: main : predefined method name :main 
	//5: String array : used to take command line arguments
	public static void main(String[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+"  "+i);
		}
		double sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+Double.parseDouble(ar[i]);
		}
		System.out.println(sum);
		MainSyntaxInfo.main();
		main("Welcome");
		int ages[]={45,67,89};
		main(ages);
	}
	public static void main(int[] ar) {
		// display array here
		System.out.println(ar);
	}
	public static void main() {
		// display message here
	}
	public static void main(String s) {
		// display string here
	}
}
