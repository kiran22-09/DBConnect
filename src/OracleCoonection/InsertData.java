package OracleCoonection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	public void insertDatadisplay(Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			int rollnum = 103;
			String firstName = "Murthy";
			String lastName = "Gundra";
			
			String SqlInsertStr = "insert into JDBC_Students values ("+rollnum+","+"'"+firstName+"'"+","+"'"+lastName+"'"+")";
			System.out.println("Inserted String is ____________________"+SqlInsertStr);
			
			int res = stmt.executeUpdate(SqlInsertStr);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
