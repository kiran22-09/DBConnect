package JDBC_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDatabase {
	
	public void displayQueryValues(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			String sqlString = "select * from employees";
			ResultSet rs = stmt.executeQuery(sqlString);
			String fname = null;
			String lname = null;
			
			while(rs.next() == true) {
				fname = rs.getString("first_name");
				System.out.println("\n First_Name is---------"+fname);
				lname = rs.getString("last_name");
				System.out.println("Last_Name is ---------"+lname);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
