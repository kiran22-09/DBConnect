package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Connection to the Oracle");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection oracleConnection = null;
		try {
			oracleConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connection -----------------"+oracleConnection);

	}

}
