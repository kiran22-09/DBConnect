package JDBC_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OwnQuery {
	
	public void OwnQuerydisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			String sqlString = "select * from employees";
			ResultSet rs = stmt.executeQuery(sqlString);
			String empID = null;
			String salary = null;
			
			while(rs.next() == true) {
				empID = rs.getString("EMPLOYEE_ID");
				System.out.println("\n employee_ID is---------"+empID);
				salary = rs.getString("SALARY");
				System.out.println("salary is ---------"+salary);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
