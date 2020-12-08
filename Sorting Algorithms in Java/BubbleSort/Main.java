import java.lang.*;
import java.util.*;


class Bubble
{
	public void BubbleSort(int arr[])
	{
		int i=0;
		int j=0;
		int temp=0;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Inside pass"+i+1);
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("Array after pass"+i+1);
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+"\t");
			}
		}
		
		
	}
}









class Main {
	
  public static void main(String[] args)
  {
	int value;
	
	Bubble bobj = new Bubble();
	
    Scanner sobj = new Scanner(System.in);
	System.out.println("Enter Size of array");
	
	int size = sobj.nextInt();
	
	int arr[]=new int[size];
	System.out.println("Enter the elements");
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sobj.nextInt();
	}
	bobj.BubbleSort(arr);
	System.out.println("SORTED ELEMETNS");
	
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	
  }
}