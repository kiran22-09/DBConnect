package Homework_3;

import java.sql.Connection;

public class Test_Insert_Regions_SRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Regions_SRS obj = new Regions_SRS();
		obj.regions_srs_display(new Connection2Oracle().Connect2Oracle());

	}

}
