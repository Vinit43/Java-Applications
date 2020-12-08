import java.lang.*;
import java.util.*;


class Sort
{
	void SelectionSort(int arr[])
	{
		int i=0;
		int min_i=0;
		int temp=0;
		int j =0;
		
		for(i=0;i<arr.length;i++)
		{
			min_i= i ;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[min_i]>arr[j])
				{
					min_i=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_i];
			arr[min_i]=temp;
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
	obj.SelectionSort(arr);
	System.out.println("SORTED ELEMETNS");
	
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	
  }
} 