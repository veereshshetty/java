package veer1;
import java.util.*;
/////veeresh
public class Array_adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],i,j,tempsum,sum=0;
		a= new int[6][6];
		Scanner s1 = new Scanner(System.in);
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				a[i][j]= s1.nextInt();
			}
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				tempsum= a[i][j]+
					 a[i][j+1]+
					 a[i][j+2]+
					 a[i+1][j+1]+
					 a[i+2][j]+
					 a[i+2][j+1]+
					 a[i+2][j+2];
				if(tempsum>sum)
				{
					sum=tempsum;
				}
				
			}
		}
		System.out.println("sum is"+sum);
		
	}

}
