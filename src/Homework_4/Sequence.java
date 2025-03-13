package Homework_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sequence {
	
	public void sequence_storage(Connection con) {
		
		String SqlQuery = "Insert into Table_Sequence (ID, Name, Age) values (emp_number_seq.NEXTVAL,?,?)";
		String Name = "Murthy";
		int Age = 22;
		
		try {
			PreparedStatement Pstmt = con.prepareStatement(SqlQuery);
			Pstmt.setString(1, Name);
			Pstmt.setInt(2, Age);
			
			int res = Pstmt.executeUpdate();
			
			if(res > 0) {
				System.out.println("Row Inserted Successfully");
			}else {
				System.out.println("No row has been Inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
