package OracleCoonection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OR_ContactDetails {

	public void OR_ContactDetailsdisplay (Connection con) {
		
		try {
			Statement stmt = con.createStatement();
			
			String sql = "select * from or_hrm_contactdetails";
			
			ResultSet rs = stmt.executeQuery(sql);
			String StreetAddress = null;
			String City = null;
			String StateName = null;
			String Zipcode = null;
			String Country = null;
			
			while(rs.next() == true) {
				
				StreetAddress = rs.getString("STREET_ADDRESS");
				System.out.println("\n");
				System.out.println("StreetAddress is ----------------"+StreetAddress);
				
				City = rs.getString("CITY");
				System.out.println("City is -------------------------"+City);
				
				StateName = rs.getString("STATENAME");
				System.out.println("StateName is --------------------"+StateName);
				
				Zipcode = rs.getString("ZIPCODE");
				System.out.println("Zipcode is ----------------------"+Zipcode);
				
				Country = rs.getString("COUNTRY");
				System.out.println("Country is ----------------------"+Country);
				
			}


		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
