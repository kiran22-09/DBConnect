package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Emp_Type {
	
	public void empType (Connection con) {
		
		String InsertQuertStr = "insert into TYPE_OF_EMPLOYEE values (?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertQuertStr);
			
			String type_EMP = "PAST_EMPLOYEES_ONLY";
			
			Pstmt.setString(1, type_EMP);
			
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
