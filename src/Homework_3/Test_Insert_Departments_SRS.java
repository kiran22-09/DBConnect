package Homework_3;

public class Test_Insert_Departments_SRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Departments_SRS obj = new Departments_SRS();
		obj.departments_SRS_display(new Connection2Oracle().Connect2Oracle());

	}

}
