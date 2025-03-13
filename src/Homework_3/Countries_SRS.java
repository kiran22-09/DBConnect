package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Countries_SRS {
	
public void countries_srs_display(Connection con) {
		
		String InsertSqlStr = "Insert into Countries_SRS values (?,?,?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSqlStr);
			
			String Country_ID = "D550";
			String CountryName = "Canada";
			String Region_ID = "NRT";
			
			
			Pstmt.setString(1, Country_ID);
			Pstmt.setString(2, CountryName);
			Pstmt.setString(3, Region_ID);

			
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
