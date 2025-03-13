package Homework_3;

public class Test_Insert_Locations_SRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locations_SRS obj = new Locations_SRS();
		obj.locations_srs_display(new Connection2Oracle().Connect2Oracle());

	}

}
