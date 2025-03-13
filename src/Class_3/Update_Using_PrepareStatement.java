package Class_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update_Using_PrepareStatement {
	
	public void updateUsingPrepStmtdisplay(Connection con) {
		
		
		String SqlUpdateStr = "Update JDBC_Emp set Fname = ?, Lname = ? where Emp_ID = ?";
		try {
			PreparedStatement PStmt = con.prepareStatement(SqlUpdateStr);
			
			String Fname = "Dolce";
			String Lname = "Gabanna";
			int Emp_ID = 3333;
			
			PStmt.setString(1, Fname);
			PStmt.setString(2, Lname);
			PStmt.setInt(3, Emp_ID);
			
			int result = PStmt.executeUpdate();
			
			if(result == 1) {
				System.err.println("Data Updated SUCCESSFULLY");
			}else {
				System.out.println("Data not Updated");
			}
			
			String executeQuerystr = "select * from JDBC_Emp";
			PStmt = con.prepareStatement(executeQuerystr);
			ResultSet rs = PStmt.executeQuery();
			
			while(rs.next()) {
				String FnameStr = rs.getString("Fname");
				System.out.println("Fname after update is ---------------"+FnameStr);
				String LnameStr = rs.getString("Lname");
				System.out.println("Lname after update is----------------"+LnameStr);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
