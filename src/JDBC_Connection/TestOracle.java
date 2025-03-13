package JDBC_Connection;

public class TestOracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//QueryDatabase obj = new QueryDatabase();
		//obj.displayQueryValues(new Connection2Oracle().Connect2Oracle());
		
		//OwnQuery obj1 = new OwnQuery();
		//obj1.OwnQuerydisplay(new Connection2Oracle().Connect2Oracle());
		
		OwnAllData object = new OwnAllData();
		object.OwnAllDatadisplay(new Connection2Oracle().Connect2Oracle());
	}

}
