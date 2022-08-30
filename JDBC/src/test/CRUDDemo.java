package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import impl.CRUD;
import pojo.Employee;

public class CRUDDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CRUD crud=new CRUD();
		//crud.insert();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// enter switch case for 1: insert, 2; update  3: delete 4: select 5: exit
		
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
		
		
		//crud.update(emp); id: exisiting, name : new, salary : new 
		
		//crud.delete(id) : id: existing
	}
}
