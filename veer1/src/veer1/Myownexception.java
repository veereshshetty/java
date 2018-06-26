package veer1;
import java.util.*;
public class Myownexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Please enter a month value\n");
			Scanner p1 = new Scanner(System.in);
			int num = p1.nextInt();
			if(num < 0 || num > 12)
			throw new InvalidMonthException("Invalid Month Value");
			else 
				System.out.println("valid month");
		}
		catch (Exception e)
		{
		e.printStackTrace();
		}

	}

}
 class  InvalidMonthException extends Exception {
	
	 InvalidMonthException(String msg){
		 super(msg);
	 }
 }