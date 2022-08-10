package staticdemo2;

public class NeoEmployee {
	private int empId;
	private String empName;
	private double basicSalary;
	public  static String companyName;
	public static int COUNT; 
	static {
		System.out.println("static block executed");
		companyName="Neosoft";
	}
	public NeoEmployee(int empId, String empName, double basicSalary) {
		System.out.println("constructor executed");
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		COUNT++;
	}
	@Override
	public String toString() {
		return "NeoEmployee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + "]";
	}
	/*common behavior*/
	public static String getCompanyName() {
		return companyName;
	}
	public void test() {
		System.out.println(companyName);
	}
	
	public void display() {
		System.out.println("Id :"+empId);
		System.out.println("Name :"+empName);
		System.out.println("Salary :"+basicSalary);
		System.out.println("Company Name:"+companyName);
		System.out.println("Count:"+COUNT);
	}
	public static void display(NeoEmployee emp) {
		// can not access instance members directly
		System.out.println("Id :"+emp.empId);
		System.out.println("Name :"+emp.empName);
		System.out.println("Salary :"+emp.basicSalary);
		System.out.println("Company Name:"+companyName);
		System.out.println("Count:"+COUNT);
	}
	
}
