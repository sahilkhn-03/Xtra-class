import java.util.*;
import java.lang.*;
class sum
	{
		public static void main (String args[])
		{
			Scanner S1 = new Scanner(System.in);
			int num[] = new int [50];
			int sum = 0;
			System.out.println("enter the array limit");
			int l = S1.nextInt();
			for( int i=0;i<l;i++)
			{
				num[i] = S1.nextInt();
				sum = sum + num[i];
			}
			System.out.println("the sum of array is "+sum);
		}
	}
				
