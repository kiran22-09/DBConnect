package Homework_3;

public class Test_Insert_Employees_SRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees_SRS obj = new Employees_SRS();
		obj.employees_srs_display(new Connection2Oracle().Connect2Oracle());

	}

}
