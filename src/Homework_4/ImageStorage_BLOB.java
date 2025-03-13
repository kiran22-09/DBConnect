package Homework_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageStorage_BLOB {
	
	public void imagestorageBLOB(Connection con) {
		
		String InsertSql = "insert into ImageStorage_BLOB (Emp_Fname, Emp_Lname,Emp_ID,Emp_JobTitle, Emp_Image) values (?,?,?,?,?)";
		
		String Emp_Fname = "Harsha";
		String Emp_Lname ="Thota";
		String Emp_ID = "RS750 ";
		String Emp_JobTitle = "Sales Dept";
		
		String Emp_Image = "C:\\Users\\kiran\\Pictures\\temp_photo.jpg";
		
		try {
			PreparedStatement Pstmt = con.prepareStatement(InsertSql);
			
			Pstmt.setString(1, Emp_Fname);
			Pstmt.setString(2, Emp_Lname);
			Pstmt.setString(3, Emp_ID);
			Pstmt.setString(4, Emp_JobTitle); 
			
			File imageFile = new File(Emp_Image);
			
			try {
				FileInputStream fis = new FileInputStream(imageFile);
				Pstmt.setBinaryStream(5, fis, (int) imageFile.length());
				
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
