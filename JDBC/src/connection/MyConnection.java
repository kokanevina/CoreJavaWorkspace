package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	
	public void connect() throws SQLException {
		// we write a logic to connect to mysql database
		Connection connection=null;
		String url="jdbc:mysql://localhost:3306/sonoo";
		String username="root";
		String password="root";
		connection=DriverManager.getConnection(url,username,password);
	}
}
