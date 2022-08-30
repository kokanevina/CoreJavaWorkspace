package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import impl.CRUD;
import pojo.Employee;

public class CRUDDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CRUD crud=new CRUD();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		do {
			System.out.println("1: insert, 2; update  3: delete 4: select 5: exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:
				System.out.println("Enter Employee details:");
				System.out.println("Enter id");
				int id=Integer.parseInt(br.readLine());		
				System.out.println("Enter name");
				String name=br.readLine();	
				System.out.println("Enter salary");
				double salary=Double.parseDouble(br.readLine());		
				Employee emp=new Employee(id,name,salary);
				// emp : Data carrier (pojo)		
				crud.insert(emp);
				break;
			case 2:
				System.out.println("Update  Employee details:");
				System.out.println("Enter existing id to update details");
				 id=Integer.parseInt(br.readLine());			
				System.out.println("Enter new name");
				name=br.readLine();			
				System.out.println("Enter new salary");
				 salary=Double.parseDouble(br.readLine());			
	              emp=new Employee(id,name,salary);
				crud.update(emp);
				break;
			case 3:
				System.out.println("Enter existing id to delete employee");
				 id=Integer.parseInt(br.readLine());
				 crud.delete(id);
				 break;
			case 4:
				crud.selectAll();
				break;
			case 5:
			break;
			 default: System.out.println("Wrong choice");
			}
		}while(ch!=5);

	}
}
