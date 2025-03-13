package Homework_3;

public class Test_Orange_HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orange_HRM obj = new Orange_HRM();
		obj.fetchEmployeeData(new Connection2Oracle().Connect2Oracle());

	}

}
