package Class_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Using_PrepareStatement {
	
	public void insertusingPrepStmtdisplay(Connection con) {
		
		String SqlInsertStr = "Insert into JDBC_Emp values (?,?,?,TO_DATE(?, 'YYYY-MM-DD'))";
		try {
			PreparedStatement pstmt = con.prepareStatement(SqlInsertStr);
			
			int Emp_ID = 3333;
			String Fname = "Dyln";
			String Lname = "Blue";
			String Joining_date = "2023-08-11";
			
			//Emp_ID
			pstmt.setInt(1, Emp_ID);
			//Fname
			pstmt.setString(2, Fname);
			//Lname
			pstmt.setString(3, Lname);
			//Joining_date
			pstmt.setString(4, Joining_date);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.err.println("Data insertd SUCCESSFULLY");
			}else {
				System.out.println("Data not Inserted");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
