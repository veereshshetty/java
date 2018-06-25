package veer1;

import java.util.*;

public class Person {

	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int personage[];
		
		Scanner p1 = new Scanner(System.in);
		
		 System.out.println("enter the number of testcases");
	     int T=p1.nextInt();
	     personage = new int[T];
	     for (int a=0;a<T;a++)
	     {
	    	 int b =p1.nextInt();
	    	 personage[a]=b; 
	     }
	     for (int age_times=0; age_times<personage.length; age_times++)
	     {
	    	Person check_age = new Person(personage[age_times]);
	    	check_age.amiold();
	    	check_age.yearpassess();
	    	check_age.yearpassess();
	    	check_age.yearpassess();
	    	check_age.amiold();
	    	
	    	
	    	
	     }
	     
	     
	}
	
	public Person(int initialage)
	{
		if (initialage<0)
		{	
			System.out.println("age is not valid");
			age=0;
		}
		else
		{
			age=initialage;
		}
		
	}
	
	public void yearpassess()
	{
		age=age+1;
		
	}

	public void amiold()
	{
		if (age<13)
			System.out.println("you are young");
		else if(age>=13 && age<18)
			System.out.println("you are teenager");
		else 
			System.out.println("you are old");	
			
	}
}
