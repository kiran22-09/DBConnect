package Class_3;

import java.sql.Connection;


public class Test_Insert_PrepStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
        Insert_Using_PrepareStatement insertObj = new Insert_Using_PrepareStatement();
        insertObj.insertusingPrepStmtdisplay(new Connection2Oracle().Connect2Oracle());
        

	}

}
