package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Departments_SRS {
	
	public void departments_SRS_display(Connection con) {
		
		
		String InsertSqlStr = "Insert into Departments_SRS values (?,?,?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSqlStr);
			
			String Dept_ID = "40";
			String DeptName = "IT";
			String Location_ID = "LOC114";
			
			Pstmt.setString(1, Dept_ID);
			Pstmt.setString(2, DeptName);
			Pstmt.setString(3, Location_ID);
			
			int result = Pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("Data inserted Successfully");
			}
			else {
				System.out.println("No Data Inserted");
			}
			
					
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
