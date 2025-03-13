package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle2Connect {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connect to oracle using Driver
		
		Connection oracleConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
		
		System.out.println("Connection------------------"+oracleConnection);

	}

}
