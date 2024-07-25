import java.util.*;
import java.lang.*;
class sum
	{
		public static void main (String args[])
		{
			Scanner S1 = new Scanner(System.in);
			int num[] = new int [50];
			int large=num[0];
			
			System.out.println("enter the array limit");
			int l = S1.nextInt();
			System.out.println("enter the elements");
			for( int i=0;i<l;i++)
			{
				num[i] = S1.nextInt();
			
				if(num[i]>large)
				{
					large=num[i];
				}
			}
				int small=num[0];
				for(int i=0;i<l;i++)
				{
				if(num[i]<small)
					small=num[0];
				}
			
			
			System.out.println("the largest element of array is "+large);
			System.out.println("the smallest element of array is "+small);
		}
	}
	
