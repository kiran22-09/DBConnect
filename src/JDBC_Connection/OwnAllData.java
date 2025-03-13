package JDBC_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OwnAllData {
	
	public void OwnAllDatadisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			String sql = "select * from employees"; 
			ResultSet rs = stmt.executeQuery(sql);
			String empID = null;
			String fname = null;
			String lname = null;
			String jobID = null;
			String salary = null;

			while(rs.next() == true) {
				empID = rs.getString("EMPLOYEE_ID");
				System.out.println("\n");
				System.out.println("employee_ID is---------"+empID);
				fname = rs.getString("first_name");
				System.out.println("First_Name is---------"+fname);
				lname = rs.getString("last_name");
				System.out.println("Last_Name is ---------"+lname);
				jobID = rs.getString("JOB_ID");
				System.out.println("Job_ID is ---------"+jobID);
				salary = rs.getString("SALARY");
				System.out.println("salary is ---------"+salary);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
