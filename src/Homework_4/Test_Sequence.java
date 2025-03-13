package Homework_4;

import java.sql.Connection;

import Class_3.Connection2Oracle;

public class Test_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection2Oracle obj = new Connection2Oracle();
		Connection xyz = obj.Connect2Oracle();
				
		Sequence ImageObj = new Sequence();
		ImageObj.sequence_storage(xyz);

	}

}
