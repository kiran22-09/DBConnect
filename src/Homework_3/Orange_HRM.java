package Homework_3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Orange_HRM {
    
    public void fetchEmployeeData(Connection con) {
        
        String query = "SELECT " +
                       "    e.Emp_num AS Employee_ID, " +
                       "    e.FirstName || ' ' || e.LastName AS Employee_Name, " +
                       "    e.Job AS Job_Title, " +
                       "    j.job_Title AS Job_Description, " +
                       "    e.Join_date AS Joining_Date, " +
                       "    d.DeptName AS Department, " +
                       "    l.Street_Address || ', ' || l.City || ', ' || l.State || ', ' || l.Zipcode AS Location, " +
                       "    c.CountryName AS Country, " +
                       "    r.RegionName AS Region, " +
                       "    t.type_EMP AS Employee_Type, " +
                       "    rto.Name AS Reports_To, " +
                       "    rto.Reporting_Method AS Reporting_Method " +
                       "FROM Employees_SRS e " +
                       "JOIN Departments_SRS d ON e.Dept_ID = d.Dept_ID " +
                       "JOIN Locations_SRS l ON d.Location_ID = l.Location_ID " +
                       "JOIN Countries_SRS c ON l.Country_ID = c.Country_ID " +
                       "JOIN Regions_SRS r ON c.Region_ID = r.Region_ID " +
                       "JOIN TYPE_OF_EMPLOYEE t ON t.type_EMP IN ('CURRENT_EMPLOYEES_ONLY', 'PAST_EMPLOYEES_ONLY') " +
                       "LEFT JOIN Reports_To rto ON e.Emp_num = rto.Name " +
                       "LEFT JOIN JOB_TITLES j ON e.Job = j.job_Title " +
                       "ORDER BY e.Emp_num";

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("Employee_ID"));
                System.out.println("Employee Name: " + rs.getString("Employee_Name"));
                System.out.println("Job Title: " + rs.getString("Job_Title"));
                System.out.println("Job Description: " + rs.getString("Job_Description"));
                System.out.println("Joining Date: " + rs.getDate("Joining_Date"));
                System.out.println("Department: " + rs.getString("Department"));
                System.out.println("Location: " + rs.getString("Location"));
                System.out.println("Country: " + rs.getString("Country"));
                System.out.println("Region: " + rs.getString("Region"));
                System.out.println("Employee Type: " + rs.getString("Employee_Type"));
                System.out.println("Reports To: " + rs.getString("Reports_To"));
                System.out.println("Reporting Method: " + rs.getString("Reporting_Method"));
                System.out.println("---------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

