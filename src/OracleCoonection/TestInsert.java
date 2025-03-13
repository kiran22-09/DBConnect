/*package OracleCoonection;

import java.sql.Connection;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertData obj = new InsertData();
		obj.insertDatadisplay(new Connection2Oracle().Connect2Oracle());

	}

} 
*/
package OracleCoonection;

import java.sql.Connection;

public class TestInsert {

    public static void main(String[] args) {
        Connection2Oracle obj = new Connection2Oracle();
        Connection connect = obj.Connect2Oracle();


        InsertData insertObj = new InsertData();
        insertObj.insertDatadisplay(connect);
    }
}
