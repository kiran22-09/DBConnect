package Homework_3;

public class Test_Emp_Stataus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp_Status obj = new Emp_Status();
		obj.empstatus(new Connection2Oracle().Connect2Oracle());

	}

}
