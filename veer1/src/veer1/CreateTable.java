package veer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","root1");
			Statement Mystat = myConn.createStatement();
			System.out.println("Enter details to create the table");
			String CreateQuery = "Create table EmployeeDetails"+"(Employee_id Integer not null,"+"Employee_Description Varchar(255),"+
			"Foreign Key(Employee_id) REFERENCES Employee(Employee_id))";
			Mystat.executeUpdate(CreateQuery);
			System.out.println("Table is created successfully with given details");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
