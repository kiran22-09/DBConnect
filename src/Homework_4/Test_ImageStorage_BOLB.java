package Homework_4;

import java.sql.Connection;

import Class_3.Connection2Oracle;

public class Test_ImageStorage_BOLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection2Oracle obj = new Connection2Oracle();
		Connection xyz = obj.Connect2Oracle();
		
		ImageStorage_BLOB imageObj = new ImageStorage_BLOB();
		imageObj.imagestorageBLOB(xyz);

	}

}
