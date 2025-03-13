package Homework_3;

public class Test_Job_Titles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Job_Titles obj = new Job_Titles();
		obj.empType(new Connection2Oracle().Connect2Oracle());

	}

}
