package Class5;

import java.sql.Connection;

public class Test {
	
	public static void main(String a[]) {
		
		Connection2Oracle obj = new Connection2Oracle();
		Connection xyz = obj.Connect2Oracle();
		
		Login_Details loginobj = new Login_Details();
		loginobj.Login_DetailsimagestorageBLOB(xyz);
	}

}
