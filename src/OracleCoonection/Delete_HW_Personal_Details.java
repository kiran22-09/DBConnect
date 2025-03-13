package OracleCoonection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_HW_Personal_Details {
	
	public void deletePersonalDetailsdisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			int Emp_ID = 103;  //
			
			String sqlDeleteStr = "DELETE FROM HRM_PD WHERE Emp_ID = " +Emp_ID;
			System.out.println("Delete String is -----------------" + sqlDeleteStr);

			int result = stmt.executeUpdate(sqlDeleteStr);
			
			if(result==1) {
				System.err.println("Data Deleted SUCCESSFULLY");
			}
			else {
				System.out.println("No Data deleted");
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


