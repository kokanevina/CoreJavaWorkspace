package innerclasses;


public class Demo {
public static void main(String[] args) {
		Company comp=new Company(123, "Hari"); 
		/* instance variables come in existence when
		object of that class comes in existence*/
		comp.setName("Poonam");
		System.out.println(comp);
		// via object
		// inner class is member of another class
		// existence of inner class depends on existence of outer class
			
			Company.InhouseTrainer inhousetr=comp.new InhouseTrainer(99,45000);
		inhousetr.setSalary(67000);
		System.out.println(inhousetr); // toString
		inhousetr.testOuter();
		
		comp.testInner(inhousetr);
}
}
