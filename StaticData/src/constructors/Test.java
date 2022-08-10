package constructors;
class Person{
	private int id;
	private String name;
	
	private Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Person(){
        System.out.println("In private constructor");
    }
    /*static method overloading*/
    public static Person getPerson(int id , String name){
        return new Person(id,name);
    }
    public static Person getPerson(){
        return new Person();
    }
}
public class Test {
    
   public static void main(String[] args) {
	   		Person p1=Person.getPerson();
            Person p2=Person.getPerson(12,"Kumar");
   }
}
