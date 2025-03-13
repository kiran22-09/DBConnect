package OracleCoonection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	
	public void updateDatadisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			int rollnum = 102;
			String firstName = "Murthy";
			
			String sqlUpdateStr = "update JDBC_Students set firstName = '" +firstName+"' where rollnum = "+rollnum;
			System.out.println("Updated String is --------------"+sqlUpdateStr);
			int result = stmt.executeUpdate(sqlUpdateStr);
			
			if(result == 1) {
				System.out.println("Data Updated SUCCESSFULLY");
			}
			else {
				System.out.println("Data not Updated");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
