package OracleCoonection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_HW_Personal_Details {
	
	public void updatePersonalDetailsdisplay (Connection con) {
		
		try {
			Statement Stmt = con.createStatement();
			
			String Mname = "Raj";
			String Emp_ID = "102";
			
			String sqlUpdateStr = "update HRM_PD set Emp_MiddleName = '" + Mname + "' WHERE Emp_ID = " + Emp_ID;
			
			System.out.println("Updated Data is -------------"+sqlUpdateStr);
			int res = Stmt.executeUpdate(sqlUpdateStr);
			
			if(res == 1) {
				System.err.println("Data Updated Successfully");
			}else {
				System.out.println("Data not Updated");
			}
			
			/*String executeQueryStr = "select * from HRM_PD";
			ResultSet rs = Stmt.executeQuery(executeQueryStr);
			
			while(rs.next()) {
				String MnameStr = rs.getString(executeQueryStr);
				System.out.println("Mname after update is ----------------"+MnameStr);
			}*/
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
