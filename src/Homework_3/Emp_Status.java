package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Emp_Status {
	
	public void empstatus (Connection con) {
		
		String InsertQuertStr = "insert into Emp_Status values (?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertQuertStr);
			
			String Emp_Type = "Part-Time Internship";
			
			Pstmt.setString(1, Emp_Type);
			
			System.out.println("Inserted String is ------------------"+InsertQuertStr);

			
			int res = Pstmt.executeUpdate();
			if(res == 1) {
				System.err.println("Data Inserted Successfully");
			}else {
				System.out.println("No Data Inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
