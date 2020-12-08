import java.lang.*;
import java.util.*;

class Arr
{
	void Divisible(int arr[])
	{
		for(int i =0 ; i<arr.length ; i++)
		{
			if(arr[i]%5 == 0 && arr[i]%3==0)
			{
				System.out.println(arr[i]+"\t");
			}
		}
	}
	
}


class Main
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		Arr aobj = new Arr();
		
		System.out.println("Enter Size of array");
		int size = sobj.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements of array");
		
		for(int i =0; i < arr.length ; i ++)
		{
			arr[i]=sobj.nextInt();
			
		}
		aobj.Divisible(arr);
	    
		
		
		
	}
}