package impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connection.MyConnection;

public class CRUD {

	
	public void insert() {
		String sql="insert into employee values(111,'Hari Patil', 78000)";
		/*
		 * 1. Connect To Database
		 * 2. Define and prepare a query
		 * if a query is hardcoded then create Statement object
		 * 3. Fire Query : type of query 4. Collect Result
		 * insert, update, delete : DML : Data Manipulate Language
		 * executeUpdate(sql);
		 * 
		 * select : DQL : Data Query Language
		 * executeQuery(sql)
		 * 
		 * create, alter, truncate, drop :DDL 
		 * execute , DML/DQL/DDL/DCL
		 * 5. Close the connection   : try with resources : autoclosed*/
		
		  try (Connection connection=MyConnection.connect()){	  
			  Statement statement=connection.createStatement(); // upcasting
			  System.out.println(statement.getClass()); // optional step
			  int no=statement.executeUpdate(sql);
			  System.out.println("Number of rows affected: "+no);
		} 
		  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed");
	}
	
	public static void main(String[] args) {
		CRUD crud=new CRUD();
		crud.insert();
	}
}
