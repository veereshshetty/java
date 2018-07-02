package veer1;
import java.sql.*;
import java.util.*;

import com.mysql.cj.xdevapi.ForeignKeyDef;

public class SetandGetMysql {

	public static void main(String[] args) 
	{
		SetandGetMysql data = new SetandGetMysql();
		//data.Create();
	    // TODO Auto-generated method stub
		int id,NumOfRows=0,i; 
		String UserName,PhoneNumber,Address;
		Scanner EmployeeInfo= new Scanner(System.in);
		System.out.println("Please enter Number of Rows");
		NumOfRows 			= EmployeeInfo.nextInt();
		//SetandGetMysql data = new SetandGetMysql();
		for(i=0;i<NumOfRows;i++)
		{	
		System.out.println("Please, enter Employee id:");
		id = EmployeeInfo.nextInt();
		System.out.println("Please, enter Employee UserName:");
		UserName =	EmployeeInfo.next();
		System.out.println("Please, enter Employee PhoneNumber");
		PhoneNumber =EmployeeInfo.next();
		System.out.println("Please, enter Employee Address");
		Address = EmployeeInfo.next();
		
		
		data.insertdata(id, UserName, PhoneNumber, Address);
		}
		System.out.println("Records inserted successfully");
		System.out.println("------------------------------");
		System.out.println("Displaying records which are inserted successfully");
		data.RetrieveData();
	    }
	    
	public void insertdata(int id, String username, String phonenumber, String address)
	{
		 	try
		 	{
		 		//connection String 
		 		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","root1");
		 		//insert statement query
		 		String query = 	"insert into Employee values(?,?,?,?)";
		 		PreparedStatement myStat =	myConn.prepareStatement(query);
		 		myStat.setInt(1, id);
		 		myStat.setString(2, username);
		 		myStat.setString(3, phonenumber);
		 		myStat.setString(4, address);
		 	 	myStat.execute();	
		 	}
		 	catch(Exception e)
		 	{
		 		e.printStackTrace();
		 	}
	}
	public void RetrieveData()
	{ 
		ArrayList<EmployeeClass> al = new ArrayList<EmployeeClass>();
		try
		{
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","root1");
			Statement myStat = 	myConn.createStatement();
			ResultSet res = myStat.executeQuery("Select * from employee");
			while(res.next())
			{
				
				//System.out.println("EId---"+res.getInt(1)+"\nEuserName---"+res.getString(2)+"\nEphoneNumber--"+res.getString(3)
				//+"\nEaddress---"+res.getString(4));
				
				//for collections adding all the retrieved values in a array list
				
				EmployeeClass e = new EmployeeClass();
				e.id = 	res.getInt(1);
				e.UserName = res.getString(2);
				e.PhoneNumber = res.getString(3);
				e.Address = res.getString(4);
				al.add(e);
				
			}
			//getting values from db and displaying directly through arraylist
			Iterator<EmployeeClass> itr = al.iterator();
			while(itr.hasNext())
			{
				EmployeeClass e1 = itr.next();
				System.out.println("EId---"+e1.id+"\nEuserName---"+e1.UserName+"\nEphoneNumber--"+e1.PhoneNumber
				+"\nEaddress---"+e1.Address);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
	  }
	
	}   



	


