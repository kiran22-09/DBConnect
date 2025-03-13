package Homework_3;

public class Test_Insert_Countries_SRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Countries_SRS obj = new Countries_SRS();
		obj.countries_srs_display(new Connection2Oracle().Connect2Oracle());

	}

}
