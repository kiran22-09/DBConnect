package OracleCoonection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public void deleteDatadisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			int rollnum = 103;
			
			String SqldeleteStr = "delete from JDBC_Students where rollnum = " +rollnum;
			System.out.println("Delete String is .................."+SqldeleteStr);
			int res = stmt.executeUpdate(SqldeleteStr);
			
			if(res ==1) {
				System.out.println("Data Deleted Successfully");
			} else {
				System.out.println("Data not deleted");
			}
			
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
