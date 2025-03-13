package OracleCoonection;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteData obj = new DeleteData();
		obj.deleteDatadisplay(new Connection2Oracle().Connect2Oracle());
	}

}
