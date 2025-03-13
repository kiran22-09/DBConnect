package OracleCoonection;


public class Test_HW_PD_DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Delete_HW_Personal_Details obj = new Delete_HW_Personal_Details();
		obj.deletePersonalDetailsdisplay(new Connection2Oracle().Connect2Oracle());
	}

}
