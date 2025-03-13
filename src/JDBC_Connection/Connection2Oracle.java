package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection2Oracle {
	
	public Connection Connect2Oracle() {
	
    Connection con = null;

        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
            System.out.println("Oracle JDBC Driver not found.");

			e.printStackTrace();
		} catch (SQLException e) {
            System.out.println("Connection to Oracle Failed");
			e.printStackTrace();
		}
        
		return con;
		
	}
	
}


