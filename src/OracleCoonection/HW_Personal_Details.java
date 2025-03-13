package OracleCoonection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HW_Personal_Details {
	
	public void personaldetailsdisplay (Connection con) {
		
		try {
			Statement  Stmt = con.createStatement();
			
			String Fname = "Sri";
			String Mname = "Ram";
			String Lname = "Kola";
			int Emp_ID = 104;
			int Other_ID = 444;
			int Dri_Lic_Num = 78526;
			String Dri_Exp_date = "2027-10-15";
			String Nationality = "India";
			String Marital_Status = "Single";
			String DOB = "1997-09-19";
			String Gender = "Male";
			
			 String sqlInsertStr = "INSERT INTO HRM_PD " +
	                    "VALUES (" +
	                    "'" + Fname + "', " +
	                    "'" + Mname + "', " +
	                    "'" + Lname + "', " +
	                    Emp_ID + ", " +
	                    Other_ID + ", " +
	                    Dri_Lic_Num + ", " +
	                    "TO_DATE('" + Dri_Exp_date + "', 'YYYY-MM-DD'), " + // Correct use of TO_DATE
	                    "'" + Nationality + "', " +
	                    "'" + Marital_Status + "', " +
	                    "TO_DATE('" + DOB + "', 'YYYY-MM-DD'), " + // Correct use of TO_DATE
	                    "'" + Gender + "'" +
	                    ")";
			
			System.out.println("Inserted String is ------------------"+sqlInsertStr);
			
			int result = Stmt.executeUpdate(sqlInsertStr);
			
			if(result == 1) {
				System.err.println("Data Inserted Successfully");
			}
			else {
				System.out.println("Data not Inserted ");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
