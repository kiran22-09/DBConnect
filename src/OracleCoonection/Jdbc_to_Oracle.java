package OracleCoonection;

public class Jdbc_to_Oracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OR_ContactDetails obj = new OR_ContactDetails();
		obj.OR_ContactDetailsdisplay(new Connection2Oracle().Connect2Oracle());

	}

}
