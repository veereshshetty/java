package veer1;
import java.util.*;

public class Meals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mealCost;
		int tipPercent;
		int taxPercent;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the meal amount");	
		mealCost = s1.nextDouble();
		System.out.println("enter the tip amount");
		tipPercent = s1.nextInt();
		System.out.println("enter the tax amount");
		taxPercent = s1.nextInt();
		
		double tip = mealCost*((double)tipPercent/100);
		double tax = mealCost*((double)taxPercent/100);
		double totalCost= mealCost+tip+tax;
		
		System.out.println("the total cost of a meal in dollars is"+Math.round(totalCost)+"dollars");
		
	}

}
