package Homework_3;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	public class Reports_To {


		
		public void empstatus (Connection con) {
			
			String InsertQuertStr = "insert into Reports_To (Name, Reporting_Method )values (?,?)";
			try {
				PreparedStatement Pstmt = con.prepareStatement(InsertQuertStr);
				
				String Name = "Sara Tencrady";
				String Reporting_Method = "Direct";
				
				Pstmt.setString(1, Name);
				Pstmt.setString(2, Reporting_Method);

				
				System.out.println("Inserted String is ------------------"+InsertQuertStr);

				
				int res = Pstmt.executeUpdate();
				if(res == 1) {
					System.err.println("Data Inserted Successfully to Reports_To Table");
				}else {
					System.out.println("No Data Inserted");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	


}
