package OracleCoonection;

import java.sql.Connection;

public class Test_HW_PD_UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection2Oracle obj = new Connection2Oracle();
		Connection connect = obj.Connect2Oracle();
		
		Update_HW_Personal_Details UpdateObj = new Update_HW_Personal_Details();
		UpdateObj.updatePersonalDetailsdisplay(connect);
		
	}

}
