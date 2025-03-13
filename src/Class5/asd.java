package Class5;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class asd {
    public void insert2tablewithSequence(Connection con) {
        // Correct SQL statement using the sequence for the ID column
        String sql = "INSERT INTO MY_TABLE (ID, NAME, AGE) VALUES (my_table_seq.NEXTVAL, ?, ?)";

        // Example data
        Object[][] data = {
            {"Alice", 25},
            {"Bob", 30},
            {"Charlie", 35}
        };

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            String name = null;
            int age = 0;

            // Gather data from two-dimensional array
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j == 0) {
                        name = (String) data[i][0];  // Retrieve name
                        System.out.println("Name is: " + name);
                    }
                    if (j == 1) {
                        age = (int) data[i][1];  // Retrieve age
                        System.out.println("Age is: " + age);
                    }
                }

                // Set values in the prepared statement
                pstmt.setString(1, name);
                pstmt.setInt(2, age);

                // Execute the query
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Row inserted successfully for: " + name);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
