package staticdemo2;
public class StaticDemo2 {

	public static void main(String[] args) {

		// Count number of NeoEmployees and display that count
		System.out.println(NeoEmployee.COUNT);
		NeoEmployee emp1=new NeoEmployee(1, "Pooja", 40000);
		
		NeoEmployee.display(emp1);
		emp1.display();
		
		System.out.println(NeoEmployee.COUNT);
		NeoEmployee emp2=new NeoEmployee(2, "Pooja", 40000);
		NeoEmployee.display(emp2);
		emp2.display();
		
		System.out.println(NeoEmployee.COUNT);
		NeoEmployee emp3=new NeoEmployee(3, "Pooja", 40000);
		System.out.println(NeoEmployee.COUNT);
		NeoEmployee emp4=new NeoEmployee(4, "Pooja", 40000);
		System.out.println(NeoEmployee.COUNT);
		NeoEmployee emp5=new NeoEmployee(5, "Pooja", 40000);
		System.out.println(NeoEmployee.COUNT);
	}

}
