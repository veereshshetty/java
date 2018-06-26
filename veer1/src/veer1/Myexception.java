package veer1;
import java.util.*;

public class Myexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int age;
		Scanner p1 = new Scanner(System.in);
		System.out.println("enter age");
		age = p1.nextInt();
		
		if(age>75)
		throw new toooldexception("your old");
		else 
			System.out.println("your or not old");

	}
	
	catch(Exception e)
	{
	e.printStackTrace();
	}
	
	}
}
 class toooldexception extends Exception
 {
	 toooldexception(String s)
	 {
	 super(s);
	 }
 }