package Class_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete_Using_PrepStmt {
	
	public void deleteUsingPrepStmtDisplay(Connection con) {
		
		String SqlDeleteStr = "Delete from JDBC_Emp where Emp_ID = ?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(SqlDeleteStr);
			
			int Emp_ID = 3333;
			Pstmt.setInt(1, Emp_ID);
			
			int res = Pstmt.executeUpdate();
			
			if(res == 1) {
				System.err.println("Data Deleted SUCCESSFULLY");
			} else {
				System.out.println("Data not Deleted");
			}
			
			String ExecuteQueryStr = "select * from JDBC_Emp";
			Pstmt = con.prepareStatement(ExecuteQueryStr);
			ResultSet rs = Pstmt.executeQuery();
			
			while(rs.next()) {
				String FnameStr = rs.getString("Fname");
				System.out.println("Fname after update -----------------"+FnameStr);
				String LnameStr = rs.getString("Lname");
				System.out.println("Lname after update -----------------"+LnameStr);

				//String Joining_dateStr = rs.getString("Joining_date");
				//System.out.println("Joining_date after update -----------------"+Joining_dateStr);

			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
