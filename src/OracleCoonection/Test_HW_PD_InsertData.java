package OracleCoonection;

import java.sql.Connection;

public class Test_HW_PD_InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection2Oracle obj = new Connection2Oracle();
		Connection connect = obj.Connect2Oracle() ;
		
		HW_Personal_Details PDobj = new HW_Personal_Details();
		PDobj.personaldetailsdisplay(connect);

	}

}
