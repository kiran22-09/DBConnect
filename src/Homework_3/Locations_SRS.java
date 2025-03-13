package Homework_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Locations_SRS {
	
public void locations_srs_display(Connection con) {
		
		String InsertSqlStr = "Insert into Locations_SRS values (?,?,?,?,?,?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSqlStr);
			
			String Location_ID = "LOC11";
			String Street_Address = "1_Kundan_bagh";
			String City = "Hyderabad";
			String State = "Andhra";
			int Zipcode = 520012;
			String Country_ID = "C440";

			
			
			Pstmt.setString(1, Location_ID);
			Pstmt.setString(2, Street_Address);
			Pstmt.setString(3, City);
			Pstmt.setString(4, State);
			Pstmt.setInt(5, Zipcode);
			Pstmt.setString(6, Country_ID);


			
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
