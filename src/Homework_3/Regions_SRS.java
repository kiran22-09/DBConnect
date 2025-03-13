package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Regions_SRS {
	
	public void regions_srs_display(Connection con) {
		
		String InsertSqlStr = "Insert into Regions_SRS values (?,?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSqlStr);
			
			String Region_ID = "ASA";
			String RegionName = "Asia";
			
			Pstmt.setString(1, Region_ID);
			Pstmt.setString(2, RegionName);
			
			int result = Pstmt.executeUpdate();
			if(result == 1) {
				System.err.println("Data inserted Successfully");
			}
			else {
				System.out.println("Data not Inserted");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
