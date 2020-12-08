import java.lang.*;
import java.util.*;


class Sort
{
	void InsertionSort(int arr[])
	{
		int pass = 0 , j=0;
		int key = 0;
	
		
		for(pass=1;pass<arr.length;pass++)
		{
			key = arr[pass];
			
			j=pass-1;
			
			while((j>=0)&&(arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		
	}	
}



class Main 
{
	
  public static void main(String[] args)
  {
	int value;
	
	Sort obj = new Sort();
	
    Scanner sobj = new Scanner(System.in);
	System.out.println("Enter Size of array");
	
	int size = sobj.nextInt();
	
	int arr[]=new int[size];
	System.out.println("Enter the elements");
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sobj.nextInt();
	}
	obj.InsertionSort(arr);
	System.out.println("SORTED ELEMETNS");
	
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	
  }
} 