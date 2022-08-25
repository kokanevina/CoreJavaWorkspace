package innerclasses;

public class Company {
		private  int id;
		private String name;
		public static int count;
		public Company() {
			// TODO Auto-generated constructor stub
		}
		public Company(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
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
		class InhouseTrainer{
				private int trId;
				private  double salary;
				public static final int trCount=3; /*in inner classess static final prperties allowed but not only static*/
				/*The field trCount cannot be declared static in a non-static inner type, unless initialized with a constant expression*/
				public InhouseTrainer(int trId,double salary) {
					this.trId=trId;
					this.salary = salary;
				}	
				public int getTrId() {
					return trId;
				}
				public void setTrId(int trId) {
					this.trId = trId;
				}
				public double getSalary() {
					return salary;
				}
				public void setSalary(double salary) {
					this.salary = salary;
				}				
				@Override
				public String toString() {
					return "InhouseTrainer [trId=" + trId + ", salary=" + salary + "]";
				}

				// inside inner class method we can access outer class properties (private also)
				public void testOuter(){
					System.out.println("Properties of Outer class directly accessed in inner class method");
					System.out.println(id);
					System.out.println(name);
					System.out.println(count);
				}
				
				// try creating static method
		}// inner class gets ended
		
		@Override
		public String toString() {
			return "Trainer [id=" + id + ", name=" + name + "]";
		}
		// outer class can not directly access properties of inner class, but can be accessed via obect (private also)
		public void testInner(InhouseTrainer ih) {
			System.out.println("Properties of inner class  accessed via object of inner class in outer class method");
			System.out.println(ih.salary);
			System.out.println(ih.trId);
			System.out.println(InhouseTrainer.trCount);
		}
  // try creating static method
		
}// outer classes ended 
