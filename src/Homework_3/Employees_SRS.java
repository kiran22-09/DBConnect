package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employees_SRS {
	 
	public void employees_srs_display(Connection con) {
		
		
		String InsertSqlStr = "Insert into Employees_SRS values (?,?,?,?,?,TO_DATE(?, 'YYYY-MM-DD'))";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSqlStr);
			
			int Emp_num = 116;
			String FirstName = "Shahid";
			String LastName = "Shaik";
			String Job = "Sales Manager";
			String Dept_ID ="20";
			String Join_date = "1997-06-12";
			
			Pstmt.setInt(1, Emp_num);
			Pstmt.setString(2, FirstName);
			Pstmt.setString(3, LastName);
			Pstmt.setString(4, Job);
			Pstmt.setString(5, Dept_ID);
			Pstmt.setString(6, Join_date);
			
			int result = Pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("Data Inserted Successfully");
			}else {
				System.out.println("No Data Inserted");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
