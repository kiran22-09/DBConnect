package OracleCoonection;

import java.sql.Connection;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection2Oracle obj = new Connection2Oracle();
		Connection abc = obj.Connect2Oracle();
		
		UpdateData updateobj = new UpdateData();
		updateobj.updateDatadisplay(abc);
	}

}
