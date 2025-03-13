package Class5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Login_Details {
	

		public void Login_DetailsimagestorageBLOB(Connection con) {
			
			String InsertSql = "insert into check_constraints (Emp_FName, Emp_MName,Emp_LName,Emp_ID, Login, UserName, Status, Password, Confirm_Password,Emp_Image) values (?,?,?,?,?,?,?,?,?,?)";
			
			String Emp_Fname = "Krishna";
			String Emp_Mname = "Murthy";
			String Emp_Lname ="Gundra";
			String Emp_ID = "RS750 ";
			String Login = "YES";
			String UserName = "Kgundra";
			String Status = "ENABLED";
			String Password = "Krishna123";
			String Confirm_Password = "Krishna123";
			String Emp_Image = "C:\\Users\\kiran\\Pictures\\temp_photo.jpg";
			
			try {
				PreparedStatement Pstmt = con.prepareStatement(InsertSql);
				
				Pstmt.setString(1, Emp_Fname);
				Pstmt.setString(2, Emp_Mname);
				Pstmt.setString(3, Emp_Lname);
				Pstmt.setString(4, Emp_ID); 
				Pstmt.setString(5, Login); 
				Pstmt.setString(6, UserName); 
				Pstmt.setString(7, Status); 
				Pstmt.setString(8, Password); 
				Pstmt.setString(9, Confirm_Password);
				

				File imageFile = new File(Emp_Image);
				
				try {
					FileInputStream fis = new FileInputStream(imageFile);
					Pstmt.setBinaryStream(10, fis, (int) imageFile.length());
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error Redaing imageFile------"+e.getMessage());
				}
				
				int res = Pstmt.executeUpdate();
				
				if(res > 0) {
					System.out.println("Employee data successfully inserted into PIM module");
				}
				else {
					System.out.println("Failed to insert into PIM Module");
				}

				
				


				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}

	
