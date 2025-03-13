package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Job_Titles {
	
	public void empType (Connection con) {
		
		String InsertQuertStr = "insert into JOB_TITLES values (?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertQuertStr);
			
			String job_Title = "Cstmr SuccessManager";
			
			Pstmt.setString(1, job_Title);
			
			System.out.println("Inserted String is ------------------"+InsertQuertStr);

			
			int res = Pstmt.executeUpdate();
			if(res == 1) {
				System.err.println("Data Inserted Successfully to table Job_Titles");
			}else {
				System.out.println("No Data Inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
