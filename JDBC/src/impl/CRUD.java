package impl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import connection.MyConnection;
import pojo.Employee;
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
public class CRUD {
	// create update method, delete method to update and delete the records
	public void insert() {
		String sql="delete from employee where emp_id=1"; // hardcoded query
		  try (Connection connection=MyConnection.connect()){	  
			  Statement statement=connection.createStatement(); // upcasting, dont pass sql here
			  System.out.println(statement.getClass()); // optional step
			  int no=statement.executeUpdate(sql); // pass sql here
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
	}// method ended
	
	public void insert(Employee em) {
		String sql="insert into employee values(?,?,?)"; // ? : wil later replaced by actual
		// to prepare this query we need to use PreparedStatement object (interface)
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); // sql must be passed here
			// ? : id : int 
			pstatement.setInt(1, em.getEmpId());
			//? : name : String
			pstatement.setString(2, em.getEmpName());
			//? : salary : double
			pstatement.setDouble(3, em.getEmpSalary());
			System.out.println(pstatement);
			System.out.println(pstatement.getClass());
			
			  int no=pstatement.executeUpdate(); // do not pass sql here
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
		/*
		 * String sql2="update employee set emp_name=?,emp_salary=? where emp_id=?";
		 * String sql3="delete from employee where emp_id=?";
		 */
	}
	
	
}
