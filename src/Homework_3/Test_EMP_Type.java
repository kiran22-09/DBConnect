package Homework_3;

public class Test_EMP_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp_Type obj = new Emp_Type();
		obj.empType(new Connection2Oracle().Connect2Oracle());
		
	}

}
