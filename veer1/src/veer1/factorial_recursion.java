package veer1;
import java.util.*;

public class factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, factorial;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        number = s.nextInt();
        factorial_recursion obj = new factorial_recursion();
        factorial = obj.fact(number);
        System.out.println("Factorial of "+number+" :"+factorial);
    }
	int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
		
		

	}





