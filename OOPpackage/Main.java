import MarvellousArray.ArrayX;
import java.lang.*;
import java.util.*;

class Searching extends ArrayX
{
	public Searching(int size)
	{
		super(size);
	}
	
	public boolean LinearSearching(int no)
	{
		int i =0;
		boolean flag = false;
		
		for(i=0;i<arr.length;i++)
		{			
			if(arr[i]==no)
			{
				
				flag = true ;
				break;
			}
		}
		return flag;
		
	}
	
	public boolean BILinearSearching(int no)
	{
		int start =0;
		int end = 0;
		boolean flag = false;
		
		for(start=0 ,end=arr.length-1 ;start<=end;start++,end--)
		{			
			if(arr[start]==no || arr[end]==no)
			{
				
				flag = true ;
				break;
			}
		}
		return flag;
		
	}
	public boolean BinarySearching(int no)
	{
		int start =0;
		int middle = 0;
		int end = arr.length-1;
		boolean flag = false;
		
		boolean bret = CheckSorted();
		
		if(bret==false)
		{
			System.out.println("Array is not sorted cannot perform Binary search");
			return false;
		}
		
		
		while(start<=end)
		{
		    middle = (start + end)/2;	
	
			if(arr[start]==no || arr[end]==no || arr[middle]==no)
			{
				flag = true ;
				break;
			}
			
			if(arr[middle]>no)
			{
				start = middle-1;
			}
			
			if(arr[middle]<no)
			{
				end = middle-1;
			}
			
		}
		return flag;
		
	}
	
	
	public boolean CheckSorted()
	{
		int i = 0;
		boolean flag = true;
		
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
			flag = false;
			break;
			}
		}
		return flag;
		
		
	}
	
}

class Main
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		Searching obj = new Searching(size);
		
		obj.Accept();
		obj.Display();
		
		System.out.println();
		
		System.out.println("Enter the element to search");
		int value = sobj.nextInt();
		
		boolean bret = obj.BinarySearching(value);
		
		
		if(bret==true)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		
}
}
	
