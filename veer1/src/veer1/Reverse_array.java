package veer1;
import java.util.*;

public class Reverse_array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[];
		System.out.println("Enter the Size of the array");
		Scanner s1 = new Scanner(System.in);
		int Size = s1.nextInt();
		a = new int[Size];
		for (int i=0; i<Size; i++)
		{
			a[i] = s1.nextInt();
		}
		for (int j= Size-1; j>=0;j--)		
		{
			System.out.print(a[j]+" ");
		}
		
	}

}
